package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmenv_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14154MEnvMaqCod = httpContext.GetPar( "MEnvMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A14154MEnvMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A1664ParFasCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MEnv", ""), (short)(0)) ;
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

   public tmenv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmenv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmenv_impl.class ));
   }

   public tmenv_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMEnvEst = new HTMLChoice();
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
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMEnv.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Orden", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvOrd_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvMaqCod_Internalname, GXutil.rtrim( A14154MEnvMaqCod), GXutil.rtrim( localUtil.format( A14154MEnvMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvMaqDsc_Internalname, GXutil.rtrim( A14164MEnvMaqDsc), GXutil.rtrim( localUtil.format( A14164MEnvMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Inicio", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMEnvIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvIni_Internalname, localUtil.ttoc( A14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvIni_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvIni_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEnv.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fin", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMEnvFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvFin_Internalname, localUtil.ttoc( A14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14157MEnvFin, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvFin_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvFin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEnv.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMEnvEst, cmbMEnvEst.getInternalname(), GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)), 1, cmbMEnvEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbMEnvEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TMEnv.htm");
      cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Intervalor", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14162MEnvInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvInt_Enabled!=0) ? localUtil.format( A14162MEnvInt, "ZZZZZZ9.99") : localUtil.format( A14162MEnvInt, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvInt_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvInt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEnv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1894 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1894 = (short)(1) ;
            scanStart1UE1894( ) ;
            while ( RcdFound1894 != 0 )
            {
               init_level_properties1894( ) ;
               getByPrimaryKey1UE1894( ) ;
               addRow1UE1894( ) ;
               scanNext1UE1894( ) ;
            }
            scanEnd1UE1894( ) ;
            nBlankRcdCount1894 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1UE1894( ) ;
         standaloneModal1UE1894( ) ;
         sMode1894 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow1UE1894( ) ;
            edtavnRcdDeleted_1894_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1894_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1894_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1894_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMPEnvPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVPLC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMPEnvVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVVAL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1894 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UE1894( ) ;
            }
            sendRow1UE1894( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1894 = (short)(5) ;
         nRcdExists_1894 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UE1894( ) ;
            while ( RcdFound1894 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851894( ) ;
               init_level_properties1894( ) ;
               standaloneNotModal1UE1894( ) ;
               getByPrimaryKey1UE1894( ) ;
               standaloneModal1UE1894( ) ;
               addRow1UE1894( ) ;
               scanNext1UE1894( ) ;
            }
            scanEnd1UE1894( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1894 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851894( ) ;
      initAll1UE1894( ) ;
      init_level_properties1894( ) ;
      nRcdExists_1894 = (short)(0) ;
      nIsMod_1894 = (short)(0) ;
      nRcdDeleted_1894 = (short)(0) ;
      nBlankRcdCount1894 = (short)(nBlankRcdUsr1894+nBlankRcdCount1894) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1894 > 0 )
      {
         standaloneNotModal1UE1894( ) ;
         standaloneModal1UE1894( ) ;
         addRow1UE1894( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtParFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1894 = (short)(nBlankRcdCount1894-1) ;
      }
      Gx_mode = sMode1894 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEnv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMEnv.htm");
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
      e111UE2 ();
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
            Z14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14152MEnvOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14158MEnvIni = localUtil.ctot( httpContext.cgiGet( "Z14158MEnvIni"), 0) ;
            Z14157MEnvFin = localUtil.ctot( httpContext.cgiGet( "Z14157MEnvFin"), 0) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z14154MEnvMaqCod = httpContext.cgiGet( "Z14154MEnvMaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MENVORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMEnvOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14152MEnvOrd = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            }
            else
            {
               A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            }
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A14154MEnvMaqCod = httpContext.cgiGet( edtMEnvMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
            A14164MEnvMaqDsc = httpContext.cgiGet( edtMEnvMaqDsc_Internalname) ;
            n14164MEnvMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMEnvIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MENVINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMEnvIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14158MEnvIni = localUtil.ctot( httpContext.cgiGet( edtMEnvIni_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMEnvFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MENVFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMEnvFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14157MEnvFin = localUtil.ctot( httpContext.cgiGet( edtMEnvFin_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            cmbMEnvEst.setName( cmbMEnvEst.getInternalname() );
            cmbMEnvEst.setValue( httpContext.cgiGet( cmbMEnvEst.getInternalname()) );
            A14156MEnvEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbMEnvEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
            A14162MEnvInt = localUtil.ctond( httpContext.cgiGet( edtMEnvInt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
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
               A14152MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
                        e111UE2 ();
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
            initAll1UE1893( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1894_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1894_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributes1UE1893( ) ;
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

   public void confirm_1UE0( )
   {
      beforeValidate1UE1893( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UE1893( ) ;
         }
         else
         {
            checkExtendedTable1UE1893( ) ;
            if ( AnyError == 0 )
            {
               zm1UE1893( 4) ;
               zm1UE1893( 5) ;
               zm1UE1893( 6) ;
            }
            closeExtendedTableCursors1UE1893( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1893 = Gx_mode ;
         confirm_1UE1894( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1893 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1UE0( ) ;
      }
   }

   public void confirm_1UE1894( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1UE1894( ) ;
         if ( ( nRcdExists_1894 != 0 ) || ( nIsMod_1894 != 0 ) )
         {
            getKey1UE1894( ) ;
            if ( ( nRcdExists_1894 == 0 ) && ( nRcdDeleted_1894 == 0 ) )
            {
               if ( RcdFound1894 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UE1894( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UE1894( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1UE1894( 8) ;
                     }
                     closeExtendedTableCursors1UE1894( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1894 != 0 )
               {
                  if ( nRcdDeleted_1894 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UE1894( ) ;
                     load1UE1894( ) ;
                     beforeValidate1UE1894( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UE1894( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1894 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UE1894( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UE1894( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1UE1894( 8) ;
                           }
                           closeExtendedTableCursors1UE1894( ) ;
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
                  if ( nRcdDeleted_1894 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1894_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtMPEnvPLC_Internalname, A14160MPEnvPLC) ;
         httpContext.changePostValue( edtMPEnvVal_Internalname, GXutil.rtrim( A14161MPEnvVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_85_idx, Z14160MPEnvPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_85_idx, GXutil.rtrim( Z14161MPEnvVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1894 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1894_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1894_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVPLC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVVAL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UE0( )
   {
   }

   public void e111UE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmenv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tmenv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmenv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmenv_impl.this.A396EmprCod = GXv_char2[0] ;
      tmenv_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmenv_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1UE1893( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14158MEnvIni = T01UE6_A14158MEnvIni[0] ;
            Z14157MEnvFin = T01UE6_A14157MEnvFin[0] ;
            Z457FasCod = T01UE6_A457FasCod[0] ;
            Z14154MEnvMaqCod = T01UE6_A14154MEnvMaqCod[0] ;
         }
         else
         {
            Z14158MEnvIni = A14158MEnvIni ;
            Z14157MEnvFin = A14157MEnvFin ;
            Z457FasCod = A457FasCod ;
            Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14158MEnvIni = A14158MEnvIni ;
         Z14157MEnvFin = A14157MEnvFin ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         Z460FasDsc = A460FasDsc ;
         Z14164MEnvMaqDsc = A14164MEnvMaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TMEnv" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
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

   public void load1UE1893( )
   {
      /* Using cursor T01UE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A460FasDsc = T01UE10_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A14164MEnvMaqDsc = T01UE10_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01UE10_n14164MEnvMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
         A14158MEnvIni = T01UE10_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01UE10_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A457FasCod = T01UE10_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A14154MEnvMaqCod = T01UE10_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         zm1UE1893( -3) ;
      }
      pr_default.close(8);
      onLoadActions1UE1893( ) ;
   }

   public void onLoadActions1UE1893( )
   {
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void checkExtendedTable1UE1893( )
   {
      nIsDirty_1893 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01UE7_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(5);
      /* Using cursor T01UE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMEnvMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01UE9_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01UE9_n14164MEnvMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      pr_default.close(7);
      /* Using cursor T01UE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void closeExtendedTableCursors1UE1893( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01UE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01UE11_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_6( String A396EmprCod ,
                         String A14154MEnvMaqCod )
   {
      /* Using cursor T01UE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMEnvMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01UE12_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01UE12_n14164MEnvMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14164MEnvMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_5( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01UE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
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

   public void getKey1UE1893( )
   {
      /* Using cursor T01UE14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1893 = (short)(1) ;
      }
      else
      {
         RcdFound1893 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01UE6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1UE1893( 3) ;
         RcdFound1893 = (short)(1) ;
         A14152MEnvOrd = T01UE6_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         A14158MEnvIni = T01UE6_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01UE6_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A457FasCod = T01UE6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A129BarCod = T01UE6_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UE6_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UE6_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14154MEnvMaqCod = T01UE6_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1UE1893( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1893 = (short)(0) ;
            initializeNonKey1UE1893( ) ;
         }
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1893 = (short)(0) ;
         initializeNonKey1UE1893( ) ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1UE1893( ) ;
      if ( RcdFound1893 == 0 )
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
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01UE15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A14152MEnvOrd), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01UE15_A129BarCod[0] < A129BarCod ) || ( T01UE15_A129BarCod[0] == A129BarCod ) && ( T01UE15_A132BarCodReo[0] < A132BarCodReo ) || ( T01UE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UE15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01UE15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE15_A129BarCod[0] == A129BarCod ) && ( T01UE15_A14152MEnvOrd[0] < A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UE15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01UE15_A129BarCod[0] > A129BarCod ) || ( T01UE15_A129BarCod[0] == A129BarCod ) && ( T01UE15_A132BarCodReo[0] > A132BarCodReo ) || ( T01UE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UE15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01UE15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE15_A129BarCod[0] == A129BarCod ) && ( T01UE15_A14152MEnvOrd[0] > A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UE15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01UE15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01UE15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01UE15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01UE15_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01UE16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A14152MEnvOrd), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01UE16_A129BarCod[0] > A129BarCod ) || ( T01UE16_A129BarCod[0] == A129BarCod ) && ( T01UE16_A132BarCodReo[0] > A132BarCodReo ) || ( T01UE16_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UE16_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01UE16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UE16_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE16_A129BarCod[0] == A129BarCod ) && ( T01UE16_A14152MEnvOrd[0] > A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UE16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01UE16_A129BarCod[0] < A129BarCod ) || ( T01UE16_A129BarCod[0] == A129BarCod ) && ( T01UE16_A132BarCodReo[0] < A132BarCodReo ) || ( T01UE16_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UE16_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01UE16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UE16_A132BarCodReo[0] == A132BarCodReo ) && ( T01UE16_A129BarCod[0] == A129BarCod ) && ( T01UE16_A14152MEnvOrd[0] < A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UE16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01UE16_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01UE16_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01UE16_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01UE16_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UE1893( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UE1893( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1893 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = Z14152MEnvOrd ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
               update1UE1893( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UE1893( ) ;
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
                  insert1UE1893( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = Z14152MEnvOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
      getKey1UE1893( ) ;
      if ( RcdFound1893 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = Z14152MEnvOrd ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmenv");
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1UE0( ) ;
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1UE1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1UE1893( ) ;
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart1UE1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1893 != 0 )
         {
            scanNext1UE1893( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1UE1893( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1UE1893( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z14158MEnvIni, T01UE5_A14158MEnvIni[0]) ) || !( GXutil.dateCompare(Z14157MEnvFin, T01UE5_A14157MEnvFin[0]) ) || ( GXutil.strcmp(Z457FasCod, T01UE5_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z14154MEnvMaqCod, T01UE5_A14154MEnvMaqCod[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z14158MEnvIni, T01UE5_A14158MEnvIni[0]) ) )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"MEnvIni");
               GXutil.writeLogRaw("Old: ",Z14158MEnvIni);
               GXutil.writeLogRaw("Current: ",T01UE5_A14158MEnvIni[0]);
            }
            if ( !( GXutil.dateCompare(Z14157MEnvFin, T01UE5_A14157MEnvFin[0]) ) )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"MEnvFin");
               GXutil.writeLogRaw("Old: ",Z14157MEnvFin);
               GXutil.writeLogRaw("Current: ",T01UE5_A14157MEnvFin[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01UE5_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01UE5_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z14154MEnvMaqCod, T01UE5_A14154MEnvMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"MEnvMaqCod");
               GXutil.writeLogRaw("Old: ",Z14154MEnvMaqCod);
               GXutil.writeLogRaw("Current: ",T01UE5_A14154MEnvMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UE1893( )
   {
      beforeValidate1UE1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UE1893( 0) ;
         checkOptimisticConcurrency1UE1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UE1893( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UE1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UE17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A14152MEnvOrd), A14158MEnvIni, A14157MEnvFin, A396EmprCod, A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A14154MEnvMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
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
                        processLevel1UE1893( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UE0( ) ;
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
            load1UE1893( ) ;
         }
         endLevel1UE1893( ) ;
      }
      closeExtendedTableCursors1UE1893( ) ;
   }

   public void update1UE1893( )
   {
      beforeValidate1UE1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UE1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UE1893( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UE1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UE18 */
                  pr_default.execute(16, new Object[] {A14158MEnvIni, A14157MEnvFin, A457FasCod, A14154MEnvMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UE1893( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UE1893( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1UE0( ) ;
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
         endLevel1UE1893( ) ;
      }
      closeExtendedTableCursors1UE1893( ) ;
   }

   public void deferredUpdate1UE1893( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UE1893( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UE1893( ) ;
         afterConfirm1UE1893( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UE1893( ) ;
            if ( AnyError == 0 )
            {
               scanStart1UE1894( ) ;
               while ( RcdFound1894 != 0 )
               {
                  getByPrimaryKey1UE1894( ) ;
                  delete1UE1894( ) ;
                  scanNext1UE1894( ) ;
               }
               scanEnd1UE1894( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UE19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1893 == 0 )
                        {
                           initAll1UE1893( ) ;
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
                        resetCaption1UE0( ) ;
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
      sMode1893 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UE1893( ) ;
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UE1893( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UE20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01UE20_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(18);
         /* Using cursor T01UE21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A14154MEnvMaqCod});
         A14164MEnvMaqDsc = T01UE21_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01UE21_n14164MEnvMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
         pr_default.close(19);
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         else
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14156MEnvEst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
         else
         {
            A14156MEnvEst = (byte)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UE22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEPr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01UE23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores recibidos de máquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1UE1894( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1UE1894( ) ;
         if ( ( nRcdExists_1894 != 0 ) || ( nIsMod_1894 != 0 ) )
         {
            standaloneNotModal1UE1894( ) ;
            getKey1UE1894( ) ;
            if ( ( nRcdExists_1894 == 0 ) && ( nRcdDeleted_1894 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UE1894( ) ;
            }
            else
            {
               if ( RcdFound1894 != 0 )
               {
                  if ( ( nRcdDeleted_1894 != 0 ) && ( nRcdExists_1894 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UE1894( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1894 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UE1894( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1894 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1894_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtMPEnvPLC_Internalname, A14160MPEnvPLC) ;
         httpContext.changePostValue( edtMPEnvVal_Internalname, GXutil.rtrim( A14161MPEnvVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_85_idx, Z14160MPEnvPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_85_idx, GXutil.rtrim( Z14161MPEnvVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1894_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1894 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1894_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1894_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVPLC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVVAL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UE1894( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1894 = (short)(0) ;
      nIsMod_1894 = (short)(0) ;
      nRcdDeleted_1894 = (short)(0) ;
   }

   public void processLevel1UE1893( )
   {
      /* Save parent mode. */
      sMode1893 = Gx_mode ;
      processNestedLevel1UE1894( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UE1893( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmenv");
         if ( AnyError == 0 )
         {
            confirmValues1UE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmenv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UE1893( )
   {
      /* Scan By routine */
      /* Using cursor T01UE24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A129BarCod = T01UE24_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UE24_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UE24_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01UE24_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UE1893( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A129BarCod = T01UE24_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UE24_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UE24_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01UE24_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
   }

   public void scanEnd1UE1893( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1UE1893( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UE1893( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UE1893( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UE1893( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UE1893( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UE1893( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UE1893( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtMEnvMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqCod_Enabled), 5, 0), true);
      edtMEnvMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqDsc_Enabled), 5, 0), true);
      edtMEnvIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvIni_Enabled), 5, 0), true);
      edtMEnvFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvFin_Enabled), 5, 0), true);
      cmbMEnvEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMEnvEst.getEnabled(), 5, 0), true);
      edtMEnvInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvInt_Enabled), 5, 0), true);
   }

   public void zm1UE1894( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14160MPEnvPLC = T01UE3_A14160MPEnvPLC[0] ;
            Z14161MPEnvVal = T01UE3_A14161MPEnvVal[0] ;
         }
         else
         {
            Z14160MPEnvPLC = A14160MPEnvPLC ;
            Z14161MPEnvVal = A14161MPEnvVal ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14160MPEnvPLC = A14160MPEnvPLC ;
         Z14161MPEnvVal = A14161MPEnvVal ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
      }
   }

   public void standaloneNotModal1UE1894( )
   {
   }

   public void standaloneModal1UE1894( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load1UE1894( )
   {
      /* Using cursor T01UE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1665ParFasDsc = T01UE25_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01UE25_n1665ParFasDsc[0] ;
         A14160MPEnvPLC = T01UE25_A14160MPEnvPLC[0] ;
         A14161MPEnvVal = T01UE25_A14161MPEnvVal[0] ;
         zm1UE1894( -7) ;
      }
      pr_default.close(23);
      onLoadActions1UE1894( ) ;
   }

   public void onLoadActions1UE1894( )
   {
   }

   public void checkExtendedTable1UE1894( )
   {
      nIsDirty_1894 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1UE1894( ) ;
      /* Using cursor T01UE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01UE4_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01UE4_n1665ParFasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1UE1894( )
   {
      pr_default.close(2);
   }

   public void enableDisable1UE1894( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         short A1664ParFasCod )
   {
      /* Using cursor T01UE26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01UE26_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01UE26_n1665ParFasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1UE1894( )
   {
      /* Using cursor T01UE27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1894 = (short)(1) ;
      }
      else
      {
         RcdFound1894 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1UE1894( )
   {
      /* Using cursor T01UE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01UE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1UE1894( 7) ;
         RcdFound1894 = (short)(1) ;
         initializeNonKey1UE1894( ) ;
         A14160MPEnvPLC = T01UE3_A14160MPEnvPLC[0] ;
         A14161MPEnvVal = T01UE3_A14161MPEnvVal[0] ;
         A1664ParFasCod = T01UE3_A1664ParFasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode1894 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UE1894( ) ;
         load1UE1894( ) ;
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1894 = (short)(0) ;
         initializeNonKey1UE1894( ) ;
         sMode1894 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UE1894( ) ;
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UE1894( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UE1894( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14160MPEnvPLC, T01UE2_A14160MPEnvPLC[0]) != 0 ) || ( GXutil.strcmp(Z14161MPEnvVal, T01UE2_A14161MPEnvVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14160MPEnvPLC, T01UE2_A14160MPEnvPLC[0]) != 0 )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"MPEnvPLC");
               GXutil.writeLogRaw("Old: ",Z14160MPEnvPLC);
               GXutil.writeLogRaw("Current: ",T01UE2_A14160MPEnvPLC[0]);
            }
            if ( GXutil.strcmp(Z14161MPEnvVal, T01UE2_A14161MPEnvVal[0]) != 0 )
            {
               GXutil.writeLogln("tmenv:[seudo value changed for attri]"+"MPEnvVal");
               GXutil.writeLogRaw("Old: ",Z14161MPEnvVal);
               GXutil.writeLogRaw("Current: ",T01UE2_A14161MPEnvVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UE1894( )
   {
      beforeValidate1UE1894( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UE1894( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UE1894( 0) ;
         checkOptimisticConcurrency1UE1894( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UE1894( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UE1894( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UE28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), A14160MPEnvPLC, A14161MPEnvVal, A396EmprCod, Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1UE1894( ) ;
         }
         endLevel1UE1894( ) ;
      }
      closeExtendedTableCursors1UE1894( ) ;
   }

   public void update1UE1894( )
   {
      beforeValidate1UE1894( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UE1894( ) ;
      }
      if ( ( nIsMod_1894 != 0 ) || ( nIsDirty_1894 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UE1894( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UE1894( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UE1894( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UE29 */
                     pr_default.execute(27, new Object[] {A14160MPEnvPLC, A14161MPEnvVal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPEnv"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UE1894( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UE1894( ) ;
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
            endLevel1UE1894( ) ;
         }
      }
      closeExtendedTableCursors1UE1894( ) ;
   }

   public void deferredUpdate1UE1894( )
   {
   }

   public void delete1UE1894( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UE1894( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UE1894( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UE1894( ) ;
         afterConfirm1UE1894( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UE1894( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UE30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
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
      sMode1894 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UE1894( ) ;
      Gx_mode = sMode1894 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UE1894( )
   {
      standaloneModal1UE1894( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UE31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T01UE31_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01UE31_n1665ParFasDsc[0] ;
         pr_default.close(29);
      }
   }

   public void endLevel1UE1894( )
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

   public void scanStart1UE1894( )
   {
      /* Scan By routine */
      /* Using cursor T01UE32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      RcdFound1894 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1664ParFasCod = T01UE32_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UE1894( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1894 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1664ParFasCod = T01UE32_A1664ParFasCod[0] ;
      }
   }

   public void scanEnd1UE1894( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1UE1894( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UE1894( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UE1894( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UE1894( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UE1894( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UE1894( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UE1894( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMPEnvPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMPEnvVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes1UE1894( )
   {
   }

   public void send_integrity_lvl_hashes1UE1893( )
   {
   }

   public void subsflControlProps_851894( )
   {
      edtavnRcdDeleted_1894_Internalname = "vNRCDDELETED_1894_"+sGXsfl_85_idx ;
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_85_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_85_idx ;
      edtMPEnvPLC_Internalname = "MPENVPLC_"+sGXsfl_85_idx ;
      edtMPEnvVal_Internalname = "MPENVVAL_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851894( )
   {
      edtavnRcdDeleted_1894_Internalname = "vNRCDDELETED_1894_"+sGXsfl_85_fel_idx ;
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_85_fel_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_85_fel_idx ;
      edtMPEnvPLC_Internalname = "MPENVPLC_"+sGXsfl_85_fel_idx ;
      edtMPEnvVal_Internalname = "MPENVVAL_"+sGXsfl_85_fel_idx ;
   }

   public void addRow1UE1894( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851894( ) ;
      sendRow1UE1894( ) ;
   }

   public void sendRow1UE1894( )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1894_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1894_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1894_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1894), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1894), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1894_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1894_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1894_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasDsc_Internalname,GXutil.rtrim( A1665ParFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1894_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPEnvPLC_Internalname,A14160MPEnvPLC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPEnvPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPEnvPLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1894_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPEnvVal_Internalname,GXutil.rtrim( A14161MPEnvVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPEnvVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPEnvVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1UE1894( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14160MPEnvPLC_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14160MPEnvPLC);
      GXCCtl = "Z14161MPEnvVal_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14161MPEnvVal));
      GXCCtl = "nRcdDeleted_1894_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1894_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1894_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1894_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1894_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPENVPLC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPENVVAL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1UE1894( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851894( ) ;
      edtavnRcdDeleted_1894_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1894_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPEnvPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVPLC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPEnvVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVVAL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1894_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1894_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1894");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1894_Internalname ;
         wbErr = true ;
         nRcdDeleted_1894 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1894 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1894_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         wbErr = true ;
         A1664ParFasCod = (short)(0) ;
      }
      else
      {
         A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
      n1665ParFasDsc = false ;
      A14160MPEnvPLC = httpContext.cgiGet( edtMPEnvPLC_Internalname) ;
      A14161MPEnvVal = httpContext.cgiGet( edtMPEnvVal_Internalname) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_85_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14160MPEnvPLC_" + sGXsfl_85_idx ;
      Z14160MPEnvPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14161MPEnvVal_" + sGXsfl_85_idx ;
      Z14161MPEnvVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1894_" + sGXsfl_85_idx ;
      nRcdDeleted_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1894_" + sGXsfl_85_idx ;
      nRcdExists_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1894_" + sGXsfl_85_idx ;
      nIsMod_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValues1UE0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851894( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851894( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z14160MPEnvPLC_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z14161MPEnvVal_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_85_idx) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmenv", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14158MEnvIni", localUtil.ttoc( Z14158MEnvIni, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14157MEnvFin", localUtil.ttoc( Z14157MEnvFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14154MEnvMaqCod", GXutil.rtrim( Z14154MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tmenv", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMEnv" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MEnv", "") ;
   }

   public void initializeNonKey1UE1893( )
   {
      A14156MEnvEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      A14162MEnvInt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A14154MEnvMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
      A14164MEnvMaqDsc = "" ;
      n14164MEnvMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
   }

   public void initAll1UE1893( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14152MEnvOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      initializeNonKey1UE1893( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UE1894( )
   {
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      A14160MPEnvPLC = "" ;
      A14161MPEnvVal = "" ;
      Z14160MPEnvPLC = "" ;
      Z14161MPEnvVal = "" ;
   }

   public void initAll1UE1894( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1UE1894( ) ;
   }

   public void standaloneModalInsert1UE1894( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011103231", true, true);
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
      httpContext.AddJavascriptSource("tmenv.js", "?202671011103232", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1894( )
   {
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1894_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1665ParFasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A14160MPEnvPLC);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A14161MPEnvVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMEnvOrd_Internalname = "MENVORD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMEnvMaqCod_Internalname = "MENVMAQCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMEnvMaqDsc_Internalname = "MENVMAQDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMEnvIni_Internalname = "MENVINI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMEnvFin_Internalname = "MENVFIN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      cmbMEnvEst.setInternalname( "MENVEST" );
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtMEnvInt_Internalname = "MENVINT" ;
      edtavnRcdDeleted_1894_Internalname = "vNRCDDELETED_1894" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      edtMPEnvPLC_Internalname = "MPENVPLC" ;
      edtMPEnvVal_Internalname = "MPENVVAL" ;
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
      Form.setCaption( httpContext.getMessage( "MEnv", "") );
      edtMPEnvVal_Jsonclick = "" ;
      edtMPEnvPLC_Jsonclick = "" ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      edtavnRcdDeleted_1894_Jsonclick = "" ;
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
      edtMPEnvVal_Enabled = 1 ;
      edtMPEnvPLC_Enabled = 1 ;
      edtParFasDsc_Enabled = 0 ;
      edtParFasCod_Enabled = 1 ;
      edtavnRcdDeleted_1894_Enabled = 1 ;
      edtMEnvInt_Jsonclick = "" ;
      edtMEnvInt_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvInt_Enabled = 0 ;
      cmbMEnvEst.setJsonclick( "" );
      cmbMEnvEst.setEnabled( 0 );
      cmbMEnvEst.setIBackground( (int)(0xFFFFFF) );
      edtMEnvFin_Jsonclick = "" ;
      edtMEnvFin_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvFin_Enabled = 1 ;
      edtMEnvIni_Jsonclick = "" ;
      edtMEnvIni_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvIni_Enabled = 1 ;
      edtMEnvMaqDsc_Jsonclick = "" ;
      edtMEnvMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvMaqDsc_Enabled = 0 ;
      edtMEnvMaqCod_Jsonclick = "" ;
      edtMEnvMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvMaqCod_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMEnvOrd_Jsonclick = "" ;
      edtMEnvOrd_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvOrd_Enabled = 1 ;
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
      subsflControlProps_851894( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UE1894( ) ;
         standaloneModal1UE1894( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UE1894( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851894( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMEnvEst.setName( "MENVEST" );
      cmbMEnvEst.setWebtags( "" );
      cmbMEnvEst.addItem("1", httpContext.getMessage( "A procesar", ""), (short)(0));
      cmbMEnvEst.addItem("2", httpContext.getMessage( "Procesado", ""), (short)(0));
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01UE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(31);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01UE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Menvord( )
   {
      A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValue())) ;
      cmbMEnvEst.setValue( GXutil.str( A14156MEnvEst, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         cmbMEnvEst.setValue( GXutil.str( A14156MEnvEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", GXutil.rtrim( A14154MEnvMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", GXutil.rtrim( A14164MEnvMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrim( localUtil.ntoc( A14162MEnvInt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.ltrim( localUtil.ntoc( A14156MEnvEst, (byte)(1), (byte)(0), ".", "")));
      cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14154MEnvMaqCod", GXutil.rtrim( Z14154MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14158MEnvIni", localUtil.ttoc( Z14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14157MEnvFin", localUtil.ttoc( Z14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14164MEnvMaqDsc", GXutil.rtrim( Z14164MEnvMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14162MEnvInt", GXutil.ltrim( localUtil.ntoc( Z14162MEnvInt, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14156MEnvEst", GXutil.ltrim( localUtil.ntoc( Z14156MEnvEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01UE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01UE20_A460FasDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Menvmaqcod( )
   {
      n14164MEnvMaqDsc = false ;
      /* Using cursor T01UE21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMEnvMaqCod_Internalname ;
      }
      A14164MEnvMaqDsc = T01UE21_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01UE21_n14164MEnvMaqDsc[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", GXutil.rtrim( A14164MEnvMaqDsc));
   }

   public void valid_Parfascod( )
   {
      n1665ParFasDsc = false ;
      /* Using cursor T01UE31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T01UE31_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01UE31_n1665ParFasDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
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
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_MENVORD","{handler:'valid_Menvord',iparms:[{av:'cmbMEnvEst'},{av:'A14156MEnvEst',fld:'MENVEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MENVORD",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'A14158MEnvIni',fld:'MENVINI',pic:'99/99/99 99:99:99.999'},{av:'A14157MEnvFin',fld:'MENVFIN',pic:'99/99/99 99:99'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''},{av:'A14162MEnvInt',fld:'MENVINT',pic:'ZZZZZZ9.99'},{av:'cmbMEnvEst'},{av:'A14156MEnvEst',fld:'MENVEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z14152MEnvOrd'},{av:'Z457FasCod'},{av:'Z14154MEnvMaqCod'},{av:'Z14158MEnvIni'},{av:'Z14157MEnvFin'},{av:'Z460FasDsc'},{av:'Z14164MEnvMaqDsc'},{av:'Z14162MEnvInt'},{av:'Z14156MEnvEst'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_MENVMAQCOD","{handler:'valid_Menvmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]");
      setEventMetadata("VALID_MENVMAQCOD",",oparms:[{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]}");
      setEventMetadata("VALID_MENVINI","{handler:'valid_Menvini',iparms:[]");
      setEventMetadata("VALID_MENVINI",",oparms:[]}");
      setEventMetadata("VALID_MENVFIN","{handler:'valid_Menvfin',iparms:[]");
      setEventMetadata("VALID_MENVFIN",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mpenvval',iparms:[]");
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
      pr_default.close(18);
      pr_default.close(31);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
      Z14160MPEnvPLC = "" ;
      Z14161MPEnvVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A14154MEnvMaqCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A14164MEnvMaqDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock11_Jsonclick = "" ;
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A14162MEnvInt = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1894 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1893 = "" ;
      GXCCtl = "" ;
      A1665ParFasDsc = "" ;
      A14160MPEnvPLC = "" ;
      A14161MPEnvVal = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z460FasDsc = "" ;
      Z14164MEnvMaqDsc = "" ;
      T01UE10_A14152MEnvOrd = new short[1] ;
      T01UE10_A460FasDsc = new String[] {""} ;
      T01UE10_A14164MEnvMaqDsc = new String[] {""} ;
      T01UE10_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01UE10_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE10_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE10_A396EmprCod = new String[] {""} ;
      T01UE10_A457FasCod = new String[] {""} ;
      T01UE10_A129BarCod = new int[1] ;
      T01UE10_A132BarCodReo = new byte[1] ;
      T01UE10_A130BarCodPar = new String[] {""} ;
      T01UE10_A14154MEnvMaqCod = new String[] {""} ;
      T01UE7_A460FasDsc = new String[] {""} ;
      T01UE9_A14164MEnvMaqDsc = new String[] {""} ;
      T01UE9_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01UE8_A396EmprCod = new String[] {""} ;
      T01UE11_A460FasDsc = new String[] {""} ;
      T01UE12_A14164MEnvMaqDsc = new String[] {""} ;
      T01UE12_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01UE13_A396EmprCod = new String[] {""} ;
      T01UE14_A396EmprCod = new String[] {""} ;
      T01UE14_A129BarCod = new int[1] ;
      T01UE14_A132BarCodReo = new byte[1] ;
      T01UE14_A130BarCodPar = new String[] {""} ;
      T01UE14_A14152MEnvOrd = new short[1] ;
      T01UE6_A14152MEnvOrd = new short[1] ;
      T01UE6_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE6_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE6_A396EmprCod = new String[] {""} ;
      T01UE6_A457FasCod = new String[] {""} ;
      T01UE6_A129BarCod = new int[1] ;
      T01UE6_A132BarCodReo = new byte[1] ;
      T01UE6_A130BarCodPar = new String[] {""} ;
      T01UE6_A14154MEnvMaqCod = new String[] {""} ;
      T01UE15_A396EmprCod = new String[] {""} ;
      T01UE15_A129BarCod = new int[1] ;
      T01UE15_A132BarCodReo = new byte[1] ;
      T01UE15_A130BarCodPar = new String[] {""} ;
      T01UE15_A14152MEnvOrd = new short[1] ;
      T01UE16_A396EmprCod = new String[] {""} ;
      T01UE16_A129BarCod = new int[1] ;
      T01UE16_A132BarCodReo = new byte[1] ;
      T01UE16_A130BarCodPar = new String[] {""} ;
      T01UE16_A14152MEnvOrd = new short[1] ;
      T01UE5_A14152MEnvOrd = new short[1] ;
      T01UE5_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE5_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01UE5_A396EmprCod = new String[] {""} ;
      T01UE5_A457FasCod = new String[] {""} ;
      T01UE5_A129BarCod = new int[1] ;
      T01UE5_A132BarCodReo = new byte[1] ;
      T01UE5_A130BarCodPar = new String[] {""} ;
      T01UE5_A14154MEnvMaqCod = new String[] {""} ;
      T01UE20_A460FasDsc = new String[] {""} ;
      T01UE21_A14164MEnvMaqDsc = new String[] {""} ;
      T01UE21_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01UE22_A14674MEPrId = new long[1] ;
      T01UE23_A396EmprCod = new String[] {""} ;
      T01UE23_A129BarCod = new int[1] ;
      T01UE23_A132BarCodReo = new byte[1] ;
      T01UE23_A130BarCodPar = new String[] {""} ;
      T01UE23_A14152MEnvOrd = new short[1] ;
      T01UE23_A14153MRecLin = new long[1] ;
      T01UE24_A396EmprCod = new String[] {""} ;
      T01UE24_A129BarCod = new int[1] ;
      T01UE24_A132BarCodReo = new byte[1] ;
      T01UE24_A130BarCodPar = new String[] {""} ;
      T01UE24_A14152MEnvOrd = new short[1] ;
      Z1665ParFasDsc = "" ;
      T01UE25_A129BarCod = new int[1] ;
      T01UE25_A132BarCodReo = new byte[1] ;
      T01UE25_A130BarCodPar = new String[] {""} ;
      T01UE25_A14152MEnvOrd = new short[1] ;
      T01UE25_A1665ParFasDsc = new String[] {""} ;
      T01UE25_n1665ParFasDsc = new boolean[] {false} ;
      T01UE25_A14160MPEnvPLC = new String[] {""} ;
      T01UE25_A14161MPEnvVal = new String[] {""} ;
      T01UE25_A396EmprCod = new String[] {""} ;
      T01UE25_A1664ParFasCod = new short[1] ;
      T01UE4_A1665ParFasDsc = new String[] {""} ;
      T01UE4_n1665ParFasDsc = new boolean[] {false} ;
      T01UE26_A1665ParFasDsc = new String[] {""} ;
      T01UE26_n1665ParFasDsc = new boolean[] {false} ;
      T01UE27_A396EmprCod = new String[] {""} ;
      T01UE27_A129BarCod = new int[1] ;
      T01UE27_A132BarCodReo = new byte[1] ;
      T01UE27_A130BarCodPar = new String[] {""} ;
      T01UE27_A14152MEnvOrd = new short[1] ;
      T01UE27_A1664ParFasCod = new short[1] ;
      T01UE3_A129BarCod = new int[1] ;
      T01UE3_A132BarCodReo = new byte[1] ;
      T01UE3_A130BarCodPar = new String[] {""} ;
      T01UE3_A14152MEnvOrd = new short[1] ;
      T01UE3_A14160MPEnvPLC = new String[] {""} ;
      T01UE3_A14161MPEnvVal = new String[] {""} ;
      T01UE3_A396EmprCod = new String[] {""} ;
      T01UE3_A1664ParFasCod = new short[1] ;
      T01UE2_A129BarCod = new int[1] ;
      T01UE2_A132BarCodReo = new byte[1] ;
      T01UE2_A130BarCodPar = new String[] {""} ;
      T01UE2_A14152MEnvOrd = new short[1] ;
      T01UE2_A14160MPEnvPLC = new String[] {""} ;
      T01UE2_A14161MPEnvVal = new String[] {""} ;
      T01UE2_A396EmprCod = new String[] {""} ;
      T01UE2_A1664ParFasCod = new short[1] ;
      T01UE31_A1665ParFasDsc = new String[] {""} ;
      T01UE31_n1665ParFasDsc = new boolean[] {false} ;
      T01UE32_A396EmprCod = new String[] {""} ;
      T01UE32_A129BarCod = new int[1] ;
      T01UE32_A132BarCodReo = new byte[1] ;
      T01UE32_A130BarCodPar = new String[] {""} ;
      T01UE32_A14152MEnvOrd = new short[1] ;
      T01UE32_A1664ParFasCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01UE33_A396EmprCod = new String[] {""} ;
      Z14162MEnvInt = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ457FasCod = "" ;
      ZZ14154MEnvMaqCod = "" ;
      ZZ14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      ZZ14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      ZZ460FasDsc = "" ;
      ZZ14164MEnvMaqDsc = "" ;
      ZZ14162MEnvInt = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmenv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmenv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmenv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmenv__default(),
         new Object[] {
             new Object[] {
            T01UE2_A129BarCod, T01UE2_A132BarCodReo, T01UE2_A130BarCodPar, T01UE2_A14152MEnvOrd, T01UE2_A14160MPEnvPLC, T01UE2_A14161MPEnvVal, T01UE2_A396EmprCod, T01UE2_A1664ParFasCod
            }
            , new Object[] {
            T01UE3_A129BarCod, T01UE3_A132BarCodReo, T01UE3_A130BarCodPar, T01UE3_A14152MEnvOrd, T01UE3_A14160MPEnvPLC, T01UE3_A14161MPEnvVal, T01UE3_A396EmprCod, T01UE3_A1664ParFasCod
            }
            , new Object[] {
            T01UE4_A1665ParFasDsc, T01UE4_n1665ParFasDsc
            }
            , new Object[] {
            T01UE5_A14152MEnvOrd, T01UE5_A14158MEnvIni, T01UE5_A14157MEnvFin, T01UE5_A396EmprCod, T01UE5_A457FasCod, T01UE5_A129BarCod, T01UE5_A132BarCodReo, T01UE5_A130BarCodPar, T01UE5_A14154MEnvMaqCod
            }
            , new Object[] {
            T01UE6_A14152MEnvOrd, T01UE6_A14158MEnvIni, T01UE6_A14157MEnvFin, T01UE6_A396EmprCod, T01UE6_A457FasCod, T01UE6_A129BarCod, T01UE6_A132BarCodReo, T01UE6_A130BarCodPar, T01UE6_A14154MEnvMaqCod
            }
            , new Object[] {
            T01UE7_A460FasDsc
            }
            , new Object[] {
            T01UE8_A396EmprCod
            }
            , new Object[] {
            T01UE9_A14164MEnvMaqDsc, T01UE9_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01UE10_A14152MEnvOrd, T01UE10_A460FasDsc, T01UE10_A14164MEnvMaqDsc, T01UE10_n14164MEnvMaqDsc, T01UE10_A14158MEnvIni, T01UE10_A14157MEnvFin, T01UE10_A396EmprCod, T01UE10_A457FasCod, T01UE10_A129BarCod, T01UE10_A132BarCodReo,
            T01UE10_A130BarCodPar, T01UE10_A14154MEnvMaqCod
            }
            , new Object[] {
            T01UE11_A460FasDsc
            }
            , new Object[] {
            T01UE12_A14164MEnvMaqDsc, T01UE12_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01UE13_A396EmprCod
            }
            , new Object[] {
            T01UE14_A396EmprCod, T01UE14_A129BarCod, T01UE14_A132BarCodReo, T01UE14_A130BarCodPar, T01UE14_A14152MEnvOrd
            }
            , new Object[] {
            T01UE15_A396EmprCod, T01UE15_A129BarCod, T01UE15_A132BarCodReo, T01UE15_A130BarCodPar, T01UE15_A14152MEnvOrd
            }
            , new Object[] {
            T01UE16_A396EmprCod, T01UE16_A129BarCod, T01UE16_A132BarCodReo, T01UE16_A130BarCodPar, T01UE16_A14152MEnvOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UE20_A460FasDsc
            }
            , new Object[] {
            T01UE21_A14164MEnvMaqDsc, T01UE21_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01UE22_A14674MEPrId
            }
            , new Object[] {
            T01UE23_A396EmprCod, T01UE23_A129BarCod, T01UE23_A132BarCodReo, T01UE23_A130BarCodPar, T01UE23_A14152MEnvOrd, T01UE23_A14153MRecLin
            }
            , new Object[] {
            T01UE24_A396EmprCod, T01UE24_A129BarCod, T01UE24_A132BarCodReo, T01UE24_A130BarCodPar, T01UE24_A14152MEnvOrd
            }
            , new Object[] {
            T01UE25_A129BarCod, T01UE25_A132BarCodReo, T01UE25_A130BarCodPar, T01UE25_A14152MEnvOrd, T01UE25_A1665ParFasDsc, T01UE25_n1665ParFasDsc, T01UE25_A14160MPEnvPLC, T01UE25_A14161MPEnvVal, T01UE25_A396EmprCod, T01UE25_A1664ParFasCod
            }
            , new Object[] {
            T01UE26_A1665ParFasDsc, T01UE26_n1665ParFasDsc
            }
            , new Object[] {
            T01UE27_A396EmprCod, T01UE27_A129BarCod, T01UE27_A132BarCodReo, T01UE27_A130BarCodPar, T01UE27_A14152MEnvOrd, T01UE27_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UE31_A1665ParFasDsc, T01UE31_n1665ParFasDsc
            }
            , new Object[] {
            T01UE32_A396EmprCod, T01UE32_A129BarCod, T01UE32_A132BarCodReo, T01UE32_A130BarCodPar, T01UE32_A14152MEnvOrd, T01UE32_A1664ParFasCod
            }
            , new Object[] {
            T01UE33_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TMEnv" ;
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A14156MEnvEst ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte Z14156MEnvEst ;
   private byte ZZ132BarCodReo ;
   private byte ZZ14156MEnvEst ;
   private short Z14152MEnvOrd ;
   private short Z1664ParFasCod ;
   private short nRcdDeleted_1894 ;
   private short nRcdExists_1894 ;
   private short nIsMod_1894 ;
   private short A1664ParFasCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14152MEnvOrd ;
   private short nBlankRcdCount1894 ;
   private short RcdFound1894 ;
   private short nBlankRcdUsr1894 ;
   private short RcdFound1893 ;
   private short nIsDirty_1893 ;
   private short nIsDirty_1894 ;
   private short ZZ14152MEnvOrd ;
   private int Z129BarCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
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
   private int edtMEnvOrd_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMEnvMaqCod_Enabled ;
   private int edtMEnvMaqDsc_Enabled ;
   private int edtMEnvIni_Enabled ;
   private int edtMEnvFin_Enabled ;
   private int edtMEnvInt_Enabled ;
   private int edtavnRcdDeleted_1894_Enabled ;
   private int edtParFasCod_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtMPEnvPLC_Enabled ;
   private int edtMPEnvVal_Enabled ;
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
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMEnvInt_Backcolor ;
   private int edtMEnvFin_Backcolor ;
   private int edtMEnvIni_Backcolor ;
   private int edtMEnvMaqDsc_Backcolor ;
   private int edtMEnvMaqCod_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtMEnvOrd_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A14162MEnvInt ;
   private java.math.BigDecimal Z14162MEnvInt ;
   private java.math.BigDecimal ZZ14162MEnvInt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z457FasCod ;
   private String Z14154MEnvMaqCod ;
   private String Z14161MPEnvVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A14154MEnvMaqCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_85_idx="0001" ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMEnvOrd_Internalname ;
   private String edtMEnvOrd_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMEnvMaqCod_Internalname ;
   private String edtMEnvMaqCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMEnvMaqDsc_Internalname ;
   private String A14164MEnvMaqDsc ;
   private String edtMEnvMaqDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMEnvIni_Internalname ;
   private String edtMEnvIni_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMEnvFin_Internalname ;
   private String edtMEnvFin_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtMEnvInt_Internalname ;
   private String edtMEnvInt_Jsonclick ;
   private String sMode1894 ;
   private String edtavnRcdDeleted_1894_Internalname ;
   private String edtParFasCod_Internalname ;
   private String edtParFasDsc_Internalname ;
   private String edtMPEnvPLC_Internalname ;
   private String edtMPEnvVal_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1893 ;
   private String GXCCtl ;
   private String A1665ParFasDsc ;
   private String A14161MPEnvVal ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z460FasDsc ;
   private String Z14164MEnvMaqDsc ;
   private String Z1665ParFasDsc ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1894_Jsonclick ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasDsc_Jsonclick ;
   private String edtMPEnvPLC_Jsonclick ;
   private String edtMPEnvVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ457FasCod ;
   private String ZZ14154MEnvMaqCod ;
   private String ZZ460FasDsc ;
   private String ZZ14164MEnvMaqDsc ;
   private java.util.Date Z14158MEnvIni ;
   private java.util.Date Z14157MEnvFin ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date ZZ14158MEnvIni ;
   private java.util.Date ZZ14157MEnvFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n14164MEnvMaqDsc ;
   private boolean returnInSub ;
   private boolean n1665ParFasDsc ;
   private String Z14160MPEnvPLC ;
   private String A14160MPEnvPLC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbMEnvEst ;
   private IDataStoreProvider pr_default ;
   private short[] T01UE10_A14152MEnvOrd ;
   private String[] T01UE10_A460FasDsc ;
   private String[] T01UE10_A14164MEnvMaqDsc ;
   private boolean[] T01UE10_n14164MEnvMaqDsc ;
   private java.util.Date[] T01UE10_A14158MEnvIni ;
   private java.util.Date[] T01UE10_A14157MEnvFin ;
   private String[] T01UE10_A396EmprCod ;
   private String[] T01UE10_A457FasCod ;
   private int[] T01UE10_A129BarCod ;
   private byte[] T01UE10_A132BarCodReo ;
   private String[] T01UE10_A130BarCodPar ;
   private String[] T01UE10_A14154MEnvMaqCod ;
   private String[] T01UE7_A460FasDsc ;
   private String[] T01UE9_A14164MEnvMaqDsc ;
   private boolean[] T01UE9_n14164MEnvMaqDsc ;
   private String[] T01UE8_A396EmprCod ;
   private String[] T01UE11_A460FasDsc ;
   private String[] T01UE12_A14164MEnvMaqDsc ;
   private boolean[] T01UE12_n14164MEnvMaqDsc ;
   private String[] T01UE13_A396EmprCod ;
   private String[] T01UE14_A396EmprCod ;
   private int[] T01UE14_A129BarCod ;
   private byte[] T01UE14_A132BarCodReo ;
   private String[] T01UE14_A130BarCodPar ;
   private short[] T01UE14_A14152MEnvOrd ;
   private short[] T01UE6_A14152MEnvOrd ;
   private java.util.Date[] T01UE6_A14158MEnvIni ;
   private java.util.Date[] T01UE6_A14157MEnvFin ;
   private String[] T01UE6_A396EmprCod ;
   private String[] T01UE6_A457FasCod ;
   private int[] T01UE6_A129BarCod ;
   private byte[] T01UE6_A132BarCodReo ;
   private String[] T01UE6_A130BarCodPar ;
   private String[] T01UE6_A14154MEnvMaqCod ;
   private String[] T01UE15_A396EmprCod ;
   private int[] T01UE15_A129BarCod ;
   private byte[] T01UE15_A132BarCodReo ;
   private String[] T01UE15_A130BarCodPar ;
   private short[] T01UE15_A14152MEnvOrd ;
   private String[] T01UE16_A396EmprCod ;
   private int[] T01UE16_A129BarCod ;
   private byte[] T01UE16_A132BarCodReo ;
   private String[] T01UE16_A130BarCodPar ;
   private short[] T01UE16_A14152MEnvOrd ;
   private short[] T01UE5_A14152MEnvOrd ;
   private java.util.Date[] T01UE5_A14158MEnvIni ;
   private java.util.Date[] T01UE5_A14157MEnvFin ;
   private String[] T01UE5_A396EmprCod ;
   private String[] T01UE5_A457FasCod ;
   private int[] T01UE5_A129BarCod ;
   private byte[] T01UE5_A132BarCodReo ;
   private String[] T01UE5_A130BarCodPar ;
   private String[] T01UE5_A14154MEnvMaqCod ;
   private String[] T01UE20_A460FasDsc ;
   private String[] T01UE21_A14164MEnvMaqDsc ;
   private boolean[] T01UE21_n14164MEnvMaqDsc ;
   private long[] T01UE22_A14674MEPrId ;
   private String[] T01UE23_A396EmprCod ;
   private int[] T01UE23_A129BarCod ;
   private byte[] T01UE23_A132BarCodReo ;
   private String[] T01UE23_A130BarCodPar ;
   private short[] T01UE23_A14152MEnvOrd ;
   private long[] T01UE23_A14153MRecLin ;
   private String[] T01UE24_A396EmprCod ;
   private int[] T01UE24_A129BarCod ;
   private byte[] T01UE24_A132BarCodReo ;
   private String[] T01UE24_A130BarCodPar ;
   private short[] T01UE24_A14152MEnvOrd ;
   private int[] T01UE25_A129BarCod ;
   private byte[] T01UE25_A132BarCodReo ;
   private String[] T01UE25_A130BarCodPar ;
   private short[] T01UE25_A14152MEnvOrd ;
   private String[] T01UE25_A1665ParFasDsc ;
   private boolean[] T01UE25_n1665ParFasDsc ;
   private String[] T01UE25_A14160MPEnvPLC ;
   private String[] T01UE25_A14161MPEnvVal ;
   private String[] T01UE25_A396EmprCod ;
   private short[] T01UE25_A1664ParFasCod ;
   private String[] T01UE4_A1665ParFasDsc ;
   private boolean[] T01UE4_n1665ParFasDsc ;
   private String[] T01UE26_A1665ParFasDsc ;
   private boolean[] T01UE26_n1665ParFasDsc ;
   private String[] T01UE27_A396EmprCod ;
   private int[] T01UE27_A129BarCod ;
   private byte[] T01UE27_A132BarCodReo ;
   private String[] T01UE27_A130BarCodPar ;
   private short[] T01UE27_A14152MEnvOrd ;
   private short[] T01UE27_A1664ParFasCod ;
   private int[] T01UE3_A129BarCod ;
   private byte[] T01UE3_A132BarCodReo ;
   private String[] T01UE3_A130BarCodPar ;
   private short[] T01UE3_A14152MEnvOrd ;
   private String[] T01UE3_A14160MPEnvPLC ;
   private String[] T01UE3_A14161MPEnvVal ;
   private String[] T01UE3_A396EmprCod ;
   private short[] T01UE3_A1664ParFasCod ;
   private int[] T01UE2_A129BarCod ;
   private byte[] T01UE2_A132BarCodReo ;
   private String[] T01UE2_A130BarCodPar ;
   private short[] T01UE2_A14152MEnvOrd ;
   private String[] T01UE2_A14160MPEnvPLC ;
   private String[] T01UE2_A14161MPEnvVal ;
   private String[] T01UE2_A396EmprCod ;
   private short[] T01UE2_A1664ParFasCod ;
   private String[] T01UE31_A1665ParFasDsc ;
   private boolean[] T01UE31_n1665ParFasDsc ;
   private String[] T01UE32_A396EmprCod ;
   private int[] T01UE32_A129BarCod ;
   private byte[] T01UE32_A132BarCodReo ;
   private String[] T01UE32_A130BarCodPar ;
   private short[] T01UE32_A14152MEnvOrd ;
   private short[] T01UE32_A1664ParFasCod ;
   private String[] T01UE33_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmenv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UE2", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?  FOR UPDATE OF MPEnvPLC, MPEnvVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE3", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE4", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE5", "SELECT MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?  FOR UPDATE OF MEnvIni, MEnvFin, FasCod, MEnvMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE6", "SELECT MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE7", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE9", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE10", "SELECT /*+ FIRST_ROWS(100) */ TM1.MEnvOrd, T2.FasDsc, T3.MaqDsc AS MEnvMaqDsc, TM1.MEnvIni, TM1.MEnvFin, TM1.EmprCod, TM1.FasCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvMaqCod AS MEnvMaqCod FROM ((TXPMEnv TM1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = TM1.EmprCod AND T2.FasCod = TM1.FasCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MEnvMaqCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MEnvOrd = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE11", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE12", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE13", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MEnvOrd > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UE16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MEnvOrd < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MEnvOrd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UE17", "INSERT INTO TXPMEnv(MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod, MRecHdr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01UE18", "UPDATE TXPMEnv SET MEnvIni=?, MEnvFin=?, FasCod=?, MEnvMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01UE19", "DELETE FROM TXPMEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new ForEachCursor("T01UE20", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE21", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE22", "SELECT * FROM (SELECT MEPrId FROM MEPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UE23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UE24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE25", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MEnvOrd, T2.ParFasDsc, T1.MPEnvPLC, T1.MPEnvVal, T1.EmprCod, T1.ParFasCod FROM (TXPMPEnv T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MEnvOrd = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MEnvOrd, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE26", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE27", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UE28", "INSERT INTO TXPMPEnv(BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPEnv")
         ,new UpdateCursor("T01UE29", "UPDATE TXPMPEnv SET MPEnvPLC=?, MPEnvVal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?", GX_NOMASK, "TXPMPEnv")
         ,new UpdateCursor("T01UE30", "DELETE FROM TXPMPEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?", GX_NOMASK, "TXPMPEnv")
         ,new ForEachCursor("T01UE31", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UE33", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
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
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               return;
            case 16 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false, true);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

