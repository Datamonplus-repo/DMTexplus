package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tasi80e_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12959IV80EArtID = httpContext.GetPar( "IV80EArtID") ;
         A12960IV80EColNI = httpContext.GetPar( "IV80EColNI") ;
         A12961IV80ETpIVI = httpContext.GetPar( "IV80ETpIVI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ASIGNACION DE TELA", ""), (short)(0)) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tasi80e_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tasi80e_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tasi80e_impl.class ));
   }

   public tasi80e_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TASI80E.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Pedido", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EPedID_Internalname, GXutil.rtrim( A12965AS80EPedID), GXutil.rtrim( localUtil.format( A12965AS80EPedID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EPedID_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EPedID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EDibID_Internalname, GXutil.rtrim( A12966AS80EDibID), GXutil.rtrim( localUtil.format( A12966AS80EDibID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EDibID_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EDibID_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Variante", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EVarID_Internalname, GXutil.rtrim( A12967AS80EVarID), GXutil.rtrim( localUtil.format( A12967AS80EVarID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EVarID_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EVarID_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EMts_Internalname, GXutil.ltrim( localUtil.ntoc( A12968AS80EMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAS80EMts_Enabled!=0) ? localUtil.format( A12968AS80EMts, "ZZZZZZ9.99") : localUtil.format( A12968AS80EMts, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EMts_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EMts_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EUltLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12972AS80EUltLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAS80EUltLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12972AS80EUltLi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12972AS80EUltLi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EUltLi_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EUltLi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EEstad_Internalname, GXutil.ltrim( localUtil.ntoc( A12974AS80EEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAS80EEstad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12974AS80EEstad), "9") : localUtil.format( DecimalUtil.doubleToDec(A12974AS80EEstad), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EEstad_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EEstad_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Asignacion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAS80EFecAs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAS80EFecAs_Internalname, localUtil.ttoc( A12981AS80EFecAs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12981AS80EFecAs, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAS80EFecAs_Jsonclick, 0, "", "", "", "", "", 1, edtAS80EFecAs_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TASI80E.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAS80EFecAs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAS80EFecAs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TASI80E.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAS80EObs_Internalname, A12982AS80EObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", (short)(0), 1, edtAS80EObs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TASI80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1778 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1778 = (short)(1) ;
            scanStart1M51778( ) ;
            while ( RcdFound1778 != 0 )
            {
               init_level_properties1778( ) ;
               getByPrimaryKey1M51778( ) ;
               addRow1M51778( ) ;
               scanNext1M51778( ) ;
            }
            scanEnd1M51778( ) ;
            nBlankRcdCount1778 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1M51778( ) ;
         standaloneModal1M51778( ) ;
         sMode1778 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1M51778( ) ;
            edtavnRcdDeleted_1778_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1778_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1778_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1778_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtAS80ELinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80ELINEA_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAS80ELinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80ELinea_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtIV80EArtID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80EARTID_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIV80EArtID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EArtID_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtIV80EColNI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80ECOLNI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIV80EColNI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EColNI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtIV80ETpIVI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80ETPIVI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIV80ETpIVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80ETpIVI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtAS80eEMtsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80EEMTSI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAS80eEMtsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80eEMtsI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtAS80EMtsOE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80EMTSOE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAS80EMtsOE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EMtsOE_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1778 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M51778( ) ;
            }
            sendRow1M51778( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1778 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1778 = (short)(5) ;
         nRcdExists_1778 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M51778( ) ;
            while ( RcdFound1778 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701778( ) ;
               init_level_properties1778( ) ;
               standaloneNotModal1M51778( ) ;
               getByPrimaryKey1M51778( ) ;
               standaloneModal1M51778( ) ;
               addRow1M51778( ) ;
               scanNext1M51778( ) ;
            }
            scanEnd1M51778( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1778 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701778( ) ;
      initAll1M51778( ) ;
      init_level_properties1778( ) ;
      nRcdExists_1778 = (short)(0) ;
      nIsMod_1778 = (short)(0) ;
      nRcdDeleted_1778 = (short)(0) ;
      nBlankRcdCount1778 = (short)(nBlankRcdUsr1778+nBlankRcdCount1778) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1778 > 0 )
      {
         standaloneNotModal1M51778( ) ;
         standaloneModal1M51778( ) ;
         addRow1M51778( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAS80ELinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1778 = (short)(nBlankRcdCount1778-1) ;
      }
      Gx_mode = sMode1778 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASI80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TASI80E.htm");
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
         Z12965AS80EPedID = httpContext.cgiGet( "Z12965AS80EPedID") ;
         Z12966AS80EDibID = httpContext.cgiGet( "Z12966AS80EDibID") ;
         Z12967AS80EVarID = httpContext.cgiGet( "Z12967AS80EVarID") ;
         Z12968AS80EMts = localUtil.ctond( httpContext.cgiGet( "Z12968AS80EMts")) ;
         Z12972AS80EUltLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z12972AS80EUltLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12974AS80EEstad = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12974AS80EEstad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12981AS80EFecAs = localUtil.ctot( httpContext.cgiGet( "Z12981AS80EFecAs"), 0) ;
         Z12982AS80EObs = httpContext.cgiGet( "Z12982AS80EObs") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12965AS80EPedID = httpContext.cgiGet( edtAS80EPedID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
         A12966AS80EDibID = httpContext.cgiGet( edtAS80EDibID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
         A12967AS80EVarID = httpContext.cgiGet( edtAS80EVarID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAS80EMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAS80EMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AS80EMTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAS80EMts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12968AS80EMts = DecimalUtil.ZERO ;
            n12968AS80EMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrimstr( A12968AS80EMts, 10, 2));
         }
         else
         {
            A12968AS80EMts = localUtil.ctond( httpContext.cgiGet( edtAS80EMts_Internalname)) ;
            n12968AS80EMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrimstr( A12968AS80EMts, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAS80EUltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAS80EUltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AS80EULTLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAS80EUltLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12972AS80EUltLi = (short)(0) ;
            n12972AS80EUltLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12972AS80EUltLi), 4, 0));
         }
         else
         {
            A12972AS80EUltLi = (short)(localUtil.ctol( httpContext.cgiGet( edtAS80EUltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12972AS80EUltLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12972AS80EUltLi), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAS80EEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAS80EEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AS80EESTAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAS80EEstad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12974AS80EEstad = (byte)(0) ;
            n12974AS80EEstad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.str( A12974AS80EEstad, 1, 0));
         }
         else
         {
            A12974AS80EEstad = (byte)(localUtil.ctol( httpContext.cgiGet( edtAS80EEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12974AS80EEstad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.str( A12974AS80EEstad, 1, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtAS80EFecAs_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "AS80EFECAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAS80EFecAs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
            n12981AS80EFecAs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A12981AS80EFecAs = localUtil.ctot( httpContext.cgiGet( edtAS80EFecAs_Internalname)) ;
            n12981AS80EFecAs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A12982AS80EObs = httpContext.cgiGet( edtAS80EObs_Internalname) ;
         n12982AS80EObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12982AS80EObs", A12982AS80EObs);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
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
            A12965AS80EPedID = httpContext.GetPar( "AS80EPedID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
            A12966AS80EDibID = httpContext.GetPar( "AS80EDibID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
            A12967AS80EVarID = httpContext.GetPar( "AS80EVarID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
            initAll1M51777( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1778_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1778_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes1M51777( ) ;
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

   public void confirm_1M50( )
   {
      beforeValidate1M51777( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M51777( ) ;
         }
         else
         {
            checkExtendedTable1M51777( ) ;
            if ( AnyError == 0 )
            {
               zm1M51777( 2) ;
            }
            closeExtendedTableCursors1M51777( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1777 = Gx_mode ;
         confirm_1M51778( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1777 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1777 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1M50( ) ;
      }
   }

   public void confirm_1M51778( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1M51778( ) ;
         if ( ( nRcdExists_1778 != 0 ) || ( nIsMod_1778 != 0 ) )
         {
            getKey1M51778( ) ;
            if ( ( nRcdExists_1778 == 0 ) && ( nRcdDeleted_1778 == 0 ) )
            {
               if ( RcdFound1778 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M51778( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M51778( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1M51778( 4) ;
                     }
                     closeExtendedTableCursors1M51778( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "AS80ELINEA_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAS80ELinea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1778 != 0 )
               {
                  if ( nRcdDeleted_1778 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M51778( ) ;
                     load1M51778( ) ;
                     beforeValidate1M51778( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M51778( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1778 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M51778( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M51778( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1M51778( 4) ;
                           }
                           closeExtendedTableCursors1M51778( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1778 == 0 )
                  {
                     GXCCtl = "AS80ELINEA_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAS80ELinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1778_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAS80ELinea_Internalname, GXutil.ltrim( localUtil.ntoc( A12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIV80EArtID_Internalname, GXutil.rtrim( A12959IV80EArtID)) ;
         httpContext.changePostValue( edtIV80EColNI_Internalname, GXutil.rtrim( A12960IV80EColNI)) ;
         httpContext.changePostValue( edtIV80ETpIVI_Internalname, GXutil.rtrim( A12961IV80ETpIVI)) ;
         httpContext.changePostValue( edtAS80eEMtsI_Internalname, GXutil.ltrim( localUtil.ntoc( A12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAS80EMtsOE_Internalname, GXutil.ltrim( localUtil.ntoc( A12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12970AS80ELinea_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12971AS80eEMtsI_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12973AS80EMtsOE_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12959IV80EArtID_"+sGXsfl_70_idx, GXutil.rtrim( Z12959IV80EArtID)) ;
         httpContext.changePostValue( "ZT_"+"Z12960IV80EColNI_"+sGXsfl_70_idx, GXutil.rtrim( Z12960IV80EColNI)) ;
         httpContext.changePostValue( "ZT_"+"Z12961IV80ETpIVI_"+sGXsfl_70_idx, GXutil.rtrim( Z12961IV80ETpIVI)) ;
         httpContext.changePostValue( "nRcdDeleted_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1778 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1778_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1778_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80ELINEA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80ELinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80EARTID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EArtID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80ECOLNI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EColNI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80ETPIVI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80ETpIVI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80EEMTSI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80eEMtsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80EMTSOE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80EMtsOE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M50( )
   {
   }

   public void zm1M51777( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12968AS80EMts = T01M56_A12968AS80EMts[0] ;
            Z12972AS80EUltLi = T01M56_A12972AS80EUltLi[0] ;
            Z12974AS80EEstad = T01M56_A12974AS80EEstad[0] ;
            Z12981AS80EFecAs = T01M56_A12981AS80EFecAs[0] ;
            Z12982AS80EObs = T01M56_A12982AS80EObs[0] ;
         }
         else
         {
            Z12968AS80EMts = A12968AS80EMts ;
            Z12972AS80EUltLi = A12972AS80EUltLi ;
            Z12974AS80EEstad = A12974AS80EEstad ;
            Z12981AS80EFecAs = A12981AS80EFecAs ;
            Z12982AS80EObs = A12982AS80EObs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12965AS80EPedID = A12965AS80EPedID ;
         Z12966AS80EDibID = A12966AS80EDibID ;
         Z12967AS80EVarID = A12967AS80EVarID ;
         Z12968AS80EMts = A12968AS80EMts ;
         Z12972AS80EUltLi = A12972AS80EUltLi ;
         Z12974AS80EEstad = A12974AS80EEstad ;
         Z12981AS80EFecAs = A12981AS80EFecAs ;
         Z12982AS80EObs = A12982AS80EObs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1M51777( )
   {
      /* Using cursor T01M58 */
      pr_default.execute(6, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1777 = (short)(1) ;
         A407EmprNom = T01M58_A407EmprNom[0] ;
         n407EmprNom = T01M58_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12968AS80EMts = T01M58_A12968AS80EMts[0] ;
         n12968AS80EMts = T01M58_n12968AS80EMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrimstr( A12968AS80EMts, 10, 2));
         A12972AS80EUltLi = T01M58_A12972AS80EUltLi[0] ;
         n12972AS80EUltLi = T01M58_n12972AS80EUltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12972AS80EUltLi), 4, 0));
         A12974AS80EEstad = T01M58_A12974AS80EEstad[0] ;
         n12974AS80EEstad = T01M58_n12974AS80EEstad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.str( A12974AS80EEstad, 1, 0));
         A12981AS80EFecAs = T01M58_A12981AS80EFecAs[0] ;
         n12981AS80EFecAs = T01M58_n12981AS80EFecAs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12982AS80EObs = T01M58_A12982AS80EObs[0] ;
         n12982AS80EObs = T01M58_n12982AS80EObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12982AS80EObs", A12982AS80EObs);
         zm1M51777( -1) ;
      }
      pr_default.close(6);
      onLoadActions1M51777( ) ;
   }

   public void onLoadActions1M51777( )
   {
   }

   public void checkExtendedTable1M51777( )
   {
      nIsDirty_1777 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01M57 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M57_A407EmprNom[0] ;
      n407EmprNom = T01M57_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1M51777( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01M59 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M59_A407EmprNom[0] ;
      n407EmprNom = T01M59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1M51777( )
   {
      /* Using cursor T01M510 */
      pr_default.execute(8, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1777 = (short)(1) ;
      }
      else
      {
         RcdFound1777 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M56 */
      pr_default.execute(4, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1M51777( 1) ;
         RcdFound1777 = (short)(1) ;
         A12965AS80EPedID = T01M56_A12965AS80EPedID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
         A12966AS80EDibID = T01M56_A12966AS80EDibID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
         A12967AS80EVarID = T01M56_A12967AS80EVarID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
         A12968AS80EMts = T01M56_A12968AS80EMts[0] ;
         n12968AS80EMts = T01M56_n12968AS80EMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrimstr( A12968AS80EMts, 10, 2));
         A12972AS80EUltLi = T01M56_A12972AS80EUltLi[0] ;
         n12972AS80EUltLi = T01M56_n12972AS80EUltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12972AS80EUltLi), 4, 0));
         A12974AS80EEstad = T01M56_A12974AS80EEstad[0] ;
         n12974AS80EEstad = T01M56_n12974AS80EEstad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.str( A12974AS80EEstad, 1, 0));
         A12981AS80EFecAs = T01M56_A12981AS80EFecAs[0] ;
         n12981AS80EFecAs = T01M56_n12981AS80EFecAs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12982AS80EObs = T01M56_A12982AS80EObs[0] ;
         n12982AS80EObs = T01M56_n12982AS80EObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12982AS80EObs", A12982AS80EObs);
         A396EmprCod = T01M56_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z12965AS80EPedID = A12965AS80EPedID ;
         Z12966AS80EDibID = A12966AS80EDibID ;
         Z12967AS80EVarID = A12967AS80EVarID ;
         sMode1777 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M51777( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1777 = (short)(0) ;
            initializeNonKey1M51777( ) ;
         }
         Gx_mode = sMode1777 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1777 = (short)(0) ;
         initializeNonKey1M51777( ) ;
         sMode1777 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1777 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1M51777( ) ;
      if ( RcdFound1777 == 0 )
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
      RcdFound1777 = (short)(0) ;
      /* Using cursor T01M511 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A12965AS80EPedID, A12965AS80EPedID, A396EmprCod, A12966AS80EDibID, A12966AS80EDibID, A12965AS80EPedID, A396EmprCod, A12967AS80EVarID});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) < 0 ) || ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12966AS80EDibID[0], A12966AS80EDibID) < 0 ) || ( GXutil.strcmp(T01M511_A12966AS80EDibID[0], A12966AS80EDibID) == 0 ) && ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12967AS80EVarID[0], A12967AS80EVarID) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) > 0 ) || ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12966AS80EDibID[0], A12966AS80EDibID) > 0 ) || ( GXutil.strcmp(T01M511_A12966AS80EDibID[0], A12966AS80EDibID) == 0 ) && ( GXutil.strcmp(T01M511_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M511_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M511_A12967AS80EVarID[0], A12967AS80EVarID) > 0 ) ) )
         {
            A396EmprCod = T01M511_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12965AS80EPedID = T01M511_A12965AS80EPedID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
            A12966AS80EDibID = T01M511_A12966AS80EDibID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
            A12967AS80EVarID = T01M511_A12967AS80EVarID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
            RcdFound1777 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1777 = (short)(0) ;
      /* Using cursor T01M512 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A12965AS80EPedID, A12965AS80EPedID, A396EmprCod, A12966AS80EDibID, A12966AS80EDibID, A12965AS80EPedID, A396EmprCod, A12967AS80EVarID});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) > 0 ) || ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12966AS80EDibID[0], A12966AS80EDibID) > 0 ) || ( GXutil.strcmp(T01M512_A12966AS80EDibID[0], A12966AS80EDibID) == 0 ) && ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12967AS80EVarID[0], A12967AS80EVarID) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) < 0 ) || ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12966AS80EDibID[0], A12966AS80EDibID) < 0 ) || ( GXutil.strcmp(T01M512_A12966AS80EDibID[0], A12966AS80EDibID) == 0 ) && ( GXutil.strcmp(T01M512_A12965AS80EPedID[0], A12965AS80EPedID) == 0 ) && ( GXutil.strcmp(T01M512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M512_A12967AS80EVarID[0], A12967AS80EVarID) < 0 ) ) )
         {
            A396EmprCod = T01M512_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12965AS80EPedID = T01M512_A12965AS80EPedID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
            A12966AS80EDibID = T01M512_A12966AS80EDibID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
            A12967AS80EVarID = T01M512_A12967AS80EVarID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
            RcdFound1777 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M51777( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M51777( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1777 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12965AS80EPedID, Z12965AS80EPedID) != 0 ) || ( GXutil.strcmp(A12966AS80EDibID, Z12966AS80EDibID) != 0 ) || ( GXutil.strcmp(A12967AS80EVarID, Z12967AS80EVarID) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A12965AS80EPedID = Z12965AS80EPedID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
               A12966AS80EDibID = Z12966AS80EDibID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
               A12967AS80EVarID = Z12967AS80EVarID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
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
               update1M51777( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12965AS80EPedID, Z12965AS80EPedID) != 0 ) || ( GXutil.strcmp(A12966AS80EDibID, Z12966AS80EDibID) != 0 ) || ( GXutil.strcmp(A12967AS80EVarID, Z12967AS80EVarID) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M51777( ) ;
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
                  insert1M51777( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12965AS80EPedID, Z12965AS80EPedID) != 0 ) || ( GXutil.strcmp(A12966AS80EDibID, Z12966AS80EDibID) != 0 ) || ( GXutil.strcmp(A12967AS80EVarID, Z12967AS80EVarID) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12965AS80EPedID = Z12965AS80EPedID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
         A12966AS80EDibID = Z12966AS80EDibID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
         A12967AS80EVarID = Z12967AS80EVarID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
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
      getKey1M51777( ) ;
      if ( RcdFound1777 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12965AS80EPedID, Z12965AS80EPedID) != 0 ) || ( GXutil.strcmp(A12966AS80EDibID, Z12966AS80EDibID) != 0 ) || ( GXutil.strcmp(A12967AS80EVarID, Z12967AS80EVarID) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12965AS80EPedID = Z12965AS80EPedID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
            A12966AS80EDibID = Z12966AS80EDibID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
            A12967AS80EVarID = Z12967AS80EVarID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12965AS80EPedID, Z12965AS80EPedID) != 0 ) || ( GXutil.strcmp(A12966AS80EDibID, Z12966AS80EDibID) != 0 ) || ( GXutil.strcmp(A12967AS80EVarID, Z12967AS80EVarID) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tasi80e");
      GX_FocusControl = edtAS80EMts_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1M50( ) ;
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
      if ( RcdFound1777 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAS80EMts_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1M51777( ) ;
      if ( RcdFound1777 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAS80EMts_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M51777( ) ;
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
      if ( RcdFound1777 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAS80EMts_Internalname ;
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
      if ( RcdFound1777 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAS80EMts_Internalname ;
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
      scanStart1M51777( ) ;
      if ( RcdFound1777 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1777 != 0 )
         {
            scanNext1M51777( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAS80EMts_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M51777( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M51777( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M55 */
         pr_default.execute(3, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASI80E"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z12968AS80EMts, T01M55_A12968AS80EMts[0]) != 0 ) || ( Z12972AS80EUltLi != T01M55_A12972AS80EUltLi[0] ) || ( Z12974AS80EEstad != T01M55_A12974AS80EEstad[0] ) || !( GXutil.dateCompare(Z12981AS80EFecAs, T01M55_A12981AS80EFecAs[0]) ) || ( GXutil.strcmp(Z12982AS80EObs, T01M55_A12982AS80EObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12968AS80EMts, T01M55_A12968AS80EMts[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EMts");
               GXutil.writeLogRaw("Old: ",Z12968AS80EMts);
               GXutil.writeLogRaw("Current: ",T01M55_A12968AS80EMts[0]);
            }
            if ( Z12972AS80EUltLi != T01M55_A12972AS80EUltLi[0] )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EUltLi");
               GXutil.writeLogRaw("Old: ",Z12972AS80EUltLi);
               GXutil.writeLogRaw("Current: ",T01M55_A12972AS80EUltLi[0]);
            }
            if ( Z12974AS80EEstad != T01M55_A12974AS80EEstad[0] )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EEstad");
               GXutil.writeLogRaw("Old: ",Z12974AS80EEstad);
               GXutil.writeLogRaw("Current: ",T01M55_A12974AS80EEstad[0]);
            }
            if ( !( GXutil.dateCompare(Z12981AS80EFecAs, T01M55_A12981AS80EFecAs[0]) ) )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EFecAs");
               GXutil.writeLogRaw("Old: ",Z12981AS80EFecAs);
               GXutil.writeLogRaw("Current: ",T01M55_A12981AS80EFecAs[0]);
            }
            if ( GXutil.strcmp(Z12982AS80EObs, T01M55_A12982AS80EObs[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EObs");
               GXutil.writeLogRaw("Old: ",Z12982AS80EObs);
               GXutil.writeLogRaw("Current: ",T01M55_A12982AS80EObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPASI80E"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M51777( )
   {
      beforeValidate1M51777( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M51777( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M51777( 0) ;
         checkOptimisticConcurrency1M51777( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M51777( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M51777( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M513 */
                  pr_default.execute(11, new Object[] {A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Boolean.valueOf(n12968AS80EMts), A12968AS80EMts, Boolean.valueOf(n12972AS80EUltLi), Short.valueOf(A12972AS80EUltLi), Boolean.valueOf(n12974AS80EEstad), Byte.valueOf(A12974AS80EEstad), Boolean.valueOf(n12981AS80EFecAs), A12981AS80EFecAs, Boolean.valueOf(n12982AS80EObs), A12982AS80EObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI80E");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1M51777( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1M50( ) ;
                        }
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
            load1M51777( ) ;
         }
         endLevel1M51777( ) ;
      }
      closeExtendedTableCursors1M51777( ) ;
   }

   public void update1M51777( )
   {
      beforeValidate1M51777( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M51777( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M51777( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M51777( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M51777( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M514 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n12968AS80EMts), A12968AS80EMts, Boolean.valueOf(n12972AS80EUltLi), Short.valueOf(A12972AS80EUltLi), Boolean.valueOf(n12974AS80EEstad), Byte.valueOf(A12974AS80EEstad), Boolean.valueOf(n12981AS80EFecAs), A12981AS80EFecAs, Boolean.valueOf(n12982AS80EObs), A12982AS80EObs, A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI80E");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASI80E"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M51777( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M51777( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1M50( ) ;
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
         }
         endLevel1M51777( ) ;
      }
      closeExtendedTableCursors1M51777( ) ;
   }

   public void deferredUpdate1M51777( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M51777( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M51777( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M51777( ) ;
         afterConfirm1M51777( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M51777( ) ;
            if ( AnyError == 0 )
            {
               scanStart1M51778( ) ;
               while ( RcdFound1778 != 0 )
               {
                  getByPrimaryKey1M51778( ) ;
                  delete1M51778( ) ;
                  scanNext1M51778( ) ;
               }
               scanEnd1M51778( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M515 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI80E");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1777 == 0 )
                        {
                           initAll1M51777( ) ;
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
                        resetCaption1M50( ) ;
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
      }
      sMode1777 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M51777( ) ;
      Gx_mode = sMode1777 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M51777( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01M516 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T01M516_A407EmprNom[0] ;
         n407EmprNom = T01M516_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1M51778( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1M51778( ) ;
         if ( ( nRcdExists_1778 != 0 ) || ( nIsMod_1778 != 0 ) )
         {
            standaloneNotModal1M51778( ) ;
            getKey1M51778( ) ;
            if ( ( nRcdExists_1778 == 0 ) && ( nRcdDeleted_1778 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M51778( ) ;
            }
            else
            {
               if ( RcdFound1778 != 0 )
               {
                  if ( ( nRcdDeleted_1778 != 0 ) && ( nRcdExists_1778 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M51778( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1778 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M51778( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1778 == 0 )
                  {
                     GXCCtl = "AS80ELINEA_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAS80ELinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1778_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAS80ELinea_Internalname, GXutil.ltrim( localUtil.ntoc( A12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIV80EArtID_Internalname, GXutil.rtrim( A12959IV80EArtID)) ;
         httpContext.changePostValue( edtIV80EColNI_Internalname, GXutil.rtrim( A12960IV80EColNI)) ;
         httpContext.changePostValue( edtIV80ETpIVI_Internalname, GXutil.rtrim( A12961IV80ETpIVI)) ;
         httpContext.changePostValue( edtAS80eEMtsI_Internalname, GXutil.ltrim( localUtil.ntoc( A12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAS80EMtsOE_Internalname, GXutil.ltrim( localUtil.ntoc( A12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12970AS80ELinea_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12971AS80eEMtsI_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12973AS80EMtsOE_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12959IV80EArtID_"+sGXsfl_70_idx, GXutil.rtrim( Z12959IV80EArtID)) ;
         httpContext.changePostValue( "ZT_"+"Z12960IV80EColNI_"+sGXsfl_70_idx, GXutil.rtrim( Z12960IV80EColNI)) ;
         httpContext.changePostValue( "ZT_"+"Z12961IV80ETpIVI_"+sGXsfl_70_idx, GXutil.rtrim( Z12961IV80ETpIVI)) ;
         httpContext.changePostValue( "nRcdDeleted_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1778_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1778 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1778_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1778_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80ELINEA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80ELinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80EARTID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EArtID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80ECOLNI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EColNI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IV80ETPIVI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80ETpIVI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80EEMTSI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80eEMtsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AS80EMTSOE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80EMtsOE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M51778( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1778 = (short)(0) ;
      nIsMod_1778 = (short)(0) ;
      nRcdDeleted_1778 = (short)(0) ;
   }

   public void processLevel1M51777( )
   {
      /* Save parent mode. */
      sMode1777 = Gx_mode ;
      processNestedLevel1M51778( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1777 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1M51777( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1M51777( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tasi80e");
         if ( AnyError == 0 )
         {
            confirmValues1M50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tasi80e");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M51777( )
   {
      /* Using cursor T01M517 */
      pr_default.execute(15);
      RcdFound1777 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1777 = (short)(1) ;
         A396EmprCod = T01M517_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12965AS80EPedID = T01M517_A12965AS80EPedID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
         A12966AS80EDibID = T01M517_A12966AS80EDibID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
         A12967AS80EVarID = T01M517_A12967AS80EVarID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M51777( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1777 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1777 = (short)(1) ;
         A396EmprCod = T01M517_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12965AS80EPedID = T01M517_A12965AS80EPedID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
         A12966AS80EDibID = T01M517_A12966AS80EDibID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
         A12967AS80EVarID = T01M517_A12967AS80EVarID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
      }
   }

   public void scanEnd1M51777( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1M51777( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M51777( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M51777( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M51777( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M51777( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M51777( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M51777( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAS80EPedID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EPedID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EPedID_Enabled), 5, 0), true);
      edtAS80EDibID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EDibID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EDibID_Enabled), 5, 0), true);
      edtAS80EVarID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EVarID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EVarID_Enabled), 5, 0), true);
      edtAS80EMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EMts_Enabled), 5, 0), true);
      edtAS80EUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EUltLi_Enabled), 5, 0), true);
      edtAS80EEstad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EEstad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EEstad_Enabled), 5, 0), true);
      edtAS80EFecAs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EFecAs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EFecAs_Enabled), 5, 0), true);
      edtAS80EObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EObs_Enabled), 5, 0), true);
   }

   public void zm1M51778( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12971AS80eEMtsI = T01M53_A12971AS80eEMtsI[0] ;
            Z12973AS80EMtsOE = T01M53_A12973AS80EMtsOE[0] ;
            Z12959IV80EArtID = T01M53_A12959IV80EArtID[0] ;
            Z12960IV80EColNI = T01M53_A12960IV80EColNI[0] ;
            Z12961IV80ETpIVI = T01M53_A12961IV80ETpIVI[0] ;
         }
         else
         {
            Z12971AS80eEMtsI = A12971AS80eEMtsI ;
            Z12973AS80EMtsOE = A12973AS80EMtsOE ;
            Z12959IV80EArtID = A12959IV80EArtID ;
            Z12960IV80EColNI = A12960IV80EColNI ;
            Z12961IV80ETpIVI = A12961IV80ETpIVI ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z12965AS80EPedID = A12965AS80EPedID ;
         Z12966AS80EDibID = A12966AS80EDibID ;
         Z12967AS80EVarID = A12967AS80EVarID ;
         Z12970AS80ELinea = A12970AS80ELinea ;
         Z12971AS80eEMtsI = A12971AS80eEMtsI ;
         Z12973AS80EMtsOE = A12973AS80EMtsOE ;
         Z396EmprCod = A396EmprCod ;
         Z12959IV80EArtID = A12959IV80EArtID ;
         Z12960IV80EColNI = A12960IV80EColNI ;
         Z12961IV80ETpIVI = A12961IV80ETpIVI ;
      }
   }

   public void standaloneNotModal1M51778( )
   {
   }

   public void standaloneModal1M51778( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAS80ELinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAS80ELinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80ELinea_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtAS80ELinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAS80ELinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80ELinea_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load1M51778( )
   {
      /* Using cursor T01M518 */
      pr_default.execute(16, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1778 = (short)(1) ;
         A12971AS80eEMtsI = T01M518_A12971AS80eEMtsI[0] ;
         n12971AS80eEMtsI = T01M518_n12971AS80eEMtsI[0] ;
         A12973AS80EMtsOE = T01M518_A12973AS80EMtsOE[0] ;
         n12973AS80EMtsOE = T01M518_n12973AS80EMtsOE[0] ;
         A12959IV80EArtID = T01M518_A12959IV80EArtID[0] ;
         A12960IV80EColNI = T01M518_A12960IV80EColNI[0] ;
         A12961IV80ETpIVI = T01M518_A12961IV80ETpIVI[0] ;
         zm1M51778( -3) ;
      }
      pr_default.close(16);
      onLoadActions1M51778( ) ;
   }

   public void onLoadActions1M51778( )
   {
   }

   public void checkExtendedTable1M51778( )
   {
      nIsDirty_1778 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1M51778( ) ;
      /* Using cursor T01M54 */
      pr_default.execute(2, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "IV80ETPIVI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIV80EArtID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1M51778( )
   {
      pr_default.close(2);
   }

   public void enableDisable1M51778( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A12959IV80EArtID ,
                         String A12960IV80EColNI ,
                         String A12961IV80ETpIVI )
   {
      /* Using cursor T01M519 */
      pr_default.execute(17, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "IV80ETPIVI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIV80EArtID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1M51778( )
   {
      /* Using cursor T01M520 */
      pr_default.execute(18, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1778 = (short)(1) ;
      }
      else
      {
         RcdFound1778 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1M51778( )
   {
      /* Using cursor T01M53 */
      pr_default.execute(1, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1M51778( 3) ;
         RcdFound1778 = (short)(1) ;
         initializeNonKey1M51778( ) ;
         A12970AS80ELinea = T01M53_A12970AS80ELinea[0] ;
         A12971AS80eEMtsI = T01M53_A12971AS80eEMtsI[0] ;
         n12971AS80eEMtsI = T01M53_n12971AS80eEMtsI[0] ;
         A12973AS80EMtsOE = T01M53_A12973AS80EMtsOE[0] ;
         n12973AS80EMtsOE = T01M53_n12973AS80EMtsOE[0] ;
         A12959IV80EArtID = T01M53_A12959IV80EArtID[0] ;
         A12960IV80EColNI = T01M53_A12960IV80EColNI[0] ;
         A12961IV80ETpIVI = T01M53_A12961IV80ETpIVI[0] ;
         Z396EmprCod = A396EmprCod ;
         Z12965AS80EPedID = A12965AS80EPedID ;
         Z12966AS80EDibID = A12966AS80EDibID ;
         Z12967AS80EVarID = A12967AS80EVarID ;
         Z12970AS80ELinea = A12970AS80ELinea ;
         sMode1778 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M51778( ) ;
         load1M51778( ) ;
         Gx_mode = sMode1778 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1778 = (short)(0) ;
         initializeNonKey1M51778( ) ;
         sMode1778 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M51778( ) ;
         Gx_mode = sMode1778 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M51778( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M51778( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M52 */
         pr_default.execute(0, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASI801"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12971AS80eEMtsI, T01M52_A12971AS80eEMtsI[0]) != 0 ) || ( DecimalUtil.compareTo(Z12973AS80EMtsOE, T01M52_A12973AS80EMtsOE[0]) != 0 ) || ( GXutil.strcmp(Z12959IV80EArtID, T01M52_A12959IV80EArtID[0]) != 0 ) || ( GXutil.strcmp(Z12960IV80EColNI, T01M52_A12960IV80EColNI[0]) != 0 ) || ( GXutil.strcmp(Z12961IV80ETpIVI, T01M52_A12961IV80ETpIVI[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12971AS80eEMtsI, T01M52_A12971AS80eEMtsI[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80eEMtsI");
               GXutil.writeLogRaw("Old: ",Z12971AS80eEMtsI);
               GXutil.writeLogRaw("Current: ",T01M52_A12971AS80eEMtsI[0]);
            }
            if ( DecimalUtil.compareTo(Z12973AS80EMtsOE, T01M52_A12973AS80EMtsOE[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"AS80EMtsOE");
               GXutil.writeLogRaw("Old: ",Z12973AS80EMtsOE);
               GXutil.writeLogRaw("Current: ",T01M52_A12973AS80EMtsOE[0]);
            }
            if ( GXutil.strcmp(Z12959IV80EArtID, T01M52_A12959IV80EArtID[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"IV80EArtID");
               GXutil.writeLogRaw("Old: ",Z12959IV80EArtID);
               GXutil.writeLogRaw("Current: ",T01M52_A12959IV80EArtID[0]);
            }
            if ( GXutil.strcmp(Z12960IV80EColNI, T01M52_A12960IV80EColNI[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"IV80EColNI");
               GXutil.writeLogRaw("Old: ",Z12960IV80EColNI);
               GXutil.writeLogRaw("Current: ",T01M52_A12960IV80EColNI[0]);
            }
            if ( GXutil.strcmp(Z12961IV80ETpIVI, T01M52_A12961IV80ETpIVI[0]) != 0 )
            {
               GXutil.writeLogln("tasi80e:[seudo value changed for attri]"+"IV80ETpIVI");
               GXutil.writeLogRaw("Old: ",Z12961IV80ETpIVI);
               GXutil.writeLogRaw("Current: ",T01M52_A12961IV80ETpIVI[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPASI801"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M51778( )
   {
      beforeValidate1M51778( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M51778( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M51778( 0) ;
         checkOptimisticConcurrency1M51778( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M51778( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M51778( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M521 */
                  pr_default.execute(19, new Object[] {A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea), Boolean.valueOf(n12971AS80eEMtsI), A12971AS80eEMtsI, Boolean.valueOf(n12973AS80EMtsOE), A12973AS80EMtsOE, A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI801");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load1M51778( ) ;
         }
         endLevel1M51778( ) ;
      }
      closeExtendedTableCursors1M51778( ) ;
   }

   public void update1M51778( )
   {
      beforeValidate1M51778( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M51778( ) ;
      }
      if ( ( nIsMod_1778 != 0 ) || ( nIsDirty_1778 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M51778( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M51778( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M51778( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M522 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n12971AS80eEMtsI), A12971AS80eEMtsI, Boolean.valueOf(n12973AS80EMtsOE), A12973AS80EMtsOE, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI, A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI801");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASI801"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M51778( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M51778( ) ;
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
            endLevel1M51778( ) ;
         }
      }
      closeExtendedTableCursors1M51778( ) ;
   }

   public void deferredUpdate1M51778( )
   {
   }

   public void delete1M51778( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M51778( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M51778( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M51778( ) ;
         afterConfirm1M51778( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M51778( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M523 */
               pr_default.execute(21, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID, Short.valueOf(A12970AS80ELinea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASI801");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1778 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M51778( ) ;
      Gx_mode = sMode1778 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M51778( )
   {
      standaloneModal1M51778( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1M51778( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M51778( )
   {
      /* Scan By routine */
      /* Using cursor T01M524 */
      pr_default.execute(22, new Object[] {A396EmprCod, A12965AS80EPedID, A12966AS80EDibID, A12967AS80EVarID});
      RcdFound1778 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1778 = (short)(1) ;
         A12970AS80ELinea = T01M524_A12970AS80ELinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M51778( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1778 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1778 = (short)(1) ;
         A12970AS80ELinea = T01M524_A12970AS80ELinea[0] ;
      }
   }

   public void scanEnd1M51778( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1M51778( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M51778( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M51778( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M51778( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M51778( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M51778( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M51778( )
   {
      edtAS80ELinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80ELinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80ELinea_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtIV80EArtID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EArtID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EArtID_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtIV80EColNI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EColNI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EColNI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtIV80ETpIVI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80ETpIVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80ETpIVI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtAS80eEMtsI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80eEMtsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80eEMtsI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtAS80EMtsOE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80EMtsOE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80EMtsOE_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes1M51778( )
   {
   }

   public void send_integrity_lvl_hashes1M51777( )
   {
   }

   public void subsflControlProps_701778( )
   {
      edtavnRcdDeleted_1778_Internalname = "vNRCDDELETED_1778_"+sGXsfl_70_idx ;
      edtAS80ELinea_Internalname = "AS80ELINEA_"+sGXsfl_70_idx ;
      edtIV80EArtID_Internalname = "IV80EARTID_"+sGXsfl_70_idx ;
      edtIV80EColNI_Internalname = "IV80ECOLNI_"+sGXsfl_70_idx ;
      edtIV80ETpIVI_Internalname = "IV80ETPIVI_"+sGXsfl_70_idx ;
      edtAS80eEMtsI_Internalname = "AS80EEMTSI_"+sGXsfl_70_idx ;
      edtAS80EMtsOE_Internalname = "AS80EMTSOE_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701778( )
   {
      edtavnRcdDeleted_1778_Internalname = "vNRCDDELETED_1778_"+sGXsfl_70_fel_idx ;
      edtAS80ELinea_Internalname = "AS80ELINEA_"+sGXsfl_70_fel_idx ;
      edtIV80EArtID_Internalname = "IV80EARTID_"+sGXsfl_70_fel_idx ;
      edtIV80EColNI_Internalname = "IV80ECOLNI_"+sGXsfl_70_fel_idx ;
      edtIV80ETpIVI_Internalname = "IV80ETPIVI_"+sGXsfl_70_fel_idx ;
      edtAS80eEMtsI_Internalname = "AS80EEMTSI_"+sGXsfl_70_fel_idx ;
      edtAS80EMtsOE_Internalname = "AS80EMTSOE_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1M51778( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701778( ) ;
      sendRow1M51778( ) ;
   }

   public void sendRow1M51778( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1778_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1778_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1778), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1778), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1778_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1778_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAS80ELinea_Internalname,GXutil.ltrim( localUtil.ntoc( A12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12970AS80ELinea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAS80ELinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAS80ELinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIV80EArtID_Internalname,GXutil.rtrim( A12959IV80EArtID),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIV80EArtID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIV80EArtID_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIV80EColNI_Internalname,GXutil.rtrim( A12960IV80EColNI),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIV80EColNI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIV80EColNI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIV80ETpIVI_Internalname,GXutil.rtrim( A12961IV80ETpIVI),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIV80ETpIVI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIV80ETpIVI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAS80eEMtsI_Internalname,GXutil.ltrim( localUtil.ntoc( A12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAS80eEMtsI_Enabled!=0) ? localUtil.format( A12971AS80eEMtsI, "ZZZZZZ9.99") : localUtil.format( A12971AS80eEMtsI, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAS80eEMtsI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAS80eEMtsI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1778_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAS80EMtsOE_Internalname,GXutil.ltrim( localUtil.ntoc( A12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAS80EMtsOE_Enabled!=0) ? localUtil.format( A12973AS80EMtsOE, "ZZZZZZ9.99") : localUtil.format( A12973AS80EMtsOE, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAS80EMtsOE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAS80EMtsOE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M51778( ) ;
      GXCCtl = "Z12970AS80ELinea_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12970AS80ELinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12971AS80eEMtsI_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12971AS80eEMtsI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12973AS80EMtsOE_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12973AS80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12959IV80EArtID_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12959IV80EArtID));
      GXCCtl = "Z12960IV80EColNI_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12960IV80EColNI));
      GXCCtl = "Z12961IV80ETpIVI_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12961IV80ETpIVI));
      GXCCtl = "nRcdDeleted_1778_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1778_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1778_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1778, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1778_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1778_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AS80ELINEA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80ELinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IV80EARTID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EArtID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IV80ECOLNI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EColNI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IV80ETPIVI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80ETpIVI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AS80EEMTSI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80eEMtsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AS80EMTSOE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80EMtsOE_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M51778( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701778( ) ;
      edtavnRcdDeleted_1778_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1778_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAS80ELinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80ELINEA_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIV80EArtID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80EARTID_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIV80EColNI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80ECOLNI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIV80ETpIVI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IV80ETPIVI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAS80eEMtsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80EEMTSI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAS80EMtsOE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AS80EMTSOE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1778_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1778_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1778");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1778_Internalname ;
         wbErr = true ;
         nRcdDeleted_1778 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1778 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1778_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAS80ELinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAS80ELinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AS80ELINEA_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAS80ELinea_Internalname ;
         wbErr = true ;
         A12970AS80ELinea = (short)(0) ;
      }
      else
      {
         A12970AS80ELinea = (short)(localUtil.ctol( httpContext.cgiGet( edtAS80ELinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12959IV80EArtID = httpContext.cgiGet( edtIV80EArtID_Internalname) ;
      A12960IV80EColNI = httpContext.cgiGet( edtIV80EColNI_Internalname) ;
      A12961IV80ETpIVI = httpContext.cgiGet( edtIV80ETpIVI_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAS80eEMtsI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAS80eEMtsI_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "AS80EEMTSI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAS80eEMtsI_Internalname ;
         wbErr = true ;
         A12971AS80eEMtsI = DecimalUtil.ZERO ;
         n12971AS80eEMtsI = false ;
      }
      else
      {
         A12971AS80eEMtsI = localUtil.ctond( httpContext.cgiGet( edtAS80eEMtsI_Internalname)) ;
         n12971AS80eEMtsI = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAS80EMtsOE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAS80EMtsOE_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "AS80EMTSOE_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAS80EMtsOE_Internalname ;
         wbErr = true ;
         A12973AS80EMtsOE = DecimalUtil.ZERO ;
         n12973AS80EMtsOE = false ;
      }
      else
      {
         A12973AS80EMtsOE = localUtil.ctond( httpContext.cgiGet( edtAS80EMtsOE_Internalname)) ;
         n12973AS80EMtsOE = false ;
      }
      GXCCtl = "Z12970AS80ELinea_" + sGXsfl_70_idx ;
      Z12970AS80ELinea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12971AS80eEMtsI_" + sGXsfl_70_idx ;
      Z12971AS80eEMtsI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12973AS80EMtsOE_" + sGXsfl_70_idx ;
      Z12973AS80EMtsOE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12959IV80EArtID_" + sGXsfl_70_idx ;
      Z12959IV80EArtID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12960IV80EColNI_" + sGXsfl_70_idx ;
      Z12960IV80EColNI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12961IV80ETpIVI_" + sGXsfl_70_idx ;
      Z12961IV80ETpIVI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1778_" + sGXsfl_70_idx ;
      nRcdDeleted_1778 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1778_" + sGXsfl_70_idx ;
      nRcdExists_1778 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1778_" + sGXsfl_70_idx ;
      nIsMod_1778 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAS80ELinea_Enabled = edtAS80ELinea_Enabled ;
   }

   public void confirmValues1M50( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701778( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701778( ) ;
         httpContext.changePostValue( "Z12970AS80ELinea_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12970AS80ELinea_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12970AS80ELinea_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z12971AS80eEMtsI_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12971AS80eEMtsI_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12971AS80eEMtsI_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z12973AS80EMtsOE_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12973AS80EMtsOE_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12973AS80EMtsOE_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z12959IV80EArtID_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12959IV80EArtID_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12959IV80EArtID_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z12960IV80EColNI_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12960IV80EColNI_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12960IV80EColNI_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z12961IV80ETpIVI_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z12961IV80ETpIVI_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12961IV80ETpIVI_"+sGXsfl_70_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tasi80e", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12965AS80EPedID", GXutil.rtrim( Z12965AS80EPedID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12966AS80EDibID", GXutil.rtrim( Z12966AS80EDibID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12967AS80EVarID", GXutil.rtrim( Z12967AS80EVarID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12968AS80EMts", GXutil.ltrim( localUtil.ntoc( Z12968AS80EMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12972AS80EUltLi", GXutil.ltrim( localUtil.ntoc( Z12972AS80EUltLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12974AS80EEstad", GXutil.ltrim( localUtil.ntoc( Z12974AS80EEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12981AS80EFecAs", localUtil.ttoc( Z12981AS80EFecAs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12982AS80EObs", Z12982AS80EObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tasi80e", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TASI80E" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ASIGNACION DE TELA", "") ;
   }

   public void initializeNonKey1M51777( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A12968AS80EMts = DecimalUtil.ZERO ;
      n12968AS80EMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrimstr( A12968AS80EMts, 10, 2));
      A12972AS80EUltLi = (short)(0) ;
      n12972AS80EUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12972AS80EUltLi), 4, 0));
      A12974AS80EEstad = (byte)(0) ;
      n12974AS80EEstad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.str( A12974AS80EEstad, 1, 0));
      A12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
      n12981AS80EFecAs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12982AS80EObs = "" ;
      n12982AS80EObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12982AS80EObs", A12982AS80EObs);
      Z12968AS80EMts = DecimalUtil.ZERO ;
      Z12972AS80EUltLi = (short)(0) ;
      Z12974AS80EEstad = (byte)(0) ;
      Z12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
      Z12982AS80EObs = "" ;
   }

   public void initAll1M51777( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A12965AS80EPedID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12965AS80EPedID", A12965AS80EPedID);
      A12966AS80EDibID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12966AS80EDibID", A12966AS80EDibID);
      A12967AS80EVarID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12967AS80EVarID", A12967AS80EVarID);
      initializeNonKey1M51777( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M51778( )
   {
      A12959IV80EArtID = "" ;
      A12960IV80EColNI = "" ;
      A12961IV80ETpIVI = "" ;
      A12971AS80eEMtsI = DecimalUtil.ZERO ;
      n12971AS80eEMtsI = false ;
      A12973AS80EMtsOE = DecimalUtil.ZERO ;
      n12973AS80EMtsOE = false ;
      Z12971AS80eEMtsI = DecimalUtil.ZERO ;
      Z12973AS80EMtsOE = DecimalUtil.ZERO ;
      Z12959IV80EArtID = "" ;
      Z12960IV80EColNI = "" ;
      Z12961IV80ETpIVI = "" ;
   }

   public void initAll1M51778( )
   {
      A12970AS80ELinea = (short)(0) ;
      initializeNonKey1M51778( ) ;
   }

   public void standaloneModalInsert1M51778( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241593165", true, true);
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
      httpContext.AddJavascriptSource("tasi80e.js", "?20268241593166", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1778( )
   {
      edtAS80ELinea_Enabled = defedtAS80ELinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAS80ELinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAS80ELinea_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol70( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1778, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1778_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12970AS80ELinea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80ELinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12959IV80EArtID));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EArtID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12960IV80EColNI));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80EColNI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12961IV80ETpIVI));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIV80ETpIVI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12971AS80eEMtsI, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80eEMtsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12973AS80EMtsOE, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAS80EMtsOE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtAS80EPedID_Internalname = "AS80EPEDID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAS80EDibID_Internalname = "AS80EDIBID" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAS80EVarID_Internalname = "AS80EVARID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAS80EMts_Internalname = "AS80EMTS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAS80EUltLi_Internalname = "AS80EULTLI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAS80EEstad_Internalname = "AS80EESTAD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAS80EFecAs_Internalname = "AS80EFECAS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAS80EObs_Internalname = "AS80EOBS" ;
      edtavnRcdDeleted_1778_Internalname = "vNRCDDELETED_1778" ;
      edtAS80ELinea_Internalname = "AS80ELINEA" ;
      edtIV80EArtID_Internalname = "IV80EARTID" ;
      edtIV80EColNI_Internalname = "IV80ECOLNI" ;
      edtIV80ETpIVI_Internalname = "IV80ETPIVI" ;
      edtAS80eEMtsI_Internalname = "AS80EEMTSI" ;
      edtAS80EMtsOE_Internalname = "AS80EMTSOE" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ASIGNACION DE TELA", "") );
      edtAS80EMtsOE_Jsonclick = "" ;
      edtAS80eEMtsI_Jsonclick = "" ;
      edtIV80ETpIVI_Jsonclick = "" ;
      edtIV80EColNI_Jsonclick = "" ;
      edtIV80EArtID_Jsonclick = "" ;
      edtAS80ELinea_Jsonclick = "" ;
      edtavnRcdDeleted_1778_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAS80EMtsOE_Enabled = 1 ;
      edtAS80eEMtsI_Enabled = 1 ;
      edtIV80ETpIVI_Enabled = 1 ;
      edtIV80EColNI_Enabled = 1 ;
      edtIV80EArtID_Enabled = 1 ;
      edtAS80ELinea_Enabled = 1 ;
      edtavnRcdDeleted_1778_Enabled = 1 ;
      edtAS80EObs_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EObs_Enabled = 1 ;
      edtAS80EFecAs_Jsonclick = "" ;
      edtAS80EFecAs_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EFecAs_Enabled = 1 ;
      edtAS80EEstad_Jsonclick = "" ;
      edtAS80EEstad_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EEstad_Enabled = 1 ;
      edtAS80EUltLi_Jsonclick = "" ;
      edtAS80EUltLi_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EUltLi_Enabled = 1 ;
      edtAS80EMts_Jsonclick = "" ;
      edtAS80EMts_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EMts_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAS80EVarID_Jsonclick = "" ;
      edtAS80EVarID_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EVarID_Enabled = 1 ;
      edtAS80EDibID_Jsonclick = "" ;
      edtAS80EDibID_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EDibID_Enabled = 1 ;
      edtAS80EPedID_Jsonclick = "" ;
      edtAS80EPedID_Backcolor = (int)(0xFFFFFF) ;
      edtAS80EPedID_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_701778( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M51778( ) ;
         standaloneModal1M51778( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M51778( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701778( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
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
      /* Using cursor T01M516 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M516_A407EmprNom[0] ;
      n407EmprNom = T01M516_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtAS80EMts_Internalname ;
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
      /* Using cursor T01M516 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01M516_A407EmprNom[0] ;
      n407EmprNom = T01M516_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_As80evarid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12968AS80EMts", GXutil.ltrim( localUtil.ntoc( A12968AS80EMts, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12972AS80EUltLi", GXutil.ltrim( localUtil.ntoc( A12972AS80EUltLi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12974AS80EEstad", GXutil.ltrim( localUtil.ntoc( A12974AS80EEstad, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12981AS80EFecAs", localUtil.ttoc( A12981AS80EFecAs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12982AS80EObs", A12982AS80EObs);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12965AS80EPedID", GXutil.rtrim( Z12965AS80EPedID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12966AS80EDibID", GXutil.rtrim( Z12966AS80EDibID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12967AS80EVarID", GXutil.rtrim( Z12967AS80EVarID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12968AS80EMts", GXutil.ltrim( localUtil.ntoc( Z12968AS80EMts, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12972AS80EUltLi", GXutil.ltrim( localUtil.ntoc( Z12972AS80EUltLi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12974AS80EEstad", GXutil.ltrim( localUtil.ntoc( Z12974AS80EEstad, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12981AS80EFecAs", localUtil.ttoc( Z12981AS80EFecAs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12982AS80EObs", Z12982AS80EObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Iv80etpivi( )
   {
      /* Using cursor T01M525 */
      pr_default.execute(23, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IV80ETPIVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIV80EArtID_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_AS80EPEDID","{handler:'valid_As80epedid',iparms:[]");
      setEventMetadata("VALID_AS80EPEDID",",oparms:[]}");
      setEventMetadata("VALID_AS80EDIBID","{handler:'valid_As80edibid',iparms:[]");
      setEventMetadata("VALID_AS80EDIBID",",oparms:[]}");
      setEventMetadata("VALID_AS80EVARID","{handler:'valid_As80evarid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12965AS80EPedID',fld:'AS80EPEDID',pic:''},{av:'A12966AS80EDibID',fld:'AS80EDIBID',pic:''},{av:'A12967AS80EVarID',fld:'AS80EVARID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AS80EVARID",",oparms:[{av:'A12968AS80EMts',fld:'AS80EMTS',pic:'ZZZZZZ9.99'},{av:'A12972AS80EUltLi',fld:'AS80EULTLI',pic:'ZZZ9'},{av:'A12974AS80EEstad',fld:'AS80EESTAD',pic:'9'},{av:'A12981AS80EFecAs',fld:'AS80EFECAS',pic:'99/99/99 99:99'},{av:'A12982AS80EObs',fld:'AS80EOBS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12965AS80EPedID'},{av:'Z12966AS80EDibID'},{av:'Z12967AS80EVarID'},{av:'Z12968AS80EMts'},{av:'Z12972AS80EUltLi'},{av:'Z12974AS80EEstad'},{av:'Z12981AS80EFecAs'},{av:'Z12982AS80EObs'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_AS80ELINEA","{handler:'valid_As80elinea',iparms:[]");
      setEventMetadata("VALID_AS80ELINEA",",oparms:[]}");
      setEventMetadata("VALID_IV80EARTID","{handler:'valid_Iv80eartid',iparms:[]");
      setEventMetadata("VALID_IV80EARTID",",oparms:[]}");
      setEventMetadata("VALID_IV80ECOLNI","{handler:'valid_Iv80ecolni',iparms:[]");
      setEventMetadata("VALID_IV80ECOLNI",",oparms:[]}");
      setEventMetadata("VALID_IV80ETPIVI","{handler:'valid_Iv80etpivi',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12959IV80EArtID',fld:'IV80EARTID',pic:''},{av:'A12960IV80EColNI',fld:'IV80ECOLNI',pic:''},{av:'A12961IV80ETpIVI',fld:'IV80ETPIVI',pic:''}]");
      setEventMetadata("VALID_IV80ETPIVI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_As80emtsoe',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(23);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12965AS80EPedID = "" ;
      Z12966AS80EDibID = "" ;
      Z12967AS80EVarID = "" ;
      Z12968AS80EMts = DecimalUtil.ZERO ;
      Z12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
      Z12982AS80EObs = "" ;
      Z12971AS80eEMtsI = DecimalUtil.ZERO ;
      Z12973AS80EMtsOE = DecimalUtil.ZERO ;
      Z12959IV80EArtID = "" ;
      Z12960IV80EColNI = "" ;
      Z12961IV80ETpIVI = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A12959IV80EArtID = "" ;
      A12960IV80EColNI = "" ;
      A12961IV80ETpIVI = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12965AS80EPedID = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12966AS80EDibID = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12967AS80EVarID = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12968AS80EMts = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock10_Jsonclick = "" ;
      A12982AS80EObs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1778 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1777 = "" ;
      GXCCtl = "" ;
      A12971AS80eEMtsI = DecimalUtil.ZERO ;
      A12973AS80EMtsOE = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      T01M58_A12965AS80EPedID = new String[] {""} ;
      T01M58_A12966AS80EDibID = new String[] {""} ;
      T01M58_A12967AS80EVarID = new String[] {""} ;
      T01M58_A407EmprNom = new String[] {""} ;
      T01M58_n407EmprNom = new boolean[] {false} ;
      T01M58_A12968AS80EMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M58_n12968AS80EMts = new boolean[] {false} ;
      T01M58_A12972AS80EUltLi = new short[1] ;
      T01M58_n12972AS80EUltLi = new boolean[] {false} ;
      T01M58_A12974AS80EEstad = new byte[1] ;
      T01M58_n12974AS80EEstad = new boolean[] {false} ;
      T01M58_A12981AS80EFecAs = new java.util.Date[] {GXutil.nullDate()} ;
      T01M58_n12981AS80EFecAs = new boolean[] {false} ;
      T01M58_A12982AS80EObs = new String[] {""} ;
      T01M58_n12982AS80EObs = new boolean[] {false} ;
      T01M58_A396EmprCod = new String[] {""} ;
      T01M57_A407EmprNom = new String[] {""} ;
      T01M57_n407EmprNom = new boolean[] {false} ;
      T01M59_A407EmprNom = new String[] {""} ;
      T01M59_n407EmprNom = new boolean[] {false} ;
      T01M510_A396EmprCod = new String[] {""} ;
      T01M510_A12965AS80EPedID = new String[] {""} ;
      T01M510_A12966AS80EDibID = new String[] {""} ;
      T01M510_A12967AS80EVarID = new String[] {""} ;
      T01M56_A12965AS80EPedID = new String[] {""} ;
      T01M56_A12966AS80EDibID = new String[] {""} ;
      T01M56_A12967AS80EVarID = new String[] {""} ;
      T01M56_A12968AS80EMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M56_n12968AS80EMts = new boolean[] {false} ;
      T01M56_A12972AS80EUltLi = new short[1] ;
      T01M56_n12972AS80EUltLi = new boolean[] {false} ;
      T01M56_A12974AS80EEstad = new byte[1] ;
      T01M56_n12974AS80EEstad = new boolean[] {false} ;
      T01M56_A12981AS80EFecAs = new java.util.Date[] {GXutil.nullDate()} ;
      T01M56_n12981AS80EFecAs = new boolean[] {false} ;
      T01M56_A12982AS80EObs = new String[] {""} ;
      T01M56_n12982AS80EObs = new boolean[] {false} ;
      T01M56_A396EmprCod = new String[] {""} ;
      T01M511_A396EmprCod = new String[] {""} ;
      T01M511_A12965AS80EPedID = new String[] {""} ;
      T01M511_A12966AS80EDibID = new String[] {""} ;
      T01M511_A12967AS80EVarID = new String[] {""} ;
      T01M512_A396EmprCod = new String[] {""} ;
      T01M512_A12965AS80EPedID = new String[] {""} ;
      T01M512_A12966AS80EDibID = new String[] {""} ;
      T01M512_A12967AS80EVarID = new String[] {""} ;
      T01M55_A12965AS80EPedID = new String[] {""} ;
      T01M55_A12966AS80EDibID = new String[] {""} ;
      T01M55_A12967AS80EVarID = new String[] {""} ;
      T01M55_A12968AS80EMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M55_n12968AS80EMts = new boolean[] {false} ;
      T01M55_A12972AS80EUltLi = new short[1] ;
      T01M55_n12972AS80EUltLi = new boolean[] {false} ;
      T01M55_A12974AS80EEstad = new byte[1] ;
      T01M55_n12974AS80EEstad = new boolean[] {false} ;
      T01M55_A12981AS80EFecAs = new java.util.Date[] {GXutil.nullDate()} ;
      T01M55_n12981AS80EFecAs = new boolean[] {false} ;
      T01M55_A12982AS80EObs = new String[] {""} ;
      T01M55_n12982AS80EObs = new boolean[] {false} ;
      T01M55_A396EmprCod = new String[] {""} ;
      T01M516_A407EmprNom = new String[] {""} ;
      T01M516_n407EmprNom = new boolean[] {false} ;
      T01M517_A396EmprCod = new String[] {""} ;
      T01M517_A12965AS80EPedID = new String[] {""} ;
      T01M517_A12966AS80EDibID = new String[] {""} ;
      T01M517_A12967AS80EVarID = new String[] {""} ;
      T01M518_A12965AS80EPedID = new String[] {""} ;
      T01M518_A12966AS80EDibID = new String[] {""} ;
      T01M518_A12967AS80EVarID = new String[] {""} ;
      T01M518_A12970AS80ELinea = new short[1] ;
      T01M518_A12971AS80eEMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M518_n12971AS80eEMtsI = new boolean[] {false} ;
      T01M518_A12973AS80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M518_n12973AS80EMtsOE = new boolean[] {false} ;
      T01M518_A396EmprCod = new String[] {""} ;
      T01M518_A12959IV80EArtID = new String[] {""} ;
      T01M518_A12960IV80EColNI = new String[] {""} ;
      T01M518_A12961IV80ETpIVI = new String[] {""} ;
      T01M54_A396EmprCod = new String[] {""} ;
      T01M519_A396EmprCod = new String[] {""} ;
      T01M520_A396EmprCod = new String[] {""} ;
      T01M520_A12965AS80EPedID = new String[] {""} ;
      T01M520_A12966AS80EDibID = new String[] {""} ;
      T01M520_A12967AS80EVarID = new String[] {""} ;
      T01M520_A12970AS80ELinea = new short[1] ;
      T01M53_A12965AS80EPedID = new String[] {""} ;
      T01M53_A12966AS80EDibID = new String[] {""} ;
      T01M53_A12967AS80EVarID = new String[] {""} ;
      T01M53_A12970AS80ELinea = new short[1] ;
      T01M53_A12971AS80eEMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M53_n12971AS80eEMtsI = new boolean[] {false} ;
      T01M53_A12973AS80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M53_n12973AS80EMtsOE = new boolean[] {false} ;
      T01M53_A396EmprCod = new String[] {""} ;
      T01M53_A12959IV80EArtID = new String[] {""} ;
      T01M53_A12960IV80EColNI = new String[] {""} ;
      T01M53_A12961IV80ETpIVI = new String[] {""} ;
      T01M52_A12965AS80EPedID = new String[] {""} ;
      T01M52_A12966AS80EDibID = new String[] {""} ;
      T01M52_A12967AS80EVarID = new String[] {""} ;
      T01M52_A12970AS80ELinea = new short[1] ;
      T01M52_A12971AS80eEMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M52_n12971AS80eEMtsI = new boolean[] {false} ;
      T01M52_A12973AS80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M52_n12973AS80EMtsOE = new boolean[] {false} ;
      T01M52_A396EmprCod = new String[] {""} ;
      T01M52_A12959IV80EArtID = new String[] {""} ;
      T01M52_A12960IV80EColNI = new String[] {""} ;
      T01M52_A12961IV80ETpIVI = new String[] {""} ;
      T01M524_A396EmprCod = new String[] {""} ;
      T01M524_A12965AS80EPedID = new String[] {""} ;
      T01M524_A12966AS80EDibID = new String[] {""} ;
      T01M524_A12967AS80EVarID = new String[] {""} ;
      T01M524_A12970AS80ELinea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ12965AS80EPedID = "" ;
      ZZ12966AS80EDibID = "" ;
      ZZ12967AS80EVarID = "" ;
      ZZ12968AS80EMts = DecimalUtil.ZERO ;
      ZZ12981AS80EFecAs = GXutil.resetTime( GXutil.nullDate() );
      ZZ12982AS80EObs = "" ;
      ZZ407EmprNom = "" ;
      T01M525_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tasi80e__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tasi80e__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tasi80e__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tasi80e__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tasi80e__default(),
         new Object[] {
             new Object[] {
            T01M52_A12965AS80EPedID, T01M52_A12966AS80EDibID, T01M52_A12967AS80EVarID, T01M52_A12970AS80ELinea, T01M52_A12971AS80eEMtsI, T01M52_n12971AS80eEMtsI, T01M52_A12973AS80EMtsOE, T01M52_n12973AS80EMtsOE, T01M52_A396EmprCod, T01M52_A12959IV80EArtID,
            T01M52_A12960IV80EColNI, T01M52_A12961IV80ETpIVI
            }
            , new Object[] {
            T01M53_A12965AS80EPedID, T01M53_A12966AS80EDibID, T01M53_A12967AS80EVarID, T01M53_A12970AS80ELinea, T01M53_A12971AS80eEMtsI, T01M53_n12971AS80eEMtsI, T01M53_A12973AS80EMtsOE, T01M53_n12973AS80EMtsOE, T01M53_A396EmprCod, T01M53_A12959IV80EArtID,
            T01M53_A12960IV80EColNI, T01M53_A12961IV80ETpIVI
            }
            , new Object[] {
            T01M54_A396EmprCod
            }
            , new Object[] {
            T01M55_A12965AS80EPedID, T01M55_A12966AS80EDibID, T01M55_A12967AS80EVarID, T01M55_A12968AS80EMts, T01M55_n12968AS80EMts, T01M55_A12972AS80EUltLi, T01M55_n12972AS80EUltLi, T01M55_A12974AS80EEstad, T01M55_n12974AS80EEstad, T01M55_A12981AS80EFecAs,
            T01M55_n12981AS80EFecAs, T01M55_A12982AS80EObs, T01M55_n12982AS80EObs, T01M55_A396EmprCod
            }
            , new Object[] {
            T01M56_A12965AS80EPedID, T01M56_A12966AS80EDibID, T01M56_A12967AS80EVarID, T01M56_A12968AS80EMts, T01M56_n12968AS80EMts, T01M56_A12972AS80EUltLi, T01M56_n12972AS80EUltLi, T01M56_A12974AS80EEstad, T01M56_n12974AS80EEstad, T01M56_A12981AS80EFecAs,
            T01M56_n12981AS80EFecAs, T01M56_A12982AS80EObs, T01M56_n12982AS80EObs, T01M56_A396EmprCod
            }
            , new Object[] {
            T01M57_A407EmprNom, T01M57_n407EmprNom
            }
            , new Object[] {
            T01M58_A12965AS80EPedID, T01M58_A12966AS80EDibID, T01M58_A12967AS80EVarID, T01M58_A407EmprNom, T01M58_n407EmprNom, T01M58_A12968AS80EMts, T01M58_n12968AS80EMts, T01M58_A12972AS80EUltLi, T01M58_n12972AS80EUltLi, T01M58_A12974AS80EEstad,
            T01M58_n12974AS80EEstad, T01M58_A12981AS80EFecAs, T01M58_n12981AS80EFecAs, T01M58_A12982AS80EObs, T01M58_n12982AS80EObs, T01M58_A396EmprCod
            }
            , new Object[] {
            T01M59_A407EmprNom, T01M59_n407EmprNom
            }
            , new Object[] {
            T01M510_A396EmprCod, T01M510_A12965AS80EPedID, T01M510_A12966AS80EDibID, T01M510_A12967AS80EVarID
            }
            , new Object[] {
            T01M511_A396EmprCod, T01M511_A12965AS80EPedID, T01M511_A12966AS80EDibID, T01M511_A12967AS80EVarID
            }
            , new Object[] {
            T01M512_A396EmprCod, T01M512_A12965AS80EPedID, T01M512_A12966AS80EDibID, T01M512_A12967AS80EVarID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M516_A407EmprNom, T01M516_n407EmprNom
            }
            , new Object[] {
            T01M517_A396EmprCod, T01M517_A12965AS80EPedID, T01M517_A12966AS80EDibID, T01M517_A12967AS80EVarID
            }
            , new Object[] {
            T01M518_A12965AS80EPedID, T01M518_A12966AS80EDibID, T01M518_A12967AS80EVarID, T01M518_A12970AS80ELinea, T01M518_A12971AS80eEMtsI, T01M518_n12971AS80eEMtsI, T01M518_A12973AS80EMtsOE, T01M518_n12973AS80EMtsOE, T01M518_A396EmprCod, T01M518_A12959IV80EArtID,
            T01M518_A12960IV80EColNI, T01M518_A12961IV80ETpIVI
            }
            , new Object[] {
            T01M519_A396EmprCod
            }
            , new Object[] {
            T01M520_A396EmprCod, T01M520_A12965AS80EPedID, T01M520_A12966AS80EDibID, T01M520_A12967AS80EVarID, T01M520_A12970AS80ELinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M524_A396EmprCod, T01M524_A12965AS80EPedID, T01M524_A12966AS80EDibID, T01M524_A12967AS80EVarID, T01M524_A12970AS80ELinea
            }
            , new Object[] {
            T01M525_A396EmprCod
            }
         }
      );
   }

   private byte Z12974AS80EEstad ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12974AS80EEstad ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12974AS80EEstad ;
   private short Z12972AS80EUltLi ;
   private short Z12970AS80ELinea ;
   private short nRcdDeleted_1778 ;
   private short nRcdExists_1778 ;
   private short nIsMod_1778 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12972AS80EUltLi ;
   private short nBlankRcdCount1778 ;
   private short RcdFound1778 ;
   private short nBlankRcdUsr1778 ;
   private short A12970AS80ELinea ;
   private short RcdFound1777 ;
   private short nIsDirty_1777 ;
   private short nIsDirty_1778 ;
   private short ZZ12972AS80EUltLi ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAS80EPedID_Enabled ;
   private int edtAS80EDibID_Enabled ;
   private int edtAS80EVarID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAS80EMts_Enabled ;
   private int edtAS80EUltLi_Enabled ;
   private int edtAS80EEstad_Enabled ;
   private int edtAS80EFecAs_Enabled ;
   private int edtAS80EObs_Enabled ;
   private int edtavnRcdDeleted_1778_Enabled ;
   private int edtAS80ELinea_Enabled ;
   private int edtIV80EArtID_Enabled ;
   private int edtIV80EColNI_Enabled ;
   private int edtIV80ETpIVI_Enabled ;
   private int edtAS80eEMtsI_Enabled ;
   private int edtAS80EMtsOE_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAS80ELinea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAS80EObs_Backcolor ;
   private int edtAS80EFecAs_Backcolor ;
   private int edtAS80EEstad_Backcolor ;
   private int edtAS80EUltLi_Backcolor ;
   private int edtAS80EMts_Backcolor ;
   private int edtAS80EVarID_Backcolor ;
   private int edtAS80EDibID_Backcolor ;
   private int edtAS80EPedID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12968AS80EMts ;
   private java.math.BigDecimal Z12971AS80eEMtsI ;
   private java.math.BigDecimal Z12973AS80EMtsOE ;
   private java.math.BigDecimal A12968AS80EMts ;
   private java.math.BigDecimal A12971AS80eEMtsI ;
   private java.math.BigDecimal A12973AS80EMtsOE ;
   private java.math.BigDecimal ZZ12968AS80EMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12965AS80EPedID ;
   private String Z12966AS80EDibID ;
   private String Z12967AS80EVarID ;
   private String Z12959IV80EArtID ;
   private String Z12960IV80EColNI ;
   private String Z12961IV80ETpIVI ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A12959IV80EArtID ;
   private String A12960IV80EColNI ;
   private String A12961IV80ETpIVI ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_70_idx="0001" ;
   private String Gx_mode ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtAS80EPedID_Internalname ;
   private String A12965AS80EPedID ;
   private String edtAS80EPedID_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAS80EDibID_Internalname ;
   private String A12966AS80EDibID ;
   private String edtAS80EDibID_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAS80EVarID_Internalname ;
   private String A12967AS80EVarID ;
   private String edtAS80EVarID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAS80EMts_Internalname ;
   private String edtAS80EMts_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAS80EUltLi_Internalname ;
   private String edtAS80EUltLi_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAS80EEstad_Internalname ;
   private String edtAS80EEstad_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAS80EFecAs_Internalname ;
   private String edtAS80EFecAs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAS80EObs_Internalname ;
   private String sMode1778 ;
   private String edtavnRcdDeleted_1778_Internalname ;
   private String edtAS80ELinea_Internalname ;
   private String edtIV80EArtID_Internalname ;
   private String edtIV80EColNI_Internalname ;
   private String edtIV80ETpIVI_Internalname ;
   private String edtAS80eEMtsI_Internalname ;
   private String edtAS80EMtsOE_Internalname ;
   private String subGrid1_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1777 ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1778_Jsonclick ;
   private String edtAS80ELinea_Jsonclick ;
   private String edtIV80EArtID_Jsonclick ;
   private String edtIV80EColNI_Jsonclick ;
   private String edtIV80ETpIVI_Jsonclick ;
   private String edtAS80eEMtsI_Jsonclick ;
   private String edtAS80EMtsOE_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ12965AS80EPedID ;
   private String ZZ12966AS80EDibID ;
   private String ZZ12967AS80EVarID ;
   private String ZZ407EmprNom ;
   private java.util.Date Z12981AS80EFecAs ;
   private java.util.Date A12981AS80EFecAs ;
   private java.util.Date ZZ12981AS80EFecAs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12968AS80EMts ;
   private boolean n12972AS80EUltLi ;
   private boolean n12974AS80EEstad ;
   private boolean n12981AS80EFecAs ;
   private boolean n12982AS80EObs ;
   private boolean n12971AS80eEMtsI ;
   private boolean n12973AS80EMtsOE ;
   private String Z12982AS80EObs ;
   private String A12982AS80EObs ;
   private String ZZ12982AS80EObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01M58_A12965AS80EPedID ;
   private String[] T01M58_A12966AS80EDibID ;
   private String[] T01M58_A12967AS80EVarID ;
   private String[] T01M58_A407EmprNom ;
   private boolean[] T01M58_n407EmprNom ;
   private java.math.BigDecimal[] T01M58_A12968AS80EMts ;
   private boolean[] T01M58_n12968AS80EMts ;
   private short[] T01M58_A12972AS80EUltLi ;
   private boolean[] T01M58_n12972AS80EUltLi ;
   private byte[] T01M58_A12974AS80EEstad ;
   private boolean[] T01M58_n12974AS80EEstad ;
   private java.util.Date[] T01M58_A12981AS80EFecAs ;
   private boolean[] T01M58_n12981AS80EFecAs ;
   private String[] T01M58_A12982AS80EObs ;
   private boolean[] T01M58_n12982AS80EObs ;
   private String[] T01M58_A396EmprCod ;
   private String[] T01M57_A407EmprNom ;
   private boolean[] T01M57_n407EmprNom ;
   private String[] T01M59_A407EmprNom ;
   private boolean[] T01M59_n407EmprNom ;
   private String[] T01M510_A396EmprCod ;
   private String[] T01M510_A12965AS80EPedID ;
   private String[] T01M510_A12966AS80EDibID ;
   private String[] T01M510_A12967AS80EVarID ;
   private String[] T01M56_A12965AS80EPedID ;
   private String[] T01M56_A12966AS80EDibID ;
   private String[] T01M56_A12967AS80EVarID ;
   private java.math.BigDecimal[] T01M56_A12968AS80EMts ;
   private boolean[] T01M56_n12968AS80EMts ;
   private short[] T01M56_A12972AS80EUltLi ;
   private boolean[] T01M56_n12972AS80EUltLi ;
   private byte[] T01M56_A12974AS80EEstad ;
   private boolean[] T01M56_n12974AS80EEstad ;
   private java.util.Date[] T01M56_A12981AS80EFecAs ;
   private boolean[] T01M56_n12981AS80EFecAs ;
   private String[] T01M56_A12982AS80EObs ;
   private boolean[] T01M56_n12982AS80EObs ;
   private String[] T01M56_A396EmprCod ;
   private String[] T01M511_A396EmprCod ;
   private String[] T01M511_A12965AS80EPedID ;
   private String[] T01M511_A12966AS80EDibID ;
   private String[] T01M511_A12967AS80EVarID ;
   private String[] T01M512_A396EmprCod ;
   private String[] T01M512_A12965AS80EPedID ;
   private String[] T01M512_A12966AS80EDibID ;
   private String[] T01M512_A12967AS80EVarID ;
   private String[] T01M55_A12965AS80EPedID ;
   private String[] T01M55_A12966AS80EDibID ;
   private String[] T01M55_A12967AS80EVarID ;
   private java.math.BigDecimal[] T01M55_A12968AS80EMts ;
   private boolean[] T01M55_n12968AS80EMts ;
   private short[] T01M55_A12972AS80EUltLi ;
   private boolean[] T01M55_n12972AS80EUltLi ;
   private byte[] T01M55_A12974AS80EEstad ;
   private boolean[] T01M55_n12974AS80EEstad ;
   private java.util.Date[] T01M55_A12981AS80EFecAs ;
   private boolean[] T01M55_n12981AS80EFecAs ;
   private String[] T01M55_A12982AS80EObs ;
   private boolean[] T01M55_n12982AS80EObs ;
   private String[] T01M55_A396EmprCod ;
   private String[] T01M516_A407EmprNom ;
   private boolean[] T01M516_n407EmprNom ;
   private String[] T01M517_A396EmprCod ;
   private String[] T01M517_A12965AS80EPedID ;
   private String[] T01M517_A12966AS80EDibID ;
   private String[] T01M517_A12967AS80EVarID ;
   private String[] T01M518_A12965AS80EPedID ;
   private String[] T01M518_A12966AS80EDibID ;
   private String[] T01M518_A12967AS80EVarID ;
   private short[] T01M518_A12970AS80ELinea ;
   private java.math.BigDecimal[] T01M518_A12971AS80eEMtsI ;
   private boolean[] T01M518_n12971AS80eEMtsI ;
   private java.math.BigDecimal[] T01M518_A12973AS80EMtsOE ;
   private boolean[] T01M518_n12973AS80EMtsOE ;
   private String[] T01M518_A396EmprCod ;
   private String[] T01M518_A12959IV80EArtID ;
   private String[] T01M518_A12960IV80EColNI ;
   private String[] T01M518_A12961IV80ETpIVI ;
   private String[] T01M54_A396EmprCod ;
   private String[] T01M519_A396EmprCod ;
   private String[] T01M520_A396EmprCod ;
   private String[] T01M520_A12965AS80EPedID ;
   private String[] T01M520_A12966AS80EDibID ;
   private String[] T01M520_A12967AS80EVarID ;
   private short[] T01M520_A12970AS80ELinea ;
   private String[] T01M53_A12965AS80EPedID ;
   private String[] T01M53_A12966AS80EDibID ;
   private String[] T01M53_A12967AS80EVarID ;
   private short[] T01M53_A12970AS80ELinea ;
   private java.math.BigDecimal[] T01M53_A12971AS80eEMtsI ;
   private boolean[] T01M53_n12971AS80eEMtsI ;
   private java.math.BigDecimal[] T01M53_A12973AS80EMtsOE ;
   private boolean[] T01M53_n12973AS80EMtsOE ;
   private String[] T01M53_A396EmprCod ;
   private String[] T01M53_A12959IV80EArtID ;
   private String[] T01M53_A12960IV80EColNI ;
   private String[] T01M53_A12961IV80ETpIVI ;
   private String[] T01M52_A12965AS80EPedID ;
   private String[] T01M52_A12966AS80EDibID ;
   private String[] T01M52_A12967AS80EVarID ;
   private short[] T01M52_A12970AS80ELinea ;
   private java.math.BigDecimal[] T01M52_A12971AS80eEMtsI ;
   private boolean[] T01M52_n12971AS80eEMtsI ;
   private java.math.BigDecimal[] T01M52_A12973AS80EMtsOE ;
   private boolean[] T01M52_n12973AS80EMtsOE ;
   private String[] T01M52_A396EmprCod ;
   private String[] T01M52_A12959IV80EArtID ;
   private String[] T01M52_A12960IV80EColNI ;
   private String[] T01M52_A12961IV80ETpIVI ;
   private String[] T01M524_A396EmprCod ;
   private String[] T01M524_A12965AS80EPedID ;
   private String[] T01M524_A12966AS80EDibID ;
   private String[] T01M524_A12967AS80EVarID ;
   private short[] T01M524_A12970AS80ELinea ;
   private String[] T01M525_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tasi80e__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasi80e__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasi80e__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasi80e__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasi80e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M52", "SELECT AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea, AS80eEMtsI, AS80EMtsOE, EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPASI801 WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? AND AS80ELinea = ?  FOR UPDATE OF AS80eEMtsI, AS80EMtsOE, IV80EArtID, IV80EColNI, IV80ETpIVI NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M53", "SELECT AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea, AS80eEMtsI, AS80EMtsOE, EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPASI801 WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? AND AS80ELinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M54", "SELECT EmprCod FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M55", "SELECT AS80EPedID, AS80EDibID, AS80EVarID, AS80EMts, AS80EUltLi, AS80EEstad, AS80EFecAs, AS80EObs, EmprCod FROM TXPASI80E WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ?  FOR UPDATE OF AS80EMts, AS80EUltLi, AS80EEstad, AS80EFecAs, AS80EObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M56", "SELECT AS80EPedID, AS80EDibID, AS80EVarID, AS80EMts, AS80EUltLi, AS80EEstad, AS80EFecAs, AS80EObs, EmprCod FROM TXPASI80E WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M57", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M58", "SELECT /*+ FIRST_ROWS(100) */ TM1.AS80EPedID, TM1.AS80EDibID, TM1.AS80EVarID, T2.EmprNom, TM1.AS80EMts, TM1.AS80EUltLi, TM1.AS80EEstad, TM1.AS80EFecAs, TM1.AS80EObs, TM1.EmprCod FROM (TXPASI80E TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AS80EPedID = ? and TM1.AS80EDibID = ? and TM1.AS80EVarID = ? ORDER BY TM1.EmprCod, TM1.AS80EPedID, TM1.AS80EDibID, TM1.AS80EVarID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M510", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AS80EPedID, AS80EDibID, AS80EVarID FROM TXPASI80E WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M511", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AS80EPedID, AS80EDibID, AS80EVarID FROM TXPASI80E WHERE ( EmprCod > ? or EmprCod = ? and AS80EPedID > ? or AS80EPedID = ? and EmprCod = ? and AS80EDibID > ? or AS80EDibID = ? and AS80EPedID = ? and EmprCod = ? and AS80EVarID > ?) ORDER BY EmprCod, AS80EPedID, AS80EDibID, AS80EVarID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AS80EPedID, AS80EDibID, AS80EVarID FROM TXPASI80E WHERE ( EmprCod < ? or EmprCod = ? and AS80EPedID < ? or AS80EPedID = ? and EmprCod = ? and AS80EDibID < ? or AS80EDibID = ? and AS80EPedID = ? and EmprCod = ? and AS80EVarID < ?) ORDER BY EmprCod DESC, AS80EPedID DESC, AS80EDibID DESC, AS80EVarID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M513", "INSERT INTO TXPASI80E(AS80EPedID, AS80EDibID, AS80EVarID, AS80EMts, AS80EUltLi, AS80EEstad, AS80EFecAs, AS80EObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPASI80E")
         ,new UpdateCursor("T01M514", "UPDATE TXPASI80E SET AS80EMts=?, AS80EUltLi=?, AS80EEstad=?, AS80EFecAs=?, AS80EObs=?  WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ?", GX_NOMASK, "TXPASI80E")
         ,new UpdateCursor("T01M515", "DELETE FROM TXPASI80E  WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ?", GX_NOMASK, "TXPASI80E")
         ,new ForEachCursor("T01M516", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M517", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AS80EPedID, AS80EDibID, AS80EVarID FROM TXPASI80E ORDER BY EmprCod, AS80EPedID, AS80EDibID, AS80EVarID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M518", "SELECT AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea, AS80eEMtsI, AS80EMtsOE, EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPASI801 WHERE EmprCod = ? and AS80EPedID = ? and AS80EDibID = ? and AS80EVarID = ? and AS80ELinea = ? ORDER BY EmprCod, AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M519", "SELECT EmprCod FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M520", "SELECT EmprCod, AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea FROM TXPASI801 WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? AND AS80ELinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M521", "INSERT INTO TXPASI801(AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea, AS80eEMtsI, AS80EMtsOE, EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPASI801")
         ,new UpdateCursor("T01M522", "UPDATE TXPASI801 SET AS80eEMtsI=?, AS80EMtsOE=?, IV80EArtID=?, IV80EColNI=?, IV80ETpIVI=?  WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? AND AS80ELinea = ?", GX_NOMASK, "TXPASI801")
         ,new UpdateCursor("T01M523", "DELETE FROM TXPASI801  WHERE EmprCod = ? AND AS80EPedID = ? AND AS80EDibID = ? AND AS80EVarID = ? AND AS80ELinea = ?", GX_NOMASK, "TXPASI801")
         ,new ForEachCursor("T01M524", "SELECT EmprCod, AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea FROM TXPASI801 WHERE EmprCod = ? and AS80EPedID = ? and AS80EDibID = ? and AS80EVarID = ? ORDER BY EmprCod, AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M525", "SELECT EmprCod FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 12);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 300);
               }
               stmt.setString(9, (String)parms[13], 3);
               return;
            case 12 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 300);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 20);
               stmt.setString(8, (String)parms[12], 12);
               stmt.setString(9, (String)parms[13], 12);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(7, (String)parms[8], 3);
               stmt.setString(8, (String)parms[9], 16);
               stmt.setString(9, (String)parms[10], 40);
               stmt.setString(10, (String)parms[11], 4);
               return;
            case 20 :
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
               stmt.setString(3, (String)parms[4], 16);
               stmt.setString(4, (String)parms[5], 40);
               stmt.setString(5, (String)parms[6], 4);
               stmt.setString(6, (String)parms[7], 3);
               stmt.setString(7, (String)parms[8], 20);
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
      }
   }

}

