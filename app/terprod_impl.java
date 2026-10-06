package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class terprod_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA PRODUCCIONES ER", ""), (short)(0)) ;
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

   public terprod_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public terprod_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( terprod_impl.class ));
   }

   public terprod_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TERPROD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10872Er_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10872Er_Hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10872Er_Hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A10873Er_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10873Er_Hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A10873Er_Hdrr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Hdrr_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Hdrr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_hdrp_Internalname, GXutil.rtrim( A10874Er_hdrp), GXutil.rtrim( localUtil.format( A10874Er_hdrp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_hdrp_Jsonclick, 0, "", "", "", "", "", 1, edtEr_hdrp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Variante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_LinV_Internalname, GXutil.ltrim( localUtil.ntoc( A10875Er_LinV, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_LinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10875Er_LinV), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10875Er_LinV), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_LinV_Jsonclick, 0, "", "", "", "", "", 1, edtEr_LinV_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ToE", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_ToE_Internalname, GXutil.rtrim( A10849Er_ToE), GXutil.rtrim( localUtil.format( A10849Er_ToE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_ToE_Jsonclick, 0, "", "", "", "", "", 1, edtEr_ToE_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Clicod_Internalname, GXutil.ltrim( localUtil.ntoc( A10850Er_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10850Er_Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10850Er_Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Clicod_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Clicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Arti_Internalname, GXutil.rtrim( A10851Er_Arti), GXutil.rtrim( localUtil.format( A10851Er_Arti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Arti_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Arti_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Color_Internalname, GXutil.rtrim( A10852Er_Color), GXutil.rtrim( localUtil.format( A10852Er_Color, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Color_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Color_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Clave ER (1,2,3,7,21,99)", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Clav_Internalname, GXutil.rtrim( A10853Er_Clav), GXutil.rtrim( localUtil.format( A10853Er_Clav, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Clav_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Clav_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Dibujo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Dib_Internalname, GXutil.rtrim( A10854Er_Dib), GXutil.rtrim( localUtil.format( A10854Er_Dib, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Dib_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Dib_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Vte", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Vte_Internalname, GXutil.rtrim( A10855Er_Vte), GXutil.rtrim( localUtil.format( A10855Er_Vte, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Vte_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Vte_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10856Er_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Kgs_Enabled!=0) ? localUtil.format( A10856Er_Kgs, "ZZZZZ9.99") : localUtil.format( A10856Er_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A10857Er_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Mts_Enabled!=0) ? localUtil.format( A10857Er_Mts, "ZZZZZ9.99") : localUtil.format( A10857Er_Mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Mts_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Partida(s)", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Pdas_Internalname, GXutil.rtrim( A10858Er_Pdas), GXutil.rtrim( localUtil.format( A10858Er_Pdas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Pdas_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Pdas_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fec Hdr", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEr_FecH_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_FecH_Internalname, localUtil.format(A10859Er_FecH, "99/99/99"), localUtil.format( A10859Er_FecH, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_FecH_Jsonclick, 0, "", "", "", "", "", 1, edtEr_FecH_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEr_FecH_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEr_FecH_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TERPROD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Fec Disp", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEr_FecD_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_FecD_Internalname, localUtil.format(A10860Er_FecD, "99/99/99"), localUtil.format( A10860Er_FecD, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_FecD_Jsonclick, 0, "", "", "", "", "", 1, edtEr_FecD_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEr_FecD_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEr_FecD_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TERPROD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Fase Ult", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_FsUlt_Internalname, GXutil.rtrim( A10861Er_FsUlt), GXutil.rtrim( localUtil.format( A10861Er_FsUlt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_FsUlt_Jsonclick, 0, "", "", "", "", "", 1, edtEr_FsUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Fec Ult", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEr_FsUltF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_FsUltF_Internalname, localUtil.format(A10862Er_FsUltF, "99/99/99"), localUtil.format( A10862Er_FsUltF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_FsUltF_Jsonclick, 0, "", "", "", "", "", 1, edtEr_FsUltF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEr_FsUltF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEr_FsUltF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TERPROD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Fase Sig", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_FsSg_Internalname, GXutil.rtrim( A10863Er_FsSg), GXutil.rtrim( localUtil.format( A10863Er_FsSg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_FsSg_Jsonclick, 0, "", "", "", "", "", 1, edtEr_FsSg_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Tipo Art", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_TArt_Internalname, GXutil.rtrim( A10864Er_TArt), GXutil.rtrim( localUtil.format( A10864Er_TArt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_TArt_Jsonclick, 0, "", "", "", "", "", 1, edtEr_TArt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Clase Art", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Clas_Internalname, GXutil.rtrim( A10865Er_Clas), GXutil.rtrim( localUtil.format( A10865Er_Clas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Clas_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Clas_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "UM", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Um_Internalname, GXutil.rtrim( A10866Er_Um), GXutil.rtrim( localUtil.format( A10866Er_Um, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Um_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Um_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "N1", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_vN1_Internalname, GXutil.rtrim( A10867Er_vN1), GXutil.rtrim( localUtil.format( A10867Er_vN1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_vN1_Jsonclick, 0, "", "", "", "", "", 1, edtEr_vN1_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "N2", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_vN2_Internalname, GXutil.rtrim( A10868Er_vN2), GXutil.rtrim( localUtil.format( A10868Er_vN2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_vN2_Jsonclick, 0, "", "", "", "", "", 1, edtEr_vN2_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "N3", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_vN3_Internalname, GXutil.rtrim( A10869Er_vN3), GXutil.rtrim( localUtil.format( A10869Er_vN3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_vN3_Jsonclick, 0, "", "", "", "", "", 1, edtEr_vN3_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "N4", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_vN4_Internalname, GXutil.rtrim( A10870Er_vN4), GXutil.rtrim( localUtil.format( A10870Er_vN4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_vN4_Jsonclick, 0, "", "", "", "", "", 1, edtEr_vN4_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Ultima Linea Fraccionado", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Ultf_Internalname, GXutil.ltrim( localUtil.ntoc( A10871Er_Ultf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Ultf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10871Er_Ultf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10871Er_Ultf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Ultf_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Ultf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "N de Hdrs en linea (Particiones)", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Nhdrs_Internalname, GXutil.ltrim( localUtil.ntoc( A10879Er_Nhdrs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Nhdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10879Er_Nhdrs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10879Er_Nhdrs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Nhdrs_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Nhdrs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Disposicion Interna", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Discod_Internalname, GXutil.ltrim( localUtil.ntoc( A10880Er_Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10880Er_Discod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10880Er_Discod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Discod_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Discod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Situacion HDR", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_St_Internalname, GXutil.ltrim( localUtil.ntoc( A10889Er_St, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_St_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10889Er_St), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10889Er_St), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_St_Jsonclick, 0, "", "", "", "", "", 1, edtEr_St_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10890Er_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEr_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10890Er_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A10890Er_Est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Est_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Articulos Partidas", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Arts_Internalname, GXutil.rtrim( A10974Er_Arts), GXutil.rtrim( localUtil.format( A10974Er_Arts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Arts_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Arts_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Descripcion Articulos", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Artd_Internalname, GXutil.rtrim( A10975Er_Artd), GXutil.rtrim( localUtil.format( A10975Er_Artd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Artd_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Artd_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Anchos Partidas", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEr_Arta_Internalname, GXutil.rtrim( A10976Er_Arta), GXutil.rtrim( localUtil.format( A10976Er_Arta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEr_Arta_Jsonclick, 0, "", "", "", "", "", 1, edtEr_Arta_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TERPROD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TERPROD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TERPROD.htm");
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
      e1119R2 ();
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
            Z10849Er_ToE = httpContext.cgiGet( "Z10849Er_ToE") ;
            Z10850Er_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10850Er_Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10851Er_Arti = httpContext.cgiGet( "Z10851Er_Arti") ;
            Z10852Er_Color = httpContext.cgiGet( "Z10852Er_Color") ;
            Z10853Er_Clav = httpContext.cgiGet( "Z10853Er_Clav") ;
            Z10854Er_Dib = httpContext.cgiGet( "Z10854Er_Dib") ;
            Z10855Er_Vte = httpContext.cgiGet( "Z10855Er_Vte") ;
            Z10856Er_Kgs = localUtil.ctond( httpContext.cgiGet( "Z10856Er_Kgs")) ;
            Z10857Er_Mts = localUtil.ctond( httpContext.cgiGet( "Z10857Er_Mts")) ;
            Z10858Er_Pdas = httpContext.cgiGet( "Z10858Er_Pdas") ;
            Z10859Er_FecH = localUtil.ctod( httpContext.cgiGet( "Z10859Er_FecH"), 0) ;
            Z10860Er_FecD = localUtil.ctod( httpContext.cgiGet( "Z10860Er_FecD"), 0) ;
            Z10861Er_FsUlt = httpContext.cgiGet( "Z10861Er_FsUlt") ;
            Z10862Er_FsUltF = localUtil.ctod( httpContext.cgiGet( "Z10862Er_FsUltF"), 0) ;
            Z10863Er_FsSg = httpContext.cgiGet( "Z10863Er_FsSg") ;
            Z10864Er_TArt = httpContext.cgiGet( "Z10864Er_TArt") ;
            Z10865Er_Clas = httpContext.cgiGet( "Z10865Er_Clas") ;
            Z10866Er_Um = httpContext.cgiGet( "Z10866Er_Um") ;
            Z10867Er_vN1 = httpContext.cgiGet( "Z10867Er_vN1") ;
            Z10868Er_vN2 = httpContext.cgiGet( "Z10868Er_vN2") ;
            Z10869Er_vN3 = httpContext.cgiGet( "Z10869Er_vN3") ;
            Z10870Er_vN4 = httpContext.cgiGet( "Z10870Er_vN4") ;
            Z10871Er_Ultf = (short)(localUtil.ctol( httpContext.cgiGet( "Z10871Er_Ultf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10879Er_Nhdrs = (short)(localUtil.ctol( httpContext.cgiGet( "Z10879Er_Nhdrs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10880Er_Discod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10880Er_Discod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10889Er_St = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10889Er_St"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10890Er_Est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10890Er_Est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10974Er_Arts = httpContext.cgiGet( "Z10974Er_Arts") ;
            Z10975Er_Artd = httpContext.cgiGet( "Z10975Er_Artd") ;
            Z10976Er_Arta = httpContext.cgiGet( "Z10976Er_Arta") ;
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
            A10849Er_ToE = httpContext.cgiGet( edtEr_ToE_Internalname) ;
            n10849Er_ToE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10849Er_ToE", A10849Er_ToE);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Clicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10850Er_Clicod = 0 ;
               n10850Er_Clicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10850Er_Clicod), 6, 0));
            }
            else
            {
               A10850Er_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtEr_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10850Er_Clicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10850Er_Clicod), 6, 0));
            }
            A10851Er_Arti = httpContext.cgiGet( edtEr_Arti_Internalname) ;
            n10851Er_Arti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10851Er_Arti", A10851Er_Arti);
            A10852Er_Color = httpContext.cgiGet( edtEr_Color_Internalname) ;
            n10852Er_Color = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10852Er_Color", A10852Er_Color);
            A10853Er_Clav = httpContext.cgiGet( edtEr_Clav_Internalname) ;
            n10853Er_Clav = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10853Er_Clav", A10853Er_Clav);
            A10854Er_Dib = httpContext.cgiGet( edtEr_Dib_Internalname) ;
            n10854Er_Dib = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10854Er_Dib", A10854Er_Dib);
            A10855Er_Vte = httpContext.cgiGet( edtEr_Vte_Internalname) ;
            n10855Er_Vte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10855Er_Vte", A10855Er_Vte);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEr_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEr_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10856Er_Kgs = DecimalUtil.ZERO ;
               n10856Er_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrimstr( A10856Er_Kgs, 9, 2));
            }
            else
            {
               A10856Er_Kgs = localUtil.ctond( httpContext.cgiGet( edtEr_Kgs_Internalname)) ;
               n10856Er_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrimstr( A10856Er_Kgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEr_Mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEr_Mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_MTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Mts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10857Er_Mts = DecimalUtil.ZERO ;
               n10857Er_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrimstr( A10857Er_Mts, 9, 2));
            }
            else
            {
               A10857Er_Mts = localUtil.ctond( httpContext.cgiGet( edtEr_Mts_Internalname)) ;
               n10857Er_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrimstr( A10857Er_Mts, 9, 2));
            }
            A10858Er_Pdas = httpContext.cgiGet( edtEr_Pdas_Internalname) ;
            n10858Er_Pdas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10858Er_Pdas", A10858Er_Pdas);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEr_FecH_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ER_FECH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_FecH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10859Er_FecH = GXutil.nullDate() ;
               n10859Er_FecH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
            }
            else
            {
               A10859Er_FecH = localUtil.ctod( httpContext.cgiGet( edtEr_FecH_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10859Er_FecH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEr_FecD_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ER_FECD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_FecD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10860Er_FecD = GXutil.nullDate() ;
               n10860Er_FecD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
            }
            else
            {
               A10860Er_FecD = localUtil.ctod( httpContext.cgiGet( edtEr_FecD_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10860Er_FecD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
            }
            A10861Er_FsUlt = httpContext.cgiGet( edtEr_FsUlt_Internalname) ;
            n10861Er_FsUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10861Er_FsUlt", A10861Er_FsUlt);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEr_FsUltF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ER_FSULTF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_FsUltF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10862Er_FsUltF = GXutil.nullDate() ;
               n10862Er_FsUltF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
            }
            else
            {
               A10862Er_FsUltF = localUtil.ctod( httpContext.cgiGet( edtEr_FsUltF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10862Er_FsUltF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
            }
            A10863Er_FsSg = httpContext.cgiGet( edtEr_FsSg_Internalname) ;
            n10863Er_FsSg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10863Er_FsSg", A10863Er_FsSg);
            A10864Er_TArt = httpContext.cgiGet( edtEr_TArt_Internalname) ;
            n10864Er_TArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10864Er_TArt", A10864Er_TArt);
            A10865Er_Clas = httpContext.cgiGet( edtEr_Clas_Internalname) ;
            n10865Er_Clas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10865Er_Clas", A10865Er_Clas);
            A10866Er_Um = httpContext.cgiGet( edtEr_Um_Internalname) ;
            n10866Er_Um = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10866Er_Um", A10866Er_Um);
            A10867Er_vN1 = httpContext.cgiGet( edtEr_vN1_Internalname) ;
            n10867Er_vN1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10867Er_vN1", A10867Er_vN1);
            A10868Er_vN2 = httpContext.cgiGet( edtEr_vN2_Internalname) ;
            n10868Er_vN2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10868Er_vN2", A10868Er_vN2);
            A10869Er_vN3 = httpContext.cgiGet( edtEr_vN3_Internalname) ;
            n10869Er_vN3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10869Er_vN3", A10869Er_vN3);
            A10870Er_vN4 = httpContext.cgiGet( edtEr_vN4_Internalname) ;
            n10870Er_vN4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10870Er_vN4", A10870Er_vN4);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Ultf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Ultf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_ULTF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Ultf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10871Er_Ultf = (short)(0) ;
               n10871Er_Ultf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10871Er_Ultf), 4, 0));
            }
            else
            {
               A10871Er_Ultf = (short)(localUtil.ctol( httpContext.cgiGet( edtEr_Ultf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10871Er_Ultf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10871Er_Ultf), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Nhdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Nhdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_NHDRS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Nhdrs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10879Er_Nhdrs = (short)(0) ;
               n10879Er_Nhdrs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10879Er_Nhdrs), 4, 0));
            }
            else
            {
               A10879Er_Nhdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtEr_Nhdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10879Er_Nhdrs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10879Er_Nhdrs), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Discod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10880Er_Discod = 0 ;
               n10880Er_Discod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10880Er_Discod), 8, 0));
            }
            else
            {
               A10880Er_Discod = (int)(localUtil.ctol( httpContext.cgiGet( edtEr_Discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10880Er_Discod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10880Er_Discod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_ST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_St_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10889Er_St = (byte)(0) ;
               n10889Er_St = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10889Er_St), 2, 0));
            }
            else
            {
               A10889Er_St = (byte)(localUtil.ctol( httpContext.cgiGet( edtEr_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10889Er_St = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10889Er_St), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEr_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ER_EST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEr_Est_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10890Er_Est = (byte)(0) ;
               n10890Er_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.str( A10890Er_Est, 1, 0));
            }
            else
            {
               A10890Er_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtEr_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10890Er_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.str( A10890Er_Est, 1, 0));
            }
            A10974Er_Arts = httpContext.cgiGet( edtEr_Arts_Internalname) ;
            n10974Er_Arts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10974Er_Arts", A10974Er_Arts);
            A10975Er_Artd = httpContext.cgiGet( edtEr_Artd_Internalname) ;
            n10975Er_Artd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10975Er_Artd", A10975Er_Artd);
            A10976Er_Arta = httpContext.cgiGet( edtEr_Arta_Internalname) ;
            n10976Er_Arta = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10976Er_Arta", A10976Er_Arta);
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
                        e1119R2 ();
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
            initAll19R1449( ) ;
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
      disableAttributes19R1449( ) ;
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

   public void confirm_19R0( )
   {
      beforeValidate19R1449( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19R1449( ) ;
         }
         else
         {
            checkExtendedTable19R1449( ) ;
            if ( AnyError == 0 )
            {
               zm19R1449( 2) ;
            }
            closeExtendedTableCursors19R1449( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues19R0( ) ;
      }
   }

   public void resetCaption19R0( )
   {
   }

   public void e1119R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      terprod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      terprod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      terprod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      terprod_impl.this.A396EmprCod = GXv_char2[0] ;
      terprod_impl.this.AV11EmprNom = GXv_char3[0] ;
      terprod_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm19R1449( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10849Er_ToE = T019R3_A10849Er_ToE[0] ;
            Z10850Er_Clicod = T019R3_A10850Er_Clicod[0] ;
            Z10851Er_Arti = T019R3_A10851Er_Arti[0] ;
            Z10852Er_Color = T019R3_A10852Er_Color[0] ;
            Z10853Er_Clav = T019R3_A10853Er_Clav[0] ;
            Z10854Er_Dib = T019R3_A10854Er_Dib[0] ;
            Z10855Er_Vte = T019R3_A10855Er_Vte[0] ;
            Z10856Er_Kgs = T019R3_A10856Er_Kgs[0] ;
            Z10857Er_Mts = T019R3_A10857Er_Mts[0] ;
            Z10858Er_Pdas = T019R3_A10858Er_Pdas[0] ;
            Z10859Er_FecH = T019R3_A10859Er_FecH[0] ;
            Z10860Er_FecD = T019R3_A10860Er_FecD[0] ;
            Z10861Er_FsUlt = T019R3_A10861Er_FsUlt[0] ;
            Z10862Er_FsUltF = T019R3_A10862Er_FsUltF[0] ;
            Z10863Er_FsSg = T019R3_A10863Er_FsSg[0] ;
            Z10864Er_TArt = T019R3_A10864Er_TArt[0] ;
            Z10865Er_Clas = T019R3_A10865Er_Clas[0] ;
            Z10866Er_Um = T019R3_A10866Er_Um[0] ;
            Z10867Er_vN1 = T019R3_A10867Er_vN1[0] ;
            Z10868Er_vN2 = T019R3_A10868Er_vN2[0] ;
            Z10869Er_vN3 = T019R3_A10869Er_vN3[0] ;
            Z10870Er_vN4 = T019R3_A10870Er_vN4[0] ;
            Z10871Er_Ultf = T019R3_A10871Er_Ultf[0] ;
            Z10879Er_Nhdrs = T019R3_A10879Er_Nhdrs[0] ;
            Z10880Er_Discod = T019R3_A10880Er_Discod[0] ;
            Z10889Er_St = T019R3_A10889Er_St[0] ;
            Z10890Er_Est = T019R3_A10890Er_Est[0] ;
            Z10974Er_Arts = T019R3_A10974Er_Arts[0] ;
            Z10975Er_Artd = T019R3_A10975Er_Artd[0] ;
            Z10976Er_Arta = T019R3_A10976Er_Arta[0] ;
         }
         else
         {
            Z10849Er_ToE = A10849Er_ToE ;
            Z10850Er_Clicod = A10850Er_Clicod ;
            Z10851Er_Arti = A10851Er_Arti ;
            Z10852Er_Color = A10852Er_Color ;
            Z10853Er_Clav = A10853Er_Clav ;
            Z10854Er_Dib = A10854Er_Dib ;
            Z10855Er_Vte = A10855Er_Vte ;
            Z10856Er_Kgs = A10856Er_Kgs ;
            Z10857Er_Mts = A10857Er_Mts ;
            Z10858Er_Pdas = A10858Er_Pdas ;
            Z10859Er_FecH = A10859Er_FecH ;
            Z10860Er_FecD = A10860Er_FecD ;
            Z10861Er_FsUlt = A10861Er_FsUlt ;
            Z10862Er_FsUltF = A10862Er_FsUltF ;
            Z10863Er_FsSg = A10863Er_FsSg ;
            Z10864Er_TArt = A10864Er_TArt ;
            Z10865Er_Clas = A10865Er_Clas ;
            Z10866Er_Um = A10866Er_Um ;
            Z10867Er_vN1 = A10867Er_vN1 ;
            Z10868Er_vN2 = A10868Er_vN2 ;
            Z10869Er_vN3 = A10869Er_vN3 ;
            Z10870Er_vN4 = A10870Er_vN4 ;
            Z10871Er_Ultf = A10871Er_Ultf ;
            Z10879Er_Nhdrs = A10879Er_Nhdrs ;
            Z10880Er_Discod = A10880Er_Discod ;
            Z10889Er_St = A10889Er_St ;
            Z10890Er_Est = A10890Er_Est ;
            Z10974Er_Arts = A10974Er_Arts ;
            Z10975Er_Artd = A10975Er_Artd ;
            Z10976Er_Arta = A10976Er_Arta ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10872Er_Hdr = A10872Er_Hdr ;
         Z10873Er_Hdrr = A10873Er_Hdrr ;
         Z10874Er_hdrp = A10874Er_hdrp ;
         Z10875Er_LinV = A10875Er_LinV ;
         Z10849Er_ToE = A10849Er_ToE ;
         Z10850Er_Clicod = A10850Er_Clicod ;
         Z10851Er_Arti = A10851Er_Arti ;
         Z10852Er_Color = A10852Er_Color ;
         Z10853Er_Clav = A10853Er_Clav ;
         Z10854Er_Dib = A10854Er_Dib ;
         Z10855Er_Vte = A10855Er_Vte ;
         Z10856Er_Kgs = A10856Er_Kgs ;
         Z10857Er_Mts = A10857Er_Mts ;
         Z10858Er_Pdas = A10858Er_Pdas ;
         Z10859Er_FecH = A10859Er_FecH ;
         Z10860Er_FecD = A10860Er_FecD ;
         Z10861Er_FsUlt = A10861Er_FsUlt ;
         Z10862Er_FsUltF = A10862Er_FsUltF ;
         Z10863Er_FsSg = A10863Er_FsSg ;
         Z10864Er_TArt = A10864Er_TArt ;
         Z10865Er_Clas = A10865Er_Clas ;
         Z10866Er_Um = A10866Er_Um ;
         Z10867Er_vN1 = A10867Er_vN1 ;
         Z10868Er_vN2 = A10868Er_vN2 ;
         Z10869Er_vN3 = A10869Er_vN3 ;
         Z10870Er_vN4 = A10870Er_vN4 ;
         Z10871Er_Ultf = A10871Er_Ultf ;
         Z10879Er_Nhdrs = A10879Er_Nhdrs ;
         Z10880Er_Discod = A10880Er_Discod ;
         Z10889Er_St = A10889Er_St ;
         Z10890Er_Est = A10890Er_Est ;
         Z10974Er_Arts = A10974Er_Arts ;
         Z10975Er_Artd = A10975Er_Artd ;
         Z10976Er_Arta = A10976Er_Arta ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TERPROD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T019R4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019R4_A407EmprNom[0] ;
      n407EmprNom = T019R4_n407EmprNom[0] ;
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

   public void load19R1449( )
   {
      /* Using cursor T019R5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1449 = (short)(1) ;
         A407EmprNom = T019R5_A407EmprNom[0] ;
         n407EmprNom = T019R5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10849Er_ToE = T019R5_A10849Er_ToE[0] ;
         n10849Er_ToE = T019R5_n10849Er_ToE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10849Er_ToE", A10849Er_ToE);
         A10850Er_Clicod = T019R5_A10850Er_Clicod[0] ;
         n10850Er_Clicod = T019R5_n10850Er_Clicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10850Er_Clicod), 6, 0));
         A10851Er_Arti = T019R5_A10851Er_Arti[0] ;
         n10851Er_Arti = T019R5_n10851Er_Arti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10851Er_Arti", A10851Er_Arti);
         A10852Er_Color = T019R5_A10852Er_Color[0] ;
         n10852Er_Color = T019R5_n10852Er_Color[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10852Er_Color", A10852Er_Color);
         A10853Er_Clav = T019R5_A10853Er_Clav[0] ;
         n10853Er_Clav = T019R5_n10853Er_Clav[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10853Er_Clav", A10853Er_Clav);
         A10854Er_Dib = T019R5_A10854Er_Dib[0] ;
         n10854Er_Dib = T019R5_n10854Er_Dib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10854Er_Dib", A10854Er_Dib);
         A10855Er_Vte = T019R5_A10855Er_Vte[0] ;
         n10855Er_Vte = T019R5_n10855Er_Vte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10855Er_Vte", A10855Er_Vte);
         A10856Er_Kgs = T019R5_A10856Er_Kgs[0] ;
         n10856Er_Kgs = T019R5_n10856Er_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrimstr( A10856Er_Kgs, 9, 2));
         A10857Er_Mts = T019R5_A10857Er_Mts[0] ;
         n10857Er_Mts = T019R5_n10857Er_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrimstr( A10857Er_Mts, 9, 2));
         A10858Er_Pdas = T019R5_A10858Er_Pdas[0] ;
         n10858Er_Pdas = T019R5_n10858Er_Pdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10858Er_Pdas", A10858Er_Pdas);
         A10859Er_FecH = T019R5_A10859Er_FecH[0] ;
         n10859Er_FecH = T019R5_n10859Er_FecH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
         A10860Er_FecD = T019R5_A10860Er_FecD[0] ;
         n10860Er_FecD = T019R5_n10860Er_FecD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
         A10861Er_FsUlt = T019R5_A10861Er_FsUlt[0] ;
         n10861Er_FsUlt = T019R5_n10861Er_FsUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10861Er_FsUlt", A10861Er_FsUlt);
         A10862Er_FsUltF = T019R5_A10862Er_FsUltF[0] ;
         n10862Er_FsUltF = T019R5_n10862Er_FsUltF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
         A10863Er_FsSg = T019R5_A10863Er_FsSg[0] ;
         n10863Er_FsSg = T019R5_n10863Er_FsSg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10863Er_FsSg", A10863Er_FsSg);
         A10864Er_TArt = T019R5_A10864Er_TArt[0] ;
         n10864Er_TArt = T019R5_n10864Er_TArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10864Er_TArt", A10864Er_TArt);
         A10865Er_Clas = T019R5_A10865Er_Clas[0] ;
         n10865Er_Clas = T019R5_n10865Er_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10865Er_Clas", A10865Er_Clas);
         A10866Er_Um = T019R5_A10866Er_Um[0] ;
         n10866Er_Um = T019R5_n10866Er_Um[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10866Er_Um", A10866Er_Um);
         A10867Er_vN1 = T019R5_A10867Er_vN1[0] ;
         n10867Er_vN1 = T019R5_n10867Er_vN1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10867Er_vN1", A10867Er_vN1);
         A10868Er_vN2 = T019R5_A10868Er_vN2[0] ;
         n10868Er_vN2 = T019R5_n10868Er_vN2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10868Er_vN2", A10868Er_vN2);
         A10869Er_vN3 = T019R5_A10869Er_vN3[0] ;
         n10869Er_vN3 = T019R5_n10869Er_vN3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10869Er_vN3", A10869Er_vN3);
         A10870Er_vN4 = T019R5_A10870Er_vN4[0] ;
         n10870Er_vN4 = T019R5_n10870Er_vN4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10870Er_vN4", A10870Er_vN4);
         A10871Er_Ultf = T019R5_A10871Er_Ultf[0] ;
         n10871Er_Ultf = T019R5_n10871Er_Ultf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10871Er_Ultf), 4, 0));
         A10879Er_Nhdrs = T019R5_A10879Er_Nhdrs[0] ;
         n10879Er_Nhdrs = T019R5_n10879Er_Nhdrs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10879Er_Nhdrs), 4, 0));
         A10880Er_Discod = T019R5_A10880Er_Discod[0] ;
         n10880Er_Discod = T019R5_n10880Er_Discod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10880Er_Discod), 8, 0));
         A10889Er_St = T019R5_A10889Er_St[0] ;
         n10889Er_St = T019R5_n10889Er_St[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10889Er_St), 2, 0));
         A10890Er_Est = T019R5_A10890Er_Est[0] ;
         n10890Er_Est = T019R5_n10890Er_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.str( A10890Er_Est, 1, 0));
         A10974Er_Arts = T019R5_A10974Er_Arts[0] ;
         n10974Er_Arts = T019R5_n10974Er_Arts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10974Er_Arts", A10974Er_Arts);
         A10975Er_Artd = T019R5_A10975Er_Artd[0] ;
         n10975Er_Artd = T019R5_n10975Er_Artd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10975Er_Artd", A10975Er_Artd);
         A10976Er_Arta = T019R5_A10976Er_Arta[0] ;
         n10976Er_Arta = T019R5_n10976Er_Arta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10976Er_Arta", A10976Er_Arta);
         zm19R1449( -1) ;
      }
      pr_default.close(3);
      onLoadActions19R1449( ) ;
   }

   public void onLoadActions19R1449( )
   {
   }

   public void checkExtendedTable19R1449( )
   {
      nIsDirty_1449 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors19R1449( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey19R1449( )
   {
      /* Using cursor T019R6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1449 = (short)(1) ;
      }
      else
      {
         RcdFound1449 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T019R3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19R1449( 1) ;
         RcdFound1449 = (short)(1) ;
         A10872Er_Hdr = T019R3_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019R3_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019R3_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019R3_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
         A10849Er_ToE = T019R3_A10849Er_ToE[0] ;
         n10849Er_ToE = T019R3_n10849Er_ToE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10849Er_ToE", A10849Er_ToE);
         A10850Er_Clicod = T019R3_A10850Er_Clicod[0] ;
         n10850Er_Clicod = T019R3_n10850Er_Clicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10850Er_Clicod), 6, 0));
         A10851Er_Arti = T019R3_A10851Er_Arti[0] ;
         n10851Er_Arti = T019R3_n10851Er_Arti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10851Er_Arti", A10851Er_Arti);
         A10852Er_Color = T019R3_A10852Er_Color[0] ;
         n10852Er_Color = T019R3_n10852Er_Color[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10852Er_Color", A10852Er_Color);
         A10853Er_Clav = T019R3_A10853Er_Clav[0] ;
         n10853Er_Clav = T019R3_n10853Er_Clav[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10853Er_Clav", A10853Er_Clav);
         A10854Er_Dib = T019R3_A10854Er_Dib[0] ;
         n10854Er_Dib = T019R3_n10854Er_Dib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10854Er_Dib", A10854Er_Dib);
         A10855Er_Vte = T019R3_A10855Er_Vte[0] ;
         n10855Er_Vte = T019R3_n10855Er_Vte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10855Er_Vte", A10855Er_Vte);
         A10856Er_Kgs = T019R3_A10856Er_Kgs[0] ;
         n10856Er_Kgs = T019R3_n10856Er_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrimstr( A10856Er_Kgs, 9, 2));
         A10857Er_Mts = T019R3_A10857Er_Mts[0] ;
         n10857Er_Mts = T019R3_n10857Er_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrimstr( A10857Er_Mts, 9, 2));
         A10858Er_Pdas = T019R3_A10858Er_Pdas[0] ;
         n10858Er_Pdas = T019R3_n10858Er_Pdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10858Er_Pdas", A10858Er_Pdas);
         A10859Er_FecH = T019R3_A10859Er_FecH[0] ;
         n10859Er_FecH = T019R3_n10859Er_FecH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
         A10860Er_FecD = T019R3_A10860Er_FecD[0] ;
         n10860Er_FecD = T019R3_n10860Er_FecD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
         A10861Er_FsUlt = T019R3_A10861Er_FsUlt[0] ;
         n10861Er_FsUlt = T019R3_n10861Er_FsUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10861Er_FsUlt", A10861Er_FsUlt);
         A10862Er_FsUltF = T019R3_A10862Er_FsUltF[0] ;
         n10862Er_FsUltF = T019R3_n10862Er_FsUltF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
         A10863Er_FsSg = T019R3_A10863Er_FsSg[0] ;
         n10863Er_FsSg = T019R3_n10863Er_FsSg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10863Er_FsSg", A10863Er_FsSg);
         A10864Er_TArt = T019R3_A10864Er_TArt[0] ;
         n10864Er_TArt = T019R3_n10864Er_TArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10864Er_TArt", A10864Er_TArt);
         A10865Er_Clas = T019R3_A10865Er_Clas[0] ;
         n10865Er_Clas = T019R3_n10865Er_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10865Er_Clas", A10865Er_Clas);
         A10866Er_Um = T019R3_A10866Er_Um[0] ;
         n10866Er_Um = T019R3_n10866Er_Um[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10866Er_Um", A10866Er_Um);
         A10867Er_vN1 = T019R3_A10867Er_vN1[0] ;
         n10867Er_vN1 = T019R3_n10867Er_vN1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10867Er_vN1", A10867Er_vN1);
         A10868Er_vN2 = T019R3_A10868Er_vN2[0] ;
         n10868Er_vN2 = T019R3_n10868Er_vN2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10868Er_vN2", A10868Er_vN2);
         A10869Er_vN3 = T019R3_A10869Er_vN3[0] ;
         n10869Er_vN3 = T019R3_n10869Er_vN3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10869Er_vN3", A10869Er_vN3);
         A10870Er_vN4 = T019R3_A10870Er_vN4[0] ;
         n10870Er_vN4 = T019R3_n10870Er_vN4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10870Er_vN4", A10870Er_vN4);
         A10871Er_Ultf = T019R3_A10871Er_Ultf[0] ;
         n10871Er_Ultf = T019R3_n10871Er_Ultf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10871Er_Ultf), 4, 0));
         A10879Er_Nhdrs = T019R3_A10879Er_Nhdrs[0] ;
         n10879Er_Nhdrs = T019R3_n10879Er_Nhdrs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10879Er_Nhdrs), 4, 0));
         A10880Er_Discod = T019R3_A10880Er_Discod[0] ;
         n10880Er_Discod = T019R3_n10880Er_Discod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10880Er_Discod), 8, 0));
         A10889Er_St = T019R3_A10889Er_St[0] ;
         n10889Er_St = T019R3_n10889Er_St[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10889Er_St), 2, 0));
         A10890Er_Est = T019R3_A10890Er_Est[0] ;
         n10890Er_Est = T019R3_n10890Er_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.str( A10890Er_Est, 1, 0));
         A10974Er_Arts = T019R3_A10974Er_Arts[0] ;
         n10974Er_Arts = T019R3_n10974Er_Arts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10974Er_Arts", A10974Er_Arts);
         A10975Er_Artd = T019R3_A10975Er_Artd[0] ;
         n10975Er_Artd = T019R3_n10975Er_Artd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10975Er_Artd", A10975Er_Artd);
         A10976Er_Arta = T019R3_A10976Er_Arta[0] ;
         n10976Er_Arta = T019R3_n10976Er_Arta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10976Er_Arta", A10976Er_Arta);
         Z396EmprCod = A396EmprCod ;
         Z10872Er_Hdr = A10872Er_Hdr ;
         Z10873Er_Hdrr = A10873Er_Hdrr ;
         Z10874Er_hdrp = A10874Er_hdrp ;
         Z10875Er_LinV = A10875Er_LinV ;
         sMode1449 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load19R1449( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1449 = (short)(0) ;
            initializeNonKey19R1449( ) ;
         }
         Gx_mode = sMode1449 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1449 = (short)(0) ;
         initializeNonKey19R1449( ) ;
         sMode1449 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1449 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey19R1449( ) ;
      if ( RcdFound1449 == 0 )
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
      RcdFound1449 = (short)(0) ;
      /* Using cursor T019R7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A10872Er_Hdr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), A10874Er_hdrp, A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10875Er_LinV), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T019R7_A10872Er_Hdr[0] < A10872Er_Hdr ) || ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R7_A10873Er_Hdrr[0] < A10873Er_Hdrr ) || ( T019R7_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019R7_A10874Er_hdrp[0], A10874Er_hdrp) < 0 ) || ( GXutil.strcmp(T019R7_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019R7_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R7_A10875Er_LinV[0] < A10875Er_LinV ) ) && ( GXutil.strcmp(T019R7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T019R7_A10872Er_Hdr[0] > A10872Er_Hdr ) || ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R7_A10873Er_Hdrr[0] > A10873Er_Hdrr ) || ( T019R7_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019R7_A10874Er_hdrp[0], A10874Er_hdrp) > 0 ) || ( GXutil.strcmp(T019R7_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019R7_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R7_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R7_A10875Er_LinV[0] > A10875Er_LinV ) ) && ( GXutil.strcmp(T019R7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10872Er_Hdr = T019R7_A10872Er_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = T019R7_A10873Er_Hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = T019R7_A10874Er_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = T019R7_A10875Er_LinV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            RcdFound1449 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1449 = (short)(0) ;
      /* Using cursor T019R8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A10872Er_Hdr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), A10874Er_hdrp, A10874Er_hdrp, Byte.valueOf(A10873Er_Hdrr), Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10875Er_LinV), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T019R8_A10872Er_Hdr[0] > A10872Er_Hdr ) || ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R8_A10873Er_Hdrr[0] > A10873Er_Hdrr ) || ( T019R8_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019R8_A10874Er_hdrp[0], A10874Er_hdrp) > 0 ) || ( GXutil.strcmp(T019R8_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019R8_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R8_A10875Er_LinV[0] > A10875Er_LinV ) ) && ( GXutil.strcmp(T019R8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T019R8_A10872Er_Hdr[0] < A10872Er_Hdr ) || ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R8_A10873Er_Hdrr[0] < A10873Er_Hdrr ) || ( T019R8_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( GXutil.strcmp(T019R8_A10874Er_hdrp[0], A10874Er_hdrp) < 0 ) || ( GXutil.strcmp(T019R8_A10874Er_hdrp[0], A10874Er_hdrp) == 0 ) && ( T019R8_A10873Er_Hdrr[0] == A10873Er_Hdrr ) && ( T019R8_A10872Er_Hdr[0] == A10872Er_Hdr ) && ( T019R8_A10875Er_LinV[0] < A10875Er_LinV ) ) && ( GXutil.strcmp(T019R8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10872Er_Hdr = T019R8_A10872Er_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = T019R8_A10873Er_Hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = T019R8_A10874Er_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = T019R8_A10875Er_LinV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
            RcdFound1449 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19R1449( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEr_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19R1449( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1449 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) )
            {
               A10872Er_Hdr = Z10872Er_Hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
               A10873Er_Hdrr = Z10873Er_Hdrr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
               A10874Er_hdrp = Z10874Er_hdrp ;
               httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
               A10875Er_LinV = Z10875Er_LinV ;
               httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
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
               update19R1449( ) ;
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEr_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19R1449( ) ;
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
                  insert19R1449( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) )
      {
         A10872Er_Hdr = Z10872Er_Hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = Z10873Er_Hdrr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = Z10874Er_hdrp ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = Z10875Er_LinV ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
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
      getKey19R1449( ) ;
      if ( RcdFound1449 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) )
         {
            A10872Er_Hdr = Z10872Er_Hdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
            A10873Er_Hdrr = Z10873Er_Hdrr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
            A10874Er_hdrp = Z10874Er_hdrp ;
            httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
            A10875Er_LinV = Z10875Er_LinV ;
            httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10872Er_Hdr != Z10872Er_Hdr ) || ( A10873Er_Hdrr != Z10873Er_Hdrr ) || ( GXutil.strcmp(A10874Er_hdrp, Z10874Er_hdrp) != 0 ) || ( A10875Er_LinV != Z10875Er_LinV ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "terprod");
      GX_FocusControl = edtEr_ToE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_19R0( ) ;
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
      if ( RcdFound1449 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEr_ToE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart19R1449( ) ;
      if ( RcdFound1449 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_ToE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19R1449( ) ;
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
      if ( RcdFound1449 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_ToE_Internalname ;
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
      if ( RcdFound1449 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_ToE_Internalname ;
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
      scanStart19R1449( ) ;
      if ( RcdFound1449 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1449 != 0 )
         {
            scanNext19R1449( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEr_ToE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19R1449( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19R1449( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPERPROD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10849Er_ToE, T019R2_A10849Er_ToE[0]) != 0 ) || ( Z10850Er_Clicod != T019R2_A10850Er_Clicod[0] ) || ( GXutil.strcmp(Z10851Er_Arti, T019R2_A10851Er_Arti[0]) != 0 ) || ( GXutil.strcmp(Z10852Er_Color, T019R2_A10852Er_Color[0]) != 0 ) || ( GXutil.strcmp(Z10853Er_Clav, T019R2_A10853Er_Clav[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10854Er_Dib, T019R2_A10854Er_Dib[0]) != 0 ) || ( GXutil.strcmp(Z10855Er_Vte, T019R2_A10855Er_Vte[0]) != 0 ) || ( DecimalUtil.compareTo(Z10856Er_Kgs, T019R2_A10856Er_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10857Er_Mts, T019R2_A10857Er_Mts[0]) != 0 ) || ( GXutil.strcmp(Z10858Er_Pdas, T019R2_A10858Er_Pdas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z10859Er_FecH), GXutil.resetTime(T019R2_A10859Er_FecH[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z10860Er_FecD), GXutil.resetTime(T019R2_A10860Er_FecD[0])) ) || ( GXutil.strcmp(Z10861Er_FsUlt, T019R2_A10861Er_FsUlt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10862Er_FsUltF), GXutil.resetTime(T019R2_A10862Er_FsUltF[0])) ) || ( GXutil.strcmp(Z10863Er_FsSg, T019R2_A10863Er_FsSg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10864Er_TArt, T019R2_A10864Er_TArt[0]) != 0 ) || ( GXutil.strcmp(Z10865Er_Clas, T019R2_A10865Er_Clas[0]) != 0 ) || ( GXutil.strcmp(Z10866Er_Um, T019R2_A10866Er_Um[0]) != 0 ) || ( GXutil.strcmp(Z10867Er_vN1, T019R2_A10867Er_vN1[0]) != 0 ) || ( GXutil.strcmp(Z10868Er_vN2, T019R2_A10868Er_vN2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10869Er_vN3, T019R2_A10869Er_vN3[0]) != 0 ) || ( GXutil.strcmp(Z10870Er_vN4, T019R2_A10870Er_vN4[0]) != 0 ) || ( Z10871Er_Ultf != T019R2_A10871Er_Ultf[0] ) || ( Z10879Er_Nhdrs != T019R2_A10879Er_Nhdrs[0] ) || ( Z10880Er_Discod != T019R2_A10880Er_Discod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10889Er_St != T019R2_A10889Er_St[0] ) || ( Z10890Er_Est != T019R2_A10890Er_Est[0] ) || ( GXutil.strcmp(Z10974Er_Arts, T019R2_A10974Er_Arts[0]) != 0 ) || ( GXutil.strcmp(Z10975Er_Artd, T019R2_A10975Er_Artd[0]) != 0 ) || ( GXutil.strcmp(Z10976Er_Arta, T019R2_A10976Er_Arta[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10849Er_ToE, T019R2_A10849Er_ToE[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_ToE");
               GXutil.writeLogRaw("Old: ",Z10849Er_ToE);
               GXutil.writeLogRaw("Current: ",T019R2_A10849Er_ToE[0]);
            }
            if ( Z10850Er_Clicod != T019R2_A10850Er_Clicod[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Clicod");
               GXutil.writeLogRaw("Old: ",Z10850Er_Clicod);
               GXutil.writeLogRaw("Current: ",T019R2_A10850Er_Clicod[0]);
            }
            if ( GXutil.strcmp(Z10851Er_Arti, T019R2_A10851Er_Arti[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Arti");
               GXutil.writeLogRaw("Old: ",Z10851Er_Arti);
               GXutil.writeLogRaw("Current: ",T019R2_A10851Er_Arti[0]);
            }
            if ( GXutil.strcmp(Z10852Er_Color, T019R2_A10852Er_Color[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Color");
               GXutil.writeLogRaw("Old: ",Z10852Er_Color);
               GXutil.writeLogRaw("Current: ",T019R2_A10852Er_Color[0]);
            }
            if ( GXutil.strcmp(Z10853Er_Clav, T019R2_A10853Er_Clav[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Clav");
               GXutil.writeLogRaw("Old: ",Z10853Er_Clav);
               GXutil.writeLogRaw("Current: ",T019R2_A10853Er_Clav[0]);
            }
            if ( GXutil.strcmp(Z10854Er_Dib, T019R2_A10854Er_Dib[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Dib");
               GXutil.writeLogRaw("Old: ",Z10854Er_Dib);
               GXutil.writeLogRaw("Current: ",T019R2_A10854Er_Dib[0]);
            }
            if ( GXutil.strcmp(Z10855Er_Vte, T019R2_A10855Er_Vte[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Vte");
               GXutil.writeLogRaw("Old: ",Z10855Er_Vte);
               GXutil.writeLogRaw("Current: ",T019R2_A10855Er_Vte[0]);
            }
            if ( DecimalUtil.compareTo(Z10856Er_Kgs, T019R2_A10856Er_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Kgs");
               GXutil.writeLogRaw("Old: ",Z10856Er_Kgs);
               GXutil.writeLogRaw("Current: ",T019R2_A10856Er_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z10857Er_Mts, T019R2_A10857Er_Mts[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Mts");
               GXutil.writeLogRaw("Old: ",Z10857Er_Mts);
               GXutil.writeLogRaw("Current: ",T019R2_A10857Er_Mts[0]);
            }
            if ( GXutil.strcmp(Z10858Er_Pdas, T019R2_A10858Er_Pdas[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Pdas");
               GXutil.writeLogRaw("Old: ",Z10858Er_Pdas);
               GXutil.writeLogRaw("Current: ",T019R2_A10858Er_Pdas[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10859Er_FecH), GXutil.resetTime(T019R2_A10859Er_FecH[0])) ) )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_FecH");
               GXutil.writeLogRaw("Old: ",Z10859Er_FecH);
               GXutil.writeLogRaw("Current: ",T019R2_A10859Er_FecH[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10860Er_FecD), GXutil.resetTime(T019R2_A10860Er_FecD[0])) ) )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_FecD");
               GXutil.writeLogRaw("Old: ",Z10860Er_FecD);
               GXutil.writeLogRaw("Current: ",T019R2_A10860Er_FecD[0]);
            }
            if ( GXutil.strcmp(Z10861Er_FsUlt, T019R2_A10861Er_FsUlt[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_FsUlt");
               GXutil.writeLogRaw("Old: ",Z10861Er_FsUlt);
               GXutil.writeLogRaw("Current: ",T019R2_A10861Er_FsUlt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10862Er_FsUltF), GXutil.resetTime(T019R2_A10862Er_FsUltF[0])) ) )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_FsUltF");
               GXutil.writeLogRaw("Old: ",Z10862Er_FsUltF);
               GXutil.writeLogRaw("Current: ",T019R2_A10862Er_FsUltF[0]);
            }
            if ( GXutil.strcmp(Z10863Er_FsSg, T019R2_A10863Er_FsSg[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_FsSg");
               GXutil.writeLogRaw("Old: ",Z10863Er_FsSg);
               GXutil.writeLogRaw("Current: ",T019R2_A10863Er_FsSg[0]);
            }
            if ( GXutil.strcmp(Z10864Er_TArt, T019R2_A10864Er_TArt[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_TArt");
               GXutil.writeLogRaw("Old: ",Z10864Er_TArt);
               GXutil.writeLogRaw("Current: ",T019R2_A10864Er_TArt[0]);
            }
            if ( GXutil.strcmp(Z10865Er_Clas, T019R2_A10865Er_Clas[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Clas");
               GXutil.writeLogRaw("Old: ",Z10865Er_Clas);
               GXutil.writeLogRaw("Current: ",T019R2_A10865Er_Clas[0]);
            }
            if ( GXutil.strcmp(Z10866Er_Um, T019R2_A10866Er_Um[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Um");
               GXutil.writeLogRaw("Old: ",Z10866Er_Um);
               GXutil.writeLogRaw("Current: ",T019R2_A10866Er_Um[0]);
            }
            if ( GXutil.strcmp(Z10867Er_vN1, T019R2_A10867Er_vN1[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_vN1");
               GXutil.writeLogRaw("Old: ",Z10867Er_vN1);
               GXutil.writeLogRaw("Current: ",T019R2_A10867Er_vN1[0]);
            }
            if ( GXutil.strcmp(Z10868Er_vN2, T019R2_A10868Er_vN2[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_vN2");
               GXutil.writeLogRaw("Old: ",Z10868Er_vN2);
               GXutil.writeLogRaw("Current: ",T019R2_A10868Er_vN2[0]);
            }
            if ( GXutil.strcmp(Z10869Er_vN3, T019R2_A10869Er_vN3[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_vN3");
               GXutil.writeLogRaw("Old: ",Z10869Er_vN3);
               GXutil.writeLogRaw("Current: ",T019R2_A10869Er_vN3[0]);
            }
            if ( GXutil.strcmp(Z10870Er_vN4, T019R2_A10870Er_vN4[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_vN4");
               GXutil.writeLogRaw("Old: ",Z10870Er_vN4);
               GXutil.writeLogRaw("Current: ",T019R2_A10870Er_vN4[0]);
            }
            if ( Z10871Er_Ultf != T019R2_A10871Er_Ultf[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Ultf");
               GXutil.writeLogRaw("Old: ",Z10871Er_Ultf);
               GXutil.writeLogRaw("Current: ",T019R2_A10871Er_Ultf[0]);
            }
            if ( Z10879Er_Nhdrs != T019R2_A10879Er_Nhdrs[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Nhdrs");
               GXutil.writeLogRaw("Old: ",Z10879Er_Nhdrs);
               GXutil.writeLogRaw("Current: ",T019R2_A10879Er_Nhdrs[0]);
            }
            if ( Z10880Er_Discod != T019R2_A10880Er_Discod[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Discod");
               GXutil.writeLogRaw("Old: ",Z10880Er_Discod);
               GXutil.writeLogRaw("Current: ",T019R2_A10880Er_Discod[0]);
            }
            if ( Z10889Er_St != T019R2_A10889Er_St[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_St");
               GXutil.writeLogRaw("Old: ",Z10889Er_St);
               GXutil.writeLogRaw("Current: ",T019R2_A10889Er_St[0]);
            }
            if ( Z10890Er_Est != T019R2_A10890Er_Est[0] )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Est");
               GXutil.writeLogRaw("Old: ",Z10890Er_Est);
               GXutil.writeLogRaw("Current: ",T019R2_A10890Er_Est[0]);
            }
            if ( GXutil.strcmp(Z10974Er_Arts, T019R2_A10974Er_Arts[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Arts");
               GXutil.writeLogRaw("Old: ",Z10974Er_Arts);
               GXutil.writeLogRaw("Current: ",T019R2_A10974Er_Arts[0]);
            }
            if ( GXutil.strcmp(Z10975Er_Artd, T019R2_A10975Er_Artd[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Artd");
               GXutil.writeLogRaw("Old: ",Z10975Er_Artd);
               GXutil.writeLogRaw("Current: ",T019R2_A10975Er_Artd[0]);
            }
            if ( GXutil.strcmp(Z10976Er_Arta, T019R2_A10976Er_Arta[0]) != 0 )
            {
               GXutil.writeLogln("terprod:[seudo value changed for attri]"+"Er_Arta");
               GXutil.writeLogRaw("Old: ",Z10976Er_Arta);
               GXutil.writeLogRaw("Current: ",T019R2_A10976Er_Arta[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPERPROD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19R1449( )
   {
      beforeValidate19R1449( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19R1449( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19R1449( 0) ;
         checkOptimisticConcurrency19R1449( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19R1449( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19R1449( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019R9 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Boolean.valueOf(n10849Er_ToE), A10849Er_ToE, Boolean.valueOf(n10850Er_Clicod), Integer.valueOf(A10850Er_Clicod), Boolean.valueOf(n10851Er_Arti), A10851Er_Arti, Boolean.valueOf(n10852Er_Color), A10852Er_Color, Boolean.valueOf(n10853Er_Clav), A10853Er_Clav, Boolean.valueOf(n10854Er_Dib), A10854Er_Dib, Boolean.valueOf(n10855Er_Vte), A10855Er_Vte, Boolean.valueOf(n10856Er_Kgs), A10856Er_Kgs, Boolean.valueOf(n10857Er_Mts), A10857Er_Mts, Boolean.valueOf(n10858Er_Pdas), A10858Er_Pdas, Boolean.valueOf(n10859Er_FecH), A10859Er_FecH, Boolean.valueOf(n10860Er_FecD), A10860Er_FecD, Boolean.valueOf(n10861Er_FsUlt), A10861Er_FsUlt, Boolean.valueOf(n10862Er_FsUltF), A10862Er_FsUltF, Boolean.valueOf(n10863Er_FsSg), A10863Er_FsSg, Boolean.valueOf(n10864Er_TArt), A10864Er_TArt, Boolean.valueOf(n10865Er_Clas), A10865Er_Clas, Boolean.valueOf(n10866Er_Um), A10866Er_Um, Boolean.valueOf(n10867Er_vN1), A10867Er_vN1, Boolean.valueOf(n10868Er_vN2), A10868Er_vN2, Boolean.valueOf(n10869Er_vN3), A10869Er_vN3, Boolean.valueOf(n10870Er_vN4), A10870Er_vN4, Boolean.valueOf(n10871Er_Ultf), Short.valueOf(A10871Er_Ultf), Boolean.valueOf(n10879Er_Nhdrs), Short.valueOf(A10879Er_Nhdrs), Boolean.valueOf(n10880Er_Discod), Integer.valueOf(A10880Er_Discod), Boolean.valueOf(n10889Er_St), Byte.valueOf(A10889Er_St), Boolean.valueOf(n10890Er_Est), Byte.valueOf(A10890Er_Est), Boolean.valueOf(n10974Er_Arts), A10974Er_Arts, Boolean.valueOf(n10975Er_Artd), A10975Er_Artd, Boolean.valueOf(n10976Er_Arta), A10976Er_Arta, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption19R0( ) ;
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
            load19R1449( ) ;
         }
         endLevel19R1449( ) ;
      }
      closeExtendedTableCursors19R1449( ) ;
   }

   public void update19R1449( )
   {
      beforeValidate19R1449( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19R1449( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19R1449( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19R1449( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19R1449( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019R10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10849Er_ToE), A10849Er_ToE, Boolean.valueOf(n10850Er_Clicod), Integer.valueOf(A10850Er_Clicod), Boolean.valueOf(n10851Er_Arti), A10851Er_Arti, Boolean.valueOf(n10852Er_Color), A10852Er_Color, Boolean.valueOf(n10853Er_Clav), A10853Er_Clav, Boolean.valueOf(n10854Er_Dib), A10854Er_Dib, Boolean.valueOf(n10855Er_Vte), A10855Er_Vte, Boolean.valueOf(n10856Er_Kgs), A10856Er_Kgs, Boolean.valueOf(n10857Er_Mts), A10857Er_Mts, Boolean.valueOf(n10858Er_Pdas), A10858Er_Pdas, Boolean.valueOf(n10859Er_FecH), A10859Er_FecH, Boolean.valueOf(n10860Er_FecD), A10860Er_FecD, Boolean.valueOf(n10861Er_FsUlt), A10861Er_FsUlt, Boolean.valueOf(n10862Er_FsUltF), A10862Er_FsUltF, Boolean.valueOf(n10863Er_FsSg), A10863Er_FsSg, Boolean.valueOf(n10864Er_TArt), A10864Er_TArt, Boolean.valueOf(n10865Er_Clas), A10865Er_Clas, Boolean.valueOf(n10866Er_Um), A10866Er_Um, Boolean.valueOf(n10867Er_vN1), A10867Er_vN1, Boolean.valueOf(n10868Er_vN2), A10868Er_vN2, Boolean.valueOf(n10869Er_vN3), A10869Er_vN3, Boolean.valueOf(n10870Er_vN4), A10870Er_vN4, Boolean.valueOf(n10871Er_Ultf), Short.valueOf(A10871Er_Ultf), Boolean.valueOf(n10879Er_Nhdrs), Short.valueOf(A10879Er_Nhdrs), Boolean.valueOf(n10880Er_Discod), Integer.valueOf(A10880Er_Discod), Boolean.valueOf(n10889Er_St), Byte.valueOf(A10889Er_St), Boolean.valueOf(n10890Er_Est), Byte.valueOf(A10890Er_Est), Boolean.valueOf(n10974Er_Arts), A10974Er_Arts, Boolean.valueOf(n10975Er_Artd), A10975Er_Artd, Boolean.valueOf(n10976Er_Arta), A10976Er_Arta, A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPERPROD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate19R1449( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption19R0( ) ;
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
         endLevel19R1449( ) ;
      }
      closeExtendedTableCursors19R1449( ) ;
   }

   public void deferredUpdate19R1449( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19R1449( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19R1449( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19R1449( ) ;
         afterConfirm19R1449( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19R1449( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019R11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1449 == 0 )
                     {
                        initAll19R1449( ) ;
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
                     resetCaption19R0( ) ;
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
      sMode1449 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19R1449( ) ;
      Gx_mode = sMode1449 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19R1449( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T019R12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TABLA FRACCIONADO ER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel19R1449( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19R1449( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "terprod");
         if ( AnyError == 0 )
         {
            confirmValues19R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "terprod");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19R1449( )
   {
      /* Scan By routine */
      /* Using cursor T019R13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1449 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1449 = (short)(1) ;
         A10872Er_Hdr = T019R13_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019R13_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019R13_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019R13_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19R1449( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1449 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1449 = (short)(1) ;
         A10872Er_Hdr = T019R13_A10872Er_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
         A10873Er_Hdrr = T019R13_A10873Er_Hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
         A10874Er_hdrp = T019R13_A10874Er_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
         A10875Er_LinV = T019R13_A10875Er_LinV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
      }
   }

   public void scanEnd19R1449( )
   {
      pr_default.close(11);
   }

   public void afterConfirm19R1449( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19R1449( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19R1449( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19R1449( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19R1449( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19R1449( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19R1449( )
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
      edtEr_ToE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_ToE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_ToE_Enabled), 5, 0), true);
      edtEr_Clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Clicod_Enabled), 5, 0), true);
      edtEr_Arti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Arti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Arti_Enabled), 5, 0), true);
      edtEr_Color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Color_Enabled), 5, 0), true);
      edtEr_Clav_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Clav_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Clav_Enabled), 5, 0), true);
      edtEr_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Dib_Enabled), 5, 0), true);
      edtEr_Vte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Vte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Vte_Enabled), 5, 0), true);
      edtEr_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Kgs_Enabled), 5, 0), true);
      edtEr_Mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Mts_Enabled), 5, 0), true);
      edtEr_Pdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Pdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Pdas_Enabled), 5, 0), true);
      edtEr_FecH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_FecH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_FecH_Enabled), 5, 0), true);
      edtEr_FecD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_FecD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_FecD_Enabled), 5, 0), true);
      edtEr_FsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_FsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_FsUlt_Enabled), 5, 0), true);
      edtEr_FsUltF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_FsUltF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_FsUltF_Enabled), 5, 0), true);
      edtEr_FsSg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_FsSg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_FsSg_Enabled), 5, 0), true);
      edtEr_TArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_TArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_TArt_Enabled), 5, 0), true);
      edtEr_Clas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Clas_Enabled), 5, 0), true);
      edtEr_Um_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Um_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Um_Enabled), 5, 0), true);
      edtEr_vN1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_vN1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_vN1_Enabled), 5, 0), true);
      edtEr_vN2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_vN2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_vN2_Enabled), 5, 0), true);
      edtEr_vN3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_vN3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_vN3_Enabled), 5, 0), true);
      edtEr_vN4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_vN4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_vN4_Enabled), 5, 0), true);
      edtEr_Ultf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Ultf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Ultf_Enabled), 5, 0), true);
      edtEr_Nhdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Nhdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Nhdrs_Enabled), 5, 0), true);
      edtEr_Discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Discod_Enabled), 5, 0), true);
      edtEr_St_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_St_Enabled), 5, 0), true);
      edtEr_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Est_Enabled), 5, 0), true);
      edtEr_Arts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Arts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Arts_Enabled), 5, 0), true);
      edtEr_Artd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Artd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Artd_Enabled), 5, 0), true);
      edtEr_Arta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEr_Arta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEr_Arta_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes19R1449( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues19R0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.terprod", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10849Er_ToE", GXutil.rtrim( Z10849Er_ToE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10850Er_Clicod", GXutil.ltrim( localUtil.ntoc( Z10850Er_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10851Er_Arti", GXutil.rtrim( Z10851Er_Arti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10852Er_Color", GXutil.rtrim( Z10852Er_Color));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10853Er_Clav", GXutil.rtrim( Z10853Er_Clav));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10854Er_Dib", GXutil.rtrim( Z10854Er_Dib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10855Er_Vte", GXutil.rtrim( Z10855Er_Vte));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10856Er_Kgs", GXutil.ltrim( localUtil.ntoc( Z10856Er_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10857Er_Mts", GXutil.ltrim( localUtil.ntoc( Z10857Er_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10858Er_Pdas", GXutil.rtrim( Z10858Er_Pdas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10859Er_FecH", localUtil.dtoc( Z10859Er_FecH, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10860Er_FecD", localUtil.dtoc( Z10860Er_FecD, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10861Er_FsUlt", GXutil.rtrim( Z10861Er_FsUlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10862Er_FsUltF", localUtil.dtoc( Z10862Er_FsUltF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10863Er_FsSg", GXutil.rtrim( Z10863Er_FsSg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10864Er_TArt", GXutil.rtrim( Z10864Er_TArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10865Er_Clas", GXutil.rtrim( Z10865Er_Clas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10866Er_Um", GXutil.rtrim( Z10866Er_Um));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10867Er_vN1", GXutil.rtrim( Z10867Er_vN1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10868Er_vN2", GXutil.rtrim( Z10868Er_vN2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10869Er_vN3", GXutil.rtrim( Z10869Er_vN3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10870Er_vN4", GXutil.rtrim( Z10870Er_vN4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10871Er_Ultf", GXutil.ltrim( localUtil.ntoc( Z10871Er_Ultf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10879Er_Nhdrs", GXutil.ltrim( localUtil.ntoc( Z10879Er_Nhdrs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10880Er_Discod", GXutil.ltrim( localUtil.ntoc( Z10880Er_Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10889Er_St", GXutil.ltrim( localUtil.ntoc( Z10889Er_St, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10890Er_Est", GXutil.ltrim( localUtil.ntoc( Z10890Er_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10974Er_Arts", GXutil.rtrim( Z10974Er_Arts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10975Er_Artd", GXutil.rtrim( Z10975Er_Artd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10976Er_Arta", GXutil.rtrim( Z10976Er_Arta));
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
      return formatLink("app.terprod", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TERPROD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA PRODUCCIONES ER", "") ;
   }

   public void initializeNonKey19R1449( )
   {
      A10849Er_ToE = "" ;
      n10849Er_ToE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10849Er_ToE", A10849Er_ToE);
      A10850Er_Clicod = 0 ;
      n10850Er_Clicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10850Er_Clicod), 6, 0));
      A10851Er_Arti = "" ;
      n10851Er_Arti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10851Er_Arti", A10851Er_Arti);
      A10852Er_Color = "" ;
      n10852Er_Color = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10852Er_Color", A10852Er_Color);
      A10853Er_Clav = "" ;
      n10853Er_Clav = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10853Er_Clav", A10853Er_Clav);
      A10854Er_Dib = "" ;
      n10854Er_Dib = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10854Er_Dib", A10854Er_Dib);
      A10855Er_Vte = "" ;
      n10855Er_Vte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10855Er_Vte", A10855Er_Vte);
      A10856Er_Kgs = DecimalUtil.ZERO ;
      n10856Er_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrimstr( A10856Er_Kgs, 9, 2));
      A10857Er_Mts = DecimalUtil.ZERO ;
      n10857Er_Mts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrimstr( A10857Er_Mts, 9, 2));
      A10858Er_Pdas = "" ;
      n10858Er_Pdas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10858Er_Pdas", A10858Er_Pdas);
      A10859Er_FecH = GXutil.nullDate() ;
      n10859Er_FecH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
      A10860Er_FecD = GXutil.nullDate() ;
      n10860Er_FecD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
      A10861Er_FsUlt = "" ;
      n10861Er_FsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10861Er_FsUlt", A10861Er_FsUlt);
      A10862Er_FsUltF = GXutil.nullDate() ;
      n10862Er_FsUltF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
      A10863Er_FsSg = "" ;
      n10863Er_FsSg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10863Er_FsSg", A10863Er_FsSg);
      A10864Er_TArt = "" ;
      n10864Er_TArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10864Er_TArt", A10864Er_TArt);
      A10865Er_Clas = "" ;
      n10865Er_Clas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10865Er_Clas", A10865Er_Clas);
      A10866Er_Um = "" ;
      n10866Er_Um = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10866Er_Um", A10866Er_Um);
      A10867Er_vN1 = "" ;
      n10867Er_vN1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10867Er_vN1", A10867Er_vN1);
      A10868Er_vN2 = "" ;
      n10868Er_vN2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10868Er_vN2", A10868Er_vN2);
      A10869Er_vN3 = "" ;
      n10869Er_vN3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10869Er_vN3", A10869Er_vN3);
      A10870Er_vN4 = "" ;
      n10870Er_vN4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10870Er_vN4", A10870Er_vN4);
      A10871Er_Ultf = (short)(0) ;
      n10871Er_Ultf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10871Er_Ultf), 4, 0));
      A10879Er_Nhdrs = (short)(0) ;
      n10879Er_Nhdrs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10879Er_Nhdrs), 4, 0));
      A10880Er_Discod = 0 ;
      n10880Er_Discod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10880Er_Discod), 8, 0));
      A10889Er_St = (byte)(0) ;
      n10889Er_St = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10889Er_St), 2, 0));
      A10890Er_Est = (byte)(0) ;
      n10890Er_Est = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.str( A10890Er_Est, 1, 0));
      A10974Er_Arts = "" ;
      n10974Er_Arts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10974Er_Arts", A10974Er_Arts);
      A10975Er_Artd = "" ;
      n10975Er_Artd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10975Er_Artd", A10975Er_Artd);
      A10976Er_Arta = "" ;
      n10976Er_Arta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10976Er_Arta", A10976Er_Arta);
      Z10849Er_ToE = "" ;
      Z10850Er_Clicod = 0 ;
      Z10851Er_Arti = "" ;
      Z10852Er_Color = "" ;
      Z10853Er_Clav = "" ;
      Z10854Er_Dib = "" ;
      Z10855Er_Vte = "" ;
      Z10856Er_Kgs = DecimalUtil.ZERO ;
      Z10857Er_Mts = DecimalUtil.ZERO ;
      Z10858Er_Pdas = "" ;
      Z10859Er_FecH = GXutil.nullDate() ;
      Z10860Er_FecD = GXutil.nullDate() ;
      Z10861Er_FsUlt = "" ;
      Z10862Er_FsUltF = GXutil.nullDate() ;
      Z10863Er_FsSg = "" ;
      Z10864Er_TArt = "" ;
      Z10865Er_Clas = "" ;
      Z10866Er_Um = "" ;
      Z10867Er_vN1 = "" ;
      Z10868Er_vN2 = "" ;
      Z10869Er_vN3 = "" ;
      Z10870Er_vN4 = "" ;
      Z10871Er_Ultf = (short)(0) ;
      Z10879Er_Nhdrs = (short)(0) ;
      Z10880Er_Discod = 0 ;
      Z10889Er_St = (byte)(0) ;
      Z10890Er_Est = (byte)(0) ;
      Z10974Er_Arts = "" ;
      Z10975Er_Artd = "" ;
      Z10976Er_Arta = "" ;
   }

   public void initAll19R1449( )
   {
      A10872Er_Hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10872Er_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10872Er_Hdr), 8, 0));
      A10873Er_Hdrr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10873Er_Hdrr", GXutil.str( A10873Er_Hdrr, 1, 0));
      A10874Er_hdrp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10874Er_hdrp", A10874Er_hdrp);
      A10875Er_LinV = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10875Er_LinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10875Er_LinV), 2, 0));
      initializeNonKey19R1449( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156698", true, true);
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
      httpContext.AddJavascriptSource("terprod.js", "?2026824156698", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEr_ToE_Internalname = "ER_TOE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEr_Clicod_Internalname = "ER_CLICOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEr_Arti_Internalname = "ER_ARTI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEr_Color_Internalname = "ER_COLOR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEr_Clav_Internalname = "ER_CLAV" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEr_Dib_Internalname = "ER_DIB" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEr_Vte_Internalname = "ER_VTE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEr_Kgs_Internalname = "ER_KGS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEr_Mts_Internalname = "ER_MTS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEr_Pdas_Internalname = "ER_PDAS" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtEr_FecH_Internalname = "ER_FECH" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEr_FecD_Internalname = "ER_FECD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtEr_FsUlt_Internalname = "ER_FSULT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtEr_FsUltF_Internalname = "ER_FSULTF" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtEr_FsSg_Internalname = "ER_FSSG" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtEr_TArt_Internalname = "ER_TART" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtEr_Clas_Internalname = "ER_CLAS" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtEr_Um_Internalname = "ER_UM" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtEr_vN1_Internalname = "ER_VN1" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtEr_vN2_Internalname = "ER_VN2" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtEr_vN3_Internalname = "ER_VN3" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtEr_vN4_Internalname = "ER_VN4" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtEr_Ultf_Internalname = "ER_ULTF" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtEr_Nhdrs_Internalname = "ER_NHDRS" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtEr_Discod_Internalname = "ER_DISCOD" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtEr_St_Internalname = "ER_ST" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtEr_Est_Internalname = "ER_EST" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtEr_Arts_Internalname = "ER_ARTS" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtEr_Artd_Internalname = "ER_ARTD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtEr_Arta_Internalname = "ER_ARTA" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA PRODUCCIONES ER", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEr_Arta_Jsonclick = "" ;
      edtEr_Arta_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Arta_Enabled = 1 ;
      edtEr_Artd_Jsonclick = "" ;
      edtEr_Artd_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Artd_Enabled = 1 ;
      edtEr_Arts_Jsonclick = "" ;
      edtEr_Arts_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Arts_Enabled = 1 ;
      edtEr_Est_Jsonclick = "" ;
      edtEr_Est_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Est_Enabled = 1 ;
      edtEr_St_Jsonclick = "" ;
      edtEr_St_Backcolor = (int)(0xFFFFFF) ;
      edtEr_St_Enabled = 1 ;
      edtEr_Discod_Jsonclick = "" ;
      edtEr_Discod_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Discod_Enabled = 1 ;
      edtEr_Nhdrs_Jsonclick = "" ;
      edtEr_Nhdrs_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Nhdrs_Enabled = 1 ;
      edtEr_Ultf_Jsonclick = "" ;
      edtEr_Ultf_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Ultf_Enabled = 1 ;
      edtEr_vN4_Jsonclick = "" ;
      edtEr_vN4_Backcolor = (int)(0xFFFFFF) ;
      edtEr_vN4_Enabled = 1 ;
      edtEr_vN3_Jsonclick = "" ;
      edtEr_vN3_Backcolor = (int)(0xFFFFFF) ;
      edtEr_vN3_Enabled = 1 ;
      edtEr_vN2_Jsonclick = "" ;
      edtEr_vN2_Backcolor = (int)(0xFFFFFF) ;
      edtEr_vN2_Enabled = 1 ;
      edtEr_vN1_Jsonclick = "" ;
      edtEr_vN1_Backcolor = (int)(0xFFFFFF) ;
      edtEr_vN1_Enabled = 1 ;
      edtEr_Um_Jsonclick = "" ;
      edtEr_Um_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Um_Enabled = 1 ;
      edtEr_Clas_Jsonclick = "" ;
      edtEr_Clas_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Clas_Enabled = 1 ;
      edtEr_TArt_Jsonclick = "" ;
      edtEr_TArt_Backcolor = (int)(0xFFFFFF) ;
      edtEr_TArt_Enabled = 1 ;
      edtEr_FsSg_Jsonclick = "" ;
      edtEr_FsSg_Backcolor = (int)(0xFFFFFF) ;
      edtEr_FsSg_Enabled = 1 ;
      edtEr_FsUltF_Jsonclick = "" ;
      edtEr_FsUltF_Backcolor = (int)(0xFFFFFF) ;
      edtEr_FsUltF_Enabled = 1 ;
      edtEr_FsUlt_Jsonclick = "" ;
      edtEr_FsUlt_Backcolor = (int)(0xFFFFFF) ;
      edtEr_FsUlt_Enabled = 1 ;
      edtEr_FecD_Jsonclick = "" ;
      edtEr_FecD_Backcolor = (int)(0xFFFFFF) ;
      edtEr_FecD_Enabled = 1 ;
      edtEr_FecH_Jsonclick = "" ;
      edtEr_FecH_Backcolor = (int)(0xFFFFFF) ;
      edtEr_FecH_Enabled = 1 ;
      edtEr_Pdas_Jsonclick = "" ;
      edtEr_Pdas_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Pdas_Enabled = 1 ;
      edtEr_Mts_Jsonclick = "" ;
      edtEr_Mts_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Mts_Enabled = 1 ;
      edtEr_Kgs_Jsonclick = "" ;
      edtEr_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Kgs_Enabled = 1 ;
      edtEr_Vte_Jsonclick = "" ;
      edtEr_Vte_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Vte_Enabled = 1 ;
      edtEr_Dib_Jsonclick = "" ;
      edtEr_Dib_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Dib_Enabled = 1 ;
      edtEr_Clav_Jsonclick = "" ;
      edtEr_Clav_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Clav_Enabled = 1 ;
      edtEr_Color_Jsonclick = "" ;
      edtEr_Color_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Color_Enabled = 1 ;
      edtEr_Arti_Jsonclick = "" ;
      edtEr_Arti_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Arti_Enabled = 1 ;
      edtEr_Clicod_Jsonclick = "" ;
      edtEr_Clicod_Backcolor = (int)(0xFFFFFF) ;
      edtEr_Clicod_Enabled = 1 ;
      edtEr_ToE_Jsonclick = "" ;
      edtEr_ToE_Backcolor = (int)(0xFFFFFF) ;
      edtEr_ToE_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      /* Using cursor T019R14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019R14_A407EmprNom[0] ;
      n407EmprNom = T019R14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      GX_FocusControl = edtEr_ToE_Internalname ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10849Er_ToE", GXutil.rtrim( A10849Er_ToE));
      httpContext.ajax_rsp_assign_attri("", false, "A10850Er_Clicod", GXutil.ltrim( localUtil.ntoc( A10850Er_Clicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10851Er_Arti", GXutil.rtrim( A10851Er_Arti));
      httpContext.ajax_rsp_assign_attri("", false, "A10852Er_Color", GXutil.rtrim( A10852Er_Color));
      httpContext.ajax_rsp_assign_attri("", false, "A10853Er_Clav", GXutil.rtrim( A10853Er_Clav));
      httpContext.ajax_rsp_assign_attri("", false, "A10854Er_Dib", GXutil.rtrim( A10854Er_Dib));
      httpContext.ajax_rsp_assign_attri("", false, "A10855Er_Vte", GXutil.rtrim( A10855Er_Vte));
      httpContext.ajax_rsp_assign_attri("", false, "A10856Er_Kgs", GXutil.ltrim( localUtil.ntoc( A10856Er_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10857Er_Mts", GXutil.ltrim( localUtil.ntoc( A10857Er_Mts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10858Er_Pdas", GXutil.rtrim( A10858Er_Pdas));
      httpContext.ajax_rsp_assign_attri("", false, "A10859Er_FecH", localUtil.format(A10859Er_FecH, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10860Er_FecD", localUtil.format(A10860Er_FecD, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10861Er_FsUlt", GXutil.rtrim( A10861Er_FsUlt));
      httpContext.ajax_rsp_assign_attri("", false, "A10862Er_FsUltF", localUtil.format(A10862Er_FsUltF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10863Er_FsSg", GXutil.rtrim( A10863Er_FsSg));
      httpContext.ajax_rsp_assign_attri("", false, "A10864Er_TArt", GXutil.rtrim( A10864Er_TArt));
      httpContext.ajax_rsp_assign_attri("", false, "A10865Er_Clas", GXutil.rtrim( A10865Er_Clas));
      httpContext.ajax_rsp_assign_attri("", false, "A10866Er_Um", GXutil.rtrim( A10866Er_Um));
      httpContext.ajax_rsp_assign_attri("", false, "A10867Er_vN1", GXutil.rtrim( A10867Er_vN1));
      httpContext.ajax_rsp_assign_attri("", false, "A10868Er_vN2", GXutil.rtrim( A10868Er_vN2));
      httpContext.ajax_rsp_assign_attri("", false, "A10869Er_vN3", GXutil.rtrim( A10869Er_vN3));
      httpContext.ajax_rsp_assign_attri("", false, "A10870Er_vN4", GXutil.rtrim( A10870Er_vN4));
      httpContext.ajax_rsp_assign_attri("", false, "A10871Er_Ultf", GXutil.ltrim( localUtil.ntoc( A10871Er_Ultf, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10879Er_Nhdrs", GXutil.ltrim( localUtil.ntoc( A10879Er_Nhdrs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10880Er_Discod", GXutil.ltrim( localUtil.ntoc( A10880Er_Discod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10889Er_St", GXutil.ltrim( localUtil.ntoc( A10889Er_St, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10890Er_Est", GXutil.ltrim( localUtil.ntoc( A10890Er_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10974Er_Arts", GXutil.rtrim( A10974Er_Arts));
      httpContext.ajax_rsp_assign_attri("", false, "A10975Er_Artd", GXutil.rtrim( A10975Er_Artd));
      httpContext.ajax_rsp_assign_attri("", false, "A10976Er_Arta", GXutil.rtrim( A10976Er_Arta));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10872Er_Hdr", GXutil.ltrim( localUtil.ntoc( Z10872Er_Hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10873Er_Hdrr", GXutil.ltrim( localUtil.ntoc( Z10873Er_Hdrr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10874Er_hdrp", GXutil.rtrim( Z10874Er_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10875Er_LinV", GXutil.ltrim( localUtil.ntoc( Z10875Er_LinV, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10849Er_ToE", GXutil.rtrim( Z10849Er_ToE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10850Er_Clicod", GXutil.ltrim( localUtil.ntoc( Z10850Er_Clicod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10851Er_Arti", GXutil.rtrim( Z10851Er_Arti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10852Er_Color", GXutil.rtrim( Z10852Er_Color));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10853Er_Clav", GXutil.rtrim( Z10853Er_Clav));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10854Er_Dib", GXutil.rtrim( Z10854Er_Dib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10855Er_Vte", GXutil.rtrim( Z10855Er_Vte));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10856Er_Kgs", GXutil.ltrim( localUtil.ntoc( Z10856Er_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10857Er_Mts", GXutil.ltrim( localUtil.ntoc( Z10857Er_Mts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10858Er_Pdas", GXutil.rtrim( Z10858Er_Pdas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10859Er_FecH", localUtil.format(Z10859Er_FecH, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10860Er_FecD", localUtil.format(Z10860Er_FecD, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10861Er_FsUlt", GXutil.rtrim( Z10861Er_FsUlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10862Er_FsUltF", localUtil.format(Z10862Er_FsUltF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10863Er_FsSg", GXutil.rtrim( Z10863Er_FsSg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10864Er_TArt", GXutil.rtrim( Z10864Er_TArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10865Er_Clas", GXutil.rtrim( Z10865Er_Clas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10866Er_Um", GXutil.rtrim( Z10866Er_Um));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10867Er_vN1", GXutil.rtrim( Z10867Er_vN1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10868Er_vN2", GXutil.rtrim( Z10868Er_vN2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10869Er_vN3", GXutil.rtrim( Z10869Er_vN3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10870Er_vN4", GXutil.rtrim( Z10870Er_vN4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10871Er_Ultf", GXutil.ltrim( localUtil.ntoc( Z10871Er_Ultf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10879Er_Nhdrs", GXutil.ltrim( localUtil.ntoc( Z10879Er_Nhdrs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10880Er_Discod", GXutil.ltrim( localUtil.ntoc( Z10880Er_Discod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10889Er_St", GXutil.ltrim( localUtil.ntoc( Z10889Er_St, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10890Er_Est", GXutil.ltrim( localUtil.ntoc( Z10890Er_Est, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10974Er_Arts", GXutil.rtrim( Z10974Er_Arts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10975Er_Artd", GXutil.rtrim( Z10975Er_Artd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10976Er_Arta", GXutil.rtrim( Z10976Er_Arta));
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
      setEventMetadata("VALID_ER_LINV","{handler:'valid_Er_linv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10872Er_Hdr',fld:'ER_HDR',pic:'ZZZZZZZ9'},{av:'A10873Er_Hdrr',fld:'ER_HDRR',pic:'9'},{av:'A10874Er_hdrp',fld:'ER_HDRP',pic:''},{av:'A10875Er_LinV',fld:'ER_LINV',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ER_LINV",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10849Er_ToE',fld:'ER_TOE',pic:''},{av:'A10850Er_Clicod',fld:'ER_CLICOD',pic:'ZZZZZ9'},{av:'A10851Er_Arti',fld:'ER_ARTI',pic:''},{av:'A10852Er_Color',fld:'ER_COLOR',pic:''},{av:'A10853Er_Clav',fld:'ER_CLAV',pic:''},{av:'A10854Er_Dib',fld:'ER_DIB',pic:''},{av:'A10855Er_Vte',fld:'ER_VTE',pic:''},{av:'A10856Er_Kgs',fld:'ER_KGS',pic:'ZZZZZ9.99'},{av:'A10857Er_Mts',fld:'ER_MTS',pic:'ZZZZZ9.99'},{av:'A10858Er_Pdas',fld:'ER_PDAS',pic:''},{av:'A10859Er_FecH',fld:'ER_FECH',pic:''},{av:'A10860Er_FecD',fld:'ER_FECD',pic:''},{av:'A10861Er_FsUlt',fld:'ER_FSULT',pic:''},{av:'A10862Er_FsUltF',fld:'ER_FSULTF',pic:''},{av:'A10863Er_FsSg',fld:'ER_FSSG',pic:''},{av:'A10864Er_TArt',fld:'ER_TART',pic:''},{av:'A10865Er_Clas',fld:'ER_CLAS',pic:''},{av:'A10866Er_Um',fld:'ER_UM',pic:''},{av:'A10867Er_vN1',fld:'ER_VN1',pic:''},{av:'A10868Er_vN2',fld:'ER_VN2',pic:''},{av:'A10869Er_vN3',fld:'ER_VN3',pic:''},{av:'A10870Er_vN4',fld:'ER_VN4',pic:''},{av:'A10871Er_Ultf',fld:'ER_ULTF',pic:'ZZZ9'},{av:'A10879Er_Nhdrs',fld:'ER_NHDRS',pic:'ZZZ9'},{av:'A10880Er_Discod',fld:'ER_DISCOD',pic:'ZZZZZZZ9'},{av:'A10889Er_St',fld:'ER_ST',pic:'Z9'},{av:'A10890Er_Est',fld:'ER_EST',pic:'9'},{av:'A10974Er_Arts',fld:'ER_ARTS',pic:''},{av:'A10975Er_Artd',fld:'ER_ARTD',pic:''},{av:'A10976Er_Arta',fld:'ER_ARTA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10872Er_Hdr'},{av:'Z10873Er_Hdrr'},{av:'Z10874Er_hdrp'},{av:'Z10875Er_LinV'},{av:'Z407EmprNom'},{av:'Z10849Er_ToE'},{av:'Z10850Er_Clicod'},{av:'Z10851Er_Arti'},{av:'Z10852Er_Color'},{av:'Z10853Er_Clav'},{av:'Z10854Er_Dib'},{av:'Z10855Er_Vte'},{av:'Z10856Er_Kgs'},{av:'Z10857Er_Mts'},{av:'Z10858Er_Pdas'},{av:'Z10859Er_FecH'},{av:'Z10860Er_FecD'},{av:'Z10861Er_FsUlt'},{av:'Z10862Er_FsUltF'},{av:'Z10863Er_FsSg'},{av:'Z10864Er_TArt'},{av:'Z10865Er_Clas'},{av:'Z10866Er_Um'},{av:'Z10867Er_vN1'},{av:'Z10868Er_vN2'},{av:'Z10869Er_vN3'},{av:'Z10870Er_vN4'},{av:'Z10871Er_Ultf'},{av:'Z10879Er_Nhdrs'},{av:'Z10880Er_Discod'},{av:'Z10889Er_St'},{av:'Z10890Er_Est'},{av:'Z10974Er_Arts'},{av:'Z10975Er_Artd'},{av:'Z10976Er_Arta'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z10874Er_hdrp = "" ;
      Z10849Er_ToE = "" ;
      Z10851Er_Arti = "" ;
      Z10852Er_Color = "" ;
      Z10853Er_Clav = "" ;
      Z10854Er_Dib = "" ;
      Z10855Er_Vte = "" ;
      Z10856Er_Kgs = DecimalUtil.ZERO ;
      Z10857Er_Mts = DecimalUtil.ZERO ;
      Z10858Er_Pdas = "" ;
      Z10859Er_FecH = GXutil.nullDate() ;
      Z10860Er_FecD = GXutil.nullDate() ;
      Z10861Er_FsUlt = "" ;
      Z10862Er_FsUltF = GXutil.nullDate() ;
      Z10863Er_FsSg = "" ;
      Z10864Er_TArt = "" ;
      Z10865Er_Clas = "" ;
      Z10866Er_Um = "" ;
      Z10867Er_vN1 = "" ;
      Z10868Er_vN2 = "" ;
      Z10869Er_vN3 = "" ;
      Z10870Er_vN4 = "" ;
      Z10974Er_Arts = "" ;
      Z10975Er_Artd = "" ;
      Z10976Er_Arta = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10874Er_hdrp = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10849Er_ToE = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10851Er_Arti = "" ;
      lblTextblock10_Jsonclick = "" ;
      A10852Er_Color = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10853Er_Clav = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10854Er_Dib = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10855Er_Vte = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10856Er_Kgs = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A10857Er_Mts = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A10858Er_Pdas = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10859Er_FecH = GXutil.nullDate() ;
      lblTextblock18_Jsonclick = "" ;
      A10860Er_FecD = GXutil.nullDate() ;
      lblTextblock19_Jsonclick = "" ;
      A10861Er_FsUlt = "" ;
      lblTextblock20_Jsonclick = "" ;
      A10862Er_FsUltF = GXutil.nullDate() ;
      lblTextblock21_Jsonclick = "" ;
      A10863Er_FsSg = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10864Er_TArt = "" ;
      lblTextblock23_Jsonclick = "" ;
      A10865Er_Clas = "" ;
      lblTextblock24_Jsonclick = "" ;
      A10866Er_Um = "" ;
      lblTextblock25_Jsonclick = "" ;
      A10867Er_vN1 = "" ;
      lblTextblock26_Jsonclick = "" ;
      A10868Er_vN2 = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10869Er_vN3 = "" ;
      lblTextblock28_Jsonclick = "" ;
      A10870Er_vN4 = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A10974Er_Arts = "" ;
      lblTextblock35_Jsonclick = "" ;
      A10975Er_Artd = "" ;
      lblTextblock36_Jsonclick = "" ;
      A10976Er_Arta = "" ;
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
      T019R4_A407EmprNom = new String[] {""} ;
      T019R4_n407EmprNom = new boolean[] {false} ;
      T019R5_A10872Er_Hdr = new int[1] ;
      T019R5_A10873Er_Hdrr = new byte[1] ;
      T019R5_A10874Er_hdrp = new String[] {""} ;
      T019R5_A10875Er_LinV = new byte[1] ;
      T019R5_A407EmprNom = new String[] {""} ;
      T019R5_n407EmprNom = new boolean[] {false} ;
      T019R5_A10849Er_ToE = new String[] {""} ;
      T019R5_n10849Er_ToE = new boolean[] {false} ;
      T019R5_A10850Er_Clicod = new int[1] ;
      T019R5_n10850Er_Clicod = new boolean[] {false} ;
      T019R5_A10851Er_Arti = new String[] {""} ;
      T019R5_n10851Er_Arti = new boolean[] {false} ;
      T019R5_A10852Er_Color = new String[] {""} ;
      T019R5_n10852Er_Color = new boolean[] {false} ;
      T019R5_A10853Er_Clav = new String[] {""} ;
      T019R5_n10853Er_Clav = new boolean[] {false} ;
      T019R5_A10854Er_Dib = new String[] {""} ;
      T019R5_n10854Er_Dib = new boolean[] {false} ;
      T019R5_A10855Er_Vte = new String[] {""} ;
      T019R5_n10855Er_Vte = new boolean[] {false} ;
      T019R5_A10856Er_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R5_n10856Er_Kgs = new boolean[] {false} ;
      T019R5_A10857Er_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R5_n10857Er_Mts = new boolean[] {false} ;
      T019R5_A10858Er_Pdas = new String[] {""} ;
      T019R5_n10858Er_Pdas = new boolean[] {false} ;
      T019R5_A10859Er_FecH = new java.util.Date[] {GXutil.nullDate()} ;
      T019R5_n10859Er_FecH = new boolean[] {false} ;
      T019R5_A10860Er_FecD = new java.util.Date[] {GXutil.nullDate()} ;
      T019R5_n10860Er_FecD = new boolean[] {false} ;
      T019R5_A10861Er_FsUlt = new String[] {""} ;
      T019R5_n10861Er_FsUlt = new boolean[] {false} ;
      T019R5_A10862Er_FsUltF = new java.util.Date[] {GXutil.nullDate()} ;
      T019R5_n10862Er_FsUltF = new boolean[] {false} ;
      T019R5_A10863Er_FsSg = new String[] {""} ;
      T019R5_n10863Er_FsSg = new boolean[] {false} ;
      T019R5_A10864Er_TArt = new String[] {""} ;
      T019R5_n10864Er_TArt = new boolean[] {false} ;
      T019R5_A10865Er_Clas = new String[] {""} ;
      T019R5_n10865Er_Clas = new boolean[] {false} ;
      T019R5_A10866Er_Um = new String[] {""} ;
      T019R5_n10866Er_Um = new boolean[] {false} ;
      T019R5_A10867Er_vN1 = new String[] {""} ;
      T019R5_n10867Er_vN1 = new boolean[] {false} ;
      T019R5_A10868Er_vN2 = new String[] {""} ;
      T019R5_n10868Er_vN2 = new boolean[] {false} ;
      T019R5_A10869Er_vN3 = new String[] {""} ;
      T019R5_n10869Er_vN3 = new boolean[] {false} ;
      T019R5_A10870Er_vN4 = new String[] {""} ;
      T019R5_n10870Er_vN4 = new boolean[] {false} ;
      T019R5_A10871Er_Ultf = new short[1] ;
      T019R5_n10871Er_Ultf = new boolean[] {false} ;
      T019R5_A10879Er_Nhdrs = new short[1] ;
      T019R5_n10879Er_Nhdrs = new boolean[] {false} ;
      T019R5_A10880Er_Discod = new int[1] ;
      T019R5_n10880Er_Discod = new boolean[] {false} ;
      T019R5_A10889Er_St = new byte[1] ;
      T019R5_n10889Er_St = new boolean[] {false} ;
      T019R5_A10890Er_Est = new byte[1] ;
      T019R5_n10890Er_Est = new boolean[] {false} ;
      T019R5_A10974Er_Arts = new String[] {""} ;
      T019R5_n10974Er_Arts = new boolean[] {false} ;
      T019R5_A10975Er_Artd = new String[] {""} ;
      T019R5_n10975Er_Artd = new boolean[] {false} ;
      T019R5_A10976Er_Arta = new String[] {""} ;
      T019R5_n10976Er_Arta = new boolean[] {false} ;
      T019R5_A396EmprCod = new String[] {""} ;
      T019R6_A396EmprCod = new String[] {""} ;
      T019R6_A10872Er_Hdr = new int[1] ;
      T019R6_A10873Er_Hdrr = new byte[1] ;
      T019R6_A10874Er_hdrp = new String[] {""} ;
      T019R6_A10875Er_LinV = new byte[1] ;
      T019R3_A10872Er_Hdr = new int[1] ;
      T019R3_A10873Er_Hdrr = new byte[1] ;
      T019R3_A10874Er_hdrp = new String[] {""} ;
      T019R3_A10875Er_LinV = new byte[1] ;
      T019R3_A10849Er_ToE = new String[] {""} ;
      T019R3_n10849Er_ToE = new boolean[] {false} ;
      T019R3_A10850Er_Clicod = new int[1] ;
      T019R3_n10850Er_Clicod = new boolean[] {false} ;
      T019R3_A10851Er_Arti = new String[] {""} ;
      T019R3_n10851Er_Arti = new boolean[] {false} ;
      T019R3_A10852Er_Color = new String[] {""} ;
      T019R3_n10852Er_Color = new boolean[] {false} ;
      T019R3_A10853Er_Clav = new String[] {""} ;
      T019R3_n10853Er_Clav = new boolean[] {false} ;
      T019R3_A10854Er_Dib = new String[] {""} ;
      T019R3_n10854Er_Dib = new boolean[] {false} ;
      T019R3_A10855Er_Vte = new String[] {""} ;
      T019R3_n10855Er_Vte = new boolean[] {false} ;
      T019R3_A10856Er_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R3_n10856Er_Kgs = new boolean[] {false} ;
      T019R3_A10857Er_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R3_n10857Er_Mts = new boolean[] {false} ;
      T019R3_A10858Er_Pdas = new String[] {""} ;
      T019R3_n10858Er_Pdas = new boolean[] {false} ;
      T019R3_A10859Er_FecH = new java.util.Date[] {GXutil.nullDate()} ;
      T019R3_n10859Er_FecH = new boolean[] {false} ;
      T019R3_A10860Er_FecD = new java.util.Date[] {GXutil.nullDate()} ;
      T019R3_n10860Er_FecD = new boolean[] {false} ;
      T019R3_A10861Er_FsUlt = new String[] {""} ;
      T019R3_n10861Er_FsUlt = new boolean[] {false} ;
      T019R3_A10862Er_FsUltF = new java.util.Date[] {GXutil.nullDate()} ;
      T019R3_n10862Er_FsUltF = new boolean[] {false} ;
      T019R3_A10863Er_FsSg = new String[] {""} ;
      T019R3_n10863Er_FsSg = new boolean[] {false} ;
      T019R3_A10864Er_TArt = new String[] {""} ;
      T019R3_n10864Er_TArt = new boolean[] {false} ;
      T019R3_A10865Er_Clas = new String[] {""} ;
      T019R3_n10865Er_Clas = new boolean[] {false} ;
      T019R3_A10866Er_Um = new String[] {""} ;
      T019R3_n10866Er_Um = new boolean[] {false} ;
      T019R3_A10867Er_vN1 = new String[] {""} ;
      T019R3_n10867Er_vN1 = new boolean[] {false} ;
      T019R3_A10868Er_vN2 = new String[] {""} ;
      T019R3_n10868Er_vN2 = new boolean[] {false} ;
      T019R3_A10869Er_vN3 = new String[] {""} ;
      T019R3_n10869Er_vN3 = new boolean[] {false} ;
      T019R3_A10870Er_vN4 = new String[] {""} ;
      T019R3_n10870Er_vN4 = new boolean[] {false} ;
      T019R3_A10871Er_Ultf = new short[1] ;
      T019R3_n10871Er_Ultf = new boolean[] {false} ;
      T019R3_A10879Er_Nhdrs = new short[1] ;
      T019R3_n10879Er_Nhdrs = new boolean[] {false} ;
      T019R3_A10880Er_Discod = new int[1] ;
      T019R3_n10880Er_Discod = new boolean[] {false} ;
      T019R3_A10889Er_St = new byte[1] ;
      T019R3_n10889Er_St = new boolean[] {false} ;
      T019R3_A10890Er_Est = new byte[1] ;
      T019R3_n10890Er_Est = new boolean[] {false} ;
      T019R3_A10974Er_Arts = new String[] {""} ;
      T019R3_n10974Er_Arts = new boolean[] {false} ;
      T019R3_A10975Er_Artd = new String[] {""} ;
      T019R3_n10975Er_Artd = new boolean[] {false} ;
      T019R3_A10976Er_Arta = new String[] {""} ;
      T019R3_n10976Er_Arta = new boolean[] {false} ;
      T019R3_A396EmprCod = new String[] {""} ;
      sMode1449 = "" ;
      T019R7_A396EmprCod = new String[] {""} ;
      T019R7_A10872Er_Hdr = new int[1] ;
      T019R7_A10873Er_Hdrr = new byte[1] ;
      T019R7_A10874Er_hdrp = new String[] {""} ;
      T019R7_A10875Er_LinV = new byte[1] ;
      T019R8_A396EmprCod = new String[] {""} ;
      T019R8_A10872Er_Hdr = new int[1] ;
      T019R8_A10873Er_Hdrr = new byte[1] ;
      T019R8_A10874Er_hdrp = new String[] {""} ;
      T019R8_A10875Er_LinV = new byte[1] ;
      T019R2_A10872Er_Hdr = new int[1] ;
      T019R2_A10873Er_Hdrr = new byte[1] ;
      T019R2_A10874Er_hdrp = new String[] {""} ;
      T019R2_A10875Er_LinV = new byte[1] ;
      T019R2_A10849Er_ToE = new String[] {""} ;
      T019R2_n10849Er_ToE = new boolean[] {false} ;
      T019R2_A10850Er_Clicod = new int[1] ;
      T019R2_n10850Er_Clicod = new boolean[] {false} ;
      T019R2_A10851Er_Arti = new String[] {""} ;
      T019R2_n10851Er_Arti = new boolean[] {false} ;
      T019R2_A10852Er_Color = new String[] {""} ;
      T019R2_n10852Er_Color = new boolean[] {false} ;
      T019R2_A10853Er_Clav = new String[] {""} ;
      T019R2_n10853Er_Clav = new boolean[] {false} ;
      T019R2_A10854Er_Dib = new String[] {""} ;
      T019R2_n10854Er_Dib = new boolean[] {false} ;
      T019R2_A10855Er_Vte = new String[] {""} ;
      T019R2_n10855Er_Vte = new boolean[] {false} ;
      T019R2_A10856Er_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R2_n10856Er_Kgs = new boolean[] {false} ;
      T019R2_A10857Er_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019R2_n10857Er_Mts = new boolean[] {false} ;
      T019R2_A10858Er_Pdas = new String[] {""} ;
      T019R2_n10858Er_Pdas = new boolean[] {false} ;
      T019R2_A10859Er_FecH = new java.util.Date[] {GXutil.nullDate()} ;
      T019R2_n10859Er_FecH = new boolean[] {false} ;
      T019R2_A10860Er_FecD = new java.util.Date[] {GXutil.nullDate()} ;
      T019R2_n10860Er_FecD = new boolean[] {false} ;
      T019R2_A10861Er_FsUlt = new String[] {""} ;
      T019R2_n10861Er_FsUlt = new boolean[] {false} ;
      T019R2_A10862Er_FsUltF = new java.util.Date[] {GXutil.nullDate()} ;
      T019R2_n10862Er_FsUltF = new boolean[] {false} ;
      T019R2_A10863Er_FsSg = new String[] {""} ;
      T019R2_n10863Er_FsSg = new boolean[] {false} ;
      T019R2_A10864Er_TArt = new String[] {""} ;
      T019R2_n10864Er_TArt = new boolean[] {false} ;
      T019R2_A10865Er_Clas = new String[] {""} ;
      T019R2_n10865Er_Clas = new boolean[] {false} ;
      T019R2_A10866Er_Um = new String[] {""} ;
      T019R2_n10866Er_Um = new boolean[] {false} ;
      T019R2_A10867Er_vN1 = new String[] {""} ;
      T019R2_n10867Er_vN1 = new boolean[] {false} ;
      T019R2_A10868Er_vN2 = new String[] {""} ;
      T019R2_n10868Er_vN2 = new boolean[] {false} ;
      T019R2_A10869Er_vN3 = new String[] {""} ;
      T019R2_n10869Er_vN3 = new boolean[] {false} ;
      T019R2_A10870Er_vN4 = new String[] {""} ;
      T019R2_n10870Er_vN4 = new boolean[] {false} ;
      T019R2_A10871Er_Ultf = new short[1] ;
      T019R2_n10871Er_Ultf = new boolean[] {false} ;
      T019R2_A10879Er_Nhdrs = new short[1] ;
      T019R2_n10879Er_Nhdrs = new boolean[] {false} ;
      T019R2_A10880Er_Discod = new int[1] ;
      T019R2_n10880Er_Discod = new boolean[] {false} ;
      T019R2_A10889Er_St = new byte[1] ;
      T019R2_n10889Er_St = new boolean[] {false} ;
      T019R2_A10890Er_Est = new byte[1] ;
      T019R2_n10890Er_Est = new boolean[] {false} ;
      T019R2_A10974Er_Arts = new String[] {""} ;
      T019R2_n10974Er_Arts = new boolean[] {false} ;
      T019R2_A10975Er_Artd = new String[] {""} ;
      T019R2_n10975Er_Artd = new boolean[] {false} ;
      T019R2_A10976Er_Arta = new String[] {""} ;
      T019R2_n10976Er_Arta = new boolean[] {false} ;
      T019R2_A396EmprCod = new String[] {""} ;
      T019R12_A396EmprCod = new String[] {""} ;
      T019R12_A10872Er_Hdr = new int[1] ;
      T019R12_A10873Er_Hdrr = new byte[1] ;
      T019R12_A10874Er_hdrp = new String[] {""} ;
      T019R12_A10875Er_LinV = new byte[1] ;
      T019R12_A10878Er_Linf = new short[1] ;
      T019R13_A396EmprCod = new String[] {""} ;
      T019R13_A10872Er_Hdr = new int[1] ;
      T019R13_A10873Er_Hdrr = new byte[1] ;
      T019R13_A10874Er_hdrp = new String[] {""} ;
      T019R13_A10875Er_LinV = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T019R14_A407EmprNom = new String[] {""} ;
      T019R14_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10874Er_hdrp = "" ;
      ZZ407EmprNom = "" ;
      ZZ10849Er_ToE = "" ;
      ZZ10851Er_Arti = "" ;
      ZZ10852Er_Color = "" ;
      ZZ10853Er_Clav = "" ;
      ZZ10854Er_Dib = "" ;
      ZZ10855Er_Vte = "" ;
      ZZ10856Er_Kgs = DecimalUtil.ZERO ;
      ZZ10857Er_Mts = DecimalUtil.ZERO ;
      ZZ10858Er_Pdas = "" ;
      ZZ10859Er_FecH = GXutil.nullDate() ;
      ZZ10860Er_FecD = GXutil.nullDate() ;
      ZZ10861Er_FsUlt = "" ;
      ZZ10862Er_FsUltF = GXutil.nullDate() ;
      ZZ10863Er_FsSg = "" ;
      ZZ10864Er_TArt = "" ;
      ZZ10865Er_Clas = "" ;
      ZZ10866Er_Um = "" ;
      ZZ10867Er_vN1 = "" ;
      ZZ10868Er_vN2 = "" ;
      ZZ10869Er_vN3 = "" ;
      ZZ10870Er_vN4 = "" ;
      ZZ10974Er_Arts = "" ;
      ZZ10975Er_Artd = "" ;
      ZZ10976Er_Arta = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.terprod__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.terprod__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.terprod__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.terprod__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.terprod__default(),
         new Object[] {
             new Object[] {
            T019R2_A10872Er_Hdr, T019R2_A10873Er_Hdrr, T019R2_A10874Er_hdrp, T019R2_A10875Er_LinV, T019R2_A10849Er_ToE, T019R2_n10849Er_ToE, T019R2_A10850Er_Clicod, T019R2_n10850Er_Clicod, T019R2_A10851Er_Arti, T019R2_n10851Er_Arti,
            T019R2_A10852Er_Color, T019R2_n10852Er_Color, T019R2_A10853Er_Clav, T019R2_n10853Er_Clav, T019R2_A10854Er_Dib, T019R2_n10854Er_Dib, T019R2_A10855Er_Vte, T019R2_n10855Er_Vte, T019R2_A10856Er_Kgs, T019R2_n10856Er_Kgs,
            T019R2_A10857Er_Mts, T019R2_n10857Er_Mts, T019R2_A10858Er_Pdas, T019R2_n10858Er_Pdas, T019R2_A10859Er_FecH, T019R2_n10859Er_FecH, T019R2_A10860Er_FecD, T019R2_n10860Er_FecD, T019R2_A10861Er_FsUlt, T019R2_n10861Er_FsUlt,
            T019R2_A10862Er_FsUltF, T019R2_n10862Er_FsUltF, T019R2_A10863Er_FsSg, T019R2_n10863Er_FsSg, T019R2_A10864Er_TArt, T019R2_n10864Er_TArt, T019R2_A10865Er_Clas, T019R2_n10865Er_Clas, T019R2_A10866Er_Um, T019R2_n10866Er_Um,
            T019R2_A10867Er_vN1, T019R2_n10867Er_vN1, T019R2_A10868Er_vN2, T019R2_n10868Er_vN2, T019R2_A10869Er_vN3, T019R2_n10869Er_vN3, T019R2_A10870Er_vN4, T019R2_n10870Er_vN4, T019R2_A10871Er_Ultf, T019R2_n10871Er_Ultf,
            T019R2_A10879Er_Nhdrs, T019R2_n10879Er_Nhdrs, T019R2_A10880Er_Discod, T019R2_n10880Er_Discod, T019R2_A10889Er_St, T019R2_n10889Er_St, T019R2_A10890Er_Est, T019R2_n10890Er_Est, T019R2_A10974Er_Arts, T019R2_n10974Er_Arts,
            T019R2_A10975Er_Artd, T019R2_n10975Er_Artd, T019R2_A10976Er_Arta, T019R2_n10976Er_Arta, T019R2_A396EmprCod
            }
            , new Object[] {
            T019R3_A10872Er_Hdr, T019R3_A10873Er_Hdrr, T019R3_A10874Er_hdrp, T019R3_A10875Er_LinV, T019R3_A10849Er_ToE, T019R3_n10849Er_ToE, T019R3_A10850Er_Clicod, T019R3_n10850Er_Clicod, T019R3_A10851Er_Arti, T019R3_n10851Er_Arti,
            T019R3_A10852Er_Color, T019R3_n10852Er_Color, T019R3_A10853Er_Clav, T019R3_n10853Er_Clav, T019R3_A10854Er_Dib, T019R3_n10854Er_Dib, T019R3_A10855Er_Vte, T019R3_n10855Er_Vte, T019R3_A10856Er_Kgs, T019R3_n10856Er_Kgs,
            T019R3_A10857Er_Mts, T019R3_n10857Er_Mts, T019R3_A10858Er_Pdas, T019R3_n10858Er_Pdas, T019R3_A10859Er_FecH, T019R3_n10859Er_FecH, T019R3_A10860Er_FecD, T019R3_n10860Er_FecD, T019R3_A10861Er_FsUlt, T019R3_n10861Er_FsUlt,
            T019R3_A10862Er_FsUltF, T019R3_n10862Er_FsUltF, T019R3_A10863Er_FsSg, T019R3_n10863Er_FsSg, T019R3_A10864Er_TArt, T019R3_n10864Er_TArt, T019R3_A10865Er_Clas, T019R3_n10865Er_Clas, T019R3_A10866Er_Um, T019R3_n10866Er_Um,
            T019R3_A10867Er_vN1, T019R3_n10867Er_vN1, T019R3_A10868Er_vN2, T019R3_n10868Er_vN2, T019R3_A10869Er_vN3, T019R3_n10869Er_vN3, T019R3_A10870Er_vN4, T019R3_n10870Er_vN4, T019R3_A10871Er_Ultf, T019R3_n10871Er_Ultf,
            T019R3_A10879Er_Nhdrs, T019R3_n10879Er_Nhdrs, T019R3_A10880Er_Discod, T019R3_n10880Er_Discod, T019R3_A10889Er_St, T019R3_n10889Er_St, T019R3_A10890Er_Est, T019R3_n10890Er_Est, T019R3_A10974Er_Arts, T019R3_n10974Er_Arts,
            T019R3_A10975Er_Artd, T019R3_n10975Er_Artd, T019R3_A10976Er_Arta, T019R3_n10976Er_Arta, T019R3_A396EmprCod
            }
            , new Object[] {
            T019R4_A407EmprNom, T019R4_n407EmprNom
            }
            , new Object[] {
            T019R5_A10872Er_Hdr, T019R5_A10873Er_Hdrr, T019R5_A10874Er_hdrp, T019R5_A10875Er_LinV, T019R5_A407EmprNom, T019R5_n407EmprNom, T019R5_A10849Er_ToE, T019R5_n10849Er_ToE, T019R5_A10850Er_Clicod, T019R5_n10850Er_Clicod,
            T019R5_A10851Er_Arti, T019R5_n10851Er_Arti, T019R5_A10852Er_Color, T019R5_n10852Er_Color, T019R5_A10853Er_Clav, T019R5_n10853Er_Clav, T019R5_A10854Er_Dib, T019R5_n10854Er_Dib, T019R5_A10855Er_Vte, T019R5_n10855Er_Vte,
            T019R5_A10856Er_Kgs, T019R5_n10856Er_Kgs, T019R5_A10857Er_Mts, T019R5_n10857Er_Mts, T019R5_A10858Er_Pdas, T019R5_n10858Er_Pdas, T019R5_A10859Er_FecH, T019R5_n10859Er_FecH, T019R5_A10860Er_FecD, T019R5_n10860Er_FecD,
            T019R5_A10861Er_FsUlt, T019R5_n10861Er_FsUlt, T019R5_A10862Er_FsUltF, T019R5_n10862Er_FsUltF, T019R5_A10863Er_FsSg, T019R5_n10863Er_FsSg, T019R5_A10864Er_TArt, T019R5_n10864Er_TArt, T019R5_A10865Er_Clas, T019R5_n10865Er_Clas,
            T019R5_A10866Er_Um, T019R5_n10866Er_Um, T019R5_A10867Er_vN1, T019R5_n10867Er_vN1, T019R5_A10868Er_vN2, T019R5_n10868Er_vN2, T019R5_A10869Er_vN3, T019R5_n10869Er_vN3, T019R5_A10870Er_vN4, T019R5_n10870Er_vN4,
            T019R5_A10871Er_Ultf, T019R5_n10871Er_Ultf, T019R5_A10879Er_Nhdrs, T019R5_n10879Er_Nhdrs, T019R5_A10880Er_Discod, T019R5_n10880Er_Discod, T019R5_A10889Er_St, T019R5_n10889Er_St, T019R5_A10890Er_Est, T019R5_n10890Er_Est,
            T019R5_A10974Er_Arts, T019R5_n10974Er_Arts, T019R5_A10975Er_Artd, T019R5_n10975Er_Artd, T019R5_A10976Er_Arta, T019R5_n10976Er_Arta, T019R5_A396EmprCod
            }
            , new Object[] {
            T019R6_A396EmprCod, T019R6_A10872Er_Hdr, T019R6_A10873Er_Hdrr, T019R6_A10874Er_hdrp, T019R6_A10875Er_LinV
            }
            , new Object[] {
            T019R7_A396EmprCod, T019R7_A10872Er_Hdr, T019R7_A10873Er_Hdrr, T019R7_A10874Er_hdrp, T019R7_A10875Er_LinV
            }
            , new Object[] {
            T019R8_A396EmprCod, T019R8_A10872Er_Hdr, T019R8_A10873Er_Hdrr, T019R8_A10874Er_hdrp, T019R8_A10875Er_LinV
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019R12_A396EmprCod, T019R12_A10872Er_Hdr, T019R12_A10873Er_Hdrr, T019R12_A10874Er_hdrp, T019R12_A10875Er_LinV, T019R12_A10878Er_Linf
            }
            , new Object[] {
            T019R13_A396EmprCod, T019R13_A10872Er_Hdr, T019R13_A10873Er_Hdrr, T019R13_A10874Er_hdrp, T019R13_A10875Er_LinV
            }
            , new Object[] {
            T019R14_A407EmprNom, T019R14_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TERPROD" ;
   }

   private byte Z10873Er_Hdrr ;
   private byte Z10875Er_LinV ;
   private byte Z10889Er_St ;
   private byte Z10890Er_Est ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10873Er_Hdrr ;
   private byte A10875Er_LinV ;
   private byte A10889Er_St ;
   private byte A10890Er_Est ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10873Er_Hdrr ;
   private byte ZZ10875Er_LinV ;
   private byte ZZ10889Er_St ;
   private byte ZZ10890Er_Est ;
   private short Z10871Er_Ultf ;
   private short Z10879Er_Nhdrs ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10871Er_Ultf ;
   private short A10879Er_Nhdrs ;
   private short RcdFound1449 ;
   private short nIsDirty_1449 ;
   private short ZZ10871Er_Ultf ;
   private short ZZ10879Er_Nhdrs ;
   private int Z10872Er_Hdr ;
   private int Z10850Er_Clicod ;
   private int Z10880Er_Discod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A10872Er_Hdr ;
   private int edtEr_Hdr_Enabled ;
   private int edtEr_Hdrr_Enabled ;
   private int edtEr_hdrp_Enabled ;
   private int edtEr_LinV_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEr_ToE_Enabled ;
   private int A10850Er_Clicod ;
   private int edtEr_Clicod_Enabled ;
   private int edtEr_Arti_Enabled ;
   private int edtEr_Color_Enabled ;
   private int edtEr_Clav_Enabled ;
   private int edtEr_Dib_Enabled ;
   private int edtEr_Vte_Enabled ;
   private int edtEr_Kgs_Enabled ;
   private int edtEr_Mts_Enabled ;
   private int edtEr_Pdas_Enabled ;
   private int edtEr_FecH_Enabled ;
   private int edtEr_FecD_Enabled ;
   private int edtEr_FsUlt_Enabled ;
   private int edtEr_FsUltF_Enabled ;
   private int edtEr_FsSg_Enabled ;
   private int edtEr_TArt_Enabled ;
   private int edtEr_Clas_Enabled ;
   private int edtEr_Um_Enabled ;
   private int edtEr_vN1_Enabled ;
   private int edtEr_vN2_Enabled ;
   private int edtEr_vN3_Enabled ;
   private int edtEr_vN4_Enabled ;
   private int edtEr_Ultf_Enabled ;
   private int edtEr_Nhdrs_Enabled ;
   private int A10880Er_Discod ;
   private int edtEr_Discod_Enabled ;
   private int edtEr_St_Enabled ;
   private int edtEr_Est_Enabled ;
   private int edtEr_Arts_Enabled ;
   private int edtEr_Artd_Enabled ;
   private int edtEr_Arta_Enabled ;
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
   private int edtEr_Arta_Backcolor ;
   private int edtEr_Artd_Backcolor ;
   private int edtEr_Arts_Backcolor ;
   private int edtEr_Est_Backcolor ;
   private int edtEr_St_Backcolor ;
   private int edtEr_Discod_Backcolor ;
   private int edtEr_Nhdrs_Backcolor ;
   private int edtEr_Ultf_Backcolor ;
   private int edtEr_vN4_Backcolor ;
   private int edtEr_vN3_Backcolor ;
   private int edtEr_vN2_Backcolor ;
   private int edtEr_vN1_Backcolor ;
   private int edtEr_Um_Backcolor ;
   private int edtEr_Clas_Backcolor ;
   private int edtEr_TArt_Backcolor ;
   private int edtEr_FsSg_Backcolor ;
   private int edtEr_FsUltF_Backcolor ;
   private int edtEr_FsUlt_Backcolor ;
   private int edtEr_FecD_Backcolor ;
   private int edtEr_FecH_Backcolor ;
   private int edtEr_Pdas_Backcolor ;
   private int edtEr_Mts_Backcolor ;
   private int edtEr_Kgs_Backcolor ;
   private int edtEr_Vte_Backcolor ;
   private int edtEr_Dib_Backcolor ;
   private int edtEr_Clav_Backcolor ;
   private int edtEr_Color_Backcolor ;
   private int edtEr_Arti_Backcolor ;
   private int edtEr_Clicod_Backcolor ;
   private int edtEr_ToE_Backcolor ;
   private int edtEr_LinV_Backcolor ;
   private int edtEr_hdrp_Backcolor ;
   private int edtEr_Hdrr_Backcolor ;
   private int edtEr_Hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10872Er_Hdr ;
   private int ZZ10850Er_Clicod ;
   private int ZZ10880Er_Discod ;
   private java.math.BigDecimal Z10856Er_Kgs ;
   private java.math.BigDecimal Z10857Er_Mts ;
   private java.math.BigDecimal A10856Er_Kgs ;
   private java.math.BigDecimal A10857Er_Mts ;
   private java.math.BigDecimal ZZ10856Er_Kgs ;
   private java.math.BigDecimal ZZ10857Er_Mts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10874Er_hdrp ;
   private String Z10849Er_ToE ;
   private String Z10851Er_Arti ;
   private String Z10852Er_Color ;
   private String Z10853Er_Clav ;
   private String Z10854Er_Dib ;
   private String Z10855Er_Vte ;
   private String Z10858Er_Pdas ;
   private String Z10861Er_FsUlt ;
   private String Z10863Er_FsSg ;
   private String Z10864Er_TArt ;
   private String Z10865Er_Clas ;
   private String Z10866Er_Um ;
   private String Z10867Er_vN1 ;
   private String Z10868Er_vN2 ;
   private String Z10869Er_vN3 ;
   private String Z10870Er_vN4 ;
   private String Z10974Er_Arts ;
   private String Z10975Er_Artd ;
   private String Z10976Er_Arta ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
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
   private String A396EmprCod ;
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
   private String A10874Er_hdrp ;
   private String edtEr_hdrp_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEr_LinV_Internalname ;
   private String edtEr_LinV_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEr_ToE_Internalname ;
   private String A10849Er_ToE ;
   private String edtEr_ToE_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEr_Clicod_Internalname ;
   private String edtEr_Clicod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEr_Arti_Internalname ;
   private String A10851Er_Arti ;
   private String edtEr_Arti_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEr_Color_Internalname ;
   private String A10852Er_Color ;
   private String edtEr_Color_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEr_Clav_Internalname ;
   private String A10853Er_Clav ;
   private String edtEr_Clav_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEr_Dib_Internalname ;
   private String A10854Er_Dib ;
   private String edtEr_Dib_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEr_Vte_Internalname ;
   private String A10855Er_Vte ;
   private String edtEr_Vte_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEr_Kgs_Internalname ;
   private String edtEr_Kgs_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEr_Mts_Internalname ;
   private String edtEr_Mts_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEr_Pdas_Internalname ;
   private String A10858Er_Pdas ;
   private String edtEr_Pdas_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtEr_FecH_Internalname ;
   private String edtEr_FecH_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEr_FecD_Internalname ;
   private String edtEr_FecD_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtEr_FsUlt_Internalname ;
   private String A10861Er_FsUlt ;
   private String edtEr_FsUlt_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtEr_FsUltF_Internalname ;
   private String edtEr_FsUltF_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtEr_FsSg_Internalname ;
   private String A10863Er_FsSg ;
   private String edtEr_FsSg_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtEr_TArt_Internalname ;
   private String A10864Er_TArt ;
   private String edtEr_TArt_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtEr_Clas_Internalname ;
   private String A10865Er_Clas ;
   private String edtEr_Clas_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtEr_Um_Internalname ;
   private String A10866Er_Um ;
   private String edtEr_Um_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtEr_vN1_Internalname ;
   private String A10867Er_vN1 ;
   private String edtEr_vN1_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtEr_vN2_Internalname ;
   private String A10868Er_vN2 ;
   private String edtEr_vN2_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtEr_vN3_Internalname ;
   private String A10869Er_vN3 ;
   private String edtEr_vN3_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtEr_vN4_Internalname ;
   private String A10870Er_vN4 ;
   private String edtEr_vN4_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtEr_Ultf_Internalname ;
   private String edtEr_Ultf_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtEr_Nhdrs_Internalname ;
   private String edtEr_Nhdrs_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtEr_Discod_Internalname ;
   private String edtEr_Discod_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtEr_St_Internalname ;
   private String edtEr_St_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtEr_Est_Internalname ;
   private String edtEr_Est_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtEr_Arts_Internalname ;
   private String A10974Er_Arts ;
   private String edtEr_Arts_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtEr_Artd_Internalname ;
   private String A10975Er_Artd ;
   private String edtEr_Artd_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtEr_Arta_Internalname ;
   private String A10976Er_Arta ;
   private String edtEr_Arta_Jsonclick ;
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
   private String sMode1449 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10874Er_hdrp ;
   private String ZZ407EmprNom ;
   private String ZZ10849Er_ToE ;
   private String ZZ10851Er_Arti ;
   private String ZZ10852Er_Color ;
   private String ZZ10853Er_Clav ;
   private String ZZ10854Er_Dib ;
   private String ZZ10855Er_Vte ;
   private String ZZ10858Er_Pdas ;
   private String ZZ10861Er_FsUlt ;
   private String ZZ10863Er_FsSg ;
   private String ZZ10864Er_TArt ;
   private String ZZ10865Er_Clas ;
   private String ZZ10866Er_Um ;
   private String ZZ10867Er_vN1 ;
   private String ZZ10868Er_vN2 ;
   private String ZZ10869Er_vN3 ;
   private String ZZ10870Er_vN4 ;
   private String ZZ10974Er_Arts ;
   private String ZZ10975Er_Artd ;
   private String ZZ10976Er_Arta ;
   private java.util.Date Z10859Er_FecH ;
   private java.util.Date Z10860Er_FecD ;
   private java.util.Date Z10862Er_FsUltF ;
   private java.util.Date A10859Er_FecH ;
   private java.util.Date A10860Er_FecD ;
   private java.util.Date A10862Er_FsUltF ;
   private java.util.Date ZZ10859Er_FecH ;
   private java.util.Date ZZ10860Er_FecD ;
   private java.util.Date ZZ10862Er_FsUltF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10849Er_ToE ;
   private boolean n10850Er_Clicod ;
   private boolean n10851Er_Arti ;
   private boolean n10852Er_Color ;
   private boolean n10853Er_Clav ;
   private boolean n10854Er_Dib ;
   private boolean n10855Er_Vte ;
   private boolean n10856Er_Kgs ;
   private boolean n10857Er_Mts ;
   private boolean n10858Er_Pdas ;
   private boolean n10859Er_FecH ;
   private boolean n10860Er_FecD ;
   private boolean n10861Er_FsUlt ;
   private boolean n10862Er_FsUltF ;
   private boolean n10863Er_FsSg ;
   private boolean n10864Er_TArt ;
   private boolean n10865Er_Clas ;
   private boolean n10866Er_Um ;
   private boolean n10867Er_vN1 ;
   private boolean n10868Er_vN2 ;
   private boolean n10869Er_vN3 ;
   private boolean n10870Er_vN4 ;
   private boolean n10871Er_Ultf ;
   private boolean n10879Er_Nhdrs ;
   private boolean n10880Er_Discod ;
   private boolean n10889Er_St ;
   private boolean n10890Er_Est ;
   private boolean n10974Er_Arts ;
   private boolean n10975Er_Artd ;
   private boolean n10976Er_Arta ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T019R4_A407EmprNom ;
   private boolean[] T019R4_n407EmprNom ;
   private int[] T019R5_A10872Er_Hdr ;
   private byte[] T019R5_A10873Er_Hdrr ;
   private String[] T019R5_A10874Er_hdrp ;
   private byte[] T019R5_A10875Er_LinV ;
   private String[] T019R5_A407EmprNom ;
   private boolean[] T019R5_n407EmprNom ;
   private String[] T019R5_A10849Er_ToE ;
   private boolean[] T019R5_n10849Er_ToE ;
   private int[] T019R5_A10850Er_Clicod ;
   private boolean[] T019R5_n10850Er_Clicod ;
   private String[] T019R5_A10851Er_Arti ;
   private boolean[] T019R5_n10851Er_Arti ;
   private String[] T019R5_A10852Er_Color ;
   private boolean[] T019R5_n10852Er_Color ;
   private String[] T019R5_A10853Er_Clav ;
   private boolean[] T019R5_n10853Er_Clav ;
   private String[] T019R5_A10854Er_Dib ;
   private boolean[] T019R5_n10854Er_Dib ;
   private String[] T019R5_A10855Er_Vte ;
   private boolean[] T019R5_n10855Er_Vte ;
   private java.math.BigDecimal[] T019R5_A10856Er_Kgs ;
   private boolean[] T019R5_n10856Er_Kgs ;
   private java.math.BigDecimal[] T019R5_A10857Er_Mts ;
   private boolean[] T019R5_n10857Er_Mts ;
   private String[] T019R5_A10858Er_Pdas ;
   private boolean[] T019R5_n10858Er_Pdas ;
   private java.util.Date[] T019R5_A10859Er_FecH ;
   private boolean[] T019R5_n10859Er_FecH ;
   private java.util.Date[] T019R5_A10860Er_FecD ;
   private boolean[] T019R5_n10860Er_FecD ;
   private String[] T019R5_A10861Er_FsUlt ;
   private boolean[] T019R5_n10861Er_FsUlt ;
   private java.util.Date[] T019R5_A10862Er_FsUltF ;
   private boolean[] T019R5_n10862Er_FsUltF ;
   private String[] T019R5_A10863Er_FsSg ;
   private boolean[] T019R5_n10863Er_FsSg ;
   private String[] T019R5_A10864Er_TArt ;
   private boolean[] T019R5_n10864Er_TArt ;
   private String[] T019R5_A10865Er_Clas ;
   private boolean[] T019R5_n10865Er_Clas ;
   private String[] T019R5_A10866Er_Um ;
   private boolean[] T019R5_n10866Er_Um ;
   private String[] T019R5_A10867Er_vN1 ;
   private boolean[] T019R5_n10867Er_vN1 ;
   private String[] T019R5_A10868Er_vN2 ;
   private boolean[] T019R5_n10868Er_vN2 ;
   private String[] T019R5_A10869Er_vN3 ;
   private boolean[] T019R5_n10869Er_vN3 ;
   private String[] T019R5_A10870Er_vN4 ;
   private boolean[] T019R5_n10870Er_vN4 ;
   private short[] T019R5_A10871Er_Ultf ;
   private boolean[] T019R5_n10871Er_Ultf ;
   private short[] T019R5_A10879Er_Nhdrs ;
   private boolean[] T019R5_n10879Er_Nhdrs ;
   private int[] T019R5_A10880Er_Discod ;
   private boolean[] T019R5_n10880Er_Discod ;
   private byte[] T019R5_A10889Er_St ;
   private boolean[] T019R5_n10889Er_St ;
   private byte[] T019R5_A10890Er_Est ;
   private boolean[] T019R5_n10890Er_Est ;
   private String[] T019R5_A10974Er_Arts ;
   private boolean[] T019R5_n10974Er_Arts ;
   private String[] T019R5_A10975Er_Artd ;
   private boolean[] T019R5_n10975Er_Artd ;
   private String[] T019R5_A10976Er_Arta ;
   private boolean[] T019R5_n10976Er_Arta ;
   private String[] T019R5_A396EmprCod ;
   private String[] T019R6_A396EmprCod ;
   private int[] T019R6_A10872Er_Hdr ;
   private byte[] T019R6_A10873Er_Hdrr ;
   private String[] T019R6_A10874Er_hdrp ;
   private byte[] T019R6_A10875Er_LinV ;
   private int[] T019R3_A10872Er_Hdr ;
   private byte[] T019R3_A10873Er_Hdrr ;
   private String[] T019R3_A10874Er_hdrp ;
   private byte[] T019R3_A10875Er_LinV ;
   private String[] T019R3_A10849Er_ToE ;
   private boolean[] T019R3_n10849Er_ToE ;
   private int[] T019R3_A10850Er_Clicod ;
   private boolean[] T019R3_n10850Er_Clicod ;
   private String[] T019R3_A10851Er_Arti ;
   private boolean[] T019R3_n10851Er_Arti ;
   private String[] T019R3_A10852Er_Color ;
   private boolean[] T019R3_n10852Er_Color ;
   private String[] T019R3_A10853Er_Clav ;
   private boolean[] T019R3_n10853Er_Clav ;
   private String[] T019R3_A10854Er_Dib ;
   private boolean[] T019R3_n10854Er_Dib ;
   private String[] T019R3_A10855Er_Vte ;
   private boolean[] T019R3_n10855Er_Vte ;
   private java.math.BigDecimal[] T019R3_A10856Er_Kgs ;
   private boolean[] T019R3_n10856Er_Kgs ;
   private java.math.BigDecimal[] T019R3_A10857Er_Mts ;
   private boolean[] T019R3_n10857Er_Mts ;
   private String[] T019R3_A10858Er_Pdas ;
   private boolean[] T019R3_n10858Er_Pdas ;
   private java.util.Date[] T019R3_A10859Er_FecH ;
   private boolean[] T019R3_n10859Er_FecH ;
   private java.util.Date[] T019R3_A10860Er_FecD ;
   private boolean[] T019R3_n10860Er_FecD ;
   private String[] T019R3_A10861Er_FsUlt ;
   private boolean[] T019R3_n10861Er_FsUlt ;
   private java.util.Date[] T019R3_A10862Er_FsUltF ;
   private boolean[] T019R3_n10862Er_FsUltF ;
   private String[] T019R3_A10863Er_FsSg ;
   private boolean[] T019R3_n10863Er_FsSg ;
   private String[] T019R3_A10864Er_TArt ;
   private boolean[] T019R3_n10864Er_TArt ;
   private String[] T019R3_A10865Er_Clas ;
   private boolean[] T019R3_n10865Er_Clas ;
   private String[] T019R3_A10866Er_Um ;
   private boolean[] T019R3_n10866Er_Um ;
   private String[] T019R3_A10867Er_vN1 ;
   private boolean[] T019R3_n10867Er_vN1 ;
   private String[] T019R3_A10868Er_vN2 ;
   private boolean[] T019R3_n10868Er_vN2 ;
   private String[] T019R3_A10869Er_vN3 ;
   private boolean[] T019R3_n10869Er_vN3 ;
   private String[] T019R3_A10870Er_vN4 ;
   private boolean[] T019R3_n10870Er_vN4 ;
   private short[] T019R3_A10871Er_Ultf ;
   private boolean[] T019R3_n10871Er_Ultf ;
   private short[] T019R3_A10879Er_Nhdrs ;
   private boolean[] T019R3_n10879Er_Nhdrs ;
   private int[] T019R3_A10880Er_Discod ;
   private boolean[] T019R3_n10880Er_Discod ;
   private byte[] T019R3_A10889Er_St ;
   private boolean[] T019R3_n10889Er_St ;
   private byte[] T019R3_A10890Er_Est ;
   private boolean[] T019R3_n10890Er_Est ;
   private String[] T019R3_A10974Er_Arts ;
   private boolean[] T019R3_n10974Er_Arts ;
   private String[] T019R3_A10975Er_Artd ;
   private boolean[] T019R3_n10975Er_Artd ;
   private String[] T019R3_A10976Er_Arta ;
   private boolean[] T019R3_n10976Er_Arta ;
   private String[] T019R3_A396EmprCod ;
   private String[] T019R7_A396EmprCod ;
   private int[] T019R7_A10872Er_Hdr ;
   private byte[] T019R7_A10873Er_Hdrr ;
   private String[] T019R7_A10874Er_hdrp ;
   private byte[] T019R7_A10875Er_LinV ;
   private String[] T019R8_A396EmprCod ;
   private int[] T019R8_A10872Er_Hdr ;
   private byte[] T019R8_A10873Er_Hdrr ;
   private String[] T019R8_A10874Er_hdrp ;
   private byte[] T019R8_A10875Er_LinV ;
   private int[] T019R2_A10872Er_Hdr ;
   private byte[] T019R2_A10873Er_Hdrr ;
   private String[] T019R2_A10874Er_hdrp ;
   private byte[] T019R2_A10875Er_LinV ;
   private String[] T019R2_A10849Er_ToE ;
   private boolean[] T019R2_n10849Er_ToE ;
   private int[] T019R2_A10850Er_Clicod ;
   private boolean[] T019R2_n10850Er_Clicod ;
   private String[] T019R2_A10851Er_Arti ;
   private boolean[] T019R2_n10851Er_Arti ;
   private String[] T019R2_A10852Er_Color ;
   private boolean[] T019R2_n10852Er_Color ;
   private String[] T019R2_A10853Er_Clav ;
   private boolean[] T019R2_n10853Er_Clav ;
   private String[] T019R2_A10854Er_Dib ;
   private boolean[] T019R2_n10854Er_Dib ;
   private String[] T019R2_A10855Er_Vte ;
   private boolean[] T019R2_n10855Er_Vte ;
   private java.math.BigDecimal[] T019R2_A10856Er_Kgs ;
   private boolean[] T019R2_n10856Er_Kgs ;
   private java.math.BigDecimal[] T019R2_A10857Er_Mts ;
   private boolean[] T019R2_n10857Er_Mts ;
   private String[] T019R2_A10858Er_Pdas ;
   private boolean[] T019R2_n10858Er_Pdas ;
   private java.util.Date[] T019R2_A10859Er_FecH ;
   private boolean[] T019R2_n10859Er_FecH ;
   private java.util.Date[] T019R2_A10860Er_FecD ;
   private boolean[] T019R2_n10860Er_FecD ;
   private String[] T019R2_A10861Er_FsUlt ;
   private boolean[] T019R2_n10861Er_FsUlt ;
   private java.util.Date[] T019R2_A10862Er_FsUltF ;
   private boolean[] T019R2_n10862Er_FsUltF ;
   private String[] T019R2_A10863Er_FsSg ;
   private boolean[] T019R2_n10863Er_FsSg ;
   private String[] T019R2_A10864Er_TArt ;
   private boolean[] T019R2_n10864Er_TArt ;
   private String[] T019R2_A10865Er_Clas ;
   private boolean[] T019R2_n10865Er_Clas ;
   private String[] T019R2_A10866Er_Um ;
   private boolean[] T019R2_n10866Er_Um ;
   private String[] T019R2_A10867Er_vN1 ;
   private boolean[] T019R2_n10867Er_vN1 ;
   private String[] T019R2_A10868Er_vN2 ;
   private boolean[] T019R2_n10868Er_vN2 ;
   private String[] T019R2_A10869Er_vN3 ;
   private boolean[] T019R2_n10869Er_vN3 ;
   private String[] T019R2_A10870Er_vN4 ;
   private boolean[] T019R2_n10870Er_vN4 ;
   private short[] T019R2_A10871Er_Ultf ;
   private boolean[] T019R2_n10871Er_Ultf ;
   private short[] T019R2_A10879Er_Nhdrs ;
   private boolean[] T019R2_n10879Er_Nhdrs ;
   private int[] T019R2_A10880Er_Discod ;
   private boolean[] T019R2_n10880Er_Discod ;
   private byte[] T019R2_A10889Er_St ;
   private boolean[] T019R2_n10889Er_St ;
   private byte[] T019R2_A10890Er_Est ;
   private boolean[] T019R2_n10890Er_Est ;
   private String[] T019R2_A10974Er_Arts ;
   private boolean[] T019R2_n10974Er_Arts ;
   private String[] T019R2_A10975Er_Artd ;
   private boolean[] T019R2_n10975Er_Artd ;
   private String[] T019R2_A10976Er_Arta ;
   private boolean[] T019R2_n10976Er_Arta ;
   private String[] T019R2_A396EmprCod ;
   private String[] T019R12_A396EmprCod ;
   private int[] T019R12_A10872Er_Hdr ;
   private byte[] T019R12_A10873Er_Hdrr ;
   private String[] T019R12_A10874Er_hdrp ;
   private byte[] T019R12_A10875Er_LinV ;
   private short[] T019R12_A10878Er_Linf ;
   private String[] T019R13_A396EmprCod ;
   private int[] T019R13_A10872Er_Hdr ;
   private byte[] T019R13_A10873Er_Hdrr ;
   private String[] T019R13_A10874Er_hdrp ;
   private byte[] T019R13_A10875Er_LinV ;
   private String[] T019R14_A407EmprNom ;
   private boolean[] T019R14_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class terprod__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terprod__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terprod__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terprod__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class terprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019R2", "SELECT Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_ToE, Er_Clicod, Er_Arti, Er_Color, Er_Clav, Er_Dib, Er_Vte, Er_Kgs, Er_Mts, Er_Pdas, Er_FecH, Er_FecD, Er_FsUlt, Er_FsUltF, Er_FsSg, Er_TArt, Er_Clas, Er_Um, Er_vN1, Er_vN2, Er_vN3, Er_vN4, Er_Ultf, Er_Nhdrs, Er_Discod, Er_St, Er_Est, Er_Arts, Er_Artd, Er_Arta, EmprCod FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ?  FOR UPDATE OF Er_ToE, Er_Clicod, Er_Arti, Er_Color, Er_Clav, Er_Dib, Er_Vte, Er_Kgs, Er_Mts, Er_Pdas, Er_FecH, Er_FecD, Er_FsUlt, Er_FsUltF, Er_FsSg, Er_TArt, Er_Clas, Er_Um, Er_vN1, Er_vN2, Er_vN3, Er_vN4, Er_Ultf, Er_Nhdrs, Er_Discod, Er_St, Er_Est, Er_Arts, Er_Artd, Er_Arta NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R3", "SELECT Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_ToE, Er_Clicod, Er_Arti, Er_Color, Er_Clav, Er_Dib, Er_Vte, Er_Kgs, Er_Mts, Er_Pdas, Er_FecH, Er_FecD, Er_FsUlt, Er_FsUltF, Er_FsSg, Er_TArt, Er_Clas, Er_Um, Er_vN1, Er_vN2, Er_vN3, Er_vN4, Er_Ultf, Er_Nhdrs, Er_Discod, Er_St, Er_Est, Er_Arts, Er_Artd, Er_Arta, EmprCod FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Er_Hdr, TM1.Er_Hdrr, TM1.Er_hdrp, TM1.Er_LinV, T2.EmprNom, TM1.Er_ToE, TM1.Er_Clicod, TM1.Er_Arti, TM1.Er_Color, TM1.Er_Clav, TM1.Er_Dib, TM1.Er_Vte, TM1.Er_Kgs, TM1.Er_Mts, TM1.Er_Pdas, TM1.Er_FecH, TM1.Er_FecD, TM1.Er_FsUlt, TM1.Er_FsUltF, TM1.Er_FsSg, TM1.Er_TArt, TM1.Er_Clas, TM1.Er_Um, TM1.Er_vN1, TM1.Er_vN2, TM1.Er_vN3, TM1.Er_vN4, TM1.Er_Ultf, TM1.Er_Nhdrs, TM1.Er_Discod, TM1.Er_St, TM1.Er_Est, TM1.Er_Arts, TM1.Er_Artd, TM1.Er_Arta, TM1.EmprCod FROM (TXPERPROD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Er_Hdr = ? and TM1.Er_Hdrr = ? and TM1.Er_hdrp = ? and TM1.Er_LinV = ? ORDER BY TM1.EmprCod, TM1.Er_Hdr, TM1.Er_Hdrr, TM1.Er_hdrp, TM1.Er_LinV ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERPROD WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERPROD WHERE ( Er_Hdr > ? or Er_Hdr = ? and Er_Hdrr > ? or Er_Hdrr = ? and Er_Hdr = ? and Er_hdrp > ? or Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_LinV > ?) and EmprCod = ? ORDER BY EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019R8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERPROD WHERE ( Er_Hdr < ? or Er_Hdr = ? and Er_Hdrr < ? or Er_Hdrr = ? and Er_Hdr = ? and Er_hdrp < ? or Er_hdrp = ? and Er_Hdrr = ? and Er_Hdr = ? and Er_LinV < ?) and EmprCod = ? ORDER BY EmprCod DESC, Er_Hdr DESC, Er_Hdrr DESC, Er_hdrp DESC, Er_LinV DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019R9", "INSERT INTO TXPERPROD(Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_ToE, Er_Clicod, Er_Arti, Er_Color, Er_Clav, Er_Dib, Er_Vte, Er_Kgs, Er_Mts, Er_Pdas, Er_FecH, Er_FecD, Er_FsUlt, Er_FsUltF, Er_FsSg, Er_TArt, Er_Clas, Er_Um, Er_vN1, Er_vN2, Er_vN3, Er_vN4, Er_Ultf, Er_Nhdrs, Er_Discod, Er_St, Er_Est, Er_Arts, Er_Artd, Er_Arta, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPERPROD")
         ,new UpdateCursor("T019R10", "UPDATE TXPERPROD SET Er_ToE=?, Er_Clicod=?, Er_Arti=?, Er_Color=?, Er_Clav=?, Er_Dib=?, Er_Vte=?, Er_Kgs=?, Er_Mts=?, Er_Pdas=?, Er_FecH=?, Er_FecD=?, Er_FsUlt=?, Er_FsUltF=?, Er_FsSg=?, Er_TArt=?, Er_Clas=?, Er_Um=?, Er_vN1=?, Er_vN2=?, Er_vN3=?, Er_vN4=?, Er_Ultf=?, Er_Nhdrs=?, Er_Discod=?, Er_St=?, Er_Est=?, Er_Arts=?, Er_Artd=?, Er_Arta=?  WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ?", GX_NOMASK, "TXPERPROD")
         ,new UpdateCursor("T019R11", "DELETE FROM TXPERPROD  WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ?", GX_NOMASK, "TXPERPROD")
         ,new ForEachCursor("T019R12", "SELECT * FROM (SELECT EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_Linf FROM TXPERFRAC WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019R13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV FROM TXPERPROD WHERE EmprCod = ? ORDER BY EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019R14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((int[]) buf[52])[0] = rslt.getInt(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 100);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((int[]) buf[52])[0] = rslt.getInt(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 100);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((byte[]) buf[58])[0] = rslt.getByte(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 100);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 30);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 12 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               return;
            case 5 :
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
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 6 :
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
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 12);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 8);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[33], 8);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[37], 30);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[55]).byteValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[59], 30);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[61], 100);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[63], 30);
               }
               stmt.setString(35, (String)parms[64], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 13);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 12);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 30);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[23]);
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
                  stmt.setString(15, (String)parms[29], 8);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 30);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 30);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 2);
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
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 30);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 100);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 30);
               }
               stmt.setString(31, (String)parms[60], 3);
               stmt.setInt(32, ((Number) parms[61]).intValue());
               stmt.setByte(33, ((Number) parms[62]).byteValue());
               stmt.setString(34, (String)parms[63], 1);
               stmt.setByte(35, ((Number) parms[64]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

