package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdvccstks_impl extends GXDataArea
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
         A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A11935DVPrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Movimientos Productos Data View", ""), (short)(0)) ;
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

   public tdvccstks_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdvccstks_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdvccstks_impl.class ));
   }

   public tdvccstks_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDVCCstks.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Producto Dv", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum_Internalname, GXutil.rtrim( A11935DVPrdNum), GXutil.rtrim( localUtil.format( A11935DVPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Linea Movimiento", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A11950DVCCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11950DVCCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11950DVCCStkLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkLin_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cantidad Entrada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkCE_Internalname, GXutil.ltrim( localUtil.ntoc( A11951DVCCStkCE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkCE_Enabled!=0) ? localUtil.format( A11951DVCCStkCE, "ZZZZZZ9.9999") : localUtil.format( A11951DVCCStkCE, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkCE_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkCE_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cantidad Salida", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkCS_Internalname, GXutil.ltrim( localUtil.ntoc( A11952DVCCStkCS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkCS_Enabled!=0) ? localUtil.format( A11952DVCCStkCS, "ZZZZZZ9.9999") : localUtil.format( A11952DVCCStkCS, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkCS_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkCS_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Tipo Movimiento", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVTipMovCc_Internalname, GXutil.rtrim( A11953DVTipMovCc), GXutil.rtrim( localUtil.format( A11953DVTipMovCc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVTipMovCc_Jsonclick, 0, "", "", "", "", "", 1, edtDVTipMovCc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "CCStkPri", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkPri_Internalname, GXutil.rtrim( A11954DVCCStkPri), GXutil.rtrim( localUtil.format( A11954DVCCStkPri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkPri_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Movimiento", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVCCStkFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkFec_Internalname, localUtil.format(A11955DVCCStkFec, "99/99/99"), localUtil.format( A11955DVCCStkFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkFec_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVCCStkFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVCCStkFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVCCstks.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Precio", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11956DVCCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkPre_Enabled!=0) ? localUtil.format( A11956DVCCStkPre, "ZZZZZZZ9.99999") : localUtil.format( A11956DVCCStkPre, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkPre_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkBar_Internalname, GXutil.ltrim( localUtil.ntoc( A11957DVCCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkBar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11957DVCCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11957DVCCStkBar), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkBar_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkBar_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkReo_Internalname, GXutil.ltrim( localUtil.ntoc( A11958DVCCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11958DVCCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A11958DVCCStkReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkReo_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Particion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkPar_Internalname, GXutil.rtrim( A11959DVCCStkPar), GXutil.rtrim( localUtil.format( A11959DVCCStkPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkPar_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkPed_Internalname, GXutil.ltrim( localUtil.ntoc( A11960DVCCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkPed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11960DVCCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11960DVCCStkPed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkPed_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkPed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Albaran", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkAlb_Internalname, GXutil.rtrim( A11961DVCCStkAlb), GXutil.rtrim( localUtil.format( A11961DVCCStkAlb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkAlb_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkAlb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkUsu_Internalname, GXutil.rtrim( A11962DVCCStkUsu), GXutil.rtrim( localUtil.format( A11962DVCCStkUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkUsu_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Hora", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkHor_Internalname, GXutil.rtrim( A11963DVCCStkHor), GXutil.rtrim( localUtil.format( A11963DVCCStkHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkHor_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkDsc_Internalname, GXutil.rtrim( A11964DVCCStkDsc), GXutil.rtrim( localUtil.format( A11964DVCCStkDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Linea Entrada Almacen", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkLen_Internalname, GXutil.ltrim( localUtil.ntoc( A11965DVCCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkLen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11965DVCCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11965DVCCStkLen), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkLen_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkLen_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "CcoCod", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11966DVCcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11966DVCcoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11966DVCcoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCcoCod_Jsonclick, 0, "", "", "", "", "", 1, edtDVCcoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Lote Producto", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkLot_Internalname, GXutil.rtrim( A11967DVCCStkLot), GXutil.rtrim( localUtil.format( A11967DVCCStkLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkLot_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCcStkPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A11968DVCcStkPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCcStkPrv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11968DVCcStkPrv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11968DVCcStkPrv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCcStkPrv_Jsonclick, 0, "", "", "", "", "", 1, edtDVCcStkPrv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Exportado", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkExp_Internalname, GXutil.ltrim( localUtil.ntoc( A11969DVCCStkExp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStkExp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11969DVCCStkExp), "9") : localUtil.format( DecimalUtil.doubleToDec(A11969DVCCStkExp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkExp_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkExp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Fecha Exportacion", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVCCStkEpF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStkEpF_Internalname, localUtil.format(A11970DVCCStkEpF, "99/99/99"), localUtil.format( A11970DVCCStkEpF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStkEpF_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStkEpF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVCCStkEpF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVCCStkEpF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVCCstks.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Historico?", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCcstkhis_Internalname, GXutil.ltrim( localUtil.ntoc( A11971DVCcstkhis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCcstkhis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11971DVCcstkhis), "9") : localUtil.format( DecimalUtil.doubleToDec(A11971DVCcstkhis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCcstkhis_Jsonclick, 0, "", "", "", "", "", 1, edtDVCcstkhis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCstks.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCstks.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDVCCstks.htm");
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
         Z11935DVPrdNum = httpContext.cgiGet( "Z11935DVPrdNum") ;
         Z11950DVCCStkLin = localUtil.ctol( httpContext.cgiGet( "Z11950DVCCStkLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z11951DVCCStkCE = localUtil.ctond( httpContext.cgiGet( "Z11951DVCCStkCE")) ;
         Z11952DVCCStkCS = localUtil.ctond( httpContext.cgiGet( "Z11952DVCCStkCS")) ;
         Z11953DVTipMovCc = httpContext.cgiGet( "Z11953DVTipMovCc") ;
         Z11954DVCCStkPri = httpContext.cgiGet( "Z11954DVCCStkPri") ;
         Z11955DVCCStkFec = localUtil.ctod( httpContext.cgiGet( "Z11955DVCCStkFec"), 0) ;
         Z11956DVCCStkPre = localUtil.ctond( httpContext.cgiGet( "Z11956DVCCStkPre")) ;
         Z11957DVCCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( "Z11957DVCCStkBar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11958DVCCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11958DVCCStkReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11959DVCCStkPar = httpContext.cgiGet( "Z11959DVCCStkPar") ;
         Z11960DVCCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( "Z11960DVCCStkPed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11961DVCCStkAlb = httpContext.cgiGet( "Z11961DVCCStkAlb") ;
         Z11962DVCCStkUsu = httpContext.cgiGet( "Z11962DVCCStkUsu") ;
         Z11963DVCCStkHor = httpContext.cgiGet( "Z11963DVCCStkHor") ;
         Z11964DVCCStkDsc = httpContext.cgiGet( "Z11964DVCCStkDsc") ;
         Z11965DVCCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( "Z11965DVCCStkLen"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11966DVCcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z11966DVCcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11967DVCCStkLot = httpContext.cgiGet( "Z11967DVCCStkLot") ;
         Z11968DVCcStkPrv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11968DVCcStkPrv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11969DVCCStkExp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11969DVCCStkExp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11970DVCCStkEpF = localUtil.ctod( httpContext.cgiGet( "Z11970DVCCStkEpF"), 0) ;
         Z11971DVCcstkhis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11971DVCcstkhis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.cgiGet( edtDVPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11950DVCCStkLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
         }
         else
         {
            A11950DVCCStkLin = localUtil.ctol( httpContext.cgiGet( edtDVCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCCStkCE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCCStkCE_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKCE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkCE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11951DVCCStkCE = DecimalUtil.ZERO ;
            n11951DVCCStkCE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrimstr( A11951DVCCStkCE, 12, 4));
         }
         else
         {
            A11951DVCCStkCE = localUtil.ctond( httpContext.cgiGet( edtDVCCStkCE_Internalname)) ;
            n11951DVCCStkCE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrimstr( A11951DVCCStkCE, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCCStkCS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCCStkCS_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKCS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkCS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11952DVCCStkCS = DecimalUtil.ZERO ;
            n11952DVCCStkCS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrimstr( A11952DVCCStkCS, 12, 4));
         }
         else
         {
            A11952DVCCStkCS = localUtil.ctond( httpContext.cgiGet( edtDVCCStkCS_Internalname)) ;
            n11952DVCCStkCS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrimstr( A11952DVCCStkCS, 12, 4));
         }
         A11953DVTipMovCc = httpContext.cgiGet( edtDVTipMovCc_Internalname) ;
         n11953DVTipMovCc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11953DVTipMovCc", A11953DVTipMovCc);
         A11954DVCCStkPri = httpContext.cgiGet( edtDVCCStkPri_Internalname) ;
         n11954DVCCStkPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11954DVCCStkPri", A11954DVCCStkPri);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVCCStkFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVCCSTKFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11955DVCCStkFec = GXutil.nullDate() ;
            n11955DVCCStkFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
         }
         else
         {
            A11955DVCCStkFec = localUtil.ctod( httpContext.cgiGet( edtDVCCStkFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11955DVCCStkFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCCStkPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCCStkPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11956DVCCStkPre = DecimalUtil.ZERO ;
            n11956DVCCStkPre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrimstr( A11956DVCCStkPre, 14, 5));
         }
         else
         {
            A11956DVCCStkPre = localUtil.ctond( httpContext.cgiGet( edtDVCCStkPre_Internalname)) ;
            n11956DVCCStkPre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrimstr( A11956DVCCStkPre, 14, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKBAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkBar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11957DVCCStkBar = 0 ;
            n11957DVCCStkBar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11957DVCCStkBar), 8, 0));
         }
         else
         {
            A11957DVCCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtDVCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11957DVCCStkBar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11957DVCCStkBar), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11958DVCCStkReo = (byte)(0) ;
            n11958DVCCStkReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.str( A11958DVCCStkReo, 1, 0));
         }
         else
         {
            A11958DVCCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11958DVCCStkReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.str( A11958DVCCStkReo, 1, 0));
         }
         A11959DVCCStkPar = httpContext.cgiGet( edtDVCCStkPar_Internalname) ;
         n11959DVCCStkPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11959DVCCStkPar", A11959DVCCStkPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKPED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkPed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11960DVCCStkPed = 0 ;
            n11960DVCCStkPed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11960DVCCStkPed), 8, 0));
         }
         else
         {
            A11960DVCCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtDVCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11960DVCCStkPed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11960DVCCStkPed), 8, 0));
         }
         A11961DVCCStkAlb = httpContext.cgiGet( edtDVCCStkAlb_Internalname) ;
         n11961DVCCStkAlb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11961DVCCStkAlb", A11961DVCCStkAlb);
         A11962DVCCStkUsu = httpContext.cgiGet( edtDVCCStkUsu_Internalname) ;
         n11962DVCCStkUsu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11962DVCCStkUsu", A11962DVCCStkUsu);
         A11963DVCCStkHor = httpContext.cgiGet( edtDVCCStkHor_Internalname) ;
         n11963DVCCStkHor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11963DVCCStkHor", A11963DVCCStkHor);
         A11964DVCCStkDsc = httpContext.cgiGet( edtDVCCStkDsc_Internalname) ;
         n11964DVCCStkDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11964DVCCStkDsc", A11964DVCCStkDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKLEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkLen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11965DVCCStkLen = (short)(0) ;
            n11965DVCCStkLen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11965DVCCStkLen), 4, 0));
         }
         else
         {
            A11965DVCCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtDVCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11965DVCCStkLen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11965DVCCStkLen), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11966DVCcoCod = (short)(0) ;
            n11966DVCcoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11966DVCcoCod), 3, 0));
         }
         else
         {
            A11966DVCcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtDVCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11966DVCcoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11966DVCcoCod), 3, 0));
         }
         A11967DVCCStkLot = httpContext.cgiGet( edtDVCCStkLot_Internalname) ;
         n11967DVCCStkLot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11967DVCCStkLot", A11967DVCCStkLot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKPRV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCcStkPrv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11968DVCcStkPrv = 0 ;
            n11968DVCcStkPrv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11968DVCcStkPrv), 6, 0));
         }
         else
         {
            A11968DVCcStkPrv = (int)(localUtil.ctol( httpContext.cgiGet( edtDVCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11968DVCcStkPrv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11968DVCcStkPrv), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKEXP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkExp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11969DVCCStkExp = (byte)(0) ;
            n11969DVCCStkExp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.str( A11969DVCCStkExp, 1, 0));
         }
         else
         {
            A11969DVCCStkExp = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11969DVCCStkExp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.str( A11969DVCCStkExp, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVCCStkEpF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVCCSTKEPF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStkEpF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11970DVCCStkEpF = GXutil.nullDate() ;
            n11970DVCCStkEpF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
         }
         else
         {
            A11970DVCCStkEpF = localUtil.ctod( httpContext.cgiGet( edtDVCCStkEpF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11970DVCCStkEpF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKHIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCcstkhis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11971DVCcstkhis = (byte)(0) ;
            n11971DVCcstkhis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.str( A11971DVCcstkhis, 1, 0));
         }
         else
         {
            A11971DVCcstkhis = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11971DVCcstkhis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.str( A11971DVCcstkhis, 1, 0));
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
            A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11950DVCCStkLin = GXutil.lval( httpContext.GetPar( "DVCCStkLin")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
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
            initAll1IR1675( ) ;
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
      disableAttributes1IR1675( ) ;
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

   public void confirm_1IR0( )
   {
      beforeValidate1IR1675( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IR1675( ) ;
         }
         else
         {
            checkExtendedTable1IR1675( ) ;
            if ( AnyError == 0 )
            {
               zm1IR1675( 2) ;
            }
            closeExtendedTableCursors1IR1675( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IR0( ) ;
      }
   }

   public void resetCaption1IR0( )
   {
   }

   public void zm1IR1675( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11951DVCCStkCE = T01IR3_A11951DVCCStkCE[0] ;
            Z11952DVCCStkCS = T01IR3_A11952DVCCStkCS[0] ;
            Z11953DVTipMovCc = T01IR3_A11953DVTipMovCc[0] ;
            Z11954DVCCStkPri = T01IR3_A11954DVCCStkPri[0] ;
            Z11955DVCCStkFec = T01IR3_A11955DVCCStkFec[0] ;
            Z11956DVCCStkPre = T01IR3_A11956DVCCStkPre[0] ;
            Z11957DVCCStkBar = T01IR3_A11957DVCCStkBar[0] ;
            Z11958DVCCStkReo = T01IR3_A11958DVCCStkReo[0] ;
            Z11959DVCCStkPar = T01IR3_A11959DVCCStkPar[0] ;
            Z11960DVCCStkPed = T01IR3_A11960DVCCStkPed[0] ;
            Z11961DVCCStkAlb = T01IR3_A11961DVCCStkAlb[0] ;
            Z11962DVCCStkUsu = T01IR3_A11962DVCCStkUsu[0] ;
            Z11963DVCCStkHor = T01IR3_A11963DVCCStkHor[0] ;
            Z11964DVCCStkDsc = T01IR3_A11964DVCCStkDsc[0] ;
            Z11965DVCCStkLen = T01IR3_A11965DVCCStkLen[0] ;
            Z11966DVCcoCod = T01IR3_A11966DVCcoCod[0] ;
            Z11967DVCCStkLot = T01IR3_A11967DVCCStkLot[0] ;
            Z11968DVCcStkPrv = T01IR3_A11968DVCcStkPrv[0] ;
            Z11969DVCCStkExp = T01IR3_A11969DVCCStkExp[0] ;
            Z11970DVCCStkEpF = T01IR3_A11970DVCCStkEpF[0] ;
            Z11971DVCcstkhis = T01IR3_A11971DVCcstkhis[0] ;
         }
         else
         {
            Z11951DVCCStkCE = A11951DVCCStkCE ;
            Z11952DVCCStkCS = A11952DVCCStkCS ;
            Z11953DVTipMovCc = A11953DVTipMovCc ;
            Z11954DVCCStkPri = A11954DVCCStkPri ;
            Z11955DVCCStkFec = A11955DVCCStkFec ;
            Z11956DVCCStkPre = A11956DVCCStkPre ;
            Z11957DVCCStkBar = A11957DVCCStkBar ;
            Z11958DVCCStkReo = A11958DVCCStkReo ;
            Z11959DVCCStkPar = A11959DVCCStkPar ;
            Z11960DVCCStkPed = A11960DVCCStkPed ;
            Z11961DVCCStkAlb = A11961DVCCStkAlb ;
            Z11962DVCCStkUsu = A11962DVCCStkUsu ;
            Z11963DVCCStkHor = A11963DVCCStkHor ;
            Z11964DVCCStkDsc = A11964DVCCStkDsc ;
            Z11965DVCCStkLen = A11965DVCCStkLen ;
            Z11966DVCcoCod = A11966DVCcoCod ;
            Z11967DVCCStkLot = A11967DVCCStkLot ;
            Z11968DVCcStkPrv = A11968DVCcStkPrv ;
            Z11969DVCCStkExp = A11969DVCCStkExp ;
            Z11970DVCCStkEpF = A11970DVCCStkEpF ;
            Z11971DVCcstkhis = A11971DVCcstkhis ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11950DVCCStkLin = A11950DVCCStkLin ;
         Z11951DVCCStkCE = A11951DVCCStkCE ;
         Z11952DVCCStkCS = A11952DVCCStkCS ;
         Z11953DVTipMovCc = A11953DVTipMovCc ;
         Z11954DVCCStkPri = A11954DVCCStkPri ;
         Z11955DVCCStkFec = A11955DVCCStkFec ;
         Z11956DVCCStkPre = A11956DVCCStkPre ;
         Z11957DVCCStkBar = A11957DVCCStkBar ;
         Z11958DVCCStkReo = A11958DVCCStkReo ;
         Z11959DVCCStkPar = A11959DVCCStkPar ;
         Z11960DVCCStkPed = A11960DVCCStkPed ;
         Z11961DVCCStkAlb = A11961DVCCStkAlb ;
         Z11962DVCCStkUsu = A11962DVCCStkUsu ;
         Z11963DVCCStkHor = A11963DVCCStkHor ;
         Z11964DVCCStkDsc = A11964DVCCStkDsc ;
         Z11965DVCCStkLen = A11965DVCCStkLen ;
         Z11966DVCcoCod = A11966DVCcoCod ;
         Z11967DVCCStkLot = A11967DVCCStkLot ;
         Z11968DVCcStkPrv = A11968DVCcStkPrv ;
         Z11969DVCCStkExp = A11969DVCCStkExp ;
         Z11970DVCCStkEpF = A11970DVCCStkEpF ;
         Z11971DVCcstkhis = A11971DVCcstkhis ;
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
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

   public void load1IR1675( )
   {
      /* Using cursor T01IR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1675 = (short)(1) ;
         A11951DVCCStkCE = T01IR5_A11951DVCCStkCE[0] ;
         n11951DVCCStkCE = T01IR5_n11951DVCCStkCE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrimstr( A11951DVCCStkCE, 12, 4));
         A11952DVCCStkCS = T01IR5_A11952DVCCStkCS[0] ;
         n11952DVCCStkCS = T01IR5_n11952DVCCStkCS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrimstr( A11952DVCCStkCS, 12, 4));
         A11953DVTipMovCc = T01IR5_A11953DVTipMovCc[0] ;
         n11953DVTipMovCc = T01IR5_n11953DVTipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11953DVTipMovCc", A11953DVTipMovCc);
         A11954DVCCStkPri = T01IR5_A11954DVCCStkPri[0] ;
         n11954DVCCStkPri = T01IR5_n11954DVCCStkPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11954DVCCStkPri", A11954DVCCStkPri);
         A11955DVCCStkFec = T01IR5_A11955DVCCStkFec[0] ;
         n11955DVCCStkFec = T01IR5_n11955DVCCStkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
         A11956DVCCStkPre = T01IR5_A11956DVCCStkPre[0] ;
         n11956DVCCStkPre = T01IR5_n11956DVCCStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrimstr( A11956DVCCStkPre, 14, 5));
         A11957DVCCStkBar = T01IR5_A11957DVCCStkBar[0] ;
         n11957DVCCStkBar = T01IR5_n11957DVCCStkBar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11957DVCCStkBar), 8, 0));
         A11958DVCCStkReo = T01IR5_A11958DVCCStkReo[0] ;
         n11958DVCCStkReo = T01IR5_n11958DVCCStkReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.str( A11958DVCCStkReo, 1, 0));
         A11959DVCCStkPar = T01IR5_A11959DVCCStkPar[0] ;
         n11959DVCCStkPar = T01IR5_n11959DVCCStkPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11959DVCCStkPar", A11959DVCCStkPar);
         A11960DVCCStkPed = T01IR5_A11960DVCCStkPed[0] ;
         n11960DVCCStkPed = T01IR5_n11960DVCCStkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11960DVCCStkPed), 8, 0));
         A11961DVCCStkAlb = T01IR5_A11961DVCCStkAlb[0] ;
         n11961DVCCStkAlb = T01IR5_n11961DVCCStkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11961DVCCStkAlb", A11961DVCCStkAlb);
         A11962DVCCStkUsu = T01IR5_A11962DVCCStkUsu[0] ;
         n11962DVCCStkUsu = T01IR5_n11962DVCCStkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11962DVCCStkUsu", A11962DVCCStkUsu);
         A11963DVCCStkHor = T01IR5_A11963DVCCStkHor[0] ;
         n11963DVCCStkHor = T01IR5_n11963DVCCStkHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11963DVCCStkHor", A11963DVCCStkHor);
         A11964DVCCStkDsc = T01IR5_A11964DVCCStkDsc[0] ;
         n11964DVCCStkDsc = T01IR5_n11964DVCCStkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11964DVCCStkDsc", A11964DVCCStkDsc);
         A11965DVCCStkLen = T01IR5_A11965DVCCStkLen[0] ;
         n11965DVCCStkLen = T01IR5_n11965DVCCStkLen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11965DVCCStkLen), 4, 0));
         A11966DVCcoCod = T01IR5_A11966DVCcoCod[0] ;
         n11966DVCcoCod = T01IR5_n11966DVCcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11966DVCcoCod), 3, 0));
         A11967DVCCStkLot = T01IR5_A11967DVCCStkLot[0] ;
         n11967DVCCStkLot = T01IR5_n11967DVCCStkLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11967DVCCStkLot", A11967DVCCStkLot);
         A11968DVCcStkPrv = T01IR5_A11968DVCcStkPrv[0] ;
         n11968DVCcStkPrv = T01IR5_n11968DVCcStkPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11968DVCcStkPrv), 6, 0));
         A11969DVCCStkExp = T01IR5_A11969DVCCStkExp[0] ;
         n11969DVCCStkExp = T01IR5_n11969DVCCStkExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.str( A11969DVCCStkExp, 1, 0));
         A11970DVCCStkEpF = T01IR5_A11970DVCCStkEpF[0] ;
         n11970DVCCStkEpF = T01IR5_n11970DVCCStkEpF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
         A11971DVCcstkhis = T01IR5_A11971DVCcstkhis[0] ;
         n11971DVCcstkhis = T01IR5_n11971DVCcstkhis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.str( A11971DVCcstkhis, 1, 0));
         zm1IR1675( -1) ;
      }
      pr_default.close(3);
      onLoadActions1IR1675( ) ;
   }

   public void onLoadActions1IR1675( )
   {
   }

   public void checkExtendedTable1IR1675( )
   {
      nIsDirty_1675 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1IR1675( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A11935DVPrdNum )
   {
      /* Using cursor T01IR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1IR1675( )
   {
      /* Using cursor T01IR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1675 = (short)(1) ;
      }
      else
      {
         RcdFound1675 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IR1675( 1) ;
         RcdFound1675 = (short)(1) ;
         A11950DVCCStkLin = T01IR3_A11950DVCCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
         A11951DVCCStkCE = T01IR3_A11951DVCCStkCE[0] ;
         n11951DVCCStkCE = T01IR3_n11951DVCCStkCE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrimstr( A11951DVCCStkCE, 12, 4));
         A11952DVCCStkCS = T01IR3_A11952DVCCStkCS[0] ;
         n11952DVCCStkCS = T01IR3_n11952DVCCStkCS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrimstr( A11952DVCCStkCS, 12, 4));
         A11953DVTipMovCc = T01IR3_A11953DVTipMovCc[0] ;
         n11953DVTipMovCc = T01IR3_n11953DVTipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11953DVTipMovCc", A11953DVTipMovCc);
         A11954DVCCStkPri = T01IR3_A11954DVCCStkPri[0] ;
         n11954DVCCStkPri = T01IR3_n11954DVCCStkPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11954DVCCStkPri", A11954DVCCStkPri);
         A11955DVCCStkFec = T01IR3_A11955DVCCStkFec[0] ;
         n11955DVCCStkFec = T01IR3_n11955DVCCStkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
         A11956DVCCStkPre = T01IR3_A11956DVCCStkPre[0] ;
         n11956DVCCStkPre = T01IR3_n11956DVCCStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrimstr( A11956DVCCStkPre, 14, 5));
         A11957DVCCStkBar = T01IR3_A11957DVCCStkBar[0] ;
         n11957DVCCStkBar = T01IR3_n11957DVCCStkBar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11957DVCCStkBar), 8, 0));
         A11958DVCCStkReo = T01IR3_A11958DVCCStkReo[0] ;
         n11958DVCCStkReo = T01IR3_n11958DVCCStkReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.str( A11958DVCCStkReo, 1, 0));
         A11959DVCCStkPar = T01IR3_A11959DVCCStkPar[0] ;
         n11959DVCCStkPar = T01IR3_n11959DVCCStkPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11959DVCCStkPar", A11959DVCCStkPar);
         A11960DVCCStkPed = T01IR3_A11960DVCCStkPed[0] ;
         n11960DVCCStkPed = T01IR3_n11960DVCCStkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11960DVCCStkPed), 8, 0));
         A11961DVCCStkAlb = T01IR3_A11961DVCCStkAlb[0] ;
         n11961DVCCStkAlb = T01IR3_n11961DVCCStkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11961DVCCStkAlb", A11961DVCCStkAlb);
         A11962DVCCStkUsu = T01IR3_A11962DVCCStkUsu[0] ;
         n11962DVCCStkUsu = T01IR3_n11962DVCCStkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11962DVCCStkUsu", A11962DVCCStkUsu);
         A11963DVCCStkHor = T01IR3_A11963DVCCStkHor[0] ;
         n11963DVCCStkHor = T01IR3_n11963DVCCStkHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11963DVCCStkHor", A11963DVCCStkHor);
         A11964DVCCStkDsc = T01IR3_A11964DVCCStkDsc[0] ;
         n11964DVCCStkDsc = T01IR3_n11964DVCCStkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11964DVCCStkDsc", A11964DVCCStkDsc);
         A11965DVCCStkLen = T01IR3_A11965DVCCStkLen[0] ;
         n11965DVCCStkLen = T01IR3_n11965DVCCStkLen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11965DVCCStkLen), 4, 0));
         A11966DVCcoCod = T01IR3_A11966DVCcoCod[0] ;
         n11966DVCcoCod = T01IR3_n11966DVCcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11966DVCcoCod), 3, 0));
         A11967DVCCStkLot = T01IR3_A11967DVCCStkLot[0] ;
         n11967DVCCStkLot = T01IR3_n11967DVCCStkLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11967DVCCStkLot", A11967DVCCStkLot);
         A11968DVCcStkPrv = T01IR3_A11968DVCcStkPrv[0] ;
         n11968DVCcStkPrv = T01IR3_n11968DVCcStkPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11968DVCcStkPrv), 6, 0));
         A11969DVCCStkExp = T01IR3_A11969DVCCStkExp[0] ;
         n11969DVCCStkExp = T01IR3_n11969DVCCStkExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.str( A11969DVCCStkExp, 1, 0));
         A11970DVCCStkEpF = T01IR3_A11970DVCCStkEpF[0] ;
         n11970DVCCStkEpF = T01IR3_n11970DVCCStkEpF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
         A11971DVCcstkhis = T01IR3_A11971DVCcstkhis[0] ;
         n11971DVCcstkhis = T01IR3_n11971DVCcstkhis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.str( A11971DVCcstkhis, 1, 0));
         A396EmprCod = T01IR3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IR3_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z11950DVCCStkLin = A11950DVCCStkLin ;
         sMode1675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IR1675( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1675 = (short)(0) ;
            initializeNonKey1IR1675( ) ;
         }
         Gx_mode = sMode1675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1675 = (short)(0) ;
         initializeNonKey1IR1675( ) ;
         sMode1675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IR1675( ) ;
      if ( RcdFound1675 == 0 )
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
      RcdFound1675 = (short)(0) ;
      /* Using cursor T01IR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Long.valueOf(A11950DVCCStkLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IR8_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IR8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IR8_A11950DVCCStkLin[0] < A11950DVCCStkLin ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IR8_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IR8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IR8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IR8_A11950DVCCStkLin[0] > A11950DVCCStkLin ) ) )
         {
            A396EmprCod = T01IR8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IR8_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11950DVCCStkLin = T01IR8_A11950DVCCStkLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
            RcdFound1675 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1675 = (short)(0) ;
      /* Using cursor T01IR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Long.valueOf(A11950DVCCStkLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IR9_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IR9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IR9_A11950DVCCStkLin[0] > A11950DVCCStkLin ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IR9_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IR9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IR9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IR9_A11950DVCCStkLin[0] < A11950DVCCStkLin ) ) )
         {
            A396EmprCod = T01IR9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IR9_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11950DVCCStkLin = T01IR9_A11950DVCCStkLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
            RcdFound1675 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IR1675( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IR1675( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1675 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11950DVCCStkLin != Z11950DVCCStkLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11935DVPrdNum = Z11935DVPrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
               A11950DVCCStkLin = Z11950DVCCStkLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
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
               update1IR1675( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11950DVCCStkLin != Z11950DVCCStkLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IR1675( ) ;
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
                  insert1IR1675( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11950DVCCStkLin != Z11950DVCCStkLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = Z11935DVPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11950DVCCStkLin = Z11950DVCCStkLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
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
      getKey1IR1675( ) ;
      if ( RcdFound1675 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11950DVCCStkLin != Z11950DVCCStkLin ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = Z11935DVPrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11950DVCCStkLin = Z11950DVCCStkLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11950DVCCStkLin != Z11950DVCCStkLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvccstks");
      GX_FocusControl = edtDVCCStkCE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IR0( ) ;
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
      if ( RcdFound1675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDVCCStkCE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IR1675( ) ;
      if ( RcdFound1675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCCStkCE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IR1675( ) ;
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
      if ( RcdFound1675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCCStkCE_Internalname ;
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
      if ( RcdFound1675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCCStkCE_Internalname ;
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
      scanStart1IR1675( ) ;
      if ( RcdFound1675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1675 != 0 )
         {
            scanNext1IR1675( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCCStkCE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IR1675( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IR1675( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNCCSTKS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11951DVCCStkCE, T01IR2_A11951DVCCStkCE[0]) != 0 ) || ( DecimalUtil.compareTo(Z11952DVCCStkCS, T01IR2_A11952DVCCStkCS[0]) != 0 ) || ( GXutil.strcmp(Z11953DVTipMovCc, T01IR2_A11953DVTipMovCc[0]) != 0 ) || ( GXutil.strcmp(Z11954DVCCStkPri, T01IR2_A11954DVCCStkPri[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11955DVCCStkFec), GXutil.resetTime(T01IR2_A11955DVCCStkFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11956DVCCStkPre, T01IR2_A11956DVCCStkPre[0]) != 0 ) || ( Z11957DVCCStkBar != T01IR2_A11957DVCCStkBar[0] ) || ( Z11958DVCCStkReo != T01IR2_A11958DVCCStkReo[0] ) || ( GXutil.strcmp(Z11959DVCCStkPar, T01IR2_A11959DVCCStkPar[0]) != 0 ) || ( Z11960DVCCStkPed != T01IR2_A11960DVCCStkPed[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11961DVCCStkAlb, T01IR2_A11961DVCCStkAlb[0]) != 0 ) || ( GXutil.strcmp(Z11962DVCCStkUsu, T01IR2_A11962DVCCStkUsu[0]) != 0 ) || ( GXutil.strcmp(Z11963DVCCStkHor, T01IR2_A11963DVCCStkHor[0]) != 0 ) || ( GXutil.strcmp(Z11964DVCCStkDsc, T01IR2_A11964DVCCStkDsc[0]) != 0 ) || ( Z11965DVCCStkLen != T01IR2_A11965DVCCStkLen[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11966DVCcoCod != T01IR2_A11966DVCcoCod[0] ) || ( GXutil.strcmp(Z11967DVCCStkLot, T01IR2_A11967DVCCStkLot[0]) != 0 ) || ( Z11968DVCcStkPrv != T01IR2_A11968DVCcStkPrv[0] ) || ( Z11969DVCCStkExp != T01IR2_A11969DVCCStkExp[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11970DVCCStkEpF), GXutil.resetTime(T01IR2_A11970DVCCStkEpF[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11971DVCcstkhis != T01IR2_A11971DVCcstkhis[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11951DVCCStkCE, T01IR2_A11951DVCCStkCE[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkCE");
               GXutil.writeLogRaw("Old: ",Z11951DVCCStkCE);
               GXutil.writeLogRaw("Current: ",T01IR2_A11951DVCCStkCE[0]);
            }
            if ( DecimalUtil.compareTo(Z11952DVCCStkCS, T01IR2_A11952DVCCStkCS[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkCS");
               GXutil.writeLogRaw("Old: ",Z11952DVCCStkCS);
               GXutil.writeLogRaw("Current: ",T01IR2_A11952DVCCStkCS[0]);
            }
            if ( GXutil.strcmp(Z11953DVTipMovCc, T01IR2_A11953DVTipMovCc[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVTipMovCc");
               GXutil.writeLogRaw("Old: ",Z11953DVTipMovCc);
               GXutil.writeLogRaw("Current: ",T01IR2_A11953DVTipMovCc[0]);
            }
            if ( GXutil.strcmp(Z11954DVCCStkPri, T01IR2_A11954DVCCStkPri[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkPri");
               GXutil.writeLogRaw("Old: ",Z11954DVCCStkPri);
               GXutil.writeLogRaw("Current: ",T01IR2_A11954DVCCStkPri[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11955DVCCStkFec), GXutil.resetTime(T01IR2_A11955DVCCStkFec[0])) ) )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkFec");
               GXutil.writeLogRaw("Old: ",Z11955DVCCStkFec);
               GXutil.writeLogRaw("Current: ",T01IR2_A11955DVCCStkFec[0]);
            }
            if ( DecimalUtil.compareTo(Z11956DVCCStkPre, T01IR2_A11956DVCCStkPre[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkPre");
               GXutil.writeLogRaw("Old: ",Z11956DVCCStkPre);
               GXutil.writeLogRaw("Current: ",T01IR2_A11956DVCCStkPre[0]);
            }
            if ( Z11957DVCCStkBar != T01IR2_A11957DVCCStkBar[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkBar");
               GXutil.writeLogRaw("Old: ",Z11957DVCCStkBar);
               GXutil.writeLogRaw("Current: ",T01IR2_A11957DVCCStkBar[0]);
            }
            if ( Z11958DVCCStkReo != T01IR2_A11958DVCCStkReo[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkReo");
               GXutil.writeLogRaw("Old: ",Z11958DVCCStkReo);
               GXutil.writeLogRaw("Current: ",T01IR2_A11958DVCCStkReo[0]);
            }
            if ( GXutil.strcmp(Z11959DVCCStkPar, T01IR2_A11959DVCCStkPar[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkPar");
               GXutil.writeLogRaw("Old: ",Z11959DVCCStkPar);
               GXutil.writeLogRaw("Current: ",T01IR2_A11959DVCCStkPar[0]);
            }
            if ( Z11960DVCCStkPed != T01IR2_A11960DVCCStkPed[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkPed");
               GXutil.writeLogRaw("Old: ",Z11960DVCCStkPed);
               GXutil.writeLogRaw("Current: ",T01IR2_A11960DVCCStkPed[0]);
            }
            if ( GXutil.strcmp(Z11961DVCCStkAlb, T01IR2_A11961DVCCStkAlb[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkAlb");
               GXutil.writeLogRaw("Old: ",Z11961DVCCStkAlb);
               GXutil.writeLogRaw("Current: ",T01IR2_A11961DVCCStkAlb[0]);
            }
            if ( GXutil.strcmp(Z11962DVCCStkUsu, T01IR2_A11962DVCCStkUsu[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkUsu");
               GXutil.writeLogRaw("Old: ",Z11962DVCCStkUsu);
               GXutil.writeLogRaw("Current: ",T01IR2_A11962DVCCStkUsu[0]);
            }
            if ( GXutil.strcmp(Z11963DVCCStkHor, T01IR2_A11963DVCCStkHor[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkHor");
               GXutil.writeLogRaw("Old: ",Z11963DVCCStkHor);
               GXutil.writeLogRaw("Current: ",T01IR2_A11963DVCCStkHor[0]);
            }
            if ( GXutil.strcmp(Z11964DVCCStkDsc, T01IR2_A11964DVCCStkDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkDsc");
               GXutil.writeLogRaw("Old: ",Z11964DVCCStkDsc);
               GXutil.writeLogRaw("Current: ",T01IR2_A11964DVCCStkDsc[0]);
            }
            if ( Z11965DVCCStkLen != T01IR2_A11965DVCCStkLen[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkLen");
               GXutil.writeLogRaw("Old: ",Z11965DVCCStkLen);
               GXutil.writeLogRaw("Current: ",T01IR2_A11965DVCCStkLen[0]);
            }
            if ( Z11966DVCcoCod != T01IR2_A11966DVCcoCod[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCcoCod");
               GXutil.writeLogRaw("Old: ",Z11966DVCcoCod);
               GXutil.writeLogRaw("Current: ",T01IR2_A11966DVCcoCod[0]);
            }
            if ( GXutil.strcmp(Z11967DVCCStkLot, T01IR2_A11967DVCCStkLot[0]) != 0 )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkLot");
               GXutil.writeLogRaw("Old: ",Z11967DVCCStkLot);
               GXutil.writeLogRaw("Current: ",T01IR2_A11967DVCCStkLot[0]);
            }
            if ( Z11968DVCcStkPrv != T01IR2_A11968DVCcStkPrv[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCcStkPrv");
               GXutil.writeLogRaw("Old: ",Z11968DVCcStkPrv);
               GXutil.writeLogRaw("Current: ",T01IR2_A11968DVCcStkPrv[0]);
            }
            if ( Z11969DVCCStkExp != T01IR2_A11969DVCCStkExp[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkExp");
               GXutil.writeLogRaw("Old: ",Z11969DVCCStkExp);
               GXutil.writeLogRaw("Current: ",T01IR2_A11969DVCCStkExp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11970DVCCStkEpF), GXutil.resetTime(T01IR2_A11970DVCCStkEpF[0])) ) )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCCStkEpF");
               GXutil.writeLogRaw("Old: ",Z11970DVCCStkEpF);
               GXutil.writeLogRaw("Current: ",T01IR2_A11970DVCCStkEpF[0]);
            }
            if ( Z11971DVCcstkhis != T01IR2_A11971DVCcstkhis[0] )
            {
               GXutil.writeLogln("tdvccstks:[seudo value changed for attri]"+"DVCcstkhis");
               GXutil.writeLogRaw("Old: ",Z11971DVCcstkhis);
               GXutil.writeLogRaw("Current: ",T01IR2_A11971DVCcstkhis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"LVNCCSTKS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IR1675( )
   {
      beforeValidate1IR1675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IR1675( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IR1675( 0) ;
         checkOptimisticConcurrency1IR1675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IR1675( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IR1675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IR10 */
                  pr_default.execute(8, new Object[] {Long.valueOf(A11950DVCCStkLin), Boolean.valueOf(n11951DVCCStkCE), A11951DVCCStkCE, Boolean.valueOf(n11952DVCCStkCS), A11952DVCCStkCS, Boolean.valueOf(n11953DVTipMovCc), A11953DVTipMovCc, Boolean.valueOf(n11954DVCCStkPri), A11954DVCCStkPri, Boolean.valueOf(n11955DVCCStkFec), A11955DVCCStkFec, Boolean.valueOf(n11956DVCCStkPre), A11956DVCCStkPre, Boolean.valueOf(n11957DVCCStkBar), Integer.valueOf(A11957DVCCStkBar), Boolean.valueOf(n11958DVCCStkReo), Byte.valueOf(A11958DVCCStkReo), Boolean.valueOf(n11959DVCCStkPar), A11959DVCCStkPar, Boolean.valueOf(n11960DVCCStkPed), Integer.valueOf(A11960DVCCStkPed), Boolean.valueOf(n11961DVCCStkAlb), A11961DVCCStkAlb, Boolean.valueOf(n11962DVCCStkUsu), A11962DVCCStkUsu, Boolean.valueOf(n11963DVCCStkHor), A11963DVCCStkHor, Boolean.valueOf(n11964DVCCStkDsc), A11964DVCCStkDsc, Boolean.valueOf(n11965DVCCStkLen), Short.valueOf(A11965DVCCStkLen), Boolean.valueOf(n11966DVCcoCod), Short.valueOf(A11966DVCcoCod), Boolean.valueOf(n11967DVCCStkLot), A11967DVCCStkLot, Boolean.valueOf(n11968DVCcStkPrv), Integer.valueOf(A11968DVCcStkPrv), Boolean.valueOf(n11969DVCCStkExp), Byte.valueOf(A11969DVCCStkExp), Boolean.valueOf(n11970DVCCStkEpF), A11970DVCCStkEpF, Boolean.valueOf(n11971DVCcstkhis), Byte.valueOf(A11971DVCcstkhis), A396EmprCod, A11935DVPrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCSTKS");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1IR0( ) ;
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
            load1IR1675( ) ;
         }
         endLevel1IR1675( ) ;
      }
      closeExtendedTableCursors1IR1675( ) ;
   }

   public void update1IR1675( )
   {
      beforeValidate1IR1675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IR1675( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IR1675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IR1675( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IR1675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IR11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11951DVCCStkCE), A11951DVCCStkCE, Boolean.valueOf(n11952DVCCStkCS), A11952DVCCStkCS, Boolean.valueOf(n11953DVTipMovCc), A11953DVTipMovCc, Boolean.valueOf(n11954DVCCStkPri), A11954DVCCStkPri, Boolean.valueOf(n11955DVCCStkFec), A11955DVCCStkFec, Boolean.valueOf(n11956DVCCStkPre), A11956DVCCStkPre, Boolean.valueOf(n11957DVCCStkBar), Integer.valueOf(A11957DVCCStkBar), Boolean.valueOf(n11958DVCCStkReo), Byte.valueOf(A11958DVCCStkReo), Boolean.valueOf(n11959DVCCStkPar), A11959DVCCStkPar, Boolean.valueOf(n11960DVCCStkPed), Integer.valueOf(A11960DVCCStkPed), Boolean.valueOf(n11961DVCCStkAlb), A11961DVCCStkAlb, Boolean.valueOf(n11962DVCCStkUsu), A11962DVCCStkUsu, Boolean.valueOf(n11963DVCCStkHor), A11963DVCCStkHor, Boolean.valueOf(n11964DVCCStkDsc), A11964DVCCStkDsc, Boolean.valueOf(n11965DVCCStkLen), Short.valueOf(A11965DVCCStkLen), Boolean.valueOf(n11966DVCcoCod), Short.valueOf(A11966DVCcoCod), Boolean.valueOf(n11967DVCCStkLot), A11967DVCCStkLot, Boolean.valueOf(n11968DVCcStkPrv), Integer.valueOf(A11968DVCcStkPrv), Boolean.valueOf(n11969DVCCStkExp), Byte.valueOf(A11969DVCCStkExp), Boolean.valueOf(n11970DVCCStkEpF), A11970DVCCStkEpF, Boolean.valueOf(n11971DVCcstkhis), Byte.valueOf(A11971DVCcstkhis), A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCSTKS");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNCCSTKS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IR1675( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IR0( ) ;
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
         endLevel1IR1675( ) ;
      }
      closeExtendedTableCursors1IR1675( ) ;
   }

   public void deferredUpdate1IR1675( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IR1675( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IR1675( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IR1675( ) ;
         afterConfirm1IR1675( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IR1675( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IR12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCSTKS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1675 == 0 )
                     {
                        initAll1IR1675( ) ;
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
                     resetCaption1IR0( ) ;
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
      sMode1675 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IR1675( ) ;
      Gx_mode = sMode1675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IR1675( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IR1675( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IR1675( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdvccstks");
         if ( AnyError == 0 )
         {
            confirmValues1IR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvccstks");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IR1675( )
   {
      /* Using cursor T01IR13 */
      pr_default.execute(11);
      RcdFound1675 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1675 = (short)(1) ;
         A396EmprCod = T01IR13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IR13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11950DVCCStkLin = T01IR13_A11950DVCCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IR1675( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1675 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1675 = (short)(1) ;
         A396EmprCod = T01IR13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IR13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11950DVCCStkLin = T01IR13_A11950DVCCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
      }
   }

   public void scanEnd1IR1675( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1IR1675( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IR1675( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IR1675( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IR1675( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IR1675( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IR1675( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IR1675( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDVPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum_Enabled), 5, 0), true);
      edtDVCCStkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkLin_Enabled), 5, 0), true);
      edtDVCCStkCE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkCE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkCE_Enabled), 5, 0), true);
      edtDVCCStkCS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkCS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkCS_Enabled), 5, 0), true);
      edtDVTipMovCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVTipMovCc_Enabled), 5, 0), true);
      edtDVCCStkPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkPri_Enabled), 5, 0), true);
      edtDVCCStkFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkFec_Enabled), 5, 0), true);
      edtDVCCStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkPre_Enabled), 5, 0), true);
      edtDVCCStkBar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkBar_Enabled), 5, 0), true);
      edtDVCCStkReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkReo_Enabled), 5, 0), true);
      edtDVCCStkPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkPar_Enabled), 5, 0), true);
      edtDVCCStkPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkPed_Enabled), 5, 0), true);
      edtDVCCStkAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkAlb_Enabled), 5, 0), true);
      edtDVCCStkUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkUsu_Enabled), 5, 0), true);
      edtDVCCStkHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkHor_Enabled), 5, 0), true);
      edtDVCCStkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkDsc_Enabled), 5, 0), true);
      edtDVCCStkLen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkLen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkLen_Enabled), 5, 0), true);
      edtDVCcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCcoCod_Enabled), 5, 0), true);
      edtDVCCStkLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkLot_Enabled), 5, 0), true);
      edtDVCcStkPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCcStkPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCcStkPrv_Enabled), 5, 0), true);
      edtDVCCStkExp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkExp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkExp_Enabled), 5, 0), true);
      edtDVCCStkEpF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStkEpF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStkEpF_Enabled), 5, 0), true);
      edtDVCcstkhis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCcstkhis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCcstkhis_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IR1675( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IR0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdvccstks", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11950DVCCStkLin", GXutil.ltrim( localUtil.ntoc( Z11950DVCCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11951DVCCStkCE", GXutil.ltrim( localUtil.ntoc( Z11951DVCCStkCE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11952DVCCStkCS", GXutil.ltrim( localUtil.ntoc( Z11952DVCCStkCS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11953DVTipMovCc", GXutil.rtrim( Z11953DVTipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11954DVCCStkPri", GXutil.rtrim( Z11954DVCCStkPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11955DVCCStkFec", localUtil.dtoc( Z11955DVCCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11956DVCCStkPre", GXutil.ltrim( localUtil.ntoc( Z11956DVCCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11957DVCCStkBar", GXutil.ltrim( localUtil.ntoc( Z11957DVCCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11958DVCCStkReo", GXutil.ltrim( localUtil.ntoc( Z11958DVCCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11959DVCCStkPar", GXutil.rtrim( Z11959DVCCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11960DVCCStkPed", GXutil.ltrim( localUtil.ntoc( Z11960DVCCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11961DVCCStkAlb", GXutil.rtrim( Z11961DVCCStkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11962DVCCStkUsu", GXutil.rtrim( Z11962DVCCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11963DVCCStkHor", GXutil.rtrim( Z11963DVCCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11964DVCCStkDsc", GXutil.rtrim( Z11964DVCCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11965DVCCStkLen", GXutil.ltrim( localUtil.ntoc( Z11965DVCCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11966DVCcoCod", GXutil.ltrim( localUtil.ntoc( Z11966DVCcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11967DVCCStkLot", GXutil.rtrim( Z11967DVCCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11968DVCcStkPrv", GXutil.ltrim( localUtil.ntoc( Z11968DVCcStkPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11969DVCCStkExp", GXutil.ltrim( localUtil.ntoc( Z11969DVCCStkExp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11970DVCCStkEpF", localUtil.dtoc( Z11970DVCCStkEpF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11971DVCcstkhis", GXutil.ltrim( localUtil.ntoc( Z11971DVCcstkhis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdvccstks", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDVCCstks" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Movimientos Productos Data View", "") ;
   }

   public void initializeNonKey1IR1675( )
   {
      A11951DVCCStkCE = DecimalUtil.ZERO ;
      n11951DVCCStkCE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrimstr( A11951DVCCStkCE, 12, 4));
      A11952DVCCStkCS = DecimalUtil.ZERO ;
      n11952DVCCStkCS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrimstr( A11952DVCCStkCS, 12, 4));
      A11953DVTipMovCc = "" ;
      n11953DVTipMovCc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11953DVTipMovCc", A11953DVTipMovCc);
      A11954DVCCStkPri = "" ;
      n11954DVCCStkPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11954DVCCStkPri", A11954DVCCStkPri);
      A11955DVCCStkFec = GXutil.nullDate() ;
      n11955DVCCStkFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
      A11956DVCCStkPre = DecimalUtil.ZERO ;
      n11956DVCCStkPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrimstr( A11956DVCCStkPre, 14, 5));
      A11957DVCCStkBar = 0 ;
      n11957DVCCStkBar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11957DVCCStkBar), 8, 0));
      A11958DVCCStkReo = (byte)(0) ;
      n11958DVCCStkReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.str( A11958DVCCStkReo, 1, 0));
      A11959DVCCStkPar = "" ;
      n11959DVCCStkPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11959DVCCStkPar", A11959DVCCStkPar);
      A11960DVCCStkPed = 0 ;
      n11960DVCCStkPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11960DVCCStkPed), 8, 0));
      A11961DVCCStkAlb = "" ;
      n11961DVCCStkAlb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11961DVCCStkAlb", A11961DVCCStkAlb);
      A11962DVCCStkUsu = "" ;
      n11962DVCCStkUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11962DVCCStkUsu", A11962DVCCStkUsu);
      A11963DVCCStkHor = "" ;
      n11963DVCCStkHor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11963DVCCStkHor", A11963DVCCStkHor);
      A11964DVCCStkDsc = "" ;
      n11964DVCCStkDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11964DVCCStkDsc", A11964DVCCStkDsc);
      A11965DVCCStkLen = (short)(0) ;
      n11965DVCCStkLen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11965DVCCStkLen), 4, 0));
      A11966DVCcoCod = (short)(0) ;
      n11966DVCcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11966DVCcoCod), 3, 0));
      A11967DVCCStkLot = "" ;
      n11967DVCCStkLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11967DVCCStkLot", A11967DVCCStkLot);
      A11968DVCcStkPrv = 0 ;
      n11968DVCcStkPrv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11968DVCcStkPrv), 6, 0));
      A11969DVCCStkExp = (byte)(0) ;
      n11969DVCCStkExp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.str( A11969DVCCStkExp, 1, 0));
      A11970DVCCStkEpF = GXutil.nullDate() ;
      n11970DVCCStkEpF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
      A11971DVCcstkhis = (byte)(0) ;
      n11971DVCcstkhis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.str( A11971DVCcstkhis, 1, 0));
      Z11951DVCCStkCE = DecimalUtil.ZERO ;
      Z11952DVCCStkCS = DecimalUtil.ZERO ;
      Z11953DVTipMovCc = "" ;
      Z11954DVCCStkPri = "" ;
      Z11955DVCCStkFec = GXutil.nullDate() ;
      Z11956DVCCStkPre = DecimalUtil.ZERO ;
      Z11957DVCCStkBar = 0 ;
      Z11958DVCCStkReo = (byte)(0) ;
      Z11959DVCCStkPar = "" ;
      Z11960DVCCStkPed = 0 ;
      Z11961DVCCStkAlb = "" ;
      Z11962DVCCStkUsu = "" ;
      Z11963DVCCStkHor = "" ;
      Z11964DVCCStkDsc = "" ;
      Z11965DVCCStkLen = (short)(0) ;
      Z11966DVCcoCod = (short)(0) ;
      Z11967DVCCStkLot = "" ;
      Z11968DVCcStkPrv = 0 ;
      Z11969DVCCStkExp = (byte)(0) ;
      Z11970DVCCStkEpF = GXutil.nullDate() ;
      Z11971DVCcstkhis = (byte)(0) ;
   }

   public void initAll1IR1675( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11935DVPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      A11950DVCCStkLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11950DVCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11950DVCCStkLin), 12, 0));
      initializeNonKey1IR1675( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101633136", true, true);
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
      httpContext.AddJavascriptSource("tdvccstks.js", "?20266101633136", false, true);
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
      edtDVPrdNum_Internalname = "DVPRDNUM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDVCCStkLin_Internalname = "DVCCSTKLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDVCCStkCE_Internalname = "DVCCSTKCE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDVCCStkCS_Internalname = "DVCCSTKCS" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDVTipMovCc_Internalname = "DVTIPMOVCC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDVCCStkPri_Internalname = "DVCCSTKPRI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDVCCStkFec_Internalname = "DVCCSTKFEC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDVCCStkPre_Internalname = "DVCCSTKPRE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDVCCStkBar_Internalname = "DVCCSTKBAR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDVCCStkReo_Internalname = "DVCCSTKREO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDVCCStkPar_Internalname = "DVCCSTKPAR" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDVCCStkPed_Internalname = "DVCCSTKPED" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDVCCStkAlb_Internalname = "DVCCSTKALB" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDVCCStkUsu_Internalname = "DVCCSTKUSU" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDVCCStkHor_Internalname = "DVCCSTKHOR" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDVCCStkDsc_Internalname = "DVCCSTKDSC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDVCCStkLen_Internalname = "DVCCSTKLEN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDVCcoCod_Internalname = "DVCCOCOD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDVCCStkLot_Internalname = "DVCCSTKLOT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDVCcStkPrv_Internalname = "DVCCSTKPRV" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDVCCStkExp_Internalname = "DVCCSTKEXP" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDVCCStkEpF_Internalname = "DVCCSTKEPF" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDVCcstkhis_Internalname = "DVCCSTKHIS" ;
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
      Form.setCaption( httpContext.getMessage( "Movimientos Productos Data View", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDVCcstkhis_Jsonclick = "" ;
      edtDVCcstkhis_Backcolor = (int)(0xFFFFFF) ;
      edtDVCcstkhis_Enabled = 1 ;
      edtDVCCStkEpF_Jsonclick = "" ;
      edtDVCCStkEpF_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkEpF_Enabled = 1 ;
      edtDVCCStkExp_Jsonclick = "" ;
      edtDVCCStkExp_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkExp_Enabled = 1 ;
      edtDVCcStkPrv_Jsonclick = "" ;
      edtDVCcStkPrv_Backcolor = (int)(0xFFFFFF) ;
      edtDVCcStkPrv_Enabled = 1 ;
      edtDVCCStkLot_Jsonclick = "" ;
      edtDVCCStkLot_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkLot_Enabled = 1 ;
      edtDVCcoCod_Jsonclick = "" ;
      edtDVCcoCod_Backcolor = (int)(0xFFFFFF) ;
      edtDVCcoCod_Enabled = 1 ;
      edtDVCCStkLen_Jsonclick = "" ;
      edtDVCCStkLen_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkLen_Enabled = 1 ;
      edtDVCCStkDsc_Jsonclick = "" ;
      edtDVCCStkDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkDsc_Enabled = 1 ;
      edtDVCCStkHor_Jsonclick = "" ;
      edtDVCCStkHor_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkHor_Enabled = 1 ;
      edtDVCCStkUsu_Jsonclick = "" ;
      edtDVCCStkUsu_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkUsu_Enabled = 1 ;
      edtDVCCStkAlb_Jsonclick = "" ;
      edtDVCCStkAlb_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkAlb_Enabled = 1 ;
      edtDVCCStkPed_Jsonclick = "" ;
      edtDVCCStkPed_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkPed_Enabled = 1 ;
      edtDVCCStkPar_Jsonclick = "" ;
      edtDVCCStkPar_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkPar_Enabled = 1 ;
      edtDVCCStkReo_Jsonclick = "" ;
      edtDVCCStkReo_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkReo_Enabled = 1 ;
      edtDVCCStkBar_Jsonclick = "" ;
      edtDVCCStkBar_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkBar_Enabled = 1 ;
      edtDVCCStkPre_Jsonclick = "" ;
      edtDVCCStkPre_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkPre_Enabled = 1 ;
      edtDVCCStkFec_Jsonclick = "" ;
      edtDVCCStkFec_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkFec_Enabled = 1 ;
      edtDVCCStkPri_Jsonclick = "" ;
      edtDVCCStkPri_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkPri_Enabled = 1 ;
      edtDVTipMovCc_Jsonclick = "" ;
      edtDVTipMovCc_Backcolor = (int)(0xFFFFFF) ;
      edtDVTipMovCc_Enabled = 1 ;
      edtDVCCStkCS_Jsonclick = "" ;
      edtDVCCStkCS_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkCS_Enabled = 1 ;
      edtDVCCStkCE_Jsonclick = "" ;
      edtDVCCStkCE_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkCE_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDVCCStkLin_Jsonclick = "" ;
      edtDVCCStkLin_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStkLin_Enabled = 1 ;
      edtDVPrdNum_Jsonclick = "" ;
      edtDVPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNum_Enabled = 1 ;
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
      /* Using cursor T01IR14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtDVCCStkCE_Internalname ;
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

   public void valid_Dvprdnum( )
   {
      /* Using cursor T01IR14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dvccstklin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11951DVCCStkCE", GXutil.ltrim( localUtil.ntoc( A11951DVCCStkCE, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11952DVCCStkCS", GXutil.ltrim( localUtil.ntoc( A11952DVCCStkCS, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11953DVTipMovCc", GXutil.rtrim( A11953DVTipMovCc));
      httpContext.ajax_rsp_assign_attri("", false, "A11954DVCCStkPri", GXutil.rtrim( A11954DVCCStkPri));
      httpContext.ajax_rsp_assign_attri("", false, "A11955DVCCStkFec", localUtil.format(A11955DVCCStkFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11956DVCCStkPre", GXutil.ltrim( localUtil.ntoc( A11956DVCCStkPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11957DVCCStkBar", GXutil.ltrim( localUtil.ntoc( A11957DVCCStkBar, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11958DVCCStkReo", GXutil.ltrim( localUtil.ntoc( A11958DVCCStkReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11959DVCCStkPar", GXutil.rtrim( A11959DVCCStkPar));
      httpContext.ajax_rsp_assign_attri("", false, "A11960DVCCStkPed", GXutil.ltrim( localUtil.ntoc( A11960DVCCStkPed, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11961DVCCStkAlb", GXutil.rtrim( A11961DVCCStkAlb));
      httpContext.ajax_rsp_assign_attri("", false, "A11962DVCCStkUsu", GXutil.rtrim( A11962DVCCStkUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A11963DVCCStkHor", GXutil.rtrim( A11963DVCCStkHor));
      httpContext.ajax_rsp_assign_attri("", false, "A11964DVCCStkDsc", GXutil.rtrim( A11964DVCCStkDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11965DVCCStkLen", GXutil.ltrim( localUtil.ntoc( A11965DVCCStkLen, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11966DVCcoCod", GXutil.ltrim( localUtil.ntoc( A11966DVCcoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11967DVCCStkLot", GXutil.rtrim( A11967DVCCStkLot));
      httpContext.ajax_rsp_assign_attri("", false, "A11968DVCcStkPrv", GXutil.ltrim( localUtil.ntoc( A11968DVCcStkPrv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11969DVCCStkExp", GXutil.ltrim( localUtil.ntoc( A11969DVCCStkExp, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11970DVCCStkEpF", localUtil.format(A11970DVCCStkEpF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11971DVCcstkhis", GXutil.ltrim( localUtil.ntoc( A11971DVCcstkhis, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11950DVCCStkLin", GXutil.ltrim( localUtil.ntoc( Z11950DVCCStkLin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11951DVCCStkCE", GXutil.ltrim( localUtil.ntoc( Z11951DVCCStkCE, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11952DVCCStkCS", GXutil.ltrim( localUtil.ntoc( Z11952DVCCStkCS, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11953DVTipMovCc", GXutil.rtrim( Z11953DVTipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11954DVCCStkPri", GXutil.rtrim( Z11954DVCCStkPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11955DVCCStkFec", localUtil.format(Z11955DVCCStkFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11956DVCCStkPre", GXutil.ltrim( localUtil.ntoc( Z11956DVCCStkPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11957DVCCStkBar", GXutil.ltrim( localUtil.ntoc( Z11957DVCCStkBar, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11958DVCCStkReo", GXutil.ltrim( localUtil.ntoc( Z11958DVCCStkReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11959DVCCStkPar", GXutil.rtrim( Z11959DVCCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11960DVCCStkPed", GXutil.ltrim( localUtil.ntoc( Z11960DVCCStkPed, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11961DVCCStkAlb", GXutil.rtrim( Z11961DVCCStkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11962DVCCStkUsu", GXutil.rtrim( Z11962DVCCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11963DVCCStkHor", GXutil.rtrim( Z11963DVCCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11964DVCCStkDsc", GXutil.rtrim( Z11964DVCCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11965DVCCStkLen", GXutil.ltrim( localUtil.ntoc( Z11965DVCCStkLen, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11966DVCcoCod", GXutil.ltrim( localUtil.ntoc( Z11966DVCcoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11967DVCCStkLot", GXutil.rtrim( Z11967DVCCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11968DVCcStkPrv", GXutil.ltrim( localUtil.ntoc( Z11968DVCcStkPrv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11969DVCCStkExp", GXutil.ltrim( localUtil.ntoc( Z11969DVCCStkExp, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11970DVCCStkEpF", localUtil.format(Z11970DVCCStkEpF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11971DVCcstkhis", GXutil.ltrim( localUtil.ntoc( Z11971DVCcstkhis, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DVPRDNUM","{handler:'valid_Dvprdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''}]");
      setEventMetadata("VALID_DVPRDNUM",",oparms:[]}");
      setEventMetadata("VALID_DVCCSTKLIN","{handler:'valid_Dvccstklin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'A11950DVCCStkLin',fld:'DVCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DVCCSTKLIN",",oparms:[{av:'A11951DVCCStkCE',fld:'DVCCSTKCE',pic:'ZZZZZZ9.9999'},{av:'A11952DVCCStkCS',fld:'DVCCSTKCS',pic:'ZZZZZZ9.9999'},{av:'A11953DVTipMovCc',fld:'DVTIPMOVCC',pic:''},{av:'A11954DVCCStkPri',fld:'DVCCSTKPRI',pic:''},{av:'A11955DVCCStkFec',fld:'DVCCSTKFEC',pic:''},{av:'A11956DVCCStkPre',fld:'DVCCSTKPRE',pic:'ZZZZZZZ9.99999'},{av:'A11957DVCCStkBar',fld:'DVCCSTKBAR',pic:'ZZZZZZZ9'},{av:'A11958DVCCStkReo',fld:'DVCCSTKREO',pic:'9'},{av:'A11959DVCCStkPar',fld:'DVCCSTKPAR',pic:''},{av:'A11960DVCCStkPed',fld:'DVCCSTKPED',pic:'ZZZZZZZ9'},{av:'A11961DVCCStkAlb',fld:'DVCCSTKALB',pic:''},{av:'A11962DVCCStkUsu',fld:'DVCCSTKUSU',pic:''},{av:'A11963DVCCStkHor',fld:'DVCCSTKHOR',pic:''},{av:'A11964DVCCStkDsc',fld:'DVCCSTKDSC',pic:''},{av:'A11965DVCCStkLen',fld:'DVCCSTKLEN',pic:'ZZZ9'},{av:'A11966DVCcoCod',fld:'DVCCOCOD',pic:'ZZ9'},{av:'A11967DVCCStkLot',fld:'DVCCSTKLOT',pic:''},{av:'A11968DVCcStkPrv',fld:'DVCCSTKPRV',pic:'ZZZZZ9'},{av:'A11969DVCCStkExp',fld:'DVCCSTKEXP',pic:'9'},{av:'A11970DVCCStkEpF',fld:'DVCCSTKEPF',pic:''},{av:'A11971DVCcstkhis',fld:'DVCCSTKHIS',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11935DVPrdNum'},{av:'Z11950DVCCStkLin'},{av:'Z11951DVCCStkCE'},{av:'Z11952DVCCStkCS'},{av:'Z11953DVTipMovCc'},{av:'Z11954DVCCStkPri'},{av:'Z11955DVCCStkFec'},{av:'Z11956DVCCStkPre'},{av:'Z11957DVCCStkBar'},{av:'Z11958DVCCStkReo'},{av:'Z11959DVCCStkPar'},{av:'Z11960DVCCStkPed'},{av:'Z11961DVCCStkAlb'},{av:'Z11962DVCCStkUsu'},{av:'Z11963DVCCStkHor'},{av:'Z11964DVCCStkDsc'},{av:'Z11965DVCCStkLen'},{av:'Z11966DVCcoCod'},{av:'Z11967DVCCStkLot'},{av:'Z11968DVCcStkPrv'},{av:'Z11969DVCCStkExp'},{av:'Z11970DVCCStkEpF'},{av:'Z11971DVCcstkhis'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11935DVPrdNum = "" ;
      Z11951DVCCStkCE = DecimalUtil.ZERO ;
      Z11952DVCCStkCS = DecimalUtil.ZERO ;
      Z11953DVTipMovCc = "" ;
      Z11954DVCCStkPri = "" ;
      Z11955DVCCStkFec = GXutil.nullDate() ;
      Z11956DVCCStkPre = DecimalUtil.ZERO ;
      Z11959DVCCStkPar = "" ;
      Z11961DVCCStkAlb = "" ;
      Z11962DVCCStkUsu = "" ;
      Z11963DVCCStkHor = "" ;
      Z11964DVCCStkDsc = "" ;
      Z11967DVCCStkLot = "" ;
      Z11970DVCCStkEpF = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11935DVPrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11951DVCCStkCE = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A11952DVCCStkCS = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A11953DVTipMovCc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11954DVCCStkPri = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11955DVCCStkFec = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A11956DVCCStkPre = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11959DVCCStkPar = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A11961DVCCStkAlb = "" ;
      lblTextblock15_Jsonclick = "" ;
      A11962DVCCStkUsu = "" ;
      lblTextblock16_Jsonclick = "" ;
      A11963DVCCStkHor = "" ;
      lblTextblock17_Jsonclick = "" ;
      A11964DVCCStkDsc = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A11967DVCCStkLot = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A11970DVCCStkEpF = GXutil.nullDate() ;
      lblTextblock24_Jsonclick = "" ;
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
      T01IR5_A11950DVCCStkLin = new long[1] ;
      T01IR5_A11951DVCCStkCE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR5_n11951DVCCStkCE = new boolean[] {false} ;
      T01IR5_A11952DVCCStkCS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR5_n11952DVCCStkCS = new boolean[] {false} ;
      T01IR5_A11953DVTipMovCc = new String[] {""} ;
      T01IR5_n11953DVTipMovCc = new boolean[] {false} ;
      T01IR5_A11954DVCCStkPri = new String[] {""} ;
      T01IR5_n11954DVCCStkPri = new boolean[] {false} ;
      T01IR5_A11955DVCCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR5_n11955DVCCStkFec = new boolean[] {false} ;
      T01IR5_A11956DVCCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR5_n11956DVCCStkPre = new boolean[] {false} ;
      T01IR5_A11957DVCCStkBar = new int[1] ;
      T01IR5_n11957DVCCStkBar = new boolean[] {false} ;
      T01IR5_A11958DVCCStkReo = new byte[1] ;
      T01IR5_n11958DVCCStkReo = new boolean[] {false} ;
      T01IR5_A11959DVCCStkPar = new String[] {""} ;
      T01IR5_n11959DVCCStkPar = new boolean[] {false} ;
      T01IR5_A11960DVCCStkPed = new int[1] ;
      T01IR5_n11960DVCCStkPed = new boolean[] {false} ;
      T01IR5_A11961DVCCStkAlb = new String[] {""} ;
      T01IR5_n11961DVCCStkAlb = new boolean[] {false} ;
      T01IR5_A11962DVCCStkUsu = new String[] {""} ;
      T01IR5_n11962DVCCStkUsu = new boolean[] {false} ;
      T01IR5_A11963DVCCStkHor = new String[] {""} ;
      T01IR5_n11963DVCCStkHor = new boolean[] {false} ;
      T01IR5_A11964DVCCStkDsc = new String[] {""} ;
      T01IR5_n11964DVCCStkDsc = new boolean[] {false} ;
      T01IR5_A11965DVCCStkLen = new short[1] ;
      T01IR5_n11965DVCCStkLen = new boolean[] {false} ;
      T01IR5_A11966DVCcoCod = new short[1] ;
      T01IR5_n11966DVCcoCod = new boolean[] {false} ;
      T01IR5_A11967DVCCStkLot = new String[] {""} ;
      T01IR5_n11967DVCCStkLot = new boolean[] {false} ;
      T01IR5_A11968DVCcStkPrv = new int[1] ;
      T01IR5_n11968DVCcStkPrv = new boolean[] {false} ;
      T01IR5_A11969DVCCStkExp = new byte[1] ;
      T01IR5_n11969DVCCStkExp = new boolean[] {false} ;
      T01IR5_A11970DVCCStkEpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR5_n11970DVCCStkEpF = new boolean[] {false} ;
      T01IR5_A11971DVCcstkhis = new byte[1] ;
      T01IR5_n11971DVCcstkhis = new boolean[] {false} ;
      T01IR5_A396EmprCod = new String[] {""} ;
      T01IR5_A11935DVPrdNum = new String[] {""} ;
      T01IR4_A396EmprCod = new String[] {""} ;
      T01IR6_A396EmprCod = new String[] {""} ;
      T01IR7_A396EmprCod = new String[] {""} ;
      T01IR7_A11935DVPrdNum = new String[] {""} ;
      T01IR7_A11950DVCCStkLin = new long[1] ;
      T01IR3_A11950DVCCStkLin = new long[1] ;
      T01IR3_A11951DVCCStkCE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR3_n11951DVCCStkCE = new boolean[] {false} ;
      T01IR3_A11952DVCCStkCS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR3_n11952DVCCStkCS = new boolean[] {false} ;
      T01IR3_A11953DVTipMovCc = new String[] {""} ;
      T01IR3_n11953DVTipMovCc = new boolean[] {false} ;
      T01IR3_A11954DVCCStkPri = new String[] {""} ;
      T01IR3_n11954DVCCStkPri = new boolean[] {false} ;
      T01IR3_A11955DVCCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR3_n11955DVCCStkFec = new boolean[] {false} ;
      T01IR3_A11956DVCCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR3_n11956DVCCStkPre = new boolean[] {false} ;
      T01IR3_A11957DVCCStkBar = new int[1] ;
      T01IR3_n11957DVCCStkBar = new boolean[] {false} ;
      T01IR3_A11958DVCCStkReo = new byte[1] ;
      T01IR3_n11958DVCCStkReo = new boolean[] {false} ;
      T01IR3_A11959DVCCStkPar = new String[] {""} ;
      T01IR3_n11959DVCCStkPar = new boolean[] {false} ;
      T01IR3_A11960DVCCStkPed = new int[1] ;
      T01IR3_n11960DVCCStkPed = new boolean[] {false} ;
      T01IR3_A11961DVCCStkAlb = new String[] {""} ;
      T01IR3_n11961DVCCStkAlb = new boolean[] {false} ;
      T01IR3_A11962DVCCStkUsu = new String[] {""} ;
      T01IR3_n11962DVCCStkUsu = new boolean[] {false} ;
      T01IR3_A11963DVCCStkHor = new String[] {""} ;
      T01IR3_n11963DVCCStkHor = new boolean[] {false} ;
      T01IR3_A11964DVCCStkDsc = new String[] {""} ;
      T01IR3_n11964DVCCStkDsc = new boolean[] {false} ;
      T01IR3_A11965DVCCStkLen = new short[1] ;
      T01IR3_n11965DVCCStkLen = new boolean[] {false} ;
      T01IR3_A11966DVCcoCod = new short[1] ;
      T01IR3_n11966DVCcoCod = new boolean[] {false} ;
      T01IR3_A11967DVCCStkLot = new String[] {""} ;
      T01IR3_n11967DVCCStkLot = new boolean[] {false} ;
      T01IR3_A11968DVCcStkPrv = new int[1] ;
      T01IR3_n11968DVCcStkPrv = new boolean[] {false} ;
      T01IR3_A11969DVCCStkExp = new byte[1] ;
      T01IR3_n11969DVCCStkExp = new boolean[] {false} ;
      T01IR3_A11970DVCCStkEpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR3_n11970DVCCStkEpF = new boolean[] {false} ;
      T01IR3_A11971DVCcstkhis = new byte[1] ;
      T01IR3_n11971DVCcstkhis = new boolean[] {false} ;
      T01IR3_A396EmprCod = new String[] {""} ;
      T01IR3_A11935DVPrdNum = new String[] {""} ;
      sMode1675 = "" ;
      T01IR8_A396EmprCod = new String[] {""} ;
      T01IR8_A11935DVPrdNum = new String[] {""} ;
      T01IR8_A11950DVCCStkLin = new long[1] ;
      T01IR9_A396EmprCod = new String[] {""} ;
      T01IR9_A11935DVPrdNum = new String[] {""} ;
      T01IR9_A11950DVCCStkLin = new long[1] ;
      T01IR2_A11950DVCCStkLin = new long[1] ;
      T01IR2_A11951DVCCStkCE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR2_n11951DVCCStkCE = new boolean[] {false} ;
      T01IR2_A11952DVCCStkCS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR2_n11952DVCCStkCS = new boolean[] {false} ;
      T01IR2_A11953DVTipMovCc = new String[] {""} ;
      T01IR2_n11953DVTipMovCc = new boolean[] {false} ;
      T01IR2_A11954DVCCStkPri = new String[] {""} ;
      T01IR2_n11954DVCCStkPri = new boolean[] {false} ;
      T01IR2_A11955DVCCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR2_n11955DVCCStkFec = new boolean[] {false} ;
      T01IR2_A11956DVCCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IR2_n11956DVCCStkPre = new boolean[] {false} ;
      T01IR2_A11957DVCCStkBar = new int[1] ;
      T01IR2_n11957DVCCStkBar = new boolean[] {false} ;
      T01IR2_A11958DVCCStkReo = new byte[1] ;
      T01IR2_n11958DVCCStkReo = new boolean[] {false} ;
      T01IR2_A11959DVCCStkPar = new String[] {""} ;
      T01IR2_n11959DVCCStkPar = new boolean[] {false} ;
      T01IR2_A11960DVCCStkPed = new int[1] ;
      T01IR2_n11960DVCCStkPed = new boolean[] {false} ;
      T01IR2_A11961DVCCStkAlb = new String[] {""} ;
      T01IR2_n11961DVCCStkAlb = new boolean[] {false} ;
      T01IR2_A11962DVCCStkUsu = new String[] {""} ;
      T01IR2_n11962DVCCStkUsu = new boolean[] {false} ;
      T01IR2_A11963DVCCStkHor = new String[] {""} ;
      T01IR2_n11963DVCCStkHor = new boolean[] {false} ;
      T01IR2_A11964DVCCStkDsc = new String[] {""} ;
      T01IR2_n11964DVCCStkDsc = new boolean[] {false} ;
      T01IR2_A11965DVCCStkLen = new short[1] ;
      T01IR2_n11965DVCCStkLen = new boolean[] {false} ;
      T01IR2_A11966DVCcoCod = new short[1] ;
      T01IR2_n11966DVCcoCod = new boolean[] {false} ;
      T01IR2_A11967DVCCStkLot = new String[] {""} ;
      T01IR2_n11967DVCCStkLot = new boolean[] {false} ;
      T01IR2_A11968DVCcStkPrv = new int[1] ;
      T01IR2_n11968DVCcStkPrv = new boolean[] {false} ;
      T01IR2_A11969DVCCStkExp = new byte[1] ;
      T01IR2_n11969DVCCStkExp = new boolean[] {false} ;
      T01IR2_A11970DVCCStkEpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01IR2_n11970DVCCStkEpF = new boolean[] {false} ;
      T01IR2_A11971DVCcstkhis = new byte[1] ;
      T01IR2_n11971DVCcstkhis = new boolean[] {false} ;
      T01IR2_A396EmprCod = new String[] {""} ;
      T01IR2_A11935DVPrdNum = new String[] {""} ;
      T01IR13_A396EmprCod = new String[] {""} ;
      T01IR13_A11935DVPrdNum = new String[] {""} ;
      T01IR13_A11950DVCCStkLin = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01IR14_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ11935DVPrdNum = "" ;
      ZZ11951DVCCStkCE = DecimalUtil.ZERO ;
      ZZ11952DVCCStkCS = DecimalUtil.ZERO ;
      ZZ11953DVTipMovCc = "" ;
      ZZ11954DVCCStkPri = "" ;
      ZZ11955DVCCStkFec = GXutil.nullDate() ;
      ZZ11956DVCCStkPre = DecimalUtil.ZERO ;
      ZZ11959DVCCStkPar = "" ;
      ZZ11961DVCCStkAlb = "" ;
      ZZ11962DVCCStkUsu = "" ;
      ZZ11963DVCCStkHor = "" ;
      ZZ11964DVCCStkDsc = "" ;
      ZZ11967DVCCStkLot = "" ;
      ZZ11970DVCCStkEpF = GXutil.nullDate() ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdvccstks__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdvccstks__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdvccstks__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdvccstks__default(),
         new Object[] {
             new Object[] {
            T01IR2_A11950DVCCStkLin, T01IR2_A11951DVCCStkCE, T01IR2_n11951DVCCStkCE, T01IR2_A11952DVCCStkCS, T01IR2_n11952DVCCStkCS, T01IR2_A11953DVTipMovCc, T01IR2_n11953DVTipMovCc, T01IR2_A11954DVCCStkPri, T01IR2_n11954DVCCStkPri, T01IR2_A11955DVCCStkFec,
            T01IR2_n11955DVCCStkFec, T01IR2_A11956DVCCStkPre, T01IR2_n11956DVCCStkPre, T01IR2_A11957DVCCStkBar, T01IR2_n11957DVCCStkBar, T01IR2_A11958DVCCStkReo, T01IR2_n11958DVCCStkReo, T01IR2_A11959DVCCStkPar, T01IR2_n11959DVCCStkPar, T01IR2_A11960DVCCStkPed,
            T01IR2_n11960DVCCStkPed, T01IR2_A11961DVCCStkAlb, T01IR2_n11961DVCCStkAlb, T01IR2_A11962DVCCStkUsu, T01IR2_n11962DVCCStkUsu, T01IR2_A11963DVCCStkHor, T01IR2_n11963DVCCStkHor, T01IR2_A11964DVCCStkDsc, T01IR2_n11964DVCCStkDsc, T01IR2_A11965DVCCStkLen,
            T01IR2_n11965DVCCStkLen, T01IR2_A11966DVCcoCod, T01IR2_n11966DVCcoCod, T01IR2_A11967DVCCStkLot, T01IR2_n11967DVCCStkLot, T01IR2_A11968DVCcStkPrv, T01IR2_n11968DVCcStkPrv, T01IR2_A11969DVCCStkExp, T01IR2_n11969DVCCStkExp, T01IR2_A11970DVCCStkEpF,
            T01IR2_n11970DVCCStkEpF, T01IR2_A11971DVCcstkhis, T01IR2_n11971DVCcstkhis, T01IR2_A396EmprCod, T01IR2_A11935DVPrdNum
            }
            , new Object[] {
            T01IR3_A11950DVCCStkLin, T01IR3_A11951DVCCStkCE, T01IR3_n11951DVCCStkCE, T01IR3_A11952DVCCStkCS, T01IR3_n11952DVCCStkCS, T01IR3_A11953DVTipMovCc, T01IR3_n11953DVTipMovCc, T01IR3_A11954DVCCStkPri, T01IR3_n11954DVCCStkPri, T01IR3_A11955DVCCStkFec,
            T01IR3_n11955DVCCStkFec, T01IR3_A11956DVCCStkPre, T01IR3_n11956DVCCStkPre, T01IR3_A11957DVCCStkBar, T01IR3_n11957DVCCStkBar, T01IR3_A11958DVCCStkReo, T01IR3_n11958DVCCStkReo, T01IR3_A11959DVCCStkPar, T01IR3_n11959DVCCStkPar, T01IR3_A11960DVCCStkPed,
            T01IR3_n11960DVCCStkPed, T01IR3_A11961DVCCStkAlb, T01IR3_n11961DVCCStkAlb, T01IR3_A11962DVCCStkUsu, T01IR3_n11962DVCCStkUsu, T01IR3_A11963DVCCStkHor, T01IR3_n11963DVCCStkHor, T01IR3_A11964DVCCStkDsc, T01IR3_n11964DVCCStkDsc, T01IR3_A11965DVCCStkLen,
            T01IR3_n11965DVCCStkLen, T01IR3_A11966DVCcoCod, T01IR3_n11966DVCcoCod, T01IR3_A11967DVCCStkLot, T01IR3_n11967DVCCStkLot, T01IR3_A11968DVCcStkPrv, T01IR3_n11968DVCcStkPrv, T01IR3_A11969DVCCStkExp, T01IR3_n11969DVCCStkExp, T01IR3_A11970DVCCStkEpF,
            T01IR3_n11970DVCCStkEpF, T01IR3_A11971DVCcstkhis, T01IR3_n11971DVCcstkhis, T01IR3_A396EmprCod, T01IR3_A11935DVPrdNum
            }
            , new Object[] {
            T01IR4_A396EmprCod
            }
            , new Object[] {
            T01IR5_A11950DVCCStkLin, T01IR5_A11951DVCCStkCE, T01IR5_n11951DVCCStkCE, T01IR5_A11952DVCCStkCS, T01IR5_n11952DVCCStkCS, T01IR5_A11953DVTipMovCc, T01IR5_n11953DVTipMovCc, T01IR5_A11954DVCCStkPri, T01IR5_n11954DVCCStkPri, T01IR5_A11955DVCCStkFec,
            T01IR5_n11955DVCCStkFec, T01IR5_A11956DVCCStkPre, T01IR5_n11956DVCCStkPre, T01IR5_A11957DVCCStkBar, T01IR5_n11957DVCCStkBar, T01IR5_A11958DVCCStkReo, T01IR5_n11958DVCCStkReo, T01IR5_A11959DVCCStkPar, T01IR5_n11959DVCCStkPar, T01IR5_A11960DVCCStkPed,
            T01IR5_n11960DVCCStkPed, T01IR5_A11961DVCCStkAlb, T01IR5_n11961DVCCStkAlb, T01IR5_A11962DVCCStkUsu, T01IR5_n11962DVCCStkUsu, T01IR5_A11963DVCCStkHor, T01IR5_n11963DVCCStkHor, T01IR5_A11964DVCCStkDsc, T01IR5_n11964DVCCStkDsc, T01IR5_A11965DVCCStkLen,
            T01IR5_n11965DVCCStkLen, T01IR5_A11966DVCcoCod, T01IR5_n11966DVCcoCod, T01IR5_A11967DVCCStkLot, T01IR5_n11967DVCCStkLot, T01IR5_A11968DVCcStkPrv, T01IR5_n11968DVCcStkPrv, T01IR5_A11969DVCCStkExp, T01IR5_n11969DVCCStkExp, T01IR5_A11970DVCCStkEpF,
            T01IR5_n11970DVCCStkEpF, T01IR5_A11971DVCcstkhis, T01IR5_n11971DVCcstkhis, T01IR5_A396EmprCod, T01IR5_A11935DVPrdNum
            }
            , new Object[] {
            T01IR6_A396EmprCod
            }
            , new Object[] {
            T01IR7_A396EmprCod, T01IR7_A11935DVPrdNum, T01IR7_A11950DVCCStkLin
            }
            , new Object[] {
            T01IR8_A396EmprCod, T01IR8_A11935DVPrdNum, T01IR8_A11950DVCCStkLin
            }
            , new Object[] {
            T01IR9_A396EmprCod, T01IR9_A11935DVPrdNum, T01IR9_A11950DVCCStkLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IR13_A396EmprCod, T01IR13_A11935DVPrdNum, T01IR13_A11950DVCCStkLin
            }
            , new Object[] {
            T01IR14_A396EmprCod
            }
         }
      );
   }

   private byte Z11958DVCCStkReo ;
   private byte Z11969DVCCStkExp ;
   private byte Z11971DVCcstkhis ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11958DVCCStkReo ;
   private byte A11969DVCCStkExp ;
   private byte A11971DVCcstkhis ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11958DVCCStkReo ;
   private byte ZZ11969DVCCStkExp ;
   private byte ZZ11971DVCcstkhis ;
   private short Z11965DVCCStkLen ;
   private short Z11966DVCcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11965DVCCStkLen ;
   private short A11966DVCcoCod ;
   private short RcdFound1675 ;
   private short nIsDirty_1675 ;
   private short ZZ11965DVCCStkLen ;
   private short ZZ11966DVCcoCod ;
   private int Z11957DVCCStkBar ;
   private int Z11960DVCCStkPed ;
   private int Z11968DVCcStkPrv ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDVPrdNum_Enabled ;
   private int edtDVCCStkLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDVCCStkCE_Enabled ;
   private int edtDVCCStkCS_Enabled ;
   private int edtDVTipMovCc_Enabled ;
   private int edtDVCCStkPri_Enabled ;
   private int edtDVCCStkFec_Enabled ;
   private int edtDVCCStkPre_Enabled ;
   private int A11957DVCCStkBar ;
   private int edtDVCCStkBar_Enabled ;
   private int edtDVCCStkReo_Enabled ;
   private int edtDVCCStkPar_Enabled ;
   private int A11960DVCCStkPed ;
   private int edtDVCCStkPed_Enabled ;
   private int edtDVCCStkAlb_Enabled ;
   private int edtDVCCStkUsu_Enabled ;
   private int edtDVCCStkHor_Enabled ;
   private int edtDVCCStkDsc_Enabled ;
   private int edtDVCCStkLen_Enabled ;
   private int edtDVCcoCod_Enabled ;
   private int edtDVCCStkLot_Enabled ;
   private int A11968DVCcStkPrv ;
   private int edtDVCcStkPrv_Enabled ;
   private int edtDVCCStkExp_Enabled ;
   private int edtDVCCStkEpF_Enabled ;
   private int edtDVCcstkhis_Enabled ;
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
   private int edtDVCcstkhis_Backcolor ;
   private int edtDVCCStkEpF_Backcolor ;
   private int edtDVCCStkExp_Backcolor ;
   private int edtDVCcStkPrv_Backcolor ;
   private int edtDVCCStkLot_Backcolor ;
   private int edtDVCcoCod_Backcolor ;
   private int edtDVCCStkLen_Backcolor ;
   private int edtDVCCStkDsc_Backcolor ;
   private int edtDVCCStkHor_Backcolor ;
   private int edtDVCCStkUsu_Backcolor ;
   private int edtDVCCStkAlb_Backcolor ;
   private int edtDVCCStkPed_Backcolor ;
   private int edtDVCCStkPar_Backcolor ;
   private int edtDVCCStkReo_Backcolor ;
   private int edtDVCCStkBar_Backcolor ;
   private int edtDVCCStkPre_Backcolor ;
   private int edtDVCCStkFec_Backcolor ;
   private int edtDVCCStkPri_Backcolor ;
   private int edtDVTipMovCc_Backcolor ;
   private int edtDVCCStkCS_Backcolor ;
   private int edtDVCCStkCE_Backcolor ;
   private int edtDVCCStkLin_Backcolor ;
   private int edtDVPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11957DVCCStkBar ;
   private int ZZ11960DVCCStkPed ;
   private int ZZ11968DVCcStkPrv ;
   private long Z11950DVCCStkLin ;
   private long A11950DVCCStkLin ;
   private long ZZ11950DVCCStkLin ;
   private java.math.BigDecimal Z11951DVCCStkCE ;
   private java.math.BigDecimal Z11952DVCCStkCS ;
   private java.math.BigDecimal Z11956DVCCStkPre ;
   private java.math.BigDecimal A11951DVCCStkCE ;
   private java.math.BigDecimal A11952DVCCStkCS ;
   private java.math.BigDecimal A11956DVCCStkPre ;
   private java.math.BigDecimal ZZ11951DVCCStkCE ;
   private java.math.BigDecimal ZZ11952DVCCStkCS ;
   private java.math.BigDecimal ZZ11956DVCCStkPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11935DVPrdNum ;
   private String Z11953DVTipMovCc ;
   private String Z11954DVCCStkPri ;
   private String Z11959DVCCStkPar ;
   private String Z11961DVCCStkAlb ;
   private String Z11962DVCCStkUsu ;
   private String Z11963DVCCStkHor ;
   private String Z11964DVCCStkDsc ;
   private String Z11967DVCCStkLot ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11935DVPrdNum ;
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
   private String edtDVPrdNum_Internalname ;
   private String edtDVPrdNum_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDVCCStkLin_Internalname ;
   private String edtDVCCStkLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDVCCStkCE_Internalname ;
   private String edtDVCCStkCE_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDVCCStkCS_Internalname ;
   private String edtDVCCStkCS_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDVTipMovCc_Internalname ;
   private String A11953DVTipMovCc ;
   private String edtDVTipMovCc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDVCCStkPri_Internalname ;
   private String A11954DVCCStkPri ;
   private String edtDVCCStkPri_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDVCCStkFec_Internalname ;
   private String edtDVCCStkFec_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDVCCStkPre_Internalname ;
   private String edtDVCCStkPre_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDVCCStkBar_Internalname ;
   private String edtDVCCStkBar_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDVCCStkReo_Internalname ;
   private String edtDVCCStkReo_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDVCCStkPar_Internalname ;
   private String A11959DVCCStkPar ;
   private String edtDVCCStkPar_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDVCCStkPed_Internalname ;
   private String edtDVCCStkPed_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDVCCStkAlb_Internalname ;
   private String A11961DVCCStkAlb ;
   private String edtDVCCStkAlb_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDVCCStkUsu_Internalname ;
   private String A11962DVCCStkUsu ;
   private String edtDVCCStkUsu_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDVCCStkHor_Internalname ;
   private String A11963DVCCStkHor ;
   private String edtDVCCStkHor_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDVCCStkDsc_Internalname ;
   private String A11964DVCCStkDsc ;
   private String edtDVCCStkDsc_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDVCCStkLen_Internalname ;
   private String edtDVCCStkLen_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDVCcoCod_Internalname ;
   private String edtDVCcoCod_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDVCCStkLot_Internalname ;
   private String A11967DVCCStkLot ;
   private String edtDVCCStkLot_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDVCcStkPrv_Internalname ;
   private String edtDVCcStkPrv_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDVCCStkExp_Internalname ;
   private String edtDVCCStkExp_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDVCCStkEpF_Internalname ;
   private String edtDVCCStkEpF_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDVCcstkhis_Internalname ;
   private String edtDVCcstkhis_Jsonclick ;
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
   private String sMode1675 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11935DVPrdNum ;
   private String ZZ11953DVTipMovCc ;
   private String ZZ11954DVCCStkPri ;
   private String ZZ11959DVCCStkPar ;
   private String ZZ11961DVCCStkAlb ;
   private String ZZ11962DVCCStkUsu ;
   private String ZZ11963DVCCStkHor ;
   private String ZZ11964DVCCStkDsc ;
   private String ZZ11967DVCCStkLot ;
   private java.util.Date Z11955DVCCStkFec ;
   private java.util.Date Z11970DVCCStkEpF ;
   private java.util.Date A11955DVCCStkFec ;
   private java.util.Date A11970DVCCStkEpF ;
   private java.util.Date ZZ11955DVCCStkFec ;
   private java.util.Date ZZ11970DVCCStkEpF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11951DVCCStkCE ;
   private boolean n11952DVCCStkCS ;
   private boolean n11953DVTipMovCc ;
   private boolean n11954DVCCStkPri ;
   private boolean n11955DVCCStkFec ;
   private boolean n11956DVCCStkPre ;
   private boolean n11957DVCCStkBar ;
   private boolean n11958DVCCStkReo ;
   private boolean n11959DVCCStkPar ;
   private boolean n11960DVCCStkPed ;
   private boolean n11961DVCCStkAlb ;
   private boolean n11962DVCCStkUsu ;
   private boolean n11963DVCCStkHor ;
   private boolean n11964DVCCStkDsc ;
   private boolean n11965DVCCStkLen ;
   private boolean n11966DVCcoCod ;
   private boolean n11967DVCCStkLot ;
   private boolean n11968DVCcStkPrv ;
   private boolean n11969DVCCStkExp ;
   private boolean n11970DVCCStkEpF ;
   private boolean n11971DVCcstkhis ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T01IR5_A11950DVCCStkLin ;
   private java.math.BigDecimal[] T01IR5_A11951DVCCStkCE ;
   private boolean[] T01IR5_n11951DVCCStkCE ;
   private java.math.BigDecimal[] T01IR5_A11952DVCCStkCS ;
   private boolean[] T01IR5_n11952DVCCStkCS ;
   private String[] T01IR5_A11953DVTipMovCc ;
   private boolean[] T01IR5_n11953DVTipMovCc ;
   private String[] T01IR5_A11954DVCCStkPri ;
   private boolean[] T01IR5_n11954DVCCStkPri ;
   private java.util.Date[] T01IR5_A11955DVCCStkFec ;
   private boolean[] T01IR5_n11955DVCCStkFec ;
   private java.math.BigDecimal[] T01IR5_A11956DVCCStkPre ;
   private boolean[] T01IR5_n11956DVCCStkPre ;
   private int[] T01IR5_A11957DVCCStkBar ;
   private boolean[] T01IR5_n11957DVCCStkBar ;
   private byte[] T01IR5_A11958DVCCStkReo ;
   private boolean[] T01IR5_n11958DVCCStkReo ;
   private String[] T01IR5_A11959DVCCStkPar ;
   private boolean[] T01IR5_n11959DVCCStkPar ;
   private int[] T01IR5_A11960DVCCStkPed ;
   private boolean[] T01IR5_n11960DVCCStkPed ;
   private String[] T01IR5_A11961DVCCStkAlb ;
   private boolean[] T01IR5_n11961DVCCStkAlb ;
   private String[] T01IR5_A11962DVCCStkUsu ;
   private boolean[] T01IR5_n11962DVCCStkUsu ;
   private String[] T01IR5_A11963DVCCStkHor ;
   private boolean[] T01IR5_n11963DVCCStkHor ;
   private String[] T01IR5_A11964DVCCStkDsc ;
   private boolean[] T01IR5_n11964DVCCStkDsc ;
   private short[] T01IR5_A11965DVCCStkLen ;
   private boolean[] T01IR5_n11965DVCCStkLen ;
   private short[] T01IR5_A11966DVCcoCod ;
   private boolean[] T01IR5_n11966DVCcoCod ;
   private String[] T01IR5_A11967DVCCStkLot ;
   private boolean[] T01IR5_n11967DVCCStkLot ;
   private int[] T01IR5_A11968DVCcStkPrv ;
   private boolean[] T01IR5_n11968DVCcStkPrv ;
   private byte[] T01IR5_A11969DVCCStkExp ;
   private boolean[] T01IR5_n11969DVCCStkExp ;
   private java.util.Date[] T01IR5_A11970DVCCStkEpF ;
   private boolean[] T01IR5_n11970DVCCStkEpF ;
   private byte[] T01IR5_A11971DVCcstkhis ;
   private boolean[] T01IR5_n11971DVCcstkhis ;
   private String[] T01IR5_A396EmprCod ;
   private String[] T01IR5_A11935DVPrdNum ;
   private String[] T01IR4_A396EmprCod ;
   private String[] T01IR6_A396EmprCod ;
   private String[] T01IR7_A396EmprCod ;
   private String[] T01IR7_A11935DVPrdNum ;
   private long[] T01IR7_A11950DVCCStkLin ;
   private long[] T01IR3_A11950DVCCStkLin ;
   private java.math.BigDecimal[] T01IR3_A11951DVCCStkCE ;
   private boolean[] T01IR3_n11951DVCCStkCE ;
   private java.math.BigDecimal[] T01IR3_A11952DVCCStkCS ;
   private boolean[] T01IR3_n11952DVCCStkCS ;
   private String[] T01IR3_A11953DVTipMovCc ;
   private boolean[] T01IR3_n11953DVTipMovCc ;
   private String[] T01IR3_A11954DVCCStkPri ;
   private boolean[] T01IR3_n11954DVCCStkPri ;
   private java.util.Date[] T01IR3_A11955DVCCStkFec ;
   private boolean[] T01IR3_n11955DVCCStkFec ;
   private java.math.BigDecimal[] T01IR3_A11956DVCCStkPre ;
   private boolean[] T01IR3_n11956DVCCStkPre ;
   private int[] T01IR3_A11957DVCCStkBar ;
   private boolean[] T01IR3_n11957DVCCStkBar ;
   private byte[] T01IR3_A11958DVCCStkReo ;
   private boolean[] T01IR3_n11958DVCCStkReo ;
   private String[] T01IR3_A11959DVCCStkPar ;
   private boolean[] T01IR3_n11959DVCCStkPar ;
   private int[] T01IR3_A11960DVCCStkPed ;
   private boolean[] T01IR3_n11960DVCCStkPed ;
   private String[] T01IR3_A11961DVCCStkAlb ;
   private boolean[] T01IR3_n11961DVCCStkAlb ;
   private String[] T01IR3_A11962DVCCStkUsu ;
   private boolean[] T01IR3_n11962DVCCStkUsu ;
   private String[] T01IR3_A11963DVCCStkHor ;
   private boolean[] T01IR3_n11963DVCCStkHor ;
   private String[] T01IR3_A11964DVCCStkDsc ;
   private boolean[] T01IR3_n11964DVCCStkDsc ;
   private short[] T01IR3_A11965DVCCStkLen ;
   private boolean[] T01IR3_n11965DVCCStkLen ;
   private short[] T01IR3_A11966DVCcoCod ;
   private boolean[] T01IR3_n11966DVCcoCod ;
   private String[] T01IR3_A11967DVCCStkLot ;
   private boolean[] T01IR3_n11967DVCCStkLot ;
   private int[] T01IR3_A11968DVCcStkPrv ;
   private boolean[] T01IR3_n11968DVCcStkPrv ;
   private byte[] T01IR3_A11969DVCCStkExp ;
   private boolean[] T01IR3_n11969DVCCStkExp ;
   private java.util.Date[] T01IR3_A11970DVCCStkEpF ;
   private boolean[] T01IR3_n11970DVCCStkEpF ;
   private byte[] T01IR3_A11971DVCcstkhis ;
   private boolean[] T01IR3_n11971DVCcstkhis ;
   private String[] T01IR3_A396EmprCod ;
   private String[] T01IR3_A11935DVPrdNum ;
   private String[] T01IR8_A396EmprCod ;
   private String[] T01IR8_A11935DVPrdNum ;
   private long[] T01IR8_A11950DVCCStkLin ;
   private String[] T01IR9_A396EmprCod ;
   private String[] T01IR9_A11935DVPrdNum ;
   private long[] T01IR9_A11950DVCCStkLin ;
   private long[] T01IR2_A11950DVCCStkLin ;
   private java.math.BigDecimal[] T01IR2_A11951DVCCStkCE ;
   private boolean[] T01IR2_n11951DVCCStkCE ;
   private java.math.BigDecimal[] T01IR2_A11952DVCCStkCS ;
   private boolean[] T01IR2_n11952DVCCStkCS ;
   private String[] T01IR2_A11953DVTipMovCc ;
   private boolean[] T01IR2_n11953DVTipMovCc ;
   private String[] T01IR2_A11954DVCCStkPri ;
   private boolean[] T01IR2_n11954DVCCStkPri ;
   private java.util.Date[] T01IR2_A11955DVCCStkFec ;
   private boolean[] T01IR2_n11955DVCCStkFec ;
   private java.math.BigDecimal[] T01IR2_A11956DVCCStkPre ;
   private boolean[] T01IR2_n11956DVCCStkPre ;
   private int[] T01IR2_A11957DVCCStkBar ;
   private boolean[] T01IR2_n11957DVCCStkBar ;
   private byte[] T01IR2_A11958DVCCStkReo ;
   private boolean[] T01IR2_n11958DVCCStkReo ;
   private String[] T01IR2_A11959DVCCStkPar ;
   private boolean[] T01IR2_n11959DVCCStkPar ;
   private int[] T01IR2_A11960DVCCStkPed ;
   private boolean[] T01IR2_n11960DVCCStkPed ;
   private String[] T01IR2_A11961DVCCStkAlb ;
   private boolean[] T01IR2_n11961DVCCStkAlb ;
   private String[] T01IR2_A11962DVCCStkUsu ;
   private boolean[] T01IR2_n11962DVCCStkUsu ;
   private String[] T01IR2_A11963DVCCStkHor ;
   private boolean[] T01IR2_n11963DVCCStkHor ;
   private String[] T01IR2_A11964DVCCStkDsc ;
   private boolean[] T01IR2_n11964DVCCStkDsc ;
   private short[] T01IR2_A11965DVCCStkLen ;
   private boolean[] T01IR2_n11965DVCCStkLen ;
   private short[] T01IR2_A11966DVCcoCod ;
   private boolean[] T01IR2_n11966DVCcoCod ;
   private String[] T01IR2_A11967DVCCStkLot ;
   private boolean[] T01IR2_n11967DVCCStkLot ;
   private int[] T01IR2_A11968DVCcStkPrv ;
   private boolean[] T01IR2_n11968DVCcStkPrv ;
   private byte[] T01IR2_A11969DVCCStkExp ;
   private boolean[] T01IR2_n11969DVCCStkExp ;
   private java.util.Date[] T01IR2_A11970DVCCStkEpF ;
   private boolean[] T01IR2_n11970DVCCStkEpF ;
   private byte[] T01IR2_A11971DVCcstkhis ;
   private boolean[] T01IR2_n11971DVCcstkhis ;
   private String[] T01IR2_A396EmprCod ;
   private String[] T01IR2_A11935DVPrdNum ;
   private String[] T01IR13_A396EmprCod ;
   private String[] T01IR13_A11935DVPrdNum ;
   private long[] T01IR13_A11950DVCCStkLin ;
   private String[] T01IR14_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdvccstks__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccstks__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccstks__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IR2", "SELECT CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNCCSTKS WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ?  FOR UPDATE OF CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR3", "SELECT CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNCCSTKS WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR4", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR5", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCStkLin, TM1.CCStkCanE, TM1.CCStkCanS, TM1.TipMovCc, TM1.CCStkPri, TM1.CCStkFec, TM1.CCStkPre, TM1.CCStkBar, TM1.CCStkReo, TM1.CCStkPar, TM1.CCStkPed, TM1.CCStkAlb, TM1.CCStkUsu, TM1.CCStkHor, TM1.CCStkDsc, TM1.CCStkLen, TM1.CcoCod, TM1.CCStkLot, TM1.CcStkPrv, TM1.CCStkExp, TM1.CCStkExpF, TM1.Ccstkhis, TM1.Emprcod AS EmprCod, TM1.Prdnum AS DVPrdNum FROM LVNCCSTKS TM1 WHERE TM1.Emprcod = ? and TM1.Prdnum = ? and TM1.CCStkLin = ? ORDER BY TM1.Emprcod, TM1.Prdnum, TM1.CCStkLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR6", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR7", "SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS WHERE ( Emprcod > ? or Emprcod = ? and Prdnum > ? or Prdnum = ? and Emprcod = ? and CCStkLin > ?) ORDER BY Emprcod, Prdnum, CCStkLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IR9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS WHERE ( Emprcod < ? or Emprcod = ? and Prdnum < ? or Prdnum = ? and Emprcod = ? and CCStkLin < ?) ORDER BY Emprcod DESC, Prdnum DESC, CCStkLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IR10", "INSERT INTO LVNCCSTKS(CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, Emprcod, Prdnum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "LVNCCSTKS")
         ,new UpdateCursor("T01IR11", "UPDATE LVNCCSTKS SET CCStkCanE=?, CCStkCanS=?, TipMovCc=?, CCStkPri=?, CCStkFec=?, CCStkPre=?, CCStkBar=?, CCStkReo=?, CCStkPar=?, CCStkPed=?, CCStkAlb=?, CCStkUsu=?, CCStkHor=?, CCStkDsc=?, CCStkLen=?, CcoCod=?, CCStkLot=?, CcStkPrv=?, CCStkExp=?, CCStkExpF=?, Ccstkhis=?  WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ?", GX_NOMASK, "LVNCCSTKS")
         ,new UpdateCursor("T01IR12", "DELETE FROM LVNCCSTKS  WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ?", GX_NOMASK, "LVNCCSTKS")
         ,new ForEachCursor("T01IR13", "SELECT /*+ FIRST_ROWS(100) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS ORDER BY Emprcod, Prdnum, CCStkLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IR14", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((String[]) buf[44])[0] = rslt.getString(24, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((String[]) buf[44])[0] = rslt.getString(24, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((String[]) buf[44])[0] = rslt.getString(24, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 4);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 8);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 8);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 30);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 26);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[40]);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[42]).byteValue());
               }
               stmt.setString(23, (String)parms[43], 3);
               stmt.setString(24, (String)parms[44], 6);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 2);
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
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
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
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 8);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 30);
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
                  stmt.setString(17, (String)parms[33], 26);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DATE );
               }
               else
               {
                  stmt.setDate(20, (java.util.Date)parms[39]);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               stmt.setString(22, (String)parms[42], 3);
               stmt.setString(23, (String)parms[43], 6);
               stmt.setLong(24, ((Number) parms[44]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

