package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlanyad_impl extends GXDataArea
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
         gxload_2( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LINEAS AÑADIDAS (BALANZAS)", ""), (short)(0)) ;
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

   public tlanyad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlanyad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlanyad_impl.class ));
   }

   public tlanyad_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbLanyUnd = new HTMLChoice();
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
      if ( cmbLanyUnd.getItemCount() > 0 )
      {
         A12706LanyUnd = cmbLanyUnd.getValidValue(A12706LanyUnd) ;
         n12706LanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLanyUnd.setValue( GXutil.rtrim( A12706LanyUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLanyUnd.getInternalname(), "Values", cmbLanyUnd.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLANYAD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "RecLinMAL", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMAL_Internalname, GXutil.ltrim( localUtil.ntoc( A2808RecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinMAL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2808RecLinMAL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2808RecLinMAL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMAL_Jsonclick, 0, "", "", "", "", "", 1, edtRecLinMAL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero de Añadida", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumAny_Internalname, GXutil.ltrim( localUtil.ntoc( A1377RecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNumAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1377RecNumAny), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1377RecNumAny), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumAny_Jsonclick, 0, "", "", "", "", "", 1, edtRecNumAny_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cantidad Añadidas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCFin_Internalname, GXutil.ltrim( localUtil.ntoc( A1378PrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCFin_Enabled!=0) ? localUtil.format( A1378PrdCFin, "ZZZZZZ9.999") : localUtil.format( A1378PrdCFin, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCFin_Jsonclick, 0, "", "", "", "", "", 1, edtPrdCFin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyPrd_Internalname, GXutil.rtrim( A3380LanyPrd), GXutil.rtrim( localUtil.format( A3380LanyPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyPrd_Jsonclick, 0, "", "", "", "", "", 1, edtLanyPrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyCan_Internalname, GXutil.ltrim( localUtil.ntoc( A3381LanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLanyCan_Enabled!=0) ? localUtil.format( A3381LanyCan, "ZZZZZZ9.999") : localUtil.format( A3381LanyCan, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyCan_Jsonclick, 0, "", "", "", "", "", 1, edtLanyCan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nro orden", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyNro_Internalname, GXutil.ltrim( localUtil.ntoc( A3382LanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLanyNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3382LanyNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3382LanyNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyNro_Jsonclick, 0, "", "", "", "", "", 1, edtLanyNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tanque", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3383LanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLanyTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3383LanyTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3383LanyTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyTnq_Jsonclick, 0, "", "", "", "", "", 1, edtLanyTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Usuario Pesaje", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyUsr_Internalname, GXutil.rtrim( A4578LanyUsr), GXutil.rtrim( localUtil.format( A4578LanyUsr, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyUsr_Jsonclick, 0, "", "", "", "", "", 1, edtLanyUsr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Fecha Hora Pesaje", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLanyFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyFec_Internalname, localUtil.ttoc( A4579LanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4579LanyFec, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyFec_Jsonclick, 0, "", "", "", "", "", 1, edtLanyFec_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLanyFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLanyFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLANYAD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyLote_Internalname, GXutil.rtrim( A5807LanyLote), GXutil.rtrim( localUtil.format( A5807LanyLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyLote_Jsonclick, 0, "", "", "", "", "", 1, edtLanyLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cant Digitada", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLanyCtd_Internalname, GXutil.ltrim( localUtil.ntoc( A12705LanyCtd, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLanyCtd_Enabled!=0) ? localUtil.format( A12705LanyCtd, "ZZZZZZ9.999") : localUtil.format( A12705LanyCtd, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLanyCtd_Jsonclick, 0, "", "", "", "", "", 1, edtLanyCtd_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLANYAD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLanyUnd, cmbLanyUnd.getInternalname(), GXutil.rtrim( A12706LanyUnd), 1, cmbLanyUnd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLanyUnd.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "", true, (byte)(0), "HLP_TLANYAD.htm");
      cmbLanyUnd.setValue( GXutil.rtrim( A12706LanyUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLanyUnd.getInternalname(), "Values", cmbLanyUnd.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLANYAD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLANYAD.htm");
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
         Z2808RecLinMAL = (short)(localUtil.ctol( httpContext.cgiGet( "Z2808RecLinMAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1377RecNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1377RecNumAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z1378PrdCFin = localUtil.ctond( httpContext.cgiGet( "Z1378PrdCFin")) ;
         Z3380LanyPrd = httpContext.cgiGet( "Z3380LanyPrd") ;
         Z3381LanyCan = localUtil.ctond( httpContext.cgiGet( "Z3381LanyCan")) ;
         Z3382LanyNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3382LanyNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3383LanyTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3383LanyTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4578LanyUsr = httpContext.cgiGet( "Z4578LanyUsr") ;
         Z4579LanyFec = localUtil.ctot( httpContext.cgiGet( "Z4579LanyFec"), 0) ;
         Z5807LanyLote = httpContext.cgiGet( "Z5807LanyLote") ;
         Z12705LanyCtd = localUtil.ctond( httpContext.cgiGet( "Z12705LanyCtd")) ;
         Z12706LanyUnd = httpContext.cgiGet( "Z12706LanyUnd") ;
         Z13939LanyLoteFc = localUtil.ctod( httpContext.cgiGet( "Z13939LanyLoteFc"), 0) ;
         A13939LanyLoteFc = localUtil.ctod( httpContext.cgiGet( "Z13939LanyLoteFc"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A13939LanyLoteFc = localUtil.ctod( httpContext.cgiGet( "LANYLOTEFC"), 0) ;
         A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINMAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLinMAL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2808RecLinMAL = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         }
         else
         {
            A2808RecLinMAL = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNUMANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecNumAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1377RecNumAny = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         }
         else
         {
            A1377RecNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         }
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCFin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1378PrdCFin = DecimalUtil.ZERO ;
            n1378PrdCFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrimstr( A1378PrdCFin, 11, 3));
         }
         else
         {
            A1378PrdCFin = localUtil.ctond( httpContext.cgiGet( edtPrdCFin_Internalname)) ;
            n1378PrdCFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrimstr( A1378PrdCFin, 11, 3));
         }
         A3380LanyPrd = httpContext.cgiGet( edtLanyPrd_Internalname) ;
         n3380LanyPrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3380LanyPrd", A3380LanyPrd);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLanyCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLanyCan_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LANYCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLanyCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3381LanyCan = DecimalUtil.ZERO ;
            n3381LanyCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrimstr( A3381LanyCan, 11, 3));
         }
         else
         {
            A3381LanyCan = localUtil.ctond( httpContext.cgiGet( edtLanyCan_Internalname)) ;
            n3381LanyCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrimstr( A3381LanyCan, 11, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LANYNRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLanyNro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3382LanyNro = (byte)(0) ;
            n3382LanyNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3382LanyNro), 2, 0));
         }
         else
         {
            A3382LanyNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3382LanyNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3382LanyNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LANYTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLanyTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3383LanyTnq = (byte)(0) ;
            n3383LanyTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3383LanyTnq), 2, 0));
         }
         else
         {
            A3383LanyTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3383LanyTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3383LanyTnq), 2, 0));
         }
         A4578LanyUsr = GXutil.upper( httpContext.cgiGet( edtLanyUsr_Internalname)) ;
         n4578LanyUsr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4578LanyUsr", A4578LanyUsr);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtLanyFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "LANYFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLanyFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
            n4579LanyFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4579LanyFec = localUtil.ctot( httpContext.cgiGet( edtLanyFec_Internalname)) ;
            n4579LanyFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5807LanyLote = httpContext.cgiGet( edtLanyLote_Internalname) ;
         n5807LanyLote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5807LanyLote", A5807LanyLote);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLanyCtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLanyCtd_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LANYCTD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLanyCtd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12705LanyCtd = DecimalUtil.ZERO ;
            n12705LanyCtd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrimstr( A12705LanyCtd, 11, 3));
         }
         else
         {
            A12705LanyCtd = localUtil.ctond( httpContext.cgiGet( edtLanyCtd_Internalname)) ;
            n12705LanyCtd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrimstr( A12705LanyCtd, 11, 3));
         }
         cmbLanyUnd.setValue( httpContext.cgiGet( cmbLanyUnd.getInternalname()) );
         A12706LanyUnd = httpContext.cgiGet( cmbLanyUnd.getInternalname()) ;
         n12706LanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TLANYAD");
         forbiddenHiddens.add("LanyLoteFc", localUtil.format(A13939LanyLoteFc, "99/99/99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tlanyad:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2808RecLinMAL = (short)(GXutil.lval( httpContext.GetPar( "RecLinMAL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
            A1377RecNumAny = (byte)(GXutil.lval( httpContext.GetPar( "RecNumAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            initAll4R411( ) ;
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
      disableAttributes4R411( ) ;
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

   public void confirm_4R0( )
   {
      beforeValidate4R411( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls4R411( ) ;
         }
         else
         {
            checkExtendedTable4R411( ) ;
            if ( AnyError == 0 )
            {
               zm4R411( 2) ;
               zm4R411( 3) ;
            }
            closeExtendedTableCursors4R411( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues4R0( ) ;
      }
   }

   public void resetCaption4R0( )
   {
   }

   public void zm4R411( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1378PrdCFin = T004R3_A1378PrdCFin[0] ;
            Z3380LanyPrd = T004R3_A3380LanyPrd[0] ;
            Z3381LanyCan = T004R3_A3381LanyCan[0] ;
            Z3382LanyNro = T004R3_A3382LanyNro[0] ;
            Z3383LanyTnq = T004R3_A3383LanyTnq[0] ;
            Z4578LanyUsr = T004R3_A4578LanyUsr[0] ;
            Z4579LanyFec = T004R3_A4579LanyFec[0] ;
            Z5807LanyLote = T004R3_A5807LanyLote[0] ;
            Z12705LanyCtd = T004R3_A12705LanyCtd[0] ;
            Z12706LanyUnd = T004R3_A12706LanyUnd[0] ;
            Z13939LanyLoteFc = T004R3_A13939LanyLoteFc[0] ;
         }
         else
         {
            Z1378PrdCFin = A1378PrdCFin ;
            Z3380LanyPrd = A3380LanyPrd ;
            Z3381LanyCan = A3381LanyCan ;
            Z3382LanyNro = A3382LanyNro ;
            Z3383LanyTnq = A3383LanyTnq ;
            Z4578LanyUsr = A4578LanyUsr ;
            Z4579LanyFec = A4579LanyFec ;
            Z5807LanyLote = A5807LanyLote ;
            Z12705LanyCtd = A12705LanyCtd ;
            Z12706LanyUnd = A12706LanyUnd ;
            Z13939LanyLoteFc = A13939LanyLoteFc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2808RecLinMAL = A2808RecLinMAL ;
         Z1377RecNumAny = A1377RecNumAny ;
         Z1378PrdCFin = A1378PrdCFin ;
         Z3380LanyPrd = A3380LanyPrd ;
         Z3381LanyCan = A3381LanyCan ;
         Z3382LanyNro = A3382LanyNro ;
         Z3383LanyTnq = A3383LanyTnq ;
         Z4578LanyUsr = A4578LanyUsr ;
         Z4579LanyFec = A4579LanyFec ;
         Z5807LanyLote = A5807LanyLote ;
         Z12705LanyCtd = A12705LanyCtd ;
         Z12706LanyUnd = A12706LanyUnd ;
         Z13939LanyLoteFc = A13939LanyLoteFc ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
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

   public void load4R411( )
   {
      /* Using cursor T004R6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound411 = (short)(1) ;
         A718PrdNom = T004R6_A718PrdNom[0] ;
         A1378PrdCFin = T004R6_A1378PrdCFin[0] ;
         n1378PrdCFin = T004R6_n1378PrdCFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrimstr( A1378PrdCFin, 11, 3));
         A3380LanyPrd = T004R6_A3380LanyPrd[0] ;
         n3380LanyPrd = T004R6_n3380LanyPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3380LanyPrd", A3380LanyPrd);
         A3381LanyCan = T004R6_A3381LanyCan[0] ;
         n3381LanyCan = T004R6_n3381LanyCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrimstr( A3381LanyCan, 11, 3));
         A3382LanyNro = T004R6_A3382LanyNro[0] ;
         n3382LanyNro = T004R6_n3382LanyNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3382LanyNro), 2, 0));
         A3383LanyTnq = T004R6_A3383LanyTnq[0] ;
         n3383LanyTnq = T004R6_n3383LanyTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3383LanyTnq), 2, 0));
         A4578LanyUsr = T004R6_A4578LanyUsr[0] ;
         n4578LanyUsr = T004R6_n4578LanyUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4578LanyUsr", A4578LanyUsr);
         A4579LanyFec = T004R6_A4579LanyFec[0] ;
         n4579LanyFec = T004R6_n4579LanyFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5807LanyLote = T004R6_A5807LanyLote[0] ;
         n5807LanyLote = T004R6_n5807LanyLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5807LanyLote", A5807LanyLote);
         A12705LanyCtd = T004R6_A12705LanyCtd[0] ;
         n12705LanyCtd = T004R6_n12705LanyCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrimstr( A12705LanyCtd, 11, 3));
         A12706LanyUnd = T004R6_A12706LanyUnd[0] ;
         n12706LanyUnd = T004R6_n12706LanyUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
         A13939LanyLoteFc = T004R6_A13939LanyLoteFc[0] ;
         zm4R411( -1) ;
      }
      pr_default.close(4);
      onLoadActions4R411( ) ;
   }

   public void onLoadActions4R411( )
   {
   }

   public void checkExtendedTable4R411( )
   {
      nIsDirty_411 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T004R4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T004R5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T004R5_A718PrdNom[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors4R411( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T004R7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void gxload_3( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T004R8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T004R8_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey4R411( )
   {
      /* Using cursor T004R9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound411 = (short)(1) ;
      }
      else
      {
         RcdFound411 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T004R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm4R411( 1) ;
         RcdFound411 = (short)(1) ;
         A2808RecLinMAL = T004R3_A2808RecLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         A1377RecNumAny = T004R3_A1377RecNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         A1378PrdCFin = T004R3_A1378PrdCFin[0] ;
         n1378PrdCFin = T004R3_n1378PrdCFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrimstr( A1378PrdCFin, 11, 3));
         A3380LanyPrd = T004R3_A3380LanyPrd[0] ;
         n3380LanyPrd = T004R3_n3380LanyPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3380LanyPrd", A3380LanyPrd);
         A3381LanyCan = T004R3_A3381LanyCan[0] ;
         n3381LanyCan = T004R3_n3381LanyCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrimstr( A3381LanyCan, 11, 3));
         A3382LanyNro = T004R3_A3382LanyNro[0] ;
         n3382LanyNro = T004R3_n3382LanyNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3382LanyNro), 2, 0));
         A3383LanyTnq = T004R3_A3383LanyTnq[0] ;
         n3383LanyTnq = T004R3_n3383LanyTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3383LanyTnq), 2, 0));
         A4578LanyUsr = T004R3_A4578LanyUsr[0] ;
         n4578LanyUsr = T004R3_n4578LanyUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4578LanyUsr", A4578LanyUsr);
         A4579LanyFec = T004R3_A4579LanyFec[0] ;
         n4579LanyFec = T004R3_n4579LanyFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5807LanyLote = T004R3_A5807LanyLote[0] ;
         n5807LanyLote = T004R3_n5807LanyLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5807LanyLote", A5807LanyLote);
         A12705LanyCtd = T004R3_A12705LanyCtd[0] ;
         n12705LanyCtd = T004R3_n12705LanyCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrimstr( A12705LanyCtd, 11, 3));
         A12706LanyUnd = T004R3_A12706LanyUnd[0] ;
         n12706LanyUnd = T004R3_n12706LanyUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
         A13939LanyLoteFc = T004R3_A13939LanyLoteFc[0] ;
         A396EmprCod = T004R3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T004R3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T004R3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T004R3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A719PrdNum = T004R3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2808RecLinMAL = A2808RecLinMAL ;
         Z1377RecNumAny = A1377RecNumAny ;
         Z719PrdNum = A719PrdNum ;
         sMode411 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load4R411( ) ;
         if ( AnyError == 1 )
         {
            RcdFound411 = (short)(0) ;
            initializeNonKey4R411( ) ;
         }
         Gx_mode = sMode411 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound411 = (short)(0) ;
         initializeNonKey4R411( ) ;
         sMode411 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode411 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey4R411( ) ;
      if ( RcdFound411 == 0 )
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
      RcdFound411 = (short)(0) ;
      /* Using cursor T004R10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2808RecLinMAL), Short.valueOf(A2808RecLinMAL), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1377RecNumAny), Byte.valueOf(A1377RecNumAny), Short.valueOf(A2808RecLinMAL), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A129BarCod[0] < A129BarCod ) || ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A132BarCodReo[0] < A132BarCodReo ) || ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A2808RecLinMAL[0] < A2808RecLinMAL ) || ( T004R10_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A1377RecNumAny[0] < A1377RecNumAny ) || ( T004R10_A1377RecNumAny[0] == A1377RecNumAny ) && ( T004R10_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R10_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A129BarCod[0] > A129BarCod ) || ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A132BarCodReo[0] > A132BarCodReo ) || ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A2808RecLinMAL[0] > A2808RecLinMAL ) || ( T004R10_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R10_A1377RecNumAny[0] > A1377RecNumAny ) || ( T004R10_A1377RecNumAny[0] == A1377RecNumAny ) && ( T004R10_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R10_A132BarCodReo[0] == A132BarCodReo ) && ( T004R10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R10_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T004R10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T004R10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T004R10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T004R10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2808RecLinMAL = T004R10_A2808RecLinMAL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
            A1377RecNumAny = T004R10_A1377RecNumAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
            A719PrdNum = T004R10_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound411 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound411 = (short)(0) ;
      /* Using cursor T004R11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2808RecLinMAL), Short.valueOf(A2808RecLinMAL), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1377RecNumAny), Byte.valueOf(A1377RecNumAny), Short.valueOf(A2808RecLinMAL), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A129BarCod[0] > A129BarCod ) || ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A132BarCodReo[0] > A132BarCodReo ) || ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A2808RecLinMAL[0] > A2808RecLinMAL ) || ( T004R11_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A1377RecNumAny[0] > A1377RecNumAny ) || ( T004R11_A1377RecNumAny[0] == A1377RecNumAny ) && ( T004R11_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R11_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A129BarCod[0] < A129BarCod ) || ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A132BarCodReo[0] < A132BarCodReo ) || ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A2808RecLinMAL[0] < A2808RecLinMAL ) || ( T004R11_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004R11_A1377RecNumAny[0] < A1377RecNumAny ) || ( T004R11_A1377RecNumAny[0] == A1377RecNumAny ) && ( T004R11_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(T004R11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T004R11_A132BarCodReo[0] == A132BarCodReo ) && ( T004R11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T004R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T004R11_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T004R11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T004R11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T004R11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T004R11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2808RecLinMAL = T004R11_A2808RecLinMAL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
            A1377RecNumAny = T004R11_A1377RecNumAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
            A719PrdNum = T004R11_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound411 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey4R411( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert4R411( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound411 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2808RecLinMAL = Z2808RecLinMAL ;
               httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
               A1377RecNumAny = Z1377RecNumAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
               update4R411( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert4R411( ) ;
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
                  insert4R411( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2808RecLinMAL = Z2808RecLinMAL ;
         httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         A1377RecNumAny = Z1377RecNumAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      getKey4R411( ) ;
      if ( RcdFound411 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2808RecLinMAL = Z2808RecLinMAL ;
            httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
            A1377RecNumAny = Z1377RecNumAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
            A719PrdNum = Z719PrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2808RecLinMAL != Z2808RecLinMAL ) || ( A1377RecNumAny != Z1377RecNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlanyad");
      GX_FocusControl = edtPrdCFin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_4R0( ) ;
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
      if ( RcdFound411 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdCFin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart4R411( ) ;
      if ( RcdFound411 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdCFin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd4R411( ) ;
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
      if ( RcdFound411 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdCFin_Internalname ;
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
      if ( RcdFound411 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdCFin_Internalname ;
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
      scanStart4R411( ) ;
      if ( RcdFound411 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound411 != 0 )
         {
            scanNext4R411( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdCFin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd4R411( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency4R411( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T004R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLANYAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1378PrdCFin, T004R2_A1378PrdCFin[0]) != 0 ) || ( GXutil.strcmp(Z3380LanyPrd, T004R2_A3380LanyPrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z3381LanyCan, T004R2_A3381LanyCan[0]) != 0 ) || ( Z3382LanyNro != T004R2_A3382LanyNro[0] ) || ( Z3383LanyTnq != T004R2_A3383LanyTnq[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4578LanyUsr, T004R2_A4578LanyUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4579LanyFec, T004R2_A4579LanyFec[0]) ) || ( GXutil.strcmp(Z5807LanyLote, T004R2_A5807LanyLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z12705LanyCtd, T004R2_A12705LanyCtd[0]) != 0 ) || ( GXutil.strcmp(Z12706LanyUnd, T004R2_A12706LanyUnd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z13939LanyLoteFc), GXutil.resetTime(T004R2_A13939LanyLoteFc[0])) ) )
         {
            if ( DecimalUtil.compareTo(Z1378PrdCFin, T004R2_A1378PrdCFin[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"PrdCFin");
               GXutil.writeLogRaw("Old: ",Z1378PrdCFin);
               GXutil.writeLogRaw("Current: ",T004R2_A1378PrdCFin[0]);
            }
            if ( GXutil.strcmp(Z3380LanyPrd, T004R2_A3380LanyPrd[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyPrd");
               GXutil.writeLogRaw("Old: ",Z3380LanyPrd);
               GXutil.writeLogRaw("Current: ",T004R2_A3380LanyPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z3381LanyCan, T004R2_A3381LanyCan[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyCan");
               GXutil.writeLogRaw("Old: ",Z3381LanyCan);
               GXutil.writeLogRaw("Current: ",T004R2_A3381LanyCan[0]);
            }
            if ( Z3382LanyNro != T004R2_A3382LanyNro[0] )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyNro");
               GXutil.writeLogRaw("Old: ",Z3382LanyNro);
               GXutil.writeLogRaw("Current: ",T004R2_A3382LanyNro[0]);
            }
            if ( Z3383LanyTnq != T004R2_A3383LanyTnq[0] )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyTnq");
               GXutil.writeLogRaw("Old: ",Z3383LanyTnq);
               GXutil.writeLogRaw("Current: ",T004R2_A3383LanyTnq[0]);
            }
            if ( GXutil.strcmp(Z4578LanyUsr, T004R2_A4578LanyUsr[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyUsr");
               GXutil.writeLogRaw("Old: ",Z4578LanyUsr);
               GXutil.writeLogRaw("Current: ",T004R2_A4578LanyUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4579LanyFec, T004R2_A4579LanyFec[0]) ) )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyFec");
               GXutil.writeLogRaw("Old: ",Z4579LanyFec);
               GXutil.writeLogRaw("Current: ",T004R2_A4579LanyFec[0]);
            }
            if ( GXutil.strcmp(Z5807LanyLote, T004R2_A5807LanyLote[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyLote");
               GXutil.writeLogRaw("Old: ",Z5807LanyLote);
               GXutil.writeLogRaw("Current: ",T004R2_A5807LanyLote[0]);
            }
            if ( DecimalUtil.compareTo(Z12705LanyCtd, T004R2_A12705LanyCtd[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyCtd");
               GXutil.writeLogRaw("Old: ",Z12705LanyCtd);
               GXutil.writeLogRaw("Current: ",T004R2_A12705LanyCtd[0]);
            }
            if ( GXutil.strcmp(Z12706LanyUnd, T004R2_A12706LanyUnd[0]) != 0 )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyUnd");
               GXutil.writeLogRaw("Old: ",Z12706LanyUnd);
               GXutil.writeLogRaw("Current: ",T004R2_A12706LanyUnd[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13939LanyLoteFc), GXutil.resetTime(T004R2_A13939LanyLoteFc[0])) ) )
            {
               GXutil.writeLogln("tlanyad:[seudo value changed for attri]"+"LanyLoteFc");
               GXutil.writeLogRaw("Old: ",Z13939LanyLoteFc);
               GXutil.writeLogRaw("Current: ",T004R2_A13939LanyLoteFc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLANYAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert4R411( )
   {
      beforeValidate4R411( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4R411( ) ;
      }
      if ( AnyError == 0 )
      {
         zm4R411( 0) ;
         checkOptimisticConcurrency4R411( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm4R411( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert4R411( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004R12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), Boolean.valueOf(n1378PrdCFin), A1378PrdCFin, Boolean.valueOf(n3380LanyPrd), A3380LanyPrd, Boolean.valueOf(n3381LanyCan), A3381LanyCan, Boolean.valueOf(n3382LanyNro), Byte.valueOf(A3382LanyNro), Boolean.valueOf(n3383LanyTnq), Byte.valueOf(A3383LanyTnq), Boolean.valueOf(n4578LanyUsr), A4578LanyUsr, Boolean.valueOf(n4579LanyFec), A4579LanyFec, Boolean.valueOf(n5807LanyLote), A5807LanyLote, Boolean.valueOf(n12705LanyCtd), A12705LanyCtd, Boolean.valueOf(n12706LanyUnd), A12706LanyUnd, A13939LanyLoteFc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
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
                        resetCaption4R0( ) ;
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
            load4R411( ) ;
         }
         endLevel4R411( ) ;
      }
      closeExtendedTableCursors4R411( ) ;
   }

   public void update4R411( )
   {
      beforeValidate4R411( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4R411( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency4R411( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm4R411( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate4R411( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004R13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n1378PrdCFin), A1378PrdCFin, Boolean.valueOf(n3380LanyPrd), A3380LanyPrd, Boolean.valueOf(n3381LanyCan), A3381LanyCan, Boolean.valueOf(n3382LanyNro), Byte.valueOf(A3382LanyNro), Boolean.valueOf(n3383LanyTnq), Byte.valueOf(A3383LanyTnq), Boolean.valueOf(n4578LanyUsr), A4578LanyUsr, Boolean.valueOf(n4579LanyFec), A4579LanyFec, Boolean.valueOf(n5807LanyLote), A5807LanyLote, Boolean.valueOf(n12705LanyCtd), A12705LanyCtd, Boolean.valueOf(n12706LanyUnd), A12706LanyUnd, A13939LanyLoteFc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLANYAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate4R411( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption4R0( ) ;
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
         endLevel4R411( ) ;
      }
      closeExtendedTableCursors4R411( ) ;
   }

   public void deferredUpdate4R411( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate4R411( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency4R411( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls4R411( ) ;
         afterConfirm4R411( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete4R411( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T004R14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound411 == 0 )
                     {
                        initAll4R411( ) ;
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
                     resetCaption4R0( ) ;
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
      sMode411 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel4R411( ) ;
      Gx_mode = sMode411 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls4R411( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T004R15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T004R15_A718PrdNom[0] ;
         pr_default.close(13);
      }
   }

   public void endLevel4R411( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete4R411( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlanyad");
         if ( AnyError == 0 )
         {
            confirmValues4R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlanyad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart4R411( )
   {
      /* Using cursor T004R16 */
      pr_default.execute(14);
      RcdFound411 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound411 = (short)(1) ;
         A396EmprCod = T004R16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T004R16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T004R16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T004R16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2808RecLinMAL = T004R16_A2808RecLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         A1377RecNumAny = T004R16_A1377RecNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         A719PrdNum = T004R16_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext4R411( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound411 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound411 = (short)(1) ;
         A396EmprCod = T004R16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T004R16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T004R16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T004R16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2808RecLinMAL = T004R16_A2808RecLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
         A1377RecNumAny = T004R16_A1377RecNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
         A719PrdNum = T004R16_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd4R411( )
   {
      pr_default.close(14);
   }

   public void afterConfirm4R411( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert4R411( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate4R411( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete4R411( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete4R411( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate4R411( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes4R411( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtRecLinMAL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMAL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMAL_Enabled), 5, 0), true);
      edtRecNumAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumAny_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdCFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCFin_Enabled), 5, 0), true);
      edtLanyPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyPrd_Enabled), 5, 0), true);
      edtLanyCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyCan_Enabled), 5, 0), true);
      edtLanyNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyNro_Enabled), 5, 0), true);
      edtLanyTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyTnq_Enabled), 5, 0), true);
      edtLanyUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyUsr_Enabled), 5, 0), true);
      edtLanyFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyFec_Enabled), 5, 0), true);
      edtLanyLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyLote_Enabled), 5, 0), true);
      edtLanyCtd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyCtd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyCtd_Enabled), 5, 0), true);
      cmbLanyUnd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLanyUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLanyUnd.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes4R411( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues4R0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlanyad", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TLANYAD");
      forbiddenHiddens.add("LanyLoteFc", localUtil.format(A13939LanyLoteFc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tlanyad:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2808RecLinMAL", GXutil.ltrim( localUtil.ntoc( Z2808RecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1377RecNumAny", GXutil.ltrim( localUtil.ntoc( Z1377RecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1378PrdCFin", GXutil.ltrim( localUtil.ntoc( Z1378PrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3380LanyPrd", GXutil.rtrim( Z3380LanyPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3381LanyCan", GXutil.ltrim( localUtil.ntoc( Z3381LanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3382LanyNro", GXutil.ltrim( localUtil.ntoc( Z3382LanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3383LanyTnq", GXutil.ltrim( localUtil.ntoc( Z3383LanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4578LanyUsr", GXutil.rtrim( Z4578LanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4579LanyFec", localUtil.ttoc( Z4579LanyFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5807LanyLote", GXutil.rtrim( Z5807LanyLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12705LanyCtd", GXutil.ltrim( localUtil.ntoc( Z12705LanyCtd, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12706LanyUnd", GXutil.rtrim( Z12706LanyUnd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13939LanyLoteFc", localUtil.dtoc( Z13939LanyLoteFc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "LANYLOTEFC", localUtil.dtoc( A13939LanyLoteFc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
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
      return formatLink("app.tlanyad", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLANYAD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LINEAS AÑADIDAS (BALANZAS)", "") ;
   }

   public void initializeNonKey4R411( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A1378PrdCFin = DecimalUtil.ZERO ;
      n1378PrdCFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrimstr( A1378PrdCFin, 11, 3));
      A3380LanyPrd = "" ;
      n3380LanyPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3380LanyPrd", A3380LanyPrd);
      A3381LanyCan = DecimalUtil.ZERO ;
      n3381LanyCan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrimstr( A3381LanyCan, 11, 3));
      A3382LanyNro = (byte)(0) ;
      n3382LanyNro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3382LanyNro), 2, 0));
      A3383LanyTnq = (byte)(0) ;
      n3383LanyTnq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3383LanyTnq), 2, 0));
      A4578LanyUsr = "" ;
      n4578LanyUsr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4578LanyUsr", A4578LanyUsr);
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      n4579LanyFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5807LanyLote = "" ;
      n5807LanyLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5807LanyLote", A5807LanyLote);
      A12705LanyCtd = DecimalUtil.ZERO ;
      n12705LanyCtd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrimstr( A12705LanyCtd, 11, 3));
      A12706LanyUnd = "" ;
      n12706LanyUnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
      A13939LanyLoteFc = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13939LanyLoteFc", localUtil.format(A13939LanyLoteFc, "99/99/99"));
      Z1378PrdCFin = DecimalUtil.ZERO ;
      Z3380LanyPrd = "" ;
      Z3381LanyCan = DecimalUtil.ZERO ;
      Z3382LanyNro = (byte)(0) ;
      Z3383LanyTnq = (byte)(0) ;
      Z4578LanyUsr = "" ;
      Z4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      Z5807LanyLote = "" ;
      Z12705LanyCtd = DecimalUtil.ZERO ;
      Z12706LanyUnd = "" ;
      Z13939LanyLoteFc = GXutil.nullDate() ;
   }

   public void initAll4R411( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2808RecLinMAL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2808RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2808RecLinMAL), 4, 0));
      A1377RecNumAny = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1377RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1377RecNumAny), 2, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey4R411( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026610162412", true, true);
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
      httpContext.AddJavascriptSource("tlanyad.js", "?2026610162412", false, true);
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
      edtRecLinMAL_Internalname = "RECLINMAL" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRecNumAny_Internalname = "RECNUMANY" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrdCFin_Internalname = "PRDCFIN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtLanyPrd_Internalname = "LANYPRD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtLanyCan_Internalname = "LANYCAN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtLanyNro_Internalname = "LANYNRO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtLanyTnq_Internalname = "LANYTNQ" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtLanyUsr_Internalname = "LANYUSR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtLanyFec_Internalname = "LANYFEC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtLanyLote_Internalname = "LANYLOTE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtLanyCtd_Internalname = "LANYCTD" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      cmbLanyUnd.setInternalname( "LANYUND" );
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
      Form.setCaption( httpContext.getMessage( "LINEAS AÑADIDAS (BALANZAS)", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbLanyUnd.setJsonclick( "" );
      cmbLanyUnd.setEnabled( 1 );
      cmbLanyUnd.setIBackground( (int)(0xFFFFFF) );
      edtLanyCtd_Jsonclick = "" ;
      edtLanyCtd_Backcolor = (int)(0xFFFFFF) ;
      edtLanyCtd_Enabled = 1 ;
      edtLanyLote_Jsonclick = "" ;
      edtLanyLote_Backcolor = (int)(0xFFFFFF) ;
      edtLanyLote_Enabled = 1 ;
      edtLanyFec_Jsonclick = "" ;
      edtLanyFec_Backcolor = (int)(0xFFFFFF) ;
      edtLanyFec_Enabled = 1 ;
      edtLanyUsr_Jsonclick = "" ;
      edtLanyUsr_Backcolor = (int)(0xFFFFFF) ;
      edtLanyUsr_Enabled = 1 ;
      edtLanyTnq_Jsonclick = "" ;
      edtLanyTnq_Backcolor = (int)(0xFFFFFF) ;
      edtLanyTnq_Enabled = 1 ;
      edtLanyNro_Jsonclick = "" ;
      edtLanyNro_Backcolor = (int)(0xFFFFFF) ;
      edtLanyNro_Enabled = 1 ;
      edtLanyCan_Jsonclick = "" ;
      edtLanyCan_Backcolor = (int)(0xFFFFFF) ;
      edtLanyCan_Enabled = 1 ;
      edtLanyPrd_Jsonclick = "" ;
      edtLanyPrd_Backcolor = (int)(0xFFFFFF) ;
      edtLanyPrd_Enabled = 1 ;
      edtPrdCFin_Jsonclick = "" ;
      edtPrdCFin_Backcolor = (int)(0xFFFFFF) ;
      edtPrdCFin_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      edtRecNumAny_Jsonclick = "" ;
      edtRecNumAny_Backcolor = (int)(0xFFFFFF) ;
      edtRecNumAny_Enabled = 1 ;
      edtRecLinMAL_Jsonclick = "" ;
      edtRecLinMAL_Backcolor = (int)(0xFFFFFF) ;
      edtRecLinMAL_Enabled = 1 ;
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
      cmbLanyUnd.setName( "LANYUND" );
      cmbLanyUnd.setWebtags( "" );
      cmbLanyUnd.addItem("0", httpContext.getMessage( "Definir", ""), (short)(0));
      cmbLanyUnd.addItem("1", httpContext.getMessage( "kg", ""), (short)(0));
      cmbLanyUnd.addItem("2", httpContext.getMessage( "g", ""), (short)(0));
      cmbLanyUnd.addItem("3", httpContext.getMessage( "l", ""), (short)(0));
      cmbLanyUnd.addItem("4", httpContext.getMessage( "ml", ""), (short)(0));
      if ( cmbLanyUnd.getItemCount() > 0 )
      {
         A12706LanyUnd = cmbLanyUnd.getValidValue(A12706LanyUnd) ;
         n12706LanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", A12706LanyUnd);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T004R17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T004R15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T004R15_A718PrdNom[0] ;
      pr_default.close(13);
      GX_FocusControl = edtPrdCFin_Internalname ;
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
      /* Using cursor T004R17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prdnum( )
   {
      n12706LanyUnd = false ;
      A12706LanyUnd = cmbLanyUnd.getValue() ;
      n12706LanyUnd = false ;
      cmbLanyUnd.setValue( A12706LanyUnd );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T004R15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T004R15_A718PrdNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      if ( cmbLanyUnd.getItemCount() > 0 )
      {
         A12706LanyUnd = cmbLanyUnd.getValidValue(A12706LanyUnd) ;
         n12706LanyUnd = false ;
         cmbLanyUnd.setValue( A12706LanyUnd );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLanyUnd.setValue( GXutil.rtrim( A12706LanyUnd) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1378PrdCFin", GXutil.ltrim( localUtil.ntoc( A1378PrdCFin, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3380LanyPrd", GXutil.rtrim( A3380LanyPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A3381LanyCan", GXutil.ltrim( localUtil.ntoc( A3381LanyCan, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3382LanyNro", GXutil.ltrim( localUtil.ntoc( A3382LanyNro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3383LanyTnq", GXutil.ltrim( localUtil.ntoc( A3383LanyTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4578LanyUsr", GXutil.rtrim( A4578LanyUsr));
      httpContext.ajax_rsp_assign_attri("", false, "A4579LanyFec", localUtil.ttoc( A4579LanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5807LanyLote", GXutil.rtrim( A5807LanyLote));
      httpContext.ajax_rsp_assign_attri("", false, "A12705LanyCtd", GXutil.ltrim( localUtil.ntoc( A12705LanyCtd, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12706LanyUnd", GXutil.rtrim( A12706LanyUnd));
      cmbLanyUnd.setValue( GXutil.rtrim( A12706LanyUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLanyUnd.getInternalname(), "Values", cmbLanyUnd.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A13939LanyLoteFc", localUtil.format(A13939LanyLoteFc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2808RecLinMAL", GXutil.ltrim( localUtil.ntoc( Z2808RecLinMAL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1377RecNumAny", GXutil.ltrim( localUtil.ntoc( Z1377RecNumAny, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1378PrdCFin", GXutil.ltrim( localUtil.ntoc( Z1378PrdCFin, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3380LanyPrd", GXutil.rtrim( Z3380LanyPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3381LanyCan", GXutil.ltrim( localUtil.ntoc( Z3381LanyCan, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3382LanyNro", GXutil.ltrim( localUtil.ntoc( Z3382LanyNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3383LanyTnq", GXutil.ltrim( localUtil.ntoc( Z3383LanyTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4578LanyUsr", GXutil.rtrim( Z4578LanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4579LanyFec", localUtil.ttoc( Z4579LanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5807LanyLote", GXutil.rtrim( Z5807LanyLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12705LanyCtd", GXutil.ltrim( localUtil.ntoc( Z12705LanyCtd, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12706LanyUnd", GXutil.rtrim( Z12706LanyUnd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13939LanyLoteFc", localUtil.format(Z13939LanyLoteFc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13939LanyLoteFc',fld:'LANYLOTEFC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAL","{handler:'valid_Reclinmal',iparms:[]");
      setEventMetadata("VALID_RECLINMAL",",oparms:[]}");
      setEventMetadata("VALID_RECNUMANY","{handler:'valid_Recnumany',iparms:[]");
      setEventMetadata("VALID_RECNUMANY",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A13939LanyLoteFc',fld:'LANYLOTEFC',pic:''},{av:'cmbLanyUnd'},{av:'A12706LanyUnd',fld:'LANYUND',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A1378PrdCFin',fld:'PRDCFIN',pic:'ZZZZZZ9.999'},{av:'A3380LanyPrd',fld:'LANYPRD',pic:''},{av:'A3381LanyCan',fld:'LANYCAN',pic:'ZZZZZZ9.999'},{av:'A3382LanyNro',fld:'LANYNRO',pic:'Z9'},{av:'A3383LanyTnq',fld:'LANYTNQ',pic:'Z9'},{av:'A4578LanyUsr',fld:'LANYUSR',pic:'@!'},{av:'A4579LanyFec',fld:'LANYFEC',pic:'99/99/99 99:99:99'},{av:'A5807LanyLote',fld:'LANYLOTE',pic:''},{av:'A12705LanyCtd',fld:'LANYCTD',pic:'ZZZZZZ9.999'},{av:'cmbLanyUnd'},{av:'A12706LanyUnd',fld:'LANYUND',pic:''},{av:'A13939LanyLoteFc',fld:'LANYLOTEFC',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2808RecLinMAL'},{av:'Z1377RecNumAny'},{av:'Z719PrdNum'},{av:'Z1378PrdCFin'},{av:'Z3380LanyPrd'},{av:'Z3381LanyCan'},{av:'Z3382LanyNro'},{av:'Z3383LanyTnq'},{av:'Z4578LanyUsr'},{av:'Z4579LanyFec'},{av:'Z5807LanyLote'},{av:'Z12705LanyCtd'},{av:'Z12706LanyUnd'},{av:'Z13939LanyLoteFc'},{av:'Z718PrdNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z719PrdNum = "" ;
      Z1378PrdCFin = DecimalUtil.ZERO ;
      Z3380LanyPrd = "" ;
      Z3381LanyCan = DecimalUtil.ZERO ;
      Z4578LanyUsr = "" ;
      Z4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      Z5807LanyLote = "" ;
      Z12705LanyCtd = DecimalUtil.ZERO ;
      Z12706LanyUnd = "" ;
      Z13939LanyLoteFc = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A719PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A12706LanyUnd = "" ;
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
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A3380LanyPrd = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4578LanyUsr = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock15_Jsonclick = "" ;
      A5807LanyLote = "" ;
      lblTextblock16_Jsonclick = "" ;
      A12705LanyCtd = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13939LanyLoteFc = GXutil.nullDate() ;
      Gx_mode = "" ;
      A718PrdNom = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z718PrdNom = "" ;
      T004R6_A2808RecLinMAL = new short[1] ;
      T004R6_A1377RecNumAny = new byte[1] ;
      T004R6_A718PrdNom = new String[] {""} ;
      T004R6_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R6_n1378PrdCFin = new boolean[] {false} ;
      T004R6_A3380LanyPrd = new String[] {""} ;
      T004R6_n3380LanyPrd = new boolean[] {false} ;
      T004R6_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R6_n3381LanyCan = new boolean[] {false} ;
      T004R6_A3382LanyNro = new byte[1] ;
      T004R6_n3382LanyNro = new boolean[] {false} ;
      T004R6_A3383LanyTnq = new byte[1] ;
      T004R6_n3383LanyTnq = new boolean[] {false} ;
      T004R6_A4578LanyUsr = new String[] {""} ;
      T004R6_n4578LanyUsr = new boolean[] {false} ;
      T004R6_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004R6_n4579LanyFec = new boolean[] {false} ;
      T004R6_A5807LanyLote = new String[] {""} ;
      T004R6_n5807LanyLote = new boolean[] {false} ;
      T004R6_A12705LanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R6_n12705LanyCtd = new boolean[] {false} ;
      T004R6_A12706LanyUnd = new String[] {""} ;
      T004R6_n12706LanyUnd = new boolean[] {false} ;
      T004R6_A13939LanyLoteFc = new java.util.Date[] {GXutil.nullDate()} ;
      T004R6_A396EmprCod = new String[] {""} ;
      T004R6_A129BarCod = new int[1] ;
      T004R6_A132BarCodReo = new byte[1] ;
      T004R6_A130BarCodPar = new String[] {""} ;
      T004R6_A719PrdNum = new String[] {""} ;
      T004R4_A396EmprCod = new String[] {""} ;
      T004R5_A718PrdNom = new String[] {""} ;
      T004R7_A396EmprCod = new String[] {""} ;
      T004R8_A718PrdNom = new String[] {""} ;
      T004R9_A396EmprCod = new String[] {""} ;
      T004R9_A129BarCod = new int[1] ;
      T004R9_A132BarCodReo = new byte[1] ;
      T004R9_A130BarCodPar = new String[] {""} ;
      T004R9_A2808RecLinMAL = new short[1] ;
      T004R9_A1377RecNumAny = new byte[1] ;
      T004R9_A719PrdNum = new String[] {""} ;
      T004R3_A2808RecLinMAL = new short[1] ;
      T004R3_A1377RecNumAny = new byte[1] ;
      T004R3_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R3_n1378PrdCFin = new boolean[] {false} ;
      T004R3_A3380LanyPrd = new String[] {""} ;
      T004R3_n3380LanyPrd = new boolean[] {false} ;
      T004R3_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R3_n3381LanyCan = new boolean[] {false} ;
      T004R3_A3382LanyNro = new byte[1] ;
      T004R3_n3382LanyNro = new boolean[] {false} ;
      T004R3_A3383LanyTnq = new byte[1] ;
      T004R3_n3383LanyTnq = new boolean[] {false} ;
      T004R3_A4578LanyUsr = new String[] {""} ;
      T004R3_n4578LanyUsr = new boolean[] {false} ;
      T004R3_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004R3_n4579LanyFec = new boolean[] {false} ;
      T004R3_A5807LanyLote = new String[] {""} ;
      T004R3_n5807LanyLote = new boolean[] {false} ;
      T004R3_A12705LanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R3_n12705LanyCtd = new boolean[] {false} ;
      T004R3_A12706LanyUnd = new String[] {""} ;
      T004R3_n12706LanyUnd = new boolean[] {false} ;
      T004R3_A13939LanyLoteFc = new java.util.Date[] {GXutil.nullDate()} ;
      T004R3_A396EmprCod = new String[] {""} ;
      T004R3_A129BarCod = new int[1] ;
      T004R3_A132BarCodReo = new byte[1] ;
      T004R3_A130BarCodPar = new String[] {""} ;
      T004R3_A719PrdNum = new String[] {""} ;
      sMode411 = "" ;
      T004R10_A396EmprCod = new String[] {""} ;
      T004R10_A129BarCod = new int[1] ;
      T004R10_A132BarCodReo = new byte[1] ;
      T004R10_A130BarCodPar = new String[] {""} ;
      T004R10_A2808RecLinMAL = new short[1] ;
      T004R10_A1377RecNumAny = new byte[1] ;
      T004R10_A719PrdNum = new String[] {""} ;
      T004R11_A396EmprCod = new String[] {""} ;
      T004R11_A129BarCod = new int[1] ;
      T004R11_A132BarCodReo = new byte[1] ;
      T004R11_A130BarCodPar = new String[] {""} ;
      T004R11_A2808RecLinMAL = new short[1] ;
      T004R11_A1377RecNumAny = new byte[1] ;
      T004R11_A719PrdNum = new String[] {""} ;
      T004R2_A2808RecLinMAL = new short[1] ;
      T004R2_A1377RecNumAny = new byte[1] ;
      T004R2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R2_n1378PrdCFin = new boolean[] {false} ;
      T004R2_A3380LanyPrd = new String[] {""} ;
      T004R2_n3380LanyPrd = new boolean[] {false} ;
      T004R2_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R2_n3381LanyCan = new boolean[] {false} ;
      T004R2_A3382LanyNro = new byte[1] ;
      T004R2_n3382LanyNro = new boolean[] {false} ;
      T004R2_A3383LanyTnq = new byte[1] ;
      T004R2_n3383LanyTnq = new boolean[] {false} ;
      T004R2_A4578LanyUsr = new String[] {""} ;
      T004R2_n4578LanyUsr = new boolean[] {false} ;
      T004R2_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004R2_n4579LanyFec = new boolean[] {false} ;
      T004R2_A5807LanyLote = new String[] {""} ;
      T004R2_n5807LanyLote = new boolean[] {false} ;
      T004R2_A12705LanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004R2_n12705LanyCtd = new boolean[] {false} ;
      T004R2_A12706LanyUnd = new String[] {""} ;
      T004R2_n12706LanyUnd = new boolean[] {false} ;
      T004R2_A13939LanyLoteFc = new java.util.Date[] {GXutil.nullDate()} ;
      T004R2_A396EmprCod = new String[] {""} ;
      T004R2_A129BarCod = new int[1] ;
      T004R2_A132BarCodReo = new byte[1] ;
      T004R2_A130BarCodPar = new String[] {""} ;
      T004R2_A719PrdNum = new String[] {""} ;
      T004R15_A718PrdNom = new String[] {""} ;
      T004R16_A396EmprCod = new String[] {""} ;
      T004R16_A129BarCod = new int[1] ;
      T004R16_A132BarCodReo = new byte[1] ;
      T004R16_A130BarCodPar = new String[] {""} ;
      T004R16_A2808RecLinMAL = new short[1] ;
      T004R16_A1377RecNumAny = new byte[1] ;
      T004R16_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T004R17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ719PrdNum = "" ;
      ZZ1378PrdCFin = DecimalUtil.ZERO ;
      ZZ3380LanyPrd = "" ;
      ZZ3381LanyCan = DecimalUtil.ZERO ;
      ZZ4578LanyUsr = "" ;
      ZZ4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ5807LanyLote = "" ;
      ZZ12705LanyCtd = DecimalUtil.ZERO ;
      ZZ12706LanyUnd = "" ;
      ZZ13939LanyLoteFc = GXutil.nullDate() ;
      ZZ718PrdNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlanyad__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlanyad__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlanyad__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlanyad__default(),
         new Object[] {
             new Object[] {
            T004R2_A2808RecLinMAL, T004R2_A1377RecNumAny, T004R2_A1378PrdCFin, T004R2_n1378PrdCFin, T004R2_A3380LanyPrd, T004R2_n3380LanyPrd, T004R2_A3381LanyCan, T004R2_n3381LanyCan, T004R2_A3382LanyNro, T004R2_n3382LanyNro,
            T004R2_A3383LanyTnq, T004R2_n3383LanyTnq, T004R2_A4578LanyUsr, T004R2_n4578LanyUsr, T004R2_A4579LanyFec, T004R2_n4579LanyFec, T004R2_A5807LanyLote, T004R2_n5807LanyLote, T004R2_A12705LanyCtd, T004R2_n12705LanyCtd,
            T004R2_A12706LanyUnd, T004R2_n12706LanyUnd, T004R2_A13939LanyLoteFc, T004R2_A396EmprCod, T004R2_A129BarCod, T004R2_A132BarCodReo, T004R2_A130BarCodPar, T004R2_A719PrdNum
            }
            , new Object[] {
            T004R3_A2808RecLinMAL, T004R3_A1377RecNumAny, T004R3_A1378PrdCFin, T004R3_n1378PrdCFin, T004R3_A3380LanyPrd, T004R3_n3380LanyPrd, T004R3_A3381LanyCan, T004R3_n3381LanyCan, T004R3_A3382LanyNro, T004R3_n3382LanyNro,
            T004R3_A3383LanyTnq, T004R3_n3383LanyTnq, T004R3_A4578LanyUsr, T004R3_n4578LanyUsr, T004R3_A4579LanyFec, T004R3_n4579LanyFec, T004R3_A5807LanyLote, T004R3_n5807LanyLote, T004R3_A12705LanyCtd, T004R3_n12705LanyCtd,
            T004R3_A12706LanyUnd, T004R3_n12706LanyUnd, T004R3_A13939LanyLoteFc, T004R3_A396EmprCod, T004R3_A129BarCod, T004R3_A132BarCodReo, T004R3_A130BarCodPar, T004R3_A719PrdNum
            }
            , new Object[] {
            T004R4_A396EmprCod
            }
            , new Object[] {
            T004R5_A718PrdNom
            }
            , new Object[] {
            T004R6_A2808RecLinMAL, T004R6_A1377RecNumAny, T004R6_A718PrdNom, T004R6_A1378PrdCFin, T004R6_n1378PrdCFin, T004R6_A3380LanyPrd, T004R6_n3380LanyPrd, T004R6_A3381LanyCan, T004R6_n3381LanyCan, T004R6_A3382LanyNro,
            T004R6_n3382LanyNro, T004R6_A3383LanyTnq, T004R6_n3383LanyTnq, T004R6_A4578LanyUsr, T004R6_n4578LanyUsr, T004R6_A4579LanyFec, T004R6_n4579LanyFec, T004R6_A5807LanyLote, T004R6_n5807LanyLote, T004R6_A12705LanyCtd,
            T004R6_n12705LanyCtd, T004R6_A12706LanyUnd, T004R6_n12706LanyUnd, T004R6_A13939LanyLoteFc, T004R6_A396EmprCod, T004R6_A129BarCod, T004R6_A132BarCodReo, T004R6_A130BarCodPar, T004R6_A719PrdNum
            }
            , new Object[] {
            T004R7_A396EmprCod
            }
            , new Object[] {
            T004R8_A718PrdNom
            }
            , new Object[] {
            T004R9_A396EmprCod, T004R9_A129BarCod, T004R9_A132BarCodReo, T004R9_A130BarCodPar, T004R9_A2808RecLinMAL, T004R9_A1377RecNumAny, T004R9_A719PrdNum
            }
            , new Object[] {
            T004R10_A396EmprCod, T004R10_A129BarCod, T004R10_A132BarCodReo, T004R10_A130BarCodPar, T004R10_A2808RecLinMAL, T004R10_A1377RecNumAny, T004R10_A719PrdNum
            }
            , new Object[] {
            T004R11_A396EmprCod, T004R11_A129BarCod, T004R11_A132BarCodReo, T004R11_A130BarCodPar, T004R11_A2808RecLinMAL, T004R11_A1377RecNumAny, T004R11_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004R15_A718PrdNom
            }
            , new Object[] {
            T004R16_A396EmprCod, T004R16_A129BarCod, T004R16_A132BarCodReo, T004R16_A130BarCodPar, T004R16_A2808RecLinMAL, T004R16_A1377RecNumAny, T004R16_A719PrdNum
            }
            , new Object[] {
            T004R17_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z1377RecNumAny ;
   private byte Z3382LanyNro ;
   private byte Z3383LanyTnq ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A1377RecNumAny ;
   private byte A3382LanyNro ;
   private byte A3383LanyTnq ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ1377RecNumAny ;
   private byte ZZ3382LanyNro ;
   private byte ZZ3383LanyTnq ;
   private short Z2808RecLinMAL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2808RecLinMAL ;
   private short RcdFound411 ;
   private short nIsDirty_411 ;
   private short ZZ2808RecLinMAL ;
   private int Z129BarCod ;
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
   private int edtRecLinMAL_Enabled ;
   private int edtRecNumAny_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdCFin_Enabled ;
   private int edtLanyPrd_Enabled ;
   private int edtLanyCan_Enabled ;
   private int edtLanyNro_Enabled ;
   private int edtLanyTnq_Enabled ;
   private int edtLanyUsr_Enabled ;
   private int edtLanyFec_Enabled ;
   private int edtLanyLote_Enabled ;
   private int edtLanyCtd_Enabled ;
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
   private int edtLanyCtd_Backcolor ;
   private int edtLanyLote_Backcolor ;
   private int edtLanyFec_Backcolor ;
   private int edtLanyUsr_Backcolor ;
   private int edtLanyTnq_Backcolor ;
   private int edtLanyNro_Backcolor ;
   private int edtLanyCan_Backcolor ;
   private int edtLanyPrd_Backcolor ;
   private int edtPrdCFin_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtRecNumAny_Backcolor ;
   private int edtRecLinMAL_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private java.math.BigDecimal Z1378PrdCFin ;
   private java.math.BigDecimal Z3381LanyCan ;
   private java.math.BigDecimal Z12705LanyCtd ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A3381LanyCan ;
   private java.math.BigDecimal A12705LanyCtd ;
   private java.math.BigDecimal ZZ1378PrdCFin ;
   private java.math.BigDecimal ZZ3381LanyCan ;
   private java.math.BigDecimal ZZ12705LanyCtd ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z719PrdNum ;
   private String Z3380LanyPrd ;
   private String Z4578LanyUsr ;
   private String Z5807LanyLote ;
   private String Z12706LanyUnd ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A12706LanyUnd ;
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
   private String edtRecLinMAL_Internalname ;
   private String edtRecLinMAL_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRecNumAny_Internalname ;
   private String edtRecNumAny_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrdCFin_Internalname ;
   private String edtPrdCFin_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtLanyPrd_Internalname ;
   private String A3380LanyPrd ;
   private String edtLanyPrd_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtLanyCan_Internalname ;
   private String edtLanyCan_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtLanyNro_Internalname ;
   private String edtLanyNro_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtLanyTnq_Internalname ;
   private String edtLanyTnq_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtLanyUsr_Internalname ;
   private String A4578LanyUsr ;
   private String edtLanyUsr_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtLanyFec_Internalname ;
   private String edtLanyFec_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtLanyLote_Internalname ;
   private String A5807LanyLote ;
   private String edtLanyLote_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtLanyCtd_Internalname ;
   private String edtLanyCtd_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
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
   private String A718PrdNom ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z718PrdNom ;
   private String sMode411 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ719PrdNum ;
   private String ZZ3380LanyPrd ;
   private String ZZ4578LanyUsr ;
   private String ZZ5807LanyLote ;
   private String ZZ12706LanyUnd ;
   private String ZZ718PrdNom ;
   private java.util.Date Z4579LanyFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date ZZ4579LanyFec ;
   private java.util.Date Z13939LanyLoteFc ;
   private java.util.Date A13939LanyLoteFc ;
   private java.util.Date ZZ13939LanyLoteFc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12706LanyUnd ;
   private boolean n1378PrdCFin ;
   private boolean n3380LanyPrd ;
   private boolean n3381LanyCan ;
   private boolean n3382LanyNro ;
   private boolean n3383LanyTnq ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private boolean n12705LanyCtd ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLanyUnd ;
   private IDataStoreProvider pr_default ;
   private short[] T004R6_A2808RecLinMAL ;
   private byte[] T004R6_A1377RecNumAny ;
   private String[] T004R6_A718PrdNom ;
   private java.math.BigDecimal[] T004R6_A1378PrdCFin ;
   private boolean[] T004R6_n1378PrdCFin ;
   private String[] T004R6_A3380LanyPrd ;
   private boolean[] T004R6_n3380LanyPrd ;
   private java.math.BigDecimal[] T004R6_A3381LanyCan ;
   private boolean[] T004R6_n3381LanyCan ;
   private byte[] T004R6_A3382LanyNro ;
   private boolean[] T004R6_n3382LanyNro ;
   private byte[] T004R6_A3383LanyTnq ;
   private boolean[] T004R6_n3383LanyTnq ;
   private String[] T004R6_A4578LanyUsr ;
   private boolean[] T004R6_n4578LanyUsr ;
   private java.util.Date[] T004R6_A4579LanyFec ;
   private boolean[] T004R6_n4579LanyFec ;
   private String[] T004R6_A5807LanyLote ;
   private boolean[] T004R6_n5807LanyLote ;
   private java.math.BigDecimal[] T004R6_A12705LanyCtd ;
   private boolean[] T004R6_n12705LanyCtd ;
   private String[] T004R6_A12706LanyUnd ;
   private boolean[] T004R6_n12706LanyUnd ;
   private java.util.Date[] T004R6_A13939LanyLoteFc ;
   private String[] T004R6_A396EmprCod ;
   private int[] T004R6_A129BarCod ;
   private byte[] T004R6_A132BarCodReo ;
   private String[] T004R6_A130BarCodPar ;
   private String[] T004R6_A719PrdNum ;
   private String[] T004R4_A396EmprCod ;
   private String[] T004R5_A718PrdNom ;
   private String[] T004R7_A396EmprCod ;
   private String[] T004R8_A718PrdNom ;
   private String[] T004R9_A396EmprCod ;
   private int[] T004R9_A129BarCod ;
   private byte[] T004R9_A132BarCodReo ;
   private String[] T004R9_A130BarCodPar ;
   private short[] T004R9_A2808RecLinMAL ;
   private byte[] T004R9_A1377RecNumAny ;
   private String[] T004R9_A719PrdNum ;
   private short[] T004R3_A2808RecLinMAL ;
   private byte[] T004R3_A1377RecNumAny ;
   private java.math.BigDecimal[] T004R3_A1378PrdCFin ;
   private boolean[] T004R3_n1378PrdCFin ;
   private String[] T004R3_A3380LanyPrd ;
   private boolean[] T004R3_n3380LanyPrd ;
   private java.math.BigDecimal[] T004R3_A3381LanyCan ;
   private boolean[] T004R3_n3381LanyCan ;
   private byte[] T004R3_A3382LanyNro ;
   private boolean[] T004R3_n3382LanyNro ;
   private byte[] T004R3_A3383LanyTnq ;
   private boolean[] T004R3_n3383LanyTnq ;
   private String[] T004R3_A4578LanyUsr ;
   private boolean[] T004R3_n4578LanyUsr ;
   private java.util.Date[] T004R3_A4579LanyFec ;
   private boolean[] T004R3_n4579LanyFec ;
   private String[] T004R3_A5807LanyLote ;
   private boolean[] T004R3_n5807LanyLote ;
   private java.math.BigDecimal[] T004R3_A12705LanyCtd ;
   private boolean[] T004R3_n12705LanyCtd ;
   private String[] T004R3_A12706LanyUnd ;
   private boolean[] T004R3_n12706LanyUnd ;
   private java.util.Date[] T004R3_A13939LanyLoteFc ;
   private String[] T004R3_A396EmprCod ;
   private int[] T004R3_A129BarCod ;
   private byte[] T004R3_A132BarCodReo ;
   private String[] T004R3_A130BarCodPar ;
   private String[] T004R3_A719PrdNum ;
   private String[] T004R10_A396EmprCod ;
   private int[] T004R10_A129BarCod ;
   private byte[] T004R10_A132BarCodReo ;
   private String[] T004R10_A130BarCodPar ;
   private short[] T004R10_A2808RecLinMAL ;
   private byte[] T004R10_A1377RecNumAny ;
   private String[] T004R10_A719PrdNum ;
   private String[] T004R11_A396EmprCod ;
   private int[] T004R11_A129BarCod ;
   private byte[] T004R11_A132BarCodReo ;
   private String[] T004R11_A130BarCodPar ;
   private short[] T004R11_A2808RecLinMAL ;
   private byte[] T004R11_A1377RecNumAny ;
   private String[] T004R11_A719PrdNum ;
   private short[] T004R2_A2808RecLinMAL ;
   private byte[] T004R2_A1377RecNumAny ;
   private java.math.BigDecimal[] T004R2_A1378PrdCFin ;
   private boolean[] T004R2_n1378PrdCFin ;
   private String[] T004R2_A3380LanyPrd ;
   private boolean[] T004R2_n3380LanyPrd ;
   private java.math.BigDecimal[] T004R2_A3381LanyCan ;
   private boolean[] T004R2_n3381LanyCan ;
   private byte[] T004R2_A3382LanyNro ;
   private boolean[] T004R2_n3382LanyNro ;
   private byte[] T004R2_A3383LanyTnq ;
   private boolean[] T004R2_n3383LanyTnq ;
   private String[] T004R2_A4578LanyUsr ;
   private boolean[] T004R2_n4578LanyUsr ;
   private java.util.Date[] T004R2_A4579LanyFec ;
   private boolean[] T004R2_n4579LanyFec ;
   private String[] T004R2_A5807LanyLote ;
   private boolean[] T004R2_n5807LanyLote ;
   private java.math.BigDecimal[] T004R2_A12705LanyCtd ;
   private boolean[] T004R2_n12705LanyCtd ;
   private String[] T004R2_A12706LanyUnd ;
   private boolean[] T004R2_n12706LanyUnd ;
   private java.util.Date[] T004R2_A13939LanyLoteFc ;
   private String[] T004R2_A396EmprCod ;
   private int[] T004R2_A129BarCod ;
   private byte[] T004R2_A132BarCodReo ;
   private String[] T004R2_A130BarCodPar ;
   private String[] T004R2_A719PrdNum ;
   private String[] T004R15_A718PrdNom ;
   private String[] T004R16_A396EmprCod ;
   private int[] T004R16_A129BarCod ;
   private byte[] T004R16_A132BarCodReo ;
   private String[] T004R16_A130BarCodPar ;
   private short[] T004R16_A2808RecLinMAL ;
   private byte[] T004R16_A1377RecNumAny ;
   private String[] T004R16_A719PrdNum ;
   private String[] T004R17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlanyad__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlanyad__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlanyad__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlanyad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T004R2", "SELECT RecLinMAL, RecNumAny, PrdCFin, LanyPrd, LanyCan, LanyNro, LanyTnq, LanyUsr, LanyFec, LanyLote, LanyCtd, LanyUnd, LanyLoteFc, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ?  FOR UPDATE OF PrdCFin, LanyPrd, LanyCan, LanyNro, LanyTnq, LanyUsr, LanyFec, LanyLote, LanyCtd, LanyUnd, LanyLoteFc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R3", "SELECT RecLinMAL, RecNumAny, PrdCFin, LanyPrd, LanyCan, LanyNro, LanyTnq, LanyUsr, LanyFec, LanyLote, LanyCtd, LanyUnd, LanyLoteFc, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R4", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R5", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R6", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecLinMAL, TM1.RecNumAny, T2.PrdNom, TM1.PrdCFin, TM1.LanyPrd, TM1.LanyCan, TM1.LanyNro, TM1.LanyTnq, TM1.LanyUsr, TM1.LanyFec, TM1.LanyLote, TM1.LanyCtd, TM1.LanyUnd, TM1.LanyLoteFc, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.PrdNum FROM (TXPLANYAD TM1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMAL = ? and TM1.RecNumAny = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMAL, TM1.RecNumAny, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R8", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMAL > ? or RecLinMAL = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecNumAny > ? or RecNumAny = ? and RecLinMAL = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T004R11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMAL < ? or RecLinMAL = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecNumAny < ? or RecNumAny = ? and RecLinMAL = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMAL DESC, RecNumAny DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T004R12", "INSERT INTO TXPLANYAD(RecLinMAL, RecNumAny, PrdCFin, LanyPrd, LanyCan, LanyNro, LanyTnq, LanyUsr, LanyFec, LanyLote, LanyCtd, LanyUnd, LanyLoteFc, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLANYAD")
         ,new UpdateCursor("T004R13", "UPDATE TXPLANYAD SET PrdCFin=?, LanyPrd=?, LanyCan=?, LanyNro=?, LanyTnq=?, LanyUsr=?, LanyFec=?, LanyLote=?, LanyCtd=?, LanyUnd=?, LanyLoteFc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ?", GX_NOMASK, "TXPLANYAD")
         ,new UpdateCursor("T004R14", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ?", GX_NOMASK, "TXPLANYAD")
         ,new ForEachCursor("T004R15", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004R17", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(13);
               ((String[]) buf[23])[0] = rslt.getString(14, 3);
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((String[]) buf[26])[0] = rslt.getString(17, 1);
               ((String[]) buf[27])[0] = rslt.getString(18, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(13);
               ((String[]) buf[23])[0] = rslt.getString(14, 3);
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((String[]) buf[26])[0] = rslt.getString(17, 1);
               ((String[]) buf[27])[0] = rslt.getString(18, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 3);
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((String[]) buf[27])[0] = rslt.getString(18, 1);
               ((String[]) buf[28])[0] = rslt.getString(19, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 15 :
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
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
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 6);
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
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 6);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 26);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 1);
               }
               stmt.setDate(13, (java.util.Date)parms[22]);
               stmt.setString(14, (String)parms[23], 3);
               stmt.setInt(15, ((Number) parms[24]).intValue());
               stmt.setByte(16, ((Number) parms[25]).byteValue());
               stmt.setString(17, (String)parms[26], 1);
               stmt.setString(18, (String)parms[27], 6);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 3);
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
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 26);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               stmt.setDate(11, (java.util.Date)parms[20]);
               stmt.setString(12, (String)parms[21], 3);
               stmt.setInt(13, ((Number) parms[22]).intValue());
               stmt.setByte(14, ((Number) parms[23]).byteValue());
               stmt.setString(15, (String)parms[24], 1);
               stmt.setShort(16, ((Number) parms[25]).shortValue());
               stmt.setByte(17, ((Number) parms[26]).byteValue());
               stmt.setString(18, (String)parms[27], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

