package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttinagr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         AV32flag = (byte)(GXutil.lval( httpContext.GetPar( "flag"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.str( AV32flag, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_1G412( A396EmprCod, A180BarMaqCod, AV32flag) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
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
         A4118tinagrcod = (int)(GXutil.lval( httpContext.GetPar( "tinagrcod"))) ;
         A4119tinagrreo = (byte)(GXutil.lval( httpContext.GetPar( "tinagrreo"))) ;
         A4120tinagrpar = httpContext.GetPar( "tinagrpar") ;
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1G41596( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A4118tinagrcod, A4119tinagrreo, A4120tinagrpar, A180BarMaqCod, A236BarVolMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A129BarCod, A132BarCodReo, A130BarCodPar, A180BarMaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "traver agrupacion tinte", ""), (short)(0)) ;
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

   public ttinagr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttinagr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttinagr_impl.class ));
   }

   public ttinagr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ttinagr.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Volumen", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolMaq_Jsonclick, 0, "", "", "", "", "", 1, edtBarVolMaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "FindVolMed", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMed_Jsonclick, 0, "", "", "", "", "", 1, edtFindVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "FindVolMin", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMin_Jsonclick, 0, "", "", "", "", "", 1, edtFindVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "FindVolMax", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMax_Jsonclick, 0, "", "", "", "", "", 1, edtFindVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tipod Disposicion,C,M,etc", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ttinagr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis), GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDis_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ttinagr.htm");
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
         nBlankRcdCount1596 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1596 = (short)(1) ;
            scanStart1G41596( ) ;
            while ( RcdFound1596 != 0 )
            {
               init_level_properties1596( ) ;
               getByPrimaryKey1G41596( ) ;
               addRow1G41596( ) ;
               scanNext1G41596( ) ;
            }
            scanEnd1G41596( ) ;
            nBlankRcdCount1596 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B180BarMaqCod = A180BarMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         standaloneNotModal1G41596( ) ;
         standaloneModal1G41596( ) ;
         sMode1596 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow1G41596( ) ;
            edtavnRcdDeleted_1596_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1596_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1596_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1596_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edttinagrcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edttinagrcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edttinagrreo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edttinagrreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrreo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edttinagrpar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edttinagrpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrpar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1596 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1G41596( ) ;
            }
            sendRow1G41596( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1596 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A180BarMaqCod = B180BarMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1596 = (short)(5) ;
         nRcdExists_1596 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1G41596( ) ;
            while ( RcdFound1596 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851596( ) ;
               init_level_properties1596( ) ;
               standaloneNotModal1G41596( ) ;
               getByPrimaryKey1G41596( ) ;
               standaloneModal1G41596( ) ;
               addRow1G41596( ) ;
               scanNext1G41596( ) ;
            }
            scanEnd1G41596( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1596 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851596( ) ;
      initAll1G41596( ) ;
      init_level_properties1596( ) ;
      B180BarMaqCod = A180BarMaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      nRcdExists_1596 = (short)(0) ;
      nIsMod_1596 = (short)(0) ;
      nRcdDeleted_1596 = (short)(0) ;
      nBlankRcdCount1596 = (short)(nBlankRcdUsr1596+nBlankRcdCount1596) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1596 > 0 )
      {
         standaloneNotModal1G41596( ) ;
         standaloneModal1G41596( ) ;
         addRow1G41596( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edttinagrcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1596 = (short)(nBlankRcdCount1596-1) ;
      }
      Gx_mode = sMode1596 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A180BarMaqCod = B180BarMaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ttinagr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_Ttinagr.htm");
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
      e111G42 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( "Z236BarVolMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2010BarTipDis = httpContext.cgiGet( "Z2010BarTipDis") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            O180BarMaqCod = httpContext.cgiGet( "O180BarMaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            AV32flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARVOLMAQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarVolMaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A236BarVolMaq = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            }
            else
            {
               A236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            }
            A479FindVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
            A478FindVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
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
            A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Ttinagr");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttinagr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
                     if ( GXutil.strcmp(sEvt, "'ELIAGR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'eliagr' */
                        e121G42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111G42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIBAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'elibar' */
                        e131G42 ();
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
            initAll1G412( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1596_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1596_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributes1G412( ) ;
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

   public void confirm_1G40( )
   {
      beforeValidate1G412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G412( ) ;
         }
         else
         {
            checkExtendedTable1G412( ) ;
            if ( AnyError == 0 )
            {
               zm1G412( 11) ;
               zm1G412( 12) ;
               zm1G412( 13) ;
            }
            closeExtendedTableCursors1G412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1G41596( ) ;
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
         confirmValues1G40( ) ;
      }
   }

   public void confirm_1G41596( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1G41596( ) ;
         if ( ( nRcdExists_1596 != 0 ) || ( nIsMod_1596 != 0 ) )
         {
            getKey1G41596( ) ;
            if ( ( nRcdExists_1596 == 0 ) && ( nRcdDeleted_1596 == 0 ) )
            {
               if ( RcdFound1596 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1G41596( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1G41596( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1G41596( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TINAGRCOD_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edttinagrcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1596 != 0 )
               {
                  if ( nRcdDeleted_1596 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1G41596( ) ;
                     load1G41596( ) ;
                     beforeValidate1G41596( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1G41596( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1596 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1G41596( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1G41596( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1G41596( ) ;
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
                  if ( nRcdDeleted_1596 == 0 )
                  {
                     GXCCtl = "TINAGRCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edttinagrcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1596_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrcod_Internalname, GXutil.ltrim( localUtil.ntoc( A4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrreo_Internalname, GXutil.ltrim( localUtil.ntoc( A4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrpar_Internalname, GXutil.rtrim( A4120tinagrpar)) ;
         httpContext.changePostValue( "ZT_"+"Z4118tinagrcod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4119tinagrreo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4120tinagrpar_"+sGXsfl_85_idx, GXutil.rtrim( Z4120tinagrpar)) ;
         httpContext.changePostValue( "nRcdDeleted_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1596 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1596_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1596_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrreo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrpar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1G40( )
   {
   }

   public void e111G42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttinagr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttinagr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttinagr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttinagr_impl.this.A396EmprCod = GXv_char2[0] ;
      ttinagr_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttinagr_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121G42( )
   {
      /* 'eliagr' Routine */
      returnInSub = false ;
      if ( true /* Level */ && ( ! (0==A129BarCod) ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         new app.pelitin(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
         ttinagr_impl.this.A396EmprCod = GXv_char4[0] ;
         ttinagr_impl.this.A129BarCod = GXv_int5[0] ;
         ttinagr_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttinagr_impl.this.A130BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e131G42( )
   {
      /* 'elibar' Routine */
      returnInSub = false ;
      if ( ! (0==A4118tinagrcod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int7[0] = A4118tinagrcod ;
         GXv_int8[0] = A4119tinagrreo ;
         GXv_char2[0] = A4120tinagrpar ;
         new app.pelitin2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_int8, GXv_char2) ;
         ttinagr_impl.this.A396EmprCod = GXv_char4[0] ;
         ttinagr_impl.this.A129BarCod = GXv_int5[0] ;
         ttinagr_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttinagr_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttinagr_impl.this.A4118tinagrcod = GXv_int7[0] ;
         ttinagr_impl.this.A4119tinagrreo = GXv_int8[0] ;
         ttinagr_impl.this.A4120tinagrpar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /*  Sending Event outputs  */
   }

   public void zm1G412( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01G45_A361DisCod[0] ;
            Z2759BarMaqGru = T01G45_A2759BarMaqGru[0] ;
            Z236BarVolMaq = T01G45_A236BarVolMaq[0] ;
            Z120BarAgrEst = T01G45_A120BarAgrEst[0] ;
            Z180BarMaqCod = T01G45_A180BarMaqCod[0] ;
            Z213BarSit = T01G45_A213BarSit[0] ;
            Z2010BarTipDis = T01G45_A2010BarTipDis[0] ;
            Z252CliCod = T01G45_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z236BarVolMaq = A236BarVolMaq ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z213BarSit = A213BarSit ;
            Z2010BarTipDis = A2010BarTipDis ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z236BarVolMaq = A236BarVolMaq ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z213BarSit = A213BarSit ;
         Z2010BarTipDis = A2010BarTipDis ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "Ttinagr" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01G46 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G46_A407EmprNom[0] ;
      n407EmprNom = T01G46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de ruta inexistente", ""), 1, "");
         AnyError = (short)(1) ;
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
      /* Using cursor T01G47 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01G47_A252CliCod[0] ;
      n252CliCod = T01G47_n252CliCod[0] ;
      A365DisDes = T01G47_A365DisDes[0] ;
      pr_default.close(5);
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

   public void load1G412( )
   {
      /* Using cursor T01G410 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01G410_A361DisCod[0] ;
         A2759BarMaqGru = T01G410_A2759BarMaqGru[0] ;
         A236BarVolMaq = T01G410_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A407EmprNom = T01G410_A407EmprNom[0] ;
         n407EmprNom = T01G410_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A120BarAgrEst = T01G410_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T01G410_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A213BarSit = T01G410_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A2010BarTipDis = T01G410_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A252CliCod = T01G410_A252CliCod[0] ;
         n252CliCod = T01G410_n252CliCod[0] ;
         A252CliCod = T01G410_A252CliCod[0] ;
         n252CliCod = T01G410_n252CliCod[0] ;
         A365DisDes = T01G410_A365DisDes[0] ;
         zm1G412( -10) ;
      }
      pr_default.close(7);
      onLoadActions1G412( ) ;
   }

   public void onLoadActions1G412( )
   {
      /* Using cursor T01G49 */
      pr_default.execute(6, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A478FindVolMax = T01G49_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01G49_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01G49_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(6);
      if ( GXutil.strcmp(A180BarMaqCod, O180BarMaqCod) != 0 )
      {
         A236BarVolMaq = A479FindVolMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      }
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void checkExtendedTable1G412( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01G49 */
      pr_default.execute(6, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A478FindVolMax = T01G49_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01G49_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01G49_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(6);
      if ( GXutil.strcmp(A180BarMaqCod, O180BarMaqCod) != 0 )
      {
         nIsDirty_12 = (short)(1) ;
         A236BarVolMaq = A479FindVolMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      }
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "BARAGREST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A180BarMaqCod ;
         GXv_int8[0] = AV32flag ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
         ttinagr_impl.this.A396EmprCod = GXv_char4[0] ;
         ttinagr_impl.this.A180BarMaqCod = GXv_char3[0] ;
         ttinagr_impl.this.AV32flag = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.str( AV32flag, 1, 0));
      }
      if ( true /* After */ && ( AV32flag == 0 ) && ( ! (GXutil.strcmp("", A180BarMaqCod)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Máquina inexistente", ""), 1, "BARMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A213BarSit >= 4 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "barcada no valida", ""), 1, "BARSIT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarSit_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", "")) != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "barcada no valida", ""), 1, "BARTIPDIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTipDis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1G412( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A180BarMaqCod )
   {
      /* Using cursor T01G412 */
      pr_default.execute(8, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A478FindVolMax = T01G412_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01G412_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01G412_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1G412( )
   {
      /* Using cursor T01G413 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G45 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01G45_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G412( 10) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01G45_A361DisCod[0] ;
         A2759BarMaqGru = T01G45_A2759BarMaqGru[0] ;
         A129BarCod = T01G45_A129BarCod[0] ;
         n129BarCod = T01G45_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G45_A132BarCodReo[0] ;
         n132BarCodReo = T01G45_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G45_A130BarCodPar[0] ;
         n130BarCodPar = T01G45_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A236BarVolMaq = T01G45_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A120BarAgrEst = T01G45_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T01G45_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A213BarSit = T01G45_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A2010BarTipDis = T01G45_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A252CliCod = T01G45_A252CliCod[0] ;
         n252CliCod = T01G45_n252CliCod[0] ;
         O180BarMaqCod = A180BarMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1G412( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1G412( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1G412( ) ;
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
      /* Using cursor T01G414 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01G414_A129BarCod[0] < A129BarCod ) || ( T01G414_A129BarCod[0] == A129BarCod ) && ( T01G414_A132BarCodReo[0] < A132BarCodReo ) || ( T01G414_A132BarCodReo[0] == A132BarCodReo ) && ( T01G414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G414_A130BarCodPar[0], A130BarCodPar) < 0 ) ) && ( GXutil.strcmp(T01G414_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01G414_A129BarCod[0] > A129BarCod ) || ( T01G414_A129BarCod[0] == A129BarCod ) && ( T01G414_A132BarCodReo[0] > A132BarCodReo ) || ( T01G414_A132BarCodReo[0] == A132BarCodReo ) && ( T01G414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G414_A130BarCodPar[0], A130BarCodPar) > 0 ) ) && ( GXutil.strcmp(T01G414_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01G414_A129BarCod[0] ;
            n129BarCod = T01G414_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01G414_A132BarCodReo[0] ;
            n132BarCodReo = T01G414_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01G414_A130BarCodPar[0] ;
            n130BarCodPar = T01G414_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01G415 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01G415_A129BarCod[0] > A129BarCod ) || ( T01G415_A129BarCod[0] == A129BarCod ) && ( T01G415_A132BarCodReo[0] > A132BarCodReo ) || ( T01G415_A132BarCodReo[0] == A132BarCodReo ) && ( T01G415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G415_A130BarCodPar[0], A130BarCodPar) > 0 ) ) && ( GXutil.strcmp(T01G415_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01G415_A129BarCod[0] < A129BarCod ) || ( T01G415_A129BarCod[0] == A129BarCod ) && ( T01G415_A132BarCodReo[0] < A132BarCodReo ) || ( T01G415_A132BarCodReo[0] == A132BarCodReo ) && ( T01G415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G415_A130BarCodPar[0], A130BarCodPar) < 0 ) ) && ( GXutil.strcmp(T01G415_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01G415_A129BarCod[0] ;
            n129BarCod = T01G415_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01G415_A132BarCodReo[0] ;
            n132BarCodReo = T01G415_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01G415_A130BarCodPar[0] ;
            n130BarCodPar = T01G415_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G412( ) ;
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
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1G412( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
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
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G412( ) ;
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
                  insert1G412( ) ;
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
      getKey1G412( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttinagr");
      GX_FocusControl = edtBarAgrEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1G40( ) ;
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
      GX_FocusControl = edtBarAgrEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1G412( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAgrEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G412( ) ;
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
      GX_FocusControl = edtBarAgrEst_Internalname ;
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
      GX_FocusControl = edtBarAgrEst_Internalname ;
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
      scanStart1G412( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1G412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAgrEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G44 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01G44_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01G44_A2759BarMaqGru[0]) != 0 ) || ( Z236BarVolMaq != T01G44_A236BarVolMaq[0] ) || ( GXutil.strcmp(Z120BarAgrEst, T01G44_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01G44_A180BarMaqCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z213BarSit != T01G44_A213BarSit[0] ) || ( GXutil.strcmp(Z2010BarTipDis, T01G44_A2010BarTipDis[0]) != 0 ) || ( Z252CliCod != T01G44_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01G44_A361DisCod[0] )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01G44_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01G44_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01G44_A2759BarMaqGru[0]);
            }
            if ( Z236BarVolMaq != T01G44_A236BarVolMaq[0] )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarVolMaq");
               GXutil.writeLogRaw("Old: ",Z236BarVolMaq);
               GXutil.writeLogRaw("Current: ",T01G44_A236BarVolMaq[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T01G44_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T01G44_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01G44_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01G44_A180BarMaqCod[0]);
            }
            if ( Z213BarSit != T01G44_A213BarSit[0] )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T01G44_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z2010BarTipDis, T01G44_A2010BarTipDis[0]) != 0 )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"BarTipDis");
               GXutil.writeLogRaw("Old: ",Z2010BarTipDis);
               GXutil.writeLogRaw("Current: ",T01G44_A2010BarTipDis[0]);
            }
            if ( Z252CliCod != T01G44_A252CliCod[0] )
            {
               GXutil.writeLogln("ttinagr:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01G44_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G412( )
   {
      beforeValidate1G412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G412( 0) ;
         checkOptimisticConcurrency1G412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G416 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A236BarVolMaq), A120BarAgrEst, A180BarMaqCod, Byte.valueOf(A213BarSit), A2010BarTipDis, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11G412( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1G40( ) ;
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
            load1G412( ) ;
         }
         endLevel1G412( ) ;
      }
      closeExtendedTableCursors1G412( ) ;
   }

   public void update1G412( )
   {
      beforeValidate1G412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G417 */
                  pr_default.execute(13, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Integer.valueOf(A236BarVolMaq), A120BarAgrEst, A180BarMaqCod, Byte.valueOf(A213BarSit), A2010BarTipDis, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G412( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int7[0] = A129BarCod ;
                     GXv_int8[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3) ;
                     ttinagr_impl.this.A396EmprCod = GXv_char4[0] ;
                     ttinagr_impl.this.A129BarCod = GXv_int7[0] ;
                     ttinagr_impl.this.A132BarCodReo = GXv_int8[0] ;
                     ttinagr_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN11G412( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1G40( ) ;
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
         endLevel1G412( ) ;
      }
      closeExtendedTableCursors1G412( ) ;
   }

   public void deferredUpdate1G412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G412( ) ;
         afterConfirm1G412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G412( ) ;
            if ( AnyError == 0 )
            {
               scanStart1G41596( ) ;
               while ( RcdFound1596 != 0 )
               {
                  getByPrimaryKey1G41596( ) ;
                  delete1G41596( ) ;
                  scanNext1G41596( ) ;
               }
               scanEnd1G41596( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G418 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11G412( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1G412( ) ;
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
                        resetCaption1G40( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G412( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G412( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "BARAGREST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAgrEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01G420 */
         pr_default.execute(15, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A478FindVolMax = T01G420_A478FindVolMax[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = T01G420_A479FindVolMed[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = T01G420_A480FindVolMin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         else
         {
            A478FindVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01G421 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01G422 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01G423 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01G424 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01G425 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01G426 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01G427 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01G428 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01G429 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01G430 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01G431 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01G432 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01G433 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01G434 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01G435 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01G436 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01G437 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01G438 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01G439 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01G440 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01G441 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01G442 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01G443 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01G444 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01G445 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01G446 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01G447 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01G448 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01G449 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01G450 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01G451 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01G452 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01G453 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01G454 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01G455 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01G456 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01G457 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01G458 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01G459 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01G460 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01G461 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01G462 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01G463 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01G464 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01G465 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01G466 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01G467 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01G468 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01G469 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01G470 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01G471 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01G472 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01G473 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01G474 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01G475 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01G476 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01G477 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01G478 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01G479 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01G480 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01G481 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01G482 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
      }
   }

   public void processNestedLevel1G41596( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1G41596( ) ;
         if ( ( nRcdExists_1596 != 0 ) || ( nIsMod_1596 != 0 ) )
         {
            standaloneNotModal1G41596( ) ;
            getKey1G41596( ) ;
            if ( ( nRcdExists_1596 == 0 ) && ( nRcdDeleted_1596 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1G41596( ) ;
            }
            else
            {
               if ( RcdFound1596 != 0 )
               {
                  if ( ( nRcdDeleted_1596 != 0 ) && ( nRcdExists_1596 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1G41596( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1596 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1G41596( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1596 == 0 )
                  {
                     GXCCtl = "TINAGRCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edttinagrcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1596_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrcod_Internalname, GXutil.ltrim( localUtil.ntoc( A4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrreo_Internalname, GXutil.ltrim( localUtil.ntoc( A4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edttinagrpar_Internalname, GXutil.rtrim( A4120tinagrpar)) ;
         httpContext.changePostValue( "ZT_"+"Z4118tinagrcod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4119tinagrreo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4120tinagrpar_"+sGXsfl_85_idx, GXutil.rtrim( Z4120tinagrpar)) ;
         httpContext.changePostValue( "nRcdDeleted_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1596_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1596 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1596_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1596_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrreo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TINAGRPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrpar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1G41596( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1596 = (short)(0) ;
      nIsMod_1596 = (short)(0) ;
      nRcdDeleted_1596 = (short)(0) ;
   }

   public void processLevel1G412( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1G41596( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11G412( )
   {
      /* Using cursor T01G483 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1G412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttinagr");
         if ( AnyError == 0 )
         {
            confirmValues1G40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttinagr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G412( )
   {
      /* Scan By routine */
      /* Using cursor T01G484 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A129BarCod = T01G484_A129BarCod[0] ;
         n129BarCod = T01G484_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G484_A132BarCodReo[0] ;
         n132BarCodReo = T01G484_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G484_A130BarCodPar[0] ;
         n130BarCodPar = T01G484_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G412( )
   {
      /* Scan next routine */
      pr_default.readNext(79);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A129BarCod = T01G484_A129BarCod[0] ;
         n129BarCod = T01G484_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G484_A132BarCodReo[0] ;
         n132BarCodReo = T01G484_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G484_A130BarCodPar[0] ;
         n130BarCodPar = T01G484_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1G412( )
   {
      pr_default.close(79);
   }

   public void afterConfirm1G412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G412( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtFindVolMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMed_Enabled), 5, 0), true);
      edtFindVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMin_Enabled), 5, 0), true);
      edtFindVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMax_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), true);
   }

   public void zm1G41596( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -14 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z4118tinagrcod = A4118tinagrcod ;
         Z4119tinagrreo = A4119tinagrreo ;
         Z4120tinagrpar = A4120tinagrpar ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1G41596( )
   {
   }

   public void standaloneModal1G41596( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edttinagrcod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edttinagrcod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edttinagrreo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrreo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edttinagrreo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrreo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edttinagrpar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrpar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edttinagrpar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edttinagrpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrpar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load1G41596( )
   {
      /* Using cursor T01G485 */
      pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound1596 = (short)(1) ;
         zm1G41596( -14) ;
      }
      pr_default.close(80);
      onLoadActions1G41596( ) ;
   }

   public void onLoadActions1G41596( )
   {
   }

   public void checkExtendedTable1G41596( )
   {
      nIsDirty_1596 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1G41596( ) ;
   }

   public void closeExtendedTableCursors1G41596( )
   {
   }

   public void enableDisable1G41596( )
   {
   }

   public void getKey1G41596( )
   {
      /* Using cursor T01G486 */
      pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1596 = (short)(1) ;
      }
      else
      {
         RcdFound1596 = (short)(0) ;
      }
      pr_default.close(81);
   }

   public void getByPrimaryKey1G41596( )
   {
      /* Using cursor T01G43 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G41596( 14) ;
         RcdFound1596 = (short)(1) ;
         initializeNonKey1G41596( ) ;
         A4118tinagrcod = T01G43_A4118tinagrcod[0] ;
         A4119tinagrreo = T01G43_A4119tinagrreo[0] ;
         A4120tinagrpar = T01G43_A4120tinagrpar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z4118tinagrcod = A4118tinagrcod ;
         Z4119tinagrreo = A4119tinagrreo ;
         Z4120tinagrpar = A4120tinagrpar ;
         sMode1596 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G41596( ) ;
         load1G41596( ) ;
         Gx_mode = sMode1596 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1596 = (short)(0) ;
         initializeNonKey1G41596( ) ;
         sMode1596 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G41596( ) ;
         Gx_mode = sMode1596 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1G41596( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1G41596( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G42 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPtinagr"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPtinagr"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G41596( )
   {
      beforeValidate1G41596( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G41596( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G41596( 0) ;
         checkOptimisticConcurrency1G41596( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G41596( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G41596( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G487 */
                  pr_default.execute(82, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPtinagr");
                  if ( (pr_default.getStatus(82) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int7[0] = A129BarCod ;
                        GXv_int8[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        GXv_int5[0] = A4118tinagrcod ;
                        GXv_int6[0] = A4119tinagrreo ;
                        GXv_char2[0] = A4120tinagrpar ;
                        GXv_char9[0] = A180BarMaqCod ;
                        GXv_int10[0] = A236BarVolMaq ;
                        new app.ptinagr(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char9, GXv_int10) ;
                        ttinagr_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttinagr_impl.this.A129BarCod = GXv_int7[0] ;
                        ttinagr_impl.this.A132BarCodReo = GXv_int8[0] ;
                        ttinagr_impl.this.A130BarCodPar = GXv_char3[0] ;
                        ttinagr_impl.this.A4118tinagrcod = GXv_int5[0] ;
                        ttinagr_impl.this.A4119tinagrreo = GXv_int6[0] ;
                        ttinagr_impl.this.A4120tinagrpar = GXv_char2[0] ;
                        ttinagr_impl.this.A180BarMaqCod = GXv_char9[0] ;
                        ttinagr_impl.this.A236BarVolMaq = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
                     }
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
            load1G41596( ) ;
         }
         endLevel1G41596( ) ;
      }
      closeExtendedTableCursors1G41596( ) ;
   }

   public void update1G41596( )
   {
      beforeValidate1G41596( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G41596( ) ;
      }
      if ( ( nIsMod_1596 != 0 ) || ( nIsDirty_1596 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1G41596( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1G41596( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1G41596( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPtinagr */
                     deferredUpdate1G41596( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char9[0] = A396EmprCod ;
                        GXv_int10[0] = A129BarCod ;
                        GXv_int8[0] = A132BarCodReo ;
                        GXv_char4[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int8, GXv_char4) ;
                        ttinagr_impl.this.A396EmprCod = GXv_char9[0] ;
                        ttinagr_impl.this.A129BarCod = GXv_int10[0] ;
                        ttinagr_impl.this.A132BarCodReo = GXv_int8[0] ;
                        ttinagr_impl.this.A130BarCodPar = GXv_char4[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1G41596( ) ;
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
            endLevel1G41596( ) ;
         }
      }
      closeExtendedTableCursors1G41596( ) ;
   }

   public void deferredUpdate1G41596( )
   {
   }

   public void delete1G41596( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G41596( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G41596( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G41596( ) ;
         afterConfirm1G41596( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G41596( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G488 */
               pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A4118tinagrcod), Byte.valueOf(A4119tinagrreo), A4120tinagrpar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPtinagr");
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
      sMode1596 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G41596( ) ;
      Gx_mode = sMode1596 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G41596( )
   {
      standaloneModal1G41596( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G41596( )
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

   public void scanStart1G41596( )
   {
      /* Scan By routine */
      /* Using cursor T01G489 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1596 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1596 = (short)(1) ;
         A4118tinagrcod = T01G489_A4118tinagrcod[0] ;
         A4119tinagrreo = T01G489_A4119tinagrreo[0] ;
         A4120tinagrpar = T01G489_A4120tinagrpar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G41596( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound1596 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1596 = (short)(1) ;
         A4118tinagrcod = T01G489_A4118tinagrcod[0] ;
         A4119tinagrreo = T01G489_A4119tinagrreo[0] ;
         A4120tinagrpar = T01G489_A4120tinagrpar[0] ;
      }
   }

   public void scanEnd1G41596( )
   {
      pr_default.close(84);
   }

   public void afterConfirm1G41596( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G41596( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G41596( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G41596( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G41596( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G41596( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G41596( )
   {
      edttinagrcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edttinagrreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrreo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edttinagrpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrpar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes1G41596( )
   {
   }

   public void send_integrity_lvl_hashes1G412( )
   {
   }

   public void subsflControlProps_851596( )
   {
      edtavnRcdDeleted_1596_Internalname = "vNRCDDELETED_1596_"+sGXsfl_85_idx ;
      edttinagrcod_Internalname = "TINAGRCOD_"+sGXsfl_85_idx ;
      edttinagrreo_Internalname = "TINAGRREO_"+sGXsfl_85_idx ;
      edttinagrpar_Internalname = "TINAGRPAR_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851596( )
   {
      edtavnRcdDeleted_1596_Internalname = "vNRCDDELETED_1596_"+sGXsfl_85_fel_idx ;
      edttinagrcod_Internalname = "TINAGRCOD_"+sGXsfl_85_fel_idx ;
      edttinagrreo_Internalname = "TINAGRREO_"+sGXsfl_85_fel_idx ;
      edttinagrpar_Internalname = "TINAGRPAR_"+sGXsfl_85_fel_idx ;
   }

   public void addRow1G41596( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851596( ) ;
      sendRow1G41596( ) ;
   }

   public void sendRow1G41596( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1596_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1596_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1596_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1596), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1596), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1596_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1596_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1596_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edttinagrcod_Internalname,GXutil.ltrim( localUtil.ntoc( A4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4118tinagrcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edttinagrcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edttinagrcod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1596_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edttinagrreo_Internalname,GXutil.ltrim( localUtil.ntoc( A4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4119tinagrreo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edttinagrreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edttinagrreo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1596_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edttinagrpar_Internalname,GXutil.rtrim( A4120tinagrpar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edttinagrpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edttinagrpar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1G41596( ) ;
      GXCCtl = "Z4118tinagrcod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4118tinagrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4119tinagrreo_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4119tinagrreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4120tinagrpar_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4120tinagrpar));
      GXCCtl = "nRcdDeleted_1596_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1596_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1596_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1596, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1596_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1596_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TINAGRCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TINAGRREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrreo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TINAGRPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrpar_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1G41596( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851596( ) ;
      edtavnRcdDeleted_1596_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1596_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edttinagrcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edttinagrreo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edttinagrpar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TINAGRPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1596_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1596_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1596");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1596_Internalname ;
         wbErr = true ;
         nRcdDeleted_1596 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1596 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1596_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edttinagrcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edttinagrcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TINAGRCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edttinagrcod_Internalname ;
         wbErr = true ;
         A4118tinagrcod = 0 ;
      }
      else
      {
         A4118tinagrcod = (int)(localUtil.ctol( httpContext.cgiGet( edttinagrcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edttinagrreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edttinagrreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "TINAGRREO_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edttinagrreo_Internalname ;
         wbErr = true ;
         A4119tinagrreo = (byte)(0) ;
      }
      else
      {
         A4119tinagrreo = (byte)(localUtil.ctol( httpContext.cgiGet( edttinagrreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4120tinagrpar = httpContext.cgiGet( edttinagrpar_Internalname) ;
      GXCCtl = "Z4118tinagrcod_" + sGXsfl_85_idx ;
      Z4118tinagrcod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4119tinagrreo_" + sGXsfl_85_idx ;
      Z4119tinagrreo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4120tinagrpar_" + sGXsfl_85_idx ;
      Z4120tinagrpar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1596_" + sGXsfl_85_idx ;
      nRcdDeleted_1596 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1596_" + sGXsfl_85_idx ;
      nRcdExists_1596 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1596_" + sGXsfl_85_idx ;
      nIsMod_1596 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedttinagrpar_Enabled = edttinagrpar_Enabled ;
      defedttinagrreo_Enabled = edttinagrreo_Enabled ;
      defedttinagrcod_Enabled = edttinagrcod_Enabled ;
   }

   public void confirmValues1G40( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851596( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851596( ) ;
         httpContext.changePostValue( "Z4118tinagrcod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z4118tinagrcod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4118tinagrcod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z4119tinagrreo_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z4119tinagrreo_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4119tinagrreo_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z4120tinagrpar_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z4120tinagrpar_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4120tinagrpar_"+sGXsfl_85_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttinagr", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Ttinagr");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttinagr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2010BarTipDis", GXutil.rtrim( Z2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O180BarMaqCod", GXutil.rtrim( O180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV32flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.ttinagr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ttinagr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "traver agrupacion tinte", "") ;
   }

   public void initializeNonKey1G412( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A236BarVolMaq = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      AV32flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.str( AV32flag, 1, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A478FindVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
      A479FindVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
      A480FindVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A2010BarTipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O180BarMaqCod = A180BarMaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z236BarVolMaq = 0 ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z213BarSit = (byte)(0) ;
      Z2010BarTipDis = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1G412( )
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
      initializeNonKey1G412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1G41596( )
   {
   }

   public void initAll1G41596( )
   {
      A4118tinagrcod = 0 ;
      A4119tinagrreo = (byte)(0) ;
      A4120tinagrpar = "" ;
      initializeNonKey1G41596( ) ;
   }

   public void standaloneModalInsert1G41596( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583797", true, true);
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
      httpContext.AddJavascriptSource("ttinagr.js", "?20268241583798", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1596( )
   {
      edttinagrpar_Enabled = defedttinagrpar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrpar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edttinagrreo_Enabled = defedttinagrreo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrreo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edttinagrcod_Enabled = defedttinagrcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edttinagrcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edttinagrcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1596, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1596_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4118tinagrcod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4119tinagrreo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrreo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4120tinagrpar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edttinagrpar_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarVolMaq_Internalname = "BARVOLMAQ" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFindVolMed_Internalname = "FINDVOLMED" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFindVolMin_Internalname = "FINDVOLMIN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFindVolMax_Internalname = "FINDVOLMAX" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtavnRcdDeleted_1596_Internalname = "vNRCDDELETED_1596" ;
      edttinagrcod_Internalname = "TINAGRCOD" ;
      edttinagrreo_Internalname = "TINAGRREO" ;
      edttinagrpar_Internalname = "TINAGRPAR" ;
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
      Form.setCaption( httpContext.getMessage( "traver agrupacion tinte", "") );
      edttinagrpar_Jsonclick = "" ;
      edttinagrreo_Jsonclick = "" ;
      edttinagrcod_Jsonclick = "" ;
      edtavnRcdDeleted_1596_Jsonclick = "" ;
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
      edttinagrpar_Enabled = 1 ;
      edttinagrreo_Enabled = 1 ;
      edttinagrcod_Enabled = 1 ;
      edtavnRcdDeleted_1596_Enabled = 1 ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipDis_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 1 ;
      edtFindVolMax_Jsonclick = "" ;
      edtFindVolMax_Backcolor = (int)(0xFFFFFF) ;
      edtFindVolMax_Enabled = 0 ;
      edtFindVolMin_Jsonclick = "" ;
      edtFindVolMin_Backcolor = (int)(0xFFFFFF) ;
      edtFindVolMin_Enabled = 0 ;
      edtFindVolMed_Jsonclick = "" ;
      edtFindVolMed_Backcolor = (int)(0xFFFFFF) ;
      edtFindVolMed_Enabled = 0 ;
      edtBarVolMaq_Jsonclick = "" ;
      edtBarVolMaq_Backcolor = (int)(0xFFFFFF) ;
      edtBarVolMaq_Enabled = 1 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarMaqCod_Enabled = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void xc_7_1G412( String A396EmprCod ,
                           String A180BarMaqCod ,
                           byte AV32flag )
   {
      if ( true /* After */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_char4[0] = A180BarMaqCod ;
         GXv_int8[0] = AV32flag ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char9, GXv_char4, GXv_int8) ;
         A396EmprCod = GXv_char9[0] ;
         A180BarMaqCod = GXv_char4[0] ;
         AV32flag = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.str( AV32flag, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A180BarMaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32flag, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_9_1G41596( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             int A4118tinagrcod ,
                             byte A4119tinagrreo ,
                             String A4120tinagrpar ,
                             String A180BarMaqCod ,
                             int A236BarVolMaq )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int7[0] = A4118tinagrcod ;
         GXv_int6[0] = A4119tinagrreo ;
         GXv_char3[0] = A4120tinagrpar ;
         GXv_char2[0] = A180BarMaqCod ;
         GXv_int5[0] = A236BarVolMaq ;
         new app.ptinagr(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int8, GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_int5) ;
         A396EmprCod = GXv_char9[0] ;
         A129BarCod = GXv_int10[0] ;
         A132BarCodReo = GXv_int8[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A4118tinagrcod = GXv_int7[0] ;
         A4119tinagrreo = GXv_int6[0] ;
         A4120tinagrpar = GXv_char3[0] ;
         A180BarMaqCod = GXv_char2[0] ;
         A236BarVolMaq = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4118tinagrcod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4119tinagrreo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4120tinagrpar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A180BarMaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_851596( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1G41596( ) ;
         standaloneModal1G41596( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1G41596( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851596( ) ;
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
      /* Using cursor T01G490 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(85) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G490_A407EmprNom[0] ;
      n407EmprNom = T01G490_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(85);
      GX_FocusControl = edtBarAgrEst_Internalname ;
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
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", GXutil.rtrim( A2010BarTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.ltrim( localUtil.ntoc( AV32flag, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2010BarTipDis", GXutil.rtrim( Z2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z478FindVolMax", GXutil.ltrim( localUtil.ntoc( Z478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z479FindVolMed", GXutil.ltrim( localUtil.ntoc( Z479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z480FindVolMin", GXutil.ltrim( localUtil.ntoc( Z480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV32flag", GXutil.ltrim( localUtil.ntoc( ZV32flag, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O180BarMaqCod", GXutil.rtrim( O180BarMaqCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Baragrest( )
   {
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "BARAGREST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrEst_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barmaqcod( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01G420 */
      pr_default.execute(15, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A478FindVolMax = T01G420_A478FindVolMax[0] ;
         A479FindVolMed = T01G420_A479FindVolMed[0] ;
         A480FindVolMin = T01G420_A480FindVolMin[0] ;
      }
      else
      {
         A478FindVolMax = 0 ;
         A479FindVolMed = 0 ;
         A480FindVolMin = 0 ;
      }
      pr_default.close(15);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      if ( GXutil.strcmp(A180BarMaqCod, O180BarMaqCod) != 0 )
      {
         A236BarVolMaq = A479FindVolMed ;
      }
      if ( true /* After */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_char4[0] = A180BarMaqCod ;
         GXv_int8[0] = AV32flag ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char9, GXv_char4, GXv_int8) ;
         ttinagr_impl.this.A396EmprCod = GXv_char9[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttinagr_impl.this.A180BarMaqCod = GXv_char4[0] ;
         A180BarMaqCod = this.A180BarMaqCod ;
         ttinagr_impl.this.AV32flag = GXv_int8[0] ;
         AV32flag = this.AV32flag ;
      }
      if ( true /* After */ && ( AV32flag == 0 ) && ( ! (GXutil.strcmp("", A180BarMaqCod)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Máquina inexistente", ""), 1, "BARMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarMaqCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV32flag", GXutil.ltrim( localUtil.ntoc( AV32flag, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ELIAGR'","{handler:'e121G42',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'ELIAGR'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ELIBAR'","{handler:'e131G42',iparms:[{av:'A4118tinagrcod',fld:'TINAGRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4119tinagrreo',fld:'TINAGRREO',pic:'9'},{av:'A4120tinagrpar',fld:'TINAGRPAR',pic:''}]");
      setEventMetadata("'ELIBAR'",",oparms:[{av:'A4120tinagrpar',fld:'TINAGRPAR',pic:''},{av:'A4119tinagrreo',fld:'TINAGRREO',pic:'9'},{av:'A4118tinagrcod',fld:'TINAGRCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV32flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'AV32flag',fld:'vFLAG',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z120BarAgrEst'},{av:'Z180BarMaqCod'},{av:'Z213BarSit'},{av:'Z2010BarTipDis'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'Z478FindVolMax'},{av:'Z479FindVolMed'},{av:'Z480FindVolMin'},{av:'Z236BarVolMaq'},{av:'Z2759BarMaqGru'},{av:'ZV32flag'},{av:'O180BarMaqCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARAGREST","{handler:'valid_Baragrest',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'}]");
      setEventMetadata("VALID_BARAGREST",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'O180BarMaqCod'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'AV32flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'AV32flag',fld:'vFLAG',pic:'9'}]}");
      setEventMetadata("VALID_BARVOLMAQ","{handler:'valid_Barvolmaq',iparms:[]");
      setEventMetadata("VALID_BARVOLMAQ",",oparms:[]}");
      setEventMetadata("VALID_FINDVOLMED","{handler:'valid_Findvolmed',iparms:[]");
      setEventMetadata("VALID_FINDVOLMED",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_BARTIPDIS","{handler:'valid_Bartipdis',iparms:[]");
      setEventMetadata("VALID_BARTIPDIS",",oparms:[]}");
      setEventMetadata("VALID_TINAGRCOD","{handler:'valid_Tinagrcod',iparms:[]");
      setEventMetadata("VALID_TINAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_TINAGRREO","{handler:'valid_Tinagrreo',iparms:[]");
      setEventMetadata("VALID_TINAGRREO",",oparms:[]}");
      setEventMetadata("VALID_TINAGRPAR","{handler:'valid_Tinagrpar',iparms:[]");
      setEventMetadata("VALID_TINAGRPAR",",oparms:[]}");
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
      pr_default.close(85);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z2010BarTipDis = "" ;
      O180BarMaqCod = "" ;
      Z4120tinagrpar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A130BarCodPar = "" ;
      A4120tinagrpar = "" ;
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
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A2010BarTipDis = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B180BarMaqCod = "" ;
      sMode1596 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A365DisDes = "" ;
      AV33Pgmname = "" ;
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
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01G46_A407EmprNom = new String[] {""} ;
      T01G46_n407EmprNom = new boolean[] {false} ;
      T01G47_A252CliCod = new int[1] ;
      T01G47_n252CliCod = new boolean[] {false} ;
      T01G47_A365DisDes = new String[] {""} ;
      T01G410_A361DisCod = new int[1] ;
      T01G410_A2759BarMaqGru = new String[] {""} ;
      T01G410_A129BarCod = new int[1] ;
      T01G410_n129BarCod = new boolean[] {false} ;
      T01G410_A132BarCodReo = new byte[1] ;
      T01G410_n132BarCodReo = new boolean[] {false} ;
      T01G410_A130BarCodPar = new String[] {""} ;
      T01G410_n130BarCodPar = new boolean[] {false} ;
      T01G410_A236BarVolMaq = new int[1] ;
      T01G410_A407EmprNom = new String[] {""} ;
      T01G410_n407EmprNom = new boolean[] {false} ;
      T01G410_A120BarAgrEst = new String[] {""} ;
      T01G410_A180BarMaqCod = new String[] {""} ;
      T01G410_A213BarSit = new byte[1] ;
      T01G410_A2010BarTipDis = new String[] {""} ;
      T01G410_A252CliCod = new int[1] ;
      T01G410_n252CliCod = new boolean[] {false} ;
      T01G410_A365DisDes = new String[] {""} ;
      T01G410_A396EmprCod = new String[] {""} ;
      T01G410_n396EmprCod = new boolean[] {false} ;
      T01G49_A478FindVolMax = new int[1] ;
      T01G49_A479FindVolMed = new int[1] ;
      T01G49_A480FindVolMin = new int[1] ;
      T01G412_A478FindVolMax = new int[1] ;
      T01G412_A479FindVolMed = new int[1] ;
      T01G412_A480FindVolMin = new int[1] ;
      T01G413_A396EmprCod = new String[] {""} ;
      T01G413_n396EmprCod = new boolean[] {false} ;
      T01G413_A129BarCod = new int[1] ;
      T01G413_n129BarCod = new boolean[] {false} ;
      T01G413_A132BarCodReo = new byte[1] ;
      T01G413_n132BarCodReo = new boolean[] {false} ;
      T01G413_A130BarCodPar = new String[] {""} ;
      T01G413_n130BarCodPar = new boolean[] {false} ;
      T01G45_A361DisCod = new int[1] ;
      T01G45_A2759BarMaqGru = new String[] {""} ;
      T01G45_A129BarCod = new int[1] ;
      T01G45_n129BarCod = new boolean[] {false} ;
      T01G45_A132BarCodReo = new byte[1] ;
      T01G45_n132BarCodReo = new boolean[] {false} ;
      T01G45_A130BarCodPar = new String[] {""} ;
      T01G45_n130BarCodPar = new boolean[] {false} ;
      T01G45_A236BarVolMaq = new int[1] ;
      T01G45_A120BarAgrEst = new String[] {""} ;
      T01G45_A180BarMaqCod = new String[] {""} ;
      T01G45_A213BarSit = new byte[1] ;
      T01G45_A2010BarTipDis = new String[] {""} ;
      T01G45_A396EmprCod = new String[] {""} ;
      T01G45_n396EmprCod = new boolean[] {false} ;
      T01G45_A252CliCod = new int[1] ;
      T01G45_n252CliCod = new boolean[] {false} ;
      T01G45_A365DisDes = new String[] {""} ;
      T01G414_A396EmprCod = new String[] {""} ;
      T01G414_n396EmprCod = new boolean[] {false} ;
      T01G414_A129BarCod = new int[1] ;
      T01G414_n129BarCod = new boolean[] {false} ;
      T01G414_A132BarCodReo = new byte[1] ;
      T01G414_n132BarCodReo = new boolean[] {false} ;
      T01G414_A130BarCodPar = new String[] {""} ;
      T01G414_n130BarCodPar = new boolean[] {false} ;
      T01G415_A396EmprCod = new String[] {""} ;
      T01G415_n396EmprCod = new boolean[] {false} ;
      T01G415_A129BarCod = new int[1] ;
      T01G415_n129BarCod = new boolean[] {false} ;
      T01G415_A132BarCodReo = new byte[1] ;
      T01G415_n132BarCodReo = new boolean[] {false} ;
      T01G415_A130BarCodPar = new String[] {""} ;
      T01G415_n130BarCodPar = new boolean[] {false} ;
      T01G44_A361DisCod = new int[1] ;
      T01G44_A2759BarMaqGru = new String[] {""} ;
      T01G44_A129BarCod = new int[1] ;
      T01G44_n129BarCod = new boolean[] {false} ;
      T01G44_A132BarCodReo = new byte[1] ;
      T01G44_n132BarCodReo = new boolean[] {false} ;
      T01G44_A130BarCodPar = new String[] {""} ;
      T01G44_n130BarCodPar = new boolean[] {false} ;
      T01G44_A236BarVolMaq = new int[1] ;
      T01G44_A120BarAgrEst = new String[] {""} ;
      T01G44_A180BarMaqCod = new String[] {""} ;
      T01G44_A213BarSit = new byte[1] ;
      T01G44_A2010BarTipDis = new String[] {""} ;
      T01G44_A396EmprCod = new String[] {""} ;
      T01G44_n396EmprCod = new boolean[] {false} ;
      T01G44_A252CliCod = new int[1] ;
      T01G44_n252CliCod = new boolean[] {false} ;
      T01G44_A365DisDes = new String[] {""} ;
      T01G420_A478FindVolMax = new int[1] ;
      T01G420_A479FindVolMed = new int[1] ;
      T01G420_A480FindVolMin = new int[1] ;
      T01G421_A14681MRPrId = new long[1] ;
      T01G422_A5921XCjaDis = new String[] {""} ;
      T01G422_A5922XCjaCod = new long[1] ;
      T01G423_A396EmprCod = new String[] {""} ;
      T01G423_n396EmprCod = new boolean[] {false} ;
      T01G423_A129BarCod = new int[1] ;
      T01G423_n129BarCod = new boolean[] {false} ;
      T01G423_A132BarCodReo = new byte[1] ;
      T01G423_n132BarCodReo = new boolean[] {false} ;
      T01G423_A130BarCodPar = new String[] {""} ;
      T01G423_n130BarCodPar = new boolean[] {false} ;
      T01G423_A14152MEnvOrd = new short[1] ;
      T01G424_A396EmprCod = new String[] {""} ;
      T01G424_n396EmprCod = new boolean[] {false} ;
      T01G424_A129BarCod = new int[1] ;
      T01G424_n129BarCod = new boolean[] {false} ;
      T01G424_A132BarCodReo = new byte[1] ;
      T01G424_n132BarCodReo = new boolean[] {false} ;
      T01G424_A130BarCodPar = new String[] {""} ;
      T01G424_n130BarCodPar = new boolean[] {false} ;
      T01G424_A13905BarTraID = new String[] {""} ;
      T01G425_A396EmprCod = new String[] {""} ;
      T01G425_n396EmprCod = new boolean[] {false} ;
      T01G425_A129BarCod = new int[1] ;
      T01G425_n129BarCod = new boolean[] {false} ;
      T01G425_A132BarCodReo = new byte[1] ;
      T01G425_n132BarCodReo = new boolean[] {false} ;
      T01G425_A130BarCodPar = new String[] {""} ;
      T01G425_n130BarCodPar = new boolean[] {false} ;
      T01G425_A13093BarDGLin = new byte[1] ;
      T01G425_A13094BarDGDibCl = new String[] {""} ;
      T01G425_A13095BarDGDibIn = new int[1] ;
      T01G425_A13096BarDGComb = new String[] {""} ;
      T01G425_A13097BarDGFOndo = new String[] {""} ;
      T01G426_A396EmprCod = new String[] {""} ;
      T01G426_n396EmprCod = new boolean[] {false} ;
      T01G426_A11917Ebd_numero = new int[1] ;
      T01G427_A396EmprCod = new String[] {""} ;
      T01G427_n396EmprCod = new boolean[] {false} ;
      T01G427_A11898Prd_numero = new int[1] ;
      T01G428_A396EmprCod = new String[] {""} ;
      T01G428_n396EmprCod = new boolean[] {false} ;
      T01G428_A11849Cte_numero = new int[1] ;
      T01G429_A396EmprCod = new String[] {""} ;
      T01G429_n396EmprCod = new boolean[] {false} ;
      T01G429_A11791Ap_numero = new int[1] ;
      T01G430_A396EmprCod = new String[] {""} ;
      T01G430_n396EmprCod = new boolean[] {false} ;
      T01G430_A3985CalBarCod = new int[1] ;
      T01G430_A3986CalBarCodR = new byte[1] ;
      T01G430_A3987CalBarCodP = new String[] {""} ;
      T01G431_A396EmprCod = new String[] {""} ;
      T01G431_n396EmprCod = new boolean[] {false} ;
      T01G431_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01G431_A652OpeCod = new int[1] ;
      T01G432_A396EmprCod = new String[] {""} ;
      T01G432_n396EmprCod = new boolean[] {false} ;
      T01G432_A129BarCod = new int[1] ;
      T01G432_n129BarCod = new boolean[] {false} ;
      T01G432_A132BarCodReo = new byte[1] ;
      T01G432_n132BarCodReo = new boolean[] {false} ;
      T01G432_A130BarCodPar = new String[] {""} ;
      T01G432_n130BarCodPar = new boolean[] {false} ;
      T01G432_A4080estagrcod = new int[1] ;
      T01G432_A4081estagrreo = new byte[1] ;
      T01G432_A4082estagrpar = new String[] {""} ;
      T01G433_A396EmprCod = new String[] {""} ;
      T01G433_n396EmprCod = new boolean[] {false} ;
      T01G433_A129BarCod = new int[1] ;
      T01G433_n129BarCod = new boolean[] {false} ;
      T01G433_A132BarCodReo = new byte[1] ;
      T01G433_n132BarCodReo = new boolean[] {false} ;
      T01G433_A130BarCodPar = new String[] {""} ;
      T01G433_n130BarCodPar = new boolean[] {false} ;
      T01G433_A4075recestncol = new byte[1] ;
      T01G433_A4076recestnpro = new byte[1] ;
      T01G434_A396EmprCod = new String[] {""} ;
      T01G434_n396EmprCod = new boolean[] {false} ;
      T01G434_A602MaqCod = new String[] {""} ;
      T01G434_A1142MaqFCod = new String[] {""} ;
      T01G434_A3068PlaEtaOrd = new short[1] ;
      T01G434_A3069PlaEtaOrdA = new byte[1] ;
      T01G434_A129BarCod = new int[1] ;
      T01G434_n129BarCod = new boolean[] {false} ;
      T01G434_A132BarCodReo = new byte[1] ;
      T01G434_n132BarCodReo = new boolean[] {false} ;
      T01G434_A130BarCodPar = new String[] {""} ;
      T01G434_n130BarCodPar = new boolean[] {false} ;
      T01G435_A396EmprCod = new String[] {""} ;
      T01G435_n396EmprCod = new boolean[] {false} ;
      T01G435_A129BarCod = new int[1] ;
      T01G435_n129BarCod = new boolean[] {false} ;
      T01G435_A132BarCodReo = new byte[1] ;
      T01G435_n132BarCodReo = new boolean[] {false} ;
      T01G435_A130BarCodPar = new String[] {""} ;
      T01G435_n130BarCodPar = new boolean[] {false} ;
      T01G435_A4846BarAudLin = new short[1] ;
      T01G436_A396EmprCod = new String[] {""} ;
      T01G436_n396EmprCod = new boolean[] {false} ;
      T01G436_A129BarCod = new int[1] ;
      T01G436_n129BarCod = new boolean[] {false} ;
      T01G436_A132BarCodReo = new byte[1] ;
      T01G436_n132BarCodReo = new boolean[] {false} ;
      T01G436_A130BarCodPar = new String[] {""} ;
      T01G436_n130BarCodPar = new boolean[] {false} ;
      T01G436_A3940BarEnsLin = new short[1] ;
      T01G437_A396EmprCod = new String[] {""} ;
      T01G437_n396EmprCod = new boolean[] {false} ;
      T01G437_A129BarCod = new int[1] ;
      T01G437_n129BarCod = new boolean[] {false} ;
      T01G437_A132BarCodReo = new byte[1] ;
      T01G437_n132BarCodReo = new boolean[] {false} ;
      T01G437_A130BarCodPar = new String[] {""} ;
      T01G437_n130BarCodPar = new boolean[] {false} ;
      T01G437_A3384RefBarCod = new int[1] ;
      T01G437_A3385RefBarReo = new byte[1] ;
      T01G437_A3386RefBarPar = new String[] {""} ;
      T01G438_A396EmprCod = new String[] {""} ;
      T01G438_n396EmprCod = new boolean[] {false} ;
      T01G438_A10914SolSalCod = new int[1] ;
      T01G439_A396EmprCod = new String[] {""} ;
      T01G439_n396EmprCod = new boolean[] {false} ;
      T01G439_A10364Ph_numero = new int[1] ;
      T01G440_A396EmprCod = new String[] {""} ;
      T01G440_n396EmprCod = new boolean[] {false} ;
      T01G440_A129BarCod = new int[1] ;
      T01G440_n129BarCod = new boolean[] {false} ;
      T01G440_A132BarCodReo = new byte[1] ;
      T01G440_n132BarCodReo = new boolean[] {false} ;
      T01G440_A130BarCodPar = new String[] {""} ;
      T01G440_n130BarCodPar = new boolean[] {false} ;
      T01G440_A10197ProEspCod = new String[] {""} ;
      T01G441_A396EmprCod = new String[] {""} ;
      T01G441_n396EmprCod = new boolean[] {false} ;
      T01G441_A129BarCod = new int[1] ;
      T01G441_n129BarCod = new boolean[] {false} ;
      T01G441_A132BarCodReo = new byte[1] ;
      T01G441_n132BarCodReo = new boolean[] {false} ;
      T01G441_A130BarCodPar = new String[] {""} ;
      T01G441_n130BarCodPar = new boolean[] {false} ;
      T01G441_A5322Dp_Nrecep = new int[1] ;
      T01G442_A396EmprCod = new String[] {""} ;
      T01G442_n396EmprCod = new boolean[] {false} ;
      T01G442_A129BarCod = new int[1] ;
      T01G442_n129BarCod = new boolean[] {false} ;
      T01G442_A132BarCodReo = new byte[1] ;
      T01G442_n132BarCodReo = new boolean[] {false} ;
      T01G442_A130BarCodPar = new String[] {""} ;
      T01G442_n130BarCodPar = new boolean[] {false} ;
      T01G442_A8569EntSecLn = new int[1] ;
      T01G443_A396EmprCod = new String[] {""} ;
      T01G443_n396EmprCod = new boolean[] {false} ;
      T01G443_A7434PLLNro = new int[1] ;
      T01G443_A7443LPLNro = new short[1] ;
      T01G443_A7459CPLCom = new short[1] ;
      T01G443_A129BarCod = new int[1] ;
      T01G443_n129BarCod = new boolean[] {false} ;
      T01G443_A132BarCodReo = new byte[1] ;
      T01G443_n132BarCodReo = new boolean[] {false} ;
      T01G443_A130BarCodPar = new String[] {""} ;
      T01G443_n130BarCodPar = new boolean[] {false} ;
      T01G444_A396EmprCod = new String[] {""} ;
      T01G444_n396EmprCod = new boolean[] {false} ;
      T01G444_A7145OSSCod = new int[1] ;
      T01G445_A396EmprCod = new String[] {""} ;
      T01G445_n396EmprCod = new boolean[] {false} ;
      T01G445_A7049OGSCod = new int[1] ;
      T01G446_A396EmprCod = new String[] {""} ;
      T01G446_n396EmprCod = new boolean[] {false} ;
      T01G446_A129BarCod = new int[1] ;
      T01G446_n129BarCod = new boolean[] {false} ;
      T01G446_A132BarCodReo = new byte[1] ;
      T01G446_n132BarCodReo = new boolean[] {false} ;
      T01G446_A130BarCodPar = new String[] {""} ;
      T01G446_n130BarCodPar = new boolean[] {false} ;
      T01G446_A6031Ac_Barcod = new int[1] ;
      T01G446_A6032Ac_BarReo = new byte[1] ;
      T01G446_A6033Ac_BarPar = new String[] {""} ;
      T01G447_A396EmprCod = new String[] {""} ;
      T01G447_n396EmprCod = new boolean[] {false} ;
      T01G447_A129BarCod = new int[1] ;
      T01G447_n129BarCod = new boolean[] {false} ;
      T01G447_A132BarCodReo = new byte[1] ;
      T01G447_n132BarCodReo = new boolean[] {false} ;
      T01G447_A130BarCodPar = new String[] {""} ;
      T01G447_n130BarCodPar = new boolean[] {false} ;
      T01G447_A5908PartPal = new int[1] ;
      T01G448_A396EmprCod = new String[] {""} ;
      T01G448_n396EmprCod = new boolean[] {false} ;
      T01G448_A129BarCod = new int[1] ;
      T01G448_n129BarCod = new boolean[] {false} ;
      T01G448_A132BarCodReo = new byte[1] ;
      T01G448_n132BarCodReo = new boolean[] {false} ;
      T01G448_A130BarCodPar = new String[] {""} ;
      T01G448_n130BarCodPar = new boolean[] {false} ;
      T01G448_A2524DisComLin = new byte[1] ;
      T01G448_A1056DisComCod = new String[] {""} ;
      T01G448_A1032FonCod = new String[] {""} ;
      T01G449_A396EmprCod = new String[] {""} ;
      T01G449_n396EmprCod = new boolean[] {false} ;
      T01G449_A1736AlbExtCod = new long[1] ;
      T01G449_A129BarCod = new int[1] ;
      T01G449_n129BarCod = new boolean[] {false} ;
      T01G449_A132BarCodReo = new byte[1] ;
      T01G449_n132BarCodReo = new boolean[] {false} ;
      T01G449_A130BarCodPar = new String[] {""} ;
      T01G449_n130BarCodPar = new boolean[] {false} ;
      T01G450_A396EmprCod = new String[] {""} ;
      T01G450_n396EmprCod = new boolean[] {false} ;
      T01G450_A129BarCod = new int[1] ;
      T01G450_n129BarCod = new boolean[] {false} ;
      T01G450_A132BarCodReo = new byte[1] ;
      T01G450_n132BarCodReo = new boolean[] {false} ;
      T01G450_A130BarCodPar = new String[] {""} ;
      T01G450_n130BarCodPar = new boolean[] {false} ;
      T01G450_A3753BarFoaCod = new int[1] ;
      T01G450_A3754BarFoaReo = new byte[1] ;
      T01G450_A3755BarFoaPar = new String[] {""} ;
      T01G451_A396EmprCod = new String[] {""} ;
      T01G451_n396EmprCod = new boolean[] {false} ;
      T01G451_A129BarCod = new int[1] ;
      T01G451_n129BarCod = new boolean[] {false} ;
      T01G451_A132BarCodReo = new byte[1] ;
      T01G451_n132BarCodReo = new boolean[] {false} ;
      T01G451_A130BarCodPar = new String[] {""} ;
      T01G451_n130BarCodPar = new boolean[] {false} ;
      T01G451_A3747BarPegCod = new int[1] ;
      T01G451_A3748BarPegReo = new byte[1] ;
      T01G451_A3749BarPegPar = new String[] {""} ;
      T01G452_A396EmprCod = new String[] {""} ;
      T01G452_n396EmprCod = new boolean[] {false} ;
      T01G452_A3253SolTraCod = new int[1] ;
      T01G453_A396EmprCod = new String[] {""} ;
      T01G453_n396EmprCod = new boolean[] {false} ;
      T01G453_A3235SolSubCod = new int[1] ;
      T01G454_A396EmprCod = new String[] {""} ;
      T01G454_n396EmprCod = new boolean[] {false} ;
      T01G454_A3218SolLuzCod = new int[1] ;
      T01G455_A396EmprCod = new String[] {""} ;
      T01G455_n396EmprCod = new boolean[] {false} ;
      T01G455_A3196SolFriCod = new int[1] ;
      T01G456_A396EmprCod = new String[] {""} ;
      T01G456_n396EmprCod = new boolean[] {false} ;
      T01G456_A3165SolPilCod = new int[1] ;
      T01G457_A396EmprCod = new String[] {""} ;
      T01G457_n396EmprCod = new boolean[] {false} ;
      T01G457_A129BarCod = new int[1] ;
      T01G457_n129BarCod = new boolean[] {false} ;
      T01G457_A132BarCodReo = new byte[1] ;
      T01G457_n132BarCodReo = new boolean[] {false} ;
      T01G457_A130BarCodPar = new String[] {""} ;
      T01G457_n130BarCodPar = new boolean[] {false} ;
      T01G457_A2872HAnRLinMaq = new short[1] ;
      T01G457_A2873HAnRLinPro = new byte[1] ;
      T01G457_A2874HAnRLin = new short[1] ;
      T01G457_A2875HAnNumAny = new byte[1] ;
      T01G458_A396EmprCod = new String[] {""} ;
      T01G458_n396EmprCod = new boolean[] {false} ;
      T01G458_A2817PlaTer = new String[] {""} ;
      T01G458_A2818PlaOrd = new short[1] ;
      T01G459_A396EmprCod = new String[] {""} ;
      T01G459_n396EmprCod = new boolean[] {false} ;
      T01G459_A2809MetTerCod = new String[] {""} ;
      T01G459_A129BarCod = new int[1] ;
      T01G459_n129BarCod = new boolean[] {false} ;
      T01G459_A132BarCodReo = new byte[1] ;
      T01G459_n132BarCodReo = new boolean[] {false} ;
      T01G459_A130BarCodPar = new String[] {""} ;
      T01G459_n130BarCodPar = new boolean[] {false} ;
      T01G460_A396EmprCod = new String[] {""} ;
      T01G460_n396EmprCod = new boolean[] {false} ;
      T01G460_A129BarCod = new int[1] ;
      T01G460_n129BarCod = new boolean[] {false} ;
      T01G460_A132BarCodReo = new byte[1] ;
      T01G460_n132BarCodReo = new boolean[] {false} ;
      T01G460_A130BarCodPar = new String[] {""} ;
      T01G460_n130BarCodPar = new boolean[] {false} ;
      T01G460_A2808RecLinMAL = new short[1] ;
      T01G460_A1377RecNumAny = new byte[1] ;
      T01G460_A719PrdNum = new String[] {""} ;
      T01G461_A396EmprCod = new String[] {""} ;
      T01G461_n396EmprCod = new boolean[] {false} ;
      T01G461_A129BarCod = new int[1] ;
      T01G461_n129BarCod = new boolean[] {false} ;
      T01G461_A132BarCodReo = new byte[1] ;
      T01G461_n132BarCodReo = new boolean[] {false} ;
      T01G461_A130BarCodPar = new String[] {""} ;
      T01G461_n130BarCodPar = new boolean[] {false} ;
      T01G461_A2804RecLinMaq = new short[1] ;
      T01G462_A396EmprCod = new String[] {""} ;
      T01G462_n396EmprCod = new boolean[] {false} ;
      T01G462_A2792TermiCod = new String[] {""} ;
      T01G462_A129BarCod = new int[1] ;
      T01G462_n129BarCod = new boolean[] {false} ;
      T01G462_A132BarCodReo = new byte[1] ;
      T01G462_n132BarCodReo = new boolean[] {false} ;
      T01G462_A130BarCodPar = new String[] {""} ;
      T01G462_n130BarCodPar = new boolean[] {false} ;
      T01G463_A396EmprCod = new String[] {""} ;
      T01G463_n396EmprCod = new boolean[] {false} ;
      T01G463_A2248ManCod = new short[1] ;
      T01G463_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01G463_A2713RpExHdLi = new short[1] ;
      T01G464_A396EmprCod = new String[] {""} ;
      T01G464_n396EmprCod = new boolean[] {false} ;
      T01G464_A2248ManCod = new short[1] ;
      T01G464_A2689ExHdrFas = new String[] {""} ;
      T01G464_A2692ExHdrLin = new int[1] ;
      T01G465_A396EmprCod = new String[] {""} ;
      T01G465_n396EmprCod = new boolean[] {false} ;
      T01G465_A129BarCod = new int[1] ;
      T01G465_n129BarCod = new boolean[] {false} ;
      T01G465_A132BarCodReo = new byte[1] ;
      T01G465_n132BarCodReo = new boolean[] {false} ;
      T01G465_A130BarCodPar = new String[] {""} ;
      T01G465_n130BarCodPar = new boolean[] {false} ;
      T01G465_A2494BarDosPro = new String[] {""} ;
      T01G465_A719PrdNum = new String[] {""} ;
      T01G466_A396EmprCod = new String[] {""} ;
      T01G466_n396EmprCod = new boolean[] {false} ;
      T01G466_A602MaqCod = new String[] {""} ;
      T01G466_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01G466_A129BarCod = new int[1] ;
      T01G466_n129BarCod = new boolean[] {false} ;
      T01G466_A132BarCodReo = new byte[1] ;
      T01G466_n132BarCodReo = new boolean[] {false} ;
      T01G466_A130BarCodPar = new String[] {""} ;
      T01G466_n130BarCodPar = new boolean[] {false} ;
      T01G467_A396EmprCod = new String[] {""} ;
      T01G467_n396EmprCod = new boolean[] {false} ;
      T01G467_A129BarCod = new int[1] ;
      T01G467_n129BarCod = new boolean[] {false} ;
      T01G467_A132BarCodReo = new byte[1] ;
      T01G467_n132BarCodReo = new boolean[] {false} ;
      T01G467_A130BarCodPar = new String[] {""} ;
      T01G467_n130BarCodPar = new boolean[] {false} ;
      T01G467_A2457BarObLin = new short[1] ;
      T01G468_A396EmprCod = new String[] {""} ;
      T01G468_n396EmprCod = new boolean[] {false} ;
      T01G468_A129BarCod = new int[1] ;
      T01G468_n129BarCod = new boolean[] {false} ;
      T01G468_A132BarCodReo = new byte[1] ;
      T01G468_n132BarCodReo = new boolean[] {false} ;
      T01G468_A130BarCodPar = new String[] {""} ;
      T01G468_n130BarCodPar = new boolean[] {false} ;
      T01G468_A2444BarEnLin = new short[1] ;
      T01G469_A396EmprCod = new String[] {""} ;
      T01G469_n396EmprCod = new boolean[] {false} ;
      T01G469_A2406ExhAlbCod = new int[1] ;
      T01G469_A129BarCod = new int[1] ;
      T01G469_n129BarCod = new boolean[] {false} ;
      T01G469_A132BarCodReo = new byte[1] ;
      T01G469_n132BarCodReo = new boolean[] {false} ;
      T01G469_A130BarCodPar = new String[] {""} ;
      T01G469_n130BarCodPar = new boolean[] {false} ;
      T01G470_A396EmprCod = new String[] {""} ;
      T01G470_n396EmprCod = new boolean[] {false} ;
      T01G470_A2253SalExtAlb = new int[1] ;
      T01G470_A129BarCod = new int[1] ;
      T01G470_n129BarCod = new boolean[] {false} ;
      T01G470_A132BarCodReo = new byte[1] ;
      T01G470_n132BarCodReo = new boolean[] {false} ;
      T01G470_A130BarCodPar = new String[] {""} ;
      T01G470_n130BarCodPar = new boolean[] {false} ;
      T01G471_A396EmprCod = new String[] {""} ;
      T01G471_n396EmprCod = new boolean[] {false} ;
      T01G471_A30AlbProCod = new long[1] ;
      T01G471_A129BarCod = new int[1] ;
      T01G471_n129BarCod = new boolean[] {false} ;
      T01G471_A132BarCodReo = new byte[1] ;
      T01G471_n132BarCodReo = new boolean[] {false} ;
      T01G471_A130BarCodPar = new String[] {""} ;
      T01G471_n130BarCodPar = new boolean[] {false} ;
      T01G472_A396EmprCod = new String[] {""} ;
      T01G472_n396EmprCod = new boolean[] {false} ;
      T01G472_A1348SolColCod = new int[1] ;
      T01G473_A396EmprCod = new String[] {""} ;
      T01G473_n396EmprCod = new boolean[] {false} ;
      T01G473_A1333EstDimCod = new int[1] ;
      T01G474_A396EmprCod = new String[] {""} ;
      T01G474_n396EmprCod = new boolean[] {false} ;
      T01G474_A1314EnsLabCod = new int[1] ;
      T01G475_A396EmprCod = new String[] {""} ;
      T01G475_n396EmprCod = new boolean[] {false} ;
      T01G475_A129BarCod = new int[1] ;
      T01G475_n129BarCod = new boolean[] {false} ;
      T01G475_A132BarCodReo = new byte[1] ;
      T01G475_n132BarCodReo = new boolean[] {false} ;
      T01G475_A130BarCodPar = new String[] {""} ;
      T01G475_n130BarCodPar = new boolean[] {false} ;
      T01G475_A906ObsReoLin = new byte[1] ;
      T01G476_A396EmprCod = new String[] {""} ;
      T01G476_n396EmprCod = new boolean[] {false} ;
      T01G476_A859CumCodCont = new int[1] ;
      T01G477_A396EmprCod = new String[] {""} ;
      T01G477_n396EmprCod = new boolean[] {false} ;
      T01G477_A602MaqCod = new String[] {""} ;
      T01G477_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01G477_A561HisProLin = new int[1] ;
      T01G478_A396EmprCod = new String[] {""} ;
      T01G478_n396EmprCod = new boolean[] {false} ;
      T01G478_A252CliCod = new int[1] ;
      T01G478_n252CliCod = new boolean[] {false} ;
      T01G478_A494ForSer = new String[] {""} ;
      T01G478_A482ForColNom = new String[] {""} ;
      T01G478_A483ForColNum = new int[1] ;
      T01G478_A831TipColCod = new byte[1] ;
      T01G479_A396EmprCod = new String[] {""} ;
      T01G479_n396EmprCod = new boolean[] {false} ;
      T01G479_A129BarCod = new int[1] ;
      T01G479_n129BarCod = new boolean[] {false} ;
      T01G479_A132BarCodReo = new byte[1] ;
      T01G479_n132BarCodReo = new boolean[] {false} ;
      T01G479_A130BarCodPar = new String[] {""} ;
      T01G479_n130BarCodPar = new boolean[] {false} ;
      T01G479_A200BarPieCod = new String[] {""} ;
      T01G480_A396EmprCod = new String[] {""} ;
      T01G480_n396EmprCod = new boolean[] {false} ;
      T01G480_A129BarCod = new int[1] ;
      T01G480_n129BarCod = new boolean[] {false} ;
      T01G480_A132BarCodReo = new byte[1] ;
      T01G480_n132BarCodReo = new boolean[] {false} ;
      T01G480_A130BarCodPar = new String[] {""} ;
      T01G480_n130BarCodPar = new boolean[] {false} ;
      T01G480_A188BarNotLin = new byte[1] ;
      T01G481_A396EmprCod = new String[] {""} ;
      T01G481_n396EmprCod = new boolean[] {false} ;
      T01G481_A129BarCod = new int[1] ;
      T01G481_n129BarCod = new boolean[] {false} ;
      T01G481_A132BarCodReo = new byte[1] ;
      T01G481_n132BarCodReo = new boolean[] {false} ;
      T01G481_A130BarCodPar = new String[] {""} ;
      T01G481_n130BarCodPar = new boolean[] {false} ;
      T01G481_A758ProCod = new String[] {""} ;
      T01G482_A396EmprCod = new String[] {""} ;
      T01G482_n396EmprCod = new boolean[] {false} ;
      T01G482_A129BarCod = new int[1] ;
      T01G482_n129BarCod = new boolean[] {false} ;
      T01G482_A132BarCodReo = new byte[1] ;
      T01G482_n132BarCodReo = new boolean[] {false} ;
      T01G482_A130BarCodPar = new String[] {""} ;
      T01G482_n130BarCodPar = new boolean[] {false} ;
      T01G482_A119BarAgrCod = new int[1] ;
      T01G482_A124BarAgrReo = new byte[1] ;
      T01G482_A122BarAgrPar = new String[] {""} ;
      T01G484_A396EmprCod = new String[] {""} ;
      T01G484_n396EmprCod = new boolean[] {false} ;
      T01G484_A129BarCod = new int[1] ;
      T01G484_n129BarCod = new boolean[] {false} ;
      T01G484_A132BarCodReo = new byte[1] ;
      T01G484_n132BarCodReo = new boolean[] {false} ;
      T01G484_A130BarCodPar = new String[] {""} ;
      T01G484_n130BarCodPar = new boolean[] {false} ;
      T01G485_A129BarCod = new int[1] ;
      T01G485_n129BarCod = new boolean[] {false} ;
      T01G485_A132BarCodReo = new byte[1] ;
      T01G485_n132BarCodReo = new boolean[] {false} ;
      T01G485_A130BarCodPar = new String[] {""} ;
      T01G485_n130BarCodPar = new boolean[] {false} ;
      T01G485_A4118tinagrcod = new int[1] ;
      T01G485_A4119tinagrreo = new byte[1] ;
      T01G485_A4120tinagrpar = new String[] {""} ;
      T01G485_A396EmprCod = new String[] {""} ;
      T01G485_n396EmprCod = new boolean[] {false} ;
      T01G486_A396EmprCod = new String[] {""} ;
      T01G486_n396EmprCod = new boolean[] {false} ;
      T01G486_A129BarCod = new int[1] ;
      T01G486_n129BarCod = new boolean[] {false} ;
      T01G486_A132BarCodReo = new byte[1] ;
      T01G486_n132BarCodReo = new boolean[] {false} ;
      T01G486_A130BarCodPar = new String[] {""} ;
      T01G486_n130BarCodPar = new boolean[] {false} ;
      T01G486_A4118tinagrcod = new int[1] ;
      T01G486_A4119tinagrreo = new byte[1] ;
      T01G486_A4120tinagrpar = new String[] {""} ;
      T01G43_A129BarCod = new int[1] ;
      T01G43_n129BarCod = new boolean[] {false} ;
      T01G43_A132BarCodReo = new byte[1] ;
      T01G43_n132BarCodReo = new boolean[] {false} ;
      T01G43_A130BarCodPar = new String[] {""} ;
      T01G43_n130BarCodPar = new boolean[] {false} ;
      T01G43_A4118tinagrcod = new int[1] ;
      T01G43_A4119tinagrreo = new byte[1] ;
      T01G43_A4120tinagrpar = new String[] {""} ;
      T01G43_A396EmprCod = new String[] {""} ;
      T01G43_n396EmprCod = new boolean[] {false} ;
      T01G42_A129BarCod = new int[1] ;
      T01G42_n129BarCod = new boolean[] {false} ;
      T01G42_A132BarCodReo = new byte[1] ;
      T01G42_n132BarCodReo = new boolean[] {false} ;
      T01G42_A130BarCodPar = new String[] {""} ;
      T01G42_n130BarCodPar = new boolean[] {false} ;
      T01G42_A4118tinagrcod = new int[1] ;
      T01G42_A4119tinagrreo = new byte[1] ;
      T01G42_A4120tinagrpar = new String[] {""} ;
      T01G42_A396EmprCod = new String[] {""} ;
      T01G42_n396EmprCod = new boolean[] {false} ;
      T01G489_A396EmprCod = new String[] {""} ;
      T01G489_n396EmprCod = new boolean[] {false} ;
      T01G489_A129BarCod = new int[1] ;
      T01G489_n129BarCod = new boolean[] {false} ;
      T01G489_A132BarCodReo = new byte[1] ;
      T01G489_n132BarCodReo = new boolean[] {false} ;
      T01G489_A130BarCodPar = new String[] {""} ;
      T01G489_n130BarCodPar = new boolean[] {false} ;
      T01G489_A4118tinagrcod = new int[1] ;
      T01G489_A4119tinagrreo = new byte[1] ;
      T01G489_A4120tinagrpar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int10 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      T01G490_A407EmprNom = new String[] {""} ;
      T01G490_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ2010BarTipDis = "" ;
      ZZ365DisDes = "" ;
      ZZ2759BarMaqGru = "" ;
      ZO180BarMaqCod = "" ;
      GXv_char9 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttinagr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttinagr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttinagr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttinagr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttinagr__default(),
         new Object[] {
             new Object[] {
            T01G42_A129BarCod, T01G42_A132BarCodReo, T01G42_A130BarCodPar, T01G42_A4118tinagrcod, T01G42_A4119tinagrreo, T01G42_A4120tinagrpar, T01G42_A396EmprCod
            }
            , new Object[] {
            T01G43_A129BarCod, T01G43_A132BarCodReo, T01G43_A130BarCodPar, T01G43_A4118tinagrcod, T01G43_A4119tinagrreo, T01G43_A4120tinagrpar, T01G43_A396EmprCod
            }
            , new Object[] {
            T01G44_A361DisCod, T01G44_A2759BarMaqGru, T01G44_A129BarCod, T01G44_A132BarCodReo, T01G44_A130BarCodPar, T01G44_A236BarVolMaq, T01G44_A120BarAgrEst, T01G44_A180BarMaqCod, T01G44_A213BarSit, T01G44_A2010BarTipDis,
            T01G44_A396EmprCod, T01G44_A252CliCod, T01G44_n252CliCod, T01G44_A365DisDes
            }
            , new Object[] {
            T01G45_A361DisCod, T01G45_A2759BarMaqGru, T01G45_A129BarCod, T01G45_A132BarCodReo, T01G45_A130BarCodPar, T01G45_A236BarVolMaq, T01G45_A120BarAgrEst, T01G45_A180BarMaqCod, T01G45_A213BarSit, T01G45_A2010BarTipDis,
            T01G45_A396EmprCod, T01G45_A252CliCod, T01G45_n252CliCod, T01G45_A365DisDes
            }
            , new Object[] {
            T01G46_A407EmprNom, T01G46_n407EmprNom
            }
            , new Object[] {
            T01G47_A252CliCod, T01G47_A365DisDes
            }
            , new Object[] {
            T01G49_A478FindVolMax, T01G49_A479FindVolMed, T01G49_A480FindVolMin
            }
            , new Object[] {
            T01G410_A361DisCod, T01G410_A2759BarMaqGru, T01G410_A129BarCod, T01G410_A132BarCodReo, T01G410_A130BarCodPar, T01G410_A236BarVolMaq, T01G410_A407EmprNom, T01G410_n407EmprNom, T01G410_A120BarAgrEst, T01G410_A180BarMaqCod,
            T01G410_A213BarSit, T01G410_A2010BarTipDis, T01G410_A252CliCod, T01G410_n252CliCod, T01G410_A365DisDes, T01G410_A396EmprCod
            }
            , new Object[] {
            T01G412_A478FindVolMax, T01G412_A479FindVolMed, T01G412_A480FindVolMin
            }
            , new Object[] {
            T01G413_A396EmprCod, T01G413_A129BarCod, T01G413_A132BarCodReo, T01G413_A130BarCodPar
            }
            , new Object[] {
            T01G414_A396EmprCod, T01G414_A129BarCod, T01G414_A132BarCodReo, T01G414_A130BarCodPar
            }
            , new Object[] {
            T01G415_A396EmprCod, T01G415_A129BarCod, T01G415_A132BarCodReo, T01G415_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G420_A478FindVolMax, T01G420_A479FindVolMed, T01G420_A480FindVolMin
            }
            , new Object[] {
            T01G421_A14681MRPrId
            }
            , new Object[] {
            T01G422_A5921XCjaDis, T01G422_A5922XCjaCod
            }
            , new Object[] {
            T01G423_A396EmprCod, T01G423_A129BarCod, T01G423_A132BarCodReo, T01G423_A130BarCodPar, T01G423_A14152MEnvOrd
            }
            , new Object[] {
            T01G424_A396EmprCod, T01G424_A129BarCod, T01G424_A132BarCodReo, T01G424_A130BarCodPar, T01G424_A13905BarTraID
            }
            , new Object[] {
            T01G425_A396EmprCod, T01G425_A129BarCod, T01G425_A132BarCodReo, T01G425_A130BarCodPar, T01G425_A13093BarDGLin, T01G425_A13094BarDGDibCl, T01G425_A13095BarDGDibIn, T01G425_A13096BarDGComb, T01G425_A13097BarDGFOndo
            }
            , new Object[] {
            T01G426_A396EmprCod, T01G426_A11917Ebd_numero
            }
            , new Object[] {
            T01G427_A396EmprCod, T01G427_A11898Prd_numero
            }
            , new Object[] {
            T01G428_A396EmprCod, T01G428_A11849Cte_numero
            }
            , new Object[] {
            T01G429_A396EmprCod, T01G429_A11791Ap_numero
            }
            , new Object[] {
            T01G430_A396EmprCod, T01G430_A3985CalBarCod, T01G430_A3986CalBarCodR, T01G430_A3987CalBarCodP
            }
            , new Object[] {
            T01G431_A396EmprCod, T01G431_A5294InPTime, T01G431_A652OpeCod
            }
            , new Object[] {
            T01G432_A396EmprCod, T01G432_A129BarCod, T01G432_A132BarCodReo, T01G432_A130BarCodPar, T01G432_A4080estagrcod, T01G432_A4081estagrreo, T01G432_A4082estagrpar
            }
            , new Object[] {
            T01G433_A396EmprCod, T01G433_A129BarCod, T01G433_A132BarCodReo, T01G433_A130BarCodPar, T01G433_A4075recestncol, T01G433_A4076recestnpro
            }
            , new Object[] {
            T01G434_A396EmprCod, T01G434_A602MaqCod, T01G434_A1142MaqFCod, T01G434_A3068PlaEtaOrd, T01G434_A3069PlaEtaOrdA, T01G434_A129BarCod, T01G434_A132BarCodReo, T01G434_A130BarCodPar
            }
            , new Object[] {
            T01G435_A396EmprCod, T01G435_A129BarCod, T01G435_A132BarCodReo, T01G435_A130BarCodPar, T01G435_A4846BarAudLin
            }
            , new Object[] {
            T01G436_A396EmprCod, T01G436_A129BarCod, T01G436_A132BarCodReo, T01G436_A130BarCodPar, T01G436_A3940BarEnsLin
            }
            , new Object[] {
            T01G437_A396EmprCod, T01G437_A129BarCod, T01G437_A132BarCodReo, T01G437_A130BarCodPar, T01G437_A3384RefBarCod, T01G437_A3385RefBarReo, T01G437_A3386RefBarPar
            }
            , new Object[] {
            T01G438_A396EmprCod, T01G438_A10914SolSalCod
            }
            , new Object[] {
            T01G439_A396EmprCod, T01G439_A10364Ph_numero
            }
            , new Object[] {
            T01G440_A396EmprCod, T01G440_A129BarCod, T01G440_A132BarCodReo, T01G440_A130BarCodPar, T01G440_A10197ProEspCod
            }
            , new Object[] {
            T01G441_A396EmprCod, T01G441_A129BarCod, T01G441_A132BarCodReo, T01G441_A130BarCodPar, T01G441_A5322Dp_Nrecep
            }
            , new Object[] {
            T01G442_A396EmprCod, T01G442_A129BarCod, T01G442_A132BarCodReo, T01G442_A130BarCodPar, T01G442_A8569EntSecLn
            }
            , new Object[] {
            T01G443_A396EmprCod, T01G443_A7434PLLNro, T01G443_A7443LPLNro, T01G443_A7459CPLCom, T01G443_A129BarCod, T01G443_A132BarCodReo, T01G443_A130BarCodPar
            }
            , new Object[] {
            T01G444_A396EmprCod, T01G444_A7145OSSCod
            }
            , new Object[] {
            T01G445_A396EmprCod, T01G445_A7049OGSCod
            }
            , new Object[] {
            T01G446_A396EmprCod, T01G446_A129BarCod, T01G446_A132BarCodReo, T01G446_A130BarCodPar, T01G446_A6031Ac_Barcod, T01G446_A6032Ac_BarReo, T01G446_A6033Ac_BarPar
            }
            , new Object[] {
            T01G447_A396EmprCod, T01G447_A129BarCod, T01G447_A132BarCodReo, T01G447_A130BarCodPar, T01G447_A5908PartPal
            }
            , new Object[] {
            T01G448_A396EmprCod, T01G448_A129BarCod, T01G448_A132BarCodReo, T01G448_A130BarCodPar, T01G448_A2524DisComLin, T01G448_A1056DisComCod, T01G448_A1032FonCod
            }
            , new Object[] {
            T01G449_A396EmprCod, T01G449_A1736AlbExtCod, T01G449_A129BarCod, T01G449_A132BarCodReo, T01G449_A130BarCodPar
            }
            , new Object[] {
            T01G450_A396EmprCod, T01G450_A129BarCod, T01G450_A132BarCodReo, T01G450_A130BarCodPar, T01G450_A3753BarFoaCod, T01G450_A3754BarFoaReo, T01G450_A3755BarFoaPar
            }
            , new Object[] {
            T01G451_A396EmprCod, T01G451_A129BarCod, T01G451_A132BarCodReo, T01G451_A130BarCodPar, T01G451_A3747BarPegCod, T01G451_A3748BarPegReo, T01G451_A3749BarPegPar
            }
            , new Object[] {
            T01G452_A396EmprCod, T01G452_A3253SolTraCod
            }
            , new Object[] {
            T01G453_A396EmprCod, T01G453_A3235SolSubCod
            }
            , new Object[] {
            T01G454_A396EmprCod, T01G454_A3218SolLuzCod
            }
            , new Object[] {
            T01G455_A396EmprCod, T01G455_A3196SolFriCod
            }
            , new Object[] {
            T01G456_A396EmprCod, T01G456_A3165SolPilCod
            }
            , new Object[] {
            T01G457_A396EmprCod, T01G457_A129BarCod, T01G457_A132BarCodReo, T01G457_A130BarCodPar, T01G457_A2872HAnRLinMaq, T01G457_A2873HAnRLinPro, T01G457_A2874HAnRLin, T01G457_A2875HAnNumAny
            }
            , new Object[] {
            T01G458_A396EmprCod, T01G458_A2817PlaTer, T01G458_A2818PlaOrd
            }
            , new Object[] {
            T01G459_A396EmprCod, T01G459_A2809MetTerCod, T01G459_A129BarCod, T01G459_A132BarCodReo, T01G459_A130BarCodPar
            }
            , new Object[] {
            T01G460_A396EmprCod, T01G460_A129BarCod, T01G460_A132BarCodReo, T01G460_A130BarCodPar, T01G460_A2808RecLinMAL, T01G460_A1377RecNumAny, T01G460_A719PrdNum
            }
            , new Object[] {
            T01G461_A396EmprCod, T01G461_A129BarCod, T01G461_A132BarCodReo, T01G461_A130BarCodPar, T01G461_A2804RecLinMaq
            }
            , new Object[] {
            T01G462_A396EmprCod, T01G462_A2792TermiCod, T01G462_A129BarCod, T01G462_A132BarCodReo, T01G462_A130BarCodPar
            }
            , new Object[] {
            T01G463_A396EmprCod, T01G463_A2248ManCod, T01G463_A2711RpExHdFe, T01G463_A2713RpExHdLi
            }
            , new Object[] {
            T01G464_A396EmprCod, T01G464_A2248ManCod, T01G464_A2689ExHdrFas, T01G464_A2692ExHdrLin
            }
            , new Object[] {
            T01G465_A396EmprCod, T01G465_A129BarCod, T01G465_A132BarCodReo, T01G465_A130BarCodPar, T01G465_A2494BarDosPro, T01G465_A719PrdNum
            }
            , new Object[] {
            T01G466_A396EmprCod, T01G466_A602MaqCod, T01G466_A2461PlaFecTin, T01G466_A129BarCod, T01G466_A132BarCodReo, T01G466_A130BarCodPar
            }
            , new Object[] {
            T01G467_A396EmprCod, T01G467_A129BarCod, T01G467_A132BarCodReo, T01G467_A130BarCodPar, T01G467_A2457BarObLin
            }
            , new Object[] {
            T01G468_A396EmprCod, T01G468_A129BarCod, T01G468_A132BarCodReo, T01G468_A130BarCodPar, T01G468_A2444BarEnLin
            }
            , new Object[] {
            T01G469_A396EmprCod, T01G469_A2406ExhAlbCod, T01G469_A129BarCod, T01G469_A132BarCodReo, T01G469_A130BarCodPar
            }
            , new Object[] {
            T01G470_A396EmprCod, T01G470_A2253SalExtAlb, T01G470_A129BarCod, T01G470_A132BarCodReo, T01G470_A130BarCodPar
            }
            , new Object[] {
            T01G471_A396EmprCod, T01G471_A30AlbProCod, T01G471_A129BarCod, T01G471_A132BarCodReo, T01G471_A130BarCodPar
            }
            , new Object[] {
            T01G472_A396EmprCod, T01G472_A1348SolColCod
            }
            , new Object[] {
            T01G473_A396EmprCod, T01G473_A1333EstDimCod
            }
            , new Object[] {
            T01G474_A396EmprCod, T01G474_A1314EnsLabCod
            }
            , new Object[] {
            T01G475_A396EmprCod, T01G475_A129BarCod, T01G475_A132BarCodReo, T01G475_A130BarCodPar, T01G475_A906ObsReoLin
            }
            , new Object[] {
            T01G476_A396EmprCod, T01G476_A859CumCodCont
            }
            , new Object[] {
            T01G477_A396EmprCod, T01G477_A602MaqCod, T01G477_A558HisProFec, T01G477_A561HisProLin
            }
            , new Object[] {
            T01G478_A396EmprCod, T01G478_A252CliCod, T01G478_A494ForSer, T01G478_A482ForColNom, T01G478_A483ForColNum, T01G478_A831TipColCod
            }
            , new Object[] {
            T01G479_A396EmprCod, T01G479_A129BarCod, T01G479_A132BarCodReo, T01G479_A130BarCodPar, T01G479_A200BarPieCod
            }
            , new Object[] {
            T01G480_A396EmprCod, T01G480_A129BarCod, T01G480_A132BarCodReo, T01G480_A130BarCodPar, T01G480_A188BarNotLin
            }
            , new Object[] {
            T01G481_A396EmprCod, T01G481_A129BarCod, T01G481_A132BarCodReo, T01G481_A130BarCodPar, T01G481_A758ProCod
            }
            , new Object[] {
            T01G482_A396EmprCod, T01G482_A129BarCod, T01G482_A132BarCodReo, T01G482_A130BarCodPar, T01G482_A119BarAgrCod, T01G482_A124BarAgrReo, T01G482_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01G484_A396EmprCod, T01G484_A129BarCod, T01G484_A132BarCodReo, T01G484_A130BarCodPar
            }
            , new Object[] {
            T01G485_A129BarCod, T01G485_A132BarCodReo, T01G485_A130BarCodPar, T01G485_A4118tinagrcod, T01G485_A4119tinagrreo, T01G485_A4120tinagrpar, T01G485_A396EmprCod
            }
            , new Object[] {
            T01G486_A396EmprCod, T01G486_A129BarCod, T01G486_A132BarCodReo, T01G486_A130BarCodPar, T01G486_A4118tinagrcod, T01G486_A4119tinagrreo, T01G486_A4120tinagrpar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G489_A396EmprCod, T01G489_A129BarCod, T01G489_A132BarCodReo, T01G489_A130BarCodPar, T01G489_A4118tinagrcod, T01G489_A4119tinagrreo, T01G489_A4120tinagrpar
            }
            , new Object[] {
            T01G490_A407EmprNom, T01G490_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
      AV33Pgmname = "Ttinagr" ;
   }

   private byte Z132BarCodReo ;
   private byte Z213BarSit ;
   private byte Z4119tinagrreo ;
   private byte GxWebError ;
   private byte AV32flag ;
   private byte A132BarCodReo ;
   private byte A4119tinagrreo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZV32flag ;
   private byte ZZ132BarCodReo ;
   private byte ZZ213BarSit ;
   private byte ZZV32flag ;
   private byte GXv_int8[] ;
   private short nRcdDeleted_1596 ;
   private short nRcdExists_1596 ;
   private short nIsMod_1596 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1596 ;
   private short RcdFound1596 ;
   private short nBlankRcdUsr1596 ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1596 ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z236BarVolMaq ;
   private int Z252CliCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int Z4118tinagrcod ;
   private int A129BarCod ;
   private int A4118tinagrcod ;
   private int A236BarVolMaq ;
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
   private int edtEmprNom_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int edtBarVolMaq_Enabled ;
   private int A479FindVolMed ;
   private int edtFindVolMed_Enabled ;
   private int A480FindVolMin ;
   private int edtFindVolMin_Enabled ;
   private int A478FindVolMax ;
   private int edtFindVolMax_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarTipDis_Enabled ;
   private int edtavnRcdDeleted_1596_Enabled ;
   private int edttinagrcod_Enabled ;
   private int edttinagrreo_Enabled ;
   private int edttinagrpar_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedttinagrpar_Enabled ;
   private int defedttinagrreo_Enabled ;
   private int defedttinagrcod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarTipDis_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtFindVolMax_Backcolor ;
   private int edtFindVolMin_Backcolor ;
   private int edtFindVolMed_Backcolor ;
   private int edtBarVolMaq_Backcolor ;
   private int edtBarMaqCod_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int10[] ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int Z478FindVolMax ;
   private int Z479FindVolMed ;
   private int Z480FindVolMin ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ478FindVolMax ;
   private int ZZ479FindVolMed ;
   private int ZZ480FindVolMin ;
   private int ZZ236BarVolMaq ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z120BarAgrEst ;
   private String Z180BarMaqCod ;
   private String Z2010BarTipDis ;
   private String O180BarMaqCod ;
   private String Z4120tinagrpar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
   private String A4120tinagrpar ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarVolMaq_Internalname ;
   private String edtBarVolMaq_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFindVolMed_Internalname ;
   private String edtFindVolMed_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFindVolMin_Internalname ;
   private String edtFindVolMin_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFindVolMax_Internalname ;
   private String edtFindVolMax_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarTipDis_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Jsonclick ;
   private String B180BarMaqCod ;
   private String sMode1596 ;
   private String edtavnRcdDeleted_1596_Internalname ;
   private String edttinagrcod_Internalname ;
   private String edttinagrreo_Internalname ;
   private String edttinagrpar_Internalname ;
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
   private String A365DisDes ;
   private String AV33Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1596_Jsonclick ;
   private String edttinagrcod_Jsonclick ;
   private String edttinagrreo_Jsonclick ;
   private String edttinagrpar_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ120BarAgrEst ;
   private String ZZ180BarMaqCod ;
   private String ZZ2010BarTipDis ;
   private String ZZ365DisDes ;
   private String ZZ2759BarMaqGru ;
   private String ZO180BarMaqCod ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01G46_A407EmprNom ;
   private boolean[] T01G46_n407EmprNom ;
   private int[] T01G47_A252CliCod ;
   private boolean[] T01G47_n252CliCod ;
   private String[] T01G47_A365DisDes ;
   private int[] T01G410_A361DisCod ;
   private String[] T01G410_A2759BarMaqGru ;
   private int[] T01G410_A129BarCod ;
   private boolean[] T01G410_n129BarCod ;
   private byte[] T01G410_A132BarCodReo ;
   private boolean[] T01G410_n132BarCodReo ;
   private String[] T01G410_A130BarCodPar ;
   private boolean[] T01G410_n130BarCodPar ;
   private int[] T01G410_A236BarVolMaq ;
   private String[] T01G410_A407EmprNom ;
   private boolean[] T01G410_n407EmprNom ;
   private String[] T01G410_A120BarAgrEst ;
   private String[] T01G410_A180BarMaqCod ;
   private byte[] T01G410_A213BarSit ;
   private String[] T01G410_A2010BarTipDis ;
   private int[] T01G410_A252CliCod ;
   private boolean[] T01G410_n252CliCod ;
   private String[] T01G410_A365DisDes ;
   private String[] T01G410_A396EmprCod ;
   private boolean[] T01G410_n396EmprCod ;
   private int[] T01G49_A478FindVolMax ;
   private int[] T01G49_A479FindVolMed ;
   private int[] T01G49_A480FindVolMin ;
   private int[] T01G412_A478FindVolMax ;
   private int[] T01G412_A479FindVolMed ;
   private int[] T01G412_A480FindVolMin ;
   private String[] T01G413_A396EmprCod ;
   private boolean[] T01G413_n396EmprCod ;
   private int[] T01G413_A129BarCod ;
   private boolean[] T01G413_n129BarCod ;
   private byte[] T01G413_A132BarCodReo ;
   private boolean[] T01G413_n132BarCodReo ;
   private String[] T01G413_A130BarCodPar ;
   private boolean[] T01G413_n130BarCodPar ;
   private int[] T01G45_A361DisCod ;
   private String[] T01G45_A2759BarMaqGru ;
   private int[] T01G45_A129BarCod ;
   private boolean[] T01G45_n129BarCod ;
   private byte[] T01G45_A132BarCodReo ;
   private boolean[] T01G45_n132BarCodReo ;
   private String[] T01G45_A130BarCodPar ;
   private boolean[] T01G45_n130BarCodPar ;
   private int[] T01G45_A236BarVolMaq ;
   private String[] T01G45_A120BarAgrEst ;
   private String[] T01G45_A180BarMaqCod ;
   private byte[] T01G45_A213BarSit ;
   private String[] T01G45_A2010BarTipDis ;
   private String[] T01G45_A396EmprCod ;
   private boolean[] T01G45_n396EmprCod ;
   private int[] T01G45_A252CliCod ;
   private boolean[] T01G45_n252CliCod ;
   private String[] T01G45_A365DisDes ;
   private String[] T01G414_A396EmprCod ;
   private boolean[] T01G414_n396EmprCod ;
   private int[] T01G414_A129BarCod ;
   private boolean[] T01G414_n129BarCod ;
   private byte[] T01G414_A132BarCodReo ;
   private boolean[] T01G414_n132BarCodReo ;
   private String[] T01G414_A130BarCodPar ;
   private boolean[] T01G414_n130BarCodPar ;
   private String[] T01G415_A396EmprCod ;
   private boolean[] T01G415_n396EmprCod ;
   private int[] T01G415_A129BarCod ;
   private boolean[] T01G415_n129BarCod ;
   private byte[] T01G415_A132BarCodReo ;
   private boolean[] T01G415_n132BarCodReo ;
   private String[] T01G415_A130BarCodPar ;
   private boolean[] T01G415_n130BarCodPar ;
   private int[] T01G44_A361DisCod ;
   private String[] T01G44_A2759BarMaqGru ;
   private int[] T01G44_A129BarCod ;
   private boolean[] T01G44_n129BarCod ;
   private byte[] T01G44_A132BarCodReo ;
   private boolean[] T01G44_n132BarCodReo ;
   private String[] T01G44_A130BarCodPar ;
   private boolean[] T01G44_n130BarCodPar ;
   private int[] T01G44_A236BarVolMaq ;
   private String[] T01G44_A120BarAgrEst ;
   private String[] T01G44_A180BarMaqCod ;
   private byte[] T01G44_A213BarSit ;
   private String[] T01G44_A2010BarTipDis ;
   private String[] T01G44_A396EmprCod ;
   private boolean[] T01G44_n396EmprCod ;
   private int[] T01G44_A252CliCod ;
   private boolean[] T01G44_n252CliCod ;
   private String[] T01G44_A365DisDes ;
   private int[] T01G420_A478FindVolMax ;
   private int[] T01G420_A479FindVolMed ;
   private int[] T01G420_A480FindVolMin ;
   private long[] T01G421_A14681MRPrId ;
   private String[] T01G422_A5921XCjaDis ;
   private long[] T01G422_A5922XCjaCod ;
   private String[] T01G423_A396EmprCod ;
   private boolean[] T01G423_n396EmprCod ;
   private int[] T01G423_A129BarCod ;
   private boolean[] T01G423_n129BarCod ;
   private byte[] T01G423_A132BarCodReo ;
   private boolean[] T01G423_n132BarCodReo ;
   private String[] T01G423_A130BarCodPar ;
   private boolean[] T01G423_n130BarCodPar ;
   private short[] T01G423_A14152MEnvOrd ;
   private String[] T01G424_A396EmprCod ;
   private boolean[] T01G424_n396EmprCod ;
   private int[] T01G424_A129BarCod ;
   private boolean[] T01G424_n129BarCod ;
   private byte[] T01G424_A132BarCodReo ;
   private boolean[] T01G424_n132BarCodReo ;
   private String[] T01G424_A130BarCodPar ;
   private boolean[] T01G424_n130BarCodPar ;
   private String[] T01G424_A13905BarTraID ;
   private String[] T01G425_A396EmprCod ;
   private boolean[] T01G425_n396EmprCod ;
   private int[] T01G425_A129BarCod ;
   private boolean[] T01G425_n129BarCod ;
   private byte[] T01G425_A132BarCodReo ;
   private boolean[] T01G425_n132BarCodReo ;
   private String[] T01G425_A130BarCodPar ;
   private boolean[] T01G425_n130BarCodPar ;
   private byte[] T01G425_A13093BarDGLin ;
   private String[] T01G425_A13094BarDGDibCl ;
   private int[] T01G425_A13095BarDGDibIn ;
   private String[] T01G425_A13096BarDGComb ;
   private String[] T01G425_A13097BarDGFOndo ;
   private String[] T01G426_A396EmprCod ;
   private boolean[] T01G426_n396EmprCod ;
   private int[] T01G426_A11917Ebd_numero ;
   private String[] T01G427_A396EmprCod ;
   private boolean[] T01G427_n396EmprCod ;
   private int[] T01G427_A11898Prd_numero ;
   private String[] T01G428_A396EmprCod ;
   private boolean[] T01G428_n396EmprCod ;
   private int[] T01G428_A11849Cte_numero ;
   private String[] T01G429_A396EmprCod ;
   private boolean[] T01G429_n396EmprCod ;
   private int[] T01G429_A11791Ap_numero ;
   private String[] T01G430_A396EmprCod ;
   private boolean[] T01G430_n396EmprCod ;
   private int[] T01G430_A3985CalBarCod ;
   private byte[] T01G430_A3986CalBarCodR ;
   private String[] T01G430_A3987CalBarCodP ;
   private String[] T01G431_A396EmprCod ;
   private boolean[] T01G431_n396EmprCod ;
   private java.util.Date[] T01G431_A5294InPTime ;
   private int[] T01G431_A652OpeCod ;
   private String[] T01G432_A396EmprCod ;
   private boolean[] T01G432_n396EmprCod ;
   private int[] T01G432_A129BarCod ;
   private boolean[] T01G432_n129BarCod ;
   private byte[] T01G432_A132BarCodReo ;
   private boolean[] T01G432_n132BarCodReo ;
   private String[] T01G432_A130BarCodPar ;
   private boolean[] T01G432_n130BarCodPar ;
   private int[] T01G432_A4080estagrcod ;
   private byte[] T01G432_A4081estagrreo ;
   private String[] T01G432_A4082estagrpar ;
   private String[] T01G433_A396EmprCod ;
   private boolean[] T01G433_n396EmprCod ;
   private int[] T01G433_A129BarCod ;
   private boolean[] T01G433_n129BarCod ;
   private byte[] T01G433_A132BarCodReo ;
   private boolean[] T01G433_n132BarCodReo ;
   private String[] T01G433_A130BarCodPar ;
   private boolean[] T01G433_n130BarCodPar ;
   private byte[] T01G433_A4075recestncol ;
   private byte[] T01G433_A4076recestnpro ;
   private String[] T01G434_A396EmprCod ;
   private boolean[] T01G434_n396EmprCod ;
   private String[] T01G434_A602MaqCod ;
   private String[] T01G434_A1142MaqFCod ;
   private short[] T01G434_A3068PlaEtaOrd ;
   private byte[] T01G434_A3069PlaEtaOrdA ;
   private int[] T01G434_A129BarCod ;
   private boolean[] T01G434_n129BarCod ;
   private byte[] T01G434_A132BarCodReo ;
   private boolean[] T01G434_n132BarCodReo ;
   private String[] T01G434_A130BarCodPar ;
   private boolean[] T01G434_n130BarCodPar ;
   private String[] T01G435_A396EmprCod ;
   private boolean[] T01G435_n396EmprCod ;
   private int[] T01G435_A129BarCod ;
   private boolean[] T01G435_n129BarCod ;
   private byte[] T01G435_A132BarCodReo ;
   private boolean[] T01G435_n132BarCodReo ;
   private String[] T01G435_A130BarCodPar ;
   private boolean[] T01G435_n130BarCodPar ;
   private short[] T01G435_A4846BarAudLin ;
   private String[] T01G436_A396EmprCod ;
   private boolean[] T01G436_n396EmprCod ;
   private int[] T01G436_A129BarCod ;
   private boolean[] T01G436_n129BarCod ;
   private byte[] T01G436_A132BarCodReo ;
   private boolean[] T01G436_n132BarCodReo ;
   private String[] T01G436_A130BarCodPar ;
   private boolean[] T01G436_n130BarCodPar ;
   private short[] T01G436_A3940BarEnsLin ;
   private String[] T01G437_A396EmprCod ;
   private boolean[] T01G437_n396EmprCod ;
   private int[] T01G437_A129BarCod ;
   private boolean[] T01G437_n129BarCod ;
   private byte[] T01G437_A132BarCodReo ;
   private boolean[] T01G437_n132BarCodReo ;
   private String[] T01G437_A130BarCodPar ;
   private boolean[] T01G437_n130BarCodPar ;
   private int[] T01G437_A3384RefBarCod ;
   private byte[] T01G437_A3385RefBarReo ;
   private String[] T01G437_A3386RefBarPar ;
   private String[] T01G438_A396EmprCod ;
   private boolean[] T01G438_n396EmprCod ;
   private int[] T01G438_A10914SolSalCod ;
   private String[] T01G439_A396EmprCod ;
   private boolean[] T01G439_n396EmprCod ;
   private int[] T01G439_A10364Ph_numero ;
   private String[] T01G440_A396EmprCod ;
   private boolean[] T01G440_n396EmprCod ;
   private int[] T01G440_A129BarCod ;
   private boolean[] T01G440_n129BarCod ;
   private byte[] T01G440_A132BarCodReo ;
   private boolean[] T01G440_n132BarCodReo ;
   private String[] T01G440_A130BarCodPar ;
   private boolean[] T01G440_n130BarCodPar ;
   private String[] T01G440_A10197ProEspCod ;
   private String[] T01G441_A396EmprCod ;
   private boolean[] T01G441_n396EmprCod ;
   private int[] T01G441_A129BarCod ;
   private boolean[] T01G441_n129BarCod ;
   private byte[] T01G441_A132BarCodReo ;
   private boolean[] T01G441_n132BarCodReo ;
   private String[] T01G441_A130BarCodPar ;
   private boolean[] T01G441_n130BarCodPar ;
   private int[] T01G441_A5322Dp_Nrecep ;
   private String[] T01G442_A396EmprCod ;
   private boolean[] T01G442_n396EmprCod ;
   private int[] T01G442_A129BarCod ;
   private boolean[] T01G442_n129BarCod ;
   private byte[] T01G442_A132BarCodReo ;
   private boolean[] T01G442_n132BarCodReo ;
   private String[] T01G442_A130BarCodPar ;
   private boolean[] T01G442_n130BarCodPar ;
   private int[] T01G442_A8569EntSecLn ;
   private String[] T01G443_A396EmprCod ;
   private boolean[] T01G443_n396EmprCod ;
   private int[] T01G443_A7434PLLNro ;
   private short[] T01G443_A7443LPLNro ;
   private short[] T01G443_A7459CPLCom ;
   private int[] T01G443_A129BarCod ;
   private boolean[] T01G443_n129BarCod ;
   private byte[] T01G443_A132BarCodReo ;
   private boolean[] T01G443_n132BarCodReo ;
   private String[] T01G443_A130BarCodPar ;
   private boolean[] T01G443_n130BarCodPar ;
   private String[] T01G444_A396EmprCod ;
   private boolean[] T01G444_n396EmprCod ;
   private int[] T01G444_A7145OSSCod ;
   private String[] T01G445_A396EmprCod ;
   private boolean[] T01G445_n396EmprCod ;
   private int[] T01G445_A7049OGSCod ;
   private String[] T01G446_A396EmprCod ;
   private boolean[] T01G446_n396EmprCod ;
   private int[] T01G446_A129BarCod ;
   private boolean[] T01G446_n129BarCod ;
   private byte[] T01G446_A132BarCodReo ;
   private boolean[] T01G446_n132BarCodReo ;
   private String[] T01G446_A130BarCodPar ;
   private boolean[] T01G446_n130BarCodPar ;
   private int[] T01G446_A6031Ac_Barcod ;
   private byte[] T01G446_A6032Ac_BarReo ;
   private String[] T01G446_A6033Ac_BarPar ;
   private String[] T01G447_A396EmprCod ;
   private boolean[] T01G447_n396EmprCod ;
   private int[] T01G447_A129BarCod ;
   private boolean[] T01G447_n129BarCod ;
   private byte[] T01G447_A132BarCodReo ;
   private boolean[] T01G447_n132BarCodReo ;
   private String[] T01G447_A130BarCodPar ;
   private boolean[] T01G447_n130BarCodPar ;
   private int[] T01G447_A5908PartPal ;
   private String[] T01G448_A396EmprCod ;
   private boolean[] T01G448_n396EmprCod ;
   private int[] T01G448_A129BarCod ;
   private boolean[] T01G448_n129BarCod ;
   private byte[] T01G448_A132BarCodReo ;
   private boolean[] T01G448_n132BarCodReo ;
   private String[] T01G448_A130BarCodPar ;
   private boolean[] T01G448_n130BarCodPar ;
   private byte[] T01G448_A2524DisComLin ;
   private String[] T01G448_A1056DisComCod ;
   private String[] T01G448_A1032FonCod ;
   private String[] T01G449_A396EmprCod ;
   private boolean[] T01G449_n396EmprCod ;
   private long[] T01G449_A1736AlbExtCod ;
   private int[] T01G449_A129BarCod ;
   private boolean[] T01G449_n129BarCod ;
   private byte[] T01G449_A132BarCodReo ;
   private boolean[] T01G449_n132BarCodReo ;
   private String[] T01G449_A130BarCodPar ;
   private boolean[] T01G449_n130BarCodPar ;
   private String[] T01G450_A396EmprCod ;
   private boolean[] T01G450_n396EmprCod ;
   private int[] T01G450_A129BarCod ;
   private boolean[] T01G450_n129BarCod ;
   private byte[] T01G450_A132BarCodReo ;
   private boolean[] T01G450_n132BarCodReo ;
   private String[] T01G450_A130BarCodPar ;
   private boolean[] T01G450_n130BarCodPar ;
   private int[] T01G450_A3753BarFoaCod ;
   private byte[] T01G450_A3754BarFoaReo ;
   private String[] T01G450_A3755BarFoaPar ;
   private String[] T01G451_A396EmprCod ;
   private boolean[] T01G451_n396EmprCod ;
   private int[] T01G451_A129BarCod ;
   private boolean[] T01G451_n129BarCod ;
   private byte[] T01G451_A132BarCodReo ;
   private boolean[] T01G451_n132BarCodReo ;
   private String[] T01G451_A130BarCodPar ;
   private boolean[] T01G451_n130BarCodPar ;
   private int[] T01G451_A3747BarPegCod ;
   private byte[] T01G451_A3748BarPegReo ;
   private String[] T01G451_A3749BarPegPar ;
   private String[] T01G452_A396EmprCod ;
   private boolean[] T01G452_n396EmprCod ;
   private int[] T01G452_A3253SolTraCod ;
   private String[] T01G453_A396EmprCod ;
   private boolean[] T01G453_n396EmprCod ;
   private int[] T01G453_A3235SolSubCod ;
   private String[] T01G454_A396EmprCod ;
   private boolean[] T01G454_n396EmprCod ;
   private int[] T01G454_A3218SolLuzCod ;
   private String[] T01G455_A396EmprCod ;
   private boolean[] T01G455_n396EmprCod ;
   private int[] T01G455_A3196SolFriCod ;
   private String[] T01G456_A396EmprCod ;
   private boolean[] T01G456_n396EmprCod ;
   private int[] T01G456_A3165SolPilCod ;
   private String[] T01G457_A396EmprCod ;
   private boolean[] T01G457_n396EmprCod ;
   private int[] T01G457_A129BarCod ;
   private boolean[] T01G457_n129BarCod ;
   private byte[] T01G457_A132BarCodReo ;
   private boolean[] T01G457_n132BarCodReo ;
   private String[] T01G457_A130BarCodPar ;
   private boolean[] T01G457_n130BarCodPar ;
   private short[] T01G457_A2872HAnRLinMaq ;
   private byte[] T01G457_A2873HAnRLinPro ;
   private short[] T01G457_A2874HAnRLin ;
   private byte[] T01G457_A2875HAnNumAny ;
   private String[] T01G458_A396EmprCod ;
   private boolean[] T01G458_n396EmprCod ;
   private String[] T01G458_A2817PlaTer ;
   private short[] T01G458_A2818PlaOrd ;
   private String[] T01G459_A396EmprCod ;
   private boolean[] T01G459_n396EmprCod ;
   private String[] T01G459_A2809MetTerCod ;
   private int[] T01G459_A129BarCod ;
   private boolean[] T01G459_n129BarCod ;
   private byte[] T01G459_A132BarCodReo ;
   private boolean[] T01G459_n132BarCodReo ;
   private String[] T01G459_A130BarCodPar ;
   private boolean[] T01G459_n130BarCodPar ;
   private String[] T01G460_A396EmprCod ;
   private boolean[] T01G460_n396EmprCod ;
   private int[] T01G460_A129BarCod ;
   private boolean[] T01G460_n129BarCod ;
   private byte[] T01G460_A132BarCodReo ;
   private boolean[] T01G460_n132BarCodReo ;
   private String[] T01G460_A130BarCodPar ;
   private boolean[] T01G460_n130BarCodPar ;
   private short[] T01G460_A2808RecLinMAL ;
   private byte[] T01G460_A1377RecNumAny ;
   private String[] T01G460_A719PrdNum ;
   private String[] T01G461_A396EmprCod ;
   private boolean[] T01G461_n396EmprCod ;
   private int[] T01G461_A129BarCod ;
   private boolean[] T01G461_n129BarCod ;
   private byte[] T01G461_A132BarCodReo ;
   private boolean[] T01G461_n132BarCodReo ;
   private String[] T01G461_A130BarCodPar ;
   private boolean[] T01G461_n130BarCodPar ;
   private short[] T01G461_A2804RecLinMaq ;
   private String[] T01G462_A396EmprCod ;
   private boolean[] T01G462_n396EmprCod ;
   private String[] T01G462_A2792TermiCod ;
   private int[] T01G462_A129BarCod ;
   private boolean[] T01G462_n129BarCod ;
   private byte[] T01G462_A132BarCodReo ;
   private boolean[] T01G462_n132BarCodReo ;
   private String[] T01G462_A130BarCodPar ;
   private boolean[] T01G462_n130BarCodPar ;
   private String[] T01G463_A396EmprCod ;
   private boolean[] T01G463_n396EmprCod ;
   private short[] T01G463_A2248ManCod ;
   private java.util.Date[] T01G463_A2711RpExHdFe ;
   private short[] T01G463_A2713RpExHdLi ;
   private String[] T01G464_A396EmprCod ;
   private boolean[] T01G464_n396EmprCod ;
   private short[] T01G464_A2248ManCod ;
   private String[] T01G464_A2689ExHdrFas ;
   private int[] T01G464_A2692ExHdrLin ;
   private String[] T01G465_A396EmprCod ;
   private boolean[] T01G465_n396EmprCod ;
   private int[] T01G465_A129BarCod ;
   private boolean[] T01G465_n129BarCod ;
   private byte[] T01G465_A132BarCodReo ;
   private boolean[] T01G465_n132BarCodReo ;
   private String[] T01G465_A130BarCodPar ;
   private boolean[] T01G465_n130BarCodPar ;
   private String[] T01G465_A2494BarDosPro ;
   private String[] T01G465_A719PrdNum ;
   private String[] T01G466_A396EmprCod ;
   private boolean[] T01G466_n396EmprCod ;
   private String[] T01G466_A602MaqCod ;
   private java.util.Date[] T01G466_A2461PlaFecTin ;
   private int[] T01G466_A129BarCod ;
   private boolean[] T01G466_n129BarCod ;
   private byte[] T01G466_A132BarCodReo ;
   private boolean[] T01G466_n132BarCodReo ;
   private String[] T01G466_A130BarCodPar ;
   private boolean[] T01G466_n130BarCodPar ;
   private String[] T01G467_A396EmprCod ;
   private boolean[] T01G467_n396EmprCod ;
   private int[] T01G467_A129BarCod ;
   private boolean[] T01G467_n129BarCod ;
   private byte[] T01G467_A132BarCodReo ;
   private boolean[] T01G467_n132BarCodReo ;
   private String[] T01G467_A130BarCodPar ;
   private boolean[] T01G467_n130BarCodPar ;
   private short[] T01G467_A2457BarObLin ;
   private String[] T01G468_A396EmprCod ;
   private boolean[] T01G468_n396EmprCod ;
   private int[] T01G468_A129BarCod ;
   private boolean[] T01G468_n129BarCod ;
   private byte[] T01G468_A132BarCodReo ;
   private boolean[] T01G468_n132BarCodReo ;
   private String[] T01G468_A130BarCodPar ;
   private boolean[] T01G468_n130BarCodPar ;
   private short[] T01G468_A2444BarEnLin ;
   private String[] T01G469_A396EmprCod ;
   private boolean[] T01G469_n396EmprCod ;
   private int[] T01G469_A2406ExhAlbCod ;
   private int[] T01G469_A129BarCod ;
   private boolean[] T01G469_n129BarCod ;
   private byte[] T01G469_A132BarCodReo ;
   private boolean[] T01G469_n132BarCodReo ;
   private String[] T01G469_A130BarCodPar ;
   private boolean[] T01G469_n130BarCodPar ;
   private String[] T01G470_A396EmprCod ;
   private boolean[] T01G470_n396EmprCod ;
   private int[] T01G470_A2253SalExtAlb ;
   private int[] T01G470_A129BarCod ;
   private boolean[] T01G470_n129BarCod ;
   private byte[] T01G470_A132BarCodReo ;
   private boolean[] T01G470_n132BarCodReo ;
   private String[] T01G470_A130BarCodPar ;
   private boolean[] T01G470_n130BarCodPar ;
   private String[] T01G471_A396EmprCod ;
   private boolean[] T01G471_n396EmprCod ;
   private long[] T01G471_A30AlbProCod ;
   private int[] T01G471_A129BarCod ;
   private boolean[] T01G471_n129BarCod ;
   private byte[] T01G471_A132BarCodReo ;
   private boolean[] T01G471_n132BarCodReo ;
   private String[] T01G471_A130BarCodPar ;
   private boolean[] T01G471_n130BarCodPar ;
   private String[] T01G472_A396EmprCod ;
   private boolean[] T01G472_n396EmprCod ;
   private int[] T01G472_A1348SolColCod ;
   private String[] T01G473_A396EmprCod ;
   private boolean[] T01G473_n396EmprCod ;
   private int[] T01G473_A1333EstDimCod ;
   private String[] T01G474_A396EmprCod ;
   private boolean[] T01G474_n396EmprCod ;
   private int[] T01G474_A1314EnsLabCod ;
   private String[] T01G475_A396EmprCod ;
   private boolean[] T01G475_n396EmprCod ;
   private int[] T01G475_A129BarCod ;
   private boolean[] T01G475_n129BarCod ;
   private byte[] T01G475_A132BarCodReo ;
   private boolean[] T01G475_n132BarCodReo ;
   private String[] T01G475_A130BarCodPar ;
   private boolean[] T01G475_n130BarCodPar ;
   private byte[] T01G475_A906ObsReoLin ;
   private String[] T01G476_A396EmprCod ;
   private boolean[] T01G476_n396EmprCod ;
   private int[] T01G476_A859CumCodCont ;
   private String[] T01G477_A396EmprCod ;
   private boolean[] T01G477_n396EmprCod ;
   private String[] T01G477_A602MaqCod ;
   private java.util.Date[] T01G477_A558HisProFec ;
   private int[] T01G477_A561HisProLin ;
   private String[] T01G478_A396EmprCod ;
   private boolean[] T01G478_n396EmprCod ;
   private int[] T01G478_A252CliCod ;
   private boolean[] T01G478_n252CliCod ;
   private String[] T01G478_A494ForSer ;
   private String[] T01G478_A482ForColNom ;
   private int[] T01G478_A483ForColNum ;
   private byte[] T01G478_A831TipColCod ;
   private String[] T01G479_A396EmprCod ;
   private boolean[] T01G479_n396EmprCod ;
   private int[] T01G479_A129BarCod ;
   private boolean[] T01G479_n129BarCod ;
   private byte[] T01G479_A132BarCodReo ;
   private boolean[] T01G479_n132BarCodReo ;
   private String[] T01G479_A130BarCodPar ;
   private boolean[] T01G479_n130BarCodPar ;
   private String[] T01G479_A200BarPieCod ;
   private String[] T01G480_A396EmprCod ;
   private boolean[] T01G480_n396EmprCod ;
   private int[] T01G480_A129BarCod ;
   private boolean[] T01G480_n129BarCod ;
   private byte[] T01G480_A132BarCodReo ;
   private boolean[] T01G480_n132BarCodReo ;
   private String[] T01G480_A130BarCodPar ;
   private boolean[] T01G480_n130BarCodPar ;
   private byte[] T01G480_A188BarNotLin ;
   private String[] T01G481_A396EmprCod ;
   private boolean[] T01G481_n396EmprCod ;
   private int[] T01G481_A129BarCod ;
   private boolean[] T01G481_n129BarCod ;
   private byte[] T01G481_A132BarCodReo ;
   private boolean[] T01G481_n132BarCodReo ;
   private String[] T01G481_A130BarCodPar ;
   private boolean[] T01G481_n130BarCodPar ;
   private String[] T01G481_A758ProCod ;
   private String[] T01G482_A396EmprCod ;
   private boolean[] T01G482_n396EmprCod ;
   private int[] T01G482_A129BarCod ;
   private boolean[] T01G482_n129BarCod ;
   private byte[] T01G482_A132BarCodReo ;
   private boolean[] T01G482_n132BarCodReo ;
   private String[] T01G482_A130BarCodPar ;
   private boolean[] T01G482_n130BarCodPar ;
   private int[] T01G482_A119BarAgrCod ;
   private byte[] T01G482_A124BarAgrReo ;
   private String[] T01G482_A122BarAgrPar ;
   private String[] T01G484_A396EmprCod ;
   private boolean[] T01G484_n396EmprCod ;
   private int[] T01G484_A129BarCod ;
   private boolean[] T01G484_n129BarCod ;
   private byte[] T01G484_A132BarCodReo ;
   private boolean[] T01G484_n132BarCodReo ;
   private String[] T01G484_A130BarCodPar ;
   private boolean[] T01G484_n130BarCodPar ;
   private int[] T01G485_A129BarCod ;
   private boolean[] T01G485_n129BarCod ;
   private byte[] T01G485_A132BarCodReo ;
   private boolean[] T01G485_n132BarCodReo ;
   private String[] T01G485_A130BarCodPar ;
   private boolean[] T01G485_n130BarCodPar ;
   private int[] T01G485_A4118tinagrcod ;
   private byte[] T01G485_A4119tinagrreo ;
   private String[] T01G485_A4120tinagrpar ;
   private String[] T01G485_A396EmprCod ;
   private boolean[] T01G485_n396EmprCod ;
   private String[] T01G486_A396EmprCod ;
   private boolean[] T01G486_n396EmprCod ;
   private int[] T01G486_A129BarCod ;
   private boolean[] T01G486_n129BarCod ;
   private byte[] T01G486_A132BarCodReo ;
   private boolean[] T01G486_n132BarCodReo ;
   private String[] T01G486_A130BarCodPar ;
   private boolean[] T01G486_n130BarCodPar ;
   private int[] T01G486_A4118tinagrcod ;
   private byte[] T01G486_A4119tinagrreo ;
   private String[] T01G486_A4120tinagrpar ;
   private int[] T01G43_A129BarCod ;
   private boolean[] T01G43_n129BarCod ;
   private byte[] T01G43_A132BarCodReo ;
   private boolean[] T01G43_n132BarCodReo ;
   private String[] T01G43_A130BarCodPar ;
   private boolean[] T01G43_n130BarCodPar ;
   private int[] T01G43_A4118tinagrcod ;
   private byte[] T01G43_A4119tinagrreo ;
   private String[] T01G43_A4120tinagrpar ;
   private String[] T01G43_A396EmprCod ;
   private boolean[] T01G43_n396EmprCod ;
   private int[] T01G42_A129BarCod ;
   private boolean[] T01G42_n129BarCod ;
   private byte[] T01G42_A132BarCodReo ;
   private boolean[] T01G42_n132BarCodReo ;
   private String[] T01G42_A130BarCodPar ;
   private boolean[] T01G42_n130BarCodPar ;
   private int[] T01G42_A4118tinagrcod ;
   private byte[] T01G42_A4119tinagrreo ;
   private String[] T01G42_A4120tinagrpar ;
   private String[] T01G42_A396EmprCod ;
   private boolean[] T01G42_n396EmprCod ;
   private String[] T01G489_A396EmprCod ;
   private boolean[] T01G489_n396EmprCod ;
   private int[] T01G489_A129BarCod ;
   private boolean[] T01G489_n129BarCod ;
   private byte[] T01G489_A132BarCodReo ;
   private boolean[] T01G489_n132BarCodReo ;
   private String[] T01G489_A130BarCodPar ;
   private boolean[] T01G489_n130BarCodPar ;
   private int[] T01G489_A4118tinagrcod ;
   private byte[] T01G489_A4119tinagrreo ;
   private String[] T01G489_A4120tinagrpar ;
   private String[] T01G490_A407EmprNom ;
   private boolean[] T01G490_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttinagr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttinagr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttinagr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttinagr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttinagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G42", "SELECT BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar, EmprCod FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND tinagrcod = ? AND tinagrreo = ? AND tinagrpar = ?  FOR UPDATE OF BarCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G43", "SELECT BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar, EmprCod FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND tinagrcod = ? AND tinagrreo = ? AND tinagrpar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G44", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarVolMaq, BarAgrEst, BarMaqCod, BarSit, BarTipDis, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarVolMaq, BarAgrEst, BarMaqCod, BarSit, BarTipDis, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G45", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarVolMaq, BarAgrEst, BarMaqCod, BarSit, BarTipDis, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G47", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G49", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G410", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarVolMaq, T2.EmprNom, TM1.BarAgrEst, TM1.BarMaqCod, TM1.BarSit, TM1.BarTipDis, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G412", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G413", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G414", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G415", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G416", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarVolMaq, BarAgrEst, BarMaqCod, BarSit, BarTipDis, EmprCod, CliCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01G417", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarVolMaq=?, BarAgrEst=?, BarMaqCod=?, BarSit=?, BarTipDis=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01G418", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01G420", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G421", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G422", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G423", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G424", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G425", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G426", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G427", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G428", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G429", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G430", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G431", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G432", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G433", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G434", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G435", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G436", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G437", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G438", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G439", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G440", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G441", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G442", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G443", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G444", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G445", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G446", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G447", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G448", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G449", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G450", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G451", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G452", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G453", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G454", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G455", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G456", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G457", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G458", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G459", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G460", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G461", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G462", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G463", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G464", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G465", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G466", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G467", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G468", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G469", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G470", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G471", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G472", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G473", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G474", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G475", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G476", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G477", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G478", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G479", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G480", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G481", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G482", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G483", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01G484", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G485", "SELECT BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar, EmprCod FROM TXPtinagr WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and tinagrcod = ? and tinagrreo = ? and tinagrpar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G486", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND tinagrcod = ? AND tinagrreo = ? AND tinagrpar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01G487", "INSERT INTO TXPtinagr(BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPtinagr")
         ,new UpdateCursor("T01G488", "DELETE FROM TXPtinagr  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND tinagrcod = ? AND tinagrreo = ? AND tinagrpar = ?", GX_NOMASK, "TXPtinagr")
         ,new ForEachCursor("T01G489", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G490", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 20 :
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
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 80 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 85 :
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
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
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
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 6);
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
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
            case 10 :
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
               }
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 6);
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               stmt.setString(11, (String)parms[13], 1);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[17]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 1);
               }
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
            case 15 :
               stmt.setString(1, (String)parms[0], 6);
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
            case 18 :
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
            case 25 :
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
            case 26 :
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
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
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
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 82 :
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
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 1);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 3);
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
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
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
               return;
      }
   }

}

