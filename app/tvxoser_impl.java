package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxoser_impl extends GXDataArea
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
         A7420VxArtCod = httpContext.GetPar( "VxArtCod") ;
         n7420VxArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7420VxArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A6638VxProvCod = (int)(GXutil.lval( httpContext.GetPar( "VxProvCod"))) ;
         n6638VxProvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A6638VxProvCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OSERCO en VertexFUERA DE USO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxoser_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxoser_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxoser_impl.class ));
   }

   public tvxoser_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxOSer.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "O. Fabricación", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOFabTip_Internalname, GXutil.rtrim( A7525VxOFabTip), GXutil.rtrim( localUtil.format( A7525VxOFabTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOFabTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxOFabTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "BarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6274VxBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6274VxBarcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6274VxBarcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxBarcod_Jsonclick, 0, "", "", "", "", "", 1, edtVxBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Línea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7526VxOsCoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsCoLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7526VxOsCoLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7526VxOsCoLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoLin_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código Artículo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCod_Internalname, GXutil.rtrim( A7420VxArtCod), GXutil.rtrim( localUtil.format( A7420VxArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtDsc_Internalname, GXutil.rtrim( A7524VxArtDsc), GXutil.rtrim( localUtil.format( A7524VxArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Color Hilo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoColC_Internalname, GXutil.ltrim( localUtil.ntoc( A12397VxOsCoColC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsCoColC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12397VxOsCoColC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12397VxOsCoColC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoColC_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoColC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Lote", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoLoCo_Internalname, GXutil.rtrim( A12398VxOsCoLoCo), GXutil.rtrim( localUtil.format( A12398VxOsCoLoCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoLoCo_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoLoCo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código Proveedor", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxProvCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6638VxProvCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxProvCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6638VxProvCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6638VxProvCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxProvCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxProvCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSer.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPrvNom_Internalname, GXutil.rtrim( A6639VxPrvNom), GXutil.rtrim( localUtil.format( A6639VxPrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtVxPrvNom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSer.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSer.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxOSer.htm");
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
         Z7525VxOFabTip = httpContext.cgiGet( "Z7525VxOFabTip") ;
         Z6274VxBarcod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6274VxBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7526VxOsCoLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7526VxOsCoLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12397VxOsCoColC = (int)(localUtil.ctol( httpContext.cgiGet( "Z12397VxOsCoColC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12398VxOsCoLoCo = httpContext.cgiGet( "Z12398VxOsCoLoCo") ;
         Z7420VxArtCod = httpContext.cgiGet( "Z7420VxArtCod") ;
         Z6638VxProvCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6638VxProvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A7525VxOFabTip = httpContext.cgiGet( edtVxOFabTip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6274VxBarcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         }
         else
         {
            A6274VxBarcod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOsCoLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7526VxOsCoLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
         }
         else
         {
            A7526VxOsCoLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxOsCoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
         }
         A7420VxArtCod = httpContext.cgiGet( edtVxArtCod_Internalname) ;
         n7420VxArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A7524VxArtDsc = httpContext.cgiGet( edtVxArtDsc_Internalname) ;
         n7524VxArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoColC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoColC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOCOLC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOsCoColC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12397VxOsCoColC = 0 ;
            n12397VxOsCoColC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12397VxOsCoColC), 6, 0));
         }
         else
         {
            A12397VxOsCoColC = (int)(localUtil.ctol( httpContext.cgiGet( edtVxOsCoColC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12397VxOsCoColC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12397VxOsCoColC), 6, 0));
         }
         A12398VxOsCoLoCo = httpContext.cgiGet( edtVxOsCoLoCo_Internalname) ;
         n12398VxOsCoLoCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12398VxOsCoLoCo", A12398VxOsCoLoCo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxProvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxProvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXPROVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxProvCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6638VxProvCod = 0 ;
            n6638VxProvCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
         }
         else
         {
            A6638VxProvCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxProvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6638VxProvCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
         }
         A6639VxPrvNom = httpContext.cgiGet( edtVxPrvNom_Internalname) ;
         n6639VxPrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
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
            A7525VxOFabTip = httpContext.GetPar( "VxOFabTip") ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A6274VxBarcod = (int)(GXutil.lval( httpContext.GetPar( "VxBarcod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
            A7526VxOsCoLin = (byte)(GXutil.lval( httpContext.GetPar( "VxOsCoLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
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
            initAllZI1057( ) ;
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
      disableAttributesZI1057( ) ;
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

   public void confirm_ZI0( )
   {
      beforeValidateZI1057( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsZI1057( ) ;
         }
         else
         {
            checkExtendedTableZI1057( ) ;
            if ( AnyError == 0 )
            {
               zmZI1057( 2) ;
               zmZI1057( 3) ;
            }
            closeExtendedTableCursorsZI1057( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesZI0( ) ;
      }
   }

   public void resetCaptionZI0( )
   {
   }

   public void zmZI1057( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12397VxOsCoColC = T00ZI3_A12397VxOsCoColC[0] ;
            Z12398VxOsCoLoCo = T00ZI3_A12398VxOsCoLoCo[0] ;
            Z7420VxArtCod = T00ZI3_A7420VxArtCod[0] ;
            Z6638VxProvCod = T00ZI3_A6638VxProvCod[0] ;
         }
         else
         {
            Z12397VxOsCoColC = A12397VxOsCoColC ;
            Z12398VxOsCoLoCo = A12398VxOsCoLoCo ;
            Z7420VxArtCod = A7420VxArtCod ;
            Z6638VxProvCod = A6638VxProvCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z6274VxBarcod = A6274VxBarcod ;
         Z7526VxOsCoLin = A7526VxOsCoLin ;
         Z12397VxOsCoColC = A12397VxOsCoColC ;
         Z12398VxOsCoLoCo = A12398VxOsCoLoCo ;
         Z7420VxArtCod = A7420VxArtCod ;
         Z6638VxProvCod = A6638VxProvCod ;
         Z7524VxArtDsc = A7524VxArtDsc ;
         Z6639VxPrvNom = A6639VxPrvNom ;
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

   public void loadZI1057( )
   {
      /* Using cursor T00ZI6 */
      pr_default.execute(4, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1057 = (short)(1) ;
         A7524VxArtDsc = T00ZI6_A7524VxArtDsc[0] ;
         n7524VxArtDsc = T00ZI6_n7524VxArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         A12397VxOsCoColC = T00ZI6_A12397VxOsCoColC[0] ;
         n12397VxOsCoColC = T00ZI6_n12397VxOsCoColC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12397VxOsCoColC), 6, 0));
         A12398VxOsCoLoCo = T00ZI6_A12398VxOsCoLoCo[0] ;
         n12398VxOsCoLoCo = T00ZI6_n12398VxOsCoLoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12398VxOsCoLoCo", A12398VxOsCoLoCo);
         A6639VxPrvNom = T00ZI6_A6639VxPrvNom[0] ;
         n6639VxPrvNom = T00ZI6_n6639VxPrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
         A7420VxArtCod = T00ZI6_A7420VxArtCod[0] ;
         n7420VxArtCod = T00ZI6_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A6638VxProvCod = T00ZI6_A6638VxProvCod[0] ;
         n6638VxProvCod = T00ZI6_n6638VxProvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
         zmZI1057( -1) ;
      }
      pr_default.close(4);
      onLoadActionsZI1057( ) ;
   }

   public void onLoadActionsZI1057( )
   {
   }

   public void checkExtendedTableZI1057( )
   {
      nIsDirty_1057 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00ZI4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7524VxArtDsc = T00ZI4_A7524VxArtDsc[0] ;
      n7524VxArtDsc = T00ZI4_n7524VxArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
      pr_default.close(2);
      /* Using cursor T00ZI5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (0==A6638VxProvCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxProv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXPROVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxProvCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6639VxPrvNom = T00ZI5_A6639VxPrvNom[0] ;
      n6639VxPrvNom = T00ZI5_n6639VxPrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursorsZI1057( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A7420VxArtCod )
   {
      /* Using cursor T00ZI7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7524VxArtDsc = T00ZI7_A7524VxArtDsc[0] ;
      n7524VxArtDsc = T00ZI7_n7524VxArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7524VxArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( int A6638VxProvCod )
   {
      /* Using cursor T00ZI8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A6638VxProvCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxProv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXPROVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxProvCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6639VxPrvNom = T00ZI8_A6639VxPrvNom[0] ;
      n6639VxPrvNom = T00ZI8_n6639VxPrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6639VxPrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKeyZI1057( )
   {
      /* Using cursor T00ZI9 */
      pr_default.execute(7, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1057 = (short)(1) ;
      }
      else
      {
         RcdFound1057 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00ZI3 */
      pr_default.execute(1, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmZI1057( 1) ;
         RcdFound1057 = (short)(1) ;
         A7525VxOFabTip = T00ZI3_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A6274VxBarcod = T00ZI3_A6274VxBarcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A7526VxOsCoLin = T00ZI3_A7526VxOsCoLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
         A12397VxOsCoColC = T00ZI3_A12397VxOsCoColC[0] ;
         n12397VxOsCoColC = T00ZI3_n12397VxOsCoColC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12397VxOsCoColC), 6, 0));
         A12398VxOsCoLoCo = T00ZI3_A12398VxOsCoLoCo[0] ;
         n12398VxOsCoLoCo = T00ZI3_n12398VxOsCoLoCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12398VxOsCoLoCo", A12398VxOsCoLoCo);
         A7420VxArtCod = T00ZI3_A7420VxArtCod[0] ;
         n7420VxArtCod = T00ZI3_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A6638VxProvCod = T00ZI3_A6638VxProvCod[0] ;
         n6638VxProvCod = T00ZI3_n6638VxProvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z6274VxBarcod = A6274VxBarcod ;
         Z7526VxOsCoLin = A7526VxOsCoLin ;
         sMode1057 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadZI1057( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1057 = (short)(0) ;
            initializeNonKeyZI1057( ) ;
         }
         Gx_mode = sMode1057 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1057 = (short)(0) ;
         initializeNonKeyZI1057( ) ;
         sMode1057 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1057 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyZI1057( ) ;
      if ( RcdFound1057 == 0 )
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
      RcdFound1057 = (short)(0) ;
      /* Using cursor T00ZI10 */
      pr_default.execute(8, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Integer.valueOf(A6274VxBarcod), A7525VxOFabTip, Byte.valueOf(A7526VxOsCoLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI10_A6274VxBarcod[0] < A6274VxBarcod ) || ( T00ZI10_A6274VxBarcod[0] == A6274VxBarcod ) && ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI10_A7526VxOsCoLin[0] < A7526VxOsCoLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI10_A6274VxBarcod[0] > A6274VxBarcod ) || ( T00ZI10_A6274VxBarcod[0] == A6274VxBarcod ) && ( GXutil.strcmp(T00ZI10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI10_A7526VxOsCoLin[0] > A7526VxOsCoLin ) ) )
         {
            A7525VxOFabTip = T00ZI10_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A6274VxBarcod = T00ZI10_A6274VxBarcod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
            A7526VxOsCoLin = T00ZI10_A7526VxOsCoLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
            RcdFound1057 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1057 = (short)(0) ;
      /* Using cursor T00ZI11 */
      pr_default.execute(9, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Integer.valueOf(A6274VxBarcod), A7525VxOFabTip, Byte.valueOf(A7526VxOsCoLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI11_A6274VxBarcod[0] > A6274VxBarcod ) || ( T00ZI11_A6274VxBarcod[0] == A6274VxBarcod ) && ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI11_A7526VxOsCoLin[0] > A7526VxOsCoLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI11_A6274VxBarcod[0] < A6274VxBarcod ) || ( T00ZI11_A6274VxBarcod[0] == A6274VxBarcod ) && ( GXutil.strcmp(T00ZI11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T00ZI11_A7526VxOsCoLin[0] < A7526VxOsCoLin ) ) )
         {
            A7525VxOFabTip = T00ZI11_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A6274VxBarcod = T00ZI11_A6274VxBarcod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
            A7526VxOsCoLin = T00ZI11_A7526VxOsCoLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
            RcdFound1057 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyZI1057( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertZI1057( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1057 == 1 )
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A6274VxBarcod != Z6274VxBarcod ) || ( A7526VxOsCoLin != Z7526VxOsCoLin ) )
            {
               A7525VxOFabTip = Z7525VxOFabTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
               A6274VxBarcod = Z6274VxBarcod ;
               httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
               A7526VxOsCoLin = Z7526VxOsCoLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXOFABTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateZI1057( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A6274VxBarcod != Z6274VxBarcod ) || ( A7526VxOsCoLin != Z7526VxOsCoLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertZI1057( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXOFABTIP");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertZI1057( ) ;
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
      if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A6274VxBarcod != Z6274VxBarcod ) || ( A7526VxOsCoLin != Z7526VxOsCoLin ) )
      {
         A7525VxOFabTip = Z7525VxOFabTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A6274VxBarcod = Z6274VxBarcod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A7526VxOsCoLin = Z7526VxOsCoLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
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
      getKeyZI1057( ) ;
      if ( RcdFound1057 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A6274VxBarcod != Z6274VxBarcod ) || ( A7526VxOsCoLin != Z7526VxOsCoLin ) )
         {
            A7525VxOFabTip = Z7525VxOFabTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A6274VxBarcod = Z6274VxBarcod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
            A7526VxOsCoLin = Z7526VxOsCoLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
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
         if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A6274VxBarcod != Z6274VxBarcod ) || ( A7526VxOsCoLin != Z7526VxOsCoLin ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXOFABTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxoser");
      GX_FocusControl = edtVxArtCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_ZI0( ) ;
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
      if ( RcdFound1057 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxArtCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartZI1057( ) ;
      if ( RcdFound1057 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndZI1057( ) ;
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
      if ( RcdFound1057 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtCod_Internalname ;
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
      if ( RcdFound1057 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtCod_Internalname ;
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
      scanStartZI1057( ) ;
      if ( RcdFound1057 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1057 != 0 )
         {
            scanNextZI1057( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndZI1057( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyZI1057( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00ZI2 */
         pr_default.execute(0, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z12397VxOsCoColC != T00ZI2_A12397VxOsCoColC[0] ) || ( GXutil.strcmp(Z12398VxOsCoLoCo, T00ZI2_A12398VxOsCoLoCo[0]) != 0 ) || ( GXutil.strcmp(Z7420VxArtCod, T00ZI2_A7420VxArtCod[0]) != 0 ) || ( Z6638VxProvCod != T00ZI2_A6638VxProvCod[0] ) )
         {
            if ( Z12397VxOsCoColC != T00ZI2_A12397VxOsCoColC[0] )
            {
               GXutil.writeLogln("tvxoser:[seudo value changed for attri]"+"VxOsCoColC");
               GXutil.writeLogRaw("Old: ",Z12397VxOsCoColC);
               GXutil.writeLogRaw("Current: ",T00ZI2_A12397VxOsCoColC[0]);
            }
            if ( GXutil.strcmp(Z12398VxOsCoLoCo, T00ZI2_A12398VxOsCoLoCo[0]) != 0 )
            {
               GXutil.writeLogln("tvxoser:[seudo value changed for attri]"+"VxOsCoLoCo");
               GXutil.writeLogRaw("Old: ",Z12398VxOsCoLoCo);
               GXutil.writeLogRaw("Current: ",T00ZI2_A12398VxOsCoLoCo[0]);
            }
            if ( GXutil.strcmp(Z7420VxArtCod, T00ZI2_A7420VxArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxoser:[seudo value changed for attri]"+"VxArtCod");
               GXutil.writeLogRaw("Old: ",Z7420VxArtCod);
               GXutil.writeLogRaw("Current: ",T00ZI2_A7420VxArtCod[0]);
            }
            if ( Z6638VxProvCod != T00ZI2_A6638VxProvCod[0] )
            {
               GXutil.writeLogln("tvxoser:[seudo value changed for attri]"+"VxProvCod");
               GXutil.writeLogRaw("Old: ",Z6638VxProvCod);
               GXutil.writeLogRaw("Current: ",T00ZI2_A6638VxProvCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXOSERCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZI1057( )
   {
      beforeValidateZI1057( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZI1057( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZI1057( 0) ;
         checkOptimisticConcurrencyZI1057( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZI1057( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZI1057( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZI12 */
                  pr_default.execute(10, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin), Boolean.valueOf(n12397VxOsCoColC), Integer.valueOf(A12397VxOsCoColC), Boolean.valueOf(n12398VxOsCoLoCo), A12398VxOsCoLoCo, Boolean.valueOf(n7420VxArtCod), A7420VxArtCod, Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
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
                        resetCaptionZI0( ) ;
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
            loadZI1057( ) ;
         }
         endLevelZI1057( ) ;
      }
      closeExtendedTableCursorsZI1057( ) ;
   }

   public void updateZI1057( )
   {
      beforeValidateZI1057( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZI1057( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZI1057( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZI1057( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateZI1057( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZI13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n12397VxOsCoColC), Integer.valueOf(A12397VxOsCoColC), Boolean.valueOf(n12398VxOsCoLoCo), A12398VxOsCoLoCo, Boolean.valueOf(n7420VxArtCod), A7420VxArtCod, Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod), A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateZI1057( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionZI0( ) ;
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
         endLevelZI1057( ) ;
      }
      closeExtendedTableCursorsZI1057( ) ;
   }

   public void deferredUpdateZI1057( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZI1057( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZI1057( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZI1057( ) ;
         afterConfirmZI1057( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZI1057( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00ZI14 */
               pr_default.execute(12, new Object[] {A7525VxOFabTip, Integer.valueOf(A6274VxBarcod), Byte.valueOf(A7526VxOsCoLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1057 == 0 )
                     {
                        initAllZI1057( ) ;
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
                     resetCaptionZI0( ) ;
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
      sMode1057 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZI1057( ) ;
      Gx_mode = sMode1057 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZI1057( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00ZI15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         A7524VxArtDsc = T00ZI15_A7524VxArtDsc[0] ;
         n7524VxArtDsc = T00ZI15_n7524VxArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         pr_default.close(13);
         /* Using cursor T00ZI16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod)});
         A6639VxPrvNom = T00ZI16_A6639VxPrvNom[0] ;
         n6639VxPrvNom = T00ZI16_n6639VxPrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
         pr_default.close(14);
      }
   }

   public void endLevelZI1057( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteZI1057( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxoser");
         if ( AnyError == 0 )
         {
            confirmValuesZI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxoser");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZI1057( )
   {
      /* Using cursor T00ZI17 */
      pr_default.execute(15);
      RcdFound1057 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1057 = (short)(1) ;
         A7525VxOFabTip = T00ZI17_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A6274VxBarcod = T00ZI17_A6274VxBarcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A7526VxOsCoLin = T00ZI17_A7526VxOsCoLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZI1057( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1057 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1057 = (short)(1) ;
         A7525VxOFabTip = T00ZI17_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A6274VxBarcod = T00ZI17_A6274VxBarcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
         A7526VxOsCoLin = T00ZI17_A7526VxOsCoLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
      }
   }

   public void scanEndZI1057( )
   {
      pr_default.close(15);
   }

   public void afterConfirmZI1057( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertZI1057( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZI1057( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZI1057( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZI1057( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZI1057( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZI1057( )
   {
      edtVxOFabTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOFabTip_Enabled), 5, 0), true);
      edtVxBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxBarcod_Enabled), 5, 0), true);
      edtVxOsCoLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoLin_Enabled), 5, 0), true);
      edtVxArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCod_Enabled), 5, 0), true);
      edtVxArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtDsc_Enabled), 5, 0), true);
      edtVxOsCoColC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoColC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoColC_Enabled), 5, 0), true);
      edtVxOsCoLoCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoLoCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoLoCo_Enabled), 5, 0), true);
      edtVxProvCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxProvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxProvCod_Enabled), 5, 0), true);
      edtVxPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPrvNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesZI1057( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesZI0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxoser", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6274VxBarcod", GXutil.ltrim( localUtil.ntoc( Z6274VxBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7526VxOsCoLin", GXutil.ltrim( localUtil.ntoc( Z7526VxOsCoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12397VxOsCoColC", GXutil.ltrim( localUtil.ntoc( Z12397VxOsCoColC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12398VxOsCoLoCo", GXutil.rtrim( Z12398VxOsCoLoCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6638VxProvCod", GXutil.ltrim( localUtil.ntoc( Z6638VxProvCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxoser", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxOSer" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OSERCO en VertexFUERA DE USO", "") ;
   }

   public void initializeNonKeyZI1057( )
   {
      A7420VxArtCod = "" ;
      n7420VxArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      A7524VxArtDsc = "" ;
      n7524VxArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
      A12397VxOsCoColC = 0 ;
      n12397VxOsCoColC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12397VxOsCoColC), 6, 0));
      A12398VxOsCoLoCo = "" ;
      n12398VxOsCoLoCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12398VxOsCoLoCo", A12398VxOsCoLoCo);
      A6638VxProvCod = 0 ;
      n6638VxProvCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6638VxProvCod), 6, 0));
      A6639VxPrvNom = "" ;
      n6639VxPrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", A6639VxPrvNom);
      Z12397VxOsCoColC = 0 ;
      Z12398VxOsCoLoCo = "" ;
      Z7420VxArtCod = "" ;
      Z6638VxProvCod = 0 ;
   }

   public void initAllZI1057( )
   {
      A7525VxOFabTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
      A6274VxBarcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6274VxBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6274VxBarcod), 8, 0));
      A7526VxOsCoLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7526VxOsCoLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7526VxOsCoLin), 2, 0));
      initializeNonKeyZI1057( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518594748", true, true);
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
      httpContext.AddJavascriptSource("tvxoser.js", "?202612518594748", false, true);
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
      edtVxOFabTip_Internalname = "VXOFABTIP" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxBarcod_Internalname = "VXBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxOsCoLin_Internalname = "VXOSCOLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxArtCod_Internalname = "VXARTCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxArtDsc_Internalname = "VXARTDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxOsCoColC_Internalname = "VXOSCOCOLC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxOsCoLoCo_Internalname = "VXOSCOLOCO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxProvCod_Internalname = "VXPROVCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVxPrvNom_Internalname = "VXPRVNOM" ;
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
      Form.setCaption( httpContext.getMessage( "OSERCO en VertexFUERA DE USO", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxPrvNom_Jsonclick = "" ;
      edtVxPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtVxPrvNom_Enabled = 0 ;
      edtVxProvCod_Jsonclick = "" ;
      edtVxProvCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxProvCod_Enabled = 1 ;
      edtVxOsCoLoCo_Jsonclick = "" ;
      edtVxOsCoLoCo_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoLoCo_Enabled = 1 ;
      edtVxOsCoColC_Jsonclick = "" ;
      edtVxOsCoColC_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoColC_Enabled = 1 ;
      edtVxArtDsc_Jsonclick = "" ;
      edtVxArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtDsc_Enabled = 0 ;
      edtVxArtCod_Jsonclick = "" ;
      edtVxArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxOsCoLin_Jsonclick = "" ;
      edtVxOsCoLin_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoLin_Enabled = 1 ;
      edtVxBarcod_Jsonclick = "" ;
      edtVxBarcod_Backcolor = (int)(0xFFFFFF) ;
      edtVxBarcod_Enabled = 1 ;
      edtVxOFabTip_Jsonclick = "" ;
      edtVxOFabTip_Backcolor = (int)(0xFFFFFF) ;
      edtVxOFabTip_Enabled = 1 ;
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
      GX_FocusControl = edtVxArtCod_Internalname ;
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

   public void valid_Vxoscolin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", GXutil.rtrim( A7420VxArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12397VxOsCoColC", GXutil.ltrim( localUtil.ntoc( A12397VxOsCoColC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12398VxOsCoLoCo", GXutil.rtrim( A12398VxOsCoLoCo));
      httpContext.ajax_rsp_assign_attri("", false, "A6638VxProvCod", GXutil.ltrim( localUtil.ntoc( A6638VxProvCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", GXutil.rtrim( A7524VxArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", GXutil.rtrim( A6639VxPrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6274VxBarcod", GXutil.ltrim( localUtil.ntoc( Z6274VxBarcod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7526VxOsCoLin", GXutil.ltrim( localUtil.ntoc( Z7526VxOsCoLin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12397VxOsCoColC", GXutil.ltrim( localUtil.ntoc( Z12397VxOsCoColC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12398VxOsCoLoCo", GXutil.rtrim( Z12398VxOsCoLoCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6638VxProvCod", GXutil.ltrim( localUtil.ntoc( Z6638VxProvCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7524VxArtDsc", GXutil.rtrim( Z7524VxArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6639VxPrvNom", GXutil.rtrim( Z6639VxPrvNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Vxartcod( )
   {
      n7420VxArtCod = false ;
      n7524VxArtDsc = false ;
      /* Using cursor T00ZI15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
      }
      A7524VxArtDsc = T00ZI15_A7524VxArtDsc[0] ;
      n7524VxArtDsc = T00ZI15_n7524VxArtDsc[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", GXutil.rtrim( A7524VxArtDsc));
   }

   public void valid_Vxprovcod( )
   {
      n6638VxProvCod = false ;
      n6639VxPrvNom = false ;
      /* Using cursor T00ZI16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n6638VxProvCod), Integer.valueOf(A6638VxProvCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (0==A6638VxProvCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxProv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXPROVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxProvCod_Internalname ;
         }
      }
      A6639VxPrvNom = T00ZI16_A6639VxPrvNom[0] ;
      n6639VxPrvNom = T00ZI16_n6639VxPrvNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6639VxPrvNom", GXutil.rtrim( A6639VxPrvNom));
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
      setEventMetadata("VALID_VXOFABTIP","{handler:'valid_Vxofabtip',iparms:[]");
      setEventMetadata("VALID_VXOFABTIP",",oparms:[]}");
      setEventMetadata("VALID_VXBARCOD","{handler:'valid_Vxbarcod',iparms:[]");
      setEventMetadata("VALID_VXBARCOD",",oparms:[]}");
      setEventMetadata("VALID_VXOSCOLIN","{handler:'valid_Vxoscolin',iparms:[{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A6274VxBarcod',fld:'VXBARCOD',pic:'ZZZZZZZ9'},{av:'A7526VxOsCoLin',fld:'VXOSCOLIN',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXOSCOLIN",",oparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'A12397VxOsCoColC',fld:'VXOSCOCOLC',pic:'ZZZZZ9'},{av:'A12398VxOsCoLoCo',fld:'VXOSCOLOCO',pic:''},{av:'A6638VxProvCod',fld:'VXPROVCOD',pic:'ZZZZZ9'},{av:'A7524VxArtDsc',fld:'VXARTDSC',pic:''},{av:'A6639VxPrvNom',fld:'VXPRVNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7525VxOFabTip'},{av:'Z6274VxBarcod'},{av:'Z7526VxOsCoLin'},{av:'Z7420VxArtCod'},{av:'Z12397VxOsCoColC'},{av:'Z12398VxOsCoLoCo'},{av:'Z6638VxProvCod'},{av:'Z7524VxArtDsc'},{av:'Z6639VxPrvNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXARTCOD","{handler:'valid_Vxartcod',iparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'A7524VxArtDsc',fld:'VXARTDSC',pic:''}]");
      setEventMetadata("VALID_VXARTCOD",",oparms:[{av:'A7524VxArtDsc',fld:'VXARTDSC',pic:''}]}");
      setEventMetadata("VALID_VXPROVCOD","{handler:'valid_Vxprovcod',iparms:[{av:'A6638VxProvCod',fld:'VXPROVCOD',pic:'ZZZZZ9'},{av:'A6639VxPrvNom',fld:'VXPRVNOM',pic:''}]");
      setEventMetadata("VALID_VXPROVCOD",",oparms:[{av:'A6639VxPrvNom',fld:'VXPRVNOM',pic:''}]}");
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
      Z7525VxOFabTip = "" ;
      Z12398VxOsCoLoCo = "" ;
      Z7420VxArtCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7420VxArtCod = "" ;
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
      A7525VxOFabTip = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A7524VxArtDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12398VxOsCoLoCo = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6639VxPrvNom = "" ;
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
      Z7524VxArtDsc = "" ;
      Z6639VxPrvNom = "" ;
      T00ZI6_A7525VxOFabTip = new String[] {""} ;
      T00ZI6_A6274VxBarcod = new int[1] ;
      T00ZI6_A7526VxOsCoLin = new byte[1] ;
      T00ZI6_A7524VxArtDsc = new String[] {""} ;
      T00ZI6_n7524VxArtDsc = new boolean[] {false} ;
      T00ZI6_A12397VxOsCoColC = new int[1] ;
      T00ZI6_n12397VxOsCoColC = new boolean[] {false} ;
      T00ZI6_A12398VxOsCoLoCo = new String[] {""} ;
      T00ZI6_n12398VxOsCoLoCo = new boolean[] {false} ;
      T00ZI6_A6639VxPrvNom = new String[] {""} ;
      T00ZI6_n6639VxPrvNom = new boolean[] {false} ;
      T00ZI6_A7420VxArtCod = new String[] {""} ;
      T00ZI6_n7420VxArtCod = new boolean[] {false} ;
      T00ZI6_A6638VxProvCod = new int[1] ;
      T00ZI6_n6638VxProvCod = new boolean[] {false} ;
      T00ZI4_A7524VxArtDsc = new String[] {""} ;
      T00ZI4_n7524VxArtDsc = new boolean[] {false} ;
      T00ZI5_A6639VxPrvNom = new String[] {""} ;
      T00ZI5_n6639VxPrvNom = new boolean[] {false} ;
      T00ZI7_A7524VxArtDsc = new String[] {""} ;
      T00ZI7_n7524VxArtDsc = new boolean[] {false} ;
      T00ZI8_A6639VxPrvNom = new String[] {""} ;
      T00ZI8_n6639VxPrvNom = new boolean[] {false} ;
      T00ZI9_A7525VxOFabTip = new String[] {""} ;
      T00ZI9_A6274VxBarcod = new int[1] ;
      T00ZI9_A7526VxOsCoLin = new byte[1] ;
      T00ZI3_A7525VxOFabTip = new String[] {""} ;
      T00ZI3_A6274VxBarcod = new int[1] ;
      T00ZI3_A7526VxOsCoLin = new byte[1] ;
      T00ZI3_A12397VxOsCoColC = new int[1] ;
      T00ZI3_n12397VxOsCoColC = new boolean[] {false} ;
      T00ZI3_A12398VxOsCoLoCo = new String[] {""} ;
      T00ZI3_n12398VxOsCoLoCo = new boolean[] {false} ;
      T00ZI3_A7420VxArtCod = new String[] {""} ;
      T00ZI3_n7420VxArtCod = new boolean[] {false} ;
      T00ZI3_A6638VxProvCod = new int[1] ;
      T00ZI3_n6638VxProvCod = new boolean[] {false} ;
      sMode1057 = "" ;
      T00ZI10_A7525VxOFabTip = new String[] {""} ;
      T00ZI10_A6274VxBarcod = new int[1] ;
      T00ZI10_A7526VxOsCoLin = new byte[1] ;
      T00ZI11_A7525VxOFabTip = new String[] {""} ;
      T00ZI11_A6274VxBarcod = new int[1] ;
      T00ZI11_A7526VxOsCoLin = new byte[1] ;
      T00ZI2_A7525VxOFabTip = new String[] {""} ;
      T00ZI2_A6274VxBarcod = new int[1] ;
      T00ZI2_A7526VxOsCoLin = new byte[1] ;
      T00ZI2_A12397VxOsCoColC = new int[1] ;
      T00ZI2_n12397VxOsCoColC = new boolean[] {false} ;
      T00ZI2_A12398VxOsCoLoCo = new String[] {""} ;
      T00ZI2_n12398VxOsCoLoCo = new boolean[] {false} ;
      T00ZI2_A7420VxArtCod = new String[] {""} ;
      T00ZI2_n7420VxArtCod = new boolean[] {false} ;
      T00ZI2_A6638VxProvCod = new int[1] ;
      T00ZI2_n6638VxProvCod = new boolean[] {false} ;
      T00ZI15_A7524VxArtDsc = new String[] {""} ;
      T00ZI15_n7524VxArtDsc = new boolean[] {false} ;
      T00ZI16_A6639VxPrvNom = new String[] {""} ;
      T00ZI16_n6639VxPrvNom = new boolean[] {false} ;
      T00ZI17_A7525VxOFabTip = new String[] {""} ;
      T00ZI17_A6274VxBarcod = new int[1] ;
      T00ZI17_A7526VxOsCoLin = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ7525VxOFabTip = "" ;
      ZZ7420VxArtCod = "" ;
      ZZ12398VxOsCoLoCo = "" ;
      ZZ7524VxArtDsc = "" ;
      ZZ6639VxPrvNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxoser__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxoser__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxoser__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxoser__default(),
         new Object[] {
             new Object[] {
            T00ZI2_A7525VxOFabTip, T00ZI2_A6274VxBarcod, T00ZI2_A7526VxOsCoLin, T00ZI2_A12397VxOsCoColC, T00ZI2_n12397VxOsCoColC, T00ZI2_A12398VxOsCoLoCo, T00ZI2_n12398VxOsCoLoCo, T00ZI2_A7420VxArtCod, T00ZI2_n7420VxArtCod, T00ZI2_A6638VxProvCod,
            T00ZI2_n6638VxProvCod
            }
            , new Object[] {
            T00ZI3_A7525VxOFabTip, T00ZI3_A6274VxBarcod, T00ZI3_A7526VxOsCoLin, T00ZI3_A12397VxOsCoColC, T00ZI3_n12397VxOsCoColC, T00ZI3_A12398VxOsCoLoCo, T00ZI3_n12398VxOsCoLoCo, T00ZI3_A7420VxArtCod, T00ZI3_n7420VxArtCod, T00ZI3_A6638VxProvCod,
            T00ZI3_n6638VxProvCod
            }
            , new Object[] {
            T00ZI4_A7524VxArtDsc, T00ZI4_n7524VxArtDsc
            }
            , new Object[] {
            T00ZI5_A6639VxPrvNom, T00ZI5_n6639VxPrvNom
            }
            , new Object[] {
            T00ZI6_A7525VxOFabTip, T00ZI6_A6274VxBarcod, T00ZI6_A7526VxOsCoLin, T00ZI6_A7524VxArtDsc, T00ZI6_n7524VxArtDsc, T00ZI6_A12397VxOsCoColC, T00ZI6_n12397VxOsCoColC, T00ZI6_A12398VxOsCoLoCo, T00ZI6_n12398VxOsCoLoCo, T00ZI6_A6639VxPrvNom,
            T00ZI6_n6639VxPrvNom, T00ZI6_A7420VxArtCod, T00ZI6_n7420VxArtCod, T00ZI6_A6638VxProvCod, T00ZI6_n6638VxProvCod
            }
            , new Object[] {
            T00ZI7_A7524VxArtDsc, T00ZI7_n7524VxArtDsc
            }
            , new Object[] {
            T00ZI8_A6639VxPrvNom, T00ZI8_n6639VxPrvNom
            }
            , new Object[] {
            T00ZI9_A7525VxOFabTip, T00ZI9_A6274VxBarcod, T00ZI9_A7526VxOsCoLin
            }
            , new Object[] {
            T00ZI10_A7525VxOFabTip, T00ZI10_A6274VxBarcod, T00ZI10_A7526VxOsCoLin
            }
            , new Object[] {
            T00ZI11_A7525VxOFabTip, T00ZI11_A6274VxBarcod, T00ZI11_A7526VxOsCoLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00ZI15_A7524VxArtDsc, T00ZI15_n7524VxArtDsc
            }
            , new Object[] {
            T00ZI16_A6639VxPrvNom, T00ZI16_n6639VxPrvNom
            }
            , new Object[] {
            T00ZI17_A7525VxOFabTip, T00ZI17_A6274VxBarcod, T00ZI17_A7526VxOsCoLin
            }
         }
      );
   }

   private byte Z7526VxOsCoLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7526VxOsCoLin ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ7526VxOsCoLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1057 ;
   private short nIsDirty_1057 ;
   private int Z6274VxBarcod ;
   private int Z12397VxOsCoColC ;
   private int Z6638VxProvCod ;
   private int A6638VxProvCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxOFabTip_Enabled ;
   private int A6274VxBarcod ;
   private int edtVxBarcod_Enabled ;
   private int edtVxOsCoLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxArtCod_Enabled ;
   private int edtVxArtDsc_Enabled ;
   private int A12397VxOsCoColC ;
   private int edtVxOsCoColC_Enabled ;
   private int edtVxOsCoLoCo_Enabled ;
   private int edtVxProvCod_Enabled ;
   private int edtVxPrvNom_Enabled ;
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
   private int edtVxPrvNom_Backcolor ;
   private int edtVxProvCod_Backcolor ;
   private int edtVxOsCoLoCo_Backcolor ;
   private int edtVxOsCoColC_Backcolor ;
   private int edtVxArtDsc_Backcolor ;
   private int edtVxArtCod_Backcolor ;
   private int edtVxOsCoLin_Backcolor ;
   private int edtVxBarcod_Backcolor ;
   private int edtVxOFabTip_Backcolor ;
   private int ZZ6274VxBarcod ;
   private int ZZ12397VxOsCoColC ;
   private int ZZ6638VxProvCod ;
   private String sPrefix ;
   private String Z7525VxOFabTip ;
   private String Z12398VxOsCoLoCo ;
   private String Z7420VxArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7420VxArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxOFabTip_Internalname ;
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
   private String A7525VxOFabTip ;
   private String edtVxOFabTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxBarcod_Internalname ;
   private String edtVxBarcod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxOsCoLin_Internalname ;
   private String edtVxOsCoLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxArtCod_Internalname ;
   private String edtVxArtCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxArtDsc_Internalname ;
   private String A7524VxArtDsc ;
   private String edtVxArtDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxOsCoColC_Internalname ;
   private String edtVxOsCoColC_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxOsCoLoCo_Internalname ;
   private String A12398VxOsCoLoCo ;
   private String edtVxOsCoLoCo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxProvCod_Internalname ;
   private String edtVxProvCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVxPrvNom_Internalname ;
   private String A6639VxPrvNom ;
   private String edtVxPrvNom_Jsonclick ;
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
   private String Z7524VxArtDsc ;
   private String Z6639VxPrvNom ;
   private String sMode1057 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ7525VxOFabTip ;
   private String ZZ7420VxArtCod ;
   private String ZZ12398VxOsCoLoCo ;
   private String ZZ7524VxArtDsc ;
   private String ZZ6639VxPrvNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7420VxArtCod ;
   private boolean n6638VxProvCod ;
   private boolean wbErr ;
   private boolean n7524VxArtDsc ;
   private boolean n12397VxOsCoColC ;
   private boolean n12398VxOsCoLoCo ;
   private boolean n6639VxPrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] T00ZI6_A7525VxOFabTip ;
   private int[] T00ZI6_A6274VxBarcod ;
   private byte[] T00ZI6_A7526VxOsCoLin ;
   private String[] T00ZI6_A7524VxArtDsc ;
   private boolean[] T00ZI6_n7524VxArtDsc ;
   private int[] T00ZI6_A12397VxOsCoColC ;
   private boolean[] T00ZI6_n12397VxOsCoColC ;
   private String[] T00ZI6_A12398VxOsCoLoCo ;
   private boolean[] T00ZI6_n12398VxOsCoLoCo ;
   private String[] T00ZI6_A6639VxPrvNom ;
   private boolean[] T00ZI6_n6639VxPrvNom ;
   private String[] T00ZI6_A7420VxArtCod ;
   private boolean[] T00ZI6_n7420VxArtCod ;
   private int[] T00ZI6_A6638VxProvCod ;
   private boolean[] T00ZI6_n6638VxProvCod ;
   private String[] T00ZI4_A7524VxArtDsc ;
   private boolean[] T00ZI4_n7524VxArtDsc ;
   private String[] T00ZI5_A6639VxPrvNom ;
   private boolean[] T00ZI5_n6639VxPrvNom ;
   private String[] T00ZI7_A7524VxArtDsc ;
   private boolean[] T00ZI7_n7524VxArtDsc ;
   private String[] T00ZI8_A6639VxPrvNom ;
   private boolean[] T00ZI8_n6639VxPrvNom ;
   private String[] T00ZI9_A7525VxOFabTip ;
   private int[] T00ZI9_A6274VxBarcod ;
   private byte[] T00ZI9_A7526VxOsCoLin ;
   private String[] T00ZI3_A7525VxOFabTip ;
   private int[] T00ZI3_A6274VxBarcod ;
   private byte[] T00ZI3_A7526VxOsCoLin ;
   private int[] T00ZI3_A12397VxOsCoColC ;
   private boolean[] T00ZI3_n12397VxOsCoColC ;
   private String[] T00ZI3_A12398VxOsCoLoCo ;
   private boolean[] T00ZI3_n12398VxOsCoLoCo ;
   private String[] T00ZI3_A7420VxArtCod ;
   private boolean[] T00ZI3_n7420VxArtCod ;
   private int[] T00ZI3_A6638VxProvCod ;
   private boolean[] T00ZI3_n6638VxProvCod ;
   private String[] T00ZI10_A7525VxOFabTip ;
   private int[] T00ZI10_A6274VxBarcod ;
   private byte[] T00ZI10_A7526VxOsCoLin ;
   private String[] T00ZI11_A7525VxOFabTip ;
   private int[] T00ZI11_A6274VxBarcod ;
   private byte[] T00ZI11_A7526VxOsCoLin ;
   private String[] T00ZI2_A7525VxOFabTip ;
   private int[] T00ZI2_A6274VxBarcod ;
   private byte[] T00ZI2_A7526VxOsCoLin ;
   private int[] T00ZI2_A12397VxOsCoColC ;
   private boolean[] T00ZI2_n12397VxOsCoColC ;
   private String[] T00ZI2_A12398VxOsCoLoCo ;
   private boolean[] T00ZI2_n12398VxOsCoLoCo ;
   private String[] T00ZI2_A7420VxArtCod ;
   private boolean[] T00ZI2_n7420VxArtCod ;
   private int[] T00ZI2_A6638VxProvCod ;
   private boolean[] T00ZI2_n6638VxProvCod ;
   private String[] T00ZI15_A7524VxArtDsc ;
   private boolean[] T00ZI15_n7524VxArtDsc ;
   private String[] T00ZI16_A6639VxPrvNom ;
   private boolean[] T00ZI16_n6639VxPrvNom ;
   private String[] T00ZI17_A7525VxOFabTip ;
   private int[] T00ZI17_A6274VxBarcod ;
   private byte[] T00ZI17_A7526VxOsCoLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxoser__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxoser__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxoser__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxoser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00ZI2", "SELECT ofabtip, oscod, oscolin, OsCoColHCo, OsCoLoCod, OsCoArtCod, OsCoPrv FROM VTXOSERCO WHERE ofabtip = ? AND oscod = ? AND oscolin = ?  FOR UPDATE OF OsCoColHCo, OsCoLoCod, OsCoArtCod, OsCoPrv NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI3", "SELECT ofabtip, oscod, oscolin, OsCoColHCo, OsCoLoCod, OsCoArtCod, OsCoPrv FROM VTXOSERCO WHERE ofabtip = ? AND oscod = ? AND oscolin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI4", "SELECT artdsc FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI5", "SELECT PrvNom FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ofabtip, TM1.oscod, TM1.oscolin, T2.artdsc, TM1.OsCoColHCo, TM1.OsCoLoCod, T3.PrvNom, TM1.OsCoArtCod, TM1.OsCoPrv FROM ((VTXOSERCO TM1 LEFT JOIN VTXARTIC T2 ON T2.ArtCod = TM1.OsCoArtCod) LEFT JOIN VTXPROVEED T3 ON T3.prvcod = TM1.OsCoPrv) WHERE TM1.ofabtip = ? and TM1.oscod = ? and TM1.oscolin = ? ORDER BY TM1.ofabtip, TM1.oscod, TM1.oscolin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI7", "SELECT artdsc FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI8", "SELECT PrvNom FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI9", "SELECT /*+ FIRST_ROWS(1) */ ofabtip, oscod, oscolin FROM VTXOSERCO WHERE ofabtip = ? AND oscod = ? AND oscolin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ofabtip, oscod, oscolin FROM VTXOSERCO WHERE ( ofabtip > ? or ofabtip = ? and oscod > ? or oscod = ? and ofabtip = ? and oscolin > ?) ORDER BY ofabtip, oscod, oscolin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZI11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ofabtip, oscod, oscolin FROM VTXOSERCO WHERE ( ofabtip < ? or ofabtip = ? and oscod < ? or oscod = ? and ofabtip = ? and oscolin < ?) ORDER BY ofabtip DESC, oscod DESC, oscolin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00ZI12", "INSERT INTO VTXOSERCO(ofabtip, oscod, oscolin, OsCoColHCo, OsCoLoCod, OsCoArtCod, OsCoPrv) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXOSERCO")
         ,new UpdateCursor("T00ZI13", "UPDATE VTXOSERCO SET OsCoColHCo=?, OsCoLoCod=?, OsCoArtCod=?, OsCoPrv=?  WHERE ofabtip = ? AND oscod = ? AND oscolin = ?", GX_NOMASK, "VTXOSERCO")
         ,new UpdateCursor("T00ZI14", "DELETE FROM VTXOSERCO  WHERE ofabtip = ? AND oscod = ? AND oscolin = ?", GX_NOMASK, "VTXOSERCO")
         ,new ForEachCursor("T00ZI15", "SELECT artdsc FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI16", "SELECT PrvNom FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZI17", "SELECT /*+ FIRST_ROWS(100) */ ofabtip, oscod, oscolin FROM VTXOSERCO ORDER BY ofabtip, oscod, oscolin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 12);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               return;
            case 11 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               stmt.setString(5, (String)parms[8], 2);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
      }
   }

}

