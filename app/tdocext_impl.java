package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdocext_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documentos Externos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdocext_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdocext_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdocext_impl.class ));
   }

   public tdocext_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDocExt.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Tipo Formulario", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDETipFor_Internalname, GXutil.rtrim( A5279DETipFor), GXutil.rtrim( localUtil.format( A5279DETipFor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDETipFor_Jsonclick, 0, "", "", "", "", "", 1, edtDETipFor_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nro. Formulario", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDENumFor_Internalname, GXutil.ltrim( localUtil.ntoc( A5280DENumFor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDENumFor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5280DENumFor), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5280DENumFor), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDENumFor_Jsonclick, 0, "", "", "", "", "", 1, edtDENumFor_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDeCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5281DeCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDeCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5281DeCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5281DeCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDeCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtDeCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Artículo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEArtCod_Internalname, GXutil.rtrim( A5282DEArtCod), GXutil.rtrim( localUtil.format( A5282DEArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDEArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEMaqCod_Internalname, GXutil.rtrim( A5283DEMaqCod), GXutil.rtrim( localUtil.format( A5283DEMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtDEMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "DEFasCod", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEFasCod_Internalname, GXutil.rtrim( A5284DEFasCod), GXutil.rtrim( localUtil.format( A5284DEFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtDEFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Usuario Alta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEUsurAlt_Internalname, GXutil.rtrim( A5285DEUsurAlt), GXutil.rtrim( localUtil.format( A5285DEUsurAlt, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEUsurAlt_Jsonclick, 0, "", "", "", "", "", 1, edtDEUsurAlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Usuario ult. modif.", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEUsurMod_Internalname, GXutil.rtrim( A5286DEUsurMod), GXutil.rtrim( localUtil.format( A5286DEUsurMod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEUsurMod_Jsonclick, 0, "", "", "", "", "", 1, edtDEUsurMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Alta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDEFecAlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEFecAlt_Internalname, localUtil.format(A5287DEFecAlt, "99/99/99"), localUtil.format( A5287DEFecAlt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEFecAlt_Jsonclick, 0, "", "", "", "", "", 1, edtDEFecAlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDocExt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDEFecAlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDEFecAlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDocExt.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha ult. modificacion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDocExt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDEFecMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDEFecMod_Internalname, localUtil.format(A5288DEFecMod, "99/99/99"), localUtil.format( A5288DEFecMod, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEFecMod_Jsonclick, 0, "", "", "", "", "", 1, edtDEFecMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDocExt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDEFecMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDEFecMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDocExt.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDocExt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDocExt.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z5279DETipFor = httpContext.cgiGet( "Z5279DETipFor") ;
         Z5280DENumFor = (int)(localUtil.ctol( httpContext.cgiGet( "Z5280DENumFor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5281DeCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z5281DeCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5282DEArtCod = httpContext.cgiGet( "Z5282DEArtCod") ;
         Z5283DEMaqCod = httpContext.cgiGet( "Z5283DEMaqCod") ;
         Z5284DEFasCod = httpContext.cgiGet( "Z5284DEFasCod") ;
         Z5285DEUsurAlt = httpContext.cgiGet( "Z5285DEUsurAlt") ;
         Z5286DEUsurMod = httpContext.cgiGet( "Z5286DEUsurMod") ;
         Z5287DEFecAlt = localUtil.ctod( httpContext.cgiGet( "Z5287DEFecAlt"), 0) ;
         Z5288DEFecMod = localUtil.ctod( httpContext.cgiGet( "Z5288DEFecMod"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5279DETipFor = httpContext.cgiGet( edtDETipFor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDENumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDENumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DENUMFOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDENumFor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5280DENumFor = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
         }
         else
         {
            A5280DENumFor = (int)(localUtil.ctol( httpContext.cgiGet( edtDENumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDeCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDeCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DECLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDeCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5281DeCliCod = 0 ;
            n5281DeCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5281DeCliCod), 6, 0));
         }
         else
         {
            A5281DeCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDeCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5281DeCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5281DeCliCod), 6, 0));
         }
         A5282DEArtCod = httpContext.cgiGet( edtDEArtCod_Internalname) ;
         n5282DEArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5282DEArtCod", A5282DEArtCod);
         A5283DEMaqCod = httpContext.cgiGet( edtDEMaqCod_Internalname) ;
         n5283DEMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5283DEMaqCod", A5283DEMaqCod);
         A5284DEFasCod = httpContext.cgiGet( edtDEFasCod_Internalname) ;
         n5284DEFasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5284DEFasCod", A5284DEFasCod);
         A5285DEUsurAlt = GXutil.upper( httpContext.cgiGet( edtDEUsurAlt_Internalname)) ;
         n5285DEUsurAlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5285DEUsurAlt", A5285DEUsurAlt);
         A5286DEUsurMod = GXutil.upper( httpContext.cgiGet( edtDEUsurMod_Internalname)) ;
         n5286DEUsurMod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5286DEUsurMod", A5286DEUsurMod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDEFecAlt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEFECALT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDEFecAlt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5287DEFecAlt = GXutil.nullDate() ;
            n5287DEFecAlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
         }
         else
         {
            A5287DEFecAlt = localUtil.ctod( httpContext.cgiGet( edtDEFecAlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5287DEFecAlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDEFecMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEFECMOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDEFecMod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5288DEFecMod = GXutil.nullDate() ;
            n5288DEFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
         }
         else
         {
            A5288DEFecMod = localUtil.ctod( httpContext.cgiGet( edtDEFecMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5288DEFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
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
            A5279DETipFor = httpContext.GetPar( "DETipFor") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
            A5280DENumFor = (int)(GXutil.lval( httpContext.GetPar( "DENumFor"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
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
            initAll1GE1607( ) ;
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
      disableAttributes1GE1607( ) ;
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

   public void confirm_1GE0( )
   {
      beforeValidate1GE1607( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GE1607( ) ;
         }
         else
         {
            checkExtendedTable1GE1607( ) ;
            if ( AnyError == 0 )
            {
               zm1GE1607( 2) ;
            }
            closeExtendedTableCursors1GE1607( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GE0( ) ;
      }
   }

   public void resetCaption1GE0( )
   {
   }

   public void zm1GE1607( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5281DeCliCod = T01GE3_A5281DeCliCod[0] ;
            Z5282DEArtCod = T01GE3_A5282DEArtCod[0] ;
            Z5283DEMaqCod = T01GE3_A5283DEMaqCod[0] ;
            Z5284DEFasCod = T01GE3_A5284DEFasCod[0] ;
            Z5285DEUsurAlt = T01GE3_A5285DEUsurAlt[0] ;
            Z5286DEUsurMod = T01GE3_A5286DEUsurMod[0] ;
            Z5287DEFecAlt = T01GE3_A5287DEFecAlt[0] ;
            Z5288DEFecMod = T01GE3_A5288DEFecMod[0] ;
         }
         else
         {
            Z5281DeCliCod = A5281DeCliCod ;
            Z5282DEArtCod = A5282DEArtCod ;
            Z5283DEMaqCod = A5283DEMaqCod ;
            Z5284DEFasCod = A5284DEFasCod ;
            Z5285DEUsurAlt = A5285DEUsurAlt ;
            Z5286DEUsurMod = A5286DEUsurMod ;
            Z5287DEFecAlt = A5287DEFecAlt ;
            Z5288DEFecMod = A5288DEFecMod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z5279DETipFor = A5279DETipFor ;
         Z5280DENumFor = A5280DENumFor ;
         Z5281DeCliCod = A5281DeCliCod ;
         Z5282DEArtCod = A5282DEArtCod ;
         Z5283DEMaqCod = A5283DEMaqCod ;
         Z5284DEFasCod = A5284DEFasCod ;
         Z5285DEUsurAlt = A5285DEUsurAlt ;
         Z5286DEUsurMod = A5286DEUsurMod ;
         Z5287DEFecAlt = A5287DEFecAlt ;
         Z5288DEFecMod = A5288DEFecMod ;
         Z396EmprCod = A396EmprCod ;
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

   public void load1GE1607( )
   {
      /* Using cursor T01GE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1607 = (short)(1) ;
         A5281DeCliCod = T01GE5_A5281DeCliCod[0] ;
         n5281DeCliCod = T01GE5_n5281DeCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5281DeCliCod), 6, 0));
         A5282DEArtCod = T01GE5_A5282DEArtCod[0] ;
         n5282DEArtCod = T01GE5_n5282DEArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5282DEArtCod", A5282DEArtCod);
         A5283DEMaqCod = T01GE5_A5283DEMaqCod[0] ;
         n5283DEMaqCod = T01GE5_n5283DEMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5283DEMaqCod", A5283DEMaqCod);
         A5284DEFasCod = T01GE5_A5284DEFasCod[0] ;
         n5284DEFasCod = T01GE5_n5284DEFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5284DEFasCod", A5284DEFasCod);
         A5285DEUsurAlt = T01GE5_A5285DEUsurAlt[0] ;
         n5285DEUsurAlt = T01GE5_n5285DEUsurAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5285DEUsurAlt", A5285DEUsurAlt);
         A5286DEUsurMod = T01GE5_A5286DEUsurMod[0] ;
         n5286DEUsurMod = T01GE5_n5286DEUsurMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5286DEUsurMod", A5286DEUsurMod);
         A5287DEFecAlt = T01GE5_A5287DEFecAlt[0] ;
         n5287DEFecAlt = T01GE5_n5287DEFecAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
         A5288DEFecMod = T01GE5_A5288DEFecMod[0] ;
         n5288DEFecMod = T01GE5_n5288DEFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
         zm1GE1607( -1) ;
      }
      pr_default.close(3);
      onLoadActions1GE1607( ) ;
   }

   public void onLoadActions1GE1607( )
   {
   }

   public void checkExtendedTable1GE1607( )
   {
      nIsDirty_1607 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GE4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1GE1607( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01GE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1GE1607( )
   {
      /* Using cursor T01GE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1607 = (short)(1) ;
      }
      else
      {
         RcdFound1607 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GE1607( 1) ;
         RcdFound1607 = (short)(1) ;
         A5279DETipFor = T01GE3_A5279DETipFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
         A5280DENumFor = T01GE3_A5280DENumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
         A5281DeCliCod = T01GE3_A5281DeCliCod[0] ;
         n5281DeCliCod = T01GE3_n5281DeCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5281DeCliCod), 6, 0));
         A5282DEArtCod = T01GE3_A5282DEArtCod[0] ;
         n5282DEArtCod = T01GE3_n5282DEArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5282DEArtCod", A5282DEArtCod);
         A5283DEMaqCod = T01GE3_A5283DEMaqCod[0] ;
         n5283DEMaqCod = T01GE3_n5283DEMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5283DEMaqCod", A5283DEMaqCod);
         A5284DEFasCod = T01GE3_A5284DEFasCod[0] ;
         n5284DEFasCod = T01GE3_n5284DEFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5284DEFasCod", A5284DEFasCod);
         A5285DEUsurAlt = T01GE3_A5285DEUsurAlt[0] ;
         n5285DEUsurAlt = T01GE3_n5285DEUsurAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5285DEUsurAlt", A5285DEUsurAlt);
         A5286DEUsurMod = T01GE3_A5286DEUsurMod[0] ;
         n5286DEUsurMod = T01GE3_n5286DEUsurMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5286DEUsurMod", A5286DEUsurMod);
         A5287DEFecAlt = T01GE3_A5287DEFecAlt[0] ;
         n5287DEFecAlt = T01GE3_n5287DEFecAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
         A5288DEFecMod = T01GE3_A5288DEFecMod[0] ;
         n5288DEFecMod = T01GE3_n5288DEFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
         A396EmprCod = T01GE3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z5279DETipFor = A5279DETipFor ;
         Z5280DENumFor = A5280DENumFor ;
         sMode1607 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GE1607( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1607 = (short)(0) ;
            initializeNonKey1GE1607( ) ;
         }
         Gx_mode = sMode1607 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1607 = (short)(0) ;
         initializeNonKey1GE1607( ) ;
         sMode1607 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1607 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GE1607( ) ;
      if ( RcdFound1607 == 0 )
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
      RcdFound1607 = (short)(0) ;
      /* Using cursor T01GE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A5279DETipFor, A5279DETipFor, A396EmprCod, Integer.valueOf(A5280DENumFor)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GE8_A5279DETipFor[0], A5279DETipFor) < 0 ) || ( GXutil.strcmp(T01GE8_A5279DETipFor[0], A5279DETipFor) == 0 ) && ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GE8_A5280DENumFor[0] < A5280DENumFor ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GE8_A5279DETipFor[0], A5279DETipFor) > 0 ) || ( GXutil.strcmp(T01GE8_A5279DETipFor[0], A5279DETipFor) == 0 ) && ( GXutil.strcmp(T01GE8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GE8_A5280DENumFor[0] > A5280DENumFor ) ) )
         {
            A396EmprCod = T01GE8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5279DETipFor = T01GE8_A5279DETipFor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
            A5280DENumFor = T01GE8_A5280DENumFor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
            RcdFound1607 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1607 = (short)(0) ;
      /* Using cursor T01GE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A5279DETipFor, A5279DETipFor, A396EmprCod, Integer.valueOf(A5280DENumFor)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GE9_A5279DETipFor[0], A5279DETipFor) > 0 ) || ( GXutil.strcmp(T01GE9_A5279DETipFor[0], A5279DETipFor) == 0 ) && ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GE9_A5280DENumFor[0] > A5280DENumFor ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GE9_A5279DETipFor[0], A5279DETipFor) < 0 ) || ( GXutil.strcmp(T01GE9_A5279DETipFor[0], A5279DETipFor) == 0 ) && ( GXutil.strcmp(T01GE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GE9_A5280DENumFor[0] < A5280DENumFor ) ) )
         {
            A396EmprCod = T01GE9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5279DETipFor = T01GE9_A5279DETipFor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
            A5280DENumFor = T01GE9_A5280DENumFor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
            RcdFound1607 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GE1607( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GE1607( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1607 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5279DETipFor, Z5279DETipFor) != 0 ) || ( A5280DENumFor != Z5280DENumFor ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5279DETipFor = Z5279DETipFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
               A5280DENumFor = Z5280DENumFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1GE1607( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5279DETipFor, Z5279DETipFor) != 0 ) || ( A5280DENumFor != Z5280DENumFor ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GE1607( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GE1607( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5279DETipFor, Z5279DETipFor) != 0 ) || ( A5280DENumFor != Z5280DENumFor ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5279DETipFor = Z5279DETipFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
         A5280DENumFor = Z5280DENumFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1GE1607( ) ;
      if ( RcdFound1607 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5279DETipFor, Z5279DETipFor) != 0 ) || ( A5280DENumFor != Z5280DENumFor ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5279DETipFor = Z5279DETipFor ;
            httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
            A5280DENumFor = Z5280DENumFor ;
            httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5279DETipFor, Z5279DETipFor) != 0 ) || ( A5280DENumFor != Z5280DENumFor ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdocext");
      GX_FocusControl = edtDeCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GE0( ) ;
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
      if ( RcdFound1607 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDeCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GE1607( ) ;
      if ( RcdFound1607 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDeCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GE1607( ) ;
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
      if ( RcdFound1607 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDeCliCod_Internalname ;
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
      if ( RcdFound1607 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDeCliCod_Internalname ;
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
      scanStart1GE1607( ) ;
      if ( RcdFound1607 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1607 != 0 )
         {
            scanNext1GE1607( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDeCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GE1607( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GE1607( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDocExt"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5281DeCliCod != T01GE2_A5281DeCliCod[0] ) || ( GXutil.strcmp(Z5282DEArtCod, T01GE2_A5282DEArtCod[0]) != 0 ) || ( GXutil.strcmp(Z5283DEMaqCod, T01GE2_A5283DEMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z5284DEFasCod, T01GE2_A5284DEFasCod[0]) != 0 ) || ( GXutil.strcmp(Z5285DEUsurAlt, T01GE2_A5285DEUsurAlt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5286DEUsurMod, T01GE2_A5286DEUsurMod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5287DEFecAlt), GXutil.resetTime(T01GE2_A5287DEFecAlt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5288DEFecMod), GXutil.resetTime(T01GE2_A5288DEFecMod[0])) ) )
         {
            if ( Z5281DeCliCod != T01GE2_A5281DeCliCod[0] )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DeCliCod");
               GXutil.writeLogRaw("Old: ",Z5281DeCliCod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5281DeCliCod[0]);
            }
            if ( GXutil.strcmp(Z5282DEArtCod, T01GE2_A5282DEArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEArtCod");
               GXutil.writeLogRaw("Old: ",Z5282DEArtCod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5282DEArtCod[0]);
            }
            if ( GXutil.strcmp(Z5283DEMaqCod, T01GE2_A5283DEMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEMaqCod");
               GXutil.writeLogRaw("Old: ",Z5283DEMaqCod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5283DEMaqCod[0]);
            }
            if ( GXutil.strcmp(Z5284DEFasCod, T01GE2_A5284DEFasCod[0]) != 0 )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEFasCod");
               GXutil.writeLogRaw("Old: ",Z5284DEFasCod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5284DEFasCod[0]);
            }
            if ( GXutil.strcmp(Z5285DEUsurAlt, T01GE2_A5285DEUsurAlt[0]) != 0 )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEUsurAlt");
               GXutil.writeLogRaw("Old: ",Z5285DEUsurAlt);
               GXutil.writeLogRaw("Current: ",T01GE2_A5285DEUsurAlt[0]);
            }
            if ( GXutil.strcmp(Z5286DEUsurMod, T01GE2_A5286DEUsurMod[0]) != 0 )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEUsurMod");
               GXutil.writeLogRaw("Old: ",Z5286DEUsurMod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5286DEUsurMod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5287DEFecAlt), GXutil.resetTime(T01GE2_A5287DEFecAlt[0])) ) )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEFecAlt");
               GXutil.writeLogRaw("Old: ",Z5287DEFecAlt);
               GXutil.writeLogRaw("Current: ",T01GE2_A5287DEFecAlt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5288DEFecMod), GXutil.resetTime(T01GE2_A5288DEFecMod[0])) ) )
            {
               GXutil.writeLogln("tdocext:[seudo value changed for attri]"+"DEFecMod");
               GXutil.writeLogRaw("Old: ",Z5288DEFecMod);
               GXutil.writeLogRaw("Current: ",T01GE2_A5288DEFecMod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDocExt"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GE1607( )
   {
      beforeValidate1GE1607( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GE1607( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GE1607( 0) ;
         checkOptimisticConcurrency1GE1607( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GE1607( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GE1607( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GE10 */
                  pr_default.execute(8, new Object[] {A5279DETipFor, Integer.valueOf(A5280DENumFor), Boolean.valueOf(n5281DeCliCod), Integer.valueOf(A5281DeCliCod), Boolean.valueOf(n5282DEArtCod), A5282DEArtCod, Boolean.valueOf(n5283DEMaqCod), A5283DEMaqCod, Boolean.valueOf(n5284DEFasCod), A5284DEFasCod, Boolean.valueOf(n5285DEUsurAlt), A5285DEUsurAlt, Boolean.valueOf(n5286DEUsurMod), A5286DEUsurMod, Boolean.valueOf(n5287DEFecAlt), A5287DEFecAlt, Boolean.valueOf(n5288DEFecMod), A5288DEFecMod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDocExt");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1GE0( ) ;
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
            load1GE1607( ) ;
         }
         endLevel1GE1607( ) ;
      }
      closeExtendedTableCursors1GE1607( ) ;
   }

   public void update1GE1607( )
   {
      beforeValidate1GE1607( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GE1607( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GE1607( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GE1607( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GE1607( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GE11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n5281DeCliCod), Integer.valueOf(A5281DeCliCod), Boolean.valueOf(n5282DEArtCod), A5282DEArtCod, Boolean.valueOf(n5283DEMaqCod), A5283DEMaqCod, Boolean.valueOf(n5284DEFasCod), A5284DEFasCod, Boolean.valueOf(n5285DEUsurAlt), A5285DEUsurAlt, Boolean.valueOf(n5286DEUsurMod), A5286DEUsurMod, Boolean.valueOf(n5287DEFecAlt), A5287DEFecAlt, Boolean.valueOf(n5288DEFecMod), A5288DEFecMod, A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDocExt");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDocExt"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GE1607( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GE0( ) ;
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
         endLevel1GE1607( ) ;
      }
      closeExtendedTableCursors1GE1607( ) ;
   }

   public void deferredUpdate1GE1607( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GE1607( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GE1607( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GE1607( ) ;
         afterConfirm1GE1607( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GE1607( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GE12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A5279DETipFor, Integer.valueOf(A5280DENumFor)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDocExt");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1607 == 0 )
                     {
                        initAll1GE1607( ) ;
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
                     resetCaption1GE0( ) ;
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
      sMode1607 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GE1607( ) ;
      Gx_mode = sMode1607 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GE1607( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GE1607( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GE1607( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdocext");
         if ( AnyError == 0 )
         {
            confirmValues1GE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdocext");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GE1607( )
   {
      /* Using cursor T01GE13 */
      pr_default.execute(11);
      RcdFound1607 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1607 = (short)(1) ;
         A396EmprCod = T01GE13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5279DETipFor = T01GE13_A5279DETipFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
         A5280DENumFor = T01GE13_A5280DENumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GE1607( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1607 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1607 = (short)(1) ;
         A396EmprCod = T01GE13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5279DETipFor = T01GE13_A5279DETipFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
         A5280DENumFor = T01GE13_A5280DENumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
      }
   }

   public void scanEnd1GE1607( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1GE1607( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GE1607( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GE1607( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GE1607( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GE1607( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GE1607( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GE1607( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDETipFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDETipFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDETipFor_Enabled), 5, 0), true);
      edtDENumFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDENumFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDENumFor_Enabled), 5, 0), true);
      edtDeCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDeCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDeCliCod_Enabled), 5, 0), true);
      edtDEArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEArtCod_Enabled), 5, 0), true);
      edtDEMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEMaqCod_Enabled), 5, 0), true);
      edtDEFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEFasCod_Enabled), 5, 0), true);
      edtDEUsurAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEUsurAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEUsurAlt_Enabled), 5, 0), true);
      edtDEUsurMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEUsurMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEUsurMod_Enabled), 5, 0), true);
      edtDEFecAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEFecAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEFecAlt_Enabled), 5, 0), true);
      edtDEFecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDEFecMod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GE1607( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GE0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdocext", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5279DETipFor", GXutil.rtrim( Z5279DETipFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5280DENumFor", GXutil.ltrim( localUtil.ntoc( Z5280DENumFor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5281DeCliCod", GXutil.ltrim( localUtil.ntoc( Z5281DeCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5282DEArtCod", GXutil.rtrim( Z5282DEArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5283DEMaqCod", GXutil.rtrim( Z5283DEMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5284DEFasCod", GXutil.rtrim( Z5284DEFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5285DEUsurAlt", GXutil.rtrim( Z5285DEUsurAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5286DEUsurMod", GXutil.rtrim( Z5286DEUsurMod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5287DEFecAlt", localUtil.dtoc( Z5287DEFecAlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5288DEFecMod", localUtil.dtoc( Z5288DEFecMod, 0, "/"));
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
      return formatLink("app.tdocext", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDocExt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documentos Externos", "") ;
   }

   public void initializeNonKey1GE1607( )
   {
      A5281DeCliCod = 0 ;
      n5281DeCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5281DeCliCod), 6, 0));
      A5282DEArtCod = "" ;
      n5282DEArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5282DEArtCod", A5282DEArtCod);
      A5283DEMaqCod = "" ;
      n5283DEMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5283DEMaqCod", A5283DEMaqCod);
      A5284DEFasCod = "" ;
      n5284DEFasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5284DEFasCod", A5284DEFasCod);
      A5285DEUsurAlt = "" ;
      n5285DEUsurAlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5285DEUsurAlt", A5285DEUsurAlt);
      A5286DEUsurMod = "" ;
      n5286DEUsurMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5286DEUsurMod", A5286DEUsurMod);
      A5287DEFecAlt = GXutil.nullDate() ;
      n5287DEFecAlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
      A5288DEFecMod = GXutil.nullDate() ;
      n5288DEFecMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
      Z5281DeCliCod = 0 ;
      Z5282DEArtCod = "" ;
      Z5283DEMaqCod = "" ;
      Z5284DEFasCod = "" ;
      Z5285DEUsurAlt = "" ;
      Z5286DEUsurMod = "" ;
      Z5287DEFecAlt = GXutil.nullDate() ;
      Z5288DEFecMod = GXutil.nullDate() ;
   }

   public void initAll1GE1607( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5279DETipFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5279DETipFor", A5279DETipFor);
      A5280DENumFor = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5280DENumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5280DENumFor), 6, 0));
      initializeNonKey1GE1607( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573941", true, true);
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
      httpContext.AddJavascriptSource("tdocext.js", "?20268241573941", false, true);
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
      edtDETipFor_Internalname = "DETIPFOR" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDENumFor_Internalname = "DENUMFOR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDeCliCod_Internalname = "DECLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDEArtCod_Internalname = "DEARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDEMaqCod_Internalname = "DEMAQCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDEFasCod_Internalname = "DEFASCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDEUsurAlt_Internalname = "DEUSURALT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDEUsurMod_Internalname = "DEUSURMOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDEFecAlt_Internalname = "DEFECALT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDEFecMod_Internalname = "DEFECMOD" ;
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
      Form.setCaption( httpContext.getMessage( "Documentos Externos", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDEFecMod_Jsonclick = "" ;
      edtDEFecMod_Backcolor = (int)(0xFFFFFF) ;
      edtDEFecMod_Enabled = 1 ;
      edtDEFecAlt_Jsonclick = "" ;
      edtDEFecAlt_Backcolor = (int)(0xFFFFFF) ;
      edtDEFecAlt_Enabled = 1 ;
      edtDEUsurMod_Jsonclick = "" ;
      edtDEUsurMod_Backcolor = (int)(0xFFFFFF) ;
      edtDEUsurMod_Enabled = 1 ;
      edtDEUsurAlt_Jsonclick = "" ;
      edtDEUsurAlt_Backcolor = (int)(0xFFFFFF) ;
      edtDEUsurAlt_Enabled = 1 ;
      edtDEFasCod_Jsonclick = "" ;
      edtDEFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtDEFasCod_Enabled = 1 ;
      edtDEMaqCod_Jsonclick = "" ;
      edtDEMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtDEMaqCod_Enabled = 1 ;
      edtDEArtCod_Jsonclick = "" ;
      edtDEArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDEArtCod_Enabled = 1 ;
      edtDeCliCod_Jsonclick = "" ;
      edtDeCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtDeCliCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDENumFor_Jsonclick = "" ;
      edtDENumFor_Backcolor = (int)(0xFFFFFF) ;
      edtDENumFor_Enabled = 1 ;
      edtDETipFor_Jsonclick = "" ;
      edtDETipFor_Backcolor = (int)(0xFFFFFF) ;
      edtDETipFor_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      /* Using cursor T01GE14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtDeCliCod_Internalname ;
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
      /* Using cursor T01GE14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Denumfor( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5281DeCliCod", GXutil.ltrim( localUtil.ntoc( A5281DeCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5282DEArtCod", GXutil.rtrim( A5282DEArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5283DEMaqCod", GXutil.rtrim( A5283DEMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5284DEFasCod", GXutil.rtrim( A5284DEFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5285DEUsurAlt", GXutil.rtrim( A5285DEUsurAlt));
      httpContext.ajax_rsp_assign_attri("", false, "A5286DEUsurMod", GXutil.rtrim( A5286DEUsurMod));
      httpContext.ajax_rsp_assign_attri("", false, "A5287DEFecAlt", localUtil.format(A5287DEFecAlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5288DEFecMod", localUtil.format(A5288DEFecMod, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5279DETipFor", GXutil.rtrim( Z5279DETipFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5280DENumFor", GXutil.ltrim( localUtil.ntoc( Z5280DENumFor, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5281DeCliCod", GXutil.ltrim( localUtil.ntoc( Z5281DeCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5282DEArtCod", GXutil.rtrim( Z5282DEArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5283DEMaqCod", GXutil.rtrim( Z5283DEMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5284DEFasCod", GXutil.rtrim( Z5284DEFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5285DEUsurAlt", GXutil.rtrim( Z5285DEUsurAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5286DEUsurMod", GXutil.rtrim( Z5286DEUsurMod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5287DEFecAlt", localUtil.format(Z5287DEFecAlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5288DEFecMod", localUtil.format(Z5288DEFecMod, "99/99/99"));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DETIPFOR","{handler:'valid_Detipfor',iparms:[]");
      setEventMetadata("VALID_DETIPFOR",",oparms:[]}");
      setEventMetadata("VALID_DENUMFOR","{handler:'valid_Denumfor',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5279DETipFor',fld:'DETIPFOR',pic:''},{av:'A5280DENumFor',fld:'DENUMFOR',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DENUMFOR",",oparms:[{av:'A5281DeCliCod',fld:'DECLICOD',pic:'ZZZZZ9'},{av:'A5282DEArtCod',fld:'DEARTCOD',pic:''},{av:'A5283DEMaqCod',fld:'DEMAQCOD',pic:''},{av:'A5284DEFasCod',fld:'DEFASCOD',pic:''},{av:'A5285DEUsurAlt',fld:'DEUSURALT',pic:'@!'},{av:'A5286DEUsurMod',fld:'DEUSURMOD',pic:'@!'},{av:'A5287DEFecAlt',fld:'DEFECALT',pic:''},{av:'A5288DEFecMod',fld:'DEFECMOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z5279DETipFor'},{av:'Z5280DENumFor'},{av:'Z5281DeCliCod'},{av:'Z5282DEArtCod'},{av:'Z5283DEMaqCod'},{av:'Z5284DEFasCod'},{av:'Z5285DEUsurAlt'},{av:'Z5286DEUsurMod'},{av:'Z5287DEFecAlt'},{av:'Z5288DEFecMod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z5279DETipFor = "" ;
      Z5282DEArtCod = "" ;
      Z5283DEMaqCod = "" ;
      Z5284DEFasCod = "" ;
      Z5285DEUsurAlt = "" ;
      Z5286DEUsurMod = "" ;
      Z5287DEFecAlt = GXutil.nullDate() ;
      Z5288DEFecMod = GXutil.nullDate() ;
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
      lblTextblock2_Jsonclick = "" ;
      A5279DETipFor = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A5282DEArtCod = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5283DEMaqCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5284DEFasCod = "" ;
      lblTextblock8_Jsonclick = "" ;
      A5285DEUsurAlt = "" ;
      lblTextblock9_Jsonclick = "" ;
      A5286DEUsurMod = "" ;
      lblTextblock10_Jsonclick = "" ;
      A5287DEFecAlt = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A5288DEFecMod = GXutil.nullDate() ;
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
      T01GE5_A5279DETipFor = new String[] {""} ;
      T01GE5_A5280DENumFor = new int[1] ;
      T01GE5_A5281DeCliCod = new int[1] ;
      T01GE5_n5281DeCliCod = new boolean[] {false} ;
      T01GE5_A5282DEArtCod = new String[] {""} ;
      T01GE5_n5282DEArtCod = new boolean[] {false} ;
      T01GE5_A5283DEMaqCod = new String[] {""} ;
      T01GE5_n5283DEMaqCod = new boolean[] {false} ;
      T01GE5_A5284DEFasCod = new String[] {""} ;
      T01GE5_n5284DEFasCod = new boolean[] {false} ;
      T01GE5_A5285DEUsurAlt = new String[] {""} ;
      T01GE5_n5285DEUsurAlt = new boolean[] {false} ;
      T01GE5_A5286DEUsurMod = new String[] {""} ;
      T01GE5_n5286DEUsurMod = new boolean[] {false} ;
      T01GE5_A5287DEFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE5_n5287DEFecAlt = new boolean[] {false} ;
      T01GE5_A5288DEFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE5_n5288DEFecMod = new boolean[] {false} ;
      T01GE5_A396EmprCod = new String[] {""} ;
      T01GE4_A396EmprCod = new String[] {""} ;
      T01GE6_A396EmprCod = new String[] {""} ;
      T01GE7_A396EmprCod = new String[] {""} ;
      T01GE7_A5279DETipFor = new String[] {""} ;
      T01GE7_A5280DENumFor = new int[1] ;
      T01GE3_A5279DETipFor = new String[] {""} ;
      T01GE3_A5280DENumFor = new int[1] ;
      T01GE3_A5281DeCliCod = new int[1] ;
      T01GE3_n5281DeCliCod = new boolean[] {false} ;
      T01GE3_A5282DEArtCod = new String[] {""} ;
      T01GE3_n5282DEArtCod = new boolean[] {false} ;
      T01GE3_A5283DEMaqCod = new String[] {""} ;
      T01GE3_n5283DEMaqCod = new boolean[] {false} ;
      T01GE3_A5284DEFasCod = new String[] {""} ;
      T01GE3_n5284DEFasCod = new boolean[] {false} ;
      T01GE3_A5285DEUsurAlt = new String[] {""} ;
      T01GE3_n5285DEUsurAlt = new boolean[] {false} ;
      T01GE3_A5286DEUsurMod = new String[] {""} ;
      T01GE3_n5286DEUsurMod = new boolean[] {false} ;
      T01GE3_A5287DEFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE3_n5287DEFecAlt = new boolean[] {false} ;
      T01GE3_A5288DEFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE3_n5288DEFecMod = new boolean[] {false} ;
      T01GE3_A396EmprCod = new String[] {""} ;
      sMode1607 = "" ;
      T01GE8_A396EmprCod = new String[] {""} ;
      T01GE8_A5279DETipFor = new String[] {""} ;
      T01GE8_A5280DENumFor = new int[1] ;
      T01GE9_A396EmprCod = new String[] {""} ;
      T01GE9_A5279DETipFor = new String[] {""} ;
      T01GE9_A5280DENumFor = new int[1] ;
      T01GE2_A5279DETipFor = new String[] {""} ;
      T01GE2_A5280DENumFor = new int[1] ;
      T01GE2_A5281DeCliCod = new int[1] ;
      T01GE2_n5281DeCliCod = new boolean[] {false} ;
      T01GE2_A5282DEArtCod = new String[] {""} ;
      T01GE2_n5282DEArtCod = new boolean[] {false} ;
      T01GE2_A5283DEMaqCod = new String[] {""} ;
      T01GE2_n5283DEMaqCod = new boolean[] {false} ;
      T01GE2_A5284DEFasCod = new String[] {""} ;
      T01GE2_n5284DEFasCod = new boolean[] {false} ;
      T01GE2_A5285DEUsurAlt = new String[] {""} ;
      T01GE2_n5285DEUsurAlt = new boolean[] {false} ;
      T01GE2_A5286DEUsurMod = new String[] {""} ;
      T01GE2_n5286DEUsurMod = new boolean[] {false} ;
      T01GE2_A5287DEFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE2_n5287DEFecAlt = new boolean[] {false} ;
      T01GE2_A5288DEFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T01GE2_n5288DEFecMod = new boolean[] {false} ;
      T01GE2_A396EmprCod = new String[] {""} ;
      T01GE13_A396EmprCod = new String[] {""} ;
      T01GE13_A5279DETipFor = new String[] {""} ;
      T01GE13_A5280DENumFor = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01GE14_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ5279DETipFor = "" ;
      ZZ5282DEArtCod = "" ;
      ZZ5283DEMaqCod = "" ;
      ZZ5284DEFasCod = "" ;
      ZZ5285DEUsurAlt = "" ;
      ZZ5286DEUsurMod = "" ;
      ZZ5287DEFecAlt = GXutil.nullDate() ;
      ZZ5288DEFecMod = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdocext__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdocext__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdocext__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdocext__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdocext__default(),
         new Object[] {
             new Object[] {
            T01GE2_A5279DETipFor, T01GE2_A5280DENumFor, T01GE2_A5281DeCliCod, T01GE2_n5281DeCliCod, T01GE2_A5282DEArtCod, T01GE2_n5282DEArtCod, T01GE2_A5283DEMaqCod, T01GE2_n5283DEMaqCod, T01GE2_A5284DEFasCod, T01GE2_n5284DEFasCod,
            T01GE2_A5285DEUsurAlt, T01GE2_n5285DEUsurAlt, T01GE2_A5286DEUsurMod, T01GE2_n5286DEUsurMod, T01GE2_A5287DEFecAlt, T01GE2_n5287DEFecAlt, T01GE2_A5288DEFecMod, T01GE2_n5288DEFecMod, T01GE2_A396EmprCod
            }
            , new Object[] {
            T01GE3_A5279DETipFor, T01GE3_A5280DENumFor, T01GE3_A5281DeCliCod, T01GE3_n5281DeCliCod, T01GE3_A5282DEArtCod, T01GE3_n5282DEArtCod, T01GE3_A5283DEMaqCod, T01GE3_n5283DEMaqCod, T01GE3_A5284DEFasCod, T01GE3_n5284DEFasCod,
            T01GE3_A5285DEUsurAlt, T01GE3_n5285DEUsurAlt, T01GE3_A5286DEUsurMod, T01GE3_n5286DEUsurMod, T01GE3_A5287DEFecAlt, T01GE3_n5287DEFecAlt, T01GE3_A5288DEFecMod, T01GE3_n5288DEFecMod, T01GE3_A396EmprCod
            }
            , new Object[] {
            T01GE4_A396EmprCod
            }
            , new Object[] {
            T01GE5_A5279DETipFor, T01GE5_A5280DENumFor, T01GE5_A5281DeCliCod, T01GE5_n5281DeCliCod, T01GE5_A5282DEArtCod, T01GE5_n5282DEArtCod, T01GE5_A5283DEMaqCod, T01GE5_n5283DEMaqCod, T01GE5_A5284DEFasCod, T01GE5_n5284DEFasCod,
            T01GE5_A5285DEUsurAlt, T01GE5_n5285DEUsurAlt, T01GE5_A5286DEUsurMod, T01GE5_n5286DEUsurMod, T01GE5_A5287DEFecAlt, T01GE5_n5287DEFecAlt, T01GE5_A5288DEFecMod, T01GE5_n5288DEFecMod, T01GE5_A396EmprCod
            }
            , new Object[] {
            T01GE6_A396EmprCod
            }
            , new Object[] {
            T01GE7_A396EmprCod, T01GE7_A5279DETipFor, T01GE7_A5280DENumFor
            }
            , new Object[] {
            T01GE8_A396EmprCod, T01GE8_A5279DETipFor, T01GE8_A5280DENumFor
            }
            , new Object[] {
            T01GE9_A396EmprCod, T01GE9_A5279DETipFor, T01GE9_A5280DENumFor
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GE13_A396EmprCod, T01GE13_A5279DETipFor, T01GE13_A5280DENumFor
            }
            , new Object[] {
            T01GE14_A396EmprCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1607 ;
   private short nIsDirty_1607 ;
   private int Z5280DENumFor ;
   private int Z5281DeCliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDETipFor_Enabled ;
   private int A5280DENumFor ;
   private int edtDENumFor_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A5281DeCliCod ;
   private int edtDeCliCod_Enabled ;
   private int edtDEArtCod_Enabled ;
   private int edtDEMaqCod_Enabled ;
   private int edtDEFasCod_Enabled ;
   private int edtDEUsurAlt_Enabled ;
   private int edtDEUsurMod_Enabled ;
   private int edtDEFecAlt_Enabled ;
   private int edtDEFecMod_Enabled ;
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
   private int edtDEFecMod_Backcolor ;
   private int edtDEFecAlt_Backcolor ;
   private int edtDEUsurMod_Backcolor ;
   private int edtDEUsurAlt_Backcolor ;
   private int edtDEFasCod_Backcolor ;
   private int edtDEMaqCod_Backcolor ;
   private int edtDEArtCod_Backcolor ;
   private int edtDeCliCod_Backcolor ;
   private int edtDENumFor_Backcolor ;
   private int edtDETipFor_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ5280DENumFor ;
   private int ZZ5281DeCliCod ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5279DETipFor ;
   private String Z5282DEArtCod ;
   private String Z5283DEMaqCod ;
   private String Z5284DEFasCod ;
   private String Z5285DEUsurAlt ;
   private String Z5286DEUsurMod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtDETipFor_Internalname ;
   private String A5279DETipFor ;
   private String edtDETipFor_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDENumFor_Internalname ;
   private String edtDENumFor_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDeCliCod_Internalname ;
   private String edtDeCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDEArtCod_Internalname ;
   private String A5282DEArtCod ;
   private String edtDEArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDEMaqCod_Internalname ;
   private String A5283DEMaqCod ;
   private String edtDEMaqCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDEFasCod_Internalname ;
   private String A5284DEFasCod ;
   private String edtDEFasCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDEUsurAlt_Internalname ;
   private String A5285DEUsurAlt ;
   private String edtDEUsurAlt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDEUsurMod_Internalname ;
   private String A5286DEUsurMod ;
   private String edtDEUsurMod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDEFecAlt_Internalname ;
   private String edtDEFecAlt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDEFecMod_Internalname ;
   private String edtDEFecMod_Jsonclick ;
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
   private String sMode1607 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ5279DETipFor ;
   private String ZZ5282DEArtCod ;
   private String ZZ5283DEMaqCod ;
   private String ZZ5284DEFasCod ;
   private String ZZ5285DEUsurAlt ;
   private String ZZ5286DEUsurMod ;
   private java.util.Date Z5287DEFecAlt ;
   private java.util.Date Z5288DEFecMod ;
   private java.util.Date A5287DEFecAlt ;
   private java.util.Date A5288DEFecMod ;
   private java.util.Date ZZ5287DEFecAlt ;
   private java.util.Date ZZ5288DEFecMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5281DeCliCod ;
   private boolean n5282DEArtCod ;
   private boolean n5283DEMaqCod ;
   private boolean n5284DEFasCod ;
   private boolean n5285DEUsurAlt ;
   private boolean n5286DEUsurMod ;
   private boolean n5287DEFecAlt ;
   private boolean n5288DEFecMod ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01GE5_A5279DETipFor ;
   private int[] T01GE5_A5280DENumFor ;
   private int[] T01GE5_A5281DeCliCod ;
   private boolean[] T01GE5_n5281DeCliCod ;
   private String[] T01GE5_A5282DEArtCod ;
   private boolean[] T01GE5_n5282DEArtCod ;
   private String[] T01GE5_A5283DEMaqCod ;
   private boolean[] T01GE5_n5283DEMaqCod ;
   private String[] T01GE5_A5284DEFasCod ;
   private boolean[] T01GE5_n5284DEFasCod ;
   private String[] T01GE5_A5285DEUsurAlt ;
   private boolean[] T01GE5_n5285DEUsurAlt ;
   private String[] T01GE5_A5286DEUsurMod ;
   private boolean[] T01GE5_n5286DEUsurMod ;
   private java.util.Date[] T01GE5_A5287DEFecAlt ;
   private boolean[] T01GE5_n5287DEFecAlt ;
   private java.util.Date[] T01GE5_A5288DEFecMod ;
   private boolean[] T01GE5_n5288DEFecMod ;
   private String[] T01GE5_A396EmprCod ;
   private String[] T01GE4_A396EmprCod ;
   private String[] T01GE6_A396EmprCod ;
   private String[] T01GE7_A396EmprCod ;
   private String[] T01GE7_A5279DETipFor ;
   private int[] T01GE7_A5280DENumFor ;
   private String[] T01GE3_A5279DETipFor ;
   private int[] T01GE3_A5280DENumFor ;
   private int[] T01GE3_A5281DeCliCod ;
   private boolean[] T01GE3_n5281DeCliCod ;
   private String[] T01GE3_A5282DEArtCod ;
   private boolean[] T01GE3_n5282DEArtCod ;
   private String[] T01GE3_A5283DEMaqCod ;
   private boolean[] T01GE3_n5283DEMaqCod ;
   private String[] T01GE3_A5284DEFasCod ;
   private boolean[] T01GE3_n5284DEFasCod ;
   private String[] T01GE3_A5285DEUsurAlt ;
   private boolean[] T01GE3_n5285DEUsurAlt ;
   private String[] T01GE3_A5286DEUsurMod ;
   private boolean[] T01GE3_n5286DEUsurMod ;
   private java.util.Date[] T01GE3_A5287DEFecAlt ;
   private boolean[] T01GE3_n5287DEFecAlt ;
   private java.util.Date[] T01GE3_A5288DEFecMod ;
   private boolean[] T01GE3_n5288DEFecMod ;
   private String[] T01GE3_A396EmprCod ;
   private String[] T01GE8_A396EmprCod ;
   private String[] T01GE8_A5279DETipFor ;
   private int[] T01GE8_A5280DENumFor ;
   private String[] T01GE9_A396EmprCod ;
   private String[] T01GE9_A5279DETipFor ;
   private int[] T01GE9_A5280DENumFor ;
   private String[] T01GE2_A5279DETipFor ;
   private int[] T01GE2_A5280DENumFor ;
   private int[] T01GE2_A5281DeCliCod ;
   private boolean[] T01GE2_n5281DeCliCod ;
   private String[] T01GE2_A5282DEArtCod ;
   private boolean[] T01GE2_n5282DEArtCod ;
   private String[] T01GE2_A5283DEMaqCod ;
   private boolean[] T01GE2_n5283DEMaqCod ;
   private String[] T01GE2_A5284DEFasCod ;
   private boolean[] T01GE2_n5284DEFasCod ;
   private String[] T01GE2_A5285DEUsurAlt ;
   private boolean[] T01GE2_n5285DEUsurAlt ;
   private String[] T01GE2_A5286DEUsurMod ;
   private boolean[] T01GE2_n5286DEUsurMod ;
   private java.util.Date[] T01GE2_A5287DEFecAlt ;
   private boolean[] T01GE2_n5287DEFecAlt ;
   private java.util.Date[] T01GE2_A5288DEFecMod ;
   private boolean[] T01GE2_n5288DEFecMod ;
   private String[] T01GE2_A396EmprCod ;
   private String[] T01GE13_A396EmprCod ;
   private String[] T01GE13_A5279DETipFor ;
   private int[] T01GE13_A5280DENumFor ;
   private String[] T01GE14_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdocext__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdocext__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdocext__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdocext__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdocext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GE2", "SELECT DETipFor, DENumFor, DeCliCod, DEArtCod, DEMaqCod, DEFasCod, DEUsurAlt, DEUsurMod, DEFecAlt, DEFecMod, EmprCod FROM TXPDocExt WHERE EmprCod = ? AND DETipFor = ? AND DENumFor = ?  FOR UPDATE OF DeCliCod, DEArtCod, DEMaqCod, DEFasCod, DEUsurAlt, DEUsurMod, DEFecAlt, DEFecMod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE3", "SELECT DETipFor, DENumFor, DeCliCod, DEArtCod, DEMaqCod, DEFasCod, DEUsurAlt, DEUsurMod, DEFecAlt, DEFecMod, EmprCod FROM TXPDocExt WHERE EmprCod = ? AND DETipFor = ? AND DENumFor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE4", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE5", "SELECT /*+ FIRST_ROWS(100) */ TM1.DETipFor, TM1.DENumFor, TM1.DeCliCod, TM1.DEArtCod, TM1.DEMaqCod, TM1.DEFasCod, TM1.DEUsurAlt, TM1.DEUsurMod, TM1.DEFecAlt, TM1.DEFecMod, TM1.EmprCod FROM TXPDocExt TM1 WHERE TM1.EmprCod = ? and TM1.DETipFor = ? and TM1.DENumFor = ? ORDER BY TM1.EmprCod, TM1.DETipFor, TM1.DENumFor ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE6", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DETipFor, DENumFor FROM TXPDocExt WHERE EmprCod = ? AND DETipFor = ? AND DENumFor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DETipFor, DENumFor FROM TXPDocExt WHERE ( EmprCod > ? or EmprCod = ? and DETipFor > ? or DETipFor = ? and EmprCod = ? and DENumFor > ?) ORDER BY EmprCod, DETipFor, DENumFor) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GE9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DETipFor, DENumFor FROM TXPDocExt WHERE ( EmprCod < ? or EmprCod = ? and DETipFor < ? or DETipFor = ? and EmprCod = ? and DENumFor < ?) ORDER BY EmprCod DESC, DETipFor DESC, DENumFor DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GE10", "INSERT INTO TXPDocExt(DETipFor, DENumFor, DeCliCod, DEArtCod, DEMaqCod, DEFasCod, DEUsurAlt, DEUsurMod, DEFecAlt, DEFecMod, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDocExt")
         ,new UpdateCursor("T01GE11", "UPDATE TXPDocExt SET DeCliCod=?, DEArtCod=?, DEMaqCod=?, DEFasCod=?, DEUsurAlt=?, DEUsurMod=?, DEFecAlt=?, DEFecMod=?  WHERE EmprCod = ? AND DETipFor = ? AND DENumFor = ?", GX_NOMASK, "TXPDocExt")
         ,new UpdateCursor("T01GE12", "DELETE FROM TXPDocExt  WHERE EmprCod = ? AND DETipFor = ? AND DENumFor = ?", GX_NOMASK, "TXPDocExt")
         ,new ForEachCursor("T01GE13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DETipFor, DENumFor FROM TXPDocExt ORDER BY EmprCod, DETipFor, DENumFor ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GE14", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
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
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 8);
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
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               stmt.setString(11, (String)parms[18], 3);
               return;
            case 9 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
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
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setString(10, (String)parms[17], 2);
               stmt.setInt(11, ((Number) parms[18]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

