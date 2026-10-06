package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxincver_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Incidencias Vertex", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxInVerId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxincver_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxincver_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxincver_impl.class ));
   }

   public tvxincver_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxIncVer.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Incidencias Vertex", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxInVerId_Internalname, GXutil.ltrim( localUtil.ntoc( A7532VxInVerId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxInVerId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7532VxInVerId), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7532VxInVerId), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxInVerId_Jsonclick, 0, "", "", "", "", "", 1, edtVxInVerId_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "BarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6274VxBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6274VxBarcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6274VxBarcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxBarcod_Jsonclick, 0, "", "", "", "", "", 1, edtVxBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "BarReo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6275VxBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6275VxBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A6275VxBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtVxBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "BarPar", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxBarPar_Internalname, GXutil.rtrim( A6276VxBarPar), GXutil.rtrim( localUtil.format( A6276VxBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtVxBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "VxInVeTip", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxInVeTip_Internalname, GXutil.rtrim( A7533VxInVeTip), GXutil.rtrim( localUtil.format( A7533VxInVeTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxInVeTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxInVeTip_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcaCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6083AcaCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcaCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6083AcaCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6083AcaCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcaCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtAcaCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcaArtCod_Internalname, GXutil.rtrim( A6084AcaArtCod), GXutil.rtrim( localUtil.format( A6084AcaArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcaArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtAcaArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6085XBarColCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6085XBarColCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6085XBarColCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarColCod_Jsonclick, 0, "", "", "", "", "", 1, edtXBarColCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Color", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarColDsc_Internalname, GXutil.rtrim( A6086XBarColDsc), GXutil.rtrim( localUtil.format( A6086XBarColDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtXBarColDsc_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarCan_Internalname, GXutil.ltrim( localUtil.ntoc( A6088XBarCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarCan_Enabled!=0) ? localUtil.format( A6088XBarCan, "ZZZZZ9.99") : localUtil.format( A6088XBarCan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarCan_Jsonclick, 0, "", "", "", "", "", 1, edtXBarCan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Cantidad Secundaria", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarCanSec_Internalname, GXutil.ltrim( localUtil.ntoc( A6089XBarCanSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarCanSec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6089XBarCanSec), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6089XBarCanSec), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarCanSec_Jsonclick, 0, "", "", "", "", "", 1, edtXBarCanSec_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Control de Registro", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarSitReg_Internalname, GXutil.ltrim( localUtil.ntoc( A6090XBarSitReg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarSitReg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6090XBarSitReg), "9") : localUtil.format( DecimalUtil.doubleToDec(A6090XBarSitReg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarSitReg_Jsonclick, 0, "", "", "", "", "", 1, edtXBarSitReg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tipo O. Fabricacion", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarOFabTI_Internalname, GXutil.rtrim( A6091XBarOFabTI), GXutil.rtrim( localUtil.format( A6091XBarOFabTI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarOFabTI_Jsonclick, 0, "", "", "", "", "", 1, edtXBarOFabTI_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAcaCod_Internalname, GXutil.rtrim( A6092XAcaCod), GXutil.rtrim( localUtil.format( A6092XAcaCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAcaCod_Jsonclick, 0, "", "", "", "", "", 1, edtXAcaCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Fin Previsto", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXBarFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarFecSal_Internalname, localUtil.format(A6093XBarFecSal, "99/99/99"), localUtil.format( A6093XBarFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarFecSal_Jsonclick, 0, "", "", "", "", "", 1, edtXBarFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXBarFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXBarFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVxIncVer.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "O.Produccion", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarOPro_Internalname, GXutil.rtrim( A6094XBarOPro), GXutil.rtrim( localUtil.format( A6094XBarOPro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarOPro_Jsonclick, 0, "", "", "", "", "", 1, edtXBarOPro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarMaq_Internalname, GXutil.rtrim( A6095XBarMaq), GXutil.rtrim( localUtil.format( A6095XBarMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarMaq_Jsonclick, 0, "", "", "", "", "", 1, edtXBarMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Ancho Crudo Minimo", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtcrumin_Internalname, GXutil.ltrim( localUtil.ntoc( A6098XArtcrumin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtcrumin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6098XArtcrumin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6098XArtcrumin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtcrumin_Jsonclick, 0, "", "", "", "", "", 1, edtXArtcrumin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Ancho Crudo Maximo", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtcrumax_Internalname, GXutil.ltrim( localUtil.ntoc( A6099XArtcrumax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtcrumax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6099XArtcrumax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6099XArtcrumax), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtcrumax_Jsonclick, 0, "", "", "", "", "", 1, edtXArtcrumax_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Gramage Crudo", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtgracru_Internalname, GXutil.ltrim( localUtil.ntoc( A6100XArtgracru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtgracru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6100XArtgracru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6100XArtgracru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtgracru_Jsonclick, 0, "", "", "", "", "", 1, edtXArtgracru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Gramage Acabado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtgraaca_Internalname, GXutil.ltrim( localUtil.ntoc( A6101XArtgraaca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtgraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6101XArtgraaca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6101XArtgraaca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtgraaca_Jsonclick, 0, "", "", "", "", "", 1, edtXArtgraaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ancho Acabado Minimo", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtacamin_Internalname, GXutil.ltrim( localUtil.ntoc( A6102XArtacamin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtacamin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6102XArtacamin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6102XArtacamin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtacamin_Jsonclick, 0, "", "", "", "", "", 1, edtXArtacamin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ancho Acabado Maximo", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtacamax_Internalname, GXutil.ltrim( localUtil.ntoc( A6103XArtacamax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtacamax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6103XArtacamax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6103XArtacamax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtacamax_Jsonclick, 0, "", "", "", "", "", 1, edtXArtacamax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Peso Metro Linea", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXArtpml_Internalname, GXutil.ltrim( localUtil.ntoc( A6104XArtpml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXArtpml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6104XArtpml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6104XArtpml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXArtpml_Jsonclick, 0, "", "", "", "", "", 1, edtXArtpml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Presentacion ( p.e. 70x50)", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXbarlar_Internalname, GXutil.rtrim( A6105Xbarlar), GXutil.rtrim( localUtil.format( A6105Xbarlar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXbarlar_Jsonclick, 0, "", "", "", "", "", 1, edtXbarlar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "XMaccod", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXMaccod_Internalname, GXutil.ltrim( localUtil.ntoc( A6176XMaccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXMaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6176XMaccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6176XMaccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXMaccod_Jsonclick, 0, "", "", "", "", "", 1, edtXMaccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "XBarEstReo", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarEstReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6217XBarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarEstReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6217XBarEstReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A6217XBarEstReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarEstReo_Jsonclick, 0, "", "", "", "", "", 1, edtXBarEstReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Unidad de Medida", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXUniMed_Internalname, GXutil.rtrim( A6611XUniMed), GXutil.rtrim( localUtil.format( A6611XUniMed, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtXUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Cliente de Vertex", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6820XBarCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6820XBarCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6820XBarCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtXBarCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Origen H.Ruta (Manual/Planning", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarOri_Internalname, GXutil.rtrim( A7139XBarOri), GXutil.rtrim( localUtil.format( A7139XBarOri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarOri_Jsonclick, 0, "", "", "", "", "", 1, edtXBarOri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Fecha creación", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXBarFecCr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarFecCr_Internalname, localUtil.format(A7534XBarFecCr, "99/99/99"), localUtil.format( A7534XBarFecCr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarFecCr_Jsonclick, 0, "", "", "", "", "", 1, edtXBarFecCr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXBarFecCr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXBarFecCr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVxIncVer.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A8010XBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8010XBarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8010XBarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtXBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Error al ejecutar", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXVxError_Internalname, GXutil.rtrim( A8354XVxError), GXutil.rtrim( localUtil.format( A8354XVxError, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXVxError_Jsonclick, 0, "", "", "", "", "", 1, edtXVxError_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "VxBarPiecod", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxBarPieco_Internalname, GXutil.rtrim( A10268VxBarPieco), GXutil.rtrim( localUtil.format( A10268VxBarPieco, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxBarPieco_Jsonclick, 0, "", "", "", "", "", 1, edtVxBarPieco_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxIncVer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxIncVer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxIncVer.htm");
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
         Z7532VxInVerId = localUtil.ctol( httpContext.cgiGet( "Z7532VxInVerId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z6274VxBarcod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6274VxBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6275VxBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6275VxBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6276VxBarPar = httpContext.cgiGet( "Z6276VxBarPar") ;
         Z7533VxInVeTip = httpContext.cgiGet( "Z7533VxInVeTip") ;
         Z6083AcaCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6083AcaCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6084AcaArtCod = httpContext.cgiGet( "Z6084AcaArtCod") ;
         Z6085XBarColCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6085XBarColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6086XBarColDsc = httpContext.cgiGet( "Z6086XBarColDsc") ;
         Z6088XBarCan = localUtil.ctond( httpContext.cgiGet( "Z6088XBarCan")) ;
         Z6089XBarCanSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z6089XBarCanSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6090XBarSitReg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6090XBarSitReg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6091XBarOFabTI = httpContext.cgiGet( "Z6091XBarOFabTI") ;
         Z6092XAcaCod = httpContext.cgiGet( "Z6092XAcaCod") ;
         Z6093XBarFecSal = localUtil.ctod( httpContext.cgiGet( "Z6093XBarFecSal"), 0) ;
         Z6094XBarOPro = httpContext.cgiGet( "Z6094XBarOPro") ;
         Z6095XBarMaq = httpContext.cgiGet( "Z6095XBarMaq") ;
         Z6098XArtcrumin = (short)(localUtil.ctol( httpContext.cgiGet( "Z6098XArtcrumin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6099XArtcrumax = (short)(localUtil.ctol( httpContext.cgiGet( "Z6099XArtcrumax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6100XArtgracru = (short)(localUtil.ctol( httpContext.cgiGet( "Z6100XArtgracru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6101XArtgraaca = (short)(localUtil.ctol( httpContext.cgiGet( "Z6101XArtgraaca"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6102XArtacamin = (short)(localUtil.ctol( httpContext.cgiGet( "Z6102XArtacamin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6103XArtacamax = (short)(localUtil.ctol( httpContext.cgiGet( "Z6103XArtacamax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6104XArtpml = (short)(localUtil.ctol( httpContext.cgiGet( "Z6104XArtpml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6105Xbarlar = httpContext.cgiGet( "Z6105Xbarlar") ;
         Z6176XMaccod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6176XMaccod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6217XBarEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6217XBarEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6611XUniMed = httpContext.cgiGet( "Z6611XUniMed") ;
         Z6820XBarCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6820XBarCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7139XBarOri = httpContext.cgiGet( "Z7139XBarOri") ;
         Z7534XBarFecCr = localUtil.ctod( httpContext.cgiGet( "Z7534XBarFecCr"), 0) ;
         Z8010XBarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8010XBarTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8354XVxError = httpContext.cgiGet( "Z8354XVxError") ;
         Z10268VxBarPieco = httpContext.cgiGet( "Z10268VxBarPieco") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxInVerId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxInVerId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXINVERID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxInVerId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7532VxInVerId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
         }
         else
         {
            A7532VxInVerId = localUtil.ctol( httpContext.cgiGet( edtVxInVerId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6274VxBarcod = 0 ;
            n6274VxBarcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         }
         else
         {
            A6274VxBarcod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6274VxBarcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6275VxBarReo = (byte)(0) ;
            n6275VxBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.str( A6275VxBarReo, 1, 0));
         }
         else
         {
            A6275VxBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6275VxBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.str( A6275VxBarReo, 1, 0));
         }
         A6276VxBarPar = httpContext.cgiGet( edtVxBarPar_Internalname) ;
         n6276VxBarPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6276VxBarPar", A6276VxBarPar);
         A7533VxInVeTip = httpContext.cgiGet( edtVxInVeTip_Internalname) ;
         n7533VxInVeTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7533VxInVeTip", A7533VxInVeTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcaCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcaCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACACLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcaCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6083AcaCliCod = 0 ;
            n6083AcaCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6083AcaCliCod), 6, 0));
         }
         else
         {
            A6083AcaCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAcaCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6083AcaCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6083AcaCliCod), 6, 0));
         }
         A6084AcaArtCod = httpContext.cgiGet( edtAcaArtCod_Internalname) ;
         n6084AcaArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6084AcaArtCod", A6084AcaArtCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6085XBarColCod = 0 ;
            n6085XBarColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6085XBarColCod), 6, 0));
         }
         else
         {
            A6085XBarColCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXBarColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6085XBarColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6085XBarColCod), 6, 0));
         }
         A6086XBarColDsc = httpContext.cgiGet( edtXBarColDsc_Internalname) ;
         n6086XBarColDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6086XBarColDsc", A6086XBarColDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXBarCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXBarCan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6088XBarCan = DecimalUtil.ZERO ;
            n6088XBarCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrimstr( A6088XBarCan, 9, 2));
         }
         else
         {
            A6088XBarCan = localUtil.ctond( httpContext.cgiGet( edtXBarCan_Internalname)) ;
            n6088XBarCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrimstr( A6088XBarCan, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarCanSec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarCanSec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARCANSEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarCanSec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6089XBarCanSec = (short)(0) ;
            n6089XBarCanSec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6089XBarCanSec), 3, 0));
         }
         else
         {
            A6089XBarCanSec = (short)(localUtil.ctol( httpContext.cgiGet( edtXBarCanSec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6089XBarCanSec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6089XBarCanSec), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARSITREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarSitReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6090XBarSitReg = (byte)(0) ;
            n6090XBarSitReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.str( A6090XBarSitReg, 1, 0));
         }
         else
         {
            A6090XBarSitReg = (byte)(localUtil.ctol( httpContext.cgiGet( edtXBarSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6090XBarSitReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.str( A6090XBarSitReg, 1, 0));
         }
         A6091XBarOFabTI = httpContext.cgiGet( edtXBarOFabTI_Internalname) ;
         n6091XBarOFabTI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6091XBarOFabTI", A6091XBarOFabTI);
         A6092XAcaCod = httpContext.cgiGet( edtXAcaCod_Internalname) ;
         n6092XAcaCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6092XAcaCod", A6092XAcaCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtXBarFecSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XBARFECSAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarFecSal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6093XBarFecSal = GXutil.nullDate() ;
            n6093XBarFecSal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
         }
         else
         {
            A6093XBarFecSal = localUtil.ctod( httpContext.cgiGet( edtXBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n6093XBarFecSal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
         }
         A6094XBarOPro = httpContext.cgiGet( edtXBarOPro_Internalname) ;
         n6094XBarOPro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6094XBarOPro", A6094XBarOPro);
         A6095XBarMaq = httpContext.cgiGet( edtXBarMaq_Internalname) ;
         n6095XBarMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6095XBarMaq", A6095XBarMaq);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtcrumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtcrumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTCRUMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtcrumin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6098XArtcrumin = (short)(0) ;
            n6098XArtcrumin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6098XArtcrumin), 4, 0));
         }
         else
         {
            A6098XArtcrumin = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtcrumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6098XArtcrumin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6098XArtcrumin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtcrumax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtcrumax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTCRUMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtcrumax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6099XArtcrumax = (short)(0) ;
            n6099XArtcrumax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6099XArtcrumax), 4, 0));
         }
         else
         {
            A6099XArtcrumax = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtcrumax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6099XArtcrumax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6099XArtcrumax), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtgracru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtgracru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTGRACRU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtgracru_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6100XArtgracru = (short)(0) ;
            n6100XArtgracru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6100XArtgracru), 4, 0));
         }
         else
         {
            A6100XArtgracru = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtgracru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6100XArtgracru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6100XArtgracru), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTGRAACA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtgraaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6101XArtgraaca = (short)(0) ;
            n6101XArtgraaca = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6101XArtgraaca), 4, 0));
         }
         else
         {
            A6101XArtgraaca = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6101XArtgraaca = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6101XArtgraaca), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtacamin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtacamin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTACAMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtacamin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6102XArtacamin = (short)(0) ;
            n6102XArtacamin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6102XArtacamin), 3, 0));
         }
         else
         {
            A6102XArtacamin = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtacamin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6102XArtacamin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6102XArtacamin), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtacamax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtacamax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTACAMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtacamax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6103XArtacamax = (short)(0) ;
            n6103XArtacamax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6103XArtacamax), 3, 0));
         }
         else
         {
            A6103XArtacamax = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtacamax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6103XArtacamax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6103XArtacamax), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXArtpml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXArtpml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XARTPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXArtpml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6104XArtpml = (short)(0) ;
            n6104XArtpml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6104XArtpml), 4, 0));
         }
         else
         {
            A6104XArtpml = (short)(localUtil.ctol( httpContext.cgiGet( edtXArtpml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6104XArtpml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6104XArtpml), 4, 0));
         }
         A6105Xbarlar = httpContext.cgiGet( edtXbarlar_Internalname) ;
         n6105Xbarlar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6105Xbarlar", A6105Xbarlar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XMACCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXMaccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6176XMaccod = 0 ;
            n6176XMaccod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6176XMaccod), 8, 0));
         }
         else
         {
            A6176XMaccod = (int)(localUtil.ctol( httpContext.cgiGet( edtXMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6176XMaccod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6176XMaccod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARESTREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarEstReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6217XBarEstReo = (byte)(0) ;
            n6217XBarEstReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.str( A6217XBarEstReo, 1, 0));
         }
         else
         {
            A6217XBarEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtXBarEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6217XBarEstReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.str( A6217XBarEstReo, 1, 0));
         }
         A6611XUniMed = httpContext.cgiGet( edtXUniMed_Internalname) ;
         n6611XUniMed = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6611XUniMed", A6611XUniMed);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6820XBarCliCod = 0 ;
            n6820XBarCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6820XBarCliCod), 6, 0));
         }
         else
         {
            A6820XBarCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXBarCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6820XBarCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6820XBarCliCod), 6, 0));
         }
         A7139XBarOri = httpContext.cgiGet( edtXBarOri_Internalname) ;
         n7139XBarOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7139XBarOri", A7139XBarOri);
         if ( localUtil.vcdate( httpContext.cgiGet( edtXBarFecCr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XBARFECCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarFecCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7534XBarFecCr = GXutil.nullDate() ;
            n7534XBarFecCr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
         }
         else
         {
            A7534XBarFecCr = localUtil.ctod( httpContext.cgiGet( edtXBarFecCr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7534XBarFecCr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XBARTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXBarTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8010XBarTipCol = (byte)(0) ;
            n8010XBarTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8010XBarTipCol), 2, 0));
         }
         else
         {
            A8010XBarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtXBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8010XBarTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8010XBarTipCol), 2, 0));
         }
         A8354XVxError = httpContext.cgiGet( edtXVxError_Internalname) ;
         n8354XVxError = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8354XVxError", A8354XVxError);
         A10268VxBarPieco = httpContext.cgiGet( edtVxBarPieco_Internalname) ;
         n10268VxBarPieco = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10268VxBarPieco", A10268VxBarPieco);
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
            A7532VxInVerId = GXutil.lval( httpContext.GetPar( "VxInVerId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
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
            initAll17N1361( ) ;
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
      disableAttributes17N1361( ) ;
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

   public void confirm_17N0( )
   {
      beforeValidate17N1361( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17N1361( ) ;
         }
         else
         {
            checkExtendedTable17N1361( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors17N1361( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17N0( ) ;
      }
   }

   public void resetCaption17N0( )
   {
   }

   public void zm17N1361( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6274VxBarcod = T017N3_A6274VxBarcod[0] ;
            Z6275VxBarReo = T017N3_A6275VxBarReo[0] ;
            Z6276VxBarPar = T017N3_A6276VxBarPar[0] ;
            Z7533VxInVeTip = T017N3_A7533VxInVeTip[0] ;
            Z6083AcaCliCod = T017N3_A6083AcaCliCod[0] ;
            Z6084AcaArtCod = T017N3_A6084AcaArtCod[0] ;
            Z6085XBarColCod = T017N3_A6085XBarColCod[0] ;
            Z6086XBarColDsc = T017N3_A6086XBarColDsc[0] ;
            Z6088XBarCan = T017N3_A6088XBarCan[0] ;
            Z6089XBarCanSec = T017N3_A6089XBarCanSec[0] ;
            Z6090XBarSitReg = T017N3_A6090XBarSitReg[0] ;
            Z6091XBarOFabTI = T017N3_A6091XBarOFabTI[0] ;
            Z6092XAcaCod = T017N3_A6092XAcaCod[0] ;
            Z6093XBarFecSal = T017N3_A6093XBarFecSal[0] ;
            Z6094XBarOPro = T017N3_A6094XBarOPro[0] ;
            Z6095XBarMaq = T017N3_A6095XBarMaq[0] ;
            Z6098XArtcrumin = T017N3_A6098XArtcrumin[0] ;
            Z6099XArtcrumax = T017N3_A6099XArtcrumax[0] ;
            Z6100XArtgracru = T017N3_A6100XArtgracru[0] ;
            Z6101XArtgraaca = T017N3_A6101XArtgraaca[0] ;
            Z6102XArtacamin = T017N3_A6102XArtacamin[0] ;
            Z6103XArtacamax = T017N3_A6103XArtacamax[0] ;
            Z6104XArtpml = T017N3_A6104XArtpml[0] ;
            Z6105Xbarlar = T017N3_A6105Xbarlar[0] ;
            Z6176XMaccod = T017N3_A6176XMaccod[0] ;
            Z6217XBarEstReo = T017N3_A6217XBarEstReo[0] ;
            Z6611XUniMed = T017N3_A6611XUniMed[0] ;
            Z6820XBarCliCod = T017N3_A6820XBarCliCod[0] ;
            Z7139XBarOri = T017N3_A7139XBarOri[0] ;
            Z7534XBarFecCr = T017N3_A7534XBarFecCr[0] ;
            Z8010XBarTipCol = T017N3_A8010XBarTipCol[0] ;
            Z8354XVxError = T017N3_A8354XVxError[0] ;
            Z10268VxBarPieco = T017N3_A10268VxBarPieco[0] ;
         }
         else
         {
            Z6274VxBarcod = A6274VxBarcod ;
            Z6275VxBarReo = A6275VxBarReo ;
            Z6276VxBarPar = A6276VxBarPar ;
            Z7533VxInVeTip = A7533VxInVeTip ;
            Z6083AcaCliCod = A6083AcaCliCod ;
            Z6084AcaArtCod = A6084AcaArtCod ;
            Z6085XBarColCod = A6085XBarColCod ;
            Z6086XBarColDsc = A6086XBarColDsc ;
            Z6088XBarCan = A6088XBarCan ;
            Z6089XBarCanSec = A6089XBarCanSec ;
            Z6090XBarSitReg = A6090XBarSitReg ;
            Z6091XBarOFabTI = A6091XBarOFabTI ;
            Z6092XAcaCod = A6092XAcaCod ;
            Z6093XBarFecSal = A6093XBarFecSal ;
            Z6094XBarOPro = A6094XBarOPro ;
            Z6095XBarMaq = A6095XBarMaq ;
            Z6098XArtcrumin = A6098XArtcrumin ;
            Z6099XArtcrumax = A6099XArtcrumax ;
            Z6100XArtgracru = A6100XArtgracru ;
            Z6101XArtgraaca = A6101XArtgraaca ;
            Z6102XArtacamin = A6102XArtacamin ;
            Z6103XArtacamax = A6103XArtacamax ;
            Z6104XArtpml = A6104XArtpml ;
            Z6105Xbarlar = A6105Xbarlar ;
            Z6176XMaccod = A6176XMaccod ;
            Z6217XBarEstReo = A6217XBarEstReo ;
            Z6611XUniMed = A6611XUniMed ;
            Z6820XBarCliCod = A6820XBarCliCod ;
            Z7139XBarOri = A7139XBarOri ;
            Z7534XBarFecCr = A7534XBarFecCr ;
            Z8010XBarTipCol = A8010XBarTipCol ;
            Z8354XVxError = A8354XVxError ;
            Z10268VxBarPieco = A10268VxBarPieco ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z7532VxInVerId = A7532VxInVerId ;
         Z6274VxBarcod = A6274VxBarcod ;
         Z6275VxBarReo = A6275VxBarReo ;
         Z6276VxBarPar = A6276VxBarPar ;
         Z7533VxInVeTip = A7533VxInVeTip ;
         Z6083AcaCliCod = A6083AcaCliCod ;
         Z6084AcaArtCod = A6084AcaArtCod ;
         Z6085XBarColCod = A6085XBarColCod ;
         Z6086XBarColDsc = A6086XBarColDsc ;
         Z6088XBarCan = A6088XBarCan ;
         Z6089XBarCanSec = A6089XBarCanSec ;
         Z6090XBarSitReg = A6090XBarSitReg ;
         Z6091XBarOFabTI = A6091XBarOFabTI ;
         Z6092XAcaCod = A6092XAcaCod ;
         Z6093XBarFecSal = A6093XBarFecSal ;
         Z6094XBarOPro = A6094XBarOPro ;
         Z6095XBarMaq = A6095XBarMaq ;
         Z6098XArtcrumin = A6098XArtcrumin ;
         Z6099XArtcrumax = A6099XArtcrumax ;
         Z6100XArtgracru = A6100XArtgracru ;
         Z6101XArtgraaca = A6101XArtgraaca ;
         Z6102XArtacamin = A6102XArtacamin ;
         Z6103XArtacamax = A6103XArtacamax ;
         Z6104XArtpml = A6104XArtpml ;
         Z6105Xbarlar = A6105Xbarlar ;
         Z6176XMaccod = A6176XMaccod ;
         Z6217XBarEstReo = A6217XBarEstReo ;
         Z6611XUniMed = A6611XUniMed ;
         Z6820XBarCliCod = A6820XBarCliCod ;
         Z7139XBarOri = A7139XBarOri ;
         Z7534XBarFecCr = A7534XBarFecCr ;
         Z8010XBarTipCol = A8010XBarTipCol ;
         Z8354XVxError = A8354XVxError ;
         Z10268VxBarPieco = A10268VxBarPieco ;
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

   public void load17N1361( )
   {
      /* Using cursor T017N4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A7532VxInVerId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1361 = (short)(1) ;
         A6274VxBarcod = T017N4_A6274VxBarcod[0] ;
         n6274VxBarcod = T017N4_n6274VxBarcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A6275VxBarReo = T017N4_A6275VxBarReo[0] ;
         n6275VxBarReo = T017N4_n6275VxBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.str( A6275VxBarReo, 1, 0));
         A6276VxBarPar = T017N4_A6276VxBarPar[0] ;
         n6276VxBarPar = T017N4_n6276VxBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6276VxBarPar", A6276VxBarPar);
         A7533VxInVeTip = T017N4_A7533VxInVeTip[0] ;
         n7533VxInVeTip = T017N4_n7533VxInVeTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7533VxInVeTip", A7533VxInVeTip);
         A6083AcaCliCod = T017N4_A6083AcaCliCod[0] ;
         n6083AcaCliCod = T017N4_n6083AcaCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6083AcaCliCod), 6, 0));
         A6084AcaArtCod = T017N4_A6084AcaArtCod[0] ;
         n6084AcaArtCod = T017N4_n6084AcaArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6084AcaArtCod", A6084AcaArtCod);
         A6085XBarColCod = T017N4_A6085XBarColCod[0] ;
         n6085XBarColCod = T017N4_n6085XBarColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6085XBarColCod), 6, 0));
         A6086XBarColDsc = T017N4_A6086XBarColDsc[0] ;
         n6086XBarColDsc = T017N4_n6086XBarColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6086XBarColDsc", A6086XBarColDsc);
         A6088XBarCan = T017N4_A6088XBarCan[0] ;
         n6088XBarCan = T017N4_n6088XBarCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrimstr( A6088XBarCan, 9, 2));
         A6089XBarCanSec = T017N4_A6089XBarCanSec[0] ;
         n6089XBarCanSec = T017N4_n6089XBarCanSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6089XBarCanSec), 3, 0));
         A6090XBarSitReg = T017N4_A6090XBarSitReg[0] ;
         n6090XBarSitReg = T017N4_n6090XBarSitReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.str( A6090XBarSitReg, 1, 0));
         A6091XBarOFabTI = T017N4_A6091XBarOFabTI[0] ;
         n6091XBarOFabTI = T017N4_n6091XBarOFabTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6091XBarOFabTI", A6091XBarOFabTI);
         A6092XAcaCod = T017N4_A6092XAcaCod[0] ;
         n6092XAcaCod = T017N4_n6092XAcaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6092XAcaCod", A6092XAcaCod);
         A6093XBarFecSal = T017N4_A6093XBarFecSal[0] ;
         n6093XBarFecSal = T017N4_n6093XBarFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
         A6094XBarOPro = T017N4_A6094XBarOPro[0] ;
         n6094XBarOPro = T017N4_n6094XBarOPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6094XBarOPro", A6094XBarOPro);
         A6095XBarMaq = T017N4_A6095XBarMaq[0] ;
         n6095XBarMaq = T017N4_n6095XBarMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6095XBarMaq", A6095XBarMaq);
         A6098XArtcrumin = T017N4_A6098XArtcrumin[0] ;
         n6098XArtcrumin = T017N4_n6098XArtcrumin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6098XArtcrumin), 4, 0));
         A6099XArtcrumax = T017N4_A6099XArtcrumax[0] ;
         n6099XArtcrumax = T017N4_n6099XArtcrumax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6099XArtcrumax), 4, 0));
         A6100XArtgracru = T017N4_A6100XArtgracru[0] ;
         n6100XArtgracru = T017N4_n6100XArtgracru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6100XArtgracru), 4, 0));
         A6101XArtgraaca = T017N4_A6101XArtgraaca[0] ;
         n6101XArtgraaca = T017N4_n6101XArtgraaca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6101XArtgraaca), 4, 0));
         A6102XArtacamin = T017N4_A6102XArtacamin[0] ;
         n6102XArtacamin = T017N4_n6102XArtacamin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6102XArtacamin), 3, 0));
         A6103XArtacamax = T017N4_A6103XArtacamax[0] ;
         n6103XArtacamax = T017N4_n6103XArtacamax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6103XArtacamax), 3, 0));
         A6104XArtpml = T017N4_A6104XArtpml[0] ;
         n6104XArtpml = T017N4_n6104XArtpml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6104XArtpml), 4, 0));
         A6105Xbarlar = T017N4_A6105Xbarlar[0] ;
         n6105Xbarlar = T017N4_n6105Xbarlar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6105Xbarlar", A6105Xbarlar);
         A6176XMaccod = T017N4_A6176XMaccod[0] ;
         n6176XMaccod = T017N4_n6176XMaccod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6176XMaccod), 8, 0));
         A6217XBarEstReo = T017N4_A6217XBarEstReo[0] ;
         n6217XBarEstReo = T017N4_n6217XBarEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.str( A6217XBarEstReo, 1, 0));
         A6611XUniMed = T017N4_A6611XUniMed[0] ;
         n6611XUniMed = T017N4_n6611XUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6611XUniMed", A6611XUniMed);
         A6820XBarCliCod = T017N4_A6820XBarCliCod[0] ;
         n6820XBarCliCod = T017N4_n6820XBarCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6820XBarCliCod), 6, 0));
         A7139XBarOri = T017N4_A7139XBarOri[0] ;
         n7139XBarOri = T017N4_n7139XBarOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7139XBarOri", A7139XBarOri);
         A7534XBarFecCr = T017N4_A7534XBarFecCr[0] ;
         n7534XBarFecCr = T017N4_n7534XBarFecCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
         A8010XBarTipCol = T017N4_A8010XBarTipCol[0] ;
         n8010XBarTipCol = T017N4_n8010XBarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8010XBarTipCol), 2, 0));
         A8354XVxError = T017N4_A8354XVxError[0] ;
         n8354XVxError = T017N4_n8354XVxError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8354XVxError", A8354XVxError);
         A10268VxBarPieco = T017N4_A10268VxBarPieco[0] ;
         n10268VxBarPieco = T017N4_n10268VxBarPieco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10268VxBarPieco", A10268VxBarPieco);
         zm17N1361( -1) ;
      }
      pr_default.close(2);
      onLoadActions17N1361( ) ;
   }

   public void onLoadActions17N1361( )
   {
   }

   public void checkExtendedTable17N1361( )
   {
      nIsDirty_1361 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17N1361( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17N1361( )
   {
      /* Using cursor T017N5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A7532VxInVerId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1361 = (short)(1) ;
      }
      else
      {
         RcdFound1361 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017N3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A7532VxInVerId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm17N1361( 1) ;
         RcdFound1361 = (short)(1) ;
         A7532VxInVerId = T017N3_A7532VxInVerId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
         A6274VxBarcod = T017N3_A6274VxBarcod[0] ;
         n6274VxBarcod = T017N3_n6274VxBarcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A6275VxBarReo = T017N3_A6275VxBarReo[0] ;
         n6275VxBarReo = T017N3_n6275VxBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.str( A6275VxBarReo, 1, 0));
         A6276VxBarPar = T017N3_A6276VxBarPar[0] ;
         n6276VxBarPar = T017N3_n6276VxBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6276VxBarPar", A6276VxBarPar);
         A7533VxInVeTip = T017N3_A7533VxInVeTip[0] ;
         n7533VxInVeTip = T017N3_n7533VxInVeTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7533VxInVeTip", A7533VxInVeTip);
         A6083AcaCliCod = T017N3_A6083AcaCliCod[0] ;
         n6083AcaCliCod = T017N3_n6083AcaCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6083AcaCliCod), 6, 0));
         A6084AcaArtCod = T017N3_A6084AcaArtCod[0] ;
         n6084AcaArtCod = T017N3_n6084AcaArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6084AcaArtCod", A6084AcaArtCod);
         A6085XBarColCod = T017N3_A6085XBarColCod[0] ;
         n6085XBarColCod = T017N3_n6085XBarColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6085XBarColCod), 6, 0));
         A6086XBarColDsc = T017N3_A6086XBarColDsc[0] ;
         n6086XBarColDsc = T017N3_n6086XBarColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6086XBarColDsc", A6086XBarColDsc);
         A6088XBarCan = T017N3_A6088XBarCan[0] ;
         n6088XBarCan = T017N3_n6088XBarCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrimstr( A6088XBarCan, 9, 2));
         A6089XBarCanSec = T017N3_A6089XBarCanSec[0] ;
         n6089XBarCanSec = T017N3_n6089XBarCanSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6089XBarCanSec), 3, 0));
         A6090XBarSitReg = T017N3_A6090XBarSitReg[0] ;
         n6090XBarSitReg = T017N3_n6090XBarSitReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.str( A6090XBarSitReg, 1, 0));
         A6091XBarOFabTI = T017N3_A6091XBarOFabTI[0] ;
         n6091XBarOFabTI = T017N3_n6091XBarOFabTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6091XBarOFabTI", A6091XBarOFabTI);
         A6092XAcaCod = T017N3_A6092XAcaCod[0] ;
         n6092XAcaCod = T017N3_n6092XAcaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6092XAcaCod", A6092XAcaCod);
         A6093XBarFecSal = T017N3_A6093XBarFecSal[0] ;
         n6093XBarFecSal = T017N3_n6093XBarFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
         A6094XBarOPro = T017N3_A6094XBarOPro[0] ;
         n6094XBarOPro = T017N3_n6094XBarOPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6094XBarOPro", A6094XBarOPro);
         A6095XBarMaq = T017N3_A6095XBarMaq[0] ;
         n6095XBarMaq = T017N3_n6095XBarMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6095XBarMaq", A6095XBarMaq);
         A6098XArtcrumin = T017N3_A6098XArtcrumin[0] ;
         n6098XArtcrumin = T017N3_n6098XArtcrumin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6098XArtcrumin), 4, 0));
         A6099XArtcrumax = T017N3_A6099XArtcrumax[0] ;
         n6099XArtcrumax = T017N3_n6099XArtcrumax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6099XArtcrumax), 4, 0));
         A6100XArtgracru = T017N3_A6100XArtgracru[0] ;
         n6100XArtgracru = T017N3_n6100XArtgracru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6100XArtgracru), 4, 0));
         A6101XArtgraaca = T017N3_A6101XArtgraaca[0] ;
         n6101XArtgraaca = T017N3_n6101XArtgraaca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6101XArtgraaca), 4, 0));
         A6102XArtacamin = T017N3_A6102XArtacamin[0] ;
         n6102XArtacamin = T017N3_n6102XArtacamin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6102XArtacamin), 3, 0));
         A6103XArtacamax = T017N3_A6103XArtacamax[0] ;
         n6103XArtacamax = T017N3_n6103XArtacamax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6103XArtacamax), 3, 0));
         A6104XArtpml = T017N3_A6104XArtpml[0] ;
         n6104XArtpml = T017N3_n6104XArtpml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6104XArtpml), 4, 0));
         A6105Xbarlar = T017N3_A6105Xbarlar[0] ;
         n6105Xbarlar = T017N3_n6105Xbarlar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6105Xbarlar", A6105Xbarlar);
         A6176XMaccod = T017N3_A6176XMaccod[0] ;
         n6176XMaccod = T017N3_n6176XMaccod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6176XMaccod), 8, 0));
         A6217XBarEstReo = T017N3_A6217XBarEstReo[0] ;
         n6217XBarEstReo = T017N3_n6217XBarEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.str( A6217XBarEstReo, 1, 0));
         A6611XUniMed = T017N3_A6611XUniMed[0] ;
         n6611XUniMed = T017N3_n6611XUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6611XUniMed", A6611XUniMed);
         A6820XBarCliCod = T017N3_A6820XBarCliCod[0] ;
         n6820XBarCliCod = T017N3_n6820XBarCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6820XBarCliCod), 6, 0));
         A7139XBarOri = T017N3_A7139XBarOri[0] ;
         n7139XBarOri = T017N3_n7139XBarOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7139XBarOri", A7139XBarOri);
         A7534XBarFecCr = T017N3_A7534XBarFecCr[0] ;
         n7534XBarFecCr = T017N3_n7534XBarFecCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
         A8010XBarTipCol = T017N3_A8010XBarTipCol[0] ;
         n8010XBarTipCol = T017N3_n8010XBarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8010XBarTipCol), 2, 0));
         A8354XVxError = T017N3_A8354XVxError[0] ;
         n8354XVxError = T017N3_n8354XVxError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8354XVxError", A8354XVxError);
         A10268VxBarPieco = T017N3_A10268VxBarPieco[0] ;
         n10268VxBarPieco = T017N3_n10268VxBarPieco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10268VxBarPieco", A10268VxBarPieco);
         Z7532VxInVerId = A7532VxInVerId ;
         sMode1361 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17N1361( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1361 = (short)(0) ;
            initializeNonKey17N1361( ) ;
         }
         Gx_mode = sMode1361 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1361 = (short)(0) ;
         initializeNonKey17N1361( ) ;
         sMode1361 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1361 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17N1361( ) ;
      if ( RcdFound1361 == 0 )
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
      RcdFound1361 = (short)(0) ;
      /* Using cursor T017N6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A7532VxInVerId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T017N6_A7532VxInVerId[0] < A7532VxInVerId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T017N6_A7532VxInVerId[0] > A7532VxInVerId ) ) )
         {
            A7532VxInVerId = T017N6_A7532VxInVerId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
            RcdFound1361 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1361 = (short)(0) ;
      /* Using cursor T017N7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A7532VxInVerId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T017N7_A7532VxInVerId[0] > A7532VxInVerId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T017N7_A7532VxInVerId[0] < A7532VxInVerId ) ) )
         {
            A7532VxInVerId = T017N7_A7532VxInVerId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
            RcdFound1361 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17N1361( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxInVerId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17N1361( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1361 == 1 )
         {
            if ( A7532VxInVerId != Z7532VxInVerId )
            {
               A7532VxInVerId = Z7532VxInVerId ;
               httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXINVERID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxInVerId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxInVerId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17N1361( ) ;
               GX_FocusControl = edtVxInVerId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A7532VxInVerId != Z7532VxInVerId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxInVerId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17N1361( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXINVERID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxInVerId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxInVerId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17N1361( ) ;
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
      if ( A7532VxInVerId != Z7532VxInVerId )
      {
         A7532VxInVerId = Z7532VxInVerId ;
         httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXINVERID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxInVerId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxInVerId_Internalname ;
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
      getKey17N1361( ) ;
      if ( RcdFound1361 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXINVERID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxInVerId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A7532VxInVerId != Z7532VxInVerId )
         {
            A7532VxInVerId = Z7532VxInVerId ;
            httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXINVERID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxInVerId_Internalname ;
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
         if ( A7532VxInVerId != Z7532VxInVerId )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXINVERID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxInVerId_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxincver");
      GX_FocusControl = edtVxBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17N0( ) ;
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
      if ( RcdFound1361 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXINVERID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxInVerId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17N1361( ) ;
      if ( RcdFound1361 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17N1361( ) ;
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
      if ( RcdFound1361 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxBarcod_Internalname ;
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
      if ( RcdFound1361 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxBarcod_Internalname ;
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
      scanStart17N1361( ) ;
      if ( RcdFound1361 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1361 != 0 )
         {
            scanNext17N1361( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17N1361( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17N1361( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017N2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A7532VxInVerId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXTRINCVER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z6274VxBarcod != T017N2_A6274VxBarcod[0] ) || ( Z6275VxBarReo != T017N2_A6275VxBarReo[0] ) || ( GXutil.strcmp(Z6276VxBarPar, T017N2_A6276VxBarPar[0]) != 0 ) || ( GXutil.strcmp(Z7533VxInVeTip, T017N2_A7533VxInVeTip[0]) != 0 ) || ( Z6083AcaCliCod != T017N2_A6083AcaCliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6084AcaArtCod, T017N2_A6084AcaArtCod[0]) != 0 ) || ( Z6085XBarColCod != T017N2_A6085XBarColCod[0] ) || ( GXutil.strcmp(Z6086XBarColDsc, T017N2_A6086XBarColDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z6088XBarCan, T017N2_A6088XBarCan[0]) != 0 ) || ( Z6089XBarCanSec != T017N2_A6089XBarCanSec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6090XBarSitReg != T017N2_A6090XBarSitReg[0] ) || ( GXutil.strcmp(Z6091XBarOFabTI, T017N2_A6091XBarOFabTI[0]) != 0 ) || ( GXutil.strcmp(Z6092XAcaCod, T017N2_A6092XAcaCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6093XBarFecSal), GXutil.resetTime(T017N2_A6093XBarFecSal[0])) ) || ( GXutil.strcmp(Z6094XBarOPro, T017N2_A6094XBarOPro[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6095XBarMaq, T017N2_A6095XBarMaq[0]) != 0 ) || ( Z6098XArtcrumin != T017N2_A6098XArtcrumin[0] ) || ( Z6099XArtcrumax != T017N2_A6099XArtcrumax[0] ) || ( Z6100XArtgracru != T017N2_A6100XArtgracru[0] ) || ( Z6101XArtgraaca != T017N2_A6101XArtgraaca[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6102XArtacamin != T017N2_A6102XArtacamin[0] ) || ( Z6103XArtacamax != T017N2_A6103XArtacamax[0] ) || ( Z6104XArtpml != T017N2_A6104XArtpml[0] ) || ( GXutil.strcmp(Z6105Xbarlar, T017N2_A6105Xbarlar[0]) != 0 ) || ( Z6176XMaccod != T017N2_A6176XMaccod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6217XBarEstReo != T017N2_A6217XBarEstReo[0] ) || ( GXutil.strcmp(Z6611XUniMed, T017N2_A6611XUniMed[0]) != 0 ) || ( Z6820XBarCliCod != T017N2_A6820XBarCliCod[0] ) || ( GXutil.strcmp(Z7139XBarOri, T017N2_A7139XBarOri[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z7534XBarFecCr), GXutil.resetTime(T017N2_A7534XBarFecCr[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8010XBarTipCol != T017N2_A8010XBarTipCol[0] ) || ( GXutil.strcmp(Z8354XVxError, T017N2_A8354XVxError[0]) != 0 ) || ( GXutil.strcmp(Z10268VxBarPieco, T017N2_A10268VxBarPieco[0]) != 0 ) )
         {
            if ( Z6274VxBarcod != T017N2_A6274VxBarcod[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"VxBarcod");
               GXutil.writeLogRaw("Old: ",Z6274VxBarcod);
               GXutil.writeLogRaw("Current: ",T017N2_A6274VxBarcod[0]);
            }
            if ( Z6275VxBarReo != T017N2_A6275VxBarReo[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"VxBarReo");
               GXutil.writeLogRaw("Old: ",Z6275VxBarReo);
               GXutil.writeLogRaw("Current: ",T017N2_A6275VxBarReo[0]);
            }
            if ( GXutil.strcmp(Z6276VxBarPar, T017N2_A6276VxBarPar[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"VxBarPar");
               GXutil.writeLogRaw("Old: ",Z6276VxBarPar);
               GXutil.writeLogRaw("Current: ",T017N2_A6276VxBarPar[0]);
            }
            if ( GXutil.strcmp(Z7533VxInVeTip, T017N2_A7533VxInVeTip[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"VxInVeTip");
               GXutil.writeLogRaw("Old: ",Z7533VxInVeTip);
               GXutil.writeLogRaw("Current: ",T017N2_A7533VxInVeTip[0]);
            }
            if ( Z6083AcaCliCod != T017N2_A6083AcaCliCod[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"AcaCliCod");
               GXutil.writeLogRaw("Old: ",Z6083AcaCliCod);
               GXutil.writeLogRaw("Current: ",T017N2_A6083AcaCliCod[0]);
            }
            if ( GXutil.strcmp(Z6084AcaArtCod, T017N2_A6084AcaArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"AcaArtCod");
               GXutil.writeLogRaw("Old: ",Z6084AcaArtCod);
               GXutil.writeLogRaw("Current: ",T017N2_A6084AcaArtCod[0]);
            }
            if ( Z6085XBarColCod != T017N2_A6085XBarColCod[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarColCod");
               GXutil.writeLogRaw("Old: ",Z6085XBarColCod);
               GXutil.writeLogRaw("Current: ",T017N2_A6085XBarColCod[0]);
            }
            if ( GXutil.strcmp(Z6086XBarColDsc, T017N2_A6086XBarColDsc[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarColDsc");
               GXutil.writeLogRaw("Old: ",Z6086XBarColDsc);
               GXutil.writeLogRaw("Current: ",T017N2_A6086XBarColDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z6088XBarCan, T017N2_A6088XBarCan[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarCan");
               GXutil.writeLogRaw("Old: ",Z6088XBarCan);
               GXutil.writeLogRaw("Current: ",T017N2_A6088XBarCan[0]);
            }
            if ( Z6089XBarCanSec != T017N2_A6089XBarCanSec[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarCanSec");
               GXutil.writeLogRaw("Old: ",Z6089XBarCanSec);
               GXutil.writeLogRaw("Current: ",T017N2_A6089XBarCanSec[0]);
            }
            if ( Z6090XBarSitReg != T017N2_A6090XBarSitReg[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarSitReg");
               GXutil.writeLogRaw("Old: ",Z6090XBarSitReg);
               GXutil.writeLogRaw("Current: ",T017N2_A6090XBarSitReg[0]);
            }
            if ( GXutil.strcmp(Z6091XBarOFabTI, T017N2_A6091XBarOFabTI[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarOFabTI");
               GXutil.writeLogRaw("Old: ",Z6091XBarOFabTI);
               GXutil.writeLogRaw("Current: ",T017N2_A6091XBarOFabTI[0]);
            }
            if ( GXutil.strcmp(Z6092XAcaCod, T017N2_A6092XAcaCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XAcaCod");
               GXutil.writeLogRaw("Old: ",Z6092XAcaCod);
               GXutil.writeLogRaw("Current: ",T017N2_A6092XAcaCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6093XBarFecSal), GXutil.resetTime(T017N2_A6093XBarFecSal[0])) ) )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarFecSal");
               GXutil.writeLogRaw("Old: ",Z6093XBarFecSal);
               GXutil.writeLogRaw("Current: ",T017N2_A6093XBarFecSal[0]);
            }
            if ( GXutil.strcmp(Z6094XBarOPro, T017N2_A6094XBarOPro[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarOPro");
               GXutil.writeLogRaw("Old: ",Z6094XBarOPro);
               GXutil.writeLogRaw("Current: ",T017N2_A6094XBarOPro[0]);
            }
            if ( GXutil.strcmp(Z6095XBarMaq, T017N2_A6095XBarMaq[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarMaq");
               GXutil.writeLogRaw("Old: ",Z6095XBarMaq);
               GXutil.writeLogRaw("Current: ",T017N2_A6095XBarMaq[0]);
            }
            if ( Z6098XArtcrumin != T017N2_A6098XArtcrumin[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtcrumin");
               GXutil.writeLogRaw("Old: ",Z6098XArtcrumin);
               GXutil.writeLogRaw("Current: ",T017N2_A6098XArtcrumin[0]);
            }
            if ( Z6099XArtcrumax != T017N2_A6099XArtcrumax[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtcrumax");
               GXutil.writeLogRaw("Old: ",Z6099XArtcrumax);
               GXutil.writeLogRaw("Current: ",T017N2_A6099XArtcrumax[0]);
            }
            if ( Z6100XArtgracru != T017N2_A6100XArtgracru[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtgracru");
               GXutil.writeLogRaw("Old: ",Z6100XArtgracru);
               GXutil.writeLogRaw("Current: ",T017N2_A6100XArtgracru[0]);
            }
            if ( Z6101XArtgraaca != T017N2_A6101XArtgraaca[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtgraaca");
               GXutil.writeLogRaw("Old: ",Z6101XArtgraaca);
               GXutil.writeLogRaw("Current: ",T017N2_A6101XArtgraaca[0]);
            }
            if ( Z6102XArtacamin != T017N2_A6102XArtacamin[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtacamin");
               GXutil.writeLogRaw("Old: ",Z6102XArtacamin);
               GXutil.writeLogRaw("Current: ",T017N2_A6102XArtacamin[0]);
            }
            if ( Z6103XArtacamax != T017N2_A6103XArtacamax[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtacamax");
               GXutil.writeLogRaw("Old: ",Z6103XArtacamax);
               GXutil.writeLogRaw("Current: ",T017N2_A6103XArtacamax[0]);
            }
            if ( Z6104XArtpml != T017N2_A6104XArtpml[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XArtpml");
               GXutil.writeLogRaw("Old: ",Z6104XArtpml);
               GXutil.writeLogRaw("Current: ",T017N2_A6104XArtpml[0]);
            }
            if ( GXutil.strcmp(Z6105Xbarlar, T017N2_A6105Xbarlar[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"Xbarlar");
               GXutil.writeLogRaw("Old: ",Z6105Xbarlar);
               GXutil.writeLogRaw("Current: ",T017N2_A6105Xbarlar[0]);
            }
            if ( Z6176XMaccod != T017N2_A6176XMaccod[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XMaccod");
               GXutil.writeLogRaw("Old: ",Z6176XMaccod);
               GXutil.writeLogRaw("Current: ",T017N2_A6176XMaccod[0]);
            }
            if ( Z6217XBarEstReo != T017N2_A6217XBarEstReo[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarEstReo");
               GXutil.writeLogRaw("Old: ",Z6217XBarEstReo);
               GXutil.writeLogRaw("Current: ",T017N2_A6217XBarEstReo[0]);
            }
            if ( GXutil.strcmp(Z6611XUniMed, T017N2_A6611XUniMed[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XUniMed");
               GXutil.writeLogRaw("Old: ",Z6611XUniMed);
               GXutil.writeLogRaw("Current: ",T017N2_A6611XUniMed[0]);
            }
            if ( Z6820XBarCliCod != T017N2_A6820XBarCliCod[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarCliCod");
               GXutil.writeLogRaw("Old: ",Z6820XBarCliCod);
               GXutil.writeLogRaw("Current: ",T017N2_A6820XBarCliCod[0]);
            }
            if ( GXutil.strcmp(Z7139XBarOri, T017N2_A7139XBarOri[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarOri");
               GXutil.writeLogRaw("Old: ",Z7139XBarOri);
               GXutil.writeLogRaw("Current: ",T017N2_A7139XBarOri[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7534XBarFecCr), GXutil.resetTime(T017N2_A7534XBarFecCr[0])) ) )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarFecCr");
               GXutil.writeLogRaw("Old: ",Z7534XBarFecCr);
               GXutil.writeLogRaw("Current: ",T017N2_A7534XBarFecCr[0]);
            }
            if ( Z8010XBarTipCol != T017N2_A8010XBarTipCol[0] )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XBarTipCol");
               GXutil.writeLogRaw("Old: ",Z8010XBarTipCol);
               GXutil.writeLogRaw("Current: ",T017N2_A8010XBarTipCol[0]);
            }
            if ( GXutil.strcmp(Z8354XVxError, T017N2_A8354XVxError[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"XVxError");
               GXutil.writeLogRaw("Old: ",Z8354XVxError);
               GXutil.writeLogRaw("Current: ",T017N2_A8354XVxError[0]);
            }
            if ( GXutil.strcmp(Z10268VxBarPieco, T017N2_A10268VxBarPieco[0]) != 0 )
            {
               GXutil.writeLogln("tvxincver:[seudo value changed for attri]"+"VxBarPieco");
               GXutil.writeLogRaw("Old: ",Z10268VxBarPieco);
               GXutil.writeLogRaw("Current: ",T017N2_A10268VxBarPieco[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXTRINCVER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17N1361( )
   {
      beforeValidate17N1361( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17N1361( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17N1361( 0) ;
         checkOptimisticConcurrency17N1361( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17N1361( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17N1361( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017N8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A7532VxInVerId), Boolean.valueOf(n6274VxBarcod), Integer.valueOf(A6274VxBarcod), Boolean.valueOf(n6275VxBarReo), Byte.valueOf(A6275VxBarReo), Boolean.valueOf(n6276VxBarPar), A6276VxBarPar, Boolean.valueOf(n7533VxInVeTip), A7533VxInVeTip, Boolean.valueOf(n6083AcaCliCod), Integer.valueOf(A6083AcaCliCod), Boolean.valueOf(n6084AcaArtCod), A6084AcaArtCod, Boolean.valueOf(n6085XBarColCod), Integer.valueOf(A6085XBarColCod), Boolean.valueOf(n6086XBarColDsc), A6086XBarColDsc, Boolean.valueOf(n6088XBarCan), A6088XBarCan, Boolean.valueOf(n6089XBarCanSec), Short.valueOf(A6089XBarCanSec), Boolean.valueOf(n6090XBarSitReg), Byte.valueOf(A6090XBarSitReg), Boolean.valueOf(n6091XBarOFabTI), A6091XBarOFabTI, Boolean.valueOf(n6092XAcaCod), A6092XAcaCod, Boolean.valueOf(n6093XBarFecSal), A6093XBarFecSal, Boolean.valueOf(n6094XBarOPro), A6094XBarOPro, Boolean.valueOf(n6095XBarMaq), A6095XBarMaq, Boolean.valueOf(n6098XArtcrumin), Short.valueOf(A6098XArtcrumin), Boolean.valueOf(n6099XArtcrumax), Short.valueOf(A6099XArtcrumax), Boolean.valueOf(n6100XArtgracru), Short.valueOf(A6100XArtgracru), Boolean.valueOf(n6101XArtgraaca), Short.valueOf(A6101XArtgraaca), Boolean.valueOf(n6102XArtacamin), Short.valueOf(A6102XArtacamin), Boolean.valueOf(n6103XArtacamax), Short.valueOf(A6103XArtacamax), Boolean.valueOf(n6104XArtpml), Short.valueOf(A6104XArtpml), Boolean.valueOf(n6105Xbarlar), A6105Xbarlar, Boolean.valueOf(n6176XMaccod), Integer.valueOf(A6176XMaccod), Boolean.valueOf(n6217XBarEstReo), Byte.valueOf(A6217XBarEstReo), Boolean.valueOf(n6611XUniMed), A6611XUniMed, Boolean.valueOf(n6820XBarCliCod), Integer.valueOf(A6820XBarCliCod), Boolean.valueOf(n7139XBarOri), A7139XBarOri, Boolean.valueOf(n7534XBarFecCr), A7534XBarFecCr, Boolean.valueOf(n8010XBarTipCol), Byte.valueOf(A8010XBarTipCol), Boolean.valueOf(n8354XVxError), A8354XVxError, Boolean.valueOf(n10268VxBarPieco), A10268VxBarPieco});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTrIncVer");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption17N0( ) ;
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
            load17N1361( ) ;
         }
         endLevel17N1361( ) ;
      }
      closeExtendedTableCursors17N1361( ) ;
   }

   public void update17N1361( )
   {
      beforeValidate17N1361( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17N1361( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17N1361( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17N1361( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17N1361( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017N9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6274VxBarcod), Integer.valueOf(A6274VxBarcod), Boolean.valueOf(n6275VxBarReo), Byte.valueOf(A6275VxBarReo), Boolean.valueOf(n6276VxBarPar), A6276VxBarPar, Boolean.valueOf(n7533VxInVeTip), A7533VxInVeTip, Boolean.valueOf(n6083AcaCliCod), Integer.valueOf(A6083AcaCliCod), Boolean.valueOf(n6084AcaArtCod), A6084AcaArtCod, Boolean.valueOf(n6085XBarColCod), Integer.valueOf(A6085XBarColCod), Boolean.valueOf(n6086XBarColDsc), A6086XBarColDsc, Boolean.valueOf(n6088XBarCan), A6088XBarCan, Boolean.valueOf(n6089XBarCanSec), Short.valueOf(A6089XBarCanSec), Boolean.valueOf(n6090XBarSitReg), Byte.valueOf(A6090XBarSitReg), Boolean.valueOf(n6091XBarOFabTI), A6091XBarOFabTI, Boolean.valueOf(n6092XAcaCod), A6092XAcaCod, Boolean.valueOf(n6093XBarFecSal), A6093XBarFecSal, Boolean.valueOf(n6094XBarOPro), A6094XBarOPro, Boolean.valueOf(n6095XBarMaq), A6095XBarMaq, Boolean.valueOf(n6098XArtcrumin), Short.valueOf(A6098XArtcrumin), Boolean.valueOf(n6099XArtcrumax), Short.valueOf(A6099XArtcrumax), Boolean.valueOf(n6100XArtgracru), Short.valueOf(A6100XArtgracru), Boolean.valueOf(n6101XArtgraaca), Short.valueOf(A6101XArtgraaca), Boolean.valueOf(n6102XArtacamin), Short.valueOf(A6102XArtacamin), Boolean.valueOf(n6103XArtacamax), Short.valueOf(A6103XArtacamax), Boolean.valueOf(n6104XArtpml), Short.valueOf(A6104XArtpml), Boolean.valueOf(n6105Xbarlar), A6105Xbarlar, Boolean.valueOf(n6176XMaccod), Integer.valueOf(A6176XMaccod), Boolean.valueOf(n6217XBarEstReo), Byte.valueOf(A6217XBarEstReo), Boolean.valueOf(n6611XUniMed), A6611XUniMed, Boolean.valueOf(n6820XBarCliCod), Integer.valueOf(A6820XBarCliCod), Boolean.valueOf(n7139XBarOri), A7139XBarOri, Boolean.valueOf(n7534XBarFecCr), A7534XBarFecCr, Boolean.valueOf(n8010XBarTipCol), Byte.valueOf(A8010XBarTipCol), Boolean.valueOf(n8354XVxError), A8354XVxError, Boolean.valueOf(n10268VxBarPieco), A10268VxBarPieco, Long.valueOf(A7532VxInVerId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTrIncVer");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXTRINCVER"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17N1361( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17N0( ) ;
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
         endLevel17N1361( ) ;
      }
      closeExtendedTableCursors17N1361( ) ;
   }

   public void deferredUpdate17N1361( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17N1361( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17N1361( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17N1361( ) ;
         afterConfirm17N1361( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17N1361( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017N10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A7532VxInVerId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTrIncVer");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1361 == 0 )
                     {
                        initAll17N1361( ) ;
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
                     resetCaption17N0( ) ;
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
      sMode1361 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17N1361( ) ;
      Gx_mode = sMode1361 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17N1361( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17N1361( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17N1361( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxincver");
         if ( AnyError == 0 )
         {
            confirmValues17N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxincver");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17N1361( )
   {
      /* Using cursor T017N11 */
      pr_default.execute(9);
      RcdFound1361 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1361 = (short)(1) ;
         A7532VxInVerId = T017N11_A7532VxInVerId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17N1361( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1361 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1361 = (short)(1) ;
         A7532VxInVerId = T017N11_A7532VxInVerId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
      }
   }

   public void scanEnd17N1361( )
   {
      pr_default.close(9);
   }

   public void afterConfirm17N1361( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17N1361( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17N1361( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17N1361( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17N1361( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17N1361( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17N1361( )
   {
      edtVxInVerId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxInVerId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxInVerId_Enabled), 5, 0), true);
      edtVxBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxBarcod_Enabled), 5, 0), true);
      edtVxBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxBarReo_Enabled), 5, 0), true);
      edtVxBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxBarPar_Enabled), 5, 0), true);
      edtVxInVeTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxInVeTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxInVeTip_Enabled), 5, 0), true);
      edtAcaCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcaCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcaCliCod_Enabled), 5, 0), true);
      edtAcaArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcaArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcaArtCod_Enabled), 5, 0), true);
      edtXBarColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarColCod_Enabled), 5, 0), true);
      edtXBarColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarColDsc_Enabled), 5, 0), true);
      edtXBarCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarCan_Enabled), 5, 0), true);
      edtXBarCanSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarCanSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarCanSec_Enabled), 5, 0), true);
      edtXBarSitReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarSitReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarSitReg_Enabled), 5, 0), true);
      edtXBarOFabTI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarOFabTI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarOFabTI_Enabled), 5, 0), true);
      edtXAcaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAcaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAcaCod_Enabled), 5, 0), true);
      edtXBarFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarFecSal_Enabled), 5, 0), true);
      edtXBarOPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarOPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarOPro_Enabled), 5, 0), true);
      edtXBarMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarMaq_Enabled), 5, 0), true);
      edtXArtcrumin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtcrumin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtcrumin_Enabled), 5, 0), true);
      edtXArtcrumax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtcrumax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtcrumax_Enabled), 5, 0), true);
      edtXArtgracru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtgracru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtgracru_Enabled), 5, 0), true);
      edtXArtgraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtgraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtgraaca_Enabled), 5, 0), true);
      edtXArtacamin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtacamin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtacamin_Enabled), 5, 0), true);
      edtXArtacamax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtacamax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtacamax_Enabled), 5, 0), true);
      edtXArtpml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXArtpml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXArtpml_Enabled), 5, 0), true);
      edtXbarlar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXbarlar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXbarlar_Enabled), 5, 0), true);
      edtXMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXMaccod_Enabled), 5, 0), true);
      edtXBarEstReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarEstReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarEstReo_Enabled), 5, 0), true);
      edtXUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUniMed_Enabled), 5, 0), true);
      edtXBarCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarCliCod_Enabled), 5, 0), true);
      edtXBarOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarOri_Enabled), 5, 0), true);
      edtXBarFecCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarFecCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarFecCr_Enabled), 5, 0), true);
      edtXBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXBarTipCol_Enabled), 5, 0), true);
      edtXVxError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXVxError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXVxError_Enabled), 5, 0), true);
      edtVxBarPieco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxBarPieco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxBarPieco_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17N1361( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17N0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxincver", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7532VxInVerId", GXutil.ltrim( localUtil.ntoc( Z7532VxInVerId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6274VxBarcod", GXutil.ltrim( localUtil.ntoc( Z6274VxBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6275VxBarReo", GXutil.ltrim( localUtil.ntoc( Z6275VxBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6276VxBarPar", GXutil.rtrim( Z6276VxBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7533VxInVeTip", GXutil.rtrim( Z7533VxInVeTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6083AcaCliCod", GXutil.ltrim( localUtil.ntoc( Z6083AcaCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6084AcaArtCod", GXutil.rtrim( Z6084AcaArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6085XBarColCod", GXutil.ltrim( localUtil.ntoc( Z6085XBarColCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6086XBarColDsc", GXutil.rtrim( Z6086XBarColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6088XBarCan", GXutil.ltrim( localUtil.ntoc( Z6088XBarCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6089XBarCanSec", GXutil.ltrim( localUtil.ntoc( Z6089XBarCanSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6090XBarSitReg", GXutil.ltrim( localUtil.ntoc( Z6090XBarSitReg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6091XBarOFabTI", GXutil.rtrim( Z6091XBarOFabTI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6092XAcaCod", GXutil.rtrim( Z6092XAcaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6093XBarFecSal", localUtil.dtoc( Z6093XBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6094XBarOPro", GXutil.rtrim( Z6094XBarOPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6095XBarMaq", GXutil.rtrim( Z6095XBarMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6098XArtcrumin", GXutil.ltrim( localUtil.ntoc( Z6098XArtcrumin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6099XArtcrumax", GXutil.ltrim( localUtil.ntoc( Z6099XArtcrumax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6100XArtgracru", GXutil.ltrim( localUtil.ntoc( Z6100XArtgracru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6101XArtgraaca", GXutil.ltrim( localUtil.ntoc( Z6101XArtgraaca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6102XArtacamin", GXutil.ltrim( localUtil.ntoc( Z6102XArtacamin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6103XArtacamax", GXutil.ltrim( localUtil.ntoc( Z6103XArtacamax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6104XArtpml", GXutil.ltrim( localUtil.ntoc( Z6104XArtpml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6105Xbarlar", GXutil.rtrim( Z6105Xbarlar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6176XMaccod", GXutil.ltrim( localUtil.ntoc( Z6176XMaccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6217XBarEstReo", GXutil.ltrim( localUtil.ntoc( Z6217XBarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6611XUniMed", GXutil.rtrim( Z6611XUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6820XBarCliCod", GXutil.ltrim( localUtil.ntoc( Z6820XBarCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7139XBarOri", GXutil.rtrim( Z7139XBarOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7534XBarFecCr", localUtil.dtoc( Z7534XBarFecCr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8010XBarTipCol", GXutil.ltrim( localUtil.ntoc( Z8010XBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8354XVxError", GXutil.rtrim( Z8354XVxError));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10268VxBarPieco", GXutil.rtrim( Z10268VxBarPieco));
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
      return formatLink("app.tvxincver", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxIncVer" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Incidencias Vertex", "") ;
   }

   public void initializeNonKey17N1361( )
   {
      A6274VxBarcod = 0 ;
      n6274VxBarcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
      A6275VxBarReo = (byte)(0) ;
      n6275VxBarReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.str( A6275VxBarReo, 1, 0));
      A6276VxBarPar = "" ;
      n6276VxBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6276VxBarPar", A6276VxBarPar);
      A7533VxInVeTip = "" ;
      n7533VxInVeTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7533VxInVeTip", A7533VxInVeTip);
      A6083AcaCliCod = 0 ;
      n6083AcaCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6083AcaCliCod), 6, 0));
      A6084AcaArtCod = "" ;
      n6084AcaArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6084AcaArtCod", A6084AcaArtCod);
      A6085XBarColCod = 0 ;
      n6085XBarColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6085XBarColCod), 6, 0));
      A6086XBarColDsc = "" ;
      n6086XBarColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6086XBarColDsc", A6086XBarColDsc);
      A6088XBarCan = DecimalUtil.ZERO ;
      n6088XBarCan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrimstr( A6088XBarCan, 9, 2));
      A6089XBarCanSec = (short)(0) ;
      n6089XBarCanSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6089XBarCanSec), 3, 0));
      A6090XBarSitReg = (byte)(0) ;
      n6090XBarSitReg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.str( A6090XBarSitReg, 1, 0));
      A6091XBarOFabTI = "" ;
      n6091XBarOFabTI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6091XBarOFabTI", A6091XBarOFabTI);
      A6092XAcaCod = "" ;
      n6092XAcaCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6092XAcaCod", A6092XAcaCod);
      A6093XBarFecSal = GXutil.nullDate() ;
      n6093XBarFecSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
      A6094XBarOPro = "" ;
      n6094XBarOPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6094XBarOPro", A6094XBarOPro);
      A6095XBarMaq = "" ;
      n6095XBarMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6095XBarMaq", A6095XBarMaq);
      A6098XArtcrumin = (short)(0) ;
      n6098XArtcrumin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6098XArtcrumin), 4, 0));
      A6099XArtcrumax = (short)(0) ;
      n6099XArtcrumax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6099XArtcrumax), 4, 0));
      A6100XArtgracru = (short)(0) ;
      n6100XArtgracru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6100XArtgracru), 4, 0));
      A6101XArtgraaca = (short)(0) ;
      n6101XArtgraaca = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6101XArtgraaca), 4, 0));
      A6102XArtacamin = (short)(0) ;
      n6102XArtacamin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6102XArtacamin), 3, 0));
      A6103XArtacamax = (short)(0) ;
      n6103XArtacamax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6103XArtacamax), 3, 0));
      A6104XArtpml = (short)(0) ;
      n6104XArtpml = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6104XArtpml), 4, 0));
      A6105Xbarlar = "" ;
      n6105Xbarlar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6105Xbarlar", A6105Xbarlar);
      A6176XMaccod = 0 ;
      n6176XMaccod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6176XMaccod), 8, 0));
      A6217XBarEstReo = (byte)(0) ;
      n6217XBarEstReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.str( A6217XBarEstReo, 1, 0));
      A6611XUniMed = "" ;
      n6611XUniMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6611XUniMed", A6611XUniMed);
      A6820XBarCliCod = 0 ;
      n6820XBarCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6820XBarCliCod), 6, 0));
      A7139XBarOri = "" ;
      n7139XBarOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7139XBarOri", A7139XBarOri);
      A7534XBarFecCr = GXutil.nullDate() ;
      n7534XBarFecCr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
      A8010XBarTipCol = (byte)(0) ;
      n8010XBarTipCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8010XBarTipCol), 2, 0));
      A8354XVxError = "" ;
      n8354XVxError = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8354XVxError", A8354XVxError);
      A10268VxBarPieco = "" ;
      n10268VxBarPieco = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10268VxBarPieco", A10268VxBarPieco);
      Z6274VxBarcod = 0 ;
      Z6275VxBarReo = (byte)(0) ;
      Z6276VxBarPar = "" ;
      Z7533VxInVeTip = "" ;
      Z6083AcaCliCod = 0 ;
      Z6084AcaArtCod = "" ;
      Z6085XBarColCod = 0 ;
      Z6086XBarColDsc = "" ;
      Z6088XBarCan = DecimalUtil.ZERO ;
      Z6089XBarCanSec = (short)(0) ;
      Z6090XBarSitReg = (byte)(0) ;
      Z6091XBarOFabTI = "" ;
      Z6092XAcaCod = "" ;
      Z6093XBarFecSal = GXutil.nullDate() ;
      Z6094XBarOPro = "" ;
      Z6095XBarMaq = "" ;
      Z6098XArtcrumin = (short)(0) ;
      Z6099XArtcrumax = (short)(0) ;
      Z6100XArtgracru = (short)(0) ;
      Z6101XArtgraaca = (short)(0) ;
      Z6102XArtacamin = (short)(0) ;
      Z6103XArtacamax = (short)(0) ;
      Z6104XArtpml = (short)(0) ;
      Z6105Xbarlar = "" ;
      Z6176XMaccod = 0 ;
      Z6217XBarEstReo = (byte)(0) ;
      Z6611XUniMed = "" ;
      Z6820XBarCliCod = 0 ;
      Z7139XBarOri = "" ;
      Z7534XBarFecCr = GXutil.nullDate() ;
      Z8010XBarTipCol = (byte)(0) ;
      Z8354XVxError = "" ;
      Z10268VxBarPieco = "" ;
   }

   public void initAll17N1361( )
   {
      A7532VxInVerId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7532VxInVerId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7532VxInVerId), 12, 0));
      initializeNonKey17N1361( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251913334", true, true);
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
      httpContext.AddJavascriptSource("tvxincver.js", "?20261251913334", false, true);
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
      edtVxInVerId_Internalname = "VXINVERID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxBarcod_Internalname = "VXBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxBarReo_Internalname = "VXBARREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxBarPar_Internalname = "VXBARPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxInVeTip_Internalname = "VXINVETIP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAcaCliCod_Internalname = "ACACLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAcaArtCod_Internalname = "ACAARTCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXBarColCod_Internalname = "XBARCOLCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXBarColDsc_Internalname = "XBARCOLDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXBarCan_Internalname = "XBARCAN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXBarCanSec_Internalname = "XBARCANSEC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXBarSitReg_Internalname = "XBARSITREG" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXBarOFabTI_Internalname = "XBAROFABTI" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXAcaCod_Internalname = "XACACOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXBarFecSal_Internalname = "XBARFECSAL" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXBarOPro_Internalname = "XBAROPRO" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtXBarMaq_Internalname = "XBARMAQ" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtXArtcrumin_Internalname = "XARTCRUMIN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtXArtcrumax_Internalname = "XARTCRUMAX" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtXArtgracru_Internalname = "XARTGRACRU" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtXArtgraaca_Internalname = "XARTGRAACA" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtXArtacamin_Internalname = "XARTACAMIN" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtXArtacamax_Internalname = "XARTACAMAX" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtXArtpml_Internalname = "XARTPML" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtXbarlar_Internalname = "XBARLAR" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtXMaccod_Internalname = "XMACCOD" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtXBarEstReo_Internalname = "XBARESTREO" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtXUniMed_Internalname = "XUNIMED" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtXBarCliCod_Internalname = "XBARCLICOD" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtXBarOri_Internalname = "XBARORI" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtXBarFecCr_Internalname = "XBARFECCR" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtXBarTipCol_Internalname = "XBARTIPCOL" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtXVxError_Internalname = "XVXERROR" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtVxBarPieco_Internalname = "VXBARPIECO" ;
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
      Form.setCaption( httpContext.getMessage( "Incidencias Vertex", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxBarPieco_Jsonclick = "" ;
      edtVxBarPieco_Backcolor = (int)(0xFFFFFF) ;
      edtVxBarPieco_Enabled = 1 ;
      edtXVxError_Jsonclick = "" ;
      edtXVxError_Backcolor = (int)(0xFFFFFF) ;
      edtXVxError_Enabled = 1 ;
      edtXBarTipCol_Jsonclick = "" ;
      edtXBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtXBarTipCol_Enabled = 1 ;
      edtXBarFecCr_Jsonclick = "" ;
      edtXBarFecCr_Backcolor = (int)(0xFFFFFF) ;
      edtXBarFecCr_Enabled = 1 ;
      edtXBarOri_Jsonclick = "" ;
      edtXBarOri_Backcolor = (int)(0xFFFFFF) ;
      edtXBarOri_Enabled = 1 ;
      edtXBarCliCod_Jsonclick = "" ;
      edtXBarCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtXBarCliCod_Enabled = 1 ;
      edtXUniMed_Jsonclick = "" ;
      edtXUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtXUniMed_Enabled = 1 ;
      edtXBarEstReo_Jsonclick = "" ;
      edtXBarEstReo_Backcolor = (int)(0xFFFFFF) ;
      edtXBarEstReo_Enabled = 1 ;
      edtXMaccod_Jsonclick = "" ;
      edtXMaccod_Backcolor = (int)(0xFFFFFF) ;
      edtXMaccod_Enabled = 1 ;
      edtXbarlar_Jsonclick = "" ;
      edtXbarlar_Backcolor = (int)(0xFFFFFF) ;
      edtXbarlar_Enabled = 1 ;
      edtXArtpml_Jsonclick = "" ;
      edtXArtpml_Backcolor = (int)(0xFFFFFF) ;
      edtXArtpml_Enabled = 1 ;
      edtXArtacamax_Jsonclick = "" ;
      edtXArtacamax_Backcolor = (int)(0xFFFFFF) ;
      edtXArtacamax_Enabled = 1 ;
      edtXArtacamin_Jsonclick = "" ;
      edtXArtacamin_Backcolor = (int)(0xFFFFFF) ;
      edtXArtacamin_Enabled = 1 ;
      edtXArtgraaca_Jsonclick = "" ;
      edtXArtgraaca_Backcolor = (int)(0xFFFFFF) ;
      edtXArtgraaca_Enabled = 1 ;
      edtXArtgracru_Jsonclick = "" ;
      edtXArtgracru_Backcolor = (int)(0xFFFFFF) ;
      edtXArtgracru_Enabled = 1 ;
      edtXArtcrumax_Jsonclick = "" ;
      edtXArtcrumax_Backcolor = (int)(0xFFFFFF) ;
      edtXArtcrumax_Enabled = 1 ;
      edtXArtcrumin_Jsonclick = "" ;
      edtXArtcrumin_Backcolor = (int)(0xFFFFFF) ;
      edtXArtcrumin_Enabled = 1 ;
      edtXBarMaq_Jsonclick = "" ;
      edtXBarMaq_Backcolor = (int)(0xFFFFFF) ;
      edtXBarMaq_Enabled = 1 ;
      edtXBarOPro_Jsonclick = "" ;
      edtXBarOPro_Backcolor = (int)(0xFFFFFF) ;
      edtXBarOPro_Enabled = 1 ;
      edtXBarFecSal_Jsonclick = "" ;
      edtXBarFecSal_Backcolor = (int)(0xFFFFFF) ;
      edtXBarFecSal_Enabled = 1 ;
      edtXAcaCod_Jsonclick = "" ;
      edtXAcaCod_Backcolor = (int)(0xFFFFFF) ;
      edtXAcaCod_Enabled = 1 ;
      edtXBarOFabTI_Jsonclick = "" ;
      edtXBarOFabTI_Backcolor = (int)(0xFFFFFF) ;
      edtXBarOFabTI_Enabled = 1 ;
      edtXBarSitReg_Jsonclick = "" ;
      edtXBarSitReg_Backcolor = (int)(0xFFFFFF) ;
      edtXBarSitReg_Enabled = 1 ;
      edtXBarCanSec_Jsonclick = "" ;
      edtXBarCanSec_Backcolor = (int)(0xFFFFFF) ;
      edtXBarCanSec_Enabled = 1 ;
      edtXBarCan_Jsonclick = "" ;
      edtXBarCan_Backcolor = (int)(0xFFFFFF) ;
      edtXBarCan_Enabled = 1 ;
      edtXBarColDsc_Jsonclick = "" ;
      edtXBarColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtXBarColDsc_Enabled = 1 ;
      edtXBarColCod_Jsonclick = "" ;
      edtXBarColCod_Backcolor = (int)(0xFFFFFF) ;
      edtXBarColCod_Enabled = 1 ;
      edtAcaArtCod_Jsonclick = "" ;
      edtAcaArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtAcaArtCod_Enabled = 1 ;
      edtAcaCliCod_Jsonclick = "" ;
      edtAcaCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtAcaCliCod_Enabled = 1 ;
      edtVxInVeTip_Jsonclick = "" ;
      edtVxInVeTip_Backcolor = (int)(0xFFFFFF) ;
      edtVxInVeTip_Enabled = 1 ;
      edtVxBarPar_Jsonclick = "" ;
      edtVxBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtVxBarPar_Enabled = 1 ;
      edtVxBarReo_Jsonclick = "" ;
      edtVxBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtVxBarReo_Enabled = 1 ;
      edtVxBarcod_Jsonclick = "" ;
      edtVxBarcod_Backcolor = (int)(0xFFFFFF) ;
      edtVxBarcod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxInVerId_Jsonclick = "" ;
      edtVxInVerId_Backcolor = (int)(0xFFFFFF) ;
      edtVxInVerId_Enabled = 1 ;
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
      GX_FocusControl = edtVxBarcod_Internalname ;
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

   public void valid_Vxinverid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrim( localUtil.ntoc( A6274VxBarcod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6275VxBarReo", GXutil.ltrim( localUtil.ntoc( A6275VxBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6276VxBarPar", GXutil.rtrim( A6276VxBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A7533VxInVeTip", GXutil.rtrim( A7533VxInVeTip));
      httpContext.ajax_rsp_assign_attri("", false, "A6083AcaCliCod", GXutil.ltrim( localUtil.ntoc( A6083AcaCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6084AcaArtCod", GXutil.rtrim( A6084AcaArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6085XBarColCod", GXutil.ltrim( localUtil.ntoc( A6085XBarColCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6086XBarColDsc", GXutil.rtrim( A6086XBarColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6088XBarCan", GXutil.ltrim( localUtil.ntoc( A6088XBarCan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6089XBarCanSec", GXutil.ltrim( localUtil.ntoc( A6089XBarCanSec, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6090XBarSitReg", GXutil.ltrim( localUtil.ntoc( A6090XBarSitReg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6091XBarOFabTI", GXutil.rtrim( A6091XBarOFabTI));
      httpContext.ajax_rsp_assign_attri("", false, "A6092XAcaCod", GXutil.rtrim( A6092XAcaCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6093XBarFecSal", localUtil.format(A6093XBarFecSal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6094XBarOPro", GXutil.rtrim( A6094XBarOPro));
      httpContext.ajax_rsp_assign_attri("", false, "A6095XBarMaq", GXutil.rtrim( A6095XBarMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A6098XArtcrumin", GXutil.ltrim( localUtil.ntoc( A6098XArtcrumin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6099XArtcrumax", GXutil.ltrim( localUtil.ntoc( A6099XArtcrumax, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6100XArtgracru", GXutil.ltrim( localUtil.ntoc( A6100XArtgracru, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6101XArtgraaca", GXutil.ltrim( localUtil.ntoc( A6101XArtgraaca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6102XArtacamin", GXutil.ltrim( localUtil.ntoc( A6102XArtacamin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6103XArtacamax", GXutil.ltrim( localUtil.ntoc( A6103XArtacamax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6104XArtpml", GXutil.ltrim( localUtil.ntoc( A6104XArtpml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6105Xbarlar", GXutil.rtrim( A6105Xbarlar));
      httpContext.ajax_rsp_assign_attri("", false, "A6176XMaccod", GXutil.ltrim( localUtil.ntoc( A6176XMaccod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6217XBarEstReo", GXutil.ltrim( localUtil.ntoc( A6217XBarEstReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6611XUniMed", GXutil.rtrim( A6611XUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A6820XBarCliCod", GXutil.ltrim( localUtil.ntoc( A6820XBarCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7139XBarOri", GXutil.rtrim( A7139XBarOri));
      httpContext.ajax_rsp_assign_attri("", false, "A7534XBarFecCr", localUtil.format(A7534XBarFecCr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8010XBarTipCol", GXutil.ltrim( localUtil.ntoc( A8010XBarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8354XVxError", GXutil.rtrim( A8354XVxError));
      httpContext.ajax_rsp_assign_attri("", false, "A10268VxBarPieco", GXutil.rtrim( A10268VxBarPieco));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7532VxInVerId", GXutil.ltrim( localUtil.ntoc( Z7532VxInVerId, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6274VxBarcod", GXutil.ltrim( localUtil.ntoc( Z6274VxBarcod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6275VxBarReo", GXutil.ltrim( localUtil.ntoc( Z6275VxBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6276VxBarPar", GXutil.rtrim( Z6276VxBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7533VxInVeTip", GXutil.rtrim( Z7533VxInVeTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6083AcaCliCod", GXutil.ltrim( localUtil.ntoc( Z6083AcaCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6084AcaArtCod", GXutil.rtrim( Z6084AcaArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6085XBarColCod", GXutil.ltrim( localUtil.ntoc( Z6085XBarColCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6086XBarColDsc", GXutil.rtrim( Z6086XBarColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6088XBarCan", GXutil.ltrim( localUtil.ntoc( Z6088XBarCan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6089XBarCanSec", GXutil.ltrim( localUtil.ntoc( Z6089XBarCanSec, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6090XBarSitReg", GXutil.ltrim( localUtil.ntoc( Z6090XBarSitReg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6091XBarOFabTI", GXutil.rtrim( Z6091XBarOFabTI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6092XAcaCod", GXutil.rtrim( Z6092XAcaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6093XBarFecSal", localUtil.format(Z6093XBarFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6094XBarOPro", GXutil.rtrim( Z6094XBarOPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6095XBarMaq", GXutil.rtrim( Z6095XBarMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6098XArtcrumin", GXutil.ltrim( localUtil.ntoc( Z6098XArtcrumin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6099XArtcrumax", GXutil.ltrim( localUtil.ntoc( Z6099XArtcrumax, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6100XArtgracru", GXutil.ltrim( localUtil.ntoc( Z6100XArtgracru, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6101XArtgraaca", GXutil.ltrim( localUtil.ntoc( Z6101XArtgraaca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6102XArtacamin", GXutil.ltrim( localUtil.ntoc( Z6102XArtacamin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6103XArtacamax", GXutil.ltrim( localUtil.ntoc( Z6103XArtacamax, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6104XArtpml", GXutil.ltrim( localUtil.ntoc( Z6104XArtpml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6105Xbarlar", GXutil.rtrim( Z6105Xbarlar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6176XMaccod", GXutil.ltrim( localUtil.ntoc( Z6176XMaccod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6217XBarEstReo", GXutil.ltrim( localUtil.ntoc( Z6217XBarEstReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6611XUniMed", GXutil.rtrim( Z6611XUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6820XBarCliCod", GXutil.ltrim( localUtil.ntoc( Z6820XBarCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7139XBarOri", GXutil.rtrim( Z7139XBarOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7534XBarFecCr", localUtil.format(Z7534XBarFecCr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8010XBarTipCol", GXutil.ltrim( localUtil.ntoc( Z8010XBarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8354XVxError", GXutil.rtrim( Z8354XVxError));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10268VxBarPieco", GXutil.rtrim( Z10268VxBarPieco));
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
      setEventMetadata("VALID_VXINVERID","{handler:'valid_Vxinverid',iparms:[{av:'A7532VxInVerId',fld:'VXINVERID',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXINVERID",",oparms:[{av:'A6274VxBarcod',fld:'VXBARCOD',pic:'ZZZZZZZ9'},{av:'A6275VxBarReo',fld:'VXBARREO',pic:'9'},{av:'A6276VxBarPar',fld:'VXBARPAR',pic:''},{av:'A7533VxInVeTip',fld:'VXINVETIP',pic:''},{av:'A6083AcaCliCod',fld:'ACACLICOD',pic:'ZZZZZ9'},{av:'A6084AcaArtCod',fld:'ACAARTCOD',pic:''},{av:'A6085XBarColCod',fld:'XBARCOLCOD',pic:'ZZZZZ9'},{av:'A6086XBarColDsc',fld:'XBARCOLDSC',pic:''},{av:'A6088XBarCan',fld:'XBARCAN',pic:'ZZZZZ9.99'},{av:'A6089XBarCanSec',fld:'XBARCANSEC',pic:'ZZ9'},{av:'A6090XBarSitReg',fld:'XBARSITREG',pic:'9'},{av:'A6091XBarOFabTI',fld:'XBAROFABTI',pic:''},{av:'A6092XAcaCod',fld:'XACACOD',pic:''},{av:'A6093XBarFecSal',fld:'XBARFECSAL',pic:''},{av:'A6094XBarOPro',fld:'XBAROPRO',pic:''},{av:'A6095XBarMaq',fld:'XBARMAQ',pic:''},{av:'A6098XArtcrumin',fld:'XARTCRUMIN',pic:'ZZZ9'},{av:'A6099XArtcrumax',fld:'XARTCRUMAX',pic:'ZZZ9'},{av:'A6100XArtgracru',fld:'XARTGRACRU',pic:'ZZZ9'},{av:'A6101XArtgraaca',fld:'XARTGRAACA',pic:'ZZZ9'},{av:'A6102XArtacamin',fld:'XARTACAMIN',pic:'ZZ9'},{av:'A6103XArtacamax',fld:'XARTACAMAX',pic:'ZZ9'},{av:'A6104XArtpml',fld:'XARTPML',pic:'ZZZ9'},{av:'A6105Xbarlar',fld:'XBARLAR',pic:''},{av:'A6176XMaccod',fld:'XMACCOD',pic:'ZZZZZZZ9'},{av:'A6217XBarEstReo',fld:'XBARESTREO',pic:'9'},{av:'A6611XUniMed',fld:'XUNIMED',pic:''},{av:'A6820XBarCliCod',fld:'XBARCLICOD',pic:'ZZZZZ9'},{av:'A7139XBarOri',fld:'XBARORI',pic:''},{av:'A7534XBarFecCr',fld:'XBARFECCR',pic:''},{av:'A8010XBarTipCol',fld:'XBARTIPCOL',pic:'Z9'},{av:'A8354XVxError',fld:'XVXERROR',pic:''},{av:'A10268VxBarPieco',fld:'VXBARPIECO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7532VxInVerId'},{av:'Z6274VxBarcod'},{av:'Z6275VxBarReo'},{av:'Z6276VxBarPar'},{av:'Z7533VxInVeTip'},{av:'Z6083AcaCliCod'},{av:'Z6084AcaArtCod'},{av:'Z6085XBarColCod'},{av:'Z6086XBarColDsc'},{av:'Z6088XBarCan'},{av:'Z6089XBarCanSec'},{av:'Z6090XBarSitReg'},{av:'Z6091XBarOFabTI'},{av:'Z6092XAcaCod'},{av:'Z6093XBarFecSal'},{av:'Z6094XBarOPro'},{av:'Z6095XBarMaq'},{av:'Z6098XArtcrumin'},{av:'Z6099XArtcrumax'},{av:'Z6100XArtgracru'},{av:'Z6101XArtgraaca'},{av:'Z6102XArtacamin'},{av:'Z6103XArtacamax'},{av:'Z6104XArtpml'},{av:'Z6105Xbarlar'},{av:'Z6176XMaccod'},{av:'Z6217XBarEstReo'},{av:'Z6611XUniMed'},{av:'Z6820XBarCliCod'},{av:'Z7139XBarOri'},{av:'Z7534XBarFecCr'},{av:'Z8010XBarTipCol'},{av:'Z8354XVxError'},{av:'Z10268VxBarPieco'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z6276VxBarPar = "" ;
      Z7533VxInVeTip = "" ;
      Z6084AcaArtCod = "" ;
      Z6086XBarColDsc = "" ;
      Z6088XBarCan = DecimalUtil.ZERO ;
      Z6091XBarOFabTI = "" ;
      Z6092XAcaCod = "" ;
      Z6093XBarFecSal = GXutil.nullDate() ;
      Z6094XBarOPro = "" ;
      Z6095XBarMaq = "" ;
      Z6105Xbarlar = "" ;
      Z6611XUniMed = "" ;
      Z7139XBarOri = "" ;
      Z7534XBarFecCr = GXutil.nullDate() ;
      Z8354XVxError = "" ;
      Z10268VxBarPieco = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A6276VxBarPar = "" ;
      lblTextblock5_Jsonclick = "" ;
      A7533VxInVeTip = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6084AcaArtCod = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6086XBarColDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A6088XBarCan = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A6091XBarOFabTI = "" ;
      lblTextblock14_Jsonclick = "" ;
      A6092XAcaCod = "" ;
      lblTextblock15_Jsonclick = "" ;
      A6093XBarFecSal = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A6094XBarOPro = "" ;
      lblTextblock17_Jsonclick = "" ;
      A6095XBarMaq = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A6105Xbarlar = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A6611XUniMed = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A7139XBarOri = "" ;
      lblTextblock31_Jsonclick = "" ;
      A7534XBarFecCr = GXutil.nullDate() ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A8354XVxError = "" ;
      lblTextblock34_Jsonclick = "" ;
      A10268VxBarPieco = "" ;
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
      T017N4_A7532VxInVerId = new long[1] ;
      T017N4_A6274VxBarcod = new int[1] ;
      T017N4_n6274VxBarcod = new boolean[] {false} ;
      T017N4_A6275VxBarReo = new byte[1] ;
      T017N4_n6275VxBarReo = new boolean[] {false} ;
      T017N4_A6276VxBarPar = new String[] {""} ;
      T017N4_n6276VxBarPar = new boolean[] {false} ;
      T017N4_A7533VxInVeTip = new String[] {""} ;
      T017N4_n7533VxInVeTip = new boolean[] {false} ;
      T017N4_A6083AcaCliCod = new int[1] ;
      T017N4_n6083AcaCliCod = new boolean[] {false} ;
      T017N4_A6084AcaArtCod = new String[] {""} ;
      T017N4_n6084AcaArtCod = new boolean[] {false} ;
      T017N4_A6085XBarColCod = new int[1] ;
      T017N4_n6085XBarColCod = new boolean[] {false} ;
      T017N4_A6086XBarColDsc = new String[] {""} ;
      T017N4_n6086XBarColDsc = new boolean[] {false} ;
      T017N4_A6088XBarCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017N4_n6088XBarCan = new boolean[] {false} ;
      T017N4_A6089XBarCanSec = new short[1] ;
      T017N4_n6089XBarCanSec = new boolean[] {false} ;
      T017N4_A6090XBarSitReg = new byte[1] ;
      T017N4_n6090XBarSitReg = new boolean[] {false} ;
      T017N4_A6091XBarOFabTI = new String[] {""} ;
      T017N4_n6091XBarOFabTI = new boolean[] {false} ;
      T017N4_A6092XAcaCod = new String[] {""} ;
      T017N4_n6092XAcaCod = new boolean[] {false} ;
      T017N4_A6093XBarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T017N4_n6093XBarFecSal = new boolean[] {false} ;
      T017N4_A6094XBarOPro = new String[] {""} ;
      T017N4_n6094XBarOPro = new boolean[] {false} ;
      T017N4_A6095XBarMaq = new String[] {""} ;
      T017N4_n6095XBarMaq = new boolean[] {false} ;
      T017N4_A6098XArtcrumin = new short[1] ;
      T017N4_n6098XArtcrumin = new boolean[] {false} ;
      T017N4_A6099XArtcrumax = new short[1] ;
      T017N4_n6099XArtcrumax = new boolean[] {false} ;
      T017N4_A6100XArtgracru = new short[1] ;
      T017N4_n6100XArtgracru = new boolean[] {false} ;
      T017N4_A6101XArtgraaca = new short[1] ;
      T017N4_n6101XArtgraaca = new boolean[] {false} ;
      T017N4_A6102XArtacamin = new short[1] ;
      T017N4_n6102XArtacamin = new boolean[] {false} ;
      T017N4_A6103XArtacamax = new short[1] ;
      T017N4_n6103XArtacamax = new boolean[] {false} ;
      T017N4_A6104XArtpml = new short[1] ;
      T017N4_n6104XArtpml = new boolean[] {false} ;
      T017N4_A6105Xbarlar = new String[] {""} ;
      T017N4_n6105Xbarlar = new boolean[] {false} ;
      T017N4_A6176XMaccod = new int[1] ;
      T017N4_n6176XMaccod = new boolean[] {false} ;
      T017N4_A6217XBarEstReo = new byte[1] ;
      T017N4_n6217XBarEstReo = new boolean[] {false} ;
      T017N4_A6611XUniMed = new String[] {""} ;
      T017N4_n6611XUniMed = new boolean[] {false} ;
      T017N4_A6820XBarCliCod = new int[1] ;
      T017N4_n6820XBarCliCod = new boolean[] {false} ;
      T017N4_A7139XBarOri = new String[] {""} ;
      T017N4_n7139XBarOri = new boolean[] {false} ;
      T017N4_A7534XBarFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T017N4_n7534XBarFecCr = new boolean[] {false} ;
      T017N4_A8010XBarTipCol = new byte[1] ;
      T017N4_n8010XBarTipCol = new boolean[] {false} ;
      T017N4_A8354XVxError = new String[] {""} ;
      T017N4_n8354XVxError = new boolean[] {false} ;
      T017N4_A10268VxBarPieco = new String[] {""} ;
      T017N4_n10268VxBarPieco = new boolean[] {false} ;
      T017N5_A7532VxInVerId = new long[1] ;
      T017N3_A7532VxInVerId = new long[1] ;
      T017N3_A6274VxBarcod = new int[1] ;
      T017N3_n6274VxBarcod = new boolean[] {false} ;
      T017N3_A6275VxBarReo = new byte[1] ;
      T017N3_n6275VxBarReo = new boolean[] {false} ;
      T017N3_A6276VxBarPar = new String[] {""} ;
      T017N3_n6276VxBarPar = new boolean[] {false} ;
      T017N3_A7533VxInVeTip = new String[] {""} ;
      T017N3_n7533VxInVeTip = new boolean[] {false} ;
      T017N3_A6083AcaCliCod = new int[1] ;
      T017N3_n6083AcaCliCod = new boolean[] {false} ;
      T017N3_A6084AcaArtCod = new String[] {""} ;
      T017N3_n6084AcaArtCod = new boolean[] {false} ;
      T017N3_A6085XBarColCod = new int[1] ;
      T017N3_n6085XBarColCod = new boolean[] {false} ;
      T017N3_A6086XBarColDsc = new String[] {""} ;
      T017N3_n6086XBarColDsc = new boolean[] {false} ;
      T017N3_A6088XBarCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017N3_n6088XBarCan = new boolean[] {false} ;
      T017N3_A6089XBarCanSec = new short[1] ;
      T017N3_n6089XBarCanSec = new boolean[] {false} ;
      T017N3_A6090XBarSitReg = new byte[1] ;
      T017N3_n6090XBarSitReg = new boolean[] {false} ;
      T017N3_A6091XBarOFabTI = new String[] {""} ;
      T017N3_n6091XBarOFabTI = new boolean[] {false} ;
      T017N3_A6092XAcaCod = new String[] {""} ;
      T017N3_n6092XAcaCod = new boolean[] {false} ;
      T017N3_A6093XBarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T017N3_n6093XBarFecSal = new boolean[] {false} ;
      T017N3_A6094XBarOPro = new String[] {""} ;
      T017N3_n6094XBarOPro = new boolean[] {false} ;
      T017N3_A6095XBarMaq = new String[] {""} ;
      T017N3_n6095XBarMaq = new boolean[] {false} ;
      T017N3_A6098XArtcrumin = new short[1] ;
      T017N3_n6098XArtcrumin = new boolean[] {false} ;
      T017N3_A6099XArtcrumax = new short[1] ;
      T017N3_n6099XArtcrumax = new boolean[] {false} ;
      T017N3_A6100XArtgracru = new short[1] ;
      T017N3_n6100XArtgracru = new boolean[] {false} ;
      T017N3_A6101XArtgraaca = new short[1] ;
      T017N3_n6101XArtgraaca = new boolean[] {false} ;
      T017N3_A6102XArtacamin = new short[1] ;
      T017N3_n6102XArtacamin = new boolean[] {false} ;
      T017N3_A6103XArtacamax = new short[1] ;
      T017N3_n6103XArtacamax = new boolean[] {false} ;
      T017N3_A6104XArtpml = new short[1] ;
      T017N3_n6104XArtpml = new boolean[] {false} ;
      T017N3_A6105Xbarlar = new String[] {""} ;
      T017N3_n6105Xbarlar = new boolean[] {false} ;
      T017N3_A6176XMaccod = new int[1] ;
      T017N3_n6176XMaccod = new boolean[] {false} ;
      T017N3_A6217XBarEstReo = new byte[1] ;
      T017N3_n6217XBarEstReo = new boolean[] {false} ;
      T017N3_A6611XUniMed = new String[] {""} ;
      T017N3_n6611XUniMed = new boolean[] {false} ;
      T017N3_A6820XBarCliCod = new int[1] ;
      T017N3_n6820XBarCliCod = new boolean[] {false} ;
      T017N3_A7139XBarOri = new String[] {""} ;
      T017N3_n7139XBarOri = new boolean[] {false} ;
      T017N3_A7534XBarFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T017N3_n7534XBarFecCr = new boolean[] {false} ;
      T017N3_A8010XBarTipCol = new byte[1] ;
      T017N3_n8010XBarTipCol = new boolean[] {false} ;
      T017N3_A8354XVxError = new String[] {""} ;
      T017N3_n8354XVxError = new boolean[] {false} ;
      T017N3_A10268VxBarPieco = new String[] {""} ;
      T017N3_n10268VxBarPieco = new boolean[] {false} ;
      sMode1361 = "" ;
      T017N6_A7532VxInVerId = new long[1] ;
      T017N7_A7532VxInVerId = new long[1] ;
      T017N2_A7532VxInVerId = new long[1] ;
      T017N2_A6274VxBarcod = new int[1] ;
      T017N2_n6274VxBarcod = new boolean[] {false} ;
      T017N2_A6275VxBarReo = new byte[1] ;
      T017N2_n6275VxBarReo = new boolean[] {false} ;
      T017N2_A6276VxBarPar = new String[] {""} ;
      T017N2_n6276VxBarPar = new boolean[] {false} ;
      T017N2_A7533VxInVeTip = new String[] {""} ;
      T017N2_n7533VxInVeTip = new boolean[] {false} ;
      T017N2_A6083AcaCliCod = new int[1] ;
      T017N2_n6083AcaCliCod = new boolean[] {false} ;
      T017N2_A6084AcaArtCod = new String[] {""} ;
      T017N2_n6084AcaArtCod = new boolean[] {false} ;
      T017N2_A6085XBarColCod = new int[1] ;
      T017N2_n6085XBarColCod = new boolean[] {false} ;
      T017N2_A6086XBarColDsc = new String[] {""} ;
      T017N2_n6086XBarColDsc = new boolean[] {false} ;
      T017N2_A6088XBarCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017N2_n6088XBarCan = new boolean[] {false} ;
      T017N2_A6089XBarCanSec = new short[1] ;
      T017N2_n6089XBarCanSec = new boolean[] {false} ;
      T017N2_A6090XBarSitReg = new byte[1] ;
      T017N2_n6090XBarSitReg = new boolean[] {false} ;
      T017N2_A6091XBarOFabTI = new String[] {""} ;
      T017N2_n6091XBarOFabTI = new boolean[] {false} ;
      T017N2_A6092XAcaCod = new String[] {""} ;
      T017N2_n6092XAcaCod = new boolean[] {false} ;
      T017N2_A6093XBarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T017N2_n6093XBarFecSal = new boolean[] {false} ;
      T017N2_A6094XBarOPro = new String[] {""} ;
      T017N2_n6094XBarOPro = new boolean[] {false} ;
      T017N2_A6095XBarMaq = new String[] {""} ;
      T017N2_n6095XBarMaq = new boolean[] {false} ;
      T017N2_A6098XArtcrumin = new short[1] ;
      T017N2_n6098XArtcrumin = new boolean[] {false} ;
      T017N2_A6099XArtcrumax = new short[1] ;
      T017N2_n6099XArtcrumax = new boolean[] {false} ;
      T017N2_A6100XArtgracru = new short[1] ;
      T017N2_n6100XArtgracru = new boolean[] {false} ;
      T017N2_A6101XArtgraaca = new short[1] ;
      T017N2_n6101XArtgraaca = new boolean[] {false} ;
      T017N2_A6102XArtacamin = new short[1] ;
      T017N2_n6102XArtacamin = new boolean[] {false} ;
      T017N2_A6103XArtacamax = new short[1] ;
      T017N2_n6103XArtacamax = new boolean[] {false} ;
      T017N2_A6104XArtpml = new short[1] ;
      T017N2_n6104XArtpml = new boolean[] {false} ;
      T017N2_A6105Xbarlar = new String[] {""} ;
      T017N2_n6105Xbarlar = new boolean[] {false} ;
      T017N2_A6176XMaccod = new int[1] ;
      T017N2_n6176XMaccod = new boolean[] {false} ;
      T017N2_A6217XBarEstReo = new byte[1] ;
      T017N2_n6217XBarEstReo = new boolean[] {false} ;
      T017N2_A6611XUniMed = new String[] {""} ;
      T017N2_n6611XUniMed = new boolean[] {false} ;
      T017N2_A6820XBarCliCod = new int[1] ;
      T017N2_n6820XBarCliCod = new boolean[] {false} ;
      T017N2_A7139XBarOri = new String[] {""} ;
      T017N2_n7139XBarOri = new boolean[] {false} ;
      T017N2_A7534XBarFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T017N2_n7534XBarFecCr = new boolean[] {false} ;
      T017N2_A8010XBarTipCol = new byte[1] ;
      T017N2_n8010XBarTipCol = new boolean[] {false} ;
      T017N2_A8354XVxError = new String[] {""} ;
      T017N2_n8354XVxError = new boolean[] {false} ;
      T017N2_A10268VxBarPieco = new String[] {""} ;
      T017N2_n10268VxBarPieco = new boolean[] {false} ;
      T017N11_A7532VxInVerId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ6276VxBarPar = "" ;
      ZZ7533VxInVeTip = "" ;
      ZZ6084AcaArtCod = "" ;
      ZZ6086XBarColDsc = "" ;
      ZZ6088XBarCan = DecimalUtil.ZERO ;
      ZZ6091XBarOFabTI = "" ;
      ZZ6092XAcaCod = "" ;
      ZZ6093XBarFecSal = GXutil.nullDate() ;
      ZZ6094XBarOPro = "" ;
      ZZ6095XBarMaq = "" ;
      ZZ6105Xbarlar = "" ;
      ZZ6611XUniMed = "" ;
      ZZ7139XBarOri = "" ;
      ZZ7534XBarFecCr = GXutil.nullDate() ;
      ZZ8354XVxError = "" ;
      ZZ10268VxBarPieco = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxincver__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxincver__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxincver__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxincver__default(),
         new Object[] {
             new Object[] {
            T017N2_A7532VxInVerId, T017N2_A6274VxBarcod, T017N2_n6274VxBarcod, T017N2_A6275VxBarReo, T017N2_n6275VxBarReo, T017N2_A6276VxBarPar, T017N2_n6276VxBarPar, T017N2_A7533VxInVeTip, T017N2_n7533VxInVeTip, T017N2_A6083AcaCliCod,
            T017N2_n6083AcaCliCod, T017N2_A6084AcaArtCod, T017N2_n6084AcaArtCod, T017N2_A6085XBarColCod, T017N2_n6085XBarColCod, T017N2_A6086XBarColDsc, T017N2_n6086XBarColDsc, T017N2_A6088XBarCan, T017N2_n6088XBarCan, T017N2_A6089XBarCanSec,
            T017N2_n6089XBarCanSec, T017N2_A6090XBarSitReg, T017N2_n6090XBarSitReg, T017N2_A6091XBarOFabTI, T017N2_n6091XBarOFabTI, T017N2_A6092XAcaCod, T017N2_n6092XAcaCod, T017N2_A6093XBarFecSal, T017N2_n6093XBarFecSal, T017N2_A6094XBarOPro,
            T017N2_n6094XBarOPro, T017N2_A6095XBarMaq, T017N2_n6095XBarMaq, T017N2_A6098XArtcrumin, T017N2_n6098XArtcrumin, T017N2_A6099XArtcrumax, T017N2_n6099XArtcrumax, T017N2_A6100XArtgracru, T017N2_n6100XArtgracru, T017N2_A6101XArtgraaca,
            T017N2_n6101XArtgraaca, T017N2_A6102XArtacamin, T017N2_n6102XArtacamin, T017N2_A6103XArtacamax, T017N2_n6103XArtacamax, T017N2_A6104XArtpml, T017N2_n6104XArtpml, T017N2_A6105Xbarlar, T017N2_n6105Xbarlar, T017N2_A6176XMaccod,
            T017N2_n6176XMaccod, T017N2_A6217XBarEstReo, T017N2_n6217XBarEstReo, T017N2_A6611XUniMed, T017N2_n6611XUniMed, T017N2_A6820XBarCliCod, T017N2_n6820XBarCliCod, T017N2_A7139XBarOri, T017N2_n7139XBarOri, T017N2_A7534XBarFecCr,
            T017N2_n7534XBarFecCr, T017N2_A8010XBarTipCol, T017N2_n8010XBarTipCol, T017N2_A8354XVxError, T017N2_n8354XVxError, T017N2_A10268VxBarPieco, T017N2_n10268VxBarPieco
            }
            , new Object[] {
            T017N3_A7532VxInVerId, T017N3_A6274VxBarcod, T017N3_n6274VxBarcod, T017N3_A6275VxBarReo, T017N3_n6275VxBarReo, T017N3_A6276VxBarPar, T017N3_n6276VxBarPar, T017N3_A7533VxInVeTip, T017N3_n7533VxInVeTip, T017N3_A6083AcaCliCod,
            T017N3_n6083AcaCliCod, T017N3_A6084AcaArtCod, T017N3_n6084AcaArtCod, T017N3_A6085XBarColCod, T017N3_n6085XBarColCod, T017N3_A6086XBarColDsc, T017N3_n6086XBarColDsc, T017N3_A6088XBarCan, T017N3_n6088XBarCan, T017N3_A6089XBarCanSec,
            T017N3_n6089XBarCanSec, T017N3_A6090XBarSitReg, T017N3_n6090XBarSitReg, T017N3_A6091XBarOFabTI, T017N3_n6091XBarOFabTI, T017N3_A6092XAcaCod, T017N3_n6092XAcaCod, T017N3_A6093XBarFecSal, T017N3_n6093XBarFecSal, T017N3_A6094XBarOPro,
            T017N3_n6094XBarOPro, T017N3_A6095XBarMaq, T017N3_n6095XBarMaq, T017N3_A6098XArtcrumin, T017N3_n6098XArtcrumin, T017N3_A6099XArtcrumax, T017N3_n6099XArtcrumax, T017N3_A6100XArtgracru, T017N3_n6100XArtgracru, T017N3_A6101XArtgraaca,
            T017N3_n6101XArtgraaca, T017N3_A6102XArtacamin, T017N3_n6102XArtacamin, T017N3_A6103XArtacamax, T017N3_n6103XArtacamax, T017N3_A6104XArtpml, T017N3_n6104XArtpml, T017N3_A6105Xbarlar, T017N3_n6105Xbarlar, T017N3_A6176XMaccod,
            T017N3_n6176XMaccod, T017N3_A6217XBarEstReo, T017N3_n6217XBarEstReo, T017N3_A6611XUniMed, T017N3_n6611XUniMed, T017N3_A6820XBarCliCod, T017N3_n6820XBarCliCod, T017N3_A7139XBarOri, T017N3_n7139XBarOri, T017N3_A7534XBarFecCr,
            T017N3_n7534XBarFecCr, T017N3_A8010XBarTipCol, T017N3_n8010XBarTipCol, T017N3_A8354XVxError, T017N3_n8354XVxError, T017N3_A10268VxBarPieco, T017N3_n10268VxBarPieco
            }
            , new Object[] {
            T017N4_A7532VxInVerId, T017N4_A6274VxBarcod, T017N4_n6274VxBarcod, T017N4_A6275VxBarReo, T017N4_n6275VxBarReo, T017N4_A6276VxBarPar, T017N4_n6276VxBarPar, T017N4_A7533VxInVeTip, T017N4_n7533VxInVeTip, T017N4_A6083AcaCliCod,
            T017N4_n6083AcaCliCod, T017N4_A6084AcaArtCod, T017N4_n6084AcaArtCod, T017N4_A6085XBarColCod, T017N4_n6085XBarColCod, T017N4_A6086XBarColDsc, T017N4_n6086XBarColDsc, T017N4_A6088XBarCan, T017N4_n6088XBarCan, T017N4_A6089XBarCanSec,
            T017N4_n6089XBarCanSec, T017N4_A6090XBarSitReg, T017N4_n6090XBarSitReg, T017N4_A6091XBarOFabTI, T017N4_n6091XBarOFabTI, T017N4_A6092XAcaCod, T017N4_n6092XAcaCod, T017N4_A6093XBarFecSal, T017N4_n6093XBarFecSal, T017N4_A6094XBarOPro,
            T017N4_n6094XBarOPro, T017N4_A6095XBarMaq, T017N4_n6095XBarMaq, T017N4_A6098XArtcrumin, T017N4_n6098XArtcrumin, T017N4_A6099XArtcrumax, T017N4_n6099XArtcrumax, T017N4_A6100XArtgracru, T017N4_n6100XArtgracru, T017N4_A6101XArtgraaca,
            T017N4_n6101XArtgraaca, T017N4_A6102XArtacamin, T017N4_n6102XArtacamin, T017N4_A6103XArtacamax, T017N4_n6103XArtacamax, T017N4_A6104XArtpml, T017N4_n6104XArtpml, T017N4_A6105Xbarlar, T017N4_n6105Xbarlar, T017N4_A6176XMaccod,
            T017N4_n6176XMaccod, T017N4_A6217XBarEstReo, T017N4_n6217XBarEstReo, T017N4_A6611XUniMed, T017N4_n6611XUniMed, T017N4_A6820XBarCliCod, T017N4_n6820XBarCliCod, T017N4_A7139XBarOri, T017N4_n7139XBarOri, T017N4_A7534XBarFecCr,
            T017N4_n7534XBarFecCr, T017N4_A8010XBarTipCol, T017N4_n8010XBarTipCol, T017N4_A8354XVxError, T017N4_n8354XVxError, T017N4_A10268VxBarPieco, T017N4_n10268VxBarPieco
            }
            , new Object[] {
            T017N5_A7532VxInVerId
            }
            , new Object[] {
            T017N6_A7532VxInVerId
            }
            , new Object[] {
            T017N7_A7532VxInVerId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017N11_A7532VxInVerId
            }
         }
      );
   }

   private byte Z6275VxBarReo ;
   private byte Z6090XBarSitReg ;
   private byte Z6217XBarEstReo ;
   private byte Z8010XBarTipCol ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6275VxBarReo ;
   private byte A6090XBarSitReg ;
   private byte A6217XBarEstReo ;
   private byte A8010XBarTipCol ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ6275VxBarReo ;
   private byte ZZ6090XBarSitReg ;
   private byte ZZ6217XBarEstReo ;
   private byte ZZ8010XBarTipCol ;
   private short Z6089XBarCanSec ;
   private short Z6098XArtcrumin ;
   private short Z6099XArtcrumax ;
   private short Z6100XArtgracru ;
   private short Z6101XArtgraaca ;
   private short Z6102XArtacamin ;
   private short Z6103XArtacamax ;
   private short Z6104XArtpml ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6089XBarCanSec ;
   private short A6098XArtcrumin ;
   private short A6099XArtcrumax ;
   private short A6100XArtgracru ;
   private short A6101XArtgraaca ;
   private short A6102XArtacamin ;
   private short A6103XArtacamax ;
   private short A6104XArtpml ;
   private short RcdFound1361 ;
   private short nIsDirty_1361 ;
   private short ZZ6089XBarCanSec ;
   private short ZZ6098XArtcrumin ;
   private short ZZ6099XArtcrumax ;
   private short ZZ6100XArtgracru ;
   private short ZZ6101XArtgraaca ;
   private short ZZ6102XArtacamin ;
   private short ZZ6103XArtacamax ;
   private short ZZ6104XArtpml ;
   private int Z6274VxBarcod ;
   private int Z6083AcaCliCod ;
   private int Z6085XBarColCod ;
   private int Z6176XMaccod ;
   private int Z6820XBarCliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxInVerId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A6274VxBarcod ;
   private int edtVxBarcod_Enabled ;
   private int edtVxBarReo_Enabled ;
   private int edtVxBarPar_Enabled ;
   private int edtVxInVeTip_Enabled ;
   private int A6083AcaCliCod ;
   private int edtAcaCliCod_Enabled ;
   private int edtAcaArtCod_Enabled ;
   private int A6085XBarColCod ;
   private int edtXBarColCod_Enabled ;
   private int edtXBarColDsc_Enabled ;
   private int edtXBarCan_Enabled ;
   private int edtXBarCanSec_Enabled ;
   private int edtXBarSitReg_Enabled ;
   private int edtXBarOFabTI_Enabled ;
   private int edtXAcaCod_Enabled ;
   private int edtXBarFecSal_Enabled ;
   private int edtXBarOPro_Enabled ;
   private int edtXBarMaq_Enabled ;
   private int edtXArtcrumin_Enabled ;
   private int edtXArtcrumax_Enabled ;
   private int edtXArtgracru_Enabled ;
   private int edtXArtgraaca_Enabled ;
   private int edtXArtacamin_Enabled ;
   private int edtXArtacamax_Enabled ;
   private int edtXArtpml_Enabled ;
   private int edtXbarlar_Enabled ;
   private int A6176XMaccod ;
   private int edtXMaccod_Enabled ;
   private int edtXBarEstReo_Enabled ;
   private int edtXUniMed_Enabled ;
   private int A6820XBarCliCod ;
   private int edtXBarCliCod_Enabled ;
   private int edtXBarOri_Enabled ;
   private int edtXBarFecCr_Enabled ;
   private int edtXBarTipCol_Enabled ;
   private int edtXVxError_Enabled ;
   private int edtVxBarPieco_Enabled ;
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
   private int edtVxBarPieco_Backcolor ;
   private int edtXVxError_Backcolor ;
   private int edtXBarTipCol_Backcolor ;
   private int edtXBarFecCr_Backcolor ;
   private int edtXBarOri_Backcolor ;
   private int edtXBarCliCod_Backcolor ;
   private int edtXUniMed_Backcolor ;
   private int edtXBarEstReo_Backcolor ;
   private int edtXMaccod_Backcolor ;
   private int edtXbarlar_Backcolor ;
   private int edtXArtpml_Backcolor ;
   private int edtXArtacamax_Backcolor ;
   private int edtXArtacamin_Backcolor ;
   private int edtXArtgraaca_Backcolor ;
   private int edtXArtgracru_Backcolor ;
   private int edtXArtcrumax_Backcolor ;
   private int edtXArtcrumin_Backcolor ;
   private int edtXBarMaq_Backcolor ;
   private int edtXBarOPro_Backcolor ;
   private int edtXBarFecSal_Backcolor ;
   private int edtXAcaCod_Backcolor ;
   private int edtXBarOFabTI_Backcolor ;
   private int edtXBarSitReg_Backcolor ;
   private int edtXBarCanSec_Backcolor ;
   private int edtXBarCan_Backcolor ;
   private int edtXBarColDsc_Backcolor ;
   private int edtXBarColCod_Backcolor ;
   private int edtAcaArtCod_Backcolor ;
   private int edtAcaCliCod_Backcolor ;
   private int edtVxInVeTip_Backcolor ;
   private int edtVxBarPar_Backcolor ;
   private int edtVxBarReo_Backcolor ;
   private int edtVxBarcod_Backcolor ;
   private int edtVxInVerId_Backcolor ;
   private int ZZ6274VxBarcod ;
   private int ZZ6083AcaCliCod ;
   private int ZZ6085XBarColCod ;
   private int ZZ6176XMaccod ;
   private int ZZ6820XBarCliCod ;
   private long Z7532VxInVerId ;
   private long A7532VxInVerId ;
   private long ZZ7532VxInVerId ;
   private java.math.BigDecimal Z6088XBarCan ;
   private java.math.BigDecimal A6088XBarCan ;
   private java.math.BigDecimal ZZ6088XBarCan ;
   private String sPrefix ;
   private String Z6276VxBarPar ;
   private String Z7533VxInVeTip ;
   private String Z6084AcaArtCod ;
   private String Z6086XBarColDsc ;
   private String Z6091XBarOFabTI ;
   private String Z6092XAcaCod ;
   private String Z6094XBarOPro ;
   private String Z6095XBarMaq ;
   private String Z6105Xbarlar ;
   private String Z6611XUniMed ;
   private String Z7139XBarOri ;
   private String Z8354XVxError ;
   private String Z10268VxBarPieco ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxInVerId_Internalname ;
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
   private String edtVxInVerId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxBarcod_Internalname ;
   private String edtVxBarcod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxBarReo_Internalname ;
   private String edtVxBarReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxBarPar_Internalname ;
   private String A6276VxBarPar ;
   private String edtVxBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxInVeTip_Internalname ;
   private String A7533VxInVeTip ;
   private String edtVxInVeTip_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAcaCliCod_Internalname ;
   private String edtAcaCliCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAcaArtCod_Internalname ;
   private String A6084AcaArtCod ;
   private String edtAcaArtCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXBarColCod_Internalname ;
   private String edtXBarColCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXBarColDsc_Internalname ;
   private String A6086XBarColDsc ;
   private String edtXBarColDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXBarCan_Internalname ;
   private String edtXBarCan_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXBarCanSec_Internalname ;
   private String edtXBarCanSec_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXBarSitReg_Internalname ;
   private String edtXBarSitReg_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXBarOFabTI_Internalname ;
   private String A6091XBarOFabTI ;
   private String edtXBarOFabTI_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXAcaCod_Internalname ;
   private String A6092XAcaCod ;
   private String edtXAcaCod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXBarFecSal_Internalname ;
   private String edtXBarFecSal_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXBarOPro_Internalname ;
   private String A6094XBarOPro ;
   private String edtXBarOPro_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtXBarMaq_Internalname ;
   private String A6095XBarMaq ;
   private String edtXBarMaq_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtXArtcrumin_Internalname ;
   private String edtXArtcrumin_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtXArtcrumax_Internalname ;
   private String edtXArtcrumax_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtXArtgracru_Internalname ;
   private String edtXArtgracru_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtXArtgraaca_Internalname ;
   private String edtXArtgraaca_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtXArtacamin_Internalname ;
   private String edtXArtacamin_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtXArtacamax_Internalname ;
   private String edtXArtacamax_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtXArtpml_Internalname ;
   private String edtXArtpml_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtXbarlar_Internalname ;
   private String A6105Xbarlar ;
   private String edtXbarlar_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtXMaccod_Internalname ;
   private String edtXMaccod_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtXBarEstReo_Internalname ;
   private String edtXBarEstReo_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtXUniMed_Internalname ;
   private String A6611XUniMed ;
   private String edtXUniMed_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtXBarCliCod_Internalname ;
   private String edtXBarCliCod_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtXBarOri_Internalname ;
   private String A7139XBarOri ;
   private String edtXBarOri_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtXBarFecCr_Internalname ;
   private String edtXBarFecCr_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtXBarTipCol_Internalname ;
   private String edtXBarTipCol_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtXVxError_Internalname ;
   private String A8354XVxError ;
   private String edtXVxError_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtVxBarPieco_Internalname ;
   private String A10268VxBarPieco ;
   private String edtVxBarPieco_Jsonclick ;
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
   private String sMode1361 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ6276VxBarPar ;
   private String ZZ7533VxInVeTip ;
   private String ZZ6084AcaArtCod ;
   private String ZZ6086XBarColDsc ;
   private String ZZ6091XBarOFabTI ;
   private String ZZ6092XAcaCod ;
   private String ZZ6094XBarOPro ;
   private String ZZ6095XBarMaq ;
   private String ZZ6105Xbarlar ;
   private String ZZ6611XUniMed ;
   private String ZZ7139XBarOri ;
   private String ZZ8354XVxError ;
   private String ZZ10268VxBarPieco ;
   private java.util.Date Z6093XBarFecSal ;
   private java.util.Date Z7534XBarFecCr ;
   private java.util.Date A6093XBarFecSal ;
   private java.util.Date A7534XBarFecCr ;
   private java.util.Date ZZ6093XBarFecSal ;
   private java.util.Date ZZ7534XBarFecCr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6274VxBarcod ;
   private boolean n6275VxBarReo ;
   private boolean n6276VxBarPar ;
   private boolean n7533VxInVeTip ;
   private boolean n6083AcaCliCod ;
   private boolean n6084AcaArtCod ;
   private boolean n6085XBarColCod ;
   private boolean n6086XBarColDsc ;
   private boolean n6088XBarCan ;
   private boolean n6089XBarCanSec ;
   private boolean n6090XBarSitReg ;
   private boolean n6091XBarOFabTI ;
   private boolean n6092XAcaCod ;
   private boolean n6093XBarFecSal ;
   private boolean n6094XBarOPro ;
   private boolean n6095XBarMaq ;
   private boolean n6098XArtcrumin ;
   private boolean n6099XArtcrumax ;
   private boolean n6100XArtgracru ;
   private boolean n6101XArtgraaca ;
   private boolean n6102XArtacamin ;
   private boolean n6103XArtacamax ;
   private boolean n6104XArtpml ;
   private boolean n6105Xbarlar ;
   private boolean n6176XMaccod ;
   private boolean n6217XBarEstReo ;
   private boolean n6611XUniMed ;
   private boolean n6820XBarCliCod ;
   private boolean n7139XBarOri ;
   private boolean n7534XBarFecCr ;
   private boolean n8010XBarTipCol ;
   private boolean n8354XVxError ;
   private boolean n10268VxBarPieco ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T017N4_A7532VxInVerId ;
   private int[] T017N4_A6274VxBarcod ;
   private boolean[] T017N4_n6274VxBarcod ;
   private byte[] T017N4_A6275VxBarReo ;
   private boolean[] T017N4_n6275VxBarReo ;
   private String[] T017N4_A6276VxBarPar ;
   private boolean[] T017N4_n6276VxBarPar ;
   private String[] T017N4_A7533VxInVeTip ;
   private boolean[] T017N4_n7533VxInVeTip ;
   private int[] T017N4_A6083AcaCliCod ;
   private boolean[] T017N4_n6083AcaCliCod ;
   private String[] T017N4_A6084AcaArtCod ;
   private boolean[] T017N4_n6084AcaArtCod ;
   private int[] T017N4_A6085XBarColCod ;
   private boolean[] T017N4_n6085XBarColCod ;
   private String[] T017N4_A6086XBarColDsc ;
   private boolean[] T017N4_n6086XBarColDsc ;
   private java.math.BigDecimal[] T017N4_A6088XBarCan ;
   private boolean[] T017N4_n6088XBarCan ;
   private short[] T017N4_A6089XBarCanSec ;
   private boolean[] T017N4_n6089XBarCanSec ;
   private byte[] T017N4_A6090XBarSitReg ;
   private boolean[] T017N4_n6090XBarSitReg ;
   private String[] T017N4_A6091XBarOFabTI ;
   private boolean[] T017N4_n6091XBarOFabTI ;
   private String[] T017N4_A6092XAcaCod ;
   private boolean[] T017N4_n6092XAcaCod ;
   private java.util.Date[] T017N4_A6093XBarFecSal ;
   private boolean[] T017N4_n6093XBarFecSal ;
   private String[] T017N4_A6094XBarOPro ;
   private boolean[] T017N4_n6094XBarOPro ;
   private String[] T017N4_A6095XBarMaq ;
   private boolean[] T017N4_n6095XBarMaq ;
   private short[] T017N4_A6098XArtcrumin ;
   private boolean[] T017N4_n6098XArtcrumin ;
   private short[] T017N4_A6099XArtcrumax ;
   private boolean[] T017N4_n6099XArtcrumax ;
   private short[] T017N4_A6100XArtgracru ;
   private boolean[] T017N4_n6100XArtgracru ;
   private short[] T017N4_A6101XArtgraaca ;
   private boolean[] T017N4_n6101XArtgraaca ;
   private short[] T017N4_A6102XArtacamin ;
   private boolean[] T017N4_n6102XArtacamin ;
   private short[] T017N4_A6103XArtacamax ;
   private boolean[] T017N4_n6103XArtacamax ;
   private short[] T017N4_A6104XArtpml ;
   private boolean[] T017N4_n6104XArtpml ;
   private String[] T017N4_A6105Xbarlar ;
   private boolean[] T017N4_n6105Xbarlar ;
   private int[] T017N4_A6176XMaccod ;
   private boolean[] T017N4_n6176XMaccod ;
   private byte[] T017N4_A6217XBarEstReo ;
   private boolean[] T017N4_n6217XBarEstReo ;
   private String[] T017N4_A6611XUniMed ;
   private boolean[] T017N4_n6611XUniMed ;
   private int[] T017N4_A6820XBarCliCod ;
   private boolean[] T017N4_n6820XBarCliCod ;
   private String[] T017N4_A7139XBarOri ;
   private boolean[] T017N4_n7139XBarOri ;
   private java.util.Date[] T017N4_A7534XBarFecCr ;
   private boolean[] T017N4_n7534XBarFecCr ;
   private byte[] T017N4_A8010XBarTipCol ;
   private boolean[] T017N4_n8010XBarTipCol ;
   private String[] T017N4_A8354XVxError ;
   private boolean[] T017N4_n8354XVxError ;
   private String[] T017N4_A10268VxBarPieco ;
   private boolean[] T017N4_n10268VxBarPieco ;
   private long[] T017N5_A7532VxInVerId ;
   private long[] T017N3_A7532VxInVerId ;
   private int[] T017N3_A6274VxBarcod ;
   private boolean[] T017N3_n6274VxBarcod ;
   private byte[] T017N3_A6275VxBarReo ;
   private boolean[] T017N3_n6275VxBarReo ;
   private String[] T017N3_A6276VxBarPar ;
   private boolean[] T017N3_n6276VxBarPar ;
   private String[] T017N3_A7533VxInVeTip ;
   private boolean[] T017N3_n7533VxInVeTip ;
   private int[] T017N3_A6083AcaCliCod ;
   private boolean[] T017N3_n6083AcaCliCod ;
   private String[] T017N3_A6084AcaArtCod ;
   private boolean[] T017N3_n6084AcaArtCod ;
   private int[] T017N3_A6085XBarColCod ;
   private boolean[] T017N3_n6085XBarColCod ;
   private String[] T017N3_A6086XBarColDsc ;
   private boolean[] T017N3_n6086XBarColDsc ;
   private java.math.BigDecimal[] T017N3_A6088XBarCan ;
   private boolean[] T017N3_n6088XBarCan ;
   private short[] T017N3_A6089XBarCanSec ;
   private boolean[] T017N3_n6089XBarCanSec ;
   private byte[] T017N3_A6090XBarSitReg ;
   private boolean[] T017N3_n6090XBarSitReg ;
   private String[] T017N3_A6091XBarOFabTI ;
   private boolean[] T017N3_n6091XBarOFabTI ;
   private String[] T017N3_A6092XAcaCod ;
   private boolean[] T017N3_n6092XAcaCod ;
   private java.util.Date[] T017N3_A6093XBarFecSal ;
   private boolean[] T017N3_n6093XBarFecSal ;
   private String[] T017N3_A6094XBarOPro ;
   private boolean[] T017N3_n6094XBarOPro ;
   private String[] T017N3_A6095XBarMaq ;
   private boolean[] T017N3_n6095XBarMaq ;
   private short[] T017N3_A6098XArtcrumin ;
   private boolean[] T017N3_n6098XArtcrumin ;
   private short[] T017N3_A6099XArtcrumax ;
   private boolean[] T017N3_n6099XArtcrumax ;
   private short[] T017N3_A6100XArtgracru ;
   private boolean[] T017N3_n6100XArtgracru ;
   private short[] T017N3_A6101XArtgraaca ;
   private boolean[] T017N3_n6101XArtgraaca ;
   private short[] T017N3_A6102XArtacamin ;
   private boolean[] T017N3_n6102XArtacamin ;
   private short[] T017N3_A6103XArtacamax ;
   private boolean[] T017N3_n6103XArtacamax ;
   private short[] T017N3_A6104XArtpml ;
   private boolean[] T017N3_n6104XArtpml ;
   private String[] T017N3_A6105Xbarlar ;
   private boolean[] T017N3_n6105Xbarlar ;
   private int[] T017N3_A6176XMaccod ;
   private boolean[] T017N3_n6176XMaccod ;
   private byte[] T017N3_A6217XBarEstReo ;
   private boolean[] T017N3_n6217XBarEstReo ;
   private String[] T017N3_A6611XUniMed ;
   private boolean[] T017N3_n6611XUniMed ;
   private int[] T017N3_A6820XBarCliCod ;
   private boolean[] T017N3_n6820XBarCliCod ;
   private String[] T017N3_A7139XBarOri ;
   private boolean[] T017N3_n7139XBarOri ;
   private java.util.Date[] T017N3_A7534XBarFecCr ;
   private boolean[] T017N3_n7534XBarFecCr ;
   private byte[] T017N3_A8010XBarTipCol ;
   private boolean[] T017N3_n8010XBarTipCol ;
   private String[] T017N3_A8354XVxError ;
   private boolean[] T017N3_n8354XVxError ;
   private String[] T017N3_A10268VxBarPieco ;
   private boolean[] T017N3_n10268VxBarPieco ;
   private long[] T017N6_A7532VxInVerId ;
   private long[] T017N7_A7532VxInVerId ;
   private long[] T017N2_A7532VxInVerId ;
   private int[] T017N2_A6274VxBarcod ;
   private boolean[] T017N2_n6274VxBarcod ;
   private byte[] T017N2_A6275VxBarReo ;
   private boolean[] T017N2_n6275VxBarReo ;
   private String[] T017N2_A6276VxBarPar ;
   private boolean[] T017N2_n6276VxBarPar ;
   private String[] T017N2_A7533VxInVeTip ;
   private boolean[] T017N2_n7533VxInVeTip ;
   private int[] T017N2_A6083AcaCliCod ;
   private boolean[] T017N2_n6083AcaCliCod ;
   private String[] T017N2_A6084AcaArtCod ;
   private boolean[] T017N2_n6084AcaArtCod ;
   private int[] T017N2_A6085XBarColCod ;
   private boolean[] T017N2_n6085XBarColCod ;
   private String[] T017N2_A6086XBarColDsc ;
   private boolean[] T017N2_n6086XBarColDsc ;
   private java.math.BigDecimal[] T017N2_A6088XBarCan ;
   private boolean[] T017N2_n6088XBarCan ;
   private short[] T017N2_A6089XBarCanSec ;
   private boolean[] T017N2_n6089XBarCanSec ;
   private byte[] T017N2_A6090XBarSitReg ;
   private boolean[] T017N2_n6090XBarSitReg ;
   private String[] T017N2_A6091XBarOFabTI ;
   private boolean[] T017N2_n6091XBarOFabTI ;
   private String[] T017N2_A6092XAcaCod ;
   private boolean[] T017N2_n6092XAcaCod ;
   private java.util.Date[] T017N2_A6093XBarFecSal ;
   private boolean[] T017N2_n6093XBarFecSal ;
   private String[] T017N2_A6094XBarOPro ;
   private boolean[] T017N2_n6094XBarOPro ;
   private String[] T017N2_A6095XBarMaq ;
   private boolean[] T017N2_n6095XBarMaq ;
   private short[] T017N2_A6098XArtcrumin ;
   private boolean[] T017N2_n6098XArtcrumin ;
   private short[] T017N2_A6099XArtcrumax ;
   private boolean[] T017N2_n6099XArtcrumax ;
   private short[] T017N2_A6100XArtgracru ;
   private boolean[] T017N2_n6100XArtgracru ;
   private short[] T017N2_A6101XArtgraaca ;
   private boolean[] T017N2_n6101XArtgraaca ;
   private short[] T017N2_A6102XArtacamin ;
   private boolean[] T017N2_n6102XArtacamin ;
   private short[] T017N2_A6103XArtacamax ;
   private boolean[] T017N2_n6103XArtacamax ;
   private short[] T017N2_A6104XArtpml ;
   private boolean[] T017N2_n6104XArtpml ;
   private String[] T017N2_A6105Xbarlar ;
   private boolean[] T017N2_n6105Xbarlar ;
   private int[] T017N2_A6176XMaccod ;
   private boolean[] T017N2_n6176XMaccod ;
   private byte[] T017N2_A6217XBarEstReo ;
   private boolean[] T017N2_n6217XBarEstReo ;
   private String[] T017N2_A6611XUniMed ;
   private boolean[] T017N2_n6611XUniMed ;
   private int[] T017N2_A6820XBarCliCod ;
   private boolean[] T017N2_n6820XBarCliCod ;
   private String[] T017N2_A7139XBarOri ;
   private boolean[] T017N2_n7139XBarOri ;
   private java.util.Date[] T017N2_A7534XBarFecCr ;
   private boolean[] T017N2_n7534XBarFecCr ;
   private byte[] T017N2_A8010XBarTipCol ;
   private boolean[] T017N2_n8010XBarTipCol ;
   private String[] T017N2_A8354XVxError ;
   private boolean[] T017N2_n8354XVxError ;
   private String[] T017N2_A10268VxBarPieco ;
   private boolean[] T017N2_n10268VxBarPieco ;
   private long[] T017N11_A7532VxInVerId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxincver__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxincver__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxincver__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxincver__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017N2", "SELECT XinVerId, XbarCod, XBarcodreo, xbarcodpar, XInVerTip, acaclicod, acaartcod, xbarcolcod, xbarcoldsc, xbarcan, xbarcansec, xbarsitreg, xbarofabti, xacacod, xbarfecsal, xbaropro, xbarmaq, xartcrumin, xartcrumax, xartgracru, xartgraaca, xartacamin, xartacamax, xartpml, xbarlar, xmaccod, xbarestreo, xunimed, xbarclicod, xbarori, xbarfeccr, XTipCol, XVxError, XBarpiecod FROM GAIA.VTXTrIncVer WHERE XinVerId = ?  FOR UPDATE OF XbarCod, XBarcodreo, xbarcodpar, XInVerTip, acaclicod, acaartcod, xbarcolcod, xbarcoldsc, xbarcan, xbarcansec, xbarsitreg, xbarofabti, xacacod, xbarfecsal, xbaropro, xbarmaq, xartcrumin, xartcrumax, xartgracru, xartgraaca, xartacamin, xartacamax, xartpml, xbarlar, xmaccod, xbarestreo, xunimed, xbarclicod, xbarori, xbarfeccr, XTipCol, XVxError, XBarpiecod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017N3", "SELECT XinVerId, XbarCod, XBarcodreo, xbarcodpar, XInVerTip, acaclicod, acaartcod, xbarcolcod, xbarcoldsc, xbarcan, xbarcansec, xbarsitreg, xbarofabti, xacacod, xbarfecsal, xbaropro, xbarmaq, xartcrumin, xartcrumax, xartgracru, xartgraaca, xartacamin, xartacamax, xartpml, xbarlar, xmaccod, xbarestreo, xunimed, xbarclicod, xbarori, xbarfeccr, XTipCol, XVxError, XBarpiecod FROM GAIA.VTXTrIncVer WHERE XinVerId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017N4", "SELECT /*+ FIRST_ROWS(100) */ TM1.XinVerId, TM1.XbarCod, TM1.XBarcodreo, TM1.xbarcodpar, TM1.XInVerTip, TM1.acaclicod, TM1.acaartcod, TM1.xbarcolcod, TM1.xbarcoldsc, TM1.xbarcan, TM1.xbarcansec, TM1.xbarsitreg, TM1.xbarofabti, TM1.xacacod, TM1.xbarfecsal, TM1.xbaropro, TM1.xbarmaq, TM1.xartcrumin, TM1.xartcrumax, TM1.xartgracru, TM1.xartgraaca, TM1.xartacamin, TM1.xartacamax, TM1.xartpml, TM1.xbarlar, TM1.xmaccod, TM1.xbarestreo, TM1.xunimed, TM1.xbarclicod, TM1.xbarori, TM1.xbarfeccr, TM1.XTipCol, TM1.XVxError, TM1.XBarpiecod FROM GAIA.VTXTrIncVer TM1 WHERE TM1.XinVerId = ? ORDER BY TM1.XinVerId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017N5", "SELECT /*+ FIRST_ROWS(1) */ XinVerId FROM GAIA.VTXTrIncVer WHERE XinVerId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017N6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XinVerId FROM GAIA.VTXTrIncVer WHERE ( XinVerId > ?) ORDER BY XinVerId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017N7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XinVerId FROM GAIA.VTXTrIncVer WHERE ( XinVerId < ?) ORDER BY XinVerId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017N8", "INSERT INTO GAIA.VTXTrIncVer(XinVerId, XbarCod, XBarcodreo, xbarcodpar, XInVerTip, acaclicod, acaartcod, xbarcolcod, xbarcoldsc, xbarcan, xbarcansec, xbarsitreg, xbarofabti, xacacod, xbarfecsal, xbaropro, xbarmaq, xartcrumin, xartcrumax, xartgracru, xartgraaca, xartacamin, xartacamax, xartpml, xbarlar, xmaccod, xbarestreo, xunimed, xbarclicod, xbarori, xbarfeccr, XTipCol, XVxError, XBarpiecod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXTRINCVER")
         ,new UpdateCursor("T017N9", "UPDATE GAIA.VTXTrIncVer SET XbarCod=?, XBarcodreo=?, xbarcodpar=?, XInVerTip=?, acaclicod=?, acaartcod=?, xbarcolcod=?, xbarcoldsc=?, xbarcan=?, xbarcansec=?, xbarsitreg=?, xbarofabti=?, xacacod=?, xbarfecsal=?, xbaropro=?, xbarmaq=?, xartcrumin=?, xartcrumax=?, xartgracru=?, xartgraaca=?, xartacamin=?, xartacamax=?, xartpml=?, xbarlar=?, xmaccod=?, xbarestreo=?, xunimed=?, xbarclicod=?, xbarori=?, xbarfeccr=?, XTipCol=?, XVxError=?, XBarpiecod=?  WHERE XinVerId = ?", GX_NOMASK, "VTXTRINCVER")
         ,new UpdateCursor("T017N10", "DELETE FROM GAIA.VTXTrIncVer  WHERE XinVerId = ?", GX_NOMASK, "VTXTRINCVER")
         ,new ForEachCursor("T017N11", "SELECT /*+ FIRST_ROWS(100) */ XinVerId FROM GAIA.VTXTrIncVer ORDER BY XinVerId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 9);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 9);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 9);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 2);
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
                  stmt.setString(16, (String)parms[30], 8);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 6);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
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
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[44]).shortValue());
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
                  stmt.setString(25, (String)parms[48], 10);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[52]).byteValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DATE );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[60]);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[62]).byteValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 30);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[66], 9);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 13);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 2);
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
                  stmt.setString(16, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
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
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
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
                  stmt.setString(24, (String)parms[47], 10);
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
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[55]).intValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[59]);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[61]).byteValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 30);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 9);
               }
               stmt.setLong(34, ((Number) parms[66]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

