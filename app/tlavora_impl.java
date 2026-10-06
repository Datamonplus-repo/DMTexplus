package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlavora_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla LAVORA de Termoeletrónic", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTELId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tlavora_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlavora_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlavora_impl.class ));
   }

   public tlavora_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLAVORA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Clave", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELId_Internalname, GXutil.ltrim( localUtil.ntoc( A6491TELId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6491TELId), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6491TELId), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELId_Jsonclick, 0, "", "", "", "", "", 1, edtTELId_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Tarea  S/E  (Start End)", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELTarea_Internalname, GXutil.rtrim( A6492TELTarea), GXutil.rtrim( localUtil.format( A6492TELTarea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELTarea_Jsonclick, 0, "", "", "", "", "", 1, edtTELTarea_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código de Micro", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELMic_Internalname, GXutil.ltrim( localUtil.ntoc( A6493TELMic, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELMic_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6493TELMic), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6493TELMic), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELMic_Jsonclick, 0, "", "", "", "", "", 1, edtTELMic_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código de Máquina", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELMaqCod_Internalname, GXutil.rtrim( A6494TELMaqCod), GXutil.rtrim( localUtil.format( A6494TELMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtTELMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Partida", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPartida_Internalname, GXutil.ltrim( localUtil.ntoc( A6495TELPartida, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPartida_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6495TELPartida), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6495TELPartida), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPartida_Jsonclick, 0, "", "", "", "", "", 1, edtTELPartida_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Partida en campo char", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPartidC_Internalname, GXutil.rtrim( A6524TELPartidC), GXutil.rtrim( localUtil.format( A6524TELPartidC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPartidC_Jsonclick, 0, "", "", "", "", "", 1, edtTELPartidC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "H. Ruta", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6496TELBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6496TELBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6496TELBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtTELBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6497TELBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6497TELBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A6497TELBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtTELBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Partición", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELBarPar_Internalname, GXutil.rtrim( A6498TELBarPar), GXutil.rtrim( localUtil.format( A6498TELBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtTELBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Inicio", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTELFecIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELFecIni_Internalname, localUtil.format(A6499TELFecIni, "99/99/99"), localUtil.format( A6499TELFecIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELFecIni_Jsonclick, 0, "", "", "", "", "", 1, edtTELFecIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTELFecIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTELFecIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLAVORA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Hora Inicio", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTELHorIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELHorIni_Internalname, localUtil.ttoc( A6500TELHorIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6500TELHorIni, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELHorIni_Jsonclick, 0, "", "", "", "", "", 1, edtTELHorIni_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTELHorIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTELHorIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLAVORA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6501TELKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELKgs_Enabled!=0) ? localUtil.format( A6501TELKgs, "ZZZZZ9.99") : localUtil.format( A6501TELKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELKgs_Jsonclick, 0, "", "", "", "", "", 1, edtTELKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Programa 1", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPrg1_Internalname, GXutil.ltrim( localUtil.ntoc( A6502TELPrg1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPrg1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6502TELPrg1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6502TELPrg1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPrg1_Jsonclick, 0, "", "", "", "", "", 1, edtTELPrg1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Programa 2", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPrg2_Internalname, GXutil.ltrim( localUtil.ntoc( A6503TELPrg2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPrg2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6503TELPrg2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6503TELPrg2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPrg2_Jsonclick, 0, "", "", "", "", "", 1, edtTELPrg2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Programa 3", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPrg3_Internalname, GXutil.ltrim( localUtil.ntoc( A6504TELPrg3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPrg3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6504TELPrg3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6504TELPrg3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPrg3_Jsonclick, 0, "", "", "", "", "", 1, edtTELPrg3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Programa", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPrg4_Internalname, GXutil.ltrim( localUtil.ntoc( A6505TELPrg4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPrg4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6505TELPrg4), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6505TELPrg4), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPrg4_Jsonclick, 0, "", "", "", "", "", 1, edtTELPrg4_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Programa 5", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPrg5_Internalname, GXutil.ltrim( localUtil.ntoc( A6506TELPrg5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPrg5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6506TELPrg5), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6506TELPrg5), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPrg5_Jsonclick, 0, "", "", "", "", "", 1, edtTELPrg5_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tiempo Estándar (segundos)", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELTpStd_Internalname, GXutil.ltrim( localUtil.ntoc( A6507TELTpStd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELTpStd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6507TELTpStd), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6507TELTpStd), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELTpStd_Jsonclick, 0, "", "", "", "", "", 1, edtTELTpStd_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Código libre 1", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELCOLib1_Internalname, GXutil.rtrim( A6508TELCOLib1), GXutil.rtrim( localUtil.format( A6508TELCOLib1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELCOLib1_Jsonclick, 0, "", "", "", "", "", 1, edtTELCOLib1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Código Libre 2", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELCoLib2_Internalname, GXutil.rtrim( A6509TELCoLib2), GXutil.rtrim( localUtil.format( A6509TELCoLib2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELCoLib2_Jsonclick, 0, "", "", "", "", "", 1, edtTELCoLib2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Código Libre 3", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELCoLib3_Internalname, GXutil.rtrim( A6510TELCoLib3), GXutil.rtrim( localUtil.format( A6510TELCoLib3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELCoLib3_Jsonclick, 0, "", "", "", "", "", 1, edtTELCoLib3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Descripción Libre 1", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELDsLib1_Internalname, GXutil.rtrim( A6511TELDsLib1), GXutil.rtrim( localUtil.format( A6511TELDsLib1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELDsLib1_Jsonclick, 0, "", "", "", "", "", 1, edtTELDsLib1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Descripción Libre 2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELDsLib2_Internalname, GXutil.rtrim( A6512TELDsLib2), GXutil.rtrim( localUtil.format( A6512TELDsLib2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELDsLib2_Jsonclick, 0, "", "", "", "", "", 1, edtTELDsLib2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Descripción Libre 3", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELDsLib3_Internalname, GXutil.rtrim( A6513TELDsLib3), GXutil.rtrim( localUtil.format( A6513TELDsLib3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELDsLib3_Jsonclick, 0, "", "", "", "", "", 1, edtTELDsLib3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nota 1", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELNota1_Internalname, GXutil.rtrim( A6514TELNota1), GXutil.rtrim( localUtil.format( A6514TELNota1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELNota1_Jsonclick, 0, "", "", "", "", "", 1, edtTELNota1_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Nota 2", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELNota2_Internalname, GXutil.rtrim( A6515TELNota2), GXutil.rtrim( localUtil.format( A6515TELNota2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELNota2_Jsonclick, 0, "", "", "", "", "", 1, edtTELNota2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Rendimiento Máquina", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELPRdto_Internalname, GXutil.ltrim( localUtil.ntoc( A6516TELPRdto, (byte)(6), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELPRdto_Enabled!=0) ? localUtil.format( A6516TELPRdto, "ZZZ9.9") : localUtil.format( A6516TELPRdto, "ZZZ9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELPRdto_Jsonclick, 0, "", "", "", "", "", 1, edtTELPRdto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Tiempo Efectivo (Segundos)", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELTpEf_Internalname, GXutil.ltrim( localUtil.ntoc( A6517TELTpEf, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELTpEf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6517TELTpEf), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6517TELTpEf), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELTpEf_Jsonclick, 0, "", "", "", "", "", 1, edtTELTpEf_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Tiempo Total (Segundos)", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELTpTo_Internalname, GXutil.ltrim( localUtil.ntoc( A6518TELTpTo, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTELTpTo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6518TELTpTo), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6518TELTpTo), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELTpTo_Jsonclick, 0, "", "", "", "", "", 1, edtTELTpTo_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Fecha Fin", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTELFecFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELFecFin_Internalname, localUtil.format(A6519TELFecFin, "99/99/99"), localUtil.format( A6519TELFecFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELFecFin_Jsonclick, 0, "", "", "", "", "", 1, edtTELFecFin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTELFecFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTELFecFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLAVORA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Hora Fin", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTELHorFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELHorFin_Internalname, localUtil.ttoc( A6520TELHorFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6520TELHorFin, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELHorFin_Jsonclick, 0, "", "", "", "", "", 1, edtTELHorFin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLAVORA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTELHorFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTELHorFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLAVORA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Reservado 1", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTELRes1_Internalname, GXutil.rtrim( A6521TELRes1), GXutil.rtrim( localUtil.format( A6521TELRes1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTELRes1_Jsonclick, 0, "", "", "", "", "", 1, edtTELRes1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Reservado 3", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtTeLRes2_Internalname, GXutil.rtrim( A6522TeLRes2), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", (short)(0), 1, edtTeLRes2_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "342", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TLAVORA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLAVORA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLAVORA.htm");
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
         Z6491TELId = localUtil.ctol( httpContext.cgiGet( "Z6491TELId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z6492TELTarea = httpContext.cgiGet( "Z6492TELTarea") ;
         Z6493TELMic = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6493TELMic"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6494TELMaqCod = httpContext.cgiGet( "Z6494TELMaqCod") ;
         Z6495TELPartida = localUtil.ctol( httpContext.cgiGet( "Z6495TELPartida"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z6524TELPartidC = httpContext.cgiGet( "Z6524TELPartidC") ;
         Z6496TELBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6496TELBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6497TELBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6497TELBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6498TELBarPar = httpContext.cgiGet( "Z6498TELBarPar") ;
         Z6499TELFecIni = localUtil.ctod( httpContext.cgiGet( "Z6499TELFecIni"), 0) ;
         Z6500TELHorIni = localUtil.ctot( httpContext.cgiGet( "Z6500TELHorIni"), 0) ;
         Z6501TELKgs = localUtil.ctond( httpContext.cgiGet( "Z6501TELKgs")) ;
         Z6502TELPrg1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6502TELPrg1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6503TELPrg2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6503TELPrg2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6504TELPrg3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6504TELPrg3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6505TELPrg4 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6505TELPrg4"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6506TELPrg5 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6506TELPrg5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6507TELTpStd = (short)(localUtil.ctol( httpContext.cgiGet( "Z6507TELTpStd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6508TELCOLib1 = httpContext.cgiGet( "Z6508TELCOLib1") ;
         Z6509TELCoLib2 = httpContext.cgiGet( "Z6509TELCoLib2") ;
         Z6510TELCoLib3 = httpContext.cgiGet( "Z6510TELCoLib3") ;
         Z6511TELDsLib1 = httpContext.cgiGet( "Z6511TELDsLib1") ;
         Z6512TELDsLib2 = httpContext.cgiGet( "Z6512TELDsLib2") ;
         Z6513TELDsLib3 = httpContext.cgiGet( "Z6513TELDsLib3") ;
         Z6514TELNota1 = httpContext.cgiGet( "Z6514TELNota1") ;
         Z6515TELNota2 = httpContext.cgiGet( "Z6515TELNota2") ;
         Z6516TELPRdto = localUtil.ctond( httpContext.cgiGet( "Z6516TELPRdto")) ;
         Z6517TELTpEf = (int)(localUtil.ctol( httpContext.cgiGet( "Z6517TELTpEf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6518TELTpTo = (int)(localUtil.ctol( httpContext.cgiGet( "Z6518TELTpTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6519TELFecFin = localUtil.ctod( httpContext.cgiGet( "Z6519TELFecFin"), 0) ;
         Z6520TELHorFin = localUtil.ctot( httpContext.cgiGet( "Z6520TELHorFin"), 0) ;
         Z6521TELRes1 = httpContext.cgiGet( "Z6521TELRes1") ;
         Z6522TeLRes2 = httpContext.cgiGet( "Z6522TeLRes2") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6491TELId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
         }
         else
         {
            A6491TELId = localUtil.ctol( httpContext.cgiGet( edtTELId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
         }
         A6492TELTarea = httpContext.cgiGet( edtTELTarea_Internalname) ;
         n6492TELTarea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6492TELTarea", A6492TELTarea);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELMic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELMic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELMIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELMic_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6493TELMic = (byte)(0) ;
            n6493TELMic = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6493TELMic), 2, 0));
         }
         else
         {
            A6493TELMic = (byte)(localUtil.ctol( httpContext.cgiGet( edtTELMic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6493TELMic = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6493TELMic), 2, 0));
         }
         A6494TELMaqCod = httpContext.cgiGet( edtTELMaqCod_Internalname) ;
         n6494TELMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6494TELMaqCod", A6494TELMaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPartida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPartida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPARTIDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPartida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6495TELPartida = 0 ;
            n6495TELPartida = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6495TELPartida), 12, 0));
         }
         else
         {
            A6495TELPartida = localUtil.ctol( httpContext.cgiGet( edtTELPartida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n6495TELPartida = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6495TELPartida), 12, 0));
         }
         A6524TELPartidC = httpContext.cgiGet( edtTELPartidC_Internalname) ;
         n6524TELPartidC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6524TELPartidC", A6524TELPartidC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6496TELBarCod = 0 ;
            n6496TELBarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6496TELBarCod), 8, 0));
         }
         else
         {
            A6496TELBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTELBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6496TELBarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6496TELBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6497TELBarReo = (byte)(0) ;
            n6497TELBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.str( A6497TELBarReo, 1, 0));
         }
         else
         {
            A6497TELBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtTELBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6497TELBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.str( A6497TELBarReo, 1, 0));
         }
         A6498TELBarPar = httpContext.cgiGet( edtTELBarPar_Internalname) ;
         n6498TELBarPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6498TELBarPar", A6498TELBarPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtTELFecIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TELFECINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELFecIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6499TELFecIni = GXutil.nullDate() ;
            n6499TELFecIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
         }
         else
         {
            A6499TELFecIni = localUtil.ctod( httpContext.cgiGet( edtTELFecIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n6499TELFecIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtTELHorIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TELHORINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELHorIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
            n6500TELHorIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6500TELHorIni = localUtil.ctot( httpContext.cgiGet( edtTELHorIni_Internalname)) ;
            n6500TELHorIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTELKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTELKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6501TELKgs = DecimalUtil.ZERO ;
            n6501TELKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrimstr( A6501TELKgs, 9, 2));
         }
         else
         {
            A6501TELKgs = localUtil.ctond( httpContext.cgiGet( edtTELKgs_Internalname)) ;
            n6501TELKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrimstr( A6501TELKgs, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRG1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPrg1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6502TELPrg1 = (short)(0) ;
            n6502TELPrg1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6502TELPrg1), 3, 0));
         }
         else
         {
            A6502TELPrg1 = (short)(localUtil.ctol( httpContext.cgiGet( edtTELPrg1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6502TELPrg1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6502TELPrg1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRG2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPrg2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6503TELPrg2 = (short)(0) ;
            n6503TELPrg2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6503TELPrg2), 3, 0));
         }
         else
         {
            A6503TELPrg2 = (short)(localUtil.ctol( httpContext.cgiGet( edtTELPrg2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6503TELPrg2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6503TELPrg2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRG3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPrg3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6504TELPrg3 = (short)(0) ;
            n6504TELPrg3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6504TELPrg3), 3, 0));
         }
         else
         {
            A6504TELPrg3 = (short)(localUtil.ctol( httpContext.cgiGet( edtTELPrg3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6504TELPrg3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6504TELPrg3), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRG4");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPrg4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6505TELPrg4 = (short)(0) ;
            n6505TELPrg4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6505TELPrg4), 3, 0));
         }
         else
         {
            A6505TELPrg4 = (short)(localUtil.ctol( httpContext.cgiGet( edtTELPrg4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6505TELPrg4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6505TELPrg4), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELPrg5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRG5");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPrg5_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6506TELPrg5 = (short)(0) ;
            n6506TELPrg5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6506TELPrg5), 3, 0));
         }
         else
         {
            A6506TELPrg5 = (short)(localUtil.ctol( httpContext.cgiGet( edtTELPrg5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6506TELPrg5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6506TELPrg5), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpStd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpStd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELTPSTD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELTpStd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6507TELTpStd = (short)(0) ;
            n6507TELTpStd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6507TELTpStd), 3, 0));
         }
         else
         {
            A6507TELTpStd = (short)(localUtil.ctol( httpContext.cgiGet( edtTELTpStd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6507TELTpStd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6507TELTpStd), 3, 0));
         }
         A6508TELCOLib1 = httpContext.cgiGet( edtTELCOLib1_Internalname) ;
         n6508TELCOLib1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6508TELCOLib1", A6508TELCOLib1);
         A6509TELCoLib2 = httpContext.cgiGet( edtTELCoLib2_Internalname) ;
         n6509TELCoLib2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6509TELCoLib2", A6509TELCoLib2);
         A6510TELCoLib3 = httpContext.cgiGet( edtTELCoLib3_Internalname) ;
         n6510TELCoLib3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6510TELCoLib3", A6510TELCoLib3);
         A6511TELDsLib1 = httpContext.cgiGet( edtTELDsLib1_Internalname) ;
         n6511TELDsLib1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6511TELDsLib1", A6511TELDsLib1);
         A6512TELDsLib2 = httpContext.cgiGet( edtTELDsLib2_Internalname) ;
         n6512TELDsLib2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6512TELDsLib2", A6512TELDsLib2);
         A6513TELDsLib3 = httpContext.cgiGet( edtTELDsLib3_Internalname) ;
         n6513TELDsLib3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6513TELDsLib3", A6513TELDsLib3);
         A6514TELNota1 = httpContext.cgiGet( edtTELNota1_Internalname) ;
         n6514TELNota1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6514TELNota1", A6514TELNota1);
         A6515TELNota2 = httpContext.cgiGet( edtTELNota2_Internalname) ;
         n6515TELNota2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6515TELNota2", A6515TELNota2);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTELPRdto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTELPRdto_Internalname)), DecimalUtil.stringToDec("9999.9")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELPRDTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELPRdto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6516TELPRdto = DecimalUtil.ZERO ;
            n6516TELPRdto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrimstr( A6516TELPRdto, 6, 1));
         }
         else
         {
            A6516TELPRdto = localUtil.ctond( httpContext.cgiGet( edtTELPRdto_Internalname)) ;
            n6516TELPRdto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrimstr( A6516TELPRdto, 6, 1));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpEf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpEf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELTPEF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELTpEf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6517TELTpEf = 0 ;
            n6517TELTpEf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6517TELTpEf), 5, 0));
         }
         else
         {
            A6517TELTpEf = (int)(localUtil.ctol( httpContext.cgiGet( edtTELTpEf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6517TELTpEf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6517TELTpEf), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpTo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTELTpTo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TELTPTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELTpTo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6518TELTpTo = 0 ;
            n6518TELTpTo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6518TELTpTo), 5, 0));
         }
         else
         {
            A6518TELTpTo = (int)(localUtil.ctol( httpContext.cgiGet( edtTELTpTo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6518TELTpTo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6518TELTpTo), 5, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtTELFecFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TELFECFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELFecFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6519TELFecFin = GXutil.nullDate() ;
            n6519TELFecFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
         }
         else
         {
            A6519TELFecFin = localUtil.ctod( httpContext.cgiGet( edtTELFecFin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n6519TELFecFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtTELHorFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TELHORFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELHorFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
            n6520TELHorFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6520TELHorFin = localUtil.ctot( httpContext.cgiGet( edtTELHorFin_Internalname)) ;
            n6520TELHorFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A6521TELRes1 = httpContext.cgiGet( edtTELRes1_Internalname) ;
         n6521TELRes1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6521TELRes1", A6521TELRes1);
         A6522TeLRes2 = httpContext.cgiGet( edtTeLRes2_Internalname) ;
         n6522TeLRes2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6522TeLRes2", A6522TeLRes2);
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
            A6491TELId = GXutil.lval( httpContext.GetPar( "TELId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
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
            initAll1GS1623( ) ;
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
      disableAttributes1GS1623( ) ;
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

   public void confirm_1GS0( )
   {
      beforeValidate1GS1623( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GS1623( ) ;
         }
         else
         {
            checkExtendedTable1GS1623( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1GS1623( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GS0( ) ;
      }
   }

   public void resetCaption1GS0( )
   {
   }

   public void zm1GS1623( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6492TELTarea = T01GS3_A6492TELTarea[0] ;
            Z6493TELMic = T01GS3_A6493TELMic[0] ;
            Z6494TELMaqCod = T01GS3_A6494TELMaqCod[0] ;
            Z6495TELPartida = T01GS3_A6495TELPartida[0] ;
            Z6524TELPartidC = T01GS3_A6524TELPartidC[0] ;
            Z6496TELBarCod = T01GS3_A6496TELBarCod[0] ;
            Z6497TELBarReo = T01GS3_A6497TELBarReo[0] ;
            Z6498TELBarPar = T01GS3_A6498TELBarPar[0] ;
            Z6499TELFecIni = T01GS3_A6499TELFecIni[0] ;
            Z6500TELHorIni = T01GS3_A6500TELHorIni[0] ;
            Z6501TELKgs = T01GS3_A6501TELKgs[0] ;
            Z6502TELPrg1 = T01GS3_A6502TELPrg1[0] ;
            Z6503TELPrg2 = T01GS3_A6503TELPrg2[0] ;
            Z6504TELPrg3 = T01GS3_A6504TELPrg3[0] ;
            Z6505TELPrg4 = T01GS3_A6505TELPrg4[0] ;
            Z6506TELPrg5 = T01GS3_A6506TELPrg5[0] ;
            Z6507TELTpStd = T01GS3_A6507TELTpStd[0] ;
            Z6508TELCOLib1 = T01GS3_A6508TELCOLib1[0] ;
            Z6509TELCoLib2 = T01GS3_A6509TELCoLib2[0] ;
            Z6510TELCoLib3 = T01GS3_A6510TELCoLib3[0] ;
            Z6511TELDsLib1 = T01GS3_A6511TELDsLib1[0] ;
            Z6512TELDsLib2 = T01GS3_A6512TELDsLib2[0] ;
            Z6513TELDsLib3 = T01GS3_A6513TELDsLib3[0] ;
            Z6514TELNota1 = T01GS3_A6514TELNota1[0] ;
            Z6515TELNota2 = T01GS3_A6515TELNota2[0] ;
            Z6516TELPRdto = T01GS3_A6516TELPRdto[0] ;
            Z6517TELTpEf = T01GS3_A6517TELTpEf[0] ;
            Z6518TELTpTo = T01GS3_A6518TELTpTo[0] ;
            Z6519TELFecFin = T01GS3_A6519TELFecFin[0] ;
            Z6520TELHorFin = T01GS3_A6520TELHorFin[0] ;
            Z6521TELRes1 = T01GS3_A6521TELRes1[0] ;
            Z6522TeLRes2 = T01GS3_A6522TeLRes2[0] ;
         }
         else
         {
            Z6492TELTarea = A6492TELTarea ;
            Z6493TELMic = A6493TELMic ;
            Z6494TELMaqCod = A6494TELMaqCod ;
            Z6495TELPartida = A6495TELPartida ;
            Z6524TELPartidC = A6524TELPartidC ;
            Z6496TELBarCod = A6496TELBarCod ;
            Z6497TELBarReo = A6497TELBarReo ;
            Z6498TELBarPar = A6498TELBarPar ;
            Z6499TELFecIni = A6499TELFecIni ;
            Z6500TELHorIni = A6500TELHorIni ;
            Z6501TELKgs = A6501TELKgs ;
            Z6502TELPrg1 = A6502TELPrg1 ;
            Z6503TELPrg2 = A6503TELPrg2 ;
            Z6504TELPrg3 = A6504TELPrg3 ;
            Z6505TELPrg4 = A6505TELPrg4 ;
            Z6506TELPrg5 = A6506TELPrg5 ;
            Z6507TELTpStd = A6507TELTpStd ;
            Z6508TELCOLib1 = A6508TELCOLib1 ;
            Z6509TELCoLib2 = A6509TELCoLib2 ;
            Z6510TELCoLib3 = A6510TELCoLib3 ;
            Z6511TELDsLib1 = A6511TELDsLib1 ;
            Z6512TELDsLib2 = A6512TELDsLib2 ;
            Z6513TELDsLib3 = A6513TELDsLib3 ;
            Z6514TELNota1 = A6514TELNota1 ;
            Z6515TELNota2 = A6515TELNota2 ;
            Z6516TELPRdto = A6516TELPRdto ;
            Z6517TELTpEf = A6517TELTpEf ;
            Z6518TELTpTo = A6518TELTpTo ;
            Z6519TELFecFin = A6519TELFecFin ;
            Z6520TELHorFin = A6520TELHorFin ;
            Z6521TELRes1 = A6521TELRes1 ;
            Z6522TeLRes2 = A6522TeLRes2 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6491TELId = A6491TELId ;
         Z6492TELTarea = A6492TELTarea ;
         Z6493TELMic = A6493TELMic ;
         Z6494TELMaqCod = A6494TELMaqCod ;
         Z6495TELPartida = A6495TELPartida ;
         Z6524TELPartidC = A6524TELPartidC ;
         Z6496TELBarCod = A6496TELBarCod ;
         Z6497TELBarReo = A6497TELBarReo ;
         Z6498TELBarPar = A6498TELBarPar ;
         Z6499TELFecIni = A6499TELFecIni ;
         Z6500TELHorIni = A6500TELHorIni ;
         Z6501TELKgs = A6501TELKgs ;
         Z6502TELPrg1 = A6502TELPrg1 ;
         Z6503TELPrg2 = A6503TELPrg2 ;
         Z6504TELPrg3 = A6504TELPrg3 ;
         Z6505TELPrg4 = A6505TELPrg4 ;
         Z6506TELPrg5 = A6506TELPrg5 ;
         Z6507TELTpStd = A6507TELTpStd ;
         Z6508TELCOLib1 = A6508TELCOLib1 ;
         Z6509TELCoLib2 = A6509TELCoLib2 ;
         Z6510TELCoLib3 = A6510TELCoLib3 ;
         Z6511TELDsLib1 = A6511TELDsLib1 ;
         Z6512TELDsLib2 = A6512TELDsLib2 ;
         Z6513TELDsLib3 = A6513TELDsLib3 ;
         Z6514TELNota1 = A6514TELNota1 ;
         Z6515TELNota2 = A6515TELNota2 ;
         Z6516TELPRdto = A6516TELPRdto ;
         Z6517TELTpEf = A6517TELTpEf ;
         Z6518TELTpTo = A6518TELTpTo ;
         Z6519TELFecFin = A6519TELFecFin ;
         Z6520TELHorFin = A6520TELHorFin ;
         Z6521TELRes1 = A6521TELRes1 ;
         Z6522TeLRes2 = A6522TeLRes2 ;
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

   public void load1GS1623( )
   {
      /* Using cursor T01GS4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A6491TELId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1623 = (short)(1) ;
         A6492TELTarea = T01GS4_A6492TELTarea[0] ;
         n6492TELTarea = T01GS4_n6492TELTarea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6492TELTarea", A6492TELTarea);
         A6493TELMic = T01GS4_A6493TELMic[0] ;
         n6493TELMic = T01GS4_n6493TELMic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6493TELMic), 2, 0));
         A6494TELMaqCod = T01GS4_A6494TELMaqCod[0] ;
         n6494TELMaqCod = T01GS4_n6494TELMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6494TELMaqCod", A6494TELMaqCod);
         A6495TELPartida = T01GS4_A6495TELPartida[0] ;
         n6495TELPartida = T01GS4_n6495TELPartida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6495TELPartida), 12, 0));
         A6524TELPartidC = T01GS4_A6524TELPartidC[0] ;
         n6524TELPartidC = T01GS4_n6524TELPartidC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6524TELPartidC", A6524TELPartidC);
         A6496TELBarCod = T01GS4_A6496TELBarCod[0] ;
         n6496TELBarCod = T01GS4_n6496TELBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6496TELBarCod), 8, 0));
         A6497TELBarReo = T01GS4_A6497TELBarReo[0] ;
         n6497TELBarReo = T01GS4_n6497TELBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.str( A6497TELBarReo, 1, 0));
         A6498TELBarPar = T01GS4_A6498TELBarPar[0] ;
         n6498TELBarPar = T01GS4_n6498TELBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6498TELBarPar", A6498TELBarPar);
         A6499TELFecIni = T01GS4_A6499TELFecIni[0] ;
         n6499TELFecIni = T01GS4_n6499TELFecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
         A6500TELHorIni = T01GS4_A6500TELHorIni[0] ;
         n6500TELHorIni = T01GS4_n6500TELHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6501TELKgs = T01GS4_A6501TELKgs[0] ;
         n6501TELKgs = T01GS4_n6501TELKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrimstr( A6501TELKgs, 9, 2));
         A6502TELPrg1 = T01GS4_A6502TELPrg1[0] ;
         n6502TELPrg1 = T01GS4_n6502TELPrg1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6502TELPrg1), 3, 0));
         A6503TELPrg2 = T01GS4_A6503TELPrg2[0] ;
         n6503TELPrg2 = T01GS4_n6503TELPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6503TELPrg2), 3, 0));
         A6504TELPrg3 = T01GS4_A6504TELPrg3[0] ;
         n6504TELPrg3 = T01GS4_n6504TELPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6504TELPrg3), 3, 0));
         A6505TELPrg4 = T01GS4_A6505TELPrg4[0] ;
         n6505TELPrg4 = T01GS4_n6505TELPrg4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6505TELPrg4), 3, 0));
         A6506TELPrg5 = T01GS4_A6506TELPrg5[0] ;
         n6506TELPrg5 = T01GS4_n6506TELPrg5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6506TELPrg5), 3, 0));
         A6507TELTpStd = T01GS4_A6507TELTpStd[0] ;
         n6507TELTpStd = T01GS4_n6507TELTpStd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6507TELTpStd), 3, 0));
         A6508TELCOLib1 = T01GS4_A6508TELCOLib1[0] ;
         n6508TELCOLib1 = T01GS4_n6508TELCOLib1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6508TELCOLib1", A6508TELCOLib1);
         A6509TELCoLib2 = T01GS4_A6509TELCoLib2[0] ;
         n6509TELCoLib2 = T01GS4_n6509TELCoLib2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6509TELCoLib2", A6509TELCoLib2);
         A6510TELCoLib3 = T01GS4_A6510TELCoLib3[0] ;
         n6510TELCoLib3 = T01GS4_n6510TELCoLib3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6510TELCoLib3", A6510TELCoLib3);
         A6511TELDsLib1 = T01GS4_A6511TELDsLib1[0] ;
         n6511TELDsLib1 = T01GS4_n6511TELDsLib1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6511TELDsLib1", A6511TELDsLib1);
         A6512TELDsLib2 = T01GS4_A6512TELDsLib2[0] ;
         n6512TELDsLib2 = T01GS4_n6512TELDsLib2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6512TELDsLib2", A6512TELDsLib2);
         A6513TELDsLib3 = T01GS4_A6513TELDsLib3[0] ;
         n6513TELDsLib3 = T01GS4_n6513TELDsLib3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6513TELDsLib3", A6513TELDsLib3);
         A6514TELNota1 = T01GS4_A6514TELNota1[0] ;
         n6514TELNota1 = T01GS4_n6514TELNota1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6514TELNota1", A6514TELNota1);
         A6515TELNota2 = T01GS4_A6515TELNota2[0] ;
         n6515TELNota2 = T01GS4_n6515TELNota2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6515TELNota2", A6515TELNota2);
         A6516TELPRdto = T01GS4_A6516TELPRdto[0] ;
         n6516TELPRdto = T01GS4_n6516TELPRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrimstr( A6516TELPRdto, 6, 1));
         A6517TELTpEf = T01GS4_A6517TELTpEf[0] ;
         n6517TELTpEf = T01GS4_n6517TELTpEf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6517TELTpEf), 5, 0));
         A6518TELTpTo = T01GS4_A6518TELTpTo[0] ;
         n6518TELTpTo = T01GS4_n6518TELTpTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6518TELTpTo), 5, 0));
         A6519TELFecFin = T01GS4_A6519TELFecFin[0] ;
         n6519TELFecFin = T01GS4_n6519TELFecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
         A6520TELHorFin = T01GS4_A6520TELHorFin[0] ;
         n6520TELHorFin = T01GS4_n6520TELHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6521TELRes1 = T01GS4_A6521TELRes1[0] ;
         n6521TELRes1 = T01GS4_n6521TELRes1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6521TELRes1", A6521TELRes1);
         A6522TeLRes2 = T01GS4_A6522TeLRes2[0] ;
         n6522TeLRes2 = T01GS4_n6522TeLRes2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6522TeLRes2", A6522TeLRes2);
         zm1GS1623( -1) ;
      }
      pr_default.close(2);
      onLoadActions1GS1623( ) ;
   }

   public void onLoadActions1GS1623( )
   {
   }

   public void checkExtendedTable1GS1623( )
   {
      nIsDirty_1623 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1GS1623( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1GS1623( )
   {
      /* Using cursor T01GS5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A6491TELId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1623 = (short)(1) ;
      }
      else
      {
         RcdFound1623 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GS3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A6491TELId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GS1623( 1) ;
         RcdFound1623 = (short)(1) ;
         A6491TELId = T01GS3_A6491TELId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
         A6492TELTarea = T01GS3_A6492TELTarea[0] ;
         n6492TELTarea = T01GS3_n6492TELTarea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6492TELTarea", A6492TELTarea);
         A6493TELMic = T01GS3_A6493TELMic[0] ;
         n6493TELMic = T01GS3_n6493TELMic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6493TELMic), 2, 0));
         A6494TELMaqCod = T01GS3_A6494TELMaqCod[0] ;
         n6494TELMaqCod = T01GS3_n6494TELMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6494TELMaqCod", A6494TELMaqCod);
         A6495TELPartida = T01GS3_A6495TELPartida[0] ;
         n6495TELPartida = T01GS3_n6495TELPartida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6495TELPartida), 12, 0));
         A6524TELPartidC = T01GS3_A6524TELPartidC[0] ;
         n6524TELPartidC = T01GS3_n6524TELPartidC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6524TELPartidC", A6524TELPartidC);
         A6496TELBarCod = T01GS3_A6496TELBarCod[0] ;
         n6496TELBarCod = T01GS3_n6496TELBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6496TELBarCod), 8, 0));
         A6497TELBarReo = T01GS3_A6497TELBarReo[0] ;
         n6497TELBarReo = T01GS3_n6497TELBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.str( A6497TELBarReo, 1, 0));
         A6498TELBarPar = T01GS3_A6498TELBarPar[0] ;
         n6498TELBarPar = T01GS3_n6498TELBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6498TELBarPar", A6498TELBarPar);
         A6499TELFecIni = T01GS3_A6499TELFecIni[0] ;
         n6499TELFecIni = T01GS3_n6499TELFecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
         A6500TELHorIni = T01GS3_A6500TELHorIni[0] ;
         n6500TELHorIni = T01GS3_n6500TELHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6501TELKgs = T01GS3_A6501TELKgs[0] ;
         n6501TELKgs = T01GS3_n6501TELKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrimstr( A6501TELKgs, 9, 2));
         A6502TELPrg1 = T01GS3_A6502TELPrg1[0] ;
         n6502TELPrg1 = T01GS3_n6502TELPrg1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6502TELPrg1), 3, 0));
         A6503TELPrg2 = T01GS3_A6503TELPrg2[0] ;
         n6503TELPrg2 = T01GS3_n6503TELPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6503TELPrg2), 3, 0));
         A6504TELPrg3 = T01GS3_A6504TELPrg3[0] ;
         n6504TELPrg3 = T01GS3_n6504TELPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6504TELPrg3), 3, 0));
         A6505TELPrg4 = T01GS3_A6505TELPrg4[0] ;
         n6505TELPrg4 = T01GS3_n6505TELPrg4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6505TELPrg4), 3, 0));
         A6506TELPrg5 = T01GS3_A6506TELPrg5[0] ;
         n6506TELPrg5 = T01GS3_n6506TELPrg5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6506TELPrg5), 3, 0));
         A6507TELTpStd = T01GS3_A6507TELTpStd[0] ;
         n6507TELTpStd = T01GS3_n6507TELTpStd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6507TELTpStd), 3, 0));
         A6508TELCOLib1 = T01GS3_A6508TELCOLib1[0] ;
         n6508TELCOLib1 = T01GS3_n6508TELCOLib1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6508TELCOLib1", A6508TELCOLib1);
         A6509TELCoLib2 = T01GS3_A6509TELCoLib2[0] ;
         n6509TELCoLib2 = T01GS3_n6509TELCoLib2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6509TELCoLib2", A6509TELCoLib2);
         A6510TELCoLib3 = T01GS3_A6510TELCoLib3[0] ;
         n6510TELCoLib3 = T01GS3_n6510TELCoLib3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6510TELCoLib3", A6510TELCoLib3);
         A6511TELDsLib1 = T01GS3_A6511TELDsLib1[0] ;
         n6511TELDsLib1 = T01GS3_n6511TELDsLib1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6511TELDsLib1", A6511TELDsLib1);
         A6512TELDsLib2 = T01GS3_A6512TELDsLib2[0] ;
         n6512TELDsLib2 = T01GS3_n6512TELDsLib2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6512TELDsLib2", A6512TELDsLib2);
         A6513TELDsLib3 = T01GS3_A6513TELDsLib3[0] ;
         n6513TELDsLib3 = T01GS3_n6513TELDsLib3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6513TELDsLib3", A6513TELDsLib3);
         A6514TELNota1 = T01GS3_A6514TELNota1[0] ;
         n6514TELNota1 = T01GS3_n6514TELNota1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6514TELNota1", A6514TELNota1);
         A6515TELNota2 = T01GS3_A6515TELNota2[0] ;
         n6515TELNota2 = T01GS3_n6515TELNota2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6515TELNota2", A6515TELNota2);
         A6516TELPRdto = T01GS3_A6516TELPRdto[0] ;
         n6516TELPRdto = T01GS3_n6516TELPRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrimstr( A6516TELPRdto, 6, 1));
         A6517TELTpEf = T01GS3_A6517TELTpEf[0] ;
         n6517TELTpEf = T01GS3_n6517TELTpEf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6517TELTpEf), 5, 0));
         A6518TELTpTo = T01GS3_A6518TELTpTo[0] ;
         n6518TELTpTo = T01GS3_n6518TELTpTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6518TELTpTo), 5, 0));
         A6519TELFecFin = T01GS3_A6519TELFecFin[0] ;
         n6519TELFecFin = T01GS3_n6519TELFecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
         A6520TELHorFin = T01GS3_A6520TELHorFin[0] ;
         n6520TELHorFin = T01GS3_n6520TELHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6521TELRes1 = T01GS3_A6521TELRes1[0] ;
         n6521TELRes1 = T01GS3_n6521TELRes1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6521TELRes1", A6521TELRes1);
         A6522TeLRes2 = T01GS3_A6522TeLRes2[0] ;
         n6522TeLRes2 = T01GS3_n6522TeLRes2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6522TeLRes2", A6522TeLRes2);
         Z6491TELId = A6491TELId ;
         sMode1623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GS1623( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1623 = (short)(0) ;
            initializeNonKey1GS1623( ) ;
         }
         Gx_mode = sMode1623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1623 = (short)(0) ;
         initializeNonKey1GS1623( ) ;
         sMode1623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GS1623( ) ;
      if ( RcdFound1623 == 0 )
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
      RcdFound1623 = (short)(0) ;
      /* Using cursor T01GS6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A6491TELId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01GS6_A6491TELId[0] < A6491TELId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01GS6_A6491TELId[0] > A6491TELId ) ) )
         {
            A6491TELId = T01GS6_A6491TELId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
            RcdFound1623 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1623 = (short)(0) ;
      /* Using cursor T01GS7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A6491TELId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01GS7_A6491TELId[0] > A6491TELId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01GS7_A6491TELId[0] < A6491TELId ) ) )
         {
            A6491TELId = T01GS7_A6491TELId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
            RcdFound1623 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GS1623( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTELId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GS1623( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1623 == 1 )
         {
            if ( A6491TELId != Z6491TELId )
            {
               A6491TELId = Z6491TELId ;
               httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TELID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTELId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTELId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1GS1623( ) ;
               GX_FocusControl = edtTELId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A6491TELId != Z6491TELId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTELId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GS1623( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TELID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTELId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTELId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GS1623( ) ;
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
      if ( A6491TELId != Z6491TELId )
      {
         A6491TELId = Z6491TELId ;
         httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TELID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTELId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTELId_Internalname ;
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
      getKey1GS1623( ) ;
      if ( RcdFound1623 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TELID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A6491TELId != Z6491TELId )
         {
            A6491TELId = Z6491TELId ;
            httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TELID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTELId_Internalname ;
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
         if ( A6491TELId != Z6491TELId )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TELID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTELId_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlavora");
      GX_FocusControl = edtTELTarea_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GS0( ) ;
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
      if ( RcdFound1623 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TELID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTELId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTELTarea_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GS1623( ) ;
      if ( RcdFound1623 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTELTarea_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GS1623( ) ;
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
      if ( RcdFound1623 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTELTarea_Internalname ;
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
      if ( RcdFound1623 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTELTarea_Internalname ;
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
      scanStart1GS1623( ) ;
      if ( RcdFound1623 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1623 != 0 )
         {
            scanNext1GS1623( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTELTarea_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GS1623( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GS1623( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GS2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A6491TELId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLAVORA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6492TELTarea, T01GS2_A6492TELTarea[0]) != 0 ) || ( Z6493TELMic != T01GS2_A6493TELMic[0] ) || ( GXutil.strcmp(Z6494TELMaqCod, T01GS2_A6494TELMaqCod[0]) != 0 ) || ( Z6495TELPartida != T01GS2_A6495TELPartida[0] ) || ( GXutil.strcmp(Z6524TELPartidC, T01GS2_A6524TELPartidC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6496TELBarCod != T01GS2_A6496TELBarCod[0] ) || ( Z6497TELBarReo != T01GS2_A6497TELBarReo[0] ) || ( GXutil.strcmp(Z6498TELBarPar, T01GS2_A6498TELBarPar[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6499TELFecIni), GXutil.resetTime(T01GS2_A6499TELFecIni[0])) ) || !( GXutil.dateCompare(Z6500TELHorIni, T01GS2_A6500TELHorIni[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6501TELKgs, T01GS2_A6501TELKgs[0]) != 0 ) || ( Z6502TELPrg1 != T01GS2_A6502TELPrg1[0] ) || ( Z6503TELPrg2 != T01GS2_A6503TELPrg2[0] ) || ( Z6504TELPrg3 != T01GS2_A6504TELPrg3[0] ) || ( Z6505TELPrg4 != T01GS2_A6505TELPrg4[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6506TELPrg5 != T01GS2_A6506TELPrg5[0] ) || ( Z6507TELTpStd != T01GS2_A6507TELTpStd[0] ) || ( GXutil.strcmp(Z6508TELCOLib1, T01GS2_A6508TELCOLib1[0]) != 0 ) || ( GXutil.strcmp(Z6509TELCoLib2, T01GS2_A6509TELCoLib2[0]) != 0 ) || ( GXutil.strcmp(Z6510TELCoLib3, T01GS2_A6510TELCoLib3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6511TELDsLib1, T01GS2_A6511TELDsLib1[0]) != 0 ) || ( GXutil.strcmp(Z6512TELDsLib2, T01GS2_A6512TELDsLib2[0]) != 0 ) || ( GXutil.strcmp(Z6513TELDsLib3, T01GS2_A6513TELDsLib3[0]) != 0 ) || ( GXutil.strcmp(Z6514TELNota1, T01GS2_A6514TELNota1[0]) != 0 ) || ( GXutil.strcmp(Z6515TELNota2, T01GS2_A6515TELNota2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6516TELPRdto, T01GS2_A6516TELPRdto[0]) != 0 ) || ( Z6517TELTpEf != T01GS2_A6517TELTpEf[0] ) || ( Z6518TELTpTo != T01GS2_A6518TELTpTo[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z6519TELFecFin), GXutil.resetTime(T01GS2_A6519TELFecFin[0])) ) || !( GXutil.dateCompare(Z6520TELHorFin, T01GS2_A6520TELHorFin[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6521TELRes1, T01GS2_A6521TELRes1[0]) != 0 ) || ( GXutil.strcmp(Z6522TeLRes2, T01GS2_A6522TeLRes2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6492TELTarea, T01GS2_A6492TELTarea[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELTarea");
               GXutil.writeLogRaw("Old: ",Z6492TELTarea);
               GXutil.writeLogRaw("Current: ",T01GS2_A6492TELTarea[0]);
            }
            if ( Z6493TELMic != T01GS2_A6493TELMic[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELMic");
               GXutil.writeLogRaw("Old: ",Z6493TELMic);
               GXutil.writeLogRaw("Current: ",T01GS2_A6493TELMic[0]);
            }
            if ( GXutil.strcmp(Z6494TELMaqCod, T01GS2_A6494TELMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELMaqCod");
               GXutil.writeLogRaw("Old: ",Z6494TELMaqCod);
               GXutil.writeLogRaw("Current: ",T01GS2_A6494TELMaqCod[0]);
            }
            if ( Z6495TELPartida != T01GS2_A6495TELPartida[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPartida");
               GXutil.writeLogRaw("Old: ",Z6495TELPartida);
               GXutil.writeLogRaw("Current: ",T01GS2_A6495TELPartida[0]);
            }
            if ( GXutil.strcmp(Z6524TELPartidC, T01GS2_A6524TELPartidC[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPartidC");
               GXutil.writeLogRaw("Old: ",Z6524TELPartidC);
               GXutil.writeLogRaw("Current: ",T01GS2_A6524TELPartidC[0]);
            }
            if ( Z6496TELBarCod != T01GS2_A6496TELBarCod[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELBarCod");
               GXutil.writeLogRaw("Old: ",Z6496TELBarCod);
               GXutil.writeLogRaw("Current: ",T01GS2_A6496TELBarCod[0]);
            }
            if ( Z6497TELBarReo != T01GS2_A6497TELBarReo[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELBarReo");
               GXutil.writeLogRaw("Old: ",Z6497TELBarReo);
               GXutil.writeLogRaw("Current: ",T01GS2_A6497TELBarReo[0]);
            }
            if ( GXutil.strcmp(Z6498TELBarPar, T01GS2_A6498TELBarPar[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELBarPar");
               GXutil.writeLogRaw("Old: ",Z6498TELBarPar);
               GXutil.writeLogRaw("Current: ",T01GS2_A6498TELBarPar[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6499TELFecIni), GXutil.resetTime(T01GS2_A6499TELFecIni[0])) ) )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELFecIni");
               GXutil.writeLogRaw("Old: ",Z6499TELFecIni);
               GXutil.writeLogRaw("Current: ",T01GS2_A6499TELFecIni[0]);
            }
            if ( !( GXutil.dateCompare(Z6500TELHorIni, T01GS2_A6500TELHorIni[0]) ) )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELHorIni");
               GXutil.writeLogRaw("Old: ",Z6500TELHorIni);
               GXutil.writeLogRaw("Current: ",T01GS2_A6500TELHorIni[0]);
            }
            if ( DecimalUtil.compareTo(Z6501TELKgs, T01GS2_A6501TELKgs[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELKgs");
               GXutil.writeLogRaw("Old: ",Z6501TELKgs);
               GXutil.writeLogRaw("Current: ",T01GS2_A6501TELKgs[0]);
            }
            if ( Z6502TELPrg1 != T01GS2_A6502TELPrg1[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPrg1");
               GXutil.writeLogRaw("Old: ",Z6502TELPrg1);
               GXutil.writeLogRaw("Current: ",T01GS2_A6502TELPrg1[0]);
            }
            if ( Z6503TELPrg2 != T01GS2_A6503TELPrg2[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPrg2");
               GXutil.writeLogRaw("Old: ",Z6503TELPrg2);
               GXutil.writeLogRaw("Current: ",T01GS2_A6503TELPrg2[0]);
            }
            if ( Z6504TELPrg3 != T01GS2_A6504TELPrg3[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPrg3");
               GXutil.writeLogRaw("Old: ",Z6504TELPrg3);
               GXutil.writeLogRaw("Current: ",T01GS2_A6504TELPrg3[0]);
            }
            if ( Z6505TELPrg4 != T01GS2_A6505TELPrg4[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPrg4");
               GXutil.writeLogRaw("Old: ",Z6505TELPrg4);
               GXutil.writeLogRaw("Current: ",T01GS2_A6505TELPrg4[0]);
            }
            if ( Z6506TELPrg5 != T01GS2_A6506TELPrg5[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPrg5");
               GXutil.writeLogRaw("Old: ",Z6506TELPrg5);
               GXutil.writeLogRaw("Current: ",T01GS2_A6506TELPrg5[0]);
            }
            if ( Z6507TELTpStd != T01GS2_A6507TELTpStd[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELTpStd");
               GXutil.writeLogRaw("Old: ",Z6507TELTpStd);
               GXutil.writeLogRaw("Current: ",T01GS2_A6507TELTpStd[0]);
            }
            if ( GXutil.strcmp(Z6508TELCOLib1, T01GS2_A6508TELCOLib1[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELCOLib1");
               GXutil.writeLogRaw("Old: ",Z6508TELCOLib1);
               GXutil.writeLogRaw("Current: ",T01GS2_A6508TELCOLib1[0]);
            }
            if ( GXutil.strcmp(Z6509TELCoLib2, T01GS2_A6509TELCoLib2[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELCoLib2");
               GXutil.writeLogRaw("Old: ",Z6509TELCoLib2);
               GXutil.writeLogRaw("Current: ",T01GS2_A6509TELCoLib2[0]);
            }
            if ( GXutil.strcmp(Z6510TELCoLib3, T01GS2_A6510TELCoLib3[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELCoLib3");
               GXutil.writeLogRaw("Old: ",Z6510TELCoLib3);
               GXutil.writeLogRaw("Current: ",T01GS2_A6510TELCoLib3[0]);
            }
            if ( GXutil.strcmp(Z6511TELDsLib1, T01GS2_A6511TELDsLib1[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELDsLib1");
               GXutil.writeLogRaw("Old: ",Z6511TELDsLib1);
               GXutil.writeLogRaw("Current: ",T01GS2_A6511TELDsLib1[0]);
            }
            if ( GXutil.strcmp(Z6512TELDsLib2, T01GS2_A6512TELDsLib2[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELDsLib2");
               GXutil.writeLogRaw("Old: ",Z6512TELDsLib2);
               GXutil.writeLogRaw("Current: ",T01GS2_A6512TELDsLib2[0]);
            }
            if ( GXutil.strcmp(Z6513TELDsLib3, T01GS2_A6513TELDsLib3[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELDsLib3");
               GXutil.writeLogRaw("Old: ",Z6513TELDsLib3);
               GXutil.writeLogRaw("Current: ",T01GS2_A6513TELDsLib3[0]);
            }
            if ( GXutil.strcmp(Z6514TELNota1, T01GS2_A6514TELNota1[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELNota1");
               GXutil.writeLogRaw("Old: ",Z6514TELNota1);
               GXutil.writeLogRaw("Current: ",T01GS2_A6514TELNota1[0]);
            }
            if ( GXutil.strcmp(Z6515TELNota2, T01GS2_A6515TELNota2[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELNota2");
               GXutil.writeLogRaw("Old: ",Z6515TELNota2);
               GXutil.writeLogRaw("Current: ",T01GS2_A6515TELNota2[0]);
            }
            if ( DecimalUtil.compareTo(Z6516TELPRdto, T01GS2_A6516TELPRdto[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELPRdto");
               GXutil.writeLogRaw("Old: ",Z6516TELPRdto);
               GXutil.writeLogRaw("Current: ",T01GS2_A6516TELPRdto[0]);
            }
            if ( Z6517TELTpEf != T01GS2_A6517TELTpEf[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELTpEf");
               GXutil.writeLogRaw("Old: ",Z6517TELTpEf);
               GXutil.writeLogRaw("Current: ",T01GS2_A6517TELTpEf[0]);
            }
            if ( Z6518TELTpTo != T01GS2_A6518TELTpTo[0] )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELTpTo");
               GXutil.writeLogRaw("Old: ",Z6518TELTpTo);
               GXutil.writeLogRaw("Current: ",T01GS2_A6518TELTpTo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6519TELFecFin), GXutil.resetTime(T01GS2_A6519TELFecFin[0])) ) )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELFecFin");
               GXutil.writeLogRaw("Old: ",Z6519TELFecFin);
               GXutil.writeLogRaw("Current: ",T01GS2_A6519TELFecFin[0]);
            }
            if ( !( GXutil.dateCompare(Z6520TELHorFin, T01GS2_A6520TELHorFin[0]) ) )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELHorFin");
               GXutil.writeLogRaw("Old: ",Z6520TELHorFin);
               GXutil.writeLogRaw("Current: ",T01GS2_A6520TELHorFin[0]);
            }
            if ( GXutil.strcmp(Z6521TELRes1, T01GS2_A6521TELRes1[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TELRes1");
               GXutil.writeLogRaw("Old: ",Z6521TELRes1);
               GXutil.writeLogRaw("Current: ",T01GS2_A6521TELRes1[0]);
            }
            if ( GXutil.strcmp(Z6522TeLRes2, T01GS2_A6522TeLRes2[0]) != 0 )
            {
               GXutil.writeLogln("tlavora:[seudo value changed for attri]"+"TeLRes2");
               GXutil.writeLogRaw("Old: ",Z6522TeLRes2);
               GXutil.writeLogRaw("Current: ",T01GS2_A6522TeLRes2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLAVORA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GS1623( )
   {
      beforeValidate1GS1623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GS1623( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GS1623( 0) ;
         checkOptimisticConcurrency1GS1623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GS1623( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GS1623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GS8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A6491TELId), Boolean.valueOf(n6492TELTarea), A6492TELTarea, Boolean.valueOf(n6493TELMic), Byte.valueOf(A6493TELMic), Boolean.valueOf(n6494TELMaqCod), A6494TELMaqCod, Boolean.valueOf(n6495TELPartida), Long.valueOf(A6495TELPartida), Boolean.valueOf(n6524TELPartidC), A6524TELPartidC, Boolean.valueOf(n6496TELBarCod), Integer.valueOf(A6496TELBarCod), Boolean.valueOf(n6497TELBarReo), Byte.valueOf(A6497TELBarReo), Boolean.valueOf(n6498TELBarPar), A6498TELBarPar, Boolean.valueOf(n6499TELFecIni), A6499TELFecIni, Boolean.valueOf(n6500TELHorIni), A6500TELHorIni, Boolean.valueOf(n6501TELKgs), A6501TELKgs, Boolean.valueOf(n6502TELPrg1), Short.valueOf(A6502TELPrg1), Boolean.valueOf(n6503TELPrg2), Short.valueOf(A6503TELPrg2), Boolean.valueOf(n6504TELPrg3), Short.valueOf(A6504TELPrg3), Boolean.valueOf(n6505TELPrg4), Short.valueOf(A6505TELPrg4), Boolean.valueOf(n6506TELPrg5), Short.valueOf(A6506TELPrg5), Boolean.valueOf(n6507TELTpStd), Short.valueOf(A6507TELTpStd), Boolean.valueOf(n6508TELCOLib1), A6508TELCOLib1, Boolean.valueOf(n6509TELCoLib2), A6509TELCoLib2, Boolean.valueOf(n6510TELCoLib3), A6510TELCoLib3, Boolean.valueOf(n6511TELDsLib1), A6511TELDsLib1, Boolean.valueOf(n6512TELDsLib2), A6512TELDsLib2, Boolean.valueOf(n6513TELDsLib3), A6513TELDsLib3, Boolean.valueOf(n6514TELNota1), A6514TELNota1, Boolean.valueOf(n6515TELNota2), A6515TELNota2, Boolean.valueOf(n6516TELPRdto), A6516TELPRdto, Boolean.valueOf(n6517TELTpEf), Integer.valueOf(A6517TELTpEf), Boolean.valueOf(n6518TELTpTo), Integer.valueOf(A6518TELTpTo), Boolean.valueOf(n6519TELFecFin), A6519TELFecFin, Boolean.valueOf(n6520TELHorFin), A6520TELHorFin, Boolean.valueOf(n6521TELRes1), A6521TELRes1, Boolean.valueOf(n6522TeLRes2), A6522TeLRes2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLAVORA");
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
                        resetCaption1GS0( ) ;
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
            load1GS1623( ) ;
         }
         endLevel1GS1623( ) ;
      }
      closeExtendedTableCursors1GS1623( ) ;
   }

   public void update1GS1623( )
   {
      beforeValidate1GS1623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GS1623( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GS1623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GS1623( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GS1623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GS9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6492TELTarea), A6492TELTarea, Boolean.valueOf(n6493TELMic), Byte.valueOf(A6493TELMic), Boolean.valueOf(n6494TELMaqCod), A6494TELMaqCod, Boolean.valueOf(n6495TELPartida), Long.valueOf(A6495TELPartida), Boolean.valueOf(n6524TELPartidC), A6524TELPartidC, Boolean.valueOf(n6496TELBarCod), Integer.valueOf(A6496TELBarCod), Boolean.valueOf(n6497TELBarReo), Byte.valueOf(A6497TELBarReo), Boolean.valueOf(n6498TELBarPar), A6498TELBarPar, Boolean.valueOf(n6499TELFecIni), A6499TELFecIni, Boolean.valueOf(n6500TELHorIni), A6500TELHorIni, Boolean.valueOf(n6501TELKgs), A6501TELKgs, Boolean.valueOf(n6502TELPrg1), Short.valueOf(A6502TELPrg1), Boolean.valueOf(n6503TELPrg2), Short.valueOf(A6503TELPrg2), Boolean.valueOf(n6504TELPrg3), Short.valueOf(A6504TELPrg3), Boolean.valueOf(n6505TELPrg4), Short.valueOf(A6505TELPrg4), Boolean.valueOf(n6506TELPrg5), Short.valueOf(A6506TELPrg5), Boolean.valueOf(n6507TELTpStd), Short.valueOf(A6507TELTpStd), Boolean.valueOf(n6508TELCOLib1), A6508TELCOLib1, Boolean.valueOf(n6509TELCoLib2), A6509TELCoLib2, Boolean.valueOf(n6510TELCoLib3), A6510TELCoLib3, Boolean.valueOf(n6511TELDsLib1), A6511TELDsLib1, Boolean.valueOf(n6512TELDsLib2), A6512TELDsLib2, Boolean.valueOf(n6513TELDsLib3), A6513TELDsLib3, Boolean.valueOf(n6514TELNota1), A6514TELNota1, Boolean.valueOf(n6515TELNota2), A6515TELNota2, Boolean.valueOf(n6516TELPRdto), A6516TELPRdto, Boolean.valueOf(n6517TELTpEf), Integer.valueOf(A6517TELTpEf), Boolean.valueOf(n6518TELTpTo), Integer.valueOf(A6518TELTpTo), Boolean.valueOf(n6519TELFecFin), A6519TELFecFin, Boolean.valueOf(n6520TELHorFin), A6520TELHorFin, Boolean.valueOf(n6521TELRes1), A6521TELRes1, Boolean.valueOf(n6522TeLRes2), A6522TeLRes2, Long.valueOf(A6491TELId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLAVORA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLAVORA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GS1623( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GS0( ) ;
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
         endLevel1GS1623( ) ;
      }
      closeExtendedTableCursors1GS1623( ) ;
   }

   public void deferredUpdate1GS1623( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GS1623( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GS1623( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GS1623( ) ;
         afterConfirm1GS1623( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GS1623( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GS10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A6491TELId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLAVORA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1623 == 0 )
                     {
                        initAll1GS1623( ) ;
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
                     resetCaption1GS0( ) ;
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
      sMode1623 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GS1623( ) ;
      Gx_mode = sMode1623 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GS1623( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GS1623( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GS1623( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlavora");
         if ( AnyError == 0 )
         {
            confirmValues1GS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlavora");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GS1623( )
   {
      /* Using cursor T01GS11 */
      pr_default.execute(9);
      RcdFound1623 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1623 = (short)(1) ;
         A6491TELId = T01GS11_A6491TELId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GS1623( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1623 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1623 = (short)(1) ;
         A6491TELId = T01GS11_A6491TELId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
      }
   }

   public void scanEnd1GS1623( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1GS1623( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GS1623( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GS1623( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GS1623( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GS1623( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GS1623( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GS1623( )
   {
      edtTELId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELId_Enabled), 5, 0), true);
      edtTELTarea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELTarea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELTarea_Enabled), 5, 0), true);
      edtTELMic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELMic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELMic_Enabled), 5, 0), true);
      edtTELMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELMaqCod_Enabled), 5, 0), true);
      edtTELPartida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPartida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPartida_Enabled), 5, 0), true);
      edtTELPartidC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPartidC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPartidC_Enabled), 5, 0), true);
      edtTELBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELBarCod_Enabled), 5, 0), true);
      edtTELBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELBarReo_Enabled), 5, 0), true);
      edtTELBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELBarPar_Enabled), 5, 0), true);
      edtTELFecIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELFecIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELFecIni_Enabled), 5, 0), true);
      edtTELHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELHorIni_Enabled), 5, 0), true);
      edtTELKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELKgs_Enabled), 5, 0), true);
      edtTELPrg1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPrg1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPrg1_Enabled), 5, 0), true);
      edtTELPrg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPrg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPrg2_Enabled), 5, 0), true);
      edtTELPrg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPrg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPrg3_Enabled), 5, 0), true);
      edtTELPrg4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPrg4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPrg4_Enabled), 5, 0), true);
      edtTELPrg5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPrg5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPrg5_Enabled), 5, 0), true);
      edtTELTpStd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELTpStd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELTpStd_Enabled), 5, 0), true);
      edtTELCOLib1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELCOLib1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELCOLib1_Enabled), 5, 0), true);
      edtTELCoLib2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELCoLib2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELCoLib2_Enabled), 5, 0), true);
      edtTELCoLib3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELCoLib3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELCoLib3_Enabled), 5, 0), true);
      edtTELDsLib1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELDsLib1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELDsLib1_Enabled), 5, 0), true);
      edtTELDsLib2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELDsLib2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELDsLib2_Enabled), 5, 0), true);
      edtTELDsLib3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELDsLib3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELDsLib3_Enabled), 5, 0), true);
      edtTELNota1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELNota1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELNota1_Enabled), 5, 0), true);
      edtTELNota2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELNota2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELNota2_Enabled), 5, 0), true);
      edtTELPRdto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELPRdto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELPRdto_Enabled), 5, 0), true);
      edtTELTpEf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELTpEf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELTpEf_Enabled), 5, 0), true);
      edtTELTpTo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELTpTo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELTpTo_Enabled), 5, 0), true);
      edtTELFecFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELFecFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELFecFin_Enabled), 5, 0), true);
      edtTELHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELHorFin_Enabled), 5, 0), true);
      edtTELRes1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTELRes1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTELRes1_Enabled), 5, 0), true);
      edtTeLRes2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTeLRes2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTeLRes2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GS1623( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GS0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlavora", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6491TELId", GXutil.ltrim( localUtil.ntoc( Z6491TELId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6492TELTarea", GXutil.rtrim( Z6492TELTarea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6493TELMic", GXutil.ltrim( localUtil.ntoc( Z6493TELMic, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6494TELMaqCod", GXutil.rtrim( Z6494TELMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6495TELPartida", GXutil.ltrim( localUtil.ntoc( Z6495TELPartida, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6524TELPartidC", GXutil.rtrim( Z6524TELPartidC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6496TELBarCod", GXutil.ltrim( localUtil.ntoc( Z6496TELBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6497TELBarReo", GXutil.ltrim( localUtil.ntoc( Z6497TELBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6498TELBarPar", GXutil.rtrim( Z6498TELBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6499TELFecIni", localUtil.dtoc( Z6499TELFecIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6500TELHorIni", localUtil.ttoc( Z6500TELHorIni, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6501TELKgs", GXutil.ltrim( localUtil.ntoc( Z6501TELKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6502TELPrg1", GXutil.ltrim( localUtil.ntoc( Z6502TELPrg1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6503TELPrg2", GXutil.ltrim( localUtil.ntoc( Z6503TELPrg2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6504TELPrg3", GXutil.ltrim( localUtil.ntoc( Z6504TELPrg3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6505TELPrg4", GXutil.ltrim( localUtil.ntoc( Z6505TELPrg4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6506TELPrg5", GXutil.ltrim( localUtil.ntoc( Z6506TELPrg5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6507TELTpStd", GXutil.ltrim( localUtil.ntoc( Z6507TELTpStd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6508TELCOLib1", GXutil.rtrim( Z6508TELCOLib1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6509TELCoLib2", GXutil.rtrim( Z6509TELCoLib2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6510TELCoLib3", GXutil.rtrim( Z6510TELCoLib3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6511TELDsLib1", GXutil.rtrim( Z6511TELDsLib1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6512TELDsLib2", GXutil.rtrim( Z6512TELDsLib2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6513TELDsLib3", GXutil.rtrim( Z6513TELDsLib3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6514TELNota1", GXutil.rtrim( Z6514TELNota1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6515TELNota2", GXutil.rtrim( Z6515TELNota2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6516TELPRdto", GXutil.ltrim( localUtil.ntoc( Z6516TELPRdto, (byte)(6), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6517TELTpEf", GXutil.ltrim( localUtil.ntoc( Z6517TELTpEf, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6518TELTpTo", GXutil.ltrim( localUtil.ntoc( Z6518TELTpTo, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6519TELFecFin", localUtil.dtoc( Z6519TELFecFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6520TELHorFin", localUtil.ttoc( Z6520TELHorFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6521TELRes1", GXutil.rtrim( Z6521TELRes1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6522TeLRes2", GXutil.rtrim( Z6522TeLRes2));
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
      return formatLink("app.tlavora", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLAVORA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla LAVORA de Termoeletrónic", "") ;
   }

   public void initializeNonKey1GS1623( )
   {
      A6492TELTarea = "" ;
      n6492TELTarea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6492TELTarea", A6492TELTarea);
      A6493TELMic = (byte)(0) ;
      n6493TELMic = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6493TELMic), 2, 0));
      A6494TELMaqCod = "" ;
      n6494TELMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6494TELMaqCod", A6494TELMaqCod);
      A6495TELPartida = 0 ;
      n6495TELPartida = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6495TELPartida), 12, 0));
      A6524TELPartidC = "" ;
      n6524TELPartidC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6524TELPartidC", A6524TELPartidC);
      A6496TELBarCod = 0 ;
      n6496TELBarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6496TELBarCod), 8, 0));
      A6497TELBarReo = (byte)(0) ;
      n6497TELBarReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.str( A6497TELBarReo, 1, 0));
      A6498TELBarPar = "" ;
      n6498TELBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6498TELBarPar", A6498TELBarPar);
      A6499TELFecIni = GXutil.nullDate() ;
      n6499TELFecIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
      A6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
      n6500TELHorIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6501TELKgs = DecimalUtil.ZERO ;
      n6501TELKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrimstr( A6501TELKgs, 9, 2));
      A6502TELPrg1 = (short)(0) ;
      n6502TELPrg1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6502TELPrg1), 3, 0));
      A6503TELPrg2 = (short)(0) ;
      n6503TELPrg2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6503TELPrg2), 3, 0));
      A6504TELPrg3 = (short)(0) ;
      n6504TELPrg3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6504TELPrg3), 3, 0));
      A6505TELPrg4 = (short)(0) ;
      n6505TELPrg4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6505TELPrg4), 3, 0));
      A6506TELPrg5 = (short)(0) ;
      n6506TELPrg5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6506TELPrg5), 3, 0));
      A6507TELTpStd = (short)(0) ;
      n6507TELTpStd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6507TELTpStd), 3, 0));
      A6508TELCOLib1 = "" ;
      n6508TELCOLib1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6508TELCOLib1", A6508TELCOLib1);
      A6509TELCoLib2 = "" ;
      n6509TELCoLib2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6509TELCoLib2", A6509TELCoLib2);
      A6510TELCoLib3 = "" ;
      n6510TELCoLib3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6510TELCoLib3", A6510TELCoLib3);
      A6511TELDsLib1 = "" ;
      n6511TELDsLib1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6511TELDsLib1", A6511TELDsLib1);
      A6512TELDsLib2 = "" ;
      n6512TELDsLib2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6512TELDsLib2", A6512TELDsLib2);
      A6513TELDsLib3 = "" ;
      n6513TELDsLib3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6513TELDsLib3", A6513TELDsLib3);
      A6514TELNota1 = "" ;
      n6514TELNota1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6514TELNota1", A6514TELNota1);
      A6515TELNota2 = "" ;
      n6515TELNota2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6515TELNota2", A6515TELNota2);
      A6516TELPRdto = DecimalUtil.ZERO ;
      n6516TELPRdto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrimstr( A6516TELPRdto, 6, 1));
      A6517TELTpEf = 0 ;
      n6517TELTpEf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6517TELTpEf), 5, 0));
      A6518TELTpTo = 0 ;
      n6518TELTpTo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6518TELTpTo), 5, 0));
      A6519TELFecFin = GXutil.nullDate() ;
      n6519TELFecFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
      A6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
      n6520TELHorFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6521TELRes1 = "" ;
      n6521TELRes1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6521TELRes1", A6521TELRes1);
      A6522TeLRes2 = "" ;
      n6522TeLRes2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6522TeLRes2", A6522TeLRes2);
      Z6492TELTarea = "" ;
      Z6493TELMic = (byte)(0) ;
      Z6494TELMaqCod = "" ;
      Z6495TELPartida = 0 ;
      Z6524TELPartidC = "" ;
      Z6496TELBarCod = 0 ;
      Z6497TELBarReo = (byte)(0) ;
      Z6498TELBarPar = "" ;
      Z6499TELFecIni = GXutil.nullDate() ;
      Z6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
      Z6501TELKgs = DecimalUtil.ZERO ;
      Z6502TELPrg1 = (short)(0) ;
      Z6503TELPrg2 = (short)(0) ;
      Z6504TELPrg3 = (short)(0) ;
      Z6505TELPrg4 = (short)(0) ;
      Z6506TELPrg5 = (short)(0) ;
      Z6507TELTpStd = (short)(0) ;
      Z6508TELCOLib1 = "" ;
      Z6509TELCoLib2 = "" ;
      Z6510TELCoLib3 = "" ;
      Z6511TELDsLib1 = "" ;
      Z6512TELDsLib2 = "" ;
      Z6513TELDsLib3 = "" ;
      Z6514TELNota1 = "" ;
      Z6515TELNota2 = "" ;
      Z6516TELPRdto = DecimalUtil.ZERO ;
      Z6517TELTpEf = 0 ;
      Z6518TELTpTo = 0 ;
      Z6519TELFecFin = GXutil.nullDate() ;
      Z6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
      Z6521TELRes1 = "" ;
      Z6522TeLRes2 = "" ;
   }

   public void initAll1GS1623( )
   {
      A6491TELId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6491TELId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6491TELId), 12, 0));
      initializeNonKey1GS1623( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026125194351", true, true);
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
      httpContext.AddJavascriptSource("tlavora.js", "?2026125194352", false, true);
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
      edtTELId_Internalname = "TELID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtTELTarea_Internalname = "TELTAREA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtTELMic_Internalname = "TELMIC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTELMaqCod_Internalname = "TELMAQCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTELPartida_Internalname = "TELPARTIDA" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTELPartidC_Internalname = "TELPARTIDC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTELBarCod_Internalname = "TELBARCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTELBarReo_Internalname = "TELBARREO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTELBarPar_Internalname = "TELBARPAR" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTELFecIni_Internalname = "TELFECINI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTELHorIni_Internalname = "TELHORINI" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTELKgs_Internalname = "TELKGS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTELPrg1_Internalname = "TELPRG1" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTELPrg2_Internalname = "TELPRG2" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtTELPrg3_Internalname = "TELPRG3" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtTELPrg4_Internalname = "TELPRG4" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtTELPrg5_Internalname = "TELPRG5" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtTELTpStd_Internalname = "TELTPSTD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtTELCOLib1_Internalname = "TELCOLIB1" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtTELCoLib2_Internalname = "TELCOLIB2" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtTELCoLib3_Internalname = "TELCOLIB3" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtTELDsLib1_Internalname = "TELDSLIB1" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtTELDsLib2_Internalname = "TELDSLIB2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTELDsLib3_Internalname = "TELDSLIB3" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTELNota1_Internalname = "TELNOTA1" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtTELNota2_Internalname = "TELNOTA2" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtTELPRdto_Internalname = "TELPRDTO" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtTELTpEf_Internalname = "TELTPEF" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtTELTpTo_Internalname = "TELTPTO" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtTELFecFin_Internalname = "TELFECFIN" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtTELHorFin_Internalname = "TELHORFIN" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtTELRes1_Internalname = "TELRES1" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtTeLRes2_Internalname = "TELRES2" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla LAVORA de Termoeletrónic", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTeLRes2_Backcolor = (int)(0xFFFFFF) ;
      edtTeLRes2_Enabled = 1 ;
      edtTELRes1_Jsonclick = "" ;
      edtTELRes1_Backcolor = (int)(0xFFFFFF) ;
      edtTELRes1_Enabled = 1 ;
      edtTELHorFin_Jsonclick = "" ;
      edtTELHorFin_Backcolor = (int)(0xFFFFFF) ;
      edtTELHorFin_Enabled = 1 ;
      edtTELFecFin_Jsonclick = "" ;
      edtTELFecFin_Backcolor = (int)(0xFFFFFF) ;
      edtTELFecFin_Enabled = 1 ;
      edtTELTpTo_Jsonclick = "" ;
      edtTELTpTo_Backcolor = (int)(0xFFFFFF) ;
      edtTELTpTo_Enabled = 1 ;
      edtTELTpEf_Jsonclick = "" ;
      edtTELTpEf_Backcolor = (int)(0xFFFFFF) ;
      edtTELTpEf_Enabled = 1 ;
      edtTELPRdto_Jsonclick = "" ;
      edtTELPRdto_Backcolor = (int)(0xFFFFFF) ;
      edtTELPRdto_Enabled = 1 ;
      edtTELNota2_Jsonclick = "" ;
      edtTELNota2_Backcolor = (int)(0xFFFFFF) ;
      edtTELNota2_Enabled = 1 ;
      edtTELNota1_Jsonclick = "" ;
      edtTELNota1_Backcolor = (int)(0xFFFFFF) ;
      edtTELNota1_Enabled = 1 ;
      edtTELDsLib3_Jsonclick = "" ;
      edtTELDsLib3_Backcolor = (int)(0xFFFFFF) ;
      edtTELDsLib3_Enabled = 1 ;
      edtTELDsLib2_Jsonclick = "" ;
      edtTELDsLib2_Backcolor = (int)(0xFFFFFF) ;
      edtTELDsLib2_Enabled = 1 ;
      edtTELDsLib1_Jsonclick = "" ;
      edtTELDsLib1_Backcolor = (int)(0xFFFFFF) ;
      edtTELDsLib1_Enabled = 1 ;
      edtTELCoLib3_Jsonclick = "" ;
      edtTELCoLib3_Backcolor = (int)(0xFFFFFF) ;
      edtTELCoLib3_Enabled = 1 ;
      edtTELCoLib2_Jsonclick = "" ;
      edtTELCoLib2_Backcolor = (int)(0xFFFFFF) ;
      edtTELCoLib2_Enabled = 1 ;
      edtTELCOLib1_Jsonclick = "" ;
      edtTELCOLib1_Backcolor = (int)(0xFFFFFF) ;
      edtTELCOLib1_Enabled = 1 ;
      edtTELTpStd_Jsonclick = "" ;
      edtTELTpStd_Backcolor = (int)(0xFFFFFF) ;
      edtTELTpStd_Enabled = 1 ;
      edtTELPrg5_Jsonclick = "" ;
      edtTELPrg5_Backcolor = (int)(0xFFFFFF) ;
      edtTELPrg5_Enabled = 1 ;
      edtTELPrg4_Jsonclick = "" ;
      edtTELPrg4_Backcolor = (int)(0xFFFFFF) ;
      edtTELPrg4_Enabled = 1 ;
      edtTELPrg3_Jsonclick = "" ;
      edtTELPrg3_Backcolor = (int)(0xFFFFFF) ;
      edtTELPrg3_Enabled = 1 ;
      edtTELPrg2_Jsonclick = "" ;
      edtTELPrg2_Backcolor = (int)(0xFFFFFF) ;
      edtTELPrg2_Enabled = 1 ;
      edtTELPrg1_Jsonclick = "" ;
      edtTELPrg1_Backcolor = (int)(0xFFFFFF) ;
      edtTELPrg1_Enabled = 1 ;
      edtTELKgs_Jsonclick = "" ;
      edtTELKgs_Backcolor = (int)(0xFFFFFF) ;
      edtTELKgs_Enabled = 1 ;
      edtTELHorIni_Jsonclick = "" ;
      edtTELHorIni_Backcolor = (int)(0xFFFFFF) ;
      edtTELHorIni_Enabled = 1 ;
      edtTELFecIni_Jsonclick = "" ;
      edtTELFecIni_Backcolor = (int)(0xFFFFFF) ;
      edtTELFecIni_Enabled = 1 ;
      edtTELBarPar_Jsonclick = "" ;
      edtTELBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtTELBarPar_Enabled = 1 ;
      edtTELBarReo_Jsonclick = "" ;
      edtTELBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtTELBarReo_Enabled = 1 ;
      edtTELBarCod_Jsonclick = "" ;
      edtTELBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtTELBarCod_Enabled = 1 ;
      edtTELPartidC_Jsonclick = "" ;
      edtTELPartidC_Backcolor = (int)(0xFFFFFF) ;
      edtTELPartidC_Enabled = 1 ;
      edtTELPartida_Jsonclick = "" ;
      edtTELPartida_Backcolor = (int)(0xFFFFFF) ;
      edtTELPartida_Enabled = 1 ;
      edtTELMaqCod_Jsonclick = "" ;
      edtTELMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtTELMaqCod_Enabled = 1 ;
      edtTELMic_Jsonclick = "" ;
      edtTELMic_Backcolor = (int)(0xFFFFFF) ;
      edtTELMic_Enabled = 1 ;
      edtTELTarea_Jsonclick = "" ;
      edtTELTarea_Backcolor = (int)(0xFFFFFF) ;
      edtTELTarea_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTELId_Jsonclick = "" ;
      edtTELId_Backcolor = (int)(0xFFFFFF) ;
      edtTELId_Enabled = 1 ;
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
      GX_FocusControl = edtTELTarea_Internalname ;
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

   public void valid_Telid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6492TELTarea", GXutil.rtrim( A6492TELTarea));
      httpContext.ajax_rsp_assign_attri("", false, "A6493TELMic", GXutil.ltrim( localUtil.ntoc( A6493TELMic, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6494TELMaqCod", GXutil.rtrim( A6494TELMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6495TELPartida", GXutil.ltrim( localUtil.ntoc( A6495TELPartida, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6524TELPartidC", GXutil.rtrim( A6524TELPartidC));
      httpContext.ajax_rsp_assign_attri("", false, "A6496TELBarCod", GXutil.ltrim( localUtil.ntoc( A6496TELBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6497TELBarReo", GXutil.ltrim( localUtil.ntoc( A6497TELBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6498TELBarPar", GXutil.rtrim( A6498TELBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A6499TELFecIni", localUtil.format(A6499TELFecIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6500TELHorIni", localUtil.ttoc( A6500TELHorIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6501TELKgs", GXutil.ltrim( localUtil.ntoc( A6501TELKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6502TELPrg1", GXutil.ltrim( localUtil.ntoc( A6502TELPrg1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6503TELPrg2", GXutil.ltrim( localUtil.ntoc( A6503TELPrg2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6504TELPrg3", GXutil.ltrim( localUtil.ntoc( A6504TELPrg3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6505TELPrg4", GXutil.ltrim( localUtil.ntoc( A6505TELPrg4, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6506TELPrg5", GXutil.ltrim( localUtil.ntoc( A6506TELPrg5, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6507TELTpStd", GXutil.ltrim( localUtil.ntoc( A6507TELTpStd, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6508TELCOLib1", GXutil.rtrim( A6508TELCOLib1));
      httpContext.ajax_rsp_assign_attri("", false, "A6509TELCoLib2", GXutil.rtrim( A6509TELCoLib2));
      httpContext.ajax_rsp_assign_attri("", false, "A6510TELCoLib3", GXutil.rtrim( A6510TELCoLib3));
      httpContext.ajax_rsp_assign_attri("", false, "A6511TELDsLib1", GXutil.rtrim( A6511TELDsLib1));
      httpContext.ajax_rsp_assign_attri("", false, "A6512TELDsLib2", GXutil.rtrim( A6512TELDsLib2));
      httpContext.ajax_rsp_assign_attri("", false, "A6513TELDsLib3", GXutil.rtrim( A6513TELDsLib3));
      httpContext.ajax_rsp_assign_attri("", false, "A6514TELNota1", GXutil.rtrim( A6514TELNota1));
      httpContext.ajax_rsp_assign_attri("", false, "A6515TELNota2", GXutil.rtrim( A6515TELNota2));
      httpContext.ajax_rsp_assign_attri("", false, "A6516TELPRdto", GXutil.ltrim( localUtil.ntoc( A6516TELPRdto, (byte)(6), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6517TELTpEf", GXutil.ltrim( localUtil.ntoc( A6517TELTpEf, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6518TELTpTo", GXutil.ltrim( localUtil.ntoc( A6518TELTpTo, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6519TELFecFin", localUtil.format(A6519TELFecFin, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6520TELHorFin", localUtil.ttoc( A6520TELHorFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6521TELRes1", GXutil.rtrim( A6521TELRes1));
      httpContext.ajax_rsp_assign_attri("", false, "A6522TeLRes2", GXutil.rtrim( A6522TeLRes2));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6491TELId", GXutil.ltrim( localUtil.ntoc( Z6491TELId, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6492TELTarea", GXutil.rtrim( Z6492TELTarea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6493TELMic", GXutil.ltrim( localUtil.ntoc( Z6493TELMic, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6494TELMaqCod", GXutil.rtrim( Z6494TELMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6495TELPartida", GXutil.ltrim( localUtil.ntoc( Z6495TELPartida, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6524TELPartidC", GXutil.rtrim( Z6524TELPartidC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6496TELBarCod", GXutil.ltrim( localUtil.ntoc( Z6496TELBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6497TELBarReo", GXutil.ltrim( localUtil.ntoc( Z6497TELBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6498TELBarPar", GXutil.rtrim( Z6498TELBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6499TELFecIni", localUtil.format(Z6499TELFecIni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6500TELHorIni", localUtil.ttoc( Z6500TELHorIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6501TELKgs", GXutil.ltrim( localUtil.ntoc( Z6501TELKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6502TELPrg1", GXutil.ltrim( localUtil.ntoc( Z6502TELPrg1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6503TELPrg2", GXutil.ltrim( localUtil.ntoc( Z6503TELPrg2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6504TELPrg3", GXutil.ltrim( localUtil.ntoc( Z6504TELPrg3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6505TELPrg4", GXutil.ltrim( localUtil.ntoc( Z6505TELPrg4, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6506TELPrg5", GXutil.ltrim( localUtil.ntoc( Z6506TELPrg5, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6507TELTpStd", GXutil.ltrim( localUtil.ntoc( Z6507TELTpStd, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6508TELCOLib1", GXutil.rtrim( Z6508TELCOLib1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6509TELCoLib2", GXutil.rtrim( Z6509TELCoLib2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6510TELCoLib3", GXutil.rtrim( Z6510TELCoLib3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6511TELDsLib1", GXutil.rtrim( Z6511TELDsLib1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6512TELDsLib2", GXutil.rtrim( Z6512TELDsLib2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6513TELDsLib3", GXutil.rtrim( Z6513TELDsLib3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6514TELNota1", GXutil.rtrim( Z6514TELNota1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6515TELNota2", GXutil.rtrim( Z6515TELNota2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6516TELPRdto", GXutil.ltrim( localUtil.ntoc( Z6516TELPRdto, (byte)(6), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6517TELTpEf", GXutil.ltrim( localUtil.ntoc( Z6517TELTpEf, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6518TELTpTo", GXutil.ltrim( localUtil.ntoc( Z6518TELTpTo, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6519TELFecFin", localUtil.format(Z6519TELFecFin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6520TELHorFin", localUtil.ttoc( Z6520TELHorFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6521TELRes1", GXutil.rtrim( Z6521TELRes1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6522TeLRes2", GXutil.rtrim( Z6522TeLRes2));
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
      setEventMetadata("VALID_TELID","{handler:'valid_Telid',iparms:[{av:'A6491TELId',fld:'TELID',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TELID",",oparms:[{av:'A6492TELTarea',fld:'TELTAREA',pic:''},{av:'A6493TELMic',fld:'TELMIC',pic:'Z9'},{av:'A6494TELMaqCod',fld:'TELMAQCOD',pic:''},{av:'A6495TELPartida',fld:'TELPARTIDA',pic:'ZZZZZZZZZZZ9'},{av:'A6524TELPartidC',fld:'TELPARTIDC',pic:''},{av:'A6496TELBarCod',fld:'TELBARCOD',pic:'ZZZZZZZ9'},{av:'A6497TELBarReo',fld:'TELBARREO',pic:'9'},{av:'A6498TELBarPar',fld:'TELBARPAR',pic:''},{av:'A6499TELFecIni',fld:'TELFECINI',pic:''},{av:'A6500TELHorIni',fld:'TELHORINI',pic:'99/99/99 99:99'},{av:'A6501TELKgs',fld:'TELKGS',pic:'ZZZZZ9.99'},{av:'A6502TELPrg1',fld:'TELPRG1',pic:'ZZ9'},{av:'A6503TELPrg2',fld:'TELPRG2',pic:'ZZ9'},{av:'A6504TELPrg3',fld:'TELPRG3',pic:'ZZ9'},{av:'A6505TELPrg4',fld:'TELPRG4',pic:'ZZ9'},{av:'A6506TELPrg5',fld:'TELPRG5',pic:'ZZ9'},{av:'A6507TELTpStd',fld:'TELTPSTD',pic:'ZZ9'},{av:'A6508TELCOLib1',fld:'TELCOLIB1',pic:''},{av:'A6509TELCoLib2',fld:'TELCOLIB2',pic:''},{av:'A6510TELCoLib3',fld:'TELCOLIB3',pic:''},{av:'A6511TELDsLib1',fld:'TELDSLIB1',pic:''},{av:'A6512TELDsLib2',fld:'TELDSLIB2',pic:''},{av:'A6513TELDsLib3',fld:'TELDSLIB3',pic:''},{av:'A6514TELNota1',fld:'TELNOTA1',pic:''},{av:'A6515TELNota2',fld:'TELNOTA2',pic:''},{av:'A6516TELPRdto',fld:'TELPRDTO',pic:'ZZZ9.9'},{av:'A6517TELTpEf',fld:'TELTPEF',pic:'ZZZZ9'},{av:'A6518TELTpTo',fld:'TELTPTO',pic:'ZZZZ9'},{av:'A6519TELFecFin',fld:'TELFECFIN',pic:''},{av:'A6520TELHorFin',fld:'TELHORFIN',pic:'99/99/99 99:99'},{av:'A6521TELRes1',fld:'TELRES1',pic:''},{av:'A6522TeLRes2',fld:'TELRES2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z6491TELId'},{av:'Z6492TELTarea'},{av:'Z6493TELMic'},{av:'Z6494TELMaqCod'},{av:'Z6495TELPartida'},{av:'Z6524TELPartidC'},{av:'Z6496TELBarCod'},{av:'Z6497TELBarReo'},{av:'Z6498TELBarPar'},{av:'Z6499TELFecIni'},{av:'Z6500TELHorIni'},{av:'Z6501TELKgs'},{av:'Z6502TELPrg1'},{av:'Z6503TELPrg2'},{av:'Z6504TELPrg3'},{av:'Z6505TELPrg4'},{av:'Z6506TELPrg5'},{av:'Z6507TELTpStd'},{av:'Z6508TELCOLib1'},{av:'Z6509TELCoLib2'},{av:'Z6510TELCoLib3'},{av:'Z6511TELDsLib1'},{av:'Z6512TELDsLib2'},{av:'Z6513TELDsLib3'},{av:'Z6514TELNota1'},{av:'Z6515TELNota2'},{av:'Z6516TELPRdto'},{av:'Z6517TELTpEf'},{av:'Z6518TELTpTo'},{av:'Z6519TELFecFin'},{av:'Z6520TELHorFin'},{av:'Z6521TELRes1'},{av:'Z6522TeLRes2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z6492TELTarea = "" ;
      Z6494TELMaqCod = "" ;
      Z6524TELPartidC = "" ;
      Z6498TELBarPar = "" ;
      Z6499TELFecIni = GXutil.nullDate() ;
      Z6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
      Z6501TELKgs = DecimalUtil.ZERO ;
      Z6508TELCOLib1 = "" ;
      Z6509TELCoLib2 = "" ;
      Z6510TELCoLib3 = "" ;
      Z6511TELDsLib1 = "" ;
      Z6512TELDsLib2 = "" ;
      Z6513TELDsLib3 = "" ;
      Z6514TELNota1 = "" ;
      Z6515TELNota2 = "" ;
      Z6516TELPRdto = DecimalUtil.ZERO ;
      Z6519TELFecFin = GXutil.nullDate() ;
      Z6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
      Z6521TELRes1 = "" ;
      Z6522TeLRes2 = "" ;
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
      A6492TELTarea = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A6494TELMaqCod = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A6524TELPartidC = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6498TELBarPar = "" ;
      lblTextblock10_Jsonclick = "" ;
      A6499TELFecIni = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock12_Jsonclick = "" ;
      A6501TELKgs = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A6508TELCOLib1 = "" ;
      lblTextblock20_Jsonclick = "" ;
      A6509TELCoLib2 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A6510TELCoLib3 = "" ;
      lblTextblock22_Jsonclick = "" ;
      A6511TELDsLib1 = "" ;
      lblTextblock23_Jsonclick = "" ;
      A6512TELDsLib2 = "" ;
      lblTextblock24_Jsonclick = "" ;
      A6513TELDsLib3 = "" ;
      lblTextblock25_Jsonclick = "" ;
      A6514TELNota1 = "" ;
      lblTextblock26_Jsonclick = "" ;
      A6515TELNota2 = "" ;
      lblTextblock27_Jsonclick = "" ;
      A6516TELPRdto = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A6519TELFecFin = GXutil.nullDate() ;
      lblTextblock31_Jsonclick = "" ;
      A6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock32_Jsonclick = "" ;
      A6521TELRes1 = "" ;
      lblTextblock33_Jsonclick = "" ;
      A6522TeLRes2 = "" ;
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
      T01GS4_A6491TELId = new long[1] ;
      T01GS4_A6492TELTarea = new String[] {""} ;
      T01GS4_n6492TELTarea = new boolean[] {false} ;
      T01GS4_A6493TELMic = new byte[1] ;
      T01GS4_n6493TELMic = new boolean[] {false} ;
      T01GS4_A6494TELMaqCod = new String[] {""} ;
      T01GS4_n6494TELMaqCod = new boolean[] {false} ;
      T01GS4_A6495TELPartida = new long[1] ;
      T01GS4_n6495TELPartida = new boolean[] {false} ;
      T01GS4_A6524TELPartidC = new String[] {""} ;
      T01GS4_n6524TELPartidC = new boolean[] {false} ;
      T01GS4_A6496TELBarCod = new int[1] ;
      T01GS4_n6496TELBarCod = new boolean[] {false} ;
      T01GS4_A6497TELBarReo = new byte[1] ;
      T01GS4_n6497TELBarReo = new boolean[] {false} ;
      T01GS4_A6498TELBarPar = new String[] {""} ;
      T01GS4_n6498TELBarPar = new boolean[] {false} ;
      T01GS4_A6499TELFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS4_n6499TELFecIni = new boolean[] {false} ;
      T01GS4_A6500TELHorIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS4_n6500TELHorIni = new boolean[] {false} ;
      T01GS4_A6501TELKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS4_n6501TELKgs = new boolean[] {false} ;
      T01GS4_A6502TELPrg1 = new short[1] ;
      T01GS4_n6502TELPrg1 = new boolean[] {false} ;
      T01GS4_A6503TELPrg2 = new short[1] ;
      T01GS4_n6503TELPrg2 = new boolean[] {false} ;
      T01GS4_A6504TELPrg3 = new short[1] ;
      T01GS4_n6504TELPrg3 = new boolean[] {false} ;
      T01GS4_A6505TELPrg4 = new short[1] ;
      T01GS4_n6505TELPrg4 = new boolean[] {false} ;
      T01GS4_A6506TELPrg5 = new short[1] ;
      T01GS4_n6506TELPrg5 = new boolean[] {false} ;
      T01GS4_A6507TELTpStd = new short[1] ;
      T01GS4_n6507TELTpStd = new boolean[] {false} ;
      T01GS4_A6508TELCOLib1 = new String[] {""} ;
      T01GS4_n6508TELCOLib1 = new boolean[] {false} ;
      T01GS4_A6509TELCoLib2 = new String[] {""} ;
      T01GS4_n6509TELCoLib2 = new boolean[] {false} ;
      T01GS4_A6510TELCoLib3 = new String[] {""} ;
      T01GS4_n6510TELCoLib3 = new boolean[] {false} ;
      T01GS4_A6511TELDsLib1 = new String[] {""} ;
      T01GS4_n6511TELDsLib1 = new boolean[] {false} ;
      T01GS4_A6512TELDsLib2 = new String[] {""} ;
      T01GS4_n6512TELDsLib2 = new boolean[] {false} ;
      T01GS4_A6513TELDsLib3 = new String[] {""} ;
      T01GS4_n6513TELDsLib3 = new boolean[] {false} ;
      T01GS4_A6514TELNota1 = new String[] {""} ;
      T01GS4_n6514TELNota1 = new boolean[] {false} ;
      T01GS4_A6515TELNota2 = new String[] {""} ;
      T01GS4_n6515TELNota2 = new boolean[] {false} ;
      T01GS4_A6516TELPRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS4_n6516TELPRdto = new boolean[] {false} ;
      T01GS4_A6517TELTpEf = new int[1] ;
      T01GS4_n6517TELTpEf = new boolean[] {false} ;
      T01GS4_A6518TELTpTo = new int[1] ;
      T01GS4_n6518TELTpTo = new boolean[] {false} ;
      T01GS4_A6519TELFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS4_n6519TELFecFin = new boolean[] {false} ;
      T01GS4_A6520TELHorFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS4_n6520TELHorFin = new boolean[] {false} ;
      T01GS4_A6521TELRes1 = new String[] {""} ;
      T01GS4_n6521TELRes1 = new boolean[] {false} ;
      T01GS4_A6522TeLRes2 = new String[] {""} ;
      T01GS4_n6522TeLRes2 = new boolean[] {false} ;
      T01GS5_A6491TELId = new long[1] ;
      T01GS3_A6491TELId = new long[1] ;
      T01GS3_A6492TELTarea = new String[] {""} ;
      T01GS3_n6492TELTarea = new boolean[] {false} ;
      T01GS3_A6493TELMic = new byte[1] ;
      T01GS3_n6493TELMic = new boolean[] {false} ;
      T01GS3_A6494TELMaqCod = new String[] {""} ;
      T01GS3_n6494TELMaqCod = new boolean[] {false} ;
      T01GS3_A6495TELPartida = new long[1] ;
      T01GS3_n6495TELPartida = new boolean[] {false} ;
      T01GS3_A6524TELPartidC = new String[] {""} ;
      T01GS3_n6524TELPartidC = new boolean[] {false} ;
      T01GS3_A6496TELBarCod = new int[1] ;
      T01GS3_n6496TELBarCod = new boolean[] {false} ;
      T01GS3_A6497TELBarReo = new byte[1] ;
      T01GS3_n6497TELBarReo = new boolean[] {false} ;
      T01GS3_A6498TELBarPar = new String[] {""} ;
      T01GS3_n6498TELBarPar = new boolean[] {false} ;
      T01GS3_A6499TELFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS3_n6499TELFecIni = new boolean[] {false} ;
      T01GS3_A6500TELHorIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS3_n6500TELHorIni = new boolean[] {false} ;
      T01GS3_A6501TELKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS3_n6501TELKgs = new boolean[] {false} ;
      T01GS3_A6502TELPrg1 = new short[1] ;
      T01GS3_n6502TELPrg1 = new boolean[] {false} ;
      T01GS3_A6503TELPrg2 = new short[1] ;
      T01GS3_n6503TELPrg2 = new boolean[] {false} ;
      T01GS3_A6504TELPrg3 = new short[1] ;
      T01GS3_n6504TELPrg3 = new boolean[] {false} ;
      T01GS3_A6505TELPrg4 = new short[1] ;
      T01GS3_n6505TELPrg4 = new boolean[] {false} ;
      T01GS3_A6506TELPrg5 = new short[1] ;
      T01GS3_n6506TELPrg5 = new boolean[] {false} ;
      T01GS3_A6507TELTpStd = new short[1] ;
      T01GS3_n6507TELTpStd = new boolean[] {false} ;
      T01GS3_A6508TELCOLib1 = new String[] {""} ;
      T01GS3_n6508TELCOLib1 = new boolean[] {false} ;
      T01GS3_A6509TELCoLib2 = new String[] {""} ;
      T01GS3_n6509TELCoLib2 = new boolean[] {false} ;
      T01GS3_A6510TELCoLib3 = new String[] {""} ;
      T01GS3_n6510TELCoLib3 = new boolean[] {false} ;
      T01GS3_A6511TELDsLib1 = new String[] {""} ;
      T01GS3_n6511TELDsLib1 = new boolean[] {false} ;
      T01GS3_A6512TELDsLib2 = new String[] {""} ;
      T01GS3_n6512TELDsLib2 = new boolean[] {false} ;
      T01GS3_A6513TELDsLib3 = new String[] {""} ;
      T01GS3_n6513TELDsLib3 = new boolean[] {false} ;
      T01GS3_A6514TELNota1 = new String[] {""} ;
      T01GS3_n6514TELNota1 = new boolean[] {false} ;
      T01GS3_A6515TELNota2 = new String[] {""} ;
      T01GS3_n6515TELNota2 = new boolean[] {false} ;
      T01GS3_A6516TELPRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS3_n6516TELPRdto = new boolean[] {false} ;
      T01GS3_A6517TELTpEf = new int[1] ;
      T01GS3_n6517TELTpEf = new boolean[] {false} ;
      T01GS3_A6518TELTpTo = new int[1] ;
      T01GS3_n6518TELTpTo = new boolean[] {false} ;
      T01GS3_A6519TELFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS3_n6519TELFecFin = new boolean[] {false} ;
      T01GS3_A6520TELHorFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS3_n6520TELHorFin = new boolean[] {false} ;
      T01GS3_A6521TELRes1 = new String[] {""} ;
      T01GS3_n6521TELRes1 = new boolean[] {false} ;
      T01GS3_A6522TeLRes2 = new String[] {""} ;
      T01GS3_n6522TeLRes2 = new boolean[] {false} ;
      sMode1623 = "" ;
      T01GS6_A6491TELId = new long[1] ;
      T01GS7_A6491TELId = new long[1] ;
      T01GS2_A6491TELId = new long[1] ;
      T01GS2_A6492TELTarea = new String[] {""} ;
      T01GS2_n6492TELTarea = new boolean[] {false} ;
      T01GS2_A6493TELMic = new byte[1] ;
      T01GS2_n6493TELMic = new boolean[] {false} ;
      T01GS2_A6494TELMaqCod = new String[] {""} ;
      T01GS2_n6494TELMaqCod = new boolean[] {false} ;
      T01GS2_A6495TELPartida = new long[1] ;
      T01GS2_n6495TELPartida = new boolean[] {false} ;
      T01GS2_A6524TELPartidC = new String[] {""} ;
      T01GS2_n6524TELPartidC = new boolean[] {false} ;
      T01GS2_A6496TELBarCod = new int[1] ;
      T01GS2_n6496TELBarCod = new boolean[] {false} ;
      T01GS2_A6497TELBarReo = new byte[1] ;
      T01GS2_n6497TELBarReo = new boolean[] {false} ;
      T01GS2_A6498TELBarPar = new String[] {""} ;
      T01GS2_n6498TELBarPar = new boolean[] {false} ;
      T01GS2_A6499TELFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS2_n6499TELFecIni = new boolean[] {false} ;
      T01GS2_A6500TELHorIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS2_n6500TELHorIni = new boolean[] {false} ;
      T01GS2_A6501TELKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS2_n6501TELKgs = new boolean[] {false} ;
      T01GS2_A6502TELPrg1 = new short[1] ;
      T01GS2_n6502TELPrg1 = new boolean[] {false} ;
      T01GS2_A6503TELPrg2 = new short[1] ;
      T01GS2_n6503TELPrg2 = new boolean[] {false} ;
      T01GS2_A6504TELPrg3 = new short[1] ;
      T01GS2_n6504TELPrg3 = new boolean[] {false} ;
      T01GS2_A6505TELPrg4 = new short[1] ;
      T01GS2_n6505TELPrg4 = new boolean[] {false} ;
      T01GS2_A6506TELPrg5 = new short[1] ;
      T01GS2_n6506TELPrg5 = new boolean[] {false} ;
      T01GS2_A6507TELTpStd = new short[1] ;
      T01GS2_n6507TELTpStd = new boolean[] {false} ;
      T01GS2_A6508TELCOLib1 = new String[] {""} ;
      T01GS2_n6508TELCOLib1 = new boolean[] {false} ;
      T01GS2_A6509TELCoLib2 = new String[] {""} ;
      T01GS2_n6509TELCoLib2 = new boolean[] {false} ;
      T01GS2_A6510TELCoLib3 = new String[] {""} ;
      T01GS2_n6510TELCoLib3 = new boolean[] {false} ;
      T01GS2_A6511TELDsLib1 = new String[] {""} ;
      T01GS2_n6511TELDsLib1 = new boolean[] {false} ;
      T01GS2_A6512TELDsLib2 = new String[] {""} ;
      T01GS2_n6512TELDsLib2 = new boolean[] {false} ;
      T01GS2_A6513TELDsLib3 = new String[] {""} ;
      T01GS2_n6513TELDsLib3 = new boolean[] {false} ;
      T01GS2_A6514TELNota1 = new String[] {""} ;
      T01GS2_n6514TELNota1 = new boolean[] {false} ;
      T01GS2_A6515TELNota2 = new String[] {""} ;
      T01GS2_n6515TELNota2 = new boolean[] {false} ;
      T01GS2_A6516TELPRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GS2_n6516TELPRdto = new boolean[] {false} ;
      T01GS2_A6517TELTpEf = new int[1] ;
      T01GS2_n6517TELTpEf = new boolean[] {false} ;
      T01GS2_A6518TELTpTo = new int[1] ;
      T01GS2_n6518TELTpTo = new boolean[] {false} ;
      T01GS2_A6519TELFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS2_n6519TELFecFin = new boolean[] {false} ;
      T01GS2_A6520TELHorFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01GS2_n6520TELHorFin = new boolean[] {false} ;
      T01GS2_A6521TELRes1 = new String[] {""} ;
      T01GS2_n6521TELRes1 = new boolean[] {false} ;
      T01GS2_A6522TeLRes2 = new String[] {""} ;
      T01GS2_n6522TeLRes2 = new boolean[] {false} ;
      T01GS11_A6491TELId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ6492TELTarea = "" ;
      ZZ6494TELMaqCod = "" ;
      ZZ6524TELPartidC = "" ;
      ZZ6498TELBarPar = "" ;
      ZZ6499TELFecIni = GXutil.nullDate() ;
      ZZ6500TELHorIni = GXutil.resetTime( GXutil.nullDate() );
      ZZ6501TELKgs = DecimalUtil.ZERO ;
      ZZ6508TELCOLib1 = "" ;
      ZZ6509TELCoLib2 = "" ;
      ZZ6510TELCoLib3 = "" ;
      ZZ6511TELDsLib1 = "" ;
      ZZ6512TELDsLib2 = "" ;
      ZZ6513TELDsLib3 = "" ;
      ZZ6514TELNota1 = "" ;
      ZZ6515TELNota2 = "" ;
      ZZ6516TELPRdto = DecimalUtil.ZERO ;
      ZZ6519TELFecFin = GXutil.nullDate() ;
      ZZ6520TELHorFin = GXutil.resetTime( GXutil.nullDate() );
      ZZ6521TELRes1 = "" ;
      ZZ6522TeLRes2 = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlavora__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlavora__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlavora__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlavora__default(),
         new Object[] {
             new Object[] {
            T01GS2_A6491TELId, T01GS2_A6492TELTarea, T01GS2_n6492TELTarea, T01GS2_A6493TELMic, T01GS2_n6493TELMic, T01GS2_A6494TELMaqCod, T01GS2_n6494TELMaqCod, T01GS2_A6495TELPartida, T01GS2_n6495TELPartida, T01GS2_A6524TELPartidC,
            T01GS2_n6524TELPartidC, T01GS2_A6496TELBarCod, T01GS2_n6496TELBarCod, T01GS2_A6497TELBarReo, T01GS2_n6497TELBarReo, T01GS2_A6498TELBarPar, T01GS2_n6498TELBarPar, T01GS2_A6499TELFecIni, T01GS2_n6499TELFecIni, T01GS2_A6500TELHorIni,
            T01GS2_n6500TELHorIni, T01GS2_A6501TELKgs, T01GS2_n6501TELKgs, T01GS2_A6502TELPrg1, T01GS2_n6502TELPrg1, T01GS2_A6503TELPrg2, T01GS2_n6503TELPrg2, T01GS2_A6504TELPrg3, T01GS2_n6504TELPrg3, T01GS2_A6505TELPrg4,
            T01GS2_n6505TELPrg4, T01GS2_A6506TELPrg5, T01GS2_n6506TELPrg5, T01GS2_A6507TELTpStd, T01GS2_n6507TELTpStd, T01GS2_A6508TELCOLib1, T01GS2_n6508TELCOLib1, T01GS2_A6509TELCoLib2, T01GS2_n6509TELCoLib2, T01GS2_A6510TELCoLib3,
            T01GS2_n6510TELCoLib3, T01GS2_A6511TELDsLib1, T01GS2_n6511TELDsLib1, T01GS2_A6512TELDsLib2, T01GS2_n6512TELDsLib2, T01GS2_A6513TELDsLib3, T01GS2_n6513TELDsLib3, T01GS2_A6514TELNota1, T01GS2_n6514TELNota1, T01GS2_A6515TELNota2,
            T01GS2_n6515TELNota2, T01GS2_A6516TELPRdto, T01GS2_n6516TELPRdto, T01GS2_A6517TELTpEf, T01GS2_n6517TELTpEf, T01GS2_A6518TELTpTo, T01GS2_n6518TELTpTo, T01GS2_A6519TELFecFin, T01GS2_n6519TELFecFin, T01GS2_A6520TELHorFin,
            T01GS2_n6520TELHorFin, T01GS2_A6521TELRes1, T01GS2_n6521TELRes1, T01GS2_A6522TeLRes2, T01GS2_n6522TeLRes2
            }
            , new Object[] {
            T01GS3_A6491TELId, T01GS3_A6492TELTarea, T01GS3_n6492TELTarea, T01GS3_A6493TELMic, T01GS3_n6493TELMic, T01GS3_A6494TELMaqCod, T01GS3_n6494TELMaqCod, T01GS3_A6495TELPartida, T01GS3_n6495TELPartida, T01GS3_A6524TELPartidC,
            T01GS3_n6524TELPartidC, T01GS3_A6496TELBarCod, T01GS3_n6496TELBarCod, T01GS3_A6497TELBarReo, T01GS3_n6497TELBarReo, T01GS3_A6498TELBarPar, T01GS3_n6498TELBarPar, T01GS3_A6499TELFecIni, T01GS3_n6499TELFecIni, T01GS3_A6500TELHorIni,
            T01GS3_n6500TELHorIni, T01GS3_A6501TELKgs, T01GS3_n6501TELKgs, T01GS3_A6502TELPrg1, T01GS3_n6502TELPrg1, T01GS3_A6503TELPrg2, T01GS3_n6503TELPrg2, T01GS3_A6504TELPrg3, T01GS3_n6504TELPrg3, T01GS3_A6505TELPrg4,
            T01GS3_n6505TELPrg4, T01GS3_A6506TELPrg5, T01GS3_n6506TELPrg5, T01GS3_A6507TELTpStd, T01GS3_n6507TELTpStd, T01GS3_A6508TELCOLib1, T01GS3_n6508TELCOLib1, T01GS3_A6509TELCoLib2, T01GS3_n6509TELCoLib2, T01GS3_A6510TELCoLib3,
            T01GS3_n6510TELCoLib3, T01GS3_A6511TELDsLib1, T01GS3_n6511TELDsLib1, T01GS3_A6512TELDsLib2, T01GS3_n6512TELDsLib2, T01GS3_A6513TELDsLib3, T01GS3_n6513TELDsLib3, T01GS3_A6514TELNota1, T01GS3_n6514TELNota1, T01GS3_A6515TELNota2,
            T01GS3_n6515TELNota2, T01GS3_A6516TELPRdto, T01GS3_n6516TELPRdto, T01GS3_A6517TELTpEf, T01GS3_n6517TELTpEf, T01GS3_A6518TELTpTo, T01GS3_n6518TELTpTo, T01GS3_A6519TELFecFin, T01GS3_n6519TELFecFin, T01GS3_A6520TELHorFin,
            T01GS3_n6520TELHorFin, T01GS3_A6521TELRes1, T01GS3_n6521TELRes1, T01GS3_A6522TeLRes2, T01GS3_n6522TeLRes2
            }
            , new Object[] {
            T01GS4_A6491TELId, T01GS4_A6492TELTarea, T01GS4_n6492TELTarea, T01GS4_A6493TELMic, T01GS4_n6493TELMic, T01GS4_A6494TELMaqCod, T01GS4_n6494TELMaqCod, T01GS4_A6495TELPartida, T01GS4_n6495TELPartida, T01GS4_A6524TELPartidC,
            T01GS4_n6524TELPartidC, T01GS4_A6496TELBarCod, T01GS4_n6496TELBarCod, T01GS4_A6497TELBarReo, T01GS4_n6497TELBarReo, T01GS4_A6498TELBarPar, T01GS4_n6498TELBarPar, T01GS4_A6499TELFecIni, T01GS4_n6499TELFecIni, T01GS4_A6500TELHorIni,
            T01GS4_n6500TELHorIni, T01GS4_A6501TELKgs, T01GS4_n6501TELKgs, T01GS4_A6502TELPrg1, T01GS4_n6502TELPrg1, T01GS4_A6503TELPrg2, T01GS4_n6503TELPrg2, T01GS4_A6504TELPrg3, T01GS4_n6504TELPrg3, T01GS4_A6505TELPrg4,
            T01GS4_n6505TELPrg4, T01GS4_A6506TELPrg5, T01GS4_n6506TELPrg5, T01GS4_A6507TELTpStd, T01GS4_n6507TELTpStd, T01GS4_A6508TELCOLib1, T01GS4_n6508TELCOLib1, T01GS4_A6509TELCoLib2, T01GS4_n6509TELCoLib2, T01GS4_A6510TELCoLib3,
            T01GS4_n6510TELCoLib3, T01GS4_A6511TELDsLib1, T01GS4_n6511TELDsLib1, T01GS4_A6512TELDsLib2, T01GS4_n6512TELDsLib2, T01GS4_A6513TELDsLib3, T01GS4_n6513TELDsLib3, T01GS4_A6514TELNota1, T01GS4_n6514TELNota1, T01GS4_A6515TELNota2,
            T01GS4_n6515TELNota2, T01GS4_A6516TELPRdto, T01GS4_n6516TELPRdto, T01GS4_A6517TELTpEf, T01GS4_n6517TELTpEf, T01GS4_A6518TELTpTo, T01GS4_n6518TELTpTo, T01GS4_A6519TELFecFin, T01GS4_n6519TELFecFin, T01GS4_A6520TELHorFin,
            T01GS4_n6520TELHorFin, T01GS4_A6521TELRes1, T01GS4_n6521TELRes1, T01GS4_A6522TeLRes2, T01GS4_n6522TeLRes2
            }
            , new Object[] {
            T01GS5_A6491TELId
            }
            , new Object[] {
            T01GS6_A6491TELId
            }
            , new Object[] {
            T01GS7_A6491TELId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GS11_A6491TELId
            }
         }
      );
   }

   private byte Z6493TELMic ;
   private byte Z6497TELBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6493TELMic ;
   private byte A6497TELBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ6493TELMic ;
   private byte ZZ6497TELBarReo ;
   private short Z6502TELPrg1 ;
   private short Z6503TELPrg2 ;
   private short Z6504TELPrg3 ;
   private short Z6505TELPrg4 ;
   private short Z6506TELPrg5 ;
   private short Z6507TELTpStd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6502TELPrg1 ;
   private short A6503TELPrg2 ;
   private short A6504TELPrg3 ;
   private short A6505TELPrg4 ;
   private short A6506TELPrg5 ;
   private short A6507TELTpStd ;
   private short RcdFound1623 ;
   private short nIsDirty_1623 ;
   private short ZZ6502TELPrg1 ;
   private short ZZ6503TELPrg2 ;
   private short ZZ6504TELPrg3 ;
   private short ZZ6505TELPrg4 ;
   private short ZZ6506TELPrg5 ;
   private short ZZ6507TELTpStd ;
   private int Z6496TELBarCod ;
   private int Z6517TELTpEf ;
   private int Z6518TELTpTo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTELId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTELTarea_Enabled ;
   private int edtTELMic_Enabled ;
   private int edtTELMaqCod_Enabled ;
   private int edtTELPartida_Enabled ;
   private int edtTELPartidC_Enabled ;
   private int A6496TELBarCod ;
   private int edtTELBarCod_Enabled ;
   private int edtTELBarReo_Enabled ;
   private int edtTELBarPar_Enabled ;
   private int edtTELFecIni_Enabled ;
   private int edtTELHorIni_Enabled ;
   private int edtTELKgs_Enabled ;
   private int edtTELPrg1_Enabled ;
   private int edtTELPrg2_Enabled ;
   private int edtTELPrg3_Enabled ;
   private int edtTELPrg4_Enabled ;
   private int edtTELPrg5_Enabled ;
   private int edtTELTpStd_Enabled ;
   private int edtTELCOLib1_Enabled ;
   private int edtTELCoLib2_Enabled ;
   private int edtTELCoLib3_Enabled ;
   private int edtTELDsLib1_Enabled ;
   private int edtTELDsLib2_Enabled ;
   private int edtTELDsLib3_Enabled ;
   private int edtTELNota1_Enabled ;
   private int edtTELNota2_Enabled ;
   private int edtTELPRdto_Enabled ;
   private int A6517TELTpEf ;
   private int edtTELTpEf_Enabled ;
   private int A6518TELTpTo ;
   private int edtTELTpTo_Enabled ;
   private int edtTELFecFin_Enabled ;
   private int edtTELHorFin_Enabled ;
   private int edtTELRes1_Enabled ;
   private int edtTeLRes2_Enabled ;
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
   private int edtTeLRes2_Backcolor ;
   private int edtTELRes1_Backcolor ;
   private int edtTELHorFin_Backcolor ;
   private int edtTELFecFin_Backcolor ;
   private int edtTELTpTo_Backcolor ;
   private int edtTELTpEf_Backcolor ;
   private int edtTELPRdto_Backcolor ;
   private int edtTELNota2_Backcolor ;
   private int edtTELNota1_Backcolor ;
   private int edtTELDsLib3_Backcolor ;
   private int edtTELDsLib2_Backcolor ;
   private int edtTELDsLib1_Backcolor ;
   private int edtTELCoLib3_Backcolor ;
   private int edtTELCoLib2_Backcolor ;
   private int edtTELCOLib1_Backcolor ;
   private int edtTELTpStd_Backcolor ;
   private int edtTELPrg5_Backcolor ;
   private int edtTELPrg4_Backcolor ;
   private int edtTELPrg3_Backcolor ;
   private int edtTELPrg2_Backcolor ;
   private int edtTELPrg1_Backcolor ;
   private int edtTELKgs_Backcolor ;
   private int edtTELHorIni_Backcolor ;
   private int edtTELFecIni_Backcolor ;
   private int edtTELBarPar_Backcolor ;
   private int edtTELBarReo_Backcolor ;
   private int edtTELBarCod_Backcolor ;
   private int edtTELPartidC_Backcolor ;
   private int edtTELPartida_Backcolor ;
   private int edtTELMaqCod_Backcolor ;
   private int edtTELMic_Backcolor ;
   private int edtTELTarea_Backcolor ;
   private int edtTELId_Backcolor ;
   private int ZZ6496TELBarCod ;
   private int ZZ6517TELTpEf ;
   private int ZZ6518TELTpTo ;
   private long Z6491TELId ;
   private long Z6495TELPartida ;
   private long A6491TELId ;
   private long A6495TELPartida ;
   private long ZZ6491TELId ;
   private long ZZ6495TELPartida ;
   private java.math.BigDecimal Z6501TELKgs ;
   private java.math.BigDecimal Z6516TELPRdto ;
   private java.math.BigDecimal A6501TELKgs ;
   private java.math.BigDecimal A6516TELPRdto ;
   private java.math.BigDecimal ZZ6501TELKgs ;
   private java.math.BigDecimal ZZ6516TELPRdto ;
   private String sPrefix ;
   private String Z6492TELTarea ;
   private String Z6494TELMaqCod ;
   private String Z6524TELPartidC ;
   private String Z6498TELBarPar ;
   private String Z6508TELCOLib1 ;
   private String Z6509TELCoLib2 ;
   private String Z6510TELCoLib3 ;
   private String Z6511TELDsLib1 ;
   private String Z6512TELDsLib2 ;
   private String Z6513TELDsLib3 ;
   private String Z6514TELNota1 ;
   private String Z6515TELNota2 ;
   private String Z6521TELRes1 ;
   private String Z6522TeLRes2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTELId_Internalname ;
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
   private String edtTELId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtTELTarea_Internalname ;
   private String A6492TELTarea ;
   private String edtTELTarea_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTELMic_Internalname ;
   private String edtTELMic_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTELMaqCod_Internalname ;
   private String A6494TELMaqCod ;
   private String edtTELMaqCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTELPartida_Internalname ;
   private String edtTELPartida_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTELPartidC_Internalname ;
   private String A6524TELPartidC ;
   private String edtTELPartidC_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTELBarCod_Internalname ;
   private String edtTELBarCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTELBarReo_Internalname ;
   private String edtTELBarReo_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTELBarPar_Internalname ;
   private String A6498TELBarPar ;
   private String edtTELBarPar_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTELFecIni_Internalname ;
   private String edtTELFecIni_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTELHorIni_Internalname ;
   private String edtTELHorIni_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTELKgs_Internalname ;
   private String edtTELKgs_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTELPrg1_Internalname ;
   private String edtTELPrg1_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTELPrg2_Internalname ;
   private String edtTELPrg2_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtTELPrg3_Internalname ;
   private String edtTELPrg3_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtTELPrg4_Internalname ;
   private String edtTELPrg4_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtTELPrg5_Internalname ;
   private String edtTELPrg5_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtTELTpStd_Internalname ;
   private String edtTELTpStd_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtTELCOLib1_Internalname ;
   private String A6508TELCOLib1 ;
   private String edtTELCOLib1_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtTELCoLib2_Internalname ;
   private String A6509TELCoLib2 ;
   private String edtTELCoLib2_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtTELCoLib3_Internalname ;
   private String A6510TELCoLib3 ;
   private String edtTELCoLib3_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtTELDsLib1_Internalname ;
   private String A6511TELDsLib1 ;
   private String edtTELDsLib1_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtTELDsLib2_Internalname ;
   private String A6512TELDsLib2 ;
   private String edtTELDsLib2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTELDsLib3_Internalname ;
   private String A6513TELDsLib3 ;
   private String edtTELDsLib3_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTELNota1_Internalname ;
   private String A6514TELNota1 ;
   private String edtTELNota1_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtTELNota2_Internalname ;
   private String A6515TELNota2 ;
   private String edtTELNota2_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtTELPRdto_Internalname ;
   private String edtTELPRdto_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtTELTpEf_Internalname ;
   private String edtTELTpEf_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtTELTpTo_Internalname ;
   private String edtTELTpTo_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtTELFecFin_Internalname ;
   private String edtTELFecFin_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtTELHorFin_Internalname ;
   private String edtTELHorFin_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtTELRes1_Internalname ;
   private String A6521TELRes1 ;
   private String edtTELRes1_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtTeLRes2_Internalname ;
   private String A6522TeLRes2 ;
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
   private String sMode1623 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ6492TELTarea ;
   private String ZZ6494TELMaqCod ;
   private String ZZ6524TELPartidC ;
   private String ZZ6498TELBarPar ;
   private String ZZ6508TELCOLib1 ;
   private String ZZ6509TELCoLib2 ;
   private String ZZ6510TELCoLib3 ;
   private String ZZ6511TELDsLib1 ;
   private String ZZ6512TELDsLib2 ;
   private String ZZ6513TELDsLib3 ;
   private String ZZ6514TELNota1 ;
   private String ZZ6515TELNota2 ;
   private String ZZ6521TELRes1 ;
   private String ZZ6522TeLRes2 ;
   private java.util.Date Z6500TELHorIni ;
   private java.util.Date Z6520TELHorFin ;
   private java.util.Date A6500TELHorIni ;
   private java.util.Date A6520TELHorFin ;
   private java.util.Date ZZ6500TELHorIni ;
   private java.util.Date ZZ6520TELHorFin ;
   private java.util.Date Z6499TELFecIni ;
   private java.util.Date Z6519TELFecFin ;
   private java.util.Date A6499TELFecIni ;
   private java.util.Date A6519TELFecFin ;
   private java.util.Date ZZ6499TELFecIni ;
   private java.util.Date ZZ6519TELFecFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6492TELTarea ;
   private boolean n6493TELMic ;
   private boolean n6494TELMaqCod ;
   private boolean n6495TELPartida ;
   private boolean n6524TELPartidC ;
   private boolean n6496TELBarCod ;
   private boolean n6497TELBarReo ;
   private boolean n6498TELBarPar ;
   private boolean n6499TELFecIni ;
   private boolean n6500TELHorIni ;
   private boolean n6501TELKgs ;
   private boolean n6502TELPrg1 ;
   private boolean n6503TELPrg2 ;
   private boolean n6504TELPrg3 ;
   private boolean n6505TELPrg4 ;
   private boolean n6506TELPrg5 ;
   private boolean n6507TELTpStd ;
   private boolean n6508TELCOLib1 ;
   private boolean n6509TELCoLib2 ;
   private boolean n6510TELCoLib3 ;
   private boolean n6511TELDsLib1 ;
   private boolean n6512TELDsLib2 ;
   private boolean n6513TELDsLib3 ;
   private boolean n6514TELNota1 ;
   private boolean n6515TELNota2 ;
   private boolean n6516TELPRdto ;
   private boolean n6517TELTpEf ;
   private boolean n6518TELTpTo ;
   private boolean n6519TELFecFin ;
   private boolean n6520TELHorFin ;
   private boolean n6521TELRes1 ;
   private boolean n6522TeLRes2 ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T01GS4_A6491TELId ;
   private String[] T01GS4_A6492TELTarea ;
   private boolean[] T01GS4_n6492TELTarea ;
   private byte[] T01GS4_A6493TELMic ;
   private boolean[] T01GS4_n6493TELMic ;
   private String[] T01GS4_A6494TELMaqCod ;
   private boolean[] T01GS4_n6494TELMaqCod ;
   private long[] T01GS4_A6495TELPartida ;
   private boolean[] T01GS4_n6495TELPartida ;
   private String[] T01GS4_A6524TELPartidC ;
   private boolean[] T01GS4_n6524TELPartidC ;
   private int[] T01GS4_A6496TELBarCod ;
   private boolean[] T01GS4_n6496TELBarCod ;
   private byte[] T01GS4_A6497TELBarReo ;
   private boolean[] T01GS4_n6497TELBarReo ;
   private String[] T01GS4_A6498TELBarPar ;
   private boolean[] T01GS4_n6498TELBarPar ;
   private java.util.Date[] T01GS4_A6499TELFecIni ;
   private boolean[] T01GS4_n6499TELFecIni ;
   private java.util.Date[] T01GS4_A6500TELHorIni ;
   private boolean[] T01GS4_n6500TELHorIni ;
   private java.math.BigDecimal[] T01GS4_A6501TELKgs ;
   private boolean[] T01GS4_n6501TELKgs ;
   private short[] T01GS4_A6502TELPrg1 ;
   private boolean[] T01GS4_n6502TELPrg1 ;
   private short[] T01GS4_A6503TELPrg2 ;
   private boolean[] T01GS4_n6503TELPrg2 ;
   private short[] T01GS4_A6504TELPrg3 ;
   private boolean[] T01GS4_n6504TELPrg3 ;
   private short[] T01GS4_A6505TELPrg4 ;
   private boolean[] T01GS4_n6505TELPrg4 ;
   private short[] T01GS4_A6506TELPrg5 ;
   private boolean[] T01GS4_n6506TELPrg5 ;
   private short[] T01GS4_A6507TELTpStd ;
   private boolean[] T01GS4_n6507TELTpStd ;
   private String[] T01GS4_A6508TELCOLib1 ;
   private boolean[] T01GS4_n6508TELCOLib1 ;
   private String[] T01GS4_A6509TELCoLib2 ;
   private boolean[] T01GS4_n6509TELCoLib2 ;
   private String[] T01GS4_A6510TELCoLib3 ;
   private boolean[] T01GS4_n6510TELCoLib3 ;
   private String[] T01GS4_A6511TELDsLib1 ;
   private boolean[] T01GS4_n6511TELDsLib1 ;
   private String[] T01GS4_A6512TELDsLib2 ;
   private boolean[] T01GS4_n6512TELDsLib2 ;
   private String[] T01GS4_A6513TELDsLib3 ;
   private boolean[] T01GS4_n6513TELDsLib3 ;
   private String[] T01GS4_A6514TELNota1 ;
   private boolean[] T01GS4_n6514TELNota1 ;
   private String[] T01GS4_A6515TELNota2 ;
   private boolean[] T01GS4_n6515TELNota2 ;
   private java.math.BigDecimal[] T01GS4_A6516TELPRdto ;
   private boolean[] T01GS4_n6516TELPRdto ;
   private int[] T01GS4_A6517TELTpEf ;
   private boolean[] T01GS4_n6517TELTpEf ;
   private int[] T01GS4_A6518TELTpTo ;
   private boolean[] T01GS4_n6518TELTpTo ;
   private java.util.Date[] T01GS4_A6519TELFecFin ;
   private boolean[] T01GS4_n6519TELFecFin ;
   private java.util.Date[] T01GS4_A6520TELHorFin ;
   private boolean[] T01GS4_n6520TELHorFin ;
   private String[] T01GS4_A6521TELRes1 ;
   private boolean[] T01GS4_n6521TELRes1 ;
   private String[] T01GS4_A6522TeLRes2 ;
   private boolean[] T01GS4_n6522TeLRes2 ;
   private long[] T01GS5_A6491TELId ;
   private long[] T01GS3_A6491TELId ;
   private String[] T01GS3_A6492TELTarea ;
   private boolean[] T01GS3_n6492TELTarea ;
   private byte[] T01GS3_A6493TELMic ;
   private boolean[] T01GS3_n6493TELMic ;
   private String[] T01GS3_A6494TELMaqCod ;
   private boolean[] T01GS3_n6494TELMaqCod ;
   private long[] T01GS3_A6495TELPartida ;
   private boolean[] T01GS3_n6495TELPartida ;
   private String[] T01GS3_A6524TELPartidC ;
   private boolean[] T01GS3_n6524TELPartidC ;
   private int[] T01GS3_A6496TELBarCod ;
   private boolean[] T01GS3_n6496TELBarCod ;
   private byte[] T01GS3_A6497TELBarReo ;
   private boolean[] T01GS3_n6497TELBarReo ;
   private String[] T01GS3_A6498TELBarPar ;
   private boolean[] T01GS3_n6498TELBarPar ;
   private java.util.Date[] T01GS3_A6499TELFecIni ;
   private boolean[] T01GS3_n6499TELFecIni ;
   private java.util.Date[] T01GS3_A6500TELHorIni ;
   private boolean[] T01GS3_n6500TELHorIni ;
   private java.math.BigDecimal[] T01GS3_A6501TELKgs ;
   private boolean[] T01GS3_n6501TELKgs ;
   private short[] T01GS3_A6502TELPrg1 ;
   private boolean[] T01GS3_n6502TELPrg1 ;
   private short[] T01GS3_A6503TELPrg2 ;
   private boolean[] T01GS3_n6503TELPrg2 ;
   private short[] T01GS3_A6504TELPrg3 ;
   private boolean[] T01GS3_n6504TELPrg3 ;
   private short[] T01GS3_A6505TELPrg4 ;
   private boolean[] T01GS3_n6505TELPrg4 ;
   private short[] T01GS3_A6506TELPrg5 ;
   private boolean[] T01GS3_n6506TELPrg5 ;
   private short[] T01GS3_A6507TELTpStd ;
   private boolean[] T01GS3_n6507TELTpStd ;
   private String[] T01GS3_A6508TELCOLib1 ;
   private boolean[] T01GS3_n6508TELCOLib1 ;
   private String[] T01GS3_A6509TELCoLib2 ;
   private boolean[] T01GS3_n6509TELCoLib2 ;
   private String[] T01GS3_A6510TELCoLib3 ;
   private boolean[] T01GS3_n6510TELCoLib3 ;
   private String[] T01GS3_A6511TELDsLib1 ;
   private boolean[] T01GS3_n6511TELDsLib1 ;
   private String[] T01GS3_A6512TELDsLib2 ;
   private boolean[] T01GS3_n6512TELDsLib2 ;
   private String[] T01GS3_A6513TELDsLib3 ;
   private boolean[] T01GS3_n6513TELDsLib3 ;
   private String[] T01GS3_A6514TELNota1 ;
   private boolean[] T01GS3_n6514TELNota1 ;
   private String[] T01GS3_A6515TELNota2 ;
   private boolean[] T01GS3_n6515TELNota2 ;
   private java.math.BigDecimal[] T01GS3_A6516TELPRdto ;
   private boolean[] T01GS3_n6516TELPRdto ;
   private int[] T01GS3_A6517TELTpEf ;
   private boolean[] T01GS3_n6517TELTpEf ;
   private int[] T01GS3_A6518TELTpTo ;
   private boolean[] T01GS3_n6518TELTpTo ;
   private java.util.Date[] T01GS3_A6519TELFecFin ;
   private boolean[] T01GS3_n6519TELFecFin ;
   private java.util.Date[] T01GS3_A6520TELHorFin ;
   private boolean[] T01GS3_n6520TELHorFin ;
   private String[] T01GS3_A6521TELRes1 ;
   private boolean[] T01GS3_n6521TELRes1 ;
   private String[] T01GS3_A6522TeLRes2 ;
   private boolean[] T01GS3_n6522TeLRes2 ;
   private long[] T01GS6_A6491TELId ;
   private long[] T01GS7_A6491TELId ;
   private long[] T01GS2_A6491TELId ;
   private String[] T01GS2_A6492TELTarea ;
   private boolean[] T01GS2_n6492TELTarea ;
   private byte[] T01GS2_A6493TELMic ;
   private boolean[] T01GS2_n6493TELMic ;
   private String[] T01GS2_A6494TELMaqCod ;
   private boolean[] T01GS2_n6494TELMaqCod ;
   private long[] T01GS2_A6495TELPartida ;
   private boolean[] T01GS2_n6495TELPartida ;
   private String[] T01GS2_A6524TELPartidC ;
   private boolean[] T01GS2_n6524TELPartidC ;
   private int[] T01GS2_A6496TELBarCod ;
   private boolean[] T01GS2_n6496TELBarCod ;
   private byte[] T01GS2_A6497TELBarReo ;
   private boolean[] T01GS2_n6497TELBarReo ;
   private String[] T01GS2_A6498TELBarPar ;
   private boolean[] T01GS2_n6498TELBarPar ;
   private java.util.Date[] T01GS2_A6499TELFecIni ;
   private boolean[] T01GS2_n6499TELFecIni ;
   private java.util.Date[] T01GS2_A6500TELHorIni ;
   private boolean[] T01GS2_n6500TELHorIni ;
   private java.math.BigDecimal[] T01GS2_A6501TELKgs ;
   private boolean[] T01GS2_n6501TELKgs ;
   private short[] T01GS2_A6502TELPrg1 ;
   private boolean[] T01GS2_n6502TELPrg1 ;
   private short[] T01GS2_A6503TELPrg2 ;
   private boolean[] T01GS2_n6503TELPrg2 ;
   private short[] T01GS2_A6504TELPrg3 ;
   private boolean[] T01GS2_n6504TELPrg3 ;
   private short[] T01GS2_A6505TELPrg4 ;
   private boolean[] T01GS2_n6505TELPrg4 ;
   private short[] T01GS2_A6506TELPrg5 ;
   private boolean[] T01GS2_n6506TELPrg5 ;
   private short[] T01GS2_A6507TELTpStd ;
   private boolean[] T01GS2_n6507TELTpStd ;
   private String[] T01GS2_A6508TELCOLib1 ;
   private boolean[] T01GS2_n6508TELCOLib1 ;
   private String[] T01GS2_A6509TELCoLib2 ;
   private boolean[] T01GS2_n6509TELCoLib2 ;
   private String[] T01GS2_A6510TELCoLib3 ;
   private boolean[] T01GS2_n6510TELCoLib3 ;
   private String[] T01GS2_A6511TELDsLib1 ;
   private boolean[] T01GS2_n6511TELDsLib1 ;
   private String[] T01GS2_A6512TELDsLib2 ;
   private boolean[] T01GS2_n6512TELDsLib2 ;
   private String[] T01GS2_A6513TELDsLib3 ;
   private boolean[] T01GS2_n6513TELDsLib3 ;
   private String[] T01GS2_A6514TELNota1 ;
   private boolean[] T01GS2_n6514TELNota1 ;
   private String[] T01GS2_A6515TELNota2 ;
   private boolean[] T01GS2_n6515TELNota2 ;
   private java.math.BigDecimal[] T01GS2_A6516TELPRdto ;
   private boolean[] T01GS2_n6516TELPRdto ;
   private int[] T01GS2_A6517TELTpEf ;
   private boolean[] T01GS2_n6517TELTpEf ;
   private int[] T01GS2_A6518TELTpTo ;
   private boolean[] T01GS2_n6518TELTpTo ;
   private java.util.Date[] T01GS2_A6519TELFecFin ;
   private boolean[] T01GS2_n6519TELFecFin ;
   private java.util.Date[] T01GS2_A6520TELHorFin ;
   private boolean[] T01GS2_n6520TELHorFin ;
   private String[] T01GS2_A6521TELRes1 ;
   private boolean[] T01GS2_n6521TELRes1 ;
   private String[] T01GS2_A6522TeLRes2 ;
   private boolean[] T01GS2_n6522TeLRes2 ;
   private long[] T01GS11_A6491TELId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlavora__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlavora__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlavora__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlavora__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GS2", "SELECT TELId, TELTarea, TELMic, TELMaqCod, TELPartida, TELPartidC, TELBarCod, TELBarReo, TELBarPar, TELFecIni, TELHorIni, TELKgs, TELPrg1, TELPrg2, TELPrg3, TELPrg4, TELPrg5, TELTpStd, TELCOLib1, TELCoLib2, TELCoLib3, TELDsLib1, TELDsLib2, TELDsLib3, TELNota1, TELNota2, TELPRdto, TELTpEf, TELTpTo, TELFecFin, TELHorFin, TELRes1, TeLRes2 FROM TXPLAVORA WHERE TELId = ?  FOR UPDATE OF TELTarea, TELMic, TELMaqCod, TELPartida, TELPartidC, TELBarCod, TELBarReo, TELBarPar, TELFecIni, TELHorIni, TELKgs, TELPrg1, TELPrg2, TELPrg3, TELPrg4, TELPrg5, TELTpStd, TELCOLib1, TELCoLib2, TELCoLib3, TELDsLib1, TELDsLib2, TELDsLib3, TELNota1, TELNota2, TELPRdto, TELTpEf, TELTpTo, TELFecFin, TELHorFin, TELRes1, TeLRes2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GS3", "SELECT TELId, TELTarea, TELMic, TELMaqCod, TELPartida, TELPartidC, TELBarCod, TELBarReo, TELBarPar, TELFecIni, TELHorIni, TELKgs, TELPrg1, TELPrg2, TELPrg3, TELPrg4, TELPrg5, TELTpStd, TELCOLib1, TELCoLib2, TELCoLib3, TELDsLib1, TELDsLib2, TELDsLib3, TELNota1, TELNota2, TELPRdto, TELTpEf, TELTpTo, TELFecFin, TELHorFin, TELRes1, TeLRes2 FROM TXPLAVORA WHERE TELId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GS4", "SELECT /*+ FIRST_ROWS(100) */ TM1.TELId, TM1.TELTarea, TM1.TELMic, TM1.TELMaqCod, TM1.TELPartida, TM1.TELPartidC, TM1.TELBarCod, TM1.TELBarReo, TM1.TELBarPar, TM1.TELFecIni, TM1.TELHorIni, TM1.TELKgs, TM1.TELPrg1, TM1.TELPrg2, TM1.TELPrg3, TM1.TELPrg4, TM1.TELPrg5, TM1.TELTpStd, TM1.TELCOLib1, TM1.TELCoLib2, TM1.TELCoLib3, TM1.TELDsLib1, TM1.TELDsLib2, TM1.TELDsLib3, TM1.TELNota1, TM1.TELNota2, TM1.TELPRdto, TM1.TELTpEf, TM1.TELTpTo, TM1.TELFecFin, TM1.TELHorFin, TM1.TELRes1, TM1.TeLRes2 FROM TXPLAVORA TM1 WHERE TM1.TELId = ? ORDER BY TM1.TELId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GS5", "SELECT /*+ FIRST_ROWS(1) */ TELId FROM TXPLAVORA WHERE TELId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GS6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TELId FROM TXPLAVORA WHERE ( TELId > ?) ORDER BY TELId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GS7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TELId FROM TXPLAVORA WHERE ( TELId < ?) ORDER BY TELId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GS8", "INSERT INTO TXPLAVORA(TELId, TELTarea, TELMic, TELMaqCod, TELPartida, TELPartidC, TELBarCod, TELBarReo, TELBarPar, TELFecIni, TELHorIni, TELKgs, TELPrg1, TELPrg2, TELPrg3, TELPrg4, TELPrg5, TELTpStd, TELCOLib1, TELCoLib2, TELCoLib3, TELDsLib1, TELDsLib2, TELDsLib3, TELNota1, TELNota2, TELPRdto, TELTpEf, TELTpTo, TELFecFin, TELHorFin, TELRes1, TeLRes2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLAVORA")
         ,new UpdateCursor("T01GS9", "UPDATE TXPLAVORA SET TELTarea=?, TELMic=?, TELMaqCod=?, TELPartida=?, TELPartidC=?, TELBarCod=?, TELBarReo=?, TELBarPar=?, TELFecIni=?, TELHorIni=?, TELKgs=?, TELPrg1=?, TELPrg2=?, TELPrg3=?, TELPrg4=?, TELPrg5=?, TELTpStd=?, TELCOLib1=?, TELCoLib2=?, TELCoLib3=?, TELDsLib1=?, TELDsLib2=?, TELDsLib3=?, TELNota1=?, TELNota2=?, TELPRdto=?, TELTpEf=?, TELTpTo=?, TELFecFin=?, TELHorFin=?, TELRes1=?, TeLRes2=?  WHERE TELId = ?", GX_NOMASK, "TXPLAVORA")
         ,new UpdateCursor("T01GS10", "DELETE FROM TXPLAVORA  WHERE TELId = ?", GX_NOMASK, "TXPLAVORA")
         ,new ForEachCursor("T01GS11", "SELECT /*+ FIRST_ROWS(100) */ TELId FROM TXPLAVORA ORDER BY TELId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 60);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 60);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDateTime(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 342);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 60);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 60);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDateTime(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 342);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 60);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 60);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDateTime(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 342);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
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
                  stmt.setString(4, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[8]).longValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 12);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[32]).shortValue());
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
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 6);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 6);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 6);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 30);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 30);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 30);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 60);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 60);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[54]).intValue());
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
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[58]);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(31, (java.util.Date)parms[60], false);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 6);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 342);
               }
               return;
            case 7 :
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 12);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
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
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 6);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 6);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 6);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 30);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 30);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 30);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 60);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 60);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[53]).intValue());
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
                  stmt.setNull( 29 , Types.DATE );
               }
               else
               {
                  stmt.setDate(29, (java.util.Date)parms[57]);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(30, (java.util.Date)parms[59], false);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 6);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 342);
               }
               stmt.setLong(33, ((Number) parms[64]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

