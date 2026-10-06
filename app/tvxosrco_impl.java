package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxosrco_impl extends GXDataArea
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
         A7525VxOFabTip = httpContext.GetPar( "VxOFabTip") ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = (int)(GXutil.lval( httpContext.GetPar( "VxOSCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A12659VxOSCoArtC = httpContext.GetPar( "VxOSCoArtC") ;
         n12659VxOSCoArtC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", A12659VxOSCoArtC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A12659VxOSCoArtC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A12660VxOSCoLo = httpContext.GetPar( "VxOSCoLo") ;
         n12660VxOSCoLo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", A12660VxOSCoLo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A12660VxOSCoLo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A12666VxOsCoPrvC = (int)(GXutil.lval( httpContext.GetPar( "VxOsCoPrvC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A12666VxOsCoPrvC) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura OSERCO en VERTEX", ""), (short)(0)) ;
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

   public tvxosrco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxosrco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxosrco_impl.class ));
   }

   public tvxosrco_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxOSRCo.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "O. Fabricación", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOFabTip_Internalname, GXutil.rtrim( A7525VxOFabTip), GXutil.rtrim( localUtil.format( A7525VxOFabTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOFabTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxOFabTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "OSERVIOSCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Línea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12663VxOsCoLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsCoLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12663VxOsCoLi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12663VxOsCoLi), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoLi_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoLi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código Artículo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCoArtC_Internalname, GXutil.rtrim( A12659VxOSCoArtC), GXutil.rtrim( localUtil.format( A12659VxOSCoArtC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCoArtC_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCoArtC_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Código de Lote", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCoLo_Internalname, GXutil.rtrim( A12660VxOSCoLo), GXutil.rtrim( localUtil.format( A12660VxOSCoLo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCoLo_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCoLo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Artículo Descripción", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoArtD_Internalname, GXutil.rtrim( A12661VxOsCoArtD), GXutil.rtrim( localUtil.format( A12661VxOsCoArtD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoArtD_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoArtD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código de Lote del Proveedor", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCoLoPr_Internalname, GXutil.rtrim( A12662VxOSCoLoPr), GXutil.rtrim( localUtil.format( A12662VxOSCoLoPr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCoLoPr_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCoLoPr_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código del Proveedor", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoPrvC_Internalname, GXutil.ltrim( localUtil.ntoc( A12666VxOsCoPrvC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsCoPrvC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoPrvC_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoPrvC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre del Proveedor", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsCoPrvN_Internalname, GXutil.rtrim( A12667VxOsCoPrvN), GXutil.rtrim( localUtil.format( A12667VxOsCoPrvN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsCoPrvN_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsCoPrvN_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRCo.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxOSRCo.htm");
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
      e111KY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z7525VxOFabTip = httpContext.cgiGet( "Z7525VxOFabTip") ;
            Z12372VxOSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z12372VxOSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12663VxOsCoLi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12663VxOsCoLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12659VxOSCoArtC = httpContext.cgiGet( "Z12659VxOSCoArtC") ;
            Z12660VxOSCoLo = httpContext.cgiGet( "Z12660VxOSCoLo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A7525VxOFabTip = httpContext.cgiGet( edtVxOFabTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOSCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12372VxOSCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            }
            else
            {
               A12372VxOSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsCoLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOsCoLi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12663VxOsCoLi = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
            }
            else
            {
               A12663VxOsCoLi = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxOsCoLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
            }
            A12659VxOSCoArtC = httpContext.cgiGet( edtVxOSCoArtC_Internalname) ;
            n12659VxOSCoArtC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", A12659VxOSCoArtC);
            A12660VxOSCoLo = httpContext.cgiGet( edtVxOSCoLo_Internalname) ;
            n12660VxOSCoLo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", A12660VxOSCoLo);
            A12661VxOsCoArtD = httpContext.cgiGet( edtVxOsCoArtD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
            A12662VxOSCoLoPr = httpContext.cgiGet( edtVxOSCoLoPr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
            A12666VxOsCoPrvC = (int)(localUtil.ctol( httpContext.cgiGet( edtVxOsCoPrvC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
            A12667VxOsCoPrvN = httpContext.cgiGet( edtVxOsCoPrvN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
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
               A12372VxOSCod = (int)(GXutil.lval( httpContext.GetPar( "VxOSCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
               A12663VxOsCoLi = (byte)(GXutil.lval( httpContext.GetPar( "VxOsCoLi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
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
                        e111KY2 ();
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
            initAll1KY1741( ) ;
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
      disableAttributes1KY1741( ) ;
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

   public void confirm_1KY0( )
   {
      beforeValidate1KY1741( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KY1741( ) ;
         }
         else
         {
            checkExtendedTable1KY1741( ) ;
            if ( AnyError == 0 )
            {
               zm1KY1741( 2) ;
               zm1KY1741( 3) ;
               zm1KY1741( 4) ;
               zm1KY1741( 5) ;
            }
            closeExtendedTableCursors1KY1741( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KY0( ) ;
      }
   }

   public void resetCaption1KY0( )
   {
   }

   public void e111KY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1KY1741( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12659VxOSCoArtC = T01KY3_A12659VxOSCoArtC[0] ;
            Z12660VxOSCoLo = T01KY3_A12660VxOSCoLo[0] ;
         }
         else
         {
            Z12659VxOSCoArtC = A12659VxOSCoArtC ;
            Z12660VxOSCoLo = A12660VxOSCoLo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12663VxOsCoLi = A12663VxOsCoLi ;
         Z12659VxOSCoArtC = A12659VxOSCoArtC ;
         Z12660VxOSCoLo = A12660VxOSCoLo ;
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         Z12661VxOsCoArtD = A12661VxOsCoArtD ;
         Z12662VxOSCoLoPr = A12662VxOSCoLoPr ;
         Z12666VxOsCoPrvC = A12666VxOsCoPrvC ;
         Z12667VxOsCoPrvN = A12667VxOsCoPrvN ;
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

   public void load1KY1741( )
   {
      /* Using cursor T01KY8 */
      pr_default.execute(6, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1741 = (short)(1) ;
         A12659VxOSCoArtC = T01KY8_A12659VxOSCoArtC[0] ;
         n12659VxOSCoArtC = T01KY8_n12659VxOSCoArtC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", A12659VxOSCoArtC);
         A12660VxOSCoLo = T01KY8_A12660VxOSCoLo[0] ;
         n12660VxOSCoLo = T01KY8_n12660VxOSCoLo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", A12660VxOSCoLo);
         A12667VxOsCoPrvN = T01KY8_A12667VxOsCoPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
         A12662VxOSCoLoPr = T01KY8_A12662VxOSCoLoPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
         A12666VxOsCoPrvC = T01KY8_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         A12661VxOsCoArtD = T01KY8_A12661VxOsCoArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
         A12666VxOsCoPrvC = T01KY8_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         zm1KY1741( -1) ;
      }
      pr_default.close(6);
      onLoadActions1KY1741( ) ;
   }

   public void onLoadActions1KY1741( )
   {
   }

   public void checkExtendedTable1KY1741( )
   {
      nIsDirty_1741 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01KY4 */
      pr_default.execute(2, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01KY7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A12661VxOsCoArtD = T01KY7_A12661VxOsCoArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
      }
      else
      {
         nIsDirty_1741 = (short)(1) ;
         A12661VxOsCoArtD = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
      }
      pr_default.close(5);
      /* Using cursor T01KY6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A12662VxOSCoLoPr = T01KY6_A12662VxOSCoLoPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
         A12666VxOsCoPrvC = T01KY6_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         A12666VxOsCoPrvC = T01KY6_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
      }
      else
      {
         nIsDirty_1741 = (short)(1) ;
         A12666VxOsCoPrvC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         nIsDirty_1741 = (short)(1) ;
         A12662VxOSCoLoPr = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
      }
      pr_default.close(4);
      /* Using cursor T01KY5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A12666VxOsCoPrvC)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A12667VxOsCoPrvN = T01KY5_A12667VxOsCoPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
      }
      else
      {
         nIsDirty_1741 = (short)(1) ;
         A12667VxOsCoPrvN = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1KY1741( )
   {
      pr_default.close(2);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A7525VxOFabTip ,
                         int A12372VxOSCod )
   {
      /* Using cursor T01KY9 */
      pr_default.execute(7, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
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

   public void gxload_5( String A12659VxOSCoArtC )
   {
      /* Using cursor T01KY10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A12661VxOsCoArtD = T01KY10_A12661VxOsCoArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
      }
      else
      {
         A12661VxOsCoArtD = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12661VxOsCoArtD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_4( String A12660VxOSCoLo )
   {
      /* Using cursor T01KY11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A12662VxOSCoLoPr = T01KY11_A12662VxOSCoLoPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
         A12666VxOsCoPrvC = T01KY11_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         A12666VxOsCoPrvC = T01KY11_A12666VxOsCoPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
      }
      else
      {
         A12666VxOsCoPrvC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         A12662VxOSCoLoPr = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12662VxOSCoLoPr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12666VxOsCoPrvC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12666VxOsCoPrvC, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_3( int A12666VxOsCoPrvC )
   {
      /* Using cursor T01KY12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A12666VxOsCoPrvC)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A12667VxOsCoPrvN = T01KY12_A12667VxOsCoPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
      }
      else
      {
         A12667VxOsCoPrvN = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12667VxOsCoPrvN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1KY1741( )
   {
      /* Using cursor T01KY13 */
      pr_default.execute(11, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1741 = (short)(1) ;
      }
      else
      {
         RcdFound1741 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KY3 */
      pr_default.execute(1, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KY1741( 1) ;
         RcdFound1741 = (short)(1) ;
         A12663VxOsCoLi = T01KY3_A12663VxOsCoLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
         A12659VxOSCoArtC = T01KY3_A12659VxOSCoArtC[0] ;
         n12659VxOSCoArtC = T01KY3_n12659VxOSCoArtC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", A12659VxOSCoArtC);
         A12660VxOSCoLo = T01KY3_A12660VxOSCoLo[0] ;
         n12660VxOSCoLo = T01KY3_n12660VxOSCoLo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", A12660VxOSCoLo);
         A7525VxOFabTip = T01KY3_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KY3_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         Z12663VxOsCoLi = A12663VxOsCoLi ;
         sMode1741 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KY1741( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1741 = (short)(0) ;
            initializeNonKey1KY1741( ) ;
         }
         Gx_mode = sMode1741 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1741 = (short)(0) ;
         initializeNonKey1KY1741( ) ;
         sMode1741 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1741 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KY1741( ) ;
      if ( RcdFound1741 == 0 )
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
      RcdFound1741 = (short)(0) ;
      /* Using cursor T01KY14 */
      pr_default.execute(12, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A12372VxOSCod), A7525VxOFabTip, Byte.valueOf(A12663VxOsCoLi)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY14_A12372VxOSCod[0] < A12372VxOSCod ) || ( T01KY14_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY14_A12663VxOsCoLi[0] < A12663VxOsCoLi ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY14_A12372VxOSCod[0] > A12372VxOSCod ) || ( T01KY14_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KY14_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY14_A12663VxOsCoLi[0] > A12663VxOsCoLi ) ) )
         {
            A7525VxOFabTip = T01KY14_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KY14_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A12663VxOsCoLi = T01KY14_A12663VxOsCoLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
            RcdFound1741 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1741 = (short)(0) ;
      /* Using cursor T01KY15 */
      pr_default.execute(13, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A12372VxOSCod), A7525VxOFabTip, Byte.valueOf(A12663VxOsCoLi)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY15_A12372VxOSCod[0] > A12372VxOSCod ) || ( T01KY15_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY15_A12663VxOsCoLi[0] > A12663VxOsCoLi ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY15_A12372VxOSCod[0] < A12372VxOSCod ) || ( T01KY15_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KY15_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KY15_A12663VxOsCoLi[0] < A12663VxOsCoLi ) ) )
         {
            A7525VxOFabTip = T01KY15_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KY15_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A12663VxOsCoLi = T01KY15_A12663VxOsCoLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
            RcdFound1741 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KY1741( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KY1741( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1741 == 1 )
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A12663VxOsCoLi != Z12663VxOsCoLi ) )
            {
               A7525VxOFabTip = Z7525VxOFabTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
               A12372VxOSCod = Z12372VxOSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
               A12663VxOsCoLi = Z12663VxOsCoLi ;
               httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
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
               update1KY1741( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A12663VxOsCoLi != Z12663VxOsCoLi ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KY1741( ) ;
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
                  insert1KY1741( ) ;
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
      if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A12663VxOsCoLi != Z12663VxOsCoLi ) )
      {
         A7525VxOFabTip = Z7525VxOFabTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = Z12372VxOSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A12663VxOsCoLi = Z12663VxOsCoLi ;
         httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
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
      getKey1KY1741( ) ;
      if ( RcdFound1741 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A12663VxOsCoLi != Z12663VxOsCoLi ) )
         {
            A7525VxOFabTip = Z7525VxOFabTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = Z12372VxOSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A12663VxOsCoLi = Z12663VxOsCoLi ;
            httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
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
         if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A12663VxOsCoLi != Z12663VxOsCoLi ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrco");
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KY0( ) ;
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
      if ( RcdFound1741 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KY1741( ) ;
      if ( RcdFound1741 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KY1741( ) ;
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
      if ( RcdFound1741 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
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
      if ( RcdFound1741 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
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
      scanStart1KY1741( ) ;
      if ( RcdFound1741 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1741 != 0 )
         {
            scanNext1KY1741( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KY1741( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KY1741( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KY2 */
         pr_default.execute(0, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12659VxOSCoArtC, T01KY2_A12659VxOSCoArtC[0]) != 0 ) || ( GXutil.strcmp(Z12660VxOSCoLo, T01KY2_A12660VxOSCoLo[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12659VxOSCoArtC, T01KY2_A12659VxOSCoArtC[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrco:[seudo value changed for attri]"+"VxOSCoArtC");
               GXutil.writeLogRaw("Old: ",Z12659VxOSCoArtC);
               GXutil.writeLogRaw("Current: ",T01KY2_A12659VxOSCoArtC[0]);
            }
            if ( GXutil.strcmp(Z12660VxOSCoLo, T01KY2_A12660VxOSCoLo[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrco:[seudo value changed for attri]"+"VxOSCoLo");
               GXutil.writeLogRaw("Old: ",Z12660VxOSCoLo);
               GXutil.writeLogRaw("Current: ",T01KY2_A12660VxOSCoLo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXOSERCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KY1741( )
   {
      beforeValidate1KY1741( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KY1741( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KY1741( 0) ;
         checkOptimisticConcurrency1KY1741( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KY1741( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KY1741( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KY16 */
                  pr_default.execute(14, new Object[] {Byte.valueOf(A12663VxOsCoLi), Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC, Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        resetCaption1KY0( ) ;
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
            load1KY1741( ) ;
         }
         endLevel1KY1741( ) ;
      }
      closeExtendedTableCursors1KY1741( ) ;
   }

   public void update1KY1741( )
   {
      beforeValidate1KY1741( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KY1741( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KY1741( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KY1741( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KY1741( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KY17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC, Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KY1741( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KY0( ) ;
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
         endLevel1KY1741( ) ;
      }
      closeExtendedTableCursors1KY1741( ) ;
   }

   public void deferredUpdate1KY1741( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KY1741( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KY1741( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KY1741( ) ;
         afterConfirm1KY1741( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KY1741( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KY18 */
               pr_default.execute(16, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Byte.valueOf(A12663VxOsCoLi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERCO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1741 == 0 )
                     {
                        initAll1KY1741( ) ;
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
                     resetCaption1KY0( ) ;
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
      sMode1741 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KY1741( ) ;
      Gx_mode = sMode1741 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KY1741( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KY19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A12661VxOsCoArtD = T01KY19_A12661VxOsCoArtD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
         }
         else
         {
            A12661VxOsCoArtD = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
         }
         pr_default.close(17);
         /* Using cursor T01KY20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A12662VxOSCoLoPr = T01KY20_A12662VxOSCoLoPr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
            A12666VxOsCoPrvC = T01KY20_A12666VxOsCoPrvC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
            A12666VxOsCoPrvC = T01KY20_A12666VxOsCoPrvC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
         }
         else
         {
            A12666VxOsCoPrvC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
            A12662VxOSCoLoPr = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
         }
         pr_default.close(18);
         /* Using cursor T01KY21 */
         pr_default.execute(19, new Object[] {Integer.valueOf(A12666VxOsCoPrvC)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A12667VxOsCoPrvN = T01KY21_A12667VxOsCoPrvN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
         }
         else
         {
            A12667VxOsCoPrvN = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
         }
         pr_default.close(19);
      }
   }

   public void endLevel1KY1741( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KY1741( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxosrco");
         if ( AnyError == 0 )
         {
            confirmValues1KY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KY1741( )
   {
      /* Using cursor T01KY22 */
      pr_default.execute(20);
      RcdFound1741 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1741 = (short)(1) ;
         A7525VxOFabTip = T01KY22_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KY22_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A12663VxOsCoLi = T01KY22_A12663VxOsCoLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KY1741( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1741 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1741 = (short)(1) ;
         A7525VxOFabTip = T01KY22_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KY22_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A12663VxOsCoLi = T01KY22_A12663VxOsCoLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
      }
   }

   public void scanEnd1KY1741( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1KY1741( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KY1741( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KY1741( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KY1741( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KY1741( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KY1741( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KY1741( )
   {
      edtVxOFabTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOFabTip_Enabled), 5, 0), true);
      edtVxOSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCod_Enabled), 5, 0), true);
      edtVxOsCoLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoLi_Enabled), 5, 0), true);
      edtVxOSCoArtC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCoArtC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCoArtC_Enabled), 5, 0), true);
      edtVxOSCoLo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCoLo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCoLo_Enabled), 5, 0), true);
      edtVxOsCoArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoArtD_Enabled), 5, 0), true);
      edtVxOSCoLoPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCoLoPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCoLoPr_Enabled), 5, 0), true);
      edtVxOsCoPrvC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoPrvC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoPrvC_Enabled), 5, 0), true);
      edtVxOsCoPrvN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsCoPrvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsCoPrvN_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KY1741( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KY0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxosrco", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12663VxOsCoLi", GXutil.ltrim( localUtil.ntoc( Z12663VxOsCoLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12659VxOSCoArtC", GXutil.rtrim( Z12659VxOSCoArtC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12660VxOSCoLo", GXutil.rtrim( Z12660VxOSCoLo));
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
      return formatLink("app.tvxosrco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxOSRCo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura OSERCO en VERTEX", "") ;
   }

   public void initializeNonKey1KY1741( )
   {
      A12667VxOsCoPrvN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", A12667VxOsCoPrvN);
      A12662VxOSCoLoPr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", A12662VxOSCoLoPr);
      A12666VxOsCoPrvC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12666VxOsCoPrvC), 6, 0));
      A12661VxOsCoArtD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", A12661VxOsCoArtD);
      A12659VxOSCoArtC = "" ;
      n12659VxOSCoArtC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", A12659VxOSCoArtC);
      A12660VxOSCoLo = "" ;
      n12660VxOSCoLo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", A12660VxOSCoLo);
      Z12659VxOSCoArtC = "" ;
      Z12660VxOSCoLo = "" ;
   }

   public void initAll1KY1741( )
   {
      A7525VxOFabTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
      A12372VxOSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
      A12663VxOsCoLi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12663VxOsCoLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12663VxOsCoLi), 2, 0));
      initializeNonKey1KY1741( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251954927", true, true);
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
      httpContext.AddJavascriptSource("tvxosrco.js", "?20261251954927", false, true);
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
      edtVxOSCod_Internalname = "VXOSCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxOsCoLi_Internalname = "VXOSCOLI" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxOSCoArtC_Internalname = "VXOSCOARTC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxOSCoLo_Internalname = "VXOSCOLO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxOsCoArtD_Internalname = "VXOSCOARTD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxOSCoLoPr_Internalname = "VXOSCOLOPR" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxOsCoPrvC_Internalname = "VXOSCOPRVC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVxOsCoPrvN_Internalname = "VXOSCOPRVN" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura OSERCO en VERTEX", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxOsCoPrvN_Jsonclick = "" ;
      edtVxOsCoPrvN_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoPrvN_Enabled = 0 ;
      edtVxOsCoPrvC_Jsonclick = "" ;
      edtVxOsCoPrvC_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoPrvC_Enabled = 0 ;
      edtVxOSCoLoPr_Jsonclick = "" ;
      edtVxOSCoLoPr_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCoLoPr_Enabled = 0 ;
      edtVxOsCoArtD_Jsonclick = "" ;
      edtVxOsCoArtD_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoArtD_Enabled = 0 ;
      edtVxOSCoLo_Jsonclick = "" ;
      edtVxOSCoLo_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCoLo_Enabled = 1 ;
      edtVxOSCoArtC_Jsonclick = "" ;
      edtVxOSCoArtC_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCoArtC_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxOsCoLi_Jsonclick = "" ;
      edtVxOsCoLi_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsCoLi_Enabled = 1 ;
      edtVxOSCod_Jsonclick = "" ;
      edtVxOSCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCod_Enabled = 1 ;
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
      /* Using cursor T01KY23 */
      pr_default.execute(21, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
      GX_FocusControl = edtVxOSCoArtC_Internalname ;
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

   public void valid_Vxoscod( )
   {
      /* Using cursor T01KY23 */
      pr_default.execute(21, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxoscoli( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12659VxOSCoArtC", GXutil.rtrim( A12659VxOSCoArtC));
      httpContext.ajax_rsp_assign_attri("", false, "A12660VxOSCoLo", GXutil.rtrim( A12660VxOSCoLo));
      httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", GXutil.rtrim( A12661VxOsCoArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", GXutil.rtrim( A12662VxOSCoLoPr));
      httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrim( localUtil.ntoc( A12666VxOsCoPrvC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", GXutil.rtrim( A12667VxOsCoPrvN));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12663VxOsCoLi", GXutil.ltrim( localUtil.ntoc( Z12663VxOsCoLi, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12659VxOSCoArtC", GXutil.rtrim( Z12659VxOSCoArtC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12660VxOSCoLo", GXutil.rtrim( Z12660VxOSCoLo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12661VxOsCoArtD", GXutil.rtrim( Z12661VxOsCoArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12662VxOSCoLoPr", GXutil.rtrim( Z12662VxOSCoLoPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12666VxOsCoPrvC", GXutil.ltrim( localUtil.ntoc( Z12666VxOsCoPrvC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12667VxOsCoPrvN", GXutil.rtrim( Z12667VxOsCoPrvN));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Vxoscoartc( )
   {
      n12659VxOSCoArtC = false ;
      /* Using cursor T01KY19 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n12659VxOSCoArtC), A12659VxOSCoArtC});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A12661VxOsCoArtD = T01KY19_A12661VxOsCoArtD[0] ;
      }
      else
      {
         A12661VxOsCoArtD = "" ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12661VxOsCoArtD", GXutil.rtrim( A12661VxOsCoArtD));
   }

   public void valid_Vxoscolo( )
   {
      n12660VxOSCoLo = false ;
      /* Using cursor T01KY20 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n12660VxOSCoLo), A12660VxOSCoLo});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A12662VxOSCoLoPr = T01KY20_A12662VxOSCoLoPr[0] ;
         A12666VxOsCoPrvC = T01KY20_A12666VxOsCoPrvC[0] ;
         A12666VxOsCoPrvC = T01KY20_A12666VxOsCoPrvC[0] ;
      }
      else
      {
         A12666VxOsCoPrvC = 0 ;
         A12662VxOSCoLoPr = "" ;
      }
      pr_default.close(18);
      /* Using cursor T01KY21 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A12666VxOsCoPrvC)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A12667VxOsCoPrvN = T01KY21_A12667VxOsCoPrvN[0] ;
      }
      else
      {
         A12667VxOsCoPrvN = "" ;
      }
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12662VxOSCoLoPr", GXutil.rtrim( A12662VxOSCoLoPr));
      httpContext.ajax_rsp_assign_attri("", false, "A12666VxOsCoPrvC", GXutil.ltrim( localUtil.ntoc( A12666VxOsCoPrvC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12667VxOsCoPrvN", GXutil.rtrim( A12667VxOsCoPrvN));
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
      setEventMetadata("VALID_VXOSCOD","{handler:'valid_Vxoscod',iparms:[{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A12372VxOSCod',fld:'VXOSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_VXOSCOD",",oparms:[]}");
      setEventMetadata("VALID_VXOSCOLI","{handler:'valid_Vxoscoli',iparms:[{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A12372VxOSCod',fld:'VXOSCOD',pic:'ZZZZZZZ9'},{av:'A12663VxOsCoLi',fld:'VXOSCOLI',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXOSCOLI",",oparms:[{av:'A12659VxOSCoArtC',fld:'VXOSCOARTC',pic:''},{av:'A12660VxOSCoLo',fld:'VXOSCOLO',pic:''},{av:'A12661VxOsCoArtD',fld:'VXOSCOARTD',pic:''},{av:'A12662VxOSCoLoPr',fld:'VXOSCOLOPR',pic:''},{av:'A12666VxOsCoPrvC',fld:'VXOSCOPRVC',pic:'ZZZZZ9'},{av:'A12667VxOsCoPrvN',fld:'VXOSCOPRVN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7525VxOFabTip'},{av:'Z12372VxOSCod'},{av:'Z12663VxOsCoLi'},{av:'Z12659VxOSCoArtC'},{av:'Z12660VxOSCoLo'},{av:'Z12661VxOsCoArtD'},{av:'Z12662VxOSCoLoPr'},{av:'Z12666VxOsCoPrvC'},{av:'Z12667VxOsCoPrvN'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXOSCOARTC","{handler:'valid_Vxoscoartc',iparms:[{av:'A12659VxOSCoArtC',fld:'VXOSCOARTC',pic:''},{av:'A12661VxOsCoArtD',fld:'VXOSCOARTD',pic:''}]");
      setEventMetadata("VALID_VXOSCOARTC",",oparms:[{av:'A12661VxOsCoArtD',fld:'VXOSCOARTD',pic:''}]}");
      setEventMetadata("VALID_VXOSCOLO","{handler:'valid_Vxoscolo',iparms:[{av:'A12660VxOSCoLo',fld:'VXOSCOLO',pic:''},{av:'A12666VxOsCoPrvC',fld:'VXOSCOPRVC',pic:'ZZZZZ9'},{av:'A12662VxOSCoLoPr',fld:'VXOSCOLOPR',pic:''},{av:'A12667VxOsCoPrvN',fld:'VXOSCOPRVN',pic:''}]");
      setEventMetadata("VALID_VXOSCOLO",",oparms:[{av:'A12662VxOSCoLoPr',fld:'VXOSCOLOPR',pic:''},{av:'A12666VxOsCoPrvC',fld:'VXOSCOPRVC',pic:'ZZZZZ9'},{av:'A12667VxOsCoPrvN',fld:'VXOSCOPRVN',pic:''}]}");
      setEventMetadata("VALID_VXOSCOPRVC","{handler:'valid_Vxoscoprvc',iparms:[]");
      setEventMetadata("VALID_VXOSCOPRVC",",oparms:[]}");
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
      pr_default.close(21);
      pr_default.close(19);
      pr_default.close(18);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z7525VxOFabTip = "" ;
      Z12659VxOSCoArtC = "" ;
      Z12660VxOSCoLo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7525VxOFabTip = "" ;
      A12659VxOSCoArtC = "" ;
      A12660VxOSCoLo = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12661VxOsCoArtD = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12662VxOSCoLoPr = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12667VxOsCoPrvN = "" ;
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
      Z12661VxOsCoArtD = "" ;
      Z12662VxOSCoLoPr = "" ;
      Z12667VxOsCoPrvN = "" ;
      T01KY8_A6638VxProvCod = new int[1] ;
      T01KY8_A12658VxHiLoCod = new String[] {""} ;
      T01KY8_A7420VxArtCod = new String[] {""} ;
      T01KY8_A12663VxOsCoLi = new byte[1] ;
      T01KY8_A12659VxOSCoArtC = new String[] {""} ;
      T01KY8_n12659VxOSCoArtC = new boolean[] {false} ;
      T01KY8_A12660VxOSCoLo = new String[] {""} ;
      T01KY8_n12660VxOSCoLo = new boolean[] {false} ;
      T01KY8_A7525VxOFabTip = new String[] {""} ;
      T01KY8_A12372VxOSCod = new int[1] ;
      T01KY8_A12667VxOsCoPrvN = new String[] {""} ;
      T01KY8_A12662VxOSCoLoPr = new String[] {""} ;
      T01KY8_A12666VxOsCoPrvC = new int[1] ;
      T01KY8_A12661VxOsCoArtD = new String[] {""} ;
      T01KY4_A7525VxOFabTip = new String[] {""} ;
      T01KY7_A12661VxOsCoArtD = new String[] {""} ;
      T01KY6_A12662VxOSCoLoPr = new String[] {""} ;
      T01KY6_A12666VxOsCoPrvC = new int[1] ;
      T01KY5_A12667VxOsCoPrvN = new String[] {""} ;
      T01KY9_A7525VxOFabTip = new String[] {""} ;
      T01KY10_A12661VxOsCoArtD = new String[] {""} ;
      T01KY11_A12662VxOSCoLoPr = new String[] {""} ;
      T01KY11_A12666VxOsCoPrvC = new int[1] ;
      T01KY12_A12667VxOsCoPrvN = new String[] {""} ;
      T01KY13_A7525VxOFabTip = new String[] {""} ;
      T01KY13_A12372VxOSCod = new int[1] ;
      T01KY13_A12663VxOsCoLi = new byte[1] ;
      T01KY3_A12663VxOsCoLi = new byte[1] ;
      T01KY3_A12659VxOSCoArtC = new String[] {""} ;
      T01KY3_n12659VxOSCoArtC = new boolean[] {false} ;
      T01KY3_A12660VxOSCoLo = new String[] {""} ;
      T01KY3_n12660VxOSCoLo = new boolean[] {false} ;
      T01KY3_A7525VxOFabTip = new String[] {""} ;
      T01KY3_A12372VxOSCod = new int[1] ;
      sMode1741 = "" ;
      T01KY14_A7525VxOFabTip = new String[] {""} ;
      T01KY14_A12372VxOSCod = new int[1] ;
      T01KY14_A12663VxOsCoLi = new byte[1] ;
      T01KY15_A7525VxOFabTip = new String[] {""} ;
      T01KY15_A12372VxOSCod = new int[1] ;
      T01KY15_A12663VxOsCoLi = new byte[1] ;
      T01KY2_A12663VxOsCoLi = new byte[1] ;
      T01KY2_A12659VxOSCoArtC = new String[] {""} ;
      T01KY2_n12659VxOSCoArtC = new boolean[] {false} ;
      T01KY2_A12660VxOSCoLo = new String[] {""} ;
      T01KY2_n12660VxOSCoLo = new boolean[] {false} ;
      T01KY2_A7525VxOFabTip = new String[] {""} ;
      T01KY2_A12372VxOSCod = new int[1] ;
      T01KY19_A12661VxOsCoArtD = new String[] {""} ;
      T01KY20_A12662VxOSCoLoPr = new String[] {""} ;
      T01KY20_A12666VxOsCoPrvC = new int[1] ;
      T01KY21_A12667VxOsCoPrvN = new String[] {""} ;
      T01KY22_A7525VxOFabTip = new String[] {""} ;
      T01KY22_A12372VxOSCod = new int[1] ;
      T01KY22_A12663VxOsCoLi = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01KY23_A7525VxOFabTip = new String[] {""} ;
      ZZ7525VxOFabTip = "" ;
      ZZ12659VxOSCoArtC = "" ;
      ZZ12660VxOSCoLo = "" ;
      ZZ12661VxOsCoArtD = "" ;
      ZZ12662VxOSCoLoPr = "" ;
      ZZ12667VxOsCoPrvN = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxosrco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxosrco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxosrco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxosrco__default(),
         new Object[] {
             new Object[] {
            T01KY2_A12663VxOsCoLi, T01KY2_A12659VxOSCoArtC, T01KY2_n12659VxOSCoArtC, T01KY2_A12660VxOSCoLo, T01KY2_n12660VxOSCoLo, T01KY2_A7525VxOFabTip, T01KY2_A12372VxOSCod
            }
            , new Object[] {
            T01KY3_A12663VxOsCoLi, T01KY3_A12659VxOSCoArtC, T01KY3_n12659VxOSCoArtC, T01KY3_A12660VxOSCoLo, T01KY3_n12660VxOSCoLo, T01KY3_A7525VxOFabTip, T01KY3_A12372VxOSCod
            }
            , new Object[] {
            T01KY4_A7525VxOFabTip
            }
            , new Object[] {
            T01KY5_A12667VxOsCoPrvN
            }
            , new Object[] {
            T01KY6_A12662VxOSCoLoPr, T01KY6_A12666VxOsCoPrvC, T01KY6_A12666VxOsCoPrvC
            }
            , new Object[] {
            T01KY7_A12661VxOsCoArtD
            }
            , new Object[] {
            T01KY8_A6638VxProvCod, T01KY8_A12658VxHiLoCod, T01KY8_A7420VxArtCod, T01KY8_A12663VxOsCoLi, T01KY8_A12659VxOSCoArtC, T01KY8_n12659VxOSCoArtC, T01KY8_A12660VxOSCoLo, T01KY8_n12660VxOSCoLo, T01KY8_A7525VxOFabTip, T01KY8_A12372VxOSCod,
            T01KY8_A12667VxOsCoPrvN, T01KY8_A12662VxOSCoLoPr, T01KY8_A12666VxOsCoPrvC, T01KY8_A12661VxOsCoArtD, T01KY8_A12666VxOsCoPrvC
            }
            , new Object[] {
            T01KY9_A7525VxOFabTip
            }
            , new Object[] {
            T01KY10_A12661VxOsCoArtD
            }
            , new Object[] {
            T01KY11_A12662VxOSCoLoPr, T01KY11_A12666VxOsCoPrvC
            }
            , new Object[] {
            T01KY12_A12667VxOsCoPrvN
            }
            , new Object[] {
            T01KY13_A7525VxOFabTip, T01KY13_A12372VxOSCod, T01KY13_A12663VxOsCoLi
            }
            , new Object[] {
            T01KY14_A7525VxOFabTip, T01KY14_A12372VxOSCod, T01KY14_A12663VxOsCoLi
            }
            , new Object[] {
            T01KY15_A7525VxOFabTip, T01KY15_A12372VxOSCod, T01KY15_A12663VxOsCoLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KY19_A12661VxOsCoArtD
            }
            , new Object[] {
            T01KY20_A12662VxOSCoLoPr, T01KY20_A12666VxOsCoPrvC
            }
            , new Object[] {
            T01KY21_A12667VxOsCoPrvN
            }
            , new Object[] {
            T01KY22_A7525VxOFabTip, T01KY22_A12372VxOSCod, T01KY22_A12663VxOsCoLi
            }
            , new Object[] {
            T01KY23_A7525VxOFabTip
            }
         }
      );
   }

   private byte Z12663VxOsCoLi ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12663VxOsCoLi ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12663VxOsCoLi ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1741 ;
   private short nIsDirty_1741 ;
   private int Z12372VxOSCod ;
   private int A12372VxOSCod ;
   private int A12666VxOsCoPrvC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxOFabTip_Enabled ;
   private int edtVxOSCod_Enabled ;
   private int edtVxOsCoLi_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxOSCoArtC_Enabled ;
   private int edtVxOSCoLo_Enabled ;
   private int edtVxOsCoArtD_Enabled ;
   private int edtVxOSCoLoPr_Enabled ;
   private int edtVxOsCoPrvC_Enabled ;
   private int edtVxOsCoPrvN_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int Z12666VxOsCoPrvC ;
   private int idxLst ;
   private int edtVxOsCoPrvN_Backcolor ;
   private int edtVxOsCoPrvC_Backcolor ;
   private int edtVxOSCoLoPr_Backcolor ;
   private int edtVxOsCoArtD_Backcolor ;
   private int edtVxOSCoLo_Backcolor ;
   private int edtVxOSCoArtC_Backcolor ;
   private int edtVxOsCoLi_Backcolor ;
   private int edtVxOSCod_Backcolor ;
   private int edtVxOFabTip_Backcolor ;
   private int ZZ12372VxOSCod ;
   private int ZZ12666VxOsCoPrvC ;
   private String sPrefix ;
   private String Z7525VxOFabTip ;
   private String Z12659VxOSCoArtC ;
   private String Z12660VxOSCoLo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7525VxOFabTip ;
   private String A12659VxOSCoArtC ;
   private String A12660VxOSCoLo ;
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
   private String edtVxOFabTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxOSCod_Internalname ;
   private String edtVxOSCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxOsCoLi_Internalname ;
   private String edtVxOsCoLi_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxOSCoArtC_Internalname ;
   private String edtVxOSCoArtC_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxOSCoLo_Internalname ;
   private String edtVxOSCoLo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxOsCoArtD_Internalname ;
   private String A12661VxOsCoArtD ;
   private String edtVxOsCoArtD_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxOSCoLoPr_Internalname ;
   private String A12662VxOSCoLoPr ;
   private String edtVxOSCoLoPr_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxOsCoPrvC_Internalname ;
   private String edtVxOsCoPrvC_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVxOsCoPrvN_Internalname ;
   private String A12667VxOsCoPrvN ;
   private String edtVxOsCoPrvN_Jsonclick ;
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
   private String Z12661VxOsCoArtD ;
   private String Z12662VxOSCoLoPr ;
   private String Z12667VxOsCoPrvN ;
   private String sMode1741 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ7525VxOFabTip ;
   private String ZZ12659VxOSCoArtC ;
   private String ZZ12660VxOSCoLo ;
   private String ZZ12661VxOsCoArtD ;
   private String ZZ12662VxOSCoLoPr ;
   private String ZZ12667VxOsCoPrvN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n12659VxOSCoArtC ;
   private boolean n12660VxOSCoLo ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] T01KY8_A6638VxProvCod ;
   private String[] T01KY8_A12658VxHiLoCod ;
   private String[] T01KY8_A7420VxArtCod ;
   private byte[] T01KY8_A12663VxOsCoLi ;
   private String[] T01KY8_A12659VxOSCoArtC ;
   private boolean[] T01KY8_n12659VxOSCoArtC ;
   private String[] T01KY8_A12660VxOSCoLo ;
   private boolean[] T01KY8_n12660VxOSCoLo ;
   private String[] T01KY8_A7525VxOFabTip ;
   private int[] T01KY8_A12372VxOSCod ;
   private String[] T01KY8_A12667VxOsCoPrvN ;
   private String[] T01KY8_A12662VxOSCoLoPr ;
   private int[] T01KY8_A12666VxOsCoPrvC ;
   private String[] T01KY8_A12661VxOsCoArtD ;
   private String[] T01KY4_A7525VxOFabTip ;
   private String[] T01KY7_A12661VxOsCoArtD ;
   private String[] T01KY6_A12662VxOSCoLoPr ;
   private int[] T01KY6_A12666VxOsCoPrvC ;
   private String[] T01KY5_A12667VxOsCoPrvN ;
   private String[] T01KY9_A7525VxOFabTip ;
   private String[] T01KY10_A12661VxOsCoArtD ;
   private String[] T01KY11_A12662VxOSCoLoPr ;
   private int[] T01KY11_A12666VxOsCoPrvC ;
   private String[] T01KY12_A12667VxOsCoPrvN ;
   private String[] T01KY13_A7525VxOFabTip ;
   private int[] T01KY13_A12372VxOSCod ;
   private byte[] T01KY13_A12663VxOsCoLi ;
   private byte[] T01KY3_A12663VxOsCoLi ;
   private String[] T01KY3_A12659VxOSCoArtC ;
   private boolean[] T01KY3_n12659VxOSCoArtC ;
   private String[] T01KY3_A12660VxOSCoLo ;
   private boolean[] T01KY3_n12660VxOSCoLo ;
   private String[] T01KY3_A7525VxOFabTip ;
   private int[] T01KY3_A12372VxOSCod ;
   private String[] T01KY14_A7525VxOFabTip ;
   private int[] T01KY14_A12372VxOSCod ;
   private byte[] T01KY14_A12663VxOsCoLi ;
   private String[] T01KY15_A7525VxOFabTip ;
   private int[] T01KY15_A12372VxOSCod ;
   private byte[] T01KY15_A12663VxOsCoLi ;
   private byte[] T01KY2_A12663VxOsCoLi ;
   private String[] T01KY2_A12659VxOSCoArtC ;
   private boolean[] T01KY2_n12659VxOSCoArtC ;
   private String[] T01KY2_A12660VxOSCoLo ;
   private boolean[] T01KY2_n12660VxOSCoLo ;
   private String[] T01KY2_A7525VxOFabTip ;
   private int[] T01KY2_A12372VxOSCod ;
   private String[] T01KY19_A12661VxOsCoArtD ;
   private String[] T01KY20_A12662VxOSCoLoPr ;
   private int[] T01KY20_A12666VxOsCoPrvC ;
   private String[] T01KY21_A12667VxOsCoPrvN ;
   private String[] T01KY22_A7525VxOFabTip ;
   private int[] T01KY22_A12372VxOSCod ;
   private byte[] T01KY22_A12663VxOsCoLi ;
   private String[] T01KY23_A7525VxOFabTip ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxosrco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KY2", "SELECT OSCoLin, OSCoArtCod, OSCoLoCod, OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERCO WHERE OFabTip = ? AND OSCod = ? AND OSCoLin = ?  FOR UPDATE OF OSCoArtCod, OSCoLoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY3", "SELECT OSCoLin, OSCoArtCod, OSCoLoCod, OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERCO WHERE OFabTip = ? AND OSCod = ? AND OSCoLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY4", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY5", "SELECT COALESCE( PrvNom, '') AS VxOsCoPrvN FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY6", "SELECT COALESCE( HiLoPrvLo, '') AS VxOSCoLoPr, COALESCE( HiLoPrvCod, 0) AS VxOsCoPrvC, HiLoPrvCod AS VxOsCoPrvC FROM VTXHILOTES WHERE HiLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY7", "SELECT COALESCE( artdsc, '') AS VxOsCoArtD FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY8", "SELECT /*+ FIRST_ROWS(100) */ T4.prvcod AS VxProvCod, T3.HiLoCod AS VxHiLoCod, T2.ArtCod AS VxArtCod, TM1.OSCoLin, TM1.OSCoArtCod, TM1.OSCoLoCod, TM1.OFabTip AS VxOFabTip, TM1.OSCod AS VxOSCod, COALESCE( T4.PrvNom, '') AS VxOsCoPrvN, COALESCE( T3.HiLoPrvLo, '') AS VxOSCoLoPr, COALESCE( T3.HiLoPrvCod, 0) AS VxOsCoPrvC, COALESCE( T2.artdsc, '') AS VxOsCoArtD, T3.HiLoPrvCod AS VxOsCoPrvC FROM (((VTXOSERCO TM1 LEFT JOIN VTXARTIC T2 ON T2.ArtCod = TM1.OSCoArtCod) LEFT JOIN VTXHILOTES T3 ON T3.HiLoCod = TM1.OSCoLoCod) LEFT JOIN VTXPROVEED T4 ON T4.prvcod = T3.HiLoPrvCod) WHERE TM1.OFabTip = ? and TM1.OSCod = ? and TM1.OSCoLin = ? ORDER BY TM1.OFabTip, TM1.OSCod, TM1.OSCoLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY9", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY10", "SELECT COALESCE( artdsc, '') AS VxOsCoArtD FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY11", "SELECT COALESCE( HiLoPrvLo, '') AS VxOSCoLoPr, HiLoPrvCod AS VxOsCoPrvC FROM VTXHILOTES WHERE HiLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY12", "SELECT COALESCE( PrvNom, '') AS VxOsCoPrvN FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY13", "SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSCoLin FROM VTXOSERCO WHERE OFabTip = ? AND OSCod = ? AND OSCoLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSCoLin FROM VTXOSERCO WHERE ( OFabTip > ? or OFabTip = ? and OSCod > ? or OSCod = ? and OFabTip = ? and OSCoLin > ?) ORDER BY OFabTip, OSCod, OSCoLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KY15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSCoLin FROM VTXOSERCO WHERE ( OFabTip < ? or OFabTip = ? and OSCod < ? or OSCod = ? and OFabTip = ? and OSCoLin < ?) ORDER BY OFabTip DESC, OSCod DESC, OSCoLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KY16", "INSERT INTO VTXOSERCO(OSCoLin, OSCoArtCod, OSCoLoCod, OFabTip, OSCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "VTXOSERCO")
         ,new UpdateCursor("T01KY17", "UPDATE VTXOSERCO SET OSCoArtCod=?, OSCoLoCod=?  WHERE OFabTip = ? AND OSCod = ? AND OSCoLin = ?", GX_NOMASK, "VTXOSERCO")
         ,new UpdateCursor("T01KY18", "DELETE FROM VTXOSERCO  WHERE OFabTip = ? AND OSCod = ? AND OSCoLin = ?", GX_NOMASK, "VTXOSERCO")
         ,new ForEachCursor("T01KY19", "SELECT COALESCE( artdsc, '') AS VxOsCoArtD FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY20", "SELECT COALESCE( HiLoPrvLo, '') AS VxOSCoLoPr, HiLoPrvCod AS VxOsCoPrvC FROM VTXHILOTES WHERE HiLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY21", "SELECT COALESCE( PrvNom, '') AS VxOsCoPrvN FROM VTXPROVEED WHERE prvcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY22", "SELECT /*+ FIRST_ROWS(100) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSCoLin FROM VTXOSERCO ORDER BY OFabTip, OSCod, OSCoLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KY23", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 2);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               stmt.setString(4, (String)parms[5], 2);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               stmt.setString(3, (String)parms[4], 2);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

