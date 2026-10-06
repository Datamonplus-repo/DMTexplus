package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaslec_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A217BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
         n217BarTipArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A217BarTipArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
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
         gxload_16( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
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
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A603MaqCodBis) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA DE FASES DESDE LECTOR", ""), (short)(0)) ;
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
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
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
      nRC_GXsfl_117 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_117"))) ;
      nGXsfl_117_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_117_idx"))) ;
      sGXsfl_117_idx = httpContext.GetPar( "sGXsfl_117_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      n396EmprCod = false ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      n132BarCodReo = false ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      n130BarCodPar = false ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      n758ProCod = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tfaslec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaslec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaslec_impl.class ));
   }

   public tfaslec_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASLEC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Tipo Articulo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "MaxOrdFas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaxOrdFas_Internalname, GXutil.ltrim( localUtil.ntoc( A628MaxOrdFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaxOrdFas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A628MaxOrdFas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A628MaxOrdFas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaxOrdFas_Jsonclick, 0, "", "", "", "", "", 1, edtMaxOrdFas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASLEC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol90( ) ;
      /* Save parent mode. */
      sMode14 = Gx_mode ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount14 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_14 = (short)(1) ;
            scanStartF214( ) ;
            while ( RcdFound14 != 0 )
            {
               init_level_properties14( ) ;
               getByPrimaryKeyF214( ) ;
               addRowF214( ) ;
               scanNextF214( ) ;
            }
            scanEndF214( ) ;
            nBlankRcdCount14 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalF214( ) ;
         standaloneModalF214( ) ;
         sMode14 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRowF214( ) ;
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtProFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASLIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasLin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtProFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASEST_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasEst_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_14 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalF214( ) ;
            }
            sendRowF214( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount14 = (short)(5) ;
         nRcdExists_14 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartF214( ) ;
            while ( RcdFound14 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_9014( ) ;
               init_level_properties14( ) ;
               standaloneNotModalF214( ) ;
               getByPrimaryKeyF214( ) ;
               standaloneModalF214( ) ;
               addRowF214( ) ;
               scanNextF214( ) ;
            }
            scanEndF214( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode14 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_9014( ) ;
      initAllF214( ) ;
      init_level_properties14( ) ;
      nRcdExists_14 = (short)(0) ;
      nIsMod_14 = (short)(0) ;
      nRcdDeleted_14 = (short)(0) ;
      nBlankRcdCount14 = (short)(nBlankRcdUsr14+nBlankRcdCount14) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount14 > 0 )
      {
         standaloneNotModalF214( ) ;
         standaloneModalF214( ) ;
         addRowF214( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount14 = (short)(nBlankRcdCount14-1) ;
      }
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode14 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASLEC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFASLEC.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
         Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
         Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
         Z217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z217BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
         A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A136BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
         else
         {
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A217BarTipArt = (short)(0) ;
            n217BarTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         }
         else
         {
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         }
         A628MaxOrdFas = (short)(localUtil.ctol( httpContext.cgiGet( edtMaxOrdFas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A213BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         }
         else
         {
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         }
         A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TFASLEC");
         forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
         forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
         forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tfaslec:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            initAllF212( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_15_Enabled), 5, 0), !bGXsfl_117_Refreshing);
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
      disableAttributesF212( ) ;
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

   public void confirm_F20( )
   {
      beforeValidateF212( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsF212( ) ;
         }
         else
         {
            checkExtendedTableF212( ) ;
            if ( AnyError == 0 )
            {
               zmF212( 12) ;
               zmF212( 13) ;
               zmF212( 14) ;
               zmF212( 15) ;
               zmF212( 16) ;
            }
            closeExtendedTableCursorsF212( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_F214( ) ;
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
         confirmValuesF20( ) ;
      }
   }

   public void confirm_F215( )
   {
      nGXsfl_117_idx = 0 ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         readRowF215( ) ;
         if ( ( nRcdExists_15 != 0 ) || ( nIsMod_15 != 0 ) )
         {
            getKeyF215( ) ;
            if ( ( nRcdExists_15 == 0 ) && ( nRcdDeleted_15 == 0 ) )
            {
               if ( RcdFound15 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateF215( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableF215( ) ;
                     if ( AnyError == 0 )
                     {
                        zmF215( 21) ;
                        zmF215( 22) ;
                        zmF215( 23) ;
                        zmF215( 24) ;
                        zmF215( 25) ;
                     }
                     closeExtendedTableCursorsF215( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound15 != 0 )
               {
                  if ( nRcdDeleted_15 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyF215( ) ;
                     loadF215( ) ;
                     beforeValidateF215( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsF215( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_15 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateF215( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableF215( ) ;
                           if ( AnyError == 0 )
                           {
                              zmF215( 21) ;
                              zmF215( 22) ;
                              zmF215( 23) ;
                              zmF215( 24) ;
                              zmF215( 25) ;
                           }
                           closeExtendedTableCursorsF215( ) ;
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
                  if ( nRcdDeleted_15 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_15_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon)) ;
         httpContext.changePostValue( edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin)) ;
         httpContext.changePostValue( edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc)) ;
         httpContext.changePostValue( edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpcVir_Internalname, GXutil.rtrim( A1788EmpcVir)) ;
         httpContext.changePostValue( edtBarCoVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPaVir_Internalname, GXutil.rtrim( A1786BarPaVir)) ;
         httpContext.changePostValue( edtProCodVir_Internalname, GXutil.rtrim( A1789ProCodVir)) ;
         httpContext.changePostValue( edtOrdLinVir_Internalname, GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasAnt_Internalname, GXutil.rtrim( A1785BarFasAnt)) ;
         httpContext.changePostValue( edtBarFecRIni_Internalname, localUtil.format(A3298BarFecRIni, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_117_idx, GXutil.rtrim( Z152BarFasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_117_idx, GXutil.rtrim( Z150BarFacTin)) ;
         httpContext.changePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_117_idx, localUtil.dtoc( Z162BarFecTeo, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_117_idx, localUtil.dtoc( Z160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_117_idx, GXutil.rtrim( Z179BarLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3298BarFecRIni_"+sGXsfl_117_idx, localUtil.dtoc( Z3298BarFecRIni, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_117_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_117_idx, GXutil.rtrim( Z603MaqCodBis)) ;
         httpContext.changePostValue( "nRcdDeleted_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_15 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_15_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODBIS_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFACTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECTEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLOC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPCVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCODVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLINVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASANT_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECRINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00F210 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A628MaxOrdFas = T00F210_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F210_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      /* Using cursor T00F212 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A760ProFasEst = T00F212_A760ProFasEst[0] ;
         n760ProFasEst = T00F212_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      /* End of After( level) rules */
   }

   public void confirm_F214( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRowF214( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            getKeyF214( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               if ( RcdFound14 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateF214( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableF214( ) ;
                     if ( AnyError == 0 )
                     {
                        zmF214( 18) ;
                        zmF214( 19) ;
                     }
                     closeExtendedTableCursorsF214( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode14 = Gx_mode ;
                        confirm_F215( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode14 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode14 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( nRcdDeleted_14 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyF214( ) ;
                     loadF214( ) ;
                     beforeValidateF214( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsF214( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_14 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateF214( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableF214( ) ;
                           if ( AnyError == 0 )
                           {
                              zmF214( 18) ;
                              zmF214( 19) ;
                           }
                           closeExtendedTableCursorsF214( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode14 = Gx_mode ;
                              confirm_F215( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode14 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode14 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_90_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_117_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_117, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASLIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASEST_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionF20( )
   {
   }

   public void zmF212( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T00F217_A361DisCod[0] ;
            Z2759BarMaqGru = T00F217_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T00F217_A180BarMaqCod[0] ;
            Z135BarColNom = T00F217_A135BarColNom[0] ;
            Z136BarColNum = T00F217_A136BarColNum[0] ;
            Z212BarSer = T00F217_A212BarSer[0] ;
            Z213BarSit = T00F217_A213BarSit[0] ;
            Z120BarAgrEst = T00F217_A120BarAgrEst[0] ;
            Z217BarTipArt = T00F217_A217BarTipArt[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
            Z212BarSer = A212BarSer ;
            Z213BarSit = A213BarSit ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z217BarTipArt = A217BarTipArt ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z212BarSer = A212BarSer ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z628MaxOrdFas = A628MaxOrdFas ;
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

   public void loadF212( )
   {
      /* Using cursor T00F223 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T00F223_A361DisCod[0] ;
         A2759BarMaqGru = T00F223_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00F223_A180BarMaqCod[0] ;
         A252CliCod = T00F223_A252CliCod[0] ;
         n252CliCod = T00F223_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T00F223_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A135BarColNom = T00F223_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T00F223_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A212BarSer = T00F223_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A213BarSit = T00F223_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T00F223_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = T00F223_A407EmprNom[0] ;
         n407EmprNom = T00F223_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A365DisDes = T00F223_A365DisDes[0] ;
         A217BarTipArt = T00F223_A217BarTipArt[0] ;
         n217BarTipArt = T00F223_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         A628MaxOrdFas = T00F223_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F223_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
         zmF212( -11) ;
      }
      pr_default.close(16);
      onLoadActionsF212( ) ;
   }

   public void onLoadActionsF212( )
   {
      /* Using cursor T00F219 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T00F219_A252CliCod[0] ;
      n252CliCod = T00F219_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T00F219_A365DisDes[0] ;
      pr_default.close(13);
   }

   public void checkExtendedTableF212( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00F218 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00F218_A407EmprNom[0] ;
      n407EmprNom = T00F218_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T00F219 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T00F219_A252CliCod[0] ;
      n252CliCod = T00F219_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T00F219_A365DisDes[0] ;
      pr_default.close(13);
      /* Using cursor T00F220 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A217BarTipArt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(14);
      /* Using cursor T00F221 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00F221_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(15);
      /* Using cursor T00F210 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A628MaxOrdFas = T00F210_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F210_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsF212( )
   {
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod )
   {
      /* Using cursor T00F224 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00F224_A407EmprNom[0] ;
      n407EmprNom = T00F224_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_13( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T00F225 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T00F225_A252CliCod[0] ;
      n252CliCod = T00F225_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T00F225_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_14( String A396EmprCod ,
                          short A217BarTipArt )
   {
      /* Using cursor T00F226 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A217BarTipArt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00F227 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00F227_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_16( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T00F229 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A628MaxOrdFas = T00F229_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F229_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A628MaxOrdFas, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKeyF212( )
   {
      /* Using cursor T00F230 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00F217 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         zmF212( 11) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T00F217_A361DisCod[0] ;
         A2759BarMaqGru = T00F217_A2759BarMaqGru[0] ;
         A129BarCod = T00F217_A129BarCod[0] ;
         n129BarCod = T00F217_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00F217_A132BarCodReo[0] ;
         n132BarCodReo = T00F217_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00F217_A130BarCodPar[0] ;
         n130BarCodPar = T00F217_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = T00F217_A180BarMaqCod[0] ;
         A135BarColNom = T00F217_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T00F217_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A212BarSer = T00F217_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A213BarSit = T00F217_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T00F217_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A396EmprCod = T00F217_A396EmprCod[0] ;
         n396EmprCod = T00F217_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A217BarTipArt = T00F217_A217BarTipArt[0] ;
         n217BarTipArt = T00F217_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadF212( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKeyF212( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKeyF212( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKeyF212( ) ;
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
      /* Using cursor T00F231 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F231_A129BarCod[0] < A129BarCod ) || ( T00F231_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F231_A132BarCodReo[0] < A132BarCodReo ) || ( T00F231_A132BarCodReo[0] == A132BarCodReo ) && ( T00F231_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00F231_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F231_A129BarCod[0] > A129BarCod ) || ( T00F231_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F231_A132BarCodReo[0] > A132BarCodReo ) || ( T00F231_A132BarCodReo[0] == A132BarCodReo ) && ( T00F231_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F231_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00F231_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T00F231_A396EmprCod[0] ;
            n396EmprCod = T00F231_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T00F231_A129BarCod[0] ;
            n129BarCod = T00F231_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00F231_A132BarCodReo[0] ;
            n132BarCodReo = T00F231_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00F231_A130BarCodPar[0] ;
            n130BarCodPar = T00F231_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T00F232 */
      pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F232_A129BarCod[0] > A129BarCod ) || ( T00F232_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F232_A132BarCodReo[0] > A132BarCodReo ) || ( T00F232_A132BarCodReo[0] == A132BarCodReo ) && ( T00F232_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00F232_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F232_A129BarCod[0] < A129BarCod ) || ( T00F232_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00F232_A132BarCodReo[0] < A132BarCodReo ) || ( T00F232_A132BarCodReo[0] == A132BarCodReo ) && ( T00F232_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00F232_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00F232_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T00F232_A396EmprCod[0] ;
            n396EmprCod = T00F232_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T00F232_A129BarCod[0] ;
            n129BarCod = T00F232_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00F232_A132BarCodReo[0] ;
            n132BarCodReo = T00F232_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00F232_A130BarCodPar[0] ;
            n130BarCodPar = T00F232_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyF212( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertF212( ) ;
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
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               updateF212( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertF212( ) ;
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
                  insertF212( ) ;
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
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      getKeyF212( ) ;
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
            A396EmprCod = Z396EmprCod ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaslec");
      GX_FocusControl = edtBarColNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_F20( ) ;
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
      GX_FocusControl = edtBarColNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartF212( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarColNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndF212( ) ;
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
      GX_FocusControl = edtBarColNom_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarColNom_Internalname ;
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
      scanStartF212( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNextF212( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarColNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndF212( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyF212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00F216 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(10) == 101) || ( Z361DisCod != T00F216_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T00F216_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T00F216_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z135BarColNom, T00F216_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T00F216_A136BarColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z212BarSer, T00F216_A212BarSer[0]) != 0 ) || ( Z213BarSit != T00F216_A213BarSit[0] ) || ( GXutil.strcmp(Z120BarAgrEst, T00F216_A120BarAgrEst[0]) != 0 ) || ( Z217BarTipArt != T00F216_A217BarTipArt[0] ) )
         {
            if ( Z361DisCod != T00F216_A361DisCod[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T00F216_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T00F216_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T00F216_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T00F216_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T00F216_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T00F216_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T00F216_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T00F216_A136BarColNum[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T00F216_A136BarColNum[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T00F216_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T00F216_A212BarSer[0]);
            }
            if ( Z213BarSit != T00F216_A213BarSit[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T00F216_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T00F216_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T00F216_A120BarAgrEst[0]);
            }
            if ( Z217BarTipArt != T00F216_A217BarTipArt[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarTipArt");
               GXutil.writeLogRaw("Old: ",Z217BarTipArt);
               GXutil.writeLogRaw("Current: ",T00F216_A217BarTipArt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertF212( )
   {
      beforeValidateF212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF212( ) ;
      }
      if ( AnyError == 0 )
      {
         zmF212( 0) ;
         checkOptimisticConcurrencyF212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmF212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertF212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00F233 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A135BarColNom, Integer.valueOf(A136BarColNum), A212BarSer, Byte.valueOf(A213BarSit), A120BarAgrEst, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(25) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN1F212( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelF212( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionF20( ) ;
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
            loadF212( ) ;
         }
         endLevelF212( ) ;
      }
      closeExtendedTableCursorsF212( ) ;
   }

   public void updateF212( )
   {
      beforeValidateF212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF212( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyF212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmF212( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateF212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00F234 */
                  pr_default.execute(26, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, A135BarColNom, Integer.valueOf(A136BarColNum), A212BarSer, Byte.valueOf(A213BarSit), A120BarAgrEst, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateF212( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A129BarCod ;
                     GXv_int3[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
                     tfaslec_impl.this.A396EmprCod = GXv_char1[0] ;
                     tfaslec_impl.this.A129BarCod = GXv_int2[0] ;
                     tfaslec_impl.this.A132BarCodReo = GXv_int3[0] ;
                     tfaslec_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN1F212( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelF212( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionF20( ) ;
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
         endLevelF212( ) ;
      }
      closeExtendedTableCursorsF212( ) ;
   }

   public void deferredUpdateF212( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateF212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyF212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsF212( ) ;
         afterConfirmF212( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteF212( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00F235 */
               pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               if ( AnyError == 0 )
               {
                  updateTablesN1F212( ) ;
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound12 == 0 )
                     {
                        initAllF212( ) ;
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
                     resetCaptionF20( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelF212( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsF212( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00F236 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T00F236_A407EmprNom[0] ;
         n407EmprNom = T00F236_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(28);
         /* Using cursor T00F238 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A628MaxOrdFas = T00F238_A628MaxOrdFas[0] ;
            n628MaxOrdFas = T00F238_n628MaxOrdFas[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
         }
         else
         {
            A628MaxOrdFas = (short)(0) ;
            n628MaxOrdFas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
         }
         pr_default.close(29);
         /* Using cursor T00F239 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T00F239_A252CliCod[0] ;
         n252CliCod = T00F239_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A365DisDes = T00F239_A365DisDes[0] ;
         pr_default.close(30);
         /* Using cursor T00F240 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00F240_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(31);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00F241 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00F242 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00F243 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00F244 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00F245 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00F246 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00F247 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00F248 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00F249 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00F250 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00F251 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00F252 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00F253 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00F254 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00F255 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00F256 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00F257 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00F258 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00F259 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00F260 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00F261 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00F262 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00F263 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00F264 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00F265 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00F266 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00F267 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00F268 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00F269 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00F270 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00F271 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00F272 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00F273 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00F274 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00F275 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T00F276 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T00F277 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T00F278 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T00F279 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T00F280 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T00F281 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T00F282 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T00F283 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T00F284 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T00F285 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T00F286 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T00F287 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T00F288 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T00F289 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T00F290 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T00F291 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T00F292 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T00F293 */
         pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T00F294 */
         pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T00F295 */
         pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T00F296 */
         pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T00F297 */
         pr_default.execute(88, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T00F298 */
         pr_default.execute(89, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T00F299 */
         pr_default.execute(90, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T00F2100 */
         pr_default.execute(91, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T00F2101 */
         pr_default.execute(92, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T00F2102 */
         pr_default.execute(93, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T00F2103 */
         pr_default.execute(94, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
      }
   }

   public void processNestedLevelF214( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRowF214( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            standaloneNotModalF214( ) ;
            getKeyF214( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertF214( ) ;
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( ( nRcdDeleted_14 != 0 ) && ( nRcdExists_14 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteF214( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_14 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateF214( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_90_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_117_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_117, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASLIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASEST_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllF214( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_14 = (short)(0) ;
      nIsMod_14 = (short)(0) ;
      nRcdDeleted_14 = (short)(0) ;
   }

   public void processLevelF212( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevelF214( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN1F212( )
   {
      /* Using cursor T00F2104 */
      pr_default.execute(95, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevelF212( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteF212( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaslec");
         if ( AnyError == 0 )
         {
            confirmValuesF20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaslec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartF212( )
   {
      /* Using cursor T00F2105 */
      pr_default.execute(96);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T00F2105_A396EmprCod[0] ;
         n396EmprCod = T00F2105_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00F2105_A129BarCod[0] ;
         n129BarCod = T00F2105_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00F2105_A132BarCodReo[0] ;
         n132BarCodReo = T00F2105_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00F2105_A130BarCodPar[0] ;
         n130BarCodPar = T00F2105_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextF212( )
   {
      /* Scan next routine */
      pr_default.readNext(96);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T00F2105_A396EmprCod[0] ;
         n396EmprCod = T00F2105_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00F2105_A129BarCod[0] ;
         n129BarCod = T00F2105_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00F2105_A132BarCodReo[0] ;
         n132BarCodReo = T00F2105_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00F2105_A130BarCodPar[0] ;
         n130BarCodPar = T00F2105_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEndF212( )
   {
      pr_default.close(96);
   }

   public void afterConfirmF212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertF212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateF212( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteF212( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteF212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateF212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesF212( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      edtMaxOrdFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxOrdFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxOrdFas_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmF214( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z761ProFasLin = T00F214_A761ProFasLin[0] ;
         }
         else
         {
            Z761ProFasLin = A761ProFasLin ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z761ProFasLin = A761ProFasLin ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z760ProFasEst = A760ProFasEst ;
      }
   }

   public void standaloneNotModalF214( )
   {
   }

   public void standaloneModalF214( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void loadF214( )
   {
      /* Using cursor T00F2107 */
      pr_default.execute(97, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A759ProDsc = T00F2107_A759ProDsc[0] ;
         A761ProFasLin = T00F2107_A761ProFasLin[0] ;
         n761ProFasLin = T00F2107_n761ProFasLin[0] ;
         A760ProFasEst = T00F2107_A760ProFasEst[0] ;
         n760ProFasEst = T00F2107_n760ProFasEst[0] ;
         zmF214( -17) ;
      }
      pr_default.close(97);
      onLoadActionsF214( ) ;
   }

   public void onLoadActionsF214( )
   {
   }

   public void checkExtendedTableF214( )
   {
      nIsDirty_14 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalF214( ) ;
      /* Using cursor T00F215 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00F215_A759ProDsc[0] ;
      pr_default.close(9);
      /* Using cursor T00F212 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A760ProFasEst = T00F212_A760ProFasEst[0] ;
         n760ProFasEst = T00F212_n760ProFasEst[0] ;
      }
      else
      {
         nIsDirty_14 = (short)(1) ;
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsF214( )
   {
      pr_default.close(9);
      pr_default.close(6);
   }

   public void enableDisableF214( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T00F2108 */
      pr_default.execute(98, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(98) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00F2108_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(98) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(98);
   }

   public void gxload_19( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A758ProCod )
   {
      /* Using cursor T00F2110 */
      pr_default.execute(99, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(99) != 101) )
      {
         A760ProFasEst = T00F2110_A760ProFasEst[0] ;
         n760ProFasEst = T00F2110_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(99) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(99);
   }

   public void getKeyF214( )
   {
      /* Using cursor T00F2111 */
      pr_default.execute(100, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(100) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(100);
   }

   public void getByPrimaryKeyF214( )
   {
      /* Using cursor T00F214 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zmF214( 17) ;
         RcdFound14 = (short)(1) ;
         initializeNonKeyF214( ) ;
         A761ProFasLin = T00F214_A761ProFasLin[0] ;
         n761ProFasLin = T00F214_n761ProFasLin[0] ;
         A758ProCod = T00F214_A758ProCod[0] ;
         n758ProCod = T00F214_n758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalF214( ) ;
         loadF214( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKeyF214( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalF214( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesF214( ) ;
      }
      pr_default.close(8);
   }

   public void checkOptimisticConcurrencyF214( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00F213 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( Z761ProFasLin != T00F213_A761ProFasLin[0] ) )
         {
            if ( Z761ProFasLin != T00F213_A761ProFasLin[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"ProFasLin");
               GXutil.writeLogRaw("Old: ",Z761ProFasLin);
               GXutil.writeLogRaw("Current: ",T00F213_A761ProFasLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertF214( )
   {
      beforeValidateF214( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF214( ) ;
      }
      if ( AnyError == 0 )
      {
         zmF214( 0) ;
         checkOptimisticConcurrencyF214( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmF214( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertF214( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00F2112 */
                  pr_default.execute(101, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
                  if ( (pr_default.getStatus(101) == 1) )
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
                        processLevelF214( ) ;
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
            loadF214( ) ;
         }
         endLevelF214( ) ;
      }
      closeExtendedTableCursorsF214( ) ;
   }

   public void updateF214( )
   {
      beforeValidateF214( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF214( ) ;
      }
      if ( ( nIsMod_14 != 0 ) || ( nIsDirty_14 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyF214( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmF214( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateF214( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00F2113 */
                     pr_default.execute(102, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
                     if ( (pr_default.getStatus(102) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateF214( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        tfaslec_impl.this.A396EmprCod = GXv_char4[0] ;
                        tfaslec_impl.this.A129BarCod = GXv_int2[0] ;
                        tfaslec_impl.this.A132BarCodReo = GXv_int3[0] ;
                        tfaslec_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelF214( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyF214( ) ;
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
            endLevelF214( ) ;
         }
      }
      closeExtendedTableCursorsF214( ) ;
   }

   public void deferredUpdateF214( )
   {
   }

   public void deleteF214( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateF214( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyF214( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsF214( ) ;
         afterConfirmF214( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteF214( ) ;
            if ( AnyError == 0 )
            {
               scanStartF215( ) ;
               while ( RcdFound15 != 0 )
               {
                  getByPrimaryKeyF215( ) ;
                  deleteF215( ) ;
                  scanNextF215( ) ;
               }
               scanEndF215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00F2114 */
                  pr_default.execute(103, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
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
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelF214( ) ;
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsF214( )
   {
      standaloneModalF214( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00F2115 */
         pr_default.execute(104, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T00F2115_A759ProDsc[0] ;
         pr_default.close(104);
         /* Using cursor T00F2117 */
         pr_default.execute(105, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            A760ProFasEst = T00F2117_A760ProFasEst[0] ;
            n760ProFasEst = T00F2117_n760ProFasEst[0] ;
         }
         else
         {
            A760ProFasEst = (byte)(0) ;
            n760ProFasEst = false ;
         }
         pr_default.close(105);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00F2118 */
         pr_default.execute(106, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T00F2119 */
         pr_default.execute(107, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
      }
   }

   public void processNestedLevelF215( )
   {
      nGXsfl_117_idx = 0 ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         readRowF215( ) ;
         if ( ( nRcdExists_15 != 0 ) || ( nIsMod_15 != 0 ) )
         {
            standaloneNotModalF215( ) ;
            getKeyF215( ) ;
            if ( ( nRcdExists_15 == 0 ) && ( nRcdDeleted_15 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertF215( ) ;
            }
            else
            {
               if ( RcdFound15 != 0 )
               {
                  if ( ( nRcdDeleted_15 != 0 ) && ( nRcdExists_15 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteF215( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_15 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateF215( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_15 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_15_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon)) ;
         httpContext.changePostValue( edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin)) ;
         httpContext.changePostValue( edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc)) ;
         httpContext.changePostValue( edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpcVir_Internalname, GXutil.rtrim( A1788EmpcVir)) ;
         httpContext.changePostValue( edtBarCoVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPaVir_Internalname, GXutil.rtrim( A1786BarPaVir)) ;
         httpContext.changePostValue( edtProCodVir_Internalname, GXutil.rtrim( A1789ProCodVir)) ;
         httpContext.changePostValue( edtOrdLinVir_Internalname, GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasAnt_Internalname, GXutil.rtrim( A1785BarFasAnt)) ;
         httpContext.changePostValue( edtBarFecRIni_Internalname, localUtil.format(A3298BarFecRIni, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_117_idx, GXutil.rtrim( Z152BarFasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_117_idx, GXutil.rtrim( Z150BarFacTin)) ;
         httpContext.changePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_117_idx, localUtil.dtoc( Z162BarFecTeo, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_117_idx, localUtil.dtoc( Z160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_117_idx, GXutil.rtrim( Z179BarLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3298BarFecRIni_"+sGXsfl_117_idx, localUtil.dtoc( Z3298BarFecRIni, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_117_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_117_idx, GXutil.rtrim( Z603MaqCodBis)) ;
         httpContext.changePostValue( "nRcdDeleted_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_15_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_15 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_15_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODBIS_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFACTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECTEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLOC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPCVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCODVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLINVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASANT_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECRINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00F238 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A628MaxOrdFas = T00F238_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F238_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      /* Using cursor T00F2117 */
      pr_default.execute(105, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(105) != 101) )
      {
         A760ProFasEst = T00F2117_A760ProFasEst[0] ;
         n760ProFasEst = T00F2117_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      /* End of After( level) rules */
      initAllF215( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_15 = (short)(0) ;
      nIsMod_15 = (short)(0) ;
      nRcdDeleted_15 = (short)(0) ;
   }

   public void processLevelF214( )
   {
      /* Save parent mode. */
      sMode14 = Gx_mode ;
      processNestedLevelF215( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelF214( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartF214( )
   {
      /* Scan By routine */
      /* Using cursor T00F2120 */
      pr_default.execute(108, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A758ProCod = T00F2120_A758ProCod[0] ;
         n758ProCod = T00F2120_n758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextF214( )
   {
      /* Scan next routine */
      pr_default.readNext(108);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A758ProCod = T00F2120_A758ProCod[0] ;
         n758ProCod = T00F2120_n758ProCod[0] ;
      }
   }

   public void scanEndF214( )
   {
      pr_default.close(108);
   }

   public void afterConfirmF214( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertF214( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateF214( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteF214( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteF214( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateF214( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesF214( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtProFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasLin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtProFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasEst_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void zmF215( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z152BarFasCon = T00F23_A152BarFasCon[0] ;
            Z153BarFasEst = T00F23_A153BarFasEst[0] ;
            Z150BarFacTin = T00F23_A150BarFacTin[0] ;
            Z162BarFecTeo = T00F23_A162BarFecTeo[0] ;
            Z160BarFecRea = T00F23_A160BarFecRea[0] ;
            Z216BarTieTeo = T00F23_A216BarTieTeo[0] ;
            Z227BarUni = T00F23_A227BarUni[0] ;
            Z179BarLoc = T00F23_A179BarLoc[0] ;
            Z165BarHorIni = T00F23_A165BarHorIni[0] ;
            Z164BarHorFin = T00F23_A164BarHorFin[0] ;
            Z215BarTieRea = T00F23_A215BarTieRea[0] ;
            Z3298BarFecRIni = T00F23_A3298BarFecRIni[0] ;
            Z457FasCod = T00F23_A457FasCod[0] ;
            Z603MaqCodBis = T00F23_A603MaqCodBis[0] ;
         }
         else
         {
            Z152BarFasCon = A152BarFasCon ;
            Z153BarFasEst = A153BarFasEst ;
            Z150BarFacTin = A150BarFacTin ;
            Z162BarFecTeo = A162BarFecTeo ;
            Z160BarFecRea = A160BarFecRea ;
            Z216BarTieTeo = A216BarTieTeo ;
            Z227BarUni = A227BarUni ;
            Z179BarLoc = A179BarLoc ;
            Z165BarHorIni = A165BarHorIni ;
            Z164BarHorFin = A164BarHorFin ;
            Z215BarTieRea = A215BarTieRea ;
            Z3298BarFecRIni = A3298BarFecRIni ;
            Z457FasCod = A457FasCod ;
            Z603MaqCodBis = A603MaqCodBis ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z152BarFasCon = A152BarFasCon ;
         Z153BarFasEst = A153BarFasEst ;
         Z150BarFacTin = A150BarFacTin ;
         Z162BarFecTeo = A162BarFecTeo ;
         Z160BarFecRea = A160BarFecRea ;
         Z216BarTieTeo = A216BarTieTeo ;
         Z227BarUni = A227BarUni ;
         Z179BarLoc = A179BarLoc ;
         Z165BarHorIni = A165BarHorIni ;
         Z164BarHorFin = A164BarHorFin ;
         Z215BarTieRea = A215BarTieRea ;
         Z3298BarFecRIni = A3298BarFecRIni ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z1785BarFasAnt = A1785BarFasAnt ;
         Z458FasCon = A458FasCon ;
         Z459FasDec = A459FasDec ;
         Z602MaqCod = A602MaqCod ;
         Z456FasActTin = A456FasActTin ;
      }
   }

   public void standaloneNotModalF215( )
   {
      /* Using cursor T00F26 */
      pr_default.execute(2, new Object[] {Short.valueOf(A655OrdLinVir), A1788EmpcVir, Integer.valueOf(A1784BarCoVir), Byte.valueOf(A1787BarReVir), A1786BarPaVir, A1789ProCodVir});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1785BarFasAnt = T00F26_A1785BarFasAnt[0] ;
         n1785BarFasAnt = T00F26_n1785BarFasAnt[0] ;
      }
      else
      {
         A1785BarFasAnt = "        " ;
         n1785BarFasAnt = false ;
      }
      pr_default.close(2);
      A1788EmpcVir = A396EmprCod ;
      A1784BarCoVir = A129BarCod ;
      A1787BarReVir = A132BarCodReo ;
      A1786BarPaVir = A130BarCodPar ;
      A1789ProCodVir = A758ProCod ;
   }

   public void standaloneModalF215( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      }
      else
      {
         edtBarOrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      }
   }

   public void loadF215( )
   {
      /* Using cursor T00F2123 */
      pr_default.execute(109, new Object[] {Short.valueOf(A655OrdLinVir), A1788EmpcVir, Integer.valueOf(A1784BarCoVir), Byte.valueOf(A1787BarReVir), A1786BarPaVir, A1789ProCodVir, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(109) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A458FasCon = T00F2123_A458FasCon[0] ;
         n458FasCon = T00F2123_n458FasCon[0] ;
         A152BarFasCon = T00F2123_A152BarFasCon[0] ;
         A153BarFasEst = T00F2123_A153BarFasEst[0] ;
         A459FasDec = T00F2123_A459FasDec[0] ;
         n459FasDec = T00F2123_n459FasDec[0] ;
         A602MaqCod = T00F2123_A602MaqCod[0] ;
         n602MaqCod = T00F2123_n602MaqCod[0] ;
         A456FasActTin = T00F2123_A456FasActTin[0] ;
         n456FasActTin = T00F2123_n456FasActTin[0] ;
         A150BarFacTin = T00F2123_A150BarFacTin[0] ;
         A162BarFecTeo = T00F2123_A162BarFecTeo[0] ;
         A160BarFecRea = T00F2123_A160BarFecRea[0] ;
         A216BarTieTeo = T00F2123_A216BarTieTeo[0] ;
         A227BarUni = T00F2123_A227BarUni[0] ;
         A179BarLoc = T00F2123_A179BarLoc[0] ;
         A165BarHorIni = T00F2123_A165BarHorIni[0] ;
         A164BarHorFin = T00F2123_A164BarHorFin[0] ;
         A215BarTieRea = T00F2123_A215BarTieRea[0] ;
         A3298BarFecRIni = T00F2123_A3298BarFecRIni[0] ;
         A457FasCod = T00F2123_A457FasCod[0] ;
         A603MaqCodBis = T00F2123_A603MaqCodBis[0] ;
         A1785BarFasAnt = T00F2123_A1785BarFasAnt[0] ;
         n1785BarFasAnt = T00F2123_n1785BarFasAnt[0] ;
         zmF215( -20) ;
      }
      pr_default.close(109);
      onLoadActionsF215( ) ;
   }

   public void onLoadActionsF215( )
   {
      A655OrdLinVir = A194BarOrdLin ;
   }

   public void checkExtendedTableF215( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalF215( ) ;
      /* Using cursor T00F27 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T00F27_A458FasCon[0] ;
      n458FasCon = T00F27_n458FasCon[0] ;
      A459FasDec = T00F27_A459FasDec[0] ;
      n459FasDec = T00F27_n459FasDec[0] ;
      A602MaqCod = T00F27_A602MaqCod[0] ;
      n602MaqCod = T00F27_n602MaqCod[0] ;
      A456FasActTin = T00F27_A456FasActTin[0] ;
      n456FasActTin = T00F27_n456FasActTin[0] ;
      pr_default.close(3);
      /* Using cursor T00F28 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "MAQCODBIS_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      nIsDirty_15 = (short)(1) ;
      A655OrdLinVir = A194BarOrdLin ;
      if ( ! ( ( GXutil.strcmp(A152BarFasCon, "S") == 0 ) || ( GXutil.strcmp(A152BarFasCon, "N") == 0 ) ) )
      {
         GXCCtl = "BARFASCON_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) ) )
      {
         GXCCtl = "BARFASEST_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A150BarFacTin, "S") == 0 ) || ( GXutil.strcmp(A150BarFacTin, "N") == 0 ) ) )
      {
         GXCCtl = "BARFACTIN_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "BarFacTin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFacTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsF215( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisableF215( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00F2124 */
      pr_default.execute(110, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(110) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T00F2124_A458FasCon[0] ;
      n458FasCon = T00F2124_n458FasCon[0] ;
      A459FasDec = T00F2124_A459FasDec[0] ;
      n459FasDec = T00F2124_n459FasDec[0] ;
      A602MaqCod = T00F2124_A602MaqCod[0] ;
      n602MaqCod = T00F2124_n602MaqCod[0] ;
      A456FasActTin = T00F2124_A456FasActTin[0] ;
      n456FasActTin = T00F2124_n456FasActTin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(110) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(110);
   }

   public void gxload_23( String A396EmprCod ,
                          String A603MaqCodBis )
   {
      /* Using cursor T00F2125 */
      pr_default.execute(111, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(111) == 101) )
      {
         GXCCtl = "MAQCODBIS_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(111) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(111);
   }

   public void getKeyF215( )
   {
      /* Using cursor T00F2126 */
      pr_default.execute(112, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(112) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(112);
   }

   public void getByPrimaryKeyF215( )
   {
      /* Using cursor T00F23 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmF215( 20) ;
         RcdFound15 = (short)(1) ;
         initializeNonKeyF215( ) ;
         A194BarOrdLin = T00F23_A194BarOrdLin[0] ;
         A152BarFasCon = T00F23_A152BarFasCon[0] ;
         A153BarFasEst = T00F23_A153BarFasEst[0] ;
         A150BarFacTin = T00F23_A150BarFacTin[0] ;
         A162BarFecTeo = T00F23_A162BarFecTeo[0] ;
         A160BarFecRea = T00F23_A160BarFecRea[0] ;
         A216BarTieTeo = T00F23_A216BarTieTeo[0] ;
         A227BarUni = T00F23_A227BarUni[0] ;
         A179BarLoc = T00F23_A179BarLoc[0] ;
         A165BarHorIni = T00F23_A165BarHorIni[0] ;
         A164BarHorFin = T00F23_A164BarHorFin[0] ;
         A215BarTieRea = T00F23_A215BarTieRea[0] ;
         A3298BarFecRIni = T00F23_A3298BarFecRIni[0] ;
         A457FasCod = T00F23_A457FasCod[0] ;
         A603MaqCodBis = T00F23_A603MaqCodBis[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalF215( ) ;
         loadF215( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyF215( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalF215( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesF215( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyF215( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00F22 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z152BarFasCon, T00F22_A152BarFasCon[0]) != 0 ) || ( Z153BarFasEst != T00F22_A153BarFasEst[0] ) || ( GXutil.strcmp(Z150BarFacTin, T00F22_A150BarFacTin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T00F22_A162BarFecTeo[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T00F22_A160BarFecRea[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z216BarTieTeo, T00F22_A216BarTieTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z227BarUni, T00F22_A227BarUni[0]) != 0 ) || ( GXutil.strcmp(Z179BarLoc, T00F22_A179BarLoc[0]) != 0 ) || ( Z165BarHorIni != T00F22_A165BarHorIni[0] ) || ( Z164BarHorFin != T00F22_A164BarHorFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z215BarTieRea, T00F22_A215BarTieRea[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T00F22_A3298BarFecRIni[0])) ) || ( GXutil.strcmp(Z457FasCod, T00F22_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z603MaqCodBis, T00F22_A603MaqCodBis[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z152BarFasCon, T00F22_A152BarFasCon[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFasCon");
               GXutil.writeLogRaw("Old: ",Z152BarFasCon);
               GXutil.writeLogRaw("Current: ",T00F22_A152BarFasCon[0]);
            }
            if ( Z153BarFasEst != T00F22_A153BarFasEst[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFasEst");
               GXutil.writeLogRaw("Old: ",Z153BarFasEst);
               GXutil.writeLogRaw("Current: ",T00F22_A153BarFasEst[0]);
            }
            if ( GXutil.strcmp(Z150BarFacTin, T00F22_A150BarFacTin[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFacTin");
               GXutil.writeLogRaw("Old: ",Z150BarFacTin);
               GXutil.writeLogRaw("Current: ",T00F22_A150BarFacTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T00F22_A162BarFecTeo[0])) ) )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFecTeo");
               GXutil.writeLogRaw("Old: ",Z162BarFecTeo);
               GXutil.writeLogRaw("Current: ",T00F22_A162BarFecTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T00F22_A160BarFecRea[0])) ) )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFecRea");
               GXutil.writeLogRaw("Old: ",Z160BarFecRea);
               GXutil.writeLogRaw("Current: ",T00F22_A160BarFecRea[0]);
            }
            if ( DecimalUtil.compareTo(Z216BarTieTeo, T00F22_A216BarTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarTieTeo");
               GXutil.writeLogRaw("Old: ",Z216BarTieTeo);
               GXutil.writeLogRaw("Current: ",T00F22_A216BarTieTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z227BarUni, T00F22_A227BarUni[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarUni");
               GXutil.writeLogRaw("Old: ",Z227BarUni);
               GXutil.writeLogRaw("Current: ",T00F22_A227BarUni[0]);
            }
            if ( GXutil.strcmp(Z179BarLoc, T00F22_A179BarLoc[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarLoc");
               GXutil.writeLogRaw("Old: ",Z179BarLoc);
               GXutil.writeLogRaw("Current: ",T00F22_A179BarLoc[0]);
            }
            if ( Z165BarHorIni != T00F22_A165BarHorIni[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarHorIni");
               GXutil.writeLogRaw("Old: ",Z165BarHorIni);
               GXutil.writeLogRaw("Current: ",T00F22_A165BarHorIni[0]);
            }
            if ( Z164BarHorFin != T00F22_A164BarHorFin[0] )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarHorFin");
               GXutil.writeLogRaw("Old: ",Z164BarHorFin);
               GXutil.writeLogRaw("Current: ",T00F22_A164BarHorFin[0]);
            }
            if ( DecimalUtil.compareTo(Z215BarTieRea, T00F22_A215BarTieRea[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarTieRea");
               GXutil.writeLogRaw("Old: ",Z215BarTieRea);
               GXutil.writeLogRaw("Current: ",T00F22_A215BarTieRea[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T00F22_A3298BarFecRIni[0])) ) )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"BarFecRIni");
               GXutil.writeLogRaw("Old: ",Z3298BarFecRIni);
               GXutil.writeLogRaw("Current: ",T00F22_A3298BarFecRIni[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00F22_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00F22_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z603MaqCodBis, T00F22_A603MaqCodBis[0]) != 0 )
            {
               GXutil.writeLogln("tfaslec:[seudo value changed for attri]"+"MaqCodBis");
               GXutil.writeLogRaw("Old: ",Z603MaqCodBis);
               GXutil.writeLogRaw("Current: ",T00F22_A603MaqCodBis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertF215( )
   {
      beforeValidateF215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF215( ) ;
      }
      if ( AnyError == 0 )
      {
         zmF215( 0) ;
         checkOptimisticConcurrencyF215( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmF215( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertF215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00F2127 */
                  pr_default.execute(113, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, Boolean.valueOf(n396EmprCod), A396EmprCod, A457FasCod, A603MaqCodBis});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(113) == 1) )
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
            loadF215( ) ;
         }
         endLevelF215( ) ;
      }
      closeExtendedTableCursorsF215( ) ;
   }

   public void updateF215( )
   {
      beforeValidateF215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableF215( ) ;
      }
      if ( ( nIsMod_15 != 0 ) || ( nIsDirty_15 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyF215( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmF215( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateF215( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00F2128 */
                     pr_default.execute(114, new Object[] {A152BarFasCon, Byte.valueOf(A153BarFasEst), A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A457FasCod, A603MaqCodBis, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                     if ( (pr_default.getStatus(114) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateF215( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        tfaslec_impl.this.A396EmprCod = GXv_char4[0] ;
                        tfaslec_impl.this.A129BarCod = GXv_int2[0] ;
                        tfaslec_impl.this.A132BarCodReo = GXv_int3[0] ;
                        tfaslec_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyF215( ) ;
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
            endLevelF215( ) ;
         }
      }
      closeExtendedTableCursorsF215( ) ;
   }

   public void deferredUpdateF215( )
   {
   }

   public void deleteF215( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateF215( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyF215( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsF215( ) ;
         afterConfirmF215( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteF215( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00F2129 */
               pr_default.execute(115, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelF215( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsF215( )
   {
      standaloneModalF215( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A655OrdLinVir = A194BarOrdLin ;
         /* Using cursor T00F2130 */
         pr_default.execute(116, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A457FasCod});
         A458FasCon = T00F2130_A458FasCon[0] ;
         n458FasCon = T00F2130_n458FasCon[0] ;
         A459FasDec = T00F2130_A459FasDec[0] ;
         n459FasDec = T00F2130_n459FasDec[0] ;
         A602MaqCod = T00F2130_A602MaqCod[0] ;
         n602MaqCod = T00F2130_n602MaqCod[0] ;
         A456FasActTin = T00F2130_A456FasActTin[0] ;
         n456FasActTin = T00F2130_n456FasActTin[0] ;
         pr_default.close(116);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00F2131 */
         pr_default.execute(117, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T00F2132 */
         pr_default.execute(118, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T00F2133 */
         pr_default.execute(119, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T00F2134 */
         pr_default.execute(120, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T00F2135 */
         pr_default.execute(121, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T00F2136 */
         pr_default.execute(122, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T00F2137 */
         pr_default.execute(123, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T00F2138 */
         pr_default.execute(124, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T00F2139 */
         pr_default.execute(125, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
         /* Using cursor T00F2140 */
         pr_default.execute(126, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(126) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(126);
         /* Using cursor T00F2141 */
         pr_default.execute(127, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
         /* Using cursor T00F2142 */
         pr_default.execute(128, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(128) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(128);
         /* Using cursor T00F2143 */
         pr_default.execute(129, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(129) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(129);
         /* Using cursor T00F2144 */
         pr_default.execute(130, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor T00F2145 */
         pr_default.execute(131, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
         /* Using cursor T00F2146 */
         pr_default.execute(132, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(132) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(132);
         /* Using cursor T00F2147 */
         pr_default.execute(133, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(133) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(133);
         /* Using cursor T00F2148 */
         pr_default.execute(134, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(134) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(134);
         /* Using cursor T00F2149 */
         pr_default.execute(135, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(135) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(135);
         /* Using cursor T00F2150 */
         pr_default.execute(136, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(136) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(136);
         /* Using cursor T00F2151 */
         pr_default.execute(137, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(137) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(137);
      }
   }

   public void endLevelF215( )
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

   public void scanStartF215( )
   {
      /* Scan By routine */
      /* Using cursor T00F2152 */
      pr_default.execute(138, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(138) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00F2152_A194BarOrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextF215( )
   {
      /* Scan next routine */
      pr_default.readNext(138);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(138) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00F2152_A194BarOrdLin[0] ;
      }
   }

   public void scanEndF215( )
   {
      pr_default.close(138);
   }

   public void afterConfirmF215( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertF215( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateF215( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteF215( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteF215( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateF215( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesF215( )
   {
      edtMaxOrdFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxOrdFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxOrdFas_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFecRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarTieTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtEmpcVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpcVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpcVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarCoVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCoVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCoVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarReVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarPaVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPaVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPaVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtProCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCodVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtOrdLinVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLinVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLinVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFasAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAnt_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtBarFecRIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
   }

   public void send_integrity_lvl_hashesF215( )
   {
   }

   public void send_integrity_lvl_hashesF214( )
   {
   }

   public void send_integrity_lvl_hashesF212( )
   {
   }

   public void subsflControlProps_9014( )
   {
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_90_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_90_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_90_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_90_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_90_idx ;
      edtProFasLin_Internalname = "PROFASLIN_"+sGXsfl_90_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_90_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_90_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_9014( )
   {
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_90_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_90_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_90_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_90_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_90_fel_idx ;
      edtProFasLin_Internalname = "PROFASLIN_"+sGXsfl_90_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_90_fel_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_90_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_90_fel_idx ;
   }

   public void addRowF214( )
   {
      nRC_GXsfl_117 = 0 ;
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9014( ) ;
      sendRowF214( ) ;
   }

   public void sendRowF214( )
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
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_90_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_90_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_90_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "Codigo Proceso", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Descripcion Proceso", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Ultima Linea Fases", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A761ProFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A761ProFasLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFasLin_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProFasLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Indica si fase con estado&lt;&gt;0", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A760ProFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A760ProFasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFasEst_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProFasEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol117( ) ;
      nGXsfl_117_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount15 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_15 = (short)(1) ;
            scanStartF215( ) ;
            while ( RcdFound15 != 0 )
            {
               init_level_properties15( ) ;
               getByPrimaryKeyF215( ) ;
               addRowF215( ) ;
               scanNextF215( ) ;
            }
            scanEndF215( ) ;
            nBlankRcdCount15 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalF215( ) ;
         standaloneModalF215( ) ;
         sMode15 = Gx_mode ;
         while ( nGXsfl_117_idx < nRC_GXsfl_117 )
         {
            bGXsfl_117_Refreshing = true ;
            readRowF215( ) ;
            edtavnRcdDeleted_15_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_15_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_15_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASCON_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtMaqCodBis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODBIS_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFacTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFACTIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFecTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECTEO_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFecRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarTieTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLOC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarHorIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarHorFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarTieRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtEmpcVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPCVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmpcVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpcVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarCoVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCoVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCoVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarReVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarReVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarPaVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPaVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPaVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtProCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCODVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCodVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtOrdLinVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLINVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdLinVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLinVir_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFasAnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASANT_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAnt_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtBarFecRIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECRINI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIni_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            if ( ( nRcdExists_15 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalF215( ) ;
            }
            sendRowF215( ) ;
            bGXsfl_117_Refreshing = false ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount15 = (short)(5) ;
         nRcdExists_15 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartF215( ) ;
            while ( RcdFound15 != 0 )
            {
               sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx+1), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
               subsflControlProps_11715( ) ;
               init_level_properties15( ) ;
               standaloneNotModalF215( ) ;
               getByPrimaryKeyF215( ) ;
               standaloneModalF215( ) ;
               addRowF215( ) ;
               scanNextF215( ) ;
            }
            scanEndF215( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode15 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx+1), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
      subsflControlProps_11715( ) ;
      initAllF215( ) ;
      init_level_properties15( ) ;
      nRcdExists_15 = (short)(0) ;
      nIsMod_15 = (short)(0) ;
      nRcdDeleted_15 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 90 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_90_idx, ".")) == 0 ) )
      {
         nBlankRcdCount15 = (short)(nBlankRcdUsr15+nBlankRcdCount15) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount15 > 0 )
      {
         standaloneNotModalF215( ) ;
         standaloneModalF215( ) ;
         addRowF215( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount15 = (short)(nBlankRcdCount15-1) ;
      }
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_90_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_90_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_90_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesF214( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "Z761ProFasLin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_117_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_14_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_14_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFASLIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFASEST_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_90_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowF214( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9014( ) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASLIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASEST_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      n758ProCod = false ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFASLIN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFasLin_Internalname ;
         wbErr = true ;
         A761ProFasLin = (short)(0) ;
         n761ProFasLin = false ;
      }
      else
      {
         A761ProFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n761ProFasLin = false ;
      }
      A760ProFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtProFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n760ProFasEst = false ;
      GXCCtl = "Z758ProCod_" + sGXsfl_90_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z761ProFasLin_" + sGXsfl_90_idx ;
      Z761ProFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_90_idx ;
      nRC_GXsfl_117 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_90_idx ;
      nRcdDeleted_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_14_" + sGXsfl_90_idx ;
      nRcdExists_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_14_" + sGXsfl_90_idx ;
      nIsMod_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_90_idx ;
      nRC_GXsfl_117 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_11715( )
   {
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15_"+sGXsfl_117_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_117_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_117_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_117_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_117_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_117_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_117_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_117_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_117_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_117_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_117_idx ;
      edtBarFecTeo_Internalname = "BARFECTEO_"+sGXsfl_117_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_117_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_117_idx ;
      edtBarUni_Internalname = "BARUNI_"+sGXsfl_117_idx ;
      edtBarLoc_Internalname = "BARLOC_"+sGXsfl_117_idx ;
      edtBarHorIni_Internalname = "BARHORINI_"+sGXsfl_117_idx ;
      edtBarHorFin_Internalname = "BARHORFIN_"+sGXsfl_117_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_117_idx ;
      edtEmpcVir_Internalname = "EMPCVIR_"+sGXsfl_117_idx ;
      edtBarCoVir_Internalname = "BARCOVIR_"+sGXsfl_117_idx ;
      edtBarReVir_Internalname = "BARREVIR_"+sGXsfl_117_idx ;
      edtBarPaVir_Internalname = "BARPAVIR_"+sGXsfl_117_idx ;
      edtProCodVir_Internalname = "PROCODVIR_"+sGXsfl_117_idx ;
      edtOrdLinVir_Internalname = "ORDLINVIR_"+sGXsfl_117_idx ;
      edtBarFasAnt_Internalname = "BARFASANT_"+sGXsfl_117_idx ;
      edtBarFecRIni_Internalname = "BARFECRINI_"+sGXsfl_117_idx ;
   }

   public void subsflControlProps_fel_11715( )
   {
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15_"+sGXsfl_117_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_117_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_117_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_117_fel_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_117_fel_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_117_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_117_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_117_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_117_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_117_fel_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_117_fel_idx ;
      edtBarFecTeo_Internalname = "BARFECTEO_"+sGXsfl_117_fel_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_117_fel_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_117_fel_idx ;
      edtBarUni_Internalname = "BARUNI_"+sGXsfl_117_fel_idx ;
      edtBarLoc_Internalname = "BARLOC_"+sGXsfl_117_fel_idx ;
      edtBarHorIni_Internalname = "BARHORINI_"+sGXsfl_117_fel_idx ;
      edtBarHorFin_Internalname = "BARHORFIN_"+sGXsfl_117_fel_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_117_fel_idx ;
      edtEmpcVir_Internalname = "EMPCVIR_"+sGXsfl_117_fel_idx ;
      edtBarCoVir_Internalname = "BARCOVIR_"+sGXsfl_117_fel_idx ;
      edtBarReVir_Internalname = "BARREVIR_"+sGXsfl_117_fel_idx ;
      edtBarPaVir_Internalname = "BARPAVIR_"+sGXsfl_117_fel_idx ;
      edtProCodVir_Internalname = "PROCODVIR_"+sGXsfl_117_fel_idx ;
      edtOrdLinVir_Internalname = "ORDLINVIR_"+sGXsfl_117_fel_idx ;
      edtBarFasAnt_Internalname = "BARFASANT_"+sGXsfl_117_fel_idx ;
      edtBarFecRIni_Internalname = "BARFECRINI_"+sGXsfl_117_fel_idx ;
   }

   public void addRowF215( )
   {
      nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
      subsflControlProps_11715( ) ;
      sendRowF215( ) ;
   }

   public void sendRowF215( )
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
         if ( ((int)((nGXsfl_117_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_15_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_15_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_15), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_15), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_15_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarOrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCodBis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFacTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecTeo_Internalname,localUtil.format(A162BarFecTeo, "99/99/99"),localUtil.format( A162BarFecTeo, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRea_Internalname,localUtil.format(A160BarFecRea, "99/99/99"),localUtil.format( A160BarFecRea, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTieTeo_Enabled!=0) ? localUtil.format( A216BarTieTeo, "Z9.99") : localUtil.format( A216BarTieTeo, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUni_Internalname,GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarUni_Enabled!=0) ? localUtil.format( A227BarUni, "ZZZZZ9.99") : localUtil.format( A227BarUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLoc_Internalname,GXutil.rtrim( A179BarLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorIni_Internalname,GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorIni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorFin_Internalname,GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorFin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTieRea_Enabled!=0) ? localUtil.format( A215BarTieRea, "Z9.99") : localUtil.format( A215BarTieRea, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpcVir_Internalname,GXutil.rtrim( A1788EmpcVir),GXutil.rtrim( localUtil.format( A1788EmpcVir, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpcVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmpcVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCoVir_Internalname,GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCoVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1784BarCoVir), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1784BarCoVir), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCoVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCoVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarReVir_Internalname,GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarReVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1787BarReVir), "9") : localUtil.format( DecimalUtil.doubleToDec(A1787BarReVir), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarReVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarReVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPaVir_Internalname,GXutil.rtrim( A1786BarPaVir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPaVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPaVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCodVir_Internalname,GXutil.rtrim( A1789ProCodVir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCodVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCodVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLinVir_Internalname,GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdLinVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A655OrdLinVir), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A655OrdLinVir), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdLinVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdLinVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasAnt_Internalname,GXutil.rtrim( A1785BarFasAnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasAnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasAnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRIni_Internalname,localUtil.format(A3298BarFecRIni, "99/99/99"),localUtil.format( A3298BarFecRIni, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,144);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecRIni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesF215( ) ;
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z152BarFasCon_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z152BarFasCon));
      GXCCtl = "Z153BarFasEst_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z150BarFacTin_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z150BarFacTin));
      GXCCtl = "Z162BarFecTeo_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z162BarFecTeo, 0, "/"));
      GXCCtl = "Z160BarFecRea_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z160BarFecRea, 0, "/"));
      GXCCtl = "Z216BarTieTeo_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z227BarUni_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z179BarLoc_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z179BarLoc));
      GXCCtl = "Z165BarHorIni_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z164BarHorFin_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z215BarTieRea_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3298BarFecRIni_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3298BarFecRIni, 0, "/"));
      GXCCtl = "Z457FasCod_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z603MaqCodBis_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z603MaqCodBis));
      GXCCtl = "nRcdDeleted_15_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_15_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_15_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_15_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECTEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLOC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPCVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPAVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCODVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDLINVIR_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASANT_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECRINI_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowF215( )
   {
      nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
      subsflControlProps_11715( ) ;
      edtavnRcdDeleted_15_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_15_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASCON_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCodBis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODBIS_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFacTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFACTIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECTEO_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLOC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmpcVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPCVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCoVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarReVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPaVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCODVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdLinVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLINVIR_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasAnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASANT_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecRIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECRINI_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_15");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_15_Internalname ;
         wbErr = true ;
         nRcdDeleted_15 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_15 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARORDLIN_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarOrdLin_Internalname ;
         wbErr = true ;
         A194BarOrdLin = (short)(0) ;
      }
      else
      {
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
      n458FasCon = false ;
      A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARFASEST_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
         wbErr = true ;
         A153BarFasEst = (byte)(0) ;
      }
      else
      {
         A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
      n459FasDec = false ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecTeo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECTEO_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecTeo_Internalname ;
         wbErr = true ;
         A162BarFecTeo = GXutil.nullDate() ;
      }
      else
      {
         A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( edtBarFecTeo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECREA_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecRea_Internalname ;
         wbErr = true ;
         A160BarFecRea = GXutil.nullDate() ;
      }
      else
      {
         A160BarFecRea = localUtil.ctod( httpContext.cgiGet( edtBarFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIETEO_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieTeo_Internalname ;
         wbErr = true ;
         A216BarTieTeo = DecimalUtil.ZERO ;
      }
      else
      {
         A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARUNI_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarUni_Internalname ;
         wbErr = true ;
         A227BarUni = DecimalUtil.ZERO ;
      }
      else
      {
         A227BarUni = localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)) ;
      }
      A179BarLoc = httpContext.cgiGet( edtBarLoc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORINI_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorIni_Internalname ;
         wbErr = true ;
         A165BarHorIni = (short)(0) ;
      }
      else
      {
         A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORFIN_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorFin_Internalname ;
         wbErr = true ;
         A164BarHorFin = (short)(0) ;
      }
      else
      {
         A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIEREA_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieRea_Internalname ;
         wbErr = true ;
         A215BarTieRea = DecimalUtil.ZERO ;
      }
      else
      {
         A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
      }
      A1788EmpcVir = GXutil.upper( httpContext.cgiGet( edtEmpcVir_Internalname)) ;
      A1784BarCoVir = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCoVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1787BarReVir = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarReVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1786BarPaVir = httpContext.cgiGet( edtBarPaVir_Internalname) ;
      A1789ProCodVir = httpContext.cgiGet( edtProCodVir_Internalname) ;
      A655OrdLinVir = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLinVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1785BarFasAnt = httpContext.cgiGet( edtBarFasAnt_Internalname) ;
      n1785BarFasAnt = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECRINI_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecRIni_Internalname ;
         wbErr = true ;
         A3298BarFecRIni = GXutil.nullDate() ;
      }
      else
      {
         A3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( edtBarFecRIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_117_idx ;
      Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z152BarFasCon_" + sGXsfl_117_idx ;
      Z152BarFasCon = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z153BarFasEst_" + sGXsfl_117_idx ;
      Z153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z150BarFacTin_" + sGXsfl_117_idx ;
      Z150BarFacTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z162BarFecTeo_" + sGXsfl_117_idx ;
      Z162BarFecTeo = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z160BarFecRea_" + sGXsfl_117_idx ;
      Z160BarFecRea = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z216BarTieTeo_" + sGXsfl_117_idx ;
      Z216BarTieTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z227BarUni_" + sGXsfl_117_idx ;
      Z227BarUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z179BarLoc_" + sGXsfl_117_idx ;
      Z179BarLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z165BarHorIni_" + sGXsfl_117_idx ;
      Z165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z164BarHorFin_" + sGXsfl_117_idx ;
      Z164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z215BarTieRea_" + sGXsfl_117_idx ;
      Z215BarTieRea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3298BarFecRIni_" + sGXsfl_117_idx ;
      Z3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_117_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z603MaqCodBis_" + sGXsfl_117_idx ;
      Z603MaqCodBis = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_15_" + sGXsfl_117_idx ;
      nRcdDeleted_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_15_" + sGXsfl_117_idx ;
      nRcdExists_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_15_" + sGXsfl_117_idx ;
      nIsMod_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarOrdLin_Enabled = edtBarOrdLin_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValuesF20( )
   {
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9014( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_9014( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z761ProFasLin_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z761ProFasLin_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_90_idx) ;
      }
      nGXsfl_117_idx = 0 ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
      subsflControlProps_11715( ) ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
         sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
         subsflControlProps_11715( ) ;
         httpContext.changePostValue( "Z194BarOrdLin_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z194BarOrdLin_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z152BarFasCon_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z152BarFasCon_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z153BarFasEst_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z153BarFasEst_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z150BarFacTin_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z150BarFacTin_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z162BarFecTeo_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z162BarFecTeo_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z160BarFecRea_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z160BarFecRea_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z216BarTieTeo_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z216BarTieTeo_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z227BarUni_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z227BarUni_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z179BarLoc_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z179BarLoc_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z165BarHorIni_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z165BarHorIni_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z164BarHorFin_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z164BarHorFin_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z215BarTieRea_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z215BarTieRea_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z3298BarFecRIni_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z3298BarFecRIni_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3298BarFecRIni_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z603MaqCodBis_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z603MaqCodBis_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_117_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfaslec", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASLEC");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfaslec:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tfaslec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFASLEC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA DE FASES DESDE LECTOR", "") ;
   }

   public void initializeNonKeyF212( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      A628MaxOrdFas = (short)(0) ;
      n628MaxOrdFas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z212BarSer = "" ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z217BarTipArt = (short)(0) ;
   }

   public void initAllF212( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKeyF212( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyF214( )
   {
      A759ProDsc = "" ;
      A761ProFasLin = (short)(0) ;
      n761ProFasLin = false ;
      A760ProFasEst = (byte)(0) ;
      n760ProFasEst = false ;
      Z761ProFasLin = (short)(0) ;
   }

   public void initAllF214( )
   {
      A758ProCod = "" ;
      n758ProCod = false ;
      initializeNonKeyF214( ) ;
   }

   public void standaloneModalInsertF214( )
   {
   }

   public void initializeNonKeyF215( )
   {
      A655OrdLinVir = (short)(0) ;
      A457FasCod = "" ;
      A458FasCon = "" ;
      n458FasCon = false ;
      A152BarFasCon = "" ;
      A153BarFasEst = (byte)(0) ;
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      A602MaqCod = "" ;
      n602MaqCod = false ;
      A603MaqCodBis = "" ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A150BarFacTin = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A165BarHorIni = (short)(0) ;
      A164BarHorFin = (short)(0) ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3298BarFecRIni = GXutil.nullDate() ;
      Z152BarFasCon = "" ;
      Z153BarFasEst = (byte)(0) ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z165BarHorIni = (short)(0) ;
      Z164BarHorFin = (short)(0) ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
   }

   public void initAllF215( )
   {
      A194BarOrdLin = (short)(0) ;
      initializeNonKeyF215( ) ;
   }

   public void standaloneModalInsertF215( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525881", true, true);
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
      httpContext.AddJavascriptSource("tfaslec.js", "?20268241525881", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties14( )
   {
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void init_level_properties15( )
   {
      edtBarOrdLin_Enabled = defedtBarOrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
   }

   public void startgridcontrol90( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock15_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock16_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock18_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol117( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A162BarFecTeo, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A160BarFecRea, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A179BarLoc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1788EmpcVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1786BarPaVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1789ProCodVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1785BarFasAnt));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A3298BarFecRIni, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIni_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMaxOrdFas_Internalname = "MAXORDFAS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtProFasLin_Internalname = "PROFASLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtProFasEst_Internalname = "PROFASEST" ;
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasCon_Internalname = "FASCON" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      edtBarFecTeo_Internalname = "BARFECTEO" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      edtBarUni_Internalname = "BARUNI" ;
      edtBarLoc_Internalname = "BARLOC" ;
      edtBarHorIni_Internalname = "BARHORINI" ;
      edtBarHorFin_Internalname = "BARHORFIN" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      edtEmpcVir_Internalname = "EMPCVIR" ;
      edtBarCoVir_Internalname = "BARCOVIR" ;
      edtBarReVir_Internalname = "BARREVIR" ;
      edtBarPaVir_Internalname = "BARPAVIR" ;
      edtProCodVir_Internalname = "PROCODVIR" ;
      edtOrdLinVir_Internalname = "ORDLINVIR" ;
      edtBarFasAnt_Internalname = "BARFASANT" ;
      edtBarFecRIni_Internalname = "BARFECRINI" ;
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
      lblTextblock18_Caption = httpContext.getMessage( "Indica si fase con estado&lt;&gt;0", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "Ultima Linea Fases", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Descripcion Proceso", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "Codigo Proceso", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ENTRADA DE FASES DESDE LECTOR", "") );
      edtBarFecRIni_Jsonclick = "" ;
      edtBarFasAnt_Jsonclick = "" ;
      edtOrdLinVir_Jsonclick = "" ;
      edtProCodVir_Jsonclick = "" ;
      edtBarPaVir_Jsonclick = "" ;
      edtBarReVir_Jsonclick = "" ;
      edtBarCoVir_Jsonclick = "" ;
      edtEmpcVir_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarHorFin_Jsonclick = "" ;
      edtBarHorIni_Jsonclick = "" ;
      edtBarLoc_Jsonclick = "" ;
      edtBarUni_Jsonclick = "" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarFecTeo_Jsonclick = "" ;
      edtBarFacTin_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasCon_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtavnRcdDeleted_15_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtProFasEst_Jsonclick = "" ;
      edtProFasLin_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtBarFecRIni_Enabled = 1 ;
      edtBarFasAnt_Enabled = 0 ;
      edtOrdLinVir_Enabled = 0 ;
      edtProCodVir_Enabled = 0 ;
      edtBarPaVir_Enabled = 0 ;
      edtBarReVir_Enabled = 0 ;
      edtBarCoVir_Enabled = 0 ;
      edtEmpcVir_Enabled = 0 ;
      edtBarTieRea_Enabled = 1 ;
      edtBarHorFin_Enabled = 1 ;
      edtBarHorIni_Enabled = 1 ;
      edtBarLoc_Enabled = 1 ;
      edtBarUni_Enabled = 1 ;
      edtBarTieTeo_Enabled = 1 ;
      edtBarFecRea_Enabled = 1 ;
      edtBarFecTeo_Enabled = 1 ;
      edtBarFacTin_Enabled = 1 ;
      edtFasActTin_Enabled = 0 ;
      edtMaqCodBis_Enabled = 1 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtBarFasEst_Enabled = 1 ;
      edtBarFasCon_Enabled = 1 ;
      edtFasCon_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtBarOrdLin_Enabled = 1 ;
      edtavnRcdDeleted_15_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProFasEst_Enabled = 0 ;
      edtProFasLin_Enabled = 1 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 1 ;
      edtMaxOrdFas_Jsonclick = "" ;
      edtMaxOrdFas_Backcolor = (int)(0xFFFFFF) ;
      edtMaxOrdFas_Enabled = 0 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipArt_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      subsflControlProps_9014( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalF214( ) ;
         standaloneModalF214( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowF214( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_9014( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_11715( ) ;
      while ( nGXsfl_117_idx <= nRC_GXsfl_117 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalF214( ) ;
         standaloneModalF214( ) ;
         standaloneNotModalF215( ) ;
         standaloneModalF215( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowF215( ) ;
         nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
         sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_90_idx ;
         subsflControlProps_11715( ) ;
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
      /* Using cursor T00F236 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00F236_A407EmprNom[0] ;
      n407EmprNom = T00F236_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(28);
      /* Using cursor T00F238 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A628MaxOrdFas = T00F238_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F238_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      pr_default.close(29);
      GX_FocusControl = edtBarColNom_Internalname ;
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
      n396EmprCod = false ;
      n252CliCod = false ;
      n407EmprNom = false ;
      /* Using cursor T00F236 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00F236_A407EmprNom[0] ;
      n407EmprNom = T00F236_n407EmprNom[0] ;
      pr_default.close(28);
      /* Using cursor T00F239 */
      pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T00F239_A252CliCod[0] ;
      n252CliCod = T00F239_n252CliCod[0] ;
      A365DisDes = T00F239_A365DisDes[0] ;
      pr_default.close(30);
      /* Using cursor T00F240 */
      pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T00F240_A279CliNom[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      /* Using cursor T00F238 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A628MaxOrdFas = T00F238_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00F238_n628MaxOrdFas[0] ;
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrim( localUtil.ntoc( A628MaxOrdFas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z628MaxOrdFas", GXutil.ltrim( localUtil.ntoc( Z628MaxOrdFas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bartipart( )
   {
      n396EmprCod = false ;
      n217BarTipArt = false ;
      /* Using cursor T00F2153 */
      pr_default.execute(139, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
      if ( (pr_default.getStatus(139) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A217BarTipArt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(139);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Procod( )
   {
      n396EmprCod = false ;
      n758ProCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n760ProFasEst = false ;
      /* Using cursor T00F2115 */
      pr_default.execute(104, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(104) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00F2115_A759ProDsc[0] ;
      pr_default.close(104);
      /* Using cursor T00F2117 */
      pr_default.execute(105, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(105) != 101) )
      {
         A760ProFasEst = T00F2117_A760ProFasEst[0] ;
         n760ProFasEst = T00F2117_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      pr_default.close(105);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A760ProFasEst", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Fascod( )
   {
      n396EmprCod = false ;
      n458FasCon = false ;
      n459FasDec = false ;
      n602MaqCod = false ;
      n456FasActTin = false ;
      /* Using cursor T00F2130 */
      pr_default.execute(116, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(116) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A458FasCon = T00F2130_A458FasCon[0] ;
      n458FasCon = T00F2130_n458FasCon[0] ;
      A459FasDec = T00F2130_A459FasDec[0] ;
      n459FasDec = T00F2130_n459FasDec[0] ;
      A602MaqCod = T00F2130_A602MaqCod[0] ;
      n602MaqCod = T00F2130_n602MaqCod[0] ;
      A456FasActTin = T00F2130_A456FasActTin[0] ;
      n456FasActTin = T00F2130_n456FasActTin[0] ;
      pr_default.close(116);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
   }

   public void valid_Maqcodbis( )
   {
      n396EmprCod = false ;
      /* Using cursor T00F2154 */
      pr_default.execute(140, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(140) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
      }
      pr_default.close(140);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A628MaxOrdFas',fld:'MAXORDFAS',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z212BarSer'},{av:'Z217BarTipArt'},{av:'Z213BarSit'},{av:'Z120BarAgrEst'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'Z279CliNom'},{av:'Z628MaxOrdFas'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Profasest',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARFASCON","{handler:'valid_Barfascon',iparms:[]");
      setEventMetadata("VALID_BARFASCON",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[]");
      setEventMetadata("VALID_BARFASEST",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''}]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_BARFACTIN","{handler:'valid_Barfactin',iparms:[]");
      setEventMetadata("VALID_BARFACTIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfecrini',iparms:[]");
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
      pr_default.close(116);
      pr_default.close(140);
      pr_default.close(104);
      pr_default.close(105);
      pr_default.close(28);
      pr_default.close(30);
      pr_default.close(139);
      pr_default.close(31);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z135BarColNom = "" ;
      Z212BarSer = "" ;
      Z120BarAgrEst = "" ;
      Z758ProCod = "" ;
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock14_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode14 = "" ;
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
      GXCCtl = "" ;
      A458FasCon = "" ;
      A152BarFasCon = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A150BarFacTin = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A1788EmpcVir = "" ;
      A1786BarPaVir = "" ;
      A1789ProCodVir = "" ;
      A1785BarFasAnt = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      T00F210_A628MaxOrdFas = new short[1] ;
      T00F210_n628MaxOrdFas = new boolean[] {false} ;
      T00F212_A760ProFasEst = new byte[1] ;
      T00F212_n760ProFasEst = new boolean[] {false} ;
      A759ProDsc = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00F223_A361DisCod = new int[1] ;
      T00F223_A2759BarMaqGru = new String[] {""} ;
      T00F223_A129BarCod = new int[1] ;
      T00F223_n129BarCod = new boolean[] {false} ;
      T00F223_A132BarCodReo = new byte[1] ;
      T00F223_n132BarCodReo = new boolean[] {false} ;
      T00F223_A130BarCodPar = new String[] {""} ;
      T00F223_n130BarCodPar = new boolean[] {false} ;
      T00F223_A180BarMaqCod = new String[] {""} ;
      T00F223_A252CliCod = new int[1] ;
      T00F223_n252CliCod = new boolean[] {false} ;
      T00F223_A279CliNom = new String[] {""} ;
      T00F223_A135BarColNom = new String[] {""} ;
      T00F223_A136BarColNum = new int[1] ;
      T00F223_A212BarSer = new String[] {""} ;
      T00F223_A213BarSit = new byte[1] ;
      T00F223_A120BarAgrEst = new String[] {""} ;
      T00F223_A407EmprNom = new String[] {""} ;
      T00F223_n407EmprNom = new boolean[] {false} ;
      T00F223_A365DisDes = new String[] {""} ;
      T00F223_A396EmprCod = new String[] {""} ;
      T00F223_n396EmprCod = new boolean[] {false} ;
      T00F223_A217BarTipArt = new short[1] ;
      T00F223_n217BarTipArt = new boolean[] {false} ;
      T00F223_A628MaxOrdFas = new short[1] ;
      T00F223_n628MaxOrdFas = new boolean[] {false} ;
      T00F219_A252CliCod = new int[1] ;
      T00F219_n252CliCod = new boolean[] {false} ;
      T00F219_A365DisDes = new String[] {""} ;
      T00F218_A407EmprNom = new String[] {""} ;
      T00F218_n407EmprNom = new boolean[] {false} ;
      T00F220_A396EmprCod = new String[] {""} ;
      T00F220_n396EmprCod = new boolean[] {false} ;
      T00F221_A279CliNom = new String[] {""} ;
      T00F224_A407EmprNom = new String[] {""} ;
      T00F224_n407EmprNom = new boolean[] {false} ;
      T00F225_A252CliCod = new int[1] ;
      T00F225_n252CliCod = new boolean[] {false} ;
      T00F225_A365DisDes = new String[] {""} ;
      T00F226_A396EmprCod = new String[] {""} ;
      T00F226_n396EmprCod = new boolean[] {false} ;
      T00F227_A279CliNom = new String[] {""} ;
      T00F229_A628MaxOrdFas = new short[1] ;
      T00F229_n628MaxOrdFas = new boolean[] {false} ;
      T00F230_A396EmprCod = new String[] {""} ;
      T00F230_n396EmprCod = new boolean[] {false} ;
      T00F230_A129BarCod = new int[1] ;
      T00F230_n129BarCod = new boolean[] {false} ;
      T00F230_A132BarCodReo = new byte[1] ;
      T00F230_n132BarCodReo = new boolean[] {false} ;
      T00F230_A130BarCodPar = new String[] {""} ;
      T00F230_n130BarCodPar = new boolean[] {false} ;
      T00F217_A361DisCod = new int[1] ;
      T00F217_A2759BarMaqGru = new String[] {""} ;
      T00F217_A129BarCod = new int[1] ;
      T00F217_n129BarCod = new boolean[] {false} ;
      T00F217_A132BarCodReo = new byte[1] ;
      T00F217_n132BarCodReo = new boolean[] {false} ;
      T00F217_A130BarCodPar = new String[] {""} ;
      T00F217_n130BarCodPar = new boolean[] {false} ;
      T00F217_A180BarMaqCod = new String[] {""} ;
      T00F217_A135BarColNom = new String[] {""} ;
      T00F217_A136BarColNum = new int[1] ;
      T00F217_A212BarSer = new String[] {""} ;
      T00F217_A213BarSit = new byte[1] ;
      T00F217_A120BarAgrEst = new String[] {""} ;
      T00F217_A396EmprCod = new String[] {""} ;
      T00F217_n396EmprCod = new boolean[] {false} ;
      T00F217_A217BarTipArt = new short[1] ;
      T00F217_n217BarTipArt = new boolean[] {false} ;
      T00F217_A252CliCod = new int[1] ;
      T00F217_n252CliCod = new boolean[] {false} ;
      T00F217_A365DisDes = new String[] {""} ;
      T00F231_A396EmprCod = new String[] {""} ;
      T00F231_n396EmprCod = new boolean[] {false} ;
      T00F231_A129BarCod = new int[1] ;
      T00F231_n129BarCod = new boolean[] {false} ;
      T00F231_A132BarCodReo = new byte[1] ;
      T00F231_n132BarCodReo = new boolean[] {false} ;
      T00F231_A130BarCodPar = new String[] {""} ;
      T00F231_n130BarCodPar = new boolean[] {false} ;
      T00F232_A396EmprCod = new String[] {""} ;
      T00F232_n396EmprCod = new boolean[] {false} ;
      T00F232_A129BarCod = new int[1] ;
      T00F232_n129BarCod = new boolean[] {false} ;
      T00F232_A132BarCodReo = new byte[1] ;
      T00F232_n132BarCodReo = new boolean[] {false} ;
      T00F232_A130BarCodPar = new String[] {""} ;
      T00F232_n130BarCodPar = new boolean[] {false} ;
      T00F216_A361DisCod = new int[1] ;
      T00F216_A2759BarMaqGru = new String[] {""} ;
      T00F216_A129BarCod = new int[1] ;
      T00F216_n129BarCod = new boolean[] {false} ;
      T00F216_A132BarCodReo = new byte[1] ;
      T00F216_n132BarCodReo = new boolean[] {false} ;
      T00F216_A130BarCodPar = new String[] {""} ;
      T00F216_n130BarCodPar = new boolean[] {false} ;
      T00F216_A180BarMaqCod = new String[] {""} ;
      T00F216_A135BarColNom = new String[] {""} ;
      T00F216_A136BarColNum = new int[1] ;
      T00F216_A212BarSer = new String[] {""} ;
      T00F216_A213BarSit = new byte[1] ;
      T00F216_A120BarAgrEst = new String[] {""} ;
      T00F216_A396EmprCod = new String[] {""} ;
      T00F216_n396EmprCod = new boolean[] {false} ;
      T00F216_A217BarTipArt = new short[1] ;
      T00F216_n217BarTipArt = new boolean[] {false} ;
      T00F216_A252CliCod = new int[1] ;
      T00F216_n252CliCod = new boolean[] {false} ;
      T00F216_A365DisDes = new String[] {""} ;
      T00F236_A407EmprNom = new String[] {""} ;
      T00F236_n407EmprNom = new boolean[] {false} ;
      T00F238_A628MaxOrdFas = new short[1] ;
      T00F238_n628MaxOrdFas = new boolean[] {false} ;
      T00F239_A252CliCod = new int[1] ;
      T00F239_n252CliCod = new boolean[] {false} ;
      T00F239_A365DisDes = new String[] {""} ;
      T00F240_A279CliNom = new String[] {""} ;
      T00F241_A14681MRPrId = new long[1] ;
      T00F242_A5921XCjaDis = new String[] {""} ;
      T00F242_A5922XCjaCod = new long[1] ;
      T00F243_A396EmprCod = new String[] {""} ;
      T00F243_n396EmprCod = new boolean[] {false} ;
      T00F243_A129BarCod = new int[1] ;
      T00F243_n129BarCod = new boolean[] {false} ;
      T00F243_A132BarCodReo = new byte[1] ;
      T00F243_n132BarCodReo = new boolean[] {false} ;
      T00F243_A130BarCodPar = new String[] {""} ;
      T00F243_n130BarCodPar = new boolean[] {false} ;
      T00F243_A14152MEnvOrd = new short[1] ;
      T00F244_A396EmprCod = new String[] {""} ;
      T00F244_n396EmprCod = new boolean[] {false} ;
      T00F244_A129BarCod = new int[1] ;
      T00F244_n129BarCod = new boolean[] {false} ;
      T00F244_A132BarCodReo = new byte[1] ;
      T00F244_n132BarCodReo = new boolean[] {false} ;
      T00F244_A130BarCodPar = new String[] {""} ;
      T00F244_n130BarCodPar = new boolean[] {false} ;
      T00F244_A13905BarTraID = new String[] {""} ;
      T00F245_A396EmprCod = new String[] {""} ;
      T00F245_n396EmprCod = new boolean[] {false} ;
      T00F245_A129BarCod = new int[1] ;
      T00F245_n129BarCod = new boolean[] {false} ;
      T00F245_A132BarCodReo = new byte[1] ;
      T00F245_n132BarCodReo = new boolean[] {false} ;
      T00F245_A130BarCodPar = new String[] {""} ;
      T00F245_n130BarCodPar = new boolean[] {false} ;
      T00F245_A13093BarDGLin = new byte[1] ;
      T00F245_A13094BarDGDibCl = new String[] {""} ;
      T00F245_A13095BarDGDibIn = new int[1] ;
      T00F245_A13096BarDGComb = new String[] {""} ;
      T00F245_A13097BarDGFOndo = new String[] {""} ;
      T00F246_A396EmprCod = new String[] {""} ;
      T00F246_n396EmprCod = new boolean[] {false} ;
      T00F246_A11917Ebd_numero = new int[1] ;
      T00F247_A396EmprCod = new String[] {""} ;
      T00F247_n396EmprCod = new boolean[] {false} ;
      T00F247_A11898Prd_numero = new int[1] ;
      T00F248_A396EmprCod = new String[] {""} ;
      T00F248_n396EmprCod = new boolean[] {false} ;
      T00F248_A11849Cte_numero = new int[1] ;
      T00F249_A396EmprCod = new String[] {""} ;
      T00F249_n396EmprCod = new boolean[] {false} ;
      T00F249_A11791Ap_numero = new int[1] ;
      T00F250_A396EmprCod = new String[] {""} ;
      T00F250_n396EmprCod = new boolean[] {false} ;
      T00F250_A3985CalBarCod = new int[1] ;
      T00F250_A3986CalBarCodR = new byte[1] ;
      T00F250_A3987CalBarCodP = new String[] {""} ;
      T00F251_A396EmprCod = new String[] {""} ;
      T00F251_n396EmprCod = new boolean[] {false} ;
      T00F251_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T00F251_A652OpeCod = new int[1] ;
      T00F252_A396EmprCod = new String[] {""} ;
      T00F252_n396EmprCod = new boolean[] {false} ;
      T00F252_A129BarCod = new int[1] ;
      T00F252_n129BarCod = new boolean[] {false} ;
      T00F252_A132BarCodReo = new byte[1] ;
      T00F252_n132BarCodReo = new boolean[] {false} ;
      T00F252_A130BarCodPar = new String[] {""} ;
      T00F252_n130BarCodPar = new boolean[] {false} ;
      T00F252_A4118tinagrcod = new int[1] ;
      T00F252_A4119tinagrreo = new byte[1] ;
      T00F252_A4120tinagrpar = new String[] {""} ;
      T00F253_A396EmprCod = new String[] {""} ;
      T00F253_n396EmprCod = new boolean[] {false} ;
      T00F253_A129BarCod = new int[1] ;
      T00F253_n129BarCod = new boolean[] {false} ;
      T00F253_A132BarCodReo = new byte[1] ;
      T00F253_n132BarCodReo = new boolean[] {false} ;
      T00F253_A130BarCodPar = new String[] {""} ;
      T00F253_n130BarCodPar = new boolean[] {false} ;
      T00F253_A4080estagrcod = new int[1] ;
      T00F253_A4081estagrreo = new byte[1] ;
      T00F253_A4082estagrpar = new String[] {""} ;
      T00F254_A396EmprCod = new String[] {""} ;
      T00F254_n396EmprCod = new boolean[] {false} ;
      T00F254_A129BarCod = new int[1] ;
      T00F254_n129BarCod = new boolean[] {false} ;
      T00F254_A132BarCodReo = new byte[1] ;
      T00F254_n132BarCodReo = new boolean[] {false} ;
      T00F254_A130BarCodPar = new String[] {""} ;
      T00F254_n130BarCodPar = new boolean[] {false} ;
      T00F254_A4075recestncol = new byte[1] ;
      T00F254_A4076recestnpro = new byte[1] ;
      T00F255_A396EmprCod = new String[] {""} ;
      T00F255_n396EmprCod = new boolean[] {false} ;
      T00F255_A602MaqCod = new String[] {""} ;
      T00F255_n602MaqCod = new boolean[] {false} ;
      T00F255_A1142MaqFCod = new String[] {""} ;
      T00F255_A3068PlaEtaOrd = new short[1] ;
      T00F255_A3069PlaEtaOrdA = new byte[1] ;
      T00F255_A129BarCod = new int[1] ;
      T00F255_n129BarCod = new boolean[] {false} ;
      T00F255_A132BarCodReo = new byte[1] ;
      T00F255_n132BarCodReo = new boolean[] {false} ;
      T00F255_A130BarCodPar = new String[] {""} ;
      T00F255_n130BarCodPar = new boolean[] {false} ;
      T00F256_A396EmprCod = new String[] {""} ;
      T00F256_n396EmprCod = new boolean[] {false} ;
      T00F256_A129BarCod = new int[1] ;
      T00F256_n129BarCod = new boolean[] {false} ;
      T00F256_A132BarCodReo = new byte[1] ;
      T00F256_n132BarCodReo = new boolean[] {false} ;
      T00F256_A130BarCodPar = new String[] {""} ;
      T00F256_n130BarCodPar = new boolean[] {false} ;
      T00F256_A4846BarAudLin = new short[1] ;
      T00F257_A396EmprCod = new String[] {""} ;
      T00F257_n396EmprCod = new boolean[] {false} ;
      T00F257_A129BarCod = new int[1] ;
      T00F257_n129BarCod = new boolean[] {false} ;
      T00F257_A132BarCodReo = new byte[1] ;
      T00F257_n132BarCodReo = new boolean[] {false} ;
      T00F257_A130BarCodPar = new String[] {""} ;
      T00F257_n130BarCodPar = new boolean[] {false} ;
      T00F257_A3940BarEnsLin = new short[1] ;
      T00F258_A396EmprCod = new String[] {""} ;
      T00F258_n396EmprCod = new boolean[] {false} ;
      T00F258_A129BarCod = new int[1] ;
      T00F258_n129BarCod = new boolean[] {false} ;
      T00F258_A132BarCodReo = new byte[1] ;
      T00F258_n132BarCodReo = new boolean[] {false} ;
      T00F258_A130BarCodPar = new String[] {""} ;
      T00F258_n130BarCodPar = new boolean[] {false} ;
      T00F258_A3384RefBarCod = new int[1] ;
      T00F258_A3385RefBarReo = new byte[1] ;
      T00F258_A3386RefBarPar = new String[] {""} ;
      T00F259_A396EmprCod = new String[] {""} ;
      T00F259_n396EmprCod = new boolean[] {false} ;
      T00F259_A10914SolSalCod = new int[1] ;
      T00F260_A396EmprCod = new String[] {""} ;
      T00F260_n396EmprCod = new boolean[] {false} ;
      T00F260_A10364Ph_numero = new int[1] ;
      T00F261_A396EmprCod = new String[] {""} ;
      T00F261_n396EmprCod = new boolean[] {false} ;
      T00F261_A129BarCod = new int[1] ;
      T00F261_n129BarCod = new boolean[] {false} ;
      T00F261_A132BarCodReo = new byte[1] ;
      T00F261_n132BarCodReo = new boolean[] {false} ;
      T00F261_A130BarCodPar = new String[] {""} ;
      T00F261_n130BarCodPar = new boolean[] {false} ;
      T00F261_A10197ProEspCod = new String[] {""} ;
      T00F262_A396EmprCod = new String[] {""} ;
      T00F262_n396EmprCod = new boolean[] {false} ;
      T00F262_A129BarCod = new int[1] ;
      T00F262_n129BarCod = new boolean[] {false} ;
      T00F262_A132BarCodReo = new byte[1] ;
      T00F262_n132BarCodReo = new boolean[] {false} ;
      T00F262_A130BarCodPar = new String[] {""} ;
      T00F262_n130BarCodPar = new boolean[] {false} ;
      T00F262_A5322Dp_Nrecep = new int[1] ;
      T00F263_A396EmprCod = new String[] {""} ;
      T00F263_n396EmprCod = new boolean[] {false} ;
      T00F263_A129BarCod = new int[1] ;
      T00F263_n129BarCod = new boolean[] {false} ;
      T00F263_A132BarCodReo = new byte[1] ;
      T00F263_n132BarCodReo = new boolean[] {false} ;
      T00F263_A130BarCodPar = new String[] {""} ;
      T00F263_n130BarCodPar = new boolean[] {false} ;
      T00F263_A8569EntSecLn = new int[1] ;
      T00F264_A396EmprCod = new String[] {""} ;
      T00F264_n396EmprCod = new boolean[] {false} ;
      T00F264_A7434PLLNro = new int[1] ;
      T00F264_A7443LPLNro = new short[1] ;
      T00F264_A7459CPLCom = new short[1] ;
      T00F264_A129BarCod = new int[1] ;
      T00F264_n129BarCod = new boolean[] {false} ;
      T00F264_A132BarCodReo = new byte[1] ;
      T00F264_n132BarCodReo = new boolean[] {false} ;
      T00F264_A130BarCodPar = new String[] {""} ;
      T00F264_n130BarCodPar = new boolean[] {false} ;
      T00F265_A396EmprCod = new String[] {""} ;
      T00F265_n396EmprCod = new boolean[] {false} ;
      T00F265_A7145OSSCod = new int[1] ;
      T00F266_A396EmprCod = new String[] {""} ;
      T00F266_n396EmprCod = new boolean[] {false} ;
      T00F266_A7049OGSCod = new int[1] ;
      T00F267_A396EmprCod = new String[] {""} ;
      T00F267_n396EmprCod = new boolean[] {false} ;
      T00F267_A129BarCod = new int[1] ;
      T00F267_n129BarCod = new boolean[] {false} ;
      T00F267_A132BarCodReo = new byte[1] ;
      T00F267_n132BarCodReo = new boolean[] {false} ;
      T00F267_A130BarCodPar = new String[] {""} ;
      T00F267_n130BarCodPar = new boolean[] {false} ;
      T00F267_A6031Ac_Barcod = new int[1] ;
      T00F267_A6032Ac_BarReo = new byte[1] ;
      T00F267_A6033Ac_BarPar = new String[] {""} ;
      T00F268_A396EmprCod = new String[] {""} ;
      T00F268_n396EmprCod = new boolean[] {false} ;
      T00F268_A129BarCod = new int[1] ;
      T00F268_n129BarCod = new boolean[] {false} ;
      T00F268_A132BarCodReo = new byte[1] ;
      T00F268_n132BarCodReo = new boolean[] {false} ;
      T00F268_A130BarCodPar = new String[] {""} ;
      T00F268_n130BarCodPar = new boolean[] {false} ;
      T00F268_A5908PartPal = new int[1] ;
      T00F269_A396EmprCod = new String[] {""} ;
      T00F269_n396EmprCod = new boolean[] {false} ;
      T00F269_A129BarCod = new int[1] ;
      T00F269_n129BarCod = new boolean[] {false} ;
      T00F269_A132BarCodReo = new byte[1] ;
      T00F269_n132BarCodReo = new boolean[] {false} ;
      T00F269_A130BarCodPar = new String[] {""} ;
      T00F269_n130BarCodPar = new boolean[] {false} ;
      T00F269_A2524DisComLin = new byte[1] ;
      T00F269_A1056DisComCod = new String[] {""} ;
      T00F269_A1032FonCod = new String[] {""} ;
      T00F270_A396EmprCod = new String[] {""} ;
      T00F270_n396EmprCod = new boolean[] {false} ;
      T00F270_A1736AlbExtCod = new long[1] ;
      T00F270_A129BarCod = new int[1] ;
      T00F270_n129BarCod = new boolean[] {false} ;
      T00F270_A132BarCodReo = new byte[1] ;
      T00F270_n132BarCodReo = new boolean[] {false} ;
      T00F270_A130BarCodPar = new String[] {""} ;
      T00F270_n130BarCodPar = new boolean[] {false} ;
      T00F271_A396EmprCod = new String[] {""} ;
      T00F271_n396EmprCod = new boolean[] {false} ;
      T00F271_A129BarCod = new int[1] ;
      T00F271_n129BarCod = new boolean[] {false} ;
      T00F271_A132BarCodReo = new byte[1] ;
      T00F271_n132BarCodReo = new boolean[] {false} ;
      T00F271_A130BarCodPar = new String[] {""} ;
      T00F271_n130BarCodPar = new boolean[] {false} ;
      T00F271_A3753BarFoaCod = new int[1] ;
      T00F271_A3754BarFoaReo = new byte[1] ;
      T00F271_A3755BarFoaPar = new String[] {""} ;
      T00F272_A396EmprCod = new String[] {""} ;
      T00F272_n396EmprCod = new boolean[] {false} ;
      T00F272_A129BarCod = new int[1] ;
      T00F272_n129BarCod = new boolean[] {false} ;
      T00F272_A132BarCodReo = new byte[1] ;
      T00F272_n132BarCodReo = new boolean[] {false} ;
      T00F272_A130BarCodPar = new String[] {""} ;
      T00F272_n130BarCodPar = new boolean[] {false} ;
      T00F272_A3747BarPegCod = new int[1] ;
      T00F272_A3748BarPegReo = new byte[1] ;
      T00F272_A3749BarPegPar = new String[] {""} ;
      T00F273_A396EmprCod = new String[] {""} ;
      T00F273_n396EmprCod = new boolean[] {false} ;
      T00F273_A3253SolTraCod = new int[1] ;
      T00F274_A396EmprCod = new String[] {""} ;
      T00F274_n396EmprCod = new boolean[] {false} ;
      T00F274_A3235SolSubCod = new int[1] ;
      T00F275_A396EmprCod = new String[] {""} ;
      T00F275_n396EmprCod = new boolean[] {false} ;
      T00F275_A3218SolLuzCod = new int[1] ;
      T00F276_A396EmprCod = new String[] {""} ;
      T00F276_n396EmprCod = new boolean[] {false} ;
      T00F276_A3196SolFriCod = new int[1] ;
      T00F277_A396EmprCod = new String[] {""} ;
      T00F277_n396EmprCod = new boolean[] {false} ;
      T00F277_A3165SolPilCod = new int[1] ;
      T00F278_A396EmprCod = new String[] {""} ;
      T00F278_n396EmprCod = new boolean[] {false} ;
      T00F278_A129BarCod = new int[1] ;
      T00F278_n129BarCod = new boolean[] {false} ;
      T00F278_A132BarCodReo = new byte[1] ;
      T00F278_n132BarCodReo = new boolean[] {false} ;
      T00F278_A130BarCodPar = new String[] {""} ;
      T00F278_n130BarCodPar = new boolean[] {false} ;
      T00F278_A2872HAnRLinMaq = new short[1] ;
      T00F278_A2873HAnRLinPro = new byte[1] ;
      T00F278_A2874HAnRLin = new short[1] ;
      T00F278_A2875HAnNumAny = new byte[1] ;
      T00F279_A396EmprCod = new String[] {""} ;
      T00F279_n396EmprCod = new boolean[] {false} ;
      T00F279_A2817PlaTer = new String[] {""} ;
      T00F279_A2818PlaOrd = new short[1] ;
      T00F280_A396EmprCod = new String[] {""} ;
      T00F280_n396EmprCod = new boolean[] {false} ;
      T00F280_A2809MetTerCod = new String[] {""} ;
      T00F280_A129BarCod = new int[1] ;
      T00F280_n129BarCod = new boolean[] {false} ;
      T00F280_A132BarCodReo = new byte[1] ;
      T00F280_n132BarCodReo = new boolean[] {false} ;
      T00F280_A130BarCodPar = new String[] {""} ;
      T00F280_n130BarCodPar = new boolean[] {false} ;
      T00F281_A396EmprCod = new String[] {""} ;
      T00F281_n396EmprCod = new boolean[] {false} ;
      T00F281_A129BarCod = new int[1] ;
      T00F281_n129BarCod = new boolean[] {false} ;
      T00F281_A132BarCodReo = new byte[1] ;
      T00F281_n132BarCodReo = new boolean[] {false} ;
      T00F281_A130BarCodPar = new String[] {""} ;
      T00F281_n130BarCodPar = new boolean[] {false} ;
      T00F281_A2808RecLinMAL = new short[1] ;
      T00F281_A1377RecNumAny = new byte[1] ;
      T00F281_A719PrdNum = new String[] {""} ;
      T00F282_A396EmprCod = new String[] {""} ;
      T00F282_n396EmprCod = new boolean[] {false} ;
      T00F282_A129BarCod = new int[1] ;
      T00F282_n129BarCod = new boolean[] {false} ;
      T00F282_A132BarCodReo = new byte[1] ;
      T00F282_n132BarCodReo = new boolean[] {false} ;
      T00F282_A130BarCodPar = new String[] {""} ;
      T00F282_n130BarCodPar = new boolean[] {false} ;
      T00F282_A2804RecLinMaq = new short[1] ;
      T00F283_A396EmprCod = new String[] {""} ;
      T00F283_n396EmprCod = new boolean[] {false} ;
      T00F283_A2792TermiCod = new String[] {""} ;
      T00F283_A129BarCod = new int[1] ;
      T00F283_n129BarCod = new boolean[] {false} ;
      T00F283_A132BarCodReo = new byte[1] ;
      T00F283_n132BarCodReo = new boolean[] {false} ;
      T00F283_A130BarCodPar = new String[] {""} ;
      T00F283_n130BarCodPar = new boolean[] {false} ;
      T00F284_A396EmprCod = new String[] {""} ;
      T00F284_n396EmprCod = new boolean[] {false} ;
      T00F284_A2248ManCod = new short[1] ;
      T00F284_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T00F284_A2713RpExHdLi = new short[1] ;
      T00F285_A396EmprCod = new String[] {""} ;
      T00F285_n396EmprCod = new boolean[] {false} ;
      T00F285_A2248ManCod = new short[1] ;
      T00F285_A2689ExHdrFas = new String[] {""} ;
      T00F285_A2692ExHdrLin = new int[1] ;
      T00F286_A396EmprCod = new String[] {""} ;
      T00F286_n396EmprCod = new boolean[] {false} ;
      T00F286_A129BarCod = new int[1] ;
      T00F286_n129BarCod = new boolean[] {false} ;
      T00F286_A132BarCodReo = new byte[1] ;
      T00F286_n132BarCodReo = new boolean[] {false} ;
      T00F286_A130BarCodPar = new String[] {""} ;
      T00F286_n130BarCodPar = new boolean[] {false} ;
      T00F286_A2494BarDosPro = new String[] {""} ;
      T00F286_A719PrdNum = new String[] {""} ;
      T00F287_A396EmprCod = new String[] {""} ;
      T00F287_n396EmprCod = new boolean[] {false} ;
      T00F287_A602MaqCod = new String[] {""} ;
      T00F287_n602MaqCod = new boolean[] {false} ;
      T00F287_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00F287_A129BarCod = new int[1] ;
      T00F287_n129BarCod = new boolean[] {false} ;
      T00F287_A132BarCodReo = new byte[1] ;
      T00F287_n132BarCodReo = new boolean[] {false} ;
      T00F287_A130BarCodPar = new String[] {""} ;
      T00F287_n130BarCodPar = new boolean[] {false} ;
      T00F288_A396EmprCod = new String[] {""} ;
      T00F288_n396EmprCod = new boolean[] {false} ;
      T00F288_A129BarCod = new int[1] ;
      T00F288_n129BarCod = new boolean[] {false} ;
      T00F288_A132BarCodReo = new byte[1] ;
      T00F288_n132BarCodReo = new boolean[] {false} ;
      T00F288_A130BarCodPar = new String[] {""} ;
      T00F288_n130BarCodPar = new boolean[] {false} ;
      T00F288_A2457BarObLin = new short[1] ;
      T00F289_A396EmprCod = new String[] {""} ;
      T00F289_n396EmprCod = new boolean[] {false} ;
      T00F289_A129BarCod = new int[1] ;
      T00F289_n129BarCod = new boolean[] {false} ;
      T00F289_A132BarCodReo = new byte[1] ;
      T00F289_n132BarCodReo = new boolean[] {false} ;
      T00F289_A130BarCodPar = new String[] {""} ;
      T00F289_n130BarCodPar = new boolean[] {false} ;
      T00F289_A2444BarEnLin = new short[1] ;
      T00F290_A396EmprCod = new String[] {""} ;
      T00F290_n396EmprCod = new boolean[] {false} ;
      T00F290_A2406ExhAlbCod = new int[1] ;
      T00F290_A129BarCod = new int[1] ;
      T00F290_n129BarCod = new boolean[] {false} ;
      T00F290_A132BarCodReo = new byte[1] ;
      T00F290_n132BarCodReo = new boolean[] {false} ;
      T00F290_A130BarCodPar = new String[] {""} ;
      T00F290_n130BarCodPar = new boolean[] {false} ;
      T00F291_A396EmprCod = new String[] {""} ;
      T00F291_n396EmprCod = new boolean[] {false} ;
      T00F291_A2253SalExtAlb = new int[1] ;
      T00F291_A129BarCod = new int[1] ;
      T00F291_n129BarCod = new boolean[] {false} ;
      T00F291_A132BarCodReo = new byte[1] ;
      T00F291_n132BarCodReo = new boolean[] {false} ;
      T00F291_A130BarCodPar = new String[] {""} ;
      T00F291_n130BarCodPar = new boolean[] {false} ;
      T00F292_A396EmprCod = new String[] {""} ;
      T00F292_n396EmprCod = new boolean[] {false} ;
      T00F292_A30AlbProCod = new long[1] ;
      T00F292_A129BarCod = new int[1] ;
      T00F292_n129BarCod = new boolean[] {false} ;
      T00F292_A132BarCodReo = new byte[1] ;
      T00F292_n132BarCodReo = new boolean[] {false} ;
      T00F292_A130BarCodPar = new String[] {""} ;
      T00F292_n130BarCodPar = new boolean[] {false} ;
      T00F293_A396EmprCod = new String[] {""} ;
      T00F293_n396EmprCod = new boolean[] {false} ;
      T00F293_A1348SolColCod = new int[1] ;
      T00F294_A396EmprCod = new String[] {""} ;
      T00F294_n396EmprCod = new boolean[] {false} ;
      T00F294_A1333EstDimCod = new int[1] ;
      T00F295_A396EmprCod = new String[] {""} ;
      T00F295_n396EmprCod = new boolean[] {false} ;
      T00F295_A1314EnsLabCod = new int[1] ;
      T00F296_A396EmprCod = new String[] {""} ;
      T00F296_n396EmprCod = new boolean[] {false} ;
      T00F296_A129BarCod = new int[1] ;
      T00F296_n129BarCod = new boolean[] {false} ;
      T00F296_A132BarCodReo = new byte[1] ;
      T00F296_n132BarCodReo = new boolean[] {false} ;
      T00F296_A130BarCodPar = new String[] {""} ;
      T00F296_n130BarCodPar = new boolean[] {false} ;
      T00F296_A906ObsReoLin = new byte[1] ;
      T00F297_A396EmprCod = new String[] {""} ;
      T00F297_n396EmprCod = new boolean[] {false} ;
      T00F297_A859CumCodCont = new int[1] ;
      T00F298_A396EmprCod = new String[] {""} ;
      T00F298_n396EmprCod = new boolean[] {false} ;
      T00F298_A602MaqCod = new String[] {""} ;
      T00F298_n602MaqCod = new boolean[] {false} ;
      T00F298_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00F298_A561HisProLin = new int[1] ;
      T00F299_A396EmprCod = new String[] {""} ;
      T00F299_n396EmprCod = new boolean[] {false} ;
      T00F299_A252CliCod = new int[1] ;
      T00F299_n252CliCod = new boolean[] {false} ;
      T00F299_A494ForSer = new String[] {""} ;
      T00F299_A482ForColNom = new String[] {""} ;
      T00F299_A483ForColNum = new int[1] ;
      T00F299_A831TipColCod = new byte[1] ;
      T00F2100_A396EmprCod = new String[] {""} ;
      T00F2100_n396EmprCod = new boolean[] {false} ;
      T00F2100_A129BarCod = new int[1] ;
      T00F2100_n129BarCod = new boolean[] {false} ;
      T00F2100_A132BarCodReo = new byte[1] ;
      T00F2100_n132BarCodReo = new boolean[] {false} ;
      T00F2100_A130BarCodPar = new String[] {""} ;
      T00F2100_n130BarCodPar = new boolean[] {false} ;
      T00F2100_A200BarPieCod = new String[] {""} ;
      T00F2101_A396EmprCod = new String[] {""} ;
      T00F2101_n396EmprCod = new boolean[] {false} ;
      T00F2101_A129BarCod = new int[1] ;
      T00F2101_n129BarCod = new boolean[] {false} ;
      T00F2101_A132BarCodReo = new byte[1] ;
      T00F2101_n132BarCodReo = new boolean[] {false} ;
      T00F2101_A130BarCodPar = new String[] {""} ;
      T00F2101_n130BarCodPar = new boolean[] {false} ;
      T00F2101_A188BarNotLin = new byte[1] ;
      T00F2102_A396EmprCod = new String[] {""} ;
      T00F2102_n396EmprCod = new boolean[] {false} ;
      T00F2102_A129BarCod = new int[1] ;
      T00F2102_n129BarCod = new boolean[] {false} ;
      T00F2102_A132BarCodReo = new byte[1] ;
      T00F2102_n132BarCodReo = new boolean[] {false} ;
      T00F2102_A130BarCodPar = new String[] {""} ;
      T00F2102_n130BarCodPar = new boolean[] {false} ;
      T00F2102_A758ProCod = new String[] {""} ;
      T00F2102_n758ProCod = new boolean[] {false} ;
      T00F2103_A396EmprCod = new String[] {""} ;
      T00F2103_n396EmprCod = new boolean[] {false} ;
      T00F2103_A129BarCod = new int[1] ;
      T00F2103_n129BarCod = new boolean[] {false} ;
      T00F2103_A132BarCodReo = new byte[1] ;
      T00F2103_n132BarCodReo = new boolean[] {false} ;
      T00F2103_A130BarCodPar = new String[] {""} ;
      T00F2103_n130BarCodPar = new boolean[] {false} ;
      T00F2103_A119BarAgrCod = new int[1] ;
      T00F2103_A124BarAgrReo = new byte[1] ;
      T00F2103_A122BarAgrPar = new String[] {""} ;
      T00F2105_A396EmprCod = new String[] {""} ;
      T00F2105_n396EmprCod = new boolean[] {false} ;
      T00F2105_A129BarCod = new int[1] ;
      T00F2105_n129BarCod = new boolean[] {false} ;
      T00F2105_A132BarCodReo = new byte[1] ;
      T00F2105_n132BarCodReo = new boolean[] {false} ;
      T00F2105_A130BarCodPar = new String[] {""} ;
      T00F2105_n130BarCodPar = new boolean[] {false} ;
      Z759ProDsc = "" ;
      T00F2107_A129BarCod = new int[1] ;
      T00F2107_n129BarCod = new boolean[] {false} ;
      T00F2107_A132BarCodReo = new byte[1] ;
      T00F2107_n132BarCodReo = new boolean[] {false} ;
      T00F2107_A130BarCodPar = new String[] {""} ;
      T00F2107_n130BarCodPar = new boolean[] {false} ;
      T00F2107_A759ProDsc = new String[] {""} ;
      T00F2107_A761ProFasLin = new short[1] ;
      T00F2107_n761ProFasLin = new boolean[] {false} ;
      T00F2107_A396EmprCod = new String[] {""} ;
      T00F2107_n396EmprCod = new boolean[] {false} ;
      T00F2107_A758ProCod = new String[] {""} ;
      T00F2107_n758ProCod = new boolean[] {false} ;
      T00F2107_A760ProFasEst = new byte[1] ;
      T00F2107_n760ProFasEst = new boolean[] {false} ;
      T00F215_A759ProDsc = new String[] {""} ;
      T00F2108_A759ProDsc = new String[] {""} ;
      T00F2110_A760ProFasEst = new byte[1] ;
      T00F2110_n760ProFasEst = new boolean[] {false} ;
      T00F2111_A396EmprCod = new String[] {""} ;
      T00F2111_n396EmprCod = new boolean[] {false} ;
      T00F2111_A129BarCod = new int[1] ;
      T00F2111_n129BarCod = new boolean[] {false} ;
      T00F2111_A132BarCodReo = new byte[1] ;
      T00F2111_n132BarCodReo = new boolean[] {false} ;
      T00F2111_A130BarCodPar = new String[] {""} ;
      T00F2111_n130BarCodPar = new boolean[] {false} ;
      T00F2111_A758ProCod = new String[] {""} ;
      T00F2111_n758ProCod = new boolean[] {false} ;
      T00F214_A129BarCod = new int[1] ;
      T00F214_n129BarCod = new boolean[] {false} ;
      T00F214_A132BarCodReo = new byte[1] ;
      T00F214_n132BarCodReo = new boolean[] {false} ;
      T00F214_A130BarCodPar = new String[] {""} ;
      T00F214_n130BarCodPar = new boolean[] {false} ;
      T00F214_A761ProFasLin = new short[1] ;
      T00F214_n761ProFasLin = new boolean[] {false} ;
      T00F214_A396EmprCod = new String[] {""} ;
      T00F214_n396EmprCod = new boolean[] {false} ;
      T00F214_A758ProCod = new String[] {""} ;
      T00F214_n758ProCod = new boolean[] {false} ;
      T00F213_A129BarCod = new int[1] ;
      T00F213_n129BarCod = new boolean[] {false} ;
      T00F213_A132BarCodReo = new byte[1] ;
      T00F213_n132BarCodReo = new boolean[] {false} ;
      T00F213_A130BarCodPar = new String[] {""} ;
      T00F213_n130BarCodPar = new boolean[] {false} ;
      T00F213_A761ProFasLin = new short[1] ;
      T00F213_n761ProFasLin = new boolean[] {false} ;
      T00F213_A396EmprCod = new String[] {""} ;
      T00F213_n396EmprCod = new boolean[] {false} ;
      T00F213_A758ProCod = new String[] {""} ;
      T00F213_n758ProCod = new boolean[] {false} ;
      T00F2115_A759ProDsc = new String[] {""} ;
      T00F2117_A760ProFasEst = new byte[1] ;
      T00F2117_n760ProFasEst = new boolean[] {false} ;
      T00F2118_A396EmprCod = new String[] {""} ;
      T00F2118_n396EmprCod = new boolean[] {false} ;
      T00F2118_A30AlbProCod = new long[1] ;
      T00F2118_A129BarCod = new int[1] ;
      T00F2118_n129BarCod = new boolean[] {false} ;
      T00F2118_A132BarCodReo = new byte[1] ;
      T00F2118_n132BarCodReo = new boolean[] {false} ;
      T00F2118_A130BarCodPar = new String[] {""} ;
      T00F2118_n130BarCodPar = new boolean[] {false} ;
      T00F2118_A1468AlbPrdLin = new short[1] ;
      T00F2119_A396EmprCod = new String[] {""} ;
      T00F2119_n396EmprCod = new boolean[] {false} ;
      T00F2119_A129BarCod = new int[1] ;
      T00F2119_n129BarCod = new boolean[] {false} ;
      T00F2119_A132BarCodReo = new byte[1] ;
      T00F2119_n132BarCodReo = new boolean[] {false} ;
      T00F2119_A130BarCodPar = new String[] {""} ;
      T00F2119_n130BarCodPar = new boolean[] {false} ;
      T00F2119_A758ProCod = new String[] {""} ;
      T00F2119_n758ProCod = new boolean[] {false} ;
      T00F2119_A194BarOrdLin = new short[1] ;
      T00F2119_A1664ParFasCod = new short[1] ;
      T00F2120_A396EmprCod = new String[] {""} ;
      T00F2120_n396EmprCod = new boolean[] {false} ;
      T00F2120_A129BarCod = new int[1] ;
      T00F2120_n129BarCod = new boolean[] {false} ;
      T00F2120_A132BarCodReo = new byte[1] ;
      T00F2120_n132BarCodReo = new boolean[] {false} ;
      T00F2120_A130BarCodPar = new String[] {""} ;
      T00F2120_n130BarCodPar = new boolean[] {false} ;
      T00F2120_A758ProCod = new String[] {""} ;
      T00F2120_n758ProCod = new boolean[] {false} ;
      Z1785BarFasAnt = "" ;
      Z458FasCon = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      Z456FasActTin = "" ;
      T00F26_A1785BarFasAnt = new String[] {""} ;
      T00F26_n1785BarFasAnt = new boolean[] {false} ;
      T00F2123_A129BarCod = new int[1] ;
      T00F2123_n129BarCod = new boolean[] {false} ;
      T00F2123_A132BarCodReo = new byte[1] ;
      T00F2123_n132BarCodReo = new boolean[] {false} ;
      T00F2123_A130BarCodPar = new String[] {""} ;
      T00F2123_n130BarCodPar = new boolean[] {false} ;
      T00F2123_A758ProCod = new String[] {""} ;
      T00F2123_n758ProCod = new boolean[] {false} ;
      T00F2123_A194BarOrdLin = new short[1] ;
      T00F2123_A458FasCon = new String[] {""} ;
      T00F2123_n458FasCon = new boolean[] {false} ;
      T00F2123_A152BarFasCon = new String[] {""} ;
      T00F2123_A153BarFasEst = new byte[1] ;
      T00F2123_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2123_n459FasDec = new boolean[] {false} ;
      T00F2123_A602MaqCod = new String[] {""} ;
      T00F2123_n602MaqCod = new boolean[] {false} ;
      T00F2123_A456FasActTin = new String[] {""} ;
      T00F2123_n456FasActTin = new boolean[] {false} ;
      T00F2123_A150BarFacTin = new String[] {""} ;
      T00F2123_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00F2123_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00F2123_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2123_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2123_A179BarLoc = new String[] {""} ;
      T00F2123_A165BarHorIni = new short[1] ;
      T00F2123_A164BarHorFin = new short[1] ;
      T00F2123_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2123_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00F2123_A396EmprCod = new String[] {""} ;
      T00F2123_n396EmprCod = new boolean[] {false} ;
      T00F2123_A457FasCod = new String[] {""} ;
      T00F2123_A603MaqCodBis = new String[] {""} ;
      T00F2123_A1785BarFasAnt = new String[] {""} ;
      T00F2123_n1785BarFasAnt = new boolean[] {false} ;
      T00F27_A458FasCon = new String[] {""} ;
      T00F27_n458FasCon = new boolean[] {false} ;
      T00F27_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F27_n459FasDec = new boolean[] {false} ;
      T00F27_A602MaqCod = new String[] {""} ;
      T00F27_n602MaqCod = new boolean[] {false} ;
      T00F27_A456FasActTin = new String[] {""} ;
      T00F27_n456FasActTin = new boolean[] {false} ;
      T00F28_A396EmprCod = new String[] {""} ;
      T00F28_n396EmprCod = new boolean[] {false} ;
      T00F2124_A458FasCon = new String[] {""} ;
      T00F2124_n458FasCon = new boolean[] {false} ;
      T00F2124_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2124_n459FasDec = new boolean[] {false} ;
      T00F2124_A602MaqCod = new String[] {""} ;
      T00F2124_n602MaqCod = new boolean[] {false} ;
      T00F2124_A456FasActTin = new String[] {""} ;
      T00F2124_n456FasActTin = new boolean[] {false} ;
      T00F2125_A396EmprCod = new String[] {""} ;
      T00F2125_n396EmprCod = new boolean[] {false} ;
      T00F2126_A396EmprCod = new String[] {""} ;
      T00F2126_n396EmprCod = new boolean[] {false} ;
      T00F2126_A129BarCod = new int[1] ;
      T00F2126_n129BarCod = new boolean[] {false} ;
      T00F2126_A132BarCodReo = new byte[1] ;
      T00F2126_n132BarCodReo = new boolean[] {false} ;
      T00F2126_A130BarCodPar = new String[] {""} ;
      T00F2126_n130BarCodPar = new boolean[] {false} ;
      T00F2126_A758ProCod = new String[] {""} ;
      T00F2126_n758ProCod = new boolean[] {false} ;
      T00F2126_A194BarOrdLin = new short[1] ;
      T00F23_A129BarCod = new int[1] ;
      T00F23_n129BarCod = new boolean[] {false} ;
      T00F23_A132BarCodReo = new byte[1] ;
      T00F23_n132BarCodReo = new boolean[] {false} ;
      T00F23_A130BarCodPar = new String[] {""} ;
      T00F23_n130BarCodPar = new boolean[] {false} ;
      T00F23_A758ProCod = new String[] {""} ;
      T00F23_n758ProCod = new boolean[] {false} ;
      T00F23_A194BarOrdLin = new short[1] ;
      T00F23_A152BarFasCon = new String[] {""} ;
      T00F23_A153BarFasEst = new byte[1] ;
      T00F23_A150BarFacTin = new String[] {""} ;
      T00F23_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00F23_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00F23_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F23_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F23_A179BarLoc = new String[] {""} ;
      T00F23_A165BarHorIni = new short[1] ;
      T00F23_A164BarHorFin = new short[1] ;
      T00F23_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F23_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00F23_A396EmprCod = new String[] {""} ;
      T00F23_n396EmprCod = new boolean[] {false} ;
      T00F23_A457FasCod = new String[] {""} ;
      T00F23_A603MaqCodBis = new String[] {""} ;
      sMode15 = "" ;
      T00F22_A129BarCod = new int[1] ;
      T00F22_n129BarCod = new boolean[] {false} ;
      T00F22_A132BarCodReo = new byte[1] ;
      T00F22_n132BarCodReo = new boolean[] {false} ;
      T00F22_A130BarCodPar = new String[] {""} ;
      T00F22_n130BarCodPar = new boolean[] {false} ;
      T00F22_A758ProCod = new String[] {""} ;
      T00F22_n758ProCod = new boolean[] {false} ;
      T00F22_A194BarOrdLin = new short[1] ;
      T00F22_A152BarFasCon = new String[] {""} ;
      T00F22_A153BarFasEst = new byte[1] ;
      T00F22_A150BarFacTin = new String[] {""} ;
      T00F22_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00F22_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00F22_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F22_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F22_A179BarLoc = new String[] {""} ;
      T00F22_A165BarHorIni = new short[1] ;
      T00F22_A164BarHorFin = new short[1] ;
      T00F22_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F22_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00F22_A396EmprCod = new String[] {""} ;
      T00F22_n396EmprCod = new boolean[] {false} ;
      T00F22_A457FasCod = new String[] {""} ;
      T00F22_A603MaqCodBis = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      T00F2130_A458FasCon = new String[] {""} ;
      T00F2130_n458FasCon = new boolean[] {false} ;
      T00F2130_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00F2130_n459FasDec = new boolean[] {false} ;
      T00F2130_A602MaqCod = new String[] {""} ;
      T00F2130_n602MaqCod = new boolean[] {false} ;
      T00F2130_A456FasActTin = new String[] {""} ;
      T00F2130_n456FasActTin = new boolean[] {false} ;
      T00F2131_A396EmprCod = new String[] {""} ;
      T00F2131_n396EmprCod = new boolean[] {false} ;
      T00F2131_A129BarCod = new int[1] ;
      T00F2131_n129BarCod = new boolean[] {false} ;
      T00F2131_A132BarCodReo = new byte[1] ;
      T00F2131_n132BarCodReo = new boolean[] {false} ;
      T00F2131_A130BarCodPar = new String[] {""} ;
      T00F2131_n130BarCodPar = new boolean[] {false} ;
      T00F2131_A758ProCod = new String[] {""} ;
      T00F2131_n758ProCod = new boolean[] {false} ;
      T00F2131_A194BarOrdLin = new short[1] ;
      T00F2131_A12517SolAfLn = new short[1] ;
      T00F2132_A396EmprCod = new String[] {""} ;
      T00F2132_n396EmprCod = new boolean[] {false} ;
      T00F2132_A129BarCod = new int[1] ;
      T00F2132_n129BarCod = new boolean[] {false} ;
      T00F2132_A132BarCodReo = new byte[1] ;
      T00F2132_n132BarCodReo = new boolean[] {false} ;
      T00F2132_A130BarCodPar = new String[] {""} ;
      T00F2132_n130BarCodPar = new boolean[] {false} ;
      T00F2132_A758ProCod = new String[] {""} ;
      T00F2132_n758ProCod = new boolean[] {false} ;
      T00F2132_A194BarOrdLin = new short[1] ;
      T00F2132_A12516SolLzLn = new short[1] ;
      T00F2133_A396EmprCod = new String[] {""} ;
      T00F2133_n396EmprCod = new boolean[] {false} ;
      T00F2133_A129BarCod = new int[1] ;
      T00F2133_n129BarCod = new boolean[] {false} ;
      T00F2133_A132BarCodReo = new byte[1] ;
      T00F2133_n132BarCodReo = new boolean[] {false} ;
      T00F2133_A130BarCodPar = new String[] {""} ;
      T00F2133_n130BarCodPar = new boolean[] {false} ;
      T00F2133_A758ProCod = new String[] {""} ;
      T00F2133_n758ProCod = new boolean[] {false} ;
      T00F2133_A194BarOrdLin = new short[1] ;
      T00F2133_A12515SolPlLn = new short[1] ;
      T00F2134_A396EmprCod = new String[] {""} ;
      T00F2134_n396EmprCod = new boolean[] {false} ;
      T00F2134_A129BarCod = new int[1] ;
      T00F2134_n129BarCod = new boolean[] {false} ;
      T00F2134_A132BarCodReo = new byte[1] ;
      T00F2134_n132BarCodReo = new boolean[] {false} ;
      T00F2134_A130BarCodPar = new String[] {""} ;
      T00F2134_n130BarCodPar = new boolean[] {false} ;
      T00F2134_A758ProCod = new String[] {""} ;
      T00F2134_n758ProCod = new boolean[] {false} ;
      T00F2134_A194BarOrdLin = new short[1] ;
      T00F2134_A12514SolSAlLn = new short[1] ;
      T00F2135_A396EmprCod = new String[] {""} ;
      T00F2135_n396EmprCod = new boolean[] {false} ;
      T00F2135_A129BarCod = new int[1] ;
      T00F2135_n129BarCod = new boolean[] {false} ;
      T00F2135_A132BarCodReo = new byte[1] ;
      T00F2135_n132BarCodReo = new boolean[] {false} ;
      T00F2135_A130BarCodPar = new String[] {""} ;
      T00F2135_n130BarCodPar = new boolean[] {false} ;
      T00F2135_A758ProCod = new String[] {""} ;
      T00F2135_n758ProCod = new boolean[] {false} ;
      T00F2135_A194BarOrdLin = new short[1] ;
      T00F2135_A12513SolSAcLn = new short[1] ;
      T00F2136_A396EmprCod = new String[] {""} ;
      T00F2136_n396EmprCod = new boolean[] {false} ;
      T00F2136_A129BarCod = new int[1] ;
      T00F2136_n129BarCod = new boolean[] {false} ;
      T00F2136_A132BarCodReo = new byte[1] ;
      T00F2136_n132BarCodReo = new boolean[] {false} ;
      T00F2136_A130BarCodPar = new String[] {""} ;
      T00F2136_n130BarCodPar = new boolean[] {false} ;
      T00F2136_A758ProCod = new String[] {""} ;
      T00F2136_n758ProCod = new boolean[] {false} ;
      T00F2136_A194BarOrdLin = new short[1] ;
      T00F2136_A12512SolFrLn = new short[1] ;
      T00F2137_A396EmprCod = new String[] {""} ;
      T00F2137_n396EmprCod = new boolean[] {false} ;
      T00F2137_A129BarCod = new int[1] ;
      T00F2137_n129BarCod = new boolean[] {false} ;
      T00F2137_A132BarCodReo = new byte[1] ;
      T00F2137_n132BarCodReo = new boolean[] {false} ;
      T00F2137_A130BarCodPar = new String[] {""} ;
      T00F2137_n130BarCodPar = new boolean[] {false} ;
      T00F2137_A758ProCod = new String[] {""} ;
      T00F2137_n758ProCod = new boolean[] {false} ;
      T00F2137_A194BarOrdLin = new short[1] ;
      T00F2137_A12511SolAgLn = new short[1] ;
      T00F2138_A396EmprCod = new String[] {""} ;
      T00F2138_n396EmprCod = new boolean[] {false} ;
      T00F2138_A129BarCod = new int[1] ;
      T00F2138_n129BarCod = new boolean[] {false} ;
      T00F2138_A132BarCodReo = new byte[1] ;
      T00F2138_n132BarCodReo = new boolean[] {false} ;
      T00F2138_A130BarCodPar = new String[] {""} ;
      T00F2138_n130BarCodPar = new boolean[] {false} ;
      T00F2138_A758ProCod = new String[] {""} ;
      T00F2138_n758ProCod = new boolean[] {false} ;
      T00F2138_A194BarOrdLin = new short[1] ;
      T00F2138_A12510SolLvLn = new short[1] ;
      T00F2139_A396EmprCod = new String[] {""} ;
      T00F2139_n396EmprCod = new boolean[] {false} ;
      T00F2139_A129BarCod = new int[1] ;
      T00F2139_n129BarCod = new boolean[] {false} ;
      T00F2139_A132BarCodReo = new byte[1] ;
      T00F2139_n132BarCodReo = new boolean[] {false} ;
      T00F2139_A130BarCodPar = new String[] {""} ;
      T00F2139_n130BarCodPar = new boolean[] {false} ;
      T00F2139_A758ProCod = new String[] {""} ;
      T00F2139_n758ProCod = new boolean[] {false} ;
      T00F2139_A194BarOrdLin = new short[1] ;
      T00F2139_A10781BarFasNb = new int[1] ;
      T00F2140_A396EmprCod = new String[] {""} ;
      T00F2140_n396EmprCod = new boolean[] {false} ;
      T00F2140_A129BarCod = new int[1] ;
      T00F2140_n129BarCod = new boolean[] {false} ;
      T00F2140_A132BarCodReo = new byte[1] ;
      T00F2140_n132BarCodReo = new boolean[] {false} ;
      T00F2140_A130BarCodPar = new String[] {""} ;
      T00F2140_n130BarCodPar = new boolean[] {false} ;
      T00F2140_A758ProCod = new String[] {""} ;
      T00F2140_n758ProCod = new boolean[] {false} ;
      T00F2140_A194BarOrdLin = new short[1] ;
      T00F2140_A719PrdNum = new String[] {""} ;
      T00F2141_A396EmprCod = new String[] {""} ;
      T00F2141_n396EmprCod = new boolean[] {false} ;
      T00F2141_A129BarCod = new int[1] ;
      T00F2141_n129BarCod = new boolean[] {false} ;
      T00F2141_A132BarCodReo = new byte[1] ;
      T00F2141_n132BarCodReo = new boolean[] {false} ;
      T00F2141_A130BarCodPar = new String[] {""} ;
      T00F2141_n130BarCodPar = new boolean[] {false} ;
      T00F2141_A758ProCod = new String[] {""} ;
      T00F2141_n758ProCod = new boolean[] {false} ;
      T00F2141_A194BarOrdLin = new short[1] ;
      T00F2141_A9966Em_cod = new String[] {""} ;
      T00F2142_A396EmprCod = new String[] {""} ;
      T00F2142_n396EmprCod = new boolean[] {false} ;
      T00F2142_A129BarCod = new int[1] ;
      T00F2142_n129BarCod = new boolean[] {false} ;
      T00F2142_A132BarCodReo = new byte[1] ;
      T00F2142_n132BarCodReo = new boolean[] {false} ;
      T00F2142_A130BarCodPar = new String[] {""} ;
      T00F2142_n130BarCodPar = new boolean[] {false} ;
      T00F2142_A758ProCod = new String[] {""} ;
      T00F2142_n758ProCod = new boolean[] {false} ;
      T00F2142_A194BarOrdLin = new short[1] ;
      T00F2142_A9940Ab_cod = new String[] {""} ;
      T00F2143_A396EmprCod = new String[] {""} ;
      T00F2143_n396EmprCod = new boolean[] {false} ;
      T00F2143_A129BarCod = new int[1] ;
      T00F2143_n129BarCod = new boolean[] {false} ;
      T00F2143_A132BarCodReo = new byte[1] ;
      T00F2143_n132BarCodReo = new boolean[] {false} ;
      T00F2143_A130BarCodPar = new String[] {""} ;
      T00F2143_n130BarCodPar = new boolean[] {false} ;
      T00F2143_A758ProCod = new String[] {""} ;
      T00F2143_n758ProCod = new boolean[] {false} ;
      T00F2143_A194BarOrdLin = new short[1] ;
      T00F2143_A9911Ca_cod = new String[] {""} ;
      T00F2144_A396EmprCod = new String[] {""} ;
      T00F2144_n396EmprCod = new boolean[] {false} ;
      T00F2144_A129BarCod = new int[1] ;
      T00F2144_n129BarCod = new boolean[] {false} ;
      T00F2144_A132BarCodReo = new byte[1] ;
      T00F2144_n132BarCodReo = new boolean[] {false} ;
      T00F2144_A130BarCodPar = new String[] {""} ;
      T00F2144_n130BarCodPar = new boolean[] {false} ;
      T00F2144_A758ProCod = new String[] {""} ;
      T00F2144_n758ProCod = new boolean[] {false} ;
      T00F2144_A194BarOrdLin = new short[1] ;
      T00F2144_A9878Pe_cod = new String[] {""} ;
      T00F2145_A396EmprCod = new String[] {""} ;
      T00F2145_n396EmprCod = new boolean[] {false} ;
      T00F2145_A129BarCod = new int[1] ;
      T00F2145_n129BarCod = new boolean[] {false} ;
      T00F2145_A132BarCodReo = new byte[1] ;
      T00F2145_n132BarCodReo = new boolean[] {false} ;
      T00F2145_A130BarCodPar = new String[] {""} ;
      T00F2145_n130BarCodPar = new boolean[] {false} ;
      T00F2145_A758ProCod = new String[] {""} ;
      T00F2145_n758ProCod = new boolean[] {false} ;
      T00F2145_A194BarOrdLin = new short[1] ;
      T00F2145_A9870Rm_cod = new String[] {""} ;
      T00F2146_A396EmprCod = new String[] {""} ;
      T00F2146_n396EmprCod = new boolean[] {false} ;
      T00F2146_A129BarCod = new int[1] ;
      T00F2146_n129BarCod = new boolean[] {false} ;
      T00F2146_A132BarCodReo = new byte[1] ;
      T00F2146_n132BarCodReo = new boolean[] {false} ;
      T00F2146_A130BarCodPar = new String[] {""} ;
      T00F2146_n130BarCodPar = new boolean[] {false} ;
      T00F2146_A758ProCod = new String[] {""} ;
      T00F2146_n758ProCod = new boolean[] {false} ;
      T00F2146_A194BarOrdLin = new short[1] ;
      T00F2146_A7934Dtb_Ordl = new short[1] ;
      T00F2147_A396EmprCod = new String[] {""} ;
      T00F2147_n396EmprCod = new boolean[] {false} ;
      T00F2147_A129BarCod = new int[1] ;
      T00F2147_n129BarCod = new boolean[] {false} ;
      T00F2147_A132BarCodReo = new byte[1] ;
      T00F2147_n132BarCodReo = new boolean[] {false} ;
      T00F2147_A130BarCodPar = new String[] {""} ;
      T00F2147_n130BarCodPar = new boolean[] {false} ;
      T00F2147_A758ProCod = new String[] {""} ;
      T00F2147_n758ProCod = new boolean[] {false} ;
      T00F2147_A194BarOrdLin = new short[1] ;
      T00F2147_A5371FasQuiLin = new short[1] ;
      T00F2148_A396EmprCod = new String[] {""} ;
      T00F2148_n396EmprCod = new boolean[] {false} ;
      T00F2148_A129BarCod = new int[1] ;
      T00F2148_n129BarCod = new boolean[] {false} ;
      T00F2148_A132BarCodReo = new byte[1] ;
      T00F2148_n132BarCodReo = new boolean[] {false} ;
      T00F2148_A130BarCodPar = new String[] {""} ;
      T00F2148_n130BarCodPar = new boolean[] {false} ;
      T00F2148_A758ProCod = new String[] {""} ;
      T00F2148_n758ProCod = new boolean[] {false} ;
      T00F2148_A194BarOrdLin = new short[1] ;
      T00F2148_A4940A_Barcod = new int[1] ;
      T00F2148_A4941A_BarReo = new byte[1] ;
      T00F2148_A4942A_BarPar = new String[] {""} ;
      T00F2148_A4943A_ProCod = new String[] {""} ;
      T00F2148_A4944A_BarOrd = new short[1] ;
      T00F2149_A396EmprCod = new String[] {""} ;
      T00F2149_n396EmprCod = new boolean[] {false} ;
      T00F2149_A129BarCod = new int[1] ;
      T00F2149_n129BarCod = new boolean[] {false} ;
      T00F2149_A132BarCodReo = new byte[1] ;
      T00F2149_n132BarCodReo = new boolean[] {false} ;
      T00F2149_A130BarCodPar = new String[] {""} ;
      T00F2149_n130BarCodPar = new boolean[] {false} ;
      T00F2149_A758ProCod = new String[] {""} ;
      T00F2149_n758ProCod = new boolean[] {false} ;
      T00F2149_A194BarOrdLin = new short[1] ;
      T00F2149_A4643BarFasLot = new int[1] ;
      T00F2150_A396EmprCod = new String[] {""} ;
      T00F2150_n396EmprCod = new boolean[] {false} ;
      T00F2150_A129BarCod = new int[1] ;
      T00F2150_n129BarCod = new boolean[] {false} ;
      T00F2150_A132BarCodReo = new byte[1] ;
      T00F2150_n132BarCodReo = new boolean[] {false} ;
      T00F2150_A130BarCodPar = new String[] {""} ;
      T00F2150_n130BarCodPar = new boolean[] {false} ;
      T00F2150_A758ProCod = new String[] {""} ;
      T00F2150_n758ProCod = new boolean[] {false} ;
      T00F2150_A194BarOrdLin = new short[1] ;
      T00F2150_A4031CCTCod = new int[1] ;
      T00F2151_A396EmprCod = new String[] {""} ;
      T00F2151_n396EmprCod = new boolean[] {false} ;
      T00F2151_A129BarCod = new int[1] ;
      T00F2151_n129BarCod = new boolean[] {false} ;
      T00F2151_A132BarCodReo = new byte[1] ;
      T00F2151_n132BarCodReo = new boolean[] {false} ;
      T00F2151_A130BarCodPar = new String[] {""} ;
      T00F2151_n130BarCodPar = new boolean[] {false} ;
      T00F2151_A758ProCod = new String[] {""} ;
      T00F2151_n758ProCod = new boolean[] {false} ;
      T00F2151_A194BarOrdLin = new short[1] ;
      T00F2151_A1664ParFasCod = new short[1] ;
      T00F2152_A396EmprCod = new String[] {""} ;
      T00F2152_n396EmprCod = new boolean[] {false} ;
      T00F2152_A129BarCod = new int[1] ;
      T00F2152_n129BarCod = new boolean[] {false} ;
      T00F2152_A132BarCodReo = new byte[1] ;
      T00F2152_n132BarCodReo = new boolean[] {false} ;
      T00F2152_A130BarCodPar = new String[] {""} ;
      T00F2152_n130BarCodPar = new boolean[] {false} ;
      T00F2152_A758ProCod = new String[] {""} ;
      T00F2152_n758ProCod = new boolean[] {false} ;
      T00F2152_A194BarOrdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock15_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ135BarColNom = "" ;
      ZZ212BarSer = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      ZZ279CliNom = "" ;
      T00F2153_A396EmprCod = new String[] {""} ;
      T00F2153_n396EmprCod = new boolean[] {false} ;
      T00F2154_A396EmprCod = new String[] {""} ;
      T00F2154_n396EmprCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaslec__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaslec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaslec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaslec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaslec__default(),
         new Object[] {
             new Object[] {
            T00F22_A129BarCod, T00F22_A132BarCodReo, T00F22_A130BarCodPar, T00F22_A758ProCod, T00F22_A194BarOrdLin, T00F22_A152BarFasCon, T00F22_A153BarFasEst, T00F22_A150BarFacTin, T00F22_A162BarFecTeo, T00F22_A160BarFecRea,
            T00F22_A216BarTieTeo, T00F22_A227BarUni, T00F22_A179BarLoc, T00F22_A165BarHorIni, T00F22_A164BarHorFin, T00F22_A215BarTieRea, T00F22_A3298BarFecRIni, T00F22_A396EmprCod, T00F22_A457FasCod, T00F22_A603MaqCodBis
            }
            , new Object[] {
            T00F23_A129BarCod, T00F23_A132BarCodReo, T00F23_A130BarCodPar, T00F23_A758ProCod, T00F23_A194BarOrdLin, T00F23_A152BarFasCon, T00F23_A153BarFasEst, T00F23_A150BarFacTin, T00F23_A162BarFecTeo, T00F23_A160BarFecRea,
            T00F23_A216BarTieTeo, T00F23_A227BarUni, T00F23_A179BarLoc, T00F23_A165BarHorIni, T00F23_A164BarHorFin, T00F23_A215BarTieRea, T00F23_A3298BarFecRIni, T00F23_A396EmprCod, T00F23_A457FasCod, T00F23_A603MaqCodBis
            }
            , new Object[] {
            T00F26_A1785BarFasAnt, T00F26_n1785BarFasAnt
            }
            , new Object[] {
            T00F27_A458FasCon, T00F27_n458FasCon, T00F27_A459FasDec, T00F27_n459FasDec, T00F27_A602MaqCod, T00F27_n602MaqCod, T00F27_A456FasActTin, T00F27_n456FasActTin
            }
            , new Object[] {
            T00F28_A396EmprCod
            }
            , new Object[] {
            T00F210_A628MaxOrdFas, T00F210_n628MaxOrdFas
            }
            , new Object[] {
            T00F212_A760ProFasEst, T00F212_n760ProFasEst
            }
            , new Object[] {
            T00F213_A129BarCod, T00F213_A132BarCodReo, T00F213_A130BarCodPar, T00F213_A761ProFasLin, T00F213_n761ProFasLin, T00F213_A396EmprCod, T00F213_A758ProCod
            }
            , new Object[] {
            T00F214_A129BarCod, T00F214_A132BarCodReo, T00F214_A130BarCodPar, T00F214_A761ProFasLin, T00F214_n761ProFasLin, T00F214_A396EmprCod, T00F214_A758ProCod
            }
            , new Object[] {
            T00F215_A759ProDsc
            }
            , new Object[] {
            T00F216_A361DisCod, T00F216_A2759BarMaqGru, T00F216_A129BarCod, T00F216_A132BarCodReo, T00F216_A130BarCodPar, T00F216_A180BarMaqCod, T00F216_A135BarColNom, T00F216_A136BarColNum, T00F216_A212BarSer, T00F216_A213BarSit,
            T00F216_A120BarAgrEst, T00F216_A396EmprCod, T00F216_A217BarTipArt, T00F216_n217BarTipArt, T00F216_A252CliCod, T00F216_n252CliCod, T00F216_A365DisDes
            }
            , new Object[] {
            T00F217_A361DisCod, T00F217_A2759BarMaqGru, T00F217_A129BarCod, T00F217_A132BarCodReo, T00F217_A130BarCodPar, T00F217_A180BarMaqCod, T00F217_A135BarColNom, T00F217_A136BarColNum, T00F217_A212BarSer, T00F217_A213BarSit,
            T00F217_A120BarAgrEst, T00F217_A396EmprCod, T00F217_A217BarTipArt, T00F217_n217BarTipArt, T00F217_A252CliCod, T00F217_n252CliCod, T00F217_A365DisDes
            }
            , new Object[] {
            T00F218_A407EmprNom, T00F218_n407EmprNom
            }
            , new Object[] {
            T00F219_A252CliCod, T00F219_A365DisDes
            }
            , new Object[] {
            T00F220_A396EmprCod
            }
            , new Object[] {
            T00F221_A279CliNom
            }
            , new Object[] {
            T00F223_A361DisCod, T00F223_A2759BarMaqGru, T00F223_A129BarCod, T00F223_A132BarCodReo, T00F223_A130BarCodPar, T00F223_A180BarMaqCod, T00F223_A252CliCod, T00F223_n252CliCod, T00F223_A279CliNom, T00F223_A135BarColNom,
            T00F223_A136BarColNum, T00F223_A212BarSer, T00F223_A213BarSit, T00F223_A120BarAgrEst, T00F223_A407EmprNom, T00F223_n407EmprNom, T00F223_A365DisDes, T00F223_A396EmprCod, T00F223_A217BarTipArt, T00F223_n217BarTipArt,
            T00F223_A628MaxOrdFas, T00F223_n628MaxOrdFas
            }
            , new Object[] {
            T00F224_A407EmprNom, T00F224_n407EmprNom
            }
            , new Object[] {
            T00F225_A252CliCod, T00F225_A365DisDes
            }
            , new Object[] {
            T00F226_A396EmprCod
            }
            , new Object[] {
            T00F227_A279CliNom
            }
            , new Object[] {
            T00F229_A628MaxOrdFas, T00F229_n628MaxOrdFas
            }
            , new Object[] {
            T00F230_A396EmprCod, T00F230_A129BarCod, T00F230_A132BarCodReo, T00F230_A130BarCodPar
            }
            , new Object[] {
            T00F231_A396EmprCod, T00F231_A129BarCod, T00F231_A132BarCodReo, T00F231_A130BarCodPar
            }
            , new Object[] {
            T00F232_A396EmprCod, T00F232_A129BarCod, T00F232_A132BarCodReo, T00F232_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00F236_A407EmprNom, T00F236_n407EmprNom
            }
            , new Object[] {
            T00F238_A628MaxOrdFas, T00F238_n628MaxOrdFas
            }
            , new Object[] {
            T00F239_A252CliCod, T00F239_A365DisDes
            }
            , new Object[] {
            T00F240_A279CliNom
            }
            , new Object[] {
            T00F241_A14681MRPrId
            }
            , new Object[] {
            T00F242_A5921XCjaDis, T00F242_A5922XCjaCod
            }
            , new Object[] {
            T00F243_A396EmprCod, T00F243_A129BarCod, T00F243_A132BarCodReo, T00F243_A130BarCodPar, T00F243_A14152MEnvOrd
            }
            , new Object[] {
            T00F244_A396EmprCod, T00F244_A129BarCod, T00F244_A132BarCodReo, T00F244_A130BarCodPar, T00F244_A13905BarTraID
            }
            , new Object[] {
            T00F245_A396EmprCod, T00F245_A129BarCod, T00F245_A132BarCodReo, T00F245_A130BarCodPar, T00F245_A13093BarDGLin, T00F245_A13094BarDGDibCl, T00F245_A13095BarDGDibIn, T00F245_A13096BarDGComb, T00F245_A13097BarDGFOndo
            }
            , new Object[] {
            T00F246_A396EmprCod, T00F246_A11917Ebd_numero
            }
            , new Object[] {
            T00F247_A396EmprCod, T00F247_A11898Prd_numero
            }
            , new Object[] {
            T00F248_A396EmprCod, T00F248_A11849Cte_numero
            }
            , new Object[] {
            T00F249_A396EmprCod, T00F249_A11791Ap_numero
            }
            , new Object[] {
            T00F250_A396EmprCod, T00F250_A3985CalBarCod, T00F250_A3986CalBarCodR, T00F250_A3987CalBarCodP
            }
            , new Object[] {
            T00F251_A396EmprCod, T00F251_A5294InPTime, T00F251_A652OpeCod
            }
            , new Object[] {
            T00F252_A396EmprCod, T00F252_A129BarCod, T00F252_A132BarCodReo, T00F252_A130BarCodPar, T00F252_A4118tinagrcod, T00F252_A4119tinagrreo, T00F252_A4120tinagrpar
            }
            , new Object[] {
            T00F253_A396EmprCod, T00F253_A129BarCod, T00F253_A132BarCodReo, T00F253_A130BarCodPar, T00F253_A4080estagrcod, T00F253_A4081estagrreo, T00F253_A4082estagrpar
            }
            , new Object[] {
            T00F254_A396EmprCod, T00F254_A129BarCod, T00F254_A132BarCodReo, T00F254_A130BarCodPar, T00F254_A4075recestncol, T00F254_A4076recestnpro
            }
            , new Object[] {
            T00F255_A396EmprCod, T00F255_A602MaqCod, T00F255_A1142MaqFCod, T00F255_A3068PlaEtaOrd, T00F255_A3069PlaEtaOrdA, T00F255_A129BarCod, T00F255_A132BarCodReo, T00F255_A130BarCodPar
            }
            , new Object[] {
            T00F256_A396EmprCod, T00F256_A129BarCod, T00F256_A132BarCodReo, T00F256_A130BarCodPar, T00F256_A4846BarAudLin
            }
            , new Object[] {
            T00F257_A396EmprCod, T00F257_A129BarCod, T00F257_A132BarCodReo, T00F257_A130BarCodPar, T00F257_A3940BarEnsLin
            }
            , new Object[] {
            T00F258_A396EmprCod, T00F258_A129BarCod, T00F258_A132BarCodReo, T00F258_A130BarCodPar, T00F258_A3384RefBarCod, T00F258_A3385RefBarReo, T00F258_A3386RefBarPar
            }
            , new Object[] {
            T00F259_A396EmprCod, T00F259_A10914SolSalCod
            }
            , new Object[] {
            T00F260_A396EmprCod, T00F260_A10364Ph_numero
            }
            , new Object[] {
            T00F261_A396EmprCod, T00F261_A129BarCod, T00F261_A132BarCodReo, T00F261_A130BarCodPar, T00F261_A10197ProEspCod
            }
            , new Object[] {
            T00F262_A396EmprCod, T00F262_A129BarCod, T00F262_A132BarCodReo, T00F262_A130BarCodPar, T00F262_A5322Dp_Nrecep
            }
            , new Object[] {
            T00F263_A396EmprCod, T00F263_A129BarCod, T00F263_A132BarCodReo, T00F263_A130BarCodPar, T00F263_A8569EntSecLn
            }
            , new Object[] {
            T00F264_A396EmprCod, T00F264_A7434PLLNro, T00F264_A7443LPLNro, T00F264_A7459CPLCom, T00F264_A129BarCod, T00F264_A132BarCodReo, T00F264_A130BarCodPar
            }
            , new Object[] {
            T00F265_A396EmprCod, T00F265_A7145OSSCod
            }
            , new Object[] {
            T00F266_A396EmprCod, T00F266_A7049OGSCod
            }
            , new Object[] {
            T00F267_A396EmprCod, T00F267_A129BarCod, T00F267_A132BarCodReo, T00F267_A130BarCodPar, T00F267_A6031Ac_Barcod, T00F267_A6032Ac_BarReo, T00F267_A6033Ac_BarPar
            }
            , new Object[] {
            T00F268_A396EmprCod, T00F268_A129BarCod, T00F268_A132BarCodReo, T00F268_A130BarCodPar, T00F268_A5908PartPal
            }
            , new Object[] {
            T00F269_A396EmprCod, T00F269_A129BarCod, T00F269_A132BarCodReo, T00F269_A130BarCodPar, T00F269_A2524DisComLin, T00F269_A1056DisComCod, T00F269_A1032FonCod
            }
            , new Object[] {
            T00F270_A396EmprCod, T00F270_A1736AlbExtCod, T00F270_A129BarCod, T00F270_A132BarCodReo, T00F270_A130BarCodPar
            }
            , new Object[] {
            T00F271_A396EmprCod, T00F271_A129BarCod, T00F271_A132BarCodReo, T00F271_A130BarCodPar, T00F271_A3753BarFoaCod, T00F271_A3754BarFoaReo, T00F271_A3755BarFoaPar
            }
            , new Object[] {
            T00F272_A396EmprCod, T00F272_A129BarCod, T00F272_A132BarCodReo, T00F272_A130BarCodPar, T00F272_A3747BarPegCod, T00F272_A3748BarPegReo, T00F272_A3749BarPegPar
            }
            , new Object[] {
            T00F273_A396EmprCod, T00F273_A3253SolTraCod
            }
            , new Object[] {
            T00F274_A396EmprCod, T00F274_A3235SolSubCod
            }
            , new Object[] {
            T00F275_A396EmprCod, T00F275_A3218SolLuzCod
            }
            , new Object[] {
            T00F276_A396EmprCod, T00F276_A3196SolFriCod
            }
            , new Object[] {
            T00F277_A396EmprCod, T00F277_A3165SolPilCod
            }
            , new Object[] {
            T00F278_A396EmprCod, T00F278_A129BarCod, T00F278_A132BarCodReo, T00F278_A130BarCodPar, T00F278_A2872HAnRLinMaq, T00F278_A2873HAnRLinPro, T00F278_A2874HAnRLin, T00F278_A2875HAnNumAny
            }
            , new Object[] {
            T00F279_A396EmprCod, T00F279_A2817PlaTer, T00F279_A2818PlaOrd
            }
            , new Object[] {
            T00F280_A396EmprCod, T00F280_A2809MetTerCod, T00F280_A129BarCod, T00F280_A132BarCodReo, T00F280_A130BarCodPar
            }
            , new Object[] {
            T00F281_A396EmprCod, T00F281_A129BarCod, T00F281_A132BarCodReo, T00F281_A130BarCodPar, T00F281_A2808RecLinMAL, T00F281_A1377RecNumAny, T00F281_A719PrdNum
            }
            , new Object[] {
            T00F282_A396EmprCod, T00F282_A129BarCod, T00F282_A132BarCodReo, T00F282_A130BarCodPar, T00F282_A2804RecLinMaq
            }
            , new Object[] {
            T00F283_A396EmprCod, T00F283_A2792TermiCod, T00F283_A129BarCod, T00F283_A132BarCodReo, T00F283_A130BarCodPar
            }
            , new Object[] {
            T00F284_A396EmprCod, T00F284_A2248ManCod, T00F284_A2711RpExHdFe, T00F284_A2713RpExHdLi
            }
            , new Object[] {
            T00F285_A396EmprCod, T00F285_A2248ManCod, T00F285_A2689ExHdrFas, T00F285_A2692ExHdrLin
            }
            , new Object[] {
            T00F286_A396EmprCod, T00F286_A129BarCod, T00F286_A132BarCodReo, T00F286_A130BarCodPar, T00F286_A2494BarDosPro, T00F286_A719PrdNum
            }
            , new Object[] {
            T00F287_A396EmprCod, T00F287_A602MaqCod, T00F287_A2461PlaFecTin, T00F287_A129BarCod, T00F287_A132BarCodReo, T00F287_A130BarCodPar
            }
            , new Object[] {
            T00F288_A396EmprCod, T00F288_A129BarCod, T00F288_A132BarCodReo, T00F288_A130BarCodPar, T00F288_A2457BarObLin
            }
            , new Object[] {
            T00F289_A396EmprCod, T00F289_A129BarCod, T00F289_A132BarCodReo, T00F289_A130BarCodPar, T00F289_A2444BarEnLin
            }
            , new Object[] {
            T00F290_A396EmprCod, T00F290_A2406ExhAlbCod, T00F290_A129BarCod, T00F290_A132BarCodReo, T00F290_A130BarCodPar
            }
            , new Object[] {
            T00F291_A396EmprCod, T00F291_A2253SalExtAlb, T00F291_A129BarCod, T00F291_A132BarCodReo, T00F291_A130BarCodPar
            }
            , new Object[] {
            T00F292_A396EmprCod, T00F292_A30AlbProCod, T00F292_A129BarCod, T00F292_A132BarCodReo, T00F292_A130BarCodPar
            }
            , new Object[] {
            T00F293_A396EmprCod, T00F293_A1348SolColCod
            }
            , new Object[] {
            T00F294_A396EmprCod, T00F294_A1333EstDimCod
            }
            , new Object[] {
            T00F295_A396EmprCod, T00F295_A1314EnsLabCod
            }
            , new Object[] {
            T00F296_A396EmprCod, T00F296_A129BarCod, T00F296_A132BarCodReo, T00F296_A130BarCodPar, T00F296_A906ObsReoLin
            }
            , new Object[] {
            T00F297_A396EmprCod, T00F297_A859CumCodCont
            }
            , new Object[] {
            T00F298_A396EmprCod, T00F298_A602MaqCod, T00F298_A558HisProFec, T00F298_A561HisProLin
            }
            , new Object[] {
            T00F299_A396EmprCod, T00F299_A252CliCod, T00F299_A494ForSer, T00F299_A482ForColNom, T00F299_A483ForColNum, T00F299_A831TipColCod
            }
            , new Object[] {
            T00F2100_A396EmprCod, T00F2100_A129BarCod, T00F2100_A132BarCodReo, T00F2100_A130BarCodPar, T00F2100_A200BarPieCod
            }
            , new Object[] {
            T00F2101_A396EmprCod, T00F2101_A129BarCod, T00F2101_A132BarCodReo, T00F2101_A130BarCodPar, T00F2101_A188BarNotLin
            }
            , new Object[] {
            T00F2102_A396EmprCod, T00F2102_A129BarCod, T00F2102_A132BarCodReo, T00F2102_A130BarCodPar, T00F2102_A758ProCod
            }
            , new Object[] {
            T00F2103_A396EmprCod, T00F2103_A129BarCod, T00F2103_A132BarCodReo, T00F2103_A130BarCodPar, T00F2103_A119BarAgrCod, T00F2103_A124BarAgrReo, T00F2103_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T00F2105_A396EmprCod, T00F2105_A129BarCod, T00F2105_A132BarCodReo, T00F2105_A130BarCodPar
            }
            , new Object[] {
            T00F2107_A129BarCod, T00F2107_A132BarCodReo, T00F2107_A130BarCodPar, T00F2107_A759ProDsc, T00F2107_A761ProFasLin, T00F2107_n761ProFasLin, T00F2107_A396EmprCod, T00F2107_A758ProCod, T00F2107_A760ProFasEst, T00F2107_n760ProFasEst
            }
            , new Object[] {
            T00F2108_A759ProDsc
            }
            , new Object[] {
            T00F2110_A760ProFasEst, T00F2110_n760ProFasEst
            }
            , new Object[] {
            T00F2111_A396EmprCod, T00F2111_A129BarCod, T00F2111_A132BarCodReo, T00F2111_A130BarCodPar, T00F2111_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00F2115_A759ProDsc
            }
            , new Object[] {
            T00F2117_A760ProFasEst, T00F2117_n760ProFasEst
            }
            , new Object[] {
            T00F2118_A396EmprCod, T00F2118_A30AlbProCod, T00F2118_A129BarCod, T00F2118_A132BarCodReo, T00F2118_A130BarCodPar, T00F2118_A1468AlbPrdLin
            }
            , new Object[] {
            T00F2119_A396EmprCod, T00F2119_A129BarCod, T00F2119_A132BarCodReo, T00F2119_A130BarCodPar, T00F2119_A758ProCod, T00F2119_A194BarOrdLin, T00F2119_A1664ParFasCod
            }
            , new Object[] {
            T00F2120_A396EmprCod, T00F2120_A129BarCod, T00F2120_A132BarCodReo, T00F2120_A130BarCodPar, T00F2120_A758ProCod
            }
            , new Object[] {
            T00F2123_A129BarCod, T00F2123_A132BarCodReo, T00F2123_A130BarCodPar, T00F2123_A758ProCod, T00F2123_A194BarOrdLin, T00F2123_A458FasCon, T00F2123_n458FasCon, T00F2123_A152BarFasCon, T00F2123_A153BarFasEst, T00F2123_A459FasDec,
            T00F2123_n459FasDec, T00F2123_A602MaqCod, T00F2123_n602MaqCod, T00F2123_A456FasActTin, T00F2123_n456FasActTin, T00F2123_A150BarFacTin, T00F2123_A162BarFecTeo, T00F2123_A160BarFecRea, T00F2123_A216BarTieTeo, T00F2123_A227BarUni,
            T00F2123_A179BarLoc, T00F2123_A165BarHorIni, T00F2123_A164BarHorFin, T00F2123_A215BarTieRea, T00F2123_A3298BarFecRIni, T00F2123_A396EmprCod, T00F2123_A457FasCod, T00F2123_A603MaqCodBis, T00F2123_A1785BarFasAnt, T00F2123_n1785BarFasAnt
            }
            , new Object[] {
            T00F2124_A458FasCon, T00F2124_n458FasCon, T00F2124_A459FasDec, T00F2124_n459FasDec, T00F2124_A602MaqCod, T00F2124_n602MaqCod, T00F2124_A456FasActTin, T00F2124_n456FasActTin
            }
            , new Object[] {
            T00F2125_A396EmprCod
            }
            , new Object[] {
            T00F2126_A396EmprCod, T00F2126_A129BarCod, T00F2126_A132BarCodReo, T00F2126_A130BarCodPar, T00F2126_A758ProCod, T00F2126_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00F2130_A458FasCon, T00F2130_n458FasCon, T00F2130_A459FasDec, T00F2130_n459FasDec, T00F2130_A602MaqCod, T00F2130_n602MaqCod, T00F2130_A456FasActTin, T00F2130_n456FasActTin
            }
            , new Object[] {
            T00F2131_A396EmprCod, T00F2131_A129BarCod, T00F2131_A132BarCodReo, T00F2131_A130BarCodPar, T00F2131_A758ProCod, T00F2131_A194BarOrdLin, T00F2131_A12517SolAfLn
            }
            , new Object[] {
            T00F2132_A396EmprCod, T00F2132_A129BarCod, T00F2132_A132BarCodReo, T00F2132_A130BarCodPar, T00F2132_A758ProCod, T00F2132_A194BarOrdLin, T00F2132_A12516SolLzLn
            }
            , new Object[] {
            T00F2133_A396EmprCod, T00F2133_A129BarCod, T00F2133_A132BarCodReo, T00F2133_A130BarCodPar, T00F2133_A758ProCod, T00F2133_A194BarOrdLin, T00F2133_A12515SolPlLn
            }
            , new Object[] {
            T00F2134_A396EmprCod, T00F2134_A129BarCod, T00F2134_A132BarCodReo, T00F2134_A130BarCodPar, T00F2134_A758ProCod, T00F2134_A194BarOrdLin, T00F2134_A12514SolSAlLn
            }
            , new Object[] {
            T00F2135_A396EmprCod, T00F2135_A129BarCod, T00F2135_A132BarCodReo, T00F2135_A130BarCodPar, T00F2135_A758ProCod, T00F2135_A194BarOrdLin, T00F2135_A12513SolSAcLn
            }
            , new Object[] {
            T00F2136_A396EmprCod, T00F2136_A129BarCod, T00F2136_A132BarCodReo, T00F2136_A130BarCodPar, T00F2136_A758ProCod, T00F2136_A194BarOrdLin, T00F2136_A12512SolFrLn
            }
            , new Object[] {
            T00F2137_A396EmprCod, T00F2137_A129BarCod, T00F2137_A132BarCodReo, T00F2137_A130BarCodPar, T00F2137_A758ProCod, T00F2137_A194BarOrdLin, T00F2137_A12511SolAgLn
            }
            , new Object[] {
            T00F2138_A396EmprCod, T00F2138_A129BarCod, T00F2138_A132BarCodReo, T00F2138_A130BarCodPar, T00F2138_A758ProCod, T00F2138_A194BarOrdLin, T00F2138_A12510SolLvLn
            }
            , new Object[] {
            T00F2139_A396EmprCod, T00F2139_A129BarCod, T00F2139_A132BarCodReo, T00F2139_A130BarCodPar, T00F2139_A758ProCod, T00F2139_A194BarOrdLin, T00F2139_A10781BarFasNb
            }
            , new Object[] {
            T00F2140_A396EmprCod, T00F2140_A129BarCod, T00F2140_A132BarCodReo, T00F2140_A130BarCodPar, T00F2140_A758ProCod, T00F2140_A194BarOrdLin, T00F2140_A719PrdNum
            }
            , new Object[] {
            T00F2141_A396EmprCod, T00F2141_A129BarCod, T00F2141_A132BarCodReo, T00F2141_A130BarCodPar, T00F2141_A758ProCod, T00F2141_A194BarOrdLin, T00F2141_A9966Em_cod
            }
            , new Object[] {
            T00F2142_A396EmprCod, T00F2142_A129BarCod, T00F2142_A132BarCodReo, T00F2142_A130BarCodPar, T00F2142_A758ProCod, T00F2142_A194BarOrdLin, T00F2142_A9940Ab_cod
            }
            , new Object[] {
            T00F2143_A396EmprCod, T00F2143_A129BarCod, T00F2143_A132BarCodReo, T00F2143_A130BarCodPar, T00F2143_A758ProCod, T00F2143_A194BarOrdLin, T00F2143_A9911Ca_cod
            }
            , new Object[] {
            T00F2144_A396EmprCod, T00F2144_A129BarCod, T00F2144_A132BarCodReo, T00F2144_A130BarCodPar, T00F2144_A758ProCod, T00F2144_A194BarOrdLin, T00F2144_A9878Pe_cod
            }
            , new Object[] {
            T00F2145_A396EmprCod, T00F2145_A129BarCod, T00F2145_A132BarCodReo, T00F2145_A130BarCodPar, T00F2145_A758ProCod, T00F2145_A194BarOrdLin, T00F2145_A9870Rm_cod
            }
            , new Object[] {
            T00F2146_A396EmprCod, T00F2146_A129BarCod, T00F2146_A132BarCodReo, T00F2146_A130BarCodPar, T00F2146_A758ProCod, T00F2146_A194BarOrdLin, T00F2146_A7934Dtb_Ordl
            }
            , new Object[] {
            T00F2147_A396EmprCod, T00F2147_A129BarCod, T00F2147_A132BarCodReo, T00F2147_A130BarCodPar, T00F2147_A758ProCod, T00F2147_A194BarOrdLin, T00F2147_A5371FasQuiLin
            }
            , new Object[] {
            T00F2148_A396EmprCod, T00F2148_A129BarCod, T00F2148_A132BarCodReo, T00F2148_A130BarCodPar, T00F2148_A758ProCod, T00F2148_A194BarOrdLin, T00F2148_A4940A_Barcod, T00F2148_A4941A_BarReo, T00F2148_A4942A_BarPar, T00F2148_A4943A_ProCod,
            T00F2148_A4944A_BarOrd
            }
            , new Object[] {
            T00F2149_A396EmprCod, T00F2149_A129BarCod, T00F2149_A132BarCodReo, T00F2149_A130BarCodPar, T00F2149_A758ProCod, T00F2149_A194BarOrdLin, T00F2149_A4643BarFasLot
            }
            , new Object[] {
            T00F2150_A396EmprCod, T00F2150_A129BarCod, T00F2150_A132BarCodReo, T00F2150_A130BarCodPar, T00F2150_A758ProCod, T00F2150_A194BarOrdLin, T00F2150_A4031CCTCod
            }
            , new Object[] {
            T00F2151_A396EmprCod, T00F2151_A129BarCod, T00F2151_A132BarCodReo, T00F2151_A130BarCodPar, T00F2151_A758ProCod, T00F2151_A194BarOrdLin, T00F2151_A1664ParFasCod
            }
            , new Object[] {
            T00F2152_A396EmprCod, T00F2152_A129BarCod, T00F2152_A132BarCodReo, T00F2152_A130BarCodPar, T00F2152_A758ProCod, T00F2152_A194BarOrdLin
            }
            , new Object[] {
            T00F2153_A396EmprCod
            }
            , new Object[] {
            T00F2154_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z213BarSit ;
   private byte Z153BarFasEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte A1787BarReVir ;
   private byte A760ProFasEst ;
   private byte Gx_BScreen ;
   private byte Z760ProFasEst ;
   private byte GXv_int3[] ;
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
   private byte ZZ213BarSit ;
   private short Z217BarTipArt ;
   private short Z761ProFasLin ;
   private short nRcdDeleted_14 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short Z194BarOrdLin ;
   private short Z165BarHorIni ;
   private short Z164BarHorFin ;
   private short nRcdDeleted_15 ;
   private short nRcdExists_15 ;
   private short nIsMod_15 ;
   private short A217BarTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A628MaxOrdFas ;
   private short nBlankRcdCount14 ;
   private short RcdFound14 ;
   private short nBlankRcdUsr14 ;
   private short RcdFound15 ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A655OrdLinVir ;
   private short A761ProFasLin ;
   private short Z628MaxOrdFas ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_14 ;
   private short nIsDirty_15 ;
   private short nBlankRcdCount15 ;
   private short nBlankRcdUsr15 ;
   private short subGrid1_Borderwidth ;
   private short ZZ217BarTipArt ;
   private short ZZ628MaxOrdFas ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z136BarColNum ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
   private int nRC_GXsfl_117 ;
   private int nGXsfl_117_idx=1 ;
   private int A361DisCod ;
   private int A252CliCod ;
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
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int edtMaxOrdFas_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProFasLin_Enabled ;
   private int edtProFasEst_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_15_Enabled ;
   private int A1784BarCoVir ;
   private int edtBarOrdLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtBarFasCon_Enabled ;
   private int edtBarFasEst_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtBarFacTin_Enabled ;
   private int edtBarFecTeo_Enabled ;
   private int edtBarFecRea_Enabled ;
   private int edtBarTieTeo_Enabled ;
   private int edtBarUni_Enabled ;
   private int edtBarLoc_Enabled ;
   private int edtBarHorIni_Enabled ;
   private int edtBarHorFin_Enabled ;
   private int edtBarTieRea_Enabled ;
   private int edtEmpcVir_Enabled ;
   private int edtBarCoVir_Enabled ;
   private int edtBarReVir_Enabled ;
   private int edtBarPaVir_Enabled ;
   private int edtProCodVir_Enabled ;
   private int edtOrdLinVir_Enabled ;
   private int edtBarFasAnt_Enabled ;
   private int edtBarFecRIni_Enabled ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtBarOrdLin_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtMaxOrdFas_Backcolor ;
   private int edtBarTipArt_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z216BarTieTeo ;
   private java.math.BigDecimal Z227BarUni ;
   private java.math.BigDecimal Z215BarTieRea ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z135BarColNom ;
   private String Z212BarSer ;
   private String Z120BarAgrEst ;
   private String Z758ProCod ;
   private String Z152BarFasCon ;
   private String Z150BarFacTin ;
   private String Z179BarLoc ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_90_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_117_idx="0001" ;
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
   private String edtBarCod_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarTipArt_Internalname ;
   private String edtBarTipArt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMaxOrdFas_Internalname ;
   private String edtMaxOrdFas_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode14 ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
   private String edtProFasLin_Internalname ;
   private String edtProFasEst_Internalname ;
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
   private String edtavnRcdDeleted_15_Internalname ;
   private String sMode12 ;
   private String GXCCtl ;
   private String edtBarOrdLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCon_Internalname ;
   private String A458FasCon ;
   private String edtBarFasCon_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasEst_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCodBis_Internalname ;
   private String edtFasActTin_Internalname ;
   private String A456FasActTin ;
   private String edtBarFacTin_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFecTeo_Internalname ;
   private String edtBarFecRea_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarUni_Internalname ;
   private String edtBarLoc_Internalname ;
   private String A179BarLoc ;
   private String edtBarHorIni_Internalname ;
   private String edtBarHorFin_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtEmpcVir_Internalname ;
   private String A1788EmpcVir ;
   private String edtBarCoVir_Internalname ;
   private String edtBarReVir_Internalname ;
   private String edtBarPaVir_Internalname ;
   private String A1786BarPaVir ;
   private String edtProCodVir_Internalname ;
   private String A1789ProCodVir ;
   private String edtOrdLinVir_Internalname ;
   private String edtBarFasAnt_Internalname ;
   private String A1785BarFasAnt ;
   private String edtBarFecRIni_Internalname ;
   private String A759ProDsc ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z1785BarFasAnt ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String Z456FasActTin ;
   private String sMode15 ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock18_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtProFasLin_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtProFasEst_Jsonclick ;
   private String sGXsfl_117_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_15_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFecTeo_Jsonclick ;
   private String edtBarFecRea_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarUni_Jsonclick ;
   private String edtBarLoc_Jsonclick ;
   private String edtBarHorIni_Jsonclick ;
   private String edtBarHorFin_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtEmpcVir_Jsonclick ;
   private String edtBarCoVir_Jsonclick ;
   private String edtBarReVir_Jsonclick ;
   private String edtBarPaVir_Jsonclick ;
   private String edtProCodVir_Jsonclick ;
   private String edtOrdLinVir_Jsonclick ;
   private String edtBarFasAnt_Jsonclick ;
   private String edtBarFecRIni_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock15_Caption ;
   private String lblTextblock16_Caption ;
   private String lblTextblock17_Caption ;
   private String lblTextblock18_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ135BarColNom ;
   private String ZZ212BarSer ;
   private String ZZ120BarAgrEst ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private String ZZ279CliNom ;
   private java.util.Date Z162BarFecTeo ;
   private java.util.Date Z160BarFecRea ;
   private java.util.Date Z3298BarFecRIni ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n758ProCod ;
   private boolean wbErr ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n628MaxOrdFas ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_117_Refreshing=false ;
   private boolean n760ProFasEst ;
   private boolean Gx_longc ;
   private boolean n761ProFasLin ;
   private boolean n1785BarFasAnt ;
   private boolean n458FasCon ;
   private boolean n459FasDec ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T00F210_A628MaxOrdFas ;
   private boolean[] T00F210_n628MaxOrdFas ;
   private byte[] T00F212_A760ProFasEst ;
   private boolean[] T00F212_n760ProFasEst ;
   private int[] T00F223_A361DisCod ;
   private String[] T00F223_A2759BarMaqGru ;
   private int[] T00F223_A129BarCod ;
   private boolean[] T00F223_n129BarCod ;
   private byte[] T00F223_A132BarCodReo ;
   private boolean[] T00F223_n132BarCodReo ;
   private String[] T00F223_A130BarCodPar ;
   private boolean[] T00F223_n130BarCodPar ;
   private String[] T00F223_A180BarMaqCod ;
   private int[] T00F223_A252CliCod ;
   private boolean[] T00F223_n252CliCod ;
   private String[] T00F223_A279CliNom ;
   private String[] T00F223_A135BarColNom ;
   private int[] T00F223_A136BarColNum ;
   private String[] T00F223_A212BarSer ;
   private byte[] T00F223_A213BarSit ;
   private String[] T00F223_A120BarAgrEst ;
   private String[] T00F223_A407EmprNom ;
   private boolean[] T00F223_n407EmprNom ;
   private String[] T00F223_A365DisDes ;
   private String[] T00F223_A396EmprCod ;
   private boolean[] T00F223_n396EmprCod ;
   private short[] T00F223_A217BarTipArt ;
   private boolean[] T00F223_n217BarTipArt ;
   private short[] T00F223_A628MaxOrdFas ;
   private boolean[] T00F223_n628MaxOrdFas ;
   private int[] T00F219_A252CliCod ;
   private boolean[] T00F219_n252CliCod ;
   private String[] T00F219_A365DisDes ;
   private String[] T00F218_A407EmprNom ;
   private boolean[] T00F218_n407EmprNom ;
   private String[] T00F220_A396EmprCod ;
   private boolean[] T00F220_n396EmprCod ;
   private String[] T00F221_A279CliNom ;
   private String[] T00F224_A407EmprNom ;
   private boolean[] T00F224_n407EmprNom ;
   private int[] T00F225_A252CliCod ;
   private boolean[] T00F225_n252CliCod ;
   private String[] T00F225_A365DisDes ;
   private String[] T00F226_A396EmprCod ;
   private boolean[] T00F226_n396EmprCod ;
   private String[] T00F227_A279CliNom ;
   private short[] T00F229_A628MaxOrdFas ;
   private boolean[] T00F229_n628MaxOrdFas ;
   private String[] T00F230_A396EmprCod ;
   private boolean[] T00F230_n396EmprCod ;
   private int[] T00F230_A129BarCod ;
   private boolean[] T00F230_n129BarCod ;
   private byte[] T00F230_A132BarCodReo ;
   private boolean[] T00F230_n132BarCodReo ;
   private String[] T00F230_A130BarCodPar ;
   private boolean[] T00F230_n130BarCodPar ;
   private int[] T00F217_A361DisCod ;
   private String[] T00F217_A2759BarMaqGru ;
   private int[] T00F217_A129BarCod ;
   private boolean[] T00F217_n129BarCod ;
   private byte[] T00F217_A132BarCodReo ;
   private boolean[] T00F217_n132BarCodReo ;
   private String[] T00F217_A130BarCodPar ;
   private boolean[] T00F217_n130BarCodPar ;
   private String[] T00F217_A180BarMaqCod ;
   private String[] T00F217_A135BarColNom ;
   private int[] T00F217_A136BarColNum ;
   private String[] T00F217_A212BarSer ;
   private byte[] T00F217_A213BarSit ;
   private String[] T00F217_A120BarAgrEst ;
   private String[] T00F217_A396EmprCod ;
   private boolean[] T00F217_n396EmprCod ;
   private short[] T00F217_A217BarTipArt ;
   private boolean[] T00F217_n217BarTipArt ;
   private int[] T00F217_A252CliCod ;
   private boolean[] T00F217_n252CliCod ;
   private String[] T00F217_A365DisDes ;
   private String[] T00F231_A396EmprCod ;
   private boolean[] T00F231_n396EmprCod ;
   private int[] T00F231_A129BarCod ;
   private boolean[] T00F231_n129BarCod ;
   private byte[] T00F231_A132BarCodReo ;
   private boolean[] T00F231_n132BarCodReo ;
   private String[] T00F231_A130BarCodPar ;
   private boolean[] T00F231_n130BarCodPar ;
   private String[] T00F232_A396EmprCod ;
   private boolean[] T00F232_n396EmprCod ;
   private int[] T00F232_A129BarCod ;
   private boolean[] T00F232_n129BarCod ;
   private byte[] T00F232_A132BarCodReo ;
   private boolean[] T00F232_n132BarCodReo ;
   private String[] T00F232_A130BarCodPar ;
   private boolean[] T00F232_n130BarCodPar ;
   private int[] T00F216_A361DisCod ;
   private String[] T00F216_A2759BarMaqGru ;
   private int[] T00F216_A129BarCod ;
   private boolean[] T00F216_n129BarCod ;
   private byte[] T00F216_A132BarCodReo ;
   private boolean[] T00F216_n132BarCodReo ;
   private String[] T00F216_A130BarCodPar ;
   private boolean[] T00F216_n130BarCodPar ;
   private String[] T00F216_A180BarMaqCod ;
   private String[] T00F216_A135BarColNom ;
   private int[] T00F216_A136BarColNum ;
   private String[] T00F216_A212BarSer ;
   private byte[] T00F216_A213BarSit ;
   private String[] T00F216_A120BarAgrEst ;
   private String[] T00F216_A396EmprCod ;
   private boolean[] T00F216_n396EmprCod ;
   private short[] T00F216_A217BarTipArt ;
   private boolean[] T00F216_n217BarTipArt ;
   private int[] T00F216_A252CliCod ;
   private boolean[] T00F216_n252CliCod ;
   private String[] T00F216_A365DisDes ;
   private String[] T00F236_A407EmprNom ;
   private boolean[] T00F236_n407EmprNom ;
   private short[] T00F238_A628MaxOrdFas ;
   private boolean[] T00F238_n628MaxOrdFas ;
   private int[] T00F239_A252CliCod ;
   private boolean[] T00F239_n252CliCod ;
   private String[] T00F239_A365DisDes ;
   private String[] T00F240_A279CliNom ;
   private long[] T00F241_A14681MRPrId ;
   private String[] T00F242_A5921XCjaDis ;
   private long[] T00F242_A5922XCjaCod ;
   private String[] T00F243_A396EmprCod ;
   private boolean[] T00F243_n396EmprCod ;
   private int[] T00F243_A129BarCod ;
   private boolean[] T00F243_n129BarCod ;
   private byte[] T00F243_A132BarCodReo ;
   private boolean[] T00F243_n132BarCodReo ;
   private String[] T00F243_A130BarCodPar ;
   private boolean[] T00F243_n130BarCodPar ;
   private short[] T00F243_A14152MEnvOrd ;
   private String[] T00F244_A396EmprCod ;
   private boolean[] T00F244_n396EmprCod ;
   private int[] T00F244_A129BarCod ;
   private boolean[] T00F244_n129BarCod ;
   private byte[] T00F244_A132BarCodReo ;
   private boolean[] T00F244_n132BarCodReo ;
   private String[] T00F244_A130BarCodPar ;
   private boolean[] T00F244_n130BarCodPar ;
   private String[] T00F244_A13905BarTraID ;
   private String[] T00F245_A396EmprCod ;
   private boolean[] T00F245_n396EmprCod ;
   private int[] T00F245_A129BarCod ;
   private boolean[] T00F245_n129BarCod ;
   private byte[] T00F245_A132BarCodReo ;
   private boolean[] T00F245_n132BarCodReo ;
   private String[] T00F245_A130BarCodPar ;
   private boolean[] T00F245_n130BarCodPar ;
   private byte[] T00F245_A13093BarDGLin ;
   private String[] T00F245_A13094BarDGDibCl ;
   private int[] T00F245_A13095BarDGDibIn ;
   private String[] T00F245_A13096BarDGComb ;
   private String[] T00F245_A13097BarDGFOndo ;
   private String[] T00F246_A396EmprCod ;
   private boolean[] T00F246_n396EmprCod ;
   private int[] T00F246_A11917Ebd_numero ;
   private String[] T00F247_A396EmprCod ;
   private boolean[] T00F247_n396EmprCod ;
   private int[] T00F247_A11898Prd_numero ;
   private String[] T00F248_A396EmprCod ;
   private boolean[] T00F248_n396EmprCod ;
   private int[] T00F248_A11849Cte_numero ;
   private String[] T00F249_A396EmprCod ;
   private boolean[] T00F249_n396EmprCod ;
   private int[] T00F249_A11791Ap_numero ;
   private String[] T00F250_A396EmprCod ;
   private boolean[] T00F250_n396EmprCod ;
   private int[] T00F250_A3985CalBarCod ;
   private byte[] T00F250_A3986CalBarCodR ;
   private String[] T00F250_A3987CalBarCodP ;
   private String[] T00F251_A396EmprCod ;
   private boolean[] T00F251_n396EmprCod ;
   private java.util.Date[] T00F251_A5294InPTime ;
   private int[] T00F251_A652OpeCod ;
   private String[] T00F252_A396EmprCod ;
   private boolean[] T00F252_n396EmprCod ;
   private int[] T00F252_A129BarCod ;
   private boolean[] T00F252_n129BarCod ;
   private byte[] T00F252_A132BarCodReo ;
   private boolean[] T00F252_n132BarCodReo ;
   private String[] T00F252_A130BarCodPar ;
   private boolean[] T00F252_n130BarCodPar ;
   private int[] T00F252_A4118tinagrcod ;
   private byte[] T00F252_A4119tinagrreo ;
   private String[] T00F252_A4120tinagrpar ;
   private String[] T00F253_A396EmprCod ;
   private boolean[] T00F253_n396EmprCod ;
   private int[] T00F253_A129BarCod ;
   private boolean[] T00F253_n129BarCod ;
   private byte[] T00F253_A132BarCodReo ;
   private boolean[] T00F253_n132BarCodReo ;
   private String[] T00F253_A130BarCodPar ;
   private boolean[] T00F253_n130BarCodPar ;
   private int[] T00F253_A4080estagrcod ;
   private byte[] T00F253_A4081estagrreo ;
   private String[] T00F253_A4082estagrpar ;
   private String[] T00F254_A396EmprCod ;
   private boolean[] T00F254_n396EmprCod ;
   private int[] T00F254_A129BarCod ;
   private boolean[] T00F254_n129BarCod ;
   private byte[] T00F254_A132BarCodReo ;
   private boolean[] T00F254_n132BarCodReo ;
   private String[] T00F254_A130BarCodPar ;
   private boolean[] T00F254_n130BarCodPar ;
   private byte[] T00F254_A4075recestncol ;
   private byte[] T00F254_A4076recestnpro ;
   private String[] T00F255_A396EmprCod ;
   private boolean[] T00F255_n396EmprCod ;
   private String[] T00F255_A602MaqCod ;
   private boolean[] T00F255_n602MaqCod ;
   private String[] T00F255_A1142MaqFCod ;
   private short[] T00F255_A3068PlaEtaOrd ;
   private byte[] T00F255_A3069PlaEtaOrdA ;
   private int[] T00F255_A129BarCod ;
   private boolean[] T00F255_n129BarCod ;
   private byte[] T00F255_A132BarCodReo ;
   private boolean[] T00F255_n132BarCodReo ;
   private String[] T00F255_A130BarCodPar ;
   private boolean[] T00F255_n130BarCodPar ;
   private String[] T00F256_A396EmprCod ;
   private boolean[] T00F256_n396EmprCod ;
   private int[] T00F256_A129BarCod ;
   private boolean[] T00F256_n129BarCod ;
   private byte[] T00F256_A132BarCodReo ;
   private boolean[] T00F256_n132BarCodReo ;
   private String[] T00F256_A130BarCodPar ;
   private boolean[] T00F256_n130BarCodPar ;
   private short[] T00F256_A4846BarAudLin ;
   private String[] T00F257_A396EmprCod ;
   private boolean[] T00F257_n396EmprCod ;
   private int[] T00F257_A129BarCod ;
   private boolean[] T00F257_n129BarCod ;
   private byte[] T00F257_A132BarCodReo ;
   private boolean[] T00F257_n132BarCodReo ;
   private String[] T00F257_A130BarCodPar ;
   private boolean[] T00F257_n130BarCodPar ;
   private short[] T00F257_A3940BarEnsLin ;
   private String[] T00F258_A396EmprCod ;
   private boolean[] T00F258_n396EmprCod ;
   private int[] T00F258_A129BarCod ;
   private boolean[] T00F258_n129BarCod ;
   private byte[] T00F258_A132BarCodReo ;
   private boolean[] T00F258_n132BarCodReo ;
   private String[] T00F258_A130BarCodPar ;
   private boolean[] T00F258_n130BarCodPar ;
   private int[] T00F258_A3384RefBarCod ;
   private byte[] T00F258_A3385RefBarReo ;
   private String[] T00F258_A3386RefBarPar ;
   private String[] T00F259_A396EmprCod ;
   private boolean[] T00F259_n396EmprCod ;
   private int[] T00F259_A10914SolSalCod ;
   private String[] T00F260_A396EmprCod ;
   private boolean[] T00F260_n396EmprCod ;
   private int[] T00F260_A10364Ph_numero ;
   private String[] T00F261_A396EmprCod ;
   private boolean[] T00F261_n396EmprCod ;
   private int[] T00F261_A129BarCod ;
   private boolean[] T00F261_n129BarCod ;
   private byte[] T00F261_A132BarCodReo ;
   private boolean[] T00F261_n132BarCodReo ;
   private String[] T00F261_A130BarCodPar ;
   private boolean[] T00F261_n130BarCodPar ;
   private String[] T00F261_A10197ProEspCod ;
   private String[] T00F262_A396EmprCod ;
   private boolean[] T00F262_n396EmprCod ;
   private int[] T00F262_A129BarCod ;
   private boolean[] T00F262_n129BarCod ;
   private byte[] T00F262_A132BarCodReo ;
   private boolean[] T00F262_n132BarCodReo ;
   private String[] T00F262_A130BarCodPar ;
   private boolean[] T00F262_n130BarCodPar ;
   private int[] T00F262_A5322Dp_Nrecep ;
   private String[] T00F263_A396EmprCod ;
   private boolean[] T00F263_n396EmprCod ;
   private int[] T00F263_A129BarCod ;
   private boolean[] T00F263_n129BarCod ;
   private byte[] T00F263_A132BarCodReo ;
   private boolean[] T00F263_n132BarCodReo ;
   private String[] T00F263_A130BarCodPar ;
   private boolean[] T00F263_n130BarCodPar ;
   private int[] T00F263_A8569EntSecLn ;
   private String[] T00F264_A396EmprCod ;
   private boolean[] T00F264_n396EmprCod ;
   private int[] T00F264_A7434PLLNro ;
   private short[] T00F264_A7443LPLNro ;
   private short[] T00F264_A7459CPLCom ;
   private int[] T00F264_A129BarCod ;
   private boolean[] T00F264_n129BarCod ;
   private byte[] T00F264_A132BarCodReo ;
   private boolean[] T00F264_n132BarCodReo ;
   private String[] T00F264_A130BarCodPar ;
   private boolean[] T00F264_n130BarCodPar ;
   private String[] T00F265_A396EmprCod ;
   private boolean[] T00F265_n396EmprCod ;
   private int[] T00F265_A7145OSSCod ;
   private String[] T00F266_A396EmprCod ;
   private boolean[] T00F266_n396EmprCod ;
   private int[] T00F266_A7049OGSCod ;
   private String[] T00F267_A396EmprCod ;
   private boolean[] T00F267_n396EmprCod ;
   private int[] T00F267_A129BarCod ;
   private boolean[] T00F267_n129BarCod ;
   private byte[] T00F267_A132BarCodReo ;
   private boolean[] T00F267_n132BarCodReo ;
   private String[] T00F267_A130BarCodPar ;
   private boolean[] T00F267_n130BarCodPar ;
   private int[] T00F267_A6031Ac_Barcod ;
   private byte[] T00F267_A6032Ac_BarReo ;
   private String[] T00F267_A6033Ac_BarPar ;
   private String[] T00F268_A396EmprCod ;
   private boolean[] T00F268_n396EmprCod ;
   private int[] T00F268_A129BarCod ;
   private boolean[] T00F268_n129BarCod ;
   private byte[] T00F268_A132BarCodReo ;
   private boolean[] T00F268_n132BarCodReo ;
   private String[] T00F268_A130BarCodPar ;
   private boolean[] T00F268_n130BarCodPar ;
   private int[] T00F268_A5908PartPal ;
   private String[] T00F269_A396EmprCod ;
   private boolean[] T00F269_n396EmprCod ;
   private int[] T00F269_A129BarCod ;
   private boolean[] T00F269_n129BarCod ;
   private byte[] T00F269_A132BarCodReo ;
   private boolean[] T00F269_n132BarCodReo ;
   private String[] T00F269_A130BarCodPar ;
   private boolean[] T00F269_n130BarCodPar ;
   private byte[] T00F269_A2524DisComLin ;
   private String[] T00F269_A1056DisComCod ;
   private String[] T00F269_A1032FonCod ;
   private String[] T00F270_A396EmprCod ;
   private boolean[] T00F270_n396EmprCod ;
   private long[] T00F270_A1736AlbExtCod ;
   private int[] T00F270_A129BarCod ;
   private boolean[] T00F270_n129BarCod ;
   private byte[] T00F270_A132BarCodReo ;
   private boolean[] T00F270_n132BarCodReo ;
   private String[] T00F270_A130BarCodPar ;
   private boolean[] T00F270_n130BarCodPar ;
   private String[] T00F271_A396EmprCod ;
   private boolean[] T00F271_n396EmprCod ;
   private int[] T00F271_A129BarCod ;
   private boolean[] T00F271_n129BarCod ;
   private byte[] T00F271_A132BarCodReo ;
   private boolean[] T00F271_n132BarCodReo ;
   private String[] T00F271_A130BarCodPar ;
   private boolean[] T00F271_n130BarCodPar ;
   private int[] T00F271_A3753BarFoaCod ;
   private byte[] T00F271_A3754BarFoaReo ;
   private String[] T00F271_A3755BarFoaPar ;
   private String[] T00F272_A396EmprCod ;
   private boolean[] T00F272_n396EmprCod ;
   private int[] T00F272_A129BarCod ;
   private boolean[] T00F272_n129BarCod ;
   private byte[] T00F272_A132BarCodReo ;
   private boolean[] T00F272_n132BarCodReo ;
   private String[] T00F272_A130BarCodPar ;
   private boolean[] T00F272_n130BarCodPar ;
   private int[] T00F272_A3747BarPegCod ;
   private byte[] T00F272_A3748BarPegReo ;
   private String[] T00F272_A3749BarPegPar ;
   private String[] T00F273_A396EmprCod ;
   private boolean[] T00F273_n396EmprCod ;
   private int[] T00F273_A3253SolTraCod ;
   private String[] T00F274_A396EmprCod ;
   private boolean[] T00F274_n396EmprCod ;
   private int[] T00F274_A3235SolSubCod ;
   private String[] T00F275_A396EmprCod ;
   private boolean[] T00F275_n396EmprCod ;
   private int[] T00F275_A3218SolLuzCod ;
   private String[] T00F276_A396EmprCod ;
   private boolean[] T00F276_n396EmprCod ;
   private int[] T00F276_A3196SolFriCod ;
   private String[] T00F277_A396EmprCod ;
   private boolean[] T00F277_n396EmprCod ;
   private int[] T00F277_A3165SolPilCod ;
   private String[] T00F278_A396EmprCod ;
   private boolean[] T00F278_n396EmprCod ;
   private int[] T00F278_A129BarCod ;
   private boolean[] T00F278_n129BarCod ;
   private byte[] T00F278_A132BarCodReo ;
   private boolean[] T00F278_n132BarCodReo ;
   private String[] T00F278_A130BarCodPar ;
   private boolean[] T00F278_n130BarCodPar ;
   private short[] T00F278_A2872HAnRLinMaq ;
   private byte[] T00F278_A2873HAnRLinPro ;
   private short[] T00F278_A2874HAnRLin ;
   private byte[] T00F278_A2875HAnNumAny ;
   private String[] T00F279_A396EmprCod ;
   private boolean[] T00F279_n396EmprCod ;
   private String[] T00F279_A2817PlaTer ;
   private short[] T00F279_A2818PlaOrd ;
   private String[] T00F280_A396EmprCod ;
   private boolean[] T00F280_n396EmprCod ;
   private String[] T00F280_A2809MetTerCod ;
   private int[] T00F280_A129BarCod ;
   private boolean[] T00F280_n129BarCod ;
   private byte[] T00F280_A132BarCodReo ;
   private boolean[] T00F280_n132BarCodReo ;
   private String[] T00F280_A130BarCodPar ;
   private boolean[] T00F280_n130BarCodPar ;
   private String[] T00F281_A396EmprCod ;
   private boolean[] T00F281_n396EmprCod ;
   private int[] T00F281_A129BarCod ;
   private boolean[] T00F281_n129BarCod ;
   private byte[] T00F281_A132BarCodReo ;
   private boolean[] T00F281_n132BarCodReo ;
   private String[] T00F281_A130BarCodPar ;
   private boolean[] T00F281_n130BarCodPar ;
   private short[] T00F281_A2808RecLinMAL ;
   private byte[] T00F281_A1377RecNumAny ;
   private String[] T00F281_A719PrdNum ;
   private String[] T00F282_A396EmprCod ;
   private boolean[] T00F282_n396EmprCod ;
   private int[] T00F282_A129BarCod ;
   private boolean[] T00F282_n129BarCod ;
   private byte[] T00F282_A132BarCodReo ;
   private boolean[] T00F282_n132BarCodReo ;
   private String[] T00F282_A130BarCodPar ;
   private boolean[] T00F282_n130BarCodPar ;
   private short[] T00F282_A2804RecLinMaq ;
   private String[] T00F283_A396EmprCod ;
   private boolean[] T00F283_n396EmprCod ;
   private String[] T00F283_A2792TermiCod ;
   private int[] T00F283_A129BarCod ;
   private boolean[] T00F283_n129BarCod ;
   private byte[] T00F283_A132BarCodReo ;
   private boolean[] T00F283_n132BarCodReo ;
   private String[] T00F283_A130BarCodPar ;
   private boolean[] T00F283_n130BarCodPar ;
   private String[] T00F284_A396EmprCod ;
   private boolean[] T00F284_n396EmprCod ;
   private short[] T00F284_A2248ManCod ;
   private java.util.Date[] T00F284_A2711RpExHdFe ;
   private short[] T00F284_A2713RpExHdLi ;
   private String[] T00F285_A396EmprCod ;
   private boolean[] T00F285_n396EmprCod ;
   private short[] T00F285_A2248ManCod ;
   private String[] T00F285_A2689ExHdrFas ;
   private int[] T00F285_A2692ExHdrLin ;
   private String[] T00F286_A396EmprCod ;
   private boolean[] T00F286_n396EmprCod ;
   private int[] T00F286_A129BarCod ;
   private boolean[] T00F286_n129BarCod ;
   private byte[] T00F286_A132BarCodReo ;
   private boolean[] T00F286_n132BarCodReo ;
   private String[] T00F286_A130BarCodPar ;
   private boolean[] T00F286_n130BarCodPar ;
   private String[] T00F286_A2494BarDosPro ;
   private String[] T00F286_A719PrdNum ;
   private String[] T00F287_A396EmprCod ;
   private boolean[] T00F287_n396EmprCod ;
   private String[] T00F287_A602MaqCod ;
   private boolean[] T00F287_n602MaqCod ;
   private java.util.Date[] T00F287_A2461PlaFecTin ;
   private int[] T00F287_A129BarCod ;
   private boolean[] T00F287_n129BarCod ;
   private byte[] T00F287_A132BarCodReo ;
   private boolean[] T00F287_n132BarCodReo ;
   private String[] T00F287_A130BarCodPar ;
   private boolean[] T00F287_n130BarCodPar ;
   private String[] T00F288_A396EmprCod ;
   private boolean[] T00F288_n396EmprCod ;
   private int[] T00F288_A129BarCod ;
   private boolean[] T00F288_n129BarCod ;
   private byte[] T00F288_A132BarCodReo ;
   private boolean[] T00F288_n132BarCodReo ;
   private String[] T00F288_A130BarCodPar ;
   private boolean[] T00F288_n130BarCodPar ;
   private short[] T00F288_A2457BarObLin ;
   private String[] T00F289_A396EmprCod ;
   private boolean[] T00F289_n396EmprCod ;
   private int[] T00F289_A129BarCod ;
   private boolean[] T00F289_n129BarCod ;
   private byte[] T00F289_A132BarCodReo ;
   private boolean[] T00F289_n132BarCodReo ;
   private String[] T00F289_A130BarCodPar ;
   private boolean[] T00F289_n130BarCodPar ;
   private short[] T00F289_A2444BarEnLin ;
   private String[] T00F290_A396EmprCod ;
   private boolean[] T00F290_n396EmprCod ;
   private int[] T00F290_A2406ExhAlbCod ;
   private int[] T00F290_A129BarCod ;
   private boolean[] T00F290_n129BarCod ;
   private byte[] T00F290_A132BarCodReo ;
   private boolean[] T00F290_n132BarCodReo ;
   private String[] T00F290_A130BarCodPar ;
   private boolean[] T00F290_n130BarCodPar ;
   private String[] T00F291_A396EmprCod ;
   private boolean[] T00F291_n396EmprCod ;
   private int[] T00F291_A2253SalExtAlb ;
   private int[] T00F291_A129BarCod ;
   private boolean[] T00F291_n129BarCod ;
   private byte[] T00F291_A132BarCodReo ;
   private boolean[] T00F291_n132BarCodReo ;
   private String[] T00F291_A130BarCodPar ;
   private boolean[] T00F291_n130BarCodPar ;
   private String[] T00F292_A396EmprCod ;
   private boolean[] T00F292_n396EmprCod ;
   private long[] T00F292_A30AlbProCod ;
   private int[] T00F292_A129BarCod ;
   private boolean[] T00F292_n129BarCod ;
   private byte[] T00F292_A132BarCodReo ;
   private boolean[] T00F292_n132BarCodReo ;
   private String[] T00F292_A130BarCodPar ;
   private boolean[] T00F292_n130BarCodPar ;
   private String[] T00F293_A396EmprCod ;
   private boolean[] T00F293_n396EmprCod ;
   private int[] T00F293_A1348SolColCod ;
   private String[] T00F294_A396EmprCod ;
   private boolean[] T00F294_n396EmprCod ;
   private int[] T00F294_A1333EstDimCod ;
   private String[] T00F295_A396EmprCod ;
   private boolean[] T00F295_n396EmprCod ;
   private int[] T00F295_A1314EnsLabCod ;
   private String[] T00F296_A396EmprCod ;
   private boolean[] T00F296_n396EmprCod ;
   private int[] T00F296_A129BarCod ;
   private boolean[] T00F296_n129BarCod ;
   private byte[] T00F296_A132BarCodReo ;
   private boolean[] T00F296_n132BarCodReo ;
   private String[] T00F296_A130BarCodPar ;
   private boolean[] T00F296_n130BarCodPar ;
   private byte[] T00F296_A906ObsReoLin ;
   private String[] T00F297_A396EmprCod ;
   private boolean[] T00F297_n396EmprCod ;
   private int[] T00F297_A859CumCodCont ;
   private String[] T00F298_A396EmprCod ;
   private boolean[] T00F298_n396EmprCod ;
   private String[] T00F298_A602MaqCod ;
   private boolean[] T00F298_n602MaqCod ;
   private java.util.Date[] T00F298_A558HisProFec ;
   private int[] T00F298_A561HisProLin ;
   private String[] T00F299_A396EmprCod ;
   private boolean[] T00F299_n396EmprCod ;
   private int[] T00F299_A252CliCod ;
   private boolean[] T00F299_n252CliCod ;
   private String[] T00F299_A494ForSer ;
   private String[] T00F299_A482ForColNom ;
   private int[] T00F299_A483ForColNum ;
   private byte[] T00F299_A831TipColCod ;
   private String[] T00F2100_A396EmprCod ;
   private boolean[] T00F2100_n396EmprCod ;
   private int[] T00F2100_A129BarCod ;
   private boolean[] T00F2100_n129BarCod ;
   private byte[] T00F2100_A132BarCodReo ;
   private boolean[] T00F2100_n132BarCodReo ;
   private String[] T00F2100_A130BarCodPar ;
   private boolean[] T00F2100_n130BarCodPar ;
   private String[] T00F2100_A200BarPieCod ;
   private String[] T00F2101_A396EmprCod ;
   private boolean[] T00F2101_n396EmprCod ;
   private int[] T00F2101_A129BarCod ;
   private boolean[] T00F2101_n129BarCod ;
   private byte[] T00F2101_A132BarCodReo ;
   private boolean[] T00F2101_n132BarCodReo ;
   private String[] T00F2101_A130BarCodPar ;
   private boolean[] T00F2101_n130BarCodPar ;
   private byte[] T00F2101_A188BarNotLin ;
   private String[] T00F2102_A396EmprCod ;
   private boolean[] T00F2102_n396EmprCod ;
   private int[] T00F2102_A129BarCod ;
   private boolean[] T00F2102_n129BarCod ;
   private byte[] T00F2102_A132BarCodReo ;
   private boolean[] T00F2102_n132BarCodReo ;
   private String[] T00F2102_A130BarCodPar ;
   private boolean[] T00F2102_n130BarCodPar ;
   private String[] T00F2102_A758ProCod ;
   private boolean[] T00F2102_n758ProCod ;
   private String[] T00F2103_A396EmprCod ;
   private boolean[] T00F2103_n396EmprCod ;
   private int[] T00F2103_A129BarCod ;
   private boolean[] T00F2103_n129BarCod ;
   private byte[] T00F2103_A132BarCodReo ;
   private boolean[] T00F2103_n132BarCodReo ;
   private String[] T00F2103_A130BarCodPar ;
   private boolean[] T00F2103_n130BarCodPar ;
   private int[] T00F2103_A119BarAgrCod ;
   private byte[] T00F2103_A124BarAgrReo ;
   private String[] T00F2103_A122BarAgrPar ;
   private String[] T00F2105_A396EmprCod ;
   private boolean[] T00F2105_n396EmprCod ;
   private int[] T00F2105_A129BarCod ;
   private boolean[] T00F2105_n129BarCod ;
   private byte[] T00F2105_A132BarCodReo ;
   private boolean[] T00F2105_n132BarCodReo ;
   private String[] T00F2105_A130BarCodPar ;
   private boolean[] T00F2105_n130BarCodPar ;
   private int[] T00F2107_A129BarCod ;
   private boolean[] T00F2107_n129BarCod ;
   private byte[] T00F2107_A132BarCodReo ;
   private boolean[] T00F2107_n132BarCodReo ;
   private String[] T00F2107_A130BarCodPar ;
   private boolean[] T00F2107_n130BarCodPar ;
   private String[] T00F2107_A759ProDsc ;
   private short[] T00F2107_A761ProFasLin ;
   private boolean[] T00F2107_n761ProFasLin ;
   private String[] T00F2107_A396EmprCod ;
   private boolean[] T00F2107_n396EmprCod ;
   private String[] T00F2107_A758ProCod ;
   private boolean[] T00F2107_n758ProCod ;
   private byte[] T00F2107_A760ProFasEst ;
   private boolean[] T00F2107_n760ProFasEst ;
   private String[] T00F215_A759ProDsc ;
   private String[] T00F2108_A759ProDsc ;
   private byte[] T00F2110_A760ProFasEst ;
   private boolean[] T00F2110_n760ProFasEst ;
   private String[] T00F2111_A396EmprCod ;
   private boolean[] T00F2111_n396EmprCod ;
   private int[] T00F2111_A129BarCod ;
   private boolean[] T00F2111_n129BarCod ;
   private byte[] T00F2111_A132BarCodReo ;
   private boolean[] T00F2111_n132BarCodReo ;
   private String[] T00F2111_A130BarCodPar ;
   private boolean[] T00F2111_n130BarCodPar ;
   private String[] T00F2111_A758ProCod ;
   private boolean[] T00F2111_n758ProCod ;
   private int[] T00F214_A129BarCod ;
   private boolean[] T00F214_n129BarCod ;
   private byte[] T00F214_A132BarCodReo ;
   private boolean[] T00F214_n132BarCodReo ;
   private String[] T00F214_A130BarCodPar ;
   private boolean[] T00F214_n130BarCodPar ;
   private short[] T00F214_A761ProFasLin ;
   private boolean[] T00F214_n761ProFasLin ;
   private String[] T00F214_A396EmprCod ;
   private boolean[] T00F214_n396EmprCod ;
   private String[] T00F214_A758ProCod ;
   private boolean[] T00F214_n758ProCod ;
   private int[] T00F213_A129BarCod ;
   private boolean[] T00F213_n129BarCod ;
   private byte[] T00F213_A132BarCodReo ;
   private boolean[] T00F213_n132BarCodReo ;
   private String[] T00F213_A130BarCodPar ;
   private boolean[] T00F213_n130BarCodPar ;
   private short[] T00F213_A761ProFasLin ;
   private boolean[] T00F213_n761ProFasLin ;
   private String[] T00F213_A396EmprCod ;
   private boolean[] T00F213_n396EmprCod ;
   private String[] T00F213_A758ProCod ;
   private boolean[] T00F213_n758ProCod ;
   private String[] T00F2115_A759ProDsc ;
   private byte[] T00F2117_A760ProFasEst ;
   private boolean[] T00F2117_n760ProFasEst ;
   private String[] T00F2118_A396EmprCod ;
   private boolean[] T00F2118_n396EmprCod ;
   private long[] T00F2118_A30AlbProCod ;
   private int[] T00F2118_A129BarCod ;
   private boolean[] T00F2118_n129BarCod ;
   private byte[] T00F2118_A132BarCodReo ;
   private boolean[] T00F2118_n132BarCodReo ;
   private String[] T00F2118_A130BarCodPar ;
   private boolean[] T00F2118_n130BarCodPar ;
   private short[] T00F2118_A1468AlbPrdLin ;
   private String[] T00F2119_A396EmprCod ;
   private boolean[] T00F2119_n396EmprCod ;
   private int[] T00F2119_A129BarCod ;
   private boolean[] T00F2119_n129BarCod ;
   private byte[] T00F2119_A132BarCodReo ;
   private boolean[] T00F2119_n132BarCodReo ;
   private String[] T00F2119_A130BarCodPar ;
   private boolean[] T00F2119_n130BarCodPar ;
   private String[] T00F2119_A758ProCod ;
   private boolean[] T00F2119_n758ProCod ;
   private short[] T00F2119_A194BarOrdLin ;
   private short[] T00F2119_A1664ParFasCod ;
   private String[] T00F2120_A396EmprCod ;
   private boolean[] T00F2120_n396EmprCod ;
   private int[] T00F2120_A129BarCod ;
   private boolean[] T00F2120_n129BarCod ;
   private byte[] T00F2120_A132BarCodReo ;
   private boolean[] T00F2120_n132BarCodReo ;
   private String[] T00F2120_A130BarCodPar ;
   private boolean[] T00F2120_n130BarCodPar ;
   private String[] T00F2120_A758ProCod ;
   private boolean[] T00F2120_n758ProCod ;
   private String[] T00F26_A1785BarFasAnt ;
   private boolean[] T00F26_n1785BarFasAnt ;
   private int[] T00F2123_A129BarCod ;
   private boolean[] T00F2123_n129BarCod ;
   private byte[] T00F2123_A132BarCodReo ;
   private boolean[] T00F2123_n132BarCodReo ;
   private String[] T00F2123_A130BarCodPar ;
   private boolean[] T00F2123_n130BarCodPar ;
   private String[] T00F2123_A758ProCod ;
   private boolean[] T00F2123_n758ProCod ;
   private short[] T00F2123_A194BarOrdLin ;
   private String[] T00F2123_A458FasCon ;
   private boolean[] T00F2123_n458FasCon ;
   private String[] T00F2123_A152BarFasCon ;
   private byte[] T00F2123_A153BarFasEst ;
   private java.math.BigDecimal[] T00F2123_A459FasDec ;
   private boolean[] T00F2123_n459FasDec ;
   private String[] T00F2123_A602MaqCod ;
   private boolean[] T00F2123_n602MaqCod ;
   private String[] T00F2123_A456FasActTin ;
   private boolean[] T00F2123_n456FasActTin ;
   private String[] T00F2123_A150BarFacTin ;
   private java.util.Date[] T00F2123_A162BarFecTeo ;
   private java.util.Date[] T00F2123_A160BarFecRea ;
   private java.math.BigDecimal[] T00F2123_A216BarTieTeo ;
   private java.math.BigDecimal[] T00F2123_A227BarUni ;
   private String[] T00F2123_A179BarLoc ;
   private short[] T00F2123_A165BarHorIni ;
   private short[] T00F2123_A164BarHorFin ;
   private java.math.BigDecimal[] T00F2123_A215BarTieRea ;
   private java.util.Date[] T00F2123_A3298BarFecRIni ;
   private String[] T00F2123_A396EmprCod ;
   private boolean[] T00F2123_n396EmprCod ;
   private String[] T00F2123_A457FasCod ;
   private String[] T00F2123_A603MaqCodBis ;
   private String[] T00F2123_A1785BarFasAnt ;
   private boolean[] T00F2123_n1785BarFasAnt ;
   private String[] T00F27_A458FasCon ;
   private boolean[] T00F27_n458FasCon ;
   private java.math.BigDecimal[] T00F27_A459FasDec ;
   private boolean[] T00F27_n459FasDec ;
   private String[] T00F27_A602MaqCod ;
   private boolean[] T00F27_n602MaqCod ;
   private String[] T00F27_A456FasActTin ;
   private boolean[] T00F27_n456FasActTin ;
   private String[] T00F28_A396EmprCod ;
   private boolean[] T00F28_n396EmprCod ;
   private String[] T00F2124_A458FasCon ;
   private boolean[] T00F2124_n458FasCon ;
   private java.math.BigDecimal[] T00F2124_A459FasDec ;
   private boolean[] T00F2124_n459FasDec ;
   private String[] T00F2124_A602MaqCod ;
   private boolean[] T00F2124_n602MaqCod ;
   private String[] T00F2124_A456FasActTin ;
   private boolean[] T00F2124_n456FasActTin ;
   private String[] T00F2125_A396EmprCod ;
   private boolean[] T00F2125_n396EmprCod ;
   private String[] T00F2126_A396EmprCod ;
   private boolean[] T00F2126_n396EmprCod ;
   private int[] T00F2126_A129BarCod ;
   private boolean[] T00F2126_n129BarCod ;
   private byte[] T00F2126_A132BarCodReo ;
   private boolean[] T00F2126_n132BarCodReo ;
   private String[] T00F2126_A130BarCodPar ;
   private boolean[] T00F2126_n130BarCodPar ;
   private String[] T00F2126_A758ProCod ;
   private boolean[] T00F2126_n758ProCod ;
   private short[] T00F2126_A194BarOrdLin ;
   private int[] T00F23_A129BarCod ;
   private boolean[] T00F23_n129BarCod ;
   private byte[] T00F23_A132BarCodReo ;
   private boolean[] T00F23_n132BarCodReo ;
   private String[] T00F23_A130BarCodPar ;
   private boolean[] T00F23_n130BarCodPar ;
   private String[] T00F23_A758ProCod ;
   private boolean[] T00F23_n758ProCod ;
   private short[] T00F23_A194BarOrdLin ;
   private String[] T00F23_A152BarFasCon ;
   private byte[] T00F23_A153BarFasEst ;
   private String[] T00F23_A150BarFacTin ;
   private java.util.Date[] T00F23_A162BarFecTeo ;
   private java.util.Date[] T00F23_A160BarFecRea ;
   private java.math.BigDecimal[] T00F23_A216BarTieTeo ;
   private java.math.BigDecimal[] T00F23_A227BarUni ;
   private String[] T00F23_A179BarLoc ;
   private short[] T00F23_A165BarHorIni ;
   private short[] T00F23_A164BarHorFin ;
   private java.math.BigDecimal[] T00F23_A215BarTieRea ;
   private java.util.Date[] T00F23_A3298BarFecRIni ;
   private String[] T00F23_A396EmprCod ;
   private boolean[] T00F23_n396EmprCod ;
   private String[] T00F23_A457FasCod ;
   private String[] T00F23_A603MaqCodBis ;
   private int[] T00F22_A129BarCod ;
   private boolean[] T00F22_n129BarCod ;
   private byte[] T00F22_A132BarCodReo ;
   private boolean[] T00F22_n132BarCodReo ;
   private String[] T00F22_A130BarCodPar ;
   private boolean[] T00F22_n130BarCodPar ;
   private String[] T00F22_A758ProCod ;
   private boolean[] T00F22_n758ProCod ;
   private short[] T00F22_A194BarOrdLin ;
   private String[] T00F22_A152BarFasCon ;
   private byte[] T00F22_A153BarFasEst ;
   private String[] T00F22_A150BarFacTin ;
   private java.util.Date[] T00F22_A162BarFecTeo ;
   private java.util.Date[] T00F22_A160BarFecRea ;
   private java.math.BigDecimal[] T00F22_A216BarTieTeo ;
   private java.math.BigDecimal[] T00F22_A227BarUni ;
   private String[] T00F22_A179BarLoc ;
   private short[] T00F22_A165BarHorIni ;
   private short[] T00F22_A164BarHorFin ;
   private java.math.BigDecimal[] T00F22_A215BarTieRea ;
   private java.util.Date[] T00F22_A3298BarFecRIni ;
   private String[] T00F22_A396EmprCod ;
   private boolean[] T00F22_n396EmprCod ;
   private String[] T00F22_A457FasCod ;
   private String[] T00F22_A603MaqCodBis ;
   private String[] T00F2130_A458FasCon ;
   private boolean[] T00F2130_n458FasCon ;
   private java.math.BigDecimal[] T00F2130_A459FasDec ;
   private boolean[] T00F2130_n459FasDec ;
   private String[] T00F2130_A602MaqCod ;
   private boolean[] T00F2130_n602MaqCod ;
   private String[] T00F2130_A456FasActTin ;
   private boolean[] T00F2130_n456FasActTin ;
   private String[] T00F2131_A396EmprCod ;
   private boolean[] T00F2131_n396EmprCod ;
   private int[] T00F2131_A129BarCod ;
   private boolean[] T00F2131_n129BarCod ;
   private byte[] T00F2131_A132BarCodReo ;
   private boolean[] T00F2131_n132BarCodReo ;
   private String[] T00F2131_A130BarCodPar ;
   private boolean[] T00F2131_n130BarCodPar ;
   private String[] T00F2131_A758ProCod ;
   private boolean[] T00F2131_n758ProCod ;
   private short[] T00F2131_A194BarOrdLin ;
   private short[] T00F2131_A12517SolAfLn ;
   private String[] T00F2132_A396EmprCod ;
   private boolean[] T00F2132_n396EmprCod ;
   private int[] T00F2132_A129BarCod ;
   private boolean[] T00F2132_n129BarCod ;
   private byte[] T00F2132_A132BarCodReo ;
   private boolean[] T00F2132_n132BarCodReo ;
   private String[] T00F2132_A130BarCodPar ;
   private boolean[] T00F2132_n130BarCodPar ;
   private String[] T00F2132_A758ProCod ;
   private boolean[] T00F2132_n758ProCod ;
   private short[] T00F2132_A194BarOrdLin ;
   private short[] T00F2132_A12516SolLzLn ;
   private String[] T00F2133_A396EmprCod ;
   private boolean[] T00F2133_n396EmprCod ;
   private int[] T00F2133_A129BarCod ;
   private boolean[] T00F2133_n129BarCod ;
   private byte[] T00F2133_A132BarCodReo ;
   private boolean[] T00F2133_n132BarCodReo ;
   private String[] T00F2133_A130BarCodPar ;
   private boolean[] T00F2133_n130BarCodPar ;
   private String[] T00F2133_A758ProCod ;
   private boolean[] T00F2133_n758ProCod ;
   private short[] T00F2133_A194BarOrdLin ;
   private short[] T00F2133_A12515SolPlLn ;
   private String[] T00F2134_A396EmprCod ;
   private boolean[] T00F2134_n396EmprCod ;
   private int[] T00F2134_A129BarCod ;
   private boolean[] T00F2134_n129BarCod ;
   private byte[] T00F2134_A132BarCodReo ;
   private boolean[] T00F2134_n132BarCodReo ;
   private String[] T00F2134_A130BarCodPar ;
   private boolean[] T00F2134_n130BarCodPar ;
   private String[] T00F2134_A758ProCod ;
   private boolean[] T00F2134_n758ProCod ;
   private short[] T00F2134_A194BarOrdLin ;
   private short[] T00F2134_A12514SolSAlLn ;
   private String[] T00F2135_A396EmprCod ;
   private boolean[] T00F2135_n396EmprCod ;
   private int[] T00F2135_A129BarCod ;
   private boolean[] T00F2135_n129BarCod ;
   private byte[] T00F2135_A132BarCodReo ;
   private boolean[] T00F2135_n132BarCodReo ;
   private String[] T00F2135_A130BarCodPar ;
   private boolean[] T00F2135_n130BarCodPar ;
   private String[] T00F2135_A758ProCod ;
   private boolean[] T00F2135_n758ProCod ;
   private short[] T00F2135_A194BarOrdLin ;
   private short[] T00F2135_A12513SolSAcLn ;
   private String[] T00F2136_A396EmprCod ;
   private boolean[] T00F2136_n396EmprCod ;
   private int[] T00F2136_A129BarCod ;
   private boolean[] T00F2136_n129BarCod ;
   private byte[] T00F2136_A132BarCodReo ;
   private boolean[] T00F2136_n132BarCodReo ;
   private String[] T00F2136_A130BarCodPar ;
   private boolean[] T00F2136_n130BarCodPar ;
   private String[] T00F2136_A758ProCod ;
   private boolean[] T00F2136_n758ProCod ;
   private short[] T00F2136_A194BarOrdLin ;
   private short[] T00F2136_A12512SolFrLn ;
   private String[] T00F2137_A396EmprCod ;
   private boolean[] T00F2137_n396EmprCod ;
   private int[] T00F2137_A129BarCod ;
   private boolean[] T00F2137_n129BarCod ;
   private byte[] T00F2137_A132BarCodReo ;
   private boolean[] T00F2137_n132BarCodReo ;
   private String[] T00F2137_A130BarCodPar ;
   private boolean[] T00F2137_n130BarCodPar ;
   private String[] T00F2137_A758ProCod ;
   private boolean[] T00F2137_n758ProCod ;
   private short[] T00F2137_A194BarOrdLin ;
   private short[] T00F2137_A12511SolAgLn ;
   private String[] T00F2138_A396EmprCod ;
   private boolean[] T00F2138_n396EmprCod ;
   private int[] T00F2138_A129BarCod ;
   private boolean[] T00F2138_n129BarCod ;
   private byte[] T00F2138_A132BarCodReo ;
   private boolean[] T00F2138_n132BarCodReo ;
   private String[] T00F2138_A130BarCodPar ;
   private boolean[] T00F2138_n130BarCodPar ;
   private String[] T00F2138_A758ProCod ;
   private boolean[] T00F2138_n758ProCod ;
   private short[] T00F2138_A194BarOrdLin ;
   private short[] T00F2138_A12510SolLvLn ;
   private String[] T00F2139_A396EmprCod ;
   private boolean[] T00F2139_n396EmprCod ;
   private int[] T00F2139_A129BarCod ;
   private boolean[] T00F2139_n129BarCod ;
   private byte[] T00F2139_A132BarCodReo ;
   private boolean[] T00F2139_n132BarCodReo ;
   private String[] T00F2139_A130BarCodPar ;
   private boolean[] T00F2139_n130BarCodPar ;
   private String[] T00F2139_A758ProCod ;
   private boolean[] T00F2139_n758ProCod ;
   private short[] T00F2139_A194BarOrdLin ;
   private int[] T00F2139_A10781BarFasNb ;
   private String[] T00F2140_A396EmprCod ;
   private boolean[] T00F2140_n396EmprCod ;
   private int[] T00F2140_A129BarCod ;
   private boolean[] T00F2140_n129BarCod ;
   private byte[] T00F2140_A132BarCodReo ;
   private boolean[] T00F2140_n132BarCodReo ;
   private String[] T00F2140_A130BarCodPar ;
   private boolean[] T00F2140_n130BarCodPar ;
   private String[] T00F2140_A758ProCod ;
   private boolean[] T00F2140_n758ProCod ;
   private short[] T00F2140_A194BarOrdLin ;
   private String[] T00F2140_A719PrdNum ;
   private String[] T00F2141_A396EmprCod ;
   private boolean[] T00F2141_n396EmprCod ;
   private int[] T00F2141_A129BarCod ;
   private boolean[] T00F2141_n129BarCod ;
   private byte[] T00F2141_A132BarCodReo ;
   private boolean[] T00F2141_n132BarCodReo ;
   private String[] T00F2141_A130BarCodPar ;
   private boolean[] T00F2141_n130BarCodPar ;
   private String[] T00F2141_A758ProCod ;
   private boolean[] T00F2141_n758ProCod ;
   private short[] T00F2141_A194BarOrdLin ;
   private String[] T00F2141_A9966Em_cod ;
   private String[] T00F2142_A396EmprCod ;
   private boolean[] T00F2142_n396EmprCod ;
   private int[] T00F2142_A129BarCod ;
   private boolean[] T00F2142_n129BarCod ;
   private byte[] T00F2142_A132BarCodReo ;
   private boolean[] T00F2142_n132BarCodReo ;
   private String[] T00F2142_A130BarCodPar ;
   private boolean[] T00F2142_n130BarCodPar ;
   private String[] T00F2142_A758ProCod ;
   private boolean[] T00F2142_n758ProCod ;
   private short[] T00F2142_A194BarOrdLin ;
   private String[] T00F2142_A9940Ab_cod ;
   private String[] T00F2143_A396EmprCod ;
   private boolean[] T00F2143_n396EmprCod ;
   private int[] T00F2143_A129BarCod ;
   private boolean[] T00F2143_n129BarCod ;
   private byte[] T00F2143_A132BarCodReo ;
   private boolean[] T00F2143_n132BarCodReo ;
   private String[] T00F2143_A130BarCodPar ;
   private boolean[] T00F2143_n130BarCodPar ;
   private String[] T00F2143_A758ProCod ;
   private boolean[] T00F2143_n758ProCod ;
   private short[] T00F2143_A194BarOrdLin ;
   private String[] T00F2143_A9911Ca_cod ;
   private String[] T00F2144_A396EmprCod ;
   private boolean[] T00F2144_n396EmprCod ;
   private int[] T00F2144_A129BarCod ;
   private boolean[] T00F2144_n129BarCod ;
   private byte[] T00F2144_A132BarCodReo ;
   private boolean[] T00F2144_n132BarCodReo ;
   private String[] T00F2144_A130BarCodPar ;
   private boolean[] T00F2144_n130BarCodPar ;
   private String[] T00F2144_A758ProCod ;
   private boolean[] T00F2144_n758ProCod ;
   private short[] T00F2144_A194BarOrdLin ;
   private String[] T00F2144_A9878Pe_cod ;
   private String[] T00F2145_A396EmprCod ;
   private boolean[] T00F2145_n396EmprCod ;
   private int[] T00F2145_A129BarCod ;
   private boolean[] T00F2145_n129BarCod ;
   private byte[] T00F2145_A132BarCodReo ;
   private boolean[] T00F2145_n132BarCodReo ;
   private String[] T00F2145_A130BarCodPar ;
   private boolean[] T00F2145_n130BarCodPar ;
   private String[] T00F2145_A758ProCod ;
   private boolean[] T00F2145_n758ProCod ;
   private short[] T00F2145_A194BarOrdLin ;
   private String[] T00F2145_A9870Rm_cod ;
   private String[] T00F2146_A396EmprCod ;
   private boolean[] T00F2146_n396EmprCod ;
   private int[] T00F2146_A129BarCod ;
   private boolean[] T00F2146_n129BarCod ;
   private byte[] T00F2146_A132BarCodReo ;
   private boolean[] T00F2146_n132BarCodReo ;
   private String[] T00F2146_A130BarCodPar ;
   private boolean[] T00F2146_n130BarCodPar ;
   private String[] T00F2146_A758ProCod ;
   private boolean[] T00F2146_n758ProCod ;
   private short[] T00F2146_A194BarOrdLin ;
   private short[] T00F2146_A7934Dtb_Ordl ;
   private String[] T00F2147_A396EmprCod ;
   private boolean[] T00F2147_n396EmprCod ;
   private int[] T00F2147_A129BarCod ;
   private boolean[] T00F2147_n129BarCod ;
   private byte[] T00F2147_A132BarCodReo ;
   private boolean[] T00F2147_n132BarCodReo ;
   private String[] T00F2147_A130BarCodPar ;
   private boolean[] T00F2147_n130BarCodPar ;
   private String[] T00F2147_A758ProCod ;
   private boolean[] T00F2147_n758ProCod ;
   private short[] T00F2147_A194BarOrdLin ;
   private short[] T00F2147_A5371FasQuiLin ;
   private String[] T00F2148_A396EmprCod ;
   private boolean[] T00F2148_n396EmprCod ;
   private int[] T00F2148_A129BarCod ;
   private boolean[] T00F2148_n129BarCod ;
   private byte[] T00F2148_A132BarCodReo ;
   private boolean[] T00F2148_n132BarCodReo ;
   private String[] T00F2148_A130BarCodPar ;
   private boolean[] T00F2148_n130BarCodPar ;
   private String[] T00F2148_A758ProCod ;
   private boolean[] T00F2148_n758ProCod ;
   private short[] T00F2148_A194BarOrdLin ;
   private int[] T00F2148_A4940A_Barcod ;
   private byte[] T00F2148_A4941A_BarReo ;
   private String[] T00F2148_A4942A_BarPar ;
   private String[] T00F2148_A4943A_ProCod ;
   private short[] T00F2148_A4944A_BarOrd ;
   private String[] T00F2149_A396EmprCod ;
   private boolean[] T00F2149_n396EmprCod ;
   private int[] T00F2149_A129BarCod ;
   private boolean[] T00F2149_n129BarCod ;
   private byte[] T00F2149_A132BarCodReo ;
   private boolean[] T00F2149_n132BarCodReo ;
   private String[] T00F2149_A130BarCodPar ;
   private boolean[] T00F2149_n130BarCodPar ;
   private String[] T00F2149_A758ProCod ;
   private boolean[] T00F2149_n758ProCod ;
   private short[] T00F2149_A194BarOrdLin ;
   private int[] T00F2149_A4643BarFasLot ;
   private String[] T00F2150_A396EmprCod ;
   private boolean[] T00F2150_n396EmprCod ;
   private int[] T00F2150_A129BarCod ;
   private boolean[] T00F2150_n129BarCod ;
   private byte[] T00F2150_A132BarCodReo ;
   private boolean[] T00F2150_n132BarCodReo ;
   private String[] T00F2150_A130BarCodPar ;
   private boolean[] T00F2150_n130BarCodPar ;
   private String[] T00F2150_A758ProCod ;
   private boolean[] T00F2150_n758ProCod ;
   private short[] T00F2150_A194BarOrdLin ;
   private int[] T00F2150_A4031CCTCod ;
   private String[] T00F2151_A396EmprCod ;
   private boolean[] T00F2151_n396EmprCod ;
   private int[] T00F2151_A129BarCod ;
   private boolean[] T00F2151_n129BarCod ;
   private byte[] T00F2151_A132BarCodReo ;
   private boolean[] T00F2151_n132BarCodReo ;
   private String[] T00F2151_A130BarCodPar ;
   private boolean[] T00F2151_n130BarCodPar ;
   private String[] T00F2151_A758ProCod ;
   private boolean[] T00F2151_n758ProCod ;
   private short[] T00F2151_A194BarOrdLin ;
   private short[] T00F2151_A1664ParFasCod ;
   private String[] T00F2152_A396EmprCod ;
   private boolean[] T00F2152_n396EmprCod ;
   private int[] T00F2152_A129BarCod ;
   private boolean[] T00F2152_n129BarCod ;
   private byte[] T00F2152_A132BarCodReo ;
   private boolean[] T00F2152_n132BarCodReo ;
   private String[] T00F2152_A130BarCodPar ;
   private boolean[] T00F2152_n130BarCodPar ;
   private String[] T00F2152_A758ProCod ;
   private boolean[] T00F2152_n758ProCod ;
   private short[] T00F2152_A194BarOrdLin ;
   private String[] T00F2153_A396EmprCod ;
   private boolean[] T00F2153_n396EmprCod ;
   private String[] T00F2154_A396EmprCod ;
   private boolean[] T00F2154_n396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfaslec__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaslec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaslec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaslec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaslec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00F22", "SELECT BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, EmprCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, FasCod, MaqCodBis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F23", "SELECT BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, EmprCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F26", "SELECT COALESCE( T1.BarFasAnt, '        ') AS BarFasAnt FROM (SELECT MIN(T2.FasCod) AS BarFasAnt FROM TXPBARFAS T2,  (SELECT MAX(BarOrdLin) AS GXC1 FROM TXPBARFAS WHERE (BarOrdLin >= 0) AND (BarOrdLin < ?) AND (BarFasEst <> 0) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) ) T3 WHERE T2.BarOrdLin = T3.GXC1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F27", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F28", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F210", "SELECT COALESCE( T1.MaxOrdFas, 0) AS MaxOrdFas FROM (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F212", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F213", "SELECT BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?  FOR UPDATE OF ProFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F214", "SELECT BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F215", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F216", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarColNom, BarColNum, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarColNom, BarColNum, BarSer, BarSit, BarAgrEst, BarTipArt, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F217", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarColNom, BarColNum, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F218", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F219", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F220", "SELECT EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F221", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F223", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.CliCod, T3.CliNom, TM1.BarColNom, TM1.BarColNum, TM1.BarSer, TM1.BarSit, TM1.BarAgrEst, T2.EmprNom, TM1.DisDes, TM1.EmprCod, TM1.BarTipArt AS BarTipArt, COALESCE( T4.MaxOrdFas, 0) AS MaxOrdFas FROM (((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F224", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F225", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F226", "SELECT EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F227", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F229", "SELECT COALESCE( T1.MaxOrdFas, 0) AS MaxOrdFas FROM (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F230", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F231", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F232", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00F233", "INSERT INTO TXPBARCAD(CliCod, DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarColNom, BarColNum, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, BarVolMaq, BarDisNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00F234", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarColNom=?, BarColNum=?, BarSer=?, BarSit=?, BarAgrEst=?, BarTipArt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00F235", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T00F236", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F238", "SELECT COALESCE( T1.MaxOrdFas, 0) AS MaxOrdFas FROM (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F239", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F240", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F241", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F242", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F243", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F244", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F245", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F246", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F247", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F248", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F249", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F250", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F251", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F252", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F253", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F254", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F255", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F256", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F257", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F258", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F259", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F260", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F261", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F262", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F263", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F264", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F265", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F266", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F267", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F268", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F269", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F270", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F271", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F272", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F273", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F274", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F275", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F276", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F277", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F278", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F279", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F280", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F281", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F282", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F283", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F284", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F285", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F286", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F287", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F288", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F289", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F290", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F291", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F292", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F293", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F294", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F295", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F296", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F297", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F298", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F299", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2100", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2101", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2102", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2103", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00F2104", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T00F2105", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2107", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProFasLin, T1.EmprCod, T1.ProCod, COALESCE( T3.ProFasEst, 0) AS ProFasEst FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2108", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2110", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2111", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00F2112", "INSERT INTO TXPBARPRO(BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARPRO")
         ,new UpdateCursor("T00F2113", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK, "TXPBARPRO")
         ,new UpdateCursor("T00F2114", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK, "TXPBARPRO")
         ,new ForEachCursor("T00F2115", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2117", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2118", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2119", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2120", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2123", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T3.FasCon, T1.BarFasCon, T1.BarFasEst, T3.FasDec, T3.MaqCod, T3.FasActTin, T1.BarFacTin, T1.BarFecTeo, T1.BarFecRea, T1.BarTieTeo, T1.BarUni, T1.BarLoc, T1.BarHorIni, T1.BarHorFin, T1.BarTieRea, T1.BarFecRIni, T1.EmprCod, T1.FasCod, T1.MaqCodBis, COALESCE( T2.BarFasAnt, '        ') AS BarFasAnt FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod),  (SELECT MIN(T4.FasCod) AS BarFasAnt FROM TXPBARFAS T4,  (SELECT MAX(BarOrdLin) AS GXC1 FROM TXPBARFAS WHERE (BarOrdLin >= 0) AND (BarOrdLin < ?) AND (BarFasEst <> 0) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) ) T5 WHERE T4.BarOrdLin = T5.GXC1 ) T2 WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2124", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2125", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2126", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00F2127", "INSERT INTO TXPBARFAS(BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, EmprCod, FasCod, MaqCodBis, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00F2128", "UPDATE TXPBARFAS SET BarFasCon=?, BarFasEst=?, BarFacTin=?, BarFecTeo=?, BarFecRea=?, BarTieTeo=?, BarUni=?, BarLoc=?, BarHorIni=?, BarHorFin=?, BarTieRea=?, BarFecRIni=?, FasCod=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00F2129", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00F2130", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2132", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2133", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2134", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2135", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2136", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2137", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2138", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2139", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2140", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2141", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2142", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2143", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2144", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2145", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2146", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2147", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2148", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2149", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2150", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2151", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00F2152", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2153", "SELECT EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00F2154", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((String[]) buf[17])[0] = rslt.getString(16, 3);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 36 :
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
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 97 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 99 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 105 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 109 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[20])[0] = rslt.getString(17, 10);
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 3);
               ((String[]) buf[26])[0] = rslt.getString(23, 8);
               ((String[]) buf[27])[0] = rslt.getString(24, 6);
               ((String[]) buf[28])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 127 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 132 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 133 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 134 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 135 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 136 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 137 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 138 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 139 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 140 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
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
               stmt.setString(2, (String)parms[2], 8);
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
               stmt.setString(2, (String)parms[2], 6);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 13 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 6);
               stmt.setString(9, (String)parms[12], 13);
               stmt.setInt(10, ((Number) parms[13]).intValue());
               stmt.setString(11, (String)parms[14], 16);
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 1);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[18], 3);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[20]).shortValue());
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 6);
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 16);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[20], 1);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
            case 79 :
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
               return;
            case 82 :
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
            case 83 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 97 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 98 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               return;
            case 99 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 100 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 101 :
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               return;
            case 102 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               return;
            case 103 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 104 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               return;
            case 105 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 106 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 107 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 108 :
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
            case 109 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 8);
               }
               stmt.setShort(12, ((Number) parms[16]).shortValue());
               return;
            case 110 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
            case 111 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 6);
               return;
            case 112 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 113 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               stmt.setString(6, (String)parms[9], 1);
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setDate(9, (java.util.Date)parms[12]);
               stmt.setDate(10, (java.util.Date)parms[13]);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(13, (String)parms[16], 10);
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               stmt.setShort(15, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[19], 2);
               stmt.setDate(17, (java.util.Date)parms[20]);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[22], 3);
               }
               stmt.setString(19, (String)parms[23], 8);
               stmt.setString(20, (String)parms[24], 6);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 6);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[23], 8);
               }
               stmt.setShort(20, ((Number) parms[24]).shortValue());
               return;
            case 115 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 116 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
            case 117 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 118 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 119 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 121 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 122 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 123 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 124 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 125 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 126 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 127 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 128 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 129 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 130 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 131 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 132 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 133 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 134 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 135 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 136 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 137 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 138 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               return;
            case 139 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               return;
            case 140 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 6);
               return;
      }
   }

}

