package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrnproces_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttrnproces_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrnproces_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrnproces_impl.class ));
   }

   public ttrnproces_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrnPROCES.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Coste Productos Porceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCosPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3798ProCosPrd, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProCosPrd_Enabled!=0) ? localUtil.format( A3798ProCosPrd, "ZZZZ9.99") : localUtil.format( A3798ProCosPrd, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCosPrd_Jsonclick, 0, "", "", "", "", "", 1, edtProCosPrd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Merma Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProMerPor_Internalname, GXutil.ltrim( localUtil.ntoc( A3799ProMerPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProMerPor_Enabled!=0) ? localUtil.format( A3799ProMerPor, "ZZ9.99") : localUtil.format( A3799ProMerPor, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProMerPor_Jsonclick, 0, "", "", "", "", "", 1, edtProMerPor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Margen Comercial Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProMarPor_Internalname, GXutil.ltrim( localUtil.ntoc( A3800ProMarPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProMarPor_Enabled!=0) ? localUtil.format( A3800ProMarPor, "ZZ9.99") : localUtil.format( A3800ProMarPor, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProMarPor_Jsonclick, 0, "", "", "", "", "", 1, edtProMarPor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Precio Maximo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProPreMax_Internalname, GXutil.ltrim( localUtil.ntoc( A3801ProPreMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProPreMax_Enabled!=0) ? localUtil.format( A3801ProPreMax, "ZZZZZ9.999") : localUtil.format( A3801ProPreMax, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProPreMax_Jsonclick, 0, "", "", "", "", "", 1, edtProPreMax_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Precio Minimo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProPreMin_Internalname, GXutil.ltrim( localUtil.ntoc( A3802ProPreMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProPreMin_Enabled!=0) ? localUtil.format( A3802ProPreMin, "ZZZZZ9.999") : localUtil.format( A3802ProPreMin, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProPreMin_Jsonclick, 0, "", "", "", "", "", 1, edtProPreMin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnPROCES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnPROCES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrnPROCES.htm");
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
      e111FD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z3798ProCosPrd = localUtil.ctond( httpContext.cgiGet( "Z3798ProCosPrd")) ;
            Z3799ProMerPor = localUtil.ctond( httpContext.cgiGet( "Z3799ProMerPor")) ;
            Z3800ProMarPor = localUtil.ctond( httpContext.cgiGet( "Z3800ProMarPor")) ;
            Z3801ProPreMax = localUtil.ctond( httpContext.cgiGet( "Z3801ProPreMax")) ;
            Z3802ProPreMin = localUtil.ctond( httpContext.cgiGet( "Z3802ProPreMin")) ;
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
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProCosPrd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProCosPrd_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCOSPRD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProCosPrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3798ProCosPrd = DecimalUtil.ZERO ;
               n3798ProCosPrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrimstr( A3798ProCosPrd, 8, 2));
            }
            else
            {
               A3798ProCosPrd = localUtil.ctond( httpContext.cgiGet( edtProCosPrd_Internalname)) ;
               n3798ProCosPrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrimstr( A3798ProCosPrd, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProMerPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProMerPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROMERPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProMerPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3799ProMerPor = DecimalUtil.ZERO ;
               n3799ProMerPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrimstr( A3799ProMerPor, 6, 2));
            }
            else
            {
               A3799ProMerPor = localUtil.ctond( httpContext.cgiGet( edtProMerPor_Internalname)) ;
               n3799ProMerPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrimstr( A3799ProMerPor, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProMarPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProMarPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROMARPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProMarPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3800ProMarPor = DecimalUtil.ZERO ;
               n3800ProMarPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrimstr( A3800ProMarPor, 6, 2));
            }
            else
            {
               A3800ProMarPor = localUtil.ctond( httpContext.cgiGet( edtProMarPor_Internalname)) ;
               n3800ProMarPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrimstr( A3800ProMarPor, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProPreMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPreMax_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROPREMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProPreMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3801ProPreMax = DecimalUtil.ZERO ;
               n3801ProPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrimstr( A3801ProPreMax, 12, 5));
            }
            else
            {
               A3801ProPreMax = localUtil.ctond( httpContext.cgiGet( edtProPreMax_Internalname)) ;
               n3801ProPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrimstr( A3801ProPreMax, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProPreMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPreMin_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROPREMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProPreMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3802ProPreMin = DecimalUtil.ZERO ;
               n3802ProPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrimstr( A3802ProPreMin, 12, 5));
            }
            else
            {
               A3802ProPreMin = localUtil.ctond( httpContext.cgiGet( edtProPreMin_Internalname)) ;
               n3802ProPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrimstr( A3802ProPreMin, 12, 5));
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
                        e111FD2 ();
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
            initAll1FD87( ) ;
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
      disableAttributes1FD87( ) ;
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

   public void confirm_1FD0( )
   {
      beforeValidate1FD87( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FD87( ) ;
         }
         else
         {
            checkExtendedTable1FD87( ) ;
            if ( AnyError == 0 )
            {
               zm1FD87( 2) ;
            }
            closeExtendedTableCursors1FD87( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1FD0( ) ;
      }
   }

   public void resetCaption1FD0( )
   {
   }

   public void e111FD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrnproces_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttrnproces_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrnproces_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrnproces_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrnproces_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrnproces_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FD87( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3798ProCosPrd = T01FD3_A3798ProCosPrd[0] ;
            Z3799ProMerPor = T01FD3_A3799ProMerPor[0] ;
            Z3800ProMarPor = T01FD3_A3800ProMarPor[0] ;
            Z3801ProPreMax = T01FD3_A3801ProPreMax[0] ;
            Z3802ProPreMin = T01FD3_A3802ProPreMin[0] ;
         }
         else
         {
            Z3798ProCosPrd = A3798ProCosPrd ;
            Z3799ProMerPor = A3799ProMerPor ;
            Z3800ProMarPor = A3800ProMarPor ;
            Z3801ProPreMax = A3801ProPreMax ;
            Z3802ProPreMin = A3802ProPreMin ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z758ProCod = A758ProCod ;
         Z3798ProCosPrd = A3798ProCosPrd ;
         Z3799ProMerPor = A3799ProMerPor ;
         Z3800ProMarPor = A3800ProMarPor ;
         Z3801ProPreMax = A3801ProPreMax ;
         Z3802ProPreMin = A3802ProPreMin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTrnPROCES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01FD4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FD4_A407EmprNom[0] ;
      n407EmprNom = T01FD4_n407EmprNom[0] ;
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

   public void load1FD87( )
   {
      /* Using cursor T01FD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A407EmprNom = T01FD5_A407EmprNom[0] ;
         n407EmprNom = T01FD5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3798ProCosPrd = T01FD5_A3798ProCosPrd[0] ;
         n3798ProCosPrd = T01FD5_n3798ProCosPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrimstr( A3798ProCosPrd, 8, 2));
         A3799ProMerPor = T01FD5_A3799ProMerPor[0] ;
         n3799ProMerPor = T01FD5_n3799ProMerPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrimstr( A3799ProMerPor, 6, 2));
         A3800ProMarPor = T01FD5_A3800ProMarPor[0] ;
         n3800ProMarPor = T01FD5_n3800ProMarPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrimstr( A3800ProMarPor, 6, 2));
         A3801ProPreMax = T01FD5_A3801ProPreMax[0] ;
         n3801ProPreMax = T01FD5_n3801ProPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrimstr( A3801ProPreMax, 12, 5));
         A3802ProPreMin = T01FD5_A3802ProPreMin[0] ;
         n3802ProPreMin = T01FD5_n3802ProPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrimstr( A3802ProPreMin, 12, 5));
         zm1FD87( -1) ;
      }
      pr_default.close(3);
      onLoadActions1FD87( ) ;
   }

   public void onLoadActions1FD87( )
   {
   }

   public void checkExtendedTable1FD87( )
   {
      nIsDirty_87 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FD87( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FD87( )
   {
      /* Using cursor T01FD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound87 = (short)(1) ;
      }
      else
      {
         RcdFound87 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FD87( 1) ;
         RcdFound87 = (short)(1) ;
         A758ProCod = T01FD3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A3798ProCosPrd = T01FD3_A3798ProCosPrd[0] ;
         n3798ProCosPrd = T01FD3_n3798ProCosPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrimstr( A3798ProCosPrd, 8, 2));
         A3799ProMerPor = T01FD3_A3799ProMerPor[0] ;
         n3799ProMerPor = T01FD3_n3799ProMerPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrimstr( A3799ProMerPor, 6, 2));
         A3800ProMarPor = T01FD3_A3800ProMarPor[0] ;
         n3800ProMarPor = T01FD3_n3800ProMarPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrimstr( A3800ProMarPor, 6, 2));
         A3801ProPreMax = T01FD3_A3801ProPreMax[0] ;
         n3801ProPreMax = T01FD3_n3801ProPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrimstr( A3801ProPreMax, 12, 5));
         A3802ProPreMin = T01FD3_A3802ProPreMin[0] ;
         n3802ProPreMin = T01FD3_n3802ProPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrimstr( A3802ProPreMin, 12, 5));
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FD87( ) ;
         if ( AnyError == 1 )
         {
            RcdFound87 = (short)(0) ;
            initializeNonKey1FD87( ) ;
         }
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound87 = (short)(0) ;
         initializeNonKey1FD87( ) ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1FD87( ) ;
      if ( RcdFound87 == 0 )
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
      RcdFound87 = (short)(0) ;
      /* Using cursor T01FD7 */
      pr_default.execute(5, new Object[] {A758ProCod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01FD7_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T01FD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01FD7_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T01FD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A758ProCod = T01FD7_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound87 = (short)(0) ;
      /* Using cursor T01FD8 */
      pr_default.execute(6, new Object[] {A758ProCod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01FD8_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T01FD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01FD8_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T01FD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A758ProCod = T01FD8_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FD87( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FD87( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound87 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FD87( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FD87( ) ;
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
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FD87( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProCod_Internalname ;
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
      getKey1FD87( ) ;
      if ( RcdFound87 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
         {
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnproces");
      GX_FocusControl = edtProCosPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FD0( ) ;
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProCosPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FD87( ) ;
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProCosPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FD87( ) ;
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProCosPrd_Internalname ;
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProCosPrd_Internalname ;
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
      scanStart1FD87( ) ;
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound87 != 0 )
         {
            scanNext1FD87( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProCosPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FD87( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FD87( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3798ProCosPrd, T01FD2_A3798ProCosPrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z3799ProMerPor, T01FD2_A3799ProMerPor[0]) != 0 ) || ( DecimalUtil.compareTo(Z3800ProMarPor, T01FD2_A3800ProMarPor[0]) != 0 ) || ( DecimalUtil.compareTo(Z3801ProPreMax, T01FD2_A3801ProPreMax[0]) != 0 ) || ( DecimalUtil.compareTo(Z3802ProPreMin, T01FD2_A3802ProPreMin[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3798ProCosPrd, T01FD2_A3798ProCosPrd[0]) != 0 )
            {
               GXutil.writeLogln("ttrnproces:[seudo value changed for attri]"+"ProCosPrd");
               GXutil.writeLogRaw("Old: ",Z3798ProCosPrd);
               GXutil.writeLogRaw("Current: ",T01FD2_A3798ProCosPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z3799ProMerPor, T01FD2_A3799ProMerPor[0]) != 0 )
            {
               GXutil.writeLogln("ttrnproces:[seudo value changed for attri]"+"ProMerPor");
               GXutil.writeLogRaw("Old: ",Z3799ProMerPor);
               GXutil.writeLogRaw("Current: ",T01FD2_A3799ProMerPor[0]);
            }
            if ( DecimalUtil.compareTo(Z3800ProMarPor, T01FD2_A3800ProMarPor[0]) != 0 )
            {
               GXutil.writeLogln("ttrnproces:[seudo value changed for attri]"+"ProMarPor");
               GXutil.writeLogRaw("Old: ",Z3800ProMarPor);
               GXutil.writeLogRaw("Current: ",T01FD2_A3800ProMarPor[0]);
            }
            if ( DecimalUtil.compareTo(Z3801ProPreMax, T01FD2_A3801ProPreMax[0]) != 0 )
            {
               GXutil.writeLogln("ttrnproces:[seudo value changed for attri]"+"ProPreMax");
               GXutil.writeLogRaw("Old: ",Z3801ProPreMax);
               GXutil.writeLogRaw("Current: ",T01FD2_A3801ProPreMax[0]);
            }
            if ( DecimalUtil.compareTo(Z3802ProPreMin, T01FD2_A3802ProPreMin[0]) != 0 )
            {
               GXutil.writeLogln("ttrnproces:[seudo value changed for attri]"+"ProPreMin");
               GXutil.writeLogRaw("Old: ",Z3802ProPreMin);
               GXutil.writeLogRaw("Current: ",T01FD2_A3802ProPreMin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROCES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FD87( )
   {
      beforeValidate1FD87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FD87( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FD87( 0) ;
         checkOptimisticConcurrency1FD87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FD87( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FD87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FD9 */
                  pr_default.execute(7, new Object[] {A758ProCod, Boolean.valueOf(n3798ProCosPrd), A3798ProCosPrd, Boolean.valueOf(n3799ProMerPor), A3799ProMerPor, Boolean.valueOf(n3800ProMarPor), A3800ProMarPor, Boolean.valueOf(n3801ProPreMax), A3801ProPreMax, Boolean.valueOf(n3802ProPreMin), A3802ProPreMin, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
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
                        resetCaption1FD0( ) ;
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
            load1FD87( ) ;
         }
         endLevel1FD87( ) ;
      }
      closeExtendedTableCursors1FD87( ) ;
   }

   public void update1FD87( )
   {
      beforeValidate1FD87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FD87( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FD87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FD87( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FD87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FD10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n3798ProCosPrd), A3798ProCosPrd, Boolean.valueOf(n3799ProMerPor), A3799ProMerPor, Boolean.valueOf(n3800ProMarPor), A3800ProMarPor, Boolean.valueOf(n3801ProPreMax), A3801ProPreMax, Boolean.valueOf(n3802ProPreMin), A3802ProPreMin, A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FD87( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1FD0( ) ;
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
         endLevel1FD87( ) ;
      }
      closeExtendedTableCursors1FD87( ) ;
   }

   public void deferredUpdate1FD87( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FD87( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FD87( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FD87( ) ;
         afterConfirm1FD87( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FD87( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FD11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound87 == 0 )
                     {
                        initAll1FD87( ) ;
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
                     resetCaption1FD0( ) ;
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
      sMode87 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FD87( ) ;
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FD87( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FD12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01FD13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01FD14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Cab)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FD15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01FD16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01FD17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OTPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01FD18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01FD19 */
         pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01FD20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01FD21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01FD22 */
         pr_default.execute(20, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel1FD87( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FD87( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrnproces");
         if ( AnyError == 0 )
         {
            confirmValues1FD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnproces");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FD87( )
   {
      /* Scan By routine */
      /* Using cursor T01FD23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A758ProCod = T01FD23_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FD87( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A758ProCod = T01FD23_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd1FD87( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1FD87( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FD87( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FD87( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FD87( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FD87( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FD87( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FD87( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProCosPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCosPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCosPrd_Enabled), 5, 0), true);
      edtProMerPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProMerPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProMerPor_Enabled), 5, 0), true);
      edtProMarPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProMarPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProMarPor_Enabled), 5, 0), true);
      edtProPreMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreMax_Enabled), 5, 0), true);
      edtProPreMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreMin_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1FD87( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1FD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrnproces", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3798ProCosPrd", GXutil.ltrim( localUtil.ntoc( Z3798ProCosPrd, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3799ProMerPor", GXutil.ltrim( localUtil.ntoc( Z3799ProMerPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3800ProMarPor", GXutil.ltrim( localUtil.ntoc( Z3800ProMarPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3801ProPreMax", GXutil.ltrim( localUtil.ntoc( Z3801ProPreMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3802ProPreMin", GXutil.ltrim( localUtil.ntoc( Z3802ProPreMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrnproces", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrnPROCES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") ;
   }

   public void initializeNonKey1FD87( )
   {
      A3798ProCosPrd = DecimalUtil.ZERO ;
      n3798ProCosPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrimstr( A3798ProCosPrd, 8, 2));
      A3799ProMerPor = DecimalUtil.ZERO ;
      n3799ProMerPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrimstr( A3799ProMerPor, 6, 2));
      A3800ProMarPor = DecimalUtil.ZERO ;
      n3800ProMarPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrimstr( A3800ProMarPor, 6, 2));
      A3801ProPreMax = DecimalUtil.ZERO ;
      n3801ProPreMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrimstr( A3801ProPreMax, 12, 5));
      A3802ProPreMin = DecimalUtil.ZERO ;
      n3802ProPreMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrimstr( A3802ProPreMin, 12, 5));
      Z3798ProCosPrd = DecimalUtil.ZERO ;
      Z3799ProMerPor = DecimalUtil.ZERO ;
      Z3800ProMarPor = DecimalUtil.ZERO ;
      Z3801ProPreMax = DecimalUtil.ZERO ;
      Z3802ProPreMin = DecimalUtil.ZERO ;
   }

   public void initAll1FD87( )
   {
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey1FD87( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241571046", true, true);
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
      httpContext.AddJavascriptSource("ttrnproces.js", "?20268241571046", false, true);
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
      edtProCod_Internalname = "PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProCosPrd_Internalname = "PROCOSPRD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProMerPor_Internalname = "PROMERPOR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProMarPor_Internalname = "PROMARPOR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProPreMax_Internalname = "PROPREMAX" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProPreMin_Internalname = "PROPREMIN" ;
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
      Form.setCaption( httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProPreMin_Jsonclick = "" ;
      edtProPreMin_Backcolor = (int)(0xFFFFFF) ;
      edtProPreMin_Enabled = 1 ;
      edtProPreMax_Jsonclick = "" ;
      edtProPreMax_Backcolor = (int)(0xFFFFFF) ;
      edtProPreMax_Enabled = 1 ;
      edtProMarPor_Jsonclick = "" ;
      edtProMarPor_Backcolor = (int)(0xFFFFFF) ;
      edtProMarPor_Enabled = 1 ;
      edtProMerPor_Jsonclick = "" ;
      edtProMerPor_Backcolor = (int)(0xFFFFFF) ;
      edtProMerPor_Enabled = 1 ;
      edtProCosPrd_Jsonclick = "" ;
      edtProCosPrd_Backcolor = (int)(0xFFFFFF) ;
      edtProCosPrd_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
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
      /* Using cursor T01FD24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FD24_A407EmprNom[0] ;
      n407EmprNom = T01FD24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      GX_FocusControl = edtProCosPrd_Internalname ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3798ProCosPrd", GXutil.ltrim( localUtil.ntoc( A3798ProCosPrd, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3799ProMerPor", GXutil.ltrim( localUtil.ntoc( A3799ProMerPor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3800ProMarPor", GXutil.ltrim( localUtil.ntoc( A3800ProMarPor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3801ProPreMax", GXutil.ltrim( localUtil.ntoc( A3801ProPreMax, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3802ProPreMin", GXutil.ltrim( localUtil.ntoc( A3802ProPreMin, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3798ProCosPrd", GXutil.ltrim( localUtil.ntoc( Z3798ProCosPrd, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3799ProMerPor", GXutil.ltrim( localUtil.ntoc( Z3799ProMerPor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3800ProMarPor", GXutil.ltrim( localUtil.ntoc( Z3800ProMarPor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3801ProPreMax", GXutil.ltrim( localUtil.ntoc( Z3801ProPreMax, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3802ProPreMin", GXutil.ltrim( localUtil.ntoc( Z3802ProPreMin, (byte)(12), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3798ProCosPrd',fld:'PROCOSPRD',pic:'ZZZZ9.99'},{av:'A3799ProMerPor',fld:'PROMERPOR',pic:'ZZ9.99'},{av:'A3800ProMarPor',fld:'PROMARPOR',pic:'ZZ9.99'},{av:'A3801ProPreMax',fld:'PROPREMAX',pic:'ZZZZZ9.999'},{av:'A3802ProPreMin',fld:'PROPREMIN',pic:'ZZZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z758ProCod'},{av:'Z407EmprNom'},{av:'Z3798ProCosPrd'},{av:'Z3799ProMerPor'},{av:'Z3800ProMarPor'},{av:'Z3801ProPreMax'},{av:'Z3802ProPreMin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z3798ProCosPrd = DecimalUtil.ZERO ;
      Z3799ProMerPor = DecimalUtil.ZERO ;
      Z3800ProMarPor = DecimalUtil.ZERO ;
      Z3801ProPreMax = DecimalUtil.ZERO ;
      Z3802ProPreMin = DecimalUtil.ZERO ;
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
      A758ProCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A3798ProCosPrd = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A3799ProMerPor = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A3800ProMarPor = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A3801ProPreMax = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A3802ProPreMin = DecimalUtil.ZERO ;
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
      T01FD4_A407EmprNom = new String[] {""} ;
      T01FD4_n407EmprNom = new boolean[] {false} ;
      T01FD5_A758ProCod = new String[] {""} ;
      T01FD5_A407EmprNom = new String[] {""} ;
      T01FD5_n407EmprNom = new boolean[] {false} ;
      T01FD5_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD5_n3798ProCosPrd = new boolean[] {false} ;
      T01FD5_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD5_n3799ProMerPor = new boolean[] {false} ;
      T01FD5_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD5_n3800ProMarPor = new boolean[] {false} ;
      T01FD5_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD5_n3801ProPreMax = new boolean[] {false} ;
      T01FD5_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD5_n3802ProPreMin = new boolean[] {false} ;
      T01FD5_A396EmprCod = new String[] {""} ;
      T01FD6_A396EmprCod = new String[] {""} ;
      T01FD6_A758ProCod = new String[] {""} ;
      T01FD3_A758ProCod = new String[] {""} ;
      T01FD3_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD3_n3798ProCosPrd = new boolean[] {false} ;
      T01FD3_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD3_n3799ProMerPor = new boolean[] {false} ;
      T01FD3_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD3_n3800ProMarPor = new boolean[] {false} ;
      T01FD3_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD3_n3801ProPreMax = new boolean[] {false} ;
      T01FD3_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD3_n3802ProPreMin = new boolean[] {false} ;
      T01FD3_A396EmprCod = new String[] {""} ;
      sMode87 = "" ;
      T01FD7_A396EmprCod = new String[] {""} ;
      T01FD7_A758ProCod = new String[] {""} ;
      T01FD8_A396EmprCod = new String[] {""} ;
      T01FD8_A758ProCod = new String[] {""} ;
      T01FD2_A758ProCod = new String[] {""} ;
      T01FD2_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD2_n3798ProCosPrd = new boolean[] {false} ;
      T01FD2_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD2_n3799ProMerPor = new boolean[] {false} ;
      T01FD2_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD2_n3800ProMarPor = new boolean[] {false} ;
      T01FD2_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD2_n3801ProPreMax = new boolean[] {false} ;
      T01FD2_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FD2_n3802ProPreMin = new boolean[] {false} ;
      T01FD2_A396EmprCod = new String[] {""} ;
      T01FD12_A396EmprCod = new String[] {""} ;
      T01FD12_A13026PedDGId = new int[1] ;
      T01FD12_A758ProCod = new String[] {""} ;
      T01FD13_A396EmprCod = new String[] {""} ;
      T01FD13_A12851ProCodID = new String[] {""} ;
      T01FD13_A758ProCod = new String[] {""} ;
      T01FD14_A396EmprCod = new String[] {""} ;
      T01FD14_A252CliCod = new int[1] ;
      T01FD14_A4589FFProCod = new String[] {""} ;
      T01FD15_A396EmprCod = new String[] {""} ;
      T01FD15_A252CliCod = new int[1] ;
      T01FD15_A10839Txt_Cor = new String[] {""} ;
      T01FD15_A758ProCod = new String[] {""} ;
      T01FD16_A396EmprCod = new String[] {""} ;
      T01FD16_A2248ManCod = new short[1] ;
      T01FD16_A5835ManFasCod = new String[] {""} ;
      T01FD16_A758ProCod = new String[] {""} ;
      T01FD17_A396EmprCod = new String[] {""} ;
      T01FD17_A7843Int_Num = new int[1] ;
      T01FD17_A758ProCod = new String[] {""} ;
      T01FD18_A396EmprCod = new String[] {""} ;
      T01FD18_A4618EnsLCod = new int[1] ;
      T01FD18_A758ProCod = new String[] {""} ;
      T01FD19_A396EmprCod = new String[] {""} ;
      T01FD19_A758ProCod = new String[] {""} ;
      T01FD19_A774ProNumLin = new short[1] ;
      T01FD20_A396EmprCod = new String[] {""} ;
      T01FD20_A361DisCod = new int[1] ;
      T01FD20_A758ProCod = new String[] {""} ;
      T01FD21_A396EmprCod = new String[] {""} ;
      T01FD21_A129BarCod = new int[1] ;
      T01FD21_A132BarCodReo = new byte[1] ;
      T01FD21_A130BarCodPar = new String[] {""} ;
      T01FD21_A758ProCod = new String[] {""} ;
      T01FD22_A396EmprCod = new String[] {""} ;
      T01FD22_A252CliCod = new int[1] ;
      T01FD22_A65ArtCod = new String[] {""} ;
      T01FD22_A758ProCod = new String[] {""} ;
      T01FD23_A396EmprCod = new String[] {""} ;
      T01FD23_A758ProCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01FD24_A407EmprNom = new String[] {""} ;
      T01FD24_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3798ProCosPrd = DecimalUtil.ZERO ;
      ZZ3799ProMerPor = DecimalUtil.ZERO ;
      ZZ3800ProMarPor = DecimalUtil.ZERO ;
      ZZ3801ProPreMax = DecimalUtil.ZERO ;
      ZZ3802ProPreMin = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrnproces__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrnproces__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrnproces__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrnproces__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrnproces__default(),
         new Object[] {
             new Object[] {
            T01FD2_A758ProCod, T01FD2_A3798ProCosPrd, T01FD2_n3798ProCosPrd, T01FD2_A3799ProMerPor, T01FD2_n3799ProMerPor, T01FD2_A3800ProMarPor, T01FD2_n3800ProMarPor, T01FD2_A3801ProPreMax, T01FD2_n3801ProPreMax, T01FD2_A3802ProPreMin,
            T01FD2_n3802ProPreMin, T01FD2_A396EmprCod
            }
            , new Object[] {
            T01FD3_A758ProCod, T01FD3_A3798ProCosPrd, T01FD3_n3798ProCosPrd, T01FD3_A3799ProMerPor, T01FD3_n3799ProMerPor, T01FD3_A3800ProMarPor, T01FD3_n3800ProMarPor, T01FD3_A3801ProPreMax, T01FD3_n3801ProPreMax, T01FD3_A3802ProPreMin,
            T01FD3_n3802ProPreMin, T01FD3_A396EmprCod
            }
            , new Object[] {
            T01FD4_A407EmprNom, T01FD4_n407EmprNom
            }
            , new Object[] {
            T01FD5_A758ProCod, T01FD5_A407EmprNom, T01FD5_n407EmprNom, T01FD5_A3798ProCosPrd, T01FD5_n3798ProCosPrd, T01FD5_A3799ProMerPor, T01FD5_n3799ProMerPor, T01FD5_A3800ProMarPor, T01FD5_n3800ProMarPor, T01FD5_A3801ProPreMax,
            T01FD5_n3801ProPreMax, T01FD5_A3802ProPreMin, T01FD5_n3802ProPreMin, T01FD5_A396EmprCod
            }
            , new Object[] {
            T01FD6_A396EmprCod, T01FD6_A758ProCod
            }
            , new Object[] {
            T01FD7_A396EmprCod, T01FD7_A758ProCod
            }
            , new Object[] {
            T01FD8_A396EmprCod, T01FD8_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FD12_A396EmprCod, T01FD12_A13026PedDGId, T01FD12_A758ProCod
            }
            , new Object[] {
            T01FD13_A396EmprCod, T01FD13_A12851ProCodID, T01FD13_A758ProCod
            }
            , new Object[] {
            T01FD14_A396EmprCod, T01FD14_A252CliCod, T01FD14_A4589FFProCod
            }
            , new Object[] {
            T01FD15_A396EmprCod, T01FD15_A252CliCod, T01FD15_A10839Txt_Cor, T01FD15_A758ProCod
            }
            , new Object[] {
            T01FD16_A396EmprCod, T01FD16_A2248ManCod, T01FD16_A5835ManFasCod, T01FD16_A758ProCod
            }
            , new Object[] {
            T01FD17_A396EmprCod, T01FD17_A7843Int_Num, T01FD17_A758ProCod
            }
            , new Object[] {
            T01FD18_A396EmprCod, T01FD18_A4618EnsLCod, T01FD18_A758ProCod
            }
            , new Object[] {
            T01FD19_A396EmprCod, T01FD19_A758ProCod, T01FD19_A774ProNumLin
            }
            , new Object[] {
            T01FD20_A396EmprCod, T01FD20_A361DisCod, T01FD20_A758ProCod
            }
            , new Object[] {
            T01FD21_A396EmprCod, T01FD21_A129BarCod, T01FD21_A132BarCodReo, T01FD21_A130BarCodPar, T01FD21_A758ProCod
            }
            , new Object[] {
            T01FD22_A396EmprCod, T01FD22_A252CliCod, T01FD22_A65ArtCod, T01FD22_A758ProCod
            }
            , new Object[] {
            T01FD23_A396EmprCod, T01FD23_A758ProCod
            }
            , new Object[] {
            T01FD24_A407EmprNom, T01FD24_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTrnPROCES" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound87 ;
   private short nIsDirty_87 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProCosPrd_Enabled ;
   private int edtProMerPor_Enabled ;
   private int edtProMarPor_Enabled ;
   private int edtProPreMax_Enabled ;
   private int edtProPreMin_Enabled ;
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
   private int edtProPreMin_Backcolor ;
   private int edtProPreMax_Backcolor ;
   private int edtProMarPor_Backcolor ;
   private int edtProMerPor_Backcolor ;
   private int edtProCosPrd_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z3798ProCosPrd ;
   private java.math.BigDecimal Z3799ProMerPor ;
   private java.math.BigDecimal Z3800ProMarPor ;
   private java.math.BigDecimal Z3801ProPreMax ;
   private java.math.BigDecimal Z3802ProPreMin ;
   private java.math.BigDecimal A3798ProCosPrd ;
   private java.math.BigDecimal A3799ProMerPor ;
   private java.math.BigDecimal A3800ProMarPor ;
   private java.math.BigDecimal A3801ProPreMax ;
   private java.math.BigDecimal A3802ProPreMin ;
   private java.math.BigDecimal ZZ3798ProCosPrd ;
   private java.math.BigDecimal ZZ3799ProMerPor ;
   private java.math.BigDecimal ZZ3800ProMarPor ;
   private java.math.BigDecimal ZZ3801ProPreMax ;
   private java.math.BigDecimal ZZ3802ProPreMin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProCod_Internalname ;
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
   private String A758ProCod ;
   private String edtProCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProCosPrd_Internalname ;
   private String edtProCosPrd_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProMerPor_Internalname ;
   private String edtProMerPor_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProMarPor_Internalname ;
   private String edtProMarPor_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProPreMax_Internalname ;
   private String edtProPreMax_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProPreMin_Internalname ;
   private String edtProPreMin_Jsonclick ;
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
   private String sMode87 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n3798ProCosPrd ;
   private boolean n3799ProMerPor ;
   private boolean n3800ProMarPor ;
   private boolean n3801ProPreMax ;
   private boolean n3802ProPreMin ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01FD4_A407EmprNom ;
   private boolean[] T01FD4_n407EmprNom ;
   private String[] T01FD5_A758ProCod ;
   private String[] T01FD5_A407EmprNom ;
   private boolean[] T01FD5_n407EmprNom ;
   private java.math.BigDecimal[] T01FD5_A3798ProCosPrd ;
   private boolean[] T01FD5_n3798ProCosPrd ;
   private java.math.BigDecimal[] T01FD5_A3799ProMerPor ;
   private boolean[] T01FD5_n3799ProMerPor ;
   private java.math.BigDecimal[] T01FD5_A3800ProMarPor ;
   private boolean[] T01FD5_n3800ProMarPor ;
   private java.math.BigDecimal[] T01FD5_A3801ProPreMax ;
   private boolean[] T01FD5_n3801ProPreMax ;
   private java.math.BigDecimal[] T01FD5_A3802ProPreMin ;
   private boolean[] T01FD5_n3802ProPreMin ;
   private String[] T01FD5_A396EmprCod ;
   private String[] T01FD6_A396EmprCod ;
   private String[] T01FD6_A758ProCod ;
   private String[] T01FD3_A758ProCod ;
   private java.math.BigDecimal[] T01FD3_A3798ProCosPrd ;
   private boolean[] T01FD3_n3798ProCosPrd ;
   private java.math.BigDecimal[] T01FD3_A3799ProMerPor ;
   private boolean[] T01FD3_n3799ProMerPor ;
   private java.math.BigDecimal[] T01FD3_A3800ProMarPor ;
   private boolean[] T01FD3_n3800ProMarPor ;
   private java.math.BigDecimal[] T01FD3_A3801ProPreMax ;
   private boolean[] T01FD3_n3801ProPreMax ;
   private java.math.BigDecimal[] T01FD3_A3802ProPreMin ;
   private boolean[] T01FD3_n3802ProPreMin ;
   private String[] T01FD3_A396EmprCod ;
   private String[] T01FD7_A396EmprCod ;
   private String[] T01FD7_A758ProCod ;
   private String[] T01FD8_A396EmprCod ;
   private String[] T01FD8_A758ProCod ;
   private String[] T01FD2_A758ProCod ;
   private java.math.BigDecimal[] T01FD2_A3798ProCosPrd ;
   private boolean[] T01FD2_n3798ProCosPrd ;
   private java.math.BigDecimal[] T01FD2_A3799ProMerPor ;
   private boolean[] T01FD2_n3799ProMerPor ;
   private java.math.BigDecimal[] T01FD2_A3800ProMarPor ;
   private boolean[] T01FD2_n3800ProMarPor ;
   private java.math.BigDecimal[] T01FD2_A3801ProPreMax ;
   private boolean[] T01FD2_n3801ProPreMax ;
   private java.math.BigDecimal[] T01FD2_A3802ProPreMin ;
   private boolean[] T01FD2_n3802ProPreMin ;
   private String[] T01FD2_A396EmprCod ;
   private String[] T01FD12_A396EmprCod ;
   private int[] T01FD12_A13026PedDGId ;
   private String[] T01FD12_A758ProCod ;
   private String[] T01FD13_A396EmprCod ;
   private String[] T01FD13_A12851ProCodID ;
   private String[] T01FD13_A758ProCod ;
   private String[] T01FD14_A396EmprCod ;
   private int[] T01FD14_A252CliCod ;
   private String[] T01FD14_A4589FFProCod ;
   private String[] T01FD15_A396EmprCod ;
   private int[] T01FD15_A252CliCod ;
   private String[] T01FD15_A10839Txt_Cor ;
   private String[] T01FD15_A758ProCod ;
   private String[] T01FD16_A396EmprCod ;
   private short[] T01FD16_A2248ManCod ;
   private String[] T01FD16_A5835ManFasCod ;
   private String[] T01FD16_A758ProCod ;
   private String[] T01FD17_A396EmprCod ;
   private int[] T01FD17_A7843Int_Num ;
   private String[] T01FD17_A758ProCod ;
   private String[] T01FD18_A396EmprCod ;
   private int[] T01FD18_A4618EnsLCod ;
   private String[] T01FD18_A758ProCod ;
   private String[] T01FD19_A396EmprCod ;
   private String[] T01FD19_A758ProCod ;
   private short[] T01FD19_A774ProNumLin ;
   private String[] T01FD20_A396EmprCod ;
   private int[] T01FD20_A361DisCod ;
   private String[] T01FD20_A758ProCod ;
   private String[] T01FD21_A396EmprCod ;
   private int[] T01FD21_A129BarCod ;
   private byte[] T01FD21_A132BarCodReo ;
   private String[] T01FD21_A130BarCodPar ;
   private String[] T01FD21_A758ProCod ;
   private String[] T01FD22_A396EmprCod ;
   private int[] T01FD22_A252CliCod ;
   private String[] T01FD22_A65ArtCod ;
   private String[] T01FD22_A758ProCod ;
   private String[] T01FD23_A396EmprCod ;
   private String[] T01FD23_A758ProCod ;
   private String[] T01FD24_A407EmprNom ;
   private boolean[] T01FD24_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrnproces__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnproces__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnproces__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnproces__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnproces__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FD2", "SELECT ProCod, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ?  FOR UPDATE OF ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD3", "SELECT ProCod, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD5", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProCod, T2.EmprNom, TM1.ProCosPrd, TM1.ProMerPor, TM1.ProMarPor, TM1.ProPreMax, TM1.ProPreMin, TM1.EmprCod FROM (TXPPROCES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( ProCod > ?) and EmprCod = ? ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( ProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FD9", "INSERT INTO TXPPROCES(ProCod, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, EmprCod, ProDsc, ProUltLin, ProDsc2, ProDscM, ProProvi, ProDscF, ProTipP, ProTipT, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProEst) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T01FD10", "UPDATE TXPPROCES SET ProCosPrd=?, ProMerPor=?, ProMarPor=?, ProPreMax=?, ProPreMin=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T01FD11", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new ForEachCursor("T01FD12", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod FROM TXPPEDDG4 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD13", "SELECT * FROM (SELECT EmprCod, ProCodID, ProCod FROM TXPPROCo1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD14", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod FROM TXPFasFCl WHERE EmprCod = ? AND FFProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD15", "SELECT * FROM (SELECT EmprCod, CliCod, Txt_Cor, ProCod FROM TXPPRE001 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD16", "SELECT * FROM (SELECT EmprCod, ManCod, ManFasCod, ProCod FROM TXPPREMFP WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD17", "SELECT * FROM (SELECT EmprCod, Int_Num, ProCod FROM TXPOTPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD18", "SELECT * FROM (SELECT EmprCod, EnsLCod, ProCod FROM TXPENSLA1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD19", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD20", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FD23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FD24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 22 :
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               stmt.setString(7, (String)parms[11], 3);
               return;
            case 8 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

