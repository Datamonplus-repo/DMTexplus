package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrbarfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "BARFAS", ""), (short)(0)) ;
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

   public ttrbarfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrbarfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrbarfas_impl.class ));
   }

   public ttrbarfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrBARFAS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "BarFasPri", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasPri_Internalname, GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasPri_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasPri_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fase No Planning", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasNPl_Internalname, GXutil.ltrim( localUtil.ntoc( A6555BarFasNPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasNPl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6555BarFasNPl), "9") : localUtil.format( DecimalUtil.doubleToDec(A6555BarFasNPl), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasNPl_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasNPl_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Duración elaboración fase", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTieAut_Internalname, GXutil.ltrim( localUtil.ntoc( A6430BarTieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTieAut_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6430BarTieAut), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6430BarTieAut), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTieAut_Jsonclick, 0, "", "", "", "", "", 1, edtBarTieAut_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Coste Retroalimentado", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCR_Internalname, GXutil.ltrim( localUtil.ntoc( A5999BarFasCR, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasCR_Enabled!=0) ? localUtil.format( A5999BarFasCR, "ZZZZ9.99999") : localUtil.format( A5999BarFasCR, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCR_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCR_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fase de Acabado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasAcab_Internalname, GXutil.rtrim( A4905BarFasAcab), GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasAcab_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasAcab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fase Manual?", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCara_Internalname, GXutil.rtrim( A4637BarFasCara), GXutil.rtrim( localUtil.format( A4637BarFasCara, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCara_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCara_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Control Planning", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCoP_Internalname, GXutil.rtrim( A4301BarFasCoP), GXutil.rtrim( localUtil.format( A4301BarFasCoP, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCoP_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCoP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Prendas", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4288BarNPzas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4288BarNPzas), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4288BarNPzas), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNPzas_Jsonclick, 0, "", "", "", "", "", 1, edtBarNPzas_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Formula Productos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasFor_Internalname, GXutil.rtrim( A4287BarFasFor), GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasFor_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasFor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Numero de Bota", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumBot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumBot_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumBot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Embotada ?", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasBot_Internalname, GXutil.rtrim( A4021BarFasBot), GXutil.rtrim( localUtil.format( A4021BarFasBot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasBot_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasBot_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecRIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecRIni_Internalname, localUtil.format(A3298BarFecRIni, "99/99/99"), localUtil.format( A3298BarFecRIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecRIni_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecRIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecRIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecRIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tiempo Real", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTieRea_Enabled!=0) ? localUtil.format( A215BarTieRea, "Z9.99") : localUtil.format( A215BarTieRea, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTieRea_Jsonclick, 0, "", "", "", "", "", 1, edtBarTieRea_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Hora Fin", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarHorFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHorFin_Jsonclick, 0, "", "", "", "", "", 1, edtBarHorFin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Hora Inicio", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarHorIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHorIni_Jsonclick, 0, "", "", "", "", "", 1, edtBarHorIni_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc), GXutil.rtrim( localUtil.format( A179BarLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarLoc_Jsonclick, 0, "", "", "", "", "", 1, edtBarLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUni_Enabled!=0) ? localUtil.format( A227BarUni, "ZZZZZ9.99") : localUtil.format( A227BarUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUni_Jsonclick, 0, "", "", "", "", "", 1, edtBarUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Tiempo Teorico", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTieTeo_Enabled!=0) ? localUtil.format( A216BarTieTeo, "Z9.99") : localUtil.format( A216BarTieTeo, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTieTeo_Jsonclick, 0, "", "", "", "", "", 1, edtBarTieTeo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Fecha Real Cumplimentacion", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecRea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99"), localUtil.format( A160BarFecRea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecRea_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecRea_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecRea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecRea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Fecha Teorica", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecTeo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99"), localUtil.format( A162BarFecTeo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecTeo_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecTeo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecTeo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecTeo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "BarFacTin", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin), GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFacTin_Jsonclick, 0, "", "", "", "", "", 1, edtBarFacTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Estado Barcada", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Control (S/N)", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon), GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCon_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasSer_Internalname, GXutil.rtrim( A2327BarFasSer), GXutil.rtrim( localUtil.format( A2327BarFasSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Fecha Hora Final", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFasDTF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasDTF_Internalname, localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasDTF_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasDTF_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFasDTF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFasDTF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Fecha Hora Inicio", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFasDTI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasDTI_Internalname, localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasDTI_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasDTI_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFasDTI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFasDTI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrBARFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrBARFAS.htm");
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
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3836BarFasPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6555BarFasNPl = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6555BarFasNPl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6430BarTieAut = (short)(localUtil.ctol( httpContext.cgiGet( "Z6430BarTieAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5999BarFasCR = localUtil.ctond( httpContext.cgiGet( "Z5999BarFasCR")) ;
         Z4905BarFasAcab = httpContext.cgiGet( "Z4905BarFasAcab") ;
         Z4637BarFasCara = httpContext.cgiGet( "Z4637BarFasCara") ;
         Z4301BarFasCoP = httpContext.cgiGet( "Z4301BarFasCoP") ;
         Z4288BarNPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4288BarNPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4287BarFasFor = httpContext.cgiGet( "Z4287BarFasFor") ;
         Z4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4022BarNumBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4021BarFasBot = httpContext.cgiGet( "Z4021BarFasBot") ;
         Z3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( "Z3298BarFecRIni"), 0) ;
         Z215BarTieRea = localUtil.ctond( httpContext.cgiGet( "Z215BarTieRea")) ;
         Z164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "Z164BarHorFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "Z165BarHorIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z179BarLoc = httpContext.cgiGet( "Z179BarLoc") ;
         Z227BarUni = localUtil.ctond( httpContext.cgiGet( "Z227BarUni")) ;
         Z216BarTieTeo = localUtil.ctond( httpContext.cgiGet( "Z216BarTieTeo")) ;
         Z160BarFecRea = localUtil.ctod( httpContext.cgiGet( "Z160BarFecRea"), 0) ;
         Z162BarFecTeo = localUtil.ctod( httpContext.cgiGet( "Z162BarFecTeo"), 0) ;
         Z150BarFacTin = httpContext.cgiGet( "Z150BarFacTin") ;
         Z153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z153BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z152BarFasCon = httpContext.cgiGet( "Z152BarFasCon") ;
         Z2327BarFasSer = httpContext.cgiGet( "Z2327BarFasSer") ;
         Z4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( "Z4443BarFasDTF"), 0) ;
         Z4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( "Z4442BarFasDTI"), 0) ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
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
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A194BarOrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         }
         else
         {
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasPri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3836BarFasPri = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
         }
         else
         {
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASNPL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasNPl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6555BarFasNPl = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
         }
         else
         {
            A6555BarFasNPl = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasNPl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIEAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTieAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6430BarTieAut = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
         }
         else
         {
            A6430BarTieAut = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasCR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasCR_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasCR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5999BarFasCR = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
         }
         else
         {
            A5999BarFasCR = localUtil.ctond( httpContext.cgiGet( edtBarFasCR_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
         }
         A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
         A4637BarFasCara = httpContext.cgiGet( edtBarFasCara_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
         A4301BarFasCoP = GXutil.upper( httpContext.cgiGet( edtBarFasCoP_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNPZAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNPzas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4288BarNPzas = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
         }
         else
         {
            A4288BarNPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
         }
         A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMBOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumBot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4022BarNumBot = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         }
         else
         {
            A4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         }
         A4021BarFasBot = httpContext.cgiGet( edtBarFasBot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECRINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecRIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3298BarFecRIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         }
         else
         {
            A3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( edtBarFecRIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIEREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTieRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A215BarTieRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         }
         else
         {
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARHORFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarHorFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A164BarHorFin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         }
         else
         {
            A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARHORINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarHorIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A165BarHorIni = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         }
         else
         {
            A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         }
         A179BarLoc = httpContext.cgiGet( edtBarLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A227BarUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         }
         else
         {
            A227BarUni = localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIETEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTieTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A216BarTieTeo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         }
         else
         {
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A160BarFecRea = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         }
         else
         {
            A160BarFecRea = localUtil.ctod( httpContext.cgiGet( edtBarFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecTeo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECTEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A162BarFecTeo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         }
         else
         {
            A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( edtBarFecTeo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         }
         A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A153BarFasEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         }
         else
         {
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         }
         A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A2327BarFasSer = httpContext.cgiGet( edtBarFasSer_Internalname) ;
         n2327BarFasSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2327BarFasSer", A2327BarFasSer);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFasDTF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BARFASDTF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasDTF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname)) ;
            n4443BarFasDTF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFasDTI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BARFASDTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFasDTI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname)) ;
            n4442BarFasDTI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
            initAll1HS15( ) ;
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
      disableAttributes1HS15( ) ;
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

   public void confirm_1HS0( )
   {
      beforeValidate1HS15( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HS15( ) ;
         }
         else
         {
            checkExtendedTable1HS15( ) ;
            if ( AnyError == 0 )
            {
               zm1HS15( 8) ;
               zm1HS15( 9) ;
            }
            closeExtendedTableCursors1HS15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HS0( ) ;
      }
   }

   public void resetCaption1HS0( )
   {
   }

   public void zm1HS15( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3836BarFasPri = T01HS3_A3836BarFasPri[0] ;
            Z6555BarFasNPl = T01HS3_A6555BarFasNPl[0] ;
            Z6430BarTieAut = T01HS3_A6430BarTieAut[0] ;
            Z5999BarFasCR = T01HS3_A5999BarFasCR[0] ;
            Z4905BarFasAcab = T01HS3_A4905BarFasAcab[0] ;
            Z4637BarFasCara = T01HS3_A4637BarFasCara[0] ;
            Z4301BarFasCoP = T01HS3_A4301BarFasCoP[0] ;
            Z4288BarNPzas = T01HS3_A4288BarNPzas[0] ;
            Z4287BarFasFor = T01HS3_A4287BarFasFor[0] ;
            Z4022BarNumBot = T01HS3_A4022BarNumBot[0] ;
            Z4021BarFasBot = T01HS3_A4021BarFasBot[0] ;
            Z3298BarFecRIni = T01HS3_A3298BarFecRIni[0] ;
            Z215BarTieRea = T01HS3_A215BarTieRea[0] ;
            Z164BarHorFin = T01HS3_A164BarHorFin[0] ;
            Z165BarHorIni = T01HS3_A165BarHorIni[0] ;
            Z179BarLoc = T01HS3_A179BarLoc[0] ;
            Z227BarUni = T01HS3_A227BarUni[0] ;
            Z216BarTieTeo = T01HS3_A216BarTieTeo[0] ;
            Z160BarFecRea = T01HS3_A160BarFecRea[0] ;
            Z162BarFecTeo = T01HS3_A162BarFecTeo[0] ;
            Z150BarFacTin = T01HS3_A150BarFacTin[0] ;
            Z153BarFasEst = T01HS3_A153BarFasEst[0] ;
            Z152BarFasCon = T01HS3_A152BarFasCon[0] ;
            Z2327BarFasSer = T01HS3_A2327BarFasSer[0] ;
            Z4443BarFasDTF = T01HS3_A4443BarFasDTF[0] ;
            Z4442BarFasDTI = T01HS3_A4442BarFasDTI[0] ;
            Z457FasCod = T01HS3_A457FasCod[0] ;
         }
         else
         {
            Z3836BarFasPri = A3836BarFasPri ;
            Z6555BarFasNPl = A6555BarFasNPl ;
            Z6430BarTieAut = A6430BarTieAut ;
            Z5999BarFasCR = A5999BarFasCR ;
            Z4905BarFasAcab = A4905BarFasAcab ;
            Z4637BarFasCara = A4637BarFasCara ;
            Z4301BarFasCoP = A4301BarFasCoP ;
            Z4288BarNPzas = A4288BarNPzas ;
            Z4287BarFasFor = A4287BarFasFor ;
            Z4022BarNumBot = A4022BarNumBot ;
            Z4021BarFasBot = A4021BarFasBot ;
            Z3298BarFecRIni = A3298BarFecRIni ;
            Z215BarTieRea = A215BarTieRea ;
            Z164BarHorFin = A164BarHorFin ;
            Z165BarHorIni = A165BarHorIni ;
            Z179BarLoc = A179BarLoc ;
            Z227BarUni = A227BarUni ;
            Z216BarTieTeo = A216BarTieTeo ;
            Z160BarFecRea = A160BarFecRea ;
            Z162BarFecTeo = A162BarFecTeo ;
            Z150BarFacTin = A150BarFacTin ;
            Z153BarFasEst = A153BarFasEst ;
            Z152BarFasCon = A152BarFasCon ;
            Z2327BarFasSer = A2327BarFasSer ;
            Z4443BarFasDTF = A4443BarFasDTF ;
            Z4442BarFasDTI = A4442BarFasDTI ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z3836BarFasPri = A3836BarFasPri ;
         Z6555BarFasNPl = A6555BarFasNPl ;
         Z6430BarTieAut = A6430BarTieAut ;
         Z5999BarFasCR = A5999BarFasCR ;
         Z4905BarFasAcab = A4905BarFasAcab ;
         Z4637BarFasCara = A4637BarFasCara ;
         Z4301BarFasCoP = A4301BarFasCoP ;
         Z4288BarNPzas = A4288BarNPzas ;
         Z4287BarFasFor = A4287BarFasFor ;
         Z4022BarNumBot = A4022BarNumBot ;
         Z4021BarFasBot = A4021BarFasBot ;
         Z3298BarFecRIni = A3298BarFecRIni ;
         Z215BarTieRea = A215BarTieRea ;
         Z164BarHorFin = A164BarHorFin ;
         Z165BarHorIni = A165BarHorIni ;
         Z179BarLoc = A179BarLoc ;
         Z227BarUni = A227BarUni ;
         Z216BarTieTeo = A216BarTieTeo ;
         Z160BarFecRea = A160BarFecRea ;
         Z162BarFecTeo = A162BarFecTeo ;
         Z150BarFacTin = A150BarFacTin ;
         Z153BarFasEst = A153BarFasEst ;
         Z152BarFasCon = A152BarFasCon ;
         Z2327BarFasSer = A2327BarFasSer ;
         Z4443BarFasDTF = A4443BarFasDTF ;
         Z4442BarFasDTI = A4442BarFasDTI ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
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

   public void load1HS15( )
   {
      /* Using cursor T01HS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A3836BarFasPri = T01HS6_A3836BarFasPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
         A6555BarFasNPl = T01HS6_A6555BarFasNPl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
         A6430BarTieAut = T01HS6_A6430BarTieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
         A5999BarFasCR = T01HS6_A5999BarFasCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
         A4905BarFasAcab = T01HS6_A4905BarFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
         A4637BarFasCara = T01HS6_A4637BarFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
         A4301BarFasCoP = T01HS6_A4301BarFasCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
         A4288BarNPzas = T01HS6_A4288BarNPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
         A4287BarFasFor = T01HS6_A4287BarFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
         A4022BarNumBot = T01HS6_A4022BarNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         A4021BarFasBot = T01HS6_A4021BarFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
         A3298BarFecRIni = T01HS6_A3298BarFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         A215BarTieRea = T01HS6_A215BarTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         A164BarHorFin = T01HS6_A164BarHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         A165BarHorIni = T01HS6_A165BarHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         A179BarLoc = T01HS6_A179BarLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
         A227BarUni = T01HS6_A227BarUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         A216BarTieTeo = T01HS6_A216BarTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         A160BarFecRea = T01HS6_A160BarFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         A162BarFecTeo = T01HS6_A162BarFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         A150BarFacTin = T01HS6_A150BarFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
         A153BarFasEst = T01HS6_A153BarFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         A152BarFasCon = T01HS6_A152BarFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
         A2327BarFasSer = T01HS6_A2327BarFasSer[0] ;
         n2327BarFasSer = T01HS6_n2327BarFasSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2327BarFasSer", A2327BarFasSer);
         A4443BarFasDTF = T01HS6_A4443BarFasDTF[0] ;
         n4443BarFasDTF = T01HS6_n4443BarFasDTF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4442BarFasDTI = T01HS6_A4442BarFasDTI[0] ;
         n4442BarFasDTI = T01HS6_n4442BarFasDTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A457FasCod = T01HS6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         zm1HS15( -7) ;
      }
      pr_default.close(4);
      onLoadActions1HS15( ) ;
   }

   public void onLoadActions1HS15( )
   {
   }

   public void checkExtendedTable1HS15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01HS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A4905BarFasAcab, "S") == 0 ) || ( GXutil.strcmp(A4905BarFasAcab, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Fase de Acabado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasAcab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4301BarFasCoP, "S") == 0 ) || ( GXutil.strcmp(A4301BarFasCoP, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control Planning", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASCOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasCoP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4287BarFasFor, "S") == 0 ) || ( GXutil.strcmp(A4287BarFasFor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Formula Productos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASFOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasFor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A150BarFacTin, "S") == 0 ) || ( GXutil.strcmp(A150BarFacTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "BarFacTin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFACTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFacTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A152BarFasCon, "S") == 0 ) || ( GXutil.strcmp(A152BarFasCon, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1HS15( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01HS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_8( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A758ProCod )
   {
      /* Using cursor T01HS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1HS15( )
   {
      /* Using cursor T01HS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HS15( 7) ;
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T01HS3_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A3836BarFasPri = T01HS3_A3836BarFasPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
         A6555BarFasNPl = T01HS3_A6555BarFasNPl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
         A6430BarTieAut = T01HS3_A6430BarTieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
         A5999BarFasCR = T01HS3_A5999BarFasCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
         A4905BarFasAcab = T01HS3_A4905BarFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
         A4637BarFasCara = T01HS3_A4637BarFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
         A4301BarFasCoP = T01HS3_A4301BarFasCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
         A4288BarNPzas = T01HS3_A4288BarNPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
         A4287BarFasFor = T01HS3_A4287BarFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
         A4022BarNumBot = T01HS3_A4022BarNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         A4021BarFasBot = T01HS3_A4021BarFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
         A3298BarFecRIni = T01HS3_A3298BarFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         A215BarTieRea = T01HS3_A215BarTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         A164BarHorFin = T01HS3_A164BarHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         A165BarHorIni = T01HS3_A165BarHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         A179BarLoc = T01HS3_A179BarLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
         A227BarUni = T01HS3_A227BarUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         A216BarTieTeo = T01HS3_A216BarTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         A160BarFecRea = T01HS3_A160BarFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         A162BarFecTeo = T01HS3_A162BarFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         A150BarFacTin = T01HS3_A150BarFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
         A153BarFasEst = T01HS3_A153BarFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         A152BarFasCon = T01HS3_A152BarFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
         A2327BarFasSer = T01HS3_A2327BarFasSer[0] ;
         n2327BarFasSer = T01HS3_n2327BarFasSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2327BarFasSer", A2327BarFasSer);
         A4443BarFasDTF = T01HS3_A4443BarFasDTF[0] ;
         n4443BarFasDTF = T01HS3_n4443BarFasDTF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4442BarFasDTI = T01HS3_A4442BarFasDTI[0] ;
         n4442BarFasDTI = T01HS3_n4442BarFasDTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A396EmprCod = T01HS3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01HS3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HS3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HS3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01HS3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01HS3_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HS15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey1HS15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey1HS15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HS15( ) ;
      if ( RcdFound15 == 0 )
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
      RcdFound15 = (short)(0) ;
      /* Using cursor T01HS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A129BarCod[0] < A129BarCod ) || ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A132BarCodReo[0] < A132BarCodReo ) || ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS10_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01HS10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A129BarCod[0] > A129BarCod ) || ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A132BarCodReo[0] > A132BarCodReo ) || ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS10_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01HS10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01HS10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS10_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            A396EmprCod = T01HS10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01HS10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01HS10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01HS10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01HS10_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01HS10_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T01HS11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A129BarCod[0] > A129BarCod ) || ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A132BarCodReo[0] > A132BarCodReo ) || ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS11_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01HS11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A129BarCod[0] < A129BarCod ) || ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A132BarCodReo[0] < A132BarCodReo ) || ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HS11_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01HS11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01HS11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HS11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HS11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HS11_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            A396EmprCod = T01HS11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01HS11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01HS11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01HS11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01HS11_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01HS11_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HS15( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HS15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
               update1HS15( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HS15( ) ;
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
                  insert1HS15( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
      getKey1HS15( ) ;
      if ( RcdFound15 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = Z194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrbarfas");
      GX_FocusControl = edtBarFasPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HS0( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarFasPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HS15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HS15( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasPri_Internalname ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasPri_Internalname ;
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
      scanStart1HS15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNext1HS15( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HS15( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HS15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z3836BarFasPri != T01HS2_A3836BarFasPri[0] ) || ( Z6555BarFasNPl != T01HS2_A6555BarFasNPl[0] ) || ( Z6430BarTieAut != T01HS2_A6430BarTieAut[0] ) || ( DecimalUtil.compareTo(Z5999BarFasCR, T01HS2_A5999BarFasCR[0]) != 0 ) || ( GXutil.strcmp(Z4905BarFasAcab, T01HS2_A4905BarFasAcab[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4637BarFasCara, T01HS2_A4637BarFasCara[0]) != 0 ) || ( GXutil.strcmp(Z4301BarFasCoP, T01HS2_A4301BarFasCoP[0]) != 0 ) || ( Z4288BarNPzas != T01HS2_A4288BarNPzas[0] ) || ( GXutil.strcmp(Z4287BarFasFor, T01HS2_A4287BarFasFor[0]) != 0 ) || ( Z4022BarNumBot != T01HS2_A4022BarNumBot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4021BarFasBot, T01HS2_A4021BarFasBot[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T01HS2_A3298BarFecRIni[0])) ) || ( DecimalUtil.compareTo(Z215BarTieRea, T01HS2_A215BarTieRea[0]) != 0 ) || ( Z164BarHorFin != T01HS2_A164BarHorFin[0] ) || ( Z165BarHorIni != T01HS2_A165BarHorIni[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z179BarLoc, T01HS2_A179BarLoc[0]) != 0 ) || ( DecimalUtil.compareTo(Z227BarUni, T01HS2_A227BarUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z216BarTieTeo, T01HS2_A216BarTieTeo[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T01HS2_A160BarFecRea[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T01HS2_A162BarFecTeo[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z150BarFacTin, T01HS2_A150BarFacTin[0]) != 0 ) || ( Z153BarFasEst != T01HS2_A153BarFasEst[0] ) || ( GXutil.strcmp(Z152BarFasCon, T01HS2_A152BarFasCon[0]) != 0 ) || ( GXutil.strcmp(Z2327BarFasSer, T01HS2_A2327BarFasSer[0]) != 0 ) || !( GXutil.dateCompare(Z4443BarFasDTF, T01HS2_A4443BarFasDTF[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4442BarFasDTI, T01HS2_A4442BarFasDTI[0]) ) || ( GXutil.strcmp(Z457FasCod, T01HS2_A457FasCod[0]) != 0 ) )
         {
            if ( Z3836BarFasPri != T01HS2_A3836BarFasPri[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasPri");
               GXutil.writeLogRaw("Old: ",Z3836BarFasPri);
               GXutil.writeLogRaw("Current: ",T01HS2_A3836BarFasPri[0]);
            }
            if ( Z6555BarFasNPl != T01HS2_A6555BarFasNPl[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasNPl");
               GXutil.writeLogRaw("Old: ",Z6555BarFasNPl);
               GXutil.writeLogRaw("Current: ",T01HS2_A6555BarFasNPl[0]);
            }
            if ( Z6430BarTieAut != T01HS2_A6430BarTieAut[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarTieAut");
               GXutil.writeLogRaw("Old: ",Z6430BarTieAut);
               GXutil.writeLogRaw("Current: ",T01HS2_A6430BarTieAut[0]);
            }
            if ( DecimalUtil.compareTo(Z5999BarFasCR, T01HS2_A5999BarFasCR[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasCR");
               GXutil.writeLogRaw("Old: ",Z5999BarFasCR);
               GXutil.writeLogRaw("Current: ",T01HS2_A5999BarFasCR[0]);
            }
            if ( GXutil.strcmp(Z4905BarFasAcab, T01HS2_A4905BarFasAcab[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasAcab");
               GXutil.writeLogRaw("Old: ",Z4905BarFasAcab);
               GXutil.writeLogRaw("Current: ",T01HS2_A4905BarFasAcab[0]);
            }
            if ( GXutil.strcmp(Z4637BarFasCara, T01HS2_A4637BarFasCara[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasCara");
               GXutil.writeLogRaw("Old: ",Z4637BarFasCara);
               GXutil.writeLogRaw("Current: ",T01HS2_A4637BarFasCara[0]);
            }
            if ( GXutil.strcmp(Z4301BarFasCoP, T01HS2_A4301BarFasCoP[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasCoP");
               GXutil.writeLogRaw("Old: ",Z4301BarFasCoP);
               GXutil.writeLogRaw("Current: ",T01HS2_A4301BarFasCoP[0]);
            }
            if ( Z4288BarNPzas != T01HS2_A4288BarNPzas[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarNPzas");
               GXutil.writeLogRaw("Old: ",Z4288BarNPzas);
               GXutil.writeLogRaw("Current: ",T01HS2_A4288BarNPzas[0]);
            }
            if ( GXutil.strcmp(Z4287BarFasFor, T01HS2_A4287BarFasFor[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasFor");
               GXutil.writeLogRaw("Old: ",Z4287BarFasFor);
               GXutil.writeLogRaw("Current: ",T01HS2_A4287BarFasFor[0]);
            }
            if ( Z4022BarNumBot != T01HS2_A4022BarNumBot[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarNumBot");
               GXutil.writeLogRaw("Old: ",Z4022BarNumBot);
               GXutil.writeLogRaw("Current: ",T01HS2_A4022BarNumBot[0]);
            }
            if ( GXutil.strcmp(Z4021BarFasBot, T01HS2_A4021BarFasBot[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasBot");
               GXutil.writeLogRaw("Old: ",Z4021BarFasBot);
               GXutil.writeLogRaw("Current: ",T01HS2_A4021BarFasBot[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T01HS2_A3298BarFecRIni[0])) ) )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFecRIni");
               GXutil.writeLogRaw("Old: ",Z3298BarFecRIni);
               GXutil.writeLogRaw("Current: ",T01HS2_A3298BarFecRIni[0]);
            }
            if ( DecimalUtil.compareTo(Z215BarTieRea, T01HS2_A215BarTieRea[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarTieRea");
               GXutil.writeLogRaw("Old: ",Z215BarTieRea);
               GXutil.writeLogRaw("Current: ",T01HS2_A215BarTieRea[0]);
            }
            if ( Z164BarHorFin != T01HS2_A164BarHorFin[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarHorFin");
               GXutil.writeLogRaw("Old: ",Z164BarHorFin);
               GXutil.writeLogRaw("Current: ",T01HS2_A164BarHorFin[0]);
            }
            if ( Z165BarHorIni != T01HS2_A165BarHorIni[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarHorIni");
               GXutil.writeLogRaw("Old: ",Z165BarHorIni);
               GXutil.writeLogRaw("Current: ",T01HS2_A165BarHorIni[0]);
            }
            if ( GXutil.strcmp(Z179BarLoc, T01HS2_A179BarLoc[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarLoc");
               GXutil.writeLogRaw("Old: ",Z179BarLoc);
               GXutil.writeLogRaw("Current: ",T01HS2_A179BarLoc[0]);
            }
            if ( DecimalUtil.compareTo(Z227BarUni, T01HS2_A227BarUni[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarUni");
               GXutil.writeLogRaw("Old: ",Z227BarUni);
               GXutil.writeLogRaw("Current: ",T01HS2_A227BarUni[0]);
            }
            if ( DecimalUtil.compareTo(Z216BarTieTeo, T01HS2_A216BarTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarTieTeo");
               GXutil.writeLogRaw("Old: ",Z216BarTieTeo);
               GXutil.writeLogRaw("Current: ",T01HS2_A216BarTieTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T01HS2_A160BarFecRea[0])) ) )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFecRea");
               GXutil.writeLogRaw("Old: ",Z160BarFecRea);
               GXutil.writeLogRaw("Current: ",T01HS2_A160BarFecRea[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T01HS2_A162BarFecTeo[0])) ) )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFecTeo");
               GXutil.writeLogRaw("Old: ",Z162BarFecTeo);
               GXutil.writeLogRaw("Current: ",T01HS2_A162BarFecTeo[0]);
            }
            if ( GXutil.strcmp(Z150BarFacTin, T01HS2_A150BarFacTin[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFacTin");
               GXutil.writeLogRaw("Old: ",Z150BarFacTin);
               GXutil.writeLogRaw("Current: ",T01HS2_A150BarFacTin[0]);
            }
            if ( Z153BarFasEst != T01HS2_A153BarFasEst[0] )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasEst");
               GXutil.writeLogRaw("Old: ",Z153BarFasEst);
               GXutil.writeLogRaw("Current: ",T01HS2_A153BarFasEst[0]);
            }
            if ( GXutil.strcmp(Z152BarFasCon, T01HS2_A152BarFasCon[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasCon");
               GXutil.writeLogRaw("Old: ",Z152BarFasCon);
               GXutil.writeLogRaw("Current: ",T01HS2_A152BarFasCon[0]);
            }
            if ( GXutil.strcmp(Z2327BarFasSer, T01HS2_A2327BarFasSer[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasSer");
               GXutil.writeLogRaw("Old: ",Z2327BarFasSer);
               GXutil.writeLogRaw("Current: ",T01HS2_A2327BarFasSer[0]);
            }
            if ( !( GXutil.dateCompare(Z4443BarFasDTF, T01HS2_A4443BarFasDTF[0]) ) )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasDTF");
               GXutil.writeLogRaw("Old: ",Z4443BarFasDTF);
               GXutil.writeLogRaw("Current: ",T01HS2_A4443BarFasDTF[0]);
            }
            if ( !( GXutil.dateCompare(Z4442BarFasDTI, T01HS2_A4442BarFasDTI[0]) ) )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"BarFasDTI");
               GXutil.writeLogRaw("Old: ",Z4442BarFasDTI);
               GXutil.writeLogRaw("Current: ",T01HS2_A4442BarFasDTI[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01HS2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarfas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01HS2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HS15( )
   {
      beforeValidate1HS15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HS15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HS15( 0) ;
         checkOptimisticConcurrency1HS15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HS15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HS15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HS12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A194BarOrdLin), Byte.valueOf(A3836BarFasPri), Byte.valueOf(A6555BarFasNPl), Short.valueOf(A6430BarTieAut), A5999BarFasCR, A4905BarFasAcab, A4637BarFasCara, A4301BarFasCoP, Integer.valueOf(A4288BarNPzas), A4287BarFasFor, Integer.valueOf(A4022BarNumBot), A4021BarFasBot, A3298BarFecRIni, A215BarTieRea, Short.valueOf(A164BarHorFin), Short.valueOf(A165BarHorIni), A179BarLoc, A227BarUni, A216BarTieTeo, A160BarFecRea, A162BarFecTeo, A150BarFacTin, Byte.valueOf(A153BarFasEst), A152BarFasCon, Boolean.valueOf(n2327BarFasSer), A2327BarFasSer, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1HS0( ) ;
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
            load1HS15( ) ;
         }
         endLevel1HS15( ) ;
      }
      closeExtendedTableCursors1HS15( ) ;
   }

   public void update1HS15( )
   {
      beforeValidate1HS15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HS15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HS15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HS15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HS15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HS13 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A3836BarFasPri), Byte.valueOf(A6555BarFasNPl), Short.valueOf(A6430BarTieAut), A5999BarFasCR, A4905BarFasAcab, A4637BarFasCara, A4301BarFasCoP, Integer.valueOf(A4288BarNPzas), A4287BarFasFor, Integer.valueOf(A4022BarNumBot), A4021BarFasBot, A3298BarFecRIni, A215BarTieRea, Short.valueOf(A164BarHorFin), Short.valueOf(A165BarHorIni), A179BarLoc, A227BarUni, A216BarTieTeo, A160BarFecRea, A162BarFecTeo, A150BarFacTin, Byte.valueOf(A153BarFasEst), A152BarFasCon, Boolean.valueOf(n2327BarFasSer), A2327BarFasSer, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A457FasCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HS15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HS0( ) ;
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
         endLevel1HS15( ) ;
      }
      closeExtendedTableCursors1HS15( ) ;
   }

   public void deferredUpdate1HS15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HS15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HS15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HS15( ) ;
         afterConfirm1HS15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HS15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HS14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound15 == 0 )
                     {
                        initAll1HS15( ) ;
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
                     resetCaption1HS0( ) ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HS15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HS15( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01HS15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01HS16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01HS17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01HS18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01HS19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01HS20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01HS21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01HS22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01HS23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01HS24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01HS25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01HS26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01HS27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01HS28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01HS29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01HS30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01HS31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01HS32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01HS33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01HS34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01HS35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevel1HS15( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HS15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrbarfas");
         if ( AnyError == 0 )
         {
            confirmValues1HS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrbarfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HS15( )
   {
      /* Using cursor T01HS36 */
      pr_default.execute(34);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T01HS36_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01HS36_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HS36_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HS36_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01HS36_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01HS36_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HS15( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T01HS36_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01HS36_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HS36_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HS36_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01HS36_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01HS36_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void scanEnd1HS15( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1HS15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HS15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HS15( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HS15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HS15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HS15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HS15( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtBarFasPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasPri_Enabled), 5, 0), true);
      edtBarFasNPl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasNPl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasNPl_Enabled), 5, 0), true);
      edtBarTieAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieAut_Enabled), 5, 0), true);
      edtBarFasCR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCR_Enabled), 5, 0), true);
      edtBarFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAcab_Enabled), 5, 0), true);
      edtBarFasCara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCara_Enabled), 5, 0), true);
      edtBarFasCoP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCoP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCoP_Enabled), 5, 0), true);
      edtBarNPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNPzas_Enabled), 5, 0), true);
      edtBarFasFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasFor_Enabled), 5, 0), true);
      edtBarNumBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumBot_Enabled), 5, 0), true);
      edtBarFasBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasBot_Enabled), 5, 0), true);
      edtBarFecRIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIni_Enabled), 5, 0), true);
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), true);
      edtBarHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), true);
      edtBarHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), true);
      edtBarLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), true);
      edtBarUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), true);
      edtBarTieTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), true);
      edtBarFecRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), true);
      edtBarFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), true);
      edtBarFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), true);
      edtBarFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), true);
      edtBarFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtBarFasSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSer_Enabled), 5, 0), true);
      edtBarFasDTF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDTF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDTF_Enabled), 5, 0), true);
      edtBarFasDTI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDTI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDTI_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HS15( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HS0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrbarfas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3836BarFasPri", GXutil.ltrim( localUtil.ntoc( Z3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6555BarFasNPl", GXutil.ltrim( localUtil.ntoc( Z6555BarFasNPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6430BarTieAut", GXutil.ltrim( localUtil.ntoc( Z6430BarTieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5999BarFasCR", GXutil.ltrim( localUtil.ntoc( Z5999BarFasCR, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4905BarFasAcab", GXutil.rtrim( Z4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4637BarFasCara", GXutil.rtrim( Z4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4301BarFasCoP", GXutil.rtrim( Z4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4288BarNPzas", GXutil.ltrim( localUtil.ntoc( Z4288BarNPzas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4287BarFasFor", GXutil.rtrim( Z4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4022BarNumBot", GXutil.ltrim( localUtil.ntoc( Z4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4021BarFasBot", GXutil.rtrim( Z4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3298BarFecRIni", localUtil.dtoc( Z3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z215BarTieRea", GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z164BarHorFin", GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z165BarHorIni", GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z179BarLoc", GXutil.rtrim( Z179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z227BarUni", GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z216BarTieTeo", GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z160BarFecRea", localUtil.dtoc( Z160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z162BarFecTeo", localUtil.dtoc( Z162BarFecTeo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z150BarFacTin", GXutil.rtrim( Z150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z153BarFasEst", GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z152BarFasCon", GXutil.rtrim( Z152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2327BarFasSer", GXutil.rtrim( Z2327BarFasSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4443BarFasDTF", localUtil.ttoc( Z4443BarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4442BarFasDTI", localUtil.ttoc( Z4442BarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.ttrbarfas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrBARFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "BARFAS", "") ;
   }

   public void initializeNonKey1HS15( )
   {
      A3836BarFasPri = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
      A6555BarFasNPl = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
      A6430BarTieAut = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
      A5999BarFasCR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
      A4905BarFasAcab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
      A4637BarFasCara = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
      A4301BarFasCoP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
      A4288BarNPzas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
      A4287BarFasFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
      A4022BarNumBot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
      A4021BarFasBot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
      A3298BarFecRIni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      A215BarTieRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
      A164BarHorFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
      A165BarHorIni = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
      A179BarLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
      A227BarUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
      A216BarTieTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
      A160BarFecRea = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      A162BarFecTeo = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      A150BarFacTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
      A153BarFasEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
      A152BarFasCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A2327BarFasSer = "" ;
      n2327BarFasSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2327BarFasSer", A2327BarFasSer);
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      n4443BarFasDTF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      n4442BarFasDTI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z3836BarFasPri = (byte)(0) ;
      Z6555BarFasNPl = (byte)(0) ;
      Z6430BarTieAut = (short)(0) ;
      Z5999BarFasCR = DecimalUtil.ZERO ;
      Z4905BarFasAcab = "" ;
      Z4637BarFasCara = "" ;
      Z4301BarFasCoP = "" ;
      Z4288BarNPzas = 0 ;
      Z4287BarFasFor = "" ;
      Z4022BarNumBot = 0 ;
      Z4021BarFasBot = "" ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z164BarHorFin = (short)(0) ;
      Z165BarHorIni = (short)(0) ;
      Z179BarLoc = "" ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z150BarFacTin = "" ;
      Z153BarFasEst = (byte)(0) ;
      Z152BarFasCon = "" ;
      Z2327BarFasSer = "" ;
      Z4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      Z4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
   }

   public void initAll1HS15( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      initializeNonKey1HS15( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016325350", true, true);
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
      httpContext.AddJavascriptSource("ttrbarfas.js", "?202661016325350", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarFasPri_Internalname = "BARFASPRI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarFasNPl_Internalname = "BARFASNPL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarTieAut_Internalname = "BARTIEAUT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarFasCR_Internalname = "BARFASCR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarFasAcab_Internalname = "BARFASACAB" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarFasCara_Internalname = "BARFASCARA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarFasCoP_Internalname = "BARFASCOP" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarNPzas_Internalname = "BARNPZAS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarFasFor_Internalname = "BARFASFOR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarNumBot_Internalname = "BARNUMBOT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarFasBot_Internalname = "BARFASBOT" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarFecRIni_Internalname = "BARFECRINI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarHorFin_Internalname = "BARHORFIN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarHorIni_Internalname = "BARHORINI" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarLoc_Internalname = "BARLOC" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarUni_Internalname = "BARUNI" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarFecTeo_Internalname = "BARFECTEO" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarFasSer_Internalname = "BARFASSER" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarFasDTF_Internalname = "BARFASDTF" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarFasDTI_Internalname = "BARFASDTI" ;
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
      Form.setCaption( httpContext.getMessage( "BARFAS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarFasDTI_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasDTI_Enabled = 1 ;
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTF_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasDTF_Enabled = 1 ;
      edtBarFasSer_Jsonclick = "" ;
      edtBarFasSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasSer_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 1 ;
      edtBarFasCon_Jsonclick = "" ;
      edtBarFasCon_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCon_Enabled = 1 ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasEst_Enabled = 1 ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFacTin_Backcolor = (int)(0xFFFFFF) ;
      edtBarFacTin_Enabled = 1 ;
      edtBarFecTeo_Jsonclick = "" ;
      edtBarFecTeo_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecTeo_Enabled = 1 ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarFecRea_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecRea_Enabled = 1 ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarTieTeo_Backcolor = (int)(0xFFFFFF) ;
      edtBarTieTeo_Enabled = 1 ;
      edtBarUni_Jsonclick = "" ;
      edtBarUni_Backcolor = (int)(0xFFFFFF) ;
      edtBarUni_Enabled = 1 ;
      edtBarLoc_Jsonclick = "" ;
      edtBarLoc_Backcolor = (int)(0xFFFFFF) ;
      edtBarLoc_Enabled = 1 ;
      edtBarHorIni_Jsonclick = "" ;
      edtBarHorIni_Backcolor = (int)(0xFFFFFF) ;
      edtBarHorIni_Enabled = 1 ;
      edtBarHorFin_Jsonclick = "" ;
      edtBarHorFin_Backcolor = (int)(0xFFFFFF) ;
      edtBarHorFin_Enabled = 1 ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieRea_Backcolor = (int)(0xFFFFFF) ;
      edtBarTieRea_Enabled = 1 ;
      edtBarFecRIni_Jsonclick = "" ;
      edtBarFecRIni_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecRIni_Enabled = 1 ;
      edtBarFasBot_Jsonclick = "" ;
      edtBarFasBot_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasBot_Enabled = 1 ;
      edtBarNumBot_Jsonclick = "" ;
      edtBarNumBot_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumBot_Enabled = 1 ;
      edtBarFasFor_Jsonclick = "" ;
      edtBarFasFor_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasFor_Enabled = 1 ;
      edtBarNPzas_Jsonclick = "" ;
      edtBarNPzas_Backcolor = (int)(0xFFFFFF) ;
      edtBarNPzas_Enabled = 1 ;
      edtBarFasCoP_Jsonclick = "" ;
      edtBarFasCoP_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCoP_Enabled = 1 ;
      edtBarFasCara_Jsonclick = "" ;
      edtBarFasCara_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCara_Enabled = 1 ;
      edtBarFasAcab_Jsonclick = "" ;
      edtBarFasAcab_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasAcab_Enabled = 1 ;
      edtBarFasCR_Jsonclick = "" ;
      edtBarFasCR_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCR_Enabled = 1 ;
      edtBarTieAut_Jsonclick = "" ;
      edtBarTieAut_Backcolor = (int)(0xFFFFFF) ;
      edtBarTieAut_Enabled = 1 ;
      edtBarFasNPl_Jsonclick = "" ;
      edtBarFasNPl_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasNPl_Enabled = 1 ;
      edtBarFasPri_Jsonclick = "" ;
      edtBarFasPri_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasPri_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01HS37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(35);
      GX_FocusControl = edtBarFasPri_Internalname ;
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

   public void valid_Procod( )
   {
      /* Using cursor T01HS37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barordlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.ltrim( localUtil.ntoc( A6555BarFasNPl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrim( localUtil.ntoc( A6430BarTieAut, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrim( localUtil.ntoc( A5999BarFasCR, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", GXutil.rtrim( A4905BarFasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", GXutil.rtrim( A4637BarFasCara));
      httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", GXutil.rtrim( A4301BarFasCoP));
      httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrim( localUtil.ntoc( A4288BarNPzas, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", GXutil.rtrim( A4287BarFasFor));
      httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrim( localUtil.ntoc( A4022BarNumBot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", GXutil.rtrim( A4021BarFasBot));
      httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", GXutil.rtrim( A179BarLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", GXutil.rtrim( A150BarFacTin));
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", GXutil.rtrim( A152BarFasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2327BarFasSer", GXutil.rtrim( A2327BarFasSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4443BarFasDTF", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4442BarFasDTI", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3836BarFasPri", GXutil.ltrim( localUtil.ntoc( Z3836BarFasPri, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6555BarFasNPl", GXutil.ltrim( localUtil.ntoc( Z6555BarFasNPl, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6430BarTieAut", GXutil.ltrim( localUtil.ntoc( Z6430BarTieAut, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5999BarFasCR", GXutil.ltrim( localUtil.ntoc( Z5999BarFasCR, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4905BarFasAcab", GXutil.rtrim( Z4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4637BarFasCara", GXutil.rtrim( Z4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4301BarFasCoP", GXutil.rtrim( Z4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4288BarNPzas", GXutil.ltrim( localUtil.ntoc( Z4288BarNPzas, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4287BarFasFor", GXutil.rtrim( Z4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4022BarNumBot", GXutil.ltrim( localUtil.ntoc( Z4022BarNumBot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4021BarFasBot", GXutil.rtrim( Z4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3298BarFecRIni", localUtil.format(Z3298BarFecRIni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z215BarTieRea", GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z164BarHorFin", GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z165BarHorIni", GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z179BarLoc", GXutil.rtrim( Z179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z227BarUni", GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z216BarTieTeo", GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z160BarFecRea", localUtil.format(Z160BarFecRea, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z162BarFecTeo", localUtil.format(Z162BarFecTeo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z150BarFacTin", GXutil.rtrim( Z150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z153BarFasEst", GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z152BarFasCon", GXutil.rtrim( Z152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2327BarFasSer", GXutil.rtrim( Z2327BarFasSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4443BarFasDTF", localUtil.ttoc( Z4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4442BarFasDTI", localUtil.ttoc( Z4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01HS38 */
      pr_default.execute(36, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(36);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A6555BarFasNPl',fld:'BARFASNPL',pic:'9'},{av:'A6430BarTieAut',fld:'BARTIEAUT',pic:'ZZZ9'},{av:'A5999BarFasCR',fld:'BARFASCR',pic:'ZZZZ9.99999'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A4637BarFasCara',fld:'BARFASCARA',pic:''},{av:'A4301BarFasCoP',fld:'BARFASCOP',pic:'@!'},{av:'A4288BarNPzas',fld:'BARNPZAS',pic:'ZZZZZZZ9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A4022BarNumBot',fld:'BARNUMBOT',pic:'ZZZZZ9'},{av:'A4021BarFasBot',fld:'BARFASBOT',pic:''},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:''},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A179BarLoc',fld:'BARLOC',pic:''},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A160BarFecRea',fld:'BARFECREA',pic:''},{av:'A162BarFecTeo',fld:'BARFECTEO',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A2327BarFasSer',fld:'BARFASSER',pic:''},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z3836BarFasPri'},{av:'Z6555BarFasNPl'},{av:'Z6430BarTieAut'},{av:'Z5999BarFasCR'},{av:'Z4905BarFasAcab'},{av:'Z4637BarFasCara'},{av:'Z4301BarFasCoP'},{av:'Z4288BarNPzas'},{av:'Z4287BarFasFor'},{av:'Z4022BarNumBot'},{av:'Z4021BarFasBot'},{av:'Z3298BarFecRIni'},{av:'Z215BarTieRea'},{av:'Z164BarHorFin'},{av:'Z165BarHorIni'},{av:'Z179BarLoc'},{av:'Z227BarUni'},{av:'Z216BarTieTeo'},{av:'Z160BarFecRea'},{av:'Z162BarFecTeo'},{av:'Z150BarFacTin'},{av:'Z153BarFasEst'},{av:'Z152BarFasCon'},{av:'Z457FasCod'},{av:'Z2327BarFasSer'},{av:'Z4443BarFasDTF'},{av:'Z4442BarFasDTI'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARFASACAB","{handler:'valid_Barfasacab',iparms:[]");
      setEventMetadata("VALID_BARFASACAB",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOP","{handler:'valid_Barfascop',iparms:[]");
      setEventMetadata("VALID_BARFASCOP",",oparms:[]}");
      setEventMetadata("VALID_BARFASFOR","{handler:'valid_Barfasfor',iparms:[]");
      setEventMetadata("VALID_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALID_BARFACTIN","{handler:'valid_Barfactin',iparms:[]");
      setEventMetadata("VALID_BARFACTIN",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[]");
      setEventMetadata("VALID_BARFASEST",",oparms:[]}");
      setEventMetadata("VALID_BARFASCON","{handler:'valid_Barfascon',iparms:[]");
      setEventMetadata("VALID_BARFASCON",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(36);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z5999BarFasCR = DecimalUtil.ZERO ;
      Z4905BarFasAcab = "" ;
      Z4637BarFasCara = "" ;
      Z4301BarFasCoP = "" ;
      Z4287BarFasFor = "" ;
      Z4021BarFasBot = "" ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z150BarFacTin = "" ;
      Z152BarFasCon = "" ;
      Z2327BarFasSer = "" ;
      Z4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      Z4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A5999BarFasCR = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A4905BarFasAcab = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4637BarFasCara = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4301BarFasCoP = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A4287BarFasFor = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A4021BarFasBot = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      lblTextblock19_Jsonclick = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A179BarLoc = "" ;
      lblTextblock23_Jsonclick = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      lblTextblock26_Jsonclick = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      lblTextblock27_Jsonclick = "" ;
      A150BarFacTin = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A152BarFasCon = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A2327BarFasSer = "" ;
      lblTextblock32_Jsonclick = "" ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock33_Jsonclick = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T01HS6_A194BarOrdLin = new short[1] ;
      T01HS6_A3836BarFasPri = new byte[1] ;
      T01HS6_A6555BarFasNPl = new byte[1] ;
      T01HS6_A6430BarTieAut = new short[1] ;
      T01HS6_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS6_A4905BarFasAcab = new String[] {""} ;
      T01HS6_A4637BarFasCara = new String[] {""} ;
      T01HS6_A4301BarFasCoP = new String[] {""} ;
      T01HS6_A4288BarNPzas = new int[1] ;
      T01HS6_A4287BarFasFor = new String[] {""} ;
      T01HS6_A4022BarNumBot = new int[1] ;
      T01HS6_A4021BarFasBot = new String[] {""} ;
      T01HS6_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS6_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS6_A164BarHorFin = new short[1] ;
      T01HS6_A165BarHorIni = new short[1] ;
      T01HS6_A179BarLoc = new String[] {""} ;
      T01HS6_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS6_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS6_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS6_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS6_A150BarFacTin = new String[] {""} ;
      T01HS6_A153BarFasEst = new byte[1] ;
      T01HS6_A152BarFasCon = new String[] {""} ;
      T01HS6_A2327BarFasSer = new String[] {""} ;
      T01HS6_n2327BarFasSer = new boolean[] {false} ;
      T01HS6_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS6_n4443BarFasDTF = new boolean[] {false} ;
      T01HS6_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS6_n4442BarFasDTI = new boolean[] {false} ;
      T01HS6_A396EmprCod = new String[] {""} ;
      T01HS6_A129BarCod = new int[1] ;
      T01HS6_A132BarCodReo = new byte[1] ;
      T01HS6_A130BarCodPar = new String[] {""} ;
      T01HS6_A758ProCod = new String[] {""} ;
      T01HS6_A457FasCod = new String[] {""} ;
      T01HS5_A396EmprCod = new String[] {""} ;
      T01HS4_A396EmprCod = new String[] {""} ;
      T01HS7_A396EmprCod = new String[] {""} ;
      T01HS8_A396EmprCod = new String[] {""} ;
      T01HS9_A396EmprCod = new String[] {""} ;
      T01HS9_A129BarCod = new int[1] ;
      T01HS9_A132BarCodReo = new byte[1] ;
      T01HS9_A130BarCodPar = new String[] {""} ;
      T01HS9_A758ProCod = new String[] {""} ;
      T01HS9_A194BarOrdLin = new short[1] ;
      T01HS3_A194BarOrdLin = new short[1] ;
      T01HS3_A3836BarFasPri = new byte[1] ;
      T01HS3_A6555BarFasNPl = new byte[1] ;
      T01HS3_A6430BarTieAut = new short[1] ;
      T01HS3_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS3_A4905BarFasAcab = new String[] {""} ;
      T01HS3_A4637BarFasCara = new String[] {""} ;
      T01HS3_A4301BarFasCoP = new String[] {""} ;
      T01HS3_A4288BarNPzas = new int[1] ;
      T01HS3_A4287BarFasFor = new String[] {""} ;
      T01HS3_A4022BarNumBot = new int[1] ;
      T01HS3_A4021BarFasBot = new String[] {""} ;
      T01HS3_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS3_A164BarHorFin = new short[1] ;
      T01HS3_A165BarHorIni = new short[1] ;
      T01HS3_A179BarLoc = new String[] {""} ;
      T01HS3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS3_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS3_A150BarFacTin = new String[] {""} ;
      T01HS3_A153BarFasEst = new byte[1] ;
      T01HS3_A152BarFasCon = new String[] {""} ;
      T01HS3_A2327BarFasSer = new String[] {""} ;
      T01HS3_n2327BarFasSer = new boolean[] {false} ;
      T01HS3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS3_n4443BarFasDTF = new boolean[] {false} ;
      T01HS3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS3_n4442BarFasDTI = new boolean[] {false} ;
      T01HS3_A396EmprCod = new String[] {""} ;
      T01HS3_A129BarCod = new int[1] ;
      T01HS3_A132BarCodReo = new byte[1] ;
      T01HS3_A130BarCodPar = new String[] {""} ;
      T01HS3_A758ProCod = new String[] {""} ;
      T01HS3_A457FasCod = new String[] {""} ;
      sMode15 = "" ;
      T01HS10_A396EmprCod = new String[] {""} ;
      T01HS10_A129BarCod = new int[1] ;
      T01HS10_A132BarCodReo = new byte[1] ;
      T01HS10_A130BarCodPar = new String[] {""} ;
      T01HS10_A758ProCod = new String[] {""} ;
      T01HS10_A194BarOrdLin = new short[1] ;
      T01HS11_A396EmprCod = new String[] {""} ;
      T01HS11_A129BarCod = new int[1] ;
      T01HS11_A132BarCodReo = new byte[1] ;
      T01HS11_A130BarCodPar = new String[] {""} ;
      T01HS11_A758ProCod = new String[] {""} ;
      T01HS11_A194BarOrdLin = new short[1] ;
      T01HS2_A194BarOrdLin = new short[1] ;
      T01HS2_A3836BarFasPri = new byte[1] ;
      T01HS2_A6555BarFasNPl = new byte[1] ;
      T01HS2_A6430BarTieAut = new short[1] ;
      T01HS2_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS2_A4905BarFasAcab = new String[] {""} ;
      T01HS2_A4637BarFasCara = new String[] {""} ;
      T01HS2_A4301BarFasCoP = new String[] {""} ;
      T01HS2_A4288BarNPzas = new int[1] ;
      T01HS2_A4287BarFasFor = new String[] {""} ;
      T01HS2_A4022BarNumBot = new int[1] ;
      T01HS2_A4021BarFasBot = new String[] {""} ;
      T01HS2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS2_A164BarHorFin = new short[1] ;
      T01HS2_A165BarHorIni = new short[1] ;
      T01HS2_A179BarLoc = new String[] {""} ;
      T01HS2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HS2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS2_A150BarFacTin = new String[] {""} ;
      T01HS2_A153BarFasEst = new byte[1] ;
      T01HS2_A152BarFasCon = new String[] {""} ;
      T01HS2_A2327BarFasSer = new String[] {""} ;
      T01HS2_n2327BarFasSer = new boolean[] {false} ;
      T01HS2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS2_n4443BarFasDTF = new boolean[] {false} ;
      T01HS2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      T01HS2_n4442BarFasDTI = new boolean[] {false} ;
      T01HS2_A396EmprCod = new String[] {""} ;
      T01HS2_A129BarCod = new int[1] ;
      T01HS2_A132BarCodReo = new byte[1] ;
      T01HS2_A130BarCodPar = new String[] {""} ;
      T01HS2_A758ProCod = new String[] {""} ;
      T01HS2_A457FasCod = new String[] {""} ;
      T01HS15_A396EmprCod = new String[] {""} ;
      T01HS15_A129BarCod = new int[1] ;
      T01HS15_A132BarCodReo = new byte[1] ;
      T01HS15_A130BarCodPar = new String[] {""} ;
      T01HS15_A758ProCod = new String[] {""} ;
      T01HS15_A194BarOrdLin = new short[1] ;
      T01HS15_A12517SolAfLn = new short[1] ;
      T01HS16_A396EmprCod = new String[] {""} ;
      T01HS16_A129BarCod = new int[1] ;
      T01HS16_A132BarCodReo = new byte[1] ;
      T01HS16_A130BarCodPar = new String[] {""} ;
      T01HS16_A758ProCod = new String[] {""} ;
      T01HS16_A194BarOrdLin = new short[1] ;
      T01HS16_A12516SolLzLn = new short[1] ;
      T01HS17_A396EmprCod = new String[] {""} ;
      T01HS17_A129BarCod = new int[1] ;
      T01HS17_A132BarCodReo = new byte[1] ;
      T01HS17_A130BarCodPar = new String[] {""} ;
      T01HS17_A758ProCod = new String[] {""} ;
      T01HS17_A194BarOrdLin = new short[1] ;
      T01HS17_A12515SolPlLn = new short[1] ;
      T01HS18_A396EmprCod = new String[] {""} ;
      T01HS18_A129BarCod = new int[1] ;
      T01HS18_A132BarCodReo = new byte[1] ;
      T01HS18_A130BarCodPar = new String[] {""} ;
      T01HS18_A758ProCod = new String[] {""} ;
      T01HS18_A194BarOrdLin = new short[1] ;
      T01HS18_A12514SolSAlLn = new short[1] ;
      T01HS19_A396EmprCod = new String[] {""} ;
      T01HS19_A129BarCod = new int[1] ;
      T01HS19_A132BarCodReo = new byte[1] ;
      T01HS19_A130BarCodPar = new String[] {""} ;
      T01HS19_A758ProCod = new String[] {""} ;
      T01HS19_A194BarOrdLin = new short[1] ;
      T01HS19_A12513SolSAcLn = new short[1] ;
      T01HS20_A396EmprCod = new String[] {""} ;
      T01HS20_A129BarCod = new int[1] ;
      T01HS20_A132BarCodReo = new byte[1] ;
      T01HS20_A130BarCodPar = new String[] {""} ;
      T01HS20_A758ProCod = new String[] {""} ;
      T01HS20_A194BarOrdLin = new short[1] ;
      T01HS20_A12512SolFrLn = new short[1] ;
      T01HS21_A396EmprCod = new String[] {""} ;
      T01HS21_A129BarCod = new int[1] ;
      T01HS21_A132BarCodReo = new byte[1] ;
      T01HS21_A130BarCodPar = new String[] {""} ;
      T01HS21_A758ProCod = new String[] {""} ;
      T01HS21_A194BarOrdLin = new short[1] ;
      T01HS21_A12511SolAgLn = new short[1] ;
      T01HS22_A396EmprCod = new String[] {""} ;
      T01HS22_A129BarCod = new int[1] ;
      T01HS22_A132BarCodReo = new byte[1] ;
      T01HS22_A130BarCodPar = new String[] {""} ;
      T01HS22_A758ProCod = new String[] {""} ;
      T01HS22_A194BarOrdLin = new short[1] ;
      T01HS22_A12510SolLvLn = new short[1] ;
      T01HS23_A396EmprCod = new String[] {""} ;
      T01HS23_A129BarCod = new int[1] ;
      T01HS23_A132BarCodReo = new byte[1] ;
      T01HS23_A130BarCodPar = new String[] {""} ;
      T01HS23_A758ProCod = new String[] {""} ;
      T01HS23_A194BarOrdLin = new short[1] ;
      T01HS23_A10781BarFasNb = new int[1] ;
      T01HS24_A396EmprCod = new String[] {""} ;
      T01HS24_A129BarCod = new int[1] ;
      T01HS24_A132BarCodReo = new byte[1] ;
      T01HS24_A130BarCodPar = new String[] {""} ;
      T01HS24_A758ProCod = new String[] {""} ;
      T01HS24_A194BarOrdLin = new short[1] ;
      T01HS24_A719PrdNum = new String[] {""} ;
      T01HS25_A396EmprCod = new String[] {""} ;
      T01HS25_A129BarCod = new int[1] ;
      T01HS25_A132BarCodReo = new byte[1] ;
      T01HS25_A130BarCodPar = new String[] {""} ;
      T01HS25_A758ProCod = new String[] {""} ;
      T01HS25_A194BarOrdLin = new short[1] ;
      T01HS25_A9966Em_cod = new String[] {""} ;
      T01HS26_A396EmprCod = new String[] {""} ;
      T01HS26_A129BarCod = new int[1] ;
      T01HS26_A132BarCodReo = new byte[1] ;
      T01HS26_A130BarCodPar = new String[] {""} ;
      T01HS26_A758ProCod = new String[] {""} ;
      T01HS26_A194BarOrdLin = new short[1] ;
      T01HS26_A9940Ab_cod = new String[] {""} ;
      T01HS27_A396EmprCod = new String[] {""} ;
      T01HS27_A129BarCod = new int[1] ;
      T01HS27_A132BarCodReo = new byte[1] ;
      T01HS27_A130BarCodPar = new String[] {""} ;
      T01HS27_A758ProCod = new String[] {""} ;
      T01HS27_A194BarOrdLin = new short[1] ;
      T01HS27_A9911Ca_cod = new String[] {""} ;
      T01HS28_A396EmprCod = new String[] {""} ;
      T01HS28_A129BarCod = new int[1] ;
      T01HS28_A132BarCodReo = new byte[1] ;
      T01HS28_A130BarCodPar = new String[] {""} ;
      T01HS28_A758ProCod = new String[] {""} ;
      T01HS28_A194BarOrdLin = new short[1] ;
      T01HS28_A9878Pe_cod = new String[] {""} ;
      T01HS29_A396EmprCod = new String[] {""} ;
      T01HS29_A129BarCod = new int[1] ;
      T01HS29_A132BarCodReo = new byte[1] ;
      T01HS29_A130BarCodPar = new String[] {""} ;
      T01HS29_A758ProCod = new String[] {""} ;
      T01HS29_A194BarOrdLin = new short[1] ;
      T01HS29_A9870Rm_cod = new String[] {""} ;
      T01HS30_A396EmprCod = new String[] {""} ;
      T01HS30_A129BarCod = new int[1] ;
      T01HS30_A132BarCodReo = new byte[1] ;
      T01HS30_A130BarCodPar = new String[] {""} ;
      T01HS30_A758ProCod = new String[] {""} ;
      T01HS30_A194BarOrdLin = new short[1] ;
      T01HS30_A7934Dtb_Ordl = new short[1] ;
      T01HS31_A396EmprCod = new String[] {""} ;
      T01HS31_A129BarCod = new int[1] ;
      T01HS31_A132BarCodReo = new byte[1] ;
      T01HS31_A130BarCodPar = new String[] {""} ;
      T01HS31_A758ProCod = new String[] {""} ;
      T01HS31_A194BarOrdLin = new short[1] ;
      T01HS31_A5371FasQuiLin = new short[1] ;
      T01HS32_A396EmprCod = new String[] {""} ;
      T01HS32_A129BarCod = new int[1] ;
      T01HS32_A132BarCodReo = new byte[1] ;
      T01HS32_A130BarCodPar = new String[] {""} ;
      T01HS32_A758ProCod = new String[] {""} ;
      T01HS32_A194BarOrdLin = new short[1] ;
      T01HS32_A4940A_Barcod = new int[1] ;
      T01HS32_A4941A_BarReo = new byte[1] ;
      T01HS32_A4942A_BarPar = new String[] {""} ;
      T01HS32_A4943A_ProCod = new String[] {""} ;
      T01HS32_A4944A_BarOrd = new short[1] ;
      T01HS33_A396EmprCod = new String[] {""} ;
      T01HS33_A129BarCod = new int[1] ;
      T01HS33_A132BarCodReo = new byte[1] ;
      T01HS33_A130BarCodPar = new String[] {""} ;
      T01HS33_A758ProCod = new String[] {""} ;
      T01HS33_A194BarOrdLin = new short[1] ;
      T01HS33_A4643BarFasLot = new int[1] ;
      T01HS34_A396EmprCod = new String[] {""} ;
      T01HS34_A129BarCod = new int[1] ;
      T01HS34_A132BarCodReo = new byte[1] ;
      T01HS34_A130BarCodPar = new String[] {""} ;
      T01HS34_A758ProCod = new String[] {""} ;
      T01HS34_A194BarOrdLin = new short[1] ;
      T01HS34_A4031CCTCod = new int[1] ;
      T01HS35_A396EmprCod = new String[] {""} ;
      T01HS35_A129BarCod = new int[1] ;
      T01HS35_A132BarCodReo = new byte[1] ;
      T01HS35_A130BarCodPar = new String[] {""} ;
      T01HS35_A758ProCod = new String[] {""} ;
      T01HS35_A194BarOrdLin = new short[1] ;
      T01HS35_A1664ParFasCod = new short[1] ;
      T01HS36_A396EmprCod = new String[] {""} ;
      T01HS36_A129BarCod = new int[1] ;
      T01HS36_A132BarCodReo = new byte[1] ;
      T01HS36_A130BarCodPar = new String[] {""} ;
      T01HS36_A758ProCod = new String[] {""} ;
      T01HS36_A194BarOrdLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01HS37_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ5999BarFasCR = DecimalUtil.ZERO ;
      ZZ4905BarFasAcab = "" ;
      ZZ4637BarFasCara = "" ;
      ZZ4301BarFasCoP = "" ;
      ZZ4287BarFasFor = "" ;
      ZZ4021BarFasBot = "" ;
      ZZ3298BarFecRIni = GXutil.nullDate() ;
      ZZ215BarTieRea = DecimalUtil.ZERO ;
      ZZ179BarLoc = "" ;
      ZZ227BarUni = DecimalUtil.ZERO ;
      ZZ216BarTieTeo = DecimalUtil.ZERO ;
      ZZ160BarFecRea = GXutil.nullDate() ;
      ZZ162BarFecTeo = GXutil.nullDate() ;
      ZZ150BarFacTin = "" ;
      ZZ152BarFasCon = "" ;
      ZZ457FasCod = "" ;
      ZZ2327BarFasSer = "" ;
      ZZ4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      ZZ4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      T01HS38_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrbarfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrbarfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrbarfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrbarfas__default(),
         new Object[] {
             new Object[] {
            T01HS2_A194BarOrdLin, T01HS2_A3836BarFasPri, T01HS2_A6555BarFasNPl, T01HS2_A6430BarTieAut, T01HS2_A5999BarFasCR, T01HS2_A4905BarFasAcab, T01HS2_A4637BarFasCara, T01HS2_A4301BarFasCoP, T01HS2_A4288BarNPzas, T01HS2_A4287BarFasFor,
            T01HS2_A4022BarNumBot, T01HS2_A4021BarFasBot, T01HS2_A3298BarFecRIni, T01HS2_A215BarTieRea, T01HS2_A164BarHorFin, T01HS2_A165BarHorIni, T01HS2_A179BarLoc, T01HS2_A227BarUni, T01HS2_A216BarTieTeo, T01HS2_A160BarFecRea,
            T01HS2_A162BarFecTeo, T01HS2_A150BarFacTin, T01HS2_A153BarFasEst, T01HS2_A152BarFasCon, T01HS2_A2327BarFasSer, T01HS2_n2327BarFasSer, T01HS2_A4443BarFasDTF, T01HS2_n4443BarFasDTF, T01HS2_A4442BarFasDTI, T01HS2_n4442BarFasDTI,
            T01HS2_A396EmprCod, T01HS2_A129BarCod, T01HS2_A132BarCodReo, T01HS2_A130BarCodPar, T01HS2_A758ProCod, T01HS2_A457FasCod
            }
            , new Object[] {
            T01HS3_A194BarOrdLin, T01HS3_A3836BarFasPri, T01HS3_A6555BarFasNPl, T01HS3_A6430BarTieAut, T01HS3_A5999BarFasCR, T01HS3_A4905BarFasAcab, T01HS3_A4637BarFasCara, T01HS3_A4301BarFasCoP, T01HS3_A4288BarNPzas, T01HS3_A4287BarFasFor,
            T01HS3_A4022BarNumBot, T01HS3_A4021BarFasBot, T01HS3_A3298BarFecRIni, T01HS3_A215BarTieRea, T01HS3_A164BarHorFin, T01HS3_A165BarHorIni, T01HS3_A179BarLoc, T01HS3_A227BarUni, T01HS3_A216BarTieTeo, T01HS3_A160BarFecRea,
            T01HS3_A162BarFecTeo, T01HS3_A150BarFacTin, T01HS3_A153BarFasEst, T01HS3_A152BarFasCon, T01HS3_A2327BarFasSer, T01HS3_n2327BarFasSer, T01HS3_A4443BarFasDTF, T01HS3_n4443BarFasDTF, T01HS3_A4442BarFasDTI, T01HS3_n4442BarFasDTI,
            T01HS3_A396EmprCod, T01HS3_A129BarCod, T01HS3_A132BarCodReo, T01HS3_A130BarCodPar, T01HS3_A758ProCod, T01HS3_A457FasCod
            }
            , new Object[] {
            T01HS4_A396EmprCod
            }
            , new Object[] {
            T01HS5_A396EmprCod
            }
            , new Object[] {
            T01HS6_A194BarOrdLin, T01HS6_A3836BarFasPri, T01HS6_A6555BarFasNPl, T01HS6_A6430BarTieAut, T01HS6_A5999BarFasCR, T01HS6_A4905BarFasAcab, T01HS6_A4637BarFasCara, T01HS6_A4301BarFasCoP, T01HS6_A4288BarNPzas, T01HS6_A4287BarFasFor,
            T01HS6_A4022BarNumBot, T01HS6_A4021BarFasBot, T01HS6_A3298BarFecRIni, T01HS6_A215BarTieRea, T01HS6_A164BarHorFin, T01HS6_A165BarHorIni, T01HS6_A179BarLoc, T01HS6_A227BarUni, T01HS6_A216BarTieTeo, T01HS6_A160BarFecRea,
            T01HS6_A162BarFecTeo, T01HS6_A150BarFacTin, T01HS6_A153BarFasEst, T01HS6_A152BarFasCon, T01HS6_A2327BarFasSer, T01HS6_n2327BarFasSer, T01HS6_A4443BarFasDTF, T01HS6_n4443BarFasDTF, T01HS6_A4442BarFasDTI, T01HS6_n4442BarFasDTI,
            T01HS6_A396EmprCod, T01HS6_A129BarCod, T01HS6_A132BarCodReo, T01HS6_A130BarCodPar, T01HS6_A758ProCod, T01HS6_A457FasCod
            }
            , new Object[] {
            T01HS7_A396EmprCod
            }
            , new Object[] {
            T01HS8_A396EmprCod
            }
            , new Object[] {
            T01HS9_A396EmprCod, T01HS9_A129BarCod, T01HS9_A132BarCodReo, T01HS9_A130BarCodPar, T01HS9_A758ProCod, T01HS9_A194BarOrdLin
            }
            , new Object[] {
            T01HS10_A396EmprCod, T01HS10_A129BarCod, T01HS10_A132BarCodReo, T01HS10_A130BarCodPar, T01HS10_A758ProCod, T01HS10_A194BarOrdLin
            }
            , new Object[] {
            T01HS11_A396EmprCod, T01HS11_A129BarCod, T01HS11_A132BarCodReo, T01HS11_A130BarCodPar, T01HS11_A758ProCod, T01HS11_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HS15_A396EmprCod, T01HS15_A129BarCod, T01HS15_A132BarCodReo, T01HS15_A130BarCodPar, T01HS15_A758ProCod, T01HS15_A194BarOrdLin, T01HS15_A12517SolAfLn
            }
            , new Object[] {
            T01HS16_A396EmprCod, T01HS16_A129BarCod, T01HS16_A132BarCodReo, T01HS16_A130BarCodPar, T01HS16_A758ProCod, T01HS16_A194BarOrdLin, T01HS16_A12516SolLzLn
            }
            , new Object[] {
            T01HS17_A396EmprCod, T01HS17_A129BarCod, T01HS17_A132BarCodReo, T01HS17_A130BarCodPar, T01HS17_A758ProCod, T01HS17_A194BarOrdLin, T01HS17_A12515SolPlLn
            }
            , new Object[] {
            T01HS18_A396EmprCod, T01HS18_A129BarCod, T01HS18_A132BarCodReo, T01HS18_A130BarCodPar, T01HS18_A758ProCod, T01HS18_A194BarOrdLin, T01HS18_A12514SolSAlLn
            }
            , new Object[] {
            T01HS19_A396EmprCod, T01HS19_A129BarCod, T01HS19_A132BarCodReo, T01HS19_A130BarCodPar, T01HS19_A758ProCod, T01HS19_A194BarOrdLin, T01HS19_A12513SolSAcLn
            }
            , new Object[] {
            T01HS20_A396EmprCod, T01HS20_A129BarCod, T01HS20_A132BarCodReo, T01HS20_A130BarCodPar, T01HS20_A758ProCod, T01HS20_A194BarOrdLin, T01HS20_A12512SolFrLn
            }
            , new Object[] {
            T01HS21_A396EmprCod, T01HS21_A129BarCod, T01HS21_A132BarCodReo, T01HS21_A130BarCodPar, T01HS21_A758ProCod, T01HS21_A194BarOrdLin, T01HS21_A12511SolAgLn
            }
            , new Object[] {
            T01HS22_A396EmprCod, T01HS22_A129BarCod, T01HS22_A132BarCodReo, T01HS22_A130BarCodPar, T01HS22_A758ProCod, T01HS22_A194BarOrdLin, T01HS22_A12510SolLvLn
            }
            , new Object[] {
            T01HS23_A396EmprCod, T01HS23_A129BarCod, T01HS23_A132BarCodReo, T01HS23_A130BarCodPar, T01HS23_A758ProCod, T01HS23_A194BarOrdLin, T01HS23_A10781BarFasNb
            }
            , new Object[] {
            T01HS24_A396EmprCod, T01HS24_A129BarCod, T01HS24_A132BarCodReo, T01HS24_A130BarCodPar, T01HS24_A758ProCod, T01HS24_A194BarOrdLin, T01HS24_A719PrdNum
            }
            , new Object[] {
            T01HS25_A396EmprCod, T01HS25_A129BarCod, T01HS25_A132BarCodReo, T01HS25_A130BarCodPar, T01HS25_A758ProCod, T01HS25_A194BarOrdLin, T01HS25_A9966Em_cod
            }
            , new Object[] {
            T01HS26_A396EmprCod, T01HS26_A129BarCod, T01HS26_A132BarCodReo, T01HS26_A130BarCodPar, T01HS26_A758ProCod, T01HS26_A194BarOrdLin, T01HS26_A9940Ab_cod
            }
            , new Object[] {
            T01HS27_A396EmprCod, T01HS27_A129BarCod, T01HS27_A132BarCodReo, T01HS27_A130BarCodPar, T01HS27_A758ProCod, T01HS27_A194BarOrdLin, T01HS27_A9911Ca_cod
            }
            , new Object[] {
            T01HS28_A396EmprCod, T01HS28_A129BarCod, T01HS28_A132BarCodReo, T01HS28_A130BarCodPar, T01HS28_A758ProCod, T01HS28_A194BarOrdLin, T01HS28_A9878Pe_cod
            }
            , new Object[] {
            T01HS29_A396EmprCod, T01HS29_A129BarCod, T01HS29_A132BarCodReo, T01HS29_A130BarCodPar, T01HS29_A758ProCod, T01HS29_A194BarOrdLin, T01HS29_A9870Rm_cod
            }
            , new Object[] {
            T01HS30_A396EmprCod, T01HS30_A129BarCod, T01HS30_A132BarCodReo, T01HS30_A130BarCodPar, T01HS30_A758ProCod, T01HS30_A194BarOrdLin, T01HS30_A7934Dtb_Ordl
            }
            , new Object[] {
            T01HS31_A396EmprCod, T01HS31_A129BarCod, T01HS31_A132BarCodReo, T01HS31_A130BarCodPar, T01HS31_A758ProCod, T01HS31_A194BarOrdLin, T01HS31_A5371FasQuiLin
            }
            , new Object[] {
            T01HS32_A396EmprCod, T01HS32_A129BarCod, T01HS32_A132BarCodReo, T01HS32_A130BarCodPar, T01HS32_A758ProCod, T01HS32_A194BarOrdLin, T01HS32_A4940A_Barcod, T01HS32_A4941A_BarReo, T01HS32_A4942A_BarPar, T01HS32_A4943A_ProCod,
            T01HS32_A4944A_BarOrd
            }
            , new Object[] {
            T01HS33_A396EmprCod, T01HS33_A129BarCod, T01HS33_A132BarCodReo, T01HS33_A130BarCodPar, T01HS33_A758ProCod, T01HS33_A194BarOrdLin, T01HS33_A4643BarFasLot
            }
            , new Object[] {
            T01HS34_A396EmprCod, T01HS34_A129BarCod, T01HS34_A132BarCodReo, T01HS34_A130BarCodPar, T01HS34_A758ProCod, T01HS34_A194BarOrdLin, T01HS34_A4031CCTCod
            }
            , new Object[] {
            T01HS35_A396EmprCod, T01HS35_A129BarCod, T01HS35_A132BarCodReo, T01HS35_A130BarCodPar, T01HS35_A758ProCod, T01HS35_A194BarOrdLin, T01HS35_A1664ParFasCod
            }
            , new Object[] {
            T01HS36_A396EmprCod, T01HS36_A129BarCod, T01HS36_A132BarCodReo, T01HS36_A130BarCodPar, T01HS36_A758ProCod, T01HS36_A194BarOrdLin
            }
            , new Object[] {
            T01HS37_A396EmprCod
            }
            , new Object[] {
            T01HS38_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z3836BarFasPri ;
   private byte Z6555BarFasNPl ;
   private byte Z153BarFasEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private byte A153BarFasEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3836BarFasPri ;
   private byte ZZ6555BarFasNPl ;
   private byte ZZ153BarFasEst ;
   private short Z194BarOrdLin ;
   private short Z6430BarTieAut ;
   private short Z164BarHorFin ;
   private short Z165BarHorIni ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A194BarOrdLin ;
   private short A6430BarTieAut ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private short ZZ194BarOrdLin ;
   private short ZZ6430BarTieAut ;
   private short ZZ164BarHorFin ;
   private short ZZ165BarHorIni ;
   private int Z129BarCod ;
   private int Z4288BarNPzas ;
   private int Z4022BarNumBot ;
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
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarFasPri_Enabled ;
   private int edtBarFasNPl_Enabled ;
   private int edtBarTieAut_Enabled ;
   private int edtBarFasCR_Enabled ;
   private int edtBarFasAcab_Enabled ;
   private int edtBarFasCara_Enabled ;
   private int edtBarFasCoP_Enabled ;
   private int A4288BarNPzas ;
   private int edtBarNPzas_Enabled ;
   private int edtBarFasFor_Enabled ;
   private int A4022BarNumBot ;
   private int edtBarNumBot_Enabled ;
   private int edtBarFasBot_Enabled ;
   private int edtBarFecRIni_Enabled ;
   private int edtBarTieRea_Enabled ;
   private int edtBarHorFin_Enabled ;
   private int edtBarHorIni_Enabled ;
   private int edtBarLoc_Enabled ;
   private int edtBarUni_Enabled ;
   private int edtBarTieTeo_Enabled ;
   private int edtBarFecRea_Enabled ;
   private int edtBarFecTeo_Enabled ;
   private int edtBarFacTin_Enabled ;
   private int edtBarFasEst_Enabled ;
   private int edtBarFasCon_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtBarFasSer_Enabled ;
   private int edtBarFasDTF_Enabled ;
   private int edtBarFasDTI_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtBarFasDTI_Backcolor ;
   private int edtBarFasDTF_Backcolor ;
   private int edtBarFasSer_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtBarFasCon_Backcolor ;
   private int edtBarFasEst_Backcolor ;
   private int edtBarFacTin_Backcolor ;
   private int edtBarFecTeo_Backcolor ;
   private int edtBarFecRea_Backcolor ;
   private int edtBarTieTeo_Backcolor ;
   private int edtBarUni_Backcolor ;
   private int edtBarLoc_Backcolor ;
   private int edtBarHorIni_Backcolor ;
   private int edtBarHorFin_Backcolor ;
   private int edtBarTieRea_Backcolor ;
   private int edtBarFecRIni_Backcolor ;
   private int edtBarFasBot_Backcolor ;
   private int edtBarNumBot_Backcolor ;
   private int edtBarFasFor_Backcolor ;
   private int edtBarNPzas_Backcolor ;
   private int edtBarFasCoP_Backcolor ;
   private int edtBarFasCara_Backcolor ;
   private int edtBarFasAcab_Backcolor ;
   private int edtBarFasCR_Backcolor ;
   private int edtBarTieAut_Backcolor ;
   private int edtBarFasNPl_Backcolor ;
   private int edtBarFasPri_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4288BarNPzas ;
   private int ZZ4022BarNumBot ;
   private java.math.BigDecimal Z5999BarFasCR ;
   private java.math.BigDecimal Z215BarTieRea ;
   private java.math.BigDecimal Z227BarUni ;
   private java.math.BigDecimal Z216BarTieTeo ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal ZZ5999BarFasCR ;
   private java.math.BigDecimal ZZ215BarTieRea ;
   private java.math.BigDecimal ZZ227BarUni ;
   private java.math.BigDecimal ZZ216BarTieTeo ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4905BarFasAcab ;
   private String Z4637BarFasCara ;
   private String Z4301BarFasCoP ;
   private String Z4287BarFasFor ;
   private String Z4021BarFasBot ;
   private String Z179BarLoc ;
   private String Z150BarFacTin ;
   private String Z152BarFasCon ;
   private String Z2327BarFasSer ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarFasPri_Internalname ;
   private String edtBarFasPri_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarFasNPl_Internalname ;
   private String edtBarFasNPl_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarTieAut_Internalname ;
   private String edtBarTieAut_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarFasCR_Internalname ;
   private String edtBarFasCR_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarFasAcab_Internalname ;
   private String A4905BarFasAcab ;
   private String edtBarFasAcab_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarFasCara_Internalname ;
   private String A4637BarFasCara ;
   private String edtBarFasCara_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarFasCoP_Internalname ;
   private String A4301BarFasCoP ;
   private String edtBarFasCoP_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarNPzas_Internalname ;
   private String edtBarNPzas_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarFasFor_Internalname ;
   private String A4287BarFasFor ;
   private String edtBarFasFor_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarNumBot_Internalname ;
   private String edtBarNumBot_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarFasBot_Internalname ;
   private String A4021BarFasBot ;
   private String edtBarFasBot_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarFecRIni_Internalname ;
   private String edtBarFecRIni_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarTieRea_Internalname ;
   private String edtBarTieRea_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarHorFin_Internalname ;
   private String edtBarHorFin_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarHorIni_Internalname ;
   private String edtBarHorIni_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarLoc_Internalname ;
   private String A179BarLoc ;
   private String edtBarLoc_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarUni_Internalname ;
   private String edtBarUni_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarTieTeo_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarFecRea_Internalname ;
   private String edtBarFecRea_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarFecTeo_Internalname ;
   private String edtBarFecTeo_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarFacTin_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarFasEst_Internalname ;
   private String edtBarFasEst_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarFasCon_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarFasSer_Internalname ;
   private String A2327BarFasSer ;
   private String edtBarFasSer_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarFasDTF_Internalname ;
   private String edtBarFasDTF_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTI_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode15 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ4905BarFasAcab ;
   private String ZZ4637BarFasCara ;
   private String ZZ4301BarFasCoP ;
   private String ZZ4287BarFasFor ;
   private String ZZ4021BarFasBot ;
   private String ZZ179BarLoc ;
   private String ZZ150BarFacTin ;
   private String ZZ152BarFasCon ;
   private String ZZ457FasCod ;
   private String ZZ2327BarFasSer ;
   private java.util.Date Z4443BarFasDTF ;
   private java.util.Date Z4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date ZZ4443BarFasDTF ;
   private java.util.Date ZZ4442BarFasDTI ;
   private java.util.Date Z3298BarFecRIni ;
   private java.util.Date Z160BarFecRea ;
   private java.util.Date Z162BarFecTeo ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date ZZ3298BarFecRIni ;
   private java.util.Date ZZ160BarFecRea ;
   private java.util.Date ZZ162BarFecTeo ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n2327BarFasSer ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01HS6_A194BarOrdLin ;
   private byte[] T01HS6_A3836BarFasPri ;
   private byte[] T01HS6_A6555BarFasNPl ;
   private short[] T01HS6_A6430BarTieAut ;
   private java.math.BigDecimal[] T01HS6_A5999BarFasCR ;
   private String[] T01HS6_A4905BarFasAcab ;
   private String[] T01HS6_A4637BarFasCara ;
   private String[] T01HS6_A4301BarFasCoP ;
   private int[] T01HS6_A4288BarNPzas ;
   private String[] T01HS6_A4287BarFasFor ;
   private int[] T01HS6_A4022BarNumBot ;
   private String[] T01HS6_A4021BarFasBot ;
   private java.util.Date[] T01HS6_A3298BarFecRIni ;
   private java.math.BigDecimal[] T01HS6_A215BarTieRea ;
   private short[] T01HS6_A164BarHorFin ;
   private short[] T01HS6_A165BarHorIni ;
   private String[] T01HS6_A179BarLoc ;
   private java.math.BigDecimal[] T01HS6_A227BarUni ;
   private java.math.BigDecimal[] T01HS6_A216BarTieTeo ;
   private java.util.Date[] T01HS6_A160BarFecRea ;
   private java.util.Date[] T01HS6_A162BarFecTeo ;
   private String[] T01HS6_A150BarFacTin ;
   private byte[] T01HS6_A153BarFasEst ;
   private String[] T01HS6_A152BarFasCon ;
   private String[] T01HS6_A2327BarFasSer ;
   private boolean[] T01HS6_n2327BarFasSer ;
   private java.util.Date[] T01HS6_A4443BarFasDTF ;
   private boolean[] T01HS6_n4443BarFasDTF ;
   private java.util.Date[] T01HS6_A4442BarFasDTI ;
   private boolean[] T01HS6_n4442BarFasDTI ;
   private String[] T01HS6_A396EmprCod ;
   private int[] T01HS6_A129BarCod ;
   private byte[] T01HS6_A132BarCodReo ;
   private String[] T01HS6_A130BarCodPar ;
   private String[] T01HS6_A758ProCod ;
   private String[] T01HS6_A457FasCod ;
   private String[] T01HS5_A396EmprCod ;
   private String[] T01HS4_A396EmprCod ;
   private String[] T01HS7_A396EmprCod ;
   private String[] T01HS8_A396EmprCod ;
   private String[] T01HS9_A396EmprCod ;
   private int[] T01HS9_A129BarCod ;
   private byte[] T01HS9_A132BarCodReo ;
   private String[] T01HS9_A130BarCodPar ;
   private String[] T01HS9_A758ProCod ;
   private short[] T01HS9_A194BarOrdLin ;
   private short[] T01HS3_A194BarOrdLin ;
   private byte[] T01HS3_A3836BarFasPri ;
   private byte[] T01HS3_A6555BarFasNPl ;
   private short[] T01HS3_A6430BarTieAut ;
   private java.math.BigDecimal[] T01HS3_A5999BarFasCR ;
   private String[] T01HS3_A4905BarFasAcab ;
   private String[] T01HS3_A4637BarFasCara ;
   private String[] T01HS3_A4301BarFasCoP ;
   private int[] T01HS3_A4288BarNPzas ;
   private String[] T01HS3_A4287BarFasFor ;
   private int[] T01HS3_A4022BarNumBot ;
   private String[] T01HS3_A4021BarFasBot ;
   private java.util.Date[] T01HS3_A3298BarFecRIni ;
   private java.math.BigDecimal[] T01HS3_A215BarTieRea ;
   private short[] T01HS3_A164BarHorFin ;
   private short[] T01HS3_A165BarHorIni ;
   private String[] T01HS3_A179BarLoc ;
   private java.math.BigDecimal[] T01HS3_A227BarUni ;
   private java.math.BigDecimal[] T01HS3_A216BarTieTeo ;
   private java.util.Date[] T01HS3_A160BarFecRea ;
   private java.util.Date[] T01HS3_A162BarFecTeo ;
   private String[] T01HS3_A150BarFacTin ;
   private byte[] T01HS3_A153BarFasEst ;
   private String[] T01HS3_A152BarFasCon ;
   private String[] T01HS3_A2327BarFasSer ;
   private boolean[] T01HS3_n2327BarFasSer ;
   private java.util.Date[] T01HS3_A4443BarFasDTF ;
   private boolean[] T01HS3_n4443BarFasDTF ;
   private java.util.Date[] T01HS3_A4442BarFasDTI ;
   private boolean[] T01HS3_n4442BarFasDTI ;
   private String[] T01HS3_A396EmprCod ;
   private int[] T01HS3_A129BarCod ;
   private byte[] T01HS3_A132BarCodReo ;
   private String[] T01HS3_A130BarCodPar ;
   private String[] T01HS3_A758ProCod ;
   private String[] T01HS3_A457FasCod ;
   private String[] T01HS10_A396EmprCod ;
   private int[] T01HS10_A129BarCod ;
   private byte[] T01HS10_A132BarCodReo ;
   private String[] T01HS10_A130BarCodPar ;
   private String[] T01HS10_A758ProCod ;
   private short[] T01HS10_A194BarOrdLin ;
   private String[] T01HS11_A396EmprCod ;
   private int[] T01HS11_A129BarCod ;
   private byte[] T01HS11_A132BarCodReo ;
   private String[] T01HS11_A130BarCodPar ;
   private String[] T01HS11_A758ProCod ;
   private short[] T01HS11_A194BarOrdLin ;
   private short[] T01HS2_A194BarOrdLin ;
   private byte[] T01HS2_A3836BarFasPri ;
   private byte[] T01HS2_A6555BarFasNPl ;
   private short[] T01HS2_A6430BarTieAut ;
   private java.math.BigDecimal[] T01HS2_A5999BarFasCR ;
   private String[] T01HS2_A4905BarFasAcab ;
   private String[] T01HS2_A4637BarFasCara ;
   private String[] T01HS2_A4301BarFasCoP ;
   private int[] T01HS2_A4288BarNPzas ;
   private String[] T01HS2_A4287BarFasFor ;
   private int[] T01HS2_A4022BarNumBot ;
   private String[] T01HS2_A4021BarFasBot ;
   private java.util.Date[] T01HS2_A3298BarFecRIni ;
   private java.math.BigDecimal[] T01HS2_A215BarTieRea ;
   private short[] T01HS2_A164BarHorFin ;
   private short[] T01HS2_A165BarHorIni ;
   private String[] T01HS2_A179BarLoc ;
   private java.math.BigDecimal[] T01HS2_A227BarUni ;
   private java.math.BigDecimal[] T01HS2_A216BarTieTeo ;
   private java.util.Date[] T01HS2_A160BarFecRea ;
   private java.util.Date[] T01HS2_A162BarFecTeo ;
   private String[] T01HS2_A150BarFacTin ;
   private byte[] T01HS2_A153BarFasEst ;
   private String[] T01HS2_A152BarFasCon ;
   private String[] T01HS2_A2327BarFasSer ;
   private boolean[] T01HS2_n2327BarFasSer ;
   private java.util.Date[] T01HS2_A4443BarFasDTF ;
   private boolean[] T01HS2_n4443BarFasDTF ;
   private java.util.Date[] T01HS2_A4442BarFasDTI ;
   private boolean[] T01HS2_n4442BarFasDTI ;
   private String[] T01HS2_A396EmprCod ;
   private int[] T01HS2_A129BarCod ;
   private byte[] T01HS2_A132BarCodReo ;
   private String[] T01HS2_A130BarCodPar ;
   private String[] T01HS2_A758ProCod ;
   private String[] T01HS2_A457FasCod ;
   private String[] T01HS15_A396EmprCod ;
   private int[] T01HS15_A129BarCod ;
   private byte[] T01HS15_A132BarCodReo ;
   private String[] T01HS15_A130BarCodPar ;
   private String[] T01HS15_A758ProCod ;
   private short[] T01HS15_A194BarOrdLin ;
   private short[] T01HS15_A12517SolAfLn ;
   private String[] T01HS16_A396EmprCod ;
   private int[] T01HS16_A129BarCod ;
   private byte[] T01HS16_A132BarCodReo ;
   private String[] T01HS16_A130BarCodPar ;
   private String[] T01HS16_A758ProCod ;
   private short[] T01HS16_A194BarOrdLin ;
   private short[] T01HS16_A12516SolLzLn ;
   private String[] T01HS17_A396EmprCod ;
   private int[] T01HS17_A129BarCod ;
   private byte[] T01HS17_A132BarCodReo ;
   private String[] T01HS17_A130BarCodPar ;
   private String[] T01HS17_A758ProCod ;
   private short[] T01HS17_A194BarOrdLin ;
   private short[] T01HS17_A12515SolPlLn ;
   private String[] T01HS18_A396EmprCod ;
   private int[] T01HS18_A129BarCod ;
   private byte[] T01HS18_A132BarCodReo ;
   private String[] T01HS18_A130BarCodPar ;
   private String[] T01HS18_A758ProCod ;
   private short[] T01HS18_A194BarOrdLin ;
   private short[] T01HS18_A12514SolSAlLn ;
   private String[] T01HS19_A396EmprCod ;
   private int[] T01HS19_A129BarCod ;
   private byte[] T01HS19_A132BarCodReo ;
   private String[] T01HS19_A130BarCodPar ;
   private String[] T01HS19_A758ProCod ;
   private short[] T01HS19_A194BarOrdLin ;
   private short[] T01HS19_A12513SolSAcLn ;
   private String[] T01HS20_A396EmprCod ;
   private int[] T01HS20_A129BarCod ;
   private byte[] T01HS20_A132BarCodReo ;
   private String[] T01HS20_A130BarCodPar ;
   private String[] T01HS20_A758ProCod ;
   private short[] T01HS20_A194BarOrdLin ;
   private short[] T01HS20_A12512SolFrLn ;
   private String[] T01HS21_A396EmprCod ;
   private int[] T01HS21_A129BarCod ;
   private byte[] T01HS21_A132BarCodReo ;
   private String[] T01HS21_A130BarCodPar ;
   private String[] T01HS21_A758ProCod ;
   private short[] T01HS21_A194BarOrdLin ;
   private short[] T01HS21_A12511SolAgLn ;
   private String[] T01HS22_A396EmprCod ;
   private int[] T01HS22_A129BarCod ;
   private byte[] T01HS22_A132BarCodReo ;
   private String[] T01HS22_A130BarCodPar ;
   private String[] T01HS22_A758ProCod ;
   private short[] T01HS22_A194BarOrdLin ;
   private short[] T01HS22_A12510SolLvLn ;
   private String[] T01HS23_A396EmprCod ;
   private int[] T01HS23_A129BarCod ;
   private byte[] T01HS23_A132BarCodReo ;
   private String[] T01HS23_A130BarCodPar ;
   private String[] T01HS23_A758ProCod ;
   private short[] T01HS23_A194BarOrdLin ;
   private int[] T01HS23_A10781BarFasNb ;
   private String[] T01HS24_A396EmprCod ;
   private int[] T01HS24_A129BarCod ;
   private byte[] T01HS24_A132BarCodReo ;
   private String[] T01HS24_A130BarCodPar ;
   private String[] T01HS24_A758ProCod ;
   private short[] T01HS24_A194BarOrdLin ;
   private String[] T01HS24_A719PrdNum ;
   private String[] T01HS25_A396EmprCod ;
   private int[] T01HS25_A129BarCod ;
   private byte[] T01HS25_A132BarCodReo ;
   private String[] T01HS25_A130BarCodPar ;
   private String[] T01HS25_A758ProCod ;
   private short[] T01HS25_A194BarOrdLin ;
   private String[] T01HS25_A9966Em_cod ;
   private String[] T01HS26_A396EmprCod ;
   private int[] T01HS26_A129BarCod ;
   private byte[] T01HS26_A132BarCodReo ;
   private String[] T01HS26_A130BarCodPar ;
   private String[] T01HS26_A758ProCod ;
   private short[] T01HS26_A194BarOrdLin ;
   private String[] T01HS26_A9940Ab_cod ;
   private String[] T01HS27_A396EmprCod ;
   private int[] T01HS27_A129BarCod ;
   private byte[] T01HS27_A132BarCodReo ;
   private String[] T01HS27_A130BarCodPar ;
   private String[] T01HS27_A758ProCod ;
   private short[] T01HS27_A194BarOrdLin ;
   private String[] T01HS27_A9911Ca_cod ;
   private String[] T01HS28_A396EmprCod ;
   private int[] T01HS28_A129BarCod ;
   private byte[] T01HS28_A132BarCodReo ;
   private String[] T01HS28_A130BarCodPar ;
   private String[] T01HS28_A758ProCod ;
   private short[] T01HS28_A194BarOrdLin ;
   private String[] T01HS28_A9878Pe_cod ;
   private String[] T01HS29_A396EmprCod ;
   private int[] T01HS29_A129BarCod ;
   private byte[] T01HS29_A132BarCodReo ;
   private String[] T01HS29_A130BarCodPar ;
   private String[] T01HS29_A758ProCod ;
   private short[] T01HS29_A194BarOrdLin ;
   private String[] T01HS29_A9870Rm_cod ;
   private String[] T01HS30_A396EmprCod ;
   private int[] T01HS30_A129BarCod ;
   private byte[] T01HS30_A132BarCodReo ;
   private String[] T01HS30_A130BarCodPar ;
   private String[] T01HS30_A758ProCod ;
   private short[] T01HS30_A194BarOrdLin ;
   private short[] T01HS30_A7934Dtb_Ordl ;
   private String[] T01HS31_A396EmprCod ;
   private int[] T01HS31_A129BarCod ;
   private byte[] T01HS31_A132BarCodReo ;
   private String[] T01HS31_A130BarCodPar ;
   private String[] T01HS31_A758ProCod ;
   private short[] T01HS31_A194BarOrdLin ;
   private short[] T01HS31_A5371FasQuiLin ;
   private String[] T01HS32_A396EmprCod ;
   private int[] T01HS32_A129BarCod ;
   private byte[] T01HS32_A132BarCodReo ;
   private String[] T01HS32_A130BarCodPar ;
   private String[] T01HS32_A758ProCod ;
   private short[] T01HS32_A194BarOrdLin ;
   private int[] T01HS32_A4940A_Barcod ;
   private byte[] T01HS32_A4941A_BarReo ;
   private String[] T01HS32_A4942A_BarPar ;
   private String[] T01HS32_A4943A_ProCod ;
   private short[] T01HS32_A4944A_BarOrd ;
   private String[] T01HS33_A396EmprCod ;
   private int[] T01HS33_A129BarCod ;
   private byte[] T01HS33_A132BarCodReo ;
   private String[] T01HS33_A130BarCodPar ;
   private String[] T01HS33_A758ProCod ;
   private short[] T01HS33_A194BarOrdLin ;
   private int[] T01HS33_A4643BarFasLot ;
   private String[] T01HS34_A396EmprCod ;
   private int[] T01HS34_A129BarCod ;
   private byte[] T01HS34_A132BarCodReo ;
   private String[] T01HS34_A130BarCodPar ;
   private String[] T01HS34_A758ProCod ;
   private short[] T01HS34_A194BarOrdLin ;
   private int[] T01HS34_A4031CCTCod ;
   private String[] T01HS35_A396EmprCod ;
   private int[] T01HS35_A129BarCod ;
   private byte[] T01HS35_A132BarCodReo ;
   private String[] T01HS35_A130BarCodPar ;
   private String[] T01HS35_A758ProCod ;
   private short[] T01HS35_A194BarOrdLin ;
   private short[] T01HS35_A1664ParFasCod ;
   private String[] T01HS36_A396EmprCod ;
   private int[] T01HS36_A129BarCod ;
   private byte[] T01HS36_A132BarCodReo ;
   private String[] T01HS36_A130BarCodPar ;
   private String[] T01HS36_A758ProCod ;
   private short[] T01HS36_A194BarOrdLin ;
   private String[] T01HS37_A396EmprCod ;
   private String[] T01HS38_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrbarfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HS2", "SELECT BarOrdLin, BarFasPri, BarFasNPl, BarTieAut, BarFasCR, BarFasAcab, BarFasCara, BarFasCoP, BarNPzas, BarFasFor, BarNumBot, BarFasBot, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarLoc, BarUni, BarTieTeo, BarFecRea, BarFecTeo, BarFacTin, BarFasEst, BarFasCon, BarFasSer, BarFasDTF, BarFasDTI, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarFasPri, BarFasNPl, BarTieAut, BarFasCR, BarFasAcab, BarFasCara, BarFasCoP, BarNPzas, BarFasFor, BarNumBot, BarFasBot, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarLoc, BarUni, BarTieTeo, BarFecRea, BarFecTeo, BarFacTin, BarFasEst, BarFasCon, BarFasSer, BarFasDTF, BarFasDTI, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS3", "SELECT BarOrdLin, BarFasPri, BarFasNPl, BarTieAut, BarFasCR, BarFasAcab, BarFasCara, BarFasCoP, BarNPzas, BarFasFor, BarNumBot, BarFasBot, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarLoc, BarUni, BarTieTeo, BarFecRea, BarFecTeo, BarFacTin, BarFasEst, BarFasCon, BarFasSer, BarFasDTF, BarFasDTI, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS4", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS5", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS6", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarOrdLin, TM1.BarFasPri, TM1.BarFasNPl, TM1.BarTieAut, TM1.BarFasCR, TM1.BarFasAcab, TM1.BarFasCara, TM1.BarFasCoP, TM1.BarNPzas, TM1.BarFasFor, TM1.BarNumBot, TM1.BarFasBot, TM1.BarFecRIni, TM1.BarTieRea, TM1.BarHorFin, TM1.BarHorIni, TM1.BarLoc, TM1.BarUni, TM1.BarTieTeo, TM1.BarFecRea, TM1.BarFecTeo, TM1.BarFacTin, TM1.BarFasEst, TM1.BarFasCon, TM1.BarFasSer, TM1.BarFasDTF, TM1.BarFasDTI, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod FROM TXPBARFAS TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS7", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS8", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HS12", "INSERT INTO TXPBARFAS(BarOrdLin, BarFasPri, BarFasNPl, BarTieAut, BarFasCR, BarFasAcab, BarFasCara, BarFasCoP, BarNPzas, BarFasFor, BarNumBot, BarFasBot, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarLoc, BarUni, BarTieTeo, BarFecRea, BarFecTeo, BarFacTin, BarFasEst, BarFasCon, BarFasSer, BarFasDTF, BarFasDTI, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis, BarFasKgm, BarFasMtr, BarFasPzas, BarUltNlot, BarFasInc, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T01HS13", "UPDATE TXPBARFAS SET BarFasPri=?, BarFasNPl=?, BarTieAut=?, BarFasCR=?, BarFasAcab=?, BarFasCara=?, BarFasCoP=?, BarNPzas=?, BarFasFor=?, BarNumBot=?, BarFasBot=?, BarFecRIni=?, BarTieRea=?, BarHorFin=?, BarHorIni=?, BarLoc=?, BarUni=?, BarTieTeo=?, BarFecRea=?, BarFecTeo=?, BarFacTin=?, BarFasEst=?, BarFasCon=?, BarFasSer=?, BarFasDTF=?, BarFasDTI=?, FasCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T01HS14", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T01HS15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS17", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HS36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS37", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HS38", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(28, 3);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 1);
               ((String[]) buf[34])[0] = rslt.getString(32, 8);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(28, 3);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 1);
               ((String[]) buf[34])[0] = rslt.getString(32, 8);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(28, 3);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 1);
               ((String[]) buf[34])[0] = rslt.getString(32, 8);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 36 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 10);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setDate(20, (java.util.Date)parms[19]);
               stmt.setDate(21, (java.util.Date)parms[20]);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[29], false);
               }
               stmt.setString(28, (String)parms[30], 3);
               stmt.setInt(29, ((Number) parms[31]).intValue());
               stmt.setByte(30, ((Number) parms[32]).byteValue());
               stmt.setString(31, (String)parms[33], 1);
               stmt.setString(32, (String)parms[34], 8);
               stmt.setString(33, (String)parms[35], 8);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 10);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setDate(19, (java.util.Date)parms[18]);
               stmt.setDate(20, (java.util.Date)parms[19]);
               stmt.setString(21, (String)parms[20], 1);
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 1);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[28], false);
               }
               stmt.setString(27, (String)parms[29], 8);
               stmt.setString(28, (String)parms[30], 3);
               stmt.setInt(29, ((Number) parms[31]).intValue());
               stmt.setByte(30, ((Number) parms[32]).byteValue());
               stmt.setString(31, (String)parms[33], 1);
               stmt.setString(32, (String)parms[34], 8);
               stmt.setShort(33, ((Number) parms[35]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

