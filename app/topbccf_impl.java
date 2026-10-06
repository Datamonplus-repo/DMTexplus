package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class topbccf_impl extends GXDataArea
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
         A13465BCNumeroOP = (int)(GXutil.lval( httpContext.GetPar( "BCNumeroOP"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A13465BCNumeroOP) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OP_Costes_Detail", ""), (short)(0)) ;
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

   public topbccf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public topbccf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( topbccf_impl.class ));
   }

   public topbccf_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOPBCCF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "NumeroOP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCNumeroOP_Internalname, GXutil.ltrim( localUtil.ntoc( A13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCNumeroOP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCNumeroOP_Jsonclick, 0, "", "", "", "", "", 1, edtBCNumeroOP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Orden", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A13562BCCFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCFOrden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13562BCCFOrden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13562BCCFOrden), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFOrden_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFOrden_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFFase_Internalname, GXutil.rtrim( A13563BCCFFase), GXutil.rtrim( localUtil.format( A13563BCCFFase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFFase_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Coste", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFCoste_Internalname, GXutil.ltrim( localUtil.ntoc( A13564BCCFCoste, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCFCoste_Enabled!=0) ? localUtil.format( A13564BCCFCoste, "ZZZZZZ9.99999") : localUtil.format( A13564BCCFCoste, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFCoste_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFCoste_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Procesado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFProces_Internalname, GXutil.ltrim( localUtil.ntoc( A13565BCCFProces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCFProces_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13565BCCFProces), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13565BCCFProces), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFProces_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFProces_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Error", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFError_Internalname, GXutil.ltrim( localUtil.ntoc( A13566BCCFError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCFError_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13566BCCFError), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13566BCCFError), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFError_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFError_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción error", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCCFDescEr_Internalname, A13567BCCFDescEr, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", (short)(0), 1, edtBCCFDescEr_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha y Hora errror", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCCFErrFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCFErrFec_Internalname, localUtil.ttoc( A13568BCCFErrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13568BCCFErrFec, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCFErrFec_Jsonclick, 0, "", "", "", "", "", 1, edtBCCFErrFec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCCFErrFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCCFErrFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOPBCCF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Pila error", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCCFPilaEr_Internalname, A13569BCCFPilaEr, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtBCCFPilaEr_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TOPBCCF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TOPBCCF.htm");
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
      e111OJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( "Z13465BCNumeroOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13562BCCFOrden = (short)(localUtil.ctol( httpContext.cgiGet( "Z13562BCCFOrden"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13563BCCFFase = httpContext.cgiGet( "Z13563BCCFFase") ;
            Z13564BCCFCoste = localUtil.ctond( httpContext.cgiGet( "Z13564BCCFCoste")) ;
            Z13565BCCFProces = (short)(localUtil.ctol( httpContext.cgiGet( "Z13565BCCFProces"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13566BCCFError = (short)(localUtil.ctol( httpContext.cgiGet( "Z13566BCCFError"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13567BCCFDescEr = httpContext.cgiGet( "Z13567BCCFDescEr") ;
            Z13568BCCFErrFec = localUtil.ctot( httpContext.cgiGet( "Z13568BCCFErrFec"), 0) ;
            Z13569BCCFPilaEr = httpContext.cgiGet( "Z13569BCCFPilaEr") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCNUMEROOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13465BCNumeroOP = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            else
            {
               A13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCFORDEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCFOrden_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13562BCCFOrden = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
            }
            else
            {
               A13562BCCFOrden = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
            }
            A13563BCCFFase = httpContext.cgiGet( edtBCCFFase_Internalname) ;
            n13563BCCFFase = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13563BCCFFase", A13563BCCFFase);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCCFCoste_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCCFCoste_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCFCOSTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCFCoste_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13564BCCFCoste = DecimalUtil.ZERO ;
               n13564BCCFCoste = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrimstr( A13564BCCFCoste, 13, 5));
            }
            else
            {
               A13564BCCFCoste = localUtil.ctond( httpContext.cgiGet( edtBCCFCoste_Internalname)) ;
               n13564BCCFCoste = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrimstr( A13564BCCFCoste, 13, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCFPROCES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCFProces_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13565BCCFProces = (short)(0) ;
               n13565BCCFProces = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13565BCCFProces), 4, 0));
            }
            else
            {
               A13565BCCFProces = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCFProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13565BCCFProces = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13565BCCFProces), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCFError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCFERROR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCFError_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13566BCCFError = (short)(0) ;
               n13566BCCFError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13566BCCFError), 4, 0));
            }
            else
            {
               A13566BCCFError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCFError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13566BCCFError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13566BCCFError), 4, 0));
            }
            A13567BCCFDescEr = httpContext.cgiGet( edtBCCFDescEr_Internalname) ;
            n13567BCCFDescEr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13567BCCFDescEr", A13567BCCFDescEr);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBCCFErrFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BCCFERRFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCFErrFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
               n13568BCCFErrFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13568BCCFErrFec = localUtil.ctot( httpContext.cgiGet( edtBCCFErrFec_Internalname)) ;
               n13568BCCFErrFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A13569BCCFPilaEr = httpContext.cgiGet( edtBCCFPilaEr_Internalname) ;
            n13569BCCFPilaEr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13569BCCFPilaEr", A13569BCCFPilaEr);
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
               A13465BCNumeroOP = (int)(GXutil.lval( httpContext.GetPar( "BCNumeroOP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
               A13562BCCFOrden = (short)(GXutil.lval( httpContext.GetPar( "BCCFOrden"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
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
                        e111OJ2 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1OJ1855( ) ;
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
      disableAttributes1OJ1855( ) ;
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

   public void confirm_1OJ0( )
   {
      beforeValidate1OJ1855( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OJ1855( ) ;
         }
         else
         {
            checkExtendedTable1OJ1855( ) ;
            if ( AnyError == 0 )
            {
               zm1OJ1855( 2) ;
               zm1OJ1855( 3) ;
            }
            closeExtendedTableCursors1OJ1855( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1OJ0( ) ;
      }
   }

   public void resetCaption1OJ0( )
   {
   }

   public void e111OJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      topbccf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      topbccf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      topbccf_impl.this.AV10EmprCod = GXv_char2[0] ;
      topbccf_impl.this.AV11EmprNom = GXv_char3[0] ;
      topbccf_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OJ1855( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13563BCCFFase = T01OJ3_A13563BCCFFase[0] ;
            Z13564BCCFCoste = T01OJ3_A13564BCCFCoste[0] ;
            Z13565BCCFProces = T01OJ3_A13565BCCFProces[0] ;
            Z13566BCCFError = T01OJ3_A13566BCCFError[0] ;
            Z13567BCCFDescEr = T01OJ3_A13567BCCFDescEr[0] ;
            Z13568BCCFErrFec = T01OJ3_A13568BCCFErrFec[0] ;
            Z13569BCCFPilaEr = T01OJ3_A13569BCCFPilaEr[0] ;
         }
         else
         {
            Z13563BCCFFase = A13563BCCFFase ;
            Z13564BCCFCoste = A13564BCCFCoste ;
            Z13565BCCFProces = A13565BCCFProces ;
            Z13566BCCFError = A13566BCCFError ;
            Z13567BCCFDescEr = A13567BCCFDescEr ;
            Z13568BCCFErrFec = A13568BCCFErrFec ;
            Z13569BCCFPilaEr = A13569BCCFPilaEr ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13562BCCFOrden = A13562BCCFOrden ;
         Z13563BCCFFase = A13563BCCFFase ;
         Z13564BCCFCoste = A13564BCCFCoste ;
         Z13565BCCFProces = A13565BCCFProces ;
         Z13566BCCFError = A13566BCCFError ;
         Z13567BCCFDescEr = A13567BCCFDescEr ;
         Z13568BCCFErrFec = A13568BCCFErrFec ;
         Z13569BCCFPilaEr = A13569BCCFPilaEr ;
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1OJ1855( )
   {
      /* Using cursor T01OJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1855 = (short)(1) ;
         A407EmprNom = T01OJ6_A407EmprNom[0] ;
         n407EmprNom = T01OJ6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13563BCCFFase = T01OJ6_A13563BCCFFase[0] ;
         n13563BCCFFase = T01OJ6_n13563BCCFFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13563BCCFFase", A13563BCCFFase);
         A13564BCCFCoste = T01OJ6_A13564BCCFCoste[0] ;
         n13564BCCFCoste = T01OJ6_n13564BCCFCoste[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrimstr( A13564BCCFCoste, 13, 5));
         A13565BCCFProces = T01OJ6_A13565BCCFProces[0] ;
         n13565BCCFProces = T01OJ6_n13565BCCFProces[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13565BCCFProces), 4, 0));
         A13566BCCFError = T01OJ6_A13566BCCFError[0] ;
         n13566BCCFError = T01OJ6_n13566BCCFError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13566BCCFError), 4, 0));
         A13567BCCFDescEr = T01OJ6_A13567BCCFDescEr[0] ;
         n13567BCCFDescEr = T01OJ6_n13567BCCFDescEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13567BCCFDescEr", A13567BCCFDescEr);
         A13568BCCFErrFec = T01OJ6_A13568BCCFErrFec[0] ;
         n13568BCCFErrFec = T01OJ6_n13568BCCFErrFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13569BCCFPilaEr = T01OJ6_A13569BCCFPilaEr[0] ;
         n13569BCCFPilaEr = T01OJ6_n13569BCCFPilaEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13569BCCFPilaEr", A13569BCCFPilaEr);
         zm1OJ1855( -1) ;
      }
      pr_default.close(4);
      onLoadActions1OJ1855( ) ;
   }

   public void onLoadActions1OJ1855( )
   {
   }

   public void checkExtendedTable1OJ1855( )
   {
      nIsDirty_1855 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01OJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01OJ4_A407EmprNom[0] ;
      n407EmprNom = T01OJ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01OJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1OJ1855( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01OJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01OJ7_A407EmprNom[0] ;
      n407EmprNom = T01OJ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         int A13465BCNumeroOP )
   {
      /* Using cursor T01OJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
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

   public void getKey1OJ1855( )
   {
      /* Using cursor T01OJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1855 = (short)(1) ;
      }
      else
      {
         RcdFound1855 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1OJ1855( 1) ;
         RcdFound1855 = (short)(1) ;
         A13562BCCFOrden = T01OJ3_A13562BCCFOrden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
         A13563BCCFFase = T01OJ3_A13563BCCFFase[0] ;
         n13563BCCFFase = T01OJ3_n13563BCCFFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13563BCCFFase", A13563BCCFFase);
         A13564BCCFCoste = T01OJ3_A13564BCCFCoste[0] ;
         n13564BCCFCoste = T01OJ3_n13564BCCFCoste[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrimstr( A13564BCCFCoste, 13, 5));
         A13565BCCFProces = T01OJ3_A13565BCCFProces[0] ;
         n13565BCCFProces = T01OJ3_n13565BCCFProces[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13565BCCFProces), 4, 0));
         A13566BCCFError = T01OJ3_A13566BCCFError[0] ;
         n13566BCCFError = T01OJ3_n13566BCCFError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13566BCCFError), 4, 0));
         A13567BCCFDescEr = T01OJ3_A13567BCCFDescEr[0] ;
         n13567BCCFDescEr = T01OJ3_n13567BCCFDescEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13567BCCFDescEr", A13567BCCFDescEr);
         A13568BCCFErrFec = T01OJ3_A13568BCCFErrFec[0] ;
         n13568BCCFErrFec = T01OJ3_n13568BCCFErrFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13569BCCFPilaEr = T01OJ3_A13569BCCFPilaEr[0] ;
         n13569BCCFPilaEr = T01OJ3_n13569BCCFPilaEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13569BCCFPilaEr", A13569BCCFPilaEr);
         A396EmprCod = T01OJ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13465BCNumeroOP = T01OJ3_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13562BCCFOrden = A13562BCCFOrden ;
         sMode1855 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OJ1855( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1855 = (short)(0) ;
            initializeNonKey1OJ1855( ) ;
         }
         Gx_mode = sMode1855 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1855 = (short)(0) ;
         initializeNonKey1OJ1855( ) ;
         sMode1855 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1855 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OJ1855( ) ;
      if ( RcdFound1855 == 0 )
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
      RcdFound1855 = (short)(0) ;
      /* Using cursor T01OJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Integer.valueOf(A13465BCNumeroOP), A396EmprCod, Short.valueOf(A13562BCCFOrden)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ10_A13465BCNumeroOP[0] < A13465BCNumeroOP ) || ( T01OJ10_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ10_A13562BCCFOrden[0] < A13562BCCFOrden ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ10_A13465BCNumeroOP[0] > A13465BCNumeroOP ) || ( T01OJ10_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( GXutil.strcmp(T01OJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ10_A13562BCCFOrden[0] > A13562BCCFOrden ) ) )
         {
            A396EmprCod = T01OJ10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13465BCNumeroOP = T01OJ10_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13562BCCFOrden = T01OJ10_A13562BCCFOrden[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
            RcdFound1855 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1855 = (short)(0) ;
      /* Using cursor T01OJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Integer.valueOf(A13465BCNumeroOP), A396EmprCod, Short.valueOf(A13562BCCFOrden)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ11_A13465BCNumeroOP[0] > A13465BCNumeroOP ) || ( T01OJ11_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ11_A13562BCCFOrden[0] > A13562BCCFOrden ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ11_A13465BCNumeroOP[0] < A13465BCNumeroOP ) || ( T01OJ11_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( GXutil.strcmp(T01OJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01OJ11_A13562BCCFOrden[0] < A13562BCCFOrden ) ) )
         {
            A396EmprCod = T01OJ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13465BCNumeroOP = T01OJ11_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13562BCCFOrden = T01OJ11_A13562BCCFOrden[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
            RcdFound1855 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OJ1855( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OJ1855( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1855 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || ( A13562BCCFOrden != Z13562BCCFOrden ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A13465BCNumeroOP = Z13465BCNumeroOP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
               A13562BCCFOrden = Z13562BCCFOrden ;
               httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
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
               update1OJ1855( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || ( A13562BCCFOrden != Z13562BCCFOrden ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OJ1855( ) ;
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
                  insert1OJ1855( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || ( A13562BCCFOrden != Z13562BCCFOrden ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13465BCNumeroOP = Z13465BCNumeroOP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13562BCCFOrden = Z13562BCCFOrden ;
         httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
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
      getKey1OJ1855( ) ;
      if ( RcdFound1855 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || ( A13562BCCFOrden != Z13562BCCFOrden ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13465BCNumeroOP = Z13465BCNumeroOP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13562BCCFOrden = Z13562BCCFOrden ;
            httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || ( A13562BCCFOrden != Z13562BCCFOrden ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "topbccf");
      GX_FocusControl = edtBCCFFase_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1OJ0( ) ;
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
      if ( RcdFound1855 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBCCFFase_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OJ1855( ) ;
      if ( RcdFound1855 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCFFase_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OJ1855( ) ;
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
      if ( RcdFound1855 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCFFase_Internalname ;
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
      if ( RcdFound1855 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCFFase_Internalname ;
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
      scanStart1OJ1855( ) ;
      if ( RcdFound1855 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1855 != 0 )
         {
            scanNext1OJ1855( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCFFase_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OJ1855( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OJ1855( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCCF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13563BCCFFase, T01OJ2_A13563BCCFFase[0]) != 0 ) || ( DecimalUtil.compareTo(Z13564BCCFCoste, T01OJ2_A13564BCCFCoste[0]) != 0 ) || ( Z13565BCCFProces != T01OJ2_A13565BCCFProces[0] ) || ( Z13566BCCFError != T01OJ2_A13566BCCFError[0] ) || ( GXutil.strcmp(Z13567BCCFDescEr, T01OJ2_A13567BCCFDescEr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z13568BCCFErrFec, T01OJ2_A13568BCCFErrFec[0]) ) || ( GXutil.strcmp(Z13569BCCFPilaEr, T01OJ2_A13569BCCFPilaEr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13563BCCFFase, T01OJ2_A13563BCCFFase[0]) != 0 )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFFase");
               GXutil.writeLogRaw("Old: ",Z13563BCCFFase);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13563BCCFFase[0]);
            }
            if ( DecimalUtil.compareTo(Z13564BCCFCoste, T01OJ2_A13564BCCFCoste[0]) != 0 )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFCoste");
               GXutil.writeLogRaw("Old: ",Z13564BCCFCoste);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13564BCCFCoste[0]);
            }
            if ( Z13565BCCFProces != T01OJ2_A13565BCCFProces[0] )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFProces");
               GXutil.writeLogRaw("Old: ",Z13565BCCFProces);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13565BCCFProces[0]);
            }
            if ( Z13566BCCFError != T01OJ2_A13566BCCFError[0] )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFError");
               GXutil.writeLogRaw("Old: ",Z13566BCCFError);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13566BCCFError[0]);
            }
            if ( GXutil.strcmp(Z13567BCCFDescEr, T01OJ2_A13567BCCFDescEr[0]) != 0 )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFDescEr");
               GXutil.writeLogRaw("Old: ",Z13567BCCFDescEr);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13567BCCFDescEr[0]);
            }
            if ( !( GXutil.dateCompare(Z13568BCCFErrFec, T01OJ2_A13568BCCFErrFec[0]) ) )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFErrFec");
               GXutil.writeLogRaw("Old: ",Z13568BCCFErrFec);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13568BCCFErrFec[0]);
            }
            if ( GXutil.strcmp(Z13569BCCFPilaEr, T01OJ2_A13569BCCFPilaEr[0]) != 0 )
            {
               GXutil.writeLogln("topbccf:[seudo value changed for attri]"+"BCCFPilaEr");
               GXutil.writeLogRaw("Old: ",Z13569BCCFPilaEr);
               GXutil.writeLogRaw("Current: ",T01OJ2_A13569BCCFPilaEr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCCF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OJ1855( )
   {
      beforeValidate1OJ1855( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OJ1855( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OJ1855( 0) ;
         checkOptimisticConcurrency1OJ1855( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OJ1855( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OJ1855( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OJ12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A13562BCCFOrden), Boolean.valueOf(n13563BCCFFase), A13563BCCFFase, Boolean.valueOf(n13564BCCFCoste), A13564BCCFCoste, Boolean.valueOf(n13565BCCFProces), Short.valueOf(A13565BCCFProces), Boolean.valueOf(n13566BCCFError), Short.valueOf(A13566BCCFError), Boolean.valueOf(n13567BCCFDescEr), A13567BCCFDescEr, Boolean.valueOf(n13568BCCFErrFec), A13568BCCFErrFec, Boolean.valueOf(n13569BCCFPilaEr), A13569BCCFPilaEr, A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCF");
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
                        resetCaption1OJ0( ) ;
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
            load1OJ1855( ) ;
         }
         endLevel1OJ1855( ) ;
      }
      closeExtendedTableCursors1OJ1855( ) ;
   }

   public void update1OJ1855( )
   {
      beforeValidate1OJ1855( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OJ1855( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OJ1855( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OJ1855( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OJ1855( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OJ13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13563BCCFFase), A13563BCCFFase, Boolean.valueOf(n13564BCCFCoste), A13564BCCFCoste, Boolean.valueOf(n13565BCCFProces), Short.valueOf(A13565BCCFProces), Boolean.valueOf(n13566BCCFError), Short.valueOf(A13566BCCFError), Boolean.valueOf(n13567BCCFDescEr), A13567BCCFDescEr, Boolean.valueOf(n13568BCCFErrFec), A13568BCCFErrFec, Boolean.valueOf(n13569BCCFPilaEr), A13569BCCFPilaEr, A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCF");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCCF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OJ1855( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1OJ0( ) ;
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
         endLevel1OJ1855( ) ;
      }
      closeExtendedTableCursors1OJ1855( ) ;
   }

   public void deferredUpdate1OJ1855( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OJ1855( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OJ1855( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OJ1855( ) ;
         afterConfirm1OJ1855( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OJ1855( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OJ14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13562BCCFOrden)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCF");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1855 == 0 )
                     {
                        initAll1OJ1855( ) ;
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
                     resetCaption1OJ0( ) ;
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
      sMode1855 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OJ1855( ) ;
      Gx_mode = sMode1855 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OJ1855( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OJ15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01OJ15_A407EmprNom[0] ;
         n407EmprNom = T01OJ15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void endLevel1OJ1855( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OJ1855( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "topbccf");
         if ( AnyError == 0 )
         {
            confirmValues1OJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "topbccf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OJ1855( )
   {
      /* Scan By routine */
      /* Using cursor T01OJ16 */
      pr_default.execute(14);
      RcdFound1855 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1855 = (short)(1) ;
         A396EmprCod = T01OJ16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13465BCNumeroOP = T01OJ16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13562BCCFOrden = T01OJ16_A13562BCCFOrden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OJ1855( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1855 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1855 = (short)(1) ;
         A396EmprCod = T01OJ16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13465BCNumeroOP = T01OJ16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13562BCCFOrden = T01OJ16_A13562BCCFOrden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
      }
   }

   public void scanEnd1OJ1855( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1OJ1855( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OJ1855( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OJ1855( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OJ1855( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OJ1855( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OJ1855( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OJ1855( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBCNumeroOP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCNumeroOP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCNumeroOP_Enabled), 5, 0), true);
      edtBCCFOrden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFOrden_Enabled), 5, 0), true);
      edtBCCFFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFFase_Enabled), 5, 0), true);
      edtBCCFCoste_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFCoste_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFCoste_Enabled), 5, 0), true);
      edtBCCFProces_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFProces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFProces_Enabled), 5, 0), true);
      edtBCCFError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFError_Enabled), 5, 0), true);
      edtBCCFDescEr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFDescEr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFDescEr_Enabled), 5, 0), true);
      edtBCCFErrFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFErrFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFErrFec_Enabled), 5, 0), true);
      edtBCCFPilaEr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFPilaEr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFPilaEr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OJ1855( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OJ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.topbccf", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13562BCCFOrden", GXutil.ltrim( localUtil.ntoc( Z13562BCCFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13563BCCFFase", GXutil.rtrim( Z13563BCCFFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13564BCCFCoste", GXutil.ltrim( localUtil.ntoc( Z13564BCCFCoste, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13565BCCFProces", GXutil.ltrim( localUtil.ntoc( Z13565BCCFProces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13566BCCFError", GXutil.ltrim( localUtil.ntoc( Z13566BCCFError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13567BCCFDescEr", Z13567BCCFDescEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13568BCCFErrFec", localUtil.ttoc( Z13568BCCFErrFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13569BCCFPilaEr", Z13569BCCFPilaEr);
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
      return formatLink("app.topbccf", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOPBCCF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OP_Costes_Detail", "") ;
   }

   public void initializeNonKey1OJ1855( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A13563BCCFFase = "" ;
      n13563BCCFFase = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13563BCCFFase", A13563BCCFFase);
      A13564BCCFCoste = DecimalUtil.ZERO ;
      n13564BCCFCoste = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrimstr( A13564BCCFCoste, 13, 5));
      A13565BCCFProces = (short)(0) ;
      n13565BCCFProces = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13565BCCFProces), 4, 0));
      A13566BCCFError = (short)(0) ;
      n13566BCCFError = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13566BCCFError), 4, 0));
      A13567BCCFDescEr = "" ;
      n13567BCCFDescEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13567BCCFDescEr", A13567BCCFDescEr);
      A13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
      n13568BCCFErrFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13569BCCFPilaEr = "" ;
      n13569BCCFPilaEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13569BCCFPilaEr", A13569BCCFPilaEr);
      Z13563BCCFFase = "" ;
      Z13564BCCFCoste = DecimalUtil.ZERO ;
      Z13565BCCFProces = (short)(0) ;
      Z13566BCCFError = (short)(0) ;
      Z13567BCCFDescEr = "" ;
      Z13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
      Z13569BCCFPilaEr = "" ;
   }

   public void initAll1OJ1855( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13465BCNumeroOP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
      A13562BCCFOrden = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13562BCCFOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13562BCCFOrden), 4, 0));
      initializeNonKey1OJ1855( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104557", true, true);
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
      httpContext.AddJavascriptSource("topbccf.js", "?202682415104557", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBCNumeroOP_Internalname = "BCNUMEROOP" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBCCFOrden_Internalname = "BCCFORDEN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBCCFFase_Internalname = "BCCFFASE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBCCFCoste_Internalname = "BCCFCOSTE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBCCFProces_Internalname = "BCCFPROCES" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBCCFError_Internalname = "BCCFERROR" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBCCFDescEr_Internalname = "BCCFDESCER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBCCFErrFec_Internalname = "BCCFERRFEC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBCCFPilaEr_Internalname = "BCCFPILAER" ;
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
      Form.setCaption( httpContext.getMessage( "OP_Costes_Detail", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBCCFPilaEr_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFPilaEr_Enabled = 1 ;
      edtBCCFErrFec_Jsonclick = "" ;
      edtBCCFErrFec_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFErrFec_Enabled = 1 ;
      edtBCCFDescEr_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFDescEr_Enabled = 1 ;
      edtBCCFError_Jsonclick = "" ;
      edtBCCFError_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFError_Enabled = 1 ;
      edtBCCFProces_Jsonclick = "" ;
      edtBCCFProces_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFProces_Enabled = 1 ;
      edtBCCFCoste_Jsonclick = "" ;
      edtBCCFCoste_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFCoste_Enabled = 1 ;
      edtBCCFFase_Jsonclick = "" ;
      edtBCCFFase_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFFase_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBCCFOrden_Jsonclick = "" ;
      edtBCCFOrden_Backcolor = (int)(0xFFFFFF) ;
      edtBCCFOrden_Enabled = 1 ;
      edtBCNumeroOP_Jsonclick = "" ;
      edtBCNumeroOP_Backcolor = (int)(0xFFFFFF) ;
      edtBCNumeroOP_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      /* Using cursor T01OJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01OJ15_A407EmprNom[0] ;
      n407EmprNom = T01OJ15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01OJ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtBCCFFase_Internalname ;
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
      /* Using cursor T01OJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01OJ15_A407EmprNom[0] ;
      n407EmprNom = T01OJ15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Bcnumeroop( )
   {
      /* Using cursor T01OJ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Bccforden( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13563BCCFFase", GXutil.rtrim( A13563BCCFFase));
      httpContext.ajax_rsp_assign_attri("", false, "A13564BCCFCoste", GXutil.ltrim( localUtil.ntoc( A13564BCCFCoste, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13565BCCFProces", GXutil.ltrim( localUtil.ntoc( A13565BCCFProces, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13566BCCFError", GXutil.ltrim( localUtil.ntoc( A13566BCCFError, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13567BCCFDescEr", A13567BCCFDescEr);
      httpContext.ajax_rsp_assign_attri("", false, "A13568BCCFErrFec", localUtil.ttoc( A13568BCCFErrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13569BCCFPilaEr", A13569BCCFPilaEr);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13562BCCFOrden", GXutil.ltrim( localUtil.ntoc( Z13562BCCFOrden, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13563BCCFFase", GXutil.rtrim( Z13563BCCFFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13564BCCFCoste", GXutil.ltrim( localUtil.ntoc( Z13564BCCFCoste, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13565BCCFProces", GXutil.ltrim( localUtil.ntoc( Z13565BCCFProces, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13566BCCFError", GXutil.ltrim( localUtil.ntoc( Z13566BCCFError, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13567BCCFDescEr", Z13567BCCFDescEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13568BCCFErrFec", localUtil.ttoc( Z13568BCCFErrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13569BCCFPilaEr", Z13569BCCFPilaEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_BCNUMEROOP","{handler:'valid_Bcnumeroop',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13465BCNumeroOP',fld:'BCNUMEROOP',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_BCNUMEROOP",",oparms:[]}");
      setEventMetadata("VALID_BCCFORDEN","{handler:'valid_Bccforden',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13465BCNumeroOP',fld:'BCNUMEROOP',pic:'ZZZZZZZ9'},{av:'A13562BCCFOrden',fld:'BCCFORDEN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BCCFORDEN",",oparms:[{av:'A13563BCCFFase',fld:'BCCFFASE',pic:''},{av:'A13564BCCFCoste',fld:'BCCFCOSTE',pic:'ZZZZZZ9.99999'},{av:'A13565BCCFProces',fld:'BCCFPROCES',pic:'ZZZ9'},{av:'A13566BCCFError',fld:'BCCFERROR',pic:'ZZZ9'},{av:'A13567BCCFDescEr',fld:'BCCFDESCER',pic:''},{av:'A13568BCCFErrFec',fld:'BCCFERRFEC',pic:'99/99/99 99:99'},{av:'A13569BCCFPilaEr',fld:'BCCFPILAER',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13465BCNumeroOP'},{av:'Z13562BCCFOrden'},{av:'Z13563BCCFFase'},{av:'Z13564BCCFCoste'},{av:'Z13565BCCFProces'},{av:'Z13566BCCFError'},{av:'Z13567BCCFDescEr'},{av:'Z13568BCCFErrFec'},{av:'Z13569BCCFPilaEr'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(13);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13563BCCFFase = "" ;
      Z13564BCCFCoste = DecimalUtil.ZERO ;
      Z13567BCCFDescEr = "" ;
      Z13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
      Z13569BCCFPilaEr = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A13563BCCFFase = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13564BCCFCoste = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A13567BCCFDescEr = "" ;
      lblTextblock10_Jsonclick = "" ;
      A13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock11_Jsonclick = "" ;
      A13569BCCFPilaEr = "" ;
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
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01OJ6_A13562BCCFOrden = new short[1] ;
      T01OJ6_A407EmprNom = new String[] {""} ;
      T01OJ6_n407EmprNom = new boolean[] {false} ;
      T01OJ6_A13563BCCFFase = new String[] {""} ;
      T01OJ6_n13563BCCFFase = new boolean[] {false} ;
      T01OJ6_A13564BCCFCoste = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OJ6_n13564BCCFCoste = new boolean[] {false} ;
      T01OJ6_A13565BCCFProces = new short[1] ;
      T01OJ6_n13565BCCFProces = new boolean[] {false} ;
      T01OJ6_A13566BCCFError = new short[1] ;
      T01OJ6_n13566BCCFError = new boolean[] {false} ;
      T01OJ6_A13567BCCFDescEr = new String[] {""} ;
      T01OJ6_n13567BCCFDescEr = new boolean[] {false} ;
      T01OJ6_A13568BCCFErrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OJ6_n13568BCCFErrFec = new boolean[] {false} ;
      T01OJ6_A13569BCCFPilaEr = new String[] {""} ;
      T01OJ6_n13569BCCFPilaEr = new boolean[] {false} ;
      T01OJ6_A396EmprCod = new String[] {""} ;
      T01OJ6_A13465BCNumeroOP = new int[1] ;
      T01OJ4_A407EmprNom = new String[] {""} ;
      T01OJ4_n407EmprNom = new boolean[] {false} ;
      T01OJ5_A396EmprCod = new String[] {""} ;
      T01OJ7_A407EmprNom = new String[] {""} ;
      T01OJ7_n407EmprNom = new boolean[] {false} ;
      T01OJ8_A396EmprCod = new String[] {""} ;
      T01OJ9_A396EmprCod = new String[] {""} ;
      T01OJ9_A13465BCNumeroOP = new int[1] ;
      T01OJ9_A13562BCCFOrden = new short[1] ;
      T01OJ3_A13562BCCFOrden = new short[1] ;
      T01OJ3_A13563BCCFFase = new String[] {""} ;
      T01OJ3_n13563BCCFFase = new boolean[] {false} ;
      T01OJ3_A13564BCCFCoste = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OJ3_n13564BCCFCoste = new boolean[] {false} ;
      T01OJ3_A13565BCCFProces = new short[1] ;
      T01OJ3_n13565BCCFProces = new boolean[] {false} ;
      T01OJ3_A13566BCCFError = new short[1] ;
      T01OJ3_n13566BCCFError = new boolean[] {false} ;
      T01OJ3_A13567BCCFDescEr = new String[] {""} ;
      T01OJ3_n13567BCCFDescEr = new boolean[] {false} ;
      T01OJ3_A13568BCCFErrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OJ3_n13568BCCFErrFec = new boolean[] {false} ;
      T01OJ3_A13569BCCFPilaEr = new String[] {""} ;
      T01OJ3_n13569BCCFPilaEr = new boolean[] {false} ;
      T01OJ3_A396EmprCod = new String[] {""} ;
      T01OJ3_A13465BCNumeroOP = new int[1] ;
      sMode1855 = "" ;
      T01OJ10_A396EmprCod = new String[] {""} ;
      T01OJ10_A13465BCNumeroOP = new int[1] ;
      T01OJ10_A13562BCCFOrden = new short[1] ;
      T01OJ11_A396EmprCod = new String[] {""} ;
      T01OJ11_A13465BCNumeroOP = new int[1] ;
      T01OJ11_A13562BCCFOrden = new short[1] ;
      T01OJ2_A13562BCCFOrden = new short[1] ;
      T01OJ2_A13563BCCFFase = new String[] {""} ;
      T01OJ2_n13563BCCFFase = new boolean[] {false} ;
      T01OJ2_A13564BCCFCoste = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OJ2_n13564BCCFCoste = new boolean[] {false} ;
      T01OJ2_A13565BCCFProces = new short[1] ;
      T01OJ2_n13565BCCFProces = new boolean[] {false} ;
      T01OJ2_A13566BCCFError = new short[1] ;
      T01OJ2_n13566BCCFError = new boolean[] {false} ;
      T01OJ2_A13567BCCFDescEr = new String[] {""} ;
      T01OJ2_n13567BCCFDescEr = new boolean[] {false} ;
      T01OJ2_A13568BCCFErrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OJ2_n13568BCCFErrFec = new boolean[] {false} ;
      T01OJ2_A13569BCCFPilaEr = new String[] {""} ;
      T01OJ2_n13569BCCFPilaEr = new boolean[] {false} ;
      T01OJ2_A396EmprCod = new String[] {""} ;
      T01OJ2_A13465BCNumeroOP = new int[1] ;
      T01OJ15_A407EmprNom = new String[] {""} ;
      T01OJ15_n407EmprNom = new boolean[] {false} ;
      T01OJ16_A396EmprCod = new String[] {""} ;
      T01OJ16_A13465BCNumeroOP = new int[1] ;
      T01OJ16_A13562BCCFOrden = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01OJ17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ13563BCCFFase = "" ;
      ZZ13564BCCFCoste = DecimalUtil.ZERO ;
      ZZ13567BCCFDescEr = "" ;
      ZZ13568BCCFErrFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ13569BCCFPilaEr = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.topbccf__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.topbccf__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.topbccf__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.topbccf__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.topbccf__default(),
         new Object[] {
             new Object[] {
            T01OJ2_A13562BCCFOrden, T01OJ2_A13563BCCFFase, T01OJ2_n13563BCCFFase, T01OJ2_A13564BCCFCoste, T01OJ2_n13564BCCFCoste, T01OJ2_A13565BCCFProces, T01OJ2_n13565BCCFProces, T01OJ2_A13566BCCFError, T01OJ2_n13566BCCFError, T01OJ2_A13567BCCFDescEr,
            T01OJ2_n13567BCCFDescEr, T01OJ2_A13568BCCFErrFec, T01OJ2_n13568BCCFErrFec, T01OJ2_A13569BCCFPilaEr, T01OJ2_n13569BCCFPilaEr, T01OJ2_A396EmprCod, T01OJ2_A13465BCNumeroOP
            }
            , new Object[] {
            T01OJ3_A13562BCCFOrden, T01OJ3_A13563BCCFFase, T01OJ3_n13563BCCFFase, T01OJ3_A13564BCCFCoste, T01OJ3_n13564BCCFCoste, T01OJ3_A13565BCCFProces, T01OJ3_n13565BCCFProces, T01OJ3_A13566BCCFError, T01OJ3_n13566BCCFError, T01OJ3_A13567BCCFDescEr,
            T01OJ3_n13567BCCFDescEr, T01OJ3_A13568BCCFErrFec, T01OJ3_n13568BCCFErrFec, T01OJ3_A13569BCCFPilaEr, T01OJ3_n13569BCCFPilaEr, T01OJ3_A396EmprCod, T01OJ3_A13465BCNumeroOP
            }
            , new Object[] {
            T01OJ4_A407EmprNom, T01OJ4_n407EmprNom
            }
            , new Object[] {
            T01OJ5_A396EmprCod
            }
            , new Object[] {
            T01OJ6_A13562BCCFOrden, T01OJ6_A407EmprNom, T01OJ6_n407EmprNom, T01OJ6_A13563BCCFFase, T01OJ6_n13563BCCFFase, T01OJ6_A13564BCCFCoste, T01OJ6_n13564BCCFCoste, T01OJ6_A13565BCCFProces, T01OJ6_n13565BCCFProces, T01OJ6_A13566BCCFError,
            T01OJ6_n13566BCCFError, T01OJ6_A13567BCCFDescEr, T01OJ6_n13567BCCFDescEr, T01OJ6_A13568BCCFErrFec, T01OJ6_n13568BCCFErrFec, T01OJ6_A13569BCCFPilaEr, T01OJ6_n13569BCCFPilaEr, T01OJ6_A396EmprCod, T01OJ6_A13465BCNumeroOP
            }
            , new Object[] {
            T01OJ7_A407EmprNom, T01OJ7_n407EmprNom
            }
            , new Object[] {
            T01OJ8_A396EmprCod
            }
            , new Object[] {
            T01OJ9_A396EmprCod, T01OJ9_A13465BCNumeroOP, T01OJ9_A13562BCCFOrden
            }
            , new Object[] {
            T01OJ10_A396EmprCod, T01OJ10_A13465BCNumeroOP, T01OJ10_A13562BCCFOrden
            }
            , new Object[] {
            T01OJ11_A396EmprCod, T01OJ11_A13465BCNumeroOP, T01OJ11_A13562BCCFOrden
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OJ15_A407EmprNom, T01OJ15_n407EmprNom
            }
            , new Object[] {
            T01OJ16_A396EmprCod, T01OJ16_A13465BCNumeroOP, T01OJ16_A13562BCCFOrden
            }
            , new Object[] {
            T01OJ17_A396EmprCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13562BCCFOrden ;
   private short Z13565BCCFProces ;
   private short Z13566BCCFError ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13562BCCFOrden ;
   private short A13565BCCFProces ;
   private short A13566BCCFError ;
   private short RcdFound1855 ;
   private short nIsDirty_1855 ;
   private short ZZ13562BCCFOrden ;
   private short ZZ13565BCCFProces ;
   private short ZZ13566BCCFError ;
   private int Z13465BCNumeroOP ;
   private int A13465BCNumeroOP ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBCNumeroOP_Enabled ;
   private int edtBCCFOrden_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBCCFFase_Enabled ;
   private int edtBCCFCoste_Enabled ;
   private int edtBCCFProces_Enabled ;
   private int edtBCCFError_Enabled ;
   private int edtBCCFDescEr_Enabled ;
   private int edtBCCFErrFec_Enabled ;
   private int edtBCCFPilaEr_Enabled ;
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
   private int edtBCCFPilaEr_Backcolor ;
   private int edtBCCFErrFec_Backcolor ;
   private int edtBCCFDescEr_Backcolor ;
   private int edtBCCFError_Backcolor ;
   private int edtBCCFProces_Backcolor ;
   private int edtBCCFCoste_Backcolor ;
   private int edtBCCFFase_Backcolor ;
   private int edtBCCFOrden_Backcolor ;
   private int edtBCNumeroOP_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13465BCNumeroOP ;
   private java.math.BigDecimal Z13564BCCFCoste ;
   private java.math.BigDecimal A13564BCCFCoste ;
   private java.math.BigDecimal ZZ13564BCCFCoste ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13563BCCFFase ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBCNumeroOP_Internalname ;
   private String edtBCNumeroOP_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBCCFOrden_Internalname ;
   private String edtBCCFOrden_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBCCFFase_Internalname ;
   private String A13563BCCFFase ;
   private String edtBCCFFase_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBCCFCoste_Internalname ;
   private String edtBCCFCoste_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBCCFProces_Internalname ;
   private String edtBCCFProces_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBCCFError_Internalname ;
   private String edtBCCFError_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBCCFDescEr_Internalname ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBCCFErrFec_Internalname ;
   private String edtBCCFErrFec_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBCCFPilaEr_Internalname ;
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
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode1855 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ13563BCCFFase ;
   private String ZZ407EmprNom ;
   private java.util.Date Z13568BCCFErrFec ;
   private java.util.Date A13568BCCFErrFec ;
   private java.util.Date ZZ13568BCCFErrFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n13563BCCFFase ;
   private boolean n13564BCCFCoste ;
   private boolean n13565BCCFProces ;
   private boolean n13566BCCFError ;
   private boolean n13567BCCFDescEr ;
   private boolean n13568BCCFErrFec ;
   private boolean n13569BCCFPilaEr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13567BCCFDescEr ;
   private String Z13569BCCFPilaEr ;
   private String A13567BCCFDescEr ;
   private String A13569BCCFPilaEr ;
   private String ZZ13567BCCFDescEr ;
   private String ZZ13569BCCFPilaEr ;
   private IDataStoreProvider pr_default ;
   private short[] T01OJ6_A13562BCCFOrden ;
   private String[] T01OJ6_A407EmprNom ;
   private boolean[] T01OJ6_n407EmprNom ;
   private String[] T01OJ6_A13563BCCFFase ;
   private boolean[] T01OJ6_n13563BCCFFase ;
   private java.math.BigDecimal[] T01OJ6_A13564BCCFCoste ;
   private boolean[] T01OJ6_n13564BCCFCoste ;
   private short[] T01OJ6_A13565BCCFProces ;
   private boolean[] T01OJ6_n13565BCCFProces ;
   private short[] T01OJ6_A13566BCCFError ;
   private boolean[] T01OJ6_n13566BCCFError ;
   private String[] T01OJ6_A13567BCCFDescEr ;
   private boolean[] T01OJ6_n13567BCCFDescEr ;
   private java.util.Date[] T01OJ6_A13568BCCFErrFec ;
   private boolean[] T01OJ6_n13568BCCFErrFec ;
   private String[] T01OJ6_A13569BCCFPilaEr ;
   private boolean[] T01OJ6_n13569BCCFPilaEr ;
   private String[] T01OJ6_A396EmprCod ;
   private int[] T01OJ6_A13465BCNumeroOP ;
   private String[] T01OJ4_A407EmprNom ;
   private boolean[] T01OJ4_n407EmprNom ;
   private String[] T01OJ5_A396EmprCod ;
   private String[] T01OJ7_A407EmprNom ;
   private boolean[] T01OJ7_n407EmprNom ;
   private String[] T01OJ8_A396EmprCod ;
   private String[] T01OJ9_A396EmprCod ;
   private int[] T01OJ9_A13465BCNumeroOP ;
   private short[] T01OJ9_A13562BCCFOrden ;
   private short[] T01OJ3_A13562BCCFOrden ;
   private String[] T01OJ3_A13563BCCFFase ;
   private boolean[] T01OJ3_n13563BCCFFase ;
   private java.math.BigDecimal[] T01OJ3_A13564BCCFCoste ;
   private boolean[] T01OJ3_n13564BCCFCoste ;
   private short[] T01OJ3_A13565BCCFProces ;
   private boolean[] T01OJ3_n13565BCCFProces ;
   private short[] T01OJ3_A13566BCCFError ;
   private boolean[] T01OJ3_n13566BCCFError ;
   private String[] T01OJ3_A13567BCCFDescEr ;
   private boolean[] T01OJ3_n13567BCCFDescEr ;
   private java.util.Date[] T01OJ3_A13568BCCFErrFec ;
   private boolean[] T01OJ3_n13568BCCFErrFec ;
   private String[] T01OJ3_A13569BCCFPilaEr ;
   private boolean[] T01OJ3_n13569BCCFPilaEr ;
   private String[] T01OJ3_A396EmprCod ;
   private int[] T01OJ3_A13465BCNumeroOP ;
   private String[] T01OJ10_A396EmprCod ;
   private int[] T01OJ10_A13465BCNumeroOP ;
   private short[] T01OJ10_A13562BCCFOrden ;
   private String[] T01OJ11_A396EmprCod ;
   private int[] T01OJ11_A13465BCNumeroOP ;
   private short[] T01OJ11_A13562BCCFOrden ;
   private short[] T01OJ2_A13562BCCFOrden ;
   private String[] T01OJ2_A13563BCCFFase ;
   private boolean[] T01OJ2_n13563BCCFFase ;
   private java.math.BigDecimal[] T01OJ2_A13564BCCFCoste ;
   private boolean[] T01OJ2_n13564BCCFCoste ;
   private short[] T01OJ2_A13565BCCFProces ;
   private boolean[] T01OJ2_n13565BCCFProces ;
   private short[] T01OJ2_A13566BCCFError ;
   private boolean[] T01OJ2_n13566BCCFError ;
   private String[] T01OJ2_A13567BCCFDescEr ;
   private boolean[] T01OJ2_n13567BCCFDescEr ;
   private java.util.Date[] T01OJ2_A13568BCCFErrFec ;
   private boolean[] T01OJ2_n13568BCCFErrFec ;
   private String[] T01OJ2_A13569BCCFPilaEr ;
   private boolean[] T01OJ2_n13569BCCFPilaEr ;
   private String[] T01OJ2_A396EmprCod ;
   private int[] T01OJ2_A13465BCNumeroOP ;
   private String[] T01OJ15_A407EmprNom ;
   private boolean[] T01OJ15_n407EmprNom ;
   private String[] T01OJ16_A396EmprCod ;
   private int[] T01OJ16_A13465BCNumeroOP ;
   private short[] T01OJ16_A13562BCCFOrden ;
   private String[] T01OJ17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class topbccf__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbccf__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbccf__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbccf__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbccf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OJ2", "SELECT BCCFOrden, BCCFFase, BCCFCoste, BCCFProces, BCCFError, BCCFDescEr, BCCFErrFec, BCCFPilaEr, EmprCod, BCNumeroOP FROM TXPOPBCCF WHERE EmprCod = ? AND BCNumeroOP = ? AND BCCFOrden = ?  FOR UPDATE OF BCCFFase, BCCFCoste, BCCFProces, BCCFError, BCCFDescEr, BCCFErrFec, BCCFPilaEr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ3", "SELECT BCCFOrden, BCCFFase, BCCFCoste, BCCFProces, BCCFError, BCCFDescEr, BCCFErrFec, BCCFPilaEr, EmprCod, BCNumeroOP FROM TXPOPBCCF WHERE EmprCod = ? AND BCNumeroOP = ? AND BCCFOrden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ5", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.BCCFOrden, T2.EmprNom, TM1.BCCFFase, TM1.BCCFCoste, TM1.BCCFProces, TM1.BCCFError, TM1.BCCFDescEr, TM1.BCCFErrFec, TM1.BCCFPilaEr, TM1.EmprCod, TM1.BCNumeroOP FROM (TXPOPBCCF TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BCNumeroOP = ? and TM1.BCCFOrden = ? ORDER BY TM1.EmprCod, TM1.BCNumeroOP, TM1.BCCFOrden ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ8", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCCFOrden FROM TXPOPBCCF WHERE EmprCod = ? AND BCNumeroOP = ? AND BCCFOrden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCCFOrden FROM TXPOPBCCF WHERE ( EmprCod > ? or EmprCod = ? and BCNumeroOP > ? or BCNumeroOP = ? and EmprCod = ? and BCCFOrden > ?) ORDER BY EmprCod, BCNumeroOP, BCCFOrden) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OJ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCCFOrden FROM TXPOPBCCF WHERE ( EmprCod < ? or EmprCod = ? and BCNumeroOP < ? or BCNumeroOP = ? and EmprCod = ? and BCCFOrden < ?) ORDER BY EmprCod DESC, BCNumeroOP DESC, BCCFOrden DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OJ12", "INSERT INTO TXPOPBCCF(BCCFOrden, BCCFFase, BCCFCoste, BCCFProces, BCCFError, BCCFDescEr, BCCFErrFec, BCCFPilaEr, EmprCod, BCNumeroOP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPBCCF")
         ,new UpdateCursor("T01OJ13", "UPDATE TXPOPBCCF SET BCCFFase=?, BCCFCoste=?, BCCFProces=?, BCCFError=?, BCCFDescEr=?, BCCFErrFec=?, BCCFPilaEr=?  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCCFOrden = ?", GX_NOMASK, "TXPOPBCCF")
         ,new UpdateCursor("T01OJ14", "DELETE FROM TXPOPBCCF  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCCFOrden = ?", GX_NOMASK, "TXPOPBCCF")
         ,new ForEachCursor("T01OJ15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BCNumeroOP, BCCFOrden FROM TXPOPBCCF ORDER BY EmprCod, BCNumeroOP, BCCFOrden ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OJ17", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 200);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 200);
               }
               stmt.setString(9, (String)parms[15], 3);
               stmt.setInt(10, ((Number) parms[16]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

