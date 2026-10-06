package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpmq011_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PLANEAR MAQUINAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmpresa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tpmq011_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpmq011_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpmq011_impl.class ));
   }

   public tpmq011_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPMQ011.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpresa_Internalname, GXutil.rtrim( A5663Empresa), GXutil.rtrim( localUtil.format( A5663Empresa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresa_Jsonclick, 0, "", "", "", "", "", 1, edtEmpresa_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "CodiFase", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodiFase_Internalname, GXutil.rtrim( A5664CodiFase), GXutil.rtrim( localUtil.format( A5664CodiFase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodiFase_Jsonclick, 0, "", "", "", "", "", 1, edtCodiFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaquina_Internalname, GXutil.rtrim( A5665Maquina), GXutil.rtrim( localUtil.format( A5665Maquina, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaquina_Jsonclick, 0, "", "", "", "", "", 1, edtMaquina_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarcada_Internalname, GXutil.ltrim( localUtil.ntoc( A5666Barcada, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarcada_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5666Barcada), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5666Barcada), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarcada_Jsonclick, 0, "", "", "", "", "", 1, edtBarcada_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtReoperado_Internalname, GXutil.ltrim( localUtil.ntoc( A5667Reoperado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtReoperado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5667Reoperado), "9") : localUtil.format( DecimalUtil.doubleToDec(A5667Reoperado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtReoperado_Jsonclick, 0, "", "", "", "", "", 1, edtReoperado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Partido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPartido_Internalname, GXutil.rtrim( A5668Partido), GXutil.rtrim( localUtil.format( A5668Partido, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPartido_Jsonclick, 0, "", "", "", "", "", 1, edtPartido_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Macro", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacro_Internalname, GXutil.ltrim( localUtil.ntoc( A5669Macro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5669Macro), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5669Macro), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacro_Jsonclick, 0, "", "", "", "", "", 1, edtMacro_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSerie_Internalname, GXutil.rtrim( A5670Serie), GXutil.rtrim( localUtil.format( A5670Serie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSerie_Jsonclick, 0, "", "", "", "", "", 1, edtSerie_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliente_Internalname, GXutil.ltrim( localUtil.ntoc( A5671Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliente_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5671Cliente), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5671Cliente), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliente_Jsonclick, 0, "", "", "", "", "", 1, edtCliente_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "ColNom", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNom_Internalname, GXutil.rtrim( A5672ColNom), GXutil.rtrim( localUtil.format( A5672ColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNom_Jsonclick, 0, "", "", "", "", "", 1, edtColNom_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "ColNum", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5673ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5673ColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5673ColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNum_Jsonclick, 0, "", "", "", "", "", 1, edtColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceso_Internalname, GXutil.rtrim( A5674Proceso), GXutil.rtrim( localUtil.format( A5674Proceso, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceso_Jsonclick, 0, "", "", "", "", "", 1, edtProceso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPmqKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5684PmqKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPmqKil_Enabled!=0) ? localUtil.format( A5684PmqKil, "ZZZZZ9.99") : localUtil.format( A5684PmqKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPmqKil_Jsonclick, 0, "", "", "", "", "", 1, edtPmqKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSituacion_Internalname, GXutil.ltrim( localUtil.ntoc( A5675Situacion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSituacion_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5675Situacion), "9") : localUtil.format( DecimalUtil.doubleToDec(A5675Situacion), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSituacion_Jsonclick, 0, "", "", "", "", "", 1, edtSituacion_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "FechaPrev", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFechaPrev_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFechaPrev_Internalname, localUtil.format(A5676FechaPrev, "99/99/99"), localUtil.format( A5676FechaPrev, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFechaPrev_Jsonclick, 0, "", "", "", "", "", 1, edtFechaPrev_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFechaPrev_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFechaPrev_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPMQ011.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Agrupada", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAgrupada_Internalname, GXutil.rtrim( A5677Agrupada), GXutil.rtrim( localUtil.format( A5677Agrupada, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAgrupada_Jsonclick, 0, "", "", "", "", "", 1, edtAgrupada_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Tipocol", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipocol_Internalname, GXutil.ltrim( localUtil.ntoc( A5678Tipocol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipocol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5678Tipocol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5678Tipocol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipocol_Jsonclick, 0, "", "", "", "", "", 1, edtTipocol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Disposic", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisposic_Internalname, GXutil.ltrim( localUtil.ntoc( A5679Disposic, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisposic_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5679Disposic), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5679Disposic), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisposic_Jsonclick, 0, "", "", "", "", "", 1, edtDisposic_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Ordenlin", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrdenlin_Internalname, GXutil.ltrim( localUtil.ntoc( A5680Ordenlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOrdenlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5680Ordenlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5680Ordenlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrdenlin_Jsonclick, 0, "", "", "", "", "", 1, edtOrdenlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Disnume", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisnume_Internalname, GXutil.rtrim( A5681Disnume), GXutil.rtrim( localUtil.format( A5681Disnume, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisnume_Jsonclick, 0, "", "", "", "", "", 1, edtDisnume_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "FasStat", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasStat_Internalname, GXutil.ltrim( localUtil.ntoc( A5682FasStat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasStat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5682FasStat), "9") : localUtil.format( DecimalUtil.doubleToDec(A5682FasStat), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasStat_Jsonclick, 0, "", "", "", "", "", 1, edtFasStat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "BarUnid", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUnid_Internalname, GXutil.ltrim( localUtil.ntoc( A5683BarUnid, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUnid_Enabled!=0) ? localUtil.format( A5683BarUnid, "ZZZZZ9.99") : localUtil.format( A5683BarUnid, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUnid_Jsonclick, 0, "", "", "", "", "", 1, edtBarUnid_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPMQ011.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPMQ011.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPMQ011.htm");
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
         Z5663Empresa = httpContext.cgiGet( "Z5663Empresa") ;
         Z5664CodiFase = httpContext.cgiGet( "Z5664CodiFase") ;
         Z5665Maquina = httpContext.cgiGet( "Z5665Maquina") ;
         Z5666Barcada = (int)(localUtil.ctol( httpContext.cgiGet( "Z5666Barcada"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5667Reoperado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5667Reoperado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5668Partido = httpContext.cgiGet( "Z5668Partido") ;
         Z5669Macro = (int)(localUtil.ctol( httpContext.cgiGet( "Z5669Macro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5670Serie = httpContext.cgiGet( "Z5670Serie") ;
         Z5671Cliente = (int)(localUtil.ctol( httpContext.cgiGet( "Z5671Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5672ColNom = httpContext.cgiGet( "Z5672ColNom") ;
         Z5673ColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z5673ColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5674Proceso = httpContext.cgiGet( "Z5674Proceso") ;
         Z5684PmqKil = localUtil.ctond( httpContext.cgiGet( "Z5684PmqKil")) ;
         Z5675Situacion = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5675Situacion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5676FechaPrev = localUtil.ctod( httpContext.cgiGet( "Z5676FechaPrev"), 0) ;
         Z5677Agrupada = httpContext.cgiGet( "Z5677Agrupada") ;
         Z5678Tipocol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5678Tipocol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5679Disposic = (int)(localUtil.ctol( httpContext.cgiGet( "Z5679Disposic"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5680Ordenlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z5680Ordenlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5681Disnume = httpContext.cgiGet( "Z5681Disnume") ;
         Z5682FasStat = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5682FasStat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5683BarUnid = localUtil.ctond( httpContext.cgiGet( "Z5683BarUnid")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A5663Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
         A5664CodiFase = httpContext.cgiGet( edtCodiFase_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
         A5665Maquina = httpContext.cgiGet( edtMaquina_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarcada_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarcada_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCADA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarcada_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5666Barcada = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         }
         else
         {
            A5666Barcada = (int)(localUtil.ctol( httpContext.cgiGet( edtBarcada_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtReoperado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtReoperado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REOPERADO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtReoperado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5667Reoperado = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         }
         else
         {
            A5667Reoperado = (byte)(localUtil.ctol( httpContext.cgiGet( edtReoperado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         }
         A5668Partido = httpContext.cgiGet( edtPartido_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5669Macro = 0 ;
            n5669Macro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5669Macro), 6, 0));
         }
         else
         {
            A5669Macro = (int)(localUtil.ctol( httpContext.cgiGet( edtMacro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5669Macro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5669Macro), 6, 0));
         }
         A5670Serie = httpContext.cgiGet( edtSerie_Internalname) ;
         n5670Serie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5670Serie", A5670Serie);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliente_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5671Cliente = 0 ;
            n5671Cliente = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5671Cliente), 6, 0));
         }
         else
         {
            A5671Cliente = (int)(localUtil.ctol( httpContext.cgiGet( edtCliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5671Cliente = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5671Cliente), 6, 0));
         }
         A5672ColNom = httpContext.cgiGet( edtColNom_Internalname) ;
         n5672ColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5672ColNom", A5672ColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5673ColNum = 0 ;
            n5673ColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5673ColNum), 6, 0));
         }
         else
         {
            A5673ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5673ColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5673ColNum), 6, 0));
         }
         A5674Proceso = httpContext.cgiGet( edtProceso_Internalname) ;
         n5674Proceso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5674Proceso", A5674Proceso);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPmqKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPmqKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMQKIL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPmqKil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5684PmqKil = DecimalUtil.ZERO ;
            n5684PmqKil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrimstr( A5684PmqKil, 9, 2));
         }
         else
         {
            A5684PmqKil = localUtil.ctond( httpContext.cgiGet( edtPmqKil_Internalname)) ;
            n5684PmqKil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrimstr( A5684PmqKil, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSituacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSituacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SITUACION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSituacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5675Situacion = (byte)(0) ;
            n5675Situacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.str( A5675Situacion, 1, 0));
         }
         else
         {
            A5675Situacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtSituacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5675Situacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.str( A5675Situacion, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtFechaPrev_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FECHAPREV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFechaPrev_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5676FechaPrev = GXutil.nullDate() ;
            n5676FechaPrev = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
         }
         else
         {
            A5676FechaPrev = localUtil.ctod( httpContext.cgiGet( edtFechaPrev_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5676FechaPrev = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
         }
         A5677Agrupada = GXutil.upper( httpContext.cgiGet( edtAgrupada_Internalname)) ;
         n5677Agrupada = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5677Agrupada", A5677Agrupada);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipocol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipocol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPOCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipocol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5678Tipocol = (byte)(0) ;
            n5678Tipocol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5678Tipocol), 2, 0));
         }
         else
         {
            A5678Tipocol = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipocol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5678Tipocol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5678Tipocol), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisposic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisposic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPOSIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisposic_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5679Disposic = 0 ;
            n5679Disposic = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5679Disposic), 8, 0));
         }
         else
         {
            A5679Disposic = (int)(localUtil.ctol( httpContext.cgiGet( edtDisposic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5679Disposic = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5679Disposic), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ORDENLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOrdenlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5680Ordenlin = (short)(0) ;
            n5680Ordenlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5680Ordenlin), 4, 0));
         }
         else
         {
            A5680Ordenlin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdenlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5680Ordenlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5680Ordenlin), 4, 0));
         }
         A5681Disnume = httpContext.cgiGet( edtDisnume_Internalname) ;
         n5681Disnume = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5681Disnume", A5681Disnume);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASSTAT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasStat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5682FasStat = (byte)(0) ;
            n5682FasStat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.str( A5682FasStat, 1, 0));
         }
         else
         {
            A5682FasStat = (byte)(localUtil.ctol( httpContext.cgiGet( edtFasStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5682FasStat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.str( A5682FasStat, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUnid_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUnid_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARUNID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarUnid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5683BarUnid = DecimalUtil.ZERO ;
            n5683BarUnid = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrimstr( A5683BarUnid, 9, 2));
         }
         else
         {
            A5683BarUnid = localUtil.ctond( httpContext.cgiGet( edtBarUnid_Internalname)) ;
            n5683BarUnid = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrimstr( A5683BarUnid, 9, 2));
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
            A5663Empresa = httpContext.GetPar( "Empresa") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
            A5664CodiFase = httpContext.GetPar( "CodiFase") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
            A5665Maquina = httpContext.GetPar( "Maquina") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
            A5666Barcada = (int)(GXutil.lval( httpContext.GetPar( "Barcada"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
            A5667Reoperado = (byte)(GXutil.lval( httpContext.GetPar( "Reoperado"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
            A5668Partido = httpContext.GetPar( "Partido") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
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
            initAll1GW1628( ) ;
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
      disableAttributes1GW1628( ) ;
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

   public void confirm_1GW0( )
   {
      beforeValidate1GW1628( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GW1628( ) ;
         }
         else
         {
            checkExtendedTable1GW1628( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1GW1628( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GW0( ) ;
      }
   }

   public void resetCaption1GW0( )
   {
   }

   public void zm1GW1628( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5669Macro = T01GW3_A5669Macro[0] ;
            Z5670Serie = T01GW3_A5670Serie[0] ;
            Z5671Cliente = T01GW3_A5671Cliente[0] ;
            Z5672ColNom = T01GW3_A5672ColNom[0] ;
            Z5673ColNum = T01GW3_A5673ColNum[0] ;
            Z5674Proceso = T01GW3_A5674Proceso[0] ;
            Z5684PmqKil = T01GW3_A5684PmqKil[0] ;
            Z5675Situacion = T01GW3_A5675Situacion[0] ;
            Z5676FechaPrev = T01GW3_A5676FechaPrev[0] ;
            Z5677Agrupada = T01GW3_A5677Agrupada[0] ;
            Z5678Tipocol = T01GW3_A5678Tipocol[0] ;
            Z5679Disposic = T01GW3_A5679Disposic[0] ;
            Z5680Ordenlin = T01GW3_A5680Ordenlin[0] ;
            Z5681Disnume = T01GW3_A5681Disnume[0] ;
            Z5682FasStat = T01GW3_A5682FasStat[0] ;
            Z5683BarUnid = T01GW3_A5683BarUnid[0] ;
         }
         else
         {
            Z5669Macro = A5669Macro ;
            Z5670Serie = A5670Serie ;
            Z5671Cliente = A5671Cliente ;
            Z5672ColNom = A5672ColNom ;
            Z5673ColNum = A5673ColNum ;
            Z5674Proceso = A5674Proceso ;
            Z5684PmqKil = A5684PmqKil ;
            Z5675Situacion = A5675Situacion ;
            Z5676FechaPrev = A5676FechaPrev ;
            Z5677Agrupada = A5677Agrupada ;
            Z5678Tipocol = A5678Tipocol ;
            Z5679Disposic = A5679Disposic ;
            Z5680Ordenlin = A5680Ordenlin ;
            Z5681Disnume = A5681Disnume ;
            Z5682FasStat = A5682FasStat ;
            Z5683BarUnid = A5683BarUnid ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z5663Empresa = A5663Empresa ;
         Z5664CodiFase = A5664CodiFase ;
         Z5665Maquina = A5665Maquina ;
         Z5666Barcada = A5666Barcada ;
         Z5667Reoperado = A5667Reoperado ;
         Z5668Partido = A5668Partido ;
         Z5669Macro = A5669Macro ;
         Z5670Serie = A5670Serie ;
         Z5671Cliente = A5671Cliente ;
         Z5672ColNom = A5672ColNom ;
         Z5673ColNum = A5673ColNum ;
         Z5674Proceso = A5674Proceso ;
         Z5684PmqKil = A5684PmqKil ;
         Z5675Situacion = A5675Situacion ;
         Z5676FechaPrev = A5676FechaPrev ;
         Z5677Agrupada = A5677Agrupada ;
         Z5678Tipocol = A5678Tipocol ;
         Z5679Disposic = A5679Disposic ;
         Z5680Ordenlin = A5680Ordenlin ;
         Z5681Disnume = A5681Disnume ;
         Z5682FasStat = A5682FasStat ;
         Z5683BarUnid = A5683BarUnid ;
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

   public void load1GW1628( )
   {
      /* Using cursor T01GW4 */
      pr_default.execute(2, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1628 = (short)(1) ;
         A5669Macro = T01GW4_A5669Macro[0] ;
         n5669Macro = T01GW4_n5669Macro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5669Macro), 6, 0));
         A5670Serie = T01GW4_A5670Serie[0] ;
         n5670Serie = T01GW4_n5670Serie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5670Serie", A5670Serie);
         A5671Cliente = T01GW4_A5671Cliente[0] ;
         n5671Cliente = T01GW4_n5671Cliente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5671Cliente), 6, 0));
         A5672ColNom = T01GW4_A5672ColNom[0] ;
         n5672ColNom = T01GW4_n5672ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5672ColNom", A5672ColNom);
         A5673ColNum = T01GW4_A5673ColNum[0] ;
         n5673ColNum = T01GW4_n5673ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5673ColNum), 6, 0));
         A5674Proceso = T01GW4_A5674Proceso[0] ;
         n5674Proceso = T01GW4_n5674Proceso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5674Proceso", A5674Proceso);
         A5684PmqKil = T01GW4_A5684PmqKil[0] ;
         n5684PmqKil = T01GW4_n5684PmqKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrimstr( A5684PmqKil, 9, 2));
         A5675Situacion = T01GW4_A5675Situacion[0] ;
         n5675Situacion = T01GW4_n5675Situacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.str( A5675Situacion, 1, 0));
         A5676FechaPrev = T01GW4_A5676FechaPrev[0] ;
         n5676FechaPrev = T01GW4_n5676FechaPrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
         A5677Agrupada = T01GW4_A5677Agrupada[0] ;
         n5677Agrupada = T01GW4_n5677Agrupada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5677Agrupada", A5677Agrupada);
         A5678Tipocol = T01GW4_A5678Tipocol[0] ;
         n5678Tipocol = T01GW4_n5678Tipocol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5678Tipocol), 2, 0));
         A5679Disposic = T01GW4_A5679Disposic[0] ;
         n5679Disposic = T01GW4_n5679Disposic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5679Disposic), 8, 0));
         A5680Ordenlin = T01GW4_A5680Ordenlin[0] ;
         n5680Ordenlin = T01GW4_n5680Ordenlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5680Ordenlin), 4, 0));
         A5681Disnume = T01GW4_A5681Disnume[0] ;
         n5681Disnume = T01GW4_n5681Disnume[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5681Disnume", A5681Disnume);
         A5682FasStat = T01GW4_A5682FasStat[0] ;
         n5682FasStat = T01GW4_n5682FasStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.str( A5682FasStat, 1, 0));
         A5683BarUnid = T01GW4_A5683BarUnid[0] ;
         n5683BarUnid = T01GW4_n5683BarUnid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrimstr( A5683BarUnid, 9, 2));
         zm1GW1628( -2) ;
      }
      pr_default.close(2);
      onLoadActions1GW1628( ) ;
   }

   public void onLoadActions1GW1628( )
   {
   }

   public void checkExtendedTable1GW1628( )
   {
      nIsDirty_1628 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( A5682FasStat == 0 ) || ( A5682FasStat == 1 ) || ( A5682FasStat == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "FasStat", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasStat_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1GW1628( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1GW1628( )
   {
      /* Using cursor T01GW5 */
      pr_default.execute(3, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1628 = (short)(1) ;
      }
      else
      {
         RcdFound1628 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GW3 */
      pr_default.execute(1, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GW1628( 2) ;
         RcdFound1628 = (short)(1) ;
         A5663Empresa = T01GW3_A5663Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
         A5664CodiFase = T01GW3_A5664CodiFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
         A5665Maquina = T01GW3_A5665Maquina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
         A5666Barcada = T01GW3_A5666Barcada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         A5667Reoperado = T01GW3_A5667Reoperado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         A5668Partido = T01GW3_A5668Partido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
         A5669Macro = T01GW3_A5669Macro[0] ;
         n5669Macro = T01GW3_n5669Macro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5669Macro), 6, 0));
         A5670Serie = T01GW3_A5670Serie[0] ;
         n5670Serie = T01GW3_n5670Serie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5670Serie", A5670Serie);
         A5671Cliente = T01GW3_A5671Cliente[0] ;
         n5671Cliente = T01GW3_n5671Cliente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5671Cliente), 6, 0));
         A5672ColNom = T01GW3_A5672ColNom[0] ;
         n5672ColNom = T01GW3_n5672ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5672ColNom", A5672ColNom);
         A5673ColNum = T01GW3_A5673ColNum[0] ;
         n5673ColNum = T01GW3_n5673ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5673ColNum), 6, 0));
         A5674Proceso = T01GW3_A5674Proceso[0] ;
         n5674Proceso = T01GW3_n5674Proceso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5674Proceso", A5674Proceso);
         A5684PmqKil = T01GW3_A5684PmqKil[0] ;
         n5684PmqKil = T01GW3_n5684PmqKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrimstr( A5684PmqKil, 9, 2));
         A5675Situacion = T01GW3_A5675Situacion[0] ;
         n5675Situacion = T01GW3_n5675Situacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.str( A5675Situacion, 1, 0));
         A5676FechaPrev = T01GW3_A5676FechaPrev[0] ;
         n5676FechaPrev = T01GW3_n5676FechaPrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
         A5677Agrupada = T01GW3_A5677Agrupada[0] ;
         n5677Agrupada = T01GW3_n5677Agrupada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5677Agrupada", A5677Agrupada);
         A5678Tipocol = T01GW3_A5678Tipocol[0] ;
         n5678Tipocol = T01GW3_n5678Tipocol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5678Tipocol), 2, 0));
         A5679Disposic = T01GW3_A5679Disposic[0] ;
         n5679Disposic = T01GW3_n5679Disposic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5679Disposic), 8, 0));
         A5680Ordenlin = T01GW3_A5680Ordenlin[0] ;
         n5680Ordenlin = T01GW3_n5680Ordenlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5680Ordenlin), 4, 0));
         A5681Disnume = T01GW3_A5681Disnume[0] ;
         n5681Disnume = T01GW3_n5681Disnume[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5681Disnume", A5681Disnume);
         A5682FasStat = T01GW3_A5682FasStat[0] ;
         n5682FasStat = T01GW3_n5682FasStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.str( A5682FasStat, 1, 0));
         A5683BarUnid = T01GW3_A5683BarUnid[0] ;
         n5683BarUnid = T01GW3_n5683BarUnid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrimstr( A5683BarUnid, 9, 2));
         Z5663Empresa = A5663Empresa ;
         Z5664CodiFase = A5664CodiFase ;
         Z5665Maquina = A5665Maquina ;
         Z5666Barcada = A5666Barcada ;
         Z5667Reoperado = A5667Reoperado ;
         Z5668Partido = A5668Partido ;
         sMode1628 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GW1628( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1628 = (short)(0) ;
            initializeNonKey1GW1628( ) ;
         }
         Gx_mode = sMode1628 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1628 = (short)(0) ;
         initializeNonKey1GW1628( ) ;
         sMode1628 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1628 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GW1628( ) ;
      if ( RcdFound1628 == 0 )
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
      RcdFound1628 = (short)(0) ;
      /* Using cursor T01GW6 */
      pr_default.execute(4, new Object[] {A5663Empresa, A5663Empresa, A5664CodiFase, A5664CodiFase, A5663Empresa, A5665Maquina, A5665Maquina, A5664CodiFase, A5663Empresa, Integer.valueOf(A5666Barcada), Integer.valueOf(A5666Barcada), A5665Maquina, A5664CodiFase, A5663Empresa, Byte.valueOf(A5667Reoperado), Byte.valueOf(A5667Reoperado), Integer.valueOf(A5666Barcada), A5665Maquina, A5664CodiFase, A5663Empresa, A5668Partido});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) < 0 ) || ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) < 0 ) || ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) < 0 ) || ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW6_A5666Barcada[0] < A5666Barcada ) || ( T01GW6_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW6_A5667Reoperado[0] < A5667Reoperado ) || ( T01GW6_A5667Reoperado[0] == A5667Reoperado ) && ( T01GW6_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5668Partido[0], A5668Partido) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) > 0 ) || ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) > 0 ) || ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) > 0 ) || ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW6_A5666Barcada[0] > A5666Barcada ) || ( T01GW6_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW6_A5667Reoperado[0] > A5667Reoperado ) || ( T01GW6_A5667Reoperado[0] == A5667Reoperado ) && ( T01GW6_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW6_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW6_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW6_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW6_A5668Partido[0], A5668Partido) > 0 ) ) )
         {
            A5663Empresa = T01GW6_A5663Empresa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
            A5664CodiFase = T01GW6_A5664CodiFase[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
            A5665Maquina = T01GW6_A5665Maquina[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
            A5666Barcada = T01GW6_A5666Barcada[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
            A5667Reoperado = T01GW6_A5667Reoperado[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
            A5668Partido = T01GW6_A5668Partido[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
            RcdFound1628 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1628 = (short)(0) ;
      /* Using cursor T01GW7 */
      pr_default.execute(5, new Object[] {A5663Empresa, A5663Empresa, A5664CodiFase, A5664CodiFase, A5663Empresa, A5665Maquina, A5665Maquina, A5664CodiFase, A5663Empresa, Integer.valueOf(A5666Barcada), Integer.valueOf(A5666Barcada), A5665Maquina, A5664CodiFase, A5663Empresa, Byte.valueOf(A5667Reoperado), Byte.valueOf(A5667Reoperado), Integer.valueOf(A5666Barcada), A5665Maquina, A5664CodiFase, A5663Empresa, A5668Partido});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) > 0 ) || ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) > 0 ) || ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) > 0 ) || ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW7_A5666Barcada[0] > A5666Barcada ) || ( T01GW7_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW7_A5667Reoperado[0] > A5667Reoperado ) || ( T01GW7_A5667Reoperado[0] == A5667Reoperado ) && ( T01GW7_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5668Partido[0], A5668Partido) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) < 0 ) || ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) < 0 ) || ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) < 0 ) || ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW7_A5666Barcada[0] < A5666Barcada ) || ( T01GW7_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( T01GW7_A5667Reoperado[0] < A5667Reoperado ) || ( T01GW7_A5667Reoperado[0] == A5667Reoperado ) && ( T01GW7_A5666Barcada[0] == A5666Barcada ) && ( GXutil.strcmp(T01GW7_A5665Maquina[0], A5665Maquina) == 0 ) && ( GXutil.strcmp(T01GW7_A5664CodiFase[0], A5664CodiFase) == 0 ) && ( GXutil.strcmp(T01GW7_A5663Empresa[0], A5663Empresa) == 0 ) && ( GXutil.strcmp(T01GW7_A5668Partido[0], A5668Partido) < 0 ) ) )
         {
            A5663Empresa = T01GW7_A5663Empresa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
            A5664CodiFase = T01GW7_A5664CodiFase[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
            A5665Maquina = T01GW7_A5665Maquina[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
            A5666Barcada = T01GW7_A5666Barcada[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
            A5667Reoperado = T01GW7_A5667Reoperado[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
            A5668Partido = T01GW7_A5668Partido[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
            RcdFound1628 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GW1628( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmpresa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GW1628( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1628 == 1 )
         {
            if ( ( GXutil.strcmp(A5663Empresa, Z5663Empresa) != 0 ) || ( GXutil.strcmp(A5664CodiFase, Z5664CodiFase) != 0 ) || ( GXutil.strcmp(A5665Maquina, Z5665Maquina) != 0 ) || ( A5666Barcada != Z5666Barcada ) || ( A5667Reoperado != Z5667Reoperado ) || ( GXutil.strcmp(A5668Partido, Z5668Partido) != 0 ) )
            {
               A5663Empresa = Z5663Empresa ;
               httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
               A5664CodiFase = Z5664CodiFase ;
               httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
               A5665Maquina = Z5665Maquina ;
               httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
               A5666Barcada = Z5666Barcada ;
               httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
               A5667Reoperado = Z5667Reoperado ;
               httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
               A5668Partido = Z5668Partido ;
               httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRESA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmpresa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1GW1628( ) ;
               GX_FocusControl = edtEmpresa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A5663Empresa, Z5663Empresa) != 0 ) || ( GXutil.strcmp(A5664CodiFase, Z5664CodiFase) != 0 ) || ( GXutil.strcmp(A5665Maquina, Z5665Maquina) != 0 ) || ( A5666Barcada != Z5666Barcada ) || ( A5667Reoperado != Z5667Reoperado ) || ( GXutil.strcmp(A5668Partido, Z5668Partido) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmpresa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GW1628( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRESA");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmpresa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtEmpresa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GW1628( ) ;
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
      if ( ( GXutil.strcmp(A5663Empresa, Z5663Empresa) != 0 ) || ( GXutil.strcmp(A5664CodiFase, Z5664CodiFase) != 0 ) || ( GXutil.strcmp(A5665Maquina, Z5665Maquina) != 0 ) || ( A5666Barcada != Z5666Barcada ) || ( A5667Reoperado != Z5667Reoperado ) || ( GXutil.strcmp(A5668Partido, Z5668Partido) != 0 ) )
      {
         A5663Empresa = Z5663Empresa ;
         httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
         A5664CodiFase = Z5664CodiFase ;
         httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
         A5665Maquina = Z5665Maquina ;
         httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
         A5666Barcada = Z5666Barcada ;
         httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         A5667Reoperado = Z5667Reoperado ;
         httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         A5668Partido = Z5668Partido ;
         httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRESA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmpresa_Internalname ;
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
      getKey1GW1628( ) ;
      if ( RcdFound1628 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRESA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpresa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A5663Empresa, Z5663Empresa) != 0 ) || ( GXutil.strcmp(A5664CodiFase, Z5664CodiFase) != 0 ) || ( GXutil.strcmp(A5665Maquina, Z5665Maquina) != 0 ) || ( A5666Barcada != Z5666Barcada ) || ( A5667Reoperado != Z5667Reoperado ) || ( GXutil.strcmp(A5668Partido, Z5668Partido) != 0 ) )
         {
            A5663Empresa = Z5663Empresa ;
            httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
            A5664CodiFase = Z5664CodiFase ;
            httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
            A5665Maquina = Z5665Maquina ;
            httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
            A5666Barcada = Z5666Barcada ;
            httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
            A5667Reoperado = Z5667Reoperado ;
            httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
            A5668Partido = Z5668Partido ;
            httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRESA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpresa_Internalname ;
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
         if ( ( GXutil.strcmp(A5663Empresa, Z5663Empresa) != 0 ) || ( GXutil.strcmp(A5664CodiFase, Z5664CodiFase) != 0 ) || ( GXutil.strcmp(A5665Maquina, Z5665Maquina) != 0 ) || ( A5666Barcada != Z5666Barcada ) || ( A5667Reoperado != Z5667Reoperado ) || ( GXutil.strcmp(A5668Partido, Z5668Partido) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRESA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresa_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpmq011");
      GX_FocusControl = edtMacro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GW0( ) ;
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
      if ( RcdFound1628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRESA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMacro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GW1628( ) ;
      if ( RcdFound1628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GW1628( ) ;
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
      if ( RcdFound1628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacro_Internalname ;
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
      if ( RcdFound1628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacro_Internalname ;
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
      scanStart1GW1628( ) ;
      if ( RcdFound1628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1628 != 0 )
         {
            scanNext1GW1628( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GW1628( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GW1628( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GW2 */
         pr_default.execute(0, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPMQ011"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5669Macro != T01GW2_A5669Macro[0] ) || ( GXutil.strcmp(Z5670Serie, T01GW2_A5670Serie[0]) != 0 ) || ( Z5671Cliente != T01GW2_A5671Cliente[0] ) || ( GXutil.strcmp(Z5672ColNom, T01GW2_A5672ColNom[0]) != 0 ) || ( Z5673ColNum != T01GW2_A5673ColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5674Proceso, T01GW2_A5674Proceso[0]) != 0 ) || ( DecimalUtil.compareTo(Z5684PmqKil, T01GW2_A5684PmqKil[0]) != 0 ) || ( Z5675Situacion != T01GW2_A5675Situacion[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z5676FechaPrev), GXutil.resetTime(T01GW2_A5676FechaPrev[0])) ) || ( GXutil.strcmp(Z5677Agrupada, T01GW2_A5677Agrupada[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5678Tipocol != T01GW2_A5678Tipocol[0] ) || ( Z5679Disposic != T01GW2_A5679Disposic[0] ) || ( Z5680Ordenlin != T01GW2_A5680Ordenlin[0] ) || ( GXutil.strcmp(Z5681Disnume, T01GW2_A5681Disnume[0]) != 0 ) || ( Z5682FasStat != T01GW2_A5682FasStat[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5683BarUnid, T01GW2_A5683BarUnid[0]) != 0 ) )
         {
            if ( Z5669Macro != T01GW2_A5669Macro[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Macro");
               GXutil.writeLogRaw("Old: ",Z5669Macro);
               GXutil.writeLogRaw("Current: ",T01GW2_A5669Macro[0]);
            }
            if ( GXutil.strcmp(Z5670Serie, T01GW2_A5670Serie[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Serie");
               GXutil.writeLogRaw("Old: ",Z5670Serie);
               GXutil.writeLogRaw("Current: ",T01GW2_A5670Serie[0]);
            }
            if ( Z5671Cliente != T01GW2_A5671Cliente[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Cliente");
               GXutil.writeLogRaw("Old: ",Z5671Cliente);
               GXutil.writeLogRaw("Current: ",T01GW2_A5671Cliente[0]);
            }
            if ( GXutil.strcmp(Z5672ColNom, T01GW2_A5672ColNom[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"ColNom");
               GXutil.writeLogRaw("Old: ",Z5672ColNom);
               GXutil.writeLogRaw("Current: ",T01GW2_A5672ColNom[0]);
            }
            if ( Z5673ColNum != T01GW2_A5673ColNum[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"ColNum");
               GXutil.writeLogRaw("Old: ",Z5673ColNum);
               GXutil.writeLogRaw("Current: ",T01GW2_A5673ColNum[0]);
            }
            if ( GXutil.strcmp(Z5674Proceso, T01GW2_A5674Proceso[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Proceso");
               GXutil.writeLogRaw("Old: ",Z5674Proceso);
               GXutil.writeLogRaw("Current: ",T01GW2_A5674Proceso[0]);
            }
            if ( DecimalUtil.compareTo(Z5684PmqKil, T01GW2_A5684PmqKil[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"PmqKil");
               GXutil.writeLogRaw("Old: ",Z5684PmqKil);
               GXutil.writeLogRaw("Current: ",T01GW2_A5684PmqKil[0]);
            }
            if ( Z5675Situacion != T01GW2_A5675Situacion[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Situacion");
               GXutil.writeLogRaw("Old: ",Z5675Situacion);
               GXutil.writeLogRaw("Current: ",T01GW2_A5675Situacion[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5676FechaPrev), GXutil.resetTime(T01GW2_A5676FechaPrev[0])) ) )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"FechaPrev");
               GXutil.writeLogRaw("Old: ",Z5676FechaPrev);
               GXutil.writeLogRaw("Current: ",T01GW2_A5676FechaPrev[0]);
            }
            if ( GXutil.strcmp(Z5677Agrupada, T01GW2_A5677Agrupada[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Agrupada");
               GXutil.writeLogRaw("Old: ",Z5677Agrupada);
               GXutil.writeLogRaw("Current: ",T01GW2_A5677Agrupada[0]);
            }
            if ( Z5678Tipocol != T01GW2_A5678Tipocol[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Tipocol");
               GXutil.writeLogRaw("Old: ",Z5678Tipocol);
               GXutil.writeLogRaw("Current: ",T01GW2_A5678Tipocol[0]);
            }
            if ( Z5679Disposic != T01GW2_A5679Disposic[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Disposic");
               GXutil.writeLogRaw("Old: ",Z5679Disposic);
               GXutil.writeLogRaw("Current: ",T01GW2_A5679Disposic[0]);
            }
            if ( Z5680Ordenlin != T01GW2_A5680Ordenlin[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Ordenlin");
               GXutil.writeLogRaw("Old: ",Z5680Ordenlin);
               GXutil.writeLogRaw("Current: ",T01GW2_A5680Ordenlin[0]);
            }
            if ( GXutil.strcmp(Z5681Disnume, T01GW2_A5681Disnume[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"Disnume");
               GXutil.writeLogRaw("Old: ",Z5681Disnume);
               GXutil.writeLogRaw("Current: ",T01GW2_A5681Disnume[0]);
            }
            if ( Z5682FasStat != T01GW2_A5682FasStat[0] )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"FasStat");
               GXutil.writeLogRaw("Old: ",Z5682FasStat);
               GXutil.writeLogRaw("Current: ",T01GW2_A5682FasStat[0]);
            }
            if ( DecimalUtil.compareTo(Z5683BarUnid, T01GW2_A5683BarUnid[0]) != 0 )
            {
               GXutil.writeLogln("tpmq011:[seudo value changed for attri]"+"BarUnid");
               GXutil.writeLogRaw("Old: ",Z5683BarUnid);
               GXutil.writeLogRaw("Current: ",T01GW2_A5683BarUnid[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPMQ011"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GW1628( )
   {
      beforeValidate1GW1628( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GW1628( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GW1628( 0) ;
         checkOptimisticConcurrency1GW1628( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GW1628( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GW1628( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GW8 */
                  pr_default.execute(6, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido, Boolean.valueOf(n5669Macro), Integer.valueOf(A5669Macro), Boolean.valueOf(n5670Serie), A5670Serie, Boolean.valueOf(n5671Cliente), Integer.valueOf(A5671Cliente), Boolean.valueOf(n5672ColNom), A5672ColNom, Boolean.valueOf(n5673ColNum), Integer.valueOf(A5673ColNum), Boolean.valueOf(n5674Proceso), A5674Proceso, Boolean.valueOf(n5684PmqKil), A5684PmqKil, Boolean.valueOf(n5675Situacion), Byte.valueOf(A5675Situacion), Boolean.valueOf(n5676FechaPrev), A5676FechaPrev, Boolean.valueOf(n5677Agrupada), A5677Agrupada, Boolean.valueOf(n5678Tipocol), Byte.valueOf(A5678Tipocol), Boolean.valueOf(n5679Disposic), Integer.valueOf(A5679Disposic), Boolean.valueOf(n5680Ordenlin), Short.valueOf(A5680Ordenlin), Boolean.valueOf(n5681Disnume), A5681Disnume, Boolean.valueOf(n5682FasStat), Byte.valueOf(A5682FasStat), Boolean.valueOf(n5683BarUnid), A5683BarUnid});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPMQ011");
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
                        resetCaption1GW0( ) ;
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
            load1GW1628( ) ;
         }
         endLevel1GW1628( ) ;
      }
      closeExtendedTableCursors1GW1628( ) ;
   }

   public void update1GW1628( )
   {
      beforeValidate1GW1628( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GW1628( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GW1628( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GW1628( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GW1628( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GW9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n5669Macro), Integer.valueOf(A5669Macro), Boolean.valueOf(n5670Serie), A5670Serie, Boolean.valueOf(n5671Cliente), Integer.valueOf(A5671Cliente), Boolean.valueOf(n5672ColNom), A5672ColNom, Boolean.valueOf(n5673ColNum), Integer.valueOf(A5673ColNum), Boolean.valueOf(n5674Proceso), A5674Proceso, Boolean.valueOf(n5684PmqKil), A5684PmqKil, Boolean.valueOf(n5675Situacion), Byte.valueOf(A5675Situacion), Boolean.valueOf(n5676FechaPrev), A5676FechaPrev, Boolean.valueOf(n5677Agrupada), A5677Agrupada, Boolean.valueOf(n5678Tipocol), Byte.valueOf(A5678Tipocol), Boolean.valueOf(n5679Disposic), Integer.valueOf(A5679Disposic), Boolean.valueOf(n5680Ordenlin), Short.valueOf(A5680Ordenlin), Boolean.valueOf(n5681Disnume), A5681Disnume, Boolean.valueOf(n5682FasStat), Byte.valueOf(A5682FasStat), Boolean.valueOf(n5683BarUnid), A5683BarUnid, A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPMQ011");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPMQ011"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GW1628( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GW0( ) ;
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
         endLevel1GW1628( ) ;
      }
      closeExtendedTableCursors1GW1628( ) ;
   }

   public void deferredUpdate1GW1628( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GW1628( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GW1628( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GW1628( ) ;
         afterConfirm1GW1628( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GW1628( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GW10 */
               pr_default.execute(8, new Object[] {A5663Empresa, A5664CodiFase, A5665Maquina, Integer.valueOf(A5666Barcada), Byte.valueOf(A5667Reoperado), A5668Partido});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPMQ011");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1628 == 0 )
                     {
                        initAll1GW1628( ) ;
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
                     resetCaption1GW0( ) ;
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
      sMode1628 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GW1628( ) ;
      Gx_mode = sMode1628 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GW1628( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GW1628( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GW1628( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpmq011");
         if ( AnyError == 0 )
         {
            confirmValues1GW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpmq011");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GW1628( )
   {
      /* Using cursor T01GW11 */
      pr_default.execute(9);
      RcdFound1628 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1628 = (short)(1) ;
         A5663Empresa = T01GW11_A5663Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
         A5664CodiFase = T01GW11_A5664CodiFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
         A5665Maquina = T01GW11_A5665Maquina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
         A5666Barcada = T01GW11_A5666Barcada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         A5667Reoperado = T01GW11_A5667Reoperado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         A5668Partido = T01GW11_A5668Partido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GW1628( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1628 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1628 = (short)(1) ;
         A5663Empresa = T01GW11_A5663Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
         A5664CodiFase = T01GW11_A5664CodiFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
         A5665Maquina = T01GW11_A5665Maquina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
         A5666Barcada = T01GW11_A5666Barcada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
         A5667Reoperado = T01GW11_A5667Reoperado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
         A5668Partido = T01GW11_A5668Partido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
      }
   }

   public void scanEnd1GW1628( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1GW1628( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GW1628( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GW1628( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GW1628( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GW1628( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GW1628( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GW1628( )
   {
      edtEmpresa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpresa_Enabled), 5, 0), true);
      edtCodiFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodiFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodiFase_Enabled), 5, 0), true);
      edtMaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaquina_Enabled), 5, 0), true);
      edtBarcada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarcada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarcada_Enabled), 5, 0), true);
      edtReoperado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtReoperado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtReoperado_Enabled), 5, 0), true);
      edtPartido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartido_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartido_Enabled), 5, 0), true);
      edtMacro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacro_Enabled), 5, 0), true);
      edtSerie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSerie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSerie_Enabled), 5, 0), true);
      edtCliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliente_Enabled), 5, 0), true);
      edtColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNom_Enabled), 5, 0), true);
      edtColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNum_Enabled), 5, 0), true);
      edtProceso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceso_Enabled), 5, 0), true);
      edtPmqKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPmqKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPmqKil_Enabled), 5, 0), true);
      edtSituacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSituacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSituacion_Enabled), 5, 0), true);
      edtFechaPrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFechaPrev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFechaPrev_Enabled), 5, 0), true);
      edtAgrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAgrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAgrupada_Enabled), 5, 0), true);
      edtTipocol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipocol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipocol_Enabled), 5, 0), true);
      edtDisposic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisposic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisposic_Enabled), 5, 0), true);
      edtOrdenlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenlin_Enabled), 5, 0), true);
      edtDisnume_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisnume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisnume_Enabled), 5, 0), true);
      edtFasStat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasStat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasStat_Enabled), 5, 0), true);
      edtBarUnid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUnid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUnid_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GW1628( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GW0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpmq011", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5663Empresa", GXutil.rtrim( Z5663Empresa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5664CodiFase", GXutil.rtrim( Z5664CodiFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5665Maquina", GXutil.rtrim( Z5665Maquina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5666Barcada", GXutil.ltrim( localUtil.ntoc( Z5666Barcada, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5667Reoperado", GXutil.ltrim( localUtil.ntoc( Z5667Reoperado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5668Partido", GXutil.rtrim( Z5668Partido));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5669Macro", GXutil.ltrim( localUtil.ntoc( Z5669Macro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5670Serie", GXutil.rtrim( Z5670Serie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5671Cliente", GXutil.ltrim( localUtil.ntoc( Z5671Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5672ColNom", GXutil.rtrim( Z5672ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5673ColNum", GXutil.ltrim( localUtil.ntoc( Z5673ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5674Proceso", GXutil.rtrim( Z5674Proceso));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5684PmqKil", GXutil.ltrim( localUtil.ntoc( Z5684PmqKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5675Situacion", GXutil.ltrim( localUtil.ntoc( Z5675Situacion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5676FechaPrev", localUtil.dtoc( Z5676FechaPrev, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5677Agrupada", GXutil.rtrim( Z5677Agrupada));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5678Tipocol", GXutil.ltrim( localUtil.ntoc( Z5678Tipocol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5679Disposic", GXutil.ltrim( localUtil.ntoc( Z5679Disposic, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5680Ordenlin", GXutil.ltrim( localUtil.ntoc( Z5680Ordenlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5681Disnume", GXutil.rtrim( Z5681Disnume));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5682FasStat", GXutil.ltrim( localUtil.ntoc( Z5682FasStat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5683BarUnid", GXutil.ltrim( localUtil.ntoc( Z5683BarUnid, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpmq011", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPMQ011" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PLANEAR MAQUINAS", "") ;
   }

   public void initializeNonKey1GW1628( )
   {
      A5669Macro = 0 ;
      n5669Macro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5669Macro), 6, 0));
      A5670Serie = "" ;
      n5670Serie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5670Serie", A5670Serie);
      A5671Cliente = 0 ;
      n5671Cliente = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5671Cliente), 6, 0));
      A5672ColNom = "" ;
      n5672ColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5672ColNom", A5672ColNom);
      A5673ColNum = 0 ;
      n5673ColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5673ColNum), 6, 0));
      A5674Proceso = "" ;
      n5674Proceso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5674Proceso", A5674Proceso);
      A5684PmqKil = DecimalUtil.ZERO ;
      n5684PmqKil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrimstr( A5684PmqKil, 9, 2));
      A5675Situacion = (byte)(0) ;
      n5675Situacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.str( A5675Situacion, 1, 0));
      A5676FechaPrev = GXutil.nullDate() ;
      n5676FechaPrev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
      A5677Agrupada = "" ;
      n5677Agrupada = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5677Agrupada", A5677Agrupada);
      A5678Tipocol = (byte)(0) ;
      n5678Tipocol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5678Tipocol), 2, 0));
      A5679Disposic = 0 ;
      n5679Disposic = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5679Disposic), 8, 0));
      A5680Ordenlin = (short)(0) ;
      n5680Ordenlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5680Ordenlin), 4, 0));
      A5681Disnume = "" ;
      n5681Disnume = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5681Disnume", A5681Disnume);
      A5682FasStat = (byte)(0) ;
      n5682FasStat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.str( A5682FasStat, 1, 0));
      A5683BarUnid = DecimalUtil.ZERO ;
      n5683BarUnid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrimstr( A5683BarUnid, 9, 2));
      Z5669Macro = 0 ;
      Z5670Serie = "" ;
      Z5671Cliente = 0 ;
      Z5672ColNom = "" ;
      Z5673ColNum = 0 ;
      Z5674Proceso = "" ;
      Z5684PmqKil = DecimalUtil.ZERO ;
      Z5675Situacion = (byte)(0) ;
      Z5676FechaPrev = GXutil.nullDate() ;
      Z5677Agrupada = "" ;
      Z5678Tipocol = (byte)(0) ;
      Z5679Disposic = 0 ;
      Z5680Ordenlin = (short)(0) ;
      Z5681Disnume = "" ;
      Z5682FasStat = (byte)(0) ;
      Z5683BarUnid = DecimalUtil.ZERO ;
   }

   public void initAll1GW1628( )
   {
      A5663Empresa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5663Empresa", A5663Empresa);
      A5664CodiFase = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5664CodiFase", A5664CodiFase);
      A5665Maquina = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5665Maquina", A5665Maquina);
      A5666Barcada = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5666Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5666Barcada), 6, 0));
      A5667Reoperado = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5667Reoperado", GXutil.str( A5667Reoperado, 1, 0));
      A5668Partido = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5668Partido", A5668Partido);
      initializeNonKey1GW1628( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251943482", true, true);
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
      httpContext.AddJavascriptSource("tpmq011.js", "?20261251943482", false, true);
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
      edtEmpresa_Internalname = "EMPRESA" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtCodiFase_Internalname = "CODIFASE" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaquina_Internalname = "MAQUINA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarcada_Internalname = "BARCADA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtReoperado_Internalname = "REOPERADO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPartido_Internalname = "PARTIDO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMacro_Internalname = "MACRO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSerie_Internalname = "SERIE" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliente_Internalname = "CLIENTE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtColNom_Internalname = "COLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtColNum_Internalname = "COLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtProceso_Internalname = "PROCESO" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPmqKil_Internalname = "PMQKIL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtSituacion_Internalname = "SITUACION" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtFechaPrev_Internalname = "FECHAPREV" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAgrupada_Internalname = "AGRUPADA" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtTipocol_Internalname = "TIPOCOL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDisposic_Internalname = "DISPOSIC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtOrdenlin_Internalname = "ORDENLIN" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDisnume_Internalname = "DISNUME" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtFasStat_Internalname = "FASSTAT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarUnid_Internalname = "BARUNID" ;
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
      Form.setCaption( httpContext.getMessage( "PLANEAR MAQUINAS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarUnid_Jsonclick = "" ;
      edtBarUnid_Backcolor = (int)(0xFFFFFF) ;
      edtBarUnid_Enabled = 1 ;
      edtFasStat_Jsonclick = "" ;
      edtFasStat_Backcolor = (int)(0xFFFFFF) ;
      edtFasStat_Enabled = 1 ;
      edtDisnume_Jsonclick = "" ;
      edtDisnume_Backcolor = (int)(0xFFFFFF) ;
      edtDisnume_Enabled = 1 ;
      edtOrdenlin_Jsonclick = "" ;
      edtOrdenlin_Backcolor = (int)(0xFFFFFF) ;
      edtOrdenlin_Enabled = 1 ;
      edtDisposic_Jsonclick = "" ;
      edtDisposic_Backcolor = (int)(0xFFFFFF) ;
      edtDisposic_Enabled = 1 ;
      edtTipocol_Jsonclick = "" ;
      edtTipocol_Backcolor = (int)(0xFFFFFF) ;
      edtTipocol_Enabled = 1 ;
      edtAgrupada_Jsonclick = "" ;
      edtAgrupada_Backcolor = (int)(0xFFFFFF) ;
      edtAgrupada_Enabled = 1 ;
      edtFechaPrev_Jsonclick = "" ;
      edtFechaPrev_Backcolor = (int)(0xFFFFFF) ;
      edtFechaPrev_Enabled = 1 ;
      edtSituacion_Jsonclick = "" ;
      edtSituacion_Backcolor = (int)(0xFFFFFF) ;
      edtSituacion_Enabled = 1 ;
      edtPmqKil_Jsonclick = "" ;
      edtPmqKil_Backcolor = (int)(0xFFFFFF) ;
      edtPmqKil_Enabled = 1 ;
      edtProceso_Jsonclick = "" ;
      edtProceso_Backcolor = (int)(0xFFFFFF) ;
      edtProceso_Enabled = 1 ;
      edtColNum_Jsonclick = "" ;
      edtColNum_Backcolor = (int)(0xFFFFFF) ;
      edtColNum_Enabled = 1 ;
      edtColNom_Jsonclick = "" ;
      edtColNom_Backcolor = (int)(0xFFFFFF) ;
      edtColNom_Enabled = 1 ;
      edtCliente_Jsonclick = "" ;
      edtCliente_Backcolor = (int)(0xFFFFFF) ;
      edtCliente_Enabled = 1 ;
      edtSerie_Jsonclick = "" ;
      edtSerie_Backcolor = (int)(0xFFFFFF) ;
      edtSerie_Enabled = 1 ;
      edtMacro_Jsonclick = "" ;
      edtMacro_Backcolor = (int)(0xFFFFFF) ;
      edtMacro_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPartido_Jsonclick = "" ;
      edtPartido_Backcolor = (int)(0xFFFFFF) ;
      edtPartido_Enabled = 1 ;
      edtReoperado_Jsonclick = "" ;
      edtReoperado_Backcolor = (int)(0xFFFFFF) ;
      edtReoperado_Enabled = 1 ;
      edtBarcada_Jsonclick = "" ;
      edtBarcada_Backcolor = (int)(0xFFFFFF) ;
      edtBarcada_Enabled = 1 ;
      edtMaquina_Jsonclick = "" ;
      edtMaquina_Backcolor = (int)(0xFFFFFF) ;
      edtMaquina_Enabled = 1 ;
      edtCodiFase_Jsonclick = "" ;
      edtCodiFase_Backcolor = (int)(0xFFFFFF) ;
      edtCodiFase_Enabled = 1 ;
      edtEmpresa_Jsonclick = "" ;
      edtEmpresa_Backcolor = (int)(0xFFFFFF) ;
      edtEmpresa_Enabled = 1 ;
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
      GX_FocusControl = edtMacro_Internalname ;
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

   public void valid_Partido( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5669Macro", GXutil.ltrim( localUtil.ntoc( A5669Macro, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5670Serie", GXutil.rtrim( A5670Serie));
      httpContext.ajax_rsp_assign_attri("", false, "A5671Cliente", GXutil.ltrim( localUtil.ntoc( A5671Cliente, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5672ColNom", GXutil.rtrim( A5672ColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5673ColNum", GXutil.ltrim( localUtil.ntoc( A5673ColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5674Proceso", GXutil.rtrim( A5674Proceso));
      httpContext.ajax_rsp_assign_attri("", false, "A5684PmqKil", GXutil.ltrim( localUtil.ntoc( A5684PmqKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5675Situacion", GXutil.ltrim( localUtil.ntoc( A5675Situacion, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5676FechaPrev", localUtil.format(A5676FechaPrev, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5677Agrupada", GXutil.rtrim( A5677Agrupada));
      httpContext.ajax_rsp_assign_attri("", false, "A5678Tipocol", GXutil.ltrim( localUtil.ntoc( A5678Tipocol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5679Disposic", GXutil.ltrim( localUtil.ntoc( A5679Disposic, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5680Ordenlin", GXutil.ltrim( localUtil.ntoc( A5680Ordenlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5681Disnume", GXutil.rtrim( A5681Disnume));
      httpContext.ajax_rsp_assign_attri("", false, "A5682FasStat", GXutil.ltrim( localUtil.ntoc( A5682FasStat, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5683BarUnid", GXutil.ltrim( localUtil.ntoc( A5683BarUnid, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5663Empresa", GXutil.rtrim( Z5663Empresa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5664CodiFase", GXutil.rtrim( Z5664CodiFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5665Maquina", GXutil.rtrim( Z5665Maquina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5666Barcada", GXutil.ltrim( localUtil.ntoc( Z5666Barcada, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5667Reoperado", GXutil.ltrim( localUtil.ntoc( Z5667Reoperado, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5668Partido", GXutil.rtrim( Z5668Partido));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5669Macro", GXutil.ltrim( localUtil.ntoc( Z5669Macro, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5670Serie", GXutil.rtrim( Z5670Serie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5671Cliente", GXutil.ltrim( localUtil.ntoc( Z5671Cliente, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5672ColNom", GXutil.rtrim( Z5672ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5673ColNum", GXutil.ltrim( localUtil.ntoc( Z5673ColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5674Proceso", GXutil.rtrim( Z5674Proceso));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5684PmqKil", GXutil.ltrim( localUtil.ntoc( Z5684PmqKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5675Situacion", GXutil.ltrim( localUtil.ntoc( Z5675Situacion, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5676FechaPrev", localUtil.format(Z5676FechaPrev, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5677Agrupada", GXutil.rtrim( Z5677Agrupada));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5678Tipocol", GXutil.ltrim( localUtil.ntoc( Z5678Tipocol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5679Disposic", GXutil.ltrim( localUtil.ntoc( Z5679Disposic, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5680Ordenlin", GXutil.ltrim( localUtil.ntoc( Z5680Ordenlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5681Disnume", GXutil.rtrim( Z5681Disnume));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5682FasStat", GXutil.ltrim( localUtil.ntoc( Z5682FasStat, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5683BarUnid", GXutil.ltrim( localUtil.ntoc( Z5683BarUnid, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_EMPRESA","{handler:'valid_Empresa',iparms:[]");
      setEventMetadata("VALID_EMPRESA",",oparms:[]}");
      setEventMetadata("VALID_CODIFASE","{handler:'valid_Codifase',iparms:[]");
      setEventMetadata("VALID_CODIFASE",",oparms:[]}");
      setEventMetadata("VALID_MAQUINA","{handler:'valid_Maquina',iparms:[]");
      setEventMetadata("VALID_MAQUINA",",oparms:[]}");
      setEventMetadata("VALID_BARCADA","{handler:'valid_Barcada',iparms:[]");
      setEventMetadata("VALID_BARCADA",",oparms:[]}");
      setEventMetadata("VALID_REOPERADO","{handler:'valid_Reoperado',iparms:[]");
      setEventMetadata("VALID_REOPERADO",",oparms:[]}");
      setEventMetadata("VALID_PARTIDO","{handler:'valid_Partido',iparms:[{av:'A5663Empresa',fld:'EMPRESA',pic:''},{av:'A5664CodiFase',fld:'CODIFASE',pic:''},{av:'A5665Maquina',fld:'MAQUINA',pic:''},{av:'A5666Barcada',fld:'BARCADA',pic:'ZZZZZ9'},{av:'A5667Reoperado',fld:'REOPERADO',pic:'9'},{av:'A5668Partido',fld:'PARTIDO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PARTIDO",",oparms:[{av:'A5669Macro',fld:'MACRO',pic:'ZZZZZ9'},{av:'A5670Serie',fld:'SERIE',pic:''},{av:'A5671Cliente',fld:'CLIENTE',pic:'ZZZZZ9'},{av:'A5672ColNom',fld:'COLNOM',pic:''},{av:'A5673ColNum',fld:'COLNUM',pic:'ZZZZZ9'},{av:'A5674Proceso',fld:'PROCESO',pic:''},{av:'A5684PmqKil',fld:'PMQKIL',pic:'ZZZZZ9.99'},{av:'A5675Situacion',fld:'SITUACION',pic:'9'},{av:'A5676FechaPrev',fld:'FECHAPREV',pic:''},{av:'A5677Agrupada',fld:'AGRUPADA',pic:'@!'},{av:'A5678Tipocol',fld:'TIPOCOL',pic:'Z9'},{av:'A5679Disposic',fld:'DISPOSIC',pic:'ZZZZZZZ9'},{av:'A5680Ordenlin',fld:'ORDENLIN',pic:'ZZZ9'},{av:'A5681Disnume',fld:'DISNUME',pic:''},{av:'A5682FasStat',fld:'FASSTAT',pic:'9'},{av:'A5683BarUnid',fld:'BARUNID',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z5663Empresa'},{av:'Z5664CodiFase'},{av:'Z5665Maquina'},{av:'Z5666Barcada'},{av:'Z5667Reoperado'},{av:'Z5668Partido'},{av:'Z5669Macro'},{av:'Z5670Serie'},{av:'Z5671Cliente'},{av:'Z5672ColNom'},{av:'Z5673ColNum'},{av:'Z5674Proceso'},{av:'Z5684PmqKil'},{av:'Z5675Situacion'},{av:'Z5676FechaPrev'},{av:'Z5677Agrupada'},{av:'Z5678Tipocol'},{av:'Z5679Disposic'},{av:'Z5680Ordenlin'},{av:'Z5681Disnume'},{av:'Z5682FasStat'},{av:'Z5683BarUnid'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASSTAT","{handler:'valid_Fasstat',iparms:[]");
      setEventMetadata("VALID_FASSTAT",",oparms:[]}");
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
      Z5663Empresa = "" ;
      Z5664CodiFase = "" ;
      Z5665Maquina = "" ;
      Z5668Partido = "" ;
      Z5670Serie = "" ;
      Z5672ColNom = "" ;
      Z5674Proceso = "" ;
      Z5684PmqKil = DecimalUtil.ZERO ;
      Z5676FechaPrev = GXutil.nullDate() ;
      Z5677Agrupada = "" ;
      Z5681Disnume = "" ;
      Z5683BarUnid = DecimalUtil.ZERO ;
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
      A5663Empresa = "" ;
      lblTextblock2_Jsonclick = "" ;
      A5664CodiFase = "" ;
      lblTextblock3_Jsonclick = "" ;
      A5665Maquina = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5668Partido = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A5670Serie = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A5672ColNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A5674Proceso = "" ;
      lblTextblock13_Jsonclick = "" ;
      A5684PmqKil = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A5676FechaPrev = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A5677Agrupada = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A5681Disnume = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A5683BarUnid = DecimalUtil.ZERO ;
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
      T01GW4_A5663Empresa = new String[] {""} ;
      T01GW4_A5664CodiFase = new String[] {""} ;
      T01GW4_A5665Maquina = new String[] {""} ;
      T01GW4_A5666Barcada = new int[1] ;
      T01GW4_A5667Reoperado = new byte[1] ;
      T01GW4_A5668Partido = new String[] {""} ;
      T01GW4_A5669Macro = new int[1] ;
      T01GW4_n5669Macro = new boolean[] {false} ;
      T01GW4_A5670Serie = new String[] {""} ;
      T01GW4_n5670Serie = new boolean[] {false} ;
      T01GW4_A5671Cliente = new int[1] ;
      T01GW4_n5671Cliente = new boolean[] {false} ;
      T01GW4_A5672ColNom = new String[] {""} ;
      T01GW4_n5672ColNom = new boolean[] {false} ;
      T01GW4_A5673ColNum = new int[1] ;
      T01GW4_n5673ColNum = new boolean[] {false} ;
      T01GW4_A5674Proceso = new String[] {""} ;
      T01GW4_n5674Proceso = new boolean[] {false} ;
      T01GW4_A5684PmqKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW4_n5684PmqKil = new boolean[] {false} ;
      T01GW4_A5675Situacion = new byte[1] ;
      T01GW4_n5675Situacion = new boolean[] {false} ;
      T01GW4_A5676FechaPrev = new java.util.Date[] {GXutil.nullDate()} ;
      T01GW4_n5676FechaPrev = new boolean[] {false} ;
      T01GW4_A5677Agrupada = new String[] {""} ;
      T01GW4_n5677Agrupada = new boolean[] {false} ;
      T01GW4_A5678Tipocol = new byte[1] ;
      T01GW4_n5678Tipocol = new boolean[] {false} ;
      T01GW4_A5679Disposic = new int[1] ;
      T01GW4_n5679Disposic = new boolean[] {false} ;
      T01GW4_A5680Ordenlin = new short[1] ;
      T01GW4_n5680Ordenlin = new boolean[] {false} ;
      T01GW4_A5681Disnume = new String[] {""} ;
      T01GW4_n5681Disnume = new boolean[] {false} ;
      T01GW4_A5682FasStat = new byte[1] ;
      T01GW4_n5682FasStat = new boolean[] {false} ;
      T01GW4_A5683BarUnid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW4_n5683BarUnid = new boolean[] {false} ;
      T01GW5_A5663Empresa = new String[] {""} ;
      T01GW5_A5664CodiFase = new String[] {""} ;
      T01GW5_A5665Maquina = new String[] {""} ;
      T01GW5_A5666Barcada = new int[1] ;
      T01GW5_A5667Reoperado = new byte[1] ;
      T01GW5_A5668Partido = new String[] {""} ;
      T01GW3_A5663Empresa = new String[] {""} ;
      T01GW3_A5664CodiFase = new String[] {""} ;
      T01GW3_A5665Maquina = new String[] {""} ;
      T01GW3_A5666Barcada = new int[1] ;
      T01GW3_A5667Reoperado = new byte[1] ;
      T01GW3_A5668Partido = new String[] {""} ;
      T01GW3_A5669Macro = new int[1] ;
      T01GW3_n5669Macro = new boolean[] {false} ;
      T01GW3_A5670Serie = new String[] {""} ;
      T01GW3_n5670Serie = new boolean[] {false} ;
      T01GW3_A5671Cliente = new int[1] ;
      T01GW3_n5671Cliente = new boolean[] {false} ;
      T01GW3_A5672ColNom = new String[] {""} ;
      T01GW3_n5672ColNom = new boolean[] {false} ;
      T01GW3_A5673ColNum = new int[1] ;
      T01GW3_n5673ColNum = new boolean[] {false} ;
      T01GW3_A5674Proceso = new String[] {""} ;
      T01GW3_n5674Proceso = new boolean[] {false} ;
      T01GW3_A5684PmqKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW3_n5684PmqKil = new boolean[] {false} ;
      T01GW3_A5675Situacion = new byte[1] ;
      T01GW3_n5675Situacion = new boolean[] {false} ;
      T01GW3_A5676FechaPrev = new java.util.Date[] {GXutil.nullDate()} ;
      T01GW3_n5676FechaPrev = new boolean[] {false} ;
      T01GW3_A5677Agrupada = new String[] {""} ;
      T01GW3_n5677Agrupada = new boolean[] {false} ;
      T01GW3_A5678Tipocol = new byte[1] ;
      T01GW3_n5678Tipocol = new boolean[] {false} ;
      T01GW3_A5679Disposic = new int[1] ;
      T01GW3_n5679Disposic = new boolean[] {false} ;
      T01GW3_A5680Ordenlin = new short[1] ;
      T01GW3_n5680Ordenlin = new boolean[] {false} ;
      T01GW3_A5681Disnume = new String[] {""} ;
      T01GW3_n5681Disnume = new boolean[] {false} ;
      T01GW3_A5682FasStat = new byte[1] ;
      T01GW3_n5682FasStat = new boolean[] {false} ;
      T01GW3_A5683BarUnid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW3_n5683BarUnid = new boolean[] {false} ;
      sMode1628 = "" ;
      T01GW6_A5663Empresa = new String[] {""} ;
      T01GW6_A5664CodiFase = new String[] {""} ;
      T01GW6_A5665Maquina = new String[] {""} ;
      T01GW6_A5666Barcada = new int[1] ;
      T01GW6_A5667Reoperado = new byte[1] ;
      T01GW6_A5668Partido = new String[] {""} ;
      T01GW7_A5663Empresa = new String[] {""} ;
      T01GW7_A5664CodiFase = new String[] {""} ;
      T01GW7_A5665Maquina = new String[] {""} ;
      T01GW7_A5666Barcada = new int[1] ;
      T01GW7_A5667Reoperado = new byte[1] ;
      T01GW7_A5668Partido = new String[] {""} ;
      T01GW2_A5663Empresa = new String[] {""} ;
      T01GW2_A5664CodiFase = new String[] {""} ;
      T01GW2_A5665Maquina = new String[] {""} ;
      T01GW2_A5666Barcada = new int[1] ;
      T01GW2_A5667Reoperado = new byte[1] ;
      T01GW2_A5668Partido = new String[] {""} ;
      T01GW2_A5669Macro = new int[1] ;
      T01GW2_n5669Macro = new boolean[] {false} ;
      T01GW2_A5670Serie = new String[] {""} ;
      T01GW2_n5670Serie = new boolean[] {false} ;
      T01GW2_A5671Cliente = new int[1] ;
      T01GW2_n5671Cliente = new boolean[] {false} ;
      T01GW2_A5672ColNom = new String[] {""} ;
      T01GW2_n5672ColNom = new boolean[] {false} ;
      T01GW2_A5673ColNum = new int[1] ;
      T01GW2_n5673ColNum = new boolean[] {false} ;
      T01GW2_A5674Proceso = new String[] {""} ;
      T01GW2_n5674Proceso = new boolean[] {false} ;
      T01GW2_A5684PmqKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW2_n5684PmqKil = new boolean[] {false} ;
      T01GW2_A5675Situacion = new byte[1] ;
      T01GW2_n5675Situacion = new boolean[] {false} ;
      T01GW2_A5676FechaPrev = new java.util.Date[] {GXutil.nullDate()} ;
      T01GW2_n5676FechaPrev = new boolean[] {false} ;
      T01GW2_A5677Agrupada = new String[] {""} ;
      T01GW2_n5677Agrupada = new boolean[] {false} ;
      T01GW2_A5678Tipocol = new byte[1] ;
      T01GW2_n5678Tipocol = new boolean[] {false} ;
      T01GW2_A5679Disposic = new int[1] ;
      T01GW2_n5679Disposic = new boolean[] {false} ;
      T01GW2_A5680Ordenlin = new short[1] ;
      T01GW2_n5680Ordenlin = new boolean[] {false} ;
      T01GW2_A5681Disnume = new String[] {""} ;
      T01GW2_n5681Disnume = new boolean[] {false} ;
      T01GW2_A5682FasStat = new byte[1] ;
      T01GW2_n5682FasStat = new boolean[] {false} ;
      T01GW2_A5683BarUnid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GW2_n5683BarUnid = new boolean[] {false} ;
      T01GW11_A5663Empresa = new String[] {""} ;
      T01GW11_A5664CodiFase = new String[] {""} ;
      T01GW11_A5665Maquina = new String[] {""} ;
      T01GW11_A5666Barcada = new int[1] ;
      T01GW11_A5667Reoperado = new byte[1] ;
      T01GW11_A5668Partido = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ5663Empresa = "" ;
      ZZ5664CodiFase = "" ;
      ZZ5665Maquina = "" ;
      ZZ5668Partido = "" ;
      ZZ5670Serie = "" ;
      ZZ5672ColNom = "" ;
      ZZ5674Proceso = "" ;
      ZZ5684PmqKil = DecimalUtil.ZERO ;
      ZZ5676FechaPrev = GXutil.nullDate() ;
      ZZ5677Agrupada = "" ;
      ZZ5681Disnume = "" ;
      ZZ5683BarUnid = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpmq011__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpmq011__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpmq011__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpmq011__default(),
         new Object[] {
             new Object[] {
            T01GW2_A5663Empresa, T01GW2_A5664CodiFase, T01GW2_A5665Maquina, T01GW2_A5666Barcada, T01GW2_A5667Reoperado, T01GW2_A5668Partido, T01GW2_A5669Macro, T01GW2_n5669Macro, T01GW2_A5670Serie, T01GW2_n5670Serie,
            T01GW2_A5671Cliente, T01GW2_n5671Cliente, T01GW2_A5672ColNom, T01GW2_n5672ColNom, T01GW2_A5673ColNum, T01GW2_n5673ColNum, T01GW2_A5674Proceso, T01GW2_n5674Proceso, T01GW2_A5684PmqKil, T01GW2_n5684PmqKil,
            T01GW2_A5675Situacion, T01GW2_n5675Situacion, T01GW2_A5676FechaPrev, T01GW2_n5676FechaPrev, T01GW2_A5677Agrupada, T01GW2_n5677Agrupada, T01GW2_A5678Tipocol, T01GW2_n5678Tipocol, T01GW2_A5679Disposic, T01GW2_n5679Disposic,
            T01GW2_A5680Ordenlin, T01GW2_n5680Ordenlin, T01GW2_A5681Disnume, T01GW2_n5681Disnume, T01GW2_A5682FasStat, T01GW2_n5682FasStat, T01GW2_A5683BarUnid, T01GW2_n5683BarUnid
            }
            , new Object[] {
            T01GW3_A5663Empresa, T01GW3_A5664CodiFase, T01GW3_A5665Maquina, T01GW3_A5666Barcada, T01GW3_A5667Reoperado, T01GW3_A5668Partido, T01GW3_A5669Macro, T01GW3_n5669Macro, T01GW3_A5670Serie, T01GW3_n5670Serie,
            T01GW3_A5671Cliente, T01GW3_n5671Cliente, T01GW3_A5672ColNom, T01GW3_n5672ColNom, T01GW3_A5673ColNum, T01GW3_n5673ColNum, T01GW3_A5674Proceso, T01GW3_n5674Proceso, T01GW3_A5684PmqKil, T01GW3_n5684PmqKil,
            T01GW3_A5675Situacion, T01GW3_n5675Situacion, T01GW3_A5676FechaPrev, T01GW3_n5676FechaPrev, T01GW3_A5677Agrupada, T01GW3_n5677Agrupada, T01GW3_A5678Tipocol, T01GW3_n5678Tipocol, T01GW3_A5679Disposic, T01GW3_n5679Disposic,
            T01GW3_A5680Ordenlin, T01GW3_n5680Ordenlin, T01GW3_A5681Disnume, T01GW3_n5681Disnume, T01GW3_A5682FasStat, T01GW3_n5682FasStat, T01GW3_A5683BarUnid, T01GW3_n5683BarUnid
            }
            , new Object[] {
            T01GW4_A5663Empresa, T01GW4_A5664CodiFase, T01GW4_A5665Maquina, T01GW4_A5666Barcada, T01GW4_A5667Reoperado, T01GW4_A5668Partido, T01GW4_A5669Macro, T01GW4_n5669Macro, T01GW4_A5670Serie, T01GW4_n5670Serie,
            T01GW4_A5671Cliente, T01GW4_n5671Cliente, T01GW4_A5672ColNom, T01GW4_n5672ColNom, T01GW4_A5673ColNum, T01GW4_n5673ColNum, T01GW4_A5674Proceso, T01GW4_n5674Proceso, T01GW4_A5684PmqKil, T01GW4_n5684PmqKil,
            T01GW4_A5675Situacion, T01GW4_n5675Situacion, T01GW4_A5676FechaPrev, T01GW4_n5676FechaPrev, T01GW4_A5677Agrupada, T01GW4_n5677Agrupada, T01GW4_A5678Tipocol, T01GW4_n5678Tipocol, T01GW4_A5679Disposic, T01GW4_n5679Disposic,
            T01GW4_A5680Ordenlin, T01GW4_n5680Ordenlin, T01GW4_A5681Disnume, T01GW4_n5681Disnume, T01GW4_A5682FasStat, T01GW4_n5682FasStat, T01GW4_A5683BarUnid, T01GW4_n5683BarUnid
            }
            , new Object[] {
            T01GW5_A5663Empresa, T01GW5_A5664CodiFase, T01GW5_A5665Maquina, T01GW5_A5666Barcada, T01GW5_A5667Reoperado, T01GW5_A5668Partido
            }
            , new Object[] {
            T01GW6_A5663Empresa, T01GW6_A5664CodiFase, T01GW6_A5665Maquina, T01GW6_A5666Barcada, T01GW6_A5667Reoperado, T01GW6_A5668Partido
            }
            , new Object[] {
            T01GW7_A5663Empresa, T01GW7_A5664CodiFase, T01GW7_A5665Maquina, T01GW7_A5666Barcada, T01GW7_A5667Reoperado, T01GW7_A5668Partido
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GW11_A5663Empresa, T01GW11_A5664CodiFase, T01GW11_A5665Maquina, T01GW11_A5666Barcada, T01GW11_A5667Reoperado, T01GW11_A5668Partido
            }
         }
      );
   }

   private byte Z5667Reoperado ;
   private byte Z5675Situacion ;
   private byte Z5678Tipocol ;
   private byte Z5682FasStat ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5667Reoperado ;
   private byte A5675Situacion ;
   private byte A5678Tipocol ;
   private byte A5682FasStat ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ5667Reoperado ;
   private byte ZZ5675Situacion ;
   private byte ZZ5678Tipocol ;
   private byte ZZ5682FasStat ;
   private short Z5680Ordenlin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5680Ordenlin ;
   private short RcdFound1628 ;
   private short nIsDirty_1628 ;
   private short ZZ5680Ordenlin ;
   private int Z5666Barcada ;
   private int Z5669Macro ;
   private int Z5671Cliente ;
   private int Z5673ColNum ;
   private int Z5679Disposic ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmpresa_Enabled ;
   private int edtCodiFase_Enabled ;
   private int edtMaquina_Enabled ;
   private int A5666Barcada ;
   private int edtBarcada_Enabled ;
   private int edtReoperado_Enabled ;
   private int edtPartido_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A5669Macro ;
   private int edtMacro_Enabled ;
   private int edtSerie_Enabled ;
   private int A5671Cliente ;
   private int edtCliente_Enabled ;
   private int edtColNom_Enabled ;
   private int A5673ColNum ;
   private int edtColNum_Enabled ;
   private int edtProceso_Enabled ;
   private int edtPmqKil_Enabled ;
   private int edtSituacion_Enabled ;
   private int edtFechaPrev_Enabled ;
   private int edtAgrupada_Enabled ;
   private int edtTipocol_Enabled ;
   private int A5679Disposic ;
   private int edtDisposic_Enabled ;
   private int edtOrdenlin_Enabled ;
   private int edtDisnume_Enabled ;
   private int edtFasStat_Enabled ;
   private int edtBarUnid_Enabled ;
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
   private int edtBarUnid_Backcolor ;
   private int edtFasStat_Backcolor ;
   private int edtDisnume_Backcolor ;
   private int edtOrdenlin_Backcolor ;
   private int edtDisposic_Backcolor ;
   private int edtTipocol_Backcolor ;
   private int edtAgrupada_Backcolor ;
   private int edtFechaPrev_Backcolor ;
   private int edtSituacion_Backcolor ;
   private int edtPmqKil_Backcolor ;
   private int edtProceso_Backcolor ;
   private int edtColNum_Backcolor ;
   private int edtColNom_Backcolor ;
   private int edtCliente_Backcolor ;
   private int edtSerie_Backcolor ;
   private int edtMacro_Backcolor ;
   private int edtPartido_Backcolor ;
   private int edtReoperado_Backcolor ;
   private int edtBarcada_Backcolor ;
   private int edtMaquina_Backcolor ;
   private int edtCodiFase_Backcolor ;
   private int edtEmpresa_Backcolor ;
   private int ZZ5666Barcada ;
   private int ZZ5669Macro ;
   private int ZZ5671Cliente ;
   private int ZZ5673ColNum ;
   private int ZZ5679Disposic ;
   private java.math.BigDecimal Z5684PmqKil ;
   private java.math.BigDecimal Z5683BarUnid ;
   private java.math.BigDecimal A5684PmqKil ;
   private java.math.BigDecimal A5683BarUnid ;
   private java.math.BigDecimal ZZ5684PmqKil ;
   private java.math.BigDecimal ZZ5683BarUnid ;
   private String sPrefix ;
   private String Z5663Empresa ;
   private String Z5664CodiFase ;
   private String Z5665Maquina ;
   private String Z5668Partido ;
   private String Z5670Serie ;
   private String Z5672ColNom ;
   private String Z5674Proceso ;
   private String Z5677Agrupada ;
   private String Z5681Disnume ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmpresa_Internalname ;
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
   private String A5663Empresa ;
   private String edtEmpresa_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCodiFase_Internalname ;
   private String A5664CodiFase ;
   private String edtCodiFase_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaquina_Internalname ;
   private String A5665Maquina ;
   private String edtMaquina_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarcada_Internalname ;
   private String edtBarcada_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtReoperado_Internalname ;
   private String edtReoperado_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPartido_Internalname ;
   private String A5668Partido ;
   private String edtPartido_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMacro_Internalname ;
   private String edtMacro_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSerie_Internalname ;
   private String A5670Serie ;
   private String edtSerie_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliente_Internalname ;
   private String edtCliente_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtColNom_Internalname ;
   private String A5672ColNom ;
   private String edtColNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtColNum_Internalname ;
   private String edtColNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtProceso_Internalname ;
   private String A5674Proceso ;
   private String edtProceso_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPmqKil_Internalname ;
   private String edtPmqKil_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtSituacion_Internalname ;
   private String edtSituacion_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtFechaPrev_Internalname ;
   private String edtFechaPrev_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAgrupada_Internalname ;
   private String A5677Agrupada ;
   private String edtAgrupada_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtTipocol_Internalname ;
   private String edtTipocol_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDisposic_Internalname ;
   private String edtDisposic_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtOrdenlin_Internalname ;
   private String edtOrdenlin_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDisnume_Internalname ;
   private String A5681Disnume ;
   private String edtDisnume_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtFasStat_Internalname ;
   private String edtFasStat_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarUnid_Internalname ;
   private String edtBarUnid_Jsonclick ;
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
   private String sMode1628 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ5663Empresa ;
   private String ZZ5664CodiFase ;
   private String ZZ5665Maquina ;
   private String ZZ5668Partido ;
   private String ZZ5670Serie ;
   private String ZZ5672ColNom ;
   private String ZZ5674Proceso ;
   private String ZZ5677Agrupada ;
   private String ZZ5681Disnume ;
   private java.util.Date Z5676FechaPrev ;
   private java.util.Date A5676FechaPrev ;
   private java.util.Date ZZ5676FechaPrev ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5669Macro ;
   private boolean n5670Serie ;
   private boolean n5671Cliente ;
   private boolean n5672ColNom ;
   private boolean n5673ColNum ;
   private boolean n5674Proceso ;
   private boolean n5684PmqKil ;
   private boolean n5675Situacion ;
   private boolean n5676FechaPrev ;
   private boolean n5677Agrupada ;
   private boolean n5678Tipocol ;
   private boolean n5679Disposic ;
   private boolean n5680Ordenlin ;
   private boolean n5681Disnume ;
   private boolean n5682FasStat ;
   private boolean n5683BarUnid ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01GW4_A5663Empresa ;
   private String[] T01GW4_A5664CodiFase ;
   private String[] T01GW4_A5665Maquina ;
   private int[] T01GW4_A5666Barcada ;
   private byte[] T01GW4_A5667Reoperado ;
   private String[] T01GW4_A5668Partido ;
   private int[] T01GW4_A5669Macro ;
   private boolean[] T01GW4_n5669Macro ;
   private String[] T01GW4_A5670Serie ;
   private boolean[] T01GW4_n5670Serie ;
   private int[] T01GW4_A5671Cliente ;
   private boolean[] T01GW4_n5671Cliente ;
   private String[] T01GW4_A5672ColNom ;
   private boolean[] T01GW4_n5672ColNom ;
   private int[] T01GW4_A5673ColNum ;
   private boolean[] T01GW4_n5673ColNum ;
   private String[] T01GW4_A5674Proceso ;
   private boolean[] T01GW4_n5674Proceso ;
   private java.math.BigDecimal[] T01GW4_A5684PmqKil ;
   private boolean[] T01GW4_n5684PmqKil ;
   private byte[] T01GW4_A5675Situacion ;
   private boolean[] T01GW4_n5675Situacion ;
   private java.util.Date[] T01GW4_A5676FechaPrev ;
   private boolean[] T01GW4_n5676FechaPrev ;
   private String[] T01GW4_A5677Agrupada ;
   private boolean[] T01GW4_n5677Agrupada ;
   private byte[] T01GW4_A5678Tipocol ;
   private boolean[] T01GW4_n5678Tipocol ;
   private int[] T01GW4_A5679Disposic ;
   private boolean[] T01GW4_n5679Disposic ;
   private short[] T01GW4_A5680Ordenlin ;
   private boolean[] T01GW4_n5680Ordenlin ;
   private String[] T01GW4_A5681Disnume ;
   private boolean[] T01GW4_n5681Disnume ;
   private byte[] T01GW4_A5682FasStat ;
   private boolean[] T01GW4_n5682FasStat ;
   private java.math.BigDecimal[] T01GW4_A5683BarUnid ;
   private boolean[] T01GW4_n5683BarUnid ;
   private String[] T01GW5_A5663Empresa ;
   private String[] T01GW5_A5664CodiFase ;
   private String[] T01GW5_A5665Maquina ;
   private int[] T01GW5_A5666Barcada ;
   private byte[] T01GW5_A5667Reoperado ;
   private String[] T01GW5_A5668Partido ;
   private String[] T01GW3_A5663Empresa ;
   private String[] T01GW3_A5664CodiFase ;
   private String[] T01GW3_A5665Maquina ;
   private int[] T01GW3_A5666Barcada ;
   private byte[] T01GW3_A5667Reoperado ;
   private String[] T01GW3_A5668Partido ;
   private int[] T01GW3_A5669Macro ;
   private boolean[] T01GW3_n5669Macro ;
   private String[] T01GW3_A5670Serie ;
   private boolean[] T01GW3_n5670Serie ;
   private int[] T01GW3_A5671Cliente ;
   private boolean[] T01GW3_n5671Cliente ;
   private String[] T01GW3_A5672ColNom ;
   private boolean[] T01GW3_n5672ColNom ;
   private int[] T01GW3_A5673ColNum ;
   private boolean[] T01GW3_n5673ColNum ;
   private String[] T01GW3_A5674Proceso ;
   private boolean[] T01GW3_n5674Proceso ;
   private java.math.BigDecimal[] T01GW3_A5684PmqKil ;
   private boolean[] T01GW3_n5684PmqKil ;
   private byte[] T01GW3_A5675Situacion ;
   private boolean[] T01GW3_n5675Situacion ;
   private java.util.Date[] T01GW3_A5676FechaPrev ;
   private boolean[] T01GW3_n5676FechaPrev ;
   private String[] T01GW3_A5677Agrupada ;
   private boolean[] T01GW3_n5677Agrupada ;
   private byte[] T01GW3_A5678Tipocol ;
   private boolean[] T01GW3_n5678Tipocol ;
   private int[] T01GW3_A5679Disposic ;
   private boolean[] T01GW3_n5679Disposic ;
   private short[] T01GW3_A5680Ordenlin ;
   private boolean[] T01GW3_n5680Ordenlin ;
   private String[] T01GW3_A5681Disnume ;
   private boolean[] T01GW3_n5681Disnume ;
   private byte[] T01GW3_A5682FasStat ;
   private boolean[] T01GW3_n5682FasStat ;
   private java.math.BigDecimal[] T01GW3_A5683BarUnid ;
   private boolean[] T01GW3_n5683BarUnid ;
   private String[] T01GW6_A5663Empresa ;
   private String[] T01GW6_A5664CodiFase ;
   private String[] T01GW6_A5665Maquina ;
   private int[] T01GW6_A5666Barcada ;
   private byte[] T01GW6_A5667Reoperado ;
   private String[] T01GW6_A5668Partido ;
   private String[] T01GW7_A5663Empresa ;
   private String[] T01GW7_A5664CodiFase ;
   private String[] T01GW7_A5665Maquina ;
   private int[] T01GW7_A5666Barcada ;
   private byte[] T01GW7_A5667Reoperado ;
   private String[] T01GW7_A5668Partido ;
   private String[] T01GW2_A5663Empresa ;
   private String[] T01GW2_A5664CodiFase ;
   private String[] T01GW2_A5665Maquina ;
   private int[] T01GW2_A5666Barcada ;
   private byte[] T01GW2_A5667Reoperado ;
   private String[] T01GW2_A5668Partido ;
   private int[] T01GW2_A5669Macro ;
   private boolean[] T01GW2_n5669Macro ;
   private String[] T01GW2_A5670Serie ;
   private boolean[] T01GW2_n5670Serie ;
   private int[] T01GW2_A5671Cliente ;
   private boolean[] T01GW2_n5671Cliente ;
   private String[] T01GW2_A5672ColNom ;
   private boolean[] T01GW2_n5672ColNom ;
   private int[] T01GW2_A5673ColNum ;
   private boolean[] T01GW2_n5673ColNum ;
   private String[] T01GW2_A5674Proceso ;
   private boolean[] T01GW2_n5674Proceso ;
   private java.math.BigDecimal[] T01GW2_A5684PmqKil ;
   private boolean[] T01GW2_n5684PmqKil ;
   private byte[] T01GW2_A5675Situacion ;
   private boolean[] T01GW2_n5675Situacion ;
   private java.util.Date[] T01GW2_A5676FechaPrev ;
   private boolean[] T01GW2_n5676FechaPrev ;
   private String[] T01GW2_A5677Agrupada ;
   private boolean[] T01GW2_n5677Agrupada ;
   private byte[] T01GW2_A5678Tipocol ;
   private boolean[] T01GW2_n5678Tipocol ;
   private int[] T01GW2_A5679Disposic ;
   private boolean[] T01GW2_n5679Disposic ;
   private short[] T01GW2_A5680Ordenlin ;
   private boolean[] T01GW2_n5680Ordenlin ;
   private String[] T01GW2_A5681Disnume ;
   private boolean[] T01GW2_n5681Disnume ;
   private byte[] T01GW2_A5682FasStat ;
   private boolean[] T01GW2_n5682FasStat ;
   private java.math.BigDecimal[] T01GW2_A5683BarUnid ;
   private boolean[] T01GW2_n5683BarUnid ;
   private String[] T01GW11_A5663Empresa ;
   private String[] T01GW11_A5664CodiFase ;
   private String[] T01GW11_A5665Maquina ;
   private int[] T01GW11_A5666Barcada ;
   private byte[] T01GW11_A5667Reoperado ;
   private String[] T01GW11_A5668Partido ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpmq011__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpmq011__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpmq011__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpmq011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GW2", "SELECT Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido, Macro, Serie, Cliente, ColNom, ColNum, Proceso, PmqKil, Situacion, FechaPrev, Agrupada, Tipocol, Disposic, Ordenlin, Disnume, FasStat, BarUnid FROM TXPPMQ011 WHERE Empresa = ? AND CodiFase = ? AND Maquina = ? AND Barcada = ? AND Reoperado = ? AND Partido = ?  FOR UPDATE OF Macro, Serie, Cliente, ColNom, ColNum, Proceso, PmqKil, Situacion, FechaPrev, Agrupada, Tipocol, Disposic, Ordenlin, Disnume, FasStat, BarUnid NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GW3", "SELECT Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido, Macro, Serie, Cliente, ColNom, ColNum, Proceso, PmqKil, Situacion, FechaPrev, Agrupada, Tipocol, Disposic, Ordenlin, Disnume, FasStat, BarUnid FROM TXPPMQ011 WHERE Empresa = ? AND CodiFase = ? AND Maquina = ? AND Barcada = ? AND Reoperado = ? AND Partido = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GW4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Empresa, TM1.CodiFase, TM1.Maquina, TM1.Barcada, TM1.Reoperado, TM1.Partido, TM1.Macro, TM1.Serie, TM1.Cliente, TM1.ColNom, TM1.ColNum, TM1.Proceso, TM1.PmqKil, TM1.Situacion, TM1.FechaPrev, TM1.Agrupada, TM1.Tipocol, TM1.Disposic, TM1.Ordenlin, TM1.Disnume, TM1.FasStat, TM1.BarUnid FROM TXPPMQ011 TM1 WHERE TM1.Empresa = ? and TM1.CodiFase = ? and TM1.Maquina = ? and TM1.Barcada = ? and TM1.Reoperado = ? and TM1.Partido = ? ORDER BY TM1.Empresa, TM1.CodiFase, TM1.Maquina, TM1.Barcada, TM1.Reoperado, TM1.Partido ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GW5", "SELECT /*+ FIRST_ROWS(1) */ Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido FROM TXPPMQ011 WHERE Empresa = ? AND CodiFase = ? AND Maquina = ? AND Barcada = ? AND Reoperado = ? AND Partido = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GW6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido FROM TXPPMQ011 WHERE ( Empresa > ? or Empresa = ? and CodiFase > ? or CodiFase = ? and Empresa = ? and Maquina > ? or Maquina = ? and CodiFase = ? and Empresa = ? and Barcada > ? or Barcada = ? and Maquina = ? and CodiFase = ? and Empresa = ? and Reoperado > ? or Reoperado = ? and Barcada = ? and Maquina = ? and CodiFase = ? and Empresa = ? and Partido > ?) ORDER BY Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GW7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido FROM TXPPMQ011 WHERE ( Empresa < ? or Empresa = ? and CodiFase < ? or CodiFase = ? and Empresa = ? and Maquina < ? or Maquina = ? and CodiFase = ? and Empresa = ? and Barcada < ? or Barcada = ? and Maquina = ? and CodiFase = ? and Empresa = ? and Reoperado < ? or Reoperado = ? and Barcada = ? and Maquina = ? and CodiFase = ? and Empresa = ? and Partido < ?) ORDER BY Empresa DESC, CodiFase DESC, Maquina DESC, Barcada DESC, Reoperado DESC, Partido DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GW8", "INSERT INTO TXPPMQ011(Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido, Macro, Serie, Cliente, ColNom, ColNum, Proceso, PmqKil, Situacion, FechaPrev, Agrupada, Tipocol, Disposic, Ordenlin, Disnume, FasStat, BarUnid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPMQ011")
         ,new UpdateCursor("T01GW9", "UPDATE TXPPMQ011 SET Macro=?, Serie=?, Cliente=?, ColNom=?, ColNum=?, Proceso=?, PmqKil=?, Situacion=?, FechaPrev=?, Agrupada=?, Tipocol=?, Disposic=?, Ordenlin=?, Disnume=?, FasStat=?, BarUnid=?  WHERE Empresa = ? AND CodiFase = ? AND Maquina = ? AND Barcada = ? AND Reoperado = ? AND Partido = ?", GX_NOMASK, "TXPPMQ011")
         ,new UpdateCursor("T01GW10", "DELETE FROM TXPPMQ011  WHERE Empresa = ? AND CodiFase = ? AND Maquina = ? AND Barcada = ? AND Reoperado = ? AND Partido = ?", GX_NOMASK, "TXPPMQ011")
         ,new ForEachCursor("T01GW11", "SELECT /*+ FIRST_ROWS(100) */ Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido FROM TXPPMQ011 ORDER BY Empresa, CodiFase, Maquina, Barcada, Reoperado, Partido ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 6);
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 6);
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[33], 8);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[37], 2);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 15);
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
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               stmt.setString(17, (String)parms[32], 3);
               stmt.setString(18, (String)parms[33], 8);
               stmt.setString(19, (String)parms[34], 6);
               stmt.setInt(20, ((Number) parms[35]).intValue());
               stmt.setByte(21, ((Number) parms[36]).byteValue());
               stmt.setString(22, (String)parms[37], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

