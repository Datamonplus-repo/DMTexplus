package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tempcon_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "EMPRESAS EN CONTABILIDAD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmp1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tempcon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tempcon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempcon_impl.class ));
   }

   public tempcon_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEMPCON.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Emp1", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp1_Internalname, GXutil.rtrim( A961Emp1), GXutil.rtrim( localUtil.format( A961Emp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp1_Jsonclick, 0, "", "", "", "", "", 1, edtEmp1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Emp0", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp0_Internalname, GXutil.rtrim( A962Emp0), GXutil.rtrim( localUtil.format( A962Emp0, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp0_Jsonclick, 0, "", "", "", "", "", 1, edtEmp0_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ser1", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer1_Internalname, GXutil.rtrim( A963Ser1), GXutil.rtrim( localUtil.format( A963Ser1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer1_Jsonclick, 0, "", "", "", "", "", 1, edtSer1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ser0", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer0_Internalname, GXutil.rtrim( A964Ser0), GXutil.rtrim( localUtil.format( A964Ser0, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer0_Jsonclick, 0, "", "", "", "", "", 1, edtSer0_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Serie Factura 2 Traspaso CTB", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer2_Internalname, GXutil.rtrim( A2387Ser2), GXutil.rtrim( localUtil.format( A2387Ser2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer2_Jsonclick, 0, "", "", "", "", "", 1, edtSer2_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie Factura 2 Traspaso CTB 0", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer20_Internalname, GXutil.rtrim( A2388Ser20), GXutil.rtrim( localUtil.format( A2388Ser20, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer20_Jsonclick, 0, "", "", "", "", "", 1, edtSer20_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie Factura 3 Traspaso CTB", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer3_Internalname, GXutil.rtrim( A2389Ser3), GXutil.rtrim( localUtil.format( A2389Ser3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer3_Jsonclick, 0, "", "", "", "", "", 1, edtSer3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Serie Factura 3 Traspaso CTB 0", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer30_Internalname, GXutil.rtrim( A2390Ser30), GXutil.rtrim( localUtil.format( A2390Ser30, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer30_Jsonclick, 0, "", "", "", "", "", 1, edtSer30_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Serie Factura 4 Traspaso CTB", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer4_Internalname, GXutil.rtrim( A4215Ser4), GXutil.rtrim( localUtil.format( A4215Ser4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer4_Jsonclick, 0, "", "", "", "", "", 1, edtSer4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Serie Factura 4 Traspaso CTB 0", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer40_Internalname, GXutil.rtrim( A4216Ser40), GXutil.rtrim( localUtil.format( A4216Ser40, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer40_Jsonclick, 0, "", "", "", "", "", 1, edtSer40_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Serie Factura 5 Traspaso CTB", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer5_Internalname, GXutil.rtrim( A4217Ser5), GXutil.rtrim( localUtil.format( A4217Ser5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer5_Jsonclick, 0, "", "", "", "", "", 1, edtSer5_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Serie Factura 5Traspaso CTB 0", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer50_Internalname, GXutil.rtrim( A4218Ser50), GXutil.rtrim( localUtil.format( A4218Ser50, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer50_Jsonclick, 0, "", "", "", "", "", 1, edtSer50_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Serie Factura 6 Traspaso CTB", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer6_Internalname, GXutil.rtrim( A4219Ser6), GXutil.rtrim( localUtil.format( A4219Ser6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer6_Jsonclick, 0, "", "", "", "", "", 1, edtSer6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Serie Factura 6 Traspaso CTB 0", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer60_Internalname, GXutil.rtrim( A4220Ser60), GXutil.rtrim( localUtil.format( A4220Ser60, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer60_Jsonclick, 0, "", "", "", "", "", 1, edtSer60_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Serie Factura 7 Traspaso CTB", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer7_Internalname, GXutil.rtrim( A4221Ser7), GXutil.rtrim( localUtil.format( A4221Ser7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer7_Jsonclick, 0, "", "", "", "", "", 1, edtSer7_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Serie Factura 7 Traspaso CTB 0", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer70_Internalname, GXutil.rtrim( A4222Ser70), GXutil.rtrim( localUtil.format( A4222Ser70, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer70_Jsonclick, 0, "", "", "", "", "", 1, edtSer70_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEMPCON.htm");
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
      e116E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z961Emp1 = httpContext.cgiGet( "Z961Emp1") ;
            Z962Emp0 = httpContext.cgiGet( "Z962Emp0") ;
            Z963Ser1 = httpContext.cgiGet( "Z963Ser1") ;
            Z964Ser0 = httpContext.cgiGet( "Z964Ser0") ;
            Z2387Ser2 = httpContext.cgiGet( "Z2387Ser2") ;
            Z2388Ser20 = httpContext.cgiGet( "Z2388Ser20") ;
            Z2389Ser3 = httpContext.cgiGet( "Z2389Ser3") ;
            Z2390Ser30 = httpContext.cgiGet( "Z2390Ser30") ;
            Z4215Ser4 = httpContext.cgiGet( "Z4215Ser4") ;
            Z4216Ser40 = httpContext.cgiGet( "Z4216Ser40") ;
            Z4217Ser5 = httpContext.cgiGet( "Z4217Ser5") ;
            Z4218Ser50 = httpContext.cgiGet( "Z4218Ser50") ;
            Z4219Ser6 = httpContext.cgiGet( "Z4219Ser6") ;
            Z4220Ser60 = httpContext.cgiGet( "Z4220Ser60") ;
            Z4221Ser7 = httpContext.cgiGet( "Z4221Ser7") ;
            Z4222Ser70 = httpContext.cgiGet( "Z4222Ser70") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A961Emp1 = httpContext.cgiGet( edtEmp1_Internalname) ;
            n961Emp1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
            A962Emp0 = httpContext.cgiGet( edtEmp0_Internalname) ;
            n962Emp0 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
            A963Ser1 = httpContext.cgiGet( edtSer1_Internalname) ;
            n963Ser1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
            A964Ser0 = httpContext.cgiGet( edtSer0_Internalname) ;
            n964Ser0 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
            A2387Ser2 = httpContext.cgiGet( edtSer2_Internalname) ;
            n2387Ser2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
            A2388Ser20 = httpContext.cgiGet( edtSer20_Internalname) ;
            n2388Ser20 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
            A2389Ser3 = httpContext.cgiGet( edtSer3_Internalname) ;
            n2389Ser3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
            A2390Ser30 = httpContext.cgiGet( edtSer30_Internalname) ;
            n2390Ser30 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
            A4215Ser4 = httpContext.cgiGet( edtSer4_Internalname) ;
            n4215Ser4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4215Ser4", A4215Ser4);
            A4216Ser40 = httpContext.cgiGet( edtSer40_Internalname) ;
            n4216Ser40 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4216Ser40", A4216Ser40);
            A4217Ser5 = httpContext.cgiGet( edtSer5_Internalname) ;
            n4217Ser5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4217Ser5", A4217Ser5);
            A4218Ser50 = httpContext.cgiGet( edtSer50_Internalname) ;
            n4218Ser50 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4218Ser50", A4218Ser50);
            A4219Ser6 = httpContext.cgiGet( edtSer6_Internalname) ;
            n4219Ser6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4219Ser6", A4219Ser6);
            A4220Ser60 = httpContext.cgiGet( edtSer60_Internalname) ;
            n4220Ser60 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4220Ser60", A4220Ser60);
            A4221Ser7 = httpContext.cgiGet( edtSer7_Internalname) ;
            n4221Ser7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4221Ser7", A4221Ser7);
            A4222Ser70 = httpContext.cgiGet( edtSer70_Internalname) ;
            n4222Ser70 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4222Ser70", A4222Ser70);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TEMPCON");
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tempcon:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e116E2 ();
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
            initAll6E27( ) ;
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
      disableAttributes6E27( ) ;
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

   public void confirm_6E0( )
   {
      beforeValidate6E27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls6E27( ) ;
         }
         else
         {
            checkExtendedTable6E27( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors6E27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues6E0( ) ;
      }
   }

   public void resetCaption6E0( )
   {
   }

   public void e116E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV19Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit1", AV19Lit1);
      GXt_char1 = AV20Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT357_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit2", AV20Lit2);
      GXt_char1 = AV21Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT358_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit3", AV21Lit3);
      GXt_char1 = AV22Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT359_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit4", AV22Lit4);
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT360_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit5", AV23Lit5);
      GXt_char1 = AV24Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT362_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit6", AV24Lit6);
      GXt_char1 = AV25Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT363_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit7", AV25Lit7);
      GXt_char1 = AV28Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL002_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit8", AV28Lit8);
      GXt_char1 = AV29Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL003_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit9", AV29Lit9);
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL004_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV31Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL005_", ""), (byte)(99), GXv_char2) ;
      tempcon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit11", AV31Lit11);
      AV26Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      tempcon_impl.this.A396EmprCod = GXv_char2[0] ;
      tempcon_impl.this.AV27EmprNom = GXv_char3[0] ;
      tempcon_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm6E27( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T006E3_A407EmprNom[0] ;
            Z961Emp1 = T006E3_A961Emp1[0] ;
            Z962Emp0 = T006E3_A962Emp0[0] ;
            Z963Ser1 = T006E3_A963Ser1[0] ;
            Z964Ser0 = T006E3_A964Ser0[0] ;
            Z2387Ser2 = T006E3_A2387Ser2[0] ;
            Z2388Ser20 = T006E3_A2388Ser20[0] ;
            Z2389Ser3 = T006E3_A2389Ser3[0] ;
            Z2390Ser30 = T006E3_A2390Ser30[0] ;
            Z4215Ser4 = T006E3_A4215Ser4[0] ;
            Z4216Ser40 = T006E3_A4216Ser40[0] ;
            Z4217Ser5 = T006E3_A4217Ser5[0] ;
            Z4218Ser50 = T006E3_A4218Ser50[0] ;
            Z4219Ser6 = T006E3_A4219Ser6[0] ;
            Z4220Ser60 = T006E3_A4220Ser60[0] ;
            Z4221Ser7 = T006E3_A4221Ser7[0] ;
            Z4222Ser70 = T006E3_A4222Ser70[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z961Emp1 = A961Emp1 ;
            Z962Emp0 = A962Emp0 ;
            Z963Ser1 = A963Ser1 ;
            Z964Ser0 = A964Ser0 ;
            Z2387Ser2 = A2387Ser2 ;
            Z2388Ser20 = A2388Ser20 ;
            Z2389Ser3 = A2389Ser3 ;
            Z2390Ser30 = A2390Ser30 ;
            Z4215Ser4 = A4215Ser4 ;
            Z4216Ser40 = A4216Ser40 ;
            Z4217Ser5 = A4217Ser5 ;
            Z4218Ser50 = A4218Ser50 ;
            Z4219Ser6 = A4219Ser6 ;
            Z4220Ser60 = A4220Ser60 ;
            Z4221Ser7 = A4221Ser7 ;
            Z4222Ser70 = A4222Ser70 ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z961Emp1 = A961Emp1 ;
         Z962Emp0 = A962Emp0 ;
         Z963Ser1 = A963Ser1 ;
         Z964Ser0 = A964Ser0 ;
         Z2387Ser2 = A2387Ser2 ;
         Z2388Ser20 = A2388Ser20 ;
         Z2389Ser3 = A2389Ser3 ;
         Z2390Ser30 = A2390Ser30 ;
         Z4215Ser4 = A4215Ser4 ;
         Z4216Ser40 = A4216Ser40 ;
         Z4217Ser5 = A4217Ser5 ;
         Z4218Ser50 = A4218Ser50 ;
         Z4219Ser6 = A4219Ser6 ;
         Z4220Ser60 = A4220Ser60 ;
         Z4221Ser7 = A4221Ser7 ;
         Z4222Ser70 = A4222Ser70 ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "nada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load6E27( )
   {
      /* Using cursor T006E4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T006E4_A407EmprNom[0] ;
         n407EmprNom = T006E4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A961Emp1 = T006E4_A961Emp1[0] ;
         n961Emp1 = T006E4_n961Emp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
         A962Emp0 = T006E4_A962Emp0[0] ;
         n962Emp0 = T006E4_n962Emp0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
         A963Ser1 = T006E4_A963Ser1[0] ;
         n963Ser1 = T006E4_n963Ser1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
         A964Ser0 = T006E4_A964Ser0[0] ;
         n964Ser0 = T006E4_n964Ser0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
         A2387Ser2 = T006E4_A2387Ser2[0] ;
         n2387Ser2 = T006E4_n2387Ser2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
         A2388Ser20 = T006E4_A2388Ser20[0] ;
         n2388Ser20 = T006E4_n2388Ser20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
         A2389Ser3 = T006E4_A2389Ser3[0] ;
         n2389Ser3 = T006E4_n2389Ser3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
         A2390Ser30 = T006E4_A2390Ser30[0] ;
         n2390Ser30 = T006E4_n2390Ser30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
         A4215Ser4 = T006E4_A4215Ser4[0] ;
         n4215Ser4 = T006E4_n4215Ser4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4215Ser4", A4215Ser4);
         A4216Ser40 = T006E4_A4216Ser40[0] ;
         n4216Ser40 = T006E4_n4216Ser40[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4216Ser40", A4216Ser40);
         A4217Ser5 = T006E4_A4217Ser5[0] ;
         n4217Ser5 = T006E4_n4217Ser5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4217Ser5", A4217Ser5);
         A4218Ser50 = T006E4_A4218Ser50[0] ;
         n4218Ser50 = T006E4_n4218Ser50[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4218Ser50", A4218Ser50);
         A4219Ser6 = T006E4_A4219Ser6[0] ;
         n4219Ser6 = T006E4_n4219Ser6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4219Ser6", A4219Ser6);
         A4220Ser60 = T006E4_A4220Ser60[0] ;
         n4220Ser60 = T006E4_n4220Ser60[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4220Ser60", A4220Ser60);
         A4221Ser7 = T006E4_A4221Ser7[0] ;
         n4221Ser7 = T006E4_n4221Ser7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4221Ser7", A4221Ser7);
         A4222Ser70 = T006E4_A4222Ser70[0] ;
         n4222Ser70 = T006E4_n4222Ser70[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4222Ser70", A4222Ser70);
         zm6E27( -5) ;
      }
      pr_default.close(2);
      onLoadActions6E27( ) ;
   }

   public void onLoadActions6E27( )
   {
   }

   public void checkExtendedTable6E27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors6E27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey6E27( )
   {
      /* Using cursor T006E5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T006E3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T006E3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm6E27( 5) ;
         RcdFound27 = (short)(1) ;
         A407EmprNom = T006E3_A407EmprNom[0] ;
         n407EmprNom = T006E3_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A961Emp1 = T006E3_A961Emp1[0] ;
         n961Emp1 = T006E3_n961Emp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
         A962Emp0 = T006E3_A962Emp0[0] ;
         n962Emp0 = T006E3_n962Emp0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
         A963Ser1 = T006E3_A963Ser1[0] ;
         n963Ser1 = T006E3_n963Ser1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
         A964Ser0 = T006E3_A964Ser0[0] ;
         n964Ser0 = T006E3_n964Ser0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
         A2387Ser2 = T006E3_A2387Ser2[0] ;
         n2387Ser2 = T006E3_n2387Ser2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
         A2388Ser20 = T006E3_A2388Ser20[0] ;
         n2388Ser20 = T006E3_n2388Ser20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
         A2389Ser3 = T006E3_A2389Ser3[0] ;
         n2389Ser3 = T006E3_n2389Ser3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
         A2390Ser30 = T006E3_A2390Ser30[0] ;
         n2390Ser30 = T006E3_n2390Ser30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
         A4215Ser4 = T006E3_A4215Ser4[0] ;
         n4215Ser4 = T006E3_n4215Ser4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4215Ser4", A4215Ser4);
         A4216Ser40 = T006E3_A4216Ser40[0] ;
         n4216Ser40 = T006E3_n4216Ser40[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4216Ser40", A4216Ser40);
         A4217Ser5 = T006E3_A4217Ser5[0] ;
         n4217Ser5 = T006E3_n4217Ser5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4217Ser5", A4217Ser5);
         A4218Ser50 = T006E3_A4218Ser50[0] ;
         n4218Ser50 = T006E3_n4218Ser50[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4218Ser50", A4218Ser50);
         A4219Ser6 = T006E3_A4219Ser6[0] ;
         n4219Ser6 = T006E3_n4219Ser6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4219Ser6", A4219Ser6);
         A4220Ser60 = T006E3_A4220Ser60[0] ;
         n4220Ser60 = T006E3_n4220Ser60[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4220Ser60", A4220Ser60);
         A4221Ser7 = T006E3_A4221Ser7[0] ;
         n4221Ser7 = T006E3_n4221Ser7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4221Ser7", A4221Ser7);
         A4222Ser70 = T006E3_A4222Ser70[0] ;
         n4222Ser70 = T006E3_n4222Ser70[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4222Ser70", A4222Ser70);
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load6E27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey6E27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey6E27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey6E27( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T006E6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T006E6_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T006E6_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T006E7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T006E7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T006E7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey6E27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmp1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert6E27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmp1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update6E27( ) ;
               GX_FocusControl = edtEmp1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmp1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert6E27( ) ;
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
                  GX_FocusControl = edtEmp1_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert6E27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmp1_Internalname ;
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
      getKey6E27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
         {
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
         if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tempcon");
      GX_FocusControl = edtEmp1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_6E0( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmp1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart6E27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmp1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd6E27( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmp1_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmp1_Internalname ;
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
      scanStart6E27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNext6E27( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmp1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd6E27( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency6E27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T006E2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z407EmprNom, T006E2_A407EmprNom[0]) != 0 ) || ( GXutil.strcmp(Z961Emp1, T006E2_A961Emp1[0]) != 0 ) || ( GXutil.strcmp(Z962Emp0, T006E2_A962Emp0[0]) != 0 ) || ( GXutil.strcmp(Z963Ser1, T006E2_A963Ser1[0]) != 0 ) || ( GXutil.strcmp(Z964Ser0, T006E2_A964Ser0[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2387Ser2, T006E2_A2387Ser2[0]) != 0 ) || ( GXutil.strcmp(Z2388Ser20, T006E2_A2388Ser20[0]) != 0 ) || ( GXutil.strcmp(Z2389Ser3, T006E2_A2389Ser3[0]) != 0 ) || ( GXutil.strcmp(Z2390Ser30, T006E2_A2390Ser30[0]) != 0 ) || ( GXutil.strcmp(Z4215Ser4, T006E2_A4215Ser4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4216Ser40, T006E2_A4216Ser40[0]) != 0 ) || ( GXutil.strcmp(Z4217Ser5, T006E2_A4217Ser5[0]) != 0 ) || ( GXutil.strcmp(Z4218Ser50, T006E2_A4218Ser50[0]) != 0 ) || ( GXutil.strcmp(Z4219Ser6, T006E2_A4219Ser6[0]) != 0 ) || ( GXutil.strcmp(Z4220Ser60, T006E2_A4220Ser60[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4221Ser7, T006E2_A4221Ser7[0]) != 0 ) || ( GXutil.strcmp(Z4222Ser70, T006E2_A4222Ser70[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T006E2_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T006E2_A407EmprNom[0]);
            }
            if ( GXutil.strcmp(Z961Emp1, T006E2_A961Emp1[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Emp1");
               GXutil.writeLogRaw("Old: ",Z961Emp1);
               GXutil.writeLogRaw("Current: ",T006E2_A961Emp1[0]);
            }
            if ( GXutil.strcmp(Z962Emp0, T006E2_A962Emp0[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Emp0");
               GXutil.writeLogRaw("Old: ",Z962Emp0);
               GXutil.writeLogRaw("Current: ",T006E2_A962Emp0[0]);
            }
            if ( GXutil.strcmp(Z963Ser1, T006E2_A963Ser1[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser1");
               GXutil.writeLogRaw("Old: ",Z963Ser1);
               GXutil.writeLogRaw("Current: ",T006E2_A963Ser1[0]);
            }
            if ( GXutil.strcmp(Z964Ser0, T006E2_A964Ser0[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser0");
               GXutil.writeLogRaw("Old: ",Z964Ser0);
               GXutil.writeLogRaw("Current: ",T006E2_A964Ser0[0]);
            }
            if ( GXutil.strcmp(Z2387Ser2, T006E2_A2387Ser2[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser2");
               GXutil.writeLogRaw("Old: ",Z2387Ser2);
               GXutil.writeLogRaw("Current: ",T006E2_A2387Ser2[0]);
            }
            if ( GXutil.strcmp(Z2388Ser20, T006E2_A2388Ser20[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser20");
               GXutil.writeLogRaw("Old: ",Z2388Ser20);
               GXutil.writeLogRaw("Current: ",T006E2_A2388Ser20[0]);
            }
            if ( GXutil.strcmp(Z2389Ser3, T006E2_A2389Ser3[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser3");
               GXutil.writeLogRaw("Old: ",Z2389Ser3);
               GXutil.writeLogRaw("Current: ",T006E2_A2389Ser3[0]);
            }
            if ( GXutil.strcmp(Z2390Ser30, T006E2_A2390Ser30[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser30");
               GXutil.writeLogRaw("Old: ",Z2390Ser30);
               GXutil.writeLogRaw("Current: ",T006E2_A2390Ser30[0]);
            }
            if ( GXutil.strcmp(Z4215Ser4, T006E2_A4215Ser4[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser4");
               GXutil.writeLogRaw("Old: ",Z4215Ser4);
               GXutil.writeLogRaw("Current: ",T006E2_A4215Ser4[0]);
            }
            if ( GXutil.strcmp(Z4216Ser40, T006E2_A4216Ser40[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser40");
               GXutil.writeLogRaw("Old: ",Z4216Ser40);
               GXutil.writeLogRaw("Current: ",T006E2_A4216Ser40[0]);
            }
            if ( GXutil.strcmp(Z4217Ser5, T006E2_A4217Ser5[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser5");
               GXutil.writeLogRaw("Old: ",Z4217Ser5);
               GXutil.writeLogRaw("Current: ",T006E2_A4217Ser5[0]);
            }
            if ( GXutil.strcmp(Z4218Ser50, T006E2_A4218Ser50[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser50");
               GXutil.writeLogRaw("Old: ",Z4218Ser50);
               GXutil.writeLogRaw("Current: ",T006E2_A4218Ser50[0]);
            }
            if ( GXutil.strcmp(Z4219Ser6, T006E2_A4219Ser6[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser6");
               GXutil.writeLogRaw("Old: ",Z4219Ser6);
               GXutil.writeLogRaw("Current: ",T006E2_A4219Ser6[0]);
            }
            if ( GXutil.strcmp(Z4220Ser60, T006E2_A4220Ser60[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser60");
               GXutil.writeLogRaw("Old: ",Z4220Ser60);
               GXutil.writeLogRaw("Current: ",T006E2_A4220Ser60[0]);
            }
            if ( GXutil.strcmp(Z4221Ser7, T006E2_A4221Ser7[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser7");
               GXutil.writeLogRaw("Old: ",Z4221Ser7);
               GXutil.writeLogRaw("Current: ",T006E2_A4221Ser7[0]);
            }
            if ( GXutil.strcmp(Z4222Ser70, T006E2_A4222Ser70[0]) != 0 )
            {
               GXutil.writeLogln("tempcon:[seudo value changed for attri]"+"Ser70");
               GXutil.writeLogRaw("Old: ",Z4222Ser70);
               GXutil.writeLogRaw("Current: ",T006E2_A4222Ser70[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert6E27( )
   {
      beforeValidate6E27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable6E27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm6E27( 0) ;
         checkOptimisticConcurrency6E27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm6E27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert6E27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T006E8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n961Emp1), A961Emp1, Boolean.valueOf(n962Emp0), A962Emp0, Boolean.valueOf(n963Ser1), A963Ser1, Boolean.valueOf(n964Ser0), A964Ser0, Boolean.valueOf(n2387Ser2), A2387Ser2, Boolean.valueOf(n2388Ser20), A2388Ser20, Boolean.valueOf(n2389Ser3), A2389Ser3, Boolean.valueOf(n2390Ser30), A2390Ser30, Boolean.valueOf(n4215Ser4), A4215Ser4, Boolean.valueOf(n4216Ser40), A4216Ser40, Boolean.valueOf(n4217Ser5), A4217Ser5, Boolean.valueOf(n4218Ser50), A4218Ser50, Boolean.valueOf(n4219Ser6), A4219Ser6, Boolean.valueOf(n4220Ser60), A4220Ser60, Boolean.valueOf(n4221Ser7), A4221Ser7, Boolean.valueOf(n4222Ser70), A4222Ser70});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
                        resetCaption6E0( ) ;
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
            load6E27( ) ;
         }
         endLevel6E27( ) ;
      }
      closeExtendedTableCursors6E27( ) ;
   }

   public void update6E27( )
   {
      beforeValidate6E27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable6E27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency6E27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm6E27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate6E27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T006E9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n961Emp1), A961Emp1, Boolean.valueOf(n962Emp0), A962Emp0, Boolean.valueOf(n963Ser1), A963Ser1, Boolean.valueOf(n964Ser0), A964Ser0, Boolean.valueOf(n2387Ser2), A2387Ser2, Boolean.valueOf(n2388Ser20), A2388Ser20, Boolean.valueOf(n2389Ser3), A2389Ser3, Boolean.valueOf(n2390Ser30), A2390Ser30, Boolean.valueOf(n4215Ser4), A4215Ser4, Boolean.valueOf(n4216Ser40), A4216Ser40, Boolean.valueOf(n4217Ser5), A4217Ser5, Boolean.valueOf(n4218Ser50), A4218Ser50, Boolean.valueOf(n4219Ser6), A4219Ser6, Boolean.valueOf(n4220Ser60), A4220Ser60, Boolean.valueOf(n4221Ser7), A4221Ser7, Boolean.valueOf(n4222Ser70), A4222Ser70, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate6E27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption6E0( ) ;
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
         endLevel6E27( ) ;
      }
      closeExtendedTableCursors6E27( ) ;
   }

   public void deferredUpdate6E27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate6E27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency6E27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls6E27( ) ;
         afterConfirm6E27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete6E27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T006E10 */
               pr_default.execute(8, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAll6E27( ) ;
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
                     resetCaption6E0( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel6E27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls6E27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel6E27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete6E27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tempcon");
         if ( AnyError == 0 )
         {
            confirmValues6E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tempcon");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart6E27( )
   {
      /* Scan By routine */
      /* Using cursor T006E11 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext6E27( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
   }

   public void scanEnd6E27( )
   {
      pr_default.close(9);
   }

   public void afterConfirm6E27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert6E27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate6E27( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete6E27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete6E27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate6E27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes6E27( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp1_Enabled), 5, 0), true);
      edtEmp0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp0_Enabled), 5, 0), true);
      edtSer1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer1_Enabled), 5, 0), true);
      edtSer0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer0_Enabled), 5, 0), true);
      edtSer2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer2_Enabled), 5, 0), true);
      edtSer20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer20_Enabled), 5, 0), true);
      edtSer3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer3_Enabled), 5, 0), true);
      edtSer30_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer30_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer30_Enabled), 5, 0), true);
      edtSer4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer4_Enabled), 5, 0), true);
      edtSer40_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer40_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer40_Enabled), 5, 0), true);
      edtSer5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer5_Enabled), 5, 0), true);
      edtSer50_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer50_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer50_Enabled), 5, 0), true);
      edtSer6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer6_Enabled), 5, 0), true);
      edtSer60_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer60_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer60_Enabled), 5, 0), true);
      edtSer7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer7_Enabled), 5, 0), true);
      edtSer70_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer70_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer70_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes6E27( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues6E0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tempcon", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"EmprCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TEMPCON");
      forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tempcon:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z961Emp1", GXutil.rtrim( Z961Emp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z962Emp0", GXutil.rtrim( Z962Emp0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z963Ser1", GXutil.rtrim( Z963Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z964Ser0", GXutil.rtrim( Z964Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2387Ser2", GXutil.rtrim( Z2387Ser2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2388Ser20", GXutil.rtrim( Z2388Ser20));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2389Ser3", GXutil.rtrim( Z2389Ser3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2390Ser30", GXutil.rtrim( Z2390Ser30));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4215Ser4", GXutil.rtrim( Z4215Ser4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4216Ser40", GXutil.rtrim( Z4216Ser40));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4217Ser5", GXutil.rtrim( Z4217Ser5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4218Ser50", GXutil.rtrim( Z4218Ser50));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4219Ser6", GXutil.rtrim( Z4219Ser6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4220Ser60", GXutil.rtrim( Z4220Ser60));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4221Ser7", GXutil.rtrim( Z4221Ser7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4222Ser70", GXutil.rtrim( Z4222Ser70));
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
      return formatLink("app.tempcon", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"EmprCod"})  ;
   }

   public String getPgmname( )
   {
      return "TEMPCON" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "EMPRESAS EN CONTABILIDAD", "") ;
   }

   public void initializeNonKey6E27( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A961Emp1 = "" ;
      n961Emp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
      A962Emp0 = "" ;
      n962Emp0 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
      A963Ser1 = "" ;
      n963Ser1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
      A964Ser0 = "" ;
      n964Ser0 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
      A2387Ser2 = "" ;
      n2387Ser2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
      A2388Ser20 = "" ;
      n2388Ser20 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
      A2389Ser3 = "" ;
      n2389Ser3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
      A2390Ser30 = "" ;
      n2390Ser30 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
      A4215Ser4 = "" ;
      n4215Ser4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4215Ser4", A4215Ser4);
      A4216Ser40 = "" ;
      n4216Ser40 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4216Ser40", A4216Ser40);
      A4217Ser5 = "" ;
      n4217Ser5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4217Ser5", A4217Ser5);
      A4218Ser50 = "" ;
      n4218Ser50 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4218Ser50", A4218Ser50);
      A4219Ser6 = "" ;
      n4219Ser6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4219Ser6", A4219Ser6);
      A4220Ser60 = "" ;
      n4220Ser60 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4220Ser60", A4220Ser60);
      A4221Ser7 = "" ;
      n4221Ser7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4221Ser7", A4221Ser7);
      A4222Ser70 = "" ;
      n4222Ser70 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4222Ser70", A4222Ser70);
      Z407EmprNom = "" ;
      Z961Emp1 = "" ;
      Z962Emp0 = "" ;
      Z963Ser1 = "" ;
      Z964Ser0 = "" ;
      Z2387Ser2 = "" ;
      Z2388Ser20 = "" ;
      Z2389Ser3 = "" ;
      Z2390Ser30 = "" ;
      Z4215Ser4 = "" ;
      Z4216Ser40 = "" ;
      Z4217Ser5 = "" ;
      Z4218Ser50 = "" ;
      Z4219Ser6 = "" ;
      Z4220Ser60 = "" ;
      Z4221Ser7 = "" ;
      Z4222Ser70 = "" ;
   }

   public void initAll6E27( )
   {
      initializeNonKey6E27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241504423", true, true);
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
      httpContext.AddJavascriptSource("tempcon.js", "?20268241504423", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmp1_Internalname = "EMP1" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmp0_Internalname = "EMP0" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtSer1_Internalname = "SER1" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtSer0_Internalname = "SER0" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtSer2_Internalname = "SER2" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSer20_Internalname = "SER20" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSer3_Internalname = "SER3" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSer30_Internalname = "SER30" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSer4_Internalname = "SER4" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSer40_Internalname = "SER40" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSer5_Internalname = "SER5" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtSer50_Internalname = "SER50" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtSer6_Internalname = "SER6" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSer60_Internalname = "SER60" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSer7_Internalname = "SER7" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSer70_Internalname = "SER70" ;
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
      Form.setCaption( httpContext.getMessage( "EMPRESAS EN CONTABILIDAD", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtSer70_Jsonclick = "" ;
      edtSer70_Backcolor = (int)(0xFFFFFF) ;
      edtSer70_Enabled = 1 ;
      edtSer7_Jsonclick = "" ;
      edtSer7_Backcolor = (int)(0xFFFFFF) ;
      edtSer7_Enabled = 1 ;
      edtSer60_Jsonclick = "" ;
      edtSer60_Backcolor = (int)(0xFFFFFF) ;
      edtSer60_Enabled = 1 ;
      edtSer6_Jsonclick = "" ;
      edtSer6_Backcolor = (int)(0xFFFFFF) ;
      edtSer6_Enabled = 1 ;
      edtSer50_Jsonclick = "" ;
      edtSer50_Backcolor = (int)(0xFFFFFF) ;
      edtSer50_Enabled = 1 ;
      edtSer5_Jsonclick = "" ;
      edtSer5_Backcolor = (int)(0xFFFFFF) ;
      edtSer5_Enabled = 1 ;
      edtSer40_Jsonclick = "" ;
      edtSer40_Backcolor = (int)(0xFFFFFF) ;
      edtSer40_Enabled = 1 ;
      edtSer4_Jsonclick = "" ;
      edtSer4_Backcolor = (int)(0xFFFFFF) ;
      edtSer4_Enabled = 1 ;
      edtSer30_Jsonclick = "" ;
      edtSer30_Backcolor = (int)(0xFFFFFF) ;
      edtSer30_Enabled = 1 ;
      edtSer3_Jsonclick = "" ;
      edtSer3_Backcolor = (int)(0xFFFFFF) ;
      edtSer3_Enabled = 1 ;
      edtSer20_Jsonclick = "" ;
      edtSer20_Backcolor = (int)(0xFFFFFF) ;
      edtSer20_Enabled = 1 ;
      edtSer2_Jsonclick = "" ;
      edtSer2_Backcolor = (int)(0xFFFFFF) ;
      edtSer2_Enabled = 1 ;
      edtSer0_Jsonclick = "" ;
      edtSer0_Backcolor = (int)(0xFFFFFF) ;
      edtSer0_Enabled = 1 ;
      edtSer1_Jsonclick = "" ;
      edtSer1_Backcolor = (int)(0xFFFFFF) ;
      edtSer1_Enabled = 1 ;
      edtEmp0_Jsonclick = "" ;
      edtEmp0_Backcolor = (int)(0xFFFFFF) ;
      edtEmp0_Enabled = 1 ;
      edtEmp1_Jsonclick = "" ;
      edtEmp1_Backcolor = (int)(0xFFFFFF) ;
      edtEmp1_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      GX_FocusControl = edtEmp1_Internalname ;
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
      n407EmprNom = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", GXutil.rtrim( A961Emp1));
      httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", GXutil.rtrim( A962Emp0));
      httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", GXutil.rtrim( A963Ser1));
      httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", GXutil.rtrim( A964Ser0));
      httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", GXutil.rtrim( A2387Ser2));
      httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", GXutil.rtrim( A2388Ser20));
      httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", GXutil.rtrim( A2389Ser3));
      httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", GXutil.rtrim( A2390Ser30));
      httpContext.ajax_rsp_assign_attri("", false, "A4215Ser4", GXutil.rtrim( A4215Ser4));
      httpContext.ajax_rsp_assign_attri("", false, "A4216Ser40", GXutil.rtrim( A4216Ser40));
      httpContext.ajax_rsp_assign_attri("", false, "A4217Ser5", GXutil.rtrim( A4217Ser5));
      httpContext.ajax_rsp_assign_attri("", false, "A4218Ser50", GXutil.rtrim( A4218Ser50));
      httpContext.ajax_rsp_assign_attri("", false, "A4219Ser6", GXutil.rtrim( A4219Ser6));
      httpContext.ajax_rsp_assign_attri("", false, "A4220Ser60", GXutil.rtrim( A4220Ser60));
      httpContext.ajax_rsp_assign_attri("", false, "A4221Ser7", GXutil.rtrim( A4221Ser7));
      httpContext.ajax_rsp_assign_attri("", false, "A4222Ser70", GXutil.rtrim( A4222Ser70));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z961Emp1", GXutil.rtrim( Z961Emp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z962Emp0", GXutil.rtrim( Z962Emp0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z963Ser1", GXutil.rtrim( Z963Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z964Ser0", GXutil.rtrim( Z964Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2387Ser2", GXutil.rtrim( Z2387Ser2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2388Ser20", GXutil.rtrim( Z2388Ser20));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2389Ser3", GXutil.rtrim( Z2389Ser3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2390Ser30", GXutil.rtrim( Z2390Ser30));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4215Ser4", GXutil.rtrim( Z4215Ser4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4216Ser40", GXutil.rtrim( Z4216Ser40));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4217Ser5", GXutil.rtrim( Z4217Ser5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4218Ser50", GXutil.rtrim( Z4218Ser50));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4219Ser6", GXutil.rtrim( Z4219Ser6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4220Ser60", GXutil.rtrim( Z4220Ser60));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4221Ser7", GXutil.rtrim( Z4221Ser7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4222Ser70", GXutil.rtrim( Z4222Ser70));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A961Emp1',fld:'EMP1',pic:''},{av:'A962Emp0',fld:'EMP0',pic:''},{av:'A963Ser1',fld:'SER1',pic:''},{av:'A964Ser0',fld:'SER0',pic:''},{av:'A2387Ser2',fld:'SER2',pic:''},{av:'A2388Ser20',fld:'SER20',pic:''},{av:'A2389Ser3',fld:'SER3',pic:''},{av:'A2390Ser30',fld:'SER30',pic:''},{av:'A4215Ser4',fld:'SER4',pic:''},{av:'A4216Ser40',fld:'SER40',pic:''},{av:'A4217Ser5',fld:'SER5',pic:''},{av:'A4218Ser50',fld:'SER50',pic:''},{av:'A4219Ser6',fld:'SER6',pic:''},{av:'A4220Ser60',fld:'SER60',pic:''},{av:'A4221Ser7',fld:'SER7',pic:''},{av:'A4222Ser70',fld:'SER70',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z961Emp1'},{av:'Z962Emp0'},{av:'Z963Ser1'},{av:'Z964Ser0'},{av:'Z2387Ser2'},{av:'Z2388Ser20'},{av:'Z2389Ser3'},{av:'Z2390Ser30'},{av:'Z4215Ser4'},{av:'Z4216Ser40'},{av:'Z4217Ser5'},{av:'Z4218Ser50'},{av:'Z4219Ser6'},{av:'Z4220Ser60'},{av:'Z4221Ser7'},{av:'Z4222Ser70'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      Z961Emp1 = "" ;
      Z962Emp0 = "" ;
      Z963Ser1 = "" ;
      Z964Ser0 = "" ;
      Z2387Ser2 = "" ;
      Z2388Ser20 = "" ;
      Z2389Ser3 = "" ;
      Z2390Ser30 = "" ;
      Z4215Ser4 = "" ;
      Z4216Ser40 = "" ;
      Z4217Ser5 = "" ;
      Z4218Ser50 = "" ;
      Z4219Ser6 = "" ;
      Z4220Ser60 = "" ;
      Z4221Ser7 = "" ;
      Z4222Ser70 = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A961Emp1 = "" ;
      lblTextblock4_Jsonclick = "" ;
      A962Emp0 = "" ;
      lblTextblock5_Jsonclick = "" ;
      A963Ser1 = "" ;
      lblTextblock6_Jsonclick = "" ;
      A964Ser0 = "" ;
      lblTextblock7_Jsonclick = "" ;
      A2387Ser2 = "" ;
      lblTextblock8_Jsonclick = "" ;
      A2388Ser20 = "" ;
      lblTextblock9_Jsonclick = "" ;
      A2389Ser3 = "" ;
      lblTextblock10_Jsonclick = "" ;
      A2390Ser30 = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4215Ser4 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4216Ser40 = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4217Ser5 = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4218Ser50 = "" ;
      lblTextblock15_Jsonclick = "" ;
      A4219Ser6 = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4220Ser60 = "" ;
      lblTextblock17_Jsonclick = "" ;
      A4221Ser7 = "" ;
      lblTextblock18_Jsonclick = "" ;
      A4222Ser70 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18LitFe = "" ;
      AV16Lit0 = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV21Lit3 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV25Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      GXt_char1 = "" ;
      AV26Station = "" ;
      GXv_char2 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T006E4_A396EmprCod = new String[] {""} ;
      T006E4_A407EmprNom = new String[] {""} ;
      T006E4_n407EmprNom = new boolean[] {false} ;
      T006E4_A961Emp1 = new String[] {""} ;
      T006E4_n961Emp1 = new boolean[] {false} ;
      T006E4_A962Emp0 = new String[] {""} ;
      T006E4_n962Emp0 = new boolean[] {false} ;
      T006E4_A963Ser1 = new String[] {""} ;
      T006E4_n963Ser1 = new boolean[] {false} ;
      T006E4_A964Ser0 = new String[] {""} ;
      T006E4_n964Ser0 = new boolean[] {false} ;
      T006E4_A2387Ser2 = new String[] {""} ;
      T006E4_n2387Ser2 = new boolean[] {false} ;
      T006E4_A2388Ser20 = new String[] {""} ;
      T006E4_n2388Ser20 = new boolean[] {false} ;
      T006E4_A2389Ser3 = new String[] {""} ;
      T006E4_n2389Ser3 = new boolean[] {false} ;
      T006E4_A2390Ser30 = new String[] {""} ;
      T006E4_n2390Ser30 = new boolean[] {false} ;
      T006E4_A4215Ser4 = new String[] {""} ;
      T006E4_n4215Ser4 = new boolean[] {false} ;
      T006E4_A4216Ser40 = new String[] {""} ;
      T006E4_n4216Ser40 = new boolean[] {false} ;
      T006E4_A4217Ser5 = new String[] {""} ;
      T006E4_n4217Ser5 = new boolean[] {false} ;
      T006E4_A4218Ser50 = new String[] {""} ;
      T006E4_n4218Ser50 = new boolean[] {false} ;
      T006E4_A4219Ser6 = new String[] {""} ;
      T006E4_n4219Ser6 = new boolean[] {false} ;
      T006E4_A4220Ser60 = new String[] {""} ;
      T006E4_n4220Ser60 = new boolean[] {false} ;
      T006E4_A4221Ser7 = new String[] {""} ;
      T006E4_n4221Ser7 = new boolean[] {false} ;
      T006E4_A4222Ser70 = new String[] {""} ;
      T006E4_n4222Ser70 = new boolean[] {false} ;
      T006E5_A396EmprCod = new String[] {""} ;
      T006E3_A396EmprCod = new String[] {""} ;
      T006E3_A407EmprNom = new String[] {""} ;
      T006E3_n407EmprNom = new boolean[] {false} ;
      T006E3_A961Emp1 = new String[] {""} ;
      T006E3_n961Emp1 = new boolean[] {false} ;
      T006E3_A962Emp0 = new String[] {""} ;
      T006E3_n962Emp0 = new boolean[] {false} ;
      T006E3_A963Ser1 = new String[] {""} ;
      T006E3_n963Ser1 = new boolean[] {false} ;
      T006E3_A964Ser0 = new String[] {""} ;
      T006E3_n964Ser0 = new boolean[] {false} ;
      T006E3_A2387Ser2 = new String[] {""} ;
      T006E3_n2387Ser2 = new boolean[] {false} ;
      T006E3_A2388Ser20 = new String[] {""} ;
      T006E3_n2388Ser20 = new boolean[] {false} ;
      T006E3_A2389Ser3 = new String[] {""} ;
      T006E3_n2389Ser3 = new boolean[] {false} ;
      T006E3_A2390Ser30 = new String[] {""} ;
      T006E3_n2390Ser30 = new boolean[] {false} ;
      T006E3_A4215Ser4 = new String[] {""} ;
      T006E3_n4215Ser4 = new boolean[] {false} ;
      T006E3_A4216Ser40 = new String[] {""} ;
      T006E3_n4216Ser40 = new boolean[] {false} ;
      T006E3_A4217Ser5 = new String[] {""} ;
      T006E3_n4217Ser5 = new boolean[] {false} ;
      T006E3_A4218Ser50 = new String[] {""} ;
      T006E3_n4218Ser50 = new boolean[] {false} ;
      T006E3_A4219Ser6 = new String[] {""} ;
      T006E3_n4219Ser6 = new boolean[] {false} ;
      T006E3_A4220Ser60 = new String[] {""} ;
      T006E3_n4220Ser60 = new boolean[] {false} ;
      T006E3_A4221Ser7 = new String[] {""} ;
      T006E3_n4221Ser7 = new boolean[] {false} ;
      T006E3_A4222Ser70 = new String[] {""} ;
      T006E3_n4222Ser70 = new boolean[] {false} ;
      sMode27 = "" ;
      T006E6_A396EmprCod = new String[] {""} ;
      T006E7_A396EmprCod = new String[] {""} ;
      T006E2_A396EmprCod = new String[] {""} ;
      T006E2_A407EmprNom = new String[] {""} ;
      T006E2_n407EmprNom = new boolean[] {false} ;
      T006E2_A961Emp1 = new String[] {""} ;
      T006E2_n961Emp1 = new boolean[] {false} ;
      T006E2_A962Emp0 = new String[] {""} ;
      T006E2_n962Emp0 = new boolean[] {false} ;
      T006E2_A963Ser1 = new String[] {""} ;
      T006E2_n963Ser1 = new boolean[] {false} ;
      T006E2_A964Ser0 = new String[] {""} ;
      T006E2_n964Ser0 = new boolean[] {false} ;
      T006E2_A2387Ser2 = new String[] {""} ;
      T006E2_n2387Ser2 = new boolean[] {false} ;
      T006E2_A2388Ser20 = new String[] {""} ;
      T006E2_n2388Ser20 = new boolean[] {false} ;
      T006E2_A2389Ser3 = new String[] {""} ;
      T006E2_n2389Ser3 = new boolean[] {false} ;
      T006E2_A2390Ser30 = new String[] {""} ;
      T006E2_n2390Ser30 = new boolean[] {false} ;
      T006E2_A4215Ser4 = new String[] {""} ;
      T006E2_n4215Ser4 = new boolean[] {false} ;
      T006E2_A4216Ser40 = new String[] {""} ;
      T006E2_n4216Ser40 = new boolean[] {false} ;
      T006E2_A4217Ser5 = new String[] {""} ;
      T006E2_n4217Ser5 = new boolean[] {false} ;
      T006E2_A4218Ser50 = new String[] {""} ;
      T006E2_n4218Ser50 = new boolean[] {false} ;
      T006E2_A4219Ser6 = new String[] {""} ;
      T006E2_n4219Ser6 = new boolean[] {false} ;
      T006E2_A4220Ser60 = new String[] {""} ;
      T006E2_n4220Ser60 = new boolean[] {false} ;
      T006E2_A4221Ser7 = new String[] {""} ;
      T006E2_n4221Ser7 = new boolean[] {false} ;
      T006E2_A4222Ser70 = new String[] {""} ;
      T006E2_n4222Ser70 = new boolean[] {false} ;
      T006E11_A396EmprCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ961Emp1 = "" ;
      ZZ962Emp0 = "" ;
      ZZ963Ser1 = "" ;
      ZZ964Ser0 = "" ;
      ZZ2387Ser2 = "" ;
      ZZ2388Ser20 = "" ;
      ZZ2389Ser3 = "" ;
      ZZ2390Ser30 = "" ;
      ZZ4215Ser4 = "" ;
      ZZ4216Ser40 = "" ;
      ZZ4217Ser5 = "" ;
      ZZ4218Ser50 = "" ;
      ZZ4219Ser6 = "" ;
      ZZ4220Ser60 = "" ;
      ZZ4221Ser7 = "" ;
      ZZ4222Ser70 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tempcon__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tempcon__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tempcon__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tempcon__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempcon__default(),
         new Object[] {
             new Object[] {
            T006E2_A396EmprCod, T006E2_A407EmprNom, T006E2_n407EmprNom, T006E2_A961Emp1, T006E2_n961Emp1, T006E2_A962Emp0, T006E2_n962Emp0, T006E2_A963Ser1, T006E2_n963Ser1, T006E2_A964Ser0,
            T006E2_n964Ser0, T006E2_A2387Ser2, T006E2_n2387Ser2, T006E2_A2388Ser20, T006E2_n2388Ser20, T006E2_A2389Ser3, T006E2_n2389Ser3, T006E2_A2390Ser30, T006E2_n2390Ser30, T006E2_A4215Ser4,
            T006E2_n4215Ser4, T006E2_A4216Ser40, T006E2_n4216Ser40, T006E2_A4217Ser5, T006E2_n4217Ser5, T006E2_A4218Ser50, T006E2_n4218Ser50, T006E2_A4219Ser6, T006E2_n4219Ser6, T006E2_A4220Ser60,
            T006E2_n4220Ser60, T006E2_A4221Ser7, T006E2_n4221Ser7, T006E2_A4222Ser70, T006E2_n4222Ser70
            }
            , new Object[] {
            T006E3_A396EmprCod, T006E3_A407EmprNom, T006E3_n407EmprNom, T006E3_A961Emp1, T006E3_n961Emp1, T006E3_A962Emp0, T006E3_n962Emp0, T006E3_A963Ser1, T006E3_n963Ser1, T006E3_A964Ser0,
            T006E3_n964Ser0, T006E3_A2387Ser2, T006E3_n2387Ser2, T006E3_A2388Ser20, T006E3_n2388Ser20, T006E3_A2389Ser3, T006E3_n2389Ser3, T006E3_A2390Ser30, T006E3_n2390Ser30, T006E3_A4215Ser4,
            T006E3_n4215Ser4, T006E3_A4216Ser40, T006E3_n4216Ser40, T006E3_A4217Ser5, T006E3_n4217Ser5, T006E3_A4218Ser50, T006E3_n4218Ser50, T006E3_A4219Ser6, T006E3_n4219Ser6, T006E3_A4220Ser60,
            T006E3_n4220Ser60, T006E3_A4221Ser7, T006E3_n4221Ser7, T006E3_A4222Ser70, T006E3_n4222Ser70
            }
            , new Object[] {
            T006E4_A396EmprCod, T006E4_A407EmprNom, T006E4_n407EmprNom, T006E4_A961Emp1, T006E4_n961Emp1, T006E4_A962Emp0, T006E4_n962Emp0, T006E4_A963Ser1, T006E4_n963Ser1, T006E4_A964Ser0,
            T006E4_n964Ser0, T006E4_A2387Ser2, T006E4_n2387Ser2, T006E4_A2388Ser20, T006E4_n2388Ser20, T006E4_A2389Ser3, T006E4_n2389Ser3, T006E4_A2390Ser30, T006E4_n2390Ser30, T006E4_A4215Ser4,
            T006E4_n4215Ser4, T006E4_A4216Ser40, T006E4_n4216Ser40, T006E4_A4217Ser5, T006E4_n4217Ser5, T006E4_A4218Ser50, T006E4_n4218Ser50, T006E4_A4219Ser6, T006E4_n4219Ser6, T006E4_A4220Ser60,
            T006E4_n4220Ser60, T006E4_A4221Ser7, T006E4_n4221Ser7, T006E4_A4222Ser70, T006E4_n4222Ser70
            }
            , new Object[] {
            T006E5_A396EmprCod
            }
            , new Object[] {
            T006E6_A396EmprCod
            }
            , new Object[] {
            T006E7_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T006E11_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmp1_Enabled ;
   private int edtEmp0_Enabled ;
   private int edtSer1_Enabled ;
   private int edtSer0_Enabled ;
   private int edtSer2_Enabled ;
   private int edtSer20_Enabled ;
   private int edtSer3_Enabled ;
   private int edtSer30_Enabled ;
   private int edtSer4_Enabled ;
   private int edtSer40_Enabled ;
   private int edtSer5_Enabled ;
   private int edtSer50_Enabled ;
   private int edtSer6_Enabled ;
   private int edtSer60_Enabled ;
   private int edtSer7_Enabled ;
   private int edtSer70_Enabled ;
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
   private int edtSer70_Backcolor ;
   private int edtSer7_Backcolor ;
   private int edtSer60_Backcolor ;
   private int edtSer6_Backcolor ;
   private int edtSer50_Backcolor ;
   private int edtSer5_Backcolor ;
   private int edtSer40_Backcolor ;
   private int edtSer4_Backcolor ;
   private int edtSer30_Backcolor ;
   private int edtSer3_Backcolor ;
   private int edtSer20_Backcolor ;
   private int edtSer2_Backcolor ;
   private int edtSer0_Backcolor ;
   private int edtSer1_Backcolor ;
   private int edtEmp0_Backcolor ;
   private int edtEmp1_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String Z961Emp1 ;
   private String Z962Emp0 ;
   private String Z963Ser1 ;
   private String Z964Ser0 ;
   private String Z2387Ser2 ;
   private String Z2388Ser20 ;
   private String Z2389Ser3 ;
   private String Z2390Ser30 ;
   private String Z4215Ser4 ;
   private String Z4216Ser40 ;
   private String Z4217Ser5 ;
   private String Z4218Ser50 ;
   private String Z4219Ser6 ;
   private String Z4220Ser60 ;
   private String Z4221Ser7 ;
   private String Z4222Ser70 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmp1_Internalname ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A961Emp1 ;
   private String edtEmp1_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmp0_Internalname ;
   private String A962Emp0 ;
   private String edtEmp0_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtSer1_Internalname ;
   private String A963Ser1 ;
   private String edtSer1_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtSer0_Internalname ;
   private String A964Ser0 ;
   private String edtSer0_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtSer2_Internalname ;
   private String A2387Ser2 ;
   private String edtSer2_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSer20_Internalname ;
   private String A2388Ser20 ;
   private String edtSer20_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSer3_Internalname ;
   private String A2389Ser3 ;
   private String edtSer3_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSer30_Internalname ;
   private String A2390Ser30 ;
   private String edtSer30_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSer4_Internalname ;
   private String A4215Ser4 ;
   private String edtSer4_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSer40_Internalname ;
   private String A4216Ser40 ;
   private String edtSer40_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSer5_Internalname ;
   private String A4217Ser5 ;
   private String edtSer5_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtSer50_Internalname ;
   private String A4218Ser50 ;
   private String edtSer50_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtSer6_Internalname ;
   private String A4219Ser6 ;
   private String edtSer6_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtSer60_Internalname ;
   private String A4220Ser60 ;
   private String edtSer60_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSer7_Internalname ;
   private String A4221Ser7 ;
   private String edtSer7_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSer70_Internalname ;
   private String A4222Ser70 ;
   private String edtSer70_Jsonclick ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18LitFe ;
   private String AV16Lit0 ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV21Lit3 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV25Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String GXt_char1 ;
   private String AV26Station ;
   private String GXv_char2[] ;
   private String AV27EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String sMode27 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ961Emp1 ;
   private String ZZ962Emp0 ;
   private String ZZ963Ser1 ;
   private String ZZ964Ser0 ;
   private String ZZ2387Ser2 ;
   private String ZZ2388Ser20 ;
   private String ZZ2389Ser3 ;
   private String ZZ2390Ser30 ;
   private String ZZ4215Ser4 ;
   private String ZZ4216Ser40 ;
   private String ZZ4217Ser5 ;
   private String ZZ4218Ser50 ;
   private String ZZ4219Ser6 ;
   private String ZZ4220Ser60 ;
   private String ZZ4221Ser7 ;
   private String ZZ4222Ser70 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n961Emp1 ;
   private boolean n962Emp0 ;
   private boolean n963Ser1 ;
   private boolean n964Ser0 ;
   private boolean n2387Ser2 ;
   private boolean n2388Ser20 ;
   private boolean n2389Ser3 ;
   private boolean n2390Ser30 ;
   private boolean n4215Ser4 ;
   private boolean n4216Ser40 ;
   private boolean n4217Ser5 ;
   private boolean n4218Ser50 ;
   private boolean n4219Ser6 ;
   private boolean n4220Ser60 ;
   private boolean n4221Ser7 ;
   private boolean n4222Ser70 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T006E4_A396EmprCod ;
   private String[] T006E4_A407EmprNom ;
   private boolean[] T006E4_n407EmprNom ;
   private String[] T006E4_A961Emp1 ;
   private boolean[] T006E4_n961Emp1 ;
   private String[] T006E4_A962Emp0 ;
   private boolean[] T006E4_n962Emp0 ;
   private String[] T006E4_A963Ser1 ;
   private boolean[] T006E4_n963Ser1 ;
   private String[] T006E4_A964Ser0 ;
   private boolean[] T006E4_n964Ser0 ;
   private String[] T006E4_A2387Ser2 ;
   private boolean[] T006E4_n2387Ser2 ;
   private String[] T006E4_A2388Ser20 ;
   private boolean[] T006E4_n2388Ser20 ;
   private String[] T006E4_A2389Ser3 ;
   private boolean[] T006E4_n2389Ser3 ;
   private String[] T006E4_A2390Ser30 ;
   private boolean[] T006E4_n2390Ser30 ;
   private String[] T006E4_A4215Ser4 ;
   private boolean[] T006E4_n4215Ser4 ;
   private String[] T006E4_A4216Ser40 ;
   private boolean[] T006E4_n4216Ser40 ;
   private String[] T006E4_A4217Ser5 ;
   private boolean[] T006E4_n4217Ser5 ;
   private String[] T006E4_A4218Ser50 ;
   private boolean[] T006E4_n4218Ser50 ;
   private String[] T006E4_A4219Ser6 ;
   private boolean[] T006E4_n4219Ser6 ;
   private String[] T006E4_A4220Ser60 ;
   private boolean[] T006E4_n4220Ser60 ;
   private String[] T006E4_A4221Ser7 ;
   private boolean[] T006E4_n4221Ser7 ;
   private String[] T006E4_A4222Ser70 ;
   private boolean[] T006E4_n4222Ser70 ;
   private String[] T006E5_A396EmprCod ;
   private String[] T006E3_A396EmprCod ;
   private String[] T006E3_A407EmprNom ;
   private boolean[] T006E3_n407EmprNom ;
   private String[] T006E3_A961Emp1 ;
   private boolean[] T006E3_n961Emp1 ;
   private String[] T006E3_A962Emp0 ;
   private boolean[] T006E3_n962Emp0 ;
   private String[] T006E3_A963Ser1 ;
   private boolean[] T006E3_n963Ser1 ;
   private String[] T006E3_A964Ser0 ;
   private boolean[] T006E3_n964Ser0 ;
   private String[] T006E3_A2387Ser2 ;
   private boolean[] T006E3_n2387Ser2 ;
   private String[] T006E3_A2388Ser20 ;
   private boolean[] T006E3_n2388Ser20 ;
   private String[] T006E3_A2389Ser3 ;
   private boolean[] T006E3_n2389Ser3 ;
   private String[] T006E3_A2390Ser30 ;
   private boolean[] T006E3_n2390Ser30 ;
   private String[] T006E3_A4215Ser4 ;
   private boolean[] T006E3_n4215Ser4 ;
   private String[] T006E3_A4216Ser40 ;
   private boolean[] T006E3_n4216Ser40 ;
   private String[] T006E3_A4217Ser5 ;
   private boolean[] T006E3_n4217Ser5 ;
   private String[] T006E3_A4218Ser50 ;
   private boolean[] T006E3_n4218Ser50 ;
   private String[] T006E3_A4219Ser6 ;
   private boolean[] T006E3_n4219Ser6 ;
   private String[] T006E3_A4220Ser60 ;
   private boolean[] T006E3_n4220Ser60 ;
   private String[] T006E3_A4221Ser7 ;
   private boolean[] T006E3_n4221Ser7 ;
   private String[] T006E3_A4222Ser70 ;
   private boolean[] T006E3_n4222Ser70 ;
   private String[] T006E6_A396EmprCod ;
   private String[] T006E7_A396EmprCod ;
   private String[] T006E2_A396EmprCod ;
   private String[] T006E2_A407EmprNom ;
   private boolean[] T006E2_n407EmprNom ;
   private String[] T006E2_A961Emp1 ;
   private boolean[] T006E2_n961Emp1 ;
   private String[] T006E2_A962Emp0 ;
   private boolean[] T006E2_n962Emp0 ;
   private String[] T006E2_A963Ser1 ;
   private boolean[] T006E2_n963Ser1 ;
   private String[] T006E2_A964Ser0 ;
   private boolean[] T006E2_n964Ser0 ;
   private String[] T006E2_A2387Ser2 ;
   private boolean[] T006E2_n2387Ser2 ;
   private String[] T006E2_A2388Ser20 ;
   private boolean[] T006E2_n2388Ser20 ;
   private String[] T006E2_A2389Ser3 ;
   private boolean[] T006E2_n2389Ser3 ;
   private String[] T006E2_A2390Ser30 ;
   private boolean[] T006E2_n2390Ser30 ;
   private String[] T006E2_A4215Ser4 ;
   private boolean[] T006E2_n4215Ser4 ;
   private String[] T006E2_A4216Ser40 ;
   private boolean[] T006E2_n4216Ser40 ;
   private String[] T006E2_A4217Ser5 ;
   private boolean[] T006E2_n4217Ser5 ;
   private String[] T006E2_A4218Ser50 ;
   private boolean[] T006E2_n4218Ser50 ;
   private String[] T006E2_A4219Ser6 ;
   private boolean[] T006E2_n4219Ser6 ;
   private String[] T006E2_A4220Ser60 ;
   private boolean[] T006E2_n4220Ser60 ;
   private String[] T006E2_A4221Ser7 ;
   private boolean[] T006E2_n4221Ser7 ;
   private String[] T006E2_A4222Ser70 ;
   private boolean[] T006E2_n4222Ser70 ;
   private String[] T006E11_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tempcon__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempcon__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempcon__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempcon__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T006E2", "SELECT EmprCod, EmprNom, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70 FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T006E3", "SELECT EmprCod, EmprNom, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70 FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T006E4", "SELECT /*+ FIRST_ROWS(1) */ TM1.EmprCod, TM1.EmprNom, TM1.Emp1, TM1.Emp0, TM1.Ser1, TM1.Ser0, TM1.Ser2, TM1.Ser20, TM1.Ser3, TM1.Ser30, TM1.Ser4, TM1.Ser40, TM1.Ser5, TM1.Ser50, TM1.Ser6, TM1.Ser60, TM1.Ser7, TM1.Ser70 FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T006E5", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T006E6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T006E7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T006E8", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, EmpNumDec, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T006E9", "UPDATE TXPEMPRES SET EmprNom=?, Emp1=?, Emp0=?, Ser1=?, Ser0=?, Ser2=?, Ser20=?, Ser3=?, Ser30=?, Ser4=?, Ser40=?, Ser5=?, Ser50=?, Ser6=?, Ser60=?, Ser7=?, Ser70=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T006E10", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T006E11", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 3);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 3);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 3);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 3);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 3);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 3);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 3);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 3);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 3);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 3);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 3);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 3);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 3);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 3);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 3);
               }
               stmt.setString(18, (String)parms[34], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

