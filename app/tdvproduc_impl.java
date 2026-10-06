package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdvproduc_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos Data View", ""), (short)(0)) ;
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

   public tdvproduc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdvproduc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdvproduc_impl.class ));
   }

   public tdvproduc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDVProduc.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Producto Dv", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum_Internalname, GXutil.rtrim( A11935DVPrdNum), GXutil.rtrim( localUtil.format( A11935DVPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion Dv", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNom_Internalname, GXutil.rtrim( A12003DVPrdNom), GXutil.rtrim( localUtil.format( A12003DVPrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Proveedor Dv", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A12004DVPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12004DVPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12004DVPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "DVPrd Exi Alm", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdExiAl_Internalname, GXutil.ltrim( localUtil.ntoc( A12005DVPrdExiAl, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdExiAl_Enabled!=0) ? localUtil.format( A12005DVPrdExiAl, "ZZZZZZ9.9999") : localUtil.format( A12005DVPrdExiAl, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdExiAl_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdExiAl_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "DVPrd Pre Act", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPreAc_Internalname, GXutil.ltrim( localUtil.ntoc( A12006DVPrdPreAc, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPreAc_Enabled!=0) ? localUtil.format( A12006DVPrdPreAc, "ZZZZZZZ9.99999") : localUtil.format( A12006DVPrdPreAc, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPreAc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPreAc_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "DVUlt Lin Ent", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVUltLinEn_Internalname, GXutil.ltrim( localUtil.ntoc( A12007DVUltLinEn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVUltLinEn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12007DVUltLinEn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12007DVUltLinEn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVUltLinEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVUltLinEn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "DVPrd Det Par", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDetPa_Internalname, GXutil.rtrim( A12008DVPrdDetPa), GXutil.rtrim( localUtil.format( A12008DVPrdDetPa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDetPa_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDetPa_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "DVVal Cod", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12009DVValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12009DVValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A12009DVValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVValCod_Jsonclick, 0, "", "", "", "", "", 1, edtDVValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "DVPrd Ful Ent", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFulEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFulEn_Internalname, localUtil.format(A12010DVPrdFulEn, "99/99/99"), localUtil.format( A12010DVPrdFulEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFulEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFulEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFulEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFulEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "DVPrdCanPen", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCanPe_Internalname, GXutil.ltrim( localUtil.ntoc( A12011DVPrdCanPe, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdCanPe_Enabled!=0) ? localUtil.format( A12011DVPrdCanPe, "ZZZZZZ9.9999") : localUtil.format( A12011DVPrdCanPe, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCanPe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCanPe_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "DVPrd Rot Rea", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdRotRe_Internalname, GXutil.ltrim( localUtil.ntoc( A12012DVPrdRotRe, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdRotRe_Enabled!=0) ? localUtil.format( A12012DVPrdRotRe, "ZZZZZ9.99999") : localUtil.format( A12012DVPrdRotRe, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdRotRe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdRotRe_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "DVPrd Pre Med", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPreMe_Internalname, GXutil.ltrim( localUtil.ntoc( A12013DVPrdPreMe, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPreMe_Enabled!=0) ? localUtil.format( A12013DVPrdPreMe, "ZZZZZZZ9.99999") : localUtil.format( A12013DVPrdPreMe, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPreMe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPreMe_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "DVPrd Rec", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdRec_Internalname, GXutil.rtrim( A12014DVPrdRec), GXutil.rtrim( localUtil.format( A12014DVPrdRec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdRec_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "DVPrd Pre Ant", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPreAn_Internalname, GXutil.ltrim( localUtil.ntoc( A12015DVPrdPreAn, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPreAn_Enabled!=0) ? localUtil.format( A12015DVPrdPreAn, "ZZZZZZZ9.99999") : localUtil.format( A12015DVPrdPreAn, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPreAn_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPreAn_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "DVPrdFecPre", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFecPr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFecPr_Internalname, localUtil.format(A12016DVPrdFecPr, "99/99/99"), localUtil.format( A12016DVPrdFecPr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFecPr_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFecPr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFecPr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFecPr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "DVMov Esp ULin", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVMovEspUL_Internalname, GXutil.ltrim( localUtil.ntoc( A12017DVMovEspUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVMovEspUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12017DVMovEspUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12017DVMovEspUL), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVMovEspUL_Jsonclick, 0, "", "", "", "", "", 1, edtDVMovEspUL_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "DVPrd Exi CC", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A12018DVPrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdExiCC_Enabled!=0) ? localUtil.format( A12018DVPrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A12018DVPrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdExiCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "DVPrd Ult DCC", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUltDC_Internalname, GXutil.ltrim( localUtil.ntoc( A12019DVPrdUltDC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUltDC_Enabled!=0) ? localUtil.format( A12019DVPrdUltDC, "ZZZZ9.99") : localUtil.format( A12019DVPrdUltDC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUltDC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUltDC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "DVPrd Ult ECC", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUltEC_Internalname, GXutil.ltrim( localUtil.ntoc( A12020DVPrdUltEC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUltEC_Enabled!=0) ? localUtil.format( A12020DVPrdUltEC, "ZZZZ9.99") : localUtil.format( A12020DVPrdUltEC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUltEC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUltEC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "DVPrd Ult CCC", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUltCC_Internalname, GXutil.ltrim( localUtil.ntoc( A12021DVPrdUltCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUltCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12021DVPrdUltCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12021DVPrdUltCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUltCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUltCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "DVPrd Exi CCP", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdExiCP_Internalname, GXutil.ltrim( localUtil.ntoc( A12022DVPrdExiCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdExiCP_Enabled!=0) ? localUtil.format( A12022DVPrdExiCP, "ZZZZ9.99") : localUtil.format( A12022DVPrdExiCP, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdExiCP_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdExiCP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "DVPrd Dif CC", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDifCC_Internalname, GXutil.ltrim( localUtil.ntoc( A12023DVPrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdDifCC_Enabled!=0) ? localUtil.format( A12023DVPrdDifCC, "ZZZZ9.99") : localUtil.format( A12023DVPrdDifCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDifCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDifCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "DVPrd Fac Con", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFacCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12024DVPrdFacCo, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdFacCo_Enabled!=0) ? localUtil.format( A12024DVPrdFacCo, "Z9.9999") : localUtil.format( A12024DVPrdFacCo, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFacCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFacCo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "DVPrd Con Dia", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdConDi_Internalname, GXutil.ltrim( localUtil.ntoc( A12025DVPrdConDi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdConDi_Enabled!=0) ? localUtil.format( A12025DVPrdConDi, "ZZZ9.99") : localUtil.format( A12025DVPrdConDi, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdConDi_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdConDi_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "DVPrd Stk Min U", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdStkMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12026DVPrdStkMi, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdStkMi_Enabled!=0) ? localUtil.format( A12026DVPrdStkMi, "ZZZZ9.99") : localUtil.format( A12026DVPrdStkMi, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdStkMi_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdStkMi_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "DVPrdStkMinD", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdStkMD_Internalname, GXutil.ltrim( localUtil.ntoc( A12027DVPrdStkMD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdStkMD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12027DVPrdStkMD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12027DVPrdStkMD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdStkMD_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdStkMD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "DVPrd Dia Rot", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDiaRo_Internalname, GXutil.ltrim( localUtil.ntoc( A12028DVPrdDiaRo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdDiaRo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDiaRo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDiaRo_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "DVPrd Pla Ent", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPlaEn_Internalname, GXutil.ltrim( localUtil.ntoc( A12029DVPrdPlaEn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPlaEn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPlaEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPlaEn_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "DVMet Cod", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVMetCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12030DVMetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVMetCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12030DVMetCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A12030DVMetCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVMetCod_Jsonclick, 0, "", "", "", "", "", 1, edtDVMetCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "DVPrd Lot Min", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdLotMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12031DVPrdLotMi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdLotMi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12031DVPrdLotMi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12031DVPrdLotMi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdLotMi_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdLotMi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "DVPrd Num Uco", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNumUc_Internalname, GXutil.ltrim( localUtil.ntoc( A12032DVPrdNumUc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdNumUc_Enabled!=0) ? localUtil.format( A12032DVPrdNumUc, "ZZZ9.99") : localUtil.format( A12032DVPrdNumUc, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNumUc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNumUc_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "DVPrd Can Res", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCanRe_Internalname, GXutil.ltrim( localUtil.ntoc( A12033DVPrdCanRe, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdCanRe_Enabled!=0) ? localUtil.format( A12033DVPrdCanRe, "ZZZZZZ9.9999") : localUtil.format( A12033DVPrdCanRe, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCanRe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCanRe_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "DVPrd Ful Ped", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFulPe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFulPe_Internalname, localUtil.format(A12034DVPrdFulPe, "99/99/99"), localUtil.format( A12034DVPrdFulPe, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFulPe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFulPe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFulPe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFulPe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "DVPrd Ful CC", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFulCC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFulCC_Internalname, localUtil.format(A12035DVPrdFulCC, "99/99/99"), localUtil.format( A12035DVPrdFulCC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFulCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFulCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFulCC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFulCC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "DVPrd Con CC", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdConCC_Internalname, GXutil.ltrim( localUtil.ntoc( A12036DVPrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdConCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12036DVPrdConCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12036DVPrdConCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdConCC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdConCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "DVPrd Dsc Tec", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDscTe_Internalname, GXutil.rtrim( A12037DVPrdDscTe), GXutil.rtrim( localUtil.format( A12037DVPrdDscTe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDscTe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDscTe_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "DVPrd Uni Com", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUniCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12038DVPrdUniCo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUniCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12038DVPrdUniCo), "9") : localUtil.format( DecimalUtil.doubleToDec(A12038DVPrdUniCo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUniCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUniCo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "DVPrdUniCon", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUniCn_Internalname, GXutil.ltrim( localUtil.ntoc( A12039DVPrdUniCn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUniCn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12039DVPrdUniCn), "9") : localUtil.format( DecimalUtil.doubleToDec(A12039DVPrdUniCn), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUniCn_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUniCn_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "DVPrd Ref Prv", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdRefPr_Internalname, GXutil.rtrim( A12040DVPrdRefPr), GXutil.rtrim( localUtil.format( A12040DVPrdRefPr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdRefPr_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdRefPr_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "DVPrd Sus", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdSus_Internalname, GXutil.rtrim( A12041DVPrdSus), GXutil.rtrim( localUtil.format( A12041DVPrdSus, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdSus_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdSus_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "DVPrd Cal Nec", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCalNe_Internalname, GXutil.rtrim( A12042DVPrdCalNe), GXutil.rtrim( localUtil.format( A12042DVPrdCalNe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCalNe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCalNe_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "DVPrd Sit", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdSit_Internalname, GXutil.ltrim( localUtil.ntoc( A12043DVPrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12043DVPrdSit), "9") : localUtil.format( DecimalUtil.doubleToDec(A12043DVPrdSit), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdSit_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdSit_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "DVTip Dto Cod", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVTipDtoCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12044DVTipDtoCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVTipDtoCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12044DVTipDtoCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12044DVTipDtoCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVTipDtoCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVTipDtoCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "DVPrd Val Stk", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdValSt_Internalname, GXutil.ltrim( localUtil.ntoc( A12045DVPrdValSt, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdValSt_Enabled!=0) ? localUtil.format( A12045DVPrdValSt, "ZZZZZZZ9.99") : localUtil.format( A12045DVPrdValSt, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdValSt_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdValSt_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "DVDif Val Stk", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVDifValSt_Internalname, GXutil.ltrim( localUtil.ntoc( A12046DVDifValSt, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVDifValSt_Enabled!=0) ? localUtil.format( A12046DVDifValSt, "ZZZZZZZ9.99") : localUtil.format( A12046DVDifValSt, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVDifValSt_Jsonclick, 0, "", "", "", "", "", 1, edtDVDifValSt_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "DVPrd Fec Ent", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFecEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFecEn_Internalname, localUtil.format(A12047DVPrdFecEn, "99/99/99"), localUtil.format( A12047DVPrdFecEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFecEn_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFecEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFecEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFecEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "DVPrd Pos X", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPosX_Internalname, GXutil.ltrim( localUtil.ntoc( A12048DVPrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPosX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12048DVPrdPosX), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12048DVPrdPosX), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPosX_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPosX_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "DVPrd Pos Y", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPosY_Internalname, GXutil.ltrim( localUtil.ntoc( A12049DVPrdPosY, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPosY_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12049DVPrdPosY), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12049DVPrdPosY), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPosY_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPosY_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "DVPrd Tip", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdTip_Internalname, GXutil.rtrim( A12050DVPrdTip), GXutil.rtrim( localUtil.format( A12050DVPrdTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdTip_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "DVPrd Dqo", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDqo_Internalname, GXutil.ltrim( localUtil.ntoc( A12051DVPrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdDqo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12051DVPrdDqo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12051DVPrdDqo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDqo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDqo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "DVPrd Rev", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdRev_Internalname, GXutil.rtrim( A12052DVPrdRev), GXutil.rtrim( localUtil.format( A12052DVPrdRev, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdRev_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdRev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "DVPrd Tnq", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A12053DVPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12053DVPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12053DVPrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdTnq_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "DVCCSt KULin", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCCStKULi_Internalname, GXutil.ltrim( localUtil.ntoc( A12054DVCCStKULi, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCCStKULi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12054DVCCStKULi), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12054DVCCStKULi), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCCStKULi_Jsonclick, 0, "", "", "", "", "", 1, edtDVCCStKULi_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "DVPrd UMe Fo", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A12055DVPrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12055DVPrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A12055DVPrdUMeFo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdUMeFo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdUMeFo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "DVPrd Nom2", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNom2_Internalname, GXutil.rtrim( A12056DVPrdNom2), GXutil.rtrim( localUtil.format( A12056DVPrdNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNom2_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "DVPrd Num2", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum2_Internalname, GXutil.rtrim( A12057DVPrdNum2), GXutil.rtrim( localUtil.format( A12057DVPrdNum2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum2_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "DVPrd Obs", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDVPrdObs_Internalname, A12058DVPrdObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,306);\"", (short)(0), 1, edtDVPrdObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "DVPrdPreAc2", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPreA2_Internalname, GXutil.ltrim( localUtil.ntoc( A12059DVPrdPreA2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPreA2_Enabled!=0) ? localUtil.format( A12059DVPrdPreA2, "ZZZZZZZ9.99999") : localUtil.format( A12059DVPrdPreA2, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPreA2_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPreA2_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "DVPrd Dens S", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdDensS_Internalname, GXutil.ltrim( localUtil.ntoc( A12060DVPrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdDensS_Enabled!=0) ? localUtil.format( A12060DVPrdDensS, "ZZ9.999") : localUtil.format( A12060DVPrdDensS, "ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdDensS_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdDensS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "DVPrd Conc S", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdConcS_Internalname, GXutil.ltrim( localUtil.ntoc( A12061DVPrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdConcS_Enabled!=0) ? localUtil.format( A12061DVPrdConcS, "ZZ9.999") : localUtil.format( A12061DVPrdConcS, "ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdConcS_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdConcS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "DVPrd Sal M", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdSalM_Internalname, GXutil.rtrim( A12062DVPrdSalM), GXutil.rtrim( localUtil.format( A12062DVPrdSalM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdSalM_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdSalM_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "DVPrd Solub", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdSolub_Internalname, GXutil.ltrim( localUtil.ntoc( A12063DVPrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdSolub_Enabled!=0) ? localUtil.format( A12063DVPrdSolub, "ZZZ9.99") : localUtil.format( A12063DVPrdSolub, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdSolub_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdSolub_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "DVPrd Num Cent", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNumCe_Internalname, GXutil.rtrim( A12064DVPrdNumCe), GXutil.rtrim( localUtil.format( A12064DVPrdNumCe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNumCe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNumCe_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "DVTip Prd Cod", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVTipPrdCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12065DVTipPrdCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVTipPrdCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12065DVTipPrdCo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12065DVTipPrdCo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVTipPrdCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVTipPrdCo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "DVPrd Numct1", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNumct_Internalname, GXutil.ltrim( localUtil.ntoc( A12066DVPrdNumct, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdNumct_Enabled!=0) ? localUtil.format( A12066DVPrdNumct, "ZZ9.99") : localUtil.format( A12066DVPrdNumct, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNumct_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNumct_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "DVPrd Numct2", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNumc2_Internalname, GXutil.ltrim( localUtil.ntoc( A12067DVPrdNumc2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdNumc2_Enabled!=0) ? localUtil.format( A12067DVPrdNumc2, "ZZ9.99") : localUtil.format( A12067DVPrdNumc2, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,351);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNumc2_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNumc2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "DVPrd Hor Mad", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdHorMa_Internalname, GXutil.ltrim( localUtil.ntoc( A12068DVPrdHorMa, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdHorMa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12068DVPrdHorMa), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12068DVPrdHorMa), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdHorMa_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdHorMa_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "DVPrd Pre Ref", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPreRe_Internalname, GXutil.ltrim( localUtil.ntoc( A12069DVPrdPreRe, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPreRe_Enabled!=0) ? localUtil.format( A12069DVPrdPreRe, "ZZZZZZZ9.99999") : localUtil.format( A12069DVPrdPreRe, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPreRe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPreRe_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "DVMat_ Lts", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVMat_Lts_Internalname, GXutil.ltrim( localUtil.ntoc( A12070DVMat_Lts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVMat_Lts_Enabled!=0) ? localUtil.format( A12070DVMat_Lts, "ZZZZZ9.99") : localUtil.format( A12070DVMat_Lts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVMat_Lts_Jsonclick, 0, "", "", "", "", "", 1, edtDVMat_Lts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "DVDPrd Exi Almc", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdExiAc_Internalname, GXutil.ltrim( localUtil.ntoc( A12071DVPrdExiAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdExiAc_Enabled!=0) ? localUtil.format( A12071DVPrdExiAc, "ZZZZZZ9.9999") : localUtil.format( A12071DVPrdExiAc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,371);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdExiAc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdExiAc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "DVAlmc_ Ult", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVAlmc_Ult_Internalname, GXutil.ltrim( localUtil.ntoc( A12072DVAlmc_Ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVAlmc_Ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,376);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVAlmc_Ult_Jsonclick, 0, "", "", "", "", "", 1, edtDVAlmc_Ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "DVPrd Alt Act", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdAltAc_Internalname, GXutil.ltrim( localUtil.ntoc( A12073DVPrdAltAc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdAltAc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12073DVPrdAltAc), "9") : localUtil.format( DecimalUtil.doubleToDec(A12073DVPrdAltAc), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdAltAc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdAltAc_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "DVPrd Pes Con", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPesCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12074DVPrdPesCo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdPesCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12074DVPrdPesCo), "9") : localUtil.format( DecimalUtil.doubleToDec(A12074DVPrdPesCo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPesCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPesCo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "DVPrd Pes Term", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdPesTe_Internalname, GXutil.rtrim( A12075DVPrdPesTe), GXutil.rtrim( localUtil.format( A12075DVPrdPesTe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdPesTe_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdPesTe_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "DVCC_ Ultln", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Ultln_Internalname, GXutil.ltrim( localUtil.ntoc( A12076DVCC_Ultln, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Ultln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12076DVCC_Ultln), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12076DVCC_Ultln), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Ultln_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Ultln_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "DVPrd Sal", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdSal_Internalname, GXutil.rtrim( A12077DVPrdSal), GXutil.rtrim( localUtil.format( A12077DVPrdSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdSal_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdSal_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "DVSub Fam Cod", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVSubFamCo_Internalname, GXutil.ltrim( localUtil.ntoc( A12078DVSubFamCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVSubFamCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12078DVSubFamCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12078DVSubFamCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVSubFamCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVSubFamCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "DVPrd Inc", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdInc_Internalname, GXutil.rtrim( A12079DVPrdInc), GXutil.rtrim( localUtil.format( A12079DVPrdInc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdInc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdInc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "DVPrd Comp", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdComp_Internalname, GXutil.rtrim( A12080DVPrdComp), GXutil.rtrim( localUtil.format( A12080DVPrdComp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdComp_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdComp_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "DVPrd Aox", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdAox_Internalname, GXutil.ltrim( localUtil.ntoc( A12081DVPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdAox_Enabled!=0) ? localUtil.format( A12081DVPrdAox, "ZZ9.99") : localUtil.format( A12081DVPrdAox, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdAox_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdAox_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "DVPrd NCAS", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNCAS_Internalname, GXutil.rtrim( A12082DVPrdNCAS), GXutil.rtrim( localUtil.format( A12082DVPrdNCAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNCAS_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNCAS_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "DVPrd FT", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFT_Internalname, GXutil.rtrim( A12083DVPrdFT), GXutil.rtrim( localUtil.format( A12083DVPrdFT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFT_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "DVPrd FFT", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFFT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFFT_Internalname, localUtil.format(A12084DVPrdFFT, "99/99/99"), localUtil.format( A12084DVPrdFFT, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,436);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFFT_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFFT_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFFT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFFT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "DVPrd HS", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdHS_Internalname, GXutil.rtrim( A12085DVPrdHS), GXutil.rtrim( localUtil.format( A12085DVPrdHS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,441);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdHS_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdHS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, httpContext.getMessage( "DVPrd FHS", ""), "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVPrdFHS_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFHS_Internalname, localUtil.format(A12086DVPrdFHS, "99/99/99"), localUtil.format( A12086DVPrdFHS, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,446);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFHS_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFHS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVPrdFHS_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVPrdFHS_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVProduc.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, httpContext.getMessage( "DVPrd Reach", ""), "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdReach_Internalname, GXutil.rtrim( A12087DVPrdReach), GXutil.rtrim( localUtil.format( A12087DVPrdReach, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdReach_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdReach_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock88_Internalname, httpContext.getMessage( "DVPrd Okotex", ""), "", "", lblTextblock88_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdOkote_Internalname, GXutil.rtrim( A12088DVPrdOkote), GXutil.rtrim( localUtil.format( A12088DVPrdOkote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,456);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdOkote_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdOkote_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, httpContext.getMessage( "DVPrd Col Idx", ""), "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 461,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdColId_Internalname, GXutil.rtrim( A12089DVPrdColId), GXutil.rtrim( localUtil.format( A12089DVPrdColId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,461);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdColId_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdColId_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock90_Internalname, httpContext.getMessage( "DVPrd Lote", ""), "", "", lblTextblock90_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 466,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdLote_Internalname, GXutil.rtrim( A12090DVPrdLote), GXutil.rtrim( localUtil.format( A12090DVPrdLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,466);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdLote_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock91_Internalname, httpContext.getMessage( "DVPrd RTM", ""), "", "", lblTextblock91_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 471,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdRTM_Internalname, GXutil.rtrim( A12091DVPrdRTM), GXutil.rtrim( localUtil.format( A12091DVPrdRTM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,471);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdRTM_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdRTM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock92_Internalname, httpContext.getMessage( "DVPrd Ctw1", ""), "", "", lblTextblock92_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 476,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCtw1_Internalname, GXutil.rtrim( A12092DVPrdCtw1), GXutil.rtrim( localUtil.format( A12092DVPrdCtw1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,476);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCtw1_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCtw1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock93_Internalname, httpContext.getMessage( "DVPrd Ctw2", ""), "", "", lblTextblock93_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 481,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCtw2_Internalname, GXutil.rtrim( A12093DVPrdCtw2), GXutil.rtrim( localUtil.format( A12093DVPrdCtw2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,481);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCtw2_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCtw2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock94_Internalname, httpContext.getMessage( "DVPrd Ctw3", ""), "", "", lblTextblock94_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 486,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCtw3_Internalname, GXutil.rtrim( A12094DVPrdCtw3), GXutil.rtrim( localUtil.format( A12094DVPrdCtw3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,486);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCtw3_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCtw3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock95_Internalname, httpContext.getMessage( "DVPrd Nro CAS", ""), "", "", lblTextblock95_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 491,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNroCA_Internalname, GXutil.rtrim( A12095DVPrdNroCA), GXutil.rtrim( localUtil.format( A12095DVPrdNroCA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,491);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNroCA_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNroCA_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock96_Internalname, httpContext.getMessage( "DVPrd Gots", ""), "", "", lblTextblock96_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 496,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdGots_Internalname, GXutil.rtrim( A12096DVPrdGots), GXutil.rtrim( localUtil.format( A12096DVPrdGots, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,496);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdGots_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdGots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock97_Internalname, httpContext.getMessage( "DVPrd Hm", ""), "", "", lblTextblock97_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 501,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdHm_Internalname, GXutil.rtrim( A12097DVPrdHm), GXutil.rtrim( localUtil.format( A12097DVPrdHm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,501);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdHm_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdHm_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock98_Internalname, httpContext.getMessage( "DVPrd Conct", ""), "", "", lblTextblock98_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 506,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdConct_Internalname, GXutil.ltrim( localUtil.ntoc( A12098DVPrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdConct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12098DVPrdConct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12098DVPrdConct), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,506);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdConct_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdConct_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock99_Internalname, httpContext.getMessage( "DVPrd EINECS", ""), "", "", lblTextblock99_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 511,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdEINEC_Internalname, GXutil.rtrim( A12099DVPrdEINEC), GXutil.rtrim( localUtil.format( A12099DVPrdEINEC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,511);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdEINEC_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdEINEC_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock100_Internalname, httpContext.getMessage( "DVPrd Funcion", ""), "", "", lblTextblock100_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 516,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdFunci_Internalname, GXutil.rtrim( A12100DVPrdFunci), GXutil.rtrim( localUtil.format( A12100DVPrdFunci, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,516);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdFunci_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdFunci_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock101_Internalname, httpContext.getMessage( "DVPrd Nm Qu", ""), "", "", lblTextblock101_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 521,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDVPrdNmQu_Internalname, A12101DVPrdNmQu, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,521);\"", (short)(0), 1, edtDVPrdNmQu_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock102_Internalname, httpContext.getMessage( "DVPrd Eq LP", ""), "", "", lblTextblock102_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 526,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdEqLP_Internalname, GXutil.rtrim( A12102DVPrdEqLP), GXutil.rtrim( localUtil.format( A12102DVPrdEqLP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,526);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdEqLP_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdEqLP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock103_Internalname, httpContext.getMessage( "DVPrd Conc", ""), "", "", lblTextblock103_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 531,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdConc_Internalname, GXutil.ltrim( localUtil.ntoc( A12103DVPrdConc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVPrdConc_Enabled!=0) ? localUtil.format( A12103DVPrdConc, "ZZ9.99") : localUtil.format( A12103DVPrdConc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,531);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdConc_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdConc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock104_Internalname, httpContext.getMessage( "DVPrd Ctw4", ""), "", "", lblTextblock104_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 536,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdCtw4_Internalname, GXutil.rtrim( A12104DVPrdCtw4), GXutil.rtrim( localUtil.format( A12104DVPrdCtw4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,536);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdCtw4_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdCtw4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock105_Internalname, httpContext.getMessage( "DVPrd List", ""), "", "", lblTextblock105_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 541,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdList_Internalname, GXutil.rtrim( A12105DVPrdList), GXutil.rtrim( localUtil.format( A12105DVPrdList, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,541);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdList_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdList_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVProduc.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 544,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 545,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 546,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 547,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVProduc.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 548,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDVProduc.htm");
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
         Z12003DVPrdNom = httpContext.cgiGet( "Z12003DVPrdNom") ;
         Z12004DVPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z12004DVPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12005DVPrdExiAl = localUtil.ctond( httpContext.cgiGet( "Z12005DVPrdExiAl")) ;
         Z12006DVPrdPreAc = localUtil.ctond( httpContext.cgiGet( "Z12006DVPrdPreAc")) ;
         Z12007DVUltLinEn = (short)(localUtil.ctol( httpContext.cgiGet( "Z12007DVUltLinEn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12008DVPrdDetPa = httpContext.cgiGet( "Z12008DVPrdDetPa") ;
         Z12009DVValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12009DVValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12010DVPrdFulEn = localUtil.ctod( httpContext.cgiGet( "Z12010DVPrdFulEn"), 0) ;
         Z12011DVPrdCanPe = localUtil.ctond( httpContext.cgiGet( "Z12011DVPrdCanPe")) ;
         Z12012DVPrdRotRe = localUtil.ctond( httpContext.cgiGet( "Z12012DVPrdRotRe")) ;
         Z12013DVPrdPreMe = localUtil.ctond( httpContext.cgiGet( "Z12013DVPrdPreMe")) ;
         Z12014DVPrdRec = httpContext.cgiGet( "Z12014DVPrdRec") ;
         Z12015DVPrdPreAn = localUtil.ctond( httpContext.cgiGet( "Z12015DVPrdPreAn")) ;
         Z12016DVPrdFecPr = localUtil.ctod( httpContext.cgiGet( "Z12016DVPrdFecPr"), 0) ;
         Z12017DVMovEspUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z12017DVMovEspUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12018DVPrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z12018DVPrdExiCC")) ;
         Z12019DVPrdUltDC = localUtil.ctond( httpContext.cgiGet( "Z12019DVPrdUltDC")) ;
         Z12020DVPrdUltEC = localUtil.ctond( httpContext.cgiGet( "Z12020DVPrdUltEC")) ;
         Z12021DVPrdUltCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z12021DVPrdUltCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12022DVPrdExiCP = localUtil.ctond( httpContext.cgiGet( "Z12022DVPrdExiCP")) ;
         Z12023DVPrdDifCC = localUtil.ctond( httpContext.cgiGet( "Z12023DVPrdDifCC")) ;
         Z12024DVPrdFacCo = localUtil.ctond( httpContext.cgiGet( "Z12024DVPrdFacCo")) ;
         Z12025DVPrdConDi = localUtil.ctond( httpContext.cgiGet( "Z12025DVPrdConDi")) ;
         Z12026DVPrdStkMi = localUtil.ctond( httpContext.cgiGet( "Z12026DVPrdStkMi")) ;
         Z12027DVPrdStkMD = (short)(localUtil.ctol( httpContext.cgiGet( "Z12027DVPrdStkMD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12028DVPrdDiaRo = (short)(localUtil.ctol( httpContext.cgiGet( "Z12028DVPrdDiaRo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12029DVPrdPlaEn = (short)(localUtil.ctol( httpContext.cgiGet( "Z12029DVPrdPlaEn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12030DVMetCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12030DVMetCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12031DVPrdLotMi = (short)(localUtil.ctol( httpContext.cgiGet( "Z12031DVPrdLotMi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12032DVPrdNumUc = localUtil.ctond( httpContext.cgiGet( "Z12032DVPrdNumUc")) ;
         Z12033DVPrdCanRe = localUtil.ctond( httpContext.cgiGet( "Z12033DVPrdCanRe")) ;
         Z12034DVPrdFulPe = localUtil.ctod( httpContext.cgiGet( "Z12034DVPrdFulPe"), 0) ;
         Z12035DVPrdFulCC = localUtil.ctod( httpContext.cgiGet( "Z12035DVPrdFulCC"), 0) ;
         Z12036DVPrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z12036DVPrdConCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12037DVPrdDscTe = httpContext.cgiGet( "Z12037DVPrdDscTe") ;
         Z12038DVPrdUniCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12038DVPrdUniCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12039DVPrdUniCn = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12039DVPrdUniCn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12040DVPrdRefPr = httpContext.cgiGet( "Z12040DVPrdRefPr") ;
         Z12041DVPrdSus = httpContext.cgiGet( "Z12041DVPrdSus") ;
         Z12042DVPrdCalNe = httpContext.cgiGet( "Z12042DVPrdCalNe") ;
         Z12043DVPrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12043DVPrdSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12044DVTipDtoCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12044DVTipDtoCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12045DVPrdValSt = localUtil.ctond( httpContext.cgiGet( "Z12045DVPrdValSt")) ;
         Z12046DVDifValSt = localUtil.ctond( httpContext.cgiGet( "Z12046DVDifValSt")) ;
         Z12047DVPrdFecEn = localUtil.ctod( httpContext.cgiGet( "Z12047DVPrdFecEn"), 0) ;
         Z12048DVPrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( "Z12048DVPrdPosX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12049DVPrdPosY = (short)(localUtil.ctol( httpContext.cgiGet( "Z12049DVPrdPosY"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12050DVPrdTip = httpContext.cgiGet( "Z12050DVPrdTip") ;
         Z12051DVPrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( "Z12051DVPrdDqo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12052DVPrdRev = httpContext.cgiGet( "Z12052DVPrdRev") ;
         Z12053DVPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12053DVPrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12054DVCCStKULi = localUtil.ctol( httpContext.cgiGet( "Z12054DVCCStKULi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z12055DVPrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12055DVPrdUMeFo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12056DVPrdNom2 = httpContext.cgiGet( "Z12056DVPrdNom2") ;
         Z12057DVPrdNum2 = httpContext.cgiGet( "Z12057DVPrdNum2") ;
         Z12059DVPrdPreA2 = localUtil.ctond( httpContext.cgiGet( "Z12059DVPrdPreA2")) ;
         Z12060DVPrdDensS = localUtil.ctond( httpContext.cgiGet( "Z12060DVPrdDensS")) ;
         Z12061DVPrdConcS = localUtil.ctond( httpContext.cgiGet( "Z12061DVPrdConcS")) ;
         Z12062DVPrdSalM = httpContext.cgiGet( "Z12062DVPrdSalM") ;
         Z12063DVPrdSolub = localUtil.ctond( httpContext.cgiGet( "Z12063DVPrdSolub")) ;
         Z12064DVPrdNumCe = httpContext.cgiGet( "Z12064DVPrdNumCe") ;
         Z12065DVTipPrdCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z12065DVTipPrdCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12066DVPrdNumct = localUtil.ctond( httpContext.cgiGet( "Z12066DVPrdNumct")) ;
         Z12067DVPrdNumc2 = localUtil.ctond( httpContext.cgiGet( "Z12067DVPrdNumc2")) ;
         Z12068DVPrdHorMa = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12068DVPrdHorMa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12069DVPrdPreRe = localUtil.ctond( httpContext.cgiGet( "Z12069DVPrdPreRe")) ;
         Z12070DVMat_Lts = localUtil.ctond( httpContext.cgiGet( "Z12070DVMat_Lts")) ;
         Z12071DVPrdExiAc = localUtil.ctond( httpContext.cgiGet( "Z12071DVPrdExiAc")) ;
         Z12072DVAlmc_Ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z12072DVAlmc_Ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12073DVPrdAltAc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12073DVPrdAltAc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12074DVPrdPesCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12074DVPrdPesCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12075DVPrdPesTe = httpContext.cgiGet( "Z12075DVPrdPesTe") ;
         Z12076DVCC_Ultln = localUtil.ctol( httpContext.cgiGet( "Z12076DVCC_Ultln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z12077DVPrdSal = httpContext.cgiGet( "Z12077DVPrdSal") ;
         Z12078DVSubFamCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12078DVSubFamCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12079DVPrdInc = httpContext.cgiGet( "Z12079DVPrdInc") ;
         Z12080DVPrdComp = httpContext.cgiGet( "Z12080DVPrdComp") ;
         Z12081DVPrdAox = localUtil.ctond( httpContext.cgiGet( "Z12081DVPrdAox")) ;
         Z12082DVPrdNCAS = httpContext.cgiGet( "Z12082DVPrdNCAS") ;
         Z12083DVPrdFT = httpContext.cgiGet( "Z12083DVPrdFT") ;
         Z12084DVPrdFFT = localUtil.ctod( httpContext.cgiGet( "Z12084DVPrdFFT"), 0) ;
         Z12085DVPrdHS = httpContext.cgiGet( "Z12085DVPrdHS") ;
         Z12086DVPrdFHS = localUtil.ctod( httpContext.cgiGet( "Z12086DVPrdFHS"), 0) ;
         Z12087DVPrdReach = httpContext.cgiGet( "Z12087DVPrdReach") ;
         Z12088DVPrdOkote = httpContext.cgiGet( "Z12088DVPrdOkote") ;
         Z12089DVPrdColId = httpContext.cgiGet( "Z12089DVPrdColId") ;
         Z12090DVPrdLote = httpContext.cgiGet( "Z12090DVPrdLote") ;
         Z12091DVPrdRTM = httpContext.cgiGet( "Z12091DVPrdRTM") ;
         Z12092DVPrdCtw1 = httpContext.cgiGet( "Z12092DVPrdCtw1") ;
         Z12093DVPrdCtw2 = httpContext.cgiGet( "Z12093DVPrdCtw2") ;
         Z12094DVPrdCtw3 = httpContext.cgiGet( "Z12094DVPrdCtw3") ;
         Z12095DVPrdNroCA = httpContext.cgiGet( "Z12095DVPrdNroCA") ;
         Z12096DVPrdGots = httpContext.cgiGet( "Z12096DVPrdGots") ;
         Z12097DVPrdHm = httpContext.cgiGet( "Z12097DVPrdHm") ;
         Z12098DVPrdConct = (short)(localUtil.ctol( httpContext.cgiGet( "Z12098DVPrdConct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12099DVPrdEINEC = httpContext.cgiGet( "Z12099DVPrdEINEC") ;
         Z12100DVPrdFunci = httpContext.cgiGet( "Z12100DVPrdFunci") ;
         Z12101DVPrdNmQu = httpContext.cgiGet( "Z12101DVPrdNmQu") ;
         Z12102DVPrdEqLP = httpContext.cgiGet( "Z12102DVPrdEqLP") ;
         Z12103DVPrdConc = localUtil.ctond( httpContext.cgiGet( "Z12103DVPrdConc")) ;
         Z12104DVPrdCtw4 = httpContext.cgiGet( "Z12104DVPrdCtw4") ;
         Z12105DVPrdList = httpContext.cgiGet( "Z12105DVPrdList") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.cgiGet( edtDVPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A12003DVPrdNom = httpContext.cgiGet( edtDVPrdNom_Internalname) ;
         n12003DVPrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12003DVPrdNom", A12003DVPrdNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrvNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12004DVPrvNum = 0 ;
            n12004DVPrvNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12004DVPrvNum), 6, 0));
         }
         else
         {
            A12004DVPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDVPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12004DVPrvNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12004DVPrvNum), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAl_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDEXIAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdExiAl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12005DVPrdExiAl = DecimalUtil.ZERO ;
            n12005DVPrdExiAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrimstr( A12005DVPrdExiAl, 12, 4));
         }
         else
         {
            A12005DVPrdExiAl = localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAl_Internalname)) ;
            n12005DVPrdExiAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrimstr( A12005DVPrdExiAl, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAc_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPREAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPreAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12006DVPrdPreAc = DecimalUtil.ZERO ;
            n12006DVPrdPreAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrimstr( A12006DVPrdPreAc, 14, 5));
         }
         else
         {
            A12006DVPrdPreAc = localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAc_Internalname)) ;
            n12006DVPrdPreAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrimstr( A12006DVPrdPreAc, 14, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVUltLinEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVUltLinEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVULTLINEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVUltLinEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12007DVUltLinEn = (short)(0) ;
            n12007DVUltLinEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12007DVUltLinEn), 4, 0));
         }
         else
         {
            A12007DVUltLinEn = (short)(localUtil.ctol( httpContext.cgiGet( edtDVUltLinEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12007DVUltLinEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12007DVUltLinEn), 4, 0));
         }
         A12008DVPrdDetPa = httpContext.cgiGet( edtDVPrdDetPa_Internalname) ;
         n12008DVPrdDetPa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12008DVPrdDetPa", A12008DVPrdDetPa);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVVALCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVValCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12009DVValCod = (byte)(0) ;
            n12009DVValCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.str( A12009DVValCod, 1, 0));
         }
         else
         {
            A12009DVValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12009DVValCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.str( A12009DVValCod, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFulEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFULEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFulEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12010DVPrdFulEn = GXutil.nullDate() ;
            n12010DVPrdFulEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
         }
         else
         {
            A12010DVPrdFulEn = localUtil.ctod( httpContext.cgiGet( edtDVPrdFulEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12010DVPrdFulEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdCanPe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdCanPe_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCANPE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdCanPe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12011DVPrdCanPe = DecimalUtil.ZERO ;
            n12011DVPrdCanPe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrimstr( A12011DVPrdCanPe, 12, 4));
         }
         else
         {
            A12011DVPrdCanPe = localUtil.ctond( httpContext.cgiGet( edtDVPrdCanPe_Internalname)) ;
            n12011DVPrdCanPe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrimstr( A12011DVPrdCanPe, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdRotRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdRotRe_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDROTRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdRotRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12012DVPrdRotRe = DecimalUtil.ZERO ;
            n12012DVPrdRotRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrimstr( A12012DVPrdRotRe, 12, 5));
         }
         else
         {
            A12012DVPrdRotRe = localUtil.ctond( httpContext.cgiGet( edtDVPrdRotRe_Internalname)) ;
            n12012DVPrdRotRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrimstr( A12012DVPrdRotRe, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdPreMe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdPreMe_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPREME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPreMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12013DVPrdPreMe = DecimalUtil.ZERO ;
            n12013DVPrdPreMe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrimstr( A12013DVPrdPreMe, 14, 5));
         }
         else
         {
            A12013DVPrdPreMe = localUtil.ctond( httpContext.cgiGet( edtDVPrdPreMe_Internalname)) ;
            n12013DVPrdPreMe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrimstr( A12013DVPrdPreMe, 14, 5));
         }
         A12014DVPrdRec = httpContext.cgiGet( edtDVPrdRec_Internalname) ;
         n12014DVPrdRec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12014DVPrdRec", A12014DVPrdRec);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAn_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPREAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPreAn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12015DVPrdPreAn = DecimalUtil.ZERO ;
            n12015DVPrdPreAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrimstr( A12015DVPrdPreAn, 14, 5));
         }
         else
         {
            A12015DVPrdPreAn = localUtil.ctond( httpContext.cgiGet( edtDVPrdPreAn_Internalname)) ;
            n12015DVPrdPreAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrimstr( A12015DVPrdPreAn, 14, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFecPr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFECPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFecPr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12016DVPrdFecPr = GXutil.nullDate() ;
            n12016DVPrdFecPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
         }
         else
         {
            A12016DVPrdFecPr = localUtil.ctod( httpContext.cgiGet( edtDVPrdFecPr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12016DVPrdFecPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVMovEspUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVMovEspUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVMOVESPUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVMovEspUL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12017DVMovEspUL = (short)(0) ;
            n12017DVMovEspUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12017DVMovEspUL), 3, 0));
         }
         else
         {
            A12017DVMovEspUL = (short)(localUtil.ctol( httpContext.cgiGet( edtDVMovEspUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12017DVMovEspUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12017DVMovEspUL), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDEXICC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdExiCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12018DVPrdExiCC = DecimalUtil.ZERO ;
            n12018DVPrdExiCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrimstr( A12018DVPrdExiCC, 12, 4));
         }
         else
         {
            A12018DVPrdExiCC = localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCC_Internalname)) ;
            n12018DVPrdExiCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrimstr( A12018DVPrdExiCC, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdUltDC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdUltDC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDULTDC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUltDC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12019DVPrdUltDC = DecimalUtil.ZERO ;
            n12019DVPrdUltDC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrimstr( A12019DVPrdUltDC, 8, 2));
         }
         else
         {
            A12019DVPrdUltDC = localUtil.ctond( httpContext.cgiGet( edtDVPrdUltDC_Internalname)) ;
            n12019DVPrdUltDC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrimstr( A12019DVPrdUltDC, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdUltEC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdUltEC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDULTEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUltEC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12020DVPrdUltEC = DecimalUtil.ZERO ;
            n12020DVPrdUltEC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrimstr( A12020DVPrdUltEC, 8, 2));
         }
         else
         {
            A12020DVPrdUltEC = localUtil.ctond( httpContext.cgiGet( edtDVPrdUltEC_Internalname)) ;
            n12020DVPrdUltEC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrimstr( A12020DVPrdUltEC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUltCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUltCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDULTCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUltCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12021DVPrdUltCC = (short)(0) ;
            n12021DVPrdUltCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12021DVPrdUltCC), 4, 0));
         }
         else
         {
            A12021DVPrdUltCC = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdUltCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12021DVPrdUltCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12021DVPrdUltCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCP_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDEXICP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdExiCP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12022DVPrdExiCP = DecimalUtil.ZERO ;
            n12022DVPrdExiCP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrimstr( A12022DVPrdExiCP, 8, 2));
         }
         else
         {
            A12022DVPrdExiCP = localUtil.ctond( httpContext.cgiGet( edtDVPrdExiCP_Internalname)) ;
            n12022DVPrdExiCP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrimstr( A12022DVPrdExiCP, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdDifCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdDifCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDDIFCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdDifCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12023DVPrdDifCC = DecimalUtil.ZERO ;
            n12023DVPrdDifCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrimstr( A12023DVPrdDifCC, 8, 2));
         }
         else
         {
            A12023DVPrdDifCC = localUtil.ctond( httpContext.cgiGet( edtDVPrdDifCC_Internalname)) ;
            n12023DVPrdDifCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrimstr( A12023DVPrdDifCC, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdFacCo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdFacCo_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDFACCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFacCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12024DVPrdFacCo = DecimalUtil.ZERO ;
            n12024DVPrdFacCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrimstr( A12024DVPrdFacCo, 7, 4));
         }
         else
         {
            A12024DVPrdFacCo = localUtil.ctond( httpContext.cgiGet( edtDVPrdFacCo_Internalname)) ;
            n12024DVPrdFacCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrimstr( A12024DVPrdFacCo, 7, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdConDi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdConDi_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCONDI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdConDi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12025DVPrdConDi = DecimalUtil.ZERO ;
            n12025DVPrdConDi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrimstr( A12025DVPrdConDi, 7, 2));
         }
         else
         {
            A12025DVPrdConDi = localUtil.ctond( httpContext.cgiGet( edtDVPrdConDi_Internalname)) ;
            n12025DVPrdConDi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrimstr( A12025DVPrdConDi, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdStkMi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdStkMi_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDSTKMI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdStkMi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12026DVPrdStkMi = DecimalUtil.ZERO ;
            n12026DVPrdStkMi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrimstr( A12026DVPrdStkMi, 8, 2));
         }
         else
         {
            A12026DVPrdStkMi = localUtil.ctond( httpContext.cgiGet( edtDVPrdStkMi_Internalname)) ;
            n12026DVPrdStkMi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrimstr( A12026DVPrdStkMi, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdStkMD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdStkMD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDSTKMD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdStkMD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12027DVPrdStkMD = (short)(0) ;
            n12027DVPrdStkMD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12027DVPrdStkMD), 4, 0));
         }
         else
         {
            A12027DVPrdStkMD = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdStkMD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12027DVPrdStkMD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12027DVPrdStkMD), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdDiaRo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdDiaRo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDDIARO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdDiaRo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12028DVPrdDiaRo = (short)(0) ;
            n12028DVPrdDiaRo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), 3, 0));
         }
         else
         {
            A12028DVPrdDiaRo = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdDiaRo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12028DVPrdDiaRo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPlaEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPlaEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPLAEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPlaEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12029DVPrdPlaEn = (short)(0) ;
            n12029DVPrdPlaEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), 3, 0));
         }
         else
         {
            A12029DVPrdPlaEn = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdPlaEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12029DVPrdPlaEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVMETCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVMetCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12030DVMetCod = (byte)(0) ;
            n12030DVMetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.str( A12030DVMetCod, 1, 0));
         }
         else
         {
            A12030DVMetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12030DVMetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.str( A12030DVMetCod, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdLotMi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdLotMi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDLOTMI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdLotMi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12031DVPrdLotMi = (short)(0) ;
            n12031DVPrdLotMi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12031DVPrdLotMi), 4, 0));
         }
         else
         {
            A12031DVPrdLotMi = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdLotMi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12031DVPrdLotMi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12031DVPrdLotMi), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdNumUc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdNumUc_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDNUMUC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdNumUc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12032DVPrdNumUc = DecimalUtil.ZERO ;
            n12032DVPrdNumUc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrimstr( A12032DVPrdNumUc, 7, 2));
         }
         else
         {
            A12032DVPrdNumUc = localUtil.ctond( httpContext.cgiGet( edtDVPrdNumUc_Internalname)) ;
            n12032DVPrdNumUc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrimstr( A12032DVPrdNumUc, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdCanRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdCanRe_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCANRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdCanRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12033DVPrdCanRe = DecimalUtil.ZERO ;
            n12033DVPrdCanRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrimstr( A12033DVPrdCanRe, 12, 4));
         }
         else
         {
            A12033DVPrdCanRe = localUtil.ctond( httpContext.cgiGet( edtDVPrdCanRe_Internalname)) ;
            n12033DVPrdCanRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrimstr( A12033DVPrdCanRe, 12, 4));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFulPe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFULPE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFulPe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12034DVPrdFulPe = GXutil.nullDate() ;
            n12034DVPrdFulPe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
         }
         else
         {
            A12034DVPrdFulPe = localUtil.ctod( httpContext.cgiGet( edtDVPrdFulPe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12034DVPrdFulPe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFulCC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFULCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFulCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12035DVPrdFulCC = GXutil.nullDate() ;
            n12035DVPrdFulCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
         }
         else
         {
            A12035DVPrdFulCC = localUtil.ctod( httpContext.cgiGet( edtDVPrdFulCC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12035DVPrdFulCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCONCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdConCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12036DVPrdConCC = (short)(0) ;
            n12036DVPrdConCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12036DVPrdConCC), 4, 0));
         }
         else
         {
            A12036DVPrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12036DVPrdConCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12036DVPrdConCC), 4, 0));
         }
         A12037DVPrdDscTe = httpContext.cgiGet( edtDVPrdDscTe_Internalname) ;
         n12037DVPrdDscTe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12037DVPrdDscTe", A12037DVPrdDscTe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDUNICO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUniCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12038DVPrdUniCo = (byte)(0) ;
            n12038DVPrdUniCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.str( A12038DVPrdUniCo, 1, 0));
         }
         else
         {
            A12038DVPrdUniCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12038DVPrdUniCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.str( A12038DVPrdUniCo, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDUNICN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUniCn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12039DVPrdUniCn = (byte)(0) ;
            n12039DVPrdUniCn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.str( A12039DVPrdUniCn, 1, 0));
         }
         else
         {
            A12039DVPrdUniCn = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdUniCn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12039DVPrdUniCn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.str( A12039DVPrdUniCn, 1, 0));
         }
         A12040DVPrdRefPr = httpContext.cgiGet( edtDVPrdRefPr_Internalname) ;
         n12040DVPrdRefPr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12040DVPrdRefPr", A12040DVPrdRefPr);
         A12041DVPrdSus = httpContext.cgiGet( edtDVPrdSus_Internalname) ;
         n12041DVPrdSus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12041DVPrdSus", A12041DVPrdSus);
         A12042DVPrdCalNe = httpContext.cgiGet( edtDVPrdCalNe_Internalname) ;
         n12042DVPrdCalNe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12042DVPrdCalNe", A12042DVPrdCalNe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12043DVPrdSit = (byte)(0) ;
            n12043DVPrdSit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.str( A12043DVPrdSit, 1, 0));
         }
         else
         {
            A12043DVPrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12043DVPrdSit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.str( A12043DVPrdSit, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVTipDtoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVTipDtoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVTIPDTOCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVTipDtoCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12044DVTipDtoCo = (byte)(0) ;
            n12044DVTipDtoCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12044DVTipDtoCo), 2, 0));
         }
         else
         {
            A12044DVTipDtoCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVTipDtoCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12044DVTipDtoCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12044DVTipDtoCo), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdValSt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdValSt_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDVALST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdValSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12045DVPrdValSt = DecimalUtil.ZERO ;
            n12045DVPrdValSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrimstr( A12045DVPrdValSt, 11, 2));
         }
         else
         {
            A12045DVPrdValSt = localUtil.ctond( httpContext.cgiGet( edtDVPrdValSt_Internalname)) ;
            n12045DVPrdValSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrimstr( A12045DVPrdValSt, 11, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVDifValSt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVDifValSt_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVDIFVALST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVDifValSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12046DVDifValSt = DecimalUtil.ZERO ;
            n12046DVDifValSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrimstr( A12046DVDifValSt, 11, 2));
         }
         else
         {
            A12046DVDifValSt = localUtil.ctond( httpContext.cgiGet( edtDVDifValSt_Internalname)) ;
            n12046DVDifValSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrimstr( A12046DVDifValSt, 11, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFecEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFECEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFecEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12047DVPrdFecEn = GXutil.nullDate() ;
            n12047DVPrdFecEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
         }
         else
         {
            A12047DVPrdFecEn = localUtil.ctod( httpContext.cgiGet( edtDVPrdFecEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12047DVPrdFecEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPOSX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPosX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12048DVPrdPosX = (short)(0) ;
            n12048DVPrdPosX = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12048DVPrdPosX), 4, 0));
         }
         else
         {
            A12048DVPrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12048DVPrdPosX = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12048DVPrdPosX), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPOSY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPosY_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12049DVPrdPosY = (short)(0) ;
            n12049DVPrdPosY = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12049DVPrdPosY), 4, 0));
         }
         else
         {
            A12049DVPrdPosY = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12049DVPrdPosY = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12049DVPrdPosY), 4, 0));
         }
         A12050DVPrdTip = httpContext.cgiGet( edtDVPrdTip_Internalname) ;
         n12050DVPrdTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12050DVPrdTip", A12050DVPrdTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDDQO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdDqo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12051DVPrdDqo = (short)(0) ;
            n12051DVPrdDqo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12051DVPrdDqo), 4, 0));
         }
         else
         {
            A12051DVPrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12051DVPrdDqo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12051DVPrdDqo), 4, 0));
         }
         A12052DVPrdRev = httpContext.cgiGet( edtDVPrdRev_Internalname) ;
         n12052DVPrdRev = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12052DVPrdRev", A12052DVPrdRev);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12053DVPrdTnq = (byte)(0) ;
            n12053DVPrdTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12053DVPrdTnq), 2, 0));
         }
         else
         {
            A12053DVPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12053DVPrdTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12053DVPrdTnq), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStKULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCCStKULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCCSTKULI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCCStKULi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12054DVCCStKULi = 0 ;
            n12054DVCCStKULi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12054DVCCStKULi), 12, 0));
         }
         else
         {
            A12054DVCCStKULi = localUtil.ctol( httpContext.cgiGet( edtDVCCStKULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n12054DVCCStKULi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12054DVCCStKULi), 12, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDUMEFO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdUMeFo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12055DVPrdUMeFo = (byte)(0) ;
            n12055DVPrdUMeFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.str( A12055DVPrdUMeFo, 1, 0));
         }
         else
         {
            A12055DVPrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12055DVPrdUMeFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.str( A12055DVPrdUMeFo, 1, 0));
         }
         A12056DVPrdNom2 = httpContext.cgiGet( edtDVPrdNom2_Internalname) ;
         n12056DVPrdNom2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12056DVPrdNom2", A12056DVPrdNom2);
         A12057DVPrdNum2 = httpContext.cgiGet( edtDVPrdNum2_Internalname) ;
         n12057DVPrdNum2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12057DVPrdNum2", A12057DVPrdNum2);
         A12058DVPrdObs = httpContext.cgiGet( edtDVPrdObs_Internalname) ;
         n12058DVPrdObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12058DVPrdObs", A12058DVPrdObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdPreA2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdPreA2_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPREA2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPreA2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12059DVPrdPreA2 = DecimalUtil.ZERO ;
            n12059DVPrdPreA2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrimstr( A12059DVPrdPreA2, 14, 5));
         }
         else
         {
            A12059DVPrdPreA2 = localUtil.ctond( httpContext.cgiGet( edtDVPrdPreA2_Internalname)) ;
            n12059DVPrdPreA2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrimstr( A12059DVPrdPreA2, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdDensS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdDensS_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDDENSS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdDensS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12060DVPrdDensS = DecimalUtil.ZERO ;
            n12060DVPrdDensS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrimstr( A12060DVPrdDensS, 7, 3));
         }
         else
         {
            A12060DVPrdDensS = localUtil.ctond( httpContext.cgiGet( edtDVPrdDensS_Internalname)) ;
            n12060DVPrdDensS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrimstr( A12060DVPrdDensS, 7, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdConcS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdConcS_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCONCS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdConcS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12061DVPrdConcS = DecimalUtil.ZERO ;
            n12061DVPrdConcS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrimstr( A12061DVPrdConcS, 7, 3));
         }
         else
         {
            A12061DVPrdConcS = localUtil.ctond( httpContext.cgiGet( edtDVPrdConcS_Internalname)) ;
            n12061DVPrdConcS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrimstr( A12061DVPrdConcS, 7, 3));
         }
         A12062DVPrdSalM = httpContext.cgiGet( edtDVPrdSalM_Internalname) ;
         n12062DVPrdSalM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12062DVPrdSalM", A12062DVPrdSalM);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdSolub_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdSolub_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDSOLUB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdSolub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12063DVPrdSolub = DecimalUtil.ZERO ;
            n12063DVPrdSolub = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrimstr( A12063DVPrdSolub, 7, 2));
         }
         else
         {
            A12063DVPrdSolub = localUtil.ctond( httpContext.cgiGet( edtDVPrdSolub_Internalname)) ;
            n12063DVPrdSolub = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrimstr( A12063DVPrdSolub, 7, 2));
         }
         A12064DVPrdNumCe = httpContext.cgiGet( edtDVPrdNumCe_Internalname) ;
         n12064DVPrdNumCe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12064DVPrdNumCe", A12064DVPrdNumCe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVTipPrdCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVTipPrdCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVTIPPRDCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVTipPrdCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12065DVTipPrdCo = (short)(0) ;
            n12065DVTipPrdCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12065DVTipPrdCo), 4, 0));
         }
         else
         {
            A12065DVTipPrdCo = (short)(localUtil.ctol( httpContext.cgiGet( edtDVTipPrdCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12065DVTipPrdCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12065DVTipPrdCo), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdNumct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdNumct_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDNUMCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdNumct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12066DVPrdNumct = DecimalUtil.ZERO ;
            n12066DVPrdNumct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrimstr( A12066DVPrdNumct, 6, 2));
         }
         else
         {
            A12066DVPrdNumct = localUtil.ctond( httpContext.cgiGet( edtDVPrdNumct_Internalname)) ;
            n12066DVPrdNumct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrimstr( A12066DVPrdNumct, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdNumc2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdNumc2_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDNUMC2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdNumc2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12067DVPrdNumc2 = DecimalUtil.ZERO ;
            n12067DVPrdNumc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrimstr( A12067DVPrdNumc2, 6, 2));
         }
         else
         {
            A12067DVPrdNumc2 = localUtil.ctond( httpContext.cgiGet( edtDVPrdNumc2_Internalname)) ;
            n12067DVPrdNumc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrimstr( A12067DVPrdNumc2, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdHorMa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdHorMa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDHORMA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdHorMa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12068DVPrdHorMa = (byte)(0) ;
            n12068DVPrdHorMa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12068DVPrdHorMa), 2, 0));
         }
         else
         {
            A12068DVPrdHorMa = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdHorMa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12068DVPrdHorMa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12068DVPrdHorMa), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdPreRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdPreRe_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPRERE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPreRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12069DVPrdPreRe = DecimalUtil.ZERO ;
            n12069DVPrdPreRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrimstr( A12069DVPrdPreRe, 14, 5));
         }
         else
         {
            A12069DVPrdPreRe = localUtil.ctond( httpContext.cgiGet( edtDVPrdPreRe_Internalname)) ;
            n12069DVPrdPreRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrimstr( A12069DVPrdPreRe, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVMat_Lts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVMat_Lts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVMAT_LTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVMat_Lts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12070DVMat_Lts = DecimalUtil.ZERO ;
            n12070DVMat_Lts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrimstr( A12070DVMat_Lts, 9, 2));
         }
         else
         {
            A12070DVMat_Lts = localUtil.ctond( httpContext.cgiGet( edtDVMat_Lts_Internalname)) ;
            n12070DVMat_Lts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrimstr( A12070DVMat_Lts, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDEXIAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdExiAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12071DVPrdExiAc = DecimalUtil.ZERO ;
            n12071DVPrdExiAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrimstr( A12071DVPrdExiAc, 12, 4));
         }
         else
         {
            A12071DVPrdExiAc = localUtil.ctond( httpContext.cgiGet( edtDVPrdExiAc_Internalname)) ;
            n12071DVPrdExiAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrimstr( A12071DVPrdExiAc, 12, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVALMC_ULT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVAlmc_Ult_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12072DVAlmc_Ult = 0 ;
            n12072DVAlmc_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), 6, 0));
         }
         else
         {
            A12072DVAlmc_Ult = (int)(localUtil.ctol( httpContext.cgiGet( edtDVAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12072DVAlmc_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdAltAc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdAltAc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDALTAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdAltAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12073DVPrdAltAc = (byte)(0) ;
            n12073DVPrdAltAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.str( A12073DVPrdAltAc, 1, 0));
         }
         else
         {
            A12073DVPrdAltAc = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdAltAc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12073DVPrdAltAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.str( A12073DVPrdAltAc, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPesCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdPesCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDPESCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdPesCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12074DVPrdPesCo = (byte)(0) ;
            n12074DVPrdPesCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.str( A12074DVPrdPesCo, 1, 0));
         }
         else
         {
            A12074DVPrdPesCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVPrdPesCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12074DVPrdPesCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.str( A12074DVPrdPesCo, 1, 0));
         }
         A12075DVPrdPesTe = httpContext.cgiGet( edtDVPrdPesTe_Internalname) ;
         n12075DVPrdPesTe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12075DVPrdPesTe", A12075DVPrdPesTe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_ULTLN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Ultln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12076DVCC_Ultln = 0 ;
            n12076DVCC_Ultln = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12076DVCC_Ultln), 12, 0));
         }
         else
         {
            A12076DVCC_Ultln = localUtil.ctol( httpContext.cgiGet( edtDVCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n12076DVCC_Ultln = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12076DVCC_Ultln), 12, 0));
         }
         A12077DVPrdSal = httpContext.cgiGet( edtDVPrdSal_Internalname) ;
         n12077DVPrdSal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12077DVPrdSal", A12077DVPrdSal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVSubFamCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVSubFamCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVSUBFAMCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVSubFamCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12078DVSubFamCo = (byte)(0) ;
            n12078DVSubFamCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12078DVSubFamCo), 2, 0));
         }
         else
         {
            A12078DVSubFamCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVSubFamCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12078DVSubFamCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12078DVSubFamCo), 2, 0));
         }
         A12079DVPrdInc = httpContext.cgiGet( edtDVPrdInc_Internalname) ;
         n12079DVPrdInc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12079DVPrdInc", A12079DVPrdInc);
         A12080DVPrdComp = httpContext.cgiGet( edtDVPrdComp_Internalname) ;
         n12080DVPrdComp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12080DVPrdComp", A12080DVPrdComp);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdAox_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdAox_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDAOX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdAox_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12081DVPrdAox = DecimalUtil.ZERO ;
            n12081DVPrdAox = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrimstr( A12081DVPrdAox, 6, 2));
         }
         else
         {
            A12081DVPrdAox = localUtil.ctond( httpContext.cgiGet( edtDVPrdAox_Internalname)) ;
            n12081DVPrdAox = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrimstr( A12081DVPrdAox, 6, 2));
         }
         A12082DVPrdNCAS = httpContext.cgiGet( edtDVPrdNCAS_Internalname) ;
         n12082DVPrdNCAS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12082DVPrdNCAS", A12082DVPrdNCAS);
         A12083DVPrdFT = httpContext.cgiGet( edtDVPrdFT_Internalname) ;
         n12083DVPrdFT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12083DVPrdFT", A12083DVPrdFT);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFFT_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFFT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFFT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12084DVPrdFFT = GXutil.nullDate() ;
            n12084DVPrdFFT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
         }
         else
         {
            A12084DVPrdFFT = localUtil.ctod( httpContext.cgiGet( edtDVPrdFFT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12084DVPrdFFT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
         }
         A12085DVPrdHS = httpContext.cgiGet( edtDVPrdHS_Internalname) ;
         n12085DVPrdHS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12085DVPrdHS", A12085DVPrdHS);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDVPrdFHS_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DVPRDFHS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdFHS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12086DVPrdFHS = GXutil.nullDate() ;
            n12086DVPrdFHS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
         }
         else
         {
            A12086DVPrdFHS = localUtil.ctod( httpContext.cgiGet( edtDVPrdFHS_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12086DVPrdFHS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
         }
         A12087DVPrdReach = httpContext.cgiGet( edtDVPrdReach_Internalname) ;
         n12087DVPrdReach = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12087DVPrdReach", A12087DVPrdReach);
         A12088DVPrdOkote = httpContext.cgiGet( edtDVPrdOkote_Internalname) ;
         n12088DVPrdOkote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12088DVPrdOkote", A12088DVPrdOkote);
         A12089DVPrdColId = httpContext.cgiGet( edtDVPrdColId_Internalname) ;
         n12089DVPrdColId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12089DVPrdColId", A12089DVPrdColId);
         A12090DVPrdLote = httpContext.cgiGet( edtDVPrdLote_Internalname) ;
         n12090DVPrdLote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12090DVPrdLote", A12090DVPrdLote);
         A12091DVPrdRTM = httpContext.cgiGet( edtDVPrdRTM_Internalname) ;
         n12091DVPrdRTM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12091DVPrdRTM", A12091DVPrdRTM);
         A12092DVPrdCtw1 = httpContext.cgiGet( edtDVPrdCtw1_Internalname) ;
         n12092DVPrdCtw1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12092DVPrdCtw1", A12092DVPrdCtw1);
         A12093DVPrdCtw2 = httpContext.cgiGet( edtDVPrdCtw2_Internalname) ;
         n12093DVPrdCtw2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12093DVPrdCtw2", A12093DVPrdCtw2);
         A12094DVPrdCtw3 = httpContext.cgiGet( edtDVPrdCtw3_Internalname) ;
         n12094DVPrdCtw3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12094DVPrdCtw3", A12094DVPrdCtw3);
         A12095DVPrdNroCA = httpContext.cgiGet( edtDVPrdNroCA_Internalname) ;
         n12095DVPrdNroCA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12095DVPrdNroCA", A12095DVPrdNroCA);
         A12096DVPrdGots = httpContext.cgiGet( edtDVPrdGots_Internalname) ;
         n12096DVPrdGots = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12096DVPrdGots", A12096DVPrdGots);
         A12097DVPrdHm = httpContext.cgiGet( edtDVPrdHm_Internalname) ;
         n12097DVPrdHm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12097DVPrdHm", A12097DVPrdHm);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCONCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdConct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12098DVPrdConct = (short)(0) ;
            n12098DVPrdConct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12098DVPrdConct), 3, 0));
         }
         else
         {
            A12098DVPrdConct = (short)(localUtil.ctol( httpContext.cgiGet( edtDVPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12098DVPrdConct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12098DVPrdConct), 3, 0));
         }
         A12099DVPrdEINEC = httpContext.cgiGet( edtDVPrdEINEC_Internalname) ;
         n12099DVPrdEINEC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12099DVPrdEINEC", A12099DVPrdEINEC);
         A12100DVPrdFunci = httpContext.cgiGet( edtDVPrdFunci_Internalname) ;
         n12100DVPrdFunci = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12100DVPrdFunci", A12100DVPrdFunci);
         A12101DVPrdNmQu = httpContext.cgiGet( edtDVPrdNmQu_Internalname) ;
         n12101DVPrdNmQu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12101DVPrdNmQu", A12101DVPrdNmQu);
         A12102DVPrdEqLP = httpContext.cgiGet( edtDVPrdEqLP_Internalname) ;
         n12102DVPrdEqLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12102DVPrdEqLP", A12102DVPrdEqLP);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVPrdConc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVPrdConc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVPRDCONC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVPrdConc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12103DVPrdConc = DecimalUtil.ZERO ;
            n12103DVPrdConc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrimstr( A12103DVPrdConc, 6, 2));
         }
         else
         {
            A12103DVPrdConc = localUtil.ctond( httpContext.cgiGet( edtDVPrdConc_Internalname)) ;
            n12103DVPrdConc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrimstr( A12103DVPrdConc, 6, 2));
         }
         A12104DVPrdCtw4 = httpContext.cgiGet( edtDVPrdCtw4_Internalname) ;
         n12104DVPrdCtw4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12104DVPrdCtw4", A12104DVPrdCtw4);
         A12105DVPrdList = httpContext.cgiGet( edtDVPrdList_Internalname) ;
         n12105DVPrdList = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12105DVPrdList", A12105DVPrdList);
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
            initAll1IU1678( ) ;
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
      disableAttributes1IU1678( ) ;
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

   public void confirm_1IU0( )
   {
      beforeValidate1IU1678( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IU1678( ) ;
         }
         else
         {
            checkExtendedTable1IU1678( ) ;
            if ( AnyError == 0 )
            {
               zm1IU1678( 2) ;
            }
            closeExtendedTableCursors1IU1678( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IU0( ) ;
      }
   }

   public void resetCaption1IU0( )
   {
   }

   public void zm1IU1678( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12003DVPrdNom = T01IU3_A12003DVPrdNom[0] ;
            Z12004DVPrvNum = T01IU3_A12004DVPrvNum[0] ;
            Z12005DVPrdExiAl = T01IU3_A12005DVPrdExiAl[0] ;
            Z12006DVPrdPreAc = T01IU3_A12006DVPrdPreAc[0] ;
            Z12007DVUltLinEn = T01IU3_A12007DVUltLinEn[0] ;
            Z12008DVPrdDetPa = T01IU3_A12008DVPrdDetPa[0] ;
            Z12009DVValCod = T01IU3_A12009DVValCod[0] ;
            Z12010DVPrdFulEn = T01IU3_A12010DVPrdFulEn[0] ;
            Z12011DVPrdCanPe = T01IU3_A12011DVPrdCanPe[0] ;
            Z12012DVPrdRotRe = T01IU3_A12012DVPrdRotRe[0] ;
            Z12013DVPrdPreMe = T01IU3_A12013DVPrdPreMe[0] ;
            Z12014DVPrdRec = T01IU3_A12014DVPrdRec[0] ;
            Z12015DVPrdPreAn = T01IU3_A12015DVPrdPreAn[0] ;
            Z12016DVPrdFecPr = T01IU3_A12016DVPrdFecPr[0] ;
            Z12017DVMovEspUL = T01IU3_A12017DVMovEspUL[0] ;
            Z12018DVPrdExiCC = T01IU3_A12018DVPrdExiCC[0] ;
            Z12019DVPrdUltDC = T01IU3_A12019DVPrdUltDC[0] ;
            Z12020DVPrdUltEC = T01IU3_A12020DVPrdUltEC[0] ;
            Z12021DVPrdUltCC = T01IU3_A12021DVPrdUltCC[0] ;
            Z12022DVPrdExiCP = T01IU3_A12022DVPrdExiCP[0] ;
            Z12023DVPrdDifCC = T01IU3_A12023DVPrdDifCC[0] ;
            Z12024DVPrdFacCo = T01IU3_A12024DVPrdFacCo[0] ;
            Z12025DVPrdConDi = T01IU3_A12025DVPrdConDi[0] ;
            Z12026DVPrdStkMi = T01IU3_A12026DVPrdStkMi[0] ;
            Z12027DVPrdStkMD = T01IU3_A12027DVPrdStkMD[0] ;
            Z12028DVPrdDiaRo = T01IU3_A12028DVPrdDiaRo[0] ;
            Z12029DVPrdPlaEn = T01IU3_A12029DVPrdPlaEn[0] ;
            Z12030DVMetCod = T01IU3_A12030DVMetCod[0] ;
            Z12031DVPrdLotMi = T01IU3_A12031DVPrdLotMi[0] ;
            Z12032DVPrdNumUc = T01IU3_A12032DVPrdNumUc[0] ;
            Z12033DVPrdCanRe = T01IU3_A12033DVPrdCanRe[0] ;
            Z12034DVPrdFulPe = T01IU3_A12034DVPrdFulPe[0] ;
            Z12035DVPrdFulCC = T01IU3_A12035DVPrdFulCC[0] ;
            Z12036DVPrdConCC = T01IU3_A12036DVPrdConCC[0] ;
            Z12037DVPrdDscTe = T01IU3_A12037DVPrdDscTe[0] ;
            Z12038DVPrdUniCo = T01IU3_A12038DVPrdUniCo[0] ;
            Z12039DVPrdUniCn = T01IU3_A12039DVPrdUniCn[0] ;
            Z12040DVPrdRefPr = T01IU3_A12040DVPrdRefPr[0] ;
            Z12041DVPrdSus = T01IU3_A12041DVPrdSus[0] ;
            Z12042DVPrdCalNe = T01IU3_A12042DVPrdCalNe[0] ;
            Z12043DVPrdSit = T01IU3_A12043DVPrdSit[0] ;
            Z12044DVTipDtoCo = T01IU3_A12044DVTipDtoCo[0] ;
            Z12045DVPrdValSt = T01IU3_A12045DVPrdValSt[0] ;
            Z12046DVDifValSt = T01IU3_A12046DVDifValSt[0] ;
            Z12047DVPrdFecEn = T01IU3_A12047DVPrdFecEn[0] ;
            Z12048DVPrdPosX = T01IU3_A12048DVPrdPosX[0] ;
            Z12049DVPrdPosY = T01IU3_A12049DVPrdPosY[0] ;
            Z12050DVPrdTip = T01IU3_A12050DVPrdTip[0] ;
            Z12051DVPrdDqo = T01IU3_A12051DVPrdDqo[0] ;
            Z12052DVPrdRev = T01IU3_A12052DVPrdRev[0] ;
            Z12053DVPrdTnq = T01IU3_A12053DVPrdTnq[0] ;
            Z12054DVCCStKULi = T01IU3_A12054DVCCStKULi[0] ;
            Z12055DVPrdUMeFo = T01IU3_A12055DVPrdUMeFo[0] ;
            Z12056DVPrdNom2 = T01IU3_A12056DVPrdNom2[0] ;
            Z12057DVPrdNum2 = T01IU3_A12057DVPrdNum2[0] ;
            Z12059DVPrdPreA2 = T01IU3_A12059DVPrdPreA2[0] ;
            Z12060DVPrdDensS = T01IU3_A12060DVPrdDensS[0] ;
            Z12061DVPrdConcS = T01IU3_A12061DVPrdConcS[0] ;
            Z12062DVPrdSalM = T01IU3_A12062DVPrdSalM[0] ;
            Z12063DVPrdSolub = T01IU3_A12063DVPrdSolub[0] ;
            Z12064DVPrdNumCe = T01IU3_A12064DVPrdNumCe[0] ;
            Z12065DVTipPrdCo = T01IU3_A12065DVTipPrdCo[0] ;
            Z12066DVPrdNumct = T01IU3_A12066DVPrdNumct[0] ;
            Z12067DVPrdNumc2 = T01IU3_A12067DVPrdNumc2[0] ;
            Z12068DVPrdHorMa = T01IU3_A12068DVPrdHorMa[0] ;
            Z12069DVPrdPreRe = T01IU3_A12069DVPrdPreRe[0] ;
            Z12070DVMat_Lts = T01IU3_A12070DVMat_Lts[0] ;
            Z12071DVPrdExiAc = T01IU3_A12071DVPrdExiAc[0] ;
            Z12072DVAlmc_Ult = T01IU3_A12072DVAlmc_Ult[0] ;
            Z12073DVPrdAltAc = T01IU3_A12073DVPrdAltAc[0] ;
            Z12074DVPrdPesCo = T01IU3_A12074DVPrdPesCo[0] ;
            Z12075DVPrdPesTe = T01IU3_A12075DVPrdPesTe[0] ;
            Z12076DVCC_Ultln = T01IU3_A12076DVCC_Ultln[0] ;
            Z12077DVPrdSal = T01IU3_A12077DVPrdSal[0] ;
            Z12078DVSubFamCo = T01IU3_A12078DVSubFamCo[0] ;
            Z12079DVPrdInc = T01IU3_A12079DVPrdInc[0] ;
            Z12080DVPrdComp = T01IU3_A12080DVPrdComp[0] ;
            Z12081DVPrdAox = T01IU3_A12081DVPrdAox[0] ;
            Z12082DVPrdNCAS = T01IU3_A12082DVPrdNCAS[0] ;
            Z12083DVPrdFT = T01IU3_A12083DVPrdFT[0] ;
            Z12084DVPrdFFT = T01IU3_A12084DVPrdFFT[0] ;
            Z12085DVPrdHS = T01IU3_A12085DVPrdHS[0] ;
            Z12086DVPrdFHS = T01IU3_A12086DVPrdFHS[0] ;
            Z12087DVPrdReach = T01IU3_A12087DVPrdReach[0] ;
            Z12088DVPrdOkote = T01IU3_A12088DVPrdOkote[0] ;
            Z12089DVPrdColId = T01IU3_A12089DVPrdColId[0] ;
            Z12090DVPrdLote = T01IU3_A12090DVPrdLote[0] ;
            Z12091DVPrdRTM = T01IU3_A12091DVPrdRTM[0] ;
            Z12092DVPrdCtw1 = T01IU3_A12092DVPrdCtw1[0] ;
            Z12093DVPrdCtw2 = T01IU3_A12093DVPrdCtw2[0] ;
            Z12094DVPrdCtw3 = T01IU3_A12094DVPrdCtw3[0] ;
            Z12095DVPrdNroCA = T01IU3_A12095DVPrdNroCA[0] ;
            Z12096DVPrdGots = T01IU3_A12096DVPrdGots[0] ;
            Z12097DVPrdHm = T01IU3_A12097DVPrdHm[0] ;
            Z12098DVPrdConct = T01IU3_A12098DVPrdConct[0] ;
            Z12099DVPrdEINEC = T01IU3_A12099DVPrdEINEC[0] ;
            Z12100DVPrdFunci = T01IU3_A12100DVPrdFunci[0] ;
            Z12101DVPrdNmQu = T01IU3_A12101DVPrdNmQu[0] ;
            Z12102DVPrdEqLP = T01IU3_A12102DVPrdEqLP[0] ;
            Z12103DVPrdConc = T01IU3_A12103DVPrdConc[0] ;
            Z12104DVPrdCtw4 = T01IU3_A12104DVPrdCtw4[0] ;
            Z12105DVPrdList = T01IU3_A12105DVPrdList[0] ;
         }
         else
         {
            Z12003DVPrdNom = A12003DVPrdNom ;
            Z12004DVPrvNum = A12004DVPrvNum ;
            Z12005DVPrdExiAl = A12005DVPrdExiAl ;
            Z12006DVPrdPreAc = A12006DVPrdPreAc ;
            Z12007DVUltLinEn = A12007DVUltLinEn ;
            Z12008DVPrdDetPa = A12008DVPrdDetPa ;
            Z12009DVValCod = A12009DVValCod ;
            Z12010DVPrdFulEn = A12010DVPrdFulEn ;
            Z12011DVPrdCanPe = A12011DVPrdCanPe ;
            Z12012DVPrdRotRe = A12012DVPrdRotRe ;
            Z12013DVPrdPreMe = A12013DVPrdPreMe ;
            Z12014DVPrdRec = A12014DVPrdRec ;
            Z12015DVPrdPreAn = A12015DVPrdPreAn ;
            Z12016DVPrdFecPr = A12016DVPrdFecPr ;
            Z12017DVMovEspUL = A12017DVMovEspUL ;
            Z12018DVPrdExiCC = A12018DVPrdExiCC ;
            Z12019DVPrdUltDC = A12019DVPrdUltDC ;
            Z12020DVPrdUltEC = A12020DVPrdUltEC ;
            Z12021DVPrdUltCC = A12021DVPrdUltCC ;
            Z12022DVPrdExiCP = A12022DVPrdExiCP ;
            Z12023DVPrdDifCC = A12023DVPrdDifCC ;
            Z12024DVPrdFacCo = A12024DVPrdFacCo ;
            Z12025DVPrdConDi = A12025DVPrdConDi ;
            Z12026DVPrdStkMi = A12026DVPrdStkMi ;
            Z12027DVPrdStkMD = A12027DVPrdStkMD ;
            Z12028DVPrdDiaRo = A12028DVPrdDiaRo ;
            Z12029DVPrdPlaEn = A12029DVPrdPlaEn ;
            Z12030DVMetCod = A12030DVMetCod ;
            Z12031DVPrdLotMi = A12031DVPrdLotMi ;
            Z12032DVPrdNumUc = A12032DVPrdNumUc ;
            Z12033DVPrdCanRe = A12033DVPrdCanRe ;
            Z12034DVPrdFulPe = A12034DVPrdFulPe ;
            Z12035DVPrdFulCC = A12035DVPrdFulCC ;
            Z12036DVPrdConCC = A12036DVPrdConCC ;
            Z12037DVPrdDscTe = A12037DVPrdDscTe ;
            Z12038DVPrdUniCo = A12038DVPrdUniCo ;
            Z12039DVPrdUniCn = A12039DVPrdUniCn ;
            Z12040DVPrdRefPr = A12040DVPrdRefPr ;
            Z12041DVPrdSus = A12041DVPrdSus ;
            Z12042DVPrdCalNe = A12042DVPrdCalNe ;
            Z12043DVPrdSit = A12043DVPrdSit ;
            Z12044DVTipDtoCo = A12044DVTipDtoCo ;
            Z12045DVPrdValSt = A12045DVPrdValSt ;
            Z12046DVDifValSt = A12046DVDifValSt ;
            Z12047DVPrdFecEn = A12047DVPrdFecEn ;
            Z12048DVPrdPosX = A12048DVPrdPosX ;
            Z12049DVPrdPosY = A12049DVPrdPosY ;
            Z12050DVPrdTip = A12050DVPrdTip ;
            Z12051DVPrdDqo = A12051DVPrdDqo ;
            Z12052DVPrdRev = A12052DVPrdRev ;
            Z12053DVPrdTnq = A12053DVPrdTnq ;
            Z12054DVCCStKULi = A12054DVCCStKULi ;
            Z12055DVPrdUMeFo = A12055DVPrdUMeFo ;
            Z12056DVPrdNom2 = A12056DVPrdNom2 ;
            Z12057DVPrdNum2 = A12057DVPrdNum2 ;
            Z12059DVPrdPreA2 = A12059DVPrdPreA2 ;
            Z12060DVPrdDensS = A12060DVPrdDensS ;
            Z12061DVPrdConcS = A12061DVPrdConcS ;
            Z12062DVPrdSalM = A12062DVPrdSalM ;
            Z12063DVPrdSolub = A12063DVPrdSolub ;
            Z12064DVPrdNumCe = A12064DVPrdNumCe ;
            Z12065DVTipPrdCo = A12065DVTipPrdCo ;
            Z12066DVPrdNumct = A12066DVPrdNumct ;
            Z12067DVPrdNumc2 = A12067DVPrdNumc2 ;
            Z12068DVPrdHorMa = A12068DVPrdHorMa ;
            Z12069DVPrdPreRe = A12069DVPrdPreRe ;
            Z12070DVMat_Lts = A12070DVMat_Lts ;
            Z12071DVPrdExiAc = A12071DVPrdExiAc ;
            Z12072DVAlmc_Ult = A12072DVAlmc_Ult ;
            Z12073DVPrdAltAc = A12073DVPrdAltAc ;
            Z12074DVPrdPesCo = A12074DVPrdPesCo ;
            Z12075DVPrdPesTe = A12075DVPrdPesTe ;
            Z12076DVCC_Ultln = A12076DVCC_Ultln ;
            Z12077DVPrdSal = A12077DVPrdSal ;
            Z12078DVSubFamCo = A12078DVSubFamCo ;
            Z12079DVPrdInc = A12079DVPrdInc ;
            Z12080DVPrdComp = A12080DVPrdComp ;
            Z12081DVPrdAox = A12081DVPrdAox ;
            Z12082DVPrdNCAS = A12082DVPrdNCAS ;
            Z12083DVPrdFT = A12083DVPrdFT ;
            Z12084DVPrdFFT = A12084DVPrdFFT ;
            Z12085DVPrdHS = A12085DVPrdHS ;
            Z12086DVPrdFHS = A12086DVPrdFHS ;
            Z12087DVPrdReach = A12087DVPrdReach ;
            Z12088DVPrdOkote = A12088DVPrdOkote ;
            Z12089DVPrdColId = A12089DVPrdColId ;
            Z12090DVPrdLote = A12090DVPrdLote ;
            Z12091DVPrdRTM = A12091DVPrdRTM ;
            Z12092DVPrdCtw1 = A12092DVPrdCtw1 ;
            Z12093DVPrdCtw2 = A12093DVPrdCtw2 ;
            Z12094DVPrdCtw3 = A12094DVPrdCtw3 ;
            Z12095DVPrdNroCA = A12095DVPrdNroCA ;
            Z12096DVPrdGots = A12096DVPrdGots ;
            Z12097DVPrdHm = A12097DVPrdHm ;
            Z12098DVPrdConct = A12098DVPrdConct ;
            Z12099DVPrdEINEC = A12099DVPrdEINEC ;
            Z12100DVPrdFunci = A12100DVPrdFunci ;
            Z12101DVPrdNmQu = A12101DVPrdNmQu ;
            Z12102DVPrdEqLP = A12102DVPrdEqLP ;
            Z12103DVPrdConc = A12103DVPrdConc ;
            Z12104DVPrdCtw4 = A12104DVPrdCtw4 ;
            Z12105DVPrdList = A12105DVPrdList ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12102DVPrdEqLP = A12102DVPrdEqLP ;
         Z12103DVPrdConc = A12103DVPrdConc ;
         Z12104DVPrdCtw4 = A12104DVPrdCtw4 ;
         Z12105DVPrdList = A12105DVPrdList ;
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z12003DVPrdNom = A12003DVPrdNom ;
         Z12004DVPrvNum = A12004DVPrvNum ;
         Z12005DVPrdExiAl = A12005DVPrdExiAl ;
         Z12006DVPrdPreAc = A12006DVPrdPreAc ;
         Z12007DVUltLinEn = A12007DVUltLinEn ;
         Z12008DVPrdDetPa = A12008DVPrdDetPa ;
         Z12009DVValCod = A12009DVValCod ;
         Z12010DVPrdFulEn = A12010DVPrdFulEn ;
         Z12011DVPrdCanPe = A12011DVPrdCanPe ;
         Z12012DVPrdRotRe = A12012DVPrdRotRe ;
         Z12013DVPrdPreMe = A12013DVPrdPreMe ;
         Z12014DVPrdRec = A12014DVPrdRec ;
         Z12015DVPrdPreAn = A12015DVPrdPreAn ;
         Z12016DVPrdFecPr = A12016DVPrdFecPr ;
         Z12017DVMovEspUL = A12017DVMovEspUL ;
         Z12018DVPrdExiCC = A12018DVPrdExiCC ;
         Z12019DVPrdUltDC = A12019DVPrdUltDC ;
         Z12020DVPrdUltEC = A12020DVPrdUltEC ;
         Z12021DVPrdUltCC = A12021DVPrdUltCC ;
         Z12022DVPrdExiCP = A12022DVPrdExiCP ;
         Z12023DVPrdDifCC = A12023DVPrdDifCC ;
         Z12024DVPrdFacCo = A12024DVPrdFacCo ;
         Z12025DVPrdConDi = A12025DVPrdConDi ;
         Z12026DVPrdStkMi = A12026DVPrdStkMi ;
         Z12027DVPrdStkMD = A12027DVPrdStkMD ;
         Z12028DVPrdDiaRo = A12028DVPrdDiaRo ;
         Z12029DVPrdPlaEn = A12029DVPrdPlaEn ;
         Z12030DVMetCod = A12030DVMetCod ;
         Z12031DVPrdLotMi = A12031DVPrdLotMi ;
         Z12032DVPrdNumUc = A12032DVPrdNumUc ;
         Z12033DVPrdCanRe = A12033DVPrdCanRe ;
         Z12034DVPrdFulPe = A12034DVPrdFulPe ;
         Z12035DVPrdFulCC = A12035DVPrdFulCC ;
         Z12036DVPrdConCC = A12036DVPrdConCC ;
         Z12037DVPrdDscTe = A12037DVPrdDscTe ;
         Z12038DVPrdUniCo = A12038DVPrdUniCo ;
         Z12039DVPrdUniCn = A12039DVPrdUniCn ;
         Z12040DVPrdRefPr = A12040DVPrdRefPr ;
         Z12041DVPrdSus = A12041DVPrdSus ;
         Z12042DVPrdCalNe = A12042DVPrdCalNe ;
         Z12043DVPrdSit = A12043DVPrdSit ;
         Z12044DVTipDtoCo = A12044DVTipDtoCo ;
         Z12045DVPrdValSt = A12045DVPrdValSt ;
         Z12046DVDifValSt = A12046DVDifValSt ;
         Z12047DVPrdFecEn = A12047DVPrdFecEn ;
         Z12048DVPrdPosX = A12048DVPrdPosX ;
         Z12049DVPrdPosY = A12049DVPrdPosY ;
         Z12050DVPrdTip = A12050DVPrdTip ;
         Z12051DVPrdDqo = A12051DVPrdDqo ;
         Z12052DVPrdRev = A12052DVPrdRev ;
         Z12053DVPrdTnq = A12053DVPrdTnq ;
         Z12054DVCCStKULi = A12054DVCCStKULi ;
         Z12055DVPrdUMeFo = A12055DVPrdUMeFo ;
         Z12056DVPrdNom2 = A12056DVPrdNom2 ;
         Z12057DVPrdNum2 = A12057DVPrdNum2 ;
         Z12058DVPrdObs = A12058DVPrdObs ;
         Z12059DVPrdPreA2 = A12059DVPrdPreA2 ;
         Z12060DVPrdDensS = A12060DVPrdDensS ;
         Z12061DVPrdConcS = A12061DVPrdConcS ;
         Z12062DVPrdSalM = A12062DVPrdSalM ;
         Z12063DVPrdSolub = A12063DVPrdSolub ;
         Z12064DVPrdNumCe = A12064DVPrdNumCe ;
         Z12065DVTipPrdCo = A12065DVTipPrdCo ;
         Z12066DVPrdNumct = A12066DVPrdNumct ;
         Z12067DVPrdNumc2 = A12067DVPrdNumc2 ;
         Z12068DVPrdHorMa = A12068DVPrdHorMa ;
         Z12069DVPrdPreRe = A12069DVPrdPreRe ;
         Z12070DVMat_Lts = A12070DVMat_Lts ;
         Z12071DVPrdExiAc = A12071DVPrdExiAc ;
         Z12072DVAlmc_Ult = A12072DVAlmc_Ult ;
         Z12073DVPrdAltAc = A12073DVPrdAltAc ;
         Z12074DVPrdPesCo = A12074DVPrdPesCo ;
         Z12075DVPrdPesTe = A12075DVPrdPesTe ;
         Z12076DVCC_Ultln = A12076DVCC_Ultln ;
         Z12077DVPrdSal = A12077DVPrdSal ;
         Z12078DVSubFamCo = A12078DVSubFamCo ;
         Z12079DVPrdInc = A12079DVPrdInc ;
         Z12080DVPrdComp = A12080DVPrdComp ;
         Z12081DVPrdAox = A12081DVPrdAox ;
         Z12082DVPrdNCAS = A12082DVPrdNCAS ;
         Z12083DVPrdFT = A12083DVPrdFT ;
         Z12084DVPrdFFT = A12084DVPrdFFT ;
         Z12085DVPrdHS = A12085DVPrdHS ;
         Z12086DVPrdFHS = A12086DVPrdFHS ;
         Z12087DVPrdReach = A12087DVPrdReach ;
         Z12088DVPrdOkote = A12088DVPrdOkote ;
         Z12089DVPrdColId = A12089DVPrdColId ;
         Z12090DVPrdLote = A12090DVPrdLote ;
         Z12091DVPrdRTM = A12091DVPrdRTM ;
         Z12092DVPrdCtw1 = A12092DVPrdCtw1 ;
         Z12093DVPrdCtw2 = A12093DVPrdCtw2 ;
         Z12094DVPrdCtw3 = A12094DVPrdCtw3 ;
         Z12095DVPrdNroCA = A12095DVPrdNroCA ;
         Z12096DVPrdGots = A12096DVPrdGots ;
         Z12097DVPrdHm = A12097DVPrdHm ;
         Z12098DVPrdConct = A12098DVPrdConct ;
         Z12099DVPrdEINEC = A12099DVPrdEINEC ;
         Z12100DVPrdFunci = A12100DVPrdFunci ;
         Z12101DVPrdNmQu = A12101DVPrdNmQu ;
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

   public void load1IU1678( )
   {
      /* Using cursor T01IU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1678 = (short)(1) ;
         A12058DVPrdObs = T01IU5_A12058DVPrdObs[0] ;
         n12058DVPrdObs = T01IU5_n12058DVPrdObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12058DVPrdObs", A12058DVPrdObs);
         A12102DVPrdEqLP = T01IU5_A12102DVPrdEqLP[0] ;
         n12102DVPrdEqLP = T01IU5_n12102DVPrdEqLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12102DVPrdEqLP", A12102DVPrdEqLP);
         A12103DVPrdConc = T01IU5_A12103DVPrdConc[0] ;
         n12103DVPrdConc = T01IU5_n12103DVPrdConc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrimstr( A12103DVPrdConc, 6, 2));
         A12104DVPrdCtw4 = T01IU5_A12104DVPrdCtw4[0] ;
         n12104DVPrdCtw4 = T01IU5_n12104DVPrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12104DVPrdCtw4", A12104DVPrdCtw4);
         A12105DVPrdList = T01IU5_A12105DVPrdList[0] ;
         n12105DVPrdList = T01IU5_n12105DVPrdList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12105DVPrdList", A12105DVPrdList);
         A12003DVPrdNom = T01IU5_A12003DVPrdNom[0] ;
         n12003DVPrdNom = T01IU5_n12003DVPrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12003DVPrdNom", A12003DVPrdNom);
         A12004DVPrvNum = T01IU5_A12004DVPrvNum[0] ;
         n12004DVPrvNum = T01IU5_n12004DVPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12004DVPrvNum), 6, 0));
         A12005DVPrdExiAl = T01IU5_A12005DVPrdExiAl[0] ;
         n12005DVPrdExiAl = T01IU5_n12005DVPrdExiAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrimstr( A12005DVPrdExiAl, 12, 4));
         A12006DVPrdPreAc = T01IU5_A12006DVPrdPreAc[0] ;
         n12006DVPrdPreAc = T01IU5_n12006DVPrdPreAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrimstr( A12006DVPrdPreAc, 14, 5));
         A12007DVUltLinEn = T01IU5_A12007DVUltLinEn[0] ;
         n12007DVUltLinEn = T01IU5_n12007DVUltLinEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12007DVUltLinEn), 4, 0));
         A12008DVPrdDetPa = T01IU5_A12008DVPrdDetPa[0] ;
         n12008DVPrdDetPa = T01IU5_n12008DVPrdDetPa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12008DVPrdDetPa", A12008DVPrdDetPa);
         A12009DVValCod = T01IU5_A12009DVValCod[0] ;
         n12009DVValCod = T01IU5_n12009DVValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.str( A12009DVValCod, 1, 0));
         A12010DVPrdFulEn = T01IU5_A12010DVPrdFulEn[0] ;
         n12010DVPrdFulEn = T01IU5_n12010DVPrdFulEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
         A12011DVPrdCanPe = T01IU5_A12011DVPrdCanPe[0] ;
         n12011DVPrdCanPe = T01IU5_n12011DVPrdCanPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrimstr( A12011DVPrdCanPe, 12, 4));
         A12012DVPrdRotRe = T01IU5_A12012DVPrdRotRe[0] ;
         n12012DVPrdRotRe = T01IU5_n12012DVPrdRotRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrimstr( A12012DVPrdRotRe, 12, 5));
         A12013DVPrdPreMe = T01IU5_A12013DVPrdPreMe[0] ;
         n12013DVPrdPreMe = T01IU5_n12013DVPrdPreMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrimstr( A12013DVPrdPreMe, 14, 5));
         A12014DVPrdRec = T01IU5_A12014DVPrdRec[0] ;
         n12014DVPrdRec = T01IU5_n12014DVPrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12014DVPrdRec", A12014DVPrdRec);
         A12015DVPrdPreAn = T01IU5_A12015DVPrdPreAn[0] ;
         n12015DVPrdPreAn = T01IU5_n12015DVPrdPreAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrimstr( A12015DVPrdPreAn, 14, 5));
         A12016DVPrdFecPr = T01IU5_A12016DVPrdFecPr[0] ;
         n12016DVPrdFecPr = T01IU5_n12016DVPrdFecPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
         A12017DVMovEspUL = T01IU5_A12017DVMovEspUL[0] ;
         n12017DVMovEspUL = T01IU5_n12017DVMovEspUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12017DVMovEspUL), 3, 0));
         A12018DVPrdExiCC = T01IU5_A12018DVPrdExiCC[0] ;
         n12018DVPrdExiCC = T01IU5_n12018DVPrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrimstr( A12018DVPrdExiCC, 12, 4));
         A12019DVPrdUltDC = T01IU5_A12019DVPrdUltDC[0] ;
         n12019DVPrdUltDC = T01IU5_n12019DVPrdUltDC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrimstr( A12019DVPrdUltDC, 8, 2));
         A12020DVPrdUltEC = T01IU5_A12020DVPrdUltEC[0] ;
         n12020DVPrdUltEC = T01IU5_n12020DVPrdUltEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrimstr( A12020DVPrdUltEC, 8, 2));
         A12021DVPrdUltCC = T01IU5_A12021DVPrdUltCC[0] ;
         n12021DVPrdUltCC = T01IU5_n12021DVPrdUltCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12021DVPrdUltCC), 4, 0));
         A12022DVPrdExiCP = T01IU5_A12022DVPrdExiCP[0] ;
         n12022DVPrdExiCP = T01IU5_n12022DVPrdExiCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrimstr( A12022DVPrdExiCP, 8, 2));
         A12023DVPrdDifCC = T01IU5_A12023DVPrdDifCC[0] ;
         n12023DVPrdDifCC = T01IU5_n12023DVPrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrimstr( A12023DVPrdDifCC, 8, 2));
         A12024DVPrdFacCo = T01IU5_A12024DVPrdFacCo[0] ;
         n12024DVPrdFacCo = T01IU5_n12024DVPrdFacCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrimstr( A12024DVPrdFacCo, 7, 4));
         A12025DVPrdConDi = T01IU5_A12025DVPrdConDi[0] ;
         n12025DVPrdConDi = T01IU5_n12025DVPrdConDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrimstr( A12025DVPrdConDi, 7, 2));
         A12026DVPrdStkMi = T01IU5_A12026DVPrdStkMi[0] ;
         n12026DVPrdStkMi = T01IU5_n12026DVPrdStkMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrimstr( A12026DVPrdStkMi, 8, 2));
         A12027DVPrdStkMD = T01IU5_A12027DVPrdStkMD[0] ;
         n12027DVPrdStkMD = T01IU5_n12027DVPrdStkMD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12027DVPrdStkMD), 4, 0));
         A12028DVPrdDiaRo = T01IU5_A12028DVPrdDiaRo[0] ;
         n12028DVPrdDiaRo = T01IU5_n12028DVPrdDiaRo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), 3, 0));
         A12029DVPrdPlaEn = T01IU5_A12029DVPrdPlaEn[0] ;
         n12029DVPrdPlaEn = T01IU5_n12029DVPrdPlaEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), 3, 0));
         A12030DVMetCod = T01IU5_A12030DVMetCod[0] ;
         n12030DVMetCod = T01IU5_n12030DVMetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.str( A12030DVMetCod, 1, 0));
         A12031DVPrdLotMi = T01IU5_A12031DVPrdLotMi[0] ;
         n12031DVPrdLotMi = T01IU5_n12031DVPrdLotMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12031DVPrdLotMi), 4, 0));
         A12032DVPrdNumUc = T01IU5_A12032DVPrdNumUc[0] ;
         n12032DVPrdNumUc = T01IU5_n12032DVPrdNumUc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrimstr( A12032DVPrdNumUc, 7, 2));
         A12033DVPrdCanRe = T01IU5_A12033DVPrdCanRe[0] ;
         n12033DVPrdCanRe = T01IU5_n12033DVPrdCanRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrimstr( A12033DVPrdCanRe, 12, 4));
         A12034DVPrdFulPe = T01IU5_A12034DVPrdFulPe[0] ;
         n12034DVPrdFulPe = T01IU5_n12034DVPrdFulPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
         A12035DVPrdFulCC = T01IU5_A12035DVPrdFulCC[0] ;
         n12035DVPrdFulCC = T01IU5_n12035DVPrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
         A12036DVPrdConCC = T01IU5_A12036DVPrdConCC[0] ;
         n12036DVPrdConCC = T01IU5_n12036DVPrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12036DVPrdConCC), 4, 0));
         A12037DVPrdDscTe = T01IU5_A12037DVPrdDscTe[0] ;
         n12037DVPrdDscTe = T01IU5_n12037DVPrdDscTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12037DVPrdDscTe", A12037DVPrdDscTe);
         A12038DVPrdUniCo = T01IU5_A12038DVPrdUniCo[0] ;
         n12038DVPrdUniCo = T01IU5_n12038DVPrdUniCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.str( A12038DVPrdUniCo, 1, 0));
         A12039DVPrdUniCn = T01IU5_A12039DVPrdUniCn[0] ;
         n12039DVPrdUniCn = T01IU5_n12039DVPrdUniCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.str( A12039DVPrdUniCn, 1, 0));
         A12040DVPrdRefPr = T01IU5_A12040DVPrdRefPr[0] ;
         n12040DVPrdRefPr = T01IU5_n12040DVPrdRefPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12040DVPrdRefPr", A12040DVPrdRefPr);
         A12041DVPrdSus = T01IU5_A12041DVPrdSus[0] ;
         n12041DVPrdSus = T01IU5_n12041DVPrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12041DVPrdSus", A12041DVPrdSus);
         A12042DVPrdCalNe = T01IU5_A12042DVPrdCalNe[0] ;
         n12042DVPrdCalNe = T01IU5_n12042DVPrdCalNe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12042DVPrdCalNe", A12042DVPrdCalNe);
         A12043DVPrdSit = T01IU5_A12043DVPrdSit[0] ;
         n12043DVPrdSit = T01IU5_n12043DVPrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.str( A12043DVPrdSit, 1, 0));
         A12044DVTipDtoCo = T01IU5_A12044DVTipDtoCo[0] ;
         n12044DVTipDtoCo = T01IU5_n12044DVTipDtoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12044DVTipDtoCo), 2, 0));
         A12045DVPrdValSt = T01IU5_A12045DVPrdValSt[0] ;
         n12045DVPrdValSt = T01IU5_n12045DVPrdValSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrimstr( A12045DVPrdValSt, 11, 2));
         A12046DVDifValSt = T01IU5_A12046DVDifValSt[0] ;
         n12046DVDifValSt = T01IU5_n12046DVDifValSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrimstr( A12046DVDifValSt, 11, 2));
         A12047DVPrdFecEn = T01IU5_A12047DVPrdFecEn[0] ;
         n12047DVPrdFecEn = T01IU5_n12047DVPrdFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
         A12048DVPrdPosX = T01IU5_A12048DVPrdPosX[0] ;
         n12048DVPrdPosX = T01IU5_n12048DVPrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12048DVPrdPosX), 4, 0));
         A12049DVPrdPosY = T01IU5_A12049DVPrdPosY[0] ;
         n12049DVPrdPosY = T01IU5_n12049DVPrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12049DVPrdPosY), 4, 0));
         A12050DVPrdTip = T01IU5_A12050DVPrdTip[0] ;
         n12050DVPrdTip = T01IU5_n12050DVPrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12050DVPrdTip", A12050DVPrdTip);
         A12051DVPrdDqo = T01IU5_A12051DVPrdDqo[0] ;
         n12051DVPrdDqo = T01IU5_n12051DVPrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12051DVPrdDqo), 4, 0));
         A12052DVPrdRev = T01IU5_A12052DVPrdRev[0] ;
         n12052DVPrdRev = T01IU5_n12052DVPrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12052DVPrdRev", A12052DVPrdRev);
         A12053DVPrdTnq = T01IU5_A12053DVPrdTnq[0] ;
         n12053DVPrdTnq = T01IU5_n12053DVPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12053DVPrdTnq), 2, 0));
         A12054DVCCStKULi = T01IU5_A12054DVCCStKULi[0] ;
         n12054DVCCStKULi = T01IU5_n12054DVCCStKULi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12054DVCCStKULi), 12, 0));
         A12055DVPrdUMeFo = T01IU5_A12055DVPrdUMeFo[0] ;
         n12055DVPrdUMeFo = T01IU5_n12055DVPrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.str( A12055DVPrdUMeFo, 1, 0));
         A12056DVPrdNom2 = T01IU5_A12056DVPrdNom2[0] ;
         n12056DVPrdNom2 = T01IU5_n12056DVPrdNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12056DVPrdNom2", A12056DVPrdNom2);
         A12057DVPrdNum2 = T01IU5_A12057DVPrdNum2[0] ;
         n12057DVPrdNum2 = T01IU5_n12057DVPrdNum2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12057DVPrdNum2", A12057DVPrdNum2);
         A12059DVPrdPreA2 = T01IU5_A12059DVPrdPreA2[0] ;
         n12059DVPrdPreA2 = T01IU5_n12059DVPrdPreA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrimstr( A12059DVPrdPreA2, 14, 5));
         A12060DVPrdDensS = T01IU5_A12060DVPrdDensS[0] ;
         n12060DVPrdDensS = T01IU5_n12060DVPrdDensS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrimstr( A12060DVPrdDensS, 7, 3));
         A12061DVPrdConcS = T01IU5_A12061DVPrdConcS[0] ;
         n12061DVPrdConcS = T01IU5_n12061DVPrdConcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrimstr( A12061DVPrdConcS, 7, 3));
         A12062DVPrdSalM = T01IU5_A12062DVPrdSalM[0] ;
         n12062DVPrdSalM = T01IU5_n12062DVPrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12062DVPrdSalM", A12062DVPrdSalM);
         A12063DVPrdSolub = T01IU5_A12063DVPrdSolub[0] ;
         n12063DVPrdSolub = T01IU5_n12063DVPrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrimstr( A12063DVPrdSolub, 7, 2));
         A12064DVPrdNumCe = T01IU5_A12064DVPrdNumCe[0] ;
         n12064DVPrdNumCe = T01IU5_n12064DVPrdNumCe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12064DVPrdNumCe", A12064DVPrdNumCe);
         A12065DVTipPrdCo = T01IU5_A12065DVTipPrdCo[0] ;
         n12065DVTipPrdCo = T01IU5_n12065DVTipPrdCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12065DVTipPrdCo), 4, 0));
         A12066DVPrdNumct = T01IU5_A12066DVPrdNumct[0] ;
         n12066DVPrdNumct = T01IU5_n12066DVPrdNumct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrimstr( A12066DVPrdNumct, 6, 2));
         A12067DVPrdNumc2 = T01IU5_A12067DVPrdNumc2[0] ;
         n12067DVPrdNumc2 = T01IU5_n12067DVPrdNumc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrimstr( A12067DVPrdNumc2, 6, 2));
         A12068DVPrdHorMa = T01IU5_A12068DVPrdHorMa[0] ;
         n12068DVPrdHorMa = T01IU5_n12068DVPrdHorMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12068DVPrdHorMa), 2, 0));
         A12069DVPrdPreRe = T01IU5_A12069DVPrdPreRe[0] ;
         n12069DVPrdPreRe = T01IU5_n12069DVPrdPreRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrimstr( A12069DVPrdPreRe, 14, 5));
         A12070DVMat_Lts = T01IU5_A12070DVMat_Lts[0] ;
         n12070DVMat_Lts = T01IU5_n12070DVMat_Lts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrimstr( A12070DVMat_Lts, 9, 2));
         A12071DVPrdExiAc = T01IU5_A12071DVPrdExiAc[0] ;
         n12071DVPrdExiAc = T01IU5_n12071DVPrdExiAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrimstr( A12071DVPrdExiAc, 12, 4));
         A12072DVAlmc_Ult = T01IU5_A12072DVAlmc_Ult[0] ;
         n12072DVAlmc_Ult = T01IU5_n12072DVAlmc_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), 6, 0));
         A12073DVPrdAltAc = T01IU5_A12073DVPrdAltAc[0] ;
         n12073DVPrdAltAc = T01IU5_n12073DVPrdAltAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.str( A12073DVPrdAltAc, 1, 0));
         A12074DVPrdPesCo = T01IU5_A12074DVPrdPesCo[0] ;
         n12074DVPrdPesCo = T01IU5_n12074DVPrdPesCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.str( A12074DVPrdPesCo, 1, 0));
         A12075DVPrdPesTe = T01IU5_A12075DVPrdPesTe[0] ;
         n12075DVPrdPesTe = T01IU5_n12075DVPrdPesTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12075DVPrdPesTe", A12075DVPrdPesTe);
         A12076DVCC_Ultln = T01IU5_A12076DVCC_Ultln[0] ;
         n12076DVCC_Ultln = T01IU5_n12076DVCC_Ultln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12076DVCC_Ultln), 12, 0));
         A12077DVPrdSal = T01IU5_A12077DVPrdSal[0] ;
         n12077DVPrdSal = T01IU5_n12077DVPrdSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12077DVPrdSal", A12077DVPrdSal);
         A12078DVSubFamCo = T01IU5_A12078DVSubFamCo[0] ;
         n12078DVSubFamCo = T01IU5_n12078DVSubFamCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12078DVSubFamCo), 2, 0));
         A12079DVPrdInc = T01IU5_A12079DVPrdInc[0] ;
         n12079DVPrdInc = T01IU5_n12079DVPrdInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12079DVPrdInc", A12079DVPrdInc);
         A12080DVPrdComp = T01IU5_A12080DVPrdComp[0] ;
         n12080DVPrdComp = T01IU5_n12080DVPrdComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12080DVPrdComp", A12080DVPrdComp);
         A12081DVPrdAox = T01IU5_A12081DVPrdAox[0] ;
         n12081DVPrdAox = T01IU5_n12081DVPrdAox[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrimstr( A12081DVPrdAox, 6, 2));
         A12082DVPrdNCAS = T01IU5_A12082DVPrdNCAS[0] ;
         n12082DVPrdNCAS = T01IU5_n12082DVPrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12082DVPrdNCAS", A12082DVPrdNCAS);
         A12083DVPrdFT = T01IU5_A12083DVPrdFT[0] ;
         n12083DVPrdFT = T01IU5_n12083DVPrdFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12083DVPrdFT", A12083DVPrdFT);
         A12084DVPrdFFT = T01IU5_A12084DVPrdFFT[0] ;
         n12084DVPrdFFT = T01IU5_n12084DVPrdFFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
         A12085DVPrdHS = T01IU5_A12085DVPrdHS[0] ;
         n12085DVPrdHS = T01IU5_n12085DVPrdHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12085DVPrdHS", A12085DVPrdHS);
         A12086DVPrdFHS = T01IU5_A12086DVPrdFHS[0] ;
         n12086DVPrdFHS = T01IU5_n12086DVPrdFHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
         A12087DVPrdReach = T01IU5_A12087DVPrdReach[0] ;
         n12087DVPrdReach = T01IU5_n12087DVPrdReach[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12087DVPrdReach", A12087DVPrdReach);
         A12088DVPrdOkote = T01IU5_A12088DVPrdOkote[0] ;
         n12088DVPrdOkote = T01IU5_n12088DVPrdOkote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12088DVPrdOkote", A12088DVPrdOkote);
         A12089DVPrdColId = T01IU5_A12089DVPrdColId[0] ;
         n12089DVPrdColId = T01IU5_n12089DVPrdColId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12089DVPrdColId", A12089DVPrdColId);
         A12090DVPrdLote = T01IU5_A12090DVPrdLote[0] ;
         n12090DVPrdLote = T01IU5_n12090DVPrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12090DVPrdLote", A12090DVPrdLote);
         A12091DVPrdRTM = T01IU5_A12091DVPrdRTM[0] ;
         n12091DVPrdRTM = T01IU5_n12091DVPrdRTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12091DVPrdRTM", A12091DVPrdRTM);
         A12092DVPrdCtw1 = T01IU5_A12092DVPrdCtw1[0] ;
         n12092DVPrdCtw1 = T01IU5_n12092DVPrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12092DVPrdCtw1", A12092DVPrdCtw1);
         A12093DVPrdCtw2 = T01IU5_A12093DVPrdCtw2[0] ;
         n12093DVPrdCtw2 = T01IU5_n12093DVPrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12093DVPrdCtw2", A12093DVPrdCtw2);
         A12094DVPrdCtw3 = T01IU5_A12094DVPrdCtw3[0] ;
         n12094DVPrdCtw3 = T01IU5_n12094DVPrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12094DVPrdCtw3", A12094DVPrdCtw3);
         A12095DVPrdNroCA = T01IU5_A12095DVPrdNroCA[0] ;
         n12095DVPrdNroCA = T01IU5_n12095DVPrdNroCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12095DVPrdNroCA", A12095DVPrdNroCA);
         A12096DVPrdGots = T01IU5_A12096DVPrdGots[0] ;
         n12096DVPrdGots = T01IU5_n12096DVPrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12096DVPrdGots", A12096DVPrdGots);
         A12097DVPrdHm = T01IU5_A12097DVPrdHm[0] ;
         n12097DVPrdHm = T01IU5_n12097DVPrdHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12097DVPrdHm", A12097DVPrdHm);
         A12098DVPrdConct = T01IU5_A12098DVPrdConct[0] ;
         n12098DVPrdConct = T01IU5_n12098DVPrdConct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12098DVPrdConct), 3, 0));
         A12099DVPrdEINEC = T01IU5_A12099DVPrdEINEC[0] ;
         n12099DVPrdEINEC = T01IU5_n12099DVPrdEINEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12099DVPrdEINEC", A12099DVPrdEINEC);
         A12100DVPrdFunci = T01IU5_A12100DVPrdFunci[0] ;
         n12100DVPrdFunci = T01IU5_n12100DVPrdFunci[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12100DVPrdFunci", A12100DVPrdFunci);
         A12101DVPrdNmQu = T01IU5_A12101DVPrdNmQu[0] ;
         n12101DVPrdNmQu = T01IU5_n12101DVPrdNmQu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12101DVPrdNmQu", A12101DVPrdNmQu);
         zm1IU1678( -1) ;
      }
      pr_default.close(3);
      onLoadActions1IU1678( ) ;
   }

   public void onLoadActions1IU1678( )
   {
   }

   public void checkExtendedTable1IU1678( )
   {
      nIsDirty_1678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IU4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1IU1678( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01IU6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
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

   public void getKey1IU1678( )
   {
      /* Using cursor T01IU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1678 = (short)(1) ;
      }
      else
      {
         RcdFound1678 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IU1678( 1) ;
         RcdFound1678 = (short)(1) ;
         A12058DVPrdObs = T01IU3_A12058DVPrdObs[0] ;
         n12058DVPrdObs = T01IU3_n12058DVPrdObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12058DVPrdObs", A12058DVPrdObs);
         A12102DVPrdEqLP = T01IU3_A12102DVPrdEqLP[0] ;
         n12102DVPrdEqLP = T01IU3_n12102DVPrdEqLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12102DVPrdEqLP", A12102DVPrdEqLP);
         A12103DVPrdConc = T01IU3_A12103DVPrdConc[0] ;
         n12103DVPrdConc = T01IU3_n12103DVPrdConc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrimstr( A12103DVPrdConc, 6, 2));
         A12104DVPrdCtw4 = T01IU3_A12104DVPrdCtw4[0] ;
         n12104DVPrdCtw4 = T01IU3_n12104DVPrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12104DVPrdCtw4", A12104DVPrdCtw4);
         A12105DVPrdList = T01IU3_A12105DVPrdList[0] ;
         n12105DVPrdList = T01IU3_n12105DVPrdList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12105DVPrdList", A12105DVPrdList);
         A396EmprCod = T01IU3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IU3_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A12003DVPrdNom = T01IU3_A12003DVPrdNom[0] ;
         n12003DVPrdNom = T01IU3_n12003DVPrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12003DVPrdNom", A12003DVPrdNom);
         A12004DVPrvNum = T01IU3_A12004DVPrvNum[0] ;
         n12004DVPrvNum = T01IU3_n12004DVPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12004DVPrvNum), 6, 0));
         A12005DVPrdExiAl = T01IU3_A12005DVPrdExiAl[0] ;
         n12005DVPrdExiAl = T01IU3_n12005DVPrdExiAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrimstr( A12005DVPrdExiAl, 12, 4));
         A12006DVPrdPreAc = T01IU3_A12006DVPrdPreAc[0] ;
         n12006DVPrdPreAc = T01IU3_n12006DVPrdPreAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrimstr( A12006DVPrdPreAc, 14, 5));
         A12007DVUltLinEn = T01IU3_A12007DVUltLinEn[0] ;
         n12007DVUltLinEn = T01IU3_n12007DVUltLinEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12007DVUltLinEn), 4, 0));
         A12008DVPrdDetPa = T01IU3_A12008DVPrdDetPa[0] ;
         n12008DVPrdDetPa = T01IU3_n12008DVPrdDetPa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12008DVPrdDetPa", A12008DVPrdDetPa);
         A12009DVValCod = T01IU3_A12009DVValCod[0] ;
         n12009DVValCod = T01IU3_n12009DVValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.str( A12009DVValCod, 1, 0));
         A12010DVPrdFulEn = T01IU3_A12010DVPrdFulEn[0] ;
         n12010DVPrdFulEn = T01IU3_n12010DVPrdFulEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
         A12011DVPrdCanPe = T01IU3_A12011DVPrdCanPe[0] ;
         n12011DVPrdCanPe = T01IU3_n12011DVPrdCanPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrimstr( A12011DVPrdCanPe, 12, 4));
         A12012DVPrdRotRe = T01IU3_A12012DVPrdRotRe[0] ;
         n12012DVPrdRotRe = T01IU3_n12012DVPrdRotRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrimstr( A12012DVPrdRotRe, 12, 5));
         A12013DVPrdPreMe = T01IU3_A12013DVPrdPreMe[0] ;
         n12013DVPrdPreMe = T01IU3_n12013DVPrdPreMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrimstr( A12013DVPrdPreMe, 14, 5));
         A12014DVPrdRec = T01IU3_A12014DVPrdRec[0] ;
         n12014DVPrdRec = T01IU3_n12014DVPrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12014DVPrdRec", A12014DVPrdRec);
         A12015DVPrdPreAn = T01IU3_A12015DVPrdPreAn[0] ;
         n12015DVPrdPreAn = T01IU3_n12015DVPrdPreAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrimstr( A12015DVPrdPreAn, 14, 5));
         A12016DVPrdFecPr = T01IU3_A12016DVPrdFecPr[0] ;
         n12016DVPrdFecPr = T01IU3_n12016DVPrdFecPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
         A12017DVMovEspUL = T01IU3_A12017DVMovEspUL[0] ;
         n12017DVMovEspUL = T01IU3_n12017DVMovEspUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12017DVMovEspUL), 3, 0));
         A12018DVPrdExiCC = T01IU3_A12018DVPrdExiCC[0] ;
         n12018DVPrdExiCC = T01IU3_n12018DVPrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrimstr( A12018DVPrdExiCC, 12, 4));
         A12019DVPrdUltDC = T01IU3_A12019DVPrdUltDC[0] ;
         n12019DVPrdUltDC = T01IU3_n12019DVPrdUltDC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrimstr( A12019DVPrdUltDC, 8, 2));
         A12020DVPrdUltEC = T01IU3_A12020DVPrdUltEC[0] ;
         n12020DVPrdUltEC = T01IU3_n12020DVPrdUltEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrimstr( A12020DVPrdUltEC, 8, 2));
         A12021DVPrdUltCC = T01IU3_A12021DVPrdUltCC[0] ;
         n12021DVPrdUltCC = T01IU3_n12021DVPrdUltCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12021DVPrdUltCC), 4, 0));
         A12022DVPrdExiCP = T01IU3_A12022DVPrdExiCP[0] ;
         n12022DVPrdExiCP = T01IU3_n12022DVPrdExiCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrimstr( A12022DVPrdExiCP, 8, 2));
         A12023DVPrdDifCC = T01IU3_A12023DVPrdDifCC[0] ;
         n12023DVPrdDifCC = T01IU3_n12023DVPrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrimstr( A12023DVPrdDifCC, 8, 2));
         A12024DVPrdFacCo = T01IU3_A12024DVPrdFacCo[0] ;
         n12024DVPrdFacCo = T01IU3_n12024DVPrdFacCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrimstr( A12024DVPrdFacCo, 7, 4));
         A12025DVPrdConDi = T01IU3_A12025DVPrdConDi[0] ;
         n12025DVPrdConDi = T01IU3_n12025DVPrdConDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrimstr( A12025DVPrdConDi, 7, 2));
         A12026DVPrdStkMi = T01IU3_A12026DVPrdStkMi[0] ;
         n12026DVPrdStkMi = T01IU3_n12026DVPrdStkMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrimstr( A12026DVPrdStkMi, 8, 2));
         A12027DVPrdStkMD = T01IU3_A12027DVPrdStkMD[0] ;
         n12027DVPrdStkMD = T01IU3_n12027DVPrdStkMD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12027DVPrdStkMD), 4, 0));
         A12028DVPrdDiaRo = T01IU3_A12028DVPrdDiaRo[0] ;
         n12028DVPrdDiaRo = T01IU3_n12028DVPrdDiaRo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), 3, 0));
         A12029DVPrdPlaEn = T01IU3_A12029DVPrdPlaEn[0] ;
         n12029DVPrdPlaEn = T01IU3_n12029DVPrdPlaEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), 3, 0));
         A12030DVMetCod = T01IU3_A12030DVMetCod[0] ;
         n12030DVMetCod = T01IU3_n12030DVMetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.str( A12030DVMetCod, 1, 0));
         A12031DVPrdLotMi = T01IU3_A12031DVPrdLotMi[0] ;
         n12031DVPrdLotMi = T01IU3_n12031DVPrdLotMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12031DVPrdLotMi), 4, 0));
         A12032DVPrdNumUc = T01IU3_A12032DVPrdNumUc[0] ;
         n12032DVPrdNumUc = T01IU3_n12032DVPrdNumUc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrimstr( A12032DVPrdNumUc, 7, 2));
         A12033DVPrdCanRe = T01IU3_A12033DVPrdCanRe[0] ;
         n12033DVPrdCanRe = T01IU3_n12033DVPrdCanRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrimstr( A12033DVPrdCanRe, 12, 4));
         A12034DVPrdFulPe = T01IU3_A12034DVPrdFulPe[0] ;
         n12034DVPrdFulPe = T01IU3_n12034DVPrdFulPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
         A12035DVPrdFulCC = T01IU3_A12035DVPrdFulCC[0] ;
         n12035DVPrdFulCC = T01IU3_n12035DVPrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
         A12036DVPrdConCC = T01IU3_A12036DVPrdConCC[0] ;
         n12036DVPrdConCC = T01IU3_n12036DVPrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12036DVPrdConCC), 4, 0));
         A12037DVPrdDscTe = T01IU3_A12037DVPrdDscTe[0] ;
         n12037DVPrdDscTe = T01IU3_n12037DVPrdDscTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12037DVPrdDscTe", A12037DVPrdDscTe);
         A12038DVPrdUniCo = T01IU3_A12038DVPrdUniCo[0] ;
         n12038DVPrdUniCo = T01IU3_n12038DVPrdUniCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.str( A12038DVPrdUniCo, 1, 0));
         A12039DVPrdUniCn = T01IU3_A12039DVPrdUniCn[0] ;
         n12039DVPrdUniCn = T01IU3_n12039DVPrdUniCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.str( A12039DVPrdUniCn, 1, 0));
         A12040DVPrdRefPr = T01IU3_A12040DVPrdRefPr[0] ;
         n12040DVPrdRefPr = T01IU3_n12040DVPrdRefPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12040DVPrdRefPr", A12040DVPrdRefPr);
         A12041DVPrdSus = T01IU3_A12041DVPrdSus[0] ;
         n12041DVPrdSus = T01IU3_n12041DVPrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12041DVPrdSus", A12041DVPrdSus);
         A12042DVPrdCalNe = T01IU3_A12042DVPrdCalNe[0] ;
         n12042DVPrdCalNe = T01IU3_n12042DVPrdCalNe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12042DVPrdCalNe", A12042DVPrdCalNe);
         A12043DVPrdSit = T01IU3_A12043DVPrdSit[0] ;
         n12043DVPrdSit = T01IU3_n12043DVPrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.str( A12043DVPrdSit, 1, 0));
         A12044DVTipDtoCo = T01IU3_A12044DVTipDtoCo[0] ;
         n12044DVTipDtoCo = T01IU3_n12044DVTipDtoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12044DVTipDtoCo), 2, 0));
         A12045DVPrdValSt = T01IU3_A12045DVPrdValSt[0] ;
         n12045DVPrdValSt = T01IU3_n12045DVPrdValSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrimstr( A12045DVPrdValSt, 11, 2));
         A12046DVDifValSt = T01IU3_A12046DVDifValSt[0] ;
         n12046DVDifValSt = T01IU3_n12046DVDifValSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrimstr( A12046DVDifValSt, 11, 2));
         A12047DVPrdFecEn = T01IU3_A12047DVPrdFecEn[0] ;
         n12047DVPrdFecEn = T01IU3_n12047DVPrdFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
         A12048DVPrdPosX = T01IU3_A12048DVPrdPosX[0] ;
         n12048DVPrdPosX = T01IU3_n12048DVPrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12048DVPrdPosX), 4, 0));
         A12049DVPrdPosY = T01IU3_A12049DVPrdPosY[0] ;
         n12049DVPrdPosY = T01IU3_n12049DVPrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12049DVPrdPosY), 4, 0));
         A12050DVPrdTip = T01IU3_A12050DVPrdTip[0] ;
         n12050DVPrdTip = T01IU3_n12050DVPrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12050DVPrdTip", A12050DVPrdTip);
         A12051DVPrdDqo = T01IU3_A12051DVPrdDqo[0] ;
         n12051DVPrdDqo = T01IU3_n12051DVPrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12051DVPrdDqo), 4, 0));
         A12052DVPrdRev = T01IU3_A12052DVPrdRev[0] ;
         n12052DVPrdRev = T01IU3_n12052DVPrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12052DVPrdRev", A12052DVPrdRev);
         A12053DVPrdTnq = T01IU3_A12053DVPrdTnq[0] ;
         n12053DVPrdTnq = T01IU3_n12053DVPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12053DVPrdTnq), 2, 0));
         A12054DVCCStKULi = T01IU3_A12054DVCCStKULi[0] ;
         n12054DVCCStKULi = T01IU3_n12054DVCCStKULi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12054DVCCStKULi), 12, 0));
         A12055DVPrdUMeFo = T01IU3_A12055DVPrdUMeFo[0] ;
         n12055DVPrdUMeFo = T01IU3_n12055DVPrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.str( A12055DVPrdUMeFo, 1, 0));
         A12056DVPrdNom2 = T01IU3_A12056DVPrdNom2[0] ;
         n12056DVPrdNom2 = T01IU3_n12056DVPrdNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12056DVPrdNom2", A12056DVPrdNom2);
         A12057DVPrdNum2 = T01IU3_A12057DVPrdNum2[0] ;
         n12057DVPrdNum2 = T01IU3_n12057DVPrdNum2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12057DVPrdNum2", A12057DVPrdNum2);
         A12059DVPrdPreA2 = T01IU3_A12059DVPrdPreA2[0] ;
         n12059DVPrdPreA2 = T01IU3_n12059DVPrdPreA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrimstr( A12059DVPrdPreA2, 14, 5));
         A12060DVPrdDensS = T01IU3_A12060DVPrdDensS[0] ;
         n12060DVPrdDensS = T01IU3_n12060DVPrdDensS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrimstr( A12060DVPrdDensS, 7, 3));
         A12061DVPrdConcS = T01IU3_A12061DVPrdConcS[0] ;
         n12061DVPrdConcS = T01IU3_n12061DVPrdConcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrimstr( A12061DVPrdConcS, 7, 3));
         A12062DVPrdSalM = T01IU3_A12062DVPrdSalM[0] ;
         n12062DVPrdSalM = T01IU3_n12062DVPrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12062DVPrdSalM", A12062DVPrdSalM);
         A12063DVPrdSolub = T01IU3_A12063DVPrdSolub[0] ;
         n12063DVPrdSolub = T01IU3_n12063DVPrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrimstr( A12063DVPrdSolub, 7, 2));
         A12064DVPrdNumCe = T01IU3_A12064DVPrdNumCe[0] ;
         n12064DVPrdNumCe = T01IU3_n12064DVPrdNumCe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12064DVPrdNumCe", A12064DVPrdNumCe);
         A12065DVTipPrdCo = T01IU3_A12065DVTipPrdCo[0] ;
         n12065DVTipPrdCo = T01IU3_n12065DVTipPrdCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12065DVTipPrdCo), 4, 0));
         A12066DVPrdNumct = T01IU3_A12066DVPrdNumct[0] ;
         n12066DVPrdNumct = T01IU3_n12066DVPrdNumct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrimstr( A12066DVPrdNumct, 6, 2));
         A12067DVPrdNumc2 = T01IU3_A12067DVPrdNumc2[0] ;
         n12067DVPrdNumc2 = T01IU3_n12067DVPrdNumc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrimstr( A12067DVPrdNumc2, 6, 2));
         A12068DVPrdHorMa = T01IU3_A12068DVPrdHorMa[0] ;
         n12068DVPrdHorMa = T01IU3_n12068DVPrdHorMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12068DVPrdHorMa), 2, 0));
         A12069DVPrdPreRe = T01IU3_A12069DVPrdPreRe[0] ;
         n12069DVPrdPreRe = T01IU3_n12069DVPrdPreRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrimstr( A12069DVPrdPreRe, 14, 5));
         A12070DVMat_Lts = T01IU3_A12070DVMat_Lts[0] ;
         n12070DVMat_Lts = T01IU3_n12070DVMat_Lts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrimstr( A12070DVMat_Lts, 9, 2));
         A12071DVPrdExiAc = T01IU3_A12071DVPrdExiAc[0] ;
         n12071DVPrdExiAc = T01IU3_n12071DVPrdExiAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrimstr( A12071DVPrdExiAc, 12, 4));
         A12072DVAlmc_Ult = T01IU3_A12072DVAlmc_Ult[0] ;
         n12072DVAlmc_Ult = T01IU3_n12072DVAlmc_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), 6, 0));
         A12073DVPrdAltAc = T01IU3_A12073DVPrdAltAc[0] ;
         n12073DVPrdAltAc = T01IU3_n12073DVPrdAltAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.str( A12073DVPrdAltAc, 1, 0));
         A12074DVPrdPesCo = T01IU3_A12074DVPrdPesCo[0] ;
         n12074DVPrdPesCo = T01IU3_n12074DVPrdPesCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.str( A12074DVPrdPesCo, 1, 0));
         A12075DVPrdPesTe = T01IU3_A12075DVPrdPesTe[0] ;
         n12075DVPrdPesTe = T01IU3_n12075DVPrdPesTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12075DVPrdPesTe", A12075DVPrdPesTe);
         A12076DVCC_Ultln = T01IU3_A12076DVCC_Ultln[0] ;
         n12076DVCC_Ultln = T01IU3_n12076DVCC_Ultln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12076DVCC_Ultln), 12, 0));
         A12077DVPrdSal = T01IU3_A12077DVPrdSal[0] ;
         n12077DVPrdSal = T01IU3_n12077DVPrdSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12077DVPrdSal", A12077DVPrdSal);
         A12078DVSubFamCo = T01IU3_A12078DVSubFamCo[0] ;
         n12078DVSubFamCo = T01IU3_n12078DVSubFamCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12078DVSubFamCo), 2, 0));
         A12079DVPrdInc = T01IU3_A12079DVPrdInc[0] ;
         n12079DVPrdInc = T01IU3_n12079DVPrdInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12079DVPrdInc", A12079DVPrdInc);
         A12080DVPrdComp = T01IU3_A12080DVPrdComp[0] ;
         n12080DVPrdComp = T01IU3_n12080DVPrdComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12080DVPrdComp", A12080DVPrdComp);
         A12081DVPrdAox = T01IU3_A12081DVPrdAox[0] ;
         n12081DVPrdAox = T01IU3_n12081DVPrdAox[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrimstr( A12081DVPrdAox, 6, 2));
         A12082DVPrdNCAS = T01IU3_A12082DVPrdNCAS[0] ;
         n12082DVPrdNCAS = T01IU3_n12082DVPrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12082DVPrdNCAS", A12082DVPrdNCAS);
         A12083DVPrdFT = T01IU3_A12083DVPrdFT[0] ;
         n12083DVPrdFT = T01IU3_n12083DVPrdFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12083DVPrdFT", A12083DVPrdFT);
         A12084DVPrdFFT = T01IU3_A12084DVPrdFFT[0] ;
         n12084DVPrdFFT = T01IU3_n12084DVPrdFFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
         A12085DVPrdHS = T01IU3_A12085DVPrdHS[0] ;
         n12085DVPrdHS = T01IU3_n12085DVPrdHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12085DVPrdHS", A12085DVPrdHS);
         A12086DVPrdFHS = T01IU3_A12086DVPrdFHS[0] ;
         n12086DVPrdFHS = T01IU3_n12086DVPrdFHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
         A12087DVPrdReach = T01IU3_A12087DVPrdReach[0] ;
         n12087DVPrdReach = T01IU3_n12087DVPrdReach[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12087DVPrdReach", A12087DVPrdReach);
         A12088DVPrdOkote = T01IU3_A12088DVPrdOkote[0] ;
         n12088DVPrdOkote = T01IU3_n12088DVPrdOkote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12088DVPrdOkote", A12088DVPrdOkote);
         A12089DVPrdColId = T01IU3_A12089DVPrdColId[0] ;
         n12089DVPrdColId = T01IU3_n12089DVPrdColId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12089DVPrdColId", A12089DVPrdColId);
         A12090DVPrdLote = T01IU3_A12090DVPrdLote[0] ;
         n12090DVPrdLote = T01IU3_n12090DVPrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12090DVPrdLote", A12090DVPrdLote);
         A12091DVPrdRTM = T01IU3_A12091DVPrdRTM[0] ;
         n12091DVPrdRTM = T01IU3_n12091DVPrdRTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12091DVPrdRTM", A12091DVPrdRTM);
         A12092DVPrdCtw1 = T01IU3_A12092DVPrdCtw1[0] ;
         n12092DVPrdCtw1 = T01IU3_n12092DVPrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12092DVPrdCtw1", A12092DVPrdCtw1);
         A12093DVPrdCtw2 = T01IU3_A12093DVPrdCtw2[0] ;
         n12093DVPrdCtw2 = T01IU3_n12093DVPrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12093DVPrdCtw2", A12093DVPrdCtw2);
         A12094DVPrdCtw3 = T01IU3_A12094DVPrdCtw3[0] ;
         n12094DVPrdCtw3 = T01IU3_n12094DVPrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12094DVPrdCtw3", A12094DVPrdCtw3);
         A12095DVPrdNroCA = T01IU3_A12095DVPrdNroCA[0] ;
         n12095DVPrdNroCA = T01IU3_n12095DVPrdNroCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12095DVPrdNroCA", A12095DVPrdNroCA);
         A12096DVPrdGots = T01IU3_A12096DVPrdGots[0] ;
         n12096DVPrdGots = T01IU3_n12096DVPrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12096DVPrdGots", A12096DVPrdGots);
         A12097DVPrdHm = T01IU3_A12097DVPrdHm[0] ;
         n12097DVPrdHm = T01IU3_n12097DVPrdHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12097DVPrdHm", A12097DVPrdHm);
         A12098DVPrdConct = T01IU3_A12098DVPrdConct[0] ;
         n12098DVPrdConct = T01IU3_n12098DVPrdConct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12098DVPrdConct), 3, 0));
         A12099DVPrdEINEC = T01IU3_A12099DVPrdEINEC[0] ;
         n12099DVPrdEINEC = T01IU3_n12099DVPrdEINEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12099DVPrdEINEC", A12099DVPrdEINEC);
         A12100DVPrdFunci = T01IU3_A12100DVPrdFunci[0] ;
         n12100DVPrdFunci = T01IU3_n12100DVPrdFunci[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12100DVPrdFunci", A12100DVPrdFunci);
         A12101DVPrdNmQu = T01IU3_A12101DVPrdNmQu[0] ;
         n12101DVPrdNmQu = T01IU3_n12101DVPrdNmQu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12101DVPrdNmQu", A12101DVPrdNmQu);
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         sMode1678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IU1678( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1678 = (short)(0) ;
            initializeNonKey1IU1678( ) ;
         }
         Gx_mode = sMode1678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1678 = (short)(0) ;
         initializeNonKey1IU1678( ) ;
         sMode1678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IU1678( ) ;
      if ( RcdFound1678 == 0 )
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
      RcdFound1678 = (short)(0) ;
      /* Using cursor T01IU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IU8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IU8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IU8_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IU8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IU8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IU8_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) ) )
         {
            A396EmprCod = T01IU8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IU8_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            RcdFound1678 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1678 = (short)(0) ;
      /* Using cursor T01IU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IU9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IU9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IU9_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IU9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IU9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IU9_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) ) )
         {
            A396EmprCod = T01IU9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IU9_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            RcdFound1678 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IU1678( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IU1678( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1678 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11935DVPrdNum = Z11935DVPrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
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
               update1IU1678( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IU1678( ) ;
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
                  insert1IU1678( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = Z11935DVPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
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
      getKey1IU1678( ) ;
      if ( RcdFound1678 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = Z11935DVPrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvproduc");
      GX_FocusControl = edtDVPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IU0( ) ;
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
      if ( RcdFound1678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDVPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IU1678( ) ;
      if ( RcdFound1678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IU1678( ) ;
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
      if ( RcdFound1678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVPrdNom_Internalname ;
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
      if ( RcdFound1678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVPrdNom_Internalname ;
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
      scanStart1IU1678( ) ;
      if ( RcdFound1678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1678 != 0 )
         {
            scanNext1IU1678( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IU1678( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IU1678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNDVPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12003DVPrdNom, T01IU2_A12003DVPrdNom[0]) != 0 ) || ( Z12004DVPrvNum != T01IU2_A12004DVPrvNum[0] ) || ( DecimalUtil.compareTo(Z12005DVPrdExiAl, T01IU2_A12005DVPrdExiAl[0]) != 0 ) || ( DecimalUtil.compareTo(Z12006DVPrdPreAc, T01IU2_A12006DVPrdPreAc[0]) != 0 ) || ( Z12007DVUltLinEn != T01IU2_A12007DVUltLinEn[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12008DVPrdDetPa, T01IU2_A12008DVPrdDetPa[0]) != 0 ) || ( Z12009DVValCod != T01IU2_A12009DVValCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z12010DVPrdFulEn), GXutil.resetTime(T01IU2_A12010DVPrdFulEn[0])) ) || ( DecimalUtil.compareTo(Z12011DVPrdCanPe, T01IU2_A12011DVPrdCanPe[0]) != 0 ) || ( DecimalUtil.compareTo(Z12012DVPrdRotRe, T01IU2_A12012DVPrdRotRe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12013DVPrdPreMe, T01IU2_A12013DVPrdPreMe[0]) != 0 ) || ( GXutil.strcmp(Z12014DVPrdRec, T01IU2_A12014DVPrdRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z12015DVPrdPreAn, T01IU2_A12015DVPrdPreAn[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12016DVPrdFecPr), GXutil.resetTime(T01IU2_A12016DVPrdFecPr[0])) ) || ( Z12017DVMovEspUL != T01IU2_A12017DVMovEspUL[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12018DVPrdExiCC, T01IU2_A12018DVPrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z12019DVPrdUltDC, T01IU2_A12019DVPrdUltDC[0]) != 0 ) || ( DecimalUtil.compareTo(Z12020DVPrdUltEC, T01IU2_A12020DVPrdUltEC[0]) != 0 ) || ( Z12021DVPrdUltCC != T01IU2_A12021DVPrdUltCC[0] ) || ( DecimalUtil.compareTo(Z12022DVPrdExiCP, T01IU2_A12022DVPrdExiCP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12023DVPrdDifCC, T01IU2_A12023DVPrdDifCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z12024DVPrdFacCo, T01IU2_A12024DVPrdFacCo[0]) != 0 ) || ( DecimalUtil.compareTo(Z12025DVPrdConDi, T01IU2_A12025DVPrdConDi[0]) != 0 ) || ( DecimalUtil.compareTo(Z12026DVPrdStkMi, T01IU2_A12026DVPrdStkMi[0]) != 0 ) || ( Z12027DVPrdStkMD != T01IU2_A12027DVPrdStkMD[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12028DVPrdDiaRo != T01IU2_A12028DVPrdDiaRo[0] ) || ( Z12029DVPrdPlaEn != T01IU2_A12029DVPrdPlaEn[0] ) || ( Z12030DVMetCod != T01IU2_A12030DVMetCod[0] ) || ( Z12031DVPrdLotMi != T01IU2_A12031DVPrdLotMi[0] ) || ( DecimalUtil.compareTo(Z12032DVPrdNumUc, T01IU2_A12032DVPrdNumUc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12033DVPrdCanRe, T01IU2_A12033DVPrdCanRe[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12034DVPrdFulPe), GXutil.resetTime(T01IU2_A12034DVPrdFulPe[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12035DVPrdFulCC), GXutil.resetTime(T01IU2_A12035DVPrdFulCC[0])) ) || ( Z12036DVPrdConCC != T01IU2_A12036DVPrdConCC[0] ) || ( GXutil.strcmp(Z12037DVPrdDscTe, T01IU2_A12037DVPrdDscTe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12038DVPrdUniCo != T01IU2_A12038DVPrdUniCo[0] ) || ( Z12039DVPrdUniCn != T01IU2_A12039DVPrdUniCn[0] ) || ( GXutil.strcmp(Z12040DVPrdRefPr, T01IU2_A12040DVPrdRefPr[0]) != 0 ) || ( GXutil.strcmp(Z12041DVPrdSus, T01IU2_A12041DVPrdSus[0]) != 0 ) || ( GXutil.strcmp(Z12042DVPrdCalNe, T01IU2_A12042DVPrdCalNe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12043DVPrdSit != T01IU2_A12043DVPrdSit[0] ) || ( Z12044DVTipDtoCo != T01IU2_A12044DVTipDtoCo[0] ) || ( DecimalUtil.compareTo(Z12045DVPrdValSt, T01IU2_A12045DVPrdValSt[0]) != 0 ) || ( DecimalUtil.compareTo(Z12046DVDifValSt, T01IU2_A12046DVDifValSt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12047DVPrdFecEn), GXutil.resetTime(T01IU2_A12047DVPrdFecEn[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12048DVPrdPosX != T01IU2_A12048DVPrdPosX[0] ) || ( Z12049DVPrdPosY != T01IU2_A12049DVPrdPosY[0] ) || ( GXutil.strcmp(Z12050DVPrdTip, T01IU2_A12050DVPrdTip[0]) != 0 ) || ( Z12051DVPrdDqo != T01IU2_A12051DVPrdDqo[0] ) || ( GXutil.strcmp(Z12052DVPrdRev, T01IU2_A12052DVPrdRev[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12053DVPrdTnq != T01IU2_A12053DVPrdTnq[0] ) || ( Z12054DVCCStKULi != T01IU2_A12054DVCCStKULi[0] ) || ( Z12055DVPrdUMeFo != T01IU2_A12055DVPrdUMeFo[0] ) || ( GXutil.strcmp(Z12056DVPrdNom2, T01IU2_A12056DVPrdNom2[0]) != 0 ) || ( GXutil.strcmp(Z12057DVPrdNum2, T01IU2_A12057DVPrdNum2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12059DVPrdPreA2, T01IU2_A12059DVPrdPreA2[0]) != 0 ) || ( DecimalUtil.compareTo(Z12060DVPrdDensS, T01IU2_A12060DVPrdDensS[0]) != 0 ) || ( DecimalUtil.compareTo(Z12061DVPrdConcS, T01IU2_A12061DVPrdConcS[0]) != 0 ) || ( GXutil.strcmp(Z12062DVPrdSalM, T01IU2_A12062DVPrdSalM[0]) != 0 ) || ( DecimalUtil.compareTo(Z12063DVPrdSolub, T01IU2_A12063DVPrdSolub[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12064DVPrdNumCe, T01IU2_A12064DVPrdNumCe[0]) != 0 ) || ( Z12065DVTipPrdCo != T01IU2_A12065DVTipPrdCo[0] ) || ( DecimalUtil.compareTo(Z12066DVPrdNumct, T01IU2_A12066DVPrdNumct[0]) != 0 ) || ( DecimalUtil.compareTo(Z12067DVPrdNumc2, T01IU2_A12067DVPrdNumc2[0]) != 0 ) || ( Z12068DVPrdHorMa != T01IU2_A12068DVPrdHorMa[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12069DVPrdPreRe, T01IU2_A12069DVPrdPreRe[0]) != 0 ) || ( DecimalUtil.compareTo(Z12070DVMat_Lts, T01IU2_A12070DVMat_Lts[0]) != 0 ) || ( DecimalUtil.compareTo(Z12071DVPrdExiAc, T01IU2_A12071DVPrdExiAc[0]) != 0 ) || ( Z12072DVAlmc_Ult != T01IU2_A12072DVAlmc_Ult[0] ) || ( Z12073DVPrdAltAc != T01IU2_A12073DVPrdAltAc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12074DVPrdPesCo != T01IU2_A12074DVPrdPesCo[0] ) || ( GXutil.strcmp(Z12075DVPrdPesTe, T01IU2_A12075DVPrdPesTe[0]) != 0 ) || ( Z12076DVCC_Ultln != T01IU2_A12076DVCC_Ultln[0] ) || ( GXutil.strcmp(Z12077DVPrdSal, T01IU2_A12077DVPrdSal[0]) != 0 ) || ( Z12078DVSubFamCo != T01IU2_A12078DVSubFamCo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12079DVPrdInc, T01IU2_A12079DVPrdInc[0]) != 0 ) || ( GXutil.strcmp(Z12080DVPrdComp, T01IU2_A12080DVPrdComp[0]) != 0 ) || ( DecimalUtil.compareTo(Z12081DVPrdAox, T01IU2_A12081DVPrdAox[0]) != 0 ) || ( GXutil.strcmp(Z12082DVPrdNCAS, T01IU2_A12082DVPrdNCAS[0]) != 0 ) || ( GXutil.strcmp(Z12083DVPrdFT, T01IU2_A12083DVPrdFT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z12084DVPrdFFT), GXutil.resetTime(T01IU2_A12084DVPrdFFT[0])) ) || ( GXutil.strcmp(Z12085DVPrdHS, T01IU2_A12085DVPrdHS[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12086DVPrdFHS), GXutil.resetTime(T01IU2_A12086DVPrdFHS[0])) ) || ( GXutil.strcmp(Z12087DVPrdReach, T01IU2_A12087DVPrdReach[0]) != 0 ) || ( GXutil.strcmp(Z12088DVPrdOkote, T01IU2_A12088DVPrdOkote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12089DVPrdColId, T01IU2_A12089DVPrdColId[0]) != 0 ) || ( GXutil.strcmp(Z12090DVPrdLote, T01IU2_A12090DVPrdLote[0]) != 0 ) || ( GXutil.strcmp(Z12091DVPrdRTM, T01IU2_A12091DVPrdRTM[0]) != 0 ) || ( GXutil.strcmp(Z12092DVPrdCtw1, T01IU2_A12092DVPrdCtw1[0]) != 0 ) || ( GXutil.strcmp(Z12093DVPrdCtw2, T01IU2_A12093DVPrdCtw2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12094DVPrdCtw3, T01IU2_A12094DVPrdCtw3[0]) != 0 ) || ( GXutil.strcmp(Z12095DVPrdNroCA, T01IU2_A12095DVPrdNroCA[0]) != 0 ) || ( GXutil.strcmp(Z12096DVPrdGots, T01IU2_A12096DVPrdGots[0]) != 0 ) || ( GXutil.strcmp(Z12097DVPrdHm, T01IU2_A12097DVPrdHm[0]) != 0 ) || ( Z12098DVPrdConct != T01IU2_A12098DVPrdConct[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12099DVPrdEINEC, T01IU2_A12099DVPrdEINEC[0]) != 0 ) || ( GXutil.strcmp(Z12100DVPrdFunci, T01IU2_A12100DVPrdFunci[0]) != 0 ) || ( GXutil.strcmp(Z12101DVPrdNmQu, T01IU2_A12101DVPrdNmQu[0]) != 0 ) || ( GXutil.strcmp(Z12102DVPrdEqLP, T01IU2_A12102DVPrdEqLP[0]) != 0 ) || ( DecimalUtil.compareTo(Z12103DVPrdConc, T01IU2_A12103DVPrdConc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12104DVPrdCtw4, T01IU2_A12104DVPrdCtw4[0]) != 0 ) || ( GXutil.strcmp(Z12105DVPrdList, T01IU2_A12105DVPrdList[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12003DVPrdNom, T01IU2_A12003DVPrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNom");
               GXutil.writeLogRaw("Old: ",Z12003DVPrdNom);
               GXutil.writeLogRaw("Current: ",T01IU2_A12003DVPrdNom[0]);
            }
            if ( Z12004DVPrvNum != T01IU2_A12004DVPrvNum[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrvNum");
               GXutil.writeLogRaw("Old: ",Z12004DVPrvNum);
               GXutil.writeLogRaw("Current: ",T01IU2_A12004DVPrvNum[0]);
            }
            if ( DecimalUtil.compareTo(Z12005DVPrdExiAl, T01IU2_A12005DVPrdExiAl[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdExiAl");
               GXutil.writeLogRaw("Old: ",Z12005DVPrdExiAl);
               GXutil.writeLogRaw("Current: ",T01IU2_A12005DVPrdExiAl[0]);
            }
            if ( DecimalUtil.compareTo(Z12006DVPrdPreAc, T01IU2_A12006DVPrdPreAc[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPreAc");
               GXutil.writeLogRaw("Old: ",Z12006DVPrdPreAc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12006DVPrdPreAc[0]);
            }
            if ( Z12007DVUltLinEn != T01IU2_A12007DVUltLinEn[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVUltLinEn");
               GXutil.writeLogRaw("Old: ",Z12007DVUltLinEn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12007DVUltLinEn[0]);
            }
            if ( GXutil.strcmp(Z12008DVPrdDetPa, T01IU2_A12008DVPrdDetPa[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDetPa");
               GXutil.writeLogRaw("Old: ",Z12008DVPrdDetPa);
               GXutil.writeLogRaw("Current: ",T01IU2_A12008DVPrdDetPa[0]);
            }
            if ( Z12009DVValCod != T01IU2_A12009DVValCod[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVValCod");
               GXutil.writeLogRaw("Old: ",Z12009DVValCod);
               GXutil.writeLogRaw("Current: ",T01IU2_A12009DVValCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12010DVPrdFulEn), GXutil.resetTime(T01IU2_A12010DVPrdFulEn[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFulEn");
               GXutil.writeLogRaw("Old: ",Z12010DVPrdFulEn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12010DVPrdFulEn[0]);
            }
            if ( DecimalUtil.compareTo(Z12011DVPrdCanPe, T01IU2_A12011DVPrdCanPe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCanPe");
               GXutil.writeLogRaw("Old: ",Z12011DVPrdCanPe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12011DVPrdCanPe[0]);
            }
            if ( DecimalUtil.compareTo(Z12012DVPrdRotRe, T01IU2_A12012DVPrdRotRe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdRotRe");
               GXutil.writeLogRaw("Old: ",Z12012DVPrdRotRe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12012DVPrdRotRe[0]);
            }
            if ( DecimalUtil.compareTo(Z12013DVPrdPreMe, T01IU2_A12013DVPrdPreMe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPreMe");
               GXutil.writeLogRaw("Old: ",Z12013DVPrdPreMe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12013DVPrdPreMe[0]);
            }
            if ( GXutil.strcmp(Z12014DVPrdRec, T01IU2_A12014DVPrdRec[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdRec");
               GXutil.writeLogRaw("Old: ",Z12014DVPrdRec);
               GXutil.writeLogRaw("Current: ",T01IU2_A12014DVPrdRec[0]);
            }
            if ( DecimalUtil.compareTo(Z12015DVPrdPreAn, T01IU2_A12015DVPrdPreAn[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPreAn");
               GXutil.writeLogRaw("Old: ",Z12015DVPrdPreAn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12015DVPrdPreAn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12016DVPrdFecPr), GXutil.resetTime(T01IU2_A12016DVPrdFecPr[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFecPr");
               GXutil.writeLogRaw("Old: ",Z12016DVPrdFecPr);
               GXutil.writeLogRaw("Current: ",T01IU2_A12016DVPrdFecPr[0]);
            }
            if ( Z12017DVMovEspUL != T01IU2_A12017DVMovEspUL[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVMovEspUL");
               GXutil.writeLogRaw("Old: ",Z12017DVMovEspUL);
               GXutil.writeLogRaw("Current: ",T01IU2_A12017DVMovEspUL[0]);
            }
            if ( DecimalUtil.compareTo(Z12018DVPrdExiCC, T01IU2_A12018DVPrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdExiCC");
               GXutil.writeLogRaw("Old: ",Z12018DVPrdExiCC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12018DVPrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z12019DVPrdUltDC, T01IU2_A12019DVPrdUltDC[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUltDC");
               GXutil.writeLogRaw("Old: ",Z12019DVPrdUltDC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12019DVPrdUltDC[0]);
            }
            if ( DecimalUtil.compareTo(Z12020DVPrdUltEC, T01IU2_A12020DVPrdUltEC[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUltEC");
               GXutil.writeLogRaw("Old: ",Z12020DVPrdUltEC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12020DVPrdUltEC[0]);
            }
            if ( Z12021DVPrdUltCC != T01IU2_A12021DVPrdUltCC[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUltCC");
               GXutil.writeLogRaw("Old: ",Z12021DVPrdUltCC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12021DVPrdUltCC[0]);
            }
            if ( DecimalUtil.compareTo(Z12022DVPrdExiCP, T01IU2_A12022DVPrdExiCP[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdExiCP");
               GXutil.writeLogRaw("Old: ",Z12022DVPrdExiCP);
               GXutil.writeLogRaw("Current: ",T01IU2_A12022DVPrdExiCP[0]);
            }
            if ( DecimalUtil.compareTo(Z12023DVPrdDifCC, T01IU2_A12023DVPrdDifCC[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDifCC");
               GXutil.writeLogRaw("Old: ",Z12023DVPrdDifCC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12023DVPrdDifCC[0]);
            }
            if ( DecimalUtil.compareTo(Z12024DVPrdFacCo, T01IU2_A12024DVPrdFacCo[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFacCo");
               GXutil.writeLogRaw("Old: ",Z12024DVPrdFacCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12024DVPrdFacCo[0]);
            }
            if ( DecimalUtil.compareTo(Z12025DVPrdConDi, T01IU2_A12025DVPrdConDi[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdConDi");
               GXutil.writeLogRaw("Old: ",Z12025DVPrdConDi);
               GXutil.writeLogRaw("Current: ",T01IU2_A12025DVPrdConDi[0]);
            }
            if ( DecimalUtil.compareTo(Z12026DVPrdStkMi, T01IU2_A12026DVPrdStkMi[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdStkMi");
               GXutil.writeLogRaw("Old: ",Z12026DVPrdStkMi);
               GXutil.writeLogRaw("Current: ",T01IU2_A12026DVPrdStkMi[0]);
            }
            if ( Z12027DVPrdStkMD != T01IU2_A12027DVPrdStkMD[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdStkMD");
               GXutil.writeLogRaw("Old: ",Z12027DVPrdStkMD);
               GXutil.writeLogRaw("Current: ",T01IU2_A12027DVPrdStkMD[0]);
            }
            if ( Z12028DVPrdDiaRo != T01IU2_A12028DVPrdDiaRo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDiaRo");
               GXutil.writeLogRaw("Old: ",Z12028DVPrdDiaRo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12028DVPrdDiaRo[0]);
            }
            if ( Z12029DVPrdPlaEn != T01IU2_A12029DVPrdPlaEn[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPlaEn");
               GXutil.writeLogRaw("Old: ",Z12029DVPrdPlaEn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12029DVPrdPlaEn[0]);
            }
            if ( Z12030DVMetCod != T01IU2_A12030DVMetCod[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVMetCod");
               GXutil.writeLogRaw("Old: ",Z12030DVMetCod);
               GXutil.writeLogRaw("Current: ",T01IU2_A12030DVMetCod[0]);
            }
            if ( Z12031DVPrdLotMi != T01IU2_A12031DVPrdLotMi[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdLotMi");
               GXutil.writeLogRaw("Old: ",Z12031DVPrdLotMi);
               GXutil.writeLogRaw("Current: ",T01IU2_A12031DVPrdLotMi[0]);
            }
            if ( DecimalUtil.compareTo(Z12032DVPrdNumUc, T01IU2_A12032DVPrdNumUc[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNumUc");
               GXutil.writeLogRaw("Old: ",Z12032DVPrdNumUc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12032DVPrdNumUc[0]);
            }
            if ( DecimalUtil.compareTo(Z12033DVPrdCanRe, T01IU2_A12033DVPrdCanRe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCanRe");
               GXutil.writeLogRaw("Old: ",Z12033DVPrdCanRe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12033DVPrdCanRe[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12034DVPrdFulPe), GXutil.resetTime(T01IU2_A12034DVPrdFulPe[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFulPe");
               GXutil.writeLogRaw("Old: ",Z12034DVPrdFulPe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12034DVPrdFulPe[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12035DVPrdFulCC), GXutil.resetTime(T01IU2_A12035DVPrdFulCC[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFulCC");
               GXutil.writeLogRaw("Old: ",Z12035DVPrdFulCC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12035DVPrdFulCC[0]);
            }
            if ( Z12036DVPrdConCC != T01IU2_A12036DVPrdConCC[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdConCC");
               GXutil.writeLogRaw("Old: ",Z12036DVPrdConCC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12036DVPrdConCC[0]);
            }
            if ( GXutil.strcmp(Z12037DVPrdDscTe, T01IU2_A12037DVPrdDscTe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDscTe");
               GXutil.writeLogRaw("Old: ",Z12037DVPrdDscTe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12037DVPrdDscTe[0]);
            }
            if ( Z12038DVPrdUniCo != T01IU2_A12038DVPrdUniCo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUniCo");
               GXutil.writeLogRaw("Old: ",Z12038DVPrdUniCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12038DVPrdUniCo[0]);
            }
            if ( Z12039DVPrdUniCn != T01IU2_A12039DVPrdUniCn[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUniCn");
               GXutil.writeLogRaw("Old: ",Z12039DVPrdUniCn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12039DVPrdUniCn[0]);
            }
            if ( GXutil.strcmp(Z12040DVPrdRefPr, T01IU2_A12040DVPrdRefPr[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdRefPr");
               GXutil.writeLogRaw("Old: ",Z12040DVPrdRefPr);
               GXutil.writeLogRaw("Current: ",T01IU2_A12040DVPrdRefPr[0]);
            }
            if ( GXutil.strcmp(Z12041DVPrdSus, T01IU2_A12041DVPrdSus[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdSus");
               GXutil.writeLogRaw("Old: ",Z12041DVPrdSus);
               GXutil.writeLogRaw("Current: ",T01IU2_A12041DVPrdSus[0]);
            }
            if ( GXutil.strcmp(Z12042DVPrdCalNe, T01IU2_A12042DVPrdCalNe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCalNe");
               GXutil.writeLogRaw("Old: ",Z12042DVPrdCalNe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12042DVPrdCalNe[0]);
            }
            if ( Z12043DVPrdSit != T01IU2_A12043DVPrdSit[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdSit");
               GXutil.writeLogRaw("Old: ",Z12043DVPrdSit);
               GXutil.writeLogRaw("Current: ",T01IU2_A12043DVPrdSit[0]);
            }
            if ( Z12044DVTipDtoCo != T01IU2_A12044DVTipDtoCo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVTipDtoCo");
               GXutil.writeLogRaw("Old: ",Z12044DVTipDtoCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12044DVTipDtoCo[0]);
            }
            if ( DecimalUtil.compareTo(Z12045DVPrdValSt, T01IU2_A12045DVPrdValSt[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdValSt");
               GXutil.writeLogRaw("Old: ",Z12045DVPrdValSt);
               GXutil.writeLogRaw("Current: ",T01IU2_A12045DVPrdValSt[0]);
            }
            if ( DecimalUtil.compareTo(Z12046DVDifValSt, T01IU2_A12046DVDifValSt[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVDifValSt");
               GXutil.writeLogRaw("Old: ",Z12046DVDifValSt);
               GXutil.writeLogRaw("Current: ",T01IU2_A12046DVDifValSt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12047DVPrdFecEn), GXutil.resetTime(T01IU2_A12047DVPrdFecEn[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFecEn");
               GXutil.writeLogRaw("Old: ",Z12047DVPrdFecEn);
               GXutil.writeLogRaw("Current: ",T01IU2_A12047DVPrdFecEn[0]);
            }
            if ( Z12048DVPrdPosX != T01IU2_A12048DVPrdPosX[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPosX");
               GXutil.writeLogRaw("Old: ",Z12048DVPrdPosX);
               GXutil.writeLogRaw("Current: ",T01IU2_A12048DVPrdPosX[0]);
            }
            if ( Z12049DVPrdPosY != T01IU2_A12049DVPrdPosY[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPosY");
               GXutil.writeLogRaw("Old: ",Z12049DVPrdPosY);
               GXutil.writeLogRaw("Current: ",T01IU2_A12049DVPrdPosY[0]);
            }
            if ( GXutil.strcmp(Z12050DVPrdTip, T01IU2_A12050DVPrdTip[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdTip");
               GXutil.writeLogRaw("Old: ",Z12050DVPrdTip);
               GXutil.writeLogRaw("Current: ",T01IU2_A12050DVPrdTip[0]);
            }
            if ( Z12051DVPrdDqo != T01IU2_A12051DVPrdDqo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDqo");
               GXutil.writeLogRaw("Old: ",Z12051DVPrdDqo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12051DVPrdDqo[0]);
            }
            if ( GXutil.strcmp(Z12052DVPrdRev, T01IU2_A12052DVPrdRev[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdRev");
               GXutil.writeLogRaw("Old: ",Z12052DVPrdRev);
               GXutil.writeLogRaw("Current: ",T01IU2_A12052DVPrdRev[0]);
            }
            if ( Z12053DVPrdTnq != T01IU2_A12053DVPrdTnq[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdTnq");
               GXutil.writeLogRaw("Old: ",Z12053DVPrdTnq);
               GXutil.writeLogRaw("Current: ",T01IU2_A12053DVPrdTnq[0]);
            }
            if ( Z12054DVCCStKULi != T01IU2_A12054DVCCStKULi[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVCCStKULi");
               GXutil.writeLogRaw("Old: ",Z12054DVCCStKULi);
               GXutil.writeLogRaw("Current: ",T01IU2_A12054DVCCStKULi[0]);
            }
            if ( Z12055DVPrdUMeFo != T01IU2_A12055DVPrdUMeFo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdUMeFo");
               GXutil.writeLogRaw("Old: ",Z12055DVPrdUMeFo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12055DVPrdUMeFo[0]);
            }
            if ( GXutil.strcmp(Z12056DVPrdNom2, T01IU2_A12056DVPrdNom2[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNom2");
               GXutil.writeLogRaw("Old: ",Z12056DVPrdNom2);
               GXutil.writeLogRaw("Current: ",T01IU2_A12056DVPrdNom2[0]);
            }
            if ( GXutil.strcmp(Z12057DVPrdNum2, T01IU2_A12057DVPrdNum2[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNum2");
               GXutil.writeLogRaw("Old: ",Z12057DVPrdNum2);
               GXutil.writeLogRaw("Current: ",T01IU2_A12057DVPrdNum2[0]);
            }
            if ( DecimalUtil.compareTo(Z12059DVPrdPreA2, T01IU2_A12059DVPrdPreA2[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPreA2");
               GXutil.writeLogRaw("Old: ",Z12059DVPrdPreA2);
               GXutil.writeLogRaw("Current: ",T01IU2_A12059DVPrdPreA2[0]);
            }
            if ( DecimalUtil.compareTo(Z12060DVPrdDensS, T01IU2_A12060DVPrdDensS[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdDensS");
               GXutil.writeLogRaw("Old: ",Z12060DVPrdDensS);
               GXutil.writeLogRaw("Current: ",T01IU2_A12060DVPrdDensS[0]);
            }
            if ( DecimalUtil.compareTo(Z12061DVPrdConcS, T01IU2_A12061DVPrdConcS[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdConcS");
               GXutil.writeLogRaw("Old: ",Z12061DVPrdConcS);
               GXutil.writeLogRaw("Current: ",T01IU2_A12061DVPrdConcS[0]);
            }
            if ( GXutil.strcmp(Z12062DVPrdSalM, T01IU2_A12062DVPrdSalM[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdSalM");
               GXutil.writeLogRaw("Old: ",Z12062DVPrdSalM);
               GXutil.writeLogRaw("Current: ",T01IU2_A12062DVPrdSalM[0]);
            }
            if ( DecimalUtil.compareTo(Z12063DVPrdSolub, T01IU2_A12063DVPrdSolub[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdSolub");
               GXutil.writeLogRaw("Old: ",Z12063DVPrdSolub);
               GXutil.writeLogRaw("Current: ",T01IU2_A12063DVPrdSolub[0]);
            }
            if ( GXutil.strcmp(Z12064DVPrdNumCe, T01IU2_A12064DVPrdNumCe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNumCe");
               GXutil.writeLogRaw("Old: ",Z12064DVPrdNumCe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12064DVPrdNumCe[0]);
            }
            if ( Z12065DVTipPrdCo != T01IU2_A12065DVTipPrdCo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVTipPrdCo");
               GXutil.writeLogRaw("Old: ",Z12065DVTipPrdCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12065DVTipPrdCo[0]);
            }
            if ( DecimalUtil.compareTo(Z12066DVPrdNumct, T01IU2_A12066DVPrdNumct[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNumct");
               GXutil.writeLogRaw("Old: ",Z12066DVPrdNumct);
               GXutil.writeLogRaw("Current: ",T01IU2_A12066DVPrdNumct[0]);
            }
            if ( DecimalUtil.compareTo(Z12067DVPrdNumc2, T01IU2_A12067DVPrdNumc2[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNumc2");
               GXutil.writeLogRaw("Old: ",Z12067DVPrdNumc2);
               GXutil.writeLogRaw("Current: ",T01IU2_A12067DVPrdNumc2[0]);
            }
            if ( Z12068DVPrdHorMa != T01IU2_A12068DVPrdHorMa[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdHorMa");
               GXutil.writeLogRaw("Old: ",Z12068DVPrdHorMa);
               GXutil.writeLogRaw("Current: ",T01IU2_A12068DVPrdHorMa[0]);
            }
            if ( DecimalUtil.compareTo(Z12069DVPrdPreRe, T01IU2_A12069DVPrdPreRe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPreRe");
               GXutil.writeLogRaw("Old: ",Z12069DVPrdPreRe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12069DVPrdPreRe[0]);
            }
            if ( DecimalUtil.compareTo(Z12070DVMat_Lts, T01IU2_A12070DVMat_Lts[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVMat_Lts");
               GXutil.writeLogRaw("Old: ",Z12070DVMat_Lts);
               GXutil.writeLogRaw("Current: ",T01IU2_A12070DVMat_Lts[0]);
            }
            if ( DecimalUtil.compareTo(Z12071DVPrdExiAc, T01IU2_A12071DVPrdExiAc[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdExiAc");
               GXutil.writeLogRaw("Old: ",Z12071DVPrdExiAc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12071DVPrdExiAc[0]);
            }
            if ( Z12072DVAlmc_Ult != T01IU2_A12072DVAlmc_Ult[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVAlmc_Ult");
               GXutil.writeLogRaw("Old: ",Z12072DVAlmc_Ult);
               GXutil.writeLogRaw("Current: ",T01IU2_A12072DVAlmc_Ult[0]);
            }
            if ( Z12073DVPrdAltAc != T01IU2_A12073DVPrdAltAc[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdAltAc");
               GXutil.writeLogRaw("Old: ",Z12073DVPrdAltAc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12073DVPrdAltAc[0]);
            }
            if ( Z12074DVPrdPesCo != T01IU2_A12074DVPrdPesCo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPesCo");
               GXutil.writeLogRaw("Old: ",Z12074DVPrdPesCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12074DVPrdPesCo[0]);
            }
            if ( GXutil.strcmp(Z12075DVPrdPesTe, T01IU2_A12075DVPrdPesTe[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdPesTe");
               GXutil.writeLogRaw("Old: ",Z12075DVPrdPesTe);
               GXutil.writeLogRaw("Current: ",T01IU2_A12075DVPrdPesTe[0]);
            }
            if ( Z12076DVCC_Ultln != T01IU2_A12076DVCC_Ultln[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVCC_Ultln");
               GXutil.writeLogRaw("Old: ",Z12076DVCC_Ultln);
               GXutil.writeLogRaw("Current: ",T01IU2_A12076DVCC_Ultln[0]);
            }
            if ( GXutil.strcmp(Z12077DVPrdSal, T01IU2_A12077DVPrdSal[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdSal");
               GXutil.writeLogRaw("Old: ",Z12077DVPrdSal);
               GXutil.writeLogRaw("Current: ",T01IU2_A12077DVPrdSal[0]);
            }
            if ( Z12078DVSubFamCo != T01IU2_A12078DVSubFamCo[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVSubFamCo");
               GXutil.writeLogRaw("Old: ",Z12078DVSubFamCo);
               GXutil.writeLogRaw("Current: ",T01IU2_A12078DVSubFamCo[0]);
            }
            if ( GXutil.strcmp(Z12079DVPrdInc, T01IU2_A12079DVPrdInc[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdInc");
               GXutil.writeLogRaw("Old: ",Z12079DVPrdInc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12079DVPrdInc[0]);
            }
            if ( GXutil.strcmp(Z12080DVPrdComp, T01IU2_A12080DVPrdComp[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdComp");
               GXutil.writeLogRaw("Old: ",Z12080DVPrdComp);
               GXutil.writeLogRaw("Current: ",T01IU2_A12080DVPrdComp[0]);
            }
            if ( DecimalUtil.compareTo(Z12081DVPrdAox, T01IU2_A12081DVPrdAox[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdAox");
               GXutil.writeLogRaw("Old: ",Z12081DVPrdAox);
               GXutil.writeLogRaw("Current: ",T01IU2_A12081DVPrdAox[0]);
            }
            if ( GXutil.strcmp(Z12082DVPrdNCAS, T01IU2_A12082DVPrdNCAS[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNCAS");
               GXutil.writeLogRaw("Old: ",Z12082DVPrdNCAS);
               GXutil.writeLogRaw("Current: ",T01IU2_A12082DVPrdNCAS[0]);
            }
            if ( GXutil.strcmp(Z12083DVPrdFT, T01IU2_A12083DVPrdFT[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFT");
               GXutil.writeLogRaw("Old: ",Z12083DVPrdFT);
               GXutil.writeLogRaw("Current: ",T01IU2_A12083DVPrdFT[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12084DVPrdFFT), GXutil.resetTime(T01IU2_A12084DVPrdFFT[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFFT");
               GXutil.writeLogRaw("Old: ",Z12084DVPrdFFT);
               GXutil.writeLogRaw("Current: ",T01IU2_A12084DVPrdFFT[0]);
            }
            if ( GXutil.strcmp(Z12085DVPrdHS, T01IU2_A12085DVPrdHS[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdHS");
               GXutil.writeLogRaw("Old: ",Z12085DVPrdHS);
               GXutil.writeLogRaw("Current: ",T01IU2_A12085DVPrdHS[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12086DVPrdFHS), GXutil.resetTime(T01IU2_A12086DVPrdFHS[0])) ) )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFHS");
               GXutil.writeLogRaw("Old: ",Z12086DVPrdFHS);
               GXutil.writeLogRaw("Current: ",T01IU2_A12086DVPrdFHS[0]);
            }
            if ( GXutil.strcmp(Z12087DVPrdReach, T01IU2_A12087DVPrdReach[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdReach");
               GXutil.writeLogRaw("Old: ",Z12087DVPrdReach);
               GXutil.writeLogRaw("Current: ",T01IU2_A12087DVPrdReach[0]);
            }
            if ( GXutil.strcmp(Z12088DVPrdOkote, T01IU2_A12088DVPrdOkote[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdOkote");
               GXutil.writeLogRaw("Old: ",Z12088DVPrdOkote);
               GXutil.writeLogRaw("Current: ",T01IU2_A12088DVPrdOkote[0]);
            }
            if ( GXutil.strcmp(Z12089DVPrdColId, T01IU2_A12089DVPrdColId[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdColId");
               GXutil.writeLogRaw("Old: ",Z12089DVPrdColId);
               GXutil.writeLogRaw("Current: ",T01IU2_A12089DVPrdColId[0]);
            }
            if ( GXutil.strcmp(Z12090DVPrdLote, T01IU2_A12090DVPrdLote[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdLote");
               GXutil.writeLogRaw("Old: ",Z12090DVPrdLote);
               GXutil.writeLogRaw("Current: ",T01IU2_A12090DVPrdLote[0]);
            }
            if ( GXutil.strcmp(Z12091DVPrdRTM, T01IU2_A12091DVPrdRTM[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdRTM");
               GXutil.writeLogRaw("Old: ",Z12091DVPrdRTM);
               GXutil.writeLogRaw("Current: ",T01IU2_A12091DVPrdRTM[0]);
            }
            if ( GXutil.strcmp(Z12092DVPrdCtw1, T01IU2_A12092DVPrdCtw1[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCtw1");
               GXutil.writeLogRaw("Old: ",Z12092DVPrdCtw1);
               GXutil.writeLogRaw("Current: ",T01IU2_A12092DVPrdCtw1[0]);
            }
            if ( GXutil.strcmp(Z12093DVPrdCtw2, T01IU2_A12093DVPrdCtw2[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCtw2");
               GXutil.writeLogRaw("Old: ",Z12093DVPrdCtw2);
               GXutil.writeLogRaw("Current: ",T01IU2_A12093DVPrdCtw2[0]);
            }
            if ( GXutil.strcmp(Z12094DVPrdCtw3, T01IU2_A12094DVPrdCtw3[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCtw3");
               GXutil.writeLogRaw("Old: ",Z12094DVPrdCtw3);
               GXutil.writeLogRaw("Current: ",T01IU2_A12094DVPrdCtw3[0]);
            }
            if ( GXutil.strcmp(Z12095DVPrdNroCA, T01IU2_A12095DVPrdNroCA[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNroCA");
               GXutil.writeLogRaw("Old: ",Z12095DVPrdNroCA);
               GXutil.writeLogRaw("Current: ",T01IU2_A12095DVPrdNroCA[0]);
            }
            if ( GXutil.strcmp(Z12096DVPrdGots, T01IU2_A12096DVPrdGots[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdGots");
               GXutil.writeLogRaw("Old: ",Z12096DVPrdGots);
               GXutil.writeLogRaw("Current: ",T01IU2_A12096DVPrdGots[0]);
            }
            if ( GXutil.strcmp(Z12097DVPrdHm, T01IU2_A12097DVPrdHm[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdHm");
               GXutil.writeLogRaw("Old: ",Z12097DVPrdHm);
               GXutil.writeLogRaw("Current: ",T01IU2_A12097DVPrdHm[0]);
            }
            if ( Z12098DVPrdConct != T01IU2_A12098DVPrdConct[0] )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdConct");
               GXutil.writeLogRaw("Old: ",Z12098DVPrdConct);
               GXutil.writeLogRaw("Current: ",T01IU2_A12098DVPrdConct[0]);
            }
            if ( GXutil.strcmp(Z12099DVPrdEINEC, T01IU2_A12099DVPrdEINEC[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdEINEC");
               GXutil.writeLogRaw("Old: ",Z12099DVPrdEINEC);
               GXutil.writeLogRaw("Current: ",T01IU2_A12099DVPrdEINEC[0]);
            }
            if ( GXutil.strcmp(Z12100DVPrdFunci, T01IU2_A12100DVPrdFunci[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdFunci");
               GXutil.writeLogRaw("Old: ",Z12100DVPrdFunci);
               GXutil.writeLogRaw("Current: ",T01IU2_A12100DVPrdFunci[0]);
            }
            if ( GXutil.strcmp(Z12101DVPrdNmQu, T01IU2_A12101DVPrdNmQu[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdNmQu");
               GXutil.writeLogRaw("Old: ",Z12101DVPrdNmQu);
               GXutil.writeLogRaw("Current: ",T01IU2_A12101DVPrdNmQu[0]);
            }
            if ( GXutil.strcmp(Z12102DVPrdEqLP, T01IU2_A12102DVPrdEqLP[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdEqLP");
               GXutil.writeLogRaw("Old: ",Z12102DVPrdEqLP);
               GXutil.writeLogRaw("Current: ",T01IU2_A12102DVPrdEqLP[0]);
            }
            if ( DecimalUtil.compareTo(Z12103DVPrdConc, T01IU2_A12103DVPrdConc[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdConc");
               GXutil.writeLogRaw("Old: ",Z12103DVPrdConc);
               GXutil.writeLogRaw("Current: ",T01IU2_A12103DVPrdConc[0]);
            }
            if ( GXutil.strcmp(Z12104DVPrdCtw4, T01IU2_A12104DVPrdCtw4[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdCtw4");
               GXutil.writeLogRaw("Old: ",Z12104DVPrdCtw4);
               GXutil.writeLogRaw("Current: ",T01IU2_A12104DVPrdCtw4[0]);
            }
            if ( GXutil.strcmp(Z12105DVPrdList, T01IU2_A12105DVPrdList[0]) != 0 )
            {
               GXutil.writeLogln("tdvproduc:[seudo value changed for attri]"+"DVPrdList");
               GXutil.writeLogRaw("Old: ",Z12105DVPrdList);
               GXutil.writeLogRaw("Current: ",T01IU2_A12105DVPrdList[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"LVNDVPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IU1678( )
   {
      beforeValidate1IU1678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IU1678( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IU1678( 0) ;
         checkOptimisticConcurrency1IU1678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IU1678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IU1678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IU10 */
                  pr_default.execute(8, new Object[] {A11935DVPrdNum, Boolean.valueOf(n12003DVPrdNom), A12003DVPrdNom, Boolean.valueOf(n12004DVPrvNum), Integer.valueOf(A12004DVPrvNum), Boolean.valueOf(n12005DVPrdExiAl), A12005DVPrdExiAl, Boolean.valueOf(n12006DVPrdPreAc), A12006DVPrdPreAc, Boolean.valueOf(n12007DVUltLinEn), Short.valueOf(A12007DVUltLinEn), Boolean.valueOf(n12008DVPrdDetPa), A12008DVPrdDetPa, Boolean.valueOf(n12009DVValCod), Byte.valueOf(A12009DVValCod), Boolean.valueOf(n12010DVPrdFulEn), A12010DVPrdFulEn, Boolean.valueOf(n12011DVPrdCanPe), A12011DVPrdCanPe, Boolean.valueOf(n12012DVPrdRotRe), A12012DVPrdRotRe, Boolean.valueOf(n12013DVPrdPreMe), A12013DVPrdPreMe, Boolean.valueOf(n12014DVPrdRec), A12014DVPrdRec, Boolean.valueOf(n12015DVPrdPreAn), A12015DVPrdPreAn, Boolean.valueOf(n12016DVPrdFecPr), A12016DVPrdFecPr, Boolean.valueOf(n12017DVMovEspUL), Short.valueOf(A12017DVMovEspUL), Boolean.valueOf(n12018DVPrdExiCC), A12018DVPrdExiCC, Boolean.valueOf(n12019DVPrdUltDC), A12019DVPrdUltDC, Boolean.valueOf(n12020DVPrdUltEC), A12020DVPrdUltEC, Boolean.valueOf(n12021DVPrdUltCC), Short.valueOf(A12021DVPrdUltCC), Boolean.valueOf(n12022DVPrdExiCP), A12022DVPrdExiCP, Boolean.valueOf(n12023DVPrdDifCC), A12023DVPrdDifCC, Boolean.valueOf(n12024DVPrdFacCo), A12024DVPrdFacCo, Boolean.valueOf(n12025DVPrdConDi), A12025DVPrdConDi, Boolean.valueOf(n12026DVPrdStkMi), A12026DVPrdStkMi, Boolean.valueOf(n12027DVPrdStkMD), Short.valueOf(A12027DVPrdStkMD), Boolean.valueOf(n12028DVPrdDiaRo), Short.valueOf(A12028DVPrdDiaRo), Boolean.valueOf(n12029DVPrdPlaEn), Short.valueOf(A12029DVPrdPlaEn), Boolean.valueOf(n12030DVMetCod), Byte.valueOf(A12030DVMetCod), Boolean.valueOf(n12031DVPrdLotMi), Short.valueOf(A12031DVPrdLotMi), Boolean.valueOf(n12032DVPrdNumUc), A12032DVPrdNumUc, Boolean.valueOf(n12033DVPrdCanRe), A12033DVPrdCanRe, Boolean.valueOf(n12034DVPrdFulPe), A12034DVPrdFulPe, Boolean.valueOf(n12035DVPrdFulCC), A12035DVPrdFulCC, Boolean.valueOf(n12036DVPrdConCC), Short.valueOf(A12036DVPrdConCC), Boolean.valueOf(n12037DVPrdDscTe), A12037DVPrdDscTe, Boolean.valueOf(n12038DVPrdUniCo), Byte.valueOf(A12038DVPrdUniCo), Boolean.valueOf(n12039DVPrdUniCn), Byte.valueOf(A12039DVPrdUniCn), Boolean.valueOf(n12040DVPrdRefPr), A12040DVPrdRefPr, Boolean.valueOf(n12041DVPrdSus), A12041DVPrdSus, Boolean.valueOf(n12042DVPrdCalNe), A12042DVPrdCalNe, Boolean.valueOf(n12043DVPrdSit), Byte.valueOf(A12043DVPrdSit), Boolean.valueOf(n12044DVTipDtoCo), Byte.valueOf(A12044DVTipDtoCo), Boolean.valueOf(n12045DVPrdValSt), A12045DVPrdValSt, Boolean.valueOf(n12046DVDifValSt), A12046DVDifValSt, Boolean.valueOf(n12047DVPrdFecEn), A12047DVPrdFecEn, Boolean.valueOf(n12048DVPrdPosX), Short.valueOf(A12048DVPrdPosX), Boolean.valueOf(n12049DVPrdPosY), Short.valueOf(A12049DVPrdPosY), Boolean.valueOf(n12050DVPrdTip), A12050DVPrdTip, Boolean.valueOf(n12051DVPrdDqo), Short.valueOf(A12051DVPrdDqo), Boolean.valueOf(n12052DVPrdRev), A12052DVPrdRev, Boolean.valueOf(n12053DVPrdTnq), Byte.valueOf(A12053DVPrdTnq), Boolean.valueOf(n12054DVCCStKULi), Long.valueOf(A12054DVCCStKULi), Boolean.valueOf(n12055DVPrdUMeFo), Byte.valueOf(A12055DVPrdUMeFo), Boolean.valueOf(n12056DVPrdNom2), A12056DVPrdNom2, Boolean.valueOf(n12057DVPrdNum2), A12057DVPrdNum2, Boolean.valueOf(n12058DVPrdObs), A12058DVPrdObs, Boolean.valueOf(n12059DVPrdPreA2), A12059DVPrdPreA2, Boolean.valueOf(n12060DVPrdDensS), A12060DVPrdDensS, Boolean.valueOf(n12061DVPrdConcS), A12061DVPrdConcS, Boolean.valueOf(n12062DVPrdSalM), A12062DVPrdSalM, Boolean.valueOf(n12063DVPrdSolub),
                  A12063DVPrdSolub, Boolean.valueOf(n12064DVPrdNumCe), A12064DVPrdNumCe, Boolean.valueOf(n12065DVTipPrdCo), Short.valueOf(A12065DVTipPrdCo), Boolean.valueOf(n12066DVPrdNumct), A12066DVPrdNumct, Boolean.valueOf(n12067DVPrdNumc2), A12067DVPrdNumc2, Boolean.valueOf(n12068DVPrdHorMa), Byte.valueOf(A12068DVPrdHorMa), Boolean.valueOf(n12069DVPrdPreRe), A12069DVPrdPreRe, Boolean.valueOf(n12070DVMat_Lts), A12070DVMat_Lts, Boolean.valueOf(n12071DVPrdExiAc), A12071DVPrdExiAc, Boolean.valueOf(n12072DVAlmc_Ult), Integer.valueOf(A12072DVAlmc_Ult), Boolean.valueOf(n12073DVPrdAltAc), Byte.valueOf(A12073DVPrdAltAc), Boolean.valueOf(n12074DVPrdPesCo), Byte.valueOf(A12074DVPrdPesCo), Boolean.valueOf(n12075DVPrdPesTe), A12075DVPrdPesTe, Boolean.valueOf(n12076DVCC_Ultln), Long.valueOf(A12076DVCC_Ultln), Boolean.valueOf(n12077DVPrdSal), A12077DVPrdSal, Boolean.valueOf(n12078DVSubFamCo), Byte.valueOf(A12078DVSubFamCo), Boolean.valueOf(n12079DVPrdInc), A12079DVPrdInc, Boolean.valueOf(n12080DVPrdComp), A12080DVPrdComp, Boolean.valueOf(n12081DVPrdAox), A12081DVPrdAox, Boolean.valueOf(n12082DVPrdNCAS), A12082DVPrdNCAS, Boolean.valueOf(n12083DVPrdFT), A12083DVPrdFT, Boolean.valueOf(n12084DVPrdFFT), A12084DVPrdFFT, Boolean.valueOf(n12085DVPrdHS), A12085DVPrdHS, Boolean.valueOf(n12086DVPrdFHS), A12086DVPrdFHS, Boolean.valueOf(n12087DVPrdReach), A12087DVPrdReach, Boolean.valueOf(n12088DVPrdOkote), A12088DVPrdOkote, Boolean.valueOf(n12089DVPrdColId), A12089DVPrdColId, Boolean.valueOf(n12090DVPrdLote), A12090DVPrdLote, Boolean.valueOf(n12091DVPrdRTM), A12091DVPrdRTM, Boolean.valueOf(n12092DVPrdCtw1), A12092DVPrdCtw1, Boolean.valueOf(n12093DVPrdCtw2), A12093DVPrdCtw2, Boolean.valueOf(n12094DVPrdCtw3), A12094DVPrdCtw3, Boolean.valueOf(n12095DVPrdNroCA), A12095DVPrdNroCA, Boolean.valueOf(n12096DVPrdGots), A12096DVPrdGots, Boolean.valueOf(n12097DVPrdHm), A12097DVPrdHm, Boolean.valueOf(n12098DVPrdConct), Short.valueOf(A12098DVPrdConct), Boolean.valueOf(n12099DVPrdEINEC), A12099DVPrdEINEC, Boolean.valueOf(n12100DVPrdFunci), A12100DVPrdFunci, Boolean.valueOf(n12101DVPrdNmQu), A12101DVPrdNmQu, Boolean.valueOf(n12102DVPrdEqLP), A12102DVPrdEqLP, Boolean.valueOf(n12103DVPrdConc), A12103DVPrdConc, Boolean.valueOf(n12104DVPrdCtw4), A12104DVPrdCtw4, Boolean.valueOf(n12105DVPrdList), A12105DVPrdList, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
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
                        resetCaption1IU0( ) ;
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
            load1IU1678( ) ;
         }
         endLevel1IU1678( ) ;
      }
      closeExtendedTableCursors1IU1678( ) ;
   }

   public void update1IU1678( )
   {
      beforeValidate1IU1678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IU1678( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IU1678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IU1678( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IU1678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IU11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12003DVPrdNom), A12003DVPrdNom, Boolean.valueOf(n12004DVPrvNum), Integer.valueOf(A12004DVPrvNum), Boolean.valueOf(n12005DVPrdExiAl), A12005DVPrdExiAl, Boolean.valueOf(n12006DVPrdPreAc), A12006DVPrdPreAc, Boolean.valueOf(n12007DVUltLinEn), Short.valueOf(A12007DVUltLinEn), Boolean.valueOf(n12008DVPrdDetPa), A12008DVPrdDetPa, Boolean.valueOf(n12009DVValCod), Byte.valueOf(A12009DVValCod), Boolean.valueOf(n12010DVPrdFulEn), A12010DVPrdFulEn, Boolean.valueOf(n12011DVPrdCanPe), A12011DVPrdCanPe, Boolean.valueOf(n12012DVPrdRotRe), A12012DVPrdRotRe, Boolean.valueOf(n12013DVPrdPreMe), A12013DVPrdPreMe, Boolean.valueOf(n12014DVPrdRec), A12014DVPrdRec, Boolean.valueOf(n12015DVPrdPreAn), A12015DVPrdPreAn, Boolean.valueOf(n12016DVPrdFecPr), A12016DVPrdFecPr, Boolean.valueOf(n12017DVMovEspUL), Short.valueOf(A12017DVMovEspUL), Boolean.valueOf(n12018DVPrdExiCC), A12018DVPrdExiCC, Boolean.valueOf(n12019DVPrdUltDC), A12019DVPrdUltDC, Boolean.valueOf(n12020DVPrdUltEC), A12020DVPrdUltEC, Boolean.valueOf(n12021DVPrdUltCC), Short.valueOf(A12021DVPrdUltCC), Boolean.valueOf(n12022DVPrdExiCP), A12022DVPrdExiCP, Boolean.valueOf(n12023DVPrdDifCC), A12023DVPrdDifCC, Boolean.valueOf(n12024DVPrdFacCo), A12024DVPrdFacCo, Boolean.valueOf(n12025DVPrdConDi), A12025DVPrdConDi, Boolean.valueOf(n12026DVPrdStkMi), A12026DVPrdStkMi, Boolean.valueOf(n12027DVPrdStkMD), Short.valueOf(A12027DVPrdStkMD), Boolean.valueOf(n12028DVPrdDiaRo), Short.valueOf(A12028DVPrdDiaRo), Boolean.valueOf(n12029DVPrdPlaEn), Short.valueOf(A12029DVPrdPlaEn), Boolean.valueOf(n12030DVMetCod), Byte.valueOf(A12030DVMetCod), Boolean.valueOf(n12031DVPrdLotMi), Short.valueOf(A12031DVPrdLotMi), Boolean.valueOf(n12032DVPrdNumUc), A12032DVPrdNumUc, Boolean.valueOf(n12033DVPrdCanRe), A12033DVPrdCanRe, Boolean.valueOf(n12034DVPrdFulPe), A12034DVPrdFulPe, Boolean.valueOf(n12035DVPrdFulCC), A12035DVPrdFulCC, Boolean.valueOf(n12036DVPrdConCC), Short.valueOf(A12036DVPrdConCC), Boolean.valueOf(n12037DVPrdDscTe), A12037DVPrdDscTe, Boolean.valueOf(n12038DVPrdUniCo), Byte.valueOf(A12038DVPrdUniCo), Boolean.valueOf(n12039DVPrdUniCn), Byte.valueOf(A12039DVPrdUniCn), Boolean.valueOf(n12040DVPrdRefPr), A12040DVPrdRefPr, Boolean.valueOf(n12041DVPrdSus), A12041DVPrdSus, Boolean.valueOf(n12042DVPrdCalNe), A12042DVPrdCalNe, Boolean.valueOf(n12043DVPrdSit), Byte.valueOf(A12043DVPrdSit), Boolean.valueOf(n12044DVTipDtoCo), Byte.valueOf(A12044DVTipDtoCo), Boolean.valueOf(n12045DVPrdValSt), A12045DVPrdValSt, Boolean.valueOf(n12046DVDifValSt), A12046DVDifValSt, Boolean.valueOf(n12047DVPrdFecEn), A12047DVPrdFecEn, Boolean.valueOf(n12048DVPrdPosX), Short.valueOf(A12048DVPrdPosX), Boolean.valueOf(n12049DVPrdPosY), Short.valueOf(A12049DVPrdPosY), Boolean.valueOf(n12050DVPrdTip), A12050DVPrdTip, Boolean.valueOf(n12051DVPrdDqo), Short.valueOf(A12051DVPrdDqo), Boolean.valueOf(n12052DVPrdRev), A12052DVPrdRev, Boolean.valueOf(n12053DVPrdTnq), Byte.valueOf(A12053DVPrdTnq), Boolean.valueOf(n12054DVCCStKULi), Long.valueOf(A12054DVCCStKULi), Boolean.valueOf(n12055DVPrdUMeFo), Byte.valueOf(A12055DVPrdUMeFo), Boolean.valueOf(n12056DVPrdNom2), A12056DVPrdNom2, Boolean.valueOf(n12057DVPrdNum2), A12057DVPrdNum2, Boolean.valueOf(n12058DVPrdObs), A12058DVPrdObs, Boolean.valueOf(n12059DVPrdPreA2), A12059DVPrdPreA2, Boolean.valueOf(n12060DVPrdDensS), A12060DVPrdDensS, Boolean.valueOf(n12061DVPrdConcS), A12061DVPrdConcS, Boolean.valueOf(n12062DVPrdSalM), A12062DVPrdSalM, Boolean.valueOf(n12063DVPrdSolub), A12063DVPrdSolub,
                  Boolean.valueOf(n12064DVPrdNumCe), A12064DVPrdNumCe, Boolean.valueOf(n12065DVTipPrdCo), Short.valueOf(A12065DVTipPrdCo), Boolean.valueOf(n12066DVPrdNumct), A12066DVPrdNumct, Boolean.valueOf(n12067DVPrdNumc2), A12067DVPrdNumc2, Boolean.valueOf(n12068DVPrdHorMa), Byte.valueOf(A12068DVPrdHorMa), Boolean.valueOf(n12069DVPrdPreRe), A12069DVPrdPreRe, Boolean.valueOf(n12070DVMat_Lts), A12070DVMat_Lts, Boolean.valueOf(n12071DVPrdExiAc), A12071DVPrdExiAc, Boolean.valueOf(n12072DVAlmc_Ult), Integer.valueOf(A12072DVAlmc_Ult), Boolean.valueOf(n12073DVPrdAltAc), Byte.valueOf(A12073DVPrdAltAc), Boolean.valueOf(n12074DVPrdPesCo), Byte.valueOf(A12074DVPrdPesCo), Boolean.valueOf(n12075DVPrdPesTe), A12075DVPrdPesTe, Boolean.valueOf(n12076DVCC_Ultln), Long.valueOf(A12076DVCC_Ultln), Boolean.valueOf(n12077DVPrdSal), A12077DVPrdSal, Boolean.valueOf(n12078DVSubFamCo), Byte.valueOf(A12078DVSubFamCo), Boolean.valueOf(n12079DVPrdInc), A12079DVPrdInc, Boolean.valueOf(n12080DVPrdComp), A12080DVPrdComp, Boolean.valueOf(n12081DVPrdAox), A12081DVPrdAox, Boolean.valueOf(n12082DVPrdNCAS), A12082DVPrdNCAS, Boolean.valueOf(n12083DVPrdFT), A12083DVPrdFT, Boolean.valueOf(n12084DVPrdFFT), A12084DVPrdFFT, Boolean.valueOf(n12085DVPrdHS), A12085DVPrdHS, Boolean.valueOf(n12086DVPrdFHS), A12086DVPrdFHS, Boolean.valueOf(n12087DVPrdReach), A12087DVPrdReach, Boolean.valueOf(n12088DVPrdOkote), A12088DVPrdOkote, Boolean.valueOf(n12089DVPrdColId), A12089DVPrdColId, Boolean.valueOf(n12090DVPrdLote), A12090DVPrdLote, Boolean.valueOf(n12091DVPrdRTM), A12091DVPrdRTM, Boolean.valueOf(n12092DVPrdCtw1), A12092DVPrdCtw1, Boolean.valueOf(n12093DVPrdCtw2), A12093DVPrdCtw2, Boolean.valueOf(n12094DVPrdCtw3), A12094DVPrdCtw3, Boolean.valueOf(n12095DVPrdNroCA), A12095DVPrdNroCA, Boolean.valueOf(n12096DVPrdGots), A12096DVPrdGots, Boolean.valueOf(n12097DVPrdHm), A12097DVPrdHm, Boolean.valueOf(n12098DVPrdConct), Short.valueOf(A12098DVPrdConct), Boolean.valueOf(n12099DVPrdEINEC), A12099DVPrdEINEC, Boolean.valueOf(n12100DVPrdFunci), A12100DVPrdFunci, Boolean.valueOf(n12101DVPrdNmQu), A12101DVPrdNmQu, Boolean.valueOf(n12102DVPrdEqLP), A12102DVPrdEqLP, Boolean.valueOf(n12103DVPrdConc), A12103DVPrdConc, Boolean.valueOf(n12104DVPrdCtw4), A12104DVPrdCtw4, Boolean.valueOf(n12105DVPrdList), A12105DVPrdList, A396EmprCod, A11935DVPrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNDVPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IU1678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IU0( ) ;
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
         endLevel1IU1678( ) ;
      }
      closeExtendedTableCursors1IU1678( ) ;
   }

   public void deferredUpdate1IU1678( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IU1678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IU1678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IU1678( ) ;
         afterConfirm1IU1678( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IU1678( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IU12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1678 == 0 )
                     {
                        initAll1IU1678( ) ;
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
                     resetCaption1IU0( ) ;
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
      sMode1678 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IU1678( ) ;
      Gx_mode = sMode1678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IU1678( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01IU13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A11935DVPrdNum});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos n Proveedores Data View", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01IU14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A11935DVPrdNum});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DVPrd Alm", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01IU15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A11935DVPrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Productos Quimicos Data View", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01IU16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A11935DVPrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Movimientos Productos Data View", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel1IU1678( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IU1678( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdvproduc");
         if ( AnyError == 0 )
         {
            confirmValues1IU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvproduc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IU1678( )
   {
      /* Using cursor T01IU17 */
      pr_default.execute(15);
      RcdFound1678 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1678 = (short)(1) ;
         A396EmprCod = T01IU17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IU17_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IU1678( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1678 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1678 = (short)(1) ;
         A396EmprCod = T01IU17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IU17_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      }
   }

   public void scanEnd1IU1678( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1IU1678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IU1678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IU1678( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IU1678( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IU1678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IU1678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IU1678( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDVPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum_Enabled), 5, 0), true);
      edtDVPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNom_Enabled), 5, 0), true);
      edtDVPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrvNum_Enabled), 5, 0), true);
      edtDVPrdExiAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdExiAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdExiAl_Enabled), 5, 0), true);
      edtDVPrdPreAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPreAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPreAc_Enabled), 5, 0), true);
      edtDVUltLinEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVUltLinEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVUltLinEn_Enabled), 5, 0), true);
      edtDVPrdDetPa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDetPa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDetPa_Enabled), 5, 0), true);
      edtDVValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVValCod_Enabled), 5, 0), true);
      edtDVPrdFulEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFulEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFulEn_Enabled), 5, 0), true);
      edtDVPrdCanPe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCanPe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCanPe_Enabled), 5, 0), true);
      edtDVPrdRotRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdRotRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdRotRe_Enabled), 5, 0), true);
      edtDVPrdPreMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPreMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPreMe_Enabled), 5, 0), true);
      edtDVPrdRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdRec_Enabled), 5, 0), true);
      edtDVPrdPreAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPreAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPreAn_Enabled), 5, 0), true);
      edtDVPrdFecPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFecPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFecPr_Enabled), 5, 0), true);
      edtDVMovEspUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVMovEspUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVMovEspUL_Enabled), 5, 0), true);
      edtDVPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdExiCC_Enabled), 5, 0), true);
      edtDVPrdUltDC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUltDC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUltDC_Enabled), 5, 0), true);
      edtDVPrdUltEC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUltEC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUltEC_Enabled), 5, 0), true);
      edtDVPrdUltCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUltCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUltCC_Enabled), 5, 0), true);
      edtDVPrdExiCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdExiCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdExiCP_Enabled), 5, 0), true);
      edtDVPrdDifCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDifCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDifCC_Enabled), 5, 0), true);
      edtDVPrdFacCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFacCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFacCo_Enabled), 5, 0), true);
      edtDVPrdConDi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdConDi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdConDi_Enabled), 5, 0), true);
      edtDVPrdStkMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdStkMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdStkMi_Enabled), 5, 0), true);
      edtDVPrdStkMD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdStkMD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdStkMD_Enabled), 5, 0), true);
      edtDVPrdDiaRo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDiaRo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDiaRo_Enabled), 5, 0), true);
      edtDVPrdPlaEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPlaEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPlaEn_Enabled), 5, 0), true);
      edtDVMetCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVMetCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVMetCod_Enabled), 5, 0), true);
      edtDVPrdLotMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdLotMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdLotMi_Enabled), 5, 0), true);
      edtDVPrdNumUc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNumUc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNumUc_Enabled), 5, 0), true);
      edtDVPrdCanRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCanRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCanRe_Enabled), 5, 0), true);
      edtDVPrdFulPe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFulPe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFulPe_Enabled), 5, 0), true);
      edtDVPrdFulCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFulCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFulCC_Enabled), 5, 0), true);
      edtDVPrdConCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdConCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdConCC_Enabled), 5, 0), true);
      edtDVPrdDscTe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDscTe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDscTe_Enabled), 5, 0), true);
      edtDVPrdUniCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUniCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUniCo_Enabled), 5, 0), true);
      edtDVPrdUniCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUniCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUniCn_Enabled), 5, 0), true);
      edtDVPrdRefPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdRefPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdRefPr_Enabled), 5, 0), true);
      edtDVPrdSus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdSus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdSus_Enabled), 5, 0), true);
      edtDVPrdCalNe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCalNe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCalNe_Enabled), 5, 0), true);
      edtDVPrdSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdSit_Enabled), 5, 0), true);
      edtDVTipDtoCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVTipDtoCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVTipDtoCo_Enabled), 5, 0), true);
      edtDVPrdValSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdValSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdValSt_Enabled), 5, 0), true);
      edtDVDifValSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVDifValSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVDifValSt_Enabled), 5, 0), true);
      edtDVPrdFecEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFecEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFecEn_Enabled), 5, 0), true);
      edtDVPrdPosX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPosX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPosX_Enabled), 5, 0), true);
      edtDVPrdPosY_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPosY_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPosY_Enabled), 5, 0), true);
      edtDVPrdTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdTip_Enabled), 5, 0), true);
      edtDVPrdDqo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDqo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDqo_Enabled), 5, 0), true);
      edtDVPrdRev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdRev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdRev_Enabled), 5, 0), true);
      edtDVPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdTnq_Enabled), 5, 0), true);
      edtDVCCStKULi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCCStKULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCCStKULi_Enabled), 5, 0), true);
      edtDVPrdUMeFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdUMeFo_Enabled), 5, 0), true);
      edtDVPrdNom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNom2_Enabled), 5, 0), true);
      edtDVPrdNum2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum2_Enabled), 5, 0), true);
      edtDVPrdObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdObs_Enabled), 5, 0), true);
      edtDVPrdPreA2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPreA2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPreA2_Enabled), 5, 0), true);
      edtDVPrdDensS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdDensS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdDensS_Enabled), 5, 0), true);
      edtDVPrdConcS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdConcS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdConcS_Enabled), 5, 0), true);
      edtDVPrdSalM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdSalM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdSalM_Enabled), 5, 0), true);
      edtDVPrdSolub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdSolub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdSolub_Enabled), 5, 0), true);
      edtDVPrdNumCe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNumCe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNumCe_Enabled), 5, 0), true);
      edtDVTipPrdCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVTipPrdCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVTipPrdCo_Enabled), 5, 0), true);
      edtDVPrdNumct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNumct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNumct_Enabled), 5, 0), true);
      edtDVPrdNumc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNumc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNumc2_Enabled), 5, 0), true);
      edtDVPrdHorMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdHorMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdHorMa_Enabled), 5, 0), true);
      edtDVPrdPreRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPreRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPreRe_Enabled), 5, 0), true);
      edtDVMat_Lts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVMat_Lts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVMat_Lts_Enabled), 5, 0), true);
      edtDVPrdExiAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdExiAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdExiAc_Enabled), 5, 0), true);
      edtDVAlmc_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVAlmc_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVAlmc_Ult_Enabled), 5, 0), true);
      edtDVPrdAltAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdAltAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdAltAc_Enabled), 5, 0), true);
      edtDVPrdPesCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPesCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPesCo_Enabled), 5, 0), true);
      edtDVPrdPesTe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdPesTe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdPesTe_Enabled), 5, 0), true);
      edtDVCC_Ultln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Ultln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Ultln_Enabled), 5, 0), true);
      edtDVPrdSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdSal_Enabled), 5, 0), true);
      edtDVSubFamCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVSubFamCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVSubFamCo_Enabled), 5, 0), true);
      edtDVPrdInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdInc_Enabled), 5, 0), true);
      edtDVPrdComp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdComp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdComp_Enabled), 5, 0), true);
      edtDVPrdAox_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdAox_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdAox_Enabled), 5, 0), true);
      edtDVPrdNCAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNCAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNCAS_Enabled), 5, 0), true);
      edtDVPrdFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFT_Enabled), 5, 0), true);
      edtDVPrdFFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFFT_Enabled), 5, 0), true);
      edtDVPrdHS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdHS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdHS_Enabled), 5, 0), true);
      edtDVPrdFHS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFHS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFHS_Enabled), 5, 0), true);
      edtDVPrdReach_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdReach_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdReach_Enabled), 5, 0), true);
      edtDVPrdOkote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdOkote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdOkote_Enabled), 5, 0), true);
      edtDVPrdColId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdColId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdColId_Enabled), 5, 0), true);
      edtDVPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdLote_Enabled), 5, 0), true);
      edtDVPrdRTM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdRTM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdRTM_Enabled), 5, 0), true);
      edtDVPrdCtw1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCtw1_Enabled), 5, 0), true);
      edtDVPrdCtw2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCtw2_Enabled), 5, 0), true);
      edtDVPrdCtw3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCtw3_Enabled), 5, 0), true);
      edtDVPrdNroCA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNroCA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNroCA_Enabled), 5, 0), true);
      edtDVPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdGots_Enabled), 5, 0), true);
      edtDVPrdHm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdHm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdHm_Enabled), 5, 0), true);
      edtDVPrdConct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdConct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdConct_Enabled), 5, 0), true);
      edtDVPrdEINEC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdEINEC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdEINEC_Enabled), 5, 0), true);
      edtDVPrdFunci_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdFunci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdFunci_Enabled), 5, 0), true);
      edtDVPrdNmQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNmQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNmQu_Enabled), 5, 0), true);
      edtDVPrdEqLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdEqLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdEqLP_Enabled), 5, 0), true);
      edtDVPrdConc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdConc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdConc_Enabled), 5, 0), true);
      edtDVPrdCtw4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdCtw4_Enabled), 5, 0), true);
      edtDVPrdList_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdList_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdList_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IU1678( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IU0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdvproduc", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12003DVPrdNom", GXutil.rtrim( Z12003DVPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12004DVPrvNum", GXutil.ltrim( localUtil.ntoc( Z12004DVPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12005DVPrdExiAl", GXutil.ltrim( localUtil.ntoc( Z12005DVPrdExiAl, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12006DVPrdPreAc", GXutil.ltrim( localUtil.ntoc( Z12006DVPrdPreAc, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12007DVUltLinEn", GXutil.ltrim( localUtil.ntoc( Z12007DVUltLinEn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12008DVPrdDetPa", GXutil.rtrim( Z12008DVPrdDetPa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12009DVValCod", GXutil.ltrim( localUtil.ntoc( Z12009DVValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12010DVPrdFulEn", localUtil.dtoc( Z12010DVPrdFulEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12011DVPrdCanPe", GXutil.ltrim( localUtil.ntoc( Z12011DVPrdCanPe, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12012DVPrdRotRe", GXutil.ltrim( localUtil.ntoc( Z12012DVPrdRotRe, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12013DVPrdPreMe", GXutil.ltrim( localUtil.ntoc( Z12013DVPrdPreMe, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12014DVPrdRec", GXutil.rtrim( Z12014DVPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12015DVPrdPreAn", GXutil.ltrim( localUtil.ntoc( Z12015DVPrdPreAn, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12016DVPrdFecPr", localUtil.dtoc( Z12016DVPrdFecPr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12017DVMovEspUL", GXutil.ltrim( localUtil.ntoc( Z12017DVMovEspUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12018DVPrdExiCC", GXutil.ltrim( localUtil.ntoc( Z12018DVPrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12019DVPrdUltDC", GXutil.ltrim( localUtil.ntoc( Z12019DVPrdUltDC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12020DVPrdUltEC", GXutil.ltrim( localUtil.ntoc( Z12020DVPrdUltEC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12021DVPrdUltCC", GXutil.ltrim( localUtil.ntoc( Z12021DVPrdUltCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12022DVPrdExiCP", GXutil.ltrim( localUtil.ntoc( Z12022DVPrdExiCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12023DVPrdDifCC", GXutil.ltrim( localUtil.ntoc( Z12023DVPrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12024DVPrdFacCo", GXutil.ltrim( localUtil.ntoc( Z12024DVPrdFacCo, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12025DVPrdConDi", GXutil.ltrim( localUtil.ntoc( Z12025DVPrdConDi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12026DVPrdStkMi", GXutil.ltrim( localUtil.ntoc( Z12026DVPrdStkMi, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12027DVPrdStkMD", GXutil.ltrim( localUtil.ntoc( Z12027DVPrdStkMD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12028DVPrdDiaRo", GXutil.ltrim( localUtil.ntoc( Z12028DVPrdDiaRo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12029DVPrdPlaEn", GXutil.ltrim( localUtil.ntoc( Z12029DVPrdPlaEn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12030DVMetCod", GXutil.ltrim( localUtil.ntoc( Z12030DVMetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12031DVPrdLotMi", GXutil.ltrim( localUtil.ntoc( Z12031DVPrdLotMi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12032DVPrdNumUc", GXutil.ltrim( localUtil.ntoc( Z12032DVPrdNumUc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12033DVPrdCanRe", GXutil.ltrim( localUtil.ntoc( Z12033DVPrdCanRe, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12034DVPrdFulPe", localUtil.dtoc( Z12034DVPrdFulPe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12035DVPrdFulCC", localUtil.dtoc( Z12035DVPrdFulCC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12036DVPrdConCC", GXutil.ltrim( localUtil.ntoc( Z12036DVPrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12037DVPrdDscTe", GXutil.rtrim( Z12037DVPrdDscTe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12038DVPrdUniCo", GXutil.ltrim( localUtil.ntoc( Z12038DVPrdUniCo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12039DVPrdUniCn", GXutil.ltrim( localUtil.ntoc( Z12039DVPrdUniCn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12040DVPrdRefPr", GXutil.rtrim( Z12040DVPrdRefPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12041DVPrdSus", GXutil.rtrim( Z12041DVPrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12042DVPrdCalNe", GXutil.rtrim( Z12042DVPrdCalNe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12043DVPrdSit", GXutil.ltrim( localUtil.ntoc( Z12043DVPrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12044DVTipDtoCo", GXutil.ltrim( localUtil.ntoc( Z12044DVTipDtoCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12045DVPrdValSt", GXutil.ltrim( localUtil.ntoc( Z12045DVPrdValSt, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12046DVDifValSt", GXutil.ltrim( localUtil.ntoc( Z12046DVDifValSt, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12047DVPrdFecEn", localUtil.dtoc( Z12047DVPrdFecEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12048DVPrdPosX", GXutil.ltrim( localUtil.ntoc( Z12048DVPrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12049DVPrdPosY", GXutil.ltrim( localUtil.ntoc( Z12049DVPrdPosY, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12050DVPrdTip", GXutil.rtrim( Z12050DVPrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12051DVPrdDqo", GXutil.ltrim( localUtil.ntoc( Z12051DVPrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12052DVPrdRev", GXutil.rtrim( Z12052DVPrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12053DVPrdTnq", GXutil.ltrim( localUtil.ntoc( Z12053DVPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12054DVCCStKULi", GXutil.ltrim( localUtil.ntoc( Z12054DVCCStKULi, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12055DVPrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z12055DVPrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12056DVPrdNom2", GXutil.rtrim( Z12056DVPrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12057DVPrdNum2", GXutil.rtrim( Z12057DVPrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12059DVPrdPreA2", GXutil.ltrim( localUtil.ntoc( Z12059DVPrdPreA2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12060DVPrdDensS", GXutil.ltrim( localUtil.ntoc( Z12060DVPrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12061DVPrdConcS", GXutil.ltrim( localUtil.ntoc( Z12061DVPrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12062DVPrdSalM", GXutil.rtrim( Z12062DVPrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12063DVPrdSolub", GXutil.ltrim( localUtil.ntoc( Z12063DVPrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12064DVPrdNumCe", GXutil.rtrim( Z12064DVPrdNumCe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12065DVTipPrdCo", GXutil.ltrim( localUtil.ntoc( Z12065DVTipPrdCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12066DVPrdNumct", GXutil.ltrim( localUtil.ntoc( Z12066DVPrdNumct, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12067DVPrdNumc2", GXutil.ltrim( localUtil.ntoc( Z12067DVPrdNumc2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12068DVPrdHorMa", GXutil.ltrim( localUtil.ntoc( Z12068DVPrdHorMa, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12069DVPrdPreRe", GXutil.ltrim( localUtil.ntoc( Z12069DVPrdPreRe, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12070DVMat_Lts", GXutil.ltrim( localUtil.ntoc( Z12070DVMat_Lts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12071DVPrdExiAc", GXutil.ltrim( localUtil.ntoc( Z12071DVPrdExiAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12072DVAlmc_Ult", GXutil.ltrim( localUtil.ntoc( Z12072DVAlmc_Ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12073DVPrdAltAc", GXutil.ltrim( localUtil.ntoc( Z12073DVPrdAltAc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12074DVPrdPesCo", GXutil.ltrim( localUtil.ntoc( Z12074DVPrdPesCo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12075DVPrdPesTe", GXutil.rtrim( Z12075DVPrdPesTe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12076DVCC_Ultln", GXutil.ltrim( localUtil.ntoc( Z12076DVCC_Ultln, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12077DVPrdSal", GXutil.rtrim( Z12077DVPrdSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12078DVSubFamCo", GXutil.ltrim( localUtil.ntoc( Z12078DVSubFamCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12079DVPrdInc", GXutil.rtrim( Z12079DVPrdInc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12080DVPrdComp", GXutil.rtrim( Z12080DVPrdComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12081DVPrdAox", GXutil.ltrim( localUtil.ntoc( Z12081DVPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12082DVPrdNCAS", GXutil.rtrim( Z12082DVPrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12083DVPrdFT", GXutil.rtrim( Z12083DVPrdFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12084DVPrdFFT", localUtil.dtoc( Z12084DVPrdFFT, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12085DVPrdHS", GXutil.rtrim( Z12085DVPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12086DVPrdFHS", localUtil.dtoc( Z12086DVPrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12087DVPrdReach", GXutil.rtrim( Z12087DVPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12088DVPrdOkote", GXutil.rtrim( Z12088DVPrdOkote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12089DVPrdColId", GXutil.rtrim( Z12089DVPrdColId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12090DVPrdLote", GXutil.rtrim( Z12090DVPrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12091DVPrdRTM", GXutil.rtrim( Z12091DVPrdRTM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12092DVPrdCtw1", GXutil.rtrim( Z12092DVPrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12093DVPrdCtw2", GXutil.rtrim( Z12093DVPrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12094DVPrdCtw3", GXutil.rtrim( Z12094DVPrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12095DVPrdNroCA", GXutil.rtrim( Z12095DVPrdNroCA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12096DVPrdGots", GXutil.rtrim( Z12096DVPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12097DVPrdHm", GXutil.rtrim( Z12097DVPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12098DVPrdConct", GXutil.ltrim( localUtil.ntoc( Z12098DVPrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12099DVPrdEINEC", GXutil.rtrim( Z12099DVPrdEINEC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12100DVPrdFunci", GXutil.rtrim( Z12100DVPrdFunci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12101DVPrdNmQu", Z12101DVPrdNmQu);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12102DVPrdEqLP", GXutil.rtrim( Z12102DVPrdEqLP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12103DVPrdConc", GXutil.ltrim( localUtil.ntoc( Z12103DVPrdConc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12104DVPrdCtw4", GXutil.rtrim( Z12104DVPrdCtw4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12105DVPrdList", GXutil.rtrim( Z12105DVPrdList));
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
      return formatLink("app.tdvproduc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDVProduc" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos Data View", "") ;
   }

   public void initializeNonKey1IU1678( )
   {
      A12003DVPrdNom = "" ;
      n12003DVPrdNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12003DVPrdNom", A12003DVPrdNom);
      A12004DVPrvNum = 0 ;
      n12004DVPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12004DVPrvNum), 6, 0));
      A12005DVPrdExiAl = DecimalUtil.ZERO ;
      n12005DVPrdExiAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrimstr( A12005DVPrdExiAl, 12, 4));
      A12006DVPrdPreAc = DecimalUtil.ZERO ;
      n12006DVPrdPreAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrimstr( A12006DVPrdPreAc, 14, 5));
      A12007DVUltLinEn = (short)(0) ;
      n12007DVUltLinEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12007DVUltLinEn), 4, 0));
      A12008DVPrdDetPa = "" ;
      n12008DVPrdDetPa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12008DVPrdDetPa", A12008DVPrdDetPa);
      A12009DVValCod = (byte)(0) ;
      n12009DVValCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.str( A12009DVValCod, 1, 0));
      A12010DVPrdFulEn = GXutil.nullDate() ;
      n12010DVPrdFulEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
      A12011DVPrdCanPe = DecimalUtil.ZERO ;
      n12011DVPrdCanPe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrimstr( A12011DVPrdCanPe, 12, 4));
      A12012DVPrdRotRe = DecimalUtil.ZERO ;
      n12012DVPrdRotRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrimstr( A12012DVPrdRotRe, 12, 5));
      A12013DVPrdPreMe = DecimalUtil.ZERO ;
      n12013DVPrdPreMe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrimstr( A12013DVPrdPreMe, 14, 5));
      A12014DVPrdRec = "" ;
      n12014DVPrdRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12014DVPrdRec", A12014DVPrdRec);
      A12015DVPrdPreAn = DecimalUtil.ZERO ;
      n12015DVPrdPreAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrimstr( A12015DVPrdPreAn, 14, 5));
      A12016DVPrdFecPr = GXutil.nullDate() ;
      n12016DVPrdFecPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
      A12017DVMovEspUL = (short)(0) ;
      n12017DVMovEspUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12017DVMovEspUL), 3, 0));
      A12018DVPrdExiCC = DecimalUtil.ZERO ;
      n12018DVPrdExiCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrimstr( A12018DVPrdExiCC, 12, 4));
      A12019DVPrdUltDC = DecimalUtil.ZERO ;
      n12019DVPrdUltDC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrimstr( A12019DVPrdUltDC, 8, 2));
      A12020DVPrdUltEC = DecimalUtil.ZERO ;
      n12020DVPrdUltEC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrimstr( A12020DVPrdUltEC, 8, 2));
      A12021DVPrdUltCC = (short)(0) ;
      n12021DVPrdUltCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12021DVPrdUltCC), 4, 0));
      A12022DVPrdExiCP = DecimalUtil.ZERO ;
      n12022DVPrdExiCP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrimstr( A12022DVPrdExiCP, 8, 2));
      A12023DVPrdDifCC = DecimalUtil.ZERO ;
      n12023DVPrdDifCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrimstr( A12023DVPrdDifCC, 8, 2));
      A12024DVPrdFacCo = DecimalUtil.ZERO ;
      n12024DVPrdFacCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrimstr( A12024DVPrdFacCo, 7, 4));
      A12025DVPrdConDi = DecimalUtil.ZERO ;
      n12025DVPrdConDi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrimstr( A12025DVPrdConDi, 7, 2));
      A12026DVPrdStkMi = DecimalUtil.ZERO ;
      n12026DVPrdStkMi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrimstr( A12026DVPrdStkMi, 8, 2));
      A12027DVPrdStkMD = (short)(0) ;
      n12027DVPrdStkMD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12027DVPrdStkMD), 4, 0));
      A12028DVPrdDiaRo = (short)(0) ;
      n12028DVPrdDiaRo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12028DVPrdDiaRo), 3, 0));
      A12029DVPrdPlaEn = (short)(0) ;
      n12029DVPrdPlaEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12029DVPrdPlaEn), 3, 0));
      A12030DVMetCod = (byte)(0) ;
      n12030DVMetCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.str( A12030DVMetCod, 1, 0));
      A12031DVPrdLotMi = (short)(0) ;
      n12031DVPrdLotMi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12031DVPrdLotMi), 4, 0));
      A12032DVPrdNumUc = DecimalUtil.ZERO ;
      n12032DVPrdNumUc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrimstr( A12032DVPrdNumUc, 7, 2));
      A12033DVPrdCanRe = DecimalUtil.ZERO ;
      n12033DVPrdCanRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrimstr( A12033DVPrdCanRe, 12, 4));
      A12034DVPrdFulPe = GXutil.nullDate() ;
      n12034DVPrdFulPe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
      A12035DVPrdFulCC = GXutil.nullDate() ;
      n12035DVPrdFulCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
      A12036DVPrdConCC = (short)(0) ;
      n12036DVPrdConCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12036DVPrdConCC), 4, 0));
      A12037DVPrdDscTe = "" ;
      n12037DVPrdDscTe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12037DVPrdDscTe", A12037DVPrdDscTe);
      A12038DVPrdUniCo = (byte)(0) ;
      n12038DVPrdUniCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.str( A12038DVPrdUniCo, 1, 0));
      A12039DVPrdUniCn = (byte)(0) ;
      n12039DVPrdUniCn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.str( A12039DVPrdUniCn, 1, 0));
      A12040DVPrdRefPr = "" ;
      n12040DVPrdRefPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12040DVPrdRefPr", A12040DVPrdRefPr);
      A12041DVPrdSus = "" ;
      n12041DVPrdSus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12041DVPrdSus", A12041DVPrdSus);
      A12042DVPrdCalNe = "" ;
      n12042DVPrdCalNe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12042DVPrdCalNe", A12042DVPrdCalNe);
      A12043DVPrdSit = (byte)(0) ;
      n12043DVPrdSit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.str( A12043DVPrdSit, 1, 0));
      A12044DVTipDtoCo = (byte)(0) ;
      n12044DVTipDtoCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12044DVTipDtoCo), 2, 0));
      A12045DVPrdValSt = DecimalUtil.ZERO ;
      n12045DVPrdValSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrimstr( A12045DVPrdValSt, 11, 2));
      A12046DVDifValSt = DecimalUtil.ZERO ;
      n12046DVDifValSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrimstr( A12046DVDifValSt, 11, 2));
      A12047DVPrdFecEn = GXutil.nullDate() ;
      n12047DVPrdFecEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
      A12048DVPrdPosX = (short)(0) ;
      n12048DVPrdPosX = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12048DVPrdPosX), 4, 0));
      A12049DVPrdPosY = (short)(0) ;
      n12049DVPrdPosY = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12049DVPrdPosY), 4, 0));
      A12050DVPrdTip = "" ;
      n12050DVPrdTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12050DVPrdTip", A12050DVPrdTip);
      A12051DVPrdDqo = (short)(0) ;
      n12051DVPrdDqo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12051DVPrdDqo), 4, 0));
      A12052DVPrdRev = "" ;
      n12052DVPrdRev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12052DVPrdRev", A12052DVPrdRev);
      A12053DVPrdTnq = (byte)(0) ;
      n12053DVPrdTnq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12053DVPrdTnq), 2, 0));
      A12054DVCCStKULi = 0 ;
      n12054DVCCStKULi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12054DVCCStKULi), 12, 0));
      A12055DVPrdUMeFo = (byte)(0) ;
      n12055DVPrdUMeFo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.str( A12055DVPrdUMeFo, 1, 0));
      A12056DVPrdNom2 = "" ;
      n12056DVPrdNom2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12056DVPrdNom2", A12056DVPrdNom2);
      A12057DVPrdNum2 = "" ;
      n12057DVPrdNum2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12057DVPrdNum2", A12057DVPrdNum2);
      A12058DVPrdObs = "" ;
      n12058DVPrdObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12058DVPrdObs", A12058DVPrdObs);
      A12059DVPrdPreA2 = DecimalUtil.ZERO ;
      n12059DVPrdPreA2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrimstr( A12059DVPrdPreA2, 14, 5));
      A12060DVPrdDensS = DecimalUtil.ZERO ;
      n12060DVPrdDensS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrimstr( A12060DVPrdDensS, 7, 3));
      A12061DVPrdConcS = DecimalUtil.ZERO ;
      n12061DVPrdConcS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrimstr( A12061DVPrdConcS, 7, 3));
      A12062DVPrdSalM = "" ;
      n12062DVPrdSalM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12062DVPrdSalM", A12062DVPrdSalM);
      A12063DVPrdSolub = DecimalUtil.ZERO ;
      n12063DVPrdSolub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrimstr( A12063DVPrdSolub, 7, 2));
      A12064DVPrdNumCe = "" ;
      n12064DVPrdNumCe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12064DVPrdNumCe", A12064DVPrdNumCe);
      A12065DVTipPrdCo = (short)(0) ;
      n12065DVTipPrdCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12065DVTipPrdCo), 4, 0));
      A12066DVPrdNumct = DecimalUtil.ZERO ;
      n12066DVPrdNumct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrimstr( A12066DVPrdNumct, 6, 2));
      A12067DVPrdNumc2 = DecimalUtil.ZERO ;
      n12067DVPrdNumc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrimstr( A12067DVPrdNumc2, 6, 2));
      A12068DVPrdHorMa = (byte)(0) ;
      n12068DVPrdHorMa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12068DVPrdHorMa), 2, 0));
      A12069DVPrdPreRe = DecimalUtil.ZERO ;
      n12069DVPrdPreRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrimstr( A12069DVPrdPreRe, 14, 5));
      A12070DVMat_Lts = DecimalUtil.ZERO ;
      n12070DVMat_Lts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrimstr( A12070DVMat_Lts, 9, 2));
      A12071DVPrdExiAc = DecimalUtil.ZERO ;
      n12071DVPrdExiAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrimstr( A12071DVPrdExiAc, 12, 4));
      A12072DVAlmc_Ult = 0 ;
      n12072DVAlmc_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12072DVAlmc_Ult), 6, 0));
      A12073DVPrdAltAc = (byte)(0) ;
      n12073DVPrdAltAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.str( A12073DVPrdAltAc, 1, 0));
      A12074DVPrdPesCo = (byte)(0) ;
      n12074DVPrdPesCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.str( A12074DVPrdPesCo, 1, 0));
      A12075DVPrdPesTe = "" ;
      n12075DVPrdPesTe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12075DVPrdPesTe", A12075DVPrdPesTe);
      A12076DVCC_Ultln = 0 ;
      n12076DVCC_Ultln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12076DVCC_Ultln), 12, 0));
      A12077DVPrdSal = "" ;
      n12077DVPrdSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12077DVPrdSal", A12077DVPrdSal);
      A12078DVSubFamCo = (byte)(0) ;
      n12078DVSubFamCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12078DVSubFamCo), 2, 0));
      A12079DVPrdInc = "" ;
      n12079DVPrdInc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12079DVPrdInc", A12079DVPrdInc);
      A12080DVPrdComp = "" ;
      n12080DVPrdComp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12080DVPrdComp", A12080DVPrdComp);
      A12081DVPrdAox = DecimalUtil.ZERO ;
      n12081DVPrdAox = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrimstr( A12081DVPrdAox, 6, 2));
      A12082DVPrdNCAS = "" ;
      n12082DVPrdNCAS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12082DVPrdNCAS", A12082DVPrdNCAS);
      A12083DVPrdFT = "" ;
      n12083DVPrdFT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12083DVPrdFT", A12083DVPrdFT);
      A12084DVPrdFFT = GXutil.nullDate() ;
      n12084DVPrdFFT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
      A12085DVPrdHS = "" ;
      n12085DVPrdHS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12085DVPrdHS", A12085DVPrdHS);
      A12086DVPrdFHS = GXutil.nullDate() ;
      n12086DVPrdFHS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
      A12087DVPrdReach = "" ;
      n12087DVPrdReach = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12087DVPrdReach", A12087DVPrdReach);
      A12088DVPrdOkote = "" ;
      n12088DVPrdOkote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12088DVPrdOkote", A12088DVPrdOkote);
      A12089DVPrdColId = "" ;
      n12089DVPrdColId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12089DVPrdColId", A12089DVPrdColId);
      A12090DVPrdLote = "" ;
      n12090DVPrdLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12090DVPrdLote", A12090DVPrdLote);
      A12091DVPrdRTM = "" ;
      n12091DVPrdRTM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12091DVPrdRTM", A12091DVPrdRTM);
      A12092DVPrdCtw1 = "" ;
      n12092DVPrdCtw1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12092DVPrdCtw1", A12092DVPrdCtw1);
      A12093DVPrdCtw2 = "" ;
      n12093DVPrdCtw2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12093DVPrdCtw2", A12093DVPrdCtw2);
      A12094DVPrdCtw3 = "" ;
      n12094DVPrdCtw3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12094DVPrdCtw3", A12094DVPrdCtw3);
      A12095DVPrdNroCA = "" ;
      n12095DVPrdNroCA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12095DVPrdNroCA", A12095DVPrdNroCA);
      A12096DVPrdGots = "" ;
      n12096DVPrdGots = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12096DVPrdGots", A12096DVPrdGots);
      A12097DVPrdHm = "" ;
      n12097DVPrdHm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12097DVPrdHm", A12097DVPrdHm);
      A12098DVPrdConct = (short)(0) ;
      n12098DVPrdConct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12098DVPrdConct), 3, 0));
      A12099DVPrdEINEC = "" ;
      n12099DVPrdEINEC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12099DVPrdEINEC", A12099DVPrdEINEC);
      A12100DVPrdFunci = "" ;
      n12100DVPrdFunci = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12100DVPrdFunci", A12100DVPrdFunci);
      A12101DVPrdNmQu = "" ;
      n12101DVPrdNmQu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12101DVPrdNmQu", A12101DVPrdNmQu);
      A12102DVPrdEqLP = "" ;
      n12102DVPrdEqLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12102DVPrdEqLP", A12102DVPrdEqLP);
      A12103DVPrdConc = DecimalUtil.ZERO ;
      n12103DVPrdConc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrimstr( A12103DVPrdConc, 6, 2));
      A12104DVPrdCtw4 = "" ;
      n12104DVPrdCtw4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12104DVPrdCtw4", A12104DVPrdCtw4);
      A12105DVPrdList = "" ;
      n12105DVPrdList = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12105DVPrdList", A12105DVPrdList);
      Z12003DVPrdNom = "" ;
      Z12004DVPrvNum = 0 ;
      Z12005DVPrdExiAl = DecimalUtil.ZERO ;
      Z12006DVPrdPreAc = DecimalUtil.ZERO ;
      Z12007DVUltLinEn = (short)(0) ;
      Z12008DVPrdDetPa = "" ;
      Z12009DVValCod = (byte)(0) ;
      Z12010DVPrdFulEn = GXutil.nullDate() ;
      Z12011DVPrdCanPe = DecimalUtil.ZERO ;
      Z12012DVPrdRotRe = DecimalUtil.ZERO ;
      Z12013DVPrdPreMe = DecimalUtil.ZERO ;
      Z12014DVPrdRec = "" ;
      Z12015DVPrdPreAn = DecimalUtil.ZERO ;
      Z12016DVPrdFecPr = GXutil.nullDate() ;
      Z12017DVMovEspUL = (short)(0) ;
      Z12018DVPrdExiCC = DecimalUtil.ZERO ;
      Z12019DVPrdUltDC = DecimalUtil.ZERO ;
      Z12020DVPrdUltEC = DecimalUtil.ZERO ;
      Z12021DVPrdUltCC = (short)(0) ;
      Z12022DVPrdExiCP = DecimalUtil.ZERO ;
      Z12023DVPrdDifCC = DecimalUtil.ZERO ;
      Z12024DVPrdFacCo = DecimalUtil.ZERO ;
      Z12025DVPrdConDi = DecimalUtil.ZERO ;
      Z12026DVPrdStkMi = DecimalUtil.ZERO ;
      Z12027DVPrdStkMD = (short)(0) ;
      Z12028DVPrdDiaRo = (short)(0) ;
      Z12029DVPrdPlaEn = (short)(0) ;
      Z12030DVMetCod = (byte)(0) ;
      Z12031DVPrdLotMi = (short)(0) ;
      Z12032DVPrdNumUc = DecimalUtil.ZERO ;
      Z12033DVPrdCanRe = DecimalUtil.ZERO ;
      Z12034DVPrdFulPe = GXutil.nullDate() ;
      Z12035DVPrdFulCC = GXutil.nullDate() ;
      Z12036DVPrdConCC = (short)(0) ;
      Z12037DVPrdDscTe = "" ;
      Z12038DVPrdUniCo = (byte)(0) ;
      Z12039DVPrdUniCn = (byte)(0) ;
      Z12040DVPrdRefPr = "" ;
      Z12041DVPrdSus = "" ;
      Z12042DVPrdCalNe = "" ;
      Z12043DVPrdSit = (byte)(0) ;
      Z12044DVTipDtoCo = (byte)(0) ;
      Z12045DVPrdValSt = DecimalUtil.ZERO ;
      Z12046DVDifValSt = DecimalUtil.ZERO ;
      Z12047DVPrdFecEn = GXutil.nullDate() ;
      Z12048DVPrdPosX = (short)(0) ;
      Z12049DVPrdPosY = (short)(0) ;
      Z12050DVPrdTip = "" ;
      Z12051DVPrdDqo = (short)(0) ;
      Z12052DVPrdRev = "" ;
      Z12053DVPrdTnq = (byte)(0) ;
      Z12054DVCCStKULi = 0 ;
      Z12055DVPrdUMeFo = (byte)(0) ;
      Z12056DVPrdNom2 = "" ;
      Z12057DVPrdNum2 = "" ;
      Z12059DVPrdPreA2 = DecimalUtil.ZERO ;
      Z12060DVPrdDensS = DecimalUtil.ZERO ;
      Z12061DVPrdConcS = DecimalUtil.ZERO ;
      Z12062DVPrdSalM = "" ;
      Z12063DVPrdSolub = DecimalUtil.ZERO ;
      Z12064DVPrdNumCe = "" ;
      Z12065DVTipPrdCo = (short)(0) ;
      Z12066DVPrdNumct = DecimalUtil.ZERO ;
      Z12067DVPrdNumc2 = DecimalUtil.ZERO ;
      Z12068DVPrdHorMa = (byte)(0) ;
      Z12069DVPrdPreRe = DecimalUtil.ZERO ;
      Z12070DVMat_Lts = DecimalUtil.ZERO ;
      Z12071DVPrdExiAc = DecimalUtil.ZERO ;
      Z12072DVAlmc_Ult = 0 ;
      Z12073DVPrdAltAc = (byte)(0) ;
      Z12074DVPrdPesCo = (byte)(0) ;
      Z12075DVPrdPesTe = "" ;
      Z12076DVCC_Ultln = 0 ;
      Z12077DVPrdSal = "" ;
      Z12078DVSubFamCo = (byte)(0) ;
      Z12079DVPrdInc = "" ;
      Z12080DVPrdComp = "" ;
      Z12081DVPrdAox = DecimalUtil.ZERO ;
      Z12082DVPrdNCAS = "" ;
      Z12083DVPrdFT = "" ;
      Z12084DVPrdFFT = GXutil.nullDate() ;
      Z12085DVPrdHS = "" ;
      Z12086DVPrdFHS = GXutil.nullDate() ;
      Z12087DVPrdReach = "" ;
      Z12088DVPrdOkote = "" ;
      Z12089DVPrdColId = "" ;
      Z12090DVPrdLote = "" ;
      Z12091DVPrdRTM = "" ;
      Z12092DVPrdCtw1 = "" ;
      Z12093DVPrdCtw2 = "" ;
      Z12094DVPrdCtw3 = "" ;
      Z12095DVPrdNroCA = "" ;
      Z12096DVPrdGots = "" ;
      Z12097DVPrdHm = "" ;
      Z12098DVPrdConct = (short)(0) ;
      Z12099DVPrdEINEC = "" ;
      Z12100DVPrdFunci = "" ;
      Z12101DVPrdNmQu = "" ;
      Z12102DVPrdEqLP = "" ;
      Z12103DVPrdConc = DecimalUtil.ZERO ;
      Z12104DVPrdCtw4 = "" ;
      Z12105DVPrdList = "" ;
   }

   public void initAll1IU1678( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11935DVPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      initializeNonKey1IU1678( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583082", true, true);
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
      httpContext.AddJavascriptSource("tdvproduc.js", "?20268241583083", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDVPrdNom_Internalname = "DVPRDNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDVPrvNum_Internalname = "DVPRVNUM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDVPrdExiAl_Internalname = "DVPRDEXIAL" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDVPrdPreAc_Internalname = "DVPRDPREAC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDVUltLinEn_Internalname = "DVULTLINEN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDVPrdDetPa_Internalname = "DVPRDDETPA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDVValCod_Internalname = "DVVALCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDVPrdFulEn_Internalname = "DVPRDFULEN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDVPrdCanPe_Internalname = "DVPRDCANPE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDVPrdRotRe_Internalname = "DVPRDROTRE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDVPrdPreMe_Internalname = "DVPRDPREME" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDVPrdRec_Internalname = "DVPRDREC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDVPrdPreAn_Internalname = "DVPRDPREAN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDVPrdFecPr_Internalname = "DVPRDFECPR" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDVMovEspUL_Internalname = "DVMOVESPUL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDVPrdExiCC_Internalname = "DVPRDEXICC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDVPrdUltDC_Internalname = "DVPRDULTDC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDVPrdUltEC_Internalname = "DVPRDULTEC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDVPrdUltCC_Internalname = "DVPRDULTCC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDVPrdExiCP_Internalname = "DVPRDEXICP" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDVPrdDifCC_Internalname = "DVPRDDIFCC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDVPrdFacCo_Internalname = "DVPRDFACCO" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtDVPrdConDi_Internalname = "DVPRDCONDI" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDVPrdStkMi_Internalname = "DVPRDSTKMI" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtDVPrdStkMD_Internalname = "DVPRDSTKMD" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtDVPrdDiaRo_Internalname = "DVPRDDIARO" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtDVPrdPlaEn_Internalname = "DVPRDPLAEN" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtDVMetCod_Internalname = "DVMETCOD" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtDVPrdLotMi_Internalname = "DVPRDLOTMI" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtDVPrdNumUc_Internalname = "DVPRDNUMUC" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtDVPrdCanRe_Internalname = "DVPRDCANRE" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtDVPrdFulPe_Internalname = "DVPRDFULPE" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtDVPrdFulCC_Internalname = "DVPRDFULCC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtDVPrdConCC_Internalname = "DVPRDCONCC" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtDVPrdDscTe_Internalname = "DVPRDDSCTE" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtDVPrdUniCo_Internalname = "DVPRDUNICO" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtDVPrdUniCn_Internalname = "DVPRDUNICN" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtDVPrdRefPr_Internalname = "DVPRDREFPR" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtDVPrdSus_Internalname = "DVPRDSUS" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtDVPrdCalNe_Internalname = "DVPRDCALNE" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtDVPrdSit_Internalname = "DVPRDSIT" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtDVTipDtoCo_Internalname = "DVTIPDTOCO" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtDVPrdValSt_Internalname = "DVPRDVALST" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtDVDifValSt_Internalname = "DVDIFVALST" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtDVPrdFecEn_Internalname = "DVPRDFECEN" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtDVPrdPosX_Internalname = "DVPRDPOSX" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtDVPrdPosY_Internalname = "DVPRDPOSY" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtDVPrdTip_Internalname = "DVPRDTIP" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtDVPrdDqo_Internalname = "DVPRDDQO" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtDVPrdRev_Internalname = "DVPRDREV" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtDVPrdTnq_Internalname = "DVPRDTNQ" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtDVCCStKULi_Internalname = "DVCCSTKULI" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtDVPrdUMeFo_Internalname = "DVPRDUMEFO" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtDVPrdNom2_Internalname = "DVPRDNOM2" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtDVPrdNum2_Internalname = "DVPRDNUM2" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtDVPrdObs_Internalname = "DVPRDOBS" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtDVPrdPreA2_Internalname = "DVPRDPREA2" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtDVPrdDensS_Internalname = "DVPRDDENSS" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtDVPrdConcS_Internalname = "DVPRDCONCS" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtDVPrdSalM_Internalname = "DVPRDSALM" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtDVPrdSolub_Internalname = "DVPRDSOLUB" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtDVPrdNumCe_Internalname = "DVPRDNUMCE" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtDVTipPrdCo_Internalname = "DVTIPPRDCO" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtDVPrdNumct_Internalname = "DVPRDNUMCT" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtDVPrdNumc2_Internalname = "DVPRDNUMC2" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtDVPrdHorMa_Internalname = "DVPRDHORMA" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtDVPrdPreRe_Internalname = "DVPRDPRERE" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtDVMat_Lts_Internalname = "DVMAT_LTS" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtDVPrdExiAc_Internalname = "DVPRDEXIAC" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtDVAlmc_Ult_Internalname = "DVALMC_ULT" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtDVPrdAltAc_Internalname = "DVPRDALTAC" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtDVPrdPesCo_Internalname = "DVPRDPESCO" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtDVPrdPesTe_Internalname = "DVPRDPESTE" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtDVCC_Ultln_Internalname = "DVCC_ULTLN" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtDVPrdSal_Internalname = "DVPRDSAL" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtDVSubFamCo_Internalname = "DVSUBFAMCO" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtDVPrdInc_Internalname = "DVPRDINC" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtDVPrdComp_Internalname = "DVPRDCOMP" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtDVPrdAox_Internalname = "DVPRDAOX" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtDVPrdNCAS_Internalname = "DVPRDNCAS" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtDVPrdFT_Internalname = "DVPRDFT" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtDVPrdFFT_Internalname = "DVPRDFFT" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtDVPrdHS_Internalname = "DVPRDHS" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      edtDVPrdFHS_Internalname = "DVPRDFHS" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtDVPrdReach_Internalname = "DVPRDREACH" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtDVPrdOkote_Internalname = "DVPRDOKOTE" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtDVPrdColId_Internalname = "DVPRDCOLID" ;
      lblTextblock90_Internalname = "TEXTBLOCK90" ;
      edtDVPrdLote_Internalname = "DVPRDLOTE" ;
      lblTextblock91_Internalname = "TEXTBLOCK91" ;
      edtDVPrdRTM_Internalname = "DVPRDRTM" ;
      lblTextblock92_Internalname = "TEXTBLOCK92" ;
      edtDVPrdCtw1_Internalname = "DVPRDCTW1" ;
      lblTextblock93_Internalname = "TEXTBLOCK93" ;
      edtDVPrdCtw2_Internalname = "DVPRDCTW2" ;
      lblTextblock94_Internalname = "TEXTBLOCK94" ;
      edtDVPrdCtw3_Internalname = "DVPRDCTW3" ;
      lblTextblock95_Internalname = "TEXTBLOCK95" ;
      edtDVPrdNroCA_Internalname = "DVPRDNROCA" ;
      lblTextblock96_Internalname = "TEXTBLOCK96" ;
      edtDVPrdGots_Internalname = "DVPRDGOTS" ;
      lblTextblock97_Internalname = "TEXTBLOCK97" ;
      edtDVPrdHm_Internalname = "DVPRDHM" ;
      lblTextblock98_Internalname = "TEXTBLOCK98" ;
      edtDVPrdConct_Internalname = "DVPRDCONCT" ;
      lblTextblock99_Internalname = "TEXTBLOCK99" ;
      edtDVPrdEINEC_Internalname = "DVPRDEINEC" ;
      lblTextblock100_Internalname = "TEXTBLOCK100" ;
      edtDVPrdFunci_Internalname = "DVPRDFUNCI" ;
      lblTextblock101_Internalname = "TEXTBLOCK101" ;
      edtDVPrdNmQu_Internalname = "DVPRDNMQU" ;
      lblTextblock102_Internalname = "TEXTBLOCK102" ;
      edtDVPrdEqLP_Internalname = "DVPRDEQLP" ;
      lblTextblock103_Internalname = "TEXTBLOCK103" ;
      edtDVPrdConc_Internalname = "DVPRDCONC" ;
      lblTextblock104_Internalname = "TEXTBLOCK104" ;
      edtDVPrdCtw4_Internalname = "DVPRDCTW4" ;
      lblTextblock105_Internalname = "TEXTBLOCK105" ;
      edtDVPrdList_Internalname = "DVPRDLIST" ;
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
      Form.setCaption( httpContext.getMessage( "Productos Data View", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDVPrdList_Jsonclick = "" ;
      edtDVPrdList_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdList_Enabled = 1 ;
      edtDVPrdCtw4_Jsonclick = "" ;
      edtDVPrdCtw4_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCtw4_Enabled = 1 ;
      edtDVPrdConc_Jsonclick = "" ;
      edtDVPrdConc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdConc_Enabled = 1 ;
      edtDVPrdEqLP_Jsonclick = "" ;
      edtDVPrdEqLP_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdEqLP_Enabled = 1 ;
      edtDVPrdNmQu_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNmQu_Enabled = 1 ;
      edtDVPrdFunci_Jsonclick = "" ;
      edtDVPrdFunci_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFunci_Enabled = 1 ;
      edtDVPrdEINEC_Jsonclick = "" ;
      edtDVPrdEINEC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdEINEC_Enabled = 1 ;
      edtDVPrdConct_Jsonclick = "" ;
      edtDVPrdConct_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdConct_Enabled = 1 ;
      edtDVPrdHm_Jsonclick = "" ;
      edtDVPrdHm_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdHm_Enabled = 1 ;
      edtDVPrdGots_Jsonclick = "" ;
      edtDVPrdGots_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdGots_Enabled = 1 ;
      edtDVPrdNroCA_Jsonclick = "" ;
      edtDVPrdNroCA_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNroCA_Enabled = 1 ;
      edtDVPrdCtw3_Jsonclick = "" ;
      edtDVPrdCtw3_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCtw3_Enabled = 1 ;
      edtDVPrdCtw2_Jsonclick = "" ;
      edtDVPrdCtw2_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCtw2_Enabled = 1 ;
      edtDVPrdCtw1_Jsonclick = "" ;
      edtDVPrdCtw1_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCtw1_Enabled = 1 ;
      edtDVPrdRTM_Jsonclick = "" ;
      edtDVPrdRTM_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdRTM_Enabled = 1 ;
      edtDVPrdLote_Jsonclick = "" ;
      edtDVPrdLote_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdLote_Enabled = 1 ;
      edtDVPrdColId_Jsonclick = "" ;
      edtDVPrdColId_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdColId_Enabled = 1 ;
      edtDVPrdOkote_Jsonclick = "" ;
      edtDVPrdOkote_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdOkote_Enabled = 1 ;
      edtDVPrdReach_Jsonclick = "" ;
      edtDVPrdReach_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdReach_Enabled = 1 ;
      edtDVPrdFHS_Jsonclick = "" ;
      edtDVPrdFHS_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFHS_Enabled = 1 ;
      edtDVPrdHS_Jsonclick = "" ;
      edtDVPrdHS_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdHS_Enabled = 1 ;
      edtDVPrdFFT_Jsonclick = "" ;
      edtDVPrdFFT_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFFT_Enabled = 1 ;
      edtDVPrdFT_Jsonclick = "" ;
      edtDVPrdFT_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFT_Enabled = 1 ;
      edtDVPrdNCAS_Jsonclick = "" ;
      edtDVPrdNCAS_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNCAS_Enabled = 1 ;
      edtDVPrdAox_Jsonclick = "" ;
      edtDVPrdAox_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdAox_Enabled = 1 ;
      edtDVPrdComp_Jsonclick = "" ;
      edtDVPrdComp_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdComp_Enabled = 1 ;
      edtDVPrdInc_Jsonclick = "" ;
      edtDVPrdInc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdInc_Enabled = 1 ;
      edtDVSubFamCo_Jsonclick = "" ;
      edtDVSubFamCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVSubFamCo_Enabled = 1 ;
      edtDVPrdSal_Jsonclick = "" ;
      edtDVPrdSal_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdSal_Enabled = 1 ;
      edtDVCC_Ultln_Jsonclick = "" ;
      edtDVCC_Ultln_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Ultln_Enabled = 1 ;
      edtDVPrdPesTe_Jsonclick = "" ;
      edtDVPrdPesTe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPesTe_Enabled = 1 ;
      edtDVPrdPesCo_Jsonclick = "" ;
      edtDVPrdPesCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPesCo_Enabled = 1 ;
      edtDVPrdAltAc_Jsonclick = "" ;
      edtDVPrdAltAc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdAltAc_Enabled = 1 ;
      edtDVAlmc_Ult_Jsonclick = "" ;
      edtDVAlmc_Ult_Backcolor = (int)(0xFFFFFF) ;
      edtDVAlmc_Ult_Enabled = 1 ;
      edtDVPrdExiAc_Jsonclick = "" ;
      edtDVPrdExiAc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdExiAc_Enabled = 1 ;
      edtDVMat_Lts_Jsonclick = "" ;
      edtDVMat_Lts_Backcolor = (int)(0xFFFFFF) ;
      edtDVMat_Lts_Enabled = 1 ;
      edtDVPrdPreRe_Jsonclick = "" ;
      edtDVPrdPreRe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPreRe_Enabled = 1 ;
      edtDVPrdHorMa_Jsonclick = "" ;
      edtDVPrdHorMa_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdHorMa_Enabled = 1 ;
      edtDVPrdNumc2_Jsonclick = "" ;
      edtDVPrdNumc2_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNumc2_Enabled = 1 ;
      edtDVPrdNumct_Jsonclick = "" ;
      edtDVPrdNumct_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNumct_Enabled = 1 ;
      edtDVTipPrdCo_Jsonclick = "" ;
      edtDVTipPrdCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVTipPrdCo_Enabled = 1 ;
      edtDVPrdNumCe_Jsonclick = "" ;
      edtDVPrdNumCe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNumCe_Enabled = 1 ;
      edtDVPrdSolub_Jsonclick = "" ;
      edtDVPrdSolub_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdSolub_Enabled = 1 ;
      edtDVPrdSalM_Jsonclick = "" ;
      edtDVPrdSalM_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdSalM_Enabled = 1 ;
      edtDVPrdConcS_Jsonclick = "" ;
      edtDVPrdConcS_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdConcS_Enabled = 1 ;
      edtDVPrdDensS_Jsonclick = "" ;
      edtDVPrdDensS_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDensS_Enabled = 1 ;
      edtDVPrdPreA2_Jsonclick = "" ;
      edtDVPrdPreA2_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPreA2_Enabled = 1 ;
      edtDVPrdObs_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdObs_Enabled = 1 ;
      edtDVPrdNum2_Jsonclick = "" ;
      edtDVPrdNum2_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNum2_Enabled = 1 ;
      edtDVPrdNom2_Jsonclick = "" ;
      edtDVPrdNom2_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNom2_Enabled = 1 ;
      edtDVPrdUMeFo_Jsonclick = "" ;
      edtDVPrdUMeFo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUMeFo_Enabled = 1 ;
      edtDVCCStKULi_Jsonclick = "" ;
      edtDVCCStKULi_Backcolor = (int)(0xFFFFFF) ;
      edtDVCCStKULi_Enabled = 1 ;
      edtDVPrdTnq_Jsonclick = "" ;
      edtDVPrdTnq_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdTnq_Enabled = 1 ;
      edtDVPrdRev_Jsonclick = "" ;
      edtDVPrdRev_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdRev_Enabled = 1 ;
      edtDVPrdDqo_Jsonclick = "" ;
      edtDVPrdDqo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDqo_Enabled = 1 ;
      edtDVPrdTip_Jsonclick = "" ;
      edtDVPrdTip_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdTip_Enabled = 1 ;
      edtDVPrdPosY_Jsonclick = "" ;
      edtDVPrdPosY_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPosY_Enabled = 1 ;
      edtDVPrdPosX_Jsonclick = "" ;
      edtDVPrdPosX_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPosX_Enabled = 1 ;
      edtDVPrdFecEn_Jsonclick = "" ;
      edtDVPrdFecEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFecEn_Enabled = 1 ;
      edtDVDifValSt_Jsonclick = "" ;
      edtDVDifValSt_Backcolor = (int)(0xFFFFFF) ;
      edtDVDifValSt_Enabled = 1 ;
      edtDVPrdValSt_Jsonclick = "" ;
      edtDVPrdValSt_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdValSt_Enabled = 1 ;
      edtDVTipDtoCo_Jsonclick = "" ;
      edtDVTipDtoCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVTipDtoCo_Enabled = 1 ;
      edtDVPrdSit_Jsonclick = "" ;
      edtDVPrdSit_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdSit_Enabled = 1 ;
      edtDVPrdCalNe_Jsonclick = "" ;
      edtDVPrdCalNe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCalNe_Enabled = 1 ;
      edtDVPrdSus_Jsonclick = "" ;
      edtDVPrdSus_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdSus_Enabled = 1 ;
      edtDVPrdRefPr_Jsonclick = "" ;
      edtDVPrdRefPr_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdRefPr_Enabled = 1 ;
      edtDVPrdUniCn_Jsonclick = "" ;
      edtDVPrdUniCn_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUniCn_Enabled = 1 ;
      edtDVPrdUniCo_Jsonclick = "" ;
      edtDVPrdUniCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUniCo_Enabled = 1 ;
      edtDVPrdDscTe_Jsonclick = "" ;
      edtDVPrdDscTe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDscTe_Enabled = 1 ;
      edtDVPrdConCC_Jsonclick = "" ;
      edtDVPrdConCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdConCC_Enabled = 1 ;
      edtDVPrdFulCC_Jsonclick = "" ;
      edtDVPrdFulCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFulCC_Enabled = 1 ;
      edtDVPrdFulPe_Jsonclick = "" ;
      edtDVPrdFulPe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFulPe_Enabled = 1 ;
      edtDVPrdCanRe_Jsonclick = "" ;
      edtDVPrdCanRe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCanRe_Enabled = 1 ;
      edtDVPrdNumUc_Jsonclick = "" ;
      edtDVPrdNumUc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNumUc_Enabled = 1 ;
      edtDVPrdLotMi_Jsonclick = "" ;
      edtDVPrdLotMi_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdLotMi_Enabled = 1 ;
      edtDVMetCod_Jsonclick = "" ;
      edtDVMetCod_Backcolor = (int)(0xFFFFFF) ;
      edtDVMetCod_Enabled = 1 ;
      edtDVPrdPlaEn_Jsonclick = "" ;
      edtDVPrdPlaEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPlaEn_Enabled = 1 ;
      edtDVPrdDiaRo_Jsonclick = "" ;
      edtDVPrdDiaRo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDiaRo_Enabled = 1 ;
      edtDVPrdStkMD_Jsonclick = "" ;
      edtDVPrdStkMD_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdStkMD_Enabled = 1 ;
      edtDVPrdStkMi_Jsonclick = "" ;
      edtDVPrdStkMi_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdStkMi_Enabled = 1 ;
      edtDVPrdConDi_Jsonclick = "" ;
      edtDVPrdConDi_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdConDi_Enabled = 1 ;
      edtDVPrdFacCo_Jsonclick = "" ;
      edtDVPrdFacCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFacCo_Enabled = 1 ;
      edtDVPrdDifCC_Jsonclick = "" ;
      edtDVPrdDifCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDifCC_Enabled = 1 ;
      edtDVPrdExiCP_Jsonclick = "" ;
      edtDVPrdExiCP_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdExiCP_Enabled = 1 ;
      edtDVPrdUltCC_Jsonclick = "" ;
      edtDVPrdUltCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUltCC_Enabled = 1 ;
      edtDVPrdUltEC_Jsonclick = "" ;
      edtDVPrdUltEC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUltEC_Enabled = 1 ;
      edtDVPrdUltDC_Jsonclick = "" ;
      edtDVPrdUltDC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdUltDC_Enabled = 1 ;
      edtDVPrdExiCC_Jsonclick = "" ;
      edtDVPrdExiCC_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdExiCC_Enabled = 1 ;
      edtDVMovEspUL_Jsonclick = "" ;
      edtDVMovEspUL_Backcolor = (int)(0xFFFFFF) ;
      edtDVMovEspUL_Enabled = 1 ;
      edtDVPrdFecPr_Jsonclick = "" ;
      edtDVPrdFecPr_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFecPr_Enabled = 1 ;
      edtDVPrdPreAn_Jsonclick = "" ;
      edtDVPrdPreAn_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPreAn_Enabled = 1 ;
      edtDVPrdRec_Jsonclick = "" ;
      edtDVPrdRec_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdRec_Enabled = 1 ;
      edtDVPrdPreMe_Jsonclick = "" ;
      edtDVPrdPreMe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPreMe_Enabled = 1 ;
      edtDVPrdRotRe_Jsonclick = "" ;
      edtDVPrdRotRe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdRotRe_Enabled = 1 ;
      edtDVPrdCanPe_Jsonclick = "" ;
      edtDVPrdCanPe_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdCanPe_Enabled = 1 ;
      edtDVPrdFulEn_Jsonclick = "" ;
      edtDVPrdFulEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdFulEn_Enabled = 1 ;
      edtDVValCod_Jsonclick = "" ;
      edtDVValCod_Backcolor = (int)(0xFFFFFF) ;
      edtDVValCod_Enabled = 1 ;
      edtDVPrdDetPa_Jsonclick = "" ;
      edtDVPrdDetPa_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdDetPa_Enabled = 1 ;
      edtDVUltLinEn_Jsonclick = "" ;
      edtDVUltLinEn_Backcolor = (int)(0xFFFFFF) ;
      edtDVUltLinEn_Enabled = 1 ;
      edtDVPrdPreAc_Jsonclick = "" ;
      edtDVPrdPreAc_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdPreAc_Enabled = 1 ;
      edtDVPrdExiAl_Jsonclick = "" ;
      edtDVPrdExiAl_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdExiAl_Enabled = 1 ;
      edtDVPrvNum_Jsonclick = "" ;
      edtDVPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrvNum_Enabled = 1 ;
      edtDVPrdNom_Jsonclick = "" ;
      edtDVPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      /* Using cursor T01IU18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(16);
      GX_FocusControl = edtDVPrdNom_Internalname ;
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
      /* Using cursor T01IU18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dvprdnum( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12003DVPrdNom", GXutil.rtrim( A12003DVPrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12004DVPrvNum", GXutil.ltrim( localUtil.ntoc( A12004DVPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12005DVPrdExiAl", GXutil.ltrim( localUtil.ntoc( A12005DVPrdExiAl, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12006DVPrdPreAc", GXutil.ltrim( localUtil.ntoc( A12006DVPrdPreAc, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12007DVUltLinEn", GXutil.ltrim( localUtil.ntoc( A12007DVUltLinEn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12008DVPrdDetPa", GXutil.rtrim( A12008DVPrdDetPa));
      httpContext.ajax_rsp_assign_attri("", false, "A12009DVValCod", GXutil.ltrim( localUtil.ntoc( A12009DVValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12010DVPrdFulEn", localUtil.format(A12010DVPrdFulEn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12011DVPrdCanPe", GXutil.ltrim( localUtil.ntoc( A12011DVPrdCanPe, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12012DVPrdRotRe", GXutil.ltrim( localUtil.ntoc( A12012DVPrdRotRe, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12013DVPrdPreMe", GXutil.ltrim( localUtil.ntoc( A12013DVPrdPreMe, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12014DVPrdRec", GXutil.rtrim( A12014DVPrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A12015DVPrdPreAn", GXutil.ltrim( localUtil.ntoc( A12015DVPrdPreAn, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12016DVPrdFecPr", localUtil.format(A12016DVPrdFecPr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12017DVMovEspUL", GXutil.ltrim( localUtil.ntoc( A12017DVMovEspUL, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12018DVPrdExiCC", GXutil.ltrim( localUtil.ntoc( A12018DVPrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12019DVPrdUltDC", GXutil.ltrim( localUtil.ntoc( A12019DVPrdUltDC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12020DVPrdUltEC", GXutil.ltrim( localUtil.ntoc( A12020DVPrdUltEC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12021DVPrdUltCC", GXutil.ltrim( localUtil.ntoc( A12021DVPrdUltCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12022DVPrdExiCP", GXutil.ltrim( localUtil.ntoc( A12022DVPrdExiCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12023DVPrdDifCC", GXutil.ltrim( localUtil.ntoc( A12023DVPrdDifCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12024DVPrdFacCo", GXutil.ltrim( localUtil.ntoc( A12024DVPrdFacCo, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12025DVPrdConDi", GXutil.ltrim( localUtil.ntoc( A12025DVPrdConDi, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12026DVPrdStkMi", GXutil.ltrim( localUtil.ntoc( A12026DVPrdStkMi, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12027DVPrdStkMD", GXutil.ltrim( localUtil.ntoc( A12027DVPrdStkMD, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12028DVPrdDiaRo", GXutil.ltrim( localUtil.ntoc( A12028DVPrdDiaRo, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12029DVPrdPlaEn", GXutil.ltrim( localUtil.ntoc( A12029DVPrdPlaEn, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12030DVMetCod", GXutil.ltrim( localUtil.ntoc( A12030DVMetCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12031DVPrdLotMi", GXutil.ltrim( localUtil.ntoc( A12031DVPrdLotMi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12032DVPrdNumUc", GXutil.ltrim( localUtil.ntoc( A12032DVPrdNumUc, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12033DVPrdCanRe", GXutil.ltrim( localUtil.ntoc( A12033DVPrdCanRe, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12034DVPrdFulPe", localUtil.format(A12034DVPrdFulPe, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12035DVPrdFulCC", localUtil.format(A12035DVPrdFulCC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12036DVPrdConCC", GXutil.ltrim( localUtil.ntoc( A12036DVPrdConCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12037DVPrdDscTe", GXutil.rtrim( A12037DVPrdDscTe));
      httpContext.ajax_rsp_assign_attri("", false, "A12038DVPrdUniCo", GXutil.ltrim( localUtil.ntoc( A12038DVPrdUniCo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12039DVPrdUniCn", GXutil.ltrim( localUtil.ntoc( A12039DVPrdUniCn, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12040DVPrdRefPr", GXutil.rtrim( A12040DVPrdRefPr));
      httpContext.ajax_rsp_assign_attri("", false, "A12041DVPrdSus", GXutil.rtrim( A12041DVPrdSus));
      httpContext.ajax_rsp_assign_attri("", false, "A12042DVPrdCalNe", GXutil.rtrim( A12042DVPrdCalNe));
      httpContext.ajax_rsp_assign_attri("", false, "A12043DVPrdSit", GXutil.ltrim( localUtil.ntoc( A12043DVPrdSit, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12044DVTipDtoCo", GXutil.ltrim( localUtil.ntoc( A12044DVTipDtoCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12045DVPrdValSt", GXutil.ltrim( localUtil.ntoc( A12045DVPrdValSt, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12046DVDifValSt", GXutil.ltrim( localUtil.ntoc( A12046DVDifValSt, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12047DVPrdFecEn", localUtil.format(A12047DVPrdFecEn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12048DVPrdPosX", GXutil.ltrim( localUtil.ntoc( A12048DVPrdPosX, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12049DVPrdPosY", GXutil.ltrim( localUtil.ntoc( A12049DVPrdPosY, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12050DVPrdTip", GXutil.rtrim( A12050DVPrdTip));
      httpContext.ajax_rsp_assign_attri("", false, "A12051DVPrdDqo", GXutil.ltrim( localUtil.ntoc( A12051DVPrdDqo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12052DVPrdRev", GXutil.rtrim( A12052DVPrdRev));
      httpContext.ajax_rsp_assign_attri("", false, "A12053DVPrdTnq", GXutil.ltrim( localUtil.ntoc( A12053DVPrdTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12054DVCCStKULi", GXutil.ltrim( localUtil.ntoc( A12054DVCCStKULi, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12055DVPrdUMeFo", GXutil.ltrim( localUtil.ntoc( A12055DVPrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12056DVPrdNom2", GXutil.rtrim( A12056DVPrdNom2));
      httpContext.ajax_rsp_assign_attri("", false, "A12057DVPrdNum2", GXutil.rtrim( A12057DVPrdNum2));
      httpContext.ajax_rsp_assign_attri("", false, "A12058DVPrdObs", A12058DVPrdObs);
      httpContext.ajax_rsp_assign_attri("", false, "A12059DVPrdPreA2", GXutil.ltrim( localUtil.ntoc( A12059DVPrdPreA2, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12060DVPrdDensS", GXutil.ltrim( localUtil.ntoc( A12060DVPrdDensS, (byte)(7), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12061DVPrdConcS", GXutil.ltrim( localUtil.ntoc( A12061DVPrdConcS, (byte)(7), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12062DVPrdSalM", GXutil.rtrim( A12062DVPrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A12063DVPrdSolub", GXutil.ltrim( localUtil.ntoc( A12063DVPrdSolub, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12064DVPrdNumCe", GXutil.rtrim( A12064DVPrdNumCe));
      httpContext.ajax_rsp_assign_attri("", false, "A12065DVTipPrdCo", GXutil.ltrim( localUtil.ntoc( A12065DVTipPrdCo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12066DVPrdNumct", GXutil.ltrim( localUtil.ntoc( A12066DVPrdNumct, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12067DVPrdNumc2", GXutil.ltrim( localUtil.ntoc( A12067DVPrdNumc2, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12068DVPrdHorMa", GXutil.ltrim( localUtil.ntoc( A12068DVPrdHorMa, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12069DVPrdPreRe", GXutil.ltrim( localUtil.ntoc( A12069DVPrdPreRe, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12070DVMat_Lts", GXutil.ltrim( localUtil.ntoc( A12070DVMat_Lts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12071DVPrdExiAc", GXutil.ltrim( localUtil.ntoc( A12071DVPrdExiAc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12072DVAlmc_Ult", GXutil.ltrim( localUtil.ntoc( A12072DVAlmc_Ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12073DVPrdAltAc", GXutil.ltrim( localUtil.ntoc( A12073DVPrdAltAc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12074DVPrdPesCo", GXutil.ltrim( localUtil.ntoc( A12074DVPrdPesCo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12075DVPrdPesTe", GXutil.rtrim( A12075DVPrdPesTe));
      httpContext.ajax_rsp_assign_attri("", false, "A12076DVCC_Ultln", GXutil.ltrim( localUtil.ntoc( A12076DVCC_Ultln, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12077DVPrdSal", GXutil.rtrim( A12077DVPrdSal));
      httpContext.ajax_rsp_assign_attri("", false, "A12078DVSubFamCo", GXutil.ltrim( localUtil.ntoc( A12078DVSubFamCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12079DVPrdInc", GXutil.rtrim( A12079DVPrdInc));
      httpContext.ajax_rsp_assign_attri("", false, "A12080DVPrdComp", GXutil.rtrim( A12080DVPrdComp));
      httpContext.ajax_rsp_assign_attri("", false, "A12081DVPrdAox", GXutil.ltrim( localUtil.ntoc( A12081DVPrdAox, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12082DVPrdNCAS", GXutil.rtrim( A12082DVPrdNCAS));
      httpContext.ajax_rsp_assign_attri("", false, "A12083DVPrdFT", GXutil.rtrim( A12083DVPrdFT));
      httpContext.ajax_rsp_assign_attri("", false, "A12084DVPrdFFT", localUtil.format(A12084DVPrdFFT, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12085DVPrdHS", GXutil.rtrim( A12085DVPrdHS));
      httpContext.ajax_rsp_assign_attri("", false, "A12086DVPrdFHS", localUtil.format(A12086DVPrdFHS, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12087DVPrdReach", GXutil.rtrim( A12087DVPrdReach));
      httpContext.ajax_rsp_assign_attri("", false, "A12088DVPrdOkote", GXutil.rtrim( A12088DVPrdOkote));
      httpContext.ajax_rsp_assign_attri("", false, "A12089DVPrdColId", GXutil.rtrim( A12089DVPrdColId));
      httpContext.ajax_rsp_assign_attri("", false, "A12090DVPrdLote", GXutil.rtrim( A12090DVPrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A12091DVPrdRTM", GXutil.rtrim( A12091DVPrdRTM));
      httpContext.ajax_rsp_assign_attri("", false, "A12092DVPrdCtw1", GXutil.rtrim( A12092DVPrdCtw1));
      httpContext.ajax_rsp_assign_attri("", false, "A12093DVPrdCtw2", GXutil.rtrim( A12093DVPrdCtw2));
      httpContext.ajax_rsp_assign_attri("", false, "A12094DVPrdCtw3", GXutil.rtrim( A12094DVPrdCtw3));
      httpContext.ajax_rsp_assign_attri("", false, "A12095DVPrdNroCA", GXutil.rtrim( A12095DVPrdNroCA));
      httpContext.ajax_rsp_assign_attri("", false, "A12096DVPrdGots", GXutil.rtrim( A12096DVPrdGots));
      httpContext.ajax_rsp_assign_attri("", false, "A12097DVPrdHm", GXutil.rtrim( A12097DVPrdHm));
      httpContext.ajax_rsp_assign_attri("", false, "A12098DVPrdConct", GXutil.ltrim( localUtil.ntoc( A12098DVPrdConct, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12099DVPrdEINEC", GXutil.rtrim( A12099DVPrdEINEC));
      httpContext.ajax_rsp_assign_attri("", false, "A12100DVPrdFunci", GXutil.rtrim( A12100DVPrdFunci));
      httpContext.ajax_rsp_assign_attri("", false, "A12101DVPrdNmQu", A12101DVPrdNmQu);
      httpContext.ajax_rsp_assign_attri("", false, "A12102DVPrdEqLP", GXutil.rtrim( A12102DVPrdEqLP));
      httpContext.ajax_rsp_assign_attri("", false, "A12103DVPrdConc", GXutil.ltrim( localUtil.ntoc( A12103DVPrdConc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12104DVPrdCtw4", GXutil.rtrim( A12104DVPrdCtw4));
      httpContext.ajax_rsp_assign_attri("", false, "A12105DVPrdList", GXutil.rtrim( A12105DVPrdList));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12003DVPrdNom", GXutil.rtrim( Z12003DVPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12004DVPrvNum", GXutil.ltrim( localUtil.ntoc( Z12004DVPrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12005DVPrdExiAl", GXutil.ltrim( localUtil.ntoc( Z12005DVPrdExiAl, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12006DVPrdPreAc", GXutil.ltrim( localUtil.ntoc( Z12006DVPrdPreAc, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12007DVUltLinEn", GXutil.ltrim( localUtil.ntoc( Z12007DVUltLinEn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12008DVPrdDetPa", GXutil.rtrim( Z12008DVPrdDetPa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12009DVValCod", GXutil.ltrim( localUtil.ntoc( Z12009DVValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12010DVPrdFulEn", localUtil.format(Z12010DVPrdFulEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12011DVPrdCanPe", GXutil.ltrim( localUtil.ntoc( Z12011DVPrdCanPe, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12012DVPrdRotRe", GXutil.ltrim( localUtil.ntoc( Z12012DVPrdRotRe, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12013DVPrdPreMe", GXutil.ltrim( localUtil.ntoc( Z12013DVPrdPreMe, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12014DVPrdRec", GXutil.rtrim( Z12014DVPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12015DVPrdPreAn", GXutil.ltrim( localUtil.ntoc( Z12015DVPrdPreAn, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12016DVPrdFecPr", localUtil.format(Z12016DVPrdFecPr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12017DVMovEspUL", GXutil.ltrim( localUtil.ntoc( Z12017DVMovEspUL, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12018DVPrdExiCC", GXutil.ltrim( localUtil.ntoc( Z12018DVPrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12019DVPrdUltDC", GXutil.ltrim( localUtil.ntoc( Z12019DVPrdUltDC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12020DVPrdUltEC", GXutil.ltrim( localUtil.ntoc( Z12020DVPrdUltEC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12021DVPrdUltCC", GXutil.ltrim( localUtil.ntoc( Z12021DVPrdUltCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12022DVPrdExiCP", GXutil.ltrim( localUtil.ntoc( Z12022DVPrdExiCP, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12023DVPrdDifCC", GXutil.ltrim( localUtil.ntoc( Z12023DVPrdDifCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12024DVPrdFacCo", GXutil.ltrim( localUtil.ntoc( Z12024DVPrdFacCo, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12025DVPrdConDi", GXutil.ltrim( localUtil.ntoc( Z12025DVPrdConDi, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12026DVPrdStkMi", GXutil.ltrim( localUtil.ntoc( Z12026DVPrdStkMi, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12027DVPrdStkMD", GXutil.ltrim( localUtil.ntoc( Z12027DVPrdStkMD, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12028DVPrdDiaRo", GXutil.ltrim( localUtil.ntoc( Z12028DVPrdDiaRo, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12029DVPrdPlaEn", GXutil.ltrim( localUtil.ntoc( Z12029DVPrdPlaEn, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12030DVMetCod", GXutil.ltrim( localUtil.ntoc( Z12030DVMetCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12031DVPrdLotMi", GXutil.ltrim( localUtil.ntoc( Z12031DVPrdLotMi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12032DVPrdNumUc", GXutil.ltrim( localUtil.ntoc( Z12032DVPrdNumUc, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12033DVPrdCanRe", GXutil.ltrim( localUtil.ntoc( Z12033DVPrdCanRe, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12034DVPrdFulPe", localUtil.format(Z12034DVPrdFulPe, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12035DVPrdFulCC", localUtil.format(Z12035DVPrdFulCC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12036DVPrdConCC", GXutil.ltrim( localUtil.ntoc( Z12036DVPrdConCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12037DVPrdDscTe", GXutil.rtrim( Z12037DVPrdDscTe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12038DVPrdUniCo", GXutil.ltrim( localUtil.ntoc( Z12038DVPrdUniCo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12039DVPrdUniCn", GXutil.ltrim( localUtil.ntoc( Z12039DVPrdUniCn, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12040DVPrdRefPr", GXutil.rtrim( Z12040DVPrdRefPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12041DVPrdSus", GXutil.rtrim( Z12041DVPrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12042DVPrdCalNe", GXutil.rtrim( Z12042DVPrdCalNe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12043DVPrdSit", GXutil.ltrim( localUtil.ntoc( Z12043DVPrdSit, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12044DVTipDtoCo", GXutil.ltrim( localUtil.ntoc( Z12044DVTipDtoCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12045DVPrdValSt", GXutil.ltrim( localUtil.ntoc( Z12045DVPrdValSt, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12046DVDifValSt", GXutil.ltrim( localUtil.ntoc( Z12046DVDifValSt, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12047DVPrdFecEn", localUtil.format(Z12047DVPrdFecEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12048DVPrdPosX", GXutil.ltrim( localUtil.ntoc( Z12048DVPrdPosX, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12049DVPrdPosY", GXutil.ltrim( localUtil.ntoc( Z12049DVPrdPosY, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12050DVPrdTip", GXutil.rtrim( Z12050DVPrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12051DVPrdDqo", GXutil.ltrim( localUtil.ntoc( Z12051DVPrdDqo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12052DVPrdRev", GXutil.rtrim( Z12052DVPrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12053DVPrdTnq", GXutil.ltrim( localUtil.ntoc( Z12053DVPrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12054DVCCStKULi", GXutil.ltrim( localUtil.ntoc( Z12054DVCCStKULi, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12055DVPrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z12055DVPrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12056DVPrdNom2", GXutil.rtrim( Z12056DVPrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12057DVPrdNum2", GXutil.rtrim( Z12057DVPrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12058DVPrdObs", Z12058DVPrdObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12059DVPrdPreA2", GXutil.ltrim( localUtil.ntoc( Z12059DVPrdPreA2, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12060DVPrdDensS", GXutil.ltrim( localUtil.ntoc( Z12060DVPrdDensS, (byte)(7), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12061DVPrdConcS", GXutil.ltrim( localUtil.ntoc( Z12061DVPrdConcS, (byte)(7), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12062DVPrdSalM", GXutil.rtrim( Z12062DVPrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12063DVPrdSolub", GXutil.ltrim( localUtil.ntoc( Z12063DVPrdSolub, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12064DVPrdNumCe", GXutil.rtrim( Z12064DVPrdNumCe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12065DVTipPrdCo", GXutil.ltrim( localUtil.ntoc( Z12065DVTipPrdCo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12066DVPrdNumct", GXutil.ltrim( localUtil.ntoc( Z12066DVPrdNumct, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12067DVPrdNumc2", GXutil.ltrim( localUtil.ntoc( Z12067DVPrdNumc2, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12068DVPrdHorMa", GXutil.ltrim( localUtil.ntoc( Z12068DVPrdHorMa, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12069DVPrdPreRe", GXutil.ltrim( localUtil.ntoc( Z12069DVPrdPreRe, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12070DVMat_Lts", GXutil.ltrim( localUtil.ntoc( Z12070DVMat_Lts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12071DVPrdExiAc", GXutil.ltrim( localUtil.ntoc( Z12071DVPrdExiAc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12072DVAlmc_Ult", GXutil.ltrim( localUtil.ntoc( Z12072DVAlmc_Ult, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12073DVPrdAltAc", GXutil.ltrim( localUtil.ntoc( Z12073DVPrdAltAc, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12074DVPrdPesCo", GXutil.ltrim( localUtil.ntoc( Z12074DVPrdPesCo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12075DVPrdPesTe", GXutil.rtrim( Z12075DVPrdPesTe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12076DVCC_Ultln", GXutil.ltrim( localUtil.ntoc( Z12076DVCC_Ultln, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12077DVPrdSal", GXutil.rtrim( Z12077DVPrdSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12078DVSubFamCo", GXutil.ltrim( localUtil.ntoc( Z12078DVSubFamCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12079DVPrdInc", GXutil.rtrim( Z12079DVPrdInc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12080DVPrdComp", GXutil.rtrim( Z12080DVPrdComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12081DVPrdAox", GXutil.ltrim( localUtil.ntoc( Z12081DVPrdAox, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12082DVPrdNCAS", GXutil.rtrim( Z12082DVPrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12083DVPrdFT", GXutil.rtrim( Z12083DVPrdFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12084DVPrdFFT", localUtil.format(Z12084DVPrdFFT, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12085DVPrdHS", GXutil.rtrim( Z12085DVPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12086DVPrdFHS", localUtil.format(Z12086DVPrdFHS, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12087DVPrdReach", GXutil.rtrim( Z12087DVPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12088DVPrdOkote", GXutil.rtrim( Z12088DVPrdOkote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12089DVPrdColId", GXutil.rtrim( Z12089DVPrdColId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12090DVPrdLote", GXutil.rtrim( Z12090DVPrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12091DVPrdRTM", GXutil.rtrim( Z12091DVPrdRTM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12092DVPrdCtw1", GXutil.rtrim( Z12092DVPrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12093DVPrdCtw2", GXutil.rtrim( Z12093DVPrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12094DVPrdCtw3", GXutil.rtrim( Z12094DVPrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12095DVPrdNroCA", GXutil.rtrim( Z12095DVPrdNroCA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12096DVPrdGots", GXutil.rtrim( Z12096DVPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12097DVPrdHm", GXutil.rtrim( Z12097DVPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12098DVPrdConct", GXutil.ltrim( localUtil.ntoc( Z12098DVPrdConct, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12099DVPrdEINEC", GXutil.rtrim( Z12099DVPrdEINEC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12100DVPrdFunci", GXutil.rtrim( Z12100DVPrdFunci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12101DVPrdNmQu", Z12101DVPrdNmQu);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12102DVPrdEqLP", GXutil.rtrim( Z12102DVPrdEqLP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12103DVPrdConc", GXutil.ltrim( localUtil.ntoc( Z12103DVPrdConc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12104DVPrdCtw4", GXutil.rtrim( Z12104DVPrdCtw4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12105DVPrdList", GXutil.rtrim( Z12105DVPrdList));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DVPRDNUM","{handler:'valid_Dvprdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DVPRDNUM",",oparms:[{av:'A12003DVPrdNom',fld:'DVPRDNOM',pic:''},{av:'A12004DVPrvNum',fld:'DVPRVNUM',pic:'ZZZZZ9'},{av:'A12005DVPrdExiAl',fld:'DVPRDEXIAL',pic:'ZZZZZZ9.9999'},{av:'A12006DVPrdPreAc',fld:'DVPRDPREAC',pic:'ZZZZZZZ9.99999'},{av:'A12007DVUltLinEn',fld:'DVULTLINEN',pic:'ZZZ9'},{av:'A12008DVPrdDetPa',fld:'DVPRDDETPA',pic:''},{av:'A12009DVValCod',fld:'DVVALCOD',pic:'9'},{av:'A12010DVPrdFulEn',fld:'DVPRDFULEN',pic:''},{av:'A12011DVPrdCanPe',fld:'DVPRDCANPE',pic:'ZZZZZZ9.9999'},{av:'A12012DVPrdRotRe',fld:'DVPRDROTRE',pic:'ZZZZZ9.99999'},{av:'A12013DVPrdPreMe',fld:'DVPRDPREME',pic:'ZZZZZZZ9.99999'},{av:'A12014DVPrdRec',fld:'DVPRDREC',pic:''},{av:'A12015DVPrdPreAn',fld:'DVPRDPREAN',pic:'ZZZZZZZ9.99999'},{av:'A12016DVPrdFecPr',fld:'DVPRDFECPR',pic:''},{av:'A12017DVMovEspUL',fld:'DVMOVESPUL',pic:'ZZ9'},{av:'A12018DVPrdExiCC',fld:'DVPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A12019DVPrdUltDC',fld:'DVPRDULTDC',pic:'ZZZZ9.99'},{av:'A12020DVPrdUltEC',fld:'DVPRDULTEC',pic:'ZZZZ9.99'},{av:'A12021DVPrdUltCC',fld:'DVPRDULTCC',pic:'ZZZ9'},{av:'A12022DVPrdExiCP',fld:'DVPRDEXICP',pic:'ZZZZ9.99'},{av:'A12023DVPrdDifCC',fld:'DVPRDDIFCC',pic:'ZZZZ9.99'},{av:'A12024DVPrdFacCo',fld:'DVPRDFACCO',pic:'Z9.9999'},{av:'A12025DVPrdConDi',fld:'DVPRDCONDI',pic:'ZZZ9.99'},{av:'A12026DVPrdStkMi',fld:'DVPRDSTKMI',pic:'ZZZZ9.99'},{av:'A12027DVPrdStkMD',fld:'DVPRDSTKMD',pic:'ZZZ9'},{av:'A12028DVPrdDiaRo',fld:'DVPRDDIARO',pic:'ZZ9'},{av:'A12029DVPrdPlaEn',fld:'DVPRDPLAEN',pic:'ZZ9'},{av:'A12030DVMetCod',fld:'DVMETCOD',pic:'9'},{av:'A12031DVPrdLotMi',fld:'DVPRDLOTMI',pic:'ZZZ9'},{av:'A12032DVPrdNumUc',fld:'DVPRDNUMUC',pic:'ZZZ9.99'},{av:'A12033DVPrdCanRe',fld:'DVPRDCANRE',pic:'ZZZZZZ9.9999'},{av:'A12034DVPrdFulPe',fld:'DVPRDFULPE',pic:''},{av:'A12035DVPrdFulCC',fld:'DVPRDFULCC',pic:''},{av:'A12036DVPrdConCC',fld:'DVPRDCONCC',pic:'ZZZ9'},{av:'A12037DVPrdDscTe',fld:'DVPRDDSCTE',pic:''},{av:'A12038DVPrdUniCo',fld:'DVPRDUNICO',pic:'9'},{av:'A12039DVPrdUniCn',fld:'DVPRDUNICN',pic:'9'},{av:'A12040DVPrdRefPr',fld:'DVPRDREFPR',pic:''},{av:'A12041DVPrdSus',fld:'DVPRDSUS',pic:''},{av:'A12042DVPrdCalNe',fld:'DVPRDCALNE',pic:''},{av:'A12043DVPrdSit',fld:'DVPRDSIT',pic:'9'},{av:'A12044DVTipDtoCo',fld:'DVTIPDTOCO',pic:'Z9'},{av:'A12045DVPrdValSt',fld:'DVPRDVALST',pic:'ZZZZZZZ9.99'},{av:'A12046DVDifValSt',fld:'DVDIFVALST',pic:'ZZZZZZZ9.99'},{av:'A12047DVPrdFecEn',fld:'DVPRDFECEN',pic:''},{av:'A12048DVPrdPosX',fld:'DVPRDPOSX',pic:'ZZZ9'},{av:'A12049DVPrdPosY',fld:'DVPRDPOSY',pic:'ZZZ9'},{av:'A12050DVPrdTip',fld:'DVPRDTIP',pic:''},{av:'A12051DVPrdDqo',fld:'DVPRDDQO',pic:'ZZZ9'},{av:'A12052DVPrdRev',fld:'DVPRDREV',pic:''},{av:'A12053DVPrdTnq',fld:'DVPRDTNQ',pic:'Z9'},{av:'A12054DVCCStKULi',fld:'DVCCSTKULI',pic:'ZZZZZZZZZZZ9'},{av:'A12055DVPrdUMeFo',fld:'DVPRDUMEFO',pic:'9'},{av:'A12056DVPrdNom2',fld:'DVPRDNOM2',pic:''},{av:'A12057DVPrdNum2',fld:'DVPRDNUM2',pic:''},{av:'A12058DVPrdObs',fld:'DVPRDOBS',pic:''},{av:'A12059DVPrdPreA2',fld:'DVPRDPREA2',pic:'ZZZZZZZ9.99999'},{av:'A12060DVPrdDensS',fld:'DVPRDDENSS',pic:'ZZ9.999'},{av:'A12061DVPrdConcS',fld:'DVPRDCONCS',pic:'ZZ9.999'},{av:'A12062DVPrdSalM',fld:'DVPRDSALM',pic:''},{av:'A12063DVPrdSolub',fld:'DVPRDSOLUB',pic:'ZZZ9.99'},{av:'A12064DVPrdNumCe',fld:'DVPRDNUMCE',pic:''},{av:'A12065DVTipPrdCo',fld:'DVTIPPRDCO',pic:'ZZZ9'},{av:'A12066DVPrdNumct',fld:'DVPRDNUMCT',pic:'ZZ9.99'},{av:'A12067DVPrdNumc2',fld:'DVPRDNUMC2',pic:'ZZ9.99'},{av:'A12068DVPrdHorMa',fld:'DVPRDHORMA',pic:'Z9'},{av:'A12069DVPrdPreRe',fld:'DVPRDPRERE',pic:'ZZZZZZZ9.99999'},{av:'A12070DVMat_Lts',fld:'DVMAT_LTS',pic:'ZZZZZ9.99'},{av:'A12071DVPrdExiAc',fld:'DVPRDEXIAC',pic:'ZZZZZZ9.9999'},{av:'A12072DVAlmc_Ult',fld:'DVALMC_ULT',pic:'ZZZZZ9'},{av:'A12073DVPrdAltAc',fld:'DVPRDALTAC',pic:'9'},{av:'A12074DVPrdPesCo',fld:'DVPRDPESCO',pic:'9'},{av:'A12075DVPrdPesTe',fld:'DVPRDPESTE',pic:''},{av:'A12076DVCC_Ultln',fld:'DVCC_ULTLN',pic:'ZZZZZZZZZZZ9'},{av:'A12077DVPrdSal',fld:'DVPRDSAL',pic:''},{av:'A12078DVSubFamCo',fld:'DVSUBFAMCO',pic:'Z9'},{av:'A12079DVPrdInc',fld:'DVPRDINC',pic:''},{av:'A12080DVPrdComp',fld:'DVPRDCOMP',pic:''},{av:'A12081DVPrdAox',fld:'DVPRDAOX',pic:'ZZ9.99'},{av:'A12082DVPrdNCAS',fld:'DVPRDNCAS',pic:''},{av:'A12083DVPrdFT',fld:'DVPRDFT',pic:''},{av:'A12084DVPrdFFT',fld:'DVPRDFFT',pic:''},{av:'A12085DVPrdHS',fld:'DVPRDHS',pic:''},{av:'A12086DVPrdFHS',fld:'DVPRDFHS',pic:''},{av:'A12087DVPrdReach',fld:'DVPRDREACH',pic:''},{av:'A12088DVPrdOkote',fld:'DVPRDOKOTE',pic:''},{av:'A12089DVPrdColId',fld:'DVPRDCOLID',pic:''},{av:'A12090DVPrdLote',fld:'DVPRDLOTE',pic:''},{av:'A12091DVPrdRTM',fld:'DVPRDRTM',pic:''},{av:'A12092DVPrdCtw1',fld:'DVPRDCTW1',pic:''},{av:'A12093DVPrdCtw2',fld:'DVPRDCTW2',pic:''},{av:'A12094DVPrdCtw3',fld:'DVPRDCTW3',pic:''},{av:'A12095DVPrdNroCA',fld:'DVPRDNROCA',pic:''},{av:'A12096DVPrdGots',fld:'DVPRDGOTS',pic:''},{av:'A12097DVPrdHm',fld:'DVPRDHM',pic:''},{av:'A12098DVPrdConct',fld:'DVPRDCONCT',pic:'ZZ9'},{av:'A12099DVPrdEINEC',fld:'DVPRDEINEC',pic:''},{av:'A12100DVPrdFunci',fld:'DVPRDFUNCI',pic:''},{av:'A12101DVPrdNmQu',fld:'DVPRDNMQU',pic:''},{av:'A12102DVPrdEqLP',fld:'DVPRDEQLP',pic:''},{av:'A12103DVPrdConc',fld:'DVPRDCONC',pic:'ZZ9.99'},{av:'A12104DVPrdCtw4',fld:'DVPRDCTW4',pic:''},{av:'A12105DVPrdList',fld:'DVPRDLIST',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11935DVPrdNum'},{av:'Z12003DVPrdNom'},{av:'Z12004DVPrvNum'},{av:'Z12005DVPrdExiAl'},{av:'Z12006DVPrdPreAc'},{av:'Z12007DVUltLinEn'},{av:'Z12008DVPrdDetPa'},{av:'Z12009DVValCod'},{av:'Z12010DVPrdFulEn'},{av:'Z12011DVPrdCanPe'},{av:'Z12012DVPrdRotRe'},{av:'Z12013DVPrdPreMe'},{av:'Z12014DVPrdRec'},{av:'Z12015DVPrdPreAn'},{av:'Z12016DVPrdFecPr'},{av:'Z12017DVMovEspUL'},{av:'Z12018DVPrdExiCC'},{av:'Z12019DVPrdUltDC'},{av:'Z12020DVPrdUltEC'},{av:'Z12021DVPrdUltCC'},{av:'Z12022DVPrdExiCP'},{av:'Z12023DVPrdDifCC'},{av:'Z12024DVPrdFacCo'},{av:'Z12025DVPrdConDi'},{av:'Z12026DVPrdStkMi'},{av:'Z12027DVPrdStkMD'},{av:'Z12028DVPrdDiaRo'},{av:'Z12029DVPrdPlaEn'},{av:'Z12030DVMetCod'},{av:'Z12031DVPrdLotMi'},{av:'Z12032DVPrdNumUc'},{av:'Z12033DVPrdCanRe'},{av:'Z12034DVPrdFulPe'},{av:'Z12035DVPrdFulCC'},{av:'Z12036DVPrdConCC'},{av:'Z12037DVPrdDscTe'},{av:'Z12038DVPrdUniCo'},{av:'Z12039DVPrdUniCn'},{av:'Z12040DVPrdRefPr'},{av:'Z12041DVPrdSus'},{av:'Z12042DVPrdCalNe'},{av:'Z12043DVPrdSit'},{av:'Z12044DVTipDtoCo'},{av:'Z12045DVPrdValSt'},{av:'Z12046DVDifValSt'},{av:'Z12047DVPrdFecEn'},{av:'Z12048DVPrdPosX'},{av:'Z12049DVPrdPosY'},{av:'Z12050DVPrdTip'},{av:'Z12051DVPrdDqo'},{av:'Z12052DVPrdRev'},{av:'Z12053DVPrdTnq'},{av:'Z12054DVCCStKULi'},{av:'Z12055DVPrdUMeFo'},{av:'Z12056DVPrdNom2'},{av:'Z12057DVPrdNum2'},{av:'Z12058DVPrdObs'},{av:'Z12059DVPrdPreA2'},{av:'Z12060DVPrdDensS'},{av:'Z12061DVPrdConcS'},{av:'Z12062DVPrdSalM'},{av:'Z12063DVPrdSolub'},{av:'Z12064DVPrdNumCe'},{av:'Z12065DVTipPrdCo'},{av:'Z12066DVPrdNumct'},{av:'Z12067DVPrdNumc2'},{av:'Z12068DVPrdHorMa'},{av:'Z12069DVPrdPreRe'},{av:'Z12070DVMat_Lts'},{av:'Z12071DVPrdExiAc'},{av:'Z12072DVAlmc_Ult'},{av:'Z12073DVPrdAltAc'},{av:'Z12074DVPrdPesCo'},{av:'Z12075DVPrdPesTe'},{av:'Z12076DVCC_Ultln'},{av:'Z12077DVPrdSal'},{av:'Z12078DVSubFamCo'},{av:'Z12079DVPrdInc'},{av:'Z12080DVPrdComp'},{av:'Z12081DVPrdAox'},{av:'Z12082DVPrdNCAS'},{av:'Z12083DVPrdFT'},{av:'Z12084DVPrdFFT'},{av:'Z12085DVPrdHS'},{av:'Z12086DVPrdFHS'},{av:'Z12087DVPrdReach'},{av:'Z12088DVPrdOkote'},{av:'Z12089DVPrdColId'},{av:'Z12090DVPrdLote'},{av:'Z12091DVPrdRTM'},{av:'Z12092DVPrdCtw1'},{av:'Z12093DVPrdCtw2'},{av:'Z12094DVPrdCtw3'},{av:'Z12095DVPrdNroCA'},{av:'Z12096DVPrdGots'},{av:'Z12097DVPrdHm'},{av:'Z12098DVPrdConct'},{av:'Z12099DVPrdEINEC'},{av:'Z12100DVPrdFunci'},{av:'Z12101DVPrdNmQu'},{av:'Z12102DVPrdEqLP'},{av:'Z12103DVPrdConc'},{av:'Z12104DVPrdCtw4'},{av:'Z12105DVPrdList'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11935DVPrdNum = "" ;
      Z12003DVPrdNom = "" ;
      Z12005DVPrdExiAl = DecimalUtil.ZERO ;
      Z12006DVPrdPreAc = DecimalUtil.ZERO ;
      Z12008DVPrdDetPa = "" ;
      Z12010DVPrdFulEn = GXutil.nullDate() ;
      Z12011DVPrdCanPe = DecimalUtil.ZERO ;
      Z12012DVPrdRotRe = DecimalUtil.ZERO ;
      Z12013DVPrdPreMe = DecimalUtil.ZERO ;
      Z12014DVPrdRec = "" ;
      Z12015DVPrdPreAn = DecimalUtil.ZERO ;
      Z12016DVPrdFecPr = GXutil.nullDate() ;
      Z12018DVPrdExiCC = DecimalUtil.ZERO ;
      Z12019DVPrdUltDC = DecimalUtil.ZERO ;
      Z12020DVPrdUltEC = DecimalUtil.ZERO ;
      Z12022DVPrdExiCP = DecimalUtil.ZERO ;
      Z12023DVPrdDifCC = DecimalUtil.ZERO ;
      Z12024DVPrdFacCo = DecimalUtil.ZERO ;
      Z12025DVPrdConDi = DecimalUtil.ZERO ;
      Z12026DVPrdStkMi = DecimalUtil.ZERO ;
      Z12032DVPrdNumUc = DecimalUtil.ZERO ;
      Z12033DVPrdCanRe = DecimalUtil.ZERO ;
      Z12034DVPrdFulPe = GXutil.nullDate() ;
      Z12035DVPrdFulCC = GXutil.nullDate() ;
      Z12037DVPrdDscTe = "" ;
      Z12040DVPrdRefPr = "" ;
      Z12041DVPrdSus = "" ;
      Z12042DVPrdCalNe = "" ;
      Z12045DVPrdValSt = DecimalUtil.ZERO ;
      Z12046DVDifValSt = DecimalUtil.ZERO ;
      Z12047DVPrdFecEn = GXutil.nullDate() ;
      Z12050DVPrdTip = "" ;
      Z12052DVPrdRev = "" ;
      Z12056DVPrdNom2 = "" ;
      Z12057DVPrdNum2 = "" ;
      Z12059DVPrdPreA2 = DecimalUtil.ZERO ;
      Z12060DVPrdDensS = DecimalUtil.ZERO ;
      Z12061DVPrdConcS = DecimalUtil.ZERO ;
      Z12062DVPrdSalM = "" ;
      Z12063DVPrdSolub = DecimalUtil.ZERO ;
      Z12064DVPrdNumCe = "" ;
      Z12066DVPrdNumct = DecimalUtil.ZERO ;
      Z12067DVPrdNumc2 = DecimalUtil.ZERO ;
      Z12069DVPrdPreRe = DecimalUtil.ZERO ;
      Z12070DVMat_Lts = DecimalUtil.ZERO ;
      Z12071DVPrdExiAc = DecimalUtil.ZERO ;
      Z12075DVPrdPesTe = "" ;
      Z12077DVPrdSal = "" ;
      Z12079DVPrdInc = "" ;
      Z12080DVPrdComp = "" ;
      Z12081DVPrdAox = DecimalUtil.ZERO ;
      Z12082DVPrdNCAS = "" ;
      Z12083DVPrdFT = "" ;
      Z12084DVPrdFFT = GXutil.nullDate() ;
      Z12085DVPrdHS = "" ;
      Z12086DVPrdFHS = GXutil.nullDate() ;
      Z12087DVPrdReach = "" ;
      Z12088DVPrdOkote = "" ;
      Z12089DVPrdColId = "" ;
      Z12090DVPrdLote = "" ;
      Z12091DVPrdRTM = "" ;
      Z12092DVPrdCtw1 = "" ;
      Z12093DVPrdCtw2 = "" ;
      Z12094DVPrdCtw3 = "" ;
      Z12095DVPrdNroCA = "" ;
      Z12096DVPrdGots = "" ;
      Z12097DVPrdHm = "" ;
      Z12099DVPrdEINEC = "" ;
      Z12100DVPrdFunci = "" ;
      Z12101DVPrdNmQu = "" ;
      Z12102DVPrdEqLP = "" ;
      Z12103DVPrdConc = DecimalUtil.ZERO ;
      Z12104DVPrdCtw4 = "" ;
      Z12105DVPrdList = "" ;
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
      A11935DVPrdNum = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12003DVPrdNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12005DVPrdExiAl = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A12006DVPrdPreAc = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A12008DVPrdDetPa = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12010DVPrdFulEn = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A12011DVPrdCanPe = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A12012DVPrdRotRe = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A12013DVPrdPreMe = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A12014DVPrdRec = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12015DVPrdPreAn = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A12016DVPrdFecPr = GXutil.nullDate() ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12018DVPrdExiCC = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A12019DVPrdUltDC = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A12020DVPrdUltEC = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A12022DVPrdExiCP = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A12023DVPrdDifCC = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A12024DVPrdFacCo = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A12025DVPrdConDi = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A12026DVPrdStkMi = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      A12032DVPrdNumUc = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A12033DVPrdCanRe = DecimalUtil.ZERO ;
      lblTextblock34_Jsonclick = "" ;
      A12034DVPrdFulPe = GXutil.nullDate() ;
      lblTextblock35_Jsonclick = "" ;
      A12035DVPrdFulCC = GXutil.nullDate() ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      A12037DVPrdDscTe = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A12040DVPrdRefPr = "" ;
      lblTextblock41_Jsonclick = "" ;
      A12041DVPrdSus = "" ;
      lblTextblock42_Jsonclick = "" ;
      A12042DVPrdCalNe = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A12045DVPrdValSt = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      A12046DVDifValSt = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A12047DVPrdFecEn = GXutil.nullDate() ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      A12050DVPrdTip = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      A12052DVPrdRev = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      A12056DVPrdNom2 = "" ;
      lblTextblock57_Jsonclick = "" ;
      A12057DVPrdNum2 = "" ;
      lblTextblock58_Jsonclick = "" ;
      A12058DVPrdObs = "" ;
      lblTextblock59_Jsonclick = "" ;
      A12059DVPrdPreA2 = DecimalUtil.ZERO ;
      lblTextblock60_Jsonclick = "" ;
      A12060DVPrdDensS = DecimalUtil.ZERO ;
      lblTextblock61_Jsonclick = "" ;
      A12061DVPrdConcS = DecimalUtil.ZERO ;
      lblTextblock62_Jsonclick = "" ;
      A12062DVPrdSalM = "" ;
      lblTextblock63_Jsonclick = "" ;
      A12063DVPrdSolub = DecimalUtil.ZERO ;
      lblTextblock64_Jsonclick = "" ;
      A12064DVPrdNumCe = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      A12066DVPrdNumct = DecimalUtil.ZERO ;
      lblTextblock67_Jsonclick = "" ;
      A12067DVPrdNumc2 = DecimalUtil.ZERO ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      A12069DVPrdPreRe = DecimalUtil.ZERO ;
      lblTextblock70_Jsonclick = "" ;
      A12070DVMat_Lts = DecimalUtil.ZERO ;
      lblTextblock71_Jsonclick = "" ;
      A12071DVPrdExiAc = DecimalUtil.ZERO ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock75_Jsonclick = "" ;
      A12075DVPrdPesTe = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      A12077DVPrdSal = "" ;
      lblTextblock78_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      A12079DVPrdInc = "" ;
      lblTextblock80_Jsonclick = "" ;
      A12080DVPrdComp = "" ;
      lblTextblock81_Jsonclick = "" ;
      A12081DVPrdAox = DecimalUtil.ZERO ;
      lblTextblock82_Jsonclick = "" ;
      A12082DVPrdNCAS = "" ;
      lblTextblock83_Jsonclick = "" ;
      A12083DVPrdFT = "" ;
      lblTextblock84_Jsonclick = "" ;
      A12084DVPrdFFT = GXutil.nullDate() ;
      lblTextblock85_Jsonclick = "" ;
      A12085DVPrdHS = "" ;
      lblTextblock86_Jsonclick = "" ;
      A12086DVPrdFHS = GXutil.nullDate() ;
      lblTextblock87_Jsonclick = "" ;
      A12087DVPrdReach = "" ;
      lblTextblock88_Jsonclick = "" ;
      A12088DVPrdOkote = "" ;
      lblTextblock89_Jsonclick = "" ;
      A12089DVPrdColId = "" ;
      lblTextblock90_Jsonclick = "" ;
      A12090DVPrdLote = "" ;
      lblTextblock91_Jsonclick = "" ;
      A12091DVPrdRTM = "" ;
      lblTextblock92_Jsonclick = "" ;
      A12092DVPrdCtw1 = "" ;
      lblTextblock93_Jsonclick = "" ;
      A12093DVPrdCtw2 = "" ;
      lblTextblock94_Jsonclick = "" ;
      A12094DVPrdCtw3 = "" ;
      lblTextblock95_Jsonclick = "" ;
      A12095DVPrdNroCA = "" ;
      lblTextblock96_Jsonclick = "" ;
      A12096DVPrdGots = "" ;
      lblTextblock97_Jsonclick = "" ;
      A12097DVPrdHm = "" ;
      lblTextblock98_Jsonclick = "" ;
      lblTextblock99_Jsonclick = "" ;
      A12099DVPrdEINEC = "" ;
      lblTextblock100_Jsonclick = "" ;
      A12100DVPrdFunci = "" ;
      lblTextblock101_Jsonclick = "" ;
      A12101DVPrdNmQu = "" ;
      lblTextblock102_Jsonclick = "" ;
      A12102DVPrdEqLP = "" ;
      lblTextblock103_Jsonclick = "" ;
      A12103DVPrdConc = DecimalUtil.ZERO ;
      lblTextblock104_Jsonclick = "" ;
      A12104DVPrdCtw4 = "" ;
      lblTextblock105_Jsonclick = "" ;
      A12105DVPrdList = "" ;
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
      Z12058DVPrdObs = "" ;
      T01IU5_A12058DVPrdObs = new String[] {""} ;
      T01IU5_n12058DVPrdObs = new boolean[] {false} ;
      T01IU5_A12102DVPrdEqLP = new String[] {""} ;
      T01IU5_n12102DVPrdEqLP = new boolean[] {false} ;
      T01IU5_A12103DVPrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12103DVPrdConc = new boolean[] {false} ;
      T01IU5_A12104DVPrdCtw4 = new String[] {""} ;
      T01IU5_n12104DVPrdCtw4 = new boolean[] {false} ;
      T01IU5_A12105DVPrdList = new String[] {""} ;
      T01IU5_n12105DVPrdList = new boolean[] {false} ;
      T01IU5_A396EmprCod = new String[] {""} ;
      T01IU5_A11935DVPrdNum = new String[] {""} ;
      T01IU5_A12003DVPrdNom = new String[] {""} ;
      T01IU5_n12003DVPrdNom = new boolean[] {false} ;
      T01IU5_A12004DVPrvNum = new int[1] ;
      T01IU5_n12004DVPrvNum = new boolean[] {false} ;
      T01IU5_A12005DVPrdExiAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12005DVPrdExiAl = new boolean[] {false} ;
      T01IU5_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12006DVPrdPreAc = new boolean[] {false} ;
      T01IU5_A12007DVUltLinEn = new short[1] ;
      T01IU5_n12007DVUltLinEn = new boolean[] {false} ;
      T01IU5_A12008DVPrdDetPa = new String[] {""} ;
      T01IU5_n12008DVPrdDetPa = new boolean[] {false} ;
      T01IU5_A12009DVValCod = new byte[1] ;
      T01IU5_n12009DVValCod = new boolean[] {false} ;
      T01IU5_A12010DVPrdFulEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12010DVPrdFulEn = new boolean[] {false} ;
      T01IU5_A12011DVPrdCanPe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12011DVPrdCanPe = new boolean[] {false} ;
      T01IU5_A12012DVPrdRotRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12012DVPrdRotRe = new boolean[] {false} ;
      T01IU5_A12013DVPrdPreMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12013DVPrdPreMe = new boolean[] {false} ;
      T01IU5_A12014DVPrdRec = new String[] {""} ;
      T01IU5_n12014DVPrdRec = new boolean[] {false} ;
      T01IU5_A12015DVPrdPreAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12015DVPrdPreAn = new boolean[] {false} ;
      T01IU5_A12016DVPrdFecPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12016DVPrdFecPr = new boolean[] {false} ;
      T01IU5_A12017DVMovEspUL = new short[1] ;
      T01IU5_n12017DVMovEspUL = new boolean[] {false} ;
      T01IU5_A12018DVPrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12018DVPrdExiCC = new boolean[] {false} ;
      T01IU5_A12019DVPrdUltDC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12019DVPrdUltDC = new boolean[] {false} ;
      T01IU5_A12020DVPrdUltEC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12020DVPrdUltEC = new boolean[] {false} ;
      T01IU5_A12021DVPrdUltCC = new short[1] ;
      T01IU5_n12021DVPrdUltCC = new boolean[] {false} ;
      T01IU5_A12022DVPrdExiCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12022DVPrdExiCP = new boolean[] {false} ;
      T01IU5_A12023DVPrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12023DVPrdDifCC = new boolean[] {false} ;
      T01IU5_A12024DVPrdFacCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12024DVPrdFacCo = new boolean[] {false} ;
      T01IU5_A12025DVPrdConDi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12025DVPrdConDi = new boolean[] {false} ;
      T01IU5_A12026DVPrdStkMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12026DVPrdStkMi = new boolean[] {false} ;
      T01IU5_A12027DVPrdStkMD = new short[1] ;
      T01IU5_n12027DVPrdStkMD = new boolean[] {false} ;
      T01IU5_A12028DVPrdDiaRo = new short[1] ;
      T01IU5_n12028DVPrdDiaRo = new boolean[] {false} ;
      T01IU5_A12029DVPrdPlaEn = new short[1] ;
      T01IU5_n12029DVPrdPlaEn = new boolean[] {false} ;
      T01IU5_A12030DVMetCod = new byte[1] ;
      T01IU5_n12030DVMetCod = new boolean[] {false} ;
      T01IU5_A12031DVPrdLotMi = new short[1] ;
      T01IU5_n12031DVPrdLotMi = new boolean[] {false} ;
      T01IU5_A12032DVPrdNumUc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12032DVPrdNumUc = new boolean[] {false} ;
      T01IU5_A12033DVPrdCanRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12033DVPrdCanRe = new boolean[] {false} ;
      T01IU5_A12034DVPrdFulPe = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12034DVPrdFulPe = new boolean[] {false} ;
      T01IU5_A12035DVPrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12035DVPrdFulCC = new boolean[] {false} ;
      T01IU5_A12036DVPrdConCC = new short[1] ;
      T01IU5_n12036DVPrdConCC = new boolean[] {false} ;
      T01IU5_A12037DVPrdDscTe = new String[] {""} ;
      T01IU5_n12037DVPrdDscTe = new boolean[] {false} ;
      T01IU5_A12038DVPrdUniCo = new byte[1] ;
      T01IU5_n12038DVPrdUniCo = new boolean[] {false} ;
      T01IU5_A12039DVPrdUniCn = new byte[1] ;
      T01IU5_n12039DVPrdUniCn = new boolean[] {false} ;
      T01IU5_A12040DVPrdRefPr = new String[] {""} ;
      T01IU5_n12040DVPrdRefPr = new boolean[] {false} ;
      T01IU5_A12041DVPrdSus = new String[] {""} ;
      T01IU5_n12041DVPrdSus = new boolean[] {false} ;
      T01IU5_A12042DVPrdCalNe = new String[] {""} ;
      T01IU5_n12042DVPrdCalNe = new boolean[] {false} ;
      T01IU5_A12043DVPrdSit = new byte[1] ;
      T01IU5_n12043DVPrdSit = new boolean[] {false} ;
      T01IU5_A12044DVTipDtoCo = new byte[1] ;
      T01IU5_n12044DVTipDtoCo = new boolean[] {false} ;
      T01IU5_A12045DVPrdValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12045DVPrdValSt = new boolean[] {false} ;
      T01IU5_A12046DVDifValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12046DVDifValSt = new boolean[] {false} ;
      T01IU5_A12047DVPrdFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12047DVPrdFecEn = new boolean[] {false} ;
      T01IU5_A12048DVPrdPosX = new short[1] ;
      T01IU5_n12048DVPrdPosX = new boolean[] {false} ;
      T01IU5_A12049DVPrdPosY = new short[1] ;
      T01IU5_n12049DVPrdPosY = new boolean[] {false} ;
      T01IU5_A12050DVPrdTip = new String[] {""} ;
      T01IU5_n12050DVPrdTip = new boolean[] {false} ;
      T01IU5_A12051DVPrdDqo = new short[1] ;
      T01IU5_n12051DVPrdDqo = new boolean[] {false} ;
      T01IU5_A12052DVPrdRev = new String[] {""} ;
      T01IU5_n12052DVPrdRev = new boolean[] {false} ;
      T01IU5_A12053DVPrdTnq = new byte[1] ;
      T01IU5_n12053DVPrdTnq = new boolean[] {false} ;
      T01IU5_A12054DVCCStKULi = new long[1] ;
      T01IU5_n12054DVCCStKULi = new boolean[] {false} ;
      T01IU5_A12055DVPrdUMeFo = new byte[1] ;
      T01IU5_n12055DVPrdUMeFo = new boolean[] {false} ;
      T01IU5_A12056DVPrdNom2 = new String[] {""} ;
      T01IU5_n12056DVPrdNom2 = new boolean[] {false} ;
      T01IU5_A12057DVPrdNum2 = new String[] {""} ;
      T01IU5_n12057DVPrdNum2 = new boolean[] {false} ;
      T01IU5_A12059DVPrdPreA2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12059DVPrdPreA2 = new boolean[] {false} ;
      T01IU5_A12060DVPrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12060DVPrdDensS = new boolean[] {false} ;
      T01IU5_A12061DVPrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12061DVPrdConcS = new boolean[] {false} ;
      T01IU5_A12062DVPrdSalM = new String[] {""} ;
      T01IU5_n12062DVPrdSalM = new boolean[] {false} ;
      T01IU5_A12063DVPrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12063DVPrdSolub = new boolean[] {false} ;
      T01IU5_A12064DVPrdNumCe = new String[] {""} ;
      T01IU5_n12064DVPrdNumCe = new boolean[] {false} ;
      T01IU5_A12065DVTipPrdCo = new short[1] ;
      T01IU5_n12065DVTipPrdCo = new boolean[] {false} ;
      T01IU5_A12066DVPrdNumct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12066DVPrdNumct = new boolean[] {false} ;
      T01IU5_A12067DVPrdNumc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12067DVPrdNumc2 = new boolean[] {false} ;
      T01IU5_A12068DVPrdHorMa = new byte[1] ;
      T01IU5_n12068DVPrdHorMa = new boolean[] {false} ;
      T01IU5_A12069DVPrdPreRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12069DVPrdPreRe = new boolean[] {false} ;
      T01IU5_A12070DVMat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12070DVMat_Lts = new boolean[] {false} ;
      T01IU5_A12071DVPrdExiAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12071DVPrdExiAc = new boolean[] {false} ;
      T01IU5_A12072DVAlmc_Ult = new int[1] ;
      T01IU5_n12072DVAlmc_Ult = new boolean[] {false} ;
      T01IU5_A12073DVPrdAltAc = new byte[1] ;
      T01IU5_n12073DVPrdAltAc = new boolean[] {false} ;
      T01IU5_A12074DVPrdPesCo = new byte[1] ;
      T01IU5_n12074DVPrdPesCo = new boolean[] {false} ;
      T01IU5_A12075DVPrdPesTe = new String[] {""} ;
      T01IU5_n12075DVPrdPesTe = new boolean[] {false} ;
      T01IU5_A12076DVCC_Ultln = new long[1] ;
      T01IU5_n12076DVCC_Ultln = new boolean[] {false} ;
      T01IU5_A12077DVPrdSal = new String[] {""} ;
      T01IU5_n12077DVPrdSal = new boolean[] {false} ;
      T01IU5_A12078DVSubFamCo = new byte[1] ;
      T01IU5_n12078DVSubFamCo = new boolean[] {false} ;
      T01IU5_A12079DVPrdInc = new String[] {""} ;
      T01IU5_n12079DVPrdInc = new boolean[] {false} ;
      T01IU5_A12080DVPrdComp = new String[] {""} ;
      T01IU5_n12080DVPrdComp = new boolean[] {false} ;
      T01IU5_A12081DVPrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU5_n12081DVPrdAox = new boolean[] {false} ;
      T01IU5_A12082DVPrdNCAS = new String[] {""} ;
      T01IU5_n12082DVPrdNCAS = new boolean[] {false} ;
      T01IU5_A12083DVPrdFT = new String[] {""} ;
      T01IU5_n12083DVPrdFT = new boolean[] {false} ;
      T01IU5_A12084DVPrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12084DVPrdFFT = new boolean[] {false} ;
      T01IU5_A12085DVPrdHS = new String[] {""} ;
      T01IU5_n12085DVPrdHS = new boolean[] {false} ;
      T01IU5_A12086DVPrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU5_n12086DVPrdFHS = new boolean[] {false} ;
      T01IU5_A12087DVPrdReach = new String[] {""} ;
      T01IU5_n12087DVPrdReach = new boolean[] {false} ;
      T01IU5_A12088DVPrdOkote = new String[] {""} ;
      T01IU5_n12088DVPrdOkote = new boolean[] {false} ;
      T01IU5_A12089DVPrdColId = new String[] {""} ;
      T01IU5_n12089DVPrdColId = new boolean[] {false} ;
      T01IU5_A12090DVPrdLote = new String[] {""} ;
      T01IU5_n12090DVPrdLote = new boolean[] {false} ;
      T01IU5_A12091DVPrdRTM = new String[] {""} ;
      T01IU5_n12091DVPrdRTM = new boolean[] {false} ;
      T01IU5_A12092DVPrdCtw1 = new String[] {""} ;
      T01IU5_n12092DVPrdCtw1 = new boolean[] {false} ;
      T01IU5_A12093DVPrdCtw2 = new String[] {""} ;
      T01IU5_n12093DVPrdCtw2 = new boolean[] {false} ;
      T01IU5_A12094DVPrdCtw3 = new String[] {""} ;
      T01IU5_n12094DVPrdCtw3 = new boolean[] {false} ;
      T01IU5_A12095DVPrdNroCA = new String[] {""} ;
      T01IU5_n12095DVPrdNroCA = new boolean[] {false} ;
      T01IU5_A12096DVPrdGots = new String[] {""} ;
      T01IU5_n12096DVPrdGots = new boolean[] {false} ;
      T01IU5_A12097DVPrdHm = new String[] {""} ;
      T01IU5_n12097DVPrdHm = new boolean[] {false} ;
      T01IU5_A12098DVPrdConct = new short[1] ;
      T01IU5_n12098DVPrdConct = new boolean[] {false} ;
      T01IU5_A12099DVPrdEINEC = new String[] {""} ;
      T01IU5_n12099DVPrdEINEC = new boolean[] {false} ;
      T01IU5_A12100DVPrdFunci = new String[] {""} ;
      T01IU5_n12100DVPrdFunci = new boolean[] {false} ;
      T01IU5_A12101DVPrdNmQu = new String[] {""} ;
      T01IU5_n12101DVPrdNmQu = new boolean[] {false} ;
      T01IU4_A396EmprCod = new String[] {""} ;
      T01IU6_A396EmprCod = new String[] {""} ;
      T01IU7_A396EmprCod = new String[] {""} ;
      T01IU7_A11935DVPrdNum = new String[] {""} ;
      T01IU3_A12058DVPrdObs = new String[] {""} ;
      T01IU3_n12058DVPrdObs = new boolean[] {false} ;
      T01IU3_A12102DVPrdEqLP = new String[] {""} ;
      T01IU3_n12102DVPrdEqLP = new boolean[] {false} ;
      T01IU3_A12103DVPrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12103DVPrdConc = new boolean[] {false} ;
      T01IU3_A12104DVPrdCtw4 = new String[] {""} ;
      T01IU3_n12104DVPrdCtw4 = new boolean[] {false} ;
      T01IU3_A12105DVPrdList = new String[] {""} ;
      T01IU3_n12105DVPrdList = new boolean[] {false} ;
      T01IU3_A396EmprCod = new String[] {""} ;
      T01IU3_A11935DVPrdNum = new String[] {""} ;
      T01IU3_A12003DVPrdNom = new String[] {""} ;
      T01IU3_n12003DVPrdNom = new boolean[] {false} ;
      T01IU3_A12004DVPrvNum = new int[1] ;
      T01IU3_n12004DVPrvNum = new boolean[] {false} ;
      T01IU3_A12005DVPrdExiAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12005DVPrdExiAl = new boolean[] {false} ;
      T01IU3_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12006DVPrdPreAc = new boolean[] {false} ;
      T01IU3_A12007DVUltLinEn = new short[1] ;
      T01IU3_n12007DVUltLinEn = new boolean[] {false} ;
      T01IU3_A12008DVPrdDetPa = new String[] {""} ;
      T01IU3_n12008DVPrdDetPa = new boolean[] {false} ;
      T01IU3_A12009DVValCod = new byte[1] ;
      T01IU3_n12009DVValCod = new boolean[] {false} ;
      T01IU3_A12010DVPrdFulEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12010DVPrdFulEn = new boolean[] {false} ;
      T01IU3_A12011DVPrdCanPe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12011DVPrdCanPe = new boolean[] {false} ;
      T01IU3_A12012DVPrdRotRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12012DVPrdRotRe = new boolean[] {false} ;
      T01IU3_A12013DVPrdPreMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12013DVPrdPreMe = new boolean[] {false} ;
      T01IU3_A12014DVPrdRec = new String[] {""} ;
      T01IU3_n12014DVPrdRec = new boolean[] {false} ;
      T01IU3_A12015DVPrdPreAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12015DVPrdPreAn = new boolean[] {false} ;
      T01IU3_A12016DVPrdFecPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12016DVPrdFecPr = new boolean[] {false} ;
      T01IU3_A12017DVMovEspUL = new short[1] ;
      T01IU3_n12017DVMovEspUL = new boolean[] {false} ;
      T01IU3_A12018DVPrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12018DVPrdExiCC = new boolean[] {false} ;
      T01IU3_A12019DVPrdUltDC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12019DVPrdUltDC = new boolean[] {false} ;
      T01IU3_A12020DVPrdUltEC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12020DVPrdUltEC = new boolean[] {false} ;
      T01IU3_A12021DVPrdUltCC = new short[1] ;
      T01IU3_n12021DVPrdUltCC = new boolean[] {false} ;
      T01IU3_A12022DVPrdExiCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12022DVPrdExiCP = new boolean[] {false} ;
      T01IU3_A12023DVPrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12023DVPrdDifCC = new boolean[] {false} ;
      T01IU3_A12024DVPrdFacCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12024DVPrdFacCo = new boolean[] {false} ;
      T01IU3_A12025DVPrdConDi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12025DVPrdConDi = new boolean[] {false} ;
      T01IU3_A12026DVPrdStkMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12026DVPrdStkMi = new boolean[] {false} ;
      T01IU3_A12027DVPrdStkMD = new short[1] ;
      T01IU3_n12027DVPrdStkMD = new boolean[] {false} ;
      T01IU3_A12028DVPrdDiaRo = new short[1] ;
      T01IU3_n12028DVPrdDiaRo = new boolean[] {false} ;
      T01IU3_A12029DVPrdPlaEn = new short[1] ;
      T01IU3_n12029DVPrdPlaEn = new boolean[] {false} ;
      T01IU3_A12030DVMetCod = new byte[1] ;
      T01IU3_n12030DVMetCod = new boolean[] {false} ;
      T01IU3_A12031DVPrdLotMi = new short[1] ;
      T01IU3_n12031DVPrdLotMi = new boolean[] {false} ;
      T01IU3_A12032DVPrdNumUc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12032DVPrdNumUc = new boolean[] {false} ;
      T01IU3_A12033DVPrdCanRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12033DVPrdCanRe = new boolean[] {false} ;
      T01IU3_A12034DVPrdFulPe = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12034DVPrdFulPe = new boolean[] {false} ;
      T01IU3_A12035DVPrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12035DVPrdFulCC = new boolean[] {false} ;
      T01IU3_A12036DVPrdConCC = new short[1] ;
      T01IU3_n12036DVPrdConCC = new boolean[] {false} ;
      T01IU3_A12037DVPrdDscTe = new String[] {""} ;
      T01IU3_n12037DVPrdDscTe = new boolean[] {false} ;
      T01IU3_A12038DVPrdUniCo = new byte[1] ;
      T01IU3_n12038DVPrdUniCo = new boolean[] {false} ;
      T01IU3_A12039DVPrdUniCn = new byte[1] ;
      T01IU3_n12039DVPrdUniCn = new boolean[] {false} ;
      T01IU3_A12040DVPrdRefPr = new String[] {""} ;
      T01IU3_n12040DVPrdRefPr = new boolean[] {false} ;
      T01IU3_A12041DVPrdSus = new String[] {""} ;
      T01IU3_n12041DVPrdSus = new boolean[] {false} ;
      T01IU3_A12042DVPrdCalNe = new String[] {""} ;
      T01IU3_n12042DVPrdCalNe = new boolean[] {false} ;
      T01IU3_A12043DVPrdSit = new byte[1] ;
      T01IU3_n12043DVPrdSit = new boolean[] {false} ;
      T01IU3_A12044DVTipDtoCo = new byte[1] ;
      T01IU3_n12044DVTipDtoCo = new boolean[] {false} ;
      T01IU3_A12045DVPrdValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12045DVPrdValSt = new boolean[] {false} ;
      T01IU3_A12046DVDifValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12046DVDifValSt = new boolean[] {false} ;
      T01IU3_A12047DVPrdFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12047DVPrdFecEn = new boolean[] {false} ;
      T01IU3_A12048DVPrdPosX = new short[1] ;
      T01IU3_n12048DVPrdPosX = new boolean[] {false} ;
      T01IU3_A12049DVPrdPosY = new short[1] ;
      T01IU3_n12049DVPrdPosY = new boolean[] {false} ;
      T01IU3_A12050DVPrdTip = new String[] {""} ;
      T01IU3_n12050DVPrdTip = new boolean[] {false} ;
      T01IU3_A12051DVPrdDqo = new short[1] ;
      T01IU3_n12051DVPrdDqo = new boolean[] {false} ;
      T01IU3_A12052DVPrdRev = new String[] {""} ;
      T01IU3_n12052DVPrdRev = new boolean[] {false} ;
      T01IU3_A12053DVPrdTnq = new byte[1] ;
      T01IU3_n12053DVPrdTnq = new boolean[] {false} ;
      T01IU3_A12054DVCCStKULi = new long[1] ;
      T01IU3_n12054DVCCStKULi = new boolean[] {false} ;
      T01IU3_A12055DVPrdUMeFo = new byte[1] ;
      T01IU3_n12055DVPrdUMeFo = new boolean[] {false} ;
      T01IU3_A12056DVPrdNom2 = new String[] {""} ;
      T01IU3_n12056DVPrdNom2 = new boolean[] {false} ;
      T01IU3_A12057DVPrdNum2 = new String[] {""} ;
      T01IU3_n12057DVPrdNum2 = new boolean[] {false} ;
      T01IU3_A12059DVPrdPreA2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12059DVPrdPreA2 = new boolean[] {false} ;
      T01IU3_A12060DVPrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12060DVPrdDensS = new boolean[] {false} ;
      T01IU3_A12061DVPrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12061DVPrdConcS = new boolean[] {false} ;
      T01IU3_A12062DVPrdSalM = new String[] {""} ;
      T01IU3_n12062DVPrdSalM = new boolean[] {false} ;
      T01IU3_A12063DVPrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12063DVPrdSolub = new boolean[] {false} ;
      T01IU3_A12064DVPrdNumCe = new String[] {""} ;
      T01IU3_n12064DVPrdNumCe = new boolean[] {false} ;
      T01IU3_A12065DVTipPrdCo = new short[1] ;
      T01IU3_n12065DVTipPrdCo = new boolean[] {false} ;
      T01IU3_A12066DVPrdNumct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12066DVPrdNumct = new boolean[] {false} ;
      T01IU3_A12067DVPrdNumc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12067DVPrdNumc2 = new boolean[] {false} ;
      T01IU3_A12068DVPrdHorMa = new byte[1] ;
      T01IU3_n12068DVPrdHorMa = new boolean[] {false} ;
      T01IU3_A12069DVPrdPreRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12069DVPrdPreRe = new boolean[] {false} ;
      T01IU3_A12070DVMat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12070DVMat_Lts = new boolean[] {false} ;
      T01IU3_A12071DVPrdExiAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12071DVPrdExiAc = new boolean[] {false} ;
      T01IU3_A12072DVAlmc_Ult = new int[1] ;
      T01IU3_n12072DVAlmc_Ult = new boolean[] {false} ;
      T01IU3_A12073DVPrdAltAc = new byte[1] ;
      T01IU3_n12073DVPrdAltAc = new boolean[] {false} ;
      T01IU3_A12074DVPrdPesCo = new byte[1] ;
      T01IU3_n12074DVPrdPesCo = new boolean[] {false} ;
      T01IU3_A12075DVPrdPesTe = new String[] {""} ;
      T01IU3_n12075DVPrdPesTe = new boolean[] {false} ;
      T01IU3_A12076DVCC_Ultln = new long[1] ;
      T01IU3_n12076DVCC_Ultln = new boolean[] {false} ;
      T01IU3_A12077DVPrdSal = new String[] {""} ;
      T01IU3_n12077DVPrdSal = new boolean[] {false} ;
      T01IU3_A12078DVSubFamCo = new byte[1] ;
      T01IU3_n12078DVSubFamCo = new boolean[] {false} ;
      T01IU3_A12079DVPrdInc = new String[] {""} ;
      T01IU3_n12079DVPrdInc = new boolean[] {false} ;
      T01IU3_A12080DVPrdComp = new String[] {""} ;
      T01IU3_n12080DVPrdComp = new boolean[] {false} ;
      T01IU3_A12081DVPrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU3_n12081DVPrdAox = new boolean[] {false} ;
      T01IU3_A12082DVPrdNCAS = new String[] {""} ;
      T01IU3_n12082DVPrdNCAS = new boolean[] {false} ;
      T01IU3_A12083DVPrdFT = new String[] {""} ;
      T01IU3_n12083DVPrdFT = new boolean[] {false} ;
      T01IU3_A12084DVPrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12084DVPrdFFT = new boolean[] {false} ;
      T01IU3_A12085DVPrdHS = new String[] {""} ;
      T01IU3_n12085DVPrdHS = new boolean[] {false} ;
      T01IU3_A12086DVPrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU3_n12086DVPrdFHS = new boolean[] {false} ;
      T01IU3_A12087DVPrdReach = new String[] {""} ;
      T01IU3_n12087DVPrdReach = new boolean[] {false} ;
      T01IU3_A12088DVPrdOkote = new String[] {""} ;
      T01IU3_n12088DVPrdOkote = new boolean[] {false} ;
      T01IU3_A12089DVPrdColId = new String[] {""} ;
      T01IU3_n12089DVPrdColId = new boolean[] {false} ;
      T01IU3_A12090DVPrdLote = new String[] {""} ;
      T01IU3_n12090DVPrdLote = new boolean[] {false} ;
      T01IU3_A12091DVPrdRTM = new String[] {""} ;
      T01IU3_n12091DVPrdRTM = new boolean[] {false} ;
      T01IU3_A12092DVPrdCtw1 = new String[] {""} ;
      T01IU3_n12092DVPrdCtw1 = new boolean[] {false} ;
      T01IU3_A12093DVPrdCtw2 = new String[] {""} ;
      T01IU3_n12093DVPrdCtw2 = new boolean[] {false} ;
      T01IU3_A12094DVPrdCtw3 = new String[] {""} ;
      T01IU3_n12094DVPrdCtw3 = new boolean[] {false} ;
      T01IU3_A12095DVPrdNroCA = new String[] {""} ;
      T01IU3_n12095DVPrdNroCA = new boolean[] {false} ;
      T01IU3_A12096DVPrdGots = new String[] {""} ;
      T01IU3_n12096DVPrdGots = new boolean[] {false} ;
      T01IU3_A12097DVPrdHm = new String[] {""} ;
      T01IU3_n12097DVPrdHm = new boolean[] {false} ;
      T01IU3_A12098DVPrdConct = new short[1] ;
      T01IU3_n12098DVPrdConct = new boolean[] {false} ;
      T01IU3_A12099DVPrdEINEC = new String[] {""} ;
      T01IU3_n12099DVPrdEINEC = new boolean[] {false} ;
      T01IU3_A12100DVPrdFunci = new String[] {""} ;
      T01IU3_n12100DVPrdFunci = new boolean[] {false} ;
      T01IU3_A12101DVPrdNmQu = new String[] {""} ;
      T01IU3_n12101DVPrdNmQu = new boolean[] {false} ;
      sMode1678 = "" ;
      T01IU8_A396EmprCod = new String[] {""} ;
      T01IU8_A11935DVPrdNum = new String[] {""} ;
      T01IU9_A396EmprCod = new String[] {""} ;
      T01IU9_A11935DVPrdNum = new String[] {""} ;
      T01IU2_A12058DVPrdObs = new String[] {""} ;
      T01IU2_n12058DVPrdObs = new boolean[] {false} ;
      T01IU2_A12102DVPrdEqLP = new String[] {""} ;
      T01IU2_n12102DVPrdEqLP = new boolean[] {false} ;
      T01IU2_A12103DVPrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12103DVPrdConc = new boolean[] {false} ;
      T01IU2_A12104DVPrdCtw4 = new String[] {""} ;
      T01IU2_n12104DVPrdCtw4 = new boolean[] {false} ;
      T01IU2_A12105DVPrdList = new String[] {""} ;
      T01IU2_n12105DVPrdList = new boolean[] {false} ;
      T01IU2_A396EmprCod = new String[] {""} ;
      T01IU2_A11935DVPrdNum = new String[] {""} ;
      T01IU2_A12003DVPrdNom = new String[] {""} ;
      T01IU2_n12003DVPrdNom = new boolean[] {false} ;
      T01IU2_A12004DVPrvNum = new int[1] ;
      T01IU2_n12004DVPrvNum = new boolean[] {false} ;
      T01IU2_A12005DVPrdExiAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12005DVPrdExiAl = new boolean[] {false} ;
      T01IU2_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12006DVPrdPreAc = new boolean[] {false} ;
      T01IU2_A12007DVUltLinEn = new short[1] ;
      T01IU2_n12007DVUltLinEn = new boolean[] {false} ;
      T01IU2_A12008DVPrdDetPa = new String[] {""} ;
      T01IU2_n12008DVPrdDetPa = new boolean[] {false} ;
      T01IU2_A12009DVValCod = new byte[1] ;
      T01IU2_n12009DVValCod = new boolean[] {false} ;
      T01IU2_A12010DVPrdFulEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12010DVPrdFulEn = new boolean[] {false} ;
      T01IU2_A12011DVPrdCanPe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12011DVPrdCanPe = new boolean[] {false} ;
      T01IU2_A12012DVPrdRotRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12012DVPrdRotRe = new boolean[] {false} ;
      T01IU2_A12013DVPrdPreMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12013DVPrdPreMe = new boolean[] {false} ;
      T01IU2_A12014DVPrdRec = new String[] {""} ;
      T01IU2_n12014DVPrdRec = new boolean[] {false} ;
      T01IU2_A12015DVPrdPreAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12015DVPrdPreAn = new boolean[] {false} ;
      T01IU2_A12016DVPrdFecPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12016DVPrdFecPr = new boolean[] {false} ;
      T01IU2_A12017DVMovEspUL = new short[1] ;
      T01IU2_n12017DVMovEspUL = new boolean[] {false} ;
      T01IU2_A12018DVPrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12018DVPrdExiCC = new boolean[] {false} ;
      T01IU2_A12019DVPrdUltDC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12019DVPrdUltDC = new boolean[] {false} ;
      T01IU2_A12020DVPrdUltEC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12020DVPrdUltEC = new boolean[] {false} ;
      T01IU2_A12021DVPrdUltCC = new short[1] ;
      T01IU2_n12021DVPrdUltCC = new boolean[] {false} ;
      T01IU2_A12022DVPrdExiCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12022DVPrdExiCP = new boolean[] {false} ;
      T01IU2_A12023DVPrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12023DVPrdDifCC = new boolean[] {false} ;
      T01IU2_A12024DVPrdFacCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12024DVPrdFacCo = new boolean[] {false} ;
      T01IU2_A12025DVPrdConDi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12025DVPrdConDi = new boolean[] {false} ;
      T01IU2_A12026DVPrdStkMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12026DVPrdStkMi = new boolean[] {false} ;
      T01IU2_A12027DVPrdStkMD = new short[1] ;
      T01IU2_n12027DVPrdStkMD = new boolean[] {false} ;
      T01IU2_A12028DVPrdDiaRo = new short[1] ;
      T01IU2_n12028DVPrdDiaRo = new boolean[] {false} ;
      T01IU2_A12029DVPrdPlaEn = new short[1] ;
      T01IU2_n12029DVPrdPlaEn = new boolean[] {false} ;
      T01IU2_A12030DVMetCod = new byte[1] ;
      T01IU2_n12030DVMetCod = new boolean[] {false} ;
      T01IU2_A12031DVPrdLotMi = new short[1] ;
      T01IU2_n12031DVPrdLotMi = new boolean[] {false} ;
      T01IU2_A12032DVPrdNumUc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12032DVPrdNumUc = new boolean[] {false} ;
      T01IU2_A12033DVPrdCanRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12033DVPrdCanRe = new boolean[] {false} ;
      T01IU2_A12034DVPrdFulPe = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12034DVPrdFulPe = new boolean[] {false} ;
      T01IU2_A12035DVPrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12035DVPrdFulCC = new boolean[] {false} ;
      T01IU2_A12036DVPrdConCC = new short[1] ;
      T01IU2_n12036DVPrdConCC = new boolean[] {false} ;
      T01IU2_A12037DVPrdDscTe = new String[] {""} ;
      T01IU2_n12037DVPrdDscTe = new boolean[] {false} ;
      T01IU2_A12038DVPrdUniCo = new byte[1] ;
      T01IU2_n12038DVPrdUniCo = new boolean[] {false} ;
      T01IU2_A12039DVPrdUniCn = new byte[1] ;
      T01IU2_n12039DVPrdUniCn = new boolean[] {false} ;
      T01IU2_A12040DVPrdRefPr = new String[] {""} ;
      T01IU2_n12040DVPrdRefPr = new boolean[] {false} ;
      T01IU2_A12041DVPrdSus = new String[] {""} ;
      T01IU2_n12041DVPrdSus = new boolean[] {false} ;
      T01IU2_A12042DVPrdCalNe = new String[] {""} ;
      T01IU2_n12042DVPrdCalNe = new boolean[] {false} ;
      T01IU2_A12043DVPrdSit = new byte[1] ;
      T01IU2_n12043DVPrdSit = new boolean[] {false} ;
      T01IU2_A12044DVTipDtoCo = new byte[1] ;
      T01IU2_n12044DVTipDtoCo = new boolean[] {false} ;
      T01IU2_A12045DVPrdValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12045DVPrdValSt = new boolean[] {false} ;
      T01IU2_A12046DVDifValSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12046DVDifValSt = new boolean[] {false} ;
      T01IU2_A12047DVPrdFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12047DVPrdFecEn = new boolean[] {false} ;
      T01IU2_A12048DVPrdPosX = new short[1] ;
      T01IU2_n12048DVPrdPosX = new boolean[] {false} ;
      T01IU2_A12049DVPrdPosY = new short[1] ;
      T01IU2_n12049DVPrdPosY = new boolean[] {false} ;
      T01IU2_A12050DVPrdTip = new String[] {""} ;
      T01IU2_n12050DVPrdTip = new boolean[] {false} ;
      T01IU2_A12051DVPrdDqo = new short[1] ;
      T01IU2_n12051DVPrdDqo = new boolean[] {false} ;
      T01IU2_A12052DVPrdRev = new String[] {""} ;
      T01IU2_n12052DVPrdRev = new boolean[] {false} ;
      T01IU2_A12053DVPrdTnq = new byte[1] ;
      T01IU2_n12053DVPrdTnq = new boolean[] {false} ;
      T01IU2_A12054DVCCStKULi = new long[1] ;
      T01IU2_n12054DVCCStKULi = new boolean[] {false} ;
      T01IU2_A12055DVPrdUMeFo = new byte[1] ;
      T01IU2_n12055DVPrdUMeFo = new boolean[] {false} ;
      T01IU2_A12056DVPrdNom2 = new String[] {""} ;
      T01IU2_n12056DVPrdNom2 = new boolean[] {false} ;
      T01IU2_A12057DVPrdNum2 = new String[] {""} ;
      T01IU2_n12057DVPrdNum2 = new boolean[] {false} ;
      T01IU2_A12059DVPrdPreA2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12059DVPrdPreA2 = new boolean[] {false} ;
      T01IU2_A12060DVPrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12060DVPrdDensS = new boolean[] {false} ;
      T01IU2_A12061DVPrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12061DVPrdConcS = new boolean[] {false} ;
      T01IU2_A12062DVPrdSalM = new String[] {""} ;
      T01IU2_n12062DVPrdSalM = new boolean[] {false} ;
      T01IU2_A12063DVPrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12063DVPrdSolub = new boolean[] {false} ;
      T01IU2_A12064DVPrdNumCe = new String[] {""} ;
      T01IU2_n12064DVPrdNumCe = new boolean[] {false} ;
      T01IU2_A12065DVTipPrdCo = new short[1] ;
      T01IU2_n12065DVTipPrdCo = new boolean[] {false} ;
      T01IU2_A12066DVPrdNumct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12066DVPrdNumct = new boolean[] {false} ;
      T01IU2_A12067DVPrdNumc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12067DVPrdNumc2 = new boolean[] {false} ;
      T01IU2_A12068DVPrdHorMa = new byte[1] ;
      T01IU2_n12068DVPrdHorMa = new boolean[] {false} ;
      T01IU2_A12069DVPrdPreRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12069DVPrdPreRe = new boolean[] {false} ;
      T01IU2_A12070DVMat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12070DVMat_Lts = new boolean[] {false} ;
      T01IU2_A12071DVPrdExiAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12071DVPrdExiAc = new boolean[] {false} ;
      T01IU2_A12072DVAlmc_Ult = new int[1] ;
      T01IU2_n12072DVAlmc_Ult = new boolean[] {false} ;
      T01IU2_A12073DVPrdAltAc = new byte[1] ;
      T01IU2_n12073DVPrdAltAc = new boolean[] {false} ;
      T01IU2_A12074DVPrdPesCo = new byte[1] ;
      T01IU2_n12074DVPrdPesCo = new boolean[] {false} ;
      T01IU2_A12075DVPrdPesTe = new String[] {""} ;
      T01IU2_n12075DVPrdPesTe = new boolean[] {false} ;
      T01IU2_A12076DVCC_Ultln = new long[1] ;
      T01IU2_n12076DVCC_Ultln = new boolean[] {false} ;
      T01IU2_A12077DVPrdSal = new String[] {""} ;
      T01IU2_n12077DVPrdSal = new boolean[] {false} ;
      T01IU2_A12078DVSubFamCo = new byte[1] ;
      T01IU2_n12078DVSubFamCo = new boolean[] {false} ;
      T01IU2_A12079DVPrdInc = new String[] {""} ;
      T01IU2_n12079DVPrdInc = new boolean[] {false} ;
      T01IU2_A12080DVPrdComp = new String[] {""} ;
      T01IU2_n12080DVPrdComp = new boolean[] {false} ;
      T01IU2_A12081DVPrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IU2_n12081DVPrdAox = new boolean[] {false} ;
      T01IU2_A12082DVPrdNCAS = new String[] {""} ;
      T01IU2_n12082DVPrdNCAS = new boolean[] {false} ;
      T01IU2_A12083DVPrdFT = new String[] {""} ;
      T01IU2_n12083DVPrdFT = new boolean[] {false} ;
      T01IU2_A12084DVPrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12084DVPrdFFT = new boolean[] {false} ;
      T01IU2_A12085DVPrdHS = new String[] {""} ;
      T01IU2_n12085DVPrdHS = new boolean[] {false} ;
      T01IU2_A12086DVPrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T01IU2_n12086DVPrdFHS = new boolean[] {false} ;
      T01IU2_A12087DVPrdReach = new String[] {""} ;
      T01IU2_n12087DVPrdReach = new boolean[] {false} ;
      T01IU2_A12088DVPrdOkote = new String[] {""} ;
      T01IU2_n12088DVPrdOkote = new boolean[] {false} ;
      T01IU2_A12089DVPrdColId = new String[] {""} ;
      T01IU2_n12089DVPrdColId = new boolean[] {false} ;
      T01IU2_A12090DVPrdLote = new String[] {""} ;
      T01IU2_n12090DVPrdLote = new boolean[] {false} ;
      T01IU2_A12091DVPrdRTM = new String[] {""} ;
      T01IU2_n12091DVPrdRTM = new boolean[] {false} ;
      T01IU2_A12092DVPrdCtw1 = new String[] {""} ;
      T01IU2_n12092DVPrdCtw1 = new boolean[] {false} ;
      T01IU2_A12093DVPrdCtw2 = new String[] {""} ;
      T01IU2_n12093DVPrdCtw2 = new boolean[] {false} ;
      T01IU2_A12094DVPrdCtw3 = new String[] {""} ;
      T01IU2_n12094DVPrdCtw3 = new boolean[] {false} ;
      T01IU2_A12095DVPrdNroCA = new String[] {""} ;
      T01IU2_n12095DVPrdNroCA = new boolean[] {false} ;
      T01IU2_A12096DVPrdGots = new String[] {""} ;
      T01IU2_n12096DVPrdGots = new boolean[] {false} ;
      T01IU2_A12097DVPrdHm = new String[] {""} ;
      T01IU2_n12097DVPrdHm = new boolean[] {false} ;
      T01IU2_A12098DVPrdConct = new short[1] ;
      T01IU2_n12098DVPrdConct = new boolean[] {false} ;
      T01IU2_A12099DVPrdEINEC = new String[] {""} ;
      T01IU2_n12099DVPrdEINEC = new boolean[] {false} ;
      T01IU2_A12100DVPrdFunci = new String[] {""} ;
      T01IU2_n12100DVPrdFunci = new boolean[] {false} ;
      T01IU2_A12101DVPrdNmQu = new String[] {""} ;
      T01IU2_n12101DVPrdNmQu = new boolean[] {false} ;
      T01IU13_A396EmprCod = new String[] {""} ;
      T01IU13_A11935DVPrdNum = new String[] {""} ;
      T01IU13_A12106DVPrdPrv = new int[1] ;
      T01IU14_A396EmprCod = new String[] {""} ;
      T01IU14_A11935DVPrdNum = new String[] {""} ;
      T01IU14_A11941DVCC_AlmCo = new byte[1] ;
      T01IU15_A396EmprCod = new String[] {""} ;
      T01IU15_A11935DVPrdNum = new String[] {""} ;
      T01IU15_A11972DVLinEnt = new short[1] ;
      T01IU16_A396EmprCod = new String[] {""} ;
      T01IU16_A11935DVPrdNum = new String[] {""} ;
      T01IU16_A11950DVCCStkLin = new long[1] ;
      T01IU17_A396EmprCod = new String[] {""} ;
      T01IU17_A11935DVPrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01IU18_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ11935DVPrdNum = "" ;
      ZZ12003DVPrdNom = "" ;
      ZZ12005DVPrdExiAl = DecimalUtil.ZERO ;
      ZZ12006DVPrdPreAc = DecimalUtil.ZERO ;
      ZZ12008DVPrdDetPa = "" ;
      ZZ12010DVPrdFulEn = GXutil.nullDate() ;
      ZZ12011DVPrdCanPe = DecimalUtil.ZERO ;
      ZZ12012DVPrdRotRe = DecimalUtil.ZERO ;
      ZZ12013DVPrdPreMe = DecimalUtil.ZERO ;
      ZZ12014DVPrdRec = "" ;
      ZZ12015DVPrdPreAn = DecimalUtil.ZERO ;
      ZZ12016DVPrdFecPr = GXutil.nullDate() ;
      ZZ12018DVPrdExiCC = DecimalUtil.ZERO ;
      ZZ12019DVPrdUltDC = DecimalUtil.ZERO ;
      ZZ12020DVPrdUltEC = DecimalUtil.ZERO ;
      ZZ12022DVPrdExiCP = DecimalUtil.ZERO ;
      ZZ12023DVPrdDifCC = DecimalUtil.ZERO ;
      ZZ12024DVPrdFacCo = DecimalUtil.ZERO ;
      ZZ12025DVPrdConDi = DecimalUtil.ZERO ;
      ZZ12026DVPrdStkMi = DecimalUtil.ZERO ;
      ZZ12032DVPrdNumUc = DecimalUtil.ZERO ;
      ZZ12033DVPrdCanRe = DecimalUtil.ZERO ;
      ZZ12034DVPrdFulPe = GXutil.nullDate() ;
      ZZ12035DVPrdFulCC = GXutil.nullDate() ;
      ZZ12037DVPrdDscTe = "" ;
      ZZ12040DVPrdRefPr = "" ;
      ZZ12041DVPrdSus = "" ;
      ZZ12042DVPrdCalNe = "" ;
      ZZ12045DVPrdValSt = DecimalUtil.ZERO ;
      ZZ12046DVDifValSt = DecimalUtil.ZERO ;
      ZZ12047DVPrdFecEn = GXutil.nullDate() ;
      ZZ12050DVPrdTip = "" ;
      ZZ12052DVPrdRev = "" ;
      ZZ12056DVPrdNom2 = "" ;
      ZZ12057DVPrdNum2 = "" ;
      ZZ12058DVPrdObs = "" ;
      ZZ12059DVPrdPreA2 = DecimalUtil.ZERO ;
      ZZ12060DVPrdDensS = DecimalUtil.ZERO ;
      ZZ12061DVPrdConcS = DecimalUtil.ZERO ;
      ZZ12062DVPrdSalM = "" ;
      ZZ12063DVPrdSolub = DecimalUtil.ZERO ;
      ZZ12064DVPrdNumCe = "" ;
      ZZ12066DVPrdNumct = DecimalUtil.ZERO ;
      ZZ12067DVPrdNumc2 = DecimalUtil.ZERO ;
      ZZ12069DVPrdPreRe = DecimalUtil.ZERO ;
      ZZ12070DVMat_Lts = DecimalUtil.ZERO ;
      ZZ12071DVPrdExiAc = DecimalUtil.ZERO ;
      ZZ12075DVPrdPesTe = "" ;
      ZZ12077DVPrdSal = "" ;
      ZZ12079DVPrdInc = "" ;
      ZZ12080DVPrdComp = "" ;
      ZZ12081DVPrdAox = DecimalUtil.ZERO ;
      ZZ12082DVPrdNCAS = "" ;
      ZZ12083DVPrdFT = "" ;
      ZZ12084DVPrdFFT = GXutil.nullDate() ;
      ZZ12085DVPrdHS = "" ;
      ZZ12086DVPrdFHS = GXutil.nullDate() ;
      ZZ12087DVPrdReach = "" ;
      ZZ12088DVPrdOkote = "" ;
      ZZ12089DVPrdColId = "" ;
      ZZ12090DVPrdLote = "" ;
      ZZ12091DVPrdRTM = "" ;
      ZZ12092DVPrdCtw1 = "" ;
      ZZ12093DVPrdCtw2 = "" ;
      ZZ12094DVPrdCtw3 = "" ;
      ZZ12095DVPrdNroCA = "" ;
      ZZ12096DVPrdGots = "" ;
      ZZ12097DVPrdHm = "" ;
      ZZ12099DVPrdEINEC = "" ;
      ZZ12100DVPrdFunci = "" ;
      ZZ12101DVPrdNmQu = "" ;
      ZZ12102DVPrdEqLP = "" ;
      ZZ12103DVPrdConc = DecimalUtil.ZERO ;
      ZZ12104DVPrdCtw4 = "" ;
      ZZ12105DVPrdList = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdvproduc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdvproduc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdvproduc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdvproduc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdvproduc__default(),
         new Object[] {
             new Object[] {
            T01IU2_A12058DVPrdObs, T01IU2_n12058DVPrdObs, T01IU2_A12102DVPrdEqLP, T01IU2_n12102DVPrdEqLP, T01IU2_A12103DVPrdConc, T01IU2_n12103DVPrdConc, T01IU2_A12104DVPrdCtw4, T01IU2_n12104DVPrdCtw4, T01IU2_A12105DVPrdList, T01IU2_n12105DVPrdList,
            T01IU2_A396EmprCod, T01IU2_A11935DVPrdNum, T01IU2_A12003DVPrdNom, T01IU2_n12003DVPrdNom, T01IU2_A12004DVPrvNum, T01IU2_n12004DVPrvNum, T01IU2_A12005DVPrdExiAl, T01IU2_n12005DVPrdExiAl, T01IU2_A12006DVPrdPreAc, T01IU2_n12006DVPrdPreAc,
            T01IU2_A12007DVUltLinEn, T01IU2_n12007DVUltLinEn, T01IU2_A12008DVPrdDetPa, T01IU2_n12008DVPrdDetPa, T01IU2_A12009DVValCod, T01IU2_n12009DVValCod, T01IU2_A12010DVPrdFulEn, T01IU2_n12010DVPrdFulEn, T01IU2_A12011DVPrdCanPe, T01IU2_n12011DVPrdCanPe,
            T01IU2_A12012DVPrdRotRe, T01IU2_n12012DVPrdRotRe, T01IU2_A12013DVPrdPreMe, T01IU2_n12013DVPrdPreMe, T01IU2_A12014DVPrdRec, T01IU2_n12014DVPrdRec, T01IU2_A12015DVPrdPreAn, T01IU2_n12015DVPrdPreAn, T01IU2_A12016DVPrdFecPr, T01IU2_n12016DVPrdFecPr,
            T01IU2_A12017DVMovEspUL, T01IU2_n12017DVMovEspUL, T01IU2_A12018DVPrdExiCC, T01IU2_n12018DVPrdExiCC, T01IU2_A12019DVPrdUltDC, T01IU2_n12019DVPrdUltDC, T01IU2_A12020DVPrdUltEC, T01IU2_n12020DVPrdUltEC, T01IU2_A12021DVPrdUltCC, T01IU2_n12021DVPrdUltCC,
            T01IU2_A12022DVPrdExiCP, T01IU2_n12022DVPrdExiCP, T01IU2_A12023DVPrdDifCC, T01IU2_n12023DVPrdDifCC, T01IU2_A12024DVPrdFacCo, T01IU2_n12024DVPrdFacCo, T01IU2_A12025DVPrdConDi, T01IU2_n12025DVPrdConDi, T01IU2_A12026DVPrdStkMi, T01IU2_n12026DVPrdStkMi,
            T01IU2_A12027DVPrdStkMD, T01IU2_n12027DVPrdStkMD, T01IU2_A12028DVPrdDiaRo, T01IU2_n12028DVPrdDiaRo, T01IU2_A12029DVPrdPlaEn, T01IU2_n12029DVPrdPlaEn, T01IU2_A12030DVMetCod, T01IU2_n12030DVMetCod, T01IU2_A12031DVPrdLotMi, T01IU2_n12031DVPrdLotMi,
            T01IU2_A12032DVPrdNumUc, T01IU2_n12032DVPrdNumUc, T01IU2_A12033DVPrdCanRe, T01IU2_n12033DVPrdCanRe, T01IU2_A12034DVPrdFulPe, T01IU2_n12034DVPrdFulPe, T01IU2_A12035DVPrdFulCC, T01IU2_n12035DVPrdFulCC, T01IU2_A12036DVPrdConCC, T01IU2_n12036DVPrdConCC,
            T01IU2_A12037DVPrdDscTe, T01IU2_n12037DVPrdDscTe, T01IU2_A12038DVPrdUniCo, T01IU2_n12038DVPrdUniCo, T01IU2_A12039DVPrdUniCn, T01IU2_n12039DVPrdUniCn, T01IU2_A12040DVPrdRefPr, T01IU2_n12040DVPrdRefPr, T01IU2_A12041DVPrdSus, T01IU2_n12041DVPrdSus,
            T01IU2_A12042DVPrdCalNe, T01IU2_n12042DVPrdCalNe, T01IU2_A12043DVPrdSit, T01IU2_n12043DVPrdSit, T01IU2_A12044DVTipDtoCo, T01IU2_n12044DVTipDtoCo, T01IU2_A12045DVPrdValSt, T01IU2_n12045DVPrdValSt, T01IU2_A12046DVDifValSt, T01IU2_n12046DVDifValSt,
            T01IU2_A12047DVPrdFecEn, T01IU2_n12047DVPrdFecEn, T01IU2_A12048DVPrdPosX, T01IU2_n12048DVPrdPosX, T01IU2_A12049DVPrdPosY, T01IU2_n12049DVPrdPosY, T01IU2_A12050DVPrdTip, T01IU2_n12050DVPrdTip, T01IU2_A12051DVPrdDqo, T01IU2_n12051DVPrdDqo,
            T01IU2_A12052DVPrdRev, T01IU2_n12052DVPrdRev, T01IU2_A12053DVPrdTnq, T01IU2_n12053DVPrdTnq, T01IU2_A12054DVCCStKULi, T01IU2_n12054DVCCStKULi, T01IU2_A12055DVPrdUMeFo, T01IU2_n12055DVPrdUMeFo, T01IU2_A12056DVPrdNom2, T01IU2_n12056DVPrdNom2,
            T01IU2_A12057DVPrdNum2, T01IU2_n12057DVPrdNum2, T01IU2_A12059DVPrdPreA2, T01IU2_n12059DVPrdPreA2, T01IU2_A12060DVPrdDensS, T01IU2_n12060DVPrdDensS, T01IU2_A12061DVPrdConcS, T01IU2_n12061DVPrdConcS, T01IU2_A12062DVPrdSalM, T01IU2_n12062DVPrdSalM,
            T01IU2_A12063DVPrdSolub, T01IU2_n12063DVPrdSolub, T01IU2_A12064DVPrdNumCe, T01IU2_n12064DVPrdNumCe, T01IU2_A12065DVTipPrdCo, T01IU2_n12065DVTipPrdCo, T01IU2_A12066DVPrdNumct, T01IU2_n12066DVPrdNumct, T01IU2_A12067DVPrdNumc2, T01IU2_n12067DVPrdNumc2,
            T01IU2_A12068DVPrdHorMa, T01IU2_n12068DVPrdHorMa, T01IU2_A12069DVPrdPreRe, T01IU2_n12069DVPrdPreRe, T01IU2_A12070DVMat_Lts, T01IU2_n12070DVMat_Lts, T01IU2_A12071DVPrdExiAc, T01IU2_n12071DVPrdExiAc, T01IU2_A12072DVAlmc_Ult, T01IU2_n12072DVAlmc_Ult,
            T01IU2_A12073DVPrdAltAc, T01IU2_n12073DVPrdAltAc, T01IU2_A12074DVPrdPesCo, T01IU2_n12074DVPrdPesCo, T01IU2_A12075DVPrdPesTe, T01IU2_n12075DVPrdPesTe, T01IU2_A12076DVCC_Ultln, T01IU2_n12076DVCC_Ultln, T01IU2_A12077DVPrdSal, T01IU2_n12077DVPrdSal,
            T01IU2_A12078DVSubFamCo, T01IU2_n12078DVSubFamCo, T01IU2_A12079DVPrdInc, T01IU2_n12079DVPrdInc, T01IU2_A12080DVPrdComp, T01IU2_n12080DVPrdComp, T01IU2_A12081DVPrdAox, T01IU2_n12081DVPrdAox, T01IU2_A12082DVPrdNCAS, T01IU2_n12082DVPrdNCAS,
            T01IU2_A12083DVPrdFT, T01IU2_n12083DVPrdFT, T01IU2_A12084DVPrdFFT, T01IU2_n12084DVPrdFFT, T01IU2_A12085DVPrdHS, T01IU2_n12085DVPrdHS, T01IU2_A12086DVPrdFHS, T01IU2_n12086DVPrdFHS, T01IU2_A12087DVPrdReach, T01IU2_n12087DVPrdReach,
            T01IU2_A12088DVPrdOkote, T01IU2_n12088DVPrdOkote, T01IU2_A12089DVPrdColId, T01IU2_n12089DVPrdColId, T01IU2_A12090DVPrdLote, T01IU2_n12090DVPrdLote, T01IU2_A12091DVPrdRTM, T01IU2_n12091DVPrdRTM, T01IU2_A12092DVPrdCtw1, T01IU2_n12092DVPrdCtw1,
            T01IU2_A12093DVPrdCtw2, T01IU2_n12093DVPrdCtw2, T01IU2_A12094DVPrdCtw3, T01IU2_n12094DVPrdCtw3, T01IU2_A12095DVPrdNroCA, T01IU2_n12095DVPrdNroCA, T01IU2_A12096DVPrdGots, T01IU2_n12096DVPrdGots, T01IU2_A12097DVPrdHm, T01IU2_n12097DVPrdHm,
            T01IU2_A12098DVPrdConct, T01IU2_n12098DVPrdConct, T01IU2_A12099DVPrdEINEC, T01IU2_n12099DVPrdEINEC, T01IU2_A12100DVPrdFunci, T01IU2_n12100DVPrdFunci, T01IU2_A12101DVPrdNmQu, T01IU2_n12101DVPrdNmQu
            }
            , new Object[] {
            T01IU3_A12058DVPrdObs, T01IU3_n12058DVPrdObs, T01IU3_A12102DVPrdEqLP, T01IU3_n12102DVPrdEqLP, T01IU3_A12103DVPrdConc, T01IU3_n12103DVPrdConc, T01IU3_A12104DVPrdCtw4, T01IU3_n12104DVPrdCtw4, T01IU3_A12105DVPrdList, T01IU3_n12105DVPrdList,
            T01IU3_A396EmprCod, T01IU3_A11935DVPrdNum, T01IU3_A12003DVPrdNom, T01IU3_n12003DVPrdNom, T01IU3_A12004DVPrvNum, T01IU3_n12004DVPrvNum, T01IU3_A12005DVPrdExiAl, T01IU3_n12005DVPrdExiAl, T01IU3_A12006DVPrdPreAc, T01IU3_n12006DVPrdPreAc,
            T01IU3_A12007DVUltLinEn, T01IU3_n12007DVUltLinEn, T01IU3_A12008DVPrdDetPa, T01IU3_n12008DVPrdDetPa, T01IU3_A12009DVValCod, T01IU3_n12009DVValCod, T01IU3_A12010DVPrdFulEn, T01IU3_n12010DVPrdFulEn, T01IU3_A12011DVPrdCanPe, T01IU3_n12011DVPrdCanPe,
            T01IU3_A12012DVPrdRotRe, T01IU3_n12012DVPrdRotRe, T01IU3_A12013DVPrdPreMe, T01IU3_n12013DVPrdPreMe, T01IU3_A12014DVPrdRec, T01IU3_n12014DVPrdRec, T01IU3_A12015DVPrdPreAn, T01IU3_n12015DVPrdPreAn, T01IU3_A12016DVPrdFecPr, T01IU3_n12016DVPrdFecPr,
            T01IU3_A12017DVMovEspUL, T01IU3_n12017DVMovEspUL, T01IU3_A12018DVPrdExiCC, T01IU3_n12018DVPrdExiCC, T01IU3_A12019DVPrdUltDC, T01IU3_n12019DVPrdUltDC, T01IU3_A12020DVPrdUltEC, T01IU3_n12020DVPrdUltEC, T01IU3_A12021DVPrdUltCC, T01IU3_n12021DVPrdUltCC,
            T01IU3_A12022DVPrdExiCP, T01IU3_n12022DVPrdExiCP, T01IU3_A12023DVPrdDifCC, T01IU3_n12023DVPrdDifCC, T01IU3_A12024DVPrdFacCo, T01IU3_n12024DVPrdFacCo, T01IU3_A12025DVPrdConDi, T01IU3_n12025DVPrdConDi, T01IU3_A12026DVPrdStkMi, T01IU3_n12026DVPrdStkMi,
            T01IU3_A12027DVPrdStkMD, T01IU3_n12027DVPrdStkMD, T01IU3_A12028DVPrdDiaRo, T01IU3_n12028DVPrdDiaRo, T01IU3_A12029DVPrdPlaEn, T01IU3_n12029DVPrdPlaEn, T01IU3_A12030DVMetCod, T01IU3_n12030DVMetCod, T01IU3_A12031DVPrdLotMi, T01IU3_n12031DVPrdLotMi,
            T01IU3_A12032DVPrdNumUc, T01IU3_n12032DVPrdNumUc, T01IU3_A12033DVPrdCanRe, T01IU3_n12033DVPrdCanRe, T01IU3_A12034DVPrdFulPe, T01IU3_n12034DVPrdFulPe, T01IU3_A12035DVPrdFulCC, T01IU3_n12035DVPrdFulCC, T01IU3_A12036DVPrdConCC, T01IU3_n12036DVPrdConCC,
            T01IU3_A12037DVPrdDscTe, T01IU3_n12037DVPrdDscTe, T01IU3_A12038DVPrdUniCo, T01IU3_n12038DVPrdUniCo, T01IU3_A12039DVPrdUniCn, T01IU3_n12039DVPrdUniCn, T01IU3_A12040DVPrdRefPr, T01IU3_n12040DVPrdRefPr, T01IU3_A12041DVPrdSus, T01IU3_n12041DVPrdSus,
            T01IU3_A12042DVPrdCalNe, T01IU3_n12042DVPrdCalNe, T01IU3_A12043DVPrdSit, T01IU3_n12043DVPrdSit, T01IU3_A12044DVTipDtoCo, T01IU3_n12044DVTipDtoCo, T01IU3_A12045DVPrdValSt, T01IU3_n12045DVPrdValSt, T01IU3_A12046DVDifValSt, T01IU3_n12046DVDifValSt,
            T01IU3_A12047DVPrdFecEn, T01IU3_n12047DVPrdFecEn, T01IU3_A12048DVPrdPosX, T01IU3_n12048DVPrdPosX, T01IU3_A12049DVPrdPosY, T01IU3_n12049DVPrdPosY, T01IU3_A12050DVPrdTip, T01IU3_n12050DVPrdTip, T01IU3_A12051DVPrdDqo, T01IU3_n12051DVPrdDqo,
            T01IU3_A12052DVPrdRev, T01IU3_n12052DVPrdRev, T01IU3_A12053DVPrdTnq, T01IU3_n12053DVPrdTnq, T01IU3_A12054DVCCStKULi, T01IU3_n12054DVCCStKULi, T01IU3_A12055DVPrdUMeFo, T01IU3_n12055DVPrdUMeFo, T01IU3_A12056DVPrdNom2, T01IU3_n12056DVPrdNom2,
            T01IU3_A12057DVPrdNum2, T01IU3_n12057DVPrdNum2, T01IU3_A12059DVPrdPreA2, T01IU3_n12059DVPrdPreA2, T01IU3_A12060DVPrdDensS, T01IU3_n12060DVPrdDensS, T01IU3_A12061DVPrdConcS, T01IU3_n12061DVPrdConcS, T01IU3_A12062DVPrdSalM, T01IU3_n12062DVPrdSalM,
            T01IU3_A12063DVPrdSolub, T01IU3_n12063DVPrdSolub, T01IU3_A12064DVPrdNumCe, T01IU3_n12064DVPrdNumCe, T01IU3_A12065DVTipPrdCo, T01IU3_n12065DVTipPrdCo, T01IU3_A12066DVPrdNumct, T01IU3_n12066DVPrdNumct, T01IU3_A12067DVPrdNumc2, T01IU3_n12067DVPrdNumc2,
            T01IU3_A12068DVPrdHorMa, T01IU3_n12068DVPrdHorMa, T01IU3_A12069DVPrdPreRe, T01IU3_n12069DVPrdPreRe, T01IU3_A12070DVMat_Lts, T01IU3_n12070DVMat_Lts, T01IU3_A12071DVPrdExiAc, T01IU3_n12071DVPrdExiAc, T01IU3_A12072DVAlmc_Ult, T01IU3_n12072DVAlmc_Ult,
            T01IU3_A12073DVPrdAltAc, T01IU3_n12073DVPrdAltAc, T01IU3_A12074DVPrdPesCo, T01IU3_n12074DVPrdPesCo, T01IU3_A12075DVPrdPesTe, T01IU3_n12075DVPrdPesTe, T01IU3_A12076DVCC_Ultln, T01IU3_n12076DVCC_Ultln, T01IU3_A12077DVPrdSal, T01IU3_n12077DVPrdSal,
            T01IU3_A12078DVSubFamCo, T01IU3_n12078DVSubFamCo, T01IU3_A12079DVPrdInc, T01IU3_n12079DVPrdInc, T01IU3_A12080DVPrdComp, T01IU3_n12080DVPrdComp, T01IU3_A12081DVPrdAox, T01IU3_n12081DVPrdAox, T01IU3_A12082DVPrdNCAS, T01IU3_n12082DVPrdNCAS,
            T01IU3_A12083DVPrdFT, T01IU3_n12083DVPrdFT, T01IU3_A12084DVPrdFFT, T01IU3_n12084DVPrdFFT, T01IU3_A12085DVPrdHS, T01IU3_n12085DVPrdHS, T01IU3_A12086DVPrdFHS, T01IU3_n12086DVPrdFHS, T01IU3_A12087DVPrdReach, T01IU3_n12087DVPrdReach,
            T01IU3_A12088DVPrdOkote, T01IU3_n12088DVPrdOkote, T01IU3_A12089DVPrdColId, T01IU3_n12089DVPrdColId, T01IU3_A12090DVPrdLote, T01IU3_n12090DVPrdLote, T01IU3_A12091DVPrdRTM, T01IU3_n12091DVPrdRTM, T01IU3_A12092DVPrdCtw1, T01IU3_n12092DVPrdCtw1,
            T01IU3_A12093DVPrdCtw2, T01IU3_n12093DVPrdCtw2, T01IU3_A12094DVPrdCtw3, T01IU3_n12094DVPrdCtw3, T01IU3_A12095DVPrdNroCA, T01IU3_n12095DVPrdNroCA, T01IU3_A12096DVPrdGots, T01IU3_n12096DVPrdGots, T01IU3_A12097DVPrdHm, T01IU3_n12097DVPrdHm,
            T01IU3_A12098DVPrdConct, T01IU3_n12098DVPrdConct, T01IU3_A12099DVPrdEINEC, T01IU3_n12099DVPrdEINEC, T01IU3_A12100DVPrdFunci, T01IU3_n12100DVPrdFunci, T01IU3_A12101DVPrdNmQu, T01IU3_n12101DVPrdNmQu
            }
            , new Object[] {
            T01IU4_A396EmprCod
            }
            , new Object[] {
            T01IU5_A12058DVPrdObs, T01IU5_n12058DVPrdObs, T01IU5_A12102DVPrdEqLP, T01IU5_n12102DVPrdEqLP, T01IU5_A12103DVPrdConc, T01IU5_n12103DVPrdConc, T01IU5_A12104DVPrdCtw4, T01IU5_n12104DVPrdCtw4, T01IU5_A12105DVPrdList, T01IU5_n12105DVPrdList,
            T01IU5_A396EmprCod, T01IU5_A11935DVPrdNum, T01IU5_A12003DVPrdNom, T01IU5_n12003DVPrdNom, T01IU5_A12004DVPrvNum, T01IU5_n12004DVPrvNum, T01IU5_A12005DVPrdExiAl, T01IU5_n12005DVPrdExiAl, T01IU5_A12006DVPrdPreAc, T01IU5_n12006DVPrdPreAc,
            T01IU5_A12007DVUltLinEn, T01IU5_n12007DVUltLinEn, T01IU5_A12008DVPrdDetPa, T01IU5_n12008DVPrdDetPa, T01IU5_A12009DVValCod, T01IU5_n12009DVValCod, T01IU5_A12010DVPrdFulEn, T01IU5_n12010DVPrdFulEn, T01IU5_A12011DVPrdCanPe, T01IU5_n12011DVPrdCanPe,
            T01IU5_A12012DVPrdRotRe, T01IU5_n12012DVPrdRotRe, T01IU5_A12013DVPrdPreMe, T01IU5_n12013DVPrdPreMe, T01IU5_A12014DVPrdRec, T01IU5_n12014DVPrdRec, T01IU5_A12015DVPrdPreAn, T01IU5_n12015DVPrdPreAn, T01IU5_A12016DVPrdFecPr, T01IU5_n12016DVPrdFecPr,
            T01IU5_A12017DVMovEspUL, T01IU5_n12017DVMovEspUL, T01IU5_A12018DVPrdExiCC, T01IU5_n12018DVPrdExiCC, T01IU5_A12019DVPrdUltDC, T01IU5_n12019DVPrdUltDC, T01IU5_A12020DVPrdUltEC, T01IU5_n12020DVPrdUltEC, T01IU5_A12021DVPrdUltCC, T01IU5_n12021DVPrdUltCC,
            T01IU5_A12022DVPrdExiCP, T01IU5_n12022DVPrdExiCP, T01IU5_A12023DVPrdDifCC, T01IU5_n12023DVPrdDifCC, T01IU5_A12024DVPrdFacCo, T01IU5_n12024DVPrdFacCo, T01IU5_A12025DVPrdConDi, T01IU5_n12025DVPrdConDi, T01IU5_A12026DVPrdStkMi, T01IU5_n12026DVPrdStkMi,
            T01IU5_A12027DVPrdStkMD, T01IU5_n12027DVPrdStkMD, T01IU5_A12028DVPrdDiaRo, T01IU5_n12028DVPrdDiaRo, T01IU5_A12029DVPrdPlaEn, T01IU5_n12029DVPrdPlaEn, T01IU5_A12030DVMetCod, T01IU5_n12030DVMetCod, T01IU5_A12031DVPrdLotMi, T01IU5_n12031DVPrdLotMi,
            T01IU5_A12032DVPrdNumUc, T01IU5_n12032DVPrdNumUc, T01IU5_A12033DVPrdCanRe, T01IU5_n12033DVPrdCanRe, T01IU5_A12034DVPrdFulPe, T01IU5_n12034DVPrdFulPe, T01IU5_A12035DVPrdFulCC, T01IU5_n12035DVPrdFulCC, T01IU5_A12036DVPrdConCC, T01IU5_n12036DVPrdConCC,
            T01IU5_A12037DVPrdDscTe, T01IU5_n12037DVPrdDscTe, T01IU5_A12038DVPrdUniCo, T01IU5_n12038DVPrdUniCo, T01IU5_A12039DVPrdUniCn, T01IU5_n12039DVPrdUniCn, T01IU5_A12040DVPrdRefPr, T01IU5_n12040DVPrdRefPr, T01IU5_A12041DVPrdSus, T01IU5_n12041DVPrdSus,
            T01IU5_A12042DVPrdCalNe, T01IU5_n12042DVPrdCalNe, T01IU5_A12043DVPrdSit, T01IU5_n12043DVPrdSit, T01IU5_A12044DVTipDtoCo, T01IU5_n12044DVTipDtoCo, T01IU5_A12045DVPrdValSt, T01IU5_n12045DVPrdValSt, T01IU5_A12046DVDifValSt, T01IU5_n12046DVDifValSt,
            T01IU5_A12047DVPrdFecEn, T01IU5_n12047DVPrdFecEn, T01IU5_A12048DVPrdPosX, T01IU5_n12048DVPrdPosX, T01IU5_A12049DVPrdPosY, T01IU5_n12049DVPrdPosY, T01IU5_A12050DVPrdTip, T01IU5_n12050DVPrdTip, T01IU5_A12051DVPrdDqo, T01IU5_n12051DVPrdDqo,
            T01IU5_A12052DVPrdRev, T01IU5_n12052DVPrdRev, T01IU5_A12053DVPrdTnq, T01IU5_n12053DVPrdTnq, T01IU5_A12054DVCCStKULi, T01IU5_n12054DVCCStKULi, T01IU5_A12055DVPrdUMeFo, T01IU5_n12055DVPrdUMeFo, T01IU5_A12056DVPrdNom2, T01IU5_n12056DVPrdNom2,
            T01IU5_A12057DVPrdNum2, T01IU5_n12057DVPrdNum2, T01IU5_A12059DVPrdPreA2, T01IU5_n12059DVPrdPreA2, T01IU5_A12060DVPrdDensS, T01IU5_n12060DVPrdDensS, T01IU5_A12061DVPrdConcS, T01IU5_n12061DVPrdConcS, T01IU5_A12062DVPrdSalM, T01IU5_n12062DVPrdSalM,
            T01IU5_A12063DVPrdSolub, T01IU5_n12063DVPrdSolub, T01IU5_A12064DVPrdNumCe, T01IU5_n12064DVPrdNumCe, T01IU5_A12065DVTipPrdCo, T01IU5_n12065DVTipPrdCo, T01IU5_A12066DVPrdNumct, T01IU5_n12066DVPrdNumct, T01IU5_A12067DVPrdNumc2, T01IU5_n12067DVPrdNumc2,
            T01IU5_A12068DVPrdHorMa, T01IU5_n12068DVPrdHorMa, T01IU5_A12069DVPrdPreRe, T01IU5_n12069DVPrdPreRe, T01IU5_A12070DVMat_Lts, T01IU5_n12070DVMat_Lts, T01IU5_A12071DVPrdExiAc, T01IU5_n12071DVPrdExiAc, T01IU5_A12072DVAlmc_Ult, T01IU5_n12072DVAlmc_Ult,
            T01IU5_A12073DVPrdAltAc, T01IU5_n12073DVPrdAltAc, T01IU5_A12074DVPrdPesCo, T01IU5_n12074DVPrdPesCo, T01IU5_A12075DVPrdPesTe, T01IU5_n12075DVPrdPesTe, T01IU5_A12076DVCC_Ultln, T01IU5_n12076DVCC_Ultln, T01IU5_A12077DVPrdSal, T01IU5_n12077DVPrdSal,
            T01IU5_A12078DVSubFamCo, T01IU5_n12078DVSubFamCo, T01IU5_A12079DVPrdInc, T01IU5_n12079DVPrdInc, T01IU5_A12080DVPrdComp, T01IU5_n12080DVPrdComp, T01IU5_A12081DVPrdAox, T01IU5_n12081DVPrdAox, T01IU5_A12082DVPrdNCAS, T01IU5_n12082DVPrdNCAS,
            T01IU5_A12083DVPrdFT, T01IU5_n12083DVPrdFT, T01IU5_A12084DVPrdFFT, T01IU5_n12084DVPrdFFT, T01IU5_A12085DVPrdHS, T01IU5_n12085DVPrdHS, T01IU5_A12086DVPrdFHS, T01IU5_n12086DVPrdFHS, T01IU5_A12087DVPrdReach, T01IU5_n12087DVPrdReach,
            T01IU5_A12088DVPrdOkote, T01IU5_n12088DVPrdOkote, T01IU5_A12089DVPrdColId, T01IU5_n12089DVPrdColId, T01IU5_A12090DVPrdLote, T01IU5_n12090DVPrdLote, T01IU5_A12091DVPrdRTM, T01IU5_n12091DVPrdRTM, T01IU5_A12092DVPrdCtw1, T01IU5_n12092DVPrdCtw1,
            T01IU5_A12093DVPrdCtw2, T01IU5_n12093DVPrdCtw2, T01IU5_A12094DVPrdCtw3, T01IU5_n12094DVPrdCtw3, T01IU5_A12095DVPrdNroCA, T01IU5_n12095DVPrdNroCA, T01IU5_A12096DVPrdGots, T01IU5_n12096DVPrdGots, T01IU5_A12097DVPrdHm, T01IU5_n12097DVPrdHm,
            T01IU5_A12098DVPrdConct, T01IU5_n12098DVPrdConct, T01IU5_A12099DVPrdEINEC, T01IU5_n12099DVPrdEINEC, T01IU5_A12100DVPrdFunci, T01IU5_n12100DVPrdFunci, T01IU5_A12101DVPrdNmQu, T01IU5_n12101DVPrdNmQu
            }
            , new Object[] {
            T01IU6_A396EmprCod
            }
            , new Object[] {
            T01IU7_A396EmprCod, T01IU7_A11935DVPrdNum
            }
            , new Object[] {
            T01IU8_A396EmprCod, T01IU8_A11935DVPrdNum
            }
            , new Object[] {
            T01IU9_A396EmprCod, T01IU9_A11935DVPrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IU13_A396EmprCod, T01IU13_A11935DVPrdNum, T01IU13_A12106DVPrdPrv
            }
            , new Object[] {
            T01IU14_A396EmprCod, T01IU14_A11935DVPrdNum, T01IU14_A11941DVCC_AlmCo
            }
            , new Object[] {
            T01IU15_A396EmprCod, T01IU15_A11935DVPrdNum, T01IU15_A11972DVLinEnt
            }
            , new Object[] {
            T01IU16_A396EmprCod, T01IU16_A11935DVPrdNum, T01IU16_A11950DVCCStkLin
            }
            , new Object[] {
            T01IU17_A396EmprCod, T01IU17_A11935DVPrdNum
            }
            , new Object[] {
            T01IU18_A396EmprCod
            }
         }
      );
   }

   private byte Z12009DVValCod ;
   private byte Z12030DVMetCod ;
   private byte Z12038DVPrdUniCo ;
   private byte Z12039DVPrdUniCn ;
   private byte Z12043DVPrdSit ;
   private byte Z12044DVTipDtoCo ;
   private byte Z12053DVPrdTnq ;
   private byte Z12055DVPrdUMeFo ;
   private byte Z12068DVPrdHorMa ;
   private byte Z12073DVPrdAltAc ;
   private byte Z12074DVPrdPesCo ;
   private byte Z12078DVSubFamCo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12009DVValCod ;
   private byte A12030DVMetCod ;
   private byte A12038DVPrdUniCo ;
   private byte A12039DVPrdUniCn ;
   private byte A12043DVPrdSit ;
   private byte A12044DVTipDtoCo ;
   private byte A12053DVPrdTnq ;
   private byte A12055DVPrdUMeFo ;
   private byte A12068DVPrdHorMa ;
   private byte A12073DVPrdAltAc ;
   private byte A12074DVPrdPesCo ;
   private byte A12078DVSubFamCo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12009DVValCod ;
   private byte ZZ12030DVMetCod ;
   private byte ZZ12038DVPrdUniCo ;
   private byte ZZ12039DVPrdUniCn ;
   private byte ZZ12043DVPrdSit ;
   private byte ZZ12044DVTipDtoCo ;
   private byte ZZ12053DVPrdTnq ;
   private byte ZZ12055DVPrdUMeFo ;
   private byte ZZ12068DVPrdHorMa ;
   private byte ZZ12073DVPrdAltAc ;
   private byte ZZ12074DVPrdPesCo ;
   private byte ZZ12078DVSubFamCo ;
   private short Z12007DVUltLinEn ;
   private short Z12017DVMovEspUL ;
   private short Z12021DVPrdUltCC ;
   private short Z12027DVPrdStkMD ;
   private short Z12028DVPrdDiaRo ;
   private short Z12029DVPrdPlaEn ;
   private short Z12031DVPrdLotMi ;
   private short Z12036DVPrdConCC ;
   private short Z12048DVPrdPosX ;
   private short Z12049DVPrdPosY ;
   private short Z12051DVPrdDqo ;
   private short Z12065DVTipPrdCo ;
   private short Z12098DVPrdConct ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12007DVUltLinEn ;
   private short A12017DVMovEspUL ;
   private short A12021DVPrdUltCC ;
   private short A12027DVPrdStkMD ;
   private short A12028DVPrdDiaRo ;
   private short A12029DVPrdPlaEn ;
   private short A12031DVPrdLotMi ;
   private short A12036DVPrdConCC ;
   private short A12048DVPrdPosX ;
   private short A12049DVPrdPosY ;
   private short A12051DVPrdDqo ;
   private short A12065DVTipPrdCo ;
   private short A12098DVPrdConct ;
   private short RcdFound1678 ;
   private short nIsDirty_1678 ;
   private short ZZ12007DVUltLinEn ;
   private short ZZ12017DVMovEspUL ;
   private short ZZ12021DVPrdUltCC ;
   private short ZZ12027DVPrdStkMD ;
   private short ZZ12028DVPrdDiaRo ;
   private short ZZ12029DVPrdPlaEn ;
   private short ZZ12031DVPrdLotMi ;
   private short ZZ12036DVPrdConCC ;
   private short ZZ12048DVPrdPosX ;
   private short ZZ12049DVPrdPosY ;
   private short ZZ12051DVPrdDqo ;
   private short ZZ12065DVTipPrdCo ;
   private short ZZ12098DVPrdConct ;
   private int Z12004DVPrvNum ;
   private int Z12072DVAlmc_Ult ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDVPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDVPrdNom_Enabled ;
   private int A12004DVPrvNum ;
   private int edtDVPrvNum_Enabled ;
   private int edtDVPrdExiAl_Enabled ;
   private int edtDVPrdPreAc_Enabled ;
   private int edtDVUltLinEn_Enabled ;
   private int edtDVPrdDetPa_Enabled ;
   private int edtDVValCod_Enabled ;
   private int edtDVPrdFulEn_Enabled ;
   private int edtDVPrdCanPe_Enabled ;
   private int edtDVPrdRotRe_Enabled ;
   private int edtDVPrdPreMe_Enabled ;
   private int edtDVPrdRec_Enabled ;
   private int edtDVPrdPreAn_Enabled ;
   private int edtDVPrdFecPr_Enabled ;
   private int edtDVMovEspUL_Enabled ;
   private int edtDVPrdExiCC_Enabled ;
   private int edtDVPrdUltDC_Enabled ;
   private int edtDVPrdUltEC_Enabled ;
   private int edtDVPrdUltCC_Enabled ;
   private int edtDVPrdExiCP_Enabled ;
   private int edtDVPrdDifCC_Enabled ;
   private int edtDVPrdFacCo_Enabled ;
   private int edtDVPrdConDi_Enabled ;
   private int edtDVPrdStkMi_Enabled ;
   private int edtDVPrdStkMD_Enabled ;
   private int edtDVPrdDiaRo_Enabled ;
   private int edtDVPrdPlaEn_Enabled ;
   private int edtDVMetCod_Enabled ;
   private int edtDVPrdLotMi_Enabled ;
   private int edtDVPrdNumUc_Enabled ;
   private int edtDVPrdCanRe_Enabled ;
   private int edtDVPrdFulPe_Enabled ;
   private int edtDVPrdFulCC_Enabled ;
   private int edtDVPrdConCC_Enabled ;
   private int edtDVPrdDscTe_Enabled ;
   private int edtDVPrdUniCo_Enabled ;
   private int edtDVPrdUniCn_Enabled ;
   private int edtDVPrdRefPr_Enabled ;
   private int edtDVPrdSus_Enabled ;
   private int edtDVPrdCalNe_Enabled ;
   private int edtDVPrdSit_Enabled ;
   private int edtDVTipDtoCo_Enabled ;
   private int edtDVPrdValSt_Enabled ;
   private int edtDVDifValSt_Enabled ;
   private int edtDVPrdFecEn_Enabled ;
   private int edtDVPrdPosX_Enabled ;
   private int edtDVPrdPosY_Enabled ;
   private int edtDVPrdTip_Enabled ;
   private int edtDVPrdDqo_Enabled ;
   private int edtDVPrdRev_Enabled ;
   private int edtDVPrdTnq_Enabled ;
   private int edtDVCCStKULi_Enabled ;
   private int edtDVPrdUMeFo_Enabled ;
   private int edtDVPrdNom2_Enabled ;
   private int edtDVPrdNum2_Enabled ;
   private int edtDVPrdObs_Enabled ;
   private int edtDVPrdPreA2_Enabled ;
   private int edtDVPrdDensS_Enabled ;
   private int edtDVPrdConcS_Enabled ;
   private int edtDVPrdSalM_Enabled ;
   private int edtDVPrdSolub_Enabled ;
   private int edtDVPrdNumCe_Enabled ;
   private int edtDVTipPrdCo_Enabled ;
   private int edtDVPrdNumct_Enabled ;
   private int edtDVPrdNumc2_Enabled ;
   private int edtDVPrdHorMa_Enabled ;
   private int edtDVPrdPreRe_Enabled ;
   private int edtDVMat_Lts_Enabled ;
   private int edtDVPrdExiAc_Enabled ;
   private int A12072DVAlmc_Ult ;
   private int edtDVAlmc_Ult_Enabled ;
   private int edtDVPrdAltAc_Enabled ;
   private int edtDVPrdPesCo_Enabled ;
   private int edtDVPrdPesTe_Enabled ;
   private int edtDVCC_Ultln_Enabled ;
   private int edtDVPrdSal_Enabled ;
   private int edtDVSubFamCo_Enabled ;
   private int edtDVPrdInc_Enabled ;
   private int edtDVPrdComp_Enabled ;
   private int edtDVPrdAox_Enabled ;
   private int edtDVPrdNCAS_Enabled ;
   private int edtDVPrdFT_Enabled ;
   private int edtDVPrdFFT_Enabled ;
   private int edtDVPrdHS_Enabled ;
   private int edtDVPrdFHS_Enabled ;
   private int edtDVPrdReach_Enabled ;
   private int edtDVPrdOkote_Enabled ;
   private int edtDVPrdColId_Enabled ;
   private int edtDVPrdLote_Enabled ;
   private int edtDVPrdRTM_Enabled ;
   private int edtDVPrdCtw1_Enabled ;
   private int edtDVPrdCtw2_Enabled ;
   private int edtDVPrdCtw3_Enabled ;
   private int edtDVPrdNroCA_Enabled ;
   private int edtDVPrdGots_Enabled ;
   private int edtDVPrdHm_Enabled ;
   private int edtDVPrdConct_Enabled ;
   private int edtDVPrdEINEC_Enabled ;
   private int edtDVPrdFunci_Enabled ;
   private int edtDVPrdNmQu_Enabled ;
   private int edtDVPrdEqLP_Enabled ;
   private int edtDVPrdConc_Enabled ;
   private int edtDVPrdCtw4_Enabled ;
   private int edtDVPrdList_Enabled ;
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
   private int edtDVPrdList_Backcolor ;
   private int edtDVPrdCtw4_Backcolor ;
   private int edtDVPrdConc_Backcolor ;
   private int edtDVPrdEqLP_Backcolor ;
   private int edtDVPrdNmQu_Backcolor ;
   private int edtDVPrdFunci_Backcolor ;
   private int edtDVPrdEINEC_Backcolor ;
   private int edtDVPrdConct_Backcolor ;
   private int edtDVPrdHm_Backcolor ;
   private int edtDVPrdGots_Backcolor ;
   private int edtDVPrdNroCA_Backcolor ;
   private int edtDVPrdCtw3_Backcolor ;
   private int edtDVPrdCtw2_Backcolor ;
   private int edtDVPrdCtw1_Backcolor ;
   private int edtDVPrdRTM_Backcolor ;
   private int edtDVPrdLote_Backcolor ;
   private int edtDVPrdColId_Backcolor ;
   private int edtDVPrdOkote_Backcolor ;
   private int edtDVPrdReach_Backcolor ;
   private int edtDVPrdFHS_Backcolor ;
   private int edtDVPrdHS_Backcolor ;
   private int edtDVPrdFFT_Backcolor ;
   private int edtDVPrdFT_Backcolor ;
   private int edtDVPrdNCAS_Backcolor ;
   private int edtDVPrdAox_Backcolor ;
   private int edtDVPrdComp_Backcolor ;
   private int edtDVPrdInc_Backcolor ;
   private int edtDVSubFamCo_Backcolor ;
   private int edtDVPrdSal_Backcolor ;
   private int edtDVCC_Ultln_Backcolor ;
   private int edtDVPrdPesTe_Backcolor ;
   private int edtDVPrdPesCo_Backcolor ;
   private int edtDVPrdAltAc_Backcolor ;
   private int edtDVAlmc_Ult_Backcolor ;
   private int edtDVPrdExiAc_Backcolor ;
   private int edtDVMat_Lts_Backcolor ;
   private int edtDVPrdPreRe_Backcolor ;
   private int edtDVPrdHorMa_Backcolor ;
   private int edtDVPrdNumc2_Backcolor ;
   private int edtDVPrdNumct_Backcolor ;
   private int edtDVTipPrdCo_Backcolor ;
   private int edtDVPrdNumCe_Backcolor ;
   private int edtDVPrdSolub_Backcolor ;
   private int edtDVPrdSalM_Backcolor ;
   private int edtDVPrdConcS_Backcolor ;
   private int edtDVPrdDensS_Backcolor ;
   private int edtDVPrdPreA2_Backcolor ;
   private int edtDVPrdObs_Backcolor ;
   private int edtDVPrdNum2_Backcolor ;
   private int edtDVPrdNom2_Backcolor ;
   private int edtDVPrdUMeFo_Backcolor ;
   private int edtDVCCStKULi_Backcolor ;
   private int edtDVPrdTnq_Backcolor ;
   private int edtDVPrdRev_Backcolor ;
   private int edtDVPrdDqo_Backcolor ;
   private int edtDVPrdTip_Backcolor ;
   private int edtDVPrdPosY_Backcolor ;
   private int edtDVPrdPosX_Backcolor ;
   private int edtDVPrdFecEn_Backcolor ;
   private int edtDVDifValSt_Backcolor ;
   private int edtDVPrdValSt_Backcolor ;
   private int edtDVTipDtoCo_Backcolor ;
   private int edtDVPrdSit_Backcolor ;
   private int edtDVPrdCalNe_Backcolor ;
   private int edtDVPrdSus_Backcolor ;
   private int edtDVPrdRefPr_Backcolor ;
   private int edtDVPrdUniCn_Backcolor ;
   private int edtDVPrdUniCo_Backcolor ;
   private int edtDVPrdDscTe_Backcolor ;
   private int edtDVPrdConCC_Backcolor ;
   private int edtDVPrdFulCC_Backcolor ;
   private int edtDVPrdFulPe_Backcolor ;
   private int edtDVPrdCanRe_Backcolor ;
   private int edtDVPrdNumUc_Backcolor ;
   private int edtDVPrdLotMi_Backcolor ;
   private int edtDVMetCod_Backcolor ;
   private int edtDVPrdPlaEn_Backcolor ;
   private int edtDVPrdDiaRo_Backcolor ;
   private int edtDVPrdStkMD_Backcolor ;
   private int edtDVPrdStkMi_Backcolor ;
   private int edtDVPrdConDi_Backcolor ;
   private int edtDVPrdFacCo_Backcolor ;
   private int edtDVPrdDifCC_Backcolor ;
   private int edtDVPrdExiCP_Backcolor ;
   private int edtDVPrdUltCC_Backcolor ;
   private int edtDVPrdUltEC_Backcolor ;
   private int edtDVPrdUltDC_Backcolor ;
   private int edtDVPrdExiCC_Backcolor ;
   private int edtDVMovEspUL_Backcolor ;
   private int edtDVPrdFecPr_Backcolor ;
   private int edtDVPrdPreAn_Backcolor ;
   private int edtDVPrdRec_Backcolor ;
   private int edtDVPrdPreMe_Backcolor ;
   private int edtDVPrdRotRe_Backcolor ;
   private int edtDVPrdCanPe_Backcolor ;
   private int edtDVPrdFulEn_Backcolor ;
   private int edtDVValCod_Backcolor ;
   private int edtDVPrdDetPa_Backcolor ;
   private int edtDVUltLinEn_Backcolor ;
   private int edtDVPrdPreAc_Backcolor ;
   private int edtDVPrdExiAl_Backcolor ;
   private int edtDVPrvNum_Backcolor ;
   private int edtDVPrdNom_Backcolor ;
   private int edtDVPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ12004DVPrvNum ;
   private int ZZ12072DVAlmc_Ult ;
   private long Z12054DVCCStKULi ;
   private long Z12076DVCC_Ultln ;
   private long A12054DVCCStKULi ;
   private long A12076DVCC_Ultln ;
   private long ZZ12054DVCCStKULi ;
   private long ZZ12076DVCC_Ultln ;
   private java.math.BigDecimal Z12005DVPrdExiAl ;
   private java.math.BigDecimal Z12006DVPrdPreAc ;
   private java.math.BigDecimal Z12011DVPrdCanPe ;
   private java.math.BigDecimal Z12012DVPrdRotRe ;
   private java.math.BigDecimal Z12013DVPrdPreMe ;
   private java.math.BigDecimal Z12015DVPrdPreAn ;
   private java.math.BigDecimal Z12018DVPrdExiCC ;
   private java.math.BigDecimal Z12019DVPrdUltDC ;
   private java.math.BigDecimal Z12020DVPrdUltEC ;
   private java.math.BigDecimal Z12022DVPrdExiCP ;
   private java.math.BigDecimal Z12023DVPrdDifCC ;
   private java.math.BigDecimal Z12024DVPrdFacCo ;
   private java.math.BigDecimal Z12025DVPrdConDi ;
   private java.math.BigDecimal Z12026DVPrdStkMi ;
   private java.math.BigDecimal Z12032DVPrdNumUc ;
   private java.math.BigDecimal Z12033DVPrdCanRe ;
   private java.math.BigDecimal Z12045DVPrdValSt ;
   private java.math.BigDecimal Z12046DVDifValSt ;
   private java.math.BigDecimal Z12059DVPrdPreA2 ;
   private java.math.BigDecimal Z12060DVPrdDensS ;
   private java.math.BigDecimal Z12061DVPrdConcS ;
   private java.math.BigDecimal Z12063DVPrdSolub ;
   private java.math.BigDecimal Z12066DVPrdNumct ;
   private java.math.BigDecimal Z12067DVPrdNumc2 ;
   private java.math.BigDecimal Z12069DVPrdPreRe ;
   private java.math.BigDecimal Z12070DVMat_Lts ;
   private java.math.BigDecimal Z12071DVPrdExiAc ;
   private java.math.BigDecimal Z12081DVPrdAox ;
   private java.math.BigDecimal Z12103DVPrdConc ;
   private java.math.BigDecimal A12005DVPrdExiAl ;
   private java.math.BigDecimal A12006DVPrdPreAc ;
   private java.math.BigDecimal A12011DVPrdCanPe ;
   private java.math.BigDecimal A12012DVPrdRotRe ;
   private java.math.BigDecimal A12013DVPrdPreMe ;
   private java.math.BigDecimal A12015DVPrdPreAn ;
   private java.math.BigDecimal A12018DVPrdExiCC ;
   private java.math.BigDecimal A12019DVPrdUltDC ;
   private java.math.BigDecimal A12020DVPrdUltEC ;
   private java.math.BigDecimal A12022DVPrdExiCP ;
   private java.math.BigDecimal A12023DVPrdDifCC ;
   private java.math.BigDecimal A12024DVPrdFacCo ;
   private java.math.BigDecimal A12025DVPrdConDi ;
   private java.math.BigDecimal A12026DVPrdStkMi ;
   private java.math.BigDecimal A12032DVPrdNumUc ;
   private java.math.BigDecimal A12033DVPrdCanRe ;
   private java.math.BigDecimal A12045DVPrdValSt ;
   private java.math.BigDecimal A12046DVDifValSt ;
   private java.math.BigDecimal A12059DVPrdPreA2 ;
   private java.math.BigDecimal A12060DVPrdDensS ;
   private java.math.BigDecimal A12061DVPrdConcS ;
   private java.math.BigDecimal A12063DVPrdSolub ;
   private java.math.BigDecimal A12066DVPrdNumct ;
   private java.math.BigDecimal A12067DVPrdNumc2 ;
   private java.math.BigDecimal A12069DVPrdPreRe ;
   private java.math.BigDecimal A12070DVMat_Lts ;
   private java.math.BigDecimal A12071DVPrdExiAc ;
   private java.math.BigDecimal A12081DVPrdAox ;
   private java.math.BigDecimal A12103DVPrdConc ;
   private java.math.BigDecimal ZZ12005DVPrdExiAl ;
   private java.math.BigDecimal ZZ12006DVPrdPreAc ;
   private java.math.BigDecimal ZZ12011DVPrdCanPe ;
   private java.math.BigDecimal ZZ12012DVPrdRotRe ;
   private java.math.BigDecimal ZZ12013DVPrdPreMe ;
   private java.math.BigDecimal ZZ12015DVPrdPreAn ;
   private java.math.BigDecimal ZZ12018DVPrdExiCC ;
   private java.math.BigDecimal ZZ12019DVPrdUltDC ;
   private java.math.BigDecimal ZZ12020DVPrdUltEC ;
   private java.math.BigDecimal ZZ12022DVPrdExiCP ;
   private java.math.BigDecimal ZZ12023DVPrdDifCC ;
   private java.math.BigDecimal ZZ12024DVPrdFacCo ;
   private java.math.BigDecimal ZZ12025DVPrdConDi ;
   private java.math.BigDecimal ZZ12026DVPrdStkMi ;
   private java.math.BigDecimal ZZ12032DVPrdNumUc ;
   private java.math.BigDecimal ZZ12033DVPrdCanRe ;
   private java.math.BigDecimal ZZ12045DVPrdValSt ;
   private java.math.BigDecimal ZZ12046DVDifValSt ;
   private java.math.BigDecimal ZZ12059DVPrdPreA2 ;
   private java.math.BigDecimal ZZ12060DVPrdDensS ;
   private java.math.BigDecimal ZZ12061DVPrdConcS ;
   private java.math.BigDecimal ZZ12063DVPrdSolub ;
   private java.math.BigDecimal ZZ12066DVPrdNumct ;
   private java.math.BigDecimal ZZ12067DVPrdNumc2 ;
   private java.math.BigDecimal ZZ12069DVPrdPreRe ;
   private java.math.BigDecimal ZZ12070DVMat_Lts ;
   private java.math.BigDecimal ZZ12071DVPrdExiAc ;
   private java.math.BigDecimal ZZ12081DVPrdAox ;
   private java.math.BigDecimal ZZ12103DVPrdConc ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11935DVPrdNum ;
   private String Z12003DVPrdNom ;
   private String Z12008DVPrdDetPa ;
   private String Z12014DVPrdRec ;
   private String Z12037DVPrdDscTe ;
   private String Z12040DVPrdRefPr ;
   private String Z12041DVPrdSus ;
   private String Z12042DVPrdCalNe ;
   private String Z12050DVPrdTip ;
   private String Z12052DVPrdRev ;
   private String Z12056DVPrdNom2 ;
   private String Z12057DVPrdNum2 ;
   private String Z12062DVPrdSalM ;
   private String Z12064DVPrdNumCe ;
   private String Z12075DVPrdPesTe ;
   private String Z12077DVPrdSal ;
   private String Z12079DVPrdInc ;
   private String Z12080DVPrdComp ;
   private String Z12082DVPrdNCAS ;
   private String Z12083DVPrdFT ;
   private String Z12085DVPrdHS ;
   private String Z12087DVPrdReach ;
   private String Z12088DVPrdOkote ;
   private String Z12089DVPrdColId ;
   private String Z12090DVPrdLote ;
   private String Z12091DVPrdRTM ;
   private String Z12092DVPrdCtw1 ;
   private String Z12093DVPrdCtw2 ;
   private String Z12094DVPrdCtw3 ;
   private String Z12095DVPrdNroCA ;
   private String Z12096DVPrdGots ;
   private String Z12097DVPrdHm ;
   private String Z12099DVPrdEINEC ;
   private String Z12100DVPrdFunci ;
   private String Z12102DVPrdEqLP ;
   private String Z12104DVPrdCtw4 ;
   private String Z12105DVPrdList ;
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
   private String edtDVPrdNum_Internalname ;
   private String A11935DVPrdNum ;
   private String edtDVPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDVPrdNom_Internalname ;
   private String A12003DVPrdNom ;
   private String edtDVPrdNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDVPrvNum_Internalname ;
   private String edtDVPrvNum_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDVPrdExiAl_Internalname ;
   private String edtDVPrdExiAl_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDVPrdPreAc_Internalname ;
   private String edtDVPrdPreAc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDVUltLinEn_Internalname ;
   private String edtDVUltLinEn_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDVPrdDetPa_Internalname ;
   private String A12008DVPrdDetPa ;
   private String edtDVPrdDetPa_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDVValCod_Internalname ;
   private String edtDVValCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDVPrdFulEn_Internalname ;
   private String edtDVPrdFulEn_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDVPrdCanPe_Internalname ;
   private String edtDVPrdCanPe_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDVPrdRotRe_Internalname ;
   private String edtDVPrdRotRe_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDVPrdPreMe_Internalname ;
   private String edtDVPrdPreMe_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDVPrdRec_Internalname ;
   private String A12014DVPrdRec ;
   private String edtDVPrdRec_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDVPrdPreAn_Internalname ;
   private String edtDVPrdPreAn_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDVPrdFecPr_Internalname ;
   private String edtDVPrdFecPr_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDVMovEspUL_Internalname ;
   private String edtDVMovEspUL_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDVPrdExiCC_Internalname ;
   private String edtDVPrdExiCC_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDVPrdUltDC_Internalname ;
   private String edtDVPrdUltDC_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDVPrdUltEC_Internalname ;
   private String edtDVPrdUltEC_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDVPrdUltCC_Internalname ;
   private String edtDVPrdUltCC_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDVPrdExiCP_Internalname ;
   private String edtDVPrdExiCP_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDVPrdDifCC_Internalname ;
   private String edtDVPrdDifCC_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDVPrdFacCo_Internalname ;
   private String edtDVPrdFacCo_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtDVPrdConDi_Internalname ;
   private String edtDVPrdConDi_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDVPrdStkMi_Internalname ;
   private String edtDVPrdStkMi_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtDVPrdStkMD_Internalname ;
   private String edtDVPrdStkMD_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtDVPrdDiaRo_Internalname ;
   private String edtDVPrdDiaRo_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtDVPrdPlaEn_Internalname ;
   private String edtDVPrdPlaEn_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtDVMetCod_Internalname ;
   private String edtDVMetCod_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtDVPrdLotMi_Internalname ;
   private String edtDVPrdLotMi_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtDVPrdNumUc_Internalname ;
   private String edtDVPrdNumUc_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtDVPrdCanRe_Internalname ;
   private String edtDVPrdCanRe_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtDVPrdFulPe_Internalname ;
   private String edtDVPrdFulPe_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtDVPrdFulCC_Internalname ;
   private String edtDVPrdFulCC_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtDVPrdConCC_Internalname ;
   private String edtDVPrdConCC_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtDVPrdDscTe_Internalname ;
   private String A12037DVPrdDscTe ;
   private String edtDVPrdDscTe_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtDVPrdUniCo_Internalname ;
   private String edtDVPrdUniCo_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtDVPrdUniCn_Internalname ;
   private String edtDVPrdUniCn_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtDVPrdRefPr_Internalname ;
   private String A12040DVPrdRefPr ;
   private String edtDVPrdRefPr_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtDVPrdSus_Internalname ;
   private String A12041DVPrdSus ;
   private String edtDVPrdSus_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtDVPrdCalNe_Internalname ;
   private String A12042DVPrdCalNe ;
   private String edtDVPrdCalNe_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtDVPrdSit_Internalname ;
   private String edtDVPrdSit_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtDVTipDtoCo_Internalname ;
   private String edtDVTipDtoCo_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtDVPrdValSt_Internalname ;
   private String edtDVPrdValSt_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtDVDifValSt_Internalname ;
   private String edtDVDifValSt_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtDVPrdFecEn_Internalname ;
   private String edtDVPrdFecEn_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtDVPrdPosX_Internalname ;
   private String edtDVPrdPosX_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtDVPrdPosY_Internalname ;
   private String edtDVPrdPosY_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtDVPrdTip_Internalname ;
   private String A12050DVPrdTip ;
   private String edtDVPrdTip_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtDVPrdDqo_Internalname ;
   private String edtDVPrdDqo_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtDVPrdRev_Internalname ;
   private String A12052DVPrdRev ;
   private String edtDVPrdRev_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtDVPrdTnq_Internalname ;
   private String edtDVPrdTnq_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtDVCCStKULi_Internalname ;
   private String edtDVCCStKULi_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtDVPrdUMeFo_Internalname ;
   private String edtDVPrdUMeFo_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtDVPrdNom2_Internalname ;
   private String A12056DVPrdNom2 ;
   private String edtDVPrdNom2_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtDVPrdNum2_Internalname ;
   private String A12057DVPrdNum2 ;
   private String edtDVPrdNum2_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtDVPrdObs_Internalname ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtDVPrdPreA2_Internalname ;
   private String edtDVPrdPreA2_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtDVPrdDensS_Internalname ;
   private String edtDVPrdDensS_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtDVPrdConcS_Internalname ;
   private String edtDVPrdConcS_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtDVPrdSalM_Internalname ;
   private String A12062DVPrdSalM ;
   private String edtDVPrdSalM_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtDVPrdSolub_Internalname ;
   private String edtDVPrdSolub_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtDVPrdNumCe_Internalname ;
   private String A12064DVPrdNumCe ;
   private String edtDVPrdNumCe_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtDVTipPrdCo_Internalname ;
   private String edtDVTipPrdCo_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtDVPrdNumct_Internalname ;
   private String edtDVPrdNumct_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtDVPrdNumc2_Internalname ;
   private String edtDVPrdNumc2_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtDVPrdHorMa_Internalname ;
   private String edtDVPrdHorMa_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtDVPrdPreRe_Internalname ;
   private String edtDVPrdPreRe_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtDVMat_Lts_Internalname ;
   private String edtDVMat_Lts_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtDVPrdExiAc_Internalname ;
   private String edtDVPrdExiAc_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtDVAlmc_Ult_Internalname ;
   private String edtDVAlmc_Ult_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtDVPrdAltAc_Internalname ;
   private String edtDVPrdAltAc_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtDVPrdPesCo_Internalname ;
   private String edtDVPrdPesCo_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtDVPrdPesTe_Internalname ;
   private String A12075DVPrdPesTe ;
   private String edtDVPrdPesTe_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtDVCC_Ultln_Internalname ;
   private String edtDVCC_Ultln_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtDVPrdSal_Internalname ;
   private String A12077DVPrdSal ;
   private String edtDVPrdSal_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtDVSubFamCo_Internalname ;
   private String edtDVSubFamCo_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtDVPrdInc_Internalname ;
   private String A12079DVPrdInc ;
   private String edtDVPrdInc_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtDVPrdComp_Internalname ;
   private String A12080DVPrdComp ;
   private String edtDVPrdComp_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtDVPrdAox_Internalname ;
   private String edtDVPrdAox_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtDVPrdNCAS_Internalname ;
   private String A12082DVPrdNCAS ;
   private String edtDVPrdNCAS_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtDVPrdFT_Internalname ;
   private String A12083DVPrdFT ;
   private String edtDVPrdFT_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtDVPrdFFT_Internalname ;
   private String edtDVPrdFFT_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtDVPrdHS_Internalname ;
   private String A12085DVPrdHS ;
   private String edtDVPrdHS_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String edtDVPrdFHS_Internalname ;
   private String edtDVPrdFHS_Jsonclick ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String edtDVPrdReach_Internalname ;
   private String A12087DVPrdReach ;
   private String edtDVPrdReach_Jsonclick ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock88_Jsonclick ;
   private String edtDVPrdOkote_Internalname ;
   private String A12088DVPrdOkote ;
   private String edtDVPrdOkote_Jsonclick ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String edtDVPrdColId_Internalname ;
   private String A12089DVPrdColId ;
   private String edtDVPrdColId_Jsonclick ;
   private String lblTextblock90_Internalname ;
   private String lblTextblock90_Jsonclick ;
   private String edtDVPrdLote_Internalname ;
   private String A12090DVPrdLote ;
   private String edtDVPrdLote_Jsonclick ;
   private String lblTextblock91_Internalname ;
   private String lblTextblock91_Jsonclick ;
   private String edtDVPrdRTM_Internalname ;
   private String A12091DVPrdRTM ;
   private String edtDVPrdRTM_Jsonclick ;
   private String lblTextblock92_Internalname ;
   private String lblTextblock92_Jsonclick ;
   private String edtDVPrdCtw1_Internalname ;
   private String A12092DVPrdCtw1 ;
   private String edtDVPrdCtw1_Jsonclick ;
   private String lblTextblock93_Internalname ;
   private String lblTextblock93_Jsonclick ;
   private String edtDVPrdCtw2_Internalname ;
   private String A12093DVPrdCtw2 ;
   private String edtDVPrdCtw2_Jsonclick ;
   private String lblTextblock94_Internalname ;
   private String lblTextblock94_Jsonclick ;
   private String edtDVPrdCtw3_Internalname ;
   private String A12094DVPrdCtw3 ;
   private String edtDVPrdCtw3_Jsonclick ;
   private String lblTextblock95_Internalname ;
   private String lblTextblock95_Jsonclick ;
   private String edtDVPrdNroCA_Internalname ;
   private String A12095DVPrdNroCA ;
   private String edtDVPrdNroCA_Jsonclick ;
   private String lblTextblock96_Internalname ;
   private String lblTextblock96_Jsonclick ;
   private String edtDVPrdGots_Internalname ;
   private String A12096DVPrdGots ;
   private String edtDVPrdGots_Jsonclick ;
   private String lblTextblock97_Internalname ;
   private String lblTextblock97_Jsonclick ;
   private String edtDVPrdHm_Internalname ;
   private String A12097DVPrdHm ;
   private String edtDVPrdHm_Jsonclick ;
   private String lblTextblock98_Internalname ;
   private String lblTextblock98_Jsonclick ;
   private String edtDVPrdConct_Internalname ;
   private String edtDVPrdConct_Jsonclick ;
   private String lblTextblock99_Internalname ;
   private String lblTextblock99_Jsonclick ;
   private String edtDVPrdEINEC_Internalname ;
   private String A12099DVPrdEINEC ;
   private String edtDVPrdEINEC_Jsonclick ;
   private String lblTextblock100_Internalname ;
   private String lblTextblock100_Jsonclick ;
   private String edtDVPrdFunci_Internalname ;
   private String A12100DVPrdFunci ;
   private String edtDVPrdFunci_Jsonclick ;
   private String lblTextblock101_Internalname ;
   private String lblTextblock101_Jsonclick ;
   private String edtDVPrdNmQu_Internalname ;
   private String lblTextblock102_Internalname ;
   private String lblTextblock102_Jsonclick ;
   private String edtDVPrdEqLP_Internalname ;
   private String A12102DVPrdEqLP ;
   private String edtDVPrdEqLP_Jsonclick ;
   private String lblTextblock103_Internalname ;
   private String lblTextblock103_Jsonclick ;
   private String edtDVPrdConc_Internalname ;
   private String edtDVPrdConc_Jsonclick ;
   private String lblTextblock104_Internalname ;
   private String lblTextblock104_Jsonclick ;
   private String edtDVPrdCtw4_Internalname ;
   private String A12104DVPrdCtw4 ;
   private String edtDVPrdCtw4_Jsonclick ;
   private String lblTextblock105_Internalname ;
   private String lblTextblock105_Jsonclick ;
   private String edtDVPrdList_Internalname ;
   private String A12105DVPrdList ;
   private String edtDVPrdList_Jsonclick ;
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
   private String sMode1678 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11935DVPrdNum ;
   private String ZZ12003DVPrdNom ;
   private String ZZ12008DVPrdDetPa ;
   private String ZZ12014DVPrdRec ;
   private String ZZ12037DVPrdDscTe ;
   private String ZZ12040DVPrdRefPr ;
   private String ZZ12041DVPrdSus ;
   private String ZZ12042DVPrdCalNe ;
   private String ZZ12050DVPrdTip ;
   private String ZZ12052DVPrdRev ;
   private String ZZ12056DVPrdNom2 ;
   private String ZZ12057DVPrdNum2 ;
   private String ZZ12062DVPrdSalM ;
   private String ZZ12064DVPrdNumCe ;
   private String ZZ12075DVPrdPesTe ;
   private String ZZ12077DVPrdSal ;
   private String ZZ12079DVPrdInc ;
   private String ZZ12080DVPrdComp ;
   private String ZZ12082DVPrdNCAS ;
   private String ZZ12083DVPrdFT ;
   private String ZZ12085DVPrdHS ;
   private String ZZ12087DVPrdReach ;
   private String ZZ12088DVPrdOkote ;
   private String ZZ12089DVPrdColId ;
   private String ZZ12090DVPrdLote ;
   private String ZZ12091DVPrdRTM ;
   private String ZZ12092DVPrdCtw1 ;
   private String ZZ12093DVPrdCtw2 ;
   private String ZZ12094DVPrdCtw3 ;
   private String ZZ12095DVPrdNroCA ;
   private String ZZ12096DVPrdGots ;
   private String ZZ12097DVPrdHm ;
   private String ZZ12099DVPrdEINEC ;
   private String ZZ12100DVPrdFunci ;
   private String ZZ12102DVPrdEqLP ;
   private String ZZ12104DVPrdCtw4 ;
   private String ZZ12105DVPrdList ;
   private java.util.Date Z12010DVPrdFulEn ;
   private java.util.Date Z12016DVPrdFecPr ;
   private java.util.Date Z12034DVPrdFulPe ;
   private java.util.Date Z12035DVPrdFulCC ;
   private java.util.Date Z12047DVPrdFecEn ;
   private java.util.Date Z12084DVPrdFFT ;
   private java.util.Date Z12086DVPrdFHS ;
   private java.util.Date A12010DVPrdFulEn ;
   private java.util.Date A12016DVPrdFecPr ;
   private java.util.Date A12034DVPrdFulPe ;
   private java.util.Date A12035DVPrdFulCC ;
   private java.util.Date A12047DVPrdFecEn ;
   private java.util.Date A12084DVPrdFFT ;
   private java.util.Date A12086DVPrdFHS ;
   private java.util.Date ZZ12010DVPrdFulEn ;
   private java.util.Date ZZ12016DVPrdFecPr ;
   private java.util.Date ZZ12034DVPrdFulPe ;
   private java.util.Date ZZ12035DVPrdFulCC ;
   private java.util.Date ZZ12047DVPrdFecEn ;
   private java.util.Date ZZ12084DVPrdFFT ;
   private java.util.Date ZZ12086DVPrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12003DVPrdNom ;
   private boolean n12004DVPrvNum ;
   private boolean n12005DVPrdExiAl ;
   private boolean n12006DVPrdPreAc ;
   private boolean n12007DVUltLinEn ;
   private boolean n12008DVPrdDetPa ;
   private boolean n12009DVValCod ;
   private boolean n12010DVPrdFulEn ;
   private boolean n12011DVPrdCanPe ;
   private boolean n12012DVPrdRotRe ;
   private boolean n12013DVPrdPreMe ;
   private boolean n12014DVPrdRec ;
   private boolean n12015DVPrdPreAn ;
   private boolean n12016DVPrdFecPr ;
   private boolean n12017DVMovEspUL ;
   private boolean n12018DVPrdExiCC ;
   private boolean n12019DVPrdUltDC ;
   private boolean n12020DVPrdUltEC ;
   private boolean n12021DVPrdUltCC ;
   private boolean n12022DVPrdExiCP ;
   private boolean n12023DVPrdDifCC ;
   private boolean n12024DVPrdFacCo ;
   private boolean n12025DVPrdConDi ;
   private boolean n12026DVPrdStkMi ;
   private boolean n12027DVPrdStkMD ;
   private boolean n12028DVPrdDiaRo ;
   private boolean n12029DVPrdPlaEn ;
   private boolean n12030DVMetCod ;
   private boolean n12031DVPrdLotMi ;
   private boolean n12032DVPrdNumUc ;
   private boolean n12033DVPrdCanRe ;
   private boolean n12034DVPrdFulPe ;
   private boolean n12035DVPrdFulCC ;
   private boolean n12036DVPrdConCC ;
   private boolean n12037DVPrdDscTe ;
   private boolean n12038DVPrdUniCo ;
   private boolean n12039DVPrdUniCn ;
   private boolean n12040DVPrdRefPr ;
   private boolean n12041DVPrdSus ;
   private boolean n12042DVPrdCalNe ;
   private boolean n12043DVPrdSit ;
   private boolean n12044DVTipDtoCo ;
   private boolean n12045DVPrdValSt ;
   private boolean n12046DVDifValSt ;
   private boolean n12047DVPrdFecEn ;
   private boolean n12048DVPrdPosX ;
   private boolean n12049DVPrdPosY ;
   private boolean n12050DVPrdTip ;
   private boolean n12051DVPrdDqo ;
   private boolean n12052DVPrdRev ;
   private boolean n12053DVPrdTnq ;
   private boolean n12054DVCCStKULi ;
   private boolean n12055DVPrdUMeFo ;
   private boolean n12056DVPrdNom2 ;
   private boolean n12057DVPrdNum2 ;
   private boolean n12058DVPrdObs ;
   private boolean n12059DVPrdPreA2 ;
   private boolean n12060DVPrdDensS ;
   private boolean n12061DVPrdConcS ;
   private boolean n12062DVPrdSalM ;
   private boolean n12063DVPrdSolub ;
   private boolean n12064DVPrdNumCe ;
   private boolean n12065DVTipPrdCo ;
   private boolean n12066DVPrdNumct ;
   private boolean n12067DVPrdNumc2 ;
   private boolean n12068DVPrdHorMa ;
   private boolean n12069DVPrdPreRe ;
   private boolean n12070DVMat_Lts ;
   private boolean n12071DVPrdExiAc ;
   private boolean n12072DVAlmc_Ult ;
   private boolean n12073DVPrdAltAc ;
   private boolean n12074DVPrdPesCo ;
   private boolean n12075DVPrdPesTe ;
   private boolean n12076DVCC_Ultln ;
   private boolean n12077DVPrdSal ;
   private boolean n12078DVSubFamCo ;
   private boolean n12079DVPrdInc ;
   private boolean n12080DVPrdComp ;
   private boolean n12081DVPrdAox ;
   private boolean n12082DVPrdNCAS ;
   private boolean n12083DVPrdFT ;
   private boolean n12084DVPrdFFT ;
   private boolean n12085DVPrdHS ;
   private boolean n12086DVPrdFHS ;
   private boolean n12087DVPrdReach ;
   private boolean n12088DVPrdOkote ;
   private boolean n12089DVPrdColId ;
   private boolean n12090DVPrdLote ;
   private boolean n12091DVPrdRTM ;
   private boolean n12092DVPrdCtw1 ;
   private boolean n12093DVPrdCtw2 ;
   private boolean n12094DVPrdCtw3 ;
   private boolean n12095DVPrdNroCA ;
   private boolean n12096DVPrdGots ;
   private boolean n12097DVPrdHm ;
   private boolean n12098DVPrdConct ;
   private boolean n12099DVPrdEINEC ;
   private boolean n12100DVPrdFunci ;
   private boolean n12101DVPrdNmQu ;
   private boolean n12102DVPrdEqLP ;
   private boolean n12103DVPrdConc ;
   private boolean n12104DVPrdCtw4 ;
   private boolean n12105DVPrdList ;
   private boolean Gx_longc ;
   private String A12058DVPrdObs ;
   private String Z12058DVPrdObs ;
   private String ZZ12058DVPrdObs ;
   private String Z12101DVPrdNmQu ;
   private String A12101DVPrdNmQu ;
   private String ZZ12101DVPrdNmQu ;
   private IDataStoreProvider pr_default ;
   private String[] T01IU5_A12058DVPrdObs ;
   private boolean[] T01IU5_n12058DVPrdObs ;
   private String[] T01IU5_A12102DVPrdEqLP ;
   private boolean[] T01IU5_n12102DVPrdEqLP ;
   private java.math.BigDecimal[] T01IU5_A12103DVPrdConc ;
   private boolean[] T01IU5_n12103DVPrdConc ;
   private String[] T01IU5_A12104DVPrdCtw4 ;
   private boolean[] T01IU5_n12104DVPrdCtw4 ;
   private String[] T01IU5_A12105DVPrdList ;
   private boolean[] T01IU5_n12105DVPrdList ;
   private String[] T01IU5_A396EmprCod ;
   private String[] T01IU5_A11935DVPrdNum ;
   private String[] T01IU5_A12003DVPrdNom ;
   private boolean[] T01IU5_n12003DVPrdNom ;
   private int[] T01IU5_A12004DVPrvNum ;
   private boolean[] T01IU5_n12004DVPrvNum ;
   private java.math.BigDecimal[] T01IU5_A12005DVPrdExiAl ;
   private boolean[] T01IU5_n12005DVPrdExiAl ;
   private java.math.BigDecimal[] T01IU5_A12006DVPrdPreAc ;
   private boolean[] T01IU5_n12006DVPrdPreAc ;
   private short[] T01IU5_A12007DVUltLinEn ;
   private boolean[] T01IU5_n12007DVUltLinEn ;
   private String[] T01IU5_A12008DVPrdDetPa ;
   private boolean[] T01IU5_n12008DVPrdDetPa ;
   private byte[] T01IU5_A12009DVValCod ;
   private boolean[] T01IU5_n12009DVValCod ;
   private java.util.Date[] T01IU5_A12010DVPrdFulEn ;
   private boolean[] T01IU5_n12010DVPrdFulEn ;
   private java.math.BigDecimal[] T01IU5_A12011DVPrdCanPe ;
   private boolean[] T01IU5_n12011DVPrdCanPe ;
   private java.math.BigDecimal[] T01IU5_A12012DVPrdRotRe ;
   private boolean[] T01IU5_n12012DVPrdRotRe ;
   private java.math.BigDecimal[] T01IU5_A12013DVPrdPreMe ;
   private boolean[] T01IU5_n12013DVPrdPreMe ;
   private String[] T01IU5_A12014DVPrdRec ;
   private boolean[] T01IU5_n12014DVPrdRec ;
   private java.math.BigDecimal[] T01IU5_A12015DVPrdPreAn ;
   private boolean[] T01IU5_n12015DVPrdPreAn ;
   private java.util.Date[] T01IU5_A12016DVPrdFecPr ;
   private boolean[] T01IU5_n12016DVPrdFecPr ;
   private short[] T01IU5_A12017DVMovEspUL ;
   private boolean[] T01IU5_n12017DVMovEspUL ;
   private java.math.BigDecimal[] T01IU5_A12018DVPrdExiCC ;
   private boolean[] T01IU5_n12018DVPrdExiCC ;
   private java.math.BigDecimal[] T01IU5_A12019DVPrdUltDC ;
   private boolean[] T01IU5_n12019DVPrdUltDC ;
   private java.math.BigDecimal[] T01IU5_A12020DVPrdUltEC ;
   private boolean[] T01IU5_n12020DVPrdUltEC ;
   private short[] T01IU5_A12021DVPrdUltCC ;
   private boolean[] T01IU5_n12021DVPrdUltCC ;
   private java.math.BigDecimal[] T01IU5_A12022DVPrdExiCP ;
   private boolean[] T01IU5_n12022DVPrdExiCP ;
   private java.math.BigDecimal[] T01IU5_A12023DVPrdDifCC ;
   private boolean[] T01IU5_n12023DVPrdDifCC ;
   private java.math.BigDecimal[] T01IU5_A12024DVPrdFacCo ;
   private boolean[] T01IU5_n12024DVPrdFacCo ;
   private java.math.BigDecimal[] T01IU5_A12025DVPrdConDi ;
   private boolean[] T01IU5_n12025DVPrdConDi ;
   private java.math.BigDecimal[] T01IU5_A12026DVPrdStkMi ;
   private boolean[] T01IU5_n12026DVPrdStkMi ;
   private short[] T01IU5_A12027DVPrdStkMD ;
   private boolean[] T01IU5_n12027DVPrdStkMD ;
   private short[] T01IU5_A12028DVPrdDiaRo ;
   private boolean[] T01IU5_n12028DVPrdDiaRo ;
   private short[] T01IU5_A12029DVPrdPlaEn ;
   private boolean[] T01IU5_n12029DVPrdPlaEn ;
   private byte[] T01IU5_A12030DVMetCod ;
   private boolean[] T01IU5_n12030DVMetCod ;
   private short[] T01IU5_A12031DVPrdLotMi ;
   private boolean[] T01IU5_n12031DVPrdLotMi ;
   private java.math.BigDecimal[] T01IU5_A12032DVPrdNumUc ;
   private boolean[] T01IU5_n12032DVPrdNumUc ;
   private java.math.BigDecimal[] T01IU5_A12033DVPrdCanRe ;
   private boolean[] T01IU5_n12033DVPrdCanRe ;
   private java.util.Date[] T01IU5_A12034DVPrdFulPe ;
   private boolean[] T01IU5_n12034DVPrdFulPe ;
   private java.util.Date[] T01IU5_A12035DVPrdFulCC ;
   private boolean[] T01IU5_n12035DVPrdFulCC ;
   private short[] T01IU5_A12036DVPrdConCC ;
   private boolean[] T01IU5_n12036DVPrdConCC ;
   private String[] T01IU5_A12037DVPrdDscTe ;
   private boolean[] T01IU5_n12037DVPrdDscTe ;
   private byte[] T01IU5_A12038DVPrdUniCo ;
   private boolean[] T01IU5_n12038DVPrdUniCo ;
   private byte[] T01IU5_A12039DVPrdUniCn ;
   private boolean[] T01IU5_n12039DVPrdUniCn ;
   private String[] T01IU5_A12040DVPrdRefPr ;
   private boolean[] T01IU5_n12040DVPrdRefPr ;
   private String[] T01IU5_A12041DVPrdSus ;
   private boolean[] T01IU5_n12041DVPrdSus ;
   private String[] T01IU5_A12042DVPrdCalNe ;
   private boolean[] T01IU5_n12042DVPrdCalNe ;
   private byte[] T01IU5_A12043DVPrdSit ;
   private boolean[] T01IU5_n12043DVPrdSit ;
   private byte[] T01IU5_A12044DVTipDtoCo ;
   private boolean[] T01IU5_n12044DVTipDtoCo ;
   private java.math.BigDecimal[] T01IU5_A12045DVPrdValSt ;
   private boolean[] T01IU5_n12045DVPrdValSt ;
   private java.math.BigDecimal[] T01IU5_A12046DVDifValSt ;
   private boolean[] T01IU5_n12046DVDifValSt ;
   private java.util.Date[] T01IU5_A12047DVPrdFecEn ;
   private boolean[] T01IU5_n12047DVPrdFecEn ;
   private short[] T01IU5_A12048DVPrdPosX ;
   private boolean[] T01IU5_n12048DVPrdPosX ;
   private short[] T01IU5_A12049DVPrdPosY ;
   private boolean[] T01IU5_n12049DVPrdPosY ;
   private String[] T01IU5_A12050DVPrdTip ;
   private boolean[] T01IU5_n12050DVPrdTip ;
   private short[] T01IU5_A12051DVPrdDqo ;
   private boolean[] T01IU5_n12051DVPrdDqo ;
   private String[] T01IU5_A12052DVPrdRev ;
   private boolean[] T01IU5_n12052DVPrdRev ;
   private byte[] T01IU5_A12053DVPrdTnq ;
   private boolean[] T01IU5_n12053DVPrdTnq ;
   private long[] T01IU5_A12054DVCCStKULi ;
   private boolean[] T01IU5_n12054DVCCStKULi ;
   private byte[] T01IU5_A12055DVPrdUMeFo ;
   private boolean[] T01IU5_n12055DVPrdUMeFo ;
   private String[] T01IU5_A12056DVPrdNom2 ;
   private boolean[] T01IU5_n12056DVPrdNom2 ;
   private String[] T01IU5_A12057DVPrdNum2 ;
   private boolean[] T01IU5_n12057DVPrdNum2 ;
   private java.math.BigDecimal[] T01IU5_A12059DVPrdPreA2 ;
   private boolean[] T01IU5_n12059DVPrdPreA2 ;
   private java.math.BigDecimal[] T01IU5_A12060DVPrdDensS ;
   private boolean[] T01IU5_n12060DVPrdDensS ;
   private java.math.BigDecimal[] T01IU5_A12061DVPrdConcS ;
   private boolean[] T01IU5_n12061DVPrdConcS ;
   private String[] T01IU5_A12062DVPrdSalM ;
   private boolean[] T01IU5_n12062DVPrdSalM ;
   private java.math.BigDecimal[] T01IU5_A12063DVPrdSolub ;
   private boolean[] T01IU5_n12063DVPrdSolub ;
   private String[] T01IU5_A12064DVPrdNumCe ;
   private boolean[] T01IU5_n12064DVPrdNumCe ;
   private short[] T01IU5_A12065DVTipPrdCo ;
   private boolean[] T01IU5_n12065DVTipPrdCo ;
   private java.math.BigDecimal[] T01IU5_A12066DVPrdNumct ;
   private boolean[] T01IU5_n12066DVPrdNumct ;
   private java.math.BigDecimal[] T01IU5_A12067DVPrdNumc2 ;
   private boolean[] T01IU5_n12067DVPrdNumc2 ;
   private byte[] T01IU5_A12068DVPrdHorMa ;
   private boolean[] T01IU5_n12068DVPrdHorMa ;
   private java.math.BigDecimal[] T01IU5_A12069DVPrdPreRe ;
   private boolean[] T01IU5_n12069DVPrdPreRe ;
   private java.math.BigDecimal[] T01IU5_A12070DVMat_Lts ;
   private boolean[] T01IU5_n12070DVMat_Lts ;
   private java.math.BigDecimal[] T01IU5_A12071DVPrdExiAc ;
   private boolean[] T01IU5_n12071DVPrdExiAc ;
   private int[] T01IU5_A12072DVAlmc_Ult ;
   private boolean[] T01IU5_n12072DVAlmc_Ult ;
   private byte[] T01IU5_A12073DVPrdAltAc ;
   private boolean[] T01IU5_n12073DVPrdAltAc ;
   private byte[] T01IU5_A12074DVPrdPesCo ;
   private boolean[] T01IU5_n12074DVPrdPesCo ;
   private String[] T01IU5_A12075DVPrdPesTe ;
   private boolean[] T01IU5_n12075DVPrdPesTe ;
   private long[] T01IU5_A12076DVCC_Ultln ;
   private boolean[] T01IU5_n12076DVCC_Ultln ;
   private String[] T01IU5_A12077DVPrdSal ;
   private boolean[] T01IU5_n12077DVPrdSal ;
   private byte[] T01IU5_A12078DVSubFamCo ;
   private boolean[] T01IU5_n12078DVSubFamCo ;
   private String[] T01IU5_A12079DVPrdInc ;
   private boolean[] T01IU5_n12079DVPrdInc ;
   private String[] T01IU5_A12080DVPrdComp ;
   private boolean[] T01IU5_n12080DVPrdComp ;
   private java.math.BigDecimal[] T01IU5_A12081DVPrdAox ;
   private boolean[] T01IU5_n12081DVPrdAox ;
   private String[] T01IU5_A12082DVPrdNCAS ;
   private boolean[] T01IU5_n12082DVPrdNCAS ;
   private String[] T01IU5_A12083DVPrdFT ;
   private boolean[] T01IU5_n12083DVPrdFT ;
   private java.util.Date[] T01IU5_A12084DVPrdFFT ;
   private boolean[] T01IU5_n12084DVPrdFFT ;
   private String[] T01IU5_A12085DVPrdHS ;
   private boolean[] T01IU5_n12085DVPrdHS ;
   private java.util.Date[] T01IU5_A12086DVPrdFHS ;
   private boolean[] T01IU5_n12086DVPrdFHS ;
   private String[] T01IU5_A12087DVPrdReach ;
   private boolean[] T01IU5_n12087DVPrdReach ;
   private String[] T01IU5_A12088DVPrdOkote ;
   private boolean[] T01IU5_n12088DVPrdOkote ;
   private String[] T01IU5_A12089DVPrdColId ;
   private boolean[] T01IU5_n12089DVPrdColId ;
   private String[] T01IU5_A12090DVPrdLote ;
   private boolean[] T01IU5_n12090DVPrdLote ;
   private String[] T01IU5_A12091DVPrdRTM ;
   private boolean[] T01IU5_n12091DVPrdRTM ;
   private String[] T01IU5_A12092DVPrdCtw1 ;
   private boolean[] T01IU5_n12092DVPrdCtw1 ;
   private String[] T01IU5_A12093DVPrdCtw2 ;
   private boolean[] T01IU5_n12093DVPrdCtw2 ;
   private String[] T01IU5_A12094DVPrdCtw3 ;
   private boolean[] T01IU5_n12094DVPrdCtw3 ;
   private String[] T01IU5_A12095DVPrdNroCA ;
   private boolean[] T01IU5_n12095DVPrdNroCA ;
   private String[] T01IU5_A12096DVPrdGots ;
   private boolean[] T01IU5_n12096DVPrdGots ;
   private String[] T01IU5_A12097DVPrdHm ;
   private boolean[] T01IU5_n12097DVPrdHm ;
   private short[] T01IU5_A12098DVPrdConct ;
   private boolean[] T01IU5_n12098DVPrdConct ;
   private String[] T01IU5_A12099DVPrdEINEC ;
   private boolean[] T01IU5_n12099DVPrdEINEC ;
   private String[] T01IU5_A12100DVPrdFunci ;
   private boolean[] T01IU5_n12100DVPrdFunci ;
   private String[] T01IU5_A12101DVPrdNmQu ;
   private boolean[] T01IU5_n12101DVPrdNmQu ;
   private String[] T01IU4_A396EmprCod ;
   private String[] T01IU6_A396EmprCod ;
   private String[] T01IU7_A396EmprCod ;
   private String[] T01IU7_A11935DVPrdNum ;
   private String[] T01IU3_A12058DVPrdObs ;
   private boolean[] T01IU3_n12058DVPrdObs ;
   private String[] T01IU3_A12102DVPrdEqLP ;
   private boolean[] T01IU3_n12102DVPrdEqLP ;
   private java.math.BigDecimal[] T01IU3_A12103DVPrdConc ;
   private boolean[] T01IU3_n12103DVPrdConc ;
   private String[] T01IU3_A12104DVPrdCtw4 ;
   private boolean[] T01IU3_n12104DVPrdCtw4 ;
   private String[] T01IU3_A12105DVPrdList ;
   private boolean[] T01IU3_n12105DVPrdList ;
   private String[] T01IU3_A396EmprCod ;
   private String[] T01IU3_A11935DVPrdNum ;
   private String[] T01IU3_A12003DVPrdNom ;
   private boolean[] T01IU3_n12003DVPrdNom ;
   private int[] T01IU3_A12004DVPrvNum ;
   private boolean[] T01IU3_n12004DVPrvNum ;
   private java.math.BigDecimal[] T01IU3_A12005DVPrdExiAl ;
   private boolean[] T01IU3_n12005DVPrdExiAl ;
   private java.math.BigDecimal[] T01IU3_A12006DVPrdPreAc ;
   private boolean[] T01IU3_n12006DVPrdPreAc ;
   private short[] T01IU3_A12007DVUltLinEn ;
   private boolean[] T01IU3_n12007DVUltLinEn ;
   private String[] T01IU3_A12008DVPrdDetPa ;
   private boolean[] T01IU3_n12008DVPrdDetPa ;
   private byte[] T01IU3_A12009DVValCod ;
   private boolean[] T01IU3_n12009DVValCod ;
   private java.util.Date[] T01IU3_A12010DVPrdFulEn ;
   private boolean[] T01IU3_n12010DVPrdFulEn ;
   private java.math.BigDecimal[] T01IU3_A12011DVPrdCanPe ;
   private boolean[] T01IU3_n12011DVPrdCanPe ;
   private java.math.BigDecimal[] T01IU3_A12012DVPrdRotRe ;
   private boolean[] T01IU3_n12012DVPrdRotRe ;
   private java.math.BigDecimal[] T01IU3_A12013DVPrdPreMe ;
   private boolean[] T01IU3_n12013DVPrdPreMe ;
   private String[] T01IU3_A12014DVPrdRec ;
   private boolean[] T01IU3_n12014DVPrdRec ;
   private java.math.BigDecimal[] T01IU3_A12015DVPrdPreAn ;
   private boolean[] T01IU3_n12015DVPrdPreAn ;
   private java.util.Date[] T01IU3_A12016DVPrdFecPr ;
   private boolean[] T01IU3_n12016DVPrdFecPr ;
   private short[] T01IU3_A12017DVMovEspUL ;
   private boolean[] T01IU3_n12017DVMovEspUL ;
   private java.math.BigDecimal[] T01IU3_A12018DVPrdExiCC ;
   private boolean[] T01IU3_n12018DVPrdExiCC ;
   private java.math.BigDecimal[] T01IU3_A12019DVPrdUltDC ;
   private boolean[] T01IU3_n12019DVPrdUltDC ;
   private java.math.BigDecimal[] T01IU3_A12020DVPrdUltEC ;
   private boolean[] T01IU3_n12020DVPrdUltEC ;
   private short[] T01IU3_A12021DVPrdUltCC ;
   private boolean[] T01IU3_n12021DVPrdUltCC ;
   private java.math.BigDecimal[] T01IU3_A12022DVPrdExiCP ;
   private boolean[] T01IU3_n12022DVPrdExiCP ;
   private java.math.BigDecimal[] T01IU3_A12023DVPrdDifCC ;
   private boolean[] T01IU3_n12023DVPrdDifCC ;
   private java.math.BigDecimal[] T01IU3_A12024DVPrdFacCo ;
   private boolean[] T01IU3_n12024DVPrdFacCo ;
   private java.math.BigDecimal[] T01IU3_A12025DVPrdConDi ;
   private boolean[] T01IU3_n12025DVPrdConDi ;
   private java.math.BigDecimal[] T01IU3_A12026DVPrdStkMi ;
   private boolean[] T01IU3_n12026DVPrdStkMi ;
   private short[] T01IU3_A12027DVPrdStkMD ;
   private boolean[] T01IU3_n12027DVPrdStkMD ;
   private short[] T01IU3_A12028DVPrdDiaRo ;
   private boolean[] T01IU3_n12028DVPrdDiaRo ;
   private short[] T01IU3_A12029DVPrdPlaEn ;
   private boolean[] T01IU3_n12029DVPrdPlaEn ;
   private byte[] T01IU3_A12030DVMetCod ;
   private boolean[] T01IU3_n12030DVMetCod ;
   private short[] T01IU3_A12031DVPrdLotMi ;
   private boolean[] T01IU3_n12031DVPrdLotMi ;
   private java.math.BigDecimal[] T01IU3_A12032DVPrdNumUc ;
   private boolean[] T01IU3_n12032DVPrdNumUc ;
   private java.math.BigDecimal[] T01IU3_A12033DVPrdCanRe ;
   private boolean[] T01IU3_n12033DVPrdCanRe ;
   private java.util.Date[] T01IU3_A12034DVPrdFulPe ;
   private boolean[] T01IU3_n12034DVPrdFulPe ;
   private java.util.Date[] T01IU3_A12035DVPrdFulCC ;
   private boolean[] T01IU3_n12035DVPrdFulCC ;
   private short[] T01IU3_A12036DVPrdConCC ;
   private boolean[] T01IU3_n12036DVPrdConCC ;
   private String[] T01IU3_A12037DVPrdDscTe ;
   private boolean[] T01IU3_n12037DVPrdDscTe ;
   private byte[] T01IU3_A12038DVPrdUniCo ;
   private boolean[] T01IU3_n12038DVPrdUniCo ;
   private byte[] T01IU3_A12039DVPrdUniCn ;
   private boolean[] T01IU3_n12039DVPrdUniCn ;
   private String[] T01IU3_A12040DVPrdRefPr ;
   private boolean[] T01IU3_n12040DVPrdRefPr ;
   private String[] T01IU3_A12041DVPrdSus ;
   private boolean[] T01IU3_n12041DVPrdSus ;
   private String[] T01IU3_A12042DVPrdCalNe ;
   private boolean[] T01IU3_n12042DVPrdCalNe ;
   private byte[] T01IU3_A12043DVPrdSit ;
   private boolean[] T01IU3_n12043DVPrdSit ;
   private byte[] T01IU3_A12044DVTipDtoCo ;
   private boolean[] T01IU3_n12044DVTipDtoCo ;
   private java.math.BigDecimal[] T01IU3_A12045DVPrdValSt ;
   private boolean[] T01IU3_n12045DVPrdValSt ;
   private java.math.BigDecimal[] T01IU3_A12046DVDifValSt ;
   private boolean[] T01IU3_n12046DVDifValSt ;
   private java.util.Date[] T01IU3_A12047DVPrdFecEn ;
   private boolean[] T01IU3_n12047DVPrdFecEn ;
   private short[] T01IU3_A12048DVPrdPosX ;
   private boolean[] T01IU3_n12048DVPrdPosX ;
   private short[] T01IU3_A12049DVPrdPosY ;
   private boolean[] T01IU3_n12049DVPrdPosY ;
   private String[] T01IU3_A12050DVPrdTip ;
   private boolean[] T01IU3_n12050DVPrdTip ;
   private short[] T01IU3_A12051DVPrdDqo ;
   private boolean[] T01IU3_n12051DVPrdDqo ;
   private String[] T01IU3_A12052DVPrdRev ;
   private boolean[] T01IU3_n12052DVPrdRev ;
   private byte[] T01IU3_A12053DVPrdTnq ;
   private boolean[] T01IU3_n12053DVPrdTnq ;
   private long[] T01IU3_A12054DVCCStKULi ;
   private boolean[] T01IU3_n12054DVCCStKULi ;
   private byte[] T01IU3_A12055DVPrdUMeFo ;
   private boolean[] T01IU3_n12055DVPrdUMeFo ;
   private String[] T01IU3_A12056DVPrdNom2 ;
   private boolean[] T01IU3_n12056DVPrdNom2 ;
   private String[] T01IU3_A12057DVPrdNum2 ;
   private boolean[] T01IU3_n12057DVPrdNum2 ;
   private java.math.BigDecimal[] T01IU3_A12059DVPrdPreA2 ;
   private boolean[] T01IU3_n12059DVPrdPreA2 ;
   private java.math.BigDecimal[] T01IU3_A12060DVPrdDensS ;
   private boolean[] T01IU3_n12060DVPrdDensS ;
   private java.math.BigDecimal[] T01IU3_A12061DVPrdConcS ;
   private boolean[] T01IU3_n12061DVPrdConcS ;
   private String[] T01IU3_A12062DVPrdSalM ;
   private boolean[] T01IU3_n12062DVPrdSalM ;
   private java.math.BigDecimal[] T01IU3_A12063DVPrdSolub ;
   private boolean[] T01IU3_n12063DVPrdSolub ;
   private String[] T01IU3_A12064DVPrdNumCe ;
   private boolean[] T01IU3_n12064DVPrdNumCe ;
   private short[] T01IU3_A12065DVTipPrdCo ;
   private boolean[] T01IU3_n12065DVTipPrdCo ;
   private java.math.BigDecimal[] T01IU3_A12066DVPrdNumct ;
   private boolean[] T01IU3_n12066DVPrdNumct ;
   private java.math.BigDecimal[] T01IU3_A12067DVPrdNumc2 ;
   private boolean[] T01IU3_n12067DVPrdNumc2 ;
   private byte[] T01IU3_A12068DVPrdHorMa ;
   private boolean[] T01IU3_n12068DVPrdHorMa ;
   private java.math.BigDecimal[] T01IU3_A12069DVPrdPreRe ;
   private boolean[] T01IU3_n12069DVPrdPreRe ;
   private java.math.BigDecimal[] T01IU3_A12070DVMat_Lts ;
   private boolean[] T01IU3_n12070DVMat_Lts ;
   private java.math.BigDecimal[] T01IU3_A12071DVPrdExiAc ;
   private boolean[] T01IU3_n12071DVPrdExiAc ;
   private int[] T01IU3_A12072DVAlmc_Ult ;
   private boolean[] T01IU3_n12072DVAlmc_Ult ;
   private byte[] T01IU3_A12073DVPrdAltAc ;
   private boolean[] T01IU3_n12073DVPrdAltAc ;
   private byte[] T01IU3_A12074DVPrdPesCo ;
   private boolean[] T01IU3_n12074DVPrdPesCo ;
   private String[] T01IU3_A12075DVPrdPesTe ;
   private boolean[] T01IU3_n12075DVPrdPesTe ;
   private long[] T01IU3_A12076DVCC_Ultln ;
   private boolean[] T01IU3_n12076DVCC_Ultln ;
   private String[] T01IU3_A12077DVPrdSal ;
   private boolean[] T01IU3_n12077DVPrdSal ;
   private byte[] T01IU3_A12078DVSubFamCo ;
   private boolean[] T01IU3_n12078DVSubFamCo ;
   private String[] T01IU3_A12079DVPrdInc ;
   private boolean[] T01IU3_n12079DVPrdInc ;
   private String[] T01IU3_A12080DVPrdComp ;
   private boolean[] T01IU3_n12080DVPrdComp ;
   private java.math.BigDecimal[] T01IU3_A12081DVPrdAox ;
   private boolean[] T01IU3_n12081DVPrdAox ;
   private String[] T01IU3_A12082DVPrdNCAS ;
   private boolean[] T01IU3_n12082DVPrdNCAS ;
   private String[] T01IU3_A12083DVPrdFT ;
   private boolean[] T01IU3_n12083DVPrdFT ;
   private java.util.Date[] T01IU3_A12084DVPrdFFT ;
   private boolean[] T01IU3_n12084DVPrdFFT ;
   private String[] T01IU3_A12085DVPrdHS ;
   private boolean[] T01IU3_n12085DVPrdHS ;
   private java.util.Date[] T01IU3_A12086DVPrdFHS ;
   private boolean[] T01IU3_n12086DVPrdFHS ;
   private String[] T01IU3_A12087DVPrdReach ;
   private boolean[] T01IU3_n12087DVPrdReach ;
   private String[] T01IU3_A12088DVPrdOkote ;
   private boolean[] T01IU3_n12088DVPrdOkote ;
   private String[] T01IU3_A12089DVPrdColId ;
   private boolean[] T01IU3_n12089DVPrdColId ;
   private String[] T01IU3_A12090DVPrdLote ;
   private boolean[] T01IU3_n12090DVPrdLote ;
   private String[] T01IU3_A12091DVPrdRTM ;
   private boolean[] T01IU3_n12091DVPrdRTM ;
   private String[] T01IU3_A12092DVPrdCtw1 ;
   private boolean[] T01IU3_n12092DVPrdCtw1 ;
   private String[] T01IU3_A12093DVPrdCtw2 ;
   private boolean[] T01IU3_n12093DVPrdCtw2 ;
   private String[] T01IU3_A12094DVPrdCtw3 ;
   private boolean[] T01IU3_n12094DVPrdCtw3 ;
   private String[] T01IU3_A12095DVPrdNroCA ;
   private boolean[] T01IU3_n12095DVPrdNroCA ;
   private String[] T01IU3_A12096DVPrdGots ;
   private boolean[] T01IU3_n12096DVPrdGots ;
   private String[] T01IU3_A12097DVPrdHm ;
   private boolean[] T01IU3_n12097DVPrdHm ;
   private short[] T01IU3_A12098DVPrdConct ;
   private boolean[] T01IU3_n12098DVPrdConct ;
   private String[] T01IU3_A12099DVPrdEINEC ;
   private boolean[] T01IU3_n12099DVPrdEINEC ;
   private String[] T01IU3_A12100DVPrdFunci ;
   private boolean[] T01IU3_n12100DVPrdFunci ;
   private String[] T01IU3_A12101DVPrdNmQu ;
   private boolean[] T01IU3_n12101DVPrdNmQu ;
   private String[] T01IU8_A396EmprCod ;
   private String[] T01IU8_A11935DVPrdNum ;
   private String[] T01IU9_A396EmprCod ;
   private String[] T01IU9_A11935DVPrdNum ;
   private String[] T01IU2_A12058DVPrdObs ;
   private boolean[] T01IU2_n12058DVPrdObs ;
   private String[] T01IU2_A12102DVPrdEqLP ;
   private boolean[] T01IU2_n12102DVPrdEqLP ;
   private java.math.BigDecimal[] T01IU2_A12103DVPrdConc ;
   private boolean[] T01IU2_n12103DVPrdConc ;
   private String[] T01IU2_A12104DVPrdCtw4 ;
   private boolean[] T01IU2_n12104DVPrdCtw4 ;
   private String[] T01IU2_A12105DVPrdList ;
   private boolean[] T01IU2_n12105DVPrdList ;
   private String[] T01IU2_A396EmprCod ;
   private String[] T01IU2_A11935DVPrdNum ;
   private String[] T01IU2_A12003DVPrdNom ;
   private boolean[] T01IU2_n12003DVPrdNom ;
   private int[] T01IU2_A12004DVPrvNum ;
   private boolean[] T01IU2_n12004DVPrvNum ;
   private java.math.BigDecimal[] T01IU2_A12005DVPrdExiAl ;
   private boolean[] T01IU2_n12005DVPrdExiAl ;
   private java.math.BigDecimal[] T01IU2_A12006DVPrdPreAc ;
   private boolean[] T01IU2_n12006DVPrdPreAc ;
   private short[] T01IU2_A12007DVUltLinEn ;
   private boolean[] T01IU2_n12007DVUltLinEn ;
   private String[] T01IU2_A12008DVPrdDetPa ;
   private boolean[] T01IU2_n12008DVPrdDetPa ;
   private byte[] T01IU2_A12009DVValCod ;
   private boolean[] T01IU2_n12009DVValCod ;
   private java.util.Date[] T01IU2_A12010DVPrdFulEn ;
   private boolean[] T01IU2_n12010DVPrdFulEn ;
   private java.math.BigDecimal[] T01IU2_A12011DVPrdCanPe ;
   private boolean[] T01IU2_n12011DVPrdCanPe ;
   private java.math.BigDecimal[] T01IU2_A12012DVPrdRotRe ;
   private boolean[] T01IU2_n12012DVPrdRotRe ;
   private java.math.BigDecimal[] T01IU2_A12013DVPrdPreMe ;
   private boolean[] T01IU2_n12013DVPrdPreMe ;
   private String[] T01IU2_A12014DVPrdRec ;
   private boolean[] T01IU2_n12014DVPrdRec ;
   private java.math.BigDecimal[] T01IU2_A12015DVPrdPreAn ;
   private boolean[] T01IU2_n12015DVPrdPreAn ;
   private java.util.Date[] T01IU2_A12016DVPrdFecPr ;
   private boolean[] T01IU2_n12016DVPrdFecPr ;
   private short[] T01IU2_A12017DVMovEspUL ;
   private boolean[] T01IU2_n12017DVMovEspUL ;
   private java.math.BigDecimal[] T01IU2_A12018DVPrdExiCC ;
   private boolean[] T01IU2_n12018DVPrdExiCC ;
   private java.math.BigDecimal[] T01IU2_A12019DVPrdUltDC ;
   private boolean[] T01IU2_n12019DVPrdUltDC ;
   private java.math.BigDecimal[] T01IU2_A12020DVPrdUltEC ;
   private boolean[] T01IU2_n12020DVPrdUltEC ;
   private short[] T01IU2_A12021DVPrdUltCC ;
   private boolean[] T01IU2_n12021DVPrdUltCC ;
   private java.math.BigDecimal[] T01IU2_A12022DVPrdExiCP ;
   private boolean[] T01IU2_n12022DVPrdExiCP ;
   private java.math.BigDecimal[] T01IU2_A12023DVPrdDifCC ;
   private boolean[] T01IU2_n12023DVPrdDifCC ;
   private java.math.BigDecimal[] T01IU2_A12024DVPrdFacCo ;
   private boolean[] T01IU2_n12024DVPrdFacCo ;
   private java.math.BigDecimal[] T01IU2_A12025DVPrdConDi ;
   private boolean[] T01IU2_n12025DVPrdConDi ;
   private java.math.BigDecimal[] T01IU2_A12026DVPrdStkMi ;
   private boolean[] T01IU2_n12026DVPrdStkMi ;
   private short[] T01IU2_A12027DVPrdStkMD ;
   private boolean[] T01IU2_n12027DVPrdStkMD ;
   private short[] T01IU2_A12028DVPrdDiaRo ;
   private boolean[] T01IU2_n12028DVPrdDiaRo ;
   private short[] T01IU2_A12029DVPrdPlaEn ;
   private boolean[] T01IU2_n12029DVPrdPlaEn ;
   private byte[] T01IU2_A12030DVMetCod ;
   private boolean[] T01IU2_n12030DVMetCod ;
   private short[] T01IU2_A12031DVPrdLotMi ;
   private boolean[] T01IU2_n12031DVPrdLotMi ;
   private java.math.BigDecimal[] T01IU2_A12032DVPrdNumUc ;
   private boolean[] T01IU2_n12032DVPrdNumUc ;
   private java.math.BigDecimal[] T01IU2_A12033DVPrdCanRe ;
   private boolean[] T01IU2_n12033DVPrdCanRe ;
   private java.util.Date[] T01IU2_A12034DVPrdFulPe ;
   private boolean[] T01IU2_n12034DVPrdFulPe ;
   private java.util.Date[] T01IU2_A12035DVPrdFulCC ;
   private boolean[] T01IU2_n12035DVPrdFulCC ;
   private short[] T01IU2_A12036DVPrdConCC ;
   private boolean[] T01IU2_n12036DVPrdConCC ;
   private String[] T01IU2_A12037DVPrdDscTe ;
   private boolean[] T01IU2_n12037DVPrdDscTe ;
   private byte[] T01IU2_A12038DVPrdUniCo ;
   private boolean[] T01IU2_n12038DVPrdUniCo ;
   private byte[] T01IU2_A12039DVPrdUniCn ;
   private boolean[] T01IU2_n12039DVPrdUniCn ;
   private String[] T01IU2_A12040DVPrdRefPr ;
   private boolean[] T01IU2_n12040DVPrdRefPr ;
   private String[] T01IU2_A12041DVPrdSus ;
   private boolean[] T01IU2_n12041DVPrdSus ;
   private String[] T01IU2_A12042DVPrdCalNe ;
   private boolean[] T01IU2_n12042DVPrdCalNe ;
   private byte[] T01IU2_A12043DVPrdSit ;
   private boolean[] T01IU2_n12043DVPrdSit ;
   private byte[] T01IU2_A12044DVTipDtoCo ;
   private boolean[] T01IU2_n12044DVTipDtoCo ;
   private java.math.BigDecimal[] T01IU2_A12045DVPrdValSt ;
   private boolean[] T01IU2_n12045DVPrdValSt ;
   private java.math.BigDecimal[] T01IU2_A12046DVDifValSt ;
   private boolean[] T01IU2_n12046DVDifValSt ;
   private java.util.Date[] T01IU2_A12047DVPrdFecEn ;
   private boolean[] T01IU2_n12047DVPrdFecEn ;
   private short[] T01IU2_A12048DVPrdPosX ;
   private boolean[] T01IU2_n12048DVPrdPosX ;
   private short[] T01IU2_A12049DVPrdPosY ;
   private boolean[] T01IU2_n12049DVPrdPosY ;
   private String[] T01IU2_A12050DVPrdTip ;
   private boolean[] T01IU2_n12050DVPrdTip ;
   private short[] T01IU2_A12051DVPrdDqo ;
   private boolean[] T01IU2_n12051DVPrdDqo ;
   private String[] T01IU2_A12052DVPrdRev ;
   private boolean[] T01IU2_n12052DVPrdRev ;
   private byte[] T01IU2_A12053DVPrdTnq ;
   private boolean[] T01IU2_n12053DVPrdTnq ;
   private long[] T01IU2_A12054DVCCStKULi ;
   private boolean[] T01IU2_n12054DVCCStKULi ;
   private byte[] T01IU2_A12055DVPrdUMeFo ;
   private boolean[] T01IU2_n12055DVPrdUMeFo ;
   private String[] T01IU2_A12056DVPrdNom2 ;
   private boolean[] T01IU2_n12056DVPrdNom2 ;
   private String[] T01IU2_A12057DVPrdNum2 ;
   private boolean[] T01IU2_n12057DVPrdNum2 ;
   private java.math.BigDecimal[] T01IU2_A12059DVPrdPreA2 ;
   private boolean[] T01IU2_n12059DVPrdPreA2 ;
   private java.math.BigDecimal[] T01IU2_A12060DVPrdDensS ;
   private boolean[] T01IU2_n12060DVPrdDensS ;
   private java.math.BigDecimal[] T01IU2_A12061DVPrdConcS ;
   private boolean[] T01IU2_n12061DVPrdConcS ;
   private String[] T01IU2_A12062DVPrdSalM ;
   private boolean[] T01IU2_n12062DVPrdSalM ;
   private java.math.BigDecimal[] T01IU2_A12063DVPrdSolub ;
   private boolean[] T01IU2_n12063DVPrdSolub ;
   private String[] T01IU2_A12064DVPrdNumCe ;
   private boolean[] T01IU2_n12064DVPrdNumCe ;
   private short[] T01IU2_A12065DVTipPrdCo ;
   private boolean[] T01IU2_n12065DVTipPrdCo ;
   private java.math.BigDecimal[] T01IU2_A12066DVPrdNumct ;
   private boolean[] T01IU2_n12066DVPrdNumct ;
   private java.math.BigDecimal[] T01IU2_A12067DVPrdNumc2 ;
   private boolean[] T01IU2_n12067DVPrdNumc2 ;
   private byte[] T01IU2_A12068DVPrdHorMa ;
   private boolean[] T01IU2_n12068DVPrdHorMa ;
   private java.math.BigDecimal[] T01IU2_A12069DVPrdPreRe ;
   private boolean[] T01IU2_n12069DVPrdPreRe ;
   private java.math.BigDecimal[] T01IU2_A12070DVMat_Lts ;
   private boolean[] T01IU2_n12070DVMat_Lts ;
   private java.math.BigDecimal[] T01IU2_A12071DVPrdExiAc ;
   private boolean[] T01IU2_n12071DVPrdExiAc ;
   private int[] T01IU2_A12072DVAlmc_Ult ;
   private boolean[] T01IU2_n12072DVAlmc_Ult ;
   private byte[] T01IU2_A12073DVPrdAltAc ;
   private boolean[] T01IU2_n12073DVPrdAltAc ;
   private byte[] T01IU2_A12074DVPrdPesCo ;
   private boolean[] T01IU2_n12074DVPrdPesCo ;
   private String[] T01IU2_A12075DVPrdPesTe ;
   private boolean[] T01IU2_n12075DVPrdPesTe ;
   private long[] T01IU2_A12076DVCC_Ultln ;
   private boolean[] T01IU2_n12076DVCC_Ultln ;
   private String[] T01IU2_A12077DVPrdSal ;
   private boolean[] T01IU2_n12077DVPrdSal ;
   private byte[] T01IU2_A12078DVSubFamCo ;
   private boolean[] T01IU2_n12078DVSubFamCo ;
   private String[] T01IU2_A12079DVPrdInc ;
   private boolean[] T01IU2_n12079DVPrdInc ;
   private String[] T01IU2_A12080DVPrdComp ;
   private boolean[] T01IU2_n12080DVPrdComp ;
   private java.math.BigDecimal[] T01IU2_A12081DVPrdAox ;
   private boolean[] T01IU2_n12081DVPrdAox ;
   private String[] T01IU2_A12082DVPrdNCAS ;
   private boolean[] T01IU2_n12082DVPrdNCAS ;
   private String[] T01IU2_A12083DVPrdFT ;
   private boolean[] T01IU2_n12083DVPrdFT ;
   private java.util.Date[] T01IU2_A12084DVPrdFFT ;
   private boolean[] T01IU2_n12084DVPrdFFT ;
   private String[] T01IU2_A12085DVPrdHS ;
   private boolean[] T01IU2_n12085DVPrdHS ;
   private java.util.Date[] T01IU2_A12086DVPrdFHS ;
   private boolean[] T01IU2_n12086DVPrdFHS ;
   private String[] T01IU2_A12087DVPrdReach ;
   private boolean[] T01IU2_n12087DVPrdReach ;
   private String[] T01IU2_A12088DVPrdOkote ;
   private boolean[] T01IU2_n12088DVPrdOkote ;
   private String[] T01IU2_A12089DVPrdColId ;
   private boolean[] T01IU2_n12089DVPrdColId ;
   private String[] T01IU2_A12090DVPrdLote ;
   private boolean[] T01IU2_n12090DVPrdLote ;
   private String[] T01IU2_A12091DVPrdRTM ;
   private boolean[] T01IU2_n12091DVPrdRTM ;
   private String[] T01IU2_A12092DVPrdCtw1 ;
   private boolean[] T01IU2_n12092DVPrdCtw1 ;
   private String[] T01IU2_A12093DVPrdCtw2 ;
   private boolean[] T01IU2_n12093DVPrdCtw2 ;
   private String[] T01IU2_A12094DVPrdCtw3 ;
   private boolean[] T01IU2_n12094DVPrdCtw3 ;
   private String[] T01IU2_A12095DVPrdNroCA ;
   private boolean[] T01IU2_n12095DVPrdNroCA ;
   private String[] T01IU2_A12096DVPrdGots ;
   private boolean[] T01IU2_n12096DVPrdGots ;
   private String[] T01IU2_A12097DVPrdHm ;
   private boolean[] T01IU2_n12097DVPrdHm ;
   private short[] T01IU2_A12098DVPrdConct ;
   private boolean[] T01IU2_n12098DVPrdConct ;
   private String[] T01IU2_A12099DVPrdEINEC ;
   private boolean[] T01IU2_n12099DVPrdEINEC ;
   private String[] T01IU2_A12100DVPrdFunci ;
   private boolean[] T01IU2_n12100DVPrdFunci ;
   private String[] T01IU2_A12101DVPrdNmQu ;
   private boolean[] T01IU2_n12101DVPrdNmQu ;
   private String[] T01IU13_A396EmprCod ;
   private String[] T01IU13_A11935DVPrdNum ;
   private int[] T01IU13_A12106DVPrdPrv ;
   private String[] T01IU14_A396EmprCod ;
   private String[] T01IU14_A11935DVPrdNum ;
   private byte[] T01IU14_A11941DVCC_AlmCo ;
   private String[] T01IU15_A396EmprCod ;
   private String[] T01IU15_A11935DVPrdNum ;
   private short[] T01IU15_A11972DVLinEnt ;
   private String[] T01IU16_A396EmprCod ;
   private String[] T01IU16_A11935DVPrdNum ;
   private long[] T01IU16_A11950DVCCStkLin ;
   private String[] T01IU17_A396EmprCod ;
   private String[] T01IU17_A11935DVPrdNum ;
   private String[] T01IU18_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdvproduc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvproduc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvproduc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvproduc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvproduc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IU2", "SELECT PrdObs, PrdEqLP, PrdConc, PrdCtw4, PrdList, Emprcod AS EmprCod, Prdnum AS DVPrdNum, PrdNom, PrvNum, PrdExiAlm, PrdPreAct, UltLinEnt, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ?  FOR UPDATE OF PrdNom, PrvNum, PrdExiAlm, PrdPreAct, UltLinEnt, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU3", "SELECT PrdObs, PrdEqLP, PrdConc, PrdCtw4, PrdList, Emprcod AS EmprCod, Prdnum AS DVPrdNum, PrdNom, PrvNum, PrdExiAlm, PrdPreAct, UltLinEnt, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU4", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU5", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdObs, TM1.PrdEqLP, TM1.PrdConc, TM1.PrdCtw4, TM1.PrdList, TM1.Emprcod AS EmprCod, TM1.Prdnum AS DVPrdNum, TM1.PrdNom, TM1.PrvNum, TM1.PrdExiAlm, TM1.PrdPreAct, TM1.UltLinEnt, TM1.PrdDetPar, TM1.ValCod, TM1.PrdFulEnt, TM1.PrdCanPen, TM1.PrdRotRea, TM1.PrdPreMed, TM1.PrdRec, TM1.PrdPreAnt, TM1.PrdFecPre, TM1.MovEspULin, TM1.PrdExiCC, TM1.PrdUltDCC, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdExiCCP, TM1.PrdDifCC, TM1.PrdFacCon, TM1.PrdConDia, TM1.PrdStkMinU, TM1.PrdStkMinD, TM1.PrdDiaRot, TM1.PrdPlaEnt, TM1.MetCod, TM1.PrdLotMin, TM1.PrdNumUco, TM1.PrdCanRes, TM1.PrdFulPed, TM1.PrdFulCC, TM1.PrdConCC, TM1.PrdDscTec, TM1.PrdUniCom, TM1.PrdUniCon, TM1.PrdRefPrv, TM1.PrdSus, TM1.PrdCalNec, TM1.PrdSit, TM1.TipDtoCod, TM1.PrdValStk, TM1.DifValStk, TM1.PrdFecEnt, TM1.PrdPosX, TM1.PrdPosY, TM1.PrdTip, TM1.PrdDqo, TM1.PrdRev, TM1.PrdTnq, TM1.CCStKULin, TM1.PrdUMeFo, TM1.PrdNom2, TM1.PrdNum2, TM1.PrdPreAc2, TM1.PrdDensS, TM1.PrdConcS, TM1.PrdSalM, TM1.PrdSolub, TM1.PrdNumCent, TM1.TipPrdCod, TM1.PrdNumct1, TM1.PrdNumct2, TM1.PrdHorMad, TM1.PrdPreRef, TM1.Mat_Lts, TM1.PrdExiAlmc, TM1.Almc_Ult, TM1.PrdAltAct, TM1.PrdPesCon, TM1.PrdPesTerm, TM1.CC_Ultln, TM1.PrdSal, TM1.SubFamCod, TM1.PrdInc, TM1.PrdComp, TM1.PrdAox, TM1.PrdNCAS, TM1.PrdFT, TM1.PrdFFT, TM1.PrdHS, TM1.PrdFHS, TM1.PrdReach, TM1.PrdOkotex, TM1.PrdColIdx, TM1.PrdLote, TM1.PrdRTM, TM1.PrdCtw1, TM1.PrdCtw2, TM1.PrdCtw3, TM1.PrdNroCAS, TM1.PrdGots, TM1.PrdHm, TM1.PrdConct, TM1.PrdEINECS, TM1.PrdFuncion, TM1.PrdNmQu FROM LVNDVPRODUC TM1 WHERE TM1.Emprcod = ? and TM1.Prdnum = ? ORDER BY TM1.Emprcod, TM1.Prdnum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU6", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU7", "SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNDVPRODUC WHERE ( Emprcod > ? or Emprcod = ? and Prdnum > ?) ORDER BY Emprcod, Prdnum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IU9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNDVPRODUC WHERE ( Emprcod < ? or Emprcod = ? and Prdnum < ?) ORDER BY Emprcod DESC, Prdnum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IU10", "INSERT INTO LVNDVPRODUC(Prdnum, PrdNom, PrvNum, PrdExiAlm, PrdPreAct, UltLinEnt, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, Emprcod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "LVNDVPRODUC")
         ,new UpdateCursor("T01IU11", "UPDATE LVNDVPRODUC SET PrdNom=?, PrvNum=?, PrdExiAlm=?, PrdPreAct=?, UltLinEnt=?, PrdDetPar=?, ValCod=?, PrdFulEnt=?, PrdCanPen=?, PrdRotRea=?, PrdPreMed=?, PrdRec=?, PrdPreAnt=?, PrdFecPre=?, MovEspULin=?, PrdExiCC=?, PrdUltDCC=?, PrdUltECC=?, PrdUltCCC=?, PrdExiCCP=?, PrdDifCC=?, PrdFacCon=?, PrdConDia=?, PrdStkMinU=?, PrdStkMinD=?, PrdDiaRot=?, PrdPlaEnt=?, MetCod=?, PrdLotMin=?, PrdNumUco=?, PrdCanRes=?, PrdFulPed=?, PrdFulCC=?, PrdConCC=?, PrdDscTec=?, PrdUniCom=?, PrdUniCon=?, PrdRefPrv=?, PrdSus=?, PrdCalNec=?, PrdSit=?, TipDtoCod=?, PrdValStk=?, DifValStk=?, PrdFecEnt=?, PrdPosX=?, PrdPosY=?, PrdTip=?, PrdDqo=?, PrdRev=?, PrdTnq=?, CCStKULin=?, PrdUMeFo=?, PrdNom2=?, PrdNum2=?, PrdObs=?, PrdPreAc2=?, PrdDensS=?, PrdConcS=?, PrdSalM=?, PrdSolub=?, PrdNumCent=?, TipPrdCod=?, PrdNumct1=?, PrdNumct2=?, PrdHorMad=?, PrdPreRef=?, Mat_Lts=?, PrdExiAlmc=?, Almc_Ult=?, PrdAltAct=?, PrdPesCon=?, PrdPesTerm=?, CC_Ultln=?, PrdSal=?, SubFamCod=?, PrdInc=?, PrdComp=?, PrdAox=?, PrdNCAS=?, PrdFT=?, PrdFFT=?, PrdHS=?, PrdFHS=?, PrdReach=?, PrdOkotex=?, PrdColIdx=?, PrdLote=?, PrdRTM=?, PrdCtw1=?, PrdCtw2=?, PrdCtw3=?, PrdNroCAS=?, PrdGots=?, PrdHm=?, PrdConct=?, PrdEINECS=?, PrdFuncion=?, PrdNmQu=?, PrdEqLP=?, PrdConc=?, PrdCtw4=?, PrdList=?  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK, "LVNDVPRODUC")
         ,new UpdateCursor("T01IU12", "DELETE FROM LVNDVPRODUC  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK, "LVNDVPRODUC")
         ,new ForEachCursor("T01IU13", "SELECT * FROM (SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, PrdPrv FROM LVNPROPRV WHERE Emprcod = ? AND Prdnum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IU14", "SELECT * FROM (SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IU15", "SELECT * FROM (SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, LinEnt FROM LVNENTALM WHERE Emprcod = ? AND Prdnum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IU16", "SELECT * FROM (SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS WHERE Emprcod = ? AND Prdnum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IU17", "SELECT /*+ FIRST_ROWS(100) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNDVPRODUC ORDER BY Emprcod, Prdnum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IU18", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(23,4);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(33);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,4);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[74])[0] = rslt.getGXDate(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(42, 4);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(45, 30);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((byte[]) buf[94])[0] = rslt.getByte(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[100])[0] = rslt.getGXDate(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((short[]) buf[102])[0] = rslt.getShort(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((byte[]) buf[112])[0] = rslt.getByte(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((long[]) buf[114])[0] = rslt.getLong(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 40);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(62, 16);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(63,5);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(64,3);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[126])[0] = rslt.getBigDecimal(65,3);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(68, 6);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[136])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[138])[0] = rslt.getBigDecimal(71,2);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((byte[]) buf[140])[0] = rslt.getByte(72);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[142])[0] = rslt.getBigDecimal(73,5);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[146])[0] = rslt.getBigDecimal(75,4);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((int[]) buf[148])[0] = rslt.getInt(76);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((byte[]) buf[150])[0] = rslt.getByte(77);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((byte[]) buf[152])[0] = rslt.getByte(78);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(79, 10);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((long[]) buf[156])[0] = rslt.getLong(80);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(82);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(83, 2);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(84, 2);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[166])[0] = rslt.getBigDecimal(85,2);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(86, 30);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(87, 1);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[172])[0] = rslt.getGXDate(88);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(89, 1);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[176])[0] = rslt.getGXDate(90);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(93, 10);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(94, 26);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(95, 10);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(96, 3);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(97, 20);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(98, 3);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(99, 40);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((short[]) buf[200])[0] = rslt.getShort(102);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(103, 40);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((String[]) buf[204])[0] = rslt.getString(104, 50);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((String[]) buf[206])[0] = rslt.getVarchar(105);
               ((boolean[]) buf[207])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(23,4);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(33);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,4);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[74])[0] = rslt.getGXDate(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(42, 4);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(45, 30);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((byte[]) buf[94])[0] = rslt.getByte(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[100])[0] = rslt.getGXDate(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((short[]) buf[102])[0] = rslt.getShort(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((byte[]) buf[112])[0] = rslt.getByte(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((long[]) buf[114])[0] = rslt.getLong(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 40);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(62, 16);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(63,5);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(64,3);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[126])[0] = rslt.getBigDecimal(65,3);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(68, 6);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[136])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[138])[0] = rslt.getBigDecimal(71,2);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((byte[]) buf[140])[0] = rslt.getByte(72);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[142])[0] = rslt.getBigDecimal(73,5);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[146])[0] = rslt.getBigDecimal(75,4);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((int[]) buf[148])[0] = rslt.getInt(76);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((byte[]) buf[150])[0] = rslt.getByte(77);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((byte[]) buf[152])[0] = rslt.getByte(78);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(79, 10);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((long[]) buf[156])[0] = rslt.getLong(80);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(82);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(83, 2);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(84, 2);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[166])[0] = rslt.getBigDecimal(85,2);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(86, 30);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(87, 1);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[172])[0] = rslt.getGXDate(88);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(89, 1);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[176])[0] = rslt.getGXDate(90);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(93, 10);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(94, 26);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(95, 10);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(96, 3);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(97, 20);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(98, 3);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(99, 40);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((short[]) buf[200])[0] = rslt.getShort(102);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(103, 40);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((String[]) buf[204])[0] = rslt.getString(104, 50);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((String[]) buf[206])[0] = rslt.getVarchar(105);
               ((boolean[]) buf[207])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(23,4);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(29,4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(33);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,4);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[74])[0] = rslt.getGXDate(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(42, 4);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(45, 30);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((byte[]) buf[94])[0] = rslt.getByte(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[100])[0] = rslt.getGXDate(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((short[]) buf[102])[0] = rslt.getShort(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((byte[]) buf[112])[0] = rslt.getByte(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((long[]) buf[114])[0] = rslt.getLong(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 40);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(62, 16);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(63,5);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(64,3);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[126])[0] = rslt.getBigDecimal(65,3);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(68, 6);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[136])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[138])[0] = rslt.getBigDecimal(71,2);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((byte[]) buf[140])[0] = rslt.getByte(72);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[142])[0] = rslt.getBigDecimal(73,5);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[146])[0] = rslt.getBigDecimal(75,4);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((int[]) buf[148])[0] = rslt.getInt(76);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((byte[]) buf[150])[0] = rslt.getByte(77);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((byte[]) buf[152])[0] = rslt.getByte(78);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(79, 10);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((long[]) buf[156])[0] = rslt.getLong(80);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(82);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(83, 2);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(84, 2);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[166])[0] = rslt.getBigDecimal(85,2);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(86, 30);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(87, 1);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[172])[0] = rslt.getGXDate(88);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(89, 1);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[176])[0] = rslt.getGXDate(90);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(93, 10);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(94, 26);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(95, 10);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(96, 3);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(97, 20);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(98, 3);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(99, 40);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((short[]) buf[200])[0] = rslt.getShort(102);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(103, 40);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((String[]) buf[204])[0] = rslt.getString(104, 50);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((String[]) buf[206])[0] = rslt.getVarchar(105);
               ((boolean[]) buf[207])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 26);
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
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 4);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
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
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 5);
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
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[56]).byteValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[64]);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DATE );
               }
               else
               {
                  stmt.setDate(34, (java.util.Date)parms[66]);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 4);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[72]).byteValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[74]).byteValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 30);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 6);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[82]).byteValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[84]).byteValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[86], 2);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DATE );
               }
               else
               {
                  stmt.setDate(46, (java.util.Date)parms[90]);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[92]).shortValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[96], 1);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[98]).shortValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[100], 1);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(52, ((Number) parms[102]).byteValue());
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(53, ((Number) parms[104]).longValue());
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(54, ((Number) parms[106]).byteValue());
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[108], 40);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[110], 16);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(57, (String)parms[112]);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[114], 5);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[116], 3);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[118], 3);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[120], 1);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(62, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[124], 6);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[126]).shortValue());
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(67, ((Number) parms[132]).byteValue());
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[134], 5);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[136], 2);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(70, (java.math.BigDecimal)parms[138], 4);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(71, ((Number) parms[140]).intValue());
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(72, ((Number) parms[142]).byteValue());
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(73, ((Number) parms[144]).byteValue());
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[146], 10);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(75, ((Number) parms[148]).longValue());
               }
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[150], 1);
               }
               if ( ((Boolean) parms[151]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(77, ((Number) parms[152]).byteValue());
               }
               if ( ((Boolean) parms[153]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[154], 2);
               }
               if ( ((Boolean) parms[155]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[156], 2);
               }
               if ( ((Boolean) parms[157]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(80, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Boolean) parms[159]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[160], 30);
               }
               if ( ((Boolean) parms[161]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[162], 1);
               }
               if ( ((Boolean) parms[163]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.DATE );
               }
               else
               {
                  stmt.setDate(83, (java.util.Date)parms[164]);
               }
               if ( ((Boolean) parms[165]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[166], 1);
               }
               if ( ((Boolean) parms[167]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.DATE );
               }
               else
               {
                  stmt.setDate(85, (java.util.Date)parms[168]);
               }
               if ( ((Boolean) parms[169]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[170], 1);
               }
               if ( ((Boolean) parms[171]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[172], 1);
               }
               if ( ((Boolean) parms[173]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[174], 10);
               }
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[176], 26);
               }
               if ( ((Boolean) parms[177]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[178], 10);
               }
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[180], 3);
               }
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[182], 20);
               }
               if ( ((Boolean) parms[183]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[184], 3);
               }
               if ( ((Boolean) parms[185]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[186], 40);
               }
               if ( ((Boolean) parms[187]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[188], 1);
               }
               if ( ((Boolean) parms[189]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[190], 1);
               }
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(97, ((Number) parms[192]).shortValue());
               }
               if ( ((Boolean) parms[193]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[194], 40);
               }
               if ( ((Boolean) parms[195]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[196], 50);
               }
               if ( ((Boolean) parms[197]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(100, (String)parms[198], 200);
               }
               if ( ((Boolean) parms[199]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(101, (String)parms[200], 6);
               }
               if ( ((Boolean) parms[201]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(102, (java.math.BigDecimal)parms[202], 2);
               }
               if ( ((Boolean) parms[203]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(103, (String)parms[204], 3);
               }
               if ( ((Boolean) parms[205]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(104, (String)parms[206], 1);
               }
               stmt.setString(105, (String)parms[207], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
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
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 5);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[55]).byteValue());
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
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[63]);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[65]);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 4);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[71]).byteValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[73]).byteValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 30);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 6);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 1);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[81]).byteValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[83]).byteValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DATE );
               }
               else
               {
                  stmt.setDate(45, (java.util.Date)parms[89]);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[95], 1);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 1);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(51, ((Number) parms[101]).byteValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(52, ((Number) parms[103]).longValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(53, ((Number) parms[105]).byteValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[107], 40);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[109], 16);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(56, (String)parms[111]);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[113], 5);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[115], 3);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[117], 3);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(61, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 6);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[125]).shortValue());
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(66, ((Number) parms[131]).byteValue());
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[133], 5);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[137], 4);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(70, ((Number) parms[139]).intValue());
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(71, ((Number) parms[141]).byteValue());
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(72, ((Number) parms[143]).byteValue());
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 10);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(74, ((Number) parms[147]).longValue());
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(76, ((Number) parms[151]).byteValue());
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[153], 2);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[155], 2);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(79, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[159], 30);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[161], 1);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.DATE );
               }
               else
               {
                  stmt.setDate(82, (java.util.Date)parms[163]);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[165], 1);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DATE );
               }
               else
               {
                  stmt.setDate(84, (java.util.Date)parms[167]);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[169], 1);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[171], 1);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[173], 10);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[175], 26);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[177], 10);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[179], 3);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[181], 20);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[183], 3);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[185], 40);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[187], 1);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(96, ((Number) parms[191]).shortValue());
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[193], 40);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[195], 50);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(99, (String)parms[197], 200);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(100, (String)parms[199], 6);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(101, (java.math.BigDecimal)parms[201], 2);
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[203], 3);
               }
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(103, (String)parms[205], 1);
               }
               stmt.setString(104, (String)parms[206], 3);
               stmt.setString(105, (String)parms[207], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

