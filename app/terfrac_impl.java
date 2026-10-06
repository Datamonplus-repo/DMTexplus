package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class terfrac_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10872Er_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Er_Hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Er_Hdrr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = httpContext.GetPar( "Er_hdrp") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = (byte)(GXutil.lval( httpContext.GetPar( "Er_LinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A10872Er_Hdr, A10873Er_Hdrr, A10874Er_hdrp, A10875Er_LinV) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA FRACCIONADO ER", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEr_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public terfrac_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public terfrac_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( terfrac_impl.class ));
   }

   public terfrac_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TERFRAC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10872Er_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10872Er_Hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10872Er_Hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A10873Er_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10873Er_Hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A10873Er_Hdrr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Hdrr_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Hdrr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_hdrp_Internalname, GXutil.rtrim( A10874Er_hdrp), GXutil.rtrim( localUtil.format( A10874Er_hdrp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_hdrp_Jsonclick, 0, "", "", "", "", "", 1, edtEr_hdrp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Variante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_LinV_Internalname, GXutil.ltrim( localUtil.ntoc( A10875Er_LinV, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_LinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10875Er_LinV), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10875Er_LinV), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_LinV_Jsonclick, 0, "", "", "", "", "", 1, edtEr_LinV_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Linf_Internalname, GXutil.ltrim( localUtil.ntoc( A10878Er_Linf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Linf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10878Er_Linf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10878Er_Linf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Linf_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Linf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros Fraccionado", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_MtsF_Internalname, GXutil.ltrim( localUtil.ntoc( A10876Er_MtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_MtsF_Enabled!=0) ? localUtil.format( A10876Er_MtsF, "ZZZZZ9.99") : localUtil.format( A10876Er_MtsF, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_MtsF_Jsonclick, 0, "", "", "", "", "", 1, edtEr_MtsF_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Calidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Calidad_Internalname, GXutil.rtrim( A10877Er_Calidad), GXutil.rtrim( localUtil.format( A10877Er_Calidad, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Calidad_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Calidad_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERFRAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERFRAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TERFRAC.htm");
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
      e1119S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10872Er_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z10872Er_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10873Er_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10873Er_Hdrr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10874Er_hdrp = httpContext.cgiGet( "Z10874Er_hdrp") ;
            Z10875Er_LinV = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10875Er_LinV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10878Er_Linf = (short)(localUtil.ctol( httpContext.cgiGet( "Z10878Er_Linf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10876Er_MtsF = localUtil.ctond( httpContext.cgiGet( "Z10876Er_MtsF")) ;
            Z10877Er_Calidad = httpContext.cgiGet( "Z10877Er_Calidad") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_HDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10872Er_Hdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            }
            else
            {
               A10872Er_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtEr_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_HDRR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Hdrr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10873Er_Hdrr = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            }
            else
            {
               A10873Er_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtEr_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            }
            A10874Er_hdrp = httpContext.cgiGet( edtEr_hdrp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_LinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_LinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_LINV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_LinV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10875Er_LinV = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            }
            else
            {
               A10875Er_LinV = (byte)(localUtil.ctol( httpContext.cgiGet( edtEr_LinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Linf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Linf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_LINF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Linf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10878Er_Linf = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
            }
            else
            {
               A10878Er_Linf = (short)(localUtil.ctol( httpContext.cgiGet( edtEr_Linf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEr_MtsF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEr_MtsF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_MTSF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_MtsF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10876Er_MtsF = DecimalUtil.ZERO ;
               n10876Er_MtsF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrimstr( A10876Er_MtsF, 9, 2));
            }
            else
            {
               A10876Er_MtsF = localUtil.ctond( httpContext.cgiGet( edtEr_MtsF_Internalname)) ;
               n10876Er_MtsF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrimstr( A10876Er_MtsF, 9, 2));
            }
            A10877Er_Calidad = httpContext.cgiGet( edtEr_Calidad_Internalname) ;
            n10877Er_Calidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10877Er_Calidad", A10877Er_Calidad);
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
               A10872Er_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Er_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
               A10873Er_Hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Er_Hdrr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
               A10874Er_hdrp = httpContext.GetPar( "Er_hdrp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
               A10875Er_LinV = (byte)(GXutil.lval( httpContext.GetPar( "Er_LinV"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
               A10878Er_Linf = (short)(GXutil.lval( httpContext.GetPar( "Er_Linf"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
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
                        e1119S2 ();
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
            initAll19S1450( ) ;
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
      disableAttributes19S1450( ) ;
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

   public void confirm_19S0( )
   {
      beforeValidate19S1450( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19S1450( ) ;
         }
         else
         {
            checkExtendedTable19S1450( ) ;
            if ( AnyError == 0 )
            {
               zm19S1450( 2) ;
               zm19S1450( 3) ;
            }
            closeExtendedTableCursors19S1450( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues19S0( ) ;
      }
   }

   public void resetCaption19S0( )
   {
   }

   public void e1119S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      terfrac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      terfrac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      terfrac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      terfrac_impl.this.A396EmprCod = GXv_char2[0] ;
      terfrac_impl.this.AV11EmprNom = GXv_char3[0] ;
      terfrac_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm19S1450( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10876Er_MtsF = T019S3_A10876Er_MtsF[0] ;
            Z10877Er_Calidad = T019S3_A10877Er_Calidad[0] ;
         }
         else
         {
            Z10876Er_MtsF = A10876Er_MtsF ;
            Z10877Er_Calidad = A10877Er_Calidad ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10878Er_Linf = A10878Er_Linf ;
         Z10876Er_MtsF = A10876Er_MtsF ;
         Z10877Er_Calidad = A10877Er_Calidad ;
         Z396EmprCod = A396EmprCod ;
         Z10872Er_Hdr = A10872Er_Hdr ;
         Z10873Er_Hdrr = A10873Er_Hdrr ;
         Z10874Er_hdrp = A10874Er_hdrp ;
         Z10875Er_LinV = A10875Er_LinV ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TERFRAC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T019S4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019S4_A407EmprNom[0] ;
      n407EmprNom = T019S4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load19S1450( )
   {
      /* Using cursor T019S6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1450 = (short)(1) ;
         A407EmprNom = T019S6_A407EmprNom[0] ;
         n407EmprNom = T019S6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10876Er_MtsF = T019S6_A10876Er_MtsF[0] ;
         n10876Er_MtsF = T019S6_n10876Er_MtsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrimstr( A10876Er_MtsF, 9, 2));
         A10877Er_Calidad = T019S6_A10877Er_Calidad[0] ;
         n10877Er_Calidad = T019S6_n10877Er_Calidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10877Er_Calidad", A10877Er_Calidad);
         zm19S1450( -1) ;
      }
      pr_default.close(4);
      onLoadActions19S1450( ) ;
   }

   public void onLoadActions19S1450( )
   {
   }

   public void checkExtendedTable19S1450( )
   {
      nIsDirty_1450 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T019S5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA PRODUCCIONES ER", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ER_LINV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEr_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors19S1450( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A10872Er_Hdr ,
                         byte A10873Er_Hdrr ,
                         String A10874Er_hdrp ,
                         byte A10875Er_LinV )
   {
      /* Using cursor T019S7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA PRODUCCIONES ER", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ER_LINV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEr_Hdr_Internalname ;
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

   public void getKey19S1450( )
   {
      /* Using cursor T019S8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1450 = (short)(1) ;
      }
      else
      {
         RcdFound1450 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T019S3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19S1450( 1) ;
         RcdFound1450 = (short)(1) ;
         A10878Er_Linf = T019S3_A10878Er_Linf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
         A10876Er_MtsF = T019S3_A10876Er_MtsF[0] ;
         n10876Er_MtsF = T019S3_n10876Er_MtsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrimstr( A10876Er_MtsF, 9, 2));
         A10877Er_Calidad = T019S3_A10877Er_Calidad[0] ;
         n10877Er_Calidad = T019S3_n10877Er_Calidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10877Er_Calidad", A10877Er_Calidad);
         A10872Er_Hdr = T019S3_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019S3_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019S3_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019S3_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z10872Er_Hdr = A10872Er_Hdr ;
         Z10873Er_Hdrr = A10873Er_Hdrr ;
         Z10874Er_hdrp = A10874Er_hdrp ;
         Z10875Er_LinV = A10875Er_LinV ;
         Z10878Er_Linf = A10878Er_Linf ;
         sMode1450 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load19S1450( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1450 = (short)(0) ;
            initializeNonKey19S1450( ) ;
         }
         Gx_mode = sMode1450 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1450 = (short)(0) ;
         initializeNonKey19S1450( ) ;
         sMode1450 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1450 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey19S1450( ) ;
      if ( RcdFound1450 == 0 )
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
      RcdFound1450 = (short)(0) ;
      /* Using cursor T019S9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A10872Er_Hdr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), A10874Er_hdrp, A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10875Er_LinV), Byte.valueOf(A10875Er_LinV), A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Short.valueOf(A10878Er_Linf), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T019S9_A10872Er_Hdr[0] < A10872Er_Hdr ) || ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10873Er_Hdrr[0] < A10873Er_Hdrr ) || ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) < 0 ) || ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10875Er_LinV[0] < A10875Er_LinV ) || ( T019S9_A10875Er_LinV[0] == A10875Er_LinV ) && ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10878Er_Linf[0] < A10878Er_Linf ) ) && ( GXutil.strcmp(T019S9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T019S9_A10872Er_Hdr[0] > A10872Er_Hdr ) || ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10873Er_Hdrr[0] > A10873Er_Hdrr ) || ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) > 0 ) || ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10875Er_LinV[0] > A10875Er_LinV ) || ( T019S9_A10875Er_LinV[0] == A10875Er_LinV ) && ( GXutil.strcmp(T019S9_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S9_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S9_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S9_A10878Er_Linf[0] > A10878Er_Linf ) ) && ( GXutil.strcmp(T019S9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10872Er_Hdr = T019S9_A10872Er_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = T019S9_A10873Er_Hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = T019S9_A10874Er_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = T019S9_A10875Er_LinV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            A10878Er_Linf = T019S9_A10878Er_Linf[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
            RcdFound1450 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1450 = (short)(0) ;
      /* Using cursor T019S10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A10872Er_Hdr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), A10874Er_hdrp, A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10875Er_LinV), Byte.valueOf(A10875Er_LinV), A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Short.valueOf(A10878Er_Linf), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T019S10_A10872Er_Hdr[0] > A10872Er_Hdr ) || ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10873Er_Hdrr[0] > A10873Er_Hdrr ) || ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) > 0 ) || ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10875Er_LinV[0] > A10875Er_LinV ) || ( T019S10_A10875Er_LinV[0] == A10875Er_LinV ) && ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10878Er_Linf[0] > A10878Er_Linf ) ) && ( GXutil.strcmp(T019S10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T019S10_A10872Er_Hdr[0] < A10872Er_Hdr ) || ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10873Er_Hdrr[0] < A10873Er_Hdrr ) || ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) < 0 ) || ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10875Er_LinV[0] < A10875Er_LinV ) || ( T019S10_A10875Er_LinV[0] == A10875Er_LinV ) && ( GXutil.strcmp(T019S10_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019S10_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019S10_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019S10_A10878Er_Linf[0] < A10878Er_Linf ) ) && ( GXutil.strcmp(T019S10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10872Er_Hdr = T019S10_A10872Er_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = T019S10_A10873Er_Hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = T019S10_A10874Er_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = T019S10_A10875Er_LinV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            A10878Er_Linf = T019S10_A10878Er_Linf[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
            RcdFound1450 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19S1450( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEr_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19S1450( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1450 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) || ( A10878Er_Linf != Z10878Er_Linf ) )
            {
               A10872Er_Hdr = Z10872Er_Hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
               A10873Er_Hdrr = Z10873Er_Hdrr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
               A10874Er_hdrp = Z10874Er_hdrp ;
               httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
               A10875Er_LinV = Z10875Er_LinV ;
               httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
               A10878Er_Linf = Z10878Er_Linf ;
               httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update19S1450( ) ;
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) || ( A10878Er_Linf != Z10878Er_Linf ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19S1450( ) ;
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
                  GX_FocusControl = edtEr_Hdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert19S1450( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) || ( A10878Er_Linf != Z10878Er_Linf ) )
      {
         A10872Er_Hdr = Z10872Er_Hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = Z10873Er_Hdrr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = Z10874Er_hdrp ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = Z10875Er_LinV ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         A10878Er_Linf = Z10878Er_Linf ;
         httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEr_Hdr_Internalname ;
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
      getKey19S1450( ) ;
      if ( RcdFound1450 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) || ( A10878Er_Linf != Z10878Er_Linf ) )
         {
            A10872Er_Hdr = Z10872Er_Hdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = Z10873Er_Hdrr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = Z10874Er_hdrp ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = Z10875Er_LinV ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            A10878Er_Linf = Z10878Er_Linf ;
            httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) || ( A10878Er_Linf != Z10878Er_Linf ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "terfrac");
      GX_FocusControl = edtEr_MtsF_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_19S0( ) ;
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
      if ( RcdFound1450 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEr_MtsF_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart19S1450( ) ;
      if ( RcdFound1450 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_MtsF_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19S1450( ) ;
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
      if ( RcdFound1450 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_MtsF_Internalname ;
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
      if ( RcdFound1450 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_MtsF_Internalname ;
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
      scanStart19S1450( ) ;
      if ( RcdFound1450 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1450 != 0 )
         {
            scanNext19S1450( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_MtsF_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19S1450( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19S1450( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPERFRAC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10876Er_MtsF, T019S2_A10876Er_MtsF[0]) != 0 ) || ( GXutil.strcmp(Z10877Er_Calidad, T019S2_A10877Er_Calidad[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10876Er_MtsF, T019S2_A10876Er_MtsF[0]) != 0 )
            {
               GXutil.writeLogln("terfrac:[seudo value changed for attri]"+"Er_MtsF");
               GXutil.writeLogRaw("Old: ",Z10876Er_MtsF);
               GXutil.writeLogRaw("Current: ",T019S2_A10876Er_MtsF[0]);
            }
            if ( GXutil.strcmp(Z10877Er_Calidad, T019S2_A10877Er_Calidad[0]) != 0 )
            {
               GXutil.writeLogln("terfrac:[seudo value changed for attri]"+"Er_Calidad");
               GXutil.writeLogRaw("Old: ",Z10877Er_Calidad);
               GXutil.writeLogRaw("Current: ",T019S2_A10877Er_Calidad[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPERFRAC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19S1450( )
   {
      beforeValidate19S1450( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19S1450( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19S1450( 0) ;
         checkOptimisticConcurrency19S1450( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19S1450( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19S1450( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019S11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A10878Er_Linf), Boolean.valueOf(n10876Er_MtsF), A10876Er_MtsF, Boolean.valueOf(n10877Er_Calidad), A10877Er_Calidad, A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERFRAC");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption19S0( ) ;
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
            load19S1450( ) ;
         }
         endLevel19S1450( ) ;
      }
      closeExtendedTableCursors19S1450( ) ;
   }

   public void update19S1450( )
   {
      beforeValidate19S1450( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19S1450( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19S1450( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19S1450( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19S1450( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019S12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10876Er_MtsF), A10876Er_MtsF, Boolean.valueOf(n10877Er_Calidad), A10877Er_Calidad, A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERFRAC");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPERFRAC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate19S1450( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption19S0( ) ;
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
         endLevel19S1450( ) ;
      }
      closeExtendedTableCursors19S1450( ) ;
   }

   public void deferredUpdate19S1450( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19S1450( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19S1450( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19S1450( ) ;
         afterConfirm19S1450( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19S1450( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019S13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Short.valueOf(A10878Er_Linf)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERFRAC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1450 == 0 )
                     {
                        initAll19S1450( ) ;
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
                     resetCaption19S0( ) ;
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
      sMode1450 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19S1450( ) ;
      Gx_mode = sMode1450 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19S1450( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel19S1450( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19S1450( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "terfrac");
         if ( AnyError == 0 )
         {
            confirmValues19S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "terfrac");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19S1450( )
   {
      /* Scan By routine */
      /* Using cursor T019S14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1450 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1450 = (short)(1) ;
         A10872Er_Hdr = T019S14_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019S14_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019S14_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019S14_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         A10878Er_Linf = T019S14_A10878Er_Linf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19S1450( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1450 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1450 = (short)(1) ;
         A10872Er_Hdr = T019S14_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019S14_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019S14_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019S14_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         A10878Er_Linf = T019S14_A10878Er_Linf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
      }
   }

   public void scanEnd19S1450( )
   {
      pr_default.close(12);
   }

   public void afterConfirm19S1450( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19S1450( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19S1450( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19S1450( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19S1450( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19S1450( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19S1450( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEr_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Hdr_Enabled), 5, 0), true);
      edtEr_Hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Hdrr_Enabled), 5, 0), true);
      edtEr_hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_hdrp_Enabled), 5, 0), true);
      edtEr_LinV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_LinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_LinV_Enabled), 5, 0), true);
      edtEr_Linf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Linf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Linf_Enabled), 5, 0), true);
      edtEr_MtsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_MtsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_MtsF_Enabled), 5, 0), true);
      edtEr_Calidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Calidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Calidad_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes19S1450( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues19S0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.terfrac", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10872Er_Hdr", GXutil.ltrim( localUtil.ntoc( Z10872Er_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10873Er_Hdrr", GXutil.ltrim( localUtil.ntoc( Z10873Er_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10874Er_hdrp", GXutil.rtrim( Z10874Er_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10875Er_LinV", GXutil.ltrim( localUtil.ntoc( Z10875Er_LinV, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10878Er_Linf", GXutil.ltrim( localUtil.ntoc( Z10878Er_Linf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10876Er_MtsF", GXutil.ltrim( localUtil.ntoc( Z10876Er_MtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10877Er_Calidad", GXutil.rtrim( Z10877Er_Calidad));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.terfrac", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TERFRAC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA FRACCIONADO ER", "") ;
   }

   public void initializeNonKey19S1450( )
   {
      A10876Er_MtsF = DecimalUtil.ZERO ;
      n10876Er_MtsF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrimstr( A10876Er_MtsF, 9, 2));
      A10877Er_Calidad = "" ;
      n10877Er_Calidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10877Er_Calidad", A10877Er_Calidad);
      Z10876Er_MtsF = DecimalUtil.ZERO ;
      Z10877Er_Calidad = "" ;
   }

   public void initAll19S1450( )
   {
      A10872Er_Hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
      A10873Er_Hdrr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
      A10874Er_hdrp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
      A10875Er_LinV = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
      A10878Er_Linf = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10878Er_Linf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10878Er_Linf), 4, 0));
      initializeNonKey19S1450( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156486", true, true);
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
      httpContext.AddJavascriptSource("terfrac.js", "?2026824156486", false, true);
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
      edtEr_Hdr_Internalname = "ER_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEr_Hdrr_Internalname = "ER_HDRR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEr_hdrp_Internalname = "ER_HDRP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEr_LinV_Internalname = "ER_LINV" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEr_Linf_Internalname = "ER_LINF" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEr_MtsF_Internalname = "ER_MTSF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEr_Calidad_Internalname = "ER_CALIDAD" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA FRACCIONADO ER", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEr_Calidad_Jsonclick = "" ;
      edtEr_Calidad_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Calidad_Enabled = 1 ;
      edtEr_MtsF_Jsonclick = "" ;
      edtEr_MtsF_Backcolor = (int)(0xFFFFFF) ;
      edtEr_MtsF_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEr_Linf_Jsonclick = "" ;
      edtEr_Linf_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Linf_Enabled = 1 ;
      edtEr_LinV_Jsonclick = "" ;
      edtEr_LinV_Backcolor = (int)(0xFFFFFF) ;
      edtEr_LinV_Enabled = 1 ;
      edtEr_hdrp_Jsonclick = "" ;
      edtEr_hdrp_Backcolor = (int)(0xFFFFFF) ;
      edtEr_hdrp_Enabled = 1 ;
      edtEr_Hdrr_Jsonclick = "" ;
      edtEr_Hdrr_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Hdrr_Enabled = 1 ;
      edtEr_Hdr_Jsonclick = "" ;
      edtEr_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Hdr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T019S15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019S15_A407EmprNom[0] ;
      n407EmprNom = T019S15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T019S16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA PRODUCCIONES ER", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ER_LINV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEr_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      GX_FocusControl = edtEr_MtsF_Internalname ;
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

   public void valid_Er_linv( )
   {
      /* Using cursor T019S16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA PRODUCCIONES ER", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ER_LINV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEr_Hdr_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Er_linf( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10876Er_MtsF", GXutil.ltrim( localUtil.ntoc( A10876Er_MtsF, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10877Er_Calidad", GXutil.rtrim( A10877Er_Calidad));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10872Er_Hdr", GXutil.ltrim( localUtil.ntoc( Z10872Er_Hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10873Er_Hdrr", GXutil.ltrim( localUtil.ntoc( Z10873Er_Hdrr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10874Er_hdrp", GXutil.rtrim( Z10874Er_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10875Er_LinV", GXutil.ltrim( localUtil.ntoc( Z10875Er_LinV, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10878Er_Linf", GXutil.ltrim( localUtil.ntoc( Z10878Er_Linf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10876Er_MtsF", GXutil.ltrim( localUtil.ntoc( Z10876Er_MtsF, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10877Er_Calidad", GXutil.rtrim( Z10877Er_Calidad));
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
      setEventMetadata("VALID_ER_HDR","{handler:'valid_Er_hdr',iparms:[]");
      setEventMetadata("VALID_ER_HDR",",oparms:[]}");
      setEventMetadata("VALID_ER_HDRR","{handler:'valid_Er_hdrr',iparms:[]");
      setEventMetadata("VALID_ER_HDRR",",oparms:[]}");
      setEventMetadata("VALID_ER_HDRP","{handler:'valid_Er_hdrp',iparms:[]");
      setEventMetadata("VALID_ER_HDRP",",oparms:[]}");
      setEventMetadata("VALID_ER_LINV","{handler:'valid_Er_linv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10872Er_Hdr',fld:'ER_HDR',pic:'ZZZZZZZ9'},{av:'A10873Er_Hdrr',fld:'ER_HDRR',pic:'9'},{av:'A10874Er_hdrp',fld:'ER_HDRP',pic:''},{av:'A10875Er_LinV',fld:'ER_LINV',pic:'Z9'}]");
      setEventMetadata("VALID_ER_LINV",",oparms:[]}");
      setEventMetadata("VALID_ER_LINF","{handler:'valid_Er_linf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10872Er_Hdr',fld:'ER_HDR',pic:'ZZZZZZZ9'},{av:'A10873Er_Hdrr',fld:'ER_HDRR',pic:'9'},{av:'A10874Er_hdrp',fld:'ER_HDRP',pic:''},{av:'A10875Er_LinV',fld:'ER_LINV',pic:'Z9'},{av:'A10878Er_Linf',fld:'ER_LINF',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ER_LINF",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10876Er_MtsF',fld:'ER_MTSF',pic:'ZZZZZ9.99'},{av:'A10877Er_Calidad',fld:'ER_CALIDAD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10872Er_Hdr'},{av:'Z10873Er_Hdrr'},{av:'Z10874Er_hdrp'},{av:'Z10875Er_LinV'},{av:'Z10878Er_Linf'},{av:'Z407EmprNom'},{av:'Z10876Er_MtsF'},{av:'Z10877Er_Calidad'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10874Er_hdrp = "" ;
      Z10876Er_MtsF = DecimalUtil.ZERO ;
      Z10877Er_Calidad = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10874Er_hdrp = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10876Er_MtsF = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A10877Er_Calidad = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      Z407EmprNom = "" ;
      T019S4_A407EmprNom = new String[] {""} ;
      T019S4_n407EmprNom = new boolean[] {false} ;
      T019S6_A10878Er_Linf = new short[1] ;
      T019S6_A407EmprNom = new String[] {""} ;
      T019S6_n407EmprNom = new boolean[] {false} ;
      T019S6_A10876Er_MtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019S6_n10876Er_MtsF = new boolean[] {false} ;
      T019S6_A10877Er_Calidad = new String[] {""} ;
      T019S6_n10877Er_Calidad = new boolean[] {false} ;
      T019S6_A396EmprCod = new String[] {""} ;
      T019S6_A10872Er_Hdr = new int[1] ;
      T019S6_A10873Er_Hdrr = new byte[1] ;
      T019S6_A10874Er_hdrp = new String[] {""} ;
      T019S6_A10875Er_LinV = new byte[1] ;
      T019S5_A396EmprCod = new String[] {""} ;
      T019S7_A396EmprCod = new String[] {""} ;
      T019S8_A396EmprCod = new String[] {""} ;
      T019S8_A10872Er_Hdr = new int[1] ;
      T019S8_A10873Er_Hdrr = new byte[1] ;
      T019S8_A10874Er_hdrp = new String[] {""} ;
      T019S8_A10875Er_LinV = new byte[1] ;
      T019S8_A10878Er_Linf = new short[1] ;
      T019S3_A10878Er_Linf = new short[1] ;
      T019S3_A10876Er_MtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019S3_n10876Er_MtsF = new boolean[] {false} ;
      T019S3_A10877Er_Calidad = new String[] {""} ;
      T019S3_n10877Er_Calidad = new boolean[] {false} ;
      T019S3_A396EmprCod = new String[] {""} ;
      T019S3_A10872Er_Hdr = new int[1] ;
      T019S3_A10873Er_Hdrr = new byte[1] ;
      T019S3_A10874Er_hdrp = new String[] {""} ;
      T019S3_A10875Er_LinV = new byte[1] ;
      sMode1450 = "" ;
      T019S9_A396EmprCod = new String[] {""} ;
      T019S9_A10872Er_Hdr = new int[1] ;
      T019S9_A10873Er_Hdrr = new byte[1] ;
      T019S9_A10874Er_hdrp = new String[] {""} ;
      T019S9_A10875Er_LinV = new byte[1] ;
      T019S9_A10878Er_Linf = new short[1] ;
      T019S10_A396EmprCod = new String[] {""} ;
      T019S10_A10872Er_Hdr = new int[1] ;
      T019S10_A10873Er_Hdrr = new byte[1] ;
      T019S10_A10874Er_hdrp = new String[] {""} ;
      T019S10_A10875Er_LinV = new byte[1] ;
      T019S10_A10878Er_Linf = new short[1] ;
      T019S2_A10878Er_Linf = new short[1] ;
      T019S2_A10876Er_MtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019S2_n10876Er_MtsF = new boolean[] {false} ;
      T019S2_A10877Er_Calidad = new String[] {""} ;
      T019S2_n10877Er_Calidad = new boolean[] {false} ;
      T019S2_A396EmprCod = new String[] {""} ;
      T019S2_A10872Er_Hdr = new int[1] ;
      T019S2_A10873Er_Hdrr = new byte[1] ;
      T019S2_A10874Er_hdrp = new String[] {""} ;
      T019S2_A10875Er_LinV = new byte[1] ;
      T019S14_A396EmprCod = new String[] {""} ;
      T019S14_A10872Er_Hdr = new int[1] ;
      T019S14_A10873Er_Hdrr = new byte[1] ;
      T019S14_A10874Er_hdrp = new String[] {""} ;
      T019S14_A10875Er_LinV = new byte[1] ;
      T019S14_A10878Er_Linf = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T019S15_A407EmprNom = new String[] {""} ;
      T019S15_n407EmprNom = new boolean[] {false} ;
      T019S16_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10874Er_hdrp = "" ;
      ZZ407EmprNom = "" ;
      ZZ10876Er_MtsF = DecimalUtil.ZERO ;
      ZZ10877Er_Calidad = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.terfrac__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.terfrac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.terfrac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.terfrac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.terfrac__default(),
         new Object[] {
             new Object[] {
            T019S2_A10878Er_Linf, T019S2_A10876Er_MtsF, T019S2_n10876Er_MtsF, T019S2_A10877Er_Calidad, T019S2_n10877Er_Calidad, T019S2_A396EmprCod, T019S2_A10872Er_Hdr, T019S2_A10873Er_Hdrr, T019S2_A10874Er_hdrp, T019S2_A10875Er_LinV
            }
            , new Object[] {
            T019S3_A10878Er_Linf, T019S3_A10876Er_MtsF, T019S3_n10876Er_MtsF, T019S3_A10877Er_Calidad, T019S3_n10877Er_Calidad, T019S3_A396EmprCod, T019S3_A10872Er_Hdr, T019S3_A10873Er_Hdrr, T019S3_A10874Er_hdrp, T019S3_A10875Er_LinV
            }
            , new Object[] {
            T019S4_A407EmprNom, T019S4_n407EmprNom
            }
            , new Object[] {
            T019S5_A396EmprCod
            }
            , new Object[] {
            T019S6_A10878Er_Linf, T019S6_A407EmprNom, T019S6_n407EmprNom, T019S6_A10876Er_MtsF, T019S6_n10876Er_MtsF, T019S6_A10877Er_Calidad, T019S6_n10877Er_Calidad, T019S6_A396EmprCod, T019S6_A10872Er_Hdr, T019S6_A10873Er_Hdrr,
            T019S6_A10874Er_hdrp, T019S6_A10875Er_LinV
            }
            , new Object[] {
            T019S7_A396EmprCod
            }
            , new Object[] {
            T019S8_A396EmprCod, T019S8_A10872Er_Hdr, T019S8_A10873Er_Hdrr, T019S8_A10874Er_hdrp, T019S8_A10875Er_LinV, T019S8_A10878Er_Linf
            }
            , new Object[] {
            T019S9_A396EmprCod, T019S9_A10872Er_Hdr, T019S9_A10873Er_Hdrr, T019S9_A10874Er_hdrp, T019S9_A10875Er_LinV, T019S9_A10878Er_Linf
            }
            , new Object[] {
            T019S10_A396EmprCod, T019S10_A10872Er_Hdr, T019S10_A10873Er_Hdrr, T019S10_A10874Er_hdrp, T019S10_A10875Er_LinV, T019S10_A10878Er_Linf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019S14_A396EmprCod, T019S14_A10872Er_Hdr, T019S14_A10873Er_Hdrr, T019S14_A10874Er_hdrp, T019S14_A10875Er_LinV, T019S14_A10878Er_Linf
            }
            , new Object[] {
            T019S15_A407EmprNom, T019S15_n407EmprNom
            }
            , new Object[] {
            T019S16_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TERFRAC" ;
   }

   private byte Z10873Er_Hdrr ;
   private byte Z10875Er_LinV ;
   private byte GxWebError ;
   private byte A10873Er_Hdrr ;
   private byte A10875Er_LinV ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10873Er_Hdrr ;
   private byte ZZ10875Er_LinV ;
   private short Z10878Er_Linf ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10878Er_Linf ;
   private short RcdFound1450 ;
   private short nIsDirty_1450 ;
   private short ZZ10878Er_Linf ;
   private int Z10872Er_Hdr ;
   private int A10872Er_Hdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEr_Hdr_Enabled ;
   private int edtEr_Hdrr_Enabled ;
   private int edtEr_hdrp_Enabled ;
   private int edtEr_LinV_Enabled ;
   private int edtEr_Linf_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEr_MtsF_Enabled ;
   private int edtEr_Calidad_Enabled ;
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
   private int edtEr_Calidad_Backcolor ;
   private int edtEr_MtsF_Backcolor ;
   private int edtEr_Linf_Backcolor ;
   private int edtEr_LinV_Backcolor ;
   private int edtEr_hdrp_Backcolor ;
   private int edtEr_Hdrr_Backcolor ;
   private int edtEr_Hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10872Er_Hdr ;
   private java.math.BigDecimal Z10876Er_MtsF ;
   private java.math.BigDecimal A10876Er_MtsF ;
   private java.math.BigDecimal ZZ10876Er_MtsF ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10874Er_hdrp ;
   private String Z10877Er_Calidad ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10874Er_hdrp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEr_Hdr_Internalname ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEr_Hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEr_Hdrr_Internalname ;
   private String edtEr_Hdrr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEr_hdrp_Internalname ;
   private String edtEr_hdrp_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEr_LinV_Internalname ;
   private String edtEr_LinV_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEr_Linf_Internalname ;
   private String edtEr_Linf_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEr_MtsF_Internalname ;
   private String edtEr_MtsF_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEr_Calidad_Internalname ;
   private String A10877Er_Calidad ;
   private String edtEr_Calidad_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String Z407EmprNom ;
   private String sMode1450 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10874Er_hdrp ;
   private String ZZ407EmprNom ;
   private String ZZ10877Er_Calidad ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10876Er_MtsF ;
   private boolean n10877Er_Calidad ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T019S4_A407EmprNom ;
   private boolean[] T019S4_n407EmprNom ;
   private short[] T019S6_A10878Er_Linf ;
   private String[] T019S6_A407EmprNom ;
   private boolean[] T019S6_n407EmprNom ;
   private java.math.BigDecimal[] T019S6_A10876Er_MtsF ;
   private boolean[] T019S6_n10876Er_MtsF ;
   private String[] T019S6_A10877Er_Calidad ;
   private boolean[] T019S6_n10877Er_Calidad ;
   private String[] T019S6_A396EmprCod ;
   private int[] T019S6_A10872Er_Hdr ;
   private byte[] T019S6_A10873Er_Hdrr ;
   private String[] T019S6_A10874Er_hdrp ;
   private byte[] T019S6_A10875Er_LinV ;
   private String[] T019S5_A396EmprCod ;
   private String[] T019S7_A396EmprCod ;
   private String[] T019S8_A396EmprCod ;
   private int[] T019S8_A10872Er_Hdr ;
   private byte[] T019S8_A10873Er_Hdrr ;
   private String[] T019S8_A10874Er_hdrp ;
   private byte[] T019S8_A10875Er_LinV ;
   private short[] T019S8_A10878Er_Linf ;
   private short[] T019S3_A10878Er_Linf ;
   private java.math.BigDecimal[] T019S3_A10876Er_MtsF ;
   private boolean[] T019S3_n10876Er_MtsF ;
   private String[] T019S3_A10877Er_Calidad ;
   private boolean[] T019S3_n10877Er_Calidad ;
   private String[] T019S3_A396EmprCod ;
   private int[] T019S3_A10872Er_Hdr ;
   private byte[] T019S3_A10873Er_Hdrr ;
   private String[] T019S3_A10874Er_hdrp ;
   private byte[] T019S3_A10875Er_LinV ;
   private String[] T019S9_A396EmprCod ;
   private int[] T019S9_A10872Er_Hdr ;
   private byte[] T019S9_A10873Er_Hdrr ;
   private String[] T019S9_A10874Er_hdrp ;
   private byte[] T019S9_A10875Er_LinV ;
   private short[] T019S9_A10878Er_Linf ;
   private String[] T019S10_A396EmprCod ;
   private int[] T019S10_A10872Er_Hdr ;
   private byte[] T019S10_A10873Er_Hdrr ;
   private String[] T019S10_A10874Er_hdrp ;
   private byte[] T019S10_A10875Er_LinV ;
   private short[] T019S10_A10878Er_Linf ;
   private short[] T019S2_A10878Er_Linf ;
   private java.math.BigDecimal[] T019S2_A10876Er_MtsF ;
   private boolean[] T019S2_n10876Er_MtsF ;
   private String[] T019S2_A10877Er_Calidad ;
   private boolean[] T019S2_n10877Er_Calidad ;
   private String[] T019S2_A396EmprCod ;
   private int[] T019S2_A10872Er_Hdr ;
   private byte[] T019S2_A10873Er_Hdrr ;
   private String[] T019S2_A10874Er_hdrp ;
   private byte[] T019S2_A10875Er_LinV ;
   private String[] T019S14_A396EmprCod ;
   private int[] T019S14_A10872Er_Hdr ;
   private byte[] T019S14_A10873Er_Hdrr ;
   private String[] T019S14_A10874Er_hdrp ;
   private byte[] T019S14_A10875Er_LinV ;
   private short[] T019S14_A10878Er_Linf ;
   private String[] T019S15_A407EmprNom ;
   private boolean[] T019S15_n407EmprNom ;
   private String[] T019S16_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class terfrac__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terfrac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terfrac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terfrac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terfrac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019S2", "SELECT Er_Linf, Er_MtsF, Er_Calidad, EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERFRAC WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? AND Er_Linf = ?  FOR UPDATE OF Er_MtsF, Er_Calidad NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S3", "SELECT Er_Linf, Er_MtsF, Er_Calidad, EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERFRAC WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? AND Er_Linf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S5", "SELECT EmprCod FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Er_Linf, T2.EmprNom, TM1.Er_MtsF, TM1.Er_Calidad, TM1.EmprCod, TM1.Er_Hdr, TM1.Er_Hdrr, TM1.Er_hdrp, TM1.Er_LinV FROM (TXPERFRAC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Er_Hdr = ? and TM1.Er_Hdrr = ? and TM1.Er_hdrp = ? and TM1.Er_LinV = ? and TM1.Er_Linf = ? ORDER BY TM1.EmprCod, TM1.Er_Hdr, TM1.Er_Hdrr, TM1.Er_hdrp, TM1.Er_LinV, TM1.Er_Linf ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S7", "SELECT EmprCod FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf FROM TXPERFRAC WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? AND Er_Linf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf FROM TXPERFRAC WHERE ( Er_Hdr > ? or Er_Hdr = ? and Er_Hdrr > ? or Er_Hdrr = ? and Er_Hdr = ? and Er_hdrp > ? or Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_LinV > ? or Er_LinV = ? and Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_Linf > ?) and EmprCod = ? ORDER BY EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019S10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf FROM TXPERFRAC WHERE ( Er_Hdr < ? or Er_Hdr = ? and Er_Hdrr < ? or Er_Hdrr = ? and Er_Hdr = ? and Er_hdrp < ? or Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_LinV < ? or Er_LinV = ? and Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_Linf < ?) and EmprCod = ? ORDER BY EmprCod DESC, Er_Hdr DESC, Er_Hdrr DESC, Er_hdrp DESC, Er_LinV DESC, Er_Linf DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019S11", "INSERT INTO TXPERFRAC(Er_Linf, Er_MtsF, Er_Calidad, EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPERFRAC")
         ,new UpdateCursor("T019S12", "UPDATE TXPERFRAC SET Er_MtsF=?, Er_Calidad=?  WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? AND Er_Linf = ?", GX_NOMASK, "TXPERFRAC")
         ,new UpdateCursor("T019S13", "DELETE FROM TXPERFRAC  WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? AND Er_Linf = ?", GX_NOMASK, "TXPERFRAC")
         ,new ForEachCursor("T019S14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf FROM TXPERFRAC WHERE EmprCod = ? ORDER BY EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019S16", "SELECT EmprCod FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 40);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               return;
            case 10 :
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
                  stmt.setString(2, (String)parms[3], 40);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

