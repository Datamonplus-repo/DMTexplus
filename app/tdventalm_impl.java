package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdventalm_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entradas Productos Quimicos Data View", ""), (short)(0)) ;
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

   public tdventalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdventalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdventalm_impl.class ));
   }

   public tdventalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDVEntAlm.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Producto Dv", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum_Internalname, GXutil.rtrim( A11935DVPrdNum), GXutil.rtrim( localUtil.format( A11935DVPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Linea Entrada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11972DVLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVLinEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11972DVLinEnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11972DVLinEnt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVLinEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDVLinEnt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Albaran entrada pedido", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVAlbaran_Internalname, GXutil.rtrim( A11973DVAlbaran), GXutil.rtrim( localUtil.format( A11973DVAlbaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVAlbaran_Jsonclick, 0, "", "", "", "", "", 1, edtDVAlbaran_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Pedido", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11974DVPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11974DVPedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11974DVPedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPedCod_Jsonclick, 0, "", "", "", "", "", 1, edtDVPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unidades Entradas", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntUniEn_Internalname, GXutil.ltrim( localUtil.ntoc( A11975DVEntUniEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntUniEn_Enabled!=0) ? localUtil.format( A11975DVEntUniEn, "ZZZZZ9.99") : localUtil.format( A11975DVEntUniEn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntUniEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntUniEn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Precio producto entrada", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11976DVEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntPre_Enabled!=0) ? localUtil.format( A11976DVEntPre, "ZZZZZZZ9.99999") : localUtil.format( A11976DVEntPre, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntPre_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero de contenedores", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntNumCo_Internalname, GXutil.ltrim( localUtil.ntoc( A11977DVEntNumCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntNumCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11977DVEntNumCo), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11977DVEntNumCo), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntNumCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntNumCo_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Unidades remanentes", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntUniRe_Internalname, GXutil.ltrim( localUtil.ntoc( A11978DVEntUniRe, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntUniRe_Enabled!=0) ? localUtil.format( A11978DVEntUniRe, "ZZZZZ9.9999") : localUtil.format( A11978DVEntUniRe, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntUniRe_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntUniRe_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Etiquetas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntEti_Internalname, GXutil.ltrim( localUtil.ntoc( A11979DVEntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11979DVEntEti), "9") : localUtil.format( DecimalUtil.doubleToDec(A11979DVEntEti), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntEti_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntEti_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Control Partida(1=cerr. 0=abi)", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntCon_Internalname, GXutil.ltrim( localUtil.ntoc( A11980DVEntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11980DVEntCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A11980DVEntCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntCon_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntFecEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntFecEn_Internalname, localUtil.format(A11981DVEntFecEn, "99/99/99"), localUtil.format( A11981DVEntFecEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntFecEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntFecEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntFecEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntFecEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Contenedor inicial", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntConIn_Internalname, GXutil.ltrim( localUtil.ntoc( A11982DVEntConIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntConIn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11982DVEntConIn), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11982DVEntConIn), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntConIn_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntConIn_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Contenedor Final", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntConFi_Internalname, GXutil.ltrim( localUtil.ntoc( A11983DVEntConFi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntConFi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11983DVEntConFi), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11983DVEntConFi), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntConFi_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntConFi_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Pedido Cump.Almacen 'S'/'N'", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntPedCu_Internalname, GXutil.ltrim( localUtil.ntoc( A11984DVEntPedCu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntPedCu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11984DVEntPedCu), "9") : localUtil.format( DecimalUtil.doubleToDec(A11984DVEntPedCu), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntPedCu_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntPedCu_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Numero de Entrada", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntNro_Internalname, GXutil.ltrim( localUtil.ntoc( A11985DVEntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11985DVEntNro), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11985DVEntNro), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntNro_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntNro_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Caducidad del producto", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntFVal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntFVal_Internalname, localUtil.format(A11986DVEntFVal, "99/99/99"), localUtil.format( A11986DVEntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntFVal_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntFVal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntFVal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntFVal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Numero Lote", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntLotN_Internalname, GXutil.rtrim( A11987DVEntLotN), GXutil.rtrim( localUtil.format( A11987DVEntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntLotN_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntLotN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Consumo Iniciado, Dia", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntFiCon_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntFiCon_Internalname, localUtil.format(A11988DVEntFiCon, "99/99/99"), localUtil.format( A11988DVEntFiCon, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntFiCon_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntFiCon_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntFiCon_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntFiCon_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Consumo Iniciado, Hora", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntHiCon_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntHiCon_Internalname, localUtil.ttoc( A11989DVEntHiCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11989DVEntHiCon, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntHiCon_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntHiCon_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntHiCon_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntHiCon_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Consumo Finalizado, Dia", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntFfCon_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntFfCon_Internalname, localUtil.format(A11990DVEntFfCon, "99/99/99"), localUtil.format( A11990DVEntFfCon, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntFfCon_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntFfCon_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntFfCon_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntFfCon_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Consumo Finalizado, Hora", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntHfCon_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntHfCon_Internalname, localUtil.ttoc( A11991DVEntHfCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11991DVEntHfCon, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntHfCon_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntHfCon_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntHfCon_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntHfCon_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Documento BNC", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntBnc_Internalname, GXutil.rtrim( A11992DVEntBnc), GXutil.rtrim( localUtil.format( A11992DVEntBnc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntBnc_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntBnc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntPrvNu_Internalname, GXutil.ltrim( localUtil.ntoc( A11993DVEntPrvNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntPrvNu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11993DVEntPrvNu), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11993DVEntPrvNu), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntPrvNu_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntPrvNu_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Cuarto de Colores", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntCC_Internalname, GXutil.rtrim( A11994DVEntCC), GXutil.rtrim( localUtil.format( A11994DVEntCC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntCC_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Centro de Costos", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntCCoCo_Internalname, GXutil.ltrim( localUtil.ntoc( A11995DVEntCCoCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntCCoCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11995DVEntCCoCo), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11995DVEntCCoCo), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntCCoCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntCCoCo_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Tipo Remito", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntRemTp_Internalname, GXutil.rtrim( A11996DVEntRemTp), GXutil.rtrim( localUtil.format( A11996DVEntRemTp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntRemTp_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntRemTp_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Sucursal Remito", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntRemSu_Internalname, GXutil.rtrim( A11997DVEntRemSu), GXutil.rtrim( localUtil.format( A11997DVEntRemSu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntRemSu_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntRemSu_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Fecha Remito", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVEntRemFc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntRemFc_Internalname, localUtil.format(A11998DVEntRemFc, "99/99/99"), localUtil.format( A11998DVEntRemFc, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntRemFc_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntRemFc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVEntRemFc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVEntRemFc_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Nro de Remito", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntRemNr_Internalname, GXutil.rtrim( A11999DVEntRemNr), GXutil.rtrim( localUtil.format( A11999DVEntRemNr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntRemNr_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntRemNr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Cant Remito", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntUniAl_Internalname, GXutil.ltrim( localUtil.ntoc( A12000DVEntUniAl, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVEntUniAl_Enabled!=0) ? localUtil.format( A12000DVEntUniAl, "ZZZZZ9.9999") : localUtil.format( A12000DVEntUniAl, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntUniAl_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntUniAl_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Observacions Linea", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVEntObs_Internalname, GXutil.rtrim( A12001DVEntObs), GXutil.rtrim( localUtil.format( A12001DVEntObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVEntObs_Jsonclick, 0, "", "", "", "", "", 1, edtDVEntObs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVEntAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVEntAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDVEntAlm.htm");
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
         Z11972DVLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11972DVLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11973DVAlbaran = httpContext.cgiGet( "Z11973DVAlbaran") ;
         Z11974DVPedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z11974DVPedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11975DVEntUniEn = localUtil.ctond( httpContext.cgiGet( "Z11975DVEntUniEn")) ;
         Z11976DVEntPre = localUtil.ctond( httpContext.cgiGet( "Z11976DVEntPre")) ;
         Z11977DVEntNumCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z11977DVEntNumCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11978DVEntUniRe = localUtil.ctond( httpContext.cgiGet( "Z11978DVEntUniRe")) ;
         Z11979DVEntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11979DVEntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11980DVEntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11980DVEntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11981DVEntFecEn = localUtil.ctod( httpContext.cgiGet( "Z11981DVEntFecEn"), 0) ;
         Z11982DVEntConIn = (int)(localUtil.ctol( httpContext.cgiGet( "Z11982DVEntConIn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11983DVEntConFi = (int)(localUtil.ctol( httpContext.cgiGet( "Z11983DVEntConFi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11984DVEntPedCu = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11984DVEntPedCu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11985DVEntNro = (int)(localUtil.ctol( httpContext.cgiGet( "Z11985DVEntNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11986DVEntFVal = localUtil.ctod( httpContext.cgiGet( "Z11986DVEntFVal"), 0) ;
         Z11987DVEntLotN = httpContext.cgiGet( "Z11987DVEntLotN") ;
         Z11988DVEntFiCon = localUtil.ctod( httpContext.cgiGet( "Z11988DVEntFiCon"), 0) ;
         Z11989DVEntHiCon = localUtil.ctot( httpContext.cgiGet( "Z11989DVEntHiCon"), 0) ;
         Z11990DVEntFfCon = localUtil.ctod( httpContext.cgiGet( "Z11990DVEntFfCon"), 0) ;
         Z11991DVEntHfCon = localUtil.ctot( httpContext.cgiGet( "Z11991DVEntHfCon"), 0) ;
         Z11992DVEntBnc = httpContext.cgiGet( "Z11992DVEntBnc") ;
         Z11993DVEntPrvNu = (int)(localUtil.ctol( httpContext.cgiGet( "Z11993DVEntPrvNu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11994DVEntCC = httpContext.cgiGet( "Z11994DVEntCC") ;
         Z11995DVEntCCoCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z11995DVEntCCoCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11996DVEntRemTp = httpContext.cgiGet( "Z11996DVEntRemTp") ;
         Z11997DVEntRemSu = httpContext.cgiGet( "Z11997DVEntRemSu") ;
         Z11998DVEntRemFc = localUtil.ctod( httpContext.cgiGet( "Z11998DVEntRemFc"), 0) ;
         Z11999DVEntRemNr = httpContext.cgiGet( "Z11999DVEntRemNr") ;
         Z12000DVEntUniAl = localUtil.ctond( httpContext.cgiGet( "Z12000DVEntUniAl")) ;
         Z12001DVEntObs = httpContext.cgiGet( "Z12001DVEntObs") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.cgiGet( edtDVPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVLINENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVLinEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11972DVLinEnt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
         }
         else
         {
            A11972DVLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtDVLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
         }
         A11973DVAlbaran = httpContext.cgiGet( edtDVAlbaran_Internalname) ;
         n11973DVAlbaran = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11973DVAlbaran", A11973DVAlbaran);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11974DVPedCod = 0 ;
            n11974DVPedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11974DVPedCod), 8, 0));
         }
         else
         {
            A11974DVPedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDVPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11974DVPedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11974DVPedCod), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVEntUniEn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVEntUniEn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTUNIEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntUniEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11975DVEntUniEn = DecimalUtil.ZERO ;
            n11975DVEntUniEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrimstr( A11975DVEntUniEn, 9, 2));
         }
         else
         {
            A11975DVEntUniEn = localUtil.ctond( httpContext.cgiGet( edtDVEntUniEn_Internalname)) ;
            n11975DVEntUniEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrimstr( A11975DVEntUniEn, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVEntPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11976DVEntPre = DecimalUtil.ZERO ;
            n11976DVEntPre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrimstr( A11976DVEntPre, 14, 5));
         }
         else
         {
            A11976DVEntPre = localUtil.ctond( httpContext.cgiGet( edtDVEntPre_Internalname)) ;
            n11976DVEntPre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrimstr( A11976DVEntPre, 14, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntNumCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntNumCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTNUMCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntNumCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11977DVEntNumCo = (short)(0) ;
            n11977DVEntNumCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11977DVEntNumCo), 3, 0));
         }
         else
         {
            A11977DVEntNumCo = (short)(localUtil.ctol( httpContext.cgiGet( edtDVEntNumCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11977DVEntNumCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11977DVEntNumCo), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVEntUniRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVEntUniRe_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTUNIRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntUniRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11978DVEntUniRe = DecimalUtil.ZERO ;
            n11978DVEntUniRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrimstr( A11978DVEntUniRe, 11, 4));
         }
         else
         {
            A11978DVEntUniRe = localUtil.ctond( httpContext.cgiGet( edtDVEntUniRe_Internalname)) ;
            n11978DVEntUniRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrimstr( A11978DVEntUniRe, 11, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTETI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntEti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11979DVEntEti = (byte)(0) ;
            n11979DVEntEti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.str( A11979DVEntEti, 1, 0));
         }
         else
         {
            A11979DVEntEti = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11979DVEntEti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.str( A11979DVEntEti, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11980DVEntCon = (byte)(0) ;
            n11980DVEntCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.str( A11980DVEntCon, 1, 0));
         }
         else
         {
            A11980DVEntCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11980DVEntCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.str( A11980DVEntCon, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVEntFecEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVENTFECEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntFecEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11981DVEntFecEn = GXutil.nullDate() ;
            n11981DVEntFecEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
         }
         else
         {
            A11981DVEntFecEn = localUtil.ctod( httpContext.cgiGet( edtDVEntFecEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11981DVEntFecEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntConIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntConIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTCONIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntConIn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11982DVEntConIn = 0 ;
            n11982DVEntConIn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11982DVEntConIn), 8, 0));
         }
         else
         {
            A11982DVEntConIn = (int)(localUtil.ctol( httpContext.cgiGet( edtDVEntConIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11982DVEntConIn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11982DVEntConIn), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntConFi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntConFi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTCONFI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntConFi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11983DVEntConFi = 0 ;
            n11983DVEntConFi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11983DVEntConFi), 8, 0));
         }
         else
         {
            A11983DVEntConFi = (int)(localUtil.ctol( httpContext.cgiGet( edtDVEntConFi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11983DVEntConFi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11983DVEntConFi), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntPedCu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntPedCu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTPEDCU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntPedCu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11984DVEntPedCu = (byte)(0) ;
            n11984DVEntPedCu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.str( A11984DVEntPedCu, 1, 0));
         }
         else
         {
            A11984DVEntPedCu = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVEntPedCu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11984DVEntPedCu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.str( A11984DVEntPedCu, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTNRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntNro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11985DVEntNro = 0 ;
            n11985DVEntNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11985DVEntNro), 6, 0));
         }
         else
         {
            A11985DVEntNro = (int)(localUtil.ctol( httpContext.cgiGet( edtDVEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11985DVEntNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11985DVEntNro), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVEntFVal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVENTFVAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntFVal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11986DVEntFVal = GXutil.nullDate() ;
            n11986DVEntFVal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
         }
         else
         {
            A11986DVEntFVal = localUtil.ctod( httpContext.cgiGet( edtDVEntFVal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11986DVEntFVal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
         }
         A11987DVEntLotN = httpContext.cgiGet( edtDVEntLotN_Internalname) ;
         n11987DVEntLotN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11987DVEntLotN", A11987DVEntLotN);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVEntFiCon_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVENTFICON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntFiCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11988DVEntFiCon = GXutil.nullDate() ;
            n11988DVEntFiCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
         }
         else
         {
            A11988DVEntFiCon = localUtil.ctod( httpContext.cgiGet( edtDVEntFiCon_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11988DVEntFiCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDVEntHiCon_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DVENTHICON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntHiCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
            n11989DVEntHiCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11989DVEntHiCon = localUtil.ctot( httpContext.cgiGet( edtDVEntHiCon_Internalname)) ;
            n11989DVEntHiCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVEntFfCon_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVENTFFCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntFfCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11990DVEntFfCon = GXutil.nullDate() ;
            n11990DVEntFfCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
         }
         else
         {
            A11990DVEntFfCon = localUtil.ctod( httpContext.cgiGet( edtDVEntFfCon_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11990DVEntFfCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDVEntHfCon_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DVENTHFCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntHfCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
            n11991DVEntHfCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11991DVEntHfCon = localUtil.ctot( httpContext.cgiGet( edtDVEntHfCon_Internalname)) ;
            n11991DVEntHfCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A11992DVEntBnc = httpContext.cgiGet( edtDVEntBnc_Internalname) ;
         n11992DVEntBnc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11992DVEntBnc", A11992DVEntBnc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntPrvNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntPrvNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTPRVNU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntPrvNu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11993DVEntPrvNu = 0 ;
            n11993DVEntPrvNu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11993DVEntPrvNu), 6, 0));
         }
         else
         {
            A11993DVEntPrvNu = (int)(localUtil.ctol( httpContext.cgiGet( edtDVEntPrvNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11993DVEntPrvNu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11993DVEntPrvNu), 6, 0));
         }
         A11994DVEntCC = httpContext.cgiGet( edtDVEntCC_Internalname) ;
         n11994DVEntCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11994DVEntCC", A11994DVEntCC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntCCoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVEntCCoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTCCOCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntCCoCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11995DVEntCCoCo = (short)(0) ;
            n11995DVEntCCoCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11995DVEntCCoCo), 3, 0));
         }
         else
         {
            A11995DVEntCCoCo = (short)(localUtil.ctol( httpContext.cgiGet( edtDVEntCCoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11995DVEntCCoCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11995DVEntCCoCo), 3, 0));
         }
         A11996DVEntRemTp = httpContext.cgiGet( edtDVEntRemTp_Internalname) ;
         n11996DVEntRemTp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11996DVEntRemTp", A11996DVEntRemTp);
         A11997DVEntRemSu = httpContext.cgiGet( edtDVEntRemSu_Internalname) ;
         n11997DVEntRemSu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11997DVEntRemSu", A11997DVEntRemSu);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVEntRemFc_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVENTREMFC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntRemFc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11998DVEntRemFc = GXutil.nullDate() ;
            n11998DVEntRemFc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
         }
         else
         {
            A11998DVEntRemFc = localUtil.ctod( httpContext.cgiGet( edtDVEntRemFc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11998DVEntRemFc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
         }
         A11999DVEntRemNr = httpContext.cgiGet( edtDVEntRemNr_Internalname) ;
         n11999DVEntRemNr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11999DVEntRemNr", A11999DVEntRemNr);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVEntUniAl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVEntUniAl_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVENTUNIAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVEntUniAl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12000DVEntUniAl = DecimalUtil.ZERO ;
            n12000DVEntUniAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrimstr( A12000DVEntUniAl, 11, 4));
         }
         else
         {
            A12000DVEntUniAl = localUtil.ctond( httpContext.cgiGet( edtDVEntUniAl_Internalname)) ;
            n12000DVEntUniAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrimstr( A12000DVEntUniAl, 11, 4));
         }
         A12001DVEntObs = httpContext.cgiGet( edtDVEntObs_Internalname) ;
         n12001DVEntObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12001DVEntObs", A12001DVEntObs);
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
            A11972DVLinEnt = (short)(GXutil.lval( httpContext.GetPar( "DVLinEnt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
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
            initAll1IS1676( ) ;
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
      disableAttributes1IS1676( ) ;
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

   public void confirm_1IS0( )
   {
      beforeValidate1IS1676( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IS1676( ) ;
         }
         else
         {
            checkExtendedTable1IS1676( ) ;
            if ( AnyError == 0 )
            {
               zm1IS1676( 2) ;
            }
            closeExtendedTableCursors1IS1676( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IS0( ) ;
      }
   }

   public void resetCaption1IS0( )
   {
   }

   public void zm1IS1676( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11973DVAlbaran = T01IS3_A11973DVAlbaran[0] ;
            Z11974DVPedCod = T01IS3_A11974DVPedCod[0] ;
            Z11975DVEntUniEn = T01IS3_A11975DVEntUniEn[0] ;
            Z11976DVEntPre = T01IS3_A11976DVEntPre[0] ;
            Z11977DVEntNumCo = T01IS3_A11977DVEntNumCo[0] ;
            Z11978DVEntUniRe = T01IS3_A11978DVEntUniRe[0] ;
            Z11979DVEntEti = T01IS3_A11979DVEntEti[0] ;
            Z11980DVEntCon = T01IS3_A11980DVEntCon[0] ;
            Z11981DVEntFecEn = T01IS3_A11981DVEntFecEn[0] ;
            Z11982DVEntConIn = T01IS3_A11982DVEntConIn[0] ;
            Z11983DVEntConFi = T01IS3_A11983DVEntConFi[0] ;
            Z11984DVEntPedCu = T01IS3_A11984DVEntPedCu[0] ;
            Z11985DVEntNro = T01IS3_A11985DVEntNro[0] ;
            Z11986DVEntFVal = T01IS3_A11986DVEntFVal[0] ;
            Z11987DVEntLotN = T01IS3_A11987DVEntLotN[0] ;
            Z11988DVEntFiCon = T01IS3_A11988DVEntFiCon[0] ;
            Z11989DVEntHiCon = T01IS3_A11989DVEntHiCon[0] ;
            Z11990DVEntFfCon = T01IS3_A11990DVEntFfCon[0] ;
            Z11991DVEntHfCon = T01IS3_A11991DVEntHfCon[0] ;
            Z11992DVEntBnc = T01IS3_A11992DVEntBnc[0] ;
            Z11993DVEntPrvNu = T01IS3_A11993DVEntPrvNu[0] ;
            Z11994DVEntCC = T01IS3_A11994DVEntCC[0] ;
            Z11995DVEntCCoCo = T01IS3_A11995DVEntCCoCo[0] ;
            Z11996DVEntRemTp = T01IS3_A11996DVEntRemTp[0] ;
            Z11997DVEntRemSu = T01IS3_A11997DVEntRemSu[0] ;
            Z11998DVEntRemFc = T01IS3_A11998DVEntRemFc[0] ;
            Z11999DVEntRemNr = T01IS3_A11999DVEntRemNr[0] ;
            Z12000DVEntUniAl = T01IS3_A12000DVEntUniAl[0] ;
            Z12001DVEntObs = T01IS3_A12001DVEntObs[0] ;
         }
         else
         {
            Z11973DVAlbaran = A11973DVAlbaran ;
            Z11974DVPedCod = A11974DVPedCod ;
            Z11975DVEntUniEn = A11975DVEntUniEn ;
            Z11976DVEntPre = A11976DVEntPre ;
            Z11977DVEntNumCo = A11977DVEntNumCo ;
            Z11978DVEntUniRe = A11978DVEntUniRe ;
            Z11979DVEntEti = A11979DVEntEti ;
            Z11980DVEntCon = A11980DVEntCon ;
            Z11981DVEntFecEn = A11981DVEntFecEn ;
            Z11982DVEntConIn = A11982DVEntConIn ;
            Z11983DVEntConFi = A11983DVEntConFi ;
            Z11984DVEntPedCu = A11984DVEntPedCu ;
            Z11985DVEntNro = A11985DVEntNro ;
            Z11986DVEntFVal = A11986DVEntFVal ;
            Z11987DVEntLotN = A11987DVEntLotN ;
            Z11988DVEntFiCon = A11988DVEntFiCon ;
            Z11989DVEntHiCon = A11989DVEntHiCon ;
            Z11990DVEntFfCon = A11990DVEntFfCon ;
            Z11991DVEntHfCon = A11991DVEntHfCon ;
            Z11992DVEntBnc = A11992DVEntBnc ;
            Z11993DVEntPrvNu = A11993DVEntPrvNu ;
            Z11994DVEntCC = A11994DVEntCC ;
            Z11995DVEntCCoCo = A11995DVEntCCoCo ;
            Z11996DVEntRemTp = A11996DVEntRemTp ;
            Z11997DVEntRemSu = A11997DVEntRemSu ;
            Z11998DVEntRemFc = A11998DVEntRemFc ;
            Z11999DVEntRemNr = A11999DVEntRemNr ;
            Z12000DVEntUniAl = A12000DVEntUniAl ;
            Z12001DVEntObs = A12001DVEntObs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11972DVLinEnt = A11972DVLinEnt ;
         Z11973DVAlbaran = A11973DVAlbaran ;
         Z11974DVPedCod = A11974DVPedCod ;
         Z11975DVEntUniEn = A11975DVEntUniEn ;
         Z11976DVEntPre = A11976DVEntPre ;
         Z11977DVEntNumCo = A11977DVEntNumCo ;
         Z11978DVEntUniRe = A11978DVEntUniRe ;
         Z11979DVEntEti = A11979DVEntEti ;
         Z11980DVEntCon = A11980DVEntCon ;
         Z11981DVEntFecEn = A11981DVEntFecEn ;
         Z11982DVEntConIn = A11982DVEntConIn ;
         Z11983DVEntConFi = A11983DVEntConFi ;
         Z11984DVEntPedCu = A11984DVEntPedCu ;
         Z11985DVEntNro = A11985DVEntNro ;
         Z11986DVEntFVal = A11986DVEntFVal ;
         Z11987DVEntLotN = A11987DVEntLotN ;
         Z11988DVEntFiCon = A11988DVEntFiCon ;
         Z11989DVEntHiCon = A11989DVEntHiCon ;
         Z11990DVEntFfCon = A11990DVEntFfCon ;
         Z11991DVEntHfCon = A11991DVEntHfCon ;
         Z11992DVEntBnc = A11992DVEntBnc ;
         Z11993DVEntPrvNu = A11993DVEntPrvNu ;
         Z11994DVEntCC = A11994DVEntCC ;
         Z11995DVEntCCoCo = A11995DVEntCCoCo ;
         Z11996DVEntRemTp = A11996DVEntRemTp ;
         Z11997DVEntRemSu = A11997DVEntRemSu ;
         Z11998DVEntRemFc = A11998DVEntRemFc ;
         Z11999DVEntRemNr = A11999DVEntRemNr ;
         Z12000DVEntUniAl = A12000DVEntUniAl ;
         Z12001DVEntObs = A12001DVEntObs ;
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

   public void load1IS1676( )
   {
      /* Using cursor T01IS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1676 = (short)(1) ;
         A11973DVAlbaran = T01IS5_A11973DVAlbaran[0] ;
         n11973DVAlbaran = T01IS5_n11973DVAlbaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11973DVAlbaran", A11973DVAlbaran);
         A11974DVPedCod = T01IS5_A11974DVPedCod[0] ;
         n11974DVPedCod = T01IS5_n11974DVPedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11974DVPedCod), 8, 0));
         A11975DVEntUniEn = T01IS5_A11975DVEntUniEn[0] ;
         n11975DVEntUniEn = T01IS5_n11975DVEntUniEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrimstr( A11975DVEntUniEn, 9, 2));
         A11976DVEntPre = T01IS5_A11976DVEntPre[0] ;
         n11976DVEntPre = T01IS5_n11976DVEntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrimstr( A11976DVEntPre, 14, 5));
         A11977DVEntNumCo = T01IS5_A11977DVEntNumCo[0] ;
         n11977DVEntNumCo = T01IS5_n11977DVEntNumCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11977DVEntNumCo), 3, 0));
         A11978DVEntUniRe = T01IS5_A11978DVEntUniRe[0] ;
         n11978DVEntUniRe = T01IS5_n11978DVEntUniRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrimstr( A11978DVEntUniRe, 11, 4));
         A11979DVEntEti = T01IS5_A11979DVEntEti[0] ;
         n11979DVEntEti = T01IS5_n11979DVEntEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.str( A11979DVEntEti, 1, 0));
         A11980DVEntCon = T01IS5_A11980DVEntCon[0] ;
         n11980DVEntCon = T01IS5_n11980DVEntCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.str( A11980DVEntCon, 1, 0));
         A11981DVEntFecEn = T01IS5_A11981DVEntFecEn[0] ;
         n11981DVEntFecEn = T01IS5_n11981DVEntFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
         A11982DVEntConIn = T01IS5_A11982DVEntConIn[0] ;
         n11982DVEntConIn = T01IS5_n11982DVEntConIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11982DVEntConIn), 8, 0));
         A11983DVEntConFi = T01IS5_A11983DVEntConFi[0] ;
         n11983DVEntConFi = T01IS5_n11983DVEntConFi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11983DVEntConFi), 8, 0));
         A11984DVEntPedCu = T01IS5_A11984DVEntPedCu[0] ;
         n11984DVEntPedCu = T01IS5_n11984DVEntPedCu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.str( A11984DVEntPedCu, 1, 0));
         A11985DVEntNro = T01IS5_A11985DVEntNro[0] ;
         n11985DVEntNro = T01IS5_n11985DVEntNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11985DVEntNro), 6, 0));
         A11986DVEntFVal = T01IS5_A11986DVEntFVal[0] ;
         n11986DVEntFVal = T01IS5_n11986DVEntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
         A11987DVEntLotN = T01IS5_A11987DVEntLotN[0] ;
         n11987DVEntLotN = T01IS5_n11987DVEntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11987DVEntLotN", A11987DVEntLotN);
         A11988DVEntFiCon = T01IS5_A11988DVEntFiCon[0] ;
         n11988DVEntFiCon = T01IS5_n11988DVEntFiCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
         A11989DVEntHiCon = T01IS5_A11989DVEntHiCon[0] ;
         n11989DVEntHiCon = T01IS5_n11989DVEntHiCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11990DVEntFfCon = T01IS5_A11990DVEntFfCon[0] ;
         n11990DVEntFfCon = T01IS5_n11990DVEntFfCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
         A11991DVEntHfCon = T01IS5_A11991DVEntHfCon[0] ;
         n11991DVEntHfCon = T01IS5_n11991DVEntHfCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11992DVEntBnc = T01IS5_A11992DVEntBnc[0] ;
         n11992DVEntBnc = T01IS5_n11992DVEntBnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11992DVEntBnc", A11992DVEntBnc);
         A11993DVEntPrvNu = T01IS5_A11993DVEntPrvNu[0] ;
         n11993DVEntPrvNu = T01IS5_n11993DVEntPrvNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11993DVEntPrvNu), 6, 0));
         A11994DVEntCC = T01IS5_A11994DVEntCC[0] ;
         n11994DVEntCC = T01IS5_n11994DVEntCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11994DVEntCC", A11994DVEntCC);
         A11995DVEntCCoCo = T01IS5_A11995DVEntCCoCo[0] ;
         n11995DVEntCCoCo = T01IS5_n11995DVEntCCoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11995DVEntCCoCo), 3, 0));
         A11996DVEntRemTp = T01IS5_A11996DVEntRemTp[0] ;
         n11996DVEntRemTp = T01IS5_n11996DVEntRemTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11996DVEntRemTp", A11996DVEntRemTp);
         A11997DVEntRemSu = T01IS5_A11997DVEntRemSu[0] ;
         n11997DVEntRemSu = T01IS5_n11997DVEntRemSu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11997DVEntRemSu", A11997DVEntRemSu);
         A11998DVEntRemFc = T01IS5_A11998DVEntRemFc[0] ;
         n11998DVEntRemFc = T01IS5_n11998DVEntRemFc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
         A11999DVEntRemNr = T01IS5_A11999DVEntRemNr[0] ;
         n11999DVEntRemNr = T01IS5_n11999DVEntRemNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11999DVEntRemNr", A11999DVEntRemNr);
         A12000DVEntUniAl = T01IS5_A12000DVEntUniAl[0] ;
         n12000DVEntUniAl = T01IS5_n12000DVEntUniAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrimstr( A12000DVEntUniAl, 11, 4));
         A12001DVEntObs = T01IS5_A12001DVEntObs[0] ;
         n12001DVEntObs = T01IS5_n12001DVEntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12001DVEntObs", A12001DVEntObs);
         zm1IS1676( -1) ;
      }
      pr_default.close(3);
      onLoadActions1IS1676( ) ;
   }

   public void onLoadActions1IS1676( )
   {
   }

   public void checkExtendedTable1IS1676( )
   {
      nIsDirty_1676 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IS4 */
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

   public void closeExtendedTableCursors1IS1676( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A11935DVPrdNum )
   {
      /* Using cursor T01IS6 */
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

   public void getKey1IS1676( )
   {
      /* Using cursor T01IS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1676 = (short)(1) ;
      }
      else
      {
         RcdFound1676 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IS1676( 1) ;
         RcdFound1676 = (short)(1) ;
         A11972DVLinEnt = T01IS3_A11972DVLinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
         A11973DVAlbaran = T01IS3_A11973DVAlbaran[0] ;
         n11973DVAlbaran = T01IS3_n11973DVAlbaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11973DVAlbaran", A11973DVAlbaran);
         A11974DVPedCod = T01IS3_A11974DVPedCod[0] ;
         n11974DVPedCod = T01IS3_n11974DVPedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11974DVPedCod), 8, 0));
         A11975DVEntUniEn = T01IS3_A11975DVEntUniEn[0] ;
         n11975DVEntUniEn = T01IS3_n11975DVEntUniEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrimstr( A11975DVEntUniEn, 9, 2));
         A11976DVEntPre = T01IS3_A11976DVEntPre[0] ;
         n11976DVEntPre = T01IS3_n11976DVEntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrimstr( A11976DVEntPre, 14, 5));
         A11977DVEntNumCo = T01IS3_A11977DVEntNumCo[0] ;
         n11977DVEntNumCo = T01IS3_n11977DVEntNumCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11977DVEntNumCo), 3, 0));
         A11978DVEntUniRe = T01IS3_A11978DVEntUniRe[0] ;
         n11978DVEntUniRe = T01IS3_n11978DVEntUniRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrimstr( A11978DVEntUniRe, 11, 4));
         A11979DVEntEti = T01IS3_A11979DVEntEti[0] ;
         n11979DVEntEti = T01IS3_n11979DVEntEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.str( A11979DVEntEti, 1, 0));
         A11980DVEntCon = T01IS3_A11980DVEntCon[0] ;
         n11980DVEntCon = T01IS3_n11980DVEntCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.str( A11980DVEntCon, 1, 0));
         A11981DVEntFecEn = T01IS3_A11981DVEntFecEn[0] ;
         n11981DVEntFecEn = T01IS3_n11981DVEntFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
         A11982DVEntConIn = T01IS3_A11982DVEntConIn[0] ;
         n11982DVEntConIn = T01IS3_n11982DVEntConIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11982DVEntConIn), 8, 0));
         A11983DVEntConFi = T01IS3_A11983DVEntConFi[0] ;
         n11983DVEntConFi = T01IS3_n11983DVEntConFi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11983DVEntConFi), 8, 0));
         A11984DVEntPedCu = T01IS3_A11984DVEntPedCu[0] ;
         n11984DVEntPedCu = T01IS3_n11984DVEntPedCu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.str( A11984DVEntPedCu, 1, 0));
         A11985DVEntNro = T01IS3_A11985DVEntNro[0] ;
         n11985DVEntNro = T01IS3_n11985DVEntNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11985DVEntNro), 6, 0));
         A11986DVEntFVal = T01IS3_A11986DVEntFVal[0] ;
         n11986DVEntFVal = T01IS3_n11986DVEntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
         A11987DVEntLotN = T01IS3_A11987DVEntLotN[0] ;
         n11987DVEntLotN = T01IS3_n11987DVEntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11987DVEntLotN", A11987DVEntLotN);
         A11988DVEntFiCon = T01IS3_A11988DVEntFiCon[0] ;
         n11988DVEntFiCon = T01IS3_n11988DVEntFiCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
         A11989DVEntHiCon = T01IS3_A11989DVEntHiCon[0] ;
         n11989DVEntHiCon = T01IS3_n11989DVEntHiCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11990DVEntFfCon = T01IS3_A11990DVEntFfCon[0] ;
         n11990DVEntFfCon = T01IS3_n11990DVEntFfCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
         A11991DVEntHfCon = T01IS3_A11991DVEntHfCon[0] ;
         n11991DVEntHfCon = T01IS3_n11991DVEntHfCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11992DVEntBnc = T01IS3_A11992DVEntBnc[0] ;
         n11992DVEntBnc = T01IS3_n11992DVEntBnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11992DVEntBnc", A11992DVEntBnc);
         A11993DVEntPrvNu = T01IS3_A11993DVEntPrvNu[0] ;
         n11993DVEntPrvNu = T01IS3_n11993DVEntPrvNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11993DVEntPrvNu), 6, 0));
         A11994DVEntCC = T01IS3_A11994DVEntCC[0] ;
         n11994DVEntCC = T01IS3_n11994DVEntCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11994DVEntCC", A11994DVEntCC);
         A11995DVEntCCoCo = T01IS3_A11995DVEntCCoCo[0] ;
         n11995DVEntCCoCo = T01IS3_n11995DVEntCCoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11995DVEntCCoCo), 3, 0));
         A11996DVEntRemTp = T01IS3_A11996DVEntRemTp[0] ;
         n11996DVEntRemTp = T01IS3_n11996DVEntRemTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11996DVEntRemTp", A11996DVEntRemTp);
         A11997DVEntRemSu = T01IS3_A11997DVEntRemSu[0] ;
         n11997DVEntRemSu = T01IS3_n11997DVEntRemSu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11997DVEntRemSu", A11997DVEntRemSu);
         A11998DVEntRemFc = T01IS3_A11998DVEntRemFc[0] ;
         n11998DVEntRemFc = T01IS3_n11998DVEntRemFc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
         A11999DVEntRemNr = T01IS3_A11999DVEntRemNr[0] ;
         n11999DVEntRemNr = T01IS3_n11999DVEntRemNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11999DVEntRemNr", A11999DVEntRemNr);
         A12000DVEntUniAl = T01IS3_A12000DVEntUniAl[0] ;
         n12000DVEntUniAl = T01IS3_n12000DVEntUniAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrimstr( A12000DVEntUniAl, 11, 4));
         A12001DVEntObs = T01IS3_A12001DVEntObs[0] ;
         n12001DVEntObs = T01IS3_n12001DVEntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12001DVEntObs", A12001DVEntObs);
         A396EmprCod = T01IS3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IS3_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z11972DVLinEnt = A11972DVLinEnt ;
         sMode1676 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IS1676( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1676 = (short)(0) ;
            initializeNonKey1IS1676( ) ;
         }
         Gx_mode = sMode1676 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1676 = (short)(0) ;
         initializeNonKey1IS1676( ) ;
         sMode1676 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1676 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IS1676( ) ;
      if ( RcdFound1676 == 0 )
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
      RcdFound1676 = (short)(0) ;
      /* Using cursor T01IS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Short.valueOf(A11972DVLinEnt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IS8_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IS8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IS8_A11972DVLinEnt[0] < A11972DVLinEnt ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IS8_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IS8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IS8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IS8_A11972DVLinEnt[0] > A11972DVLinEnt ) ) )
         {
            A396EmprCod = T01IS8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IS8_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11972DVLinEnt = T01IS8_A11972DVLinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
            RcdFound1676 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1676 = (short)(0) ;
      /* Using cursor T01IS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Short.valueOf(A11972DVLinEnt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IS9_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IS9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IS9_A11972DVLinEnt[0] > A11972DVLinEnt ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IS9_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IS9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IS9_A11972DVLinEnt[0] < A11972DVLinEnt ) ) )
         {
            A396EmprCod = T01IS9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IS9_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11972DVLinEnt = T01IS9_A11972DVLinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
            RcdFound1676 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IS1676( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IS1676( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1676 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11972DVLinEnt != Z11972DVLinEnt ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11935DVPrdNum = Z11935DVPrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
               A11972DVLinEnt = Z11972DVLinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
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
               update1IS1676( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11972DVLinEnt != Z11972DVLinEnt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IS1676( ) ;
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
                  insert1IS1676( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11972DVLinEnt != Z11972DVLinEnt ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = Z11935DVPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11972DVLinEnt = Z11972DVLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
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
      getKey1IS1676( ) ;
      if ( RcdFound1676 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11972DVLinEnt != Z11972DVLinEnt ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = Z11935DVPrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11972DVLinEnt = Z11972DVLinEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11972DVLinEnt != Z11972DVLinEnt ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdventalm");
      GX_FocusControl = edtDVAlbaran_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IS0( ) ;
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
      if ( RcdFound1676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDVAlbaran_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IS1676( ) ;
      if ( RcdFound1676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVAlbaran_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IS1676( ) ;
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
      if ( RcdFound1676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVAlbaran_Internalname ;
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
      if ( RcdFound1676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVAlbaran_Internalname ;
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
      scanStart1IS1676( ) ;
      if ( RcdFound1676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1676 != 0 )
         {
            scanNext1IS1676( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVAlbaran_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IS1676( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IS1676( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11973DVAlbaran, T01IS2_A11973DVAlbaran[0]) != 0 ) || ( Z11974DVPedCod != T01IS2_A11974DVPedCod[0] ) || ( DecimalUtil.compareTo(Z11975DVEntUniEn, T01IS2_A11975DVEntUniEn[0]) != 0 ) || ( DecimalUtil.compareTo(Z11976DVEntPre, T01IS2_A11976DVEntPre[0]) != 0 ) || ( Z11977DVEntNumCo != T01IS2_A11977DVEntNumCo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11978DVEntUniRe, T01IS2_A11978DVEntUniRe[0]) != 0 ) || ( Z11979DVEntEti != T01IS2_A11979DVEntEti[0] ) || ( Z11980DVEntCon != T01IS2_A11980DVEntCon[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11981DVEntFecEn), GXutil.resetTime(T01IS2_A11981DVEntFecEn[0])) ) || ( Z11982DVEntConIn != T01IS2_A11982DVEntConIn[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11983DVEntConFi != T01IS2_A11983DVEntConFi[0] ) || ( Z11984DVEntPedCu != T01IS2_A11984DVEntPedCu[0] ) || ( Z11985DVEntNro != T01IS2_A11985DVEntNro[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11986DVEntFVal), GXutil.resetTime(T01IS2_A11986DVEntFVal[0])) ) || ( GXutil.strcmp(Z11987DVEntLotN, T01IS2_A11987DVEntLotN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z11988DVEntFiCon), GXutil.resetTime(T01IS2_A11988DVEntFiCon[0])) ) || !( GXutil.dateCompare(Z11989DVEntHiCon, T01IS2_A11989DVEntHiCon[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11990DVEntFfCon), GXutil.resetTime(T01IS2_A11990DVEntFfCon[0])) ) || !( GXutil.dateCompare(Z11991DVEntHfCon, T01IS2_A11991DVEntHfCon[0]) ) || ( GXutil.strcmp(Z11992DVEntBnc, T01IS2_A11992DVEntBnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11993DVEntPrvNu != T01IS2_A11993DVEntPrvNu[0] ) || ( GXutil.strcmp(Z11994DVEntCC, T01IS2_A11994DVEntCC[0]) != 0 ) || ( Z11995DVEntCCoCo != T01IS2_A11995DVEntCCoCo[0] ) || ( GXutil.strcmp(Z11996DVEntRemTp, T01IS2_A11996DVEntRemTp[0]) != 0 ) || ( GXutil.strcmp(Z11997DVEntRemSu, T01IS2_A11997DVEntRemSu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z11998DVEntRemFc), GXutil.resetTime(T01IS2_A11998DVEntRemFc[0])) ) || ( GXutil.strcmp(Z11999DVEntRemNr, T01IS2_A11999DVEntRemNr[0]) != 0 ) || ( DecimalUtil.compareTo(Z12000DVEntUniAl, T01IS2_A12000DVEntUniAl[0]) != 0 ) || ( GXutil.strcmp(Z12001DVEntObs, T01IS2_A12001DVEntObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11973DVAlbaran, T01IS2_A11973DVAlbaran[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVAlbaran");
               GXutil.writeLogRaw("Old: ",Z11973DVAlbaran);
               GXutil.writeLogRaw("Current: ",T01IS2_A11973DVAlbaran[0]);
            }
            if ( Z11974DVPedCod != T01IS2_A11974DVPedCod[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVPedCod");
               GXutil.writeLogRaw("Old: ",Z11974DVPedCod);
               GXutil.writeLogRaw("Current: ",T01IS2_A11974DVPedCod[0]);
            }
            if ( DecimalUtil.compareTo(Z11975DVEntUniEn, T01IS2_A11975DVEntUniEn[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntUniEn");
               GXutil.writeLogRaw("Old: ",Z11975DVEntUniEn);
               GXutil.writeLogRaw("Current: ",T01IS2_A11975DVEntUniEn[0]);
            }
            if ( DecimalUtil.compareTo(Z11976DVEntPre, T01IS2_A11976DVEntPre[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntPre");
               GXutil.writeLogRaw("Old: ",Z11976DVEntPre);
               GXutil.writeLogRaw("Current: ",T01IS2_A11976DVEntPre[0]);
            }
            if ( Z11977DVEntNumCo != T01IS2_A11977DVEntNumCo[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntNumCo");
               GXutil.writeLogRaw("Old: ",Z11977DVEntNumCo);
               GXutil.writeLogRaw("Current: ",T01IS2_A11977DVEntNumCo[0]);
            }
            if ( DecimalUtil.compareTo(Z11978DVEntUniRe, T01IS2_A11978DVEntUniRe[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntUniRe");
               GXutil.writeLogRaw("Old: ",Z11978DVEntUniRe);
               GXutil.writeLogRaw("Current: ",T01IS2_A11978DVEntUniRe[0]);
            }
            if ( Z11979DVEntEti != T01IS2_A11979DVEntEti[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntEti");
               GXutil.writeLogRaw("Old: ",Z11979DVEntEti);
               GXutil.writeLogRaw("Current: ",T01IS2_A11979DVEntEti[0]);
            }
            if ( Z11980DVEntCon != T01IS2_A11980DVEntCon[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntCon");
               GXutil.writeLogRaw("Old: ",Z11980DVEntCon);
               GXutil.writeLogRaw("Current: ",T01IS2_A11980DVEntCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11981DVEntFecEn), GXutil.resetTime(T01IS2_A11981DVEntFecEn[0])) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntFecEn");
               GXutil.writeLogRaw("Old: ",Z11981DVEntFecEn);
               GXutil.writeLogRaw("Current: ",T01IS2_A11981DVEntFecEn[0]);
            }
            if ( Z11982DVEntConIn != T01IS2_A11982DVEntConIn[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntConIn");
               GXutil.writeLogRaw("Old: ",Z11982DVEntConIn);
               GXutil.writeLogRaw("Current: ",T01IS2_A11982DVEntConIn[0]);
            }
            if ( Z11983DVEntConFi != T01IS2_A11983DVEntConFi[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntConFi");
               GXutil.writeLogRaw("Old: ",Z11983DVEntConFi);
               GXutil.writeLogRaw("Current: ",T01IS2_A11983DVEntConFi[0]);
            }
            if ( Z11984DVEntPedCu != T01IS2_A11984DVEntPedCu[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntPedCu");
               GXutil.writeLogRaw("Old: ",Z11984DVEntPedCu);
               GXutil.writeLogRaw("Current: ",T01IS2_A11984DVEntPedCu[0]);
            }
            if ( Z11985DVEntNro != T01IS2_A11985DVEntNro[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntNro");
               GXutil.writeLogRaw("Old: ",Z11985DVEntNro);
               GXutil.writeLogRaw("Current: ",T01IS2_A11985DVEntNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11986DVEntFVal), GXutil.resetTime(T01IS2_A11986DVEntFVal[0])) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntFVal");
               GXutil.writeLogRaw("Old: ",Z11986DVEntFVal);
               GXutil.writeLogRaw("Current: ",T01IS2_A11986DVEntFVal[0]);
            }
            if ( GXutil.strcmp(Z11987DVEntLotN, T01IS2_A11987DVEntLotN[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntLotN");
               GXutil.writeLogRaw("Old: ",Z11987DVEntLotN);
               GXutil.writeLogRaw("Current: ",T01IS2_A11987DVEntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11988DVEntFiCon), GXutil.resetTime(T01IS2_A11988DVEntFiCon[0])) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntFiCon");
               GXutil.writeLogRaw("Old: ",Z11988DVEntFiCon);
               GXutil.writeLogRaw("Current: ",T01IS2_A11988DVEntFiCon[0]);
            }
            if ( !( GXutil.dateCompare(Z11989DVEntHiCon, T01IS2_A11989DVEntHiCon[0]) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntHiCon");
               GXutil.writeLogRaw("Old: ",Z11989DVEntHiCon);
               GXutil.writeLogRaw("Current: ",T01IS2_A11989DVEntHiCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11990DVEntFfCon), GXutil.resetTime(T01IS2_A11990DVEntFfCon[0])) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntFfCon");
               GXutil.writeLogRaw("Old: ",Z11990DVEntFfCon);
               GXutil.writeLogRaw("Current: ",T01IS2_A11990DVEntFfCon[0]);
            }
            if ( !( GXutil.dateCompare(Z11991DVEntHfCon, T01IS2_A11991DVEntHfCon[0]) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntHfCon");
               GXutil.writeLogRaw("Old: ",Z11991DVEntHfCon);
               GXutil.writeLogRaw("Current: ",T01IS2_A11991DVEntHfCon[0]);
            }
            if ( GXutil.strcmp(Z11992DVEntBnc, T01IS2_A11992DVEntBnc[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntBnc");
               GXutil.writeLogRaw("Old: ",Z11992DVEntBnc);
               GXutil.writeLogRaw("Current: ",T01IS2_A11992DVEntBnc[0]);
            }
            if ( Z11993DVEntPrvNu != T01IS2_A11993DVEntPrvNu[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntPrvNu");
               GXutil.writeLogRaw("Old: ",Z11993DVEntPrvNu);
               GXutil.writeLogRaw("Current: ",T01IS2_A11993DVEntPrvNu[0]);
            }
            if ( GXutil.strcmp(Z11994DVEntCC, T01IS2_A11994DVEntCC[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntCC");
               GXutil.writeLogRaw("Old: ",Z11994DVEntCC);
               GXutil.writeLogRaw("Current: ",T01IS2_A11994DVEntCC[0]);
            }
            if ( Z11995DVEntCCoCo != T01IS2_A11995DVEntCCoCo[0] )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntCCoCo");
               GXutil.writeLogRaw("Old: ",Z11995DVEntCCoCo);
               GXutil.writeLogRaw("Current: ",T01IS2_A11995DVEntCCoCo[0]);
            }
            if ( GXutil.strcmp(Z11996DVEntRemTp, T01IS2_A11996DVEntRemTp[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntRemTp");
               GXutil.writeLogRaw("Old: ",Z11996DVEntRemTp);
               GXutil.writeLogRaw("Current: ",T01IS2_A11996DVEntRemTp[0]);
            }
            if ( GXutil.strcmp(Z11997DVEntRemSu, T01IS2_A11997DVEntRemSu[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntRemSu");
               GXutil.writeLogRaw("Old: ",Z11997DVEntRemSu);
               GXutil.writeLogRaw("Current: ",T01IS2_A11997DVEntRemSu[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11998DVEntRemFc), GXutil.resetTime(T01IS2_A11998DVEntRemFc[0])) ) )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntRemFc");
               GXutil.writeLogRaw("Old: ",Z11998DVEntRemFc);
               GXutil.writeLogRaw("Current: ",T01IS2_A11998DVEntRemFc[0]);
            }
            if ( GXutil.strcmp(Z11999DVEntRemNr, T01IS2_A11999DVEntRemNr[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntRemNr");
               GXutil.writeLogRaw("Old: ",Z11999DVEntRemNr);
               GXutil.writeLogRaw("Current: ",T01IS2_A11999DVEntRemNr[0]);
            }
            if ( DecimalUtil.compareTo(Z12000DVEntUniAl, T01IS2_A12000DVEntUniAl[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntUniAl");
               GXutil.writeLogRaw("Old: ",Z12000DVEntUniAl);
               GXutil.writeLogRaw("Current: ",T01IS2_A12000DVEntUniAl[0]);
            }
            if ( GXutil.strcmp(Z12001DVEntObs, T01IS2_A12001DVEntObs[0]) != 0 )
            {
               GXutil.writeLogln("tdventalm:[seudo value changed for attri]"+"DVEntObs");
               GXutil.writeLogRaw("Old: ",Z12001DVEntObs);
               GXutil.writeLogRaw("Current: ",T01IS2_A12001DVEntObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"LVNENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IS1676( )
   {
      beforeValidate1IS1676( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IS1676( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IS1676( 0) ;
         checkOptimisticConcurrency1IS1676( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IS1676( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IS1676( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IS10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A11972DVLinEnt), Boolean.valueOf(n11973DVAlbaran), A11973DVAlbaran, Boolean.valueOf(n11974DVPedCod), Integer.valueOf(A11974DVPedCod), Boolean.valueOf(n11975DVEntUniEn), A11975DVEntUniEn, Boolean.valueOf(n11976DVEntPre), A11976DVEntPre, Boolean.valueOf(n11977DVEntNumCo), Short.valueOf(A11977DVEntNumCo), Boolean.valueOf(n11978DVEntUniRe), A11978DVEntUniRe, Boolean.valueOf(n11979DVEntEti), Byte.valueOf(A11979DVEntEti), Boolean.valueOf(n11980DVEntCon), Byte.valueOf(A11980DVEntCon), Boolean.valueOf(n11981DVEntFecEn), A11981DVEntFecEn, Boolean.valueOf(n11982DVEntConIn), Integer.valueOf(A11982DVEntConIn), Boolean.valueOf(n11983DVEntConFi), Integer.valueOf(A11983DVEntConFi), Boolean.valueOf(n11984DVEntPedCu), Byte.valueOf(A11984DVEntPedCu), Boolean.valueOf(n11985DVEntNro), Integer.valueOf(A11985DVEntNro), Boolean.valueOf(n11986DVEntFVal), A11986DVEntFVal, Boolean.valueOf(n11987DVEntLotN), A11987DVEntLotN, Boolean.valueOf(n11988DVEntFiCon), A11988DVEntFiCon, Boolean.valueOf(n11989DVEntHiCon), A11989DVEntHiCon, Boolean.valueOf(n11990DVEntFfCon), A11990DVEntFfCon, Boolean.valueOf(n11991DVEntHfCon), A11991DVEntHfCon, Boolean.valueOf(n11992DVEntBnc), A11992DVEntBnc, Boolean.valueOf(n11993DVEntPrvNu), Integer.valueOf(A11993DVEntPrvNu), Boolean.valueOf(n11994DVEntCC), A11994DVEntCC, Boolean.valueOf(n11995DVEntCCoCo), Short.valueOf(A11995DVEntCCoCo), Boolean.valueOf(n11996DVEntRemTp), A11996DVEntRemTp, Boolean.valueOf(n11997DVEntRemSu), A11997DVEntRemSu, Boolean.valueOf(n11998DVEntRemFc), A11998DVEntRemFc, Boolean.valueOf(n11999DVEntRemNr), A11999DVEntRemNr, Boolean.valueOf(n12000DVEntUniAl), A12000DVEntUniAl, Boolean.valueOf(n12001DVEntObs), A12001DVEntObs, A396EmprCod, A11935DVPrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNENTALM");
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
                        resetCaption1IS0( ) ;
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
            load1IS1676( ) ;
         }
         endLevel1IS1676( ) ;
      }
      closeExtendedTableCursors1IS1676( ) ;
   }

   public void update1IS1676( )
   {
      beforeValidate1IS1676( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IS1676( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IS1676( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IS1676( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IS1676( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IS11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11973DVAlbaran), A11973DVAlbaran, Boolean.valueOf(n11974DVPedCod), Integer.valueOf(A11974DVPedCod), Boolean.valueOf(n11975DVEntUniEn), A11975DVEntUniEn, Boolean.valueOf(n11976DVEntPre), A11976DVEntPre, Boolean.valueOf(n11977DVEntNumCo), Short.valueOf(A11977DVEntNumCo), Boolean.valueOf(n11978DVEntUniRe), A11978DVEntUniRe, Boolean.valueOf(n11979DVEntEti), Byte.valueOf(A11979DVEntEti), Boolean.valueOf(n11980DVEntCon), Byte.valueOf(A11980DVEntCon), Boolean.valueOf(n11981DVEntFecEn), A11981DVEntFecEn, Boolean.valueOf(n11982DVEntConIn), Integer.valueOf(A11982DVEntConIn), Boolean.valueOf(n11983DVEntConFi), Integer.valueOf(A11983DVEntConFi), Boolean.valueOf(n11984DVEntPedCu), Byte.valueOf(A11984DVEntPedCu), Boolean.valueOf(n11985DVEntNro), Integer.valueOf(A11985DVEntNro), Boolean.valueOf(n11986DVEntFVal), A11986DVEntFVal, Boolean.valueOf(n11987DVEntLotN), A11987DVEntLotN, Boolean.valueOf(n11988DVEntFiCon), A11988DVEntFiCon, Boolean.valueOf(n11989DVEntHiCon), A11989DVEntHiCon, Boolean.valueOf(n11990DVEntFfCon), A11990DVEntFfCon, Boolean.valueOf(n11991DVEntHfCon), A11991DVEntHfCon, Boolean.valueOf(n11992DVEntBnc), A11992DVEntBnc, Boolean.valueOf(n11993DVEntPrvNu), Integer.valueOf(A11993DVEntPrvNu), Boolean.valueOf(n11994DVEntCC), A11994DVEntCC, Boolean.valueOf(n11995DVEntCCoCo), Short.valueOf(A11995DVEntCCoCo), Boolean.valueOf(n11996DVEntRemTp), A11996DVEntRemTp, Boolean.valueOf(n11997DVEntRemSu), A11997DVEntRemSu, Boolean.valueOf(n11998DVEntRemFc), A11998DVEntRemFc, Boolean.valueOf(n11999DVEntRemNr), A11999DVEntRemNr, Boolean.valueOf(n12000DVEntUniAl), A12000DVEntUniAl, Boolean.valueOf(n12001DVEntObs), A12001DVEntObs, A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNENTALM");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IS1676( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IS0( ) ;
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
         endLevel1IS1676( ) ;
      }
      closeExtendedTableCursors1IS1676( ) ;
   }

   public void deferredUpdate1IS1676( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IS1676( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IS1676( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IS1676( ) ;
         afterConfirm1IS1676( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IS1676( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IS12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNENTALM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1676 == 0 )
                     {
                        initAll1IS1676( ) ;
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
                     resetCaption1IS0( ) ;
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
      sMode1676 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IS1676( ) ;
      Gx_mode = sMode1676 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IS1676( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IS1676( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IS1676( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdventalm");
         if ( AnyError == 0 )
         {
            confirmValues1IS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdventalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IS1676( )
   {
      /* Using cursor T01IS13 */
      pr_default.execute(11);
      RcdFound1676 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1676 = (short)(1) ;
         A396EmprCod = T01IS13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IS13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11972DVLinEnt = T01IS13_A11972DVLinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IS1676( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1676 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1676 = (short)(1) ;
         A396EmprCod = T01IS13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IS13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11972DVLinEnt = T01IS13_A11972DVLinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
      }
   }

   public void scanEnd1IS1676( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1IS1676( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IS1676( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IS1676( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IS1676( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IS1676( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IS1676( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IS1676( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDVPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum_Enabled), 5, 0), true);
      edtDVLinEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVLinEnt_Enabled), 5, 0), true);
      edtDVAlbaran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVAlbaran_Enabled), 5, 0), true);
      edtDVPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPedCod_Enabled), 5, 0), true);
      edtDVEntUniEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntUniEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntUniEn_Enabled), 5, 0), true);
      edtDVEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntPre_Enabled), 5, 0), true);
      edtDVEntNumCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntNumCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntNumCo_Enabled), 5, 0), true);
      edtDVEntUniRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntUniRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntUniRe_Enabled), 5, 0), true);
      edtDVEntEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntEti_Enabled), 5, 0), true);
      edtDVEntCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntCon_Enabled), 5, 0), true);
      edtDVEntFecEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntFecEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntFecEn_Enabled), 5, 0), true);
      edtDVEntConIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntConIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntConIn_Enabled), 5, 0), true);
      edtDVEntConFi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntConFi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntConFi_Enabled), 5, 0), true);
      edtDVEntPedCu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntPedCu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntPedCu_Enabled), 5, 0), true);
      edtDVEntNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntNro_Enabled), 5, 0), true);
      edtDVEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntFVal_Enabled), 5, 0), true);
      edtDVEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntLotN_Enabled), 5, 0), true);
      edtDVEntFiCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntFiCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntFiCon_Enabled), 5, 0), true);
      edtDVEntHiCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntHiCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntHiCon_Enabled), 5, 0), true);
      edtDVEntFfCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntFfCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntFfCon_Enabled), 5, 0), true);
      edtDVEntHfCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntHfCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntHfCon_Enabled), 5, 0), true);
      edtDVEntBnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntBnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntBnc_Enabled), 5, 0), true);
      edtDVEntPrvNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntPrvNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntPrvNu_Enabled), 5, 0), true);
      edtDVEntCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntCC_Enabled), 5, 0), true);
      edtDVEntCCoCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntCCoCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntCCoCo_Enabled), 5, 0), true);
      edtDVEntRemTp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntRemTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntRemTp_Enabled), 5, 0), true);
      edtDVEntRemSu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntRemSu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntRemSu_Enabled), 5, 0), true);
      edtDVEntRemFc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntRemFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntRemFc_Enabled), 5, 0), true);
      edtDVEntRemNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntRemNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntRemNr_Enabled), 5, 0), true);
      edtDVEntUniAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntUniAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntUniAl_Enabled), 5, 0), true);
      edtDVEntObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVEntObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVEntObs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IS1676( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IS0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdventalm", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11972DVLinEnt", GXutil.ltrim( localUtil.ntoc( Z11972DVLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11973DVAlbaran", GXutil.rtrim( Z11973DVAlbaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11974DVPedCod", GXutil.ltrim( localUtil.ntoc( Z11974DVPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11975DVEntUniEn", GXutil.ltrim( localUtil.ntoc( Z11975DVEntUniEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11976DVEntPre", GXutil.ltrim( localUtil.ntoc( Z11976DVEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11977DVEntNumCo", GXutil.ltrim( localUtil.ntoc( Z11977DVEntNumCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11978DVEntUniRe", GXutil.ltrim( localUtil.ntoc( Z11978DVEntUniRe, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11979DVEntEti", GXutil.ltrim( localUtil.ntoc( Z11979DVEntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11980DVEntCon", GXutil.ltrim( localUtil.ntoc( Z11980DVEntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11981DVEntFecEn", localUtil.dtoc( Z11981DVEntFecEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11982DVEntConIn", GXutil.ltrim( localUtil.ntoc( Z11982DVEntConIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11983DVEntConFi", GXutil.ltrim( localUtil.ntoc( Z11983DVEntConFi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11984DVEntPedCu", GXutil.ltrim( localUtil.ntoc( Z11984DVEntPedCu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11985DVEntNro", GXutil.ltrim( localUtil.ntoc( Z11985DVEntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11986DVEntFVal", localUtil.dtoc( Z11986DVEntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11987DVEntLotN", GXutil.rtrim( Z11987DVEntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11988DVEntFiCon", localUtil.dtoc( Z11988DVEntFiCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11989DVEntHiCon", localUtil.ttoc( Z11989DVEntHiCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11990DVEntFfCon", localUtil.dtoc( Z11990DVEntFfCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11991DVEntHfCon", localUtil.ttoc( Z11991DVEntHfCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11992DVEntBnc", GXutil.rtrim( Z11992DVEntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11993DVEntPrvNu", GXutil.ltrim( localUtil.ntoc( Z11993DVEntPrvNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11994DVEntCC", GXutil.rtrim( Z11994DVEntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11995DVEntCCoCo", GXutil.ltrim( localUtil.ntoc( Z11995DVEntCCoCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11996DVEntRemTp", GXutil.rtrim( Z11996DVEntRemTp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11997DVEntRemSu", GXutil.rtrim( Z11997DVEntRemSu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11998DVEntRemFc", localUtil.dtoc( Z11998DVEntRemFc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11999DVEntRemNr", GXutil.rtrim( Z11999DVEntRemNr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12000DVEntUniAl", GXutil.ltrim( localUtil.ntoc( Z12000DVEntUniAl, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12001DVEntObs", GXutil.rtrim( Z12001DVEntObs));
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
      return formatLink("app.tdventalm", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDVEntAlm" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entradas Productos Quimicos Data View", "") ;
   }

   public void initializeNonKey1IS1676( )
   {
      A11973DVAlbaran = "" ;
      n11973DVAlbaran = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11973DVAlbaran", A11973DVAlbaran);
      A11974DVPedCod = 0 ;
      n11974DVPedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11974DVPedCod), 8, 0));
      A11975DVEntUniEn = DecimalUtil.ZERO ;
      n11975DVEntUniEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrimstr( A11975DVEntUniEn, 9, 2));
      A11976DVEntPre = DecimalUtil.ZERO ;
      n11976DVEntPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrimstr( A11976DVEntPre, 14, 5));
      A11977DVEntNumCo = (short)(0) ;
      n11977DVEntNumCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11977DVEntNumCo), 3, 0));
      A11978DVEntUniRe = DecimalUtil.ZERO ;
      n11978DVEntUniRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrimstr( A11978DVEntUniRe, 11, 4));
      A11979DVEntEti = (byte)(0) ;
      n11979DVEntEti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.str( A11979DVEntEti, 1, 0));
      A11980DVEntCon = (byte)(0) ;
      n11980DVEntCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.str( A11980DVEntCon, 1, 0));
      A11981DVEntFecEn = GXutil.nullDate() ;
      n11981DVEntFecEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
      A11982DVEntConIn = 0 ;
      n11982DVEntConIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11982DVEntConIn), 8, 0));
      A11983DVEntConFi = 0 ;
      n11983DVEntConFi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11983DVEntConFi), 8, 0));
      A11984DVEntPedCu = (byte)(0) ;
      n11984DVEntPedCu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.str( A11984DVEntPedCu, 1, 0));
      A11985DVEntNro = 0 ;
      n11985DVEntNro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11985DVEntNro), 6, 0));
      A11986DVEntFVal = GXutil.nullDate() ;
      n11986DVEntFVal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
      A11987DVEntLotN = "" ;
      n11987DVEntLotN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11987DVEntLotN", A11987DVEntLotN);
      A11988DVEntFiCon = GXutil.nullDate() ;
      n11988DVEntFiCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
      A11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      n11989DVEntHiCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11990DVEntFfCon = GXutil.nullDate() ;
      n11990DVEntFfCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
      A11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      n11991DVEntHfCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11992DVEntBnc = "" ;
      n11992DVEntBnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11992DVEntBnc", A11992DVEntBnc);
      A11993DVEntPrvNu = 0 ;
      n11993DVEntPrvNu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11993DVEntPrvNu), 6, 0));
      A11994DVEntCC = "" ;
      n11994DVEntCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11994DVEntCC", A11994DVEntCC);
      A11995DVEntCCoCo = (short)(0) ;
      n11995DVEntCCoCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11995DVEntCCoCo), 3, 0));
      A11996DVEntRemTp = "" ;
      n11996DVEntRemTp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11996DVEntRemTp", A11996DVEntRemTp);
      A11997DVEntRemSu = "" ;
      n11997DVEntRemSu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11997DVEntRemSu", A11997DVEntRemSu);
      A11998DVEntRemFc = GXutil.nullDate() ;
      n11998DVEntRemFc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
      A11999DVEntRemNr = "" ;
      n11999DVEntRemNr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11999DVEntRemNr", A11999DVEntRemNr);
      A12000DVEntUniAl = DecimalUtil.ZERO ;
      n12000DVEntUniAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrimstr( A12000DVEntUniAl, 11, 4));
      A12001DVEntObs = "" ;
      n12001DVEntObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12001DVEntObs", A12001DVEntObs);
      Z11973DVAlbaran = "" ;
      Z11974DVPedCod = 0 ;
      Z11975DVEntUniEn = DecimalUtil.ZERO ;
      Z11976DVEntPre = DecimalUtil.ZERO ;
      Z11977DVEntNumCo = (short)(0) ;
      Z11978DVEntUniRe = DecimalUtil.ZERO ;
      Z11979DVEntEti = (byte)(0) ;
      Z11980DVEntCon = (byte)(0) ;
      Z11981DVEntFecEn = GXutil.nullDate() ;
      Z11982DVEntConIn = 0 ;
      Z11983DVEntConFi = 0 ;
      Z11984DVEntPedCu = (byte)(0) ;
      Z11985DVEntNro = 0 ;
      Z11986DVEntFVal = GXutil.nullDate() ;
      Z11987DVEntLotN = "" ;
      Z11988DVEntFiCon = GXutil.nullDate() ;
      Z11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z11990DVEntFfCon = GXutil.nullDate() ;
      Z11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z11992DVEntBnc = "" ;
      Z11993DVEntPrvNu = 0 ;
      Z11994DVEntCC = "" ;
      Z11995DVEntCCoCo = (short)(0) ;
      Z11996DVEntRemTp = "" ;
      Z11997DVEntRemSu = "" ;
      Z11998DVEntRemFc = GXutil.nullDate() ;
      Z11999DVEntRemNr = "" ;
      Z12000DVEntUniAl = DecimalUtil.ZERO ;
      Z12001DVEntObs = "" ;
   }

   public void initAll1IS1676( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11935DVPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      A11972DVLinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11972DVLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11972DVLinEnt), 4, 0));
      initializeNonKey1IS1676( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101633319", true, true);
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
      httpContext.AddJavascriptSource("tdventalm.js", "?20266101633319", false, true);
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
      edtDVLinEnt_Internalname = "DVLINENT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDVAlbaran_Internalname = "DVALBARAN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDVPedCod_Internalname = "DVPEDCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDVEntUniEn_Internalname = "DVENTUNIEN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDVEntPre_Internalname = "DVENTPRE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDVEntNumCo_Internalname = "DVENTNUMCO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDVEntUniRe_Internalname = "DVENTUNIRE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDVEntEti_Internalname = "DVENTETI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDVEntCon_Internalname = "DVENTCON" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDVEntFecEn_Internalname = "DVENTFECEN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDVEntConIn_Internalname = "DVENTCONIN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDVEntConFi_Internalname = "DVENTCONFI" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDVEntPedCu_Internalname = "DVENTPEDCU" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDVEntNro_Internalname = "DVENTNRO" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDVEntFVal_Internalname = "DVENTFVAL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDVEntLotN_Internalname = "DVENTLOTN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDVEntFiCon_Internalname = "DVENTFICON" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDVEntHiCon_Internalname = "DVENTHICON" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDVEntFfCon_Internalname = "DVENTFFCON" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDVEntHfCon_Internalname = "DVENTHFCON" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDVEntBnc_Internalname = "DVENTBNC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDVEntPrvNu_Internalname = "DVENTPRVNU" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtDVEntCC_Internalname = "DVENTCC" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDVEntCCoCo_Internalname = "DVENTCCOCO" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtDVEntRemTp_Internalname = "DVENTREMTP" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtDVEntRemSu_Internalname = "DVENTREMSU" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtDVEntRemFc_Internalname = "DVENTREMFC" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtDVEntRemNr_Internalname = "DVENTREMNR" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtDVEntUniAl_Internalname = "DVENTUNIAL" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtDVEntObs_Internalname = "DVENTOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Entradas Productos Quimicos Data View", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDVEntObs_Jsonclick = "" ;
      edtDVEntObs_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntObs_Enabled = 1 ;
      edtDVEntUniAl_Jsonclick = "" ;
      edtDVEntUniAl_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntUniAl_Enabled = 1 ;
      edtDVEntRemNr_Jsonclick = "" ;
      edtDVEntRemNr_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntRemNr_Enabled = 1 ;
      edtDVEntRemFc_Jsonclick = "" ;
      edtDVEntRemFc_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntRemFc_Enabled = 1 ;
      edtDVEntRemSu_Jsonclick = "" ;
      edtDVEntRemSu_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntRemSu_Enabled = 1 ;
      edtDVEntRemTp_Jsonclick = "" ;
      edtDVEntRemTp_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntRemTp_Enabled = 1 ;
      edtDVEntCCoCo_Jsonclick = "" ;
      edtDVEntCCoCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntCCoCo_Enabled = 1 ;
      edtDVEntCC_Jsonclick = "" ;
      edtDVEntCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntCC_Enabled = 1 ;
      edtDVEntPrvNu_Jsonclick = "" ;
      edtDVEntPrvNu_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntPrvNu_Enabled = 1 ;
      edtDVEntBnc_Jsonclick = "" ;
      edtDVEntBnc_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntBnc_Enabled = 1 ;
      edtDVEntHfCon_Jsonclick = "" ;
      edtDVEntHfCon_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntHfCon_Enabled = 1 ;
      edtDVEntFfCon_Jsonclick = "" ;
      edtDVEntFfCon_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntFfCon_Enabled = 1 ;
      edtDVEntHiCon_Jsonclick = "" ;
      edtDVEntHiCon_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntHiCon_Enabled = 1 ;
      edtDVEntFiCon_Jsonclick = "" ;
      edtDVEntFiCon_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntFiCon_Enabled = 1 ;
      edtDVEntLotN_Jsonclick = "" ;
      edtDVEntLotN_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntLotN_Enabled = 1 ;
      edtDVEntFVal_Jsonclick = "" ;
      edtDVEntFVal_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntFVal_Enabled = 1 ;
      edtDVEntNro_Jsonclick = "" ;
      edtDVEntNro_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntNro_Enabled = 1 ;
      edtDVEntPedCu_Jsonclick = "" ;
      edtDVEntPedCu_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntPedCu_Enabled = 1 ;
      edtDVEntConFi_Jsonclick = "" ;
      edtDVEntConFi_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntConFi_Enabled = 1 ;
      edtDVEntConIn_Jsonclick = "" ;
      edtDVEntConIn_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntConIn_Enabled = 1 ;
      edtDVEntFecEn_Jsonclick = "" ;
      edtDVEntFecEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntFecEn_Enabled = 1 ;
      edtDVEntCon_Jsonclick = "" ;
      edtDVEntCon_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntCon_Enabled = 1 ;
      edtDVEntEti_Jsonclick = "" ;
      edtDVEntEti_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntEti_Enabled = 1 ;
      edtDVEntUniRe_Jsonclick = "" ;
      edtDVEntUniRe_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntUniRe_Enabled = 1 ;
      edtDVEntNumCo_Jsonclick = "" ;
      edtDVEntNumCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntNumCo_Enabled = 1 ;
      edtDVEntPre_Jsonclick = "" ;
      edtDVEntPre_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntPre_Enabled = 1 ;
      edtDVEntUniEn_Jsonclick = "" ;
      edtDVEntUniEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVEntUniEn_Enabled = 1 ;
      edtDVPedCod_Jsonclick = "" ;
      edtDVPedCod_Backcolor = (int)(0xFFFFFF) ;
      edtDVPedCod_Enabled = 1 ;
      edtDVAlbaran_Jsonclick = "" ;
      edtDVAlbaran_Backcolor = (int)(0xFFFFFF) ;
      edtDVAlbaran_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDVLinEnt_Jsonclick = "" ;
      edtDVLinEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDVLinEnt_Enabled = 1 ;
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
      /* Using cursor T01IS14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtDVAlbaran_Internalname ;
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
      /* Using cursor T01IS14 */
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

   public void valid_Dvlinent( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11973DVAlbaran", GXutil.rtrim( A11973DVAlbaran));
      httpContext.ajax_rsp_assign_attri("", false, "A11974DVPedCod", GXutil.ltrim( localUtil.ntoc( A11974DVPedCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11975DVEntUniEn", GXutil.ltrim( localUtil.ntoc( A11975DVEntUniEn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11976DVEntPre", GXutil.ltrim( localUtil.ntoc( A11976DVEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11977DVEntNumCo", GXutil.ltrim( localUtil.ntoc( A11977DVEntNumCo, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11978DVEntUniRe", GXutil.ltrim( localUtil.ntoc( A11978DVEntUniRe, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11979DVEntEti", GXutil.ltrim( localUtil.ntoc( A11979DVEntEti, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11980DVEntCon", GXutil.ltrim( localUtil.ntoc( A11980DVEntCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11981DVEntFecEn", localUtil.format(A11981DVEntFecEn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11982DVEntConIn", GXutil.ltrim( localUtil.ntoc( A11982DVEntConIn, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11983DVEntConFi", GXutil.ltrim( localUtil.ntoc( A11983DVEntConFi, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11984DVEntPedCu", GXutil.ltrim( localUtil.ntoc( A11984DVEntPedCu, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11985DVEntNro", GXutil.ltrim( localUtil.ntoc( A11985DVEntNro, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11986DVEntFVal", localUtil.format(A11986DVEntFVal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11987DVEntLotN", GXutil.rtrim( A11987DVEntLotN));
      httpContext.ajax_rsp_assign_attri("", false, "A11988DVEntFiCon", localUtil.format(A11988DVEntFiCon, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11989DVEntHiCon", localUtil.ttoc( A11989DVEntHiCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11990DVEntFfCon", localUtil.format(A11990DVEntFfCon, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11991DVEntHfCon", localUtil.ttoc( A11991DVEntHfCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11992DVEntBnc", GXutil.rtrim( A11992DVEntBnc));
      httpContext.ajax_rsp_assign_attri("", false, "A11993DVEntPrvNu", GXutil.ltrim( localUtil.ntoc( A11993DVEntPrvNu, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11994DVEntCC", GXutil.rtrim( A11994DVEntCC));
      httpContext.ajax_rsp_assign_attri("", false, "A11995DVEntCCoCo", GXutil.ltrim( localUtil.ntoc( A11995DVEntCCoCo, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11996DVEntRemTp", GXutil.rtrim( A11996DVEntRemTp));
      httpContext.ajax_rsp_assign_attri("", false, "A11997DVEntRemSu", GXutil.rtrim( A11997DVEntRemSu));
      httpContext.ajax_rsp_assign_attri("", false, "A11998DVEntRemFc", localUtil.format(A11998DVEntRemFc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11999DVEntRemNr", GXutil.rtrim( A11999DVEntRemNr));
      httpContext.ajax_rsp_assign_attri("", false, "A12000DVEntUniAl", GXutil.ltrim( localUtil.ntoc( A12000DVEntUniAl, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12001DVEntObs", GXutil.rtrim( A12001DVEntObs));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11972DVLinEnt", GXutil.ltrim( localUtil.ntoc( Z11972DVLinEnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11973DVAlbaran", GXutil.rtrim( Z11973DVAlbaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11974DVPedCod", GXutil.ltrim( localUtil.ntoc( Z11974DVPedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11975DVEntUniEn", GXutil.ltrim( localUtil.ntoc( Z11975DVEntUniEn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11976DVEntPre", GXutil.ltrim( localUtil.ntoc( Z11976DVEntPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11977DVEntNumCo", GXutil.ltrim( localUtil.ntoc( Z11977DVEntNumCo, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11978DVEntUniRe", GXutil.ltrim( localUtil.ntoc( Z11978DVEntUniRe, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11979DVEntEti", GXutil.ltrim( localUtil.ntoc( Z11979DVEntEti, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11980DVEntCon", GXutil.ltrim( localUtil.ntoc( Z11980DVEntCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11981DVEntFecEn", localUtil.format(Z11981DVEntFecEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11982DVEntConIn", GXutil.ltrim( localUtil.ntoc( Z11982DVEntConIn, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11983DVEntConFi", GXutil.ltrim( localUtil.ntoc( Z11983DVEntConFi, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11984DVEntPedCu", GXutil.ltrim( localUtil.ntoc( Z11984DVEntPedCu, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11985DVEntNro", GXutil.ltrim( localUtil.ntoc( Z11985DVEntNro, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11986DVEntFVal", localUtil.format(Z11986DVEntFVal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11987DVEntLotN", GXutil.rtrim( Z11987DVEntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11988DVEntFiCon", localUtil.format(Z11988DVEntFiCon, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11989DVEntHiCon", localUtil.ttoc( Z11989DVEntHiCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11990DVEntFfCon", localUtil.format(Z11990DVEntFfCon, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11991DVEntHfCon", localUtil.ttoc( Z11991DVEntHfCon, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11992DVEntBnc", GXutil.rtrim( Z11992DVEntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11993DVEntPrvNu", GXutil.ltrim( localUtil.ntoc( Z11993DVEntPrvNu, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11994DVEntCC", GXutil.rtrim( Z11994DVEntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11995DVEntCCoCo", GXutil.ltrim( localUtil.ntoc( Z11995DVEntCCoCo, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11996DVEntRemTp", GXutil.rtrim( Z11996DVEntRemTp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11997DVEntRemSu", GXutil.rtrim( Z11997DVEntRemSu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11998DVEntRemFc", localUtil.format(Z11998DVEntRemFc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11999DVEntRemNr", GXutil.rtrim( Z11999DVEntRemNr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12000DVEntUniAl", GXutil.ltrim( localUtil.ntoc( Z12000DVEntUniAl, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12001DVEntObs", GXutil.rtrim( Z12001DVEntObs));
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
      setEventMetadata("VALID_DVLINENT","{handler:'valid_Dvlinent',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'A11972DVLinEnt',fld:'DVLINENT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DVLINENT",",oparms:[{av:'A11973DVAlbaran',fld:'DVALBARAN',pic:''},{av:'A11974DVPedCod',fld:'DVPEDCOD',pic:'ZZZZZZZ9'},{av:'A11975DVEntUniEn',fld:'DVENTUNIEN',pic:'ZZZZZ9.99'},{av:'A11976DVEntPre',fld:'DVENTPRE',pic:'ZZZZZZZ9.99999'},{av:'A11977DVEntNumCo',fld:'DVENTNUMCO',pic:'ZZ9'},{av:'A11978DVEntUniRe',fld:'DVENTUNIRE',pic:'ZZZZZ9.9999'},{av:'A11979DVEntEti',fld:'DVENTETI',pic:'9'},{av:'A11980DVEntCon',fld:'DVENTCON',pic:'9'},{av:'A11981DVEntFecEn',fld:'DVENTFECEN',pic:''},{av:'A11982DVEntConIn',fld:'DVENTCONIN',pic:'ZZZZZZZ9'},{av:'A11983DVEntConFi',fld:'DVENTCONFI',pic:'ZZZZZZZ9'},{av:'A11984DVEntPedCu',fld:'DVENTPEDCU',pic:'9'},{av:'A11985DVEntNro',fld:'DVENTNRO',pic:'ZZZZZ9'},{av:'A11986DVEntFVal',fld:'DVENTFVAL',pic:''},{av:'A11987DVEntLotN',fld:'DVENTLOTN',pic:''},{av:'A11988DVEntFiCon',fld:'DVENTFICON',pic:''},{av:'A11989DVEntHiCon',fld:'DVENTHICON',pic:'99/99/99 99:99'},{av:'A11990DVEntFfCon',fld:'DVENTFFCON',pic:''},{av:'A11991DVEntHfCon',fld:'DVENTHFCON',pic:'99/99/99 99:99'},{av:'A11992DVEntBnc',fld:'DVENTBNC',pic:''},{av:'A11993DVEntPrvNu',fld:'DVENTPRVNU',pic:'ZZZZZ9'},{av:'A11994DVEntCC',fld:'DVENTCC',pic:''},{av:'A11995DVEntCCoCo',fld:'DVENTCCOCO',pic:'ZZ9'},{av:'A11996DVEntRemTp',fld:'DVENTREMTP',pic:''},{av:'A11997DVEntRemSu',fld:'DVENTREMSU',pic:''},{av:'A11998DVEntRemFc',fld:'DVENTREMFC',pic:''},{av:'A11999DVEntRemNr',fld:'DVENTREMNR',pic:''},{av:'A12000DVEntUniAl',fld:'DVENTUNIAL',pic:'ZZZZZ9.9999'},{av:'A12001DVEntObs',fld:'DVENTOBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11935DVPrdNum'},{av:'Z11972DVLinEnt'},{av:'Z11973DVAlbaran'},{av:'Z11974DVPedCod'},{av:'Z11975DVEntUniEn'},{av:'Z11976DVEntPre'},{av:'Z11977DVEntNumCo'},{av:'Z11978DVEntUniRe'},{av:'Z11979DVEntEti'},{av:'Z11980DVEntCon'},{av:'Z11981DVEntFecEn'},{av:'Z11982DVEntConIn'},{av:'Z11983DVEntConFi'},{av:'Z11984DVEntPedCu'},{av:'Z11985DVEntNro'},{av:'Z11986DVEntFVal'},{av:'Z11987DVEntLotN'},{av:'Z11988DVEntFiCon'},{av:'Z11989DVEntHiCon'},{av:'Z11990DVEntFfCon'},{av:'Z11991DVEntHfCon'},{av:'Z11992DVEntBnc'},{av:'Z11993DVEntPrvNu'},{av:'Z11994DVEntCC'},{av:'Z11995DVEntCCoCo'},{av:'Z11996DVEntRemTp'},{av:'Z11997DVEntRemSu'},{av:'Z11998DVEntRemFc'},{av:'Z11999DVEntRemNr'},{av:'Z12000DVEntUniAl'},{av:'Z12001DVEntObs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z11973DVAlbaran = "" ;
      Z11975DVEntUniEn = DecimalUtil.ZERO ;
      Z11976DVEntPre = DecimalUtil.ZERO ;
      Z11978DVEntUniRe = DecimalUtil.ZERO ;
      Z11981DVEntFecEn = GXutil.nullDate() ;
      Z11986DVEntFVal = GXutil.nullDate() ;
      Z11987DVEntLotN = "" ;
      Z11988DVEntFiCon = GXutil.nullDate() ;
      Z11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z11990DVEntFfCon = GXutil.nullDate() ;
      Z11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z11992DVEntBnc = "" ;
      Z11994DVEntCC = "" ;
      Z11996DVEntRemTp = "" ;
      Z11997DVEntRemSu = "" ;
      Z11998DVEntRemFc = GXutil.nullDate() ;
      Z11999DVEntRemNr = "" ;
      Z12000DVEntUniAl = DecimalUtil.ZERO ;
      Z12001DVEntObs = "" ;
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
      A11973DVAlbaran = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11975DVEntUniEn = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A11976DVEntPre = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A11978DVEntUniRe = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11981DVEntFecEn = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A11986DVEntFVal = GXutil.nullDate() ;
      lblTextblock18_Jsonclick = "" ;
      A11987DVEntLotN = "" ;
      lblTextblock19_Jsonclick = "" ;
      A11988DVEntFiCon = GXutil.nullDate() ;
      lblTextblock20_Jsonclick = "" ;
      A11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock21_Jsonclick = "" ;
      A11990DVEntFfCon = GXutil.nullDate() ;
      lblTextblock22_Jsonclick = "" ;
      A11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock23_Jsonclick = "" ;
      A11992DVEntBnc = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A11994DVEntCC = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A11996DVEntRemTp = "" ;
      lblTextblock28_Jsonclick = "" ;
      A11997DVEntRemSu = "" ;
      lblTextblock29_Jsonclick = "" ;
      A11998DVEntRemFc = GXutil.nullDate() ;
      lblTextblock30_Jsonclick = "" ;
      A11999DVEntRemNr = "" ;
      lblTextblock31_Jsonclick = "" ;
      A12000DVEntUniAl = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A12001DVEntObs = "" ;
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
      T01IS5_A11972DVLinEnt = new short[1] ;
      T01IS5_A11973DVAlbaran = new String[] {""} ;
      T01IS5_n11973DVAlbaran = new boolean[] {false} ;
      T01IS5_A11974DVPedCod = new int[1] ;
      T01IS5_n11974DVPedCod = new boolean[] {false} ;
      T01IS5_A11975DVEntUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS5_n11975DVEntUniEn = new boolean[] {false} ;
      T01IS5_A11976DVEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS5_n11976DVEntPre = new boolean[] {false} ;
      T01IS5_A11977DVEntNumCo = new short[1] ;
      T01IS5_n11977DVEntNumCo = new boolean[] {false} ;
      T01IS5_A11978DVEntUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS5_n11978DVEntUniRe = new boolean[] {false} ;
      T01IS5_A11979DVEntEti = new byte[1] ;
      T01IS5_n11979DVEntEti = new boolean[] {false} ;
      T01IS5_A11980DVEntCon = new byte[1] ;
      T01IS5_n11980DVEntCon = new boolean[] {false} ;
      T01IS5_A11981DVEntFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11981DVEntFecEn = new boolean[] {false} ;
      T01IS5_A11982DVEntConIn = new int[1] ;
      T01IS5_n11982DVEntConIn = new boolean[] {false} ;
      T01IS5_A11983DVEntConFi = new int[1] ;
      T01IS5_n11983DVEntConFi = new boolean[] {false} ;
      T01IS5_A11984DVEntPedCu = new byte[1] ;
      T01IS5_n11984DVEntPedCu = new boolean[] {false} ;
      T01IS5_A11985DVEntNro = new int[1] ;
      T01IS5_n11985DVEntNro = new boolean[] {false} ;
      T01IS5_A11986DVEntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11986DVEntFVal = new boolean[] {false} ;
      T01IS5_A11987DVEntLotN = new String[] {""} ;
      T01IS5_n11987DVEntLotN = new boolean[] {false} ;
      T01IS5_A11988DVEntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11988DVEntFiCon = new boolean[] {false} ;
      T01IS5_A11989DVEntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11989DVEntHiCon = new boolean[] {false} ;
      T01IS5_A11990DVEntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11990DVEntFfCon = new boolean[] {false} ;
      T01IS5_A11991DVEntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11991DVEntHfCon = new boolean[] {false} ;
      T01IS5_A11992DVEntBnc = new String[] {""} ;
      T01IS5_n11992DVEntBnc = new boolean[] {false} ;
      T01IS5_A11993DVEntPrvNu = new int[1] ;
      T01IS5_n11993DVEntPrvNu = new boolean[] {false} ;
      T01IS5_A11994DVEntCC = new String[] {""} ;
      T01IS5_n11994DVEntCC = new boolean[] {false} ;
      T01IS5_A11995DVEntCCoCo = new short[1] ;
      T01IS5_n11995DVEntCCoCo = new boolean[] {false} ;
      T01IS5_A11996DVEntRemTp = new String[] {""} ;
      T01IS5_n11996DVEntRemTp = new boolean[] {false} ;
      T01IS5_A11997DVEntRemSu = new String[] {""} ;
      T01IS5_n11997DVEntRemSu = new boolean[] {false} ;
      T01IS5_A11998DVEntRemFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS5_n11998DVEntRemFc = new boolean[] {false} ;
      T01IS5_A11999DVEntRemNr = new String[] {""} ;
      T01IS5_n11999DVEntRemNr = new boolean[] {false} ;
      T01IS5_A12000DVEntUniAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS5_n12000DVEntUniAl = new boolean[] {false} ;
      T01IS5_A12001DVEntObs = new String[] {""} ;
      T01IS5_n12001DVEntObs = new boolean[] {false} ;
      T01IS5_A396EmprCod = new String[] {""} ;
      T01IS5_A11935DVPrdNum = new String[] {""} ;
      T01IS4_A396EmprCod = new String[] {""} ;
      T01IS6_A396EmprCod = new String[] {""} ;
      T01IS7_A396EmprCod = new String[] {""} ;
      T01IS7_A11935DVPrdNum = new String[] {""} ;
      T01IS7_A11972DVLinEnt = new short[1] ;
      T01IS3_A11972DVLinEnt = new short[1] ;
      T01IS3_A11973DVAlbaran = new String[] {""} ;
      T01IS3_n11973DVAlbaran = new boolean[] {false} ;
      T01IS3_A11974DVPedCod = new int[1] ;
      T01IS3_n11974DVPedCod = new boolean[] {false} ;
      T01IS3_A11975DVEntUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS3_n11975DVEntUniEn = new boolean[] {false} ;
      T01IS3_A11976DVEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS3_n11976DVEntPre = new boolean[] {false} ;
      T01IS3_A11977DVEntNumCo = new short[1] ;
      T01IS3_n11977DVEntNumCo = new boolean[] {false} ;
      T01IS3_A11978DVEntUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS3_n11978DVEntUniRe = new boolean[] {false} ;
      T01IS3_A11979DVEntEti = new byte[1] ;
      T01IS3_n11979DVEntEti = new boolean[] {false} ;
      T01IS3_A11980DVEntCon = new byte[1] ;
      T01IS3_n11980DVEntCon = new boolean[] {false} ;
      T01IS3_A11981DVEntFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11981DVEntFecEn = new boolean[] {false} ;
      T01IS3_A11982DVEntConIn = new int[1] ;
      T01IS3_n11982DVEntConIn = new boolean[] {false} ;
      T01IS3_A11983DVEntConFi = new int[1] ;
      T01IS3_n11983DVEntConFi = new boolean[] {false} ;
      T01IS3_A11984DVEntPedCu = new byte[1] ;
      T01IS3_n11984DVEntPedCu = new boolean[] {false} ;
      T01IS3_A11985DVEntNro = new int[1] ;
      T01IS3_n11985DVEntNro = new boolean[] {false} ;
      T01IS3_A11986DVEntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11986DVEntFVal = new boolean[] {false} ;
      T01IS3_A11987DVEntLotN = new String[] {""} ;
      T01IS3_n11987DVEntLotN = new boolean[] {false} ;
      T01IS3_A11988DVEntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11988DVEntFiCon = new boolean[] {false} ;
      T01IS3_A11989DVEntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11989DVEntHiCon = new boolean[] {false} ;
      T01IS3_A11990DVEntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11990DVEntFfCon = new boolean[] {false} ;
      T01IS3_A11991DVEntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11991DVEntHfCon = new boolean[] {false} ;
      T01IS3_A11992DVEntBnc = new String[] {""} ;
      T01IS3_n11992DVEntBnc = new boolean[] {false} ;
      T01IS3_A11993DVEntPrvNu = new int[1] ;
      T01IS3_n11993DVEntPrvNu = new boolean[] {false} ;
      T01IS3_A11994DVEntCC = new String[] {""} ;
      T01IS3_n11994DVEntCC = new boolean[] {false} ;
      T01IS3_A11995DVEntCCoCo = new short[1] ;
      T01IS3_n11995DVEntCCoCo = new boolean[] {false} ;
      T01IS3_A11996DVEntRemTp = new String[] {""} ;
      T01IS3_n11996DVEntRemTp = new boolean[] {false} ;
      T01IS3_A11997DVEntRemSu = new String[] {""} ;
      T01IS3_n11997DVEntRemSu = new boolean[] {false} ;
      T01IS3_A11998DVEntRemFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS3_n11998DVEntRemFc = new boolean[] {false} ;
      T01IS3_A11999DVEntRemNr = new String[] {""} ;
      T01IS3_n11999DVEntRemNr = new boolean[] {false} ;
      T01IS3_A12000DVEntUniAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS3_n12000DVEntUniAl = new boolean[] {false} ;
      T01IS3_A12001DVEntObs = new String[] {""} ;
      T01IS3_n12001DVEntObs = new boolean[] {false} ;
      T01IS3_A396EmprCod = new String[] {""} ;
      T01IS3_A11935DVPrdNum = new String[] {""} ;
      sMode1676 = "" ;
      T01IS8_A396EmprCod = new String[] {""} ;
      T01IS8_A11935DVPrdNum = new String[] {""} ;
      T01IS8_A11972DVLinEnt = new short[1] ;
      T01IS9_A396EmprCod = new String[] {""} ;
      T01IS9_A11935DVPrdNum = new String[] {""} ;
      T01IS9_A11972DVLinEnt = new short[1] ;
      T01IS2_A11972DVLinEnt = new short[1] ;
      T01IS2_A11973DVAlbaran = new String[] {""} ;
      T01IS2_n11973DVAlbaran = new boolean[] {false} ;
      T01IS2_A11974DVPedCod = new int[1] ;
      T01IS2_n11974DVPedCod = new boolean[] {false} ;
      T01IS2_A11975DVEntUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS2_n11975DVEntUniEn = new boolean[] {false} ;
      T01IS2_A11976DVEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS2_n11976DVEntPre = new boolean[] {false} ;
      T01IS2_A11977DVEntNumCo = new short[1] ;
      T01IS2_n11977DVEntNumCo = new boolean[] {false} ;
      T01IS2_A11978DVEntUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS2_n11978DVEntUniRe = new boolean[] {false} ;
      T01IS2_A11979DVEntEti = new byte[1] ;
      T01IS2_n11979DVEntEti = new boolean[] {false} ;
      T01IS2_A11980DVEntCon = new byte[1] ;
      T01IS2_n11980DVEntCon = new boolean[] {false} ;
      T01IS2_A11981DVEntFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11981DVEntFecEn = new boolean[] {false} ;
      T01IS2_A11982DVEntConIn = new int[1] ;
      T01IS2_n11982DVEntConIn = new boolean[] {false} ;
      T01IS2_A11983DVEntConFi = new int[1] ;
      T01IS2_n11983DVEntConFi = new boolean[] {false} ;
      T01IS2_A11984DVEntPedCu = new byte[1] ;
      T01IS2_n11984DVEntPedCu = new boolean[] {false} ;
      T01IS2_A11985DVEntNro = new int[1] ;
      T01IS2_n11985DVEntNro = new boolean[] {false} ;
      T01IS2_A11986DVEntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11986DVEntFVal = new boolean[] {false} ;
      T01IS2_A11987DVEntLotN = new String[] {""} ;
      T01IS2_n11987DVEntLotN = new boolean[] {false} ;
      T01IS2_A11988DVEntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11988DVEntFiCon = new boolean[] {false} ;
      T01IS2_A11989DVEntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11989DVEntHiCon = new boolean[] {false} ;
      T01IS2_A11990DVEntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11990DVEntFfCon = new boolean[] {false} ;
      T01IS2_A11991DVEntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11991DVEntHfCon = new boolean[] {false} ;
      T01IS2_A11992DVEntBnc = new String[] {""} ;
      T01IS2_n11992DVEntBnc = new boolean[] {false} ;
      T01IS2_A11993DVEntPrvNu = new int[1] ;
      T01IS2_n11993DVEntPrvNu = new boolean[] {false} ;
      T01IS2_A11994DVEntCC = new String[] {""} ;
      T01IS2_n11994DVEntCC = new boolean[] {false} ;
      T01IS2_A11995DVEntCCoCo = new short[1] ;
      T01IS2_n11995DVEntCCoCo = new boolean[] {false} ;
      T01IS2_A11996DVEntRemTp = new String[] {""} ;
      T01IS2_n11996DVEntRemTp = new boolean[] {false} ;
      T01IS2_A11997DVEntRemSu = new String[] {""} ;
      T01IS2_n11997DVEntRemSu = new boolean[] {false} ;
      T01IS2_A11998DVEntRemFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01IS2_n11998DVEntRemFc = new boolean[] {false} ;
      T01IS2_A11999DVEntRemNr = new String[] {""} ;
      T01IS2_n11999DVEntRemNr = new boolean[] {false} ;
      T01IS2_A12000DVEntUniAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IS2_n12000DVEntUniAl = new boolean[] {false} ;
      T01IS2_A12001DVEntObs = new String[] {""} ;
      T01IS2_n12001DVEntObs = new boolean[] {false} ;
      T01IS2_A396EmprCod = new String[] {""} ;
      T01IS2_A11935DVPrdNum = new String[] {""} ;
      T01IS13_A396EmprCod = new String[] {""} ;
      T01IS13_A11935DVPrdNum = new String[] {""} ;
      T01IS13_A11972DVLinEnt = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01IS14_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ11935DVPrdNum = "" ;
      ZZ11973DVAlbaran = "" ;
      ZZ11975DVEntUniEn = DecimalUtil.ZERO ;
      ZZ11976DVEntPre = DecimalUtil.ZERO ;
      ZZ11978DVEntUniRe = DecimalUtil.ZERO ;
      ZZ11981DVEntFecEn = GXutil.nullDate() ;
      ZZ11986DVEntFVal = GXutil.nullDate() ;
      ZZ11987DVEntLotN = "" ;
      ZZ11988DVEntFiCon = GXutil.nullDate() ;
      ZZ11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      ZZ11990DVEntFfCon = GXutil.nullDate() ;
      ZZ11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      ZZ11992DVEntBnc = "" ;
      ZZ11994DVEntCC = "" ;
      ZZ11996DVEntRemTp = "" ;
      ZZ11997DVEntRemSu = "" ;
      ZZ11998DVEntRemFc = GXutil.nullDate() ;
      ZZ11999DVEntRemNr = "" ;
      ZZ12000DVEntUniAl = DecimalUtil.ZERO ;
      ZZ12001DVEntObs = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdventalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdventalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdventalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdventalm__default(),
         new Object[] {
             new Object[] {
            T01IS2_A11972DVLinEnt, T01IS2_A11973DVAlbaran, T01IS2_n11973DVAlbaran, T01IS2_A11974DVPedCod, T01IS2_n11974DVPedCod, T01IS2_A11975DVEntUniEn, T01IS2_n11975DVEntUniEn, T01IS2_A11976DVEntPre, T01IS2_n11976DVEntPre, T01IS2_A11977DVEntNumCo,
            T01IS2_n11977DVEntNumCo, T01IS2_A11978DVEntUniRe, T01IS2_n11978DVEntUniRe, T01IS2_A11979DVEntEti, T01IS2_n11979DVEntEti, T01IS2_A11980DVEntCon, T01IS2_n11980DVEntCon, T01IS2_A11981DVEntFecEn, T01IS2_n11981DVEntFecEn, T01IS2_A11982DVEntConIn,
            T01IS2_n11982DVEntConIn, T01IS2_A11983DVEntConFi, T01IS2_n11983DVEntConFi, T01IS2_A11984DVEntPedCu, T01IS2_n11984DVEntPedCu, T01IS2_A11985DVEntNro, T01IS2_n11985DVEntNro, T01IS2_A11986DVEntFVal, T01IS2_n11986DVEntFVal, T01IS2_A11987DVEntLotN,
            T01IS2_n11987DVEntLotN, T01IS2_A11988DVEntFiCon, T01IS2_n11988DVEntFiCon, T01IS2_A11989DVEntHiCon, T01IS2_n11989DVEntHiCon, T01IS2_A11990DVEntFfCon, T01IS2_n11990DVEntFfCon, T01IS2_A11991DVEntHfCon, T01IS2_n11991DVEntHfCon, T01IS2_A11992DVEntBnc,
            T01IS2_n11992DVEntBnc, T01IS2_A11993DVEntPrvNu, T01IS2_n11993DVEntPrvNu, T01IS2_A11994DVEntCC, T01IS2_n11994DVEntCC, T01IS2_A11995DVEntCCoCo, T01IS2_n11995DVEntCCoCo, T01IS2_A11996DVEntRemTp, T01IS2_n11996DVEntRemTp, T01IS2_A11997DVEntRemSu,
            T01IS2_n11997DVEntRemSu, T01IS2_A11998DVEntRemFc, T01IS2_n11998DVEntRemFc, T01IS2_A11999DVEntRemNr, T01IS2_n11999DVEntRemNr, T01IS2_A12000DVEntUniAl, T01IS2_n12000DVEntUniAl, T01IS2_A12001DVEntObs, T01IS2_n12001DVEntObs, T01IS2_A396EmprCod,
            T01IS2_A11935DVPrdNum
            }
            , new Object[] {
            T01IS3_A11972DVLinEnt, T01IS3_A11973DVAlbaran, T01IS3_n11973DVAlbaran, T01IS3_A11974DVPedCod, T01IS3_n11974DVPedCod, T01IS3_A11975DVEntUniEn, T01IS3_n11975DVEntUniEn, T01IS3_A11976DVEntPre, T01IS3_n11976DVEntPre, T01IS3_A11977DVEntNumCo,
            T01IS3_n11977DVEntNumCo, T01IS3_A11978DVEntUniRe, T01IS3_n11978DVEntUniRe, T01IS3_A11979DVEntEti, T01IS3_n11979DVEntEti, T01IS3_A11980DVEntCon, T01IS3_n11980DVEntCon, T01IS3_A11981DVEntFecEn, T01IS3_n11981DVEntFecEn, T01IS3_A11982DVEntConIn,
            T01IS3_n11982DVEntConIn, T01IS3_A11983DVEntConFi, T01IS3_n11983DVEntConFi, T01IS3_A11984DVEntPedCu, T01IS3_n11984DVEntPedCu, T01IS3_A11985DVEntNro, T01IS3_n11985DVEntNro, T01IS3_A11986DVEntFVal, T01IS3_n11986DVEntFVal, T01IS3_A11987DVEntLotN,
            T01IS3_n11987DVEntLotN, T01IS3_A11988DVEntFiCon, T01IS3_n11988DVEntFiCon, T01IS3_A11989DVEntHiCon, T01IS3_n11989DVEntHiCon, T01IS3_A11990DVEntFfCon, T01IS3_n11990DVEntFfCon, T01IS3_A11991DVEntHfCon, T01IS3_n11991DVEntHfCon, T01IS3_A11992DVEntBnc,
            T01IS3_n11992DVEntBnc, T01IS3_A11993DVEntPrvNu, T01IS3_n11993DVEntPrvNu, T01IS3_A11994DVEntCC, T01IS3_n11994DVEntCC, T01IS3_A11995DVEntCCoCo, T01IS3_n11995DVEntCCoCo, T01IS3_A11996DVEntRemTp, T01IS3_n11996DVEntRemTp, T01IS3_A11997DVEntRemSu,
            T01IS3_n11997DVEntRemSu, T01IS3_A11998DVEntRemFc, T01IS3_n11998DVEntRemFc, T01IS3_A11999DVEntRemNr, T01IS3_n11999DVEntRemNr, T01IS3_A12000DVEntUniAl, T01IS3_n12000DVEntUniAl, T01IS3_A12001DVEntObs, T01IS3_n12001DVEntObs, T01IS3_A396EmprCod,
            T01IS3_A11935DVPrdNum
            }
            , new Object[] {
            T01IS4_A396EmprCod
            }
            , new Object[] {
            T01IS5_A11972DVLinEnt, T01IS5_A11973DVAlbaran, T01IS5_n11973DVAlbaran, T01IS5_A11974DVPedCod, T01IS5_n11974DVPedCod, T01IS5_A11975DVEntUniEn, T01IS5_n11975DVEntUniEn, T01IS5_A11976DVEntPre, T01IS5_n11976DVEntPre, T01IS5_A11977DVEntNumCo,
            T01IS5_n11977DVEntNumCo, T01IS5_A11978DVEntUniRe, T01IS5_n11978DVEntUniRe, T01IS5_A11979DVEntEti, T01IS5_n11979DVEntEti, T01IS5_A11980DVEntCon, T01IS5_n11980DVEntCon, T01IS5_A11981DVEntFecEn, T01IS5_n11981DVEntFecEn, T01IS5_A11982DVEntConIn,
            T01IS5_n11982DVEntConIn, T01IS5_A11983DVEntConFi, T01IS5_n11983DVEntConFi, T01IS5_A11984DVEntPedCu, T01IS5_n11984DVEntPedCu, T01IS5_A11985DVEntNro, T01IS5_n11985DVEntNro, T01IS5_A11986DVEntFVal, T01IS5_n11986DVEntFVal, T01IS5_A11987DVEntLotN,
            T01IS5_n11987DVEntLotN, T01IS5_A11988DVEntFiCon, T01IS5_n11988DVEntFiCon, T01IS5_A11989DVEntHiCon, T01IS5_n11989DVEntHiCon, T01IS5_A11990DVEntFfCon, T01IS5_n11990DVEntFfCon, T01IS5_A11991DVEntHfCon, T01IS5_n11991DVEntHfCon, T01IS5_A11992DVEntBnc,
            T01IS5_n11992DVEntBnc, T01IS5_A11993DVEntPrvNu, T01IS5_n11993DVEntPrvNu, T01IS5_A11994DVEntCC, T01IS5_n11994DVEntCC, T01IS5_A11995DVEntCCoCo, T01IS5_n11995DVEntCCoCo, T01IS5_A11996DVEntRemTp, T01IS5_n11996DVEntRemTp, T01IS5_A11997DVEntRemSu,
            T01IS5_n11997DVEntRemSu, T01IS5_A11998DVEntRemFc, T01IS5_n11998DVEntRemFc, T01IS5_A11999DVEntRemNr, T01IS5_n11999DVEntRemNr, T01IS5_A12000DVEntUniAl, T01IS5_n12000DVEntUniAl, T01IS5_A12001DVEntObs, T01IS5_n12001DVEntObs, T01IS5_A396EmprCod,
            T01IS5_A11935DVPrdNum
            }
            , new Object[] {
            T01IS6_A396EmprCod
            }
            , new Object[] {
            T01IS7_A396EmprCod, T01IS7_A11935DVPrdNum, T01IS7_A11972DVLinEnt
            }
            , new Object[] {
            T01IS8_A396EmprCod, T01IS8_A11935DVPrdNum, T01IS8_A11972DVLinEnt
            }
            , new Object[] {
            T01IS9_A396EmprCod, T01IS9_A11935DVPrdNum, T01IS9_A11972DVLinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IS13_A396EmprCod, T01IS13_A11935DVPrdNum, T01IS13_A11972DVLinEnt
            }
            , new Object[] {
            T01IS14_A396EmprCod
            }
         }
      );
   }

   private byte Z11979DVEntEti ;
   private byte Z11980DVEntCon ;
   private byte Z11984DVEntPedCu ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11979DVEntEti ;
   private byte A11980DVEntCon ;
   private byte A11984DVEntPedCu ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11979DVEntEti ;
   private byte ZZ11980DVEntCon ;
   private byte ZZ11984DVEntPedCu ;
   private short Z11972DVLinEnt ;
   private short Z11977DVEntNumCo ;
   private short Z11995DVEntCCoCo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11972DVLinEnt ;
   private short A11977DVEntNumCo ;
   private short A11995DVEntCCoCo ;
   private short RcdFound1676 ;
   private short nIsDirty_1676 ;
   private short ZZ11972DVLinEnt ;
   private short ZZ11977DVEntNumCo ;
   private short ZZ11995DVEntCCoCo ;
   private int Z11974DVPedCod ;
   private int Z11982DVEntConIn ;
   private int Z11983DVEntConFi ;
   private int Z11985DVEntNro ;
   private int Z11993DVEntPrvNu ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDVPrdNum_Enabled ;
   private int edtDVLinEnt_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDVAlbaran_Enabled ;
   private int A11974DVPedCod ;
   private int edtDVPedCod_Enabled ;
   private int edtDVEntUniEn_Enabled ;
   private int edtDVEntPre_Enabled ;
   private int edtDVEntNumCo_Enabled ;
   private int edtDVEntUniRe_Enabled ;
   private int edtDVEntEti_Enabled ;
   private int edtDVEntCon_Enabled ;
   private int edtDVEntFecEn_Enabled ;
   private int A11982DVEntConIn ;
   private int edtDVEntConIn_Enabled ;
   private int A11983DVEntConFi ;
   private int edtDVEntConFi_Enabled ;
   private int edtDVEntPedCu_Enabled ;
   private int A11985DVEntNro ;
   private int edtDVEntNro_Enabled ;
   private int edtDVEntFVal_Enabled ;
   private int edtDVEntLotN_Enabled ;
   private int edtDVEntFiCon_Enabled ;
   private int edtDVEntHiCon_Enabled ;
   private int edtDVEntFfCon_Enabled ;
   private int edtDVEntHfCon_Enabled ;
   private int edtDVEntBnc_Enabled ;
   private int A11993DVEntPrvNu ;
   private int edtDVEntPrvNu_Enabled ;
   private int edtDVEntCC_Enabled ;
   private int edtDVEntCCoCo_Enabled ;
   private int edtDVEntRemTp_Enabled ;
   private int edtDVEntRemSu_Enabled ;
   private int edtDVEntRemFc_Enabled ;
   private int edtDVEntRemNr_Enabled ;
   private int edtDVEntUniAl_Enabled ;
   private int edtDVEntObs_Enabled ;
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
   private int edtDVEntObs_Backcolor ;
   private int edtDVEntUniAl_Backcolor ;
   private int edtDVEntRemNr_Backcolor ;
   private int edtDVEntRemFc_Backcolor ;
   private int edtDVEntRemSu_Backcolor ;
   private int edtDVEntRemTp_Backcolor ;
   private int edtDVEntCCoCo_Backcolor ;
   private int edtDVEntCC_Backcolor ;
   private int edtDVEntPrvNu_Backcolor ;
   private int edtDVEntBnc_Backcolor ;
   private int edtDVEntHfCon_Backcolor ;
   private int edtDVEntFfCon_Backcolor ;
   private int edtDVEntHiCon_Backcolor ;
   private int edtDVEntFiCon_Backcolor ;
   private int edtDVEntLotN_Backcolor ;
   private int edtDVEntFVal_Backcolor ;
   private int edtDVEntNro_Backcolor ;
   private int edtDVEntPedCu_Backcolor ;
   private int edtDVEntConFi_Backcolor ;
   private int edtDVEntConIn_Backcolor ;
   private int edtDVEntFecEn_Backcolor ;
   private int edtDVEntCon_Backcolor ;
   private int edtDVEntEti_Backcolor ;
   private int edtDVEntUniRe_Backcolor ;
   private int edtDVEntNumCo_Backcolor ;
   private int edtDVEntPre_Backcolor ;
   private int edtDVEntUniEn_Backcolor ;
   private int edtDVPedCod_Backcolor ;
   private int edtDVAlbaran_Backcolor ;
   private int edtDVLinEnt_Backcolor ;
   private int edtDVPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11974DVPedCod ;
   private int ZZ11982DVEntConIn ;
   private int ZZ11983DVEntConFi ;
   private int ZZ11985DVEntNro ;
   private int ZZ11993DVEntPrvNu ;
   private java.math.BigDecimal Z11975DVEntUniEn ;
   private java.math.BigDecimal Z11976DVEntPre ;
   private java.math.BigDecimal Z11978DVEntUniRe ;
   private java.math.BigDecimal Z12000DVEntUniAl ;
   private java.math.BigDecimal A11975DVEntUniEn ;
   private java.math.BigDecimal A11976DVEntPre ;
   private java.math.BigDecimal A11978DVEntUniRe ;
   private java.math.BigDecimal A12000DVEntUniAl ;
   private java.math.BigDecimal ZZ11975DVEntUniEn ;
   private java.math.BigDecimal ZZ11976DVEntPre ;
   private java.math.BigDecimal ZZ11978DVEntUniRe ;
   private java.math.BigDecimal ZZ12000DVEntUniAl ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11935DVPrdNum ;
   private String Z11973DVAlbaran ;
   private String Z11987DVEntLotN ;
   private String Z11992DVEntBnc ;
   private String Z11994DVEntCC ;
   private String Z11996DVEntRemTp ;
   private String Z11997DVEntRemSu ;
   private String Z11999DVEntRemNr ;
   private String Z12001DVEntObs ;
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
   private String edtDVLinEnt_Internalname ;
   private String edtDVLinEnt_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDVAlbaran_Internalname ;
   private String A11973DVAlbaran ;
   private String edtDVAlbaran_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDVPedCod_Internalname ;
   private String edtDVPedCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDVEntUniEn_Internalname ;
   private String edtDVEntUniEn_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDVEntPre_Internalname ;
   private String edtDVEntPre_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDVEntNumCo_Internalname ;
   private String edtDVEntNumCo_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDVEntUniRe_Internalname ;
   private String edtDVEntUniRe_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDVEntEti_Internalname ;
   private String edtDVEntEti_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDVEntCon_Internalname ;
   private String edtDVEntCon_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDVEntFecEn_Internalname ;
   private String edtDVEntFecEn_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDVEntConIn_Internalname ;
   private String edtDVEntConIn_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDVEntConFi_Internalname ;
   private String edtDVEntConFi_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDVEntPedCu_Internalname ;
   private String edtDVEntPedCu_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDVEntNro_Internalname ;
   private String edtDVEntNro_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDVEntFVal_Internalname ;
   private String edtDVEntFVal_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDVEntLotN_Internalname ;
   private String A11987DVEntLotN ;
   private String edtDVEntLotN_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDVEntFiCon_Internalname ;
   private String edtDVEntFiCon_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDVEntHiCon_Internalname ;
   private String edtDVEntHiCon_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDVEntFfCon_Internalname ;
   private String edtDVEntFfCon_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDVEntHfCon_Internalname ;
   private String edtDVEntHfCon_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDVEntBnc_Internalname ;
   private String A11992DVEntBnc ;
   private String edtDVEntBnc_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDVEntPrvNu_Internalname ;
   private String edtDVEntPrvNu_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtDVEntCC_Internalname ;
   private String A11994DVEntCC ;
   private String edtDVEntCC_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDVEntCCoCo_Internalname ;
   private String edtDVEntCCoCo_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtDVEntRemTp_Internalname ;
   private String A11996DVEntRemTp ;
   private String edtDVEntRemTp_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtDVEntRemSu_Internalname ;
   private String A11997DVEntRemSu ;
   private String edtDVEntRemSu_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtDVEntRemFc_Internalname ;
   private String edtDVEntRemFc_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtDVEntRemNr_Internalname ;
   private String A11999DVEntRemNr ;
   private String edtDVEntRemNr_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtDVEntUniAl_Internalname ;
   private String edtDVEntUniAl_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtDVEntObs_Internalname ;
   private String A12001DVEntObs ;
   private String edtDVEntObs_Jsonclick ;
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
   private String sMode1676 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11935DVPrdNum ;
   private String ZZ11973DVAlbaran ;
   private String ZZ11987DVEntLotN ;
   private String ZZ11992DVEntBnc ;
   private String ZZ11994DVEntCC ;
   private String ZZ11996DVEntRemTp ;
   private String ZZ11997DVEntRemSu ;
   private String ZZ11999DVEntRemNr ;
   private String ZZ12001DVEntObs ;
   private java.util.Date Z11989DVEntHiCon ;
   private java.util.Date Z11991DVEntHfCon ;
   private java.util.Date A11989DVEntHiCon ;
   private java.util.Date A11991DVEntHfCon ;
   private java.util.Date ZZ11989DVEntHiCon ;
   private java.util.Date ZZ11991DVEntHfCon ;
   private java.util.Date Z11981DVEntFecEn ;
   private java.util.Date Z11986DVEntFVal ;
   private java.util.Date Z11988DVEntFiCon ;
   private java.util.Date Z11990DVEntFfCon ;
   private java.util.Date Z11998DVEntRemFc ;
   private java.util.Date A11981DVEntFecEn ;
   private java.util.Date A11986DVEntFVal ;
   private java.util.Date A11988DVEntFiCon ;
   private java.util.Date A11990DVEntFfCon ;
   private java.util.Date A11998DVEntRemFc ;
   private java.util.Date ZZ11981DVEntFecEn ;
   private java.util.Date ZZ11986DVEntFVal ;
   private java.util.Date ZZ11988DVEntFiCon ;
   private java.util.Date ZZ11990DVEntFfCon ;
   private java.util.Date ZZ11998DVEntRemFc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11973DVAlbaran ;
   private boolean n11974DVPedCod ;
   private boolean n11975DVEntUniEn ;
   private boolean n11976DVEntPre ;
   private boolean n11977DVEntNumCo ;
   private boolean n11978DVEntUniRe ;
   private boolean n11979DVEntEti ;
   private boolean n11980DVEntCon ;
   private boolean n11981DVEntFecEn ;
   private boolean n11982DVEntConIn ;
   private boolean n11983DVEntConFi ;
   private boolean n11984DVEntPedCu ;
   private boolean n11985DVEntNro ;
   private boolean n11986DVEntFVal ;
   private boolean n11987DVEntLotN ;
   private boolean n11988DVEntFiCon ;
   private boolean n11989DVEntHiCon ;
   private boolean n11990DVEntFfCon ;
   private boolean n11991DVEntHfCon ;
   private boolean n11992DVEntBnc ;
   private boolean n11993DVEntPrvNu ;
   private boolean n11994DVEntCC ;
   private boolean n11995DVEntCCoCo ;
   private boolean n11996DVEntRemTp ;
   private boolean n11997DVEntRemSu ;
   private boolean n11998DVEntRemFc ;
   private boolean n11999DVEntRemNr ;
   private boolean n12000DVEntUniAl ;
   private boolean n12001DVEntObs ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01IS5_A11972DVLinEnt ;
   private String[] T01IS5_A11973DVAlbaran ;
   private boolean[] T01IS5_n11973DVAlbaran ;
   private int[] T01IS5_A11974DVPedCod ;
   private boolean[] T01IS5_n11974DVPedCod ;
   private java.math.BigDecimal[] T01IS5_A11975DVEntUniEn ;
   private boolean[] T01IS5_n11975DVEntUniEn ;
   private java.math.BigDecimal[] T01IS5_A11976DVEntPre ;
   private boolean[] T01IS5_n11976DVEntPre ;
   private short[] T01IS5_A11977DVEntNumCo ;
   private boolean[] T01IS5_n11977DVEntNumCo ;
   private java.math.BigDecimal[] T01IS5_A11978DVEntUniRe ;
   private boolean[] T01IS5_n11978DVEntUniRe ;
   private byte[] T01IS5_A11979DVEntEti ;
   private boolean[] T01IS5_n11979DVEntEti ;
   private byte[] T01IS5_A11980DVEntCon ;
   private boolean[] T01IS5_n11980DVEntCon ;
   private java.util.Date[] T01IS5_A11981DVEntFecEn ;
   private boolean[] T01IS5_n11981DVEntFecEn ;
   private int[] T01IS5_A11982DVEntConIn ;
   private boolean[] T01IS5_n11982DVEntConIn ;
   private int[] T01IS5_A11983DVEntConFi ;
   private boolean[] T01IS5_n11983DVEntConFi ;
   private byte[] T01IS5_A11984DVEntPedCu ;
   private boolean[] T01IS5_n11984DVEntPedCu ;
   private int[] T01IS5_A11985DVEntNro ;
   private boolean[] T01IS5_n11985DVEntNro ;
   private java.util.Date[] T01IS5_A11986DVEntFVal ;
   private boolean[] T01IS5_n11986DVEntFVal ;
   private String[] T01IS5_A11987DVEntLotN ;
   private boolean[] T01IS5_n11987DVEntLotN ;
   private java.util.Date[] T01IS5_A11988DVEntFiCon ;
   private boolean[] T01IS5_n11988DVEntFiCon ;
   private java.util.Date[] T01IS5_A11989DVEntHiCon ;
   private boolean[] T01IS5_n11989DVEntHiCon ;
   private java.util.Date[] T01IS5_A11990DVEntFfCon ;
   private boolean[] T01IS5_n11990DVEntFfCon ;
   private java.util.Date[] T01IS5_A11991DVEntHfCon ;
   private boolean[] T01IS5_n11991DVEntHfCon ;
   private String[] T01IS5_A11992DVEntBnc ;
   private boolean[] T01IS5_n11992DVEntBnc ;
   private int[] T01IS5_A11993DVEntPrvNu ;
   private boolean[] T01IS5_n11993DVEntPrvNu ;
   private String[] T01IS5_A11994DVEntCC ;
   private boolean[] T01IS5_n11994DVEntCC ;
   private short[] T01IS5_A11995DVEntCCoCo ;
   private boolean[] T01IS5_n11995DVEntCCoCo ;
   private String[] T01IS5_A11996DVEntRemTp ;
   private boolean[] T01IS5_n11996DVEntRemTp ;
   private String[] T01IS5_A11997DVEntRemSu ;
   private boolean[] T01IS5_n11997DVEntRemSu ;
   private java.util.Date[] T01IS5_A11998DVEntRemFc ;
   private boolean[] T01IS5_n11998DVEntRemFc ;
   private String[] T01IS5_A11999DVEntRemNr ;
   private boolean[] T01IS5_n11999DVEntRemNr ;
   private java.math.BigDecimal[] T01IS5_A12000DVEntUniAl ;
   private boolean[] T01IS5_n12000DVEntUniAl ;
   private String[] T01IS5_A12001DVEntObs ;
   private boolean[] T01IS5_n12001DVEntObs ;
   private String[] T01IS5_A396EmprCod ;
   private String[] T01IS5_A11935DVPrdNum ;
   private String[] T01IS4_A396EmprCod ;
   private String[] T01IS6_A396EmprCod ;
   private String[] T01IS7_A396EmprCod ;
   private String[] T01IS7_A11935DVPrdNum ;
   private short[] T01IS7_A11972DVLinEnt ;
   private short[] T01IS3_A11972DVLinEnt ;
   private String[] T01IS3_A11973DVAlbaran ;
   private boolean[] T01IS3_n11973DVAlbaran ;
   private int[] T01IS3_A11974DVPedCod ;
   private boolean[] T01IS3_n11974DVPedCod ;
   private java.math.BigDecimal[] T01IS3_A11975DVEntUniEn ;
   private boolean[] T01IS3_n11975DVEntUniEn ;
   private java.math.BigDecimal[] T01IS3_A11976DVEntPre ;
   private boolean[] T01IS3_n11976DVEntPre ;
   private short[] T01IS3_A11977DVEntNumCo ;
   private boolean[] T01IS3_n11977DVEntNumCo ;
   private java.math.BigDecimal[] T01IS3_A11978DVEntUniRe ;
   private boolean[] T01IS3_n11978DVEntUniRe ;
   private byte[] T01IS3_A11979DVEntEti ;
   private boolean[] T01IS3_n11979DVEntEti ;
   private byte[] T01IS3_A11980DVEntCon ;
   private boolean[] T01IS3_n11980DVEntCon ;
   private java.util.Date[] T01IS3_A11981DVEntFecEn ;
   private boolean[] T01IS3_n11981DVEntFecEn ;
   private int[] T01IS3_A11982DVEntConIn ;
   private boolean[] T01IS3_n11982DVEntConIn ;
   private int[] T01IS3_A11983DVEntConFi ;
   private boolean[] T01IS3_n11983DVEntConFi ;
   private byte[] T01IS3_A11984DVEntPedCu ;
   private boolean[] T01IS3_n11984DVEntPedCu ;
   private int[] T01IS3_A11985DVEntNro ;
   private boolean[] T01IS3_n11985DVEntNro ;
   private java.util.Date[] T01IS3_A11986DVEntFVal ;
   private boolean[] T01IS3_n11986DVEntFVal ;
   private String[] T01IS3_A11987DVEntLotN ;
   private boolean[] T01IS3_n11987DVEntLotN ;
   private java.util.Date[] T01IS3_A11988DVEntFiCon ;
   private boolean[] T01IS3_n11988DVEntFiCon ;
   private java.util.Date[] T01IS3_A11989DVEntHiCon ;
   private boolean[] T01IS3_n11989DVEntHiCon ;
   private java.util.Date[] T01IS3_A11990DVEntFfCon ;
   private boolean[] T01IS3_n11990DVEntFfCon ;
   private java.util.Date[] T01IS3_A11991DVEntHfCon ;
   private boolean[] T01IS3_n11991DVEntHfCon ;
   private String[] T01IS3_A11992DVEntBnc ;
   private boolean[] T01IS3_n11992DVEntBnc ;
   private int[] T01IS3_A11993DVEntPrvNu ;
   private boolean[] T01IS3_n11993DVEntPrvNu ;
   private String[] T01IS3_A11994DVEntCC ;
   private boolean[] T01IS3_n11994DVEntCC ;
   private short[] T01IS3_A11995DVEntCCoCo ;
   private boolean[] T01IS3_n11995DVEntCCoCo ;
   private String[] T01IS3_A11996DVEntRemTp ;
   private boolean[] T01IS3_n11996DVEntRemTp ;
   private String[] T01IS3_A11997DVEntRemSu ;
   private boolean[] T01IS3_n11997DVEntRemSu ;
   private java.util.Date[] T01IS3_A11998DVEntRemFc ;
   private boolean[] T01IS3_n11998DVEntRemFc ;
   private String[] T01IS3_A11999DVEntRemNr ;
   private boolean[] T01IS3_n11999DVEntRemNr ;
   private java.math.BigDecimal[] T01IS3_A12000DVEntUniAl ;
   private boolean[] T01IS3_n12000DVEntUniAl ;
   private String[] T01IS3_A12001DVEntObs ;
   private boolean[] T01IS3_n12001DVEntObs ;
   private String[] T01IS3_A396EmprCod ;
   private String[] T01IS3_A11935DVPrdNum ;
   private String[] T01IS8_A396EmprCod ;
   private String[] T01IS8_A11935DVPrdNum ;
   private short[] T01IS8_A11972DVLinEnt ;
   private String[] T01IS9_A396EmprCod ;
   private String[] T01IS9_A11935DVPrdNum ;
   private short[] T01IS9_A11972DVLinEnt ;
   private short[] T01IS2_A11972DVLinEnt ;
   private String[] T01IS2_A11973DVAlbaran ;
   private boolean[] T01IS2_n11973DVAlbaran ;
   private int[] T01IS2_A11974DVPedCod ;
   private boolean[] T01IS2_n11974DVPedCod ;
   private java.math.BigDecimal[] T01IS2_A11975DVEntUniEn ;
   private boolean[] T01IS2_n11975DVEntUniEn ;
   private java.math.BigDecimal[] T01IS2_A11976DVEntPre ;
   private boolean[] T01IS2_n11976DVEntPre ;
   private short[] T01IS2_A11977DVEntNumCo ;
   private boolean[] T01IS2_n11977DVEntNumCo ;
   private java.math.BigDecimal[] T01IS2_A11978DVEntUniRe ;
   private boolean[] T01IS2_n11978DVEntUniRe ;
   private byte[] T01IS2_A11979DVEntEti ;
   private boolean[] T01IS2_n11979DVEntEti ;
   private byte[] T01IS2_A11980DVEntCon ;
   private boolean[] T01IS2_n11980DVEntCon ;
   private java.util.Date[] T01IS2_A11981DVEntFecEn ;
   private boolean[] T01IS2_n11981DVEntFecEn ;
   private int[] T01IS2_A11982DVEntConIn ;
   private boolean[] T01IS2_n11982DVEntConIn ;
   private int[] T01IS2_A11983DVEntConFi ;
   private boolean[] T01IS2_n11983DVEntConFi ;
   private byte[] T01IS2_A11984DVEntPedCu ;
   private boolean[] T01IS2_n11984DVEntPedCu ;
   private int[] T01IS2_A11985DVEntNro ;
   private boolean[] T01IS2_n11985DVEntNro ;
   private java.util.Date[] T01IS2_A11986DVEntFVal ;
   private boolean[] T01IS2_n11986DVEntFVal ;
   private String[] T01IS2_A11987DVEntLotN ;
   private boolean[] T01IS2_n11987DVEntLotN ;
   private java.util.Date[] T01IS2_A11988DVEntFiCon ;
   private boolean[] T01IS2_n11988DVEntFiCon ;
   private java.util.Date[] T01IS2_A11989DVEntHiCon ;
   private boolean[] T01IS2_n11989DVEntHiCon ;
   private java.util.Date[] T01IS2_A11990DVEntFfCon ;
   private boolean[] T01IS2_n11990DVEntFfCon ;
   private java.util.Date[] T01IS2_A11991DVEntHfCon ;
   private boolean[] T01IS2_n11991DVEntHfCon ;
   private String[] T01IS2_A11992DVEntBnc ;
   private boolean[] T01IS2_n11992DVEntBnc ;
   private int[] T01IS2_A11993DVEntPrvNu ;
   private boolean[] T01IS2_n11993DVEntPrvNu ;
   private String[] T01IS2_A11994DVEntCC ;
   private boolean[] T01IS2_n11994DVEntCC ;
   private short[] T01IS2_A11995DVEntCCoCo ;
   private boolean[] T01IS2_n11995DVEntCCoCo ;
   private String[] T01IS2_A11996DVEntRemTp ;
   private boolean[] T01IS2_n11996DVEntRemTp ;
   private String[] T01IS2_A11997DVEntRemSu ;
   private boolean[] T01IS2_n11997DVEntRemSu ;
   private java.util.Date[] T01IS2_A11998DVEntRemFc ;
   private boolean[] T01IS2_n11998DVEntRemFc ;
   private String[] T01IS2_A11999DVEntRemNr ;
   private boolean[] T01IS2_n11999DVEntRemNr ;
   private java.math.BigDecimal[] T01IS2_A12000DVEntUniAl ;
   private boolean[] T01IS2_n12000DVEntUniAl ;
   private String[] T01IS2_A12001DVEntObs ;
   private boolean[] T01IS2_n12001DVEntObs ;
   private String[] T01IS2_A396EmprCod ;
   private String[] T01IS2_A11935DVPrdNum ;
   private String[] T01IS13_A396EmprCod ;
   private String[] T01IS13_A11935DVPrdNum ;
   private short[] T01IS13_A11972DVLinEnt ;
   private String[] T01IS14_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdventalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdventalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdventalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdventalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IS2", "SELECT LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntNro, EntFVal, EntLotN, EntFiCon, EntHiCon, EntFfCon, EntHfCon, EntBnc, EntPrvNum, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlB, EntObs, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNENTALM WHERE Emprcod = ? AND Prdnum = ? AND LinEnt = ?  FOR UPDATE OF Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntNro, EntFVal, EntLotN, EntFiCon, EntHiCon, EntFfCon, EntHfCon, EntBnc, EntPrvNum, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlB, EntObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS3", "SELECT LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntNro, EntFVal, EntLotN, EntFiCon, EntHiCon, EntFfCon, EntHfCon, EntBnc, EntPrvNum, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlB, EntObs, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNENTALM WHERE Emprcod = ? AND Prdnum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS4", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS5", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, TM1.Albaran, TM1.PedCod, TM1.EntUniEnt, TM1.EntPre, TM1.EntNumCon, TM1.EntUniRem, TM1.EntEti, TM1.EntCon, TM1.EntFecEnt, TM1.EntConIni, TM1.EntConFin, TM1.EntPedCum, TM1.EntNro, TM1.EntFVal, TM1.EntLotN, TM1.EntFiCon, TM1.EntHiCon, TM1.EntFfCon, TM1.EntHfCon, TM1.EntBnc, TM1.EntPrvNum, TM1.EntCC, TM1.EntCCoCod, TM1.EntRemTpo, TM1.EntRemSuc, TM1.EntRemFch, TM1.EntRemNro, TM1.EntUniAlB, TM1.EntObs, TM1.Emprcod AS EmprCod, TM1.Prdnum AS DVPrdNum FROM LVNENTALM TM1 WHERE TM1.Emprcod = ? and TM1.Prdnum = ? and TM1.LinEnt = ? ORDER BY TM1.Emprcod, TM1.Prdnum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS6", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS7", "SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, LinEnt FROM LVNENTALM WHERE Emprcod = ? AND Prdnum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, LinEnt FROM LVNENTALM WHERE ( Emprcod > ? or Emprcod = ? and Prdnum > ? or Prdnum = ? and Emprcod = ? and LinEnt > ?) ORDER BY Emprcod, Prdnum, LinEnt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IS9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, LinEnt FROM LVNENTALM WHERE ( Emprcod < ? or Emprcod = ? and Prdnum < ? or Prdnum = ? and Emprcod = ? and LinEnt < ?) ORDER BY Emprcod DESC, Prdnum DESC, LinEnt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IS10", "INSERT INTO LVNENTALM(LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntNro, EntFVal, EntLotN, EntFiCon, EntHiCon, EntFfCon, EntHfCon, EntBnc, EntPrvNum, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlB, EntObs, Emprcod, Prdnum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "LVNENTALM")
         ,new UpdateCursor("T01IS11", "UPDATE LVNENTALM SET Albaran=?, PedCod=?, EntUniEnt=?, EntPre=?, EntNumCon=?, EntUniRem=?, EntEti=?, EntCon=?, EntFecEnt=?, EntConIni=?, EntConFin=?, EntPedCum=?, EntNro=?, EntFVal=?, EntLotN=?, EntFiCon=?, EntHiCon=?, EntFfCon=?, EntHfCon=?, EntBnc=?, EntPrvNum=?, EntCC=?, EntCCoCod=?, EntRemTpo=?, EntRemSuc=?, EntRemFch=?, EntRemNro=?, EntUniAlB=?, EntObs=?  WHERE Emprcod = ? AND Prdnum = ? AND LinEnt = ?", GX_NOMASK, "LVNENTALM")
         ,new UpdateCursor("T01IS12", "DELETE FROM LVNENTALM  WHERE Emprcod = ? AND Prdnum = ? AND LinEnt = ?", GX_NOMASK, "LVNENTALM")
         ,new ForEachCursor("T01IS13", "SELECT /*+ FIRST_ROWS(100) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, LinEnt FROM LVNENTALM ORDER BY Emprcod, Prdnum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IS14", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 12);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 100);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((String[]) buf[60])[0] = rslt.getString(32, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 12);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 100);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((String[]) buf[60])[0] = rslt.getString(32, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 12);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 100);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((String[]) buf[60])[0] = rslt.getString(32, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 10);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 4);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
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
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[18]);
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[22]).intValue());
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 26);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[32]);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[34], false);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[36]);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 4);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 4);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DATE );
               }
               else
               {
                  stmt.setDate(27, (java.util.Date)parms[52]);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 12);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[56], 4);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 100);
               }
               stmt.setString(31, (String)parms[59], 3);
               stmt.setString(32, (String)parms[60], 6);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 4);
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
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
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
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
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
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 26);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[35]);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 10);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 4);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 4);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 12);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 100);
               }
               stmt.setString(30, (String)parms[58], 3);
               stmt.setString(31, (String)parms[59], 6);
               stmt.setShort(32, ((Number) parms[60]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

