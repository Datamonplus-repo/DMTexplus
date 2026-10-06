package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxosrvi_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"VXOSPEDOBS") == 0 )
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
         gx1asavxospedobs1KC1717( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"VXOSPEDNOF") == 0 )
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
         gx2asavxospednof1KC1717( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"VXOSPEDERP") == 0 )
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
         gx3asavxospederp1KC1717( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"VXOSCLIDES") == 0 )
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
         gx4asavxosclides1KC1717( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A6826VXCliCod = (int)(GXutil.lval( httpContext.GetPar( "VXCliCod"))) ;
         n6826VXCliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A6826VXCliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
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
         gxload_7( A7420VxArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura OServi en VERTEX", ""), (short)(0)) ;
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

   public tvxosrvi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxosrvi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxosrvi_impl.class ));
   }

   public tvxosrvi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxOSRVI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "O. Fabricación", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOFabTip_Internalname, GXutil.rtrim( A7525VxOFabTip), GXutil.rtrim( localUtil.format( A7525VxOFabTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOFabTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxOFabTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "OSERVIOSCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "OSERVIOSTanda Nro", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSTandaN_Internalname, GXutil.ltrim( localUtil.ntoc( A12374VxOSTandaN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOSTandaN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12374VxOSTandaN), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12374VxOSTandaN), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSTandaN_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSTandaN_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nro. Pedido Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsNPedCl_Internalname, GXutil.rtrim( A12452VxOsNPedCl), GXutil.rtrim( localUtil.format( A12452VxOsNPedCl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsNPedCl_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsNPedCl_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Campo auxiliar", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSAux1_Internalname, GXutil.rtrim( A12882VxOSAux1), GXutil.rtrim( localUtil.format( A12882VxOSAux1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSAux1_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSAux1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Costo por Kilo (Tejed)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCosKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12884VxOSCosKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOSCosKg_Enabled!=0) ? localUtil.format( A12884VxOSCosKg, "ZZZZZ9.99") : localUtil.format( A12884VxOSCosKg, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCosKg_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCosKg_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Origen Registro", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXOSOriR_Internalname, GXutil.rtrim( A12904VXOSOriR), GXutil.rtrim( localUtil.format( A12904VXOSOriR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXOSOriR_Jsonclick, 0, "", "", "", "", "", 1, edtVXOSOriR_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXOSRef_Internalname, GXutil.ltrim( localUtil.ntoc( A12903VXOSRef, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXOSRef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12903VXOSRef), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12903VXOSRef), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXOSRef_Jsonclick, 0, "", "", "", "", "", 1, edtVXOSRef_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fin Previsto", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVXOSFinPr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXOSFinPr_Internalname, localUtil.format(A12948VXOSFinPr, "99/99/99"), localUtil.format( A12948VXOSFinPr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXOSFinPr_Jsonclick, 0, "", "", "", "", "", 1, edtVXOSFinPr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVXOSFinPr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVXOSFinPr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Indica si es HR de Estamp", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxHRPGN_Internalname, GXutil.rtrim( A12978VxHRPGN), GXutil.rtrim( localUtil.format( A12978VxHRPGN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxHRPGN_Jsonclick, 0, "", "", "", "", "", 1, edtVxHRPGN_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXOSDibCli_Internalname, GXutil.rtrim( A12979VXOSDibCli), GXutil.rtrim( localUtil.format( A12979VXOSDibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXOSDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtVXOSDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXOSDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A12980VXOSDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXOSDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12980VXOSDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12980VXOSDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXOSDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtVXOSDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Código de Cliente", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6826VXCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6826VXCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6826VXCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtVXCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Código Artículo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCod_Internalname, GXutil.rtrim( A7420VxArtCod), GXutil.rtrim( localUtil.format( A7420VxArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtVxOsObs_Internalname, GXutil.rtrim( A12984VxOsObs), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", (short)(0), 1, edtVxOsObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TVxOSRVI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRVI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxOSRVI.htm");
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
      e111KC2 ();
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
            Z12374VxOSTandaN = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12374VxOSTandaN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12452VxOsNPedCl = httpContext.cgiGet( "Z12452VxOsNPedCl") ;
            Z12882VxOSAux1 = httpContext.cgiGet( "Z12882VxOSAux1") ;
            Z12884VxOSCosKg = localUtil.ctond( httpContext.cgiGet( "Z12884VxOSCosKg")) ;
            Z12904VXOSOriR = httpContext.cgiGet( "Z12904VXOSOriR") ;
            Z12903VXOSRef = (int)(localUtil.ctol( httpContext.cgiGet( "Z12903VXOSRef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12948VXOSFinPr = localUtil.ctod( httpContext.cgiGet( "Z12948VXOSFinPr"), 0) ;
            Z12978VxHRPGN = httpContext.cgiGet( "Z12978VxHRPGN") ;
            Z12979VXOSDibCli = httpContext.cgiGet( "Z12979VXOSDibCli") ;
            Z12980VXOSDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z12980VXOSDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12984VxOsObs = httpContext.cgiGet( "Z12984VxOsObs") ;
            Z14124VxArtDscL = httpContext.cgiGet( "Z14124VxArtDscL") ;
            Z14127VXOSCodExt = httpContext.cgiGet( "Z14127VXOSCodExt") ;
            Z14126VXOSNecCod = localUtil.ctol( httpContext.cgiGet( "Z14126VXOSNecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z14122VxOsCosKR = localUtil.ctond( httpContext.cgiGet( "Z14122VxOsCosKR")) ;
            Z14123VxOsCosKT = localUtil.ctond( httpContext.cgiGet( "Z14123VxOsCosKT")) ;
            Z14128VxOSCosHR = localUtil.ctond( httpContext.cgiGet( "Z14128VxOSCosHR")) ;
            Z14136VxOSTotUni = (int)(localUtil.ctol( httpContext.cgiGet( "Z14136VxOSTotUni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14135VxOSRsvPt = (short)(localUtil.ctol( httpContext.cgiGet( "Z14135VxOSRsvPt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14137VxOSUniMed = httpContext.cgiGet( "Z14137VxOSUniMed") ;
            Z11764VxFTecNr = (short)(localUtil.ctol( httpContext.cgiGet( "Z11764VxFTecNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6826VXCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6826VXCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7420VxArtCod = httpContext.cgiGet( "Z7420VxArtCod") ;
            A14124VxArtDscL = httpContext.cgiGet( "Z14124VxArtDscL") ;
            A14127VXOSCodExt = httpContext.cgiGet( "Z14127VXOSCodExt") ;
            A14126VXOSNecCod = localUtil.ctol( httpContext.cgiGet( "Z14126VXOSNecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14122VxOsCosKR = localUtil.ctond( httpContext.cgiGet( "Z14122VxOsCosKR")) ;
            n14122VxOsCosKR = false ;
            A14123VxOsCosKT = localUtil.ctond( httpContext.cgiGet( "Z14123VxOsCosKT")) ;
            n14123VxOsCosKT = false ;
            A14128VxOSCosHR = localUtil.ctond( httpContext.cgiGet( "Z14128VxOSCosHR")) ;
            n14128VxOSCosHR = false ;
            A14136VxOSTotUni = (int)(localUtil.ctol( httpContext.cgiGet( "Z14136VxOSTotUni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14136VxOSTotUni = false ;
            A14135VxOSRsvPt = (short)(localUtil.ctol( httpContext.cgiGet( "Z14135VxOSRsvPt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14137VxOSUniMed = httpContext.cgiGet( "Z14137VxOSUniMed") ;
            n14137VxOSUniMed = false ;
            A11764VxFTecNr = (short)(localUtil.ctol( httpContext.cgiGet( "Z11764VxFTecNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11764VxFTecNr = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A14131VxOspedObs = httpContext.cgiGet( "VXOSPEDOBS") ;
            A14130VXOsPedNOf = (int)(localUtil.ctol( httpContext.cgiGet( "VXOSPEDNOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14129VXOsPedERP = localUtil.ctol( httpContext.cgiGet( "VXOSPEDERP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14125VxOsCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "VXOSCLIDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14124VxArtDscL = httpContext.cgiGet( "VXARTDSCL") ;
            A14127VXOSCodExt = httpContext.cgiGet( "VXOSCODEXT") ;
            A14126VXOSNecCod = localUtil.ctol( httpContext.cgiGet( "VXOSNECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14122VxOsCosKR = localUtil.ctond( httpContext.cgiGet( "VXOSCOSKR")) ;
            A14123VxOsCosKT = localUtil.ctond( httpContext.cgiGet( "VXOSCOSKT")) ;
            A14128VxOSCosHR = localUtil.ctond( httpContext.cgiGet( "VXOSCOSHR")) ;
            A14136VxOSTotUni = (int)(localUtil.ctol( httpContext.cgiGet( "VXOSTOTUNI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14135VxOSRsvPt = (short)(localUtil.ctol( httpContext.cgiGet( "VXOSRSVPT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14137VxOSUniMed = httpContext.cgiGet( "VXOSUNIMED") ;
            A11764VxFTecNr = (short)(localUtil.ctol( httpContext.cgiGet( "VXFTECNR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12977VXAcaArt = httpContext.cgiGet( "VXACAART") ;
            n12977VXAcaArt = false ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSTandaN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSTandaN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSTANDAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOSTandaN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12374VxOSTandaN = (byte)(0) ;
               n12374VxOSTandaN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12374VxOSTandaN), 2, 0));
            }
            else
            {
               A12374VxOSTandaN = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxOSTandaN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12374VxOSTandaN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12374VxOSTandaN), 2, 0));
            }
            A12452VxOsNPedCl = httpContext.cgiGet( edtVxOsNPedCl_Internalname) ;
            n12452VxOsNPedCl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12452VxOsNPedCl", A12452VxOsNPedCl);
            A12882VxOSAux1 = httpContext.cgiGet( edtVxOSAux1_Internalname) ;
            n12882VxOSAux1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12882VxOSAux1", A12882VxOSAux1);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxOSCosKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxOSCosKg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOSKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOSCosKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12884VxOSCosKg = DecimalUtil.ZERO ;
               n12884VxOSCosKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrimstr( A12884VxOSCosKg, 9, 2));
            }
            else
            {
               A12884VxOSCosKg = localUtil.ctond( httpContext.cgiGet( edtVxOSCosKg_Internalname)) ;
               n12884VxOSCosKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrimstr( A12884VxOSCosKg, 9, 2));
            }
            A12904VXOSOriR = httpContext.cgiGet( edtVXOSOriR_Internalname) ;
            n12904VXOSOriR = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12904VXOSOriR", A12904VXOSOriR);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXOSRef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXOSRef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSREF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVXOSRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12903VXOSRef = 0 ;
               n12903VXOSRef = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12903VXOSRef), 8, 0));
            }
            else
            {
               A12903VXOSRef = (int)(localUtil.ctol( httpContext.cgiGet( edtVXOSRef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12903VXOSRef = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12903VXOSRef), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtVXOSFinPr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VXOSFINPR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVXOSFinPr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12948VXOSFinPr = GXutil.nullDate() ;
               n12948VXOSFinPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
            }
            else
            {
               A12948VXOSFinPr = localUtil.ctod( httpContext.cgiGet( edtVXOSFinPr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12948VXOSFinPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
            }
            A12978VxHRPGN = httpContext.cgiGet( edtVxHRPGN_Internalname) ;
            n12978VxHRPGN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12978VxHRPGN", A12978VxHRPGN);
            A12979VXOSDibCli = httpContext.cgiGet( edtVXOSDibCli_Internalname) ;
            n12979VXOSDibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12979VXOSDibCli", A12979VXOSDibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXOSDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXOSDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSDIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVXOSDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12980VXOSDibInt = 0 ;
               n12980VXOSDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12980VXOSDibInt), 8, 0));
            }
            else
            {
               A12980VXOSDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtVXOSDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12980VXOSDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12980VXOSDibInt), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVXCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6826VXCliCod = 0 ;
               n6826VXCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
            }
            else
            {
               A6826VXCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6826VXCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
            }
            A7420VxArtCod = httpContext.cgiGet( edtVxArtCod_Internalname) ;
            n7420VxArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            A12984VxOsObs = httpContext.cgiGet( edtVxOsObs_Internalname) ;
            n12984VxOsObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12984VxOsObs", A12984VxOsObs);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TVxOSRVI");
            forbiddenHiddens.add("VxArtDscL", GXutil.rtrim( localUtil.format( A14124VxArtDscL, "")));
            forbiddenHiddens.add("VXOSCodExt", GXutil.rtrim( localUtil.format( A14127VXOSCodExt, "")));
            forbiddenHiddens.add("VXOSNecCod", localUtil.format( DecimalUtil.doubleToDec(A14126VXOSNecCod), "ZZZZZZZZZZZ9"));
            forbiddenHiddens.add("VxOsCosKR", localUtil.format( A14122VxOsCosKR, "ZZZZZ9.99"));
            forbiddenHiddens.add("VxOsCosKT", localUtil.format( A14123VxOsCosKT, "ZZZZZ9.99"));
            forbiddenHiddens.add("VxOSCosHR", localUtil.format( A14128VxOSCosHR, "ZZZZZZZZ9.99"));
            forbiddenHiddens.add("VxOSTotUni", localUtil.format( DecimalUtil.doubleToDec(A14136VxOSTotUni), "ZZZZZ9"));
            forbiddenHiddens.add("VxOSRsvPt", localUtil.format( DecimalUtil.doubleToDec(A14135VxOSRsvPt), "ZZZ9"));
            forbiddenHiddens.add("VxOSUniMed", GXutil.rtrim( localUtil.format( A14137VxOSUniMed, "")));
            forbiddenHiddens.add("VxFTecNr", localUtil.format( DecimalUtil.doubleToDec(A11764VxFTecNr), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tvxosrvi:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
                        e111KC2 ();
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
            initAll1KC1717( ) ;
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
      disableAttributes1KC1717( ) ;
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

   public void confirm_1KC0( )
   {
      beforeValidate1KC1717( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KC1717( ) ;
         }
         else
         {
            checkExtendedTable1KC1717( ) ;
            if ( AnyError == 0 )
            {
               zm1KC1717( 6) ;
               zm1KC1717( 7) ;
            }
            closeExtendedTableCursors1KC1717( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KC0( ) ;
      }
   }

   public void resetCaption1KC0( )
   {
   }

   public void e111KC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1KC1717( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12374VxOSTandaN = T01KC3_A12374VxOSTandaN[0] ;
            Z12452VxOsNPedCl = T01KC3_A12452VxOsNPedCl[0] ;
            Z12882VxOSAux1 = T01KC3_A12882VxOSAux1[0] ;
            Z12884VxOSCosKg = T01KC3_A12884VxOSCosKg[0] ;
            Z12904VXOSOriR = T01KC3_A12904VXOSOriR[0] ;
            Z12903VXOSRef = T01KC3_A12903VXOSRef[0] ;
            Z12948VXOSFinPr = T01KC3_A12948VXOSFinPr[0] ;
            Z12978VxHRPGN = T01KC3_A12978VxHRPGN[0] ;
            Z12979VXOSDibCli = T01KC3_A12979VXOSDibCli[0] ;
            Z12980VXOSDibInt = T01KC3_A12980VXOSDibInt[0] ;
            Z12984VxOsObs = T01KC3_A12984VxOsObs[0] ;
            Z14124VxArtDscL = T01KC3_A14124VxArtDscL[0] ;
            Z14127VXOSCodExt = T01KC3_A14127VXOSCodExt[0] ;
            Z14126VXOSNecCod = T01KC3_A14126VXOSNecCod[0] ;
            Z14122VxOsCosKR = T01KC3_A14122VxOsCosKR[0] ;
            Z14123VxOsCosKT = T01KC3_A14123VxOsCosKT[0] ;
            Z14128VxOSCosHR = T01KC3_A14128VxOSCosHR[0] ;
            Z14136VxOSTotUni = T01KC3_A14136VxOSTotUni[0] ;
            Z14135VxOSRsvPt = T01KC3_A14135VxOSRsvPt[0] ;
            Z14137VxOSUniMed = T01KC3_A14137VxOSUniMed[0] ;
            Z11764VxFTecNr = T01KC3_A11764VxFTecNr[0] ;
            Z6826VXCliCod = T01KC3_A6826VXCliCod[0] ;
            Z7420VxArtCod = T01KC3_A7420VxArtCod[0] ;
         }
         else
         {
            Z12374VxOSTandaN = A12374VxOSTandaN ;
            Z12452VxOsNPedCl = A12452VxOsNPedCl ;
            Z12882VxOSAux1 = A12882VxOSAux1 ;
            Z12884VxOSCosKg = A12884VxOSCosKg ;
            Z12904VXOSOriR = A12904VXOSOriR ;
            Z12903VXOSRef = A12903VXOSRef ;
            Z12948VXOSFinPr = A12948VXOSFinPr ;
            Z12978VxHRPGN = A12978VxHRPGN ;
            Z12979VXOSDibCli = A12979VXOSDibCli ;
            Z12980VXOSDibInt = A12980VXOSDibInt ;
            Z12984VxOsObs = A12984VxOsObs ;
            Z14124VxArtDscL = A14124VxArtDscL ;
            Z14127VXOSCodExt = A14127VXOSCodExt ;
            Z14126VXOSNecCod = A14126VXOSNecCod ;
            Z14122VxOsCosKR = A14122VxOsCosKR ;
            Z14123VxOsCosKT = A14123VxOsCosKT ;
            Z14128VxOSCosHR = A14128VxOSCosHR ;
            Z14136VxOSTotUni = A14136VxOSTotUni ;
            Z14135VxOSRsvPt = A14135VxOSRsvPt ;
            Z14137VxOSUniMed = A14137VxOSUniMed ;
            Z11764VxFTecNr = A11764VxFTecNr ;
            Z6826VXCliCod = A6826VXCliCod ;
            Z7420VxArtCod = A7420VxArtCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         Z12374VxOSTandaN = A12374VxOSTandaN ;
         Z12452VxOsNPedCl = A12452VxOsNPedCl ;
         Z12882VxOSAux1 = A12882VxOSAux1 ;
         Z12884VxOSCosKg = A12884VxOSCosKg ;
         Z12904VXOSOriR = A12904VXOSOriR ;
         Z12903VXOSRef = A12903VXOSRef ;
         Z12948VXOSFinPr = A12948VXOSFinPr ;
         Z12978VxHRPGN = A12978VxHRPGN ;
         Z12979VXOSDibCli = A12979VXOSDibCli ;
         Z12980VXOSDibInt = A12980VXOSDibInt ;
         Z12984VxOsObs = A12984VxOsObs ;
         Z14124VxArtDscL = A14124VxArtDscL ;
         Z14127VXOSCodExt = A14127VXOSCodExt ;
         Z14126VXOSNecCod = A14126VXOSNecCod ;
         Z14122VxOsCosKR = A14122VxOsCosKR ;
         Z14123VxOsCosKT = A14123VxOsCosKT ;
         Z14128VxOSCosHR = A14128VxOSCosHR ;
         Z14136VxOSTotUni = A14136VxOSTotUni ;
         Z14135VxOSRsvPt = A14135VxOSRsvPt ;
         Z14137VxOSUniMed = A14137VxOSUniMed ;
         Z11764VxFTecNr = A11764VxFTecNr ;
         Z6826VXCliCod = A6826VXCliCod ;
         Z7420VxArtCod = A7420VxArtCod ;
         Z12977VXAcaArt = A12977VXAcaArt ;
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

   public void load1KC1717( )
   {
      /* Using cursor T01KC6 */
      pr_default.execute(4, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1717 = (short)(1) ;
         A12374VxOSTandaN = T01KC6_A12374VxOSTandaN[0] ;
         n12374VxOSTandaN = T01KC6_n12374VxOSTandaN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12374VxOSTandaN), 2, 0));
         A12452VxOsNPedCl = T01KC6_A12452VxOsNPedCl[0] ;
         n12452VxOsNPedCl = T01KC6_n12452VxOsNPedCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12452VxOsNPedCl", A12452VxOsNPedCl);
         A12882VxOSAux1 = T01KC6_A12882VxOSAux1[0] ;
         n12882VxOSAux1 = T01KC6_n12882VxOSAux1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12882VxOSAux1", A12882VxOSAux1);
         A12884VxOSCosKg = T01KC6_A12884VxOSCosKg[0] ;
         n12884VxOSCosKg = T01KC6_n12884VxOSCosKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrimstr( A12884VxOSCosKg, 9, 2));
         A12904VXOSOriR = T01KC6_A12904VXOSOriR[0] ;
         n12904VXOSOriR = T01KC6_n12904VXOSOriR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12904VXOSOriR", A12904VXOSOriR);
         A12903VXOSRef = T01KC6_A12903VXOSRef[0] ;
         n12903VXOSRef = T01KC6_n12903VXOSRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12903VXOSRef), 8, 0));
         A12948VXOSFinPr = T01KC6_A12948VXOSFinPr[0] ;
         n12948VXOSFinPr = T01KC6_n12948VXOSFinPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
         A12978VxHRPGN = T01KC6_A12978VxHRPGN[0] ;
         n12978VxHRPGN = T01KC6_n12978VxHRPGN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12978VxHRPGN", A12978VxHRPGN);
         A12979VXOSDibCli = T01KC6_A12979VXOSDibCli[0] ;
         n12979VXOSDibCli = T01KC6_n12979VXOSDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12979VXOSDibCli", A12979VXOSDibCli);
         A12980VXOSDibInt = T01KC6_A12980VXOSDibInt[0] ;
         n12980VXOSDibInt = T01KC6_n12980VXOSDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12980VXOSDibInt), 8, 0));
         A12984VxOsObs = T01KC6_A12984VxOsObs[0] ;
         n12984VxOsObs = T01KC6_n12984VxOsObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12984VxOsObs", A12984VxOsObs);
         A12977VXAcaArt = T01KC6_A12977VXAcaArt[0] ;
         n12977VXAcaArt = T01KC6_n12977VXAcaArt[0] ;
         A14124VxArtDscL = T01KC6_A14124VxArtDscL[0] ;
         A14127VXOSCodExt = T01KC6_A14127VXOSCodExt[0] ;
         A14126VXOSNecCod = T01KC6_A14126VXOSNecCod[0] ;
         A14122VxOsCosKR = T01KC6_A14122VxOsCosKR[0] ;
         n14122VxOsCosKR = T01KC6_n14122VxOsCosKR[0] ;
         A14123VxOsCosKT = T01KC6_A14123VxOsCosKT[0] ;
         n14123VxOsCosKT = T01KC6_n14123VxOsCosKT[0] ;
         A14128VxOSCosHR = T01KC6_A14128VxOSCosHR[0] ;
         n14128VxOSCosHR = T01KC6_n14128VxOSCosHR[0] ;
         A14136VxOSTotUni = T01KC6_A14136VxOSTotUni[0] ;
         n14136VxOSTotUni = T01KC6_n14136VxOSTotUni[0] ;
         A14135VxOSRsvPt = T01KC6_A14135VxOSRsvPt[0] ;
         A14137VxOSUniMed = T01KC6_A14137VxOSUniMed[0] ;
         n14137VxOSUniMed = T01KC6_n14137VxOSUniMed[0] ;
         A11764VxFTecNr = T01KC6_A11764VxFTecNr[0] ;
         n11764VxFTecNr = T01KC6_n11764VxFTecNr[0] ;
         A6826VXCliCod = T01KC6_A6826VXCliCod[0] ;
         n6826VXCliCod = T01KC6_n6826VXCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         A7420VxArtCod = T01KC6_A7420VxArtCod[0] ;
         n7420VxArtCod = T01KC6_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         zm1KC1717( -5) ;
      }
      pr_default.close(4);
      onLoadActions1KC1717( ) ;
   }

   public void onLoadActions1KC1717( )
   {
      GXt_char1 = A14131VxOspedObs ;
      GXv_char2[0] = GXt_char1 ;
      new app.rvxospedobs(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_char2) ;
      tvxosrvi_impl.this.GXt_char1 = GXv_char2[0] ;
      A14131VxOspedObs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
      GXt_int3 = A14130VXOsPedNOf ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxospnof(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14130VXOsPedNOf = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14130VXOsPedNOf), 8, 0));
      GXt_int5 = A14129VXOsPedERP ;
      GXv_int6[0] = GXt_int5 ;
      new app.rvxoserp(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int6) ;
      tvxosrvi_impl.this.GXt_int5 = GXv_int6[0] ;
      A14129VXOsPedERP = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14129VXOsPedERP), 12, 0));
      GXt_int3 = A14125VxOsCliDes ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxosclides(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14125VxOsCliDes = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14125VxOsCliDes), 6, 0));
   }

   public void checkExtendedTable1KC1717( )
   {
      nIsDirty_1717 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1717 = (short)(1) ;
      GXt_char1 = A14131VxOspedObs ;
      GXv_char2[0] = GXt_char1 ;
      new app.rvxospedobs(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_char2) ;
      tvxosrvi_impl.this.GXt_char1 = GXv_char2[0] ;
      A14131VxOspedObs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
      nIsDirty_1717 = (short)(1) ;
      GXt_int3 = A14130VXOsPedNOf ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxospnof(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14130VXOsPedNOf = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14130VXOsPedNOf), 8, 0));
      nIsDirty_1717 = (short)(1) ;
      GXt_int5 = A14129VXOsPedERP ;
      GXv_int6[0] = GXt_int5 ;
      new app.rvxoserp(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int6) ;
      tvxosrvi_impl.this.GXt_int5 = GXv_int6[0] ;
      A14129VXOsPedERP = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14129VXOsPedERP), 12, 0));
      nIsDirty_1717 = (short)(1) ;
      GXt_int3 = A14125VxOsCliDes ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxosclides(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14125VxOsCliDes = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14125VxOsCliDes), 6, 0));
      /* Using cursor T01KC4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n6826VXCliCod), Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01KC5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12977VXAcaArt = T01KC5_A12977VXAcaArt[0] ;
      n12977VXAcaArt = T01KC5_n12977VXAcaArt[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1KC1717( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( int A6826VXCliCod )
   {
      /* Using cursor T01KC7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n6826VXCliCod), Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
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

   public void gxload_7( String A7420VxArtCod )
   {
      /* Using cursor T01KC8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12977VXAcaArt = T01KC8_A12977VXAcaArt[0] ;
      n12977VXAcaArt = T01KC8_n12977VXAcaArt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12977VXAcaArt))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1KC1717( )
   {
      /* Using cursor T01KC9 */
      pr_default.execute(7, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1717 = (short)(1) ;
      }
      else
      {
         RcdFound1717 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KC3 */
      pr_default.execute(1, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KC1717( 5) ;
         RcdFound1717 = (short)(1) ;
         A7525VxOFabTip = T01KC3_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KC3_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A12374VxOSTandaN = T01KC3_A12374VxOSTandaN[0] ;
         n12374VxOSTandaN = T01KC3_n12374VxOSTandaN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12374VxOSTandaN), 2, 0));
         A12452VxOsNPedCl = T01KC3_A12452VxOsNPedCl[0] ;
         n12452VxOsNPedCl = T01KC3_n12452VxOsNPedCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12452VxOsNPedCl", A12452VxOsNPedCl);
         A12882VxOSAux1 = T01KC3_A12882VxOSAux1[0] ;
         n12882VxOSAux1 = T01KC3_n12882VxOSAux1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12882VxOSAux1", A12882VxOSAux1);
         A12884VxOSCosKg = T01KC3_A12884VxOSCosKg[0] ;
         n12884VxOSCosKg = T01KC3_n12884VxOSCosKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrimstr( A12884VxOSCosKg, 9, 2));
         A12904VXOSOriR = T01KC3_A12904VXOSOriR[0] ;
         n12904VXOSOriR = T01KC3_n12904VXOSOriR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12904VXOSOriR", A12904VXOSOriR);
         A12903VXOSRef = T01KC3_A12903VXOSRef[0] ;
         n12903VXOSRef = T01KC3_n12903VXOSRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12903VXOSRef), 8, 0));
         A12948VXOSFinPr = T01KC3_A12948VXOSFinPr[0] ;
         n12948VXOSFinPr = T01KC3_n12948VXOSFinPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
         A12978VxHRPGN = T01KC3_A12978VxHRPGN[0] ;
         n12978VxHRPGN = T01KC3_n12978VxHRPGN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12978VxHRPGN", A12978VxHRPGN);
         A12979VXOSDibCli = T01KC3_A12979VXOSDibCli[0] ;
         n12979VXOSDibCli = T01KC3_n12979VXOSDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12979VXOSDibCli", A12979VXOSDibCli);
         A12980VXOSDibInt = T01KC3_A12980VXOSDibInt[0] ;
         n12980VXOSDibInt = T01KC3_n12980VXOSDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12980VXOSDibInt), 8, 0));
         A12984VxOsObs = T01KC3_A12984VxOsObs[0] ;
         n12984VxOsObs = T01KC3_n12984VxOsObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12984VxOsObs", A12984VxOsObs);
         A14124VxArtDscL = T01KC3_A14124VxArtDscL[0] ;
         A14127VXOSCodExt = T01KC3_A14127VXOSCodExt[0] ;
         A14126VXOSNecCod = T01KC3_A14126VXOSNecCod[0] ;
         A14122VxOsCosKR = T01KC3_A14122VxOsCosKR[0] ;
         n14122VxOsCosKR = T01KC3_n14122VxOsCosKR[0] ;
         A14123VxOsCosKT = T01KC3_A14123VxOsCosKT[0] ;
         n14123VxOsCosKT = T01KC3_n14123VxOsCosKT[0] ;
         A14128VxOSCosHR = T01KC3_A14128VxOSCosHR[0] ;
         n14128VxOSCosHR = T01KC3_n14128VxOSCosHR[0] ;
         A14136VxOSTotUni = T01KC3_A14136VxOSTotUni[0] ;
         n14136VxOSTotUni = T01KC3_n14136VxOSTotUni[0] ;
         A14135VxOSRsvPt = T01KC3_A14135VxOSRsvPt[0] ;
         A14137VxOSUniMed = T01KC3_A14137VxOSUniMed[0] ;
         n14137VxOSUniMed = T01KC3_n14137VxOSUniMed[0] ;
         A11764VxFTecNr = T01KC3_A11764VxFTecNr[0] ;
         n11764VxFTecNr = T01KC3_n11764VxFTecNr[0] ;
         A6826VXCliCod = T01KC3_A6826VXCliCod[0] ;
         n6826VXCliCod = T01KC3_n6826VXCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         A7420VxArtCod = T01KC3_A7420VxArtCod[0] ;
         n7420VxArtCod = T01KC3_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         sMode1717 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KC1717( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1717 = (short)(0) ;
            initializeNonKey1KC1717( ) ;
         }
         Gx_mode = sMode1717 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1717 = (short)(0) ;
         initializeNonKey1KC1717( ) ;
         sMode1717 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1717 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KC1717( ) ;
      if ( RcdFound1717 == 0 )
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
      RcdFound1717 = (short)(0) ;
      /* Using cursor T01KC10 */
      pr_default.execute(8, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KC10_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KC10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KC10_A12372VxOSCod[0] < A12372VxOSCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KC10_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KC10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KC10_A12372VxOSCod[0] > A12372VxOSCod ) ) )
         {
            A7525VxOFabTip = T01KC10_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KC10_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            RcdFound1717 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1717 = (short)(0) ;
      /* Using cursor T01KC11 */
      pr_default.execute(9, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KC11_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KC11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KC11_A12372VxOSCod[0] > A12372VxOSCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KC11_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KC11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KC11_A12372VxOSCod[0] < A12372VxOSCod ) ) )
         {
            A7525VxOFabTip = T01KC11_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KC11_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            RcdFound1717 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KC1717( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KC1717( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1717 == 1 )
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) )
            {
               A7525VxOFabTip = Z7525VxOFabTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
               A12372VxOSCod = Z12372VxOSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
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
               update1KC1717( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KC1717( ) ;
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
                  insert1KC1717( ) ;
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
      if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) )
      {
         A7525VxOFabTip = Z7525VxOFabTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = Z12372VxOSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
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
      getKey1KC1717( ) ;
      if ( RcdFound1717 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) )
         {
            A7525VxOFabTip = Z7525VxOFabTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = Z12372VxOSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
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
         if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrvi");
      GX_FocusControl = edtVxOSTandaN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KC0( ) ;
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
      if ( RcdFound1717 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxOSTandaN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KC1717( ) ;
      if ( RcdFound1717 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSTandaN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KC1717( ) ;
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
      if ( RcdFound1717 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSTandaN_Internalname ;
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
      if ( RcdFound1717 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSTandaN_Internalname ;
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
      scanStart1KC1717( ) ;
      if ( RcdFound1717 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1717 != 0 )
         {
            scanNext1KC1717( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOSTandaN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KC1717( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KC1717( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KC2 */
         pr_default.execute(0, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERVI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12374VxOSTandaN != T01KC2_A12374VxOSTandaN[0] ) || ( GXutil.strcmp(Z12452VxOsNPedCl, T01KC2_A12452VxOsNPedCl[0]) != 0 ) || ( GXutil.strcmp(Z12882VxOSAux1, T01KC2_A12882VxOSAux1[0]) != 0 ) || ( DecimalUtil.compareTo(Z12884VxOSCosKg, T01KC2_A12884VxOSCosKg[0]) != 0 ) || ( GXutil.strcmp(Z12904VXOSOriR, T01KC2_A12904VXOSOriR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12903VXOSRef != T01KC2_A12903VXOSRef[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z12948VXOSFinPr), GXutil.resetTime(T01KC2_A12948VXOSFinPr[0])) ) || ( GXutil.strcmp(Z12978VxHRPGN, T01KC2_A12978VxHRPGN[0]) != 0 ) || ( GXutil.strcmp(Z12979VXOSDibCli, T01KC2_A12979VXOSDibCli[0]) != 0 ) || ( Z12980VXOSDibInt != T01KC2_A12980VXOSDibInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12984VxOsObs, T01KC2_A12984VxOsObs[0]) != 0 ) || ( GXutil.strcmp(Z14124VxArtDscL, T01KC2_A14124VxArtDscL[0]) != 0 ) || ( GXutil.strcmp(Z14127VXOSCodExt, T01KC2_A14127VXOSCodExt[0]) != 0 ) || ( Z14126VXOSNecCod != T01KC2_A14126VXOSNecCod[0] ) || ( DecimalUtil.compareTo(Z14122VxOsCosKR, T01KC2_A14122VxOsCosKR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14123VxOsCosKT, T01KC2_A14123VxOsCosKT[0]) != 0 ) || ( DecimalUtil.compareTo(Z14128VxOSCosHR, T01KC2_A14128VxOSCosHR[0]) != 0 ) || ( Z14136VxOSTotUni != T01KC2_A14136VxOSTotUni[0] ) || ( Z14135VxOSRsvPt != T01KC2_A14135VxOSRsvPt[0] ) || ( GXutil.strcmp(Z14137VxOSUniMed, T01KC2_A14137VxOSUniMed[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11764VxFTecNr != T01KC2_A11764VxFTecNr[0] ) || ( Z6826VXCliCod != T01KC2_A6826VXCliCod[0] ) || ( GXutil.strcmp(Z7420VxArtCod, T01KC2_A7420VxArtCod[0]) != 0 ) )
         {
            if ( Z12374VxOSTandaN != T01KC2_A12374VxOSTandaN[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSTandaN");
               GXutil.writeLogRaw("Old: ",Z12374VxOSTandaN);
               GXutil.writeLogRaw("Current: ",T01KC2_A12374VxOSTandaN[0]);
            }
            if ( GXutil.strcmp(Z12452VxOsNPedCl, T01KC2_A12452VxOsNPedCl[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOsNPedCl");
               GXutil.writeLogRaw("Old: ",Z12452VxOsNPedCl);
               GXutil.writeLogRaw("Current: ",T01KC2_A12452VxOsNPedCl[0]);
            }
            if ( GXutil.strcmp(Z12882VxOSAux1, T01KC2_A12882VxOSAux1[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSAux1");
               GXutil.writeLogRaw("Old: ",Z12882VxOSAux1);
               GXutil.writeLogRaw("Current: ",T01KC2_A12882VxOSAux1[0]);
            }
            if ( DecimalUtil.compareTo(Z12884VxOSCosKg, T01KC2_A12884VxOSCosKg[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSCosKg");
               GXutil.writeLogRaw("Old: ",Z12884VxOSCosKg);
               GXutil.writeLogRaw("Current: ",T01KC2_A12884VxOSCosKg[0]);
            }
            if ( GXutil.strcmp(Z12904VXOSOriR, T01KC2_A12904VXOSOriR[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSOriR");
               GXutil.writeLogRaw("Old: ",Z12904VXOSOriR);
               GXutil.writeLogRaw("Current: ",T01KC2_A12904VXOSOriR[0]);
            }
            if ( Z12903VXOSRef != T01KC2_A12903VXOSRef[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSRef");
               GXutil.writeLogRaw("Old: ",Z12903VXOSRef);
               GXutil.writeLogRaw("Current: ",T01KC2_A12903VXOSRef[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12948VXOSFinPr), GXutil.resetTime(T01KC2_A12948VXOSFinPr[0])) ) )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSFinPr");
               GXutil.writeLogRaw("Old: ",Z12948VXOSFinPr);
               GXutil.writeLogRaw("Current: ",T01KC2_A12948VXOSFinPr[0]);
            }
            if ( GXutil.strcmp(Z12978VxHRPGN, T01KC2_A12978VxHRPGN[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxHRPGN");
               GXutil.writeLogRaw("Old: ",Z12978VxHRPGN);
               GXutil.writeLogRaw("Current: ",T01KC2_A12978VxHRPGN[0]);
            }
            if ( GXutil.strcmp(Z12979VXOSDibCli, T01KC2_A12979VXOSDibCli[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSDibCli");
               GXutil.writeLogRaw("Old: ",Z12979VXOSDibCli);
               GXutil.writeLogRaw("Current: ",T01KC2_A12979VXOSDibCli[0]);
            }
            if ( Z12980VXOSDibInt != T01KC2_A12980VXOSDibInt[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSDibInt");
               GXutil.writeLogRaw("Old: ",Z12980VXOSDibInt);
               GXutil.writeLogRaw("Current: ",T01KC2_A12980VXOSDibInt[0]);
            }
            if ( GXutil.strcmp(Z12984VxOsObs, T01KC2_A12984VxOsObs[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOsObs");
               GXutil.writeLogRaw("Old: ",Z12984VxOsObs);
               GXutil.writeLogRaw("Current: ",T01KC2_A12984VxOsObs[0]);
            }
            if ( GXutil.strcmp(Z14124VxArtDscL, T01KC2_A14124VxArtDscL[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxArtDscL");
               GXutil.writeLogRaw("Old: ",Z14124VxArtDscL);
               GXutil.writeLogRaw("Current: ",T01KC2_A14124VxArtDscL[0]);
            }
            if ( GXutil.strcmp(Z14127VXOSCodExt, T01KC2_A14127VXOSCodExt[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSCodExt");
               GXutil.writeLogRaw("Old: ",Z14127VXOSCodExt);
               GXutil.writeLogRaw("Current: ",T01KC2_A14127VXOSCodExt[0]);
            }
            if ( Z14126VXOSNecCod != T01KC2_A14126VXOSNecCod[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXOSNecCod");
               GXutil.writeLogRaw("Old: ",Z14126VXOSNecCod);
               GXutil.writeLogRaw("Current: ",T01KC2_A14126VXOSNecCod[0]);
            }
            if ( DecimalUtil.compareTo(Z14122VxOsCosKR, T01KC2_A14122VxOsCosKR[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOsCosKR");
               GXutil.writeLogRaw("Old: ",Z14122VxOsCosKR);
               GXutil.writeLogRaw("Current: ",T01KC2_A14122VxOsCosKR[0]);
            }
            if ( DecimalUtil.compareTo(Z14123VxOsCosKT, T01KC2_A14123VxOsCosKT[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOsCosKT");
               GXutil.writeLogRaw("Old: ",Z14123VxOsCosKT);
               GXutil.writeLogRaw("Current: ",T01KC2_A14123VxOsCosKT[0]);
            }
            if ( DecimalUtil.compareTo(Z14128VxOSCosHR, T01KC2_A14128VxOSCosHR[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSCosHR");
               GXutil.writeLogRaw("Old: ",Z14128VxOSCosHR);
               GXutil.writeLogRaw("Current: ",T01KC2_A14128VxOSCosHR[0]);
            }
            if ( Z14136VxOSTotUni != T01KC2_A14136VxOSTotUni[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSTotUni");
               GXutil.writeLogRaw("Old: ",Z14136VxOSTotUni);
               GXutil.writeLogRaw("Current: ",T01KC2_A14136VxOSTotUni[0]);
            }
            if ( Z14135VxOSRsvPt != T01KC2_A14135VxOSRsvPt[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSRsvPt");
               GXutil.writeLogRaw("Old: ",Z14135VxOSRsvPt);
               GXutil.writeLogRaw("Current: ",T01KC2_A14135VxOSRsvPt[0]);
            }
            if ( GXutil.strcmp(Z14137VxOSUniMed, T01KC2_A14137VxOSUniMed[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxOSUniMed");
               GXutil.writeLogRaw("Old: ",Z14137VxOSUniMed);
               GXutil.writeLogRaw("Current: ",T01KC2_A14137VxOSUniMed[0]);
            }
            if ( Z11764VxFTecNr != T01KC2_A11764VxFTecNr[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxFTecNr");
               GXutil.writeLogRaw("Old: ",Z11764VxFTecNr);
               GXutil.writeLogRaw("Current: ",T01KC2_A11764VxFTecNr[0]);
            }
            if ( Z6826VXCliCod != T01KC2_A6826VXCliCod[0] )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VXCliCod");
               GXutil.writeLogRaw("Old: ",Z6826VXCliCod);
               GXutil.writeLogRaw("Current: ",T01KC2_A6826VXCliCod[0]);
            }
            if ( GXutil.strcmp(Z7420VxArtCod, T01KC2_A7420VxArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrvi:[seudo value changed for attri]"+"VxArtCod");
               GXutil.writeLogRaw("Old: ",Z7420VxArtCod);
               GXutil.writeLogRaw("Current: ",T01KC2_A7420VxArtCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXOSERVI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KC1717( )
   {
      beforeValidate1KC1717( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KC1717( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KC1717( 0) ;
         checkOptimisticConcurrency1KC1717( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KC1717( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KC1717( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KC12 */
                  pr_default.execute(10, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Boolean.valueOf(n12374VxOSTandaN), Byte.valueOf(A12374VxOSTandaN), Boolean.valueOf(n12452VxOsNPedCl), A12452VxOsNPedCl, Boolean.valueOf(n12882VxOSAux1), A12882VxOSAux1, Boolean.valueOf(n12884VxOSCosKg), A12884VxOSCosKg, Boolean.valueOf(n12904VXOSOriR), A12904VXOSOriR, Boolean.valueOf(n12903VXOSRef), Integer.valueOf(A12903VXOSRef), Boolean.valueOf(n12948VXOSFinPr), A12948VXOSFinPr, Boolean.valueOf(n12978VxHRPGN), A12978VxHRPGN, Boolean.valueOf(n12979VXOSDibCli), A12979VXOSDibCli, Boolean.valueOf(n12980VXOSDibInt), Integer.valueOf(A12980VXOSDibInt), Boolean.valueOf(n12984VxOsObs), A12984VxOsObs, A14124VxArtDscL, A14127VXOSCodExt, Long.valueOf(A14126VXOSNecCod), Boolean.valueOf(n14122VxOsCosKR), A14122VxOsCosKR, Boolean.valueOf(n14123VxOsCosKT), A14123VxOsCosKT, Boolean.valueOf(n14128VxOSCosHR), A14128VxOSCosHR, Boolean.valueOf(n14136VxOSTotUni), Integer.valueOf(A14136VxOSTotUni), Short.valueOf(A14135VxOSRsvPt), Boolean.valueOf(n14137VxOSUniMed), A14137VxOSUniMed, Boolean.valueOf(n11764VxFTecNr), Short.valueOf(A11764VxFTecNr), Boolean.valueOf(n6826VXCliCod), Integer.valueOf(A6826VXCliCod), Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERVI");
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
                        resetCaption1KC0( ) ;
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
            load1KC1717( ) ;
         }
         endLevel1KC1717( ) ;
      }
      closeExtendedTableCursors1KC1717( ) ;
   }

   public void update1KC1717( )
   {
      beforeValidate1KC1717( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KC1717( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KC1717( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KC1717( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KC1717( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KC13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n12374VxOSTandaN), Byte.valueOf(A12374VxOSTandaN), Boolean.valueOf(n12452VxOsNPedCl), A12452VxOsNPedCl, Boolean.valueOf(n12882VxOSAux1), A12882VxOSAux1, Boolean.valueOf(n12884VxOSCosKg), A12884VxOSCosKg, Boolean.valueOf(n12904VXOSOriR), A12904VXOSOriR, Boolean.valueOf(n12903VXOSRef), Integer.valueOf(A12903VXOSRef), Boolean.valueOf(n12948VXOSFinPr), A12948VXOSFinPr, Boolean.valueOf(n12978VxHRPGN), A12978VxHRPGN, Boolean.valueOf(n12979VXOSDibCli), A12979VXOSDibCli, Boolean.valueOf(n12980VXOSDibInt), Integer.valueOf(A12980VXOSDibInt), Boolean.valueOf(n12984VxOsObs), A12984VxOsObs, A14124VxArtDscL, A14127VXOSCodExt, Long.valueOf(A14126VXOSNecCod), Boolean.valueOf(n14122VxOsCosKR), A14122VxOsCosKR, Boolean.valueOf(n14123VxOsCosKT), A14123VxOsCosKT, Boolean.valueOf(n14128VxOSCosHR), A14128VxOSCosHR, Boolean.valueOf(n14136VxOSTotUni), Integer.valueOf(A14136VxOSTotUni), Short.valueOf(A14135VxOSRsvPt), Boolean.valueOf(n14137VxOSUniMed), A14137VxOSUniMed, Boolean.valueOf(n11764VxFTecNr), Short.valueOf(A11764VxFTecNr), Boolean.valueOf(n6826VXCliCod), Integer.valueOf(A6826VXCliCod), Boolean.valueOf(n7420VxArtCod), A7420VxArtCod, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERVI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERVI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KC1717( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KC0( ) ;
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
         endLevel1KC1717( ) ;
      }
      closeExtendedTableCursors1KC1717( ) ;
   }

   public void deferredUpdate1KC1717( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KC1717( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KC1717( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KC1717( ) ;
         afterConfirm1KC1717( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KC1717( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KC14 */
               pr_default.execute(12, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERVI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1717 == 0 )
                     {
                        initAll1KC1717( ) ;
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
                     resetCaption1KC0( ) ;
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
      sMode1717 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KC1717( ) ;
      Gx_mode = sMode1717 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KC1717( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A14131VxOspedObs ;
         GXv_char2[0] = GXt_char1 ;
         new app.rvxospedobs(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_char2) ;
         tvxosrvi_impl.this.GXt_char1 = GXv_char2[0] ;
         A14131VxOspedObs = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
         GXt_int3 = A14130VXOsPedNOf ;
         GXv_int4[0] = GXt_int3 ;
         new app.rvxospnof(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
         tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
         A14130VXOsPedNOf = GXt_int3 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14130VXOsPedNOf), 8, 0));
         GXt_int5 = A14129VXOsPedERP ;
         GXv_int6[0] = GXt_int5 ;
         new app.rvxoserp(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int6) ;
         tvxosrvi_impl.this.GXt_int5 = GXv_int6[0] ;
         A14129VXOsPedERP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14129VXOsPedERP), 12, 0));
         GXt_int3 = A14125VxOsCliDes ;
         GXv_int4[0] = GXt_int3 ;
         new app.rvxosclides(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
         tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
         A14125VxOsCliDes = GXt_int3 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14125VxOsCliDes), 6, 0));
         /* Using cursor T01KC15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         A12977VXAcaArt = T01KC15_A12977VXAcaArt[0] ;
         n12977VXAcaArt = T01KC15_n12977VXAcaArt[0] ;
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01KC16 */
         pr_default.execute(14, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - OSERPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01KC17 */
         pr_default.execute(15, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Estructura OSERCOM en VERTEX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1KC1717( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KC1717( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxosrvi");
         if ( AnyError == 0 )
         {
            confirmValues1KC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrvi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KC1717( )
   {
      /* Using cursor T01KC18 */
      pr_default.execute(16);
      RcdFound1717 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1717 = (short)(1) ;
         A7525VxOFabTip = T01KC18_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KC18_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KC1717( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1717 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1717 = (short)(1) ;
         A7525VxOFabTip = T01KC18_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KC18_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
      }
   }

   public void scanEnd1KC1717( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1KC1717( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KC1717( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KC1717( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KC1717( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KC1717( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KC1717( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KC1717( )
   {
      edtVxOFabTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOFabTip_Enabled), 5, 0), true);
      edtVxOSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCod_Enabled), 5, 0), true);
      edtVxOSTandaN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSTandaN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSTandaN_Enabled), 5, 0), true);
      edtVxOsNPedCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsNPedCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsNPedCl_Enabled), 5, 0), true);
      edtVxOSAux1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSAux1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSAux1_Enabled), 5, 0), true);
      edtVxOSCosKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCosKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCosKg_Enabled), 5, 0), true);
      edtVXOSOriR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXOSOriR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXOSOriR_Enabled), 5, 0), true);
      edtVXOSRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXOSRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXOSRef_Enabled), 5, 0), true);
      edtVXOSFinPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXOSFinPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXOSFinPr_Enabled), 5, 0), true);
      edtVxHRPGN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxHRPGN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxHRPGN_Enabled), 5, 0), true);
      edtVXOSDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXOSDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXOSDibCli_Enabled), 5, 0), true);
      edtVXOSDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXOSDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXOSDibInt_Enabled), 5, 0), true);
      edtVXCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXCliCod_Enabled), 5, 0), true);
      edtVxArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCod_Enabled), 5, 0), true);
      edtVxOsObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsObs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KC1717( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxosrvi", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TVxOSRVI");
      forbiddenHiddens.add("VxArtDscL", GXutil.rtrim( localUtil.format( A14124VxArtDscL, "")));
      forbiddenHiddens.add("VXOSCodExt", GXutil.rtrim( localUtil.format( A14127VXOSCodExt, "")));
      forbiddenHiddens.add("VXOSNecCod", localUtil.format( DecimalUtil.doubleToDec(A14126VXOSNecCod), "ZZZZZZZZZZZ9"));
      forbiddenHiddens.add("VxOsCosKR", localUtil.format( A14122VxOsCosKR, "ZZZZZ9.99"));
      forbiddenHiddens.add("VxOsCosKT", localUtil.format( A14123VxOsCosKT, "ZZZZZ9.99"));
      forbiddenHiddens.add("VxOSCosHR", localUtil.format( A14128VxOSCosHR, "ZZZZZZZZ9.99"));
      forbiddenHiddens.add("VxOSTotUni", localUtil.format( DecimalUtil.doubleToDec(A14136VxOSTotUni), "ZZZZZ9"));
      forbiddenHiddens.add("VxOSRsvPt", localUtil.format( DecimalUtil.doubleToDec(A14135VxOSRsvPt), "ZZZ9"));
      forbiddenHiddens.add("VxOSUniMed", GXutil.rtrim( localUtil.format( A14137VxOSUniMed, "")));
      forbiddenHiddens.add("VxFTecNr", localUtil.format( DecimalUtil.doubleToDec(A11764VxFTecNr), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tvxosrvi:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12374VxOSTandaN", GXutil.ltrim( localUtil.ntoc( Z12374VxOSTandaN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12452VxOsNPedCl", GXutil.rtrim( Z12452VxOsNPedCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12882VxOSAux1", GXutil.rtrim( Z12882VxOSAux1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12884VxOSCosKg", GXutil.ltrim( localUtil.ntoc( Z12884VxOSCosKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12904VXOSOriR", GXutil.rtrim( Z12904VXOSOriR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12903VXOSRef", GXutil.ltrim( localUtil.ntoc( Z12903VXOSRef, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12948VXOSFinPr", localUtil.dtoc( Z12948VXOSFinPr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12978VxHRPGN", GXutil.rtrim( Z12978VxHRPGN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12979VXOSDibCli", GXutil.rtrim( Z12979VXOSDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12980VXOSDibInt", GXutil.ltrim( localUtil.ntoc( Z12980VXOSDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12984VxOsObs", GXutil.rtrim( Z12984VxOsObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14124VxArtDscL", Z14124VxArtDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14127VXOSCodExt", GXutil.rtrim( Z14127VXOSCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14126VXOSNecCod", GXutil.ltrim( localUtil.ntoc( Z14126VXOSNecCod, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14122VxOsCosKR", GXutil.ltrim( localUtil.ntoc( Z14122VxOsCosKR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14123VxOsCosKT", GXutil.ltrim( localUtil.ntoc( Z14123VxOsCosKT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14128VxOSCosHR", GXutil.ltrim( localUtil.ntoc( Z14128VxOSCosHR, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14136VxOSTotUni", GXutil.ltrim( localUtil.ntoc( Z14136VxOSTotUni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14135VxOSRsvPt", GXutil.ltrim( localUtil.ntoc( Z14135VxOSRsvPt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14137VxOSUniMed", GXutil.rtrim( Z14137VxOSUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11764VxFTecNr", GXutil.ltrim( localUtil.ntoc( Z11764VxFTecNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6826VXCliCod", GXutil.ltrim( localUtil.ntoc( Z6826VXCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSPEDOBS", A14131VxOspedObs);
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSPEDNOF", GXutil.ltrim( localUtil.ntoc( A14130VXOsPedNOf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSPEDERP", GXutil.ltrim( localUtil.ntoc( A14129VXOsPedERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSCLIDES", GXutil.ltrim( localUtil.ntoc( A14125VxOsCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXARTDSCL", A14124VxArtDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSCODEXT", GXutil.rtrim( A14127VXOSCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSNECCOD", GXutil.ltrim( localUtil.ntoc( A14126VXOSNecCod, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSCOSKR", GXutil.ltrim( localUtil.ntoc( A14122VxOsCosKR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSCOSKT", GXutil.ltrim( localUtil.ntoc( A14123VxOsCosKT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSCOSHR", GXutil.ltrim( localUtil.ntoc( A14128VxOSCosHR, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSTOTUNI", GXutil.ltrim( localUtil.ntoc( A14136VxOSTotUni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSRSVPT", GXutil.ltrim( localUtil.ntoc( A14135VxOSRsvPt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXOSUNIMED", GXutil.rtrim( A14137VxOSUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "VXFTECNR", GXutil.ltrim( localUtil.ntoc( A11764VxFTecNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXACAART", GXutil.rtrim( A12977VXAcaArt));
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
      return formatLink("app.tvxosrvi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxOSRVI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura OServi en VERTEX", "") ;
   }

   public void initializeNonKey1KC1717( )
   {
      A14125VxOsCliDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14125VxOsCliDes), 6, 0));
      A14129VXOsPedERP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14129VXOsPedERP), 12, 0));
      A14130VXOsPedNOf = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14130VXOsPedNOf), 8, 0));
      A14131VxOspedObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
      A12374VxOSTandaN = (byte)(0) ;
      n12374VxOSTandaN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12374VxOSTandaN), 2, 0));
      A12452VxOsNPedCl = "" ;
      n12452VxOsNPedCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12452VxOsNPedCl", A12452VxOsNPedCl);
      A12882VxOSAux1 = "" ;
      n12882VxOSAux1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12882VxOSAux1", A12882VxOSAux1);
      A12884VxOSCosKg = DecimalUtil.ZERO ;
      n12884VxOSCosKg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrimstr( A12884VxOSCosKg, 9, 2));
      A12904VXOSOriR = "" ;
      n12904VXOSOriR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12904VXOSOriR", A12904VXOSOriR);
      A12903VXOSRef = 0 ;
      n12903VXOSRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12903VXOSRef), 8, 0));
      A12948VXOSFinPr = GXutil.nullDate() ;
      n12948VXOSFinPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
      A12978VxHRPGN = "" ;
      n12978VxHRPGN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12978VxHRPGN", A12978VxHRPGN);
      A12979VXOSDibCli = "" ;
      n12979VXOSDibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12979VXOSDibCli", A12979VXOSDibCli);
      A12980VXOSDibInt = 0 ;
      n12980VXOSDibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12980VXOSDibInt), 8, 0));
      A6826VXCliCod = 0 ;
      n6826VXCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
      A7420VxArtCod = "" ;
      n7420VxArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      A12984VxOsObs = "" ;
      n12984VxOsObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12984VxOsObs", A12984VxOsObs);
      A12977VXAcaArt = "" ;
      n12977VXAcaArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", A12977VXAcaArt);
      A14124VxArtDscL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14124VxArtDscL", A14124VxArtDscL);
      A14127VXOSCodExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14127VXOSCodExt", A14127VXOSCodExt);
      A14126VXOSNecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14126VXOSNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14126VXOSNecCod), 12, 0));
      A14122VxOsCosKR = DecimalUtil.ZERO ;
      n14122VxOsCosKR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14122VxOsCosKR", GXutil.ltrimstr( A14122VxOsCosKR, 9, 2));
      A14123VxOsCosKT = DecimalUtil.ZERO ;
      n14123VxOsCosKT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14123VxOsCosKT", GXutil.ltrimstr( A14123VxOsCosKT, 9, 2));
      A14128VxOSCosHR = DecimalUtil.ZERO ;
      n14128VxOSCosHR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14128VxOSCosHR", GXutil.ltrimstr( A14128VxOSCosHR, 12, 2));
      A14136VxOSTotUni = 0 ;
      n14136VxOSTotUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14136VxOSTotUni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14136VxOSTotUni), 6, 0));
      A14135VxOSRsvPt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14135VxOSRsvPt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14135VxOSRsvPt), 4, 0));
      A14137VxOSUniMed = "" ;
      n14137VxOSUniMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14137VxOSUniMed", A14137VxOSUniMed);
      A11764VxFTecNr = (short)(0) ;
      n11764VxFTecNr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
      Z12374VxOSTandaN = (byte)(0) ;
      Z12452VxOsNPedCl = "" ;
      Z12882VxOSAux1 = "" ;
      Z12884VxOSCosKg = DecimalUtil.ZERO ;
      Z12904VXOSOriR = "" ;
      Z12903VXOSRef = 0 ;
      Z12948VXOSFinPr = GXutil.nullDate() ;
      Z12978VxHRPGN = "" ;
      Z12979VXOSDibCli = "" ;
      Z12980VXOSDibInt = 0 ;
      Z12984VxOsObs = "" ;
      Z14124VxArtDscL = "" ;
      Z14127VXOSCodExt = "" ;
      Z14126VXOSNecCod = 0 ;
      Z14122VxOsCosKR = DecimalUtil.ZERO ;
      Z14123VxOsCosKT = DecimalUtil.ZERO ;
      Z14128VxOSCosHR = DecimalUtil.ZERO ;
      Z14136VxOSTotUni = 0 ;
      Z14135VxOSRsvPt = (short)(0) ;
      Z14137VxOSUniMed = "" ;
      Z11764VxFTecNr = (short)(0) ;
      Z6826VXCliCod = 0 ;
      Z7420VxArtCod = "" ;
   }

   public void initAll1KC1717( )
   {
      A7525VxOFabTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
      A12372VxOSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
      initializeNonKey1KC1717( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251952655", true, true);
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
      httpContext.AddJavascriptSource("tvxosrvi.js", "?20261251952656", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxOSTandaN_Internalname = "VXOSTANDAN" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxOsNPedCl_Internalname = "VXOSNPEDCL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxOSAux1_Internalname = "VXOSAUX1" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxOSCosKg_Internalname = "VXOSCOSKG" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVXOSOriR_Internalname = "VXOSORIR" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVXOSRef_Internalname = "VXOSREF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVXOSFinPr_Internalname = "VXOSFINPR" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtVxHRPGN_Internalname = "VXHRPGN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtVXOSDibCli_Internalname = "VXOSDIBCLI" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtVXOSDibInt_Internalname = "VXOSDIBINT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtVXCliCod_Internalname = "VXCLICOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtVxArtCod_Internalname = "VXARTCOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtVxOsObs_Internalname = "VXOSOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura OServi en VERTEX", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxOsObs_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsObs_Enabled = 1 ;
      edtVxArtCod_Jsonclick = "" ;
      edtVxArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCod_Enabled = 1 ;
      edtVXCliCod_Jsonclick = "" ;
      edtVXCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtVXCliCod_Enabled = 1 ;
      edtVXOSDibInt_Jsonclick = "" ;
      edtVXOSDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtVXOSDibInt_Enabled = 1 ;
      edtVXOSDibCli_Jsonclick = "" ;
      edtVXOSDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtVXOSDibCli_Enabled = 1 ;
      edtVxHRPGN_Jsonclick = "" ;
      edtVxHRPGN_Backcolor = (int)(0xFFFFFF) ;
      edtVxHRPGN_Enabled = 1 ;
      edtVXOSFinPr_Jsonclick = "" ;
      edtVXOSFinPr_Backcolor = (int)(0xFFFFFF) ;
      edtVXOSFinPr_Enabled = 1 ;
      edtVXOSRef_Jsonclick = "" ;
      edtVXOSRef_Backcolor = (int)(0xFFFFFF) ;
      edtVXOSRef_Enabled = 1 ;
      edtVXOSOriR_Jsonclick = "" ;
      edtVXOSOriR_Backcolor = (int)(0xFFFFFF) ;
      edtVXOSOriR_Enabled = 1 ;
      edtVxOSCosKg_Jsonclick = "" ;
      edtVxOSCosKg_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCosKg_Enabled = 1 ;
      edtVxOSAux1_Jsonclick = "" ;
      edtVxOSAux1_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSAux1_Enabled = 1 ;
      edtVxOsNPedCl_Jsonclick = "" ;
      edtVxOsNPedCl_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsNPedCl_Enabled = 1 ;
      edtVxOSTandaN_Jsonclick = "" ;
      edtVxOSTandaN_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSTandaN_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx1asavxospedobs1KC1717( String A7525VxOFabTip ,
                                        int A12372VxOSCod )
   {
      GXt_char1 = A14131VxOspedObs ;
      GXv_char2[0] = GXt_char1 ;
      new app.rvxospedobs(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_char2) ;
      tvxosrvi_impl.this.GXt_char1 = GXv_char2[0] ;
      A14131VxOspedObs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A14131VxOspedObs)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asavxospednof1KC1717( String A7525VxOFabTip ,
                                        int A12372VxOSCod )
   {
      GXt_int3 = A14130VXOsPedNOf ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxospnof(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14130VXOsPedNOf = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14130VXOsPedNOf), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14130VXOsPedNOf, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asavxospederp1KC1717( String A7525VxOFabTip ,
                                        int A12372VxOSCod )
   {
      GXt_int5 = A14129VXOsPedERP ;
      GXv_int6[0] = GXt_int5 ;
      new app.rvxoserp(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int6) ;
      tvxosrvi_impl.this.GXt_int5 = GXv_int6[0] ;
      A14129VXOsPedERP = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14129VXOsPedERP), 12, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14129VXOsPedERP, (byte)(12), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asavxosclides1KC1717( String A7525VxOFabTip ,
                                        int A12372VxOSCod )
   {
      GXt_int3 = A14125VxOsCliDes ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxosclides(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14125VxOsCliDes = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14125VxOsCliDes), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14125VxOsCliDes, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      GX_FocusControl = edtVxOSTandaN_Internalname ;
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
      n11764VxFTecNr = false ;
      n14137VxOSUniMed = false ;
      n14136VxOSTotUni = false ;
      n14128VxOSCosHR = false ;
      n14123VxOsCosKT = false ;
      n14122VxOsCosKR = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_char1 = A14131VxOspedObs ;
      GXv_char2[0] = GXt_char1 ;
      new app.rvxospedobs(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_char2) ;
      tvxosrvi_impl.this.GXt_char1 = GXv_char2[0] ;
      A14131VxOspedObs = GXt_char1 ;
      GXt_int3 = A14130VXOsPedNOf ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxospnof(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14130VXOsPedNOf = GXt_int3 ;
      GXt_int5 = A14129VXOsPedERP ;
      GXv_int6[0] = GXt_int5 ;
      new app.rvxoserp(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int6) ;
      tvxosrvi_impl.this.GXt_int5 = GXv_int6[0] ;
      A14129VXOsPedERP = GXt_int5 ;
      GXt_int3 = A14125VxOsCliDes ;
      GXv_int4[0] = GXt_int3 ;
      new app.rvxosclides(remoteHandle, context).execute( A7525VxOFabTip, A12372VxOSCod, httpContext.getMessage( "PRI", ""), GXv_int4) ;
      tvxosrvi_impl.this.GXt_int3 = GXv_int4[0] ;
      A14125VxOsCliDes = GXt_int3 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12374VxOSTandaN", GXutil.ltrim( localUtil.ntoc( A12374VxOSTandaN, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12452VxOsNPedCl", GXutil.rtrim( A12452VxOsNPedCl));
      httpContext.ajax_rsp_assign_attri("", false, "A12882VxOSAux1", GXutil.rtrim( A12882VxOSAux1));
      httpContext.ajax_rsp_assign_attri("", false, "A12884VxOSCosKg", GXutil.ltrim( localUtil.ntoc( A12884VxOSCosKg, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12904VXOSOriR", GXutil.rtrim( A12904VXOSOriR));
      httpContext.ajax_rsp_assign_attri("", false, "A12903VXOSRef", GXutil.ltrim( localUtil.ntoc( A12903VXOSRef, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12948VXOSFinPr", localUtil.format(A12948VXOSFinPr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12978VxHRPGN", GXutil.rtrim( A12978VxHRPGN));
      httpContext.ajax_rsp_assign_attri("", false, "A12979VXOSDibCli", GXutil.rtrim( A12979VXOSDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A12980VXOSDibInt", GXutil.ltrim( localUtil.ntoc( A12980VXOSDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrim( localUtil.ntoc( A6826VXCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", GXutil.rtrim( A7420VxArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12984VxOsObs", GXutil.rtrim( A12984VxOsObs));
      httpContext.ajax_rsp_assign_attri("", false, "A14124VxArtDscL", A14124VxArtDscL);
      httpContext.ajax_rsp_assign_attri("", false, "A14127VXOSCodExt", GXutil.rtrim( A14127VXOSCodExt));
      httpContext.ajax_rsp_assign_attri("", false, "A14126VXOSNecCod", GXutil.ltrim( localUtil.ntoc( A14126VXOSNecCod, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14122VxOsCosKR", GXutil.ltrim( localUtil.ntoc( A14122VxOsCosKR, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14123VxOsCosKT", GXutil.ltrim( localUtil.ntoc( A14123VxOsCosKT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14128VxOSCosHR", GXutil.ltrim( localUtil.ntoc( A14128VxOSCosHR, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14136VxOSTotUni", GXutil.ltrim( localUtil.ntoc( A14136VxOSTotUni, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14135VxOSRsvPt", GXutil.ltrim( localUtil.ntoc( A14135VxOSRsvPt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14137VxOSUniMed", GXutil.rtrim( A14137VxOSUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrim( localUtil.ntoc( A11764VxFTecNr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14131VxOspedObs", A14131VxOspedObs);
      httpContext.ajax_rsp_assign_attri("", false, "A14130VXOsPedNOf", GXutil.ltrim( localUtil.ntoc( A14130VXOsPedNOf, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14129VXOsPedERP", GXutil.ltrim( localUtil.ntoc( A14129VXOsPedERP, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14125VxOsCliDes", GXutil.ltrim( localUtil.ntoc( A14125VxOsCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", GXutil.rtrim( A12977VXAcaArt));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12374VxOSTandaN", GXutil.ltrim( localUtil.ntoc( Z12374VxOSTandaN, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12452VxOsNPedCl", GXutil.rtrim( Z12452VxOsNPedCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12882VxOSAux1", GXutil.rtrim( Z12882VxOSAux1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12884VxOSCosKg", GXutil.ltrim( localUtil.ntoc( Z12884VxOSCosKg, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12904VXOSOriR", GXutil.rtrim( Z12904VXOSOriR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12903VXOSRef", GXutil.ltrim( localUtil.ntoc( Z12903VXOSRef, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12948VXOSFinPr", localUtil.format(Z12948VXOSFinPr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12978VxHRPGN", GXutil.rtrim( Z12978VxHRPGN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12979VXOSDibCli", GXutil.rtrim( Z12979VXOSDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12980VXOSDibInt", GXutil.ltrim( localUtil.ntoc( Z12980VXOSDibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6826VXCliCod", GXutil.ltrim( localUtil.ntoc( Z6826VXCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12984VxOsObs", GXutil.rtrim( Z12984VxOsObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14124VxArtDscL", Z14124VxArtDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14127VXOSCodExt", GXutil.rtrim( Z14127VXOSCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14126VXOSNecCod", GXutil.ltrim( localUtil.ntoc( Z14126VXOSNecCod, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14122VxOsCosKR", GXutil.ltrim( localUtil.ntoc( Z14122VxOsCosKR, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14123VxOsCosKT", GXutil.ltrim( localUtil.ntoc( Z14123VxOsCosKT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14128VxOSCosHR", GXutil.ltrim( localUtil.ntoc( Z14128VxOSCosHR, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14136VxOSTotUni", GXutil.ltrim( localUtil.ntoc( Z14136VxOSTotUni, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14135VxOSRsvPt", GXutil.ltrim( localUtil.ntoc( Z14135VxOSRsvPt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14137VxOSUniMed", GXutil.rtrim( Z14137VxOSUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11764VxFTecNr", GXutil.ltrim( localUtil.ntoc( Z11764VxFTecNr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14131VxOspedObs", Z14131VxOspedObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14130VXOsPedNOf", GXutil.ltrim( localUtil.ntoc( Z14130VXOsPedNOf, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14129VXOsPedERP", GXutil.ltrim( localUtil.ntoc( Z14129VXOsPedERP, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14125VxOsCliDes", GXutil.ltrim( localUtil.ntoc( Z14125VxOsCliDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12977VXAcaArt", GXutil.rtrim( Z12977VXAcaArt));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Vxclicod( )
   {
      n6826VXCliCod = false ;
      /* Using cursor T01KC19 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n6826VXCliCod), Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxartcod( )
   {
      n7420VxArtCod = false ;
      n12977VXAcaArt = false ;
      /* Using cursor T01KC15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
      }
      A12977VXAcaArt = T01KC15_A12977VXAcaArt[0] ;
      n12977VXAcaArt = T01KC15_n12977VXAcaArt[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", GXutil.rtrim( A12977VXAcaArt));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14124VxArtDscL',fld:'VXARTDSCL',pic:''},{av:'A14127VXOSCodExt',fld:'VXOSCODEXT',pic:''},{av:'A14126VXOSNecCod',fld:'VXOSNECCOD',pic:'ZZZZZZZZZZZ9'},{av:'A14122VxOsCosKR',fld:'VXOSCOSKR',pic:'ZZZZZ9.99'},{av:'A14123VxOsCosKT',fld:'VXOSCOSKT',pic:'ZZZZZ9.99'},{av:'A14128VxOSCosHR',fld:'VXOSCOSHR',pic:'ZZZZZZZZ9.99'},{av:'A14136VxOSTotUni',fld:'VXOSTOTUNI',pic:'ZZZZZ9'},{av:'A14135VxOSRsvPt',fld:'VXOSRSVPT',pic:'ZZZ9'},{av:'A14137VxOSUniMed',fld:'VXOSUNIMED',pic:''},{av:'A11764VxFTecNr',fld:'VXFTECNR',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_VXOFABTIP","{handler:'valid_Vxofabtip',iparms:[]");
      setEventMetadata("VALID_VXOFABTIP",",oparms:[]}");
      setEventMetadata("VALID_VXOSCOD","{handler:'valid_Vxoscod',iparms:[{av:'A11764VxFTecNr',fld:'VXFTECNR',pic:'ZZZ9'},{av:'A14137VxOSUniMed',fld:'VXOSUNIMED',pic:''},{av:'A14135VxOSRsvPt',fld:'VXOSRSVPT',pic:'ZZZ9'},{av:'A14136VxOSTotUni',fld:'VXOSTOTUNI',pic:'ZZZZZ9'},{av:'A14128VxOSCosHR',fld:'VXOSCOSHR',pic:'ZZZZZZZZ9.99'},{av:'A14123VxOsCosKT',fld:'VXOSCOSKT',pic:'ZZZZZ9.99'},{av:'A14122VxOsCosKR',fld:'VXOSCOSKR',pic:'ZZZZZ9.99'},{av:'A14126VXOSNecCod',fld:'VXOSNECCOD',pic:'ZZZZZZZZZZZ9'},{av:'A14127VXOSCodExt',fld:'VXOSCODEXT',pic:''},{av:'A14124VxArtDscL',fld:'VXARTDSCL',pic:''},{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A12372VxOSCod',fld:'VXOSCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXOSCOD",",oparms:[{av:'A12374VxOSTandaN',fld:'VXOSTANDAN',pic:'Z9'},{av:'A12452VxOsNPedCl',fld:'VXOSNPEDCL',pic:''},{av:'A12882VxOSAux1',fld:'VXOSAUX1',pic:''},{av:'A12884VxOSCosKg',fld:'VXOSCOSKG',pic:'ZZZZZ9.99'},{av:'A12904VXOSOriR',fld:'VXOSORIR',pic:''},{av:'A12903VXOSRef',fld:'VXOSREF',pic:'ZZZZZZZ9'},{av:'A12948VXOSFinPr',fld:'VXOSFINPR',pic:''},{av:'A12978VxHRPGN',fld:'VXHRPGN',pic:''},{av:'A12979VXOSDibCli',fld:'VXOSDIBCLI',pic:''},{av:'A12980VXOSDibInt',fld:'VXOSDIBINT',pic:'ZZZZZZZ9'},{av:'A6826VXCliCod',fld:'VXCLICOD',pic:'ZZZZZ9'},{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'A12984VxOsObs',fld:'VXOSOBS',pic:''},{av:'A14124VxArtDscL',fld:'VXARTDSCL',pic:''},{av:'A14127VXOSCodExt',fld:'VXOSCODEXT',pic:''},{av:'A14126VXOSNecCod',fld:'VXOSNECCOD',pic:'ZZZZZZZZZZZ9'},{av:'A14122VxOsCosKR',fld:'VXOSCOSKR',pic:'ZZZZZ9.99'},{av:'A14123VxOsCosKT',fld:'VXOSCOSKT',pic:'ZZZZZ9.99'},{av:'A14128VxOSCosHR',fld:'VXOSCOSHR',pic:'ZZZZZZZZ9.99'},{av:'A14136VxOSTotUni',fld:'VXOSTOTUNI',pic:'ZZZZZ9'},{av:'A14135VxOSRsvPt',fld:'VXOSRSVPT',pic:'ZZZ9'},{av:'A14137VxOSUniMed',fld:'VXOSUNIMED',pic:''},{av:'A11764VxFTecNr',fld:'VXFTECNR',pic:'ZZZ9'},{av:'A14131VxOspedObs',fld:'VXOSPEDOBS',pic:''},{av:'A14130VXOsPedNOf',fld:'VXOSPEDNOF',pic:'ZZZZZZZ9'},{av:'A14129VXOsPedERP',fld:'VXOSPEDERP',pic:'ZZZZZZZZZZZ9'},{av:'A14125VxOsCliDes',fld:'VXOSCLIDES',pic:'ZZZZZ9'},{av:'A12977VXAcaArt',fld:'VXACAART',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7525VxOFabTip'},{av:'Z12372VxOSCod'},{av:'Z12374VxOSTandaN'},{av:'Z12452VxOsNPedCl'},{av:'Z12882VxOSAux1'},{av:'Z12884VxOSCosKg'},{av:'Z12904VXOSOriR'},{av:'Z12903VXOSRef'},{av:'Z12948VXOSFinPr'},{av:'Z12978VxHRPGN'},{av:'Z12979VXOSDibCli'},{av:'Z12980VXOSDibInt'},{av:'Z6826VXCliCod'},{av:'Z7420VxArtCod'},{av:'Z12984VxOsObs'},{av:'Z14124VxArtDscL'},{av:'Z14127VXOSCodExt'},{av:'Z14126VXOSNecCod'},{av:'Z14122VxOsCosKR'},{av:'Z14123VxOsCosKT'},{av:'Z14128VxOSCosHR'},{av:'Z14136VxOSTotUni'},{av:'Z14135VxOSRsvPt'},{av:'Z14137VxOSUniMed'},{av:'Z11764VxFTecNr'},{av:'Z14131VxOspedObs'},{av:'Z14130VXOsPedNOf'},{av:'Z14129VXOsPedERP'},{av:'Z14125VxOsCliDes'},{av:'Z12977VXAcaArt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXCLICOD","{handler:'valid_Vxclicod',iparms:[{av:'A6826VXCliCod',fld:'VXCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_VXCLICOD",",oparms:[]}");
      setEventMetadata("VALID_VXARTCOD","{handler:'valid_Vxartcod',iparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'A12977VXAcaArt',fld:'VXACAART',pic:''}]");
      setEventMetadata("VALID_VXARTCOD",",oparms:[{av:'A12977VXAcaArt',fld:'VXACAART',pic:''}]}");
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
      pr_default.close(17);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z7525VxOFabTip = "" ;
      Z12452VxOsNPedCl = "" ;
      Z12882VxOSAux1 = "" ;
      Z12884VxOSCosKg = DecimalUtil.ZERO ;
      Z12904VXOSOriR = "" ;
      Z12948VXOSFinPr = GXutil.nullDate() ;
      Z12978VxHRPGN = "" ;
      Z12979VXOSDibCli = "" ;
      Z12984VxOsObs = "" ;
      Z14124VxArtDscL = "" ;
      Z14127VXOSCodExt = "" ;
      Z14122VxOsCosKR = DecimalUtil.ZERO ;
      Z14123VxOsCosKT = DecimalUtil.ZERO ;
      Z14128VxOSCosHR = DecimalUtil.ZERO ;
      Z14137VxOSUniMed = "" ;
      Z7420VxArtCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7525VxOFabTip = "" ;
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
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12452VxOsNPedCl = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12882VxOSAux1 = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12884VxOSCosKg = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A12904VXOSOriR = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12948VXOSFinPr = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      A12978VxHRPGN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12979VXOSDibCli = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12984VxOsObs = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A14124VxArtDscL = "" ;
      A14127VXOSCodExt = "" ;
      A14122VxOsCosKR = DecimalUtil.ZERO ;
      A14123VxOsCosKT = DecimalUtil.ZERO ;
      A14128VxOSCosHR = DecimalUtil.ZERO ;
      A14137VxOSUniMed = "" ;
      Gx_mode = "" ;
      A14131VxOspedObs = "" ;
      A12977VXAcaArt = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z12977VXAcaArt = "" ;
      T01KC6_A7525VxOFabTip = new String[] {""} ;
      T01KC6_A12372VxOSCod = new int[1] ;
      T01KC6_A12374VxOSTandaN = new byte[1] ;
      T01KC6_n12374VxOSTandaN = new boolean[] {false} ;
      T01KC6_A12452VxOsNPedCl = new String[] {""} ;
      T01KC6_n12452VxOsNPedCl = new boolean[] {false} ;
      T01KC6_A12882VxOSAux1 = new String[] {""} ;
      T01KC6_n12882VxOSAux1 = new boolean[] {false} ;
      T01KC6_A12884VxOSCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC6_n12884VxOSCosKg = new boolean[] {false} ;
      T01KC6_A12904VXOSOriR = new String[] {""} ;
      T01KC6_n12904VXOSOriR = new boolean[] {false} ;
      T01KC6_A12903VXOSRef = new int[1] ;
      T01KC6_n12903VXOSRef = new boolean[] {false} ;
      T01KC6_A12948VXOSFinPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01KC6_n12948VXOSFinPr = new boolean[] {false} ;
      T01KC6_A12978VxHRPGN = new String[] {""} ;
      T01KC6_n12978VxHRPGN = new boolean[] {false} ;
      T01KC6_A12979VXOSDibCli = new String[] {""} ;
      T01KC6_n12979VXOSDibCli = new boolean[] {false} ;
      T01KC6_A12980VXOSDibInt = new int[1] ;
      T01KC6_n12980VXOSDibInt = new boolean[] {false} ;
      T01KC6_A12984VxOsObs = new String[] {""} ;
      T01KC6_n12984VxOsObs = new boolean[] {false} ;
      T01KC6_A12977VXAcaArt = new String[] {""} ;
      T01KC6_n12977VXAcaArt = new boolean[] {false} ;
      T01KC6_A14124VxArtDscL = new String[] {""} ;
      T01KC6_A14127VXOSCodExt = new String[] {""} ;
      T01KC6_A14126VXOSNecCod = new long[1] ;
      T01KC6_A14122VxOsCosKR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC6_n14122VxOsCosKR = new boolean[] {false} ;
      T01KC6_A14123VxOsCosKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC6_n14123VxOsCosKT = new boolean[] {false} ;
      T01KC6_A14128VxOSCosHR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC6_n14128VxOSCosHR = new boolean[] {false} ;
      T01KC6_A14136VxOSTotUni = new int[1] ;
      T01KC6_n14136VxOSTotUni = new boolean[] {false} ;
      T01KC6_A14135VxOSRsvPt = new short[1] ;
      T01KC6_A14137VxOSUniMed = new String[] {""} ;
      T01KC6_n14137VxOSUniMed = new boolean[] {false} ;
      T01KC6_A11764VxFTecNr = new short[1] ;
      T01KC6_n11764VxFTecNr = new boolean[] {false} ;
      T01KC6_A6826VXCliCod = new int[1] ;
      T01KC6_n6826VXCliCod = new boolean[] {false} ;
      T01KC6_A7420VxArtCod = new String[] {""} ;
      T01KC6_n7420VxArtCod = new boolean[] {false} ;
      T01KC4_A6826VXCliCod = new int[1] ;
      T01KC4_n6826VXCliCod = new boolean[] {false} ;
      T01KC5_A12977VXAcaArt = new String[] {""} ;
      T01KC5_n12977VXAcaArt = new boolean[] {false} ;
      T01KC7_A6826VXCliCod = new int[1] ;
      T01KC7_n6826VXCliCod = new boolean[] {false} ;
      T01KC8_A12977VXAcaArt = new String[] {""} ;
      T01KC8_n12977VXAcaArt = new boolean[] {false} ;
      T01KC9_A7525VxOFabTip = new String[] {""} ;
      T01KC9_A12372VxOSCod = new int[1] ;
      T01KC3_A7525VxOFabTip = new String[] {""} ;
      T01KC3_A12372VxOSCod = new int[1] ;
      T01KC3_A12374VxOSTandaN = new byte[1] ;
      T01KC3_n12374VxOSTandaN = new boolean[] {false} ;
      T01KC3_A12452VxOsNPedCl = new String[] {""} ;
      T01KC3_n12452VxOsNPedCl = new boolean[] {false} ;
      T01KC3_A12882VxOSAux1 = new String[] {""} ;
      T01KC3_n12882VxOSAux1 = new boolean[] {false} ;
      T01KC3_A12884VxOSCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC3_n12884VxOSCosKg = new boolean[] {false} ;
      T01KC3_A12904VXOSOriR = new String[] {""} ;
      T01KC3_n12904VXOSOriR = new boolean[] {false} ;
      T01KC3_A12903VXOSRef = new int[1] ;
      T01KC3_n12903VXOSRef = new boolean[] {false} ;
      T01KC3_A12948VXOSFinPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01KC3_n12948VXOSFinPr = new boolean[] {false} ;
      T01KC3_A12978VxHRPGN = new String[] {""} ;
      T01KC3_n12978VxHRPGN = new boolean[] {false} ;
      T01KC3_A12979VXOSDibCli = new String[] {""} ;
      T01KC3_n12979VXOSDibCli = new boolean[] {false} ;
      T01KC3_A12980VXOSDibInt = new int[1] ;
      T01KC3_n12980VXOSDibInt = new boolean[] {false} ;
      T01KC3_A12984VxOsObs = new String[] {""} ;
      T01KC3_n12984VxOsObs = new boolean[] {false} ;
      T01KC3_A14124VxArtDscL = new String[] {""} ;
      T01KC3_A14127VXOSCodExt = new String[] {""} ;
      T01KC3_A14126VXOSNecCod = new long[1] ;
      T01KC3_A14122VxOsCosKR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC3_n14122VxOsCosKR = new boolean[] {false} ;
      T01KC3_A14123VxOsCosKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC3_n14123VxOsCosKT = new boolean[] {false} ;
      T01KC3_A14128VxOSCosHR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC3_n14128VxOSCosHR = new boolean[] {false} ;
      T01KC3_A14136VxOSTotUni = new int[1] ;
      T01KC3_n14136VxOSTotUni = new boolean[] {false} ;
      T01KC3_A14135VxOSRsvPt = new short[1] ;
      T01KC3_A14137VxOSUniMed = new String[] {""} ;
      T01KC3_n14137VxOSUniMed = new boolean[] {false} ;
      T01KC3_A11764VxFTecNr = new short[1] ;
      T01KC3_n11764VxFTecNr = new boolean[] {false} ;
      T01KC3_A6826VXCliCod = new int[1] ;
      T01KC3_n6826VXCliCod = new boolean[] {false} ;
      T01KC3_A7420VxArtCod = new String[] {""} ;
      T01KC3_n7420VxArtCod = new boolean[] {false} ;
      sMode1717 = "" ;
      T01KC10_A7525VxOFabTip = new String[] {""} ;
      T01KC10_A12372VxOSCod = new int[1] ;
      T01KC11_A7525VxOFabTip = new String[] {""} ;
      T01KC11_A12372VxOSCod = new int[1] ;
      T01KC2_A7525VxOFabTip = new String[] {""} ;
      T01KC2_A12372VxOSCod = new int[1] ;
      T01KC2_A12374VxOSTandaN = new byte[1] ;
      T01KC2_n12374VxOSTandaN = new boolean[] {false} ;
      T01KC2_A12452VxOsNPedCl = new String[] {""} ;
      T01KC2_n12452VxOsNPedCl = new boolean[] {false} ;
      T01KC2_A12882VxOSAux1 = new String[] {""} ;
      T01KC2_n12882VxOSAux1 = new boolean[] {false} ;
      T01KC2_A12884VxOSCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC2_n12884VxOSCosKg = new boolean[] {false} ;
      T01KC2_A12904VXOSOriR = new String[] {""} ;
      T01KC2_n12904VXOSOriR = new boolean[] {false} ;
      T01KC2_A12903VXOSRef = new int[1] ;
      T01KC2_n12903VXOSRef = new boolean[] {false} ;
      T01KC2_A12948VXOSFinPr = new java.util.Date[] {GXutil.nullDate()} ;
      T01KC2_n12948VXOSFinPr = new boolean[] {false} ;
      T01KC2_A12978VxHRPGN = new String[] {""} ;
      T01KC2_n12978VxHRPGN = new boolean[] {false} ;
      T01KC2_A12979VXOSDibCli = new String[] {""} ;
      T01KC2_n12979VXOSDibCli = new boolean[] {false} ;
      T01KC2_A12980VXOSDibInt = new int[1] ;
      T01KC2_n12980VXOSDibInt = new boolean[] {false} ;
      T01KC2_A12984VxOsObs = new String[] {""} ;
      T01KC2_n12984VxOsObs = new boolean[] {false} ;
      T01KC2_A14124VxArtDscL = new String[] {""} ;
      T01KC2_A14127VXOSCodExt = new String[] {""} ;
      T01KC2_A14126VXOSNecCod = new long[1] ;
      T01KC2_A14122VxOsCosKR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC2_n14122VxOsCosKR = new boolean[] {false} ;
      T01KC2_A14123VxOsCosKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC2_n14123VxOsCosKT = new boolean[] {false} ;
      T01KC2_A14128VxOSCosHR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KC2_n14128VxOSCosHR = new boolean[] {false} ;
      T01KC2_A14136VxOSTotUni = new int[1] ;
      T01KC2_n14136VxOSTotUni = new boolean[] {false} ;
      T01KC2_A14135VxOSRsvPt = new short[1] ;
      T01KC2_A14137VxOSUniMed = new String[] {""} ;
      T01KC2_n14137VxOSUniMed = new boolean[] {false} ;
      T01KC2_A11764VxFTecNr = new short[1] ;
      T01KC2_n11764VxFTecNr = new boolean[] {false} ;
      T01KC2_A6826VXCliCod = new int[1] ;
      T01KC2_n6826VXCliCod = new boolean[] {false} ;
      T01KC2_A7420VxArtCod = new String[] {""} ;
      T01KC2_n7420VxArtCod = new boolean[] {false} ;
      T01KC15_A12977VXAcaArt = new String[] {""} ;
      T01KC15_n12977VXAcaArt = new boolean[] {false} ;
      T01KC16_A7525VxOFabTip = new String[] {""} ;
      T01KC16_A12372VxOSCod = new int[1] ;
      T01KC16_A6224VxLotId = new int[1] ;
      T01KC17_A7525VxOFabTip = new String[] {""} ;
      T01KC17_A12372VxOSCod = new int[1] ;
      T01KC17_A12663VxOsCoLi = new byte[1] ;
      T01KC18_A7525VxOFabTip = new String[] {""} ;
      T01KC18_A12372VxOSCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z14131VxOspedObs = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new long[1] ;
      GXv_int4 = new int[1] ;
      ZZ7525VxOFabTip = "" ;
      ZZ12452VxOsNPedCl = "" ;
      ZZ12882VxOSAux1 = "" ;
      ZZ12884VxOSCosKg = DecimalUtil.ZERO ;
      ZZ12904VXOSOriR = "" ;
      ZZ12948VXOSFinPr = GXutil.nullDate() ;
      ZZ12978VxHRPGN = "" ;
      ZZ12979VXOSDibCli = "" ;
      ZZ7420VxArtCod = "" ;
      ZZ12984VxOsObs = "" ;
      ZZ14124VxArtDscL = "" ;
      ZZ14127VXOSCodExt = "" ;
      ZZ14122VxOsCosKR = DecimalUtil.ZERO ;
      ZZ14123VxOsCosKT = DecimalUtil.ZERO ;
      ZZ14128VxOSCosHR = DecimalUtil.ZERO ;
      ZZ14137VxOSUniMed = "" ;
      ZZ14131VxOspedObs = "" ;
      ZZ12977VXAcaArt = "" ;
      T01KC19_A6826VXCliCod = new int[1] ;
      T01KC19_n6826VXCliCod = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxosrvi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxosrvi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxosrvi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxosrvi__default(),
         new Object[] {
             new Object[] {
            T01KC2_A7525VxOFabTip, T01KC2_A12372VxOSCod, T01KC2_A12374VxOSTandaN, T01KC2_n12374VxOSTandaN, T01KC2_A12452VxOsNPedCl, T01KC2_n12452VxOsNPedCl, T01KC2_A12882VxOSAux1, T01KC2_n12882VxOSAux1, T01KC2_A12884VxOSCosKg, T01KC2_n12884VxOSCosKg,
            T01KC2_A12904VXOSOriR, T01KC2_n12904VXOSOriR, T01KC2_A12903VXOSRef, T01KC2_n12903VXOSRef, T01KC2_A12948VXOSFinPr, T01KC2_n12948VXOSFinPr, T01KC2_A12978VxHRPGN, T01KC2_n12978VxHRPGN, T01KC2_A12979VXOSDibCli, T01KC2_n12979VXOSDibCli,
            T01KC2_A12980VXOSDibInt, T01KC2_n12980VXOSDibInt, T01KC2_A12984VxOsObs, T01KC2_n12984VxOsObs, T01KC2_A14124VxArtDscL, T01KC2_A14127VXOSCodExt, T01KC2_A14126VXOSNecCod, T01KC2_A14122VxOsCosKR, T01KC2_n14122VxOsCosKR, T01KC2_A14123VxOsCosKT,
            T01KC2_n14123VxOsCosKT, T01KC2_A14128VxOSCosHR, T01KC2_n14128VxOSCosHR, T01KC2_A14136VxOSTotUni, T01KC2_n14136VxOSTotUni, T01KC2_A14135VxOSRsvPt, T01KC2_A14137VxOSUniMed, T01KC2_n14137VxOSUniMed, T01KC2_A11764VxFTecNr, T01KC2_n11764VxFTecNr,
            T01KC2_A6826VXCliCod, T01KC2_n6826VXCliCod, T01KC2_A7420VxArtCod, T01KC2_n7420VxArtCod
            }
            , new Object[] {
            T01KC3_A7525VxOFabTip, T01KC3_A12372VxOSCod, T01KC3_A12374VxOSTandaN, T01KC3_n12374VxOSTandaN, T01KC3_A12452VxOsNPedCl, T01KC3_n12452VxOsNPedCl, T01KC3_A12882VxOSAux1, T01KC3_n12882VxOSAux1, T01KC3_A12884VxOSCosKg, T01KC3_n12884VxOSCosKg,
            T01KC3_A12904VXOSOriR, T01KC3_n12904VXOSOriR, T01KC3_A12903VXOSRef, T01KC3_n12903VXOSRef, T01KC3_A12948VXOSFinPr, T01KC3_n12948VXOSFinPr, T01KC3_A12978VxHRPGN, T01KC3_n12978VxHRPGN, T01KC3_A12979VXOSDibCli, T01KC3_n12979VXOSDibCli,
            T01KC3_A12980VXOSDibInt, T01KC3_n12980VXOSDibInt, T01KC3_A12984VxOsObs, T01KC3_n12984VxOsObs, T01KC3_A14124VxArtDscL, T01KC3_A14127VXOSCodExt, T01KC3_A14126VXOSNecCod, T01KC3_A14122VxOsCosKR, T01KC3_n14122VxOsCosKR, T01KC3_A14123VxOsCosKT,
            T01KC3_n14123VxOsCosKT, T01KC3_A14128VxOSCosHR, T01KC3_n14128VxOSCosHR, T01KC3_A14136VxOSTotUni, T01KC3_n14136VxOSTotUni, T01KC3_A14135VxOSRsvPt, T01KC3_A14137VxOSUniMed, T01KC3_n14137VxOSUniMed, T01KC3_A11764VxFTecNr, T01KC3_n11764VxFTecNr,
            T01KC3_A6826VXCliCod, T01KC3_n6826VXCliCod, T01KC3_A7420VxArtCod, T01KC3_n7420VxArtCod
            }
            , new Object[] {
            T01KC4_A6826VXCliCod
            }
            , new Object[] {
            T01KC5_A12977VXAcaArt, T01KC5_n12977VXAcaArt
            }
            , new Object[] {
            T01KC6_A7525VxOFabTip, T01KC6_A12372VxOSCod, T01KC6_A12374VxOSTandaN, T01KC6_n12374VxOSTandaN, T01KC6_A12452VxOsNPedCl, T01KC6_n12452VxOsNPedCl, T01KC6_A12882VxOSAux1, T01KC6_n12882VxOSAux1, T01KC6_A12884VxOSCosKg, T01KC6_n12884VxOSCosKg,
            T01KC6_A12904VXOSOriR, T01KC6_n12904VXOSOriR, T01KC6_A12903VXOSRef, T01KC6_n12903VXOSRef, T01KC6_A12948VXOSFinPr, T01KC6_n12948VXOSFinPr, T01KC6_A12978VxHRPGN, T01KC6_n12978VxHRPGN, T01KC6_A12979VXOSDibCli, T01KC6_n12979VXOSDibCli,
            T01KC6_A12980VXOSDibInt, T01KC6_n12980VXOSDibInt, T01KC6_A12984VxOsObs, T01KC6_n12984VxOsObs, T01KC6_A12977VXAcaArt, T01KC6_n12977VXAcaArt, T01KC6_A14124VxArtDscL, T01KC6_A14127VXOSCodExt, T01KC6_A14126VXOSNecCod, T01KC6_A14122VxOsCosKR,
            T01KC6_n14122VxOsCosKR, T01KC6_A14123VxOsCosKT, T01KC6_n14123VxOsCosKT, T01KC6_A14128VxOSCosHR, T01KC6_n14128VxOSCosHR, T01KC6_A14136VxOSTotUni, T01KC6_n14136VxOSTotUni, T01KC6_A14135VxOSRsvPt, T01KC6_A14137VxOSUniMed, T01KC6_n14137VxOSUniMed,
            T01KC6_A11764VxFTecNr, T01KC6_n11764VxFTecNr, T01KC6_A6826VXCliCod, T01KC6_n6826VXCliCod, T01KC6_A7420VxArtCod, T01KC6_n7420VxArtCod
            }
            , new Object[] {
            T01KC7_A6826VXCliCod
            }
            , new Object[] {
            T01KC8_A12977VXAcaArt, T01KC8_n12977VXAcaArt
            }
            , new Object[] {
            T01KC9_A7525VxOFabTip, T01KC9_A12372VxOSCod
            }
            , new Object[] {
            T01KC10_A7525VxOFabTip, T01KC10_A12372VxOSCod
            }
            , new Object[] {
            T01KC11_A7525VxOFabTip, T01KC11_A12372VxOSCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KC15_A12977VXAcaArt, T01KC15_n12977VXAcaArt
            }
            , new Object[] {
            T01KC16_A7525VxOFabTip, T01KC16_A12372VxOSCod, T01KC16_A6224VxLotId
            }
            , new Object[] {
            T01KC17_A7525VxOFabTip, T01KC17_A12372VxOSCod, T01KC17_A12663VxOsCoLi
            }
            , new Object[] {
            T01KC18_A7525VxOFabTip, T01KC18_A12372VxOSCod
            }
            , new Object[] {
            T01KC19_A6826VXCliCod
            }
         }
      );
   }

   private byte Z12374VxOSTandaN ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12374VxOSTandaN ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12374VxOSTandaN ;
   private short Z14135VxOSRsvPt ;
   private short Z11764VxFTecNr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14135VxOSRsvPt ;
   private short A11764VxFTecNr ;
   private short RcdFound1717 ;
   private short nIsDirty_1717 ;
   private short ZZ14135VxOSRsvPt ;
   private short ZZ11764VxFTecNr ;
   private int Z12372VxOSCod ;
   private int Z12903VXOSRef ;
   private int Z12980VXOSDibInt ;
   private int Z14136VxOSTotUni ;
   private int Z6826VXCliCod ;
   private int A12372VxOSCod ;
   private int A6826VXCliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxOFabTip_Enabled ;
   private int edtVxOSCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxOSTandaN_Enabled ;
   private int edtVxOsNPedCl_Enabled ;
   private int edtVxOSAux1_Enabled ;
   private int edtVxOSCosKg_Enabled ;
   private int edtVXOSOriR_Enabled ;
   private int A12903VXOSRef ;
   private int edtVXOSRef_Enabled ;
   private int edtVXOSFinPr_Enabled ;
   private int edtVxHRPGN_Enabled ;
   private int edtVXOSDibCli_Enabled ;
   private int A12980VXOSDibInt ;
   private int edtVXOSDibInt_Enabled ;
   private int edtVXCliCod_Enabled ;
   private int edtVxArtCod_Enabled ;
   private int edtVxOsObs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A14136VxOSTotUni ;
   private int A14130VXOsPedNOf ;
   private int A14125VxOsCliDes ;
   private int GX_JID ;
   private int idxLst ;
   private int edtVxOsObs_Backcolor ;
   private int edtVxArtCod_Backcolor ;
   private int edtVXCliCod_Backcolor ;
   private int edtVXOSDibInt_Backcolor ;
   private int edtVXOSDibCli_Backcolor ;
   private int edtVxHRPGN_Backcolor ;
   private int edtVXOSFinPr_Backcolor ;
   private int edtVXOSRef_Backcolor ;
   private int edtVXOSOriR_Backcolor ;
   private int edtVxOSCosKg_Backcolor ;
   private int edtVxOSAux1_Backcolor ;
   private int edtVxOsNPedCl_Backcolor ;
   private int edtVxOSTandaN_Backcolor ;
   private int edtVxOSCod_Backcolor ;
   private int edtVxOFabTip_Backcolor ;
   private int Z14130VXOsPedNOf ;
   private int Z14125VxOsCliDes ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int ZZ12372VxOSCod ;
   private int ZZ12903VXOSRef ;
   private int ZZ12980VXOSDibInt ;
   private int ZZ6826VXCliCod ;
   private int ZZ14136VxOSTotUni ;
   private int ZZ14130VXOsPedNOf ;
   private int ZZ14125VxOsCliDes ;
   private long Z14126VXOSNecCod ;
   private long A14126VXOSNecCod ;
   private long A14129VXOsPedERP ;
   private long Z14129VXOsPedERP ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long ZZ14126VXOSNecCod ;
   private long ZZ14129VXOsPedERP ;
   private java.math.BigDecimal Z12884VxOSCosKg ;
   private java.math.BigDecimal Z14122VxOsCosKR ;
   private java.math.BigDecimal Z14123VxOsCosKT ;
   private java.math.BigDecimal Z14128VxOSCosHR ;
   private java.math.BigDecimal A12884VxOSCosKg ;
   private java.math.BigDecimal A14122VxOsCosKR ;
   private java.math.BigDecimal A14123VxOsCosKT ;
   private java.math.BigDecimal A14128VxOSCosHR ;
   private java.math.BigDecimal ZZ12884VxOSCosKg ;
   private java.math.BigDecimal ZZ14122VxOsCosKR ;
   private java.math.BigDecimal ZZ14123VxOsCosKT ;
   private java.math.BigDecimal ZZ14128VxOSCosHR ;
   private String sPrefix ;
   private String Z7525VxOFabTip ;
   private String Z12452VxOsNPedCl ;
   private String Z12882VxOSAux1 ;
   private String Z12904VXOSOriR ;
   private String Z12978VxHRPGN ;
   private String Z12979VXOSDibCli ;
   private String Z12984VxOsObs ;
   private String Z14127VXOSCodExt ;
   private String Z14137VxOSUniMed ;
   private String Z7420VxArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7525VxOFabTip ;
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
   private String edtVxOFabTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxOSCod_Internalname ;
   private String edtVxOSCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxOSTandaN_Internalname ;
   private String edtVxOSTandaN_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxOsNPedCl_Internalname ;
   private String A12452VxOsNPedCl ;
   private String edtVxOsNPedCl_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxOSAux1_Internalname ;
   private String A12882VxOSAux1 ;
   private String edtVxOSAux1_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxOSCosKg_Internalname ;
   private String edtVxOSCosKg_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVXOSOriR_Internalname ;
   private String A12904VXOSOriR ;
   private String edtVXOSOriR_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVXOSRef_Internalname ;
   private String edtVXOSRef_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVXOSFinPr_Internalname ;
   private String edtVXOSFinPr_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtVxHRPGN_Internalname ;
   private String A12978VxHRPGN ;
   private String edtVxHRPGN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtVXOSDibCli_Internalname ;
   private String A12979VXOSDibCli ;
   private String edtVXOSDibCli_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtVXOSDibInt_Internalname ;
   private String edtVXOSDibInt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtVXCliCod_Internalname ;
   private String edtVXCliCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtVxArtCod_Internalname ;
   private String edtVxArtCod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtVxOsObs_Internalname ;
   private String A12984VxOsObs ;
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
   private String A14127VXOSCodExt ;
   private String A14137VxOSUniMed ;
   private String Gx_mode ;
   private String A12977VXAcaArt ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z12977VXAcaArt ;
   private String sMode1717 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZZ7525VxOFabTip ;
   private String ZZ12452VxOsNPedCl ;
   private String ZZ12882VxOSAux1 ;
   private String ZZ12904VXOSOriR ;
   private String ZZ12978VxHRPGN ;
   private String ZZ12979VXOSDibCli ;
   private String ZZ7420VxArtCod ;
   private String ZZ12984VxOsObs ;
   private String ZZ14127VXOSCodExt ;
   private String ZZ14137VxOSUniMed ;
   private String ZZ12977VXAcaArt ;
   private java.util.Date Z12948VXOSFinPr ;
   private java.util.Date A12948VXOSFinPr ;
   private java.util.Date ZZ12948VXOSFinPr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6826VXCliCod ;
   private boolean n7420VxArtCod ;
   private boolean wbErr ;
   private boolean n14122VxOsCosKR ;
   private boolean n14123VxOsCosKT ;
   private boolean n14128VxOSCosHR ;
   private boolean n14136VxOSTotUni ;
   private boolean n14137VxOSUniMed ;
   private boolean n11764VxFTecNr ;
   private boolean n12977VXAcaArt ;
   private boolean n12374VxOSTandaN ;
   private boolean n12452VxOsNPedCl ;
   private boolean n12882VxOSAux1 ;
   private boolean n12884VxOSCosKg ;
   private boolean n12904VXOSOriR ;
   private boolean n12903VXOSRef ;
   private boolean n12948VXOSFinPr ;
   private boolean n12978VxHRPGN ;
   private boolean n12979VXOSDibCli ;
   private boolean n12980VXOSDibInt ;
   private boolean n12984VxOsObs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14124VxArtDscL ;
   private String A14124VxArtDscL ;
   private String A14131VxOspedObs ;
   private String Z14131VxOspedObs ;
   private String ZZ14124VxArtDscL ;
   private String ZZ14131VxOspedObs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01KC6_A7525VxOFabTip ;
   private int[] T01KC6_A12372VxOSCod ;
   private byte[] T01KC6_A12374VxOSTandaN ;
   private boolean[] T01KC6_n12374VxOSTandaN ;
   private String[] T01KC6_A12452VxOsNPedCl ;
   private boolean[] T01KC6_n12452VxOsNPedCl ;
   private String[] T01KC6_A12882VxOSAux1 ;
   private boolean[] T01KC6_n12882VxOSAux1 ;
   private java.math.BigDecimal[] T01KC6_A12884VxOSCosKg ;
   private boolean[] T01KC6_n12884VxOSCosKg ;
   private String[] T01KC6_A12904VXOSOriR ;
   private boolean[] T01KC6_n12904VXOSOriR ;
   private int[] T01KC6_A12903VXOSRef ;
   private boolean[] T01KC6_n12903VXOSRef ;
   private java.util.Date[] T01KC6_A12948VXOSFinPr ;
   private boolean[] T01KC6_n12948VXOSFinPr ;
   private String[] T01KC6_A12978VxHRPGN ;
   private boolean[] T01KC6_n12978VxHRPGN ;
   private String[] T01KC6_A12979VXOSDibCli ;
   private boolean[] T01KC6_n12979VXOSDibCli ;
   private int[] T01KC6_A12980VXOSDibInt ;
   private boolean[] T01KC6_n12980VXOSDibInt ;
   private String[] T01KC6_A12984VxOsObs ;
   private boolean[] T01KC6_n12984VxOsObs ;
   private String[] T01KC6_A12977VXAcaArt ;
   private boolean[] T01KC6_n12977VXAcaArt ;
   private String[] T01KC6_A14124VxArtDscL ;
   private String[] T01KC6_A14127VXOSCodExt ;
   private long[] T01KC6_A14126VXOSNecCod ;
   private java.math.BigDecimal[] T01KC6_A14122VxOsCosKR ;
   private boolean[] T01KC6_n14122VxOsCosKR ;
   private java.math.BigDecimal[] T01KC6_A14123VxOsCosKT ;
   private boolean[] T01KC6_n14123VxOsCosKT ;
   private java.math.BigDecimal[] T01KC6_A14128VxOSCosHR ;
   private boolean[] T01KC6_n14128VxOSCosHR ;
   private int[] T01KC6_A14136VxOSTotUni ;
   private boolean[] T01KC6_n14136VxOSTotUni ;
   private short[] T01KC6_A14135VxOSRsvPt ;
   private String[] T01KC6_A14137VxOSUniMed ;
   private boolean[] T01KC6_n14137VxOSUniMed ;
   private short[] T01KC6_A11764VxFTecNr ;
   private boolean[] T01KC6_n11764VxFTecNr ;
   private int[] T01KC6_A6826VXCliCod ;
   private boolean[] T01KC6_n6826VXCliCod ;
   private String[] T01KC6_A7420VxArtCod ;
   private boolean[] T01KC6_n7420VxArtCod ;
   private int[] T01KC4_A6826VXCliCod ;
   private boolean[] T01KC4_n6826VXCliCod ;
   private String[] T01KC5_A12977VXAcaArt ;
   private boolean[] T01KC5_n12977VXAcaArt ;
   private int[] T01KC7_A6826VXCliCod ;
   private boolean[] T01KC7_n6826VXCliCod ;
   private String[] T01KC8_A12977VXAcaArt ;
   private boolean[] T01KC8_n12977VXAcaArt ;
   private String[] T01KC9_A7525VxOFabTip ;
   private int[] T01KC9_A12372VxOSCod ;
   private String[] T01KC3_A7525VxOFabTip ;
   private int[] T01KC3_A12372VxOSCod ;
   private byte[] T01KC3_A12374VxOSTandaN ;
   private boolean[] T01KC3_n12374VxOSTandaN ;
   private String[] T01KC3_A12452VxOsNPedCl ;
   private boolean[] T01KC3_n12452VxOsNPedCl ;
   private String[] T01KC3_A12882VxOSAux1 ;
   private boolean[] T01KC3_n12882VxOSAux1 ;
   private java.math.BigDecimal[] T01KC3_A12884VxOSCosKg ;
   private boolean[] T01KC3_n12884VxOSCosKg ;
   private String[] T01KC3_A12904VXOSOriR ;
   private boolean[] T01KC3_n12904VXOSOriR ;
   private int[] T01KC3_A12903VXOSRef ;
   private boolean[] T01KC3_n12903VXOSRef ;
   private java.util.Date[] T01KC3_A12948VXOSFinPr ;
   private boolean[] T01KC3_n12948VXOSFinPr ;
   private String[] T01KC3_A12978VxHRPGN ;
   private boolean[] T01KC3_n12978VxHRPGN ;
   private String[] T01KC3_A12979VXOSDibCli ;
   private boolean[] T01KC3_n12979VXOSDibCli ;
   private int[] T01KC3_A12980VXOSDibInt ;
   private boolean[] T01KC3_n12980VXOSDibInt ;
   private String[] T01KC3_A12984VxOsObs ;
   private boolean[] T01KC3_n12984VxOsObs ;
   private String[] T01KC3_A14124VxArtDscL ;
   private String[] T01KC3_A14127VXOSCodExt ;
   private long[] T01KC3_A14126VXOSNecCod ;
   private java.math.BigDecimal[] T01KC3_A14122VxOsCosKR ;
   private boolean[] T01KC3_n14122VxOsCosKR ;
   private java.math.BigDecimal[] T01KC3_A14123VxOsCosKT ;
   private boolean[] T01KC3_n14123VxOsCosKT ;
   private java.math.BigDecimal[] T01KC3_A14128VxOSCosHR ;
   private boolean[] T01KC3_n14128VxOSCosHR ;
   private int[] T01KC3_A14136VxOSTotUni ;
   private boolean[] T01KC3_n14136VxOSTotUni ;
   private short[] T01KC3_A14135VxOSRsvPt ;
   private String[] T01KC3_A14137VxOSUniMed ;
   private boolean[] T01KC3_n14137VxOSUniMed ;
   private short[] T01KC3_A11764VxFTecNr ;
   private boolean[] T01KC3_n11764VxFTecNr ;
   private int[] T01KC3_A6826VXCliCod ;
   private boolean[] T01KC3_n6826VXCliCod ;
   private String[] T01KC3_A7420VxArtCod ;
   private boolean[] T01KC3_n7420VxArtCod ;
   private String[] T01KC10_A7525VxOFabTip ;
   private int[] T01KC10_A12372VxOSCod ;
   private String[] T01KC11_A7525VxOFabTip ;
   private int[] T01KC11_A12372VxOSCod ;
   private String[] T01KC2_A7525VxOFabTip ;
   private int[] T01KC2_A12372VxOSCod ;
   private byte[] T01KC2_A12374VxOSTandaN ;
   private boolean[] T01KC2_n12374VxOSTandaN ;
   private String[] T01KC2_A12452VxOsNPedCl ;
   private boolean[] T01KC2_n12452VxOsNPedCl ;
   private String[] T01KC2_A12882VxOSAux1 ;
   private boolean[] T01KC2_n12882VxOSAux1 ;
   private java.math.BigDecimal[] T01KC2_A12884VxOSCosKg ;
   private boolean[] T01KC2_n12884VxOSCosKg ;
   private String[] T01KC2_A12904VXOSOriR ;
   private boolean[] T01KC2_n12904VXOSOriR ;
   private int[] T01KC2_A12903VXOSRef ;
   private boolean[] T01KC2_n12903VXOSRef ;
   private java.util.Date[] T01KC2_A12948VXOSFinPr ;
   private boolean[] T01KC2_n12948VXOSFinPr ;
   private String[] T01KC2_A12978VxHRPGN ;
   private boolean[] T01KC2_n12978VxHRPGN ;
   private String[] T01KC2_A12979VXOSDibCli ;
   private boolean[] T01KC2_n12979VXOSDibCli ;
   private int[] T01KC2_A12980VXOSDibInt ;
   private boolean[] T01KC2_n12980VXOSDibInt ;
   private String[] T01KC2_A12984VxOsObs ;
   private boolean[] T01KC2_n12984VxOsObs ;
   private String[] T01KC2_A14124VxArtDscL ;
   private String[] T01KC2_A14127VXOSCodExt ;
   private long[] T01KC2_A14126VXOSNecCod ;
   private java.math.BigDecimal[] T01KC2_A14122VxOsCosKR ;
   private boolean[] T01KC2_n14122VxOsCosKR ;
   private java.math.BigDecimal[] T01KC2_A14123VxOsCosKT ;
   private boolean[] T01KC2_n14123VxOsCosKT ;
   private java.math.BigDecimal[] T01KC2_A14128VxOSCosHR ;
   private boolean[] T01KC2_n14128VxOSCosHR ;
   private int[] T01KC2_A14136VxOSTotUni ;
   private boolean[] T01KC2_n14136VxOSTotUni ;
   private short[] T01KC2_A14135VxOSRsvPt ;
   private String[] T01KC2_A14137VxOSUniMed ;
   private boolean[] T01KC2_n14137VxOSUniMed ;
   private short[] T01KC2_A11764VxFTecNr ;
   private boolean[] T01KC2_n11764VxFTecNr ;
   private int[] T01KC2_A6826VXCliCod ;
   private boolean[] T01KC2_n6826VXCliCod ;
   private String[] T01KC2_A7420VxArtCod ;
   private boolean[] T01KC2_n7420VxArtCod ;
   private String[] T01KC15_A12977VXAcaArt ;
   private boolean[] T01KC15_n12977VXAcaArt ;
   private String[] T01KC16_A7525VxOFabTip ;
   private int[] T01KC16_A12372VxOSCod ;
   private int[] T01KC16_A6224VxLotId ;
   private String[] T01KC17_A7525VxOFabTip ;
   private int[] T01KC17_A12372VxOSCod ;
   private byte[] T01KC17_A12663VxOsCoLi ;
   private String[] T01KC18_A7525VxOFabTip ;
   private int[] T01KC18_A12372VxOSCod ;
   private int[] T01KC19_A6826VXCliCod ;
   private boolean[] T01KC19_n6826VXCliCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxosrvi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrvi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrvi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrvi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KC2", "SELECT OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSTandaNro, OSPedCliPe, OSAux1, OSCosKg, OSOriReg, OSRefer, OSFeFP, HRutPGN, OSPedDibCo, OSDibInt, OSObs, VxArtDscL, VXOSCodExterno, VXOSNecCod, VxOsCosKR, VxOsCosKT, VxOSCosHR, VxOSTotUni, VxOSRsvPt, VxOSUniMed, VxFTecNr, CliCod AS VXCliCod, ArtCod AS VxArtCod FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ?  FOR UPDATE OF OSTandaNro, OSPedCliPe, OSAux1, OSCosKg, OSOriReg, OSRefer, OSFeFP, HRutPGN, OSPedDibCo, OSDibInt, OSObs, VxArtDscL, VXOSCodExterno, VXOSNecCod, VxOsCosKR, VxOsCosKT, VxOSCosHR, VxOSTotUni, VxOSRsvPt, VxOSUniMed, VxFTecNr, CliCod, ArtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC3", "SELECT OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSTandaNro, OSPedCliPe, OSAux1, OSCosKg, OSOriReg, OSRefer, OSFeFP, HRutPGN, OSPedDibCo, OSDibInt, OSObs, VxArtDscL, VXOSCodExterno, VXOSNecCod, VxOsCosKR, VxOsCosKT, VxOSCosHR, VxOSTotUni, VxOSRsvPt, VxOSUniMed, VxFTecNr, CliCod AS VXCliCod, ArtCod AS VxArtCod FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC4", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC5", "SELECT AcaArtCod AS VXAcaArt FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC6", "SELECT /*+ FIRST_ROWS(100) */ TM1.OFabTip AS VxOFabTip, TM1.OSCod AS VxOSCod, TM1.OSTandaNro, TM1.OSPedCliPe, TM1.OSAux1, TM1.OSCosKg, TM1.OSOriReg, TM1.OSRefer, TM1.OSFeFP, TM1.HRutPGN, TM1.OSPedDibCo, TM1.OSDibInt, TM1.OSObs, T2.AcaArtCod AS VXAcaArt, TM1.VxArtDscL, TM1.VXOSCodExterno, TM1.VXOSNecCod, TM1.VxOsCosKR, TM1.VxOsCosKT, TM1.VxOSCosHR, TM1.VxOSTotUni, TM1.VxOSRsvPt, TM1.VxOSUniMed, TM1.VxFTecNr, TM1.CliCod AS VXCliCod, TM1.ArtCod AS VxArtCod FROM (VTXOSERVI TM1 LEFT JOIN VTXARTIC T2 ON T2.ArtCod = TM1.ArtCod) WHERE TM1.OFabTip = ? and TM1.OSCod = ? ORDER BY TM1.OFabTip, TM1.OSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC7", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC8", "SELECT AcaArtCod AS VXAcaArt FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC9", "SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERVI WHERE ( OFabTip > ? or OFabTip = ? and OSCod > ?) ORDER BY OFabTip, OSCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERVI WHERE ( OFabTip < ? or OFabTip = ? and OSCod < ?) ORDER BY OFabTip DESC, OSCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KC12", "INSERT INTO VTXOSERVI(OFabTip, OSCod, OSTandaNro, OSPedCliPe, OSAux1, OSCosKg, OSOriReg, OSRefer, OSFeFP, HRutPGN, OSPedDibCo, OSDibInt, OSObs, VxArtDscL, VXOSCodExterno, VXOSNecCod, VxOsCosKR, VxOsCosKT, VxOSCosHR, VxOSTotUni, VxOSRsvPt, VxOSUniMed, VxFTecNr, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXOSERVI")
         ,new UpdateCursor("T01KC13", "UPDATE VTXOSERVI SET OSTandaNro=?, OSPedCliPe=?, OSAux1=?, OSCosKg=?, OSOriReg=?, OSRefer=?, OSFeFP=?, HRutPGN=?, OSPedDibCo=?, OSDibInt=?, OSObs=?, VxArtDscL=?, VXOSCodExterno=?, VXOSNecCod=?, VxOsCosKR=?, VxOsCosKT=?, VxOSCosHR=?, VxOSTotUni=?, VxOSRsvPt=?, VxOSUniMed=?, VxFTecNr=?, CliCod=?, ArtCod=?  WHERE OFabTip = ? AND OSCod = ?", GX_NOMASK, "VTXOSERVI")
         ,new UpdateCursor("T01KC14", "DELETE FROM VTXOSERVI  WHERE OFabTip = ? AND OSCod = ?", GX_NOMASK, "VTXOSERVI")
         ,new ForEachCursor("T01KC15", "SELECT AcaArtCod AS VXAcaArt FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC16", "SELECT * FROM (SELECT OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId FROM VTXOSERPI WHERE OFabTip = ? AND OSCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KC17", "SELECT * FROM (SELECT OFabTip AS VxOFabTip, OSCod AS VxOSCod, OSCoLin FROM VTXOSERCO WHERE OFabTip = ? AND OSCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KC18", "SELECT /*+ FIRST_ROWS(100) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod FROM VTXOSERVI ORDER BY OFabTip, OSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KC19", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 200);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 20);
               ((long[]) buf[26])[0] = rslt.getLong(16);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(21);
               ((String[]) buf[36])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 200);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 20);
               ((long[]) buf[26])[0] = rslt.getLong(16);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(21);
               ((String[]) buf[36])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 200);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15);
               ((String[]) buf[27])[0] = rslt.getString(16, 20);
               ((long[]) buf[28])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(22);
               ((String[]) buf[38])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(25);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 200);
               }
               stmt.setVarchar(14, (String)parms[24], 60, false);
               stmt.setString(15, (String)parms[25], 20);
               stmt.setLong(16, ((Number) parms[26]).longValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[34]).intValue());
               }
               stmt.setShort(21, ((Number) parms[35]).shortValue());
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[43], 16);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 16);
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
                  stmt.setString(11, (String)parms[21], 200);
               }
               stmt.setVarchar(12, (String)parms[22], 60, false);
               stmt.setString(13, (String)parms[23], 20);
               stmt.setLong(14, ((Number) parms[24]).longValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[32]).intValue());
               }
               stmt.setShort(19, ((Number) parms[33]).shortValue());
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 16);
               }
               stmt.setString(24, (String)parms[42], 2);
               stmt.setInt(25, ((Number) parms[43]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
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

