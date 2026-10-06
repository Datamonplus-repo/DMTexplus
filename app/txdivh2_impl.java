package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txdivh2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6529XOF = (int)(GXutil.lval( httpContext.GetPar( "XOF"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         A6530XOFr = (byte)(GXutil.lval( httpContext.GetPar( "XOFr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         A6531XOFp = httpContext.GetPar( "XOFp") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A6529XOF, A6530XOFr, A6531XOFp) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIVIDIR HDRS", ""), (short)(0)) ;
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

   public txdivh2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txdivh2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txdivh2_impl.class ));
   }

   public txdivh2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXDIVH2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXOF_Internalname, GXutil.ltrim( localUtil.ntoc( A6529XOF, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXOF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6529XOF), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6529XOF), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXOF_Jsonclick, 0, "", "", "", "", "", 1, edtXOF_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXOFr_Internalname, GXutil.ltrim( localUtil.ntoc( A6530XOFr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXOFr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6530XOFr), "9") : localUtil.format( DecimalUtil.doubleToDec(A6530XOFr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXOFr_Jsonclick, 0, "", "", "", "", "", 1, edtXOFr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Particion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXOFp_Internalname, GXutil.rtrim( A6531XOFp), GXutil.rtrim( localUtil.format( A6531XOFp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXOFp_Jsonclick, 0, "", "", "", "", "", 1, edtXOFp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCtda_Internalname, GXutil.ltrim( localUtil.ntoc( A6532XCtda, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCtda_Enabled!=0) ? localUtil.format( A6532XCtda, "ZZZZZ9.99") : localUtil.format( A6532XCtda, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCtda_Jsonclick, 0, "", "", "", "", "", 1, edtXCtda_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "XUni", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXUni_Internalname, GXutil.rtrim( A6533XUni), GXutil.rtrim( localUtil.format( A6533XUni, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXUni_Jsonclick, 0, "", "", "", "", "", 1, edtXUni_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cantidad de Piezas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6534XCPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6534XCPzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6534XCPzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCPzs_Jsonclick, 0, "", "", "", "", "", 1, edtXCPzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXUltLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6535XUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXUltLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6535XUltLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6535XUltLn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXUltLn_Jsonclick, 0, "", "", "", "", "", 1, edtXUltLn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Total Cantidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXSumCtd_Internalname, GXutil.ltrim( localUtil.ntoc( A6536XSumCtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXSumCtd_Enabled!=0) ? localUtil.format( A6536XSumCtd, "ZZZZZ9.99") : localUtil.format( A6536XSumCtd, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXSumCtd_Jsonclick, 0, "", "", "", "", "", 1, edtXSumCtd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Total Cant Piezas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXSumCpz_Internalname, GXutil.ltrim( localUtil.ntoc( A6537XSumCpz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXSumCpz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6537XSumCpz), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6537XSumCpz), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXSumCpz_Jsonclick, 0, "", "", "", "", "", 1, edtXSumCpz_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dif", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXDIVH2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXDif_Internalname, GXutil.ltrim( localUtil.ntoc( A10838XDif, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXDif_Enabled!=0) ? localUtil.format( A10838XDif, "ZZZZZ9.99") : localUtil.format( A10838XDif, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXDif_Jsonclick, 0, "", "", "", "", "", 1, edtXDif_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXDIVH2.htm");
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
         nBlankRcdCount940 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_940 = (short)(1) ;
            scanStartVQ940( ) ;
            while ( RcdFound940 != 0 )
            {
               init_level_properties940( ) ;
               getByPrimaryKeyVQ940( ) ;
               addRowVQ940( ) ;
               scanNextVQ940( ) ;
            }
            scanEndVQ940( ) ;
            nBlankRcdCount940 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6537XSumCpz = A6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         B6536XSumCtd = A6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         standaloneNotModalVQ940( ) ;
         standaloneModalVQ940( ) ;
         sMode940 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRowVQ940( ) ;
            edtavnRcdDeleted_940_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_940_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_940_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_940_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXNumL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNUML_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNumL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNumL_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXNPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXQtdPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XQTDPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXQtdPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXQtdPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXPzsPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPZSPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXPzsPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPzsPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXTotQtd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTQTD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXTotQtd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotQtd_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtXTotPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTPZS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXTotPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_940 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalVQ940( ) ;
            }
            sendRowVQ940( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode940 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6537XSumCpz = B6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         A6536XSumCtd = B6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount940 = (short)(5) ;
         nRcdExists_940 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartVQ940( ) ;
            while ( RcdFound940 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75940( ) ;
               init_level_properties940( ) ;
               standaloneNotModalVQ940( ) ;
               getByPrimaryKeyVQ940( ) ;
               standaloneModalVQ940( ) ;
               addRowVQ940( ) ;
               scanNextVQ940( ) ;
            }
            scanEndVQ940( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode940 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75940( ) ;
      initAllVQ940( ) ;
      init_level_properties940( ) ;
      B6537XSumCpz = A6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      B6536XSumCtd = A6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      nRcdExists_940 = (short)(0) ;
      nIsMod_940 = (short)(0) ;
      nRcdDeleted_940 = (short)(0) ;
      nBlankRcdCount940 = (short)(nBlankRcdUsr940+nBlankRcdCount940) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount940 > 0 )
      {
         standaloneNotModalVQ940( ) ;
         standaloneModalVQ940( ) ;
         addRowVQ940( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXNumL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount940 = (short)(nBlankRcdCount940-1) ;
      }
      Gx_mode = sMode940 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6537XSumCpz = B6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      A6536XSumCtd = B6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXDIVH2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXDIVH2.htm");
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
         Z6529XOF = (int)(localUtil.ctol( httpContext.cgiGet( "Z6529XOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6530XOFr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6530XOFr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6531XOFp = httpContext.cgiGet( "Z6531XOFp") ;
         Z6532XCtda = localUtil.ctond( httpContext.cgiGet( "Z6532XCtda")) ;
         Z6533XUni = httpContext.cgiGet( "Z6533XUni") ;
         Z6534XCPzs = (short)(localUtil.ctol( httpContext.cgiGet( "Z6534XCPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6535XUltLn = (short)(localUtil.ctol( httpContext.cgiGet( "Z6535XUltLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O6537XSumCpz = (int)(localUtil.ctol( httpContext.cgiGet( "O6537XSumCpz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O6536XSumCtd = localUtil.ctond( httpContext.cgiGet( "O6536XSumCtd")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXOF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXOF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XOF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXOF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6529XOF = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         }
         else
         {
            A6529XOF = (int)(localUtil.ctol( httpContext.cgiGet( edtXOF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXOFr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXOFr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XOFR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXOFr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6530XOFr = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         }
         else
         {
            A6530XOFr = (byte)(localUtil.ctol( httpContext.cgiGet( edtXOFr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         }
         A6531XOFp = httpContext.cgiGet( edtXOFp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXCtda_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXCtda_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCTDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCtda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6532XCtda = DecimalUtil.ZERO ;
            n6532XCtda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrimstr( A6532XCtda, 9, 2));
         }
         else
         {
            A6532XCtda = localUtil.ctond( httpContext.cgiGet( edtXCtda_Internalname)) ;
            n6532XCtda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrimstr( A6532XCtda, 9, 2));
         }
         A6533XUni = GXutil.upper( httpContext.cgiGet( edtXUni_Internalname)) ;
         n6533XUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6533XUni", A6533XUni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXCPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXCPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCPZS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCPzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6534XCPzs = (short)(0) ;
            n6534XCPzs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6534XCPzs), 4, 0));
         }
         else
         {
            A6534XCPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtXCPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6534XCPzs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6534XCPzs), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXUltLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXUltLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XULTLN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXUltLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6535XUltLn = (short)(0) ;
            n6535XUltLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6535XUltLn), 4, 0));
         }
         else
         {
            A6535XUltLn = (short)(localUtil.ctol( httpContext.cgiGet( edtXUltLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6535XUltLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6535XUltLn), 4, 0));
         }
         A6536XSumCtd = localUtil.ctond( httpContext.cgiGet( edtXSumCtd_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = (int)(localUtil.ctol( httpContext.cgiGet( edtXSumCpz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         A10838XDif = localUtil.ctond( httpContext.cgiGet( edtXDif_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
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
            A6529XOF = (int)(GXutil.lval( httpContext.GetPar( "XOF"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
            A6530XOFr = (byte)(GXutil.lval( httpContext.GetPar( "XOFr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
            A6531XOFp = httpContext.GetPar( "XOFp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
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
            initAllVQ939( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_940_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_940_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributesVQ939( ) ;
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

   public void confirm_VQ0( )
   {
      beforeValidateVQ939( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsVQ939( ) ;
         }
         else
         {
            checkExtendedTableVQ939( ) ;
            if ( AnyError == 0 )
            {
               zmVQ939( 7) ;
               zmVQ939( 8) ;
            }
            closeExtendedTableCursorsVQ939( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode939 = Gx_mode ;
         confirm_VQ940( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode939 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode939 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesVQ0( ) ;
      }
   }

   public void confirm_VQ940( )
   {
      s6537XSumCpz = O6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      s6536XSumCtd = O6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      s10838XDif = O10838XDif ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowVQ940( ) ;
         if ( ( nRcdExists_940 != 0 ) || ( nIsMod_940 != 0 ) )
         {
            getKeyVQ940( ) ;
            if ( ( nRcdExists_940 == 0 ) && ( nRcdDeleted_940 == 0 ) )
            {
               if ( RcdFound940 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateVQ940( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableVQ940( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsVQ940( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6537XSumCpz = A6537XSumCpz ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
                     O6536XSumCtd = A6536XSumCtd ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
                     O10838XDif = A10838XDif ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "XNUML_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXNumL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound940 != 0 )
               {
                  if ( nRcdDeleted_940 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyVQ940( ) ;
                     loadVQ940( ) ;
                     beforeValidateVQ940( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsVQ940( ) ;
                        O6537XSumCpz = A6537XSumCpz ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
                        O6536XSumCtd = A6536XSumCtd ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
                        O10838XDif = A10838XDif ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_940 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateVQ940( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableVQ940( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsVQ940( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6537XSumCpz = A6537XSumCpz ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
                           O6536XSumCtd = A6536XSumCtd ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
                           O10838XDif = A10838XDif ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_940 == 0 )
                  {
                     GXCCtl = "XNUML_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNumL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_940_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNumL_Internalname, GXutil.ltrim( localUtil.ntoc( A6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXQtdPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPzsPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotQtd_Internalname, GXutil.ltrim( localUtil.ntoc( A6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6538XNumL_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6539XNPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6540XQtdPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6541XPzsPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6542XTotQtd_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6543XTotPzs_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6541XPzsPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6540XQtdPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_940 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_940_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_940_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNUML_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNumL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XQTDPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXQtdPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPZSPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzsPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTQTD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotQtd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTPZS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6537XSumCpz = s6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      O6536XSumCtd = s6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      O10838XDif = s10838XDif ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionVQ0( )
   {
   }

   public void zmVQ939( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6532XCtda = T00VQ5_A6532XCtda[0] ;
            Z6533XUni = T00VQ5_A6533XUni[0] ;
            Z6534XCPzs = T00VQ5_A6534XCPzs[0] ;
            Z6535XUltLn = T00VQ5_A6535XUltLn[0] ;
         }
         else
         {
            Z6532XCtda = A6532XCtda ;
            Z6533XUni = A6533XUni ;
            Z6534XCPzs = A6534XCPzs ;
            Z6535XUltLn = A6535XUltLn ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z6529XOF = A6529XOF ;
         Z6530XOFr = A6530XOFr ;
         Z6531XOFp = A6531XOFp ;
         Z6532XCtda = A6532XCtda ;
         Z6533XUni = A6533XUni ;
         Z6534XCPzs = A6534XCPzs ;
         Z6535XUltLn = A6535XUltLn ;
         Z396EmprCod = A396EmprCod ;
         Z6536XSumCtd = A6536XSumCtd ;
         Z6537XSumCpz = A6537XSumCpz ;
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

   public void loadVQ939( )
   {
      /* Using cursor T00VQ10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound939 = (short)(1) ;
         A6532XCtda = T00VQ10_A6532XCtda[0] ;
         n6532XCtda = T00VQ10_n6532XCtda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrimstr( A6532XCtda, 9, 2));
         A6533XUni = T00VQ10_A6533XUni[0] ;
         n6533XUni = T00VQ10_n6533XUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6533XUni", A6533XUni);
         A6534XCPzs = T00VQ10_A6534XCPzs[0] ;
         n6534XCPzs = T00VQ10_n6534XCPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6534XCPzs), 4, 0));
         A6535XUltLn = T00VQ10_A6535XUltLn[0] ;
         n6535XUltLn = T00VQ10_n6535XUltLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6535XUltLn), 4, 0));
         A6536XSumCtd = T00VQ10_A6536XSumCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = T00VQ10_A6537XSumCpz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         zmVQ939( -6) ;
      }
      pr_default.close(6);
      onLoadActionsVQ939( ) ;
   }

   public void onLoadActionsVQ939( )
   {
      O6537XSumCpz = A6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      O6536XSumCtd = A6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
   }

   public void checkExtendedTableVQ939( )
   {
      nIsDirty_939 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00VQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T00VQ8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A6536XSumCtd = T00VQ8_A6536XSumCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = T00VQ8_A6537XSumCpz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      else
      {
         nIsDirty_939 = (short)(1) ;
         A6536XSumCtd = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         nIsDirty_939 = (short)(1) ;
         A6537XSumCpz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      pr_default.close(5);
      nIsDirty_939 = (short)(1) ;
      A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      if ( ! ( ( GXutil.strcmp(A6533XUni, "K") == 0 ) || ( GXutil.strcmp(A6533XUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "XUni", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsVQ939( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod )
   {
      /* Using cursor T00VQ11 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_8( String A396EmprCod ,
                         int A6529XOF ,
                         byte A6530XOFr ,
                         String A6531XOFp )
   {
      /* Using cursor T00VQ13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A6536XSumCtd = T00VQ13_A6536XSumCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = T00VQ13_A6537XSumCpz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      else
      {
         A6536XSumCtd = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6536XSumCtd, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6537XSumCpz, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKeyVQ939( )
   {
      /* Using cursor T00VQ14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound939 = (short)(1) ;
      }
      else
      {
         RcdFound939 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00VQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmVQ939( 6) ;
         RcdFound939 = (short)(1) ;
         A6529XOF = T00VQ5_A6529XOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         A6530XOFr = T00VQ5_A6530XOFr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         A6531XOFp = T00VQ5_A6531XOFp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
         A6532XCtda = T00VQ5_A6532XCtda[0] ;
         n6532XCtda = T00VQ5_n6532XCtda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrimstr( A6532XCtda, 9, 2));
         A6533XUni = T00VQ5_A6533XUni[0] ;
         n6533XUni = T00VQ5_n6533XUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6533XUni", A6533XUni);
         A6534XCPzs = T00VQ5_A6534XCPzs[0] ;
         n6534XCPzs = T00VQ5_n6534XCPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6534XCPzs), 4, 0));
         A6535XUltLn = T00VQ5_A6535XUltLn[0] ;
         n6535XUltLn = T00VQ5_n6535XUltLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6535XUltLn), 4, 0));
         A396EmprCod = T00VQ5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z6529XOF = A6529XOF ;
         Z6530XOFr = A6530XOFr ;
         Z6531XOFp = A6531XOFp ;
         sMode939 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadVQ939( ) ;
         if ( AnyError == 1 )
         {
            RcdFound939 = (short)(0) ;
            initializeNonKeyVQ939( ) ;
         }
         Gx_mode = sMode939 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound939 = (short)(0) ;
         initializeNonKeyVQ939( ) ;
         sMode939 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode939 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyVQ939( ) ;
      if ( RcdFound939 == 0 )
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
      RcdFound939 = (short)(0) ;
      /* Using cursor T00VQ15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A6529XOF), Integer.valueOf(A6529XOF), A396EmprCod, Byte.valueOf(A6530XOFr), Byte.valueOf(A6530XOFr), Integer.valueOf(A6529XOF), A396EmprCod, A6531XOFp});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ15_A6529XOF[0] < A6529XOF ) || ( T00VQ15_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ15_A6530XOFr[0] < A6530XOFr ) || ( T00VQ15_A6530XOFr[0] == A6530XOFr ) && ( T00VQ15_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VQ15_A6531XOFp[0], A6531XOFp) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ15_A6529XOF[0] > A6529XOF ) || ( T00VQ15_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ15_A6530XOFr[0] > A6530XOFr ) || ( T00VQ15_A6530XOFr[0] == A6530XOFr ) && ( T00VQ15_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VQ15_A6531XOFp[0], A6531XOFp) > 0 ) ) )
         {
            A396EmprCod = T00VQ15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6529XOF = T00VQ15_A6529XOF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
            A6530XOFr = T00VQ15_A6530XOFr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
            A6531XOFp = T00VQ15_A6531XOFp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
            RcdFound939 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound939 = (short)(0) ;
      /* Using cursor T00VQ16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A6529XOF), Integer.valueOf(A6529XOF), A396EmprCod, Byte.valueOf(A6530XOFr), Byte.valueOf(A6530XOFr), Integer.valueOf(A6529XOF), A396EmprCod, A6531XOFp});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ16_A6529XOF[0] > A6529XOF ) || ( T00VQ16_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ16_A6530XOFr[0] > A6530XOFr ) || ( T00VQ16_A6530XOFr[0] == A6530XOFr ) && ( T00VQ16_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VQ16_A6531XOFp[0], A6531XOFp) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ16_A6529XOF[0] < A6529XOF ) || ( T00VQ16_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00VQ16_A6530XOFr[0] < A6530XOFr ) || ( T00VQ16_A6530XOFr[0] == A6530XOFr ) && ( T00VQ16_A6529XOF[0] == A6529XOF ) && ( GXutil.strcmp(T00VQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VQ16_A6531XOFp[0], A6531XOFp) < 0 ) ) )
         {
            A396EmprCod = T00VQ16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6529XOF = T00VQ16_A6529XOF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
            A6530XOFr = T00VQ16_A6530XOFr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
            A6531XOFp = T00VQ16_A6531XOFp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
            RcdFound939 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyVQ939( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6537XSumCpz = O6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         A6536XSumCtd = O6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A10838XDif = O10838XDif ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertVQ939( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound939 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6529XOF != Z6529XOF ) || ( A6530XOFr != Z6530XOFr ) || ( GXutil.strcmp(A6531XOFp, Z6531XOFp) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A6529XOF = Z6529XOF ;
               httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
               A6530XOFr = Z6530XOFr ;
               httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
               A6531XOFp = Z6531XOFp ;
               httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6537XSumCpz = O6537XSumCpz ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
               A6536XSumCtd = O6536XSumCtd ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
               A10838XDif = O10838XDif ;
               httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
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
               A6537XSumCpz = O6537XSumCpz ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
               A6536XSumCtd = O6536XSumCtd ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
               A10838XDif = O10838XDif ;
               httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
               updateVQ939( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6529XOF != Z6529XOF ) || ( A6530XOFr != Z6530XOFr ) || ( GXutil.strcmp(A6531XOFp, Z6531XOFp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6537XSumCpz = O6537XSumCpz ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
               A6536XSumCtd = O6536XSumCtd ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
               A10838XDif = O10838XDif ;
               httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertVQ939( ) ;
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
                  A6537XSumCpz = O6537XSumCpz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
                  A6536XSumCtd = O6536XSumCtd ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
                  A10838XDif = O10838XDif ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertVQ939( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6529XOF != Z6529XOF ) || ( A6530XOFr != Z6530XOFr ) || ( GXutil.strcmp(A6531XOFp, Z6531XOFp) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6529XOF = Z6529XOF ;
         httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         A6530XOFr = Z6530XOFr ;
         httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         A6531XOFp = Z6531XOFp ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6537XSumCpz = O6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         A6536XSumCtd = O6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A10838XDif = O10838XDif ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
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
      getKeyVQ939( ) ;
      if ( RcdFound939 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6529XOF != Z6529XOF ) || ( A6530XOFr != Z6530XOFr ) || ( GXutil.strcmp(A6531XOFp, Z6531XOFp) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6529XOF = Z6529XOF ;
            httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
            A6530XOFr = Z6530XOFr ;
            httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
            A6531XOFp = Z6531XOFp ;
            httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6529XOF != Z6529XOF ) || ( A6530XOFr != Z6530XOFr ) || ( GXutil.strcmp(A6531XOFp, Z6531XOFp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txdivh2");
      GX_FocusControl = edtXCtda_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_VQ0( ) ;
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
      if ( RcdFound939 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXCtda_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartVQ939( ) ;
      if ( RcdFound939 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCtda_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndVQ939( ) ;
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
      if ( RcdFound939 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCtda_Internalname ;
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
      if ( RcdFound939 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCtda_Internalname ;
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
      scanStartVQ939( ) ;
      if ( RcdFound939 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound939 != 0 )
         {
            scanNextVQ939( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCtda_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndVQ939( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyVQ939( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00VQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXDIVH1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z6532XCtda, T00VQ4_A6532XCtda[0]) != 0 ) || ( GXutil.strcmp(Z6533XUni, T00VQ4_A6533XUni[0]) != 0 ) || ( Z6534XCPzs != T00VQ4_A6534XCPzs[0] ) || ( Z6535XUltLn != T00VQ4_A6535XUltLn[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6532XCtda, T00VQ4_A6532XCtda[0]) != 0 )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XCtda");
               GXutil.writeLogRaw("Old: ",Z6532XCtda);
               GXutil.writeLogRaw("Current: ",T00VQ4_A6532XCtda[0]);
            }
            if ( GXutil.strcmp(Z6533XUni, T00VQ4_A6533XUni[0]) != 0 )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XUni");
               GXutil.writeLogRaw("Old: ",Z6533XUni);
               GXutil.writeLogRaw("Current: ",T00VQ4_A6533XUni[0]);
            }
            if ( Z6534XCPzs != T00VQ4_A6534XCPzs[0] )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XCPzs");
               GXutil.writeLogRaw("Old: ",Z6534XCPzs);
               GXutil.writeLogRaw("Current: ",T00VQ4_A6534XCPzs[0]);
            }
            if ( Z6535XUltLn != T00VQ4_A6535XUltLn[0] )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XUltLn");
               GXutil.writeLogRaw("Old: ",Z6535XUltLn);
               GXutil.writeLogRaw("Current: ",T00VQ4_A6535XUltLn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXDIVH1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertVQ939( )
   {
      beforeValidateVQ939( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVQ939( ) ;
      }
      if ( AnyError == 0 )
      {
         zmVQ939( 0) ;
         checkOptimisticConcurrencyVQ939( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVQ939( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertVQ939( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VQ17 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Boolean.valueOf(n6532XCtda), A6532XCtda, Boolean.valueOf(n6533XUni), A6533XUni, Boolean.valueOf(n6534XCPzs), Short.valueOf(A6534XCPzs), Boolean.valueOf(n6535XUltLn), Short.valueOf(A6535XUltLn), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH1");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevelVQ939( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionVQ0( ) ;
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
            loadVQ939( ) ;
         }
         endLevelVQ939( ) ;
      }
      closeExtendedTableCursorsVQ939( ) ;
   }

   public void updateVQ939( )
   {
      beforeValidateVQ939( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVQ939( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVQ939( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVQ939( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateVQ939( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VQ18 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n6532XCtda), A6532XCtda, Boolean.valueOf(n6533XUni), A6533XUni, Boolean.valueOf(n6534XCPzs), Short.valueOf(A6534XCPzs), Boolean.valueOf(n6535XUltLn), Short.valueOf(A6535XUltLn), A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH1");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXDIVH1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateVQ939( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelVQ939( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionVQ0( ) ;
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
         endLevelVQ939( ) ;
      }
      closeExtendedTableCursorsVQ939( ) ;
   }

   public void deferredUpdateVQ939( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateVQ939( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVQ939( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsVQ939( ) ;
         afterConfirmVQ939( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteVQ939( ) ;
            if ( AnyError == 0 )
            {
               A6537XSumCpz = O6537XSumCpz ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
               A6536XSumCtd = O6536XSumCtd ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
               A10838XDif = O10838XDif ;
               httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
               scanStartVQ940( ) ;
               while ( RcdFound940 != 0 )
               {
                  getByPrimaryKeyVQ940( ) ;
                  deleteVQ940( ) ;
                  scanNextVQ940( ) ;
                  O6537XSumCpz = A6537XSumCpz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
                  O6536XSumCtd = A6536XSumCtd ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
                  O10838XDif = A10838XDif ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
               }
               scanEndVQ940( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VQ19 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound939 == 0 )
                        {
                           initAllVQ939( ) ;
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
                        resetCaptionVQ0( ) ;
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
      sMode939 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelVQ939( ) ;
      Gx_mode = sMode939 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsVQ939( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00VQ21 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A6536XSumCtd = T00VQ21_A6536XSumCtd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            A6537XSumCpz = T00VQ21_A6537XSumCpz[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         }
         else
         {
            A6536XSumCtd = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            A6537XSumCpz = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         }
         pr_default.close(15);
         A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      }
   }

   public void processNestedLevelVQ940( )
   {
      s6537XSumCpz = O6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      s6536XSumCtd = O6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      s10838XDif = O10838XDif ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowVQ940( ) ;
         if ( ( nRcdExists_940 != 0 ) || ( nIsMod_940 != 0 ) )
         {
            standaloneNotModalVQ940( ) ;
            getKeyVQ940( ) ;
            if ( ( nRcdExists_940 == 0 ) && ( nRcdDeleted_940 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertVQ940( ) ;
            }
            else
            {
               if ( RcdFound940 != 0 )
               {
                  if ( ( nRcdDeleted_940 != 0 ) && ( nRcdExists_940 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteVQ940( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_940 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateVQ940( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_940 == 0 )
                  {
                     GXCCtl = "XNUML_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNumL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6537XSumCpz = A6537XSumCpz ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
            O6536XSumCtd = A6536XSumCtd ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            O10838XDif = A10838XDif ;
            httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_940_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNumL_Internalname, GXutil.ltrim( localUtil.ntoc( A6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXQtdPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPzsPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotQtd_Internalname, GXutil.ltrim( localUtil.ntoc( A6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6538XNumL_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6539XNPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6540XQtdPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6541XPzsPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6542XTotQtd_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6543XTotPzs_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6541XPzsPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6540XQtdPdas_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_940_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_940 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_940_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_940_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNUML_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNumL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XQTDPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXQtdPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPZSPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzsPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTQTD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotQtd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTPZS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllVQ940( ) ;
      if ( AnyError != 0 )
      {
         O6537XSumCpz = s6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         O6536XSumCtd = s6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         O10838XDif = s10838XDif ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      }
      nRcdExists_940 = (short)(0) ;
      nIsMod_940 = (short)(0) ;
      nRcdDeleted_940 = (short)(0) ;
   }

   public void processLevelVQ939( )
   {
      /* Save parent mode. */
      sMode939 = Gx_mode ;
      processNestedLevelVQ940( ) ;
      if ( AnyError != 0 )
      {
         O6537XSumCpz = s6537XSumCpz ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         O6536XSumCtd = s6536XSumCtd ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         O10838XDif = s10838XDif ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode939 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelVQ939( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteVQ939( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txdivh2");
         if ( AnyError == 0 )
         {
            confirmValuesVQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txdivh2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartVQ939( )
   {
      /* Using cursor T00VQ22 */
      pr_default.execute(16);
      RcdFound939 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound939 = (short)(1) ;
         A396EmprCod = T00VQ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6529XOF = T00VQ22_A6529XOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         A6530XOFr = T00VQ22_A6530XOFr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         A6531XOFp = T00VQ22_A6531XOFp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextVQ939( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound939 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound939 = (short)(1) ;
         A396EmprCod = T00VQ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6529XOF = T00VQ22_A6529XOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
         A6530XOFr = T00VQ22_A6530XOFr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
         A6531XOFp = T00VQ22_A6531XOFp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
      }
   }

   public void scanEndVQ939( )
   {
      pr_default.close(16);
   }

   public void afterConfirmVQ939( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertVQ939( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateVQ939( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteVQ939( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteVQ939( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateVQ939( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesVQ939( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtXOF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXOF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXOF_Enabled), 5, 0), true);
      edtXOFr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXOFr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXOFr_Enabled), 5, 0), true);
      edtXOFp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXOFp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXOFp_Enabled), 5, 0), true);
      edtXCtda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCtda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCtda_Enabled), 5, 0), true);
      edtXUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUni_Enabled), 5, 0), true);
      edtXCPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCPzs_Enabled), 5, 0), true);
      edtXUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLn_Enabled), 5, 0), true);
      edtXSumCtd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXSumCtd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXSumCtd_Enabled), 5, 0), true);
      edtXSumCpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXSumCpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXSumCpz_Enabled), 5, 0), true);
      edtXDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXDif_Enabled), 5, 0), true);
   }

   public void zmVQ940( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6539XNPdas = T00VQ3_A6539XNPdas[0] ;
            Z6540XQtdPdas = T00VQ3_A6540XQtdPdas[0] ;
            Z6541XPzsPdas = T00VQ3_A6541XPzsPdas[0] ;
            Z6542XTotQtd = T00VQ3_A6542XTotQtd[0] ;
            Z6543XTotPzs = T00VQ3_A6543XTotPzs[0] ;
         }
         else
         {
            Z6539XNPdas = A6539XNPdas ;
            Z6540XQtdPdas = A6540XQtdPdas ;
            Z6541XPzsPdas = A6541XPzsPdas ;
            Z6542XTotQtd = A6542XTotQtd ;
            Z6543XTotPzs = A6543XTotPzs ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z396EmprCod = A396EmprCod ;
         Z6529XOF = A6529XOF ;
         Z6530XOFr = A6530XOFr ;
         Z6531XOFp = A6531XOFp ;
         Z6538XNumL = A6538XNumL ;
         Z6539XNPdas = A6539XNPdas ;
         Z6540XQtdPdas = A6540XQtdPdas ;
         Z6541XPzsPdas = A6541XPzsPdas ;
         Z6542XTotQtd = A6542XTotQtd ;
         Z6543XTotPzs = A6543XTotPzs ;
      }
   }

   public void standaloneNotModalVQ940( )
   {
   }

   public void standaloneModalVQ940( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXNumL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNumL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNumL_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtXNumL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNumL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNumL_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void loadVQ940( )
   {
      /* Using cursor T00VQ23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound940 = (short)(1) ;
         A6539XNPdas = T00VQ23_A6539XNPdas[0] ;
         n6539XNPdas = T00VQ23_n6539XNPdas[0] ;
         A6540XQtdPdas = T00VQ23_A6540XQtdPdas[0] ;
         n6540XQtdPdas = T00VQ23_n6540XQtdPdas[0] ;
         A6541XPzsPdas = T00VQ23_A6541XPzsPdas[0] ;
         n6541XPzsPdas = T00VQ23_n6541XPzsPdas[0] ;
         A6542XTotQtd = T00VQ23_A6542XTotQtd[0] ;
         n6542XTotQtd = T00VQ23_n6542XTotQtd[0] ;
         A6543XTotPzs = T00VQ23_A6543XTotPzs[0] ;
         n6543XTotPzs = T00VQ23_n6543XTotPzs[0] ;
         zmVQ940( -9) ;
      }
      pr_default.close(17);
      onLoadActionsVQ940( ) ;
   }

   public void onLoadActionsVQ940( )
   {
      if ( isIns( )  )
      {
         A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas).subtract(O6540XQtdPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6536XSumCtd = O6536XSumCtd.subtract(O6540XQtdPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            }
         }
      }
      A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      if ( isIns( )  )
      {
         A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas-O6541XPzsPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6537XSumCpz = (int)(O6537XSumCpz-O6541XPzsPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
            }
         }
      }
   }

   public void checkExtendedTableVQ940( )
   {
      nIsDirty_940 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalVQ940( ) ;
      if ( isIns( )  )
      {
         nIsDirty_940 = (short)(1) ;
         A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_940 = (short)(1) ;
            A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas).subtract(O6540XQtdPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_940 = (short)(1) ;
               A6536XSumCtd = O6536XSumCtd.subtract(O6540XQtdPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            }
         }
      }
      nIsDirty_940 = (short)(1) ;
      A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_940 = (short)(1) ;
         A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_940 = (short)(1) ;
            A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas-O6541XPzsPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_940 = (short)(1) ;
               A6537XSumCpz = (int)(O6537XSumCpz-O6541XPzsPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursorsVQ940( )
   {
   }

   public void enableDisableVQ940( )
   {
   }

   public void getKeyVQ940( )
   {
      /* Using cursor T00VQ24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound940 = (short)(1) ;
      }
      else
      {
         RcdFound940 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKeyVQ940( )
   {
      /* Using cursor T00VQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmVQ940( 9) ;
         RcdFound940 = (short)(1) ;
         initializeNonKeyVQ940( ) ;
         A6538XNumL = T00VQ3_A6538XNumL[0] ;
         A6539XNPdas = T00VQ3_A6539XNPdas[0] ;
         n6539XNPdas = T00VQ3_n6539XNPdas[0] ;
         A6540XQtdPdas = T00VQ3_A6540XQtdPdas[0] ;
         n6540XQtdPdas = T00VQ3_n6540XQtdPdas[0] ;
         A6541XPzsPdas = T00VQ3_A6541XPzsPdas[0] ;
         n6541XPzsPdas = T00VQ3_n6541XPzsPdas[0] ;
         A6542XTotQtd = T00VQ3_A6542XTotQtd[0] ;
         n6542XTotQtd = T00VQ3_n6542XTotQtd[0] ;
         A6543XTotPzs = T00VQ3_A6543XTotPzs[0] ;
         n6543XTotPzs = T00VQ3_n6543XTotPzs[0] ;
         O6541XPzsPdas = A6541XPzsPdas ;
         n6541XPzsPdas = false ;
         O6540XQtdPdas = A6540XQtdPdas ;
         n6540XQtdPdas = false ;
         Z396EmprCod = A396EmprCod ;
         Z6529XOF = A6529XOF ;
         Z6530XOFr = A6530XOFr ;
         Z6531XOFp = A6531XOFp ;
         Z6538XNumL = A6538XNumL ;
         sMode940 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalVQ940( ) ;
         loadVQ940( ) ;
         Gx_mode = sMode940 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound940 = (short)(0) ;
         initializeNonKeyVQ940( ) ;
         sMode940 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalVQ940( ) ;
         Gx_mode = sMode940 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesVQ940( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyVQ940( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00VQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXDIVH2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6539XNPdas != T00VQ2_A6539XNPdas[0] ) || ( DecimalUtil.compareTo(Z6540XQtdPdas, T00VQ2_A6540XQtdPdas[0]) != 0 ) || ( Z6541XPzsPdas != T00VQ2_A6541XPzsPdas[0] ) || ( DecimalUtil.compareTo(Z6542XTotQtd, T00VQ2_A6542XTotQtd[0]) != 0 ) || ( Z6543XTotPzs != T00VQ2_A6543XTotPzs[0] ) )
         {
            if ( Z6539XNPdas != T00VQ2_A6539XNPdas[0] )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XNPdas");
               GXutil.writeLogRaw("Old: ",Z6539XNPdas);
               GXutil.writeLogRaw("Current: ",T00VQ2_A6539XNPdas[0]);
            }
            if ( DecimalUtil.compareTo(Z6540XQtdPdas, T00VQ2_A6540XQtdPdas[0]) != 0 )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XQtdPdas");
               GXutil.writeLogRaw("Old: ",Z6540XQtdPdas);
               GXutil.writeLogRaw("Current: ",T00VQ2_A6540XQtdPdas[0]);
            }
            if ( Z6541XPzsPdas != T00VQ2_A6541XPzsPdas[0] )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XPzsPdas");
               GXutil.writeLogRaw("Old: ",Z6541XPzsPdas);
               GXutil.writeLogRaw("Current: ",T00VQ2_A6541XPzsPdas[0]);
            }
            if ( DecimalUtil.compareTo(Z6542XTotQtd, T00VQ2_A6542XTotQtd[0]) != 0 )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XTotQtd");
               GXutil.writeLogRaw("Old: ",Z6542XTotQtd);
               GXutil.writeLogRaw("Current: ",T00VQ2_A6542XTotQtd[0]);
            }
            if ( Z6543XTotPzs != T00VQ2_A6543XTotPzs[0] )
            {
               GXutil.writeLogln("txdivh2:[seudo value changed for attri]"+"XTotPzs");
               GXutil.writeLogRaw("Old: ",Z6543XTotPzs);
               GXutil.writeLogRaw("Current: ",T00VQ2_A6543XTotPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXDIVH2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertVQ940( )
   {
      beforeValidateVQ940( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVQ940( ) ;
      }
      if ( AnyError == 0 )
      {
         zmVQ940( 0) ;
         checkOptimisticConcurrencyVQ940( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVQ940( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertVQ940( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VQ25 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL), Boolean.valueOf(n6539XNPdas), Short.valueOf(A6539XNPdas), Boolean.valueOf(n6540XQtdPdas), A6540XQtdPdas, Boolean.valueOf(n6541XPzsPdas), Short.valueOf(A6541XPzsPdas), Boolean.valueOf(n6542XTotQtd), A6542XTotQtd, Boolean.valueOf(n6543XTotPzs), Integer.valueOf(A6543XTotPzs)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH2");
                  if ( (pr_default.getStatus(19) == 1) )
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
            loadVQ940( ) ;
         }
         endLevelVQ940( ) ;
      }
      closeExtendedTableCursorsVQ940( ) ;
   }

   public void updateVQ940( )
   {
      beforeValidateVQ940( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVQ940( ) ;
      }
      if ( ( nIsMod_940 != 0 ) || ( nIsDirty_940 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyVQ940( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmVQ940( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateVQ940( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00VQ26 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n6539XNPdas), Short.valueOf(A6539XNPdas), Boolean.valueOf(n6540XQtdPdas), A6540XQtdPdas, Boolean.valueOf(n6541XPzsPdas), Short.valueOf(A6541XPzsPdas), Boolean.valueOf(n6542XTotQtd), A6542XTotQtd, Boolean.valueOf(n6543XTotPzs), Integer.valueOf(A6543XTotPzs), A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH2");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXDIVH2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateVQ940( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyVQ940( ) ;
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
            endLevelVQ940( ) ;
         }
      }
      closeExtendedTableCursorsVQ940( ) ;
   }

   public void deferredUpdateVQ940( )
   {
   }

   public void deleteVQ940( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateVQ940( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVQ940( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsVQ940( ) ;
         afterConfirmVQ940( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteVQ940( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00VQ27 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp, Short.valueOf(A6538XNumL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXDIVH2");
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
      sMode940 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelVQ940( ) ;
      Gx_mode = sMode940 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsVQ940( )
   {
      standaloneModalVQ940( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6536XSumCtd = O6536XSumCtd.add(A6540XQtdPdas).subtract(O6540XQtdPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6536XSumCtd = O6536XSumCtd.subtract(O6540XQtdPdas) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
               }
            }
         }
         A10838XDif = (A6532XCtda.subtract(A6536XSumCtd)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
         if ( isIns( )  )
         {
            A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6537XSumCpz = (int)(O6537XSumCpz+A6541XPzsPdas-O6541XPzsPdas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6537XSumCpz = (int)(O6537XSumCpz-O6541XPzsPdas) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
               }
            }
         }
      }
   }

   public void endLevelVQ940( )
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

   public void scanStartVQ940( )
   {
      /* Scan By routine */
      /* Using cursor T00VQ28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      RcdFound940 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound940 = (short)(1) ;
         A6538XNumL = T00VQ28_A6538XNumL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextVQ940( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound940 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound940 = (short)(1) ;
         A6538XNumL = T00VQ28_A6538XNumL[0] ;
      }
   }

   public void scanEndVQ940( )
   {
      pr_default.close(22);
   }

   public void afterConfirmVQ940( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertVQ940( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateVQ940( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteVQ940( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteVQ940( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateVQ940( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesVQ940( )
   {
      edtXNumL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNumL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNumL_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtXNPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtXQtdPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXQtdPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXQtdPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtXPzsPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPzsPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPzsPdas_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtXTotQtd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotQtd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotQtd_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtXTotPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashesVQ940( )
   {
   }

   public void send_integrity_lvl_hashesVQ939( )
   {
   }

   public void subsflControlProps_75940( )
   {
      edtavnRcdDeleted_940_Internalname = "vNRCDDELETED_940_"+sGXsfl_75_idx ;
      edtXNumL_Internalname = "XNUML_"+sGXsfl_75_idx ;
      edtXNPdas_Internalname = "XNPDAS_"+sGXsfl_75_idx ;
      edtXQtdPdas_Internalname = "XQTDPDAS_"+sGXsfl_75_idx ;
      edtXPzsPdas_Internalname = "XPZSPDAS_"+sGXsfl_75_idx ;
      edtXTotQtd_Internalname = "XTOTQTD_"+sGXsfl_75_idx ;
      edtXTotPzs_Internalname = "XTOTPZS_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75940( )
   {
      edtavnRcdDeleted_940_Internalname = "vNRCDDELETED_940_"+sGXsfl_75_fel_idx ;
      edtXNumL_Internalname = "XNUML_"+sGXsfl_75_fel_idx ;
      edtXNPdas_Internalname = "XNPDAS_"+sGXsfl_75_fel_idx ;
      edtXQtdPdas_Internalname = "XQTDPDAS_"+sGXsfl_75_fel_idx ;
      edtXPzsPdas_Internalname = "XPZSPDAS_"+sGXsfl_75_fel_idx ;
      edtXTotQtd_Internalname = "XTOTQTD_"+sGXsfl_75_fel_idx ;
      edtXTotPzs_Internalname = "XTOTPZS_"+sGXsfl_75_fel_idx ;
   }

   public void addRowVQ940( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75940( ) ;
      sendRowVQ940( ) ;
   }

   public void sendRowVQ940( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_940_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_940_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_940), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_940), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_940_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_940_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNumL_Internalname,GXutil.ltrim( localUtil.ntoc( A6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6538XNumL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNumL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXNumL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXNPdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6539XNPdas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6539XNPdas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXNPdas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXQtdPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXQtdPdas_Enabled!=0) ? localUtil.format( A6540XQtdPdas, "ZZZZZ9.99") : localUtil.format( A6540XQtdPdas, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXQtdPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXQtdPdas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXPzsPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXPzsPdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6541XPzsPdas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6541XPzsPdas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXPzsPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXPzsPdas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXTotQtd_Internalname,GXutil.ltrim( localUtil.ntoc( A6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXTotQtd_Enabled!=0) ? localUtil.format( A6542XTotQtd, "ZZZZZ9.99") : localUtil.format( A6542XTotQtd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXTotQtd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXTotQtd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_940_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXTotPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXTotPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6543XTotPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6543XTotPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXTotPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXTotPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesVQ940( ) ;
      GXCCtl = "Z6538XNumL_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6538XNumL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6539XNPdas_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6539XNPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6540XQtdPdas_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6541XPzsPdas_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6542XTotQtd_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6542XTotQtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6543XTotPzs_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6543XTotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6541XPzsPdas_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6541XPzsPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6540XQtdPdas_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6540XQtdPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_940_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_940_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_940_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_940, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_940_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_940_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNUML_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNumL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XQTDPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXQtdPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XPZSPDAS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzsPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XTOTQTD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotQtd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XTOTPZS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowVQ940( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75940( ) ;
      edtavnRcdDeleted_940_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_940_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNumL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNUML_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXQtdPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XQTDPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXPzsPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPZSPDAS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXTotQtd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTQTD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXTotPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTPZS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_940_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_940_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_940");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_940_Internalname ;
         wbErr = true ;
         nRcdDeleted_940 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_940 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_940_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXNumL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXNumL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XNUML_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXNumL_Internalname ;
         wbErr = true ;
         A6538XNumL = (short)(0) ;
      }
      else
      {
         A6538XNumL = (short)(localUtil.ctol( httpContext.cgiGet( edtXNumL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXNPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXNPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XNPDAS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXNPdas_Internalname ;
         wbErr = true ;
         A6539XNPdas = (short)(0) ;
         n6539XNPdas = false ;
      }
      else
      {
         A6539XNPdas = (short)(localUtil.ctol( httpContext.cgiGet( edtXNPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6539XNPdas = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXQtdPdas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXQtdPdas_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XQTDPDAS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXQtdPdas_Internalname ;
         wbErr = true ;
         A6540XQtdPdas = DecimalUtil.ZERO ;
         n6540XQtdPdas = false ;
      }
      else
      {
         A6540XQtdPdas = localUtil.ctond( httpContext.cgiGet( edtXQtdPdas_Internalname)) ;
         n6540XQtdPdas = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXPzsPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXPzsPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XPZSPDAS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXPzsPdas_Internalname ;
         wbErr = true ;
         A6541XPzsPdas = (short)(0) ;
         n6541XPzsPdas = false ;
      }
      else
      {
         A6541XPzsPdas = (short)(localUtil.ctol( httpContext.cgiGet( edtXPzsPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6541XPzsPdas = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXTotQtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXTotQtd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XTOTQTD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXTotQtd_Internalname ;
         wbErr = true ;
         A6542XTotQtd = DecimalUtil.ZERO ;
         n6542XTotQtd = false ;
      }
      else
      {
         A6542XTotQtd = localUtil.ctond( httpContext.cgiGet( edtXTotQtd_Internalname)) ;
         n6542XTotQtd = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXTotPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXTotPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "XTOTPZS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXTotPzs_Internalname ;
         wbErr = true ;
         A6543XTotPzs = 0 ;
         n6543XTotPzs = false ;
      }
      else
      {
         A6543XTotPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtXTotPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6543XTotPzs = false ;
      }
      GXCCtl = "Z6538XNumL_" + sGXsfl_75_idx ;
      Z6538XNumL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6539XNPdas_" + sGXsfl_75_idx ;
      Z6539XNPdas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6540XQtdPdas_" + sGXsfl_75_idx ;
      Z6540XQtdPdas = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6541XPzsPdas_" + sGXsfl_75_idx ;
      Z6541XPzsPdas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6542XTotQtd_" + sGXsfl_75_idx ;
      Z6542XTotQtd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6543XTotPzs_" + sGXsfl_75_idx ;
      Z6543XTotPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6541XPzsPdas_" + sGXsfl_75_idx ;
      O6541XPzsPdas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6540XQtdPdas_" + sGXsfl_75_idx ;
      O6540XQtdPdas = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_940_" + sGXsfl_75_idx ;
      nRcdDeleted_940 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_940_" + sGXsfl_75_idx ;
      nRcdExists_940 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_940_" + sGXsfl_75_idx ;
      nIsMod_940 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXNumL_Enabled = edtXNumL_Enabled ;
   }

   public void confirmValuesVQ0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75940( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75940( ) ;
         httpContext.changePostValue( "Z6538XNumL_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6538XNumL_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6538XNumL_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6539XNPdas_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6539XNPdas_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6539XNPdas_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6540XQtdPdas_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6540XQtdPdas_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6540XQtdPdas_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6541XPzsPdas_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6541XPzsPdas_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6541XPzsPdas_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6542XTotQtd_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6542XTotQtd_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6542XTotQtd_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6543XTotPzs_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6543XTotPzs_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6543XTotPzs_"+sGXsfl_75_idx) ;
      }
      httpContext.changePostValue( "O6541XPzsPdas", httpContext.cgiGet( "T6541XPzsPdas")) ;
      httpContext.deletePostValue( "T6541XPzsPdas") ;
      httpContext.changePostValue( "O6540XQtdPdas", httpContext.cgiGet( "T6540XQtdPdas")) ;
      httpContext.deletePostValue( "T6540XQtdPdas") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txdivh2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6529XOF", GXutil.ltrim( localUtil.ntoc( Z6529XOF, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6530XOFr", GXutil.ltrim( localUtil.ntoc( Z6530XOFr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6531XOFp", GXutil.rtrim( Z6531XOFp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6532XCtda", GXutil.ltrim( localUtil.ntoc( Z6532XCtda, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6533XUni", GXutil.rtrim( Z6533XUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6534XCPzs", GXutil.ltrim( localUtil.ntoc( Z6534XCPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6535XUltLn", GXutil.ltrim( localUtil.ntoc( Z6535XUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6537XSumCpz", GXutil.ltrim( localUtil.ntoc( O6537XSumCpz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6536XSumCtd", GXutil.ltrim( localUtil.ntoc( O6536XSumCtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.txdivh2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXDIVH2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIVIDIR HDRS", "") ;
   }

   public void initializeNonKeyVQ939( )
   {
      A10838XDif = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrimstr( A10838XDif, 9, 2));
      A6532XCtda = DecimalUtil.ZERO ;
      n6532XCtda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrimstr( A6532XCtda, 9, 2));
      A6533XUni = "" ;
      n6533XUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6533XUni", A6533XUni);
      A6534XCPzs = (short)(0) ;
      n6534XCPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6534XCPzs), 4, 0));
      A6535XUltLn = (short)(0) ;
      n6535XUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6535XUltLn), 4, 0));
      A6536XSumCtd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      A6537XSumCpz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      O6537XSumCpz = A6537XSumCpz ;
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      O6536XSumCtd = A6536XSumCtd ;
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
      Z6532XCtda = DecimalUtil.ZERO ;
      Z6533XUni = "" ;
      Z6534XCPzs = (short)(0) ;
      Z6535XUltLn = (short)(0) ;
   }

   public void initAllVQ939( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6529XOF = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6529XOF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6529XOF), 8, 0));
      A6530XOFr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6530XOFr", GXutil.str( A6530XOFr, 1, 0));
      A6531XOFp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6531XOFp", A6531XOFp);
      initializeNonKeyVQ939( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyVQ940( )
   {
      A6539XNPdas = (short)(0) ;
      n6539XNPdas = false ;
      A6540XQtdPdas = DecimalUtil.ZERO ;
      n6540XQtdPdas = false ;
      A6541XPzsPdas = (short)(0) ;
      n6541XPzsPdas = false ;
      A6542XTotQtd = DecimalUtil.ZERO ;
      n6542XTotQtd = false ;
      A6543XTotPzs = 0 ;
      n6543XTotPzs = false ;
      O6541XPzsPdas = A6541XPzsPdas ;
      n6541XPzsPdas = false ;
      O6540XQtdPdas = A6540XQtdPdas ;
      n6540XQtdPdas = false ;
      Z6539XNPdas = (short)(0) ;
      Z6540XQtdPdas = DecimalUtil.ZERO ;
      Z6541XPzsPdas = (short)(0) ;
      Z6542XTotQtd = DecimalUtil.ZERO ;
      Z6543XTotPzs = 0 ;
   }

   public void initAllVQ940( )
   {
      A6538XNumL = (short)(0) ;
      initializeNonKeyVQ940( ) ;
   }

   public void standaloneModalInsertVQ940( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531699", true, true);
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
      httpContext.AddJavascriptSource("txdivh2.js", "?2026824153170", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties940( )
   {
      edtXNumL_Enabled = defedtXNumL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNumL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNumL_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_940, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_940_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6538XNumL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNumL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6539XNPdas, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6540XQtdPdas, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXQtdPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6541XPzsPdas, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzsPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6542XTotQtd, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotQtd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6543XTotPzs, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtXOF_Internalname = "XOF" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXOFr_Internalname = "XOFR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXOFp_Internalname = "XOFP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXCtda_Internalname = "XCTDA" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXUni_Internalname = "XUNI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXCPzs_Internalname = "XCPZS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXUltLn_Internalname = "XULTLN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXSumCtd_Internalname = "XSUMCTD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXSumCpz_Internalname = "XSUMCPZ" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXDif_Internalname = "XDIF" ;
      edtavnRcdDeleted_940_Internalname = "vNRCDDELETED_940" ;
      edtXNumL_Internalname = "XNUML" ;
      edtXNPdas_Internalname = "XNPDAS" ;
      edtXQtdPdas_Internalname = "XQTDPDAS" ;
      edtXPzsPdas_Internalname = "XPZSPDAS" ;
      edtXTotQtd_Internalname = "XTOTQTD" ;
      edtXTotPzs_Internalname = "XTOTPZS" ;
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
      Form.setCaption( httpContext.getMessage( "DIVIDIR HDRS", "") );
      edtXTotPzs_Jsonclick = "" ;
      edtXTotQtd_Jsonclick = "" ;
      edtXPzsPdas_Jsonclick = "" ;
      edtXQtdPdas_Jsonclick = "" ;
      edtXNPdas_Jsonclick = "" ;
      edtXNumL_Jsonclick = "" ;
      edtavnRcdDeleted_940_Jsonclick = "" ;
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
      edtXTotPzs_Enabled = 1 ;
      edtXTotQtd_Enabled = 1 ;
      edtXPzsPdas_Enabled = 1 ;
      edtXQtdPdas_Enabled = 1 ;
      edtXNPdas_Enabled = 1 ;
      edtXNumL_Enabled = 1 ;
      edtavnRcdDeleted_940_Enabled = 1 ;
      edtXDif_Jsonclick = "" ;
      edtXDif_Backcolor = (int)(0xFFFFFF) ;
      edtXDif_Enabled = 0 ;
      edtXSumCpz_Jsonclick = "" ;
      edtXSumCpz_Backcolor = (int)(0xFFFFFF) ;
      edtXSumCpz_Enabled = 0 ;
      edtXSumCtd_Jsonclick = "" ;
      edtXSumCtd_Backcolor = (int)(0xFFFFFF) ;
      edtXSumCtd_Enabled = 0 ;
      edtXUltLn_Jsonclick = "" ;
      edtXUltLn_Backcolor = (int)(0xFFFFFF) ;
      edtXUltLn_Enabled = 1 ;
      edtXCPzs_Jsonclick = "" ;
      edtXCPzs_Backcolor = (int)(0xFFFFFF) ;
      edtXCPzs_Enabled = 1 ;
      edtXUni_Jsonclick = "" ;
      edtXUni_Backcolor = (int)(0xFFFFFF) ;
      edtXUni_Enabled = 1 ;
      edtXCtda_Jsonclick = "" ;
      edtXCtda_Backcolor = (int)(0xFFFFFF) ;
      edtXCtda_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXOFp_Jsonclick = "" ;
      edtXOFp_Backcolor = (int)(0xFFFFFF) ;
      edtXOFp_Enabled = 1 ;
      edtXOFr_Jsonclick = "" ;
      edtXOFr_Backcolor = (int)(0xFFFFFF) ;
      edtXOFr_Enabled = 1 ;
      edtXOF_Jsonclick = "" ;
      edtXOF_Backcolor = (int)(0xFFFFFF) ;
      edtXOF_Enabled = 1 ;
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
      subsflControlProps_75940( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalVQ940( ) ;
         standaloneModalVQ940( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowVQ940( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75940( ) ;
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
      /* Using cursor T00VQ29 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(23);
      /* Using cursor T00VQ21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A6536XSumCtd = T00VQ21_A6536XSumCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = T00VQ21_A6537XSumCpz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      else
      {
         A6536XSumCtd = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrimstr( A6536XSumCtd, 9, 2));
         A6537XSumCpz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6537XSumCpz), 6, 0));
      }
      pr_default.close(15);
      GX_FocusControl = edtXCtda_Internalname ;
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
      /* Using cursor T00VQ29 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Xofp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00VQ21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6529XOF), Byte.valueOf(A6530XOFr), A6531XOFp});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A6536XSumCtd = T00VQ21_A6536XSumCtd[0] ;
         A6537XSumCpz = T00VQ21_A6537XSumCpz[0] ;
      }
      else
      {
         A6536XSumCtd = DecimalUtil.doubleToDec(0) ;
         A6537XSumCpz = 0 ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6532XCtda", GXutil.ltrim( localUtil.ntoc( A6532XCtda, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6533XUni", GXutil.rtrim( A6533XUni));
      httpContext.ajax_rsp_assign_attri("", false, "A6534XCPzs", GXutil.ltrim( localUtil.ntoc( A6534XCPzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6535XUltLn", GXutil.ltrim( localUtil.ntoc( A6535XUltLn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6536XSumCtd", GXutil.ltrim( localUtil.ntoc( A6536XSumCtd, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6537XSumCpz", GXutil.ltrim( localUtil.ntoc( A6537XSumCpz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10838XDif", GXutil.ltrim( localUtil.ntoc( A10838XDif, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6529XOF", GXutil.ltrim( localUtil.ntoc( Z6529XOF, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6530XOFr", GXutil.ltrim( localUtil.ntoc( Z6530XOFr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6531XOFp", GXutil.rtrim( Z6531XOFp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6532XCtda", GXutil.ltrim( localUtil.ntoc( Z6532XCtda, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6533XUni", GXutil.rtrim( Z6533XUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6534XCPzs", GXutil.ltrim( localUtil.ntoc( Z6534XCPzs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6535XUltLn", GXutil.ltrim( localUtil.ntoc( Z6535XUltLn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6536XSumCtd", GXutil.ltrim( localUtil.ntoc( Z6536XSumCtd, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6537XSumCpz", GXutil.ltrim( localUtil.ntoc( Z6537XSumCpz, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10838XDif", GXutil.ltrim( localUtil.ntoc( Z10838XDif, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6537XSumCpz", GXutil.ltrim( localUtil.ntoc( O6537XSumCpz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6536XSumCtd", GXutil.ltrim( localUtil.ntoc( O6536XSumCtd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_XOF","{handler:'valid_Xof',iparms:[]");
      setEventMetadata("VALID_XOF",",oparms:[]}");
      setEventMetadata("VALID_XOFR","{handler:'valid_Xofr',iparms:[]");
      setEventMetadata("VALID_XOFR",",oparms:[]}");
      setEventMetadata("VALID_XOFP","{handler:'valid_Xofp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6529XOF',fld:'XOF',pic:'ZZZZZZZ9'},{av:'A6530XOFr',fld:'XOFR',pic:'9'},{av:'A6531XOFp',fld:'XOFP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XOFP",",oparms:[{av:'A6532XCtda',fld:'XCTDA',pic:'ZZZZZ9.99'},{av:'A6533XUni',fld:'XUNI',pic:'@!'},{av:'A6534XCPzs',fld:'XCPZS',pic:'ZZZ9'},{av:'A6535XUltLn',fld:'XULTLN',pic:'ZZZ9'},{av:'A6536XSumCtd',fld:'XSUMCTD',pic:'ZZZZZ9.99'},{av:'A6537XSumCpz',fld:'XSUMCPZ',pic:'ZZZZZ9'},{av:'A10838XDif',fld:'XDIF',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6529XOF'},{av:'Z6530XOFr'},{av:'Z6531XOFp'},{av:'Z6532XCtda'},{av:'Z6533XUni'},{av:'Z6534XCPzs'},{av:'Z6535XUltLn'},{av:'Z6536XSumCtd'},{av:'Z6537XSumCpz'},{av:'Z10838XDif'},{av:'O6537XSumCpz'},{av:'O6536XSumCtd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XCTDA","{handler:'valid_Xctda',iparms:[]");
      setEventMetadata("VALID_XCTDA",",oparms:[]}");
      setEventMetadata("VALID_XUNI","{handler:'valid_Xuni',iparms:[]");
      setEventMetadata("VALID_XUNI",",oparms:[]}");
      setEventMetadata("VALID_XSUMCTD","{handler:'valid_Xsumctd',iparms:[]");
      setEventMetadata("VALID_XSUMCTD",",oparms:[]}");
      setEventMetadata("VALID_XNUML","{handler:'valid_Xnuml',iparms:[]");
      setEventMetadata("VALID_XNUML",",oparms:[]}");
      setEventMetadata("VALID_XQTDPDAS","{handler:'valid_Xqtdpdas',iparms:[]");
      setEventMetadata("VALID_XQTDPDAS",",oparms:[]}");
      setEventMetadata("VALID_XPZSPDAS","{handler:'valid_Xpzspdas',iparms:[]");
      setEventMetadata("VALID_XPZSPDAS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xtotpzs',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6531XOFp = "" ;
      Z6532XCtda = DecimalUtil.ZERO ;
      Z6533XUni = "" ;
      O6536XSumCtd = DecimalUtil.ZERO ;
      Z6540XQtdPdas = DecimalUtil.ZERO ;
      Z6542XTotQtd = DecimalUtil.ZERO ;
      O6540XQtdPdas = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6531XOFp = "" ;
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
      A6532XCtda = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A6533XUni = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6536XSumCtd = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10838XDif = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B6536XSumCtd = DecimalUtil.ZERO ;
      sMode940 = "" ;
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
      sMode939 = "" ;
      s6536XSumCtd = DecimalUtil.ZERO ;
      s10838XDif = DecimalUtil.ZERO ;
      O10838XDif = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A6540XQtdPdas = DecimalUtil.ZERO ;
      A6542XTotQtd = DecimalUtil.ZERO ;
      T6540XQtdPdas = DecimalUtil.ZERO ;
      Z6536XSumCtd = DecimalUtil.ZERO ;
      T00VQ10_A6529XOF = new int[1] ;
      T00VQ10_A6530XOFr = new byte[1] ;
      T00VQ10_A6531XOFp = new String[] {""} ;
      T00VQ10_A6532XCtda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ10_n6532XCtda = new boolean[] {false} ;
      T00VQ10_A6533XUni = new String[] {""} ;
      T00VQ10_n6533XUni = new boolean[] {false} ;
      T00VQ10_A6534XCPzs = new short[1] ;
      T00VQ10_n6534XCPzs = new boolean[] {false} ;
      T00VQ10_A6535XUltLn = new short[1] ;
      T00VQ10_n6535XUltLn = new boolean[] {false} ;
      T00VQ10_A396EmprCod = new String[] {""} ;
      T00VQ10_A6536XSumCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ10_A6537XSumCpz = new int[1] ;
      T00VQ6_A396EmprCod = new String[] {""} ;
      T00VQ8_A6536XSumCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ8_A6537XSumCpz = new int[1] ;
      T00VQ11_A396EmprCod = new String[] {""} ;
      T00VQ13_A6536XSumCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ13_A6537XSumCpz = new int[1] ;
      T00VQ14_A396EmprCod = new String[] {""} ;
      T00VQ14_A6529XOF = new int[1] ;
      T00VQ14_A6530XOFr = new byte[1] ;
      T00VQ14_A6531XOFp = new String[] {""} ;
      T00VQ5_A6529XOF = new int[1] ;
      T00VQ5_A6530XOFr = new byte[1] ;
      T00VQ5_A6531XOFp = new String[] {""} ;
      T00VQ5_A6532XCtda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ5_n6532XCtda = new boolean[] {false} ;
      T00VQ5_A6533XUni = new String[] {""} ;
      T00VQ5_n6533XUni = new boolean[] {false} ;
      T00VQ5_A6534XCPzs = new short[1] ;
      T00VQ5_n6534XCPzs = new boolean[] {false} ;
      T00VQ5_A6535XUltLn = new short[1] ;
      T00VQ5_n6535XUltLn = new boolean[] {false} ;
      T00VQ5_A396EmprCod = new String[] {""} ;
      T00VQ15_A396EmprCod = new String[] {""} ;
      T00VQ15_A6529XOF = new int[1] ;
      T00VQ15_A6530XOFr = new byte[1] ;
      T00VQ15_A6531XOFp = new String[] {""} ;
      T00VQ16_A396EmprCod = new String[] {""} ;
      T00VQ16_A6529XOF = new int[1] ;
      T00VQ16_A6530XOFr = new byte[1] ;
      T00VQ16_A6531XOFp = new String[] {""} ;
      T00VQ4_A6529XOF = new int[1] ;
      T00VQ4_A6530XOFr = new byte[1] ;
      T00VQ4_A6531XOFp = new String[] {""} ;
      T00VQ4_A6532XCtda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ4_n6532XCtda = new boolean[] {false} ;
      T00VQ4_A6533XUni = new String[] {""} ;
      T00VQ4_n6533XUni = new boolean[] {false} ;
      T00VQ4_A6534XCPzs = new short[1] ;
      T00VQ4_n6534XCPzs = new boolean[] {false} ;
      T00VQ4_A6535XUltLn = new short[1] ;
      T00VQ4_n6535XUltLn = new boolean[] {false} ;
      T00VQ4_A396EmprCod = new String[] {""} ;
      T00VQ21_A6536XSumCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ21_A6537XSumCpz = new int[1] ;
      T00VQ22_A396EmprCod = new String[] {""} ;
      T00VQ22_A6529XOF = new int[1] ;
      T00VQ22_A6530XOFr = new byte[1] ;
      T00VQ22_A6531XOFp = new String[] {""} ;
      T00VQ23_A396EmprCod = new String[] {""} ;
      T00VQ23_A6529XOF = new int[1] ;
      T00VQ23_A6530XOFr = new byte[1] ;
      T00VQ23_A6531XOFp = new String[] {""} ;
      T00VQ23_A6538XNumL = new short[1] ;
      T00VQ23_A6539XNPdas = new short[1] ;
      T00VQ23_n6539XNPdas = new boolean[] {false} ;
      T00VQ23_A6540XQtdPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ23_n6540XQtdPdas = new boolean[] {false} ;
      T00VQ23_A6541XPzsPdas = new short[1] ;
      T00VQ23_n6541XPzsPdas = new boolean[] {false} ;
      T00VQ23_A6542XTotQtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ23_n6542XTotQtd = new boolean[] {false} ;
      T00VQ23_A6543XTotPzs = new int[1] ;
      T00VQ23_n6543XTotPzs = new boolean[] {false} ;
      T00VQ24_A396EmprCod = new String[] {""} ;
      T00VQ24_A6529XOF = new int[1] ;
      T00VQ24_A6530XOFr = new byte[1] ;
      T00VQ24_A6531XOFp = new String[] {""} ;
      T00VQ24_A6538XNumL = new short[1] ;
      T00VQ3_A396EmprCod = new String[] {""} ;
      T00VQ3_A6529XOF = new int[1] ;
      T00VQ3_A6530XOFr = new byte[1] ;
      T00VQ3_A6531XOFp = new String[] {""} ;
      T00VQ3_A6538XNumL = new short[1] ;
      T00VQ3_A6539XNPdas = new short[1] ;
      T00VQ3_n6539XNPdas = new boolean[] {false} ;
      T00VQ3_A6540XQtdPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ3_n6540XQtdPdas = new boolean[] {false} ;
      T00VQ3_A6541XPzsPdas = new short[1] ;
      T00VQ3_n6541XPzsPdas = new boolean[] {false} ;
      T00VQ3_A6542XTotQtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ3_n6542XTotQtd = new boolean[] {false} ;
      T00VQ3_A6543XTotPzs = new int[1] ;
      T00VQ3_n6543XTotPzs = new boolean[] {false} ;
      T00VQ2_A396EmprCod = new String[] {""} ;
      T00VQ2_A6529XOF = new int[1] ;
      T00VQ2_A6530XOFr = new byte[1] ;
      T00VQ2_A6531XOFp = new String[] {""} ;
      T00VQ2_A6538XNumL = new short[1] ;
      T00VQ2_A6539XNPdas = new short[1] ;
      T00VQ2_n6539XNPdas = new boolean[] {false} ;
      T00VQ2_A6540XQtdPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ2_n6540XQtdPdas = new boolean[] {false} ;
      T00VQ2_A6541XPzsPdas = new short[1] ;
      T00VQ2_n6541XPzsPdas = new boolean[] {false} ;
      T00VQ2_A6542XTotQtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00VQ2_n6542XTotQtd = new boolean[] {false} ;
      T00VQ2_A6543XTotPzs = new int[1] ;
      T00VQ2_n6543XTotPzs = new boolean[] {false} ;
      T00VQ28_A396EmprCod = new String[] {""} ;
      T00VQ28_A6529XOF = new int[1] ;
      T00VQ28_A6530XOFr = new byte[1] ;
      T00VQ28_A6531XOFp = new String[] {""} ;
      T00VQ28_A6538XNumL = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00VQ29_A396EmprCod = new String[] {""} ;
      Z10838XDif = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ6531XOFp = "" ;
      ZZ6532XCtda = DecimalUtil.ZERO ;
      ZZ6533XUni = "" ;
      ZZ6536XSumCtd = DecimalUtil.ZERO ;
      ZZ10838XDif = DecimalUtil.ZERO ;
      ZO6536XSumCtd = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.txdivh2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txdivh2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txdivh2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txdivh2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txdivh2__default(),
         new Object[] {
             new Object[] {
            T00VQ2_A396EmprCod, T00VQ2_A6529XOF, T00VQ2_A6530XOFr, T00VQ2_A6531XOFp, T00VQ2_A6538XNumL, T00VQ2_A6539XNPdas, T00VQ2_n6539XNPdas, T00VQ2_A6540XQtdPdas, T00VQ2_n6540XQtdPdas, T00VQ2_A6541XPzsPdas,
            T00VQ2_n6541XPzsPdas, T00VQ2_A6542XTotQtd, T00VQ2_n6542XTotQtd, T00VQ2_A6543XTotPzs, T00VQ2_n6543XTotPzs
            }
            , new Object[] {
            T00VQ3_A396EmprCod, T00VQ3_A6529XOF, T00VQ3_A6530XOFr, T00VQ3_A6531XOFp, T00VQ3_A6538XNumL, T00VQ3_A6539XNPdas, T00VQ3_n6539XNPdas, T00VQ3_A6540XQtdPdas, T00VQ3_n6540XQtdPdas, T00VQ3_A6541XPzsPdas,
            T00VQ3_n6541XPzsPdas, T00VQ3_A6542XTotQtd, T00VQ3_n6542XTotQtd, T00VQ3_A6543XTotPzs, T00VQ3_n6543XTotPzs
            }
            , new Object[] {
            T00VQ4_A6529XOF, T00VQ4_A6530XOFr, T00VQ4_A6531XOFp, T00VQ4_A6532XCtda, T00VQ4_n6532XCtda, T00VQ4_A6533XUni, T00VQ4_n6533XUni, T00VQ4_A6534XCPzs, T00VQ4_n6534XCPzs, T00VQ4_A6535XUltLn,
            T00VQ4_n6535XUltLn, T00VQ4_A396EmprCod
            }
            , new Object[] {
            T00VQ5_A6529XOF, T00VQ5_A6530XOFr, T00VQ5_A6531XOFp, T00VQ5_A6532XCtda, T00VQ5_n6532XCtda, T00VQ5_A6533XUni, T00VQ5_n6533XUni, T00VQ5_A6534XCPzs, T00VQ5_n6534XCPzs, T00VQ5_A6535XUltLn,
            T00VQ5_n6535XUltLn, T00VQ5_A396EmprCod
            }
            , new Object[] {
            T00VQ6_A396EmprCod
            }
            , new Object[] {
            T00VQ8_A6536XSumCtd, T00VQ8_A6537XSumCpz
            }
            , new Object[] {
            T00VQ10_A6529XOF, T00VQ10_A6530XOFr, T00VQ10_A6531XOFp, T00VQ10_A6532XCtda, T00VQ10_n6532XCtda, T00VQ10_A6533XUni, T00VQ10_n6533XUni, T00VQ10_A6534XCPzs, T00VQ10_n6534XCPzs, T00VQ10_A6535XUltLn,
            T00VQ10_n6535XUltLn, T00VQ10_A396EmprCod, T00VQ10_A6536XSumCtd, T00VQ10_A6537XSumCpz
            }
            , new Object[] {
            T00VQ11_A396EmprCod
            }
            , new Object[] {
            T00VQ13_A6536XSumCtd, T00VQ13_A6537XSumCpz
            }
            , new Object[] {
            T00VQ14_A396EmprCod, T00VQ14_A6529XOF, T00VQ14_A6530XOFr, T00VQ14_A6531XOFp
            }
            , new Object[] {
            T00VQ15_A396EmprCod, T00VQ15_A6529XOF, T00VQ15_A6530XOFr, T00VQ15_A6531XOFp
            }
            , new Object[] {
            T00VQ16_A396EmprCod, T00VQ16_A6529XOF, T00VQ16_A6530XOFr, T00VQ16_A6531XOFp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00VQ21_A6536XSumCtd, T00VQ21_A6537XSumCpz
            }
            , new Object[] {
            T00VQ22_A396EmprCod, T00VQ22_A6529XOF, T00VQ22_A6530XOFr, T00VQ22_A6531XOFp
            }
            , new Object[] {
            T00VQ23_A396EmprCod, T00VQ23_A6529XOF, T00VQ23_A6530XOFr, T00VQ23_A6531XOFp, T00VQ23_A6538XNumL, T00VQ23_A6539XNPdas, T00VQ23_n6539XNPdas, T00VQ23_A6540XQtdPdas, T00VQ23_n6540XQtdPdas, T00VQ23_A6541XPzsPdas,
            T00VQ23_n6541XPzsPdas, T00VQ23_A6542XTotQtd, T00VQ23_n6542XTotQtd, T00VQ23_A6543XTotPzs, T00VQ23_n6543XTotPzs
            }
            , new Object[] {
            T00VQ24_A396EmprCod, T00VQ24_A6529XOF, T00VQ24_A6530XOFr, T00VQ24_A6531XOFp, T00VQ24_A6538XNumL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00VQ28_A396EmprCod, T00VQ28_A6529XOF, T00VQ28_A6530XOFr, T00VQ28_A6531XOFp, T00VQ28_A6538XNumL
            }
            , new Object[] {
            T00VQ29_A396EmprCod
            }
         }
      );
   }

   private byte Z6530XOFr ;
   private byte GxWebError ;
   private byte A6530XOFr ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ6530XOFr ;
   private short Z6534XCPzs ;
   private short Z6535XUltLn ;
   private short Z6538XNumL ;
   private short Z6539XNPdas ;
   private short Z6541XPzsPdas ;
   private short O6541XPzsPdas ;
   private short nRcdDeleted_940 ;
   private short nRcdExists_940 ;
   private short nIsMod_940 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6534XCPzs ;
   private short A6535XUltLn ;
   private short nBlankRcdCount940 ;
   private short RcdFound940 ;
   private short nBlankRcdUsr940 ;
   private short A6538XNumL ;
   private short A6539XNPdas ;
   private short A6541XPzsPdas ;
   private short T6541XPzsPdas ;
   private short RcdFound939 ;
   private short nIsDirty_939 ;
   private short nIsDirty_940 ;
   private short ZZ6534XCPzs ;
   private short ZZ6535XUltLn ;
   private int Z6529XOF ;
   private int O6537XSumCpz ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z6543XTotPzs ;
   private int A6529XOF ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtXOF_Enabled ;
   private int edtXOFr_Enabled ;
   private int edtXOFp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXCtda_Enabled ;
   private int edtXUni_Enabled ;
   private int edtXCPzs_Enabled ;
   private int edtXUltLn_Enabled ;
   private int edtXSumCtd_Enabled ;
   private int A6537XSumCpz ;
   private int edtXSumCpz_Enabled ;
   private int edtXDif_Enabled ;
   private int B6537XSumCpz ;
   private int edtavnRcdDeleted_940_Enabled ;
   private int edtXNumL_Enabled ;
   private int edtXNPdas_Enabled ;
   private int edtXQtdPdas_Enabled ;
   private int edtXPzsPdas_Enabled ;
   private int edtXTotQtd_Enabled ;
   private int edtXTotPzs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s6537XSumCpz ;
   private int A6543XTotPzs ;
   private int GX_JID ;
   private int Z6537XSumCpz ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtXNumL_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtXDif_Backcolor ;
   private int edtXSumCpz_Backcolor ;
   private int edtXSumCtd_Backcolor ;
   private int edtXUltLn_Backcolor ;
   private int edtXCPzs_Backcolor ;
   private int edtXUni_Backcolor ;
   private int edtXCtda_Backcolor ;
   private int edtXOFp_Backcolor ;
   private int edtXOFr_Backcolor ;
   private int edtXOF_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ6529XOF ;
   private int ZZ6537XSumCpz ;
   private int ZO6537XSumCpz ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6532XCtda ;
   private java.math.BigDecimal O6536XSumCtd ;
   private java.math.BigDecimal Z6540XQtdPdas ;
   private java.math.BigDecimal Z6542XTotQtd ;
   private java.math.BigDecimal O6540XQtdPdas ;
   private java.math.BigDecimal A6532XCtda ;
   private java.math.BigDecimal A6536XSumCtd ;
   private java.math.BigDecimal A10838XDif ;
   private java.math.BigDecimal B6536XSumCtd ;
   private java.math.BigDecimal s6536XSumCtd ;
   private java.math.BigDecimal s10838XDif ;
   private java.math.BigDecimal O10838XDif ;
   private java.math.BigDecimal A6540XQtdPdas ;
   private java.math.BigDecimal A6542XTotQtd ;
   private java.math.BigDecimal T6540XQtdPdas ;
   private java.math.BigDecimal Z6536XSumCtd ;
   private java.math.BigDecimal Z10838XDif ;
   private java.math.BigDecimal ZZ6532XCtda ;
   private java.math.BigDecimal ZZ6536XSumCtd ;
   private java.math.BigDecimal ZZ10838XDif ;
   private java.math.BigDecimal ZO6536XSumCtd ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6531XOFp ;
   private String Z6533XUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6531XOFp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtXOF_Internalname ;
   private String edtXOF_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXOFr_Internalname ;
   private String edtXOFr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXOFp_Internalname ;
   private String edtXOFp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXCtda_Internalname ;
   private String edtXCtda_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXUni_Internalname ;
   private String A6533XUni ;
   private String edtXUni_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXCPzs_Internalname ;
   private String edtXCPzs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXUltLn_Internalname ;
   private String edtXUltLn_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXSumCtd_Internalname ;
   private String edtXSumCtd_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXSumCpz_Internalname ;
   private String edtXSumCpz_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXDif_Internalname ;
   private String edtXDif_Jsonclick ;
   private String sMode940 ;
   private String edtavnRcdDeleted_940_Internalname ;
   private String edtXNumL_Internalname ;
   private String edtXNPdas_Internalname ;
   private String edtXQtdPdas_Internalname ;
   private String edtXPzsPdas_Internalname ;
   private String edtXTotQtd_Internalname ;
   private String edtXTotPzs_Internalname ;
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
   private String sMode939 ;
   private String GXCCtl ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_940_Jsonclick ;
   private String edtXNumL_Jsonclick ;
   private String edtXNPdas_Jsonclick ;
   private String edtXQtdPdas_Jsonclick ;
   private String edtXPzsPdas_Jsonclick ;
   private String edtXTotQtd_Jsonclick ;
   private String edtXTotPzs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6531XOFp ;
   private String ZZ6533XUni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n6532XCtda ;
   private boolean n6533XUni ;
   private boolean n6534XCPzs ;
   private boolean n6535XUltLn ;
   private boolean n6539XNPdas ;
   private boolean n6540XQtdPdas ;
   private boolean n6541XPzsPdas ;
   private boolean n6542XTotQtd ;
   private boolean n6543XTotPzs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T00VQ10_A6529XOF ;
   private byte[] T00VQ10_A6530XOFr ;
   private String[] T00VQ10_A6531XOFp ;
   private java.math.BigDecimal[] T00VQ10_A6532XCtda ;
   private boolean[] T00VQ10_n6532XCtda ;
   private String[] T00VQ10_A6533XUni ;
   private boolean[] T00VQ10_n6533XUni ;
   private short[] T00VQ10_A6534XCPzs ;
   private boolean[] T00VQ10_n6534XCPzs ;
   private short[] T00VQ10_A6535XUltLn ;
   private boolean[] T00VQ10_n6535XUltLn ;
   private String[] T00VQ10_A396EmprCod ;
   private java.math.BigDecimal[] T00VQ10_A6536XSumCtd ;
   private int[] T00VQ10_A6537XSumCpz ;
   private String[] T00VQ6_A396EmprCod ;
   private java.math.BigDecimal[] T00VQ8_A6536XSumCtd ;
   private int[] T00VQ8_A6537XSumCpz ;
   private String[] T00VQ11_A396EmprCod ;
   private java.math.BigDecimal[] T00VQ13_A6536XSumCtd ;
   private int[] T00VQ13_A6537XSumCpz ;
   private String[] T00VQ14_A396EmprCod ;
   private int[] T00VQ14_A6529XOF ;
   private byte[] T00VQ14_A6530XOFr ;
   private String[] T00VQ14_A6531XOFp ;
   private int[] T00VQ5_A6529XOF ;
   private byte[] T00VQ5_A6530XOFr ;
   private String[] T00VQ5_A6531XOFp ;
   private java.math.BigDecimal[] T00VQ5_A6532XCtda ;
   private boolean[] T00VQ5_n6532XCtda ;
   private String[] T00VQ5_A6533XUni ;
   private boolean[] T00VQ5_n6533XUni ;
   private short[] T00VQ5_A6534XCPzs ;
   private boolean[] T00VQ5_n6534XCPzs ;
   private short[] T00VQ5_A6535XUltLn ;
   private boolean[] T00VQ5_n6535XUltLn ;
   private String[] T00VQ5_A396EmprCod ;
   private String[] T00VQ15_A396EmprCod ;
   private int[] T00VQ15_A6529XOF ;
   private byte[] T00VQ15_A6530XOFr ;
   private String[] T00VQ15_A6531XOFp ;
   private String[] T00VQ16_A396EmprCod ;
   private int[] T00VQ16_A6529XOF ;
   private byte[] T00VQ16_A6530XOFr ;
   private String[] T00VQ16_A6531XOFp ;
   private int[] T00VQ4_A6529XOF ;
   private byte[] T00VQ4_A6530XOFr ;
   private String[] T00VQ4_A6531XOFp ;
   private java.math.BigDecimal[] T00VQ4_A6532XCtda ;
   private boolean[] T00VQ4_n6532XCtda ;
   private String[] T00VQ4_A6533XUni ;
   private boolean[] T00VQ4_n6533XUni ;
   private short[] T00VQ4_A6534XCPzs ;
   private boolean[] T00VQ4_n6534XCPzs ;
   private short[] T00VQ4_A6535XUltLn ;
   private boolean[] T00VQ4_n6535XUltLn ;
   private String[] T00VQ4_A396EmprCod ;
   private java.math.BigDecimal[] T00VQ21_A6536XSumCtd ;
   private int[] T00VQ21_A6537XSumCpz ;
   private String[] T00VQ22_A396EmprCod ;
   private int[] T00VQ22_A6529XOF ;
   private byte[] T00VQ22_A6530XOFr ;
   private String[] T00VQ22_A6531XOFp ;
   private String[] T00VQ23_A396EmprCod ;
   private int[] T00VQ23_A6529XOF ;
   private byte[] T00VQ23_A6530XOFr ;
   private String[] T00VQ23_A6531XOFp ;
   private short[] T00VQ23_A6538XNumL ;
   private short[] T00VQ23_A6539XNPdas ;
   private boolean[] T00VQ23_n6539XNPdas ;
   private java.math.BigDecimal[] T00VQ23_A6540XQtdPdas ;
   private boolean[] T00VQ23_n6540XQtdPdas ;
   private short[] T00VQ23_A6541XPzsPdas ;
   private boolean[] T00VQ23_n6541XPzsPdas ;
   private java.math.BigDecimal[] T00VQ23_A6542XTotQtd ;
   private boolean[] T00VQ23_n6542XTotQtd ;
   private int[] T00VQ23_A6543XTotPzs ;
   private boolean[] T00VQ23_n6543XTotPzs ;
   private String[] T00VQ24_A396EmprCod ;
   private int[] T00VQ24_A6529XOF ;
   private byte[] T00VQ24_A6530XOFr ;
   private String[] T00VQ24_A6531XOFp ;
   private short[] T00VQ24_A6538XNumL ;
   private String[] T00VQ3_A396EmprCod ;
   private int[] T00VQ3_A6529XOF ;
   private byte[] T00VQ3_A6530XOFr ;
   private String[] T00VQ3_A6531XOFp ;
   private short[] T00VQ3_A6538XNumL ;
   private short[] T00VQ3_A6539XNPdas ;
   private boolean[] T00VQ3_n6539XNPdas ;
   private java.math.BigDecimal[] T00VQ3_A6540XQtdPdas ;
   private boolean[] T00VQ3_n6540XQtdPdas ;
   private short[] T00VQ3_A6541XPzsPdas ;
   private boolean[] T00VQ3_n6541XPzsPdas ;
   private java.math.BigDecimal[] T00VQ3_A6542XTotQtd ;
   private boolean[] T00VQ3_n6542XTotQtd ;
   private int[] T00VQ3_A6543XTotPzs ;
   private boolean[] T00VQ3_n6543XTotPzs ;
   private String[] T00VQ2_A396EmprCod ;
   private int[] T00VQ2_A6529XOF ;
   private byte[] T00VQ2_A6530XOFr ;
   private String[] T00VQ2_A6531XOFp ;
   private short[] T00VQ2_A6538XNumL ;
   private short[] T00VQ2_A6539XNPdas ;
   private boolean[] T00VQ2_n6539XNPdas ;
   private java.math.BigDecimal[] T00VQ2_A6540XQtdPdas ;
   private boolean[] T00VQ2_n6540XQtdPdas ;
   private short[] T00VQ2_A6541XPzsPdas ;
   private boolean[] T00VQ2_n6541XPzsPdas ;
   private java.math.BigDecimal[] T00VQ2_A6542XTotQtd ;
   private boolean[] T00VQ2_n6542XTotQtd ;
   private int[] T00VQ2_A6543XTotPzs ;
   private boolean[] T00VQ2_n6543XTotPzs ;
   private String[] T00VQ28_A396EmprCod ;
   private int[] T00VQ28_A6529XOF ;
   private byte[] T00VQ28_A6530XOFr ;
   private String[] T00VQ28_A6531XOFp ;
   private short[] T00VQ28_A6538XNumL ;
   private String[] T00VQ29_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txdivh2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdivh2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdivh2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdivh2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdivh2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00VQ2", "SELECT EmprCod, XOF, XOFr, XOFp, XNumL, XNPdas, XQtdPdas, XPzsPdas, XTotQtd, XTotPzs FROM TXPXDIVH2 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? AND XNumL = ?  FOR UPDATE OF XNPdas, XQtdPdas, XPzsPdas, XTotQtd, XTotPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ3", "SELECT EmprCod, XOF, XOFr, XOFp, XNumL, XNPdas, XQtdPdas, XPzsPdas, XTotQtd, XTotPzs FROM TXPXDIVH2 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? AND XNumL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ4", "SELECT XOF, XOFr, XOFp, XCtda, XUni, XCPzs, XUltLn, EmprCod FROM TXPXDIVH1 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ?  FOR UPDATE OF XCtda, XUni, XCPzs, XUltLn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ5", "SELECT XOF, XOFr, XOFp, XCtda, XUni, XCPzs, XUltLn, EmprCod FROM TXPXDIVH1 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ6", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ8", "SELECT COALESCE( T1.XSumCtd, 0) AS XSumCtd, COALESCE( T1.XSumCpz, 0) AS XSumCpz FROM (SELECT SUM(XQtdPdas) AS XSumCtd, EmprCod, XOF, XOFr, XOFp, SUM(XPzsPdas) AS XSumCpz FROM TXPXDIVH2 GROUP BY EmprCod, XOF, XOFr, XOFp ) T1 WHERE T1.EmprCod = ? AND T1.XOF = ? AND T1.XOFr = ? AND T1.XOFp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ10", "SELECT /*+ FIRST_ROWS(100) */ TM1.XOF, TM1.XOFr, TM1.XOFp, TM1.XCtda, TM1.XUni, TM1.XCPzs, TM1.XUltLn, TM1.EmprCod, COALESCE( T2.XSumCtd, 0) AS XSumCtd, COALESCE( T2.XSumCpz, 0) AS XSumCpz FROM (TXPXDIVH1 TM1 LEFT JOIN (SELECT SUM(XQtdPdas) AS XSumCtd, EmprCod, XOF, XOFr, XOFp, SUM(XPzsPdas) AS XSumCpz FROM TXPXDIVH2 GROUP BY EmprCod, XOF, XOFr, XOFp ) T2 ON T2.EmprCod = TM1.EmprCod AND T2.XOF = TM1.XOF AND T2.XOFr = TM1.XOFr AND T2.XOFp = TM1.XOFp) WHERE TM1.EmprCod = ? and TM1.XOF = ? and TM1.XOFr = ? and TM1.XOFp = ? ORDER BY TM1.EmprCod, TM1.XOF, TM1.XOFr, TM1.XOFp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ11", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ13", "SELECT COALESCE( T1.XSumCtd, 0) AS XSumCtd, COALESCE( T1.XSumCpz, 0) AS XSumCpz FROM (SELECT SUM(XQtdPdas) AS XSumCtd, EmprCod, XOF, XOFr, XOFp, SUM(XPzsPdas) AS XSumCpz FROM TXPXDIVH2 GROUP BY EmprCod, XOF, XOFr, XOFp ) T1 WHERE T1.EmprCod = ? AND T1.XOF = ? AND T1.XOFr = ? AND T1.XOFp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XOF, XOFr, XOFp FROM TXPXDIVH1 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XOF, XOFr, XOFp FROM TXPXDIVH1 WHERE ( EmprCod > ? or EmprCod = ? and XOF > ? or XOF = ? and EmprCod = ? and XOFr > ? or XOFr = ? and XOF = ? and EmprCod = ? and XOFp > ?) ORDER BY EmprCod, XOF, XOFr, XOFp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00VQ16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XOF, XOFr, XOFp FROM TXPXDIVH1 WHERE ( EmprCod < ? or EmprCod = ? and XOF < ? or XOF = ? and EmprCod = ? and XOFr < ? or XOFr = ? and XOF = ? and EmprCod = ? and XOFp < ?) ORDER BY EmprCod DESC, XOF DESC, XOFr DESC, XOFp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00VQ17", "INSERT INTO TXPXDIVH1(XOF, XOFr, XOFp, XCtda, XUni, XCPzs, XUltLn, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXDIVH1")
         ,new UpdateCursor("T00VQ18", "UPDATE TXPXDIVH1 SET XCtda=?, XUni=?, XCPzs=?, XUltLn=?  WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ?", GX_NOMASK, "TXPXDIVH1")
         ,new UpdateCursor("T00VQ19", "DELETE FROM TXPXDIVH1  WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ?", GX_NOMASK, "TXPXDIVH1")
         ,new ForEachCursor("T00VQ21", "SELECT COALESCE( T1.XSumCtd, 0) AS XSumCtd, COALESCE( T1.XSumCpz, 0) AS XSumCpz FROM (SELECT SUM(XQtdPdas) AS XSumCtd, EmprCod, XOF, XOFr, XOFp, SUM(XPzsPdas) AS XSumCpz FROM TXPXDIVH2 GROUP BY EmprCod, XOF, XOFr, XOFp ) T1 WHERE T1.EmprCod = ? AND T1.XOF = ? AND T1.XOFr = ? AND T1.XOFp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XOF, XOFr, XOFp FROM TXPXDIVH1 ORDER BY EmprCod, XOF, XOFr, XOFp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ23", "SELECT EmprCod, XOF, XOFr, XOFp, XNumL, XNPdas, XQtdPdas, XPzsPdas, XTotQtd, XTotPzs FROM TXPXDIVH2 WHERE EmprCod = ? and XOF = ? and XOFr = ? and XOFp = ? and XNumL = ? ORDER BY EmprCod, XOF, XOFr, XOFp, XNumL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ24", "SELECT EmprCod, XOF, XOFr, XOFp, XNumL FROM TXPXDIVH2 WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? AND XNumL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00VQ25", "INSERT INTO TXPXDIVH2(EmprCod, XOF, XOFr, XOFp, XNumL, XNPdas, XQtdPdas, XPzsPdas, XTotQtd, XTotPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXDIVH2")
         ,new UpdateCursor("T00VQ26", "UPDATE TXPXDIVH2 SET XNPdas=?, XQtdPdas=?, XPzsPdas=?, XTotQtd=?, XTotPzs=?  WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? AND XNumL = ?", GX_NOMASK, "TXPXDIVH2")
         ,new UpdateCursor("T00VQ27", "DELETE FROM TXPXDIVH2  WHERE EmprCod = ? AND XOF = ? AND XOFr = ? AND XOFp = ? AND XNumL = ?", GX_NOMASK, "TXPXDIVH2")
         ,new ForEachCursor("T00VQ28", "SELECT EmprCod, XOF, XOFr, XOFp, XNumL FROM TXPXDIVH2 WHERE EmprCod = ? and XOF = ? and XOFr = ? and XOFp = ? ORDER BY EmprCod, XOF, XOFr, XOFp, XNumL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VQ29", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
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
               return;
            case 11 :
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
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               stmt.setString(8, (String)parms[11], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               return;
            case 20 :
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setShort(10, ((Number) parms[14]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

