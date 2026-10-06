package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tescfob_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         A494ForSer = httpContext.GetPar( "ForSer") ;
         n494ForSer = false ;
         A482ForColNom = httpContext.GetPar( "ForColNom") ;
         n482ForColNom = false ;
         A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
         n483ForColNum = false ;
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         n831TipColCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ESCANDALLO FORMULAS BROS", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public tescfob_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tescfob_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tescfob_impl.class ));
   }

   public tescfob_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TESCFOB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Work station", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWorkstat_Internalname, GXutil.rtrim( A910Workstat), GXutil.rtrim( localUtil.format( A910Workstat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWorkstat_Jsonclick, 0, "", "", "", "", "", 1, edtWorkstat_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "% incremento precio", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscInc_Internalname, GXutil.ltrim( localUtil.ntoc( A876EscInc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscInc_Enabled!=0) ? localUtil.format( A876EscInc, "Z9.99") : localUtil.format( A876EscInc, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscInc_Jsonclick, 0, "", "", "", "", "", 1, edtEscInc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kgm formula", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A877EscKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscKgm_Enabled!=0) ? localUtil.format( A877EscKgm, "ZZZZZZ9.99") : localUtil.format( A877EscKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscKgm_Jsonclick, 0, "", "", "", "", "", 1, edtEscKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Volumen formula", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscVol_Internalname, GXutil.ltrim( localUtil.ntoc( A878EscVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A878EscVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A878EscVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscVol_Jsonclick, 0, "", "", "", "", "", 1, edtEscVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A879EscUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A879EscUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A879EscUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtEscUltLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESCFOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount119 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_119 = (short)(1) ;
            scanStartCJ119( ) ;
            while ( RcdFound119 != 0 )
            {
               init_level_properties119( ) ;
               getByPrimaryKeyCJ119( ) ;
               addRowCJ119( ) ;
               scanNextCJ119( ) ;
            }
            scanEndCJ119( ) ;
            nBlankRcdCount119 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalCJ119( ) ;
         standaloneModalCJ119( ) ;
         sMode119 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRowCJ119( ) ;
            edtavnRcdDeleted_119_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_119_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_119_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_119_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtEscLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtForSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtForColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtForColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtTipColCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOLCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_119 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalCJ119( ) ;
            }
            sendRowCJ119( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode119 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount119 = (short)(5) ;
         nRcdExists_119 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartCJ119( ) ;
            while ( RcdFound119 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55119( ) ;
               init_level_properties119( ) ;
               standaloneNotModalCJ119( ) ;
               getByPrimaryKeyCJ119( ) ;
               standaloneModalCJ119( ) ;
               addRowCJ119( ) ;
               scanNextCJ119( ) ;
            }
            scanEndCJ119( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode119 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_55119( ) ;
      initAllCJ119( ) ;
      init_level_properties119( ) ;
      nRcdExists_119 = (short)(0) ;
      nIsMod_119 = (short)(0) ;
      nRcdDeleted_119 = (short)(0) ;
      nBlankRcdCount119 = (short)(nBlankRcdUsr119+nBlankRcdCount119) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount119 > 0 )
      {
         standaloneNotModalCJ119( ) ;
         standaloneModalCJ119( ) ;
         addRowCJ119( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEscLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount119 = (short)(nBlankRcdCount119-1) ;
      }
      Gx_mode = sMode119 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESCFOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TESCFOB.htm");
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
         Z910Workstat = httpContext.cgiGet( "Z910Workstat") ;
         Z876EscInc = localUtil.ctond( httpContext.cgiGet( "Z876EscInc")) ;
         Z877EscKgm = localUtil.ctond( httpContext.cgiGet( "Z877EscKgm")) ;
         Z878EscVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z878EscVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z879EscUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z879EscUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = httpContext.cgiGet( edtWorkstat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscInc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscInc_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCINC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscInc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A876EscInc = DecimalUtil.ZERO ;
            n876EscInc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrimstr( A876EscInc, 5, 2));
         }
         else
         {
            A876EscInc = localUtil.ctond( httpContext.cgiGet( edtEscInc_Internalname)) ;
            n876EscInc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrimstr( A876EscInc, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A877EscKgm = DecimalUtil.ZERO ;
            n877EscKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrimstr( A877EscKgm, 10, 2));
         }
         else
         {
            A877EscKgm = localUtil.ctond( httpContext.cgiGet( edtEscKgm_Internalname)) ;
            n877EscKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrimstr( A877EscKgm, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCVOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscVol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A878EscVol = 0 ;
            n878EscVol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A878EscVol), 5, 0));
         }
         else
         {
            A878EscVol = (int)(localUtil.ctol( httpContext.cgiGet( edtEscVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n878EscVol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A878EscVol), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCULTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscUltLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A879EscUltLin = (short)(0) ;
            n879EscUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A879EscUltLin), 3, 0));
         }
         else
         {
            A879EscUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtEscUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n879EscUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A879EscUltLin), 3, 0));
         }
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
            A910Workstat = httpContext.GetPar( "Workstat") ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
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
            initAllCJ118( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_119_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_119_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributesCJ118( ) ;
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

   public void confirm_CJ0( )
   {
      beforeValidateCJ118( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsCJ118( ) ;
         }
         else
         {
            checkExtendedTableCJ118( ) ;
            if ( AnyError == 0 )
            {
               zmCJ118( 2) ;
            }
            closeExtendedTableCursorsCJ118( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode118 = Gx_mode ;
         confirm_CJ119( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode118 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode118 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesCJ0( ) ;
      }
   }

   public void confirm_CJ119( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRowCJ119( ) ;
         if ( ( nRcdExists_119 != 0 ) || ( nIsMod_119 != 0 ) )
         {
            getKeyCJ119( ) ;
            if ( ( nRcdExists_119 == 0 ) && ( nRcdDeleted_119 == 0 ) )
            {
               if ( RcdFound119 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateCJ119( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableCJ119( ) ;
                     if ( AnyError == 0 )
                     {
                        zmCJ119( 4) ;
                     }
                     closeExtendedTableCursorsCJ119( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESCLIN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEscLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound119 != 0 )
               {
                  if ( nRcdDeleted_119 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyCJ119( ) ;
                     loadCJ119( ) ;
                     beforeValidateCJ119( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsCJ119( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_119 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateCJ119( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableCJ119( ) ;
                           if ( AnyError == 0 )
                           {
                              zmCJ119( 4) ;
                           }
                           closeExtendedTableCursorsCJ119( ) ;
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
                  if ( nRcdDeleted_119 == 0 )
                  {
                     GXCCtl = "ESCLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEscLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_119_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscLin_Internalname, GXutil.ltrim( localUtil.ntoc( A880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForSer_Internalname, GXutil.rtrim( A494ForSer)) ;
         httpContext.changePostValue( edtForColNom_Internalname, GXutil.rtrim( A482ForColNom)) ;
         httpContext.changePostValue( edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z880EscLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z831TipColCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z494ForSer_"+sGXsfl_55_idx, GXutil.rtrim( Z494ForSer)) ;
         httpContext.changePostValue( "ZT_"+"Z482ForColNom_"+sGXsfl_55_idx, GXutil.rtrim( Z482ForColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z483ForColNum_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_119 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_119_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_119_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOLCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionCJ0( )
   {
   }

   public void zmCJ118( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z876EscInc = T00CJ6_A876EscInc[0] ;
            Z877EscKgm = T00CJ6_A877EscKgm[0] ;
            Z878EscVol = T00CJ6_A878EscVol[0] ;
            Z879EscUltLin = T00CJ6_A879EscUltLin[0] ;
         }
         else
         {
            Z876EscInc = A876EscInc ;
            Z877EscKgm = A877EscKgm ;
            Z878EscVol = A878EscVol ;
            Z879EscUltLin = A879EscUltLin ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z910Workstat = A910Workstat ;
         Z876EscInc = A876EscInc ;
         Z877EscKgm = A877EscKgm ;
         Z878EscVol = A878EscVol ;
         Z879EscUltLin = A879EscUltLin ;
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

   public void loadCJ118( )
   {
      /* Using cursor T00CJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A407EmprNom = T00CJ8_A407EmprNom[0] ;
         n407EmprNom = T00CJ8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A876EscInc = T00CJ8_A876EscInc[0] ;
         n876EscInc = T00CJ8_n876EscInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrimstr( A876EscInc, 5, 2));
         A877EscKgm = T00CJ8_A877EscKgm[0] ;
         n877EscKgm = T00CJ8_n877EscKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrimstr( A877EscKgm, 10, 2));
         A878EscVol = T00CJ8_A878EscVol[0] ;
         n878EscVol = T00CJ8_n878EscVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A878EscVol), 5, 0));
         A879EscUltLin = T00CJ8_A879EscUltLin[0] ;
         n879EscUltLin = T00CJ8_n879EscUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A879EscUltLin), 3, 0));
         zmCJ118( -1) ;
      }
      pr_default.close(6);
      onLoadActionsCJ118( ) ;
   }

   public void onLoadActionsCJ118( )
   {
   }

   public void checkExtendedTableCJ118( )
   {
      nIsDirty_118 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00CJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00CJ7_A407EmprNom[0] ;
      n407EmprNom = T00CJ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsCJ118( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00CJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00CJ9_A407EmprNom[0] ;
      n407EmprNom = T00CJ9_n407EmprNom[0] ;
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

   public void getKeyCJ118( )
   {
      /* Using cursor T00CJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound118 = (short)(1) ;
      }
      else
      {
         RcdFound118 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00CJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmCJ118( 1) ;
         RcdFound118 = (short)(1) ;
         A910Workstat = T00CJ6_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A876EscInc = T00CJ6_A876EscInc[0] ;
         n876EscInc = T00CJ6_n876EscInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrimstr( A876EscInc, 5, 2));
         A877EscKgm = T00CJ6_A877EscKgm[0] ;
         n877EscKgm = T00CJ6_n877EscKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrimstr( A877EscKgm, 10, 2));
         A878EscVol = T00CJ6_A878EscVol[0] ;
         n878EscVol = T00CJ6_n878EscVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A878EscVol), 5, 0));
         A879EscUltLin = T00CJ6_A879EscUltLin[0] ;
         n879EscUltLin = T00CJ6_n879EscUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A879EscUltLin), 3, 0));
         A396EmprCod = T00CJ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z910Workstat = A910Workstat ;
         sMode118 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadCJ118( ) ;
         if ( AnyError == 1 )
         {
            RcdFound118 = (short)(0) ;
            initializeNonKeyCJ118( ) ;
         }
         Gx_mode = sMode118 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound118 = (short)(0) ;
         initializeNonKeyCJ118( ) ;
         sMode118 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode118 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyCJ118( ) ;
      if ( RcdFound118 == 0 )
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
      RcdFound118 = (short)(0) ;
      /* Using cursor T00CJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00CJ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00CJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00CJ11_A910Workstat[0], A910Workstat) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00CJ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00CJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00CJ11_A910Workstat[0], A910Workstat) > 0 ) ) )
         {
            A396EmprCod = T00CJ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T00CJ11_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            RcdFound118 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound118 = (short)(0) ;
      /* Using cursor T00CJ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00CJ12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00CJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00CJ12_A910Workstat[0], A910Workstat) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00CJ12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00CJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00CJ12_A910Workstat[0], A910Workstat) < 0 ) ) )
         {
            A396EmprCod = T00CJ12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T00CJ12_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            RcdFound118 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyCJ118( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertCJ118( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound118 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A910Workstat = Z910Workstat ;
               httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
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
               updateCJ118( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertCJ118( ) ;
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
                  insertCJ118( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = Z910Workstat ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
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
      getKeyCJ118( ) ;
      if ( RcdFound118 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = Z910Workstat ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tescfob");
      GX_FocusControl = edtEscInc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_CJ0( ) ;
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
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEscInc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartCJ118( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscInc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndCJ118( ) ;
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
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscInc_Internalname ;
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
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscInc_Internalname ;
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
      scanStartCJ118( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound118 != 0 )
         {
            scanNextCJ118( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscInc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndCJ118( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyCJ118( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00CJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESCAN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z876EscInc, T00CJ5_A876EscInc[0]) != 0 ) || ( DecimalUtil.compareTo(Z877EscKgm, T00CJ5_A877EscKgm[0]) != 0 ) || ( Z878EscVol != T00CJ5_A878EscVol[0] ) || ( Z879EscUltLin != T00CJ5_A879EscUltLin[0] ) )
         {
            if ( DecimalUtil.compareTo(Z876EscInc, T00CJ5_A876EscInc[0]) != 0 )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"EscInc");
               GXutil.writeLogRaw("Old: ",Z876EscInc);
               GXutil.writeLogRaw("Current: ",T00CJ5_A876EscInc[0]);
            }
            if ( DecimalUtil.compareTo(Z877EscKgm, T00CJ5_A877EscKgm[0]) != 0 )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"EscKgm");
               GXutil.writeLogRaw("Old: ",Z877EscKgm);
               GXutil.writeLogRaw("Current: ",T00CJ5_A877EscKgm[0]);
            }
            if ( Z878EscVol != T00CJ5_A878EscVol[0] )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"EscVol");
               GXutil.writeLogRaw("Old: ",Z878EscVol);
               GXutil.writeLogRaw("Current: ",T00CJ5_A878EscVol[0]);
            }
            if ( Z879EscUltLin != T00CJ5_A879EscUltLin[0] )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"EscUltLin");
               GXutil.writeLogRaw("Old: ",Z879EscUltLin);
               GXutil.writeLogRaw("Current: ",T00CJ5_A879EscUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESCAN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertCJ118( )
   {
      beforeValidateCJ118( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableCJ118( ) ;
      }
      if ( AnyError == 0 )
      {
         zmCJ118( 0) ;
         checkOptimisticConcurrencyCJ118( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmCJ118( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertCJ118( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00CJ13 */
                  pr_default.execute(11, new Object[] {A910Workstat, Boolean.valueOf(n876EscInc), A876EscInc, Boolean.valueOf(n877EscKgm), A877EscKgm, Boolean.valueOf(n878EscVol), Integer.valueOf(A878EscVol), Boolean.valueOf(n879EscUltLin), Short.valueOf(A879EscUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
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
                        processLevelCJ118( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionCJ0( ) ;
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
            loadCJ118( ) ;
         }
         endLevelCJ118( ) ;
      }
      closeExtendedTableCursorsCJ118( ) ;
   }

   public void updateCJ118( )
   {
      beforeValidateCJ118( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableCJ118( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyCJ118( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmCJ118( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateCJ118( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00CJ14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n876EscInc), A876EscInc, Boolean.valueOf(n877EscKgm), A877EscKgm, Boolean.valueOf(n878EscVol), Integer.valueOf(A878EscVol), Boolean.valueOf(n879EscUltLin), Short.valueOf(A879EscUltLin), A396EmprCod, A910Workstat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESCAN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateCJ118( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelCJ118( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionCJ0( ) ;
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
         endLevelCJ118( ) ;
      }
      closeExtendedTableCursorsCJ118( ) ;
   }

   public void deferredUpdateCJ118( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateCJ118( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyCJ118( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsCJ118( ) ;
         afterConfirmCJ118( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteCJ118( ) ;
            if ( AnyError == 0 )
            {
               scanStartCJ119( ) ;
               while ( RcdFound119 != 0 )
               {
                  getByPrimaryKeyCJ119( ) ;
                  deleteCJ119( ) ;
                  scanNextCJ119( ) ;
               }
               scanEndCJ119( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00CJ15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A910Workstat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound118 == 0 )
                        {
                           initAllCJ118( ) ;
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
                        resetCaptionCJ0( ) ;
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
      sMode118 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelCJ118( ) ;
      Gx_mode = sMode118 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsCJ118( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00CJ16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T00CJ16_A407EmprNom[0] ;
         n407EmprNom = T00CJ16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00CJ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevelCJ119( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRowCJ119( ) ;
         if ( ( nRcdExists_119 != 0 ) || ( nIsMod_119 != 0 ) )
         {
            standaloneNotModalCJ119( ) ;
            getKeyCJ119( ) ;
            if ( ( nRcdExists_119 == 0 ) && ( nRcdDeleted_119 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertCJ119( ) ;
            }
            else
            {
               if ( RcdFound119 != 0 )
               {
                  if ( ( nRcdDeleted_119 != 0 ) && ( nRcdExists_119 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteCJ119( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_119 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateCJ119( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_119 == 0 )
                  {
                     GXCCtl = "ESCLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEscLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_119_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscLin_Internalname, GXutil.ltrim( localUtil.ntoc( A880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForSer_Internalname, GXutil.rtrim( A494ForSer)) ;
         httpContext.changePostValue( edtForColNom_Internalname, GXutil.rtrim( A482ForColNom)) ;
         httpContext.changePostValue( edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z880EscLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z831TipColCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z494ForSer_"+sGXsfl_55_idx, GXutil.rtrim( Z494ForSer)) ;
         httpContext.changePostValue( "ZT_"+"Z482ForColNom_"+sGXsfl_55_idx, GXutil.rtrim( Z482ForColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z483ForColNum_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_119_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_119 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_119_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_119_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOLCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllCJ119( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_119 = (short)(0) ;
      nIsMod_119 = (short)(0) ;
      nRcdDeleted_119 = (short)(0) ;
   }

   public void processLevelCJ118( )
   {
      /* Save parent mode. */
      sMode118 = Gx_mode ;
      processNestedLevelCJ119( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode118 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelCJ118( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteCJ118( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tescfob");
         if ( AnyError == 0 )
         {
            confirmValuesCJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tescfob");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartCJ118( )
   {
      /* Using cursor T00CJ18 */
      pr_default.execute(16);
      RcdFound118 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A396EmprCod = T00CJ18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T00CJ18_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextCJ118( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound118 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A396EmprCod = T00CJ18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T00CJ18_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      }
   }

   public void scanEndCJ118( )
   {
      pr_default.close(16);
   }

   public void afterConfirmCJ118( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertCJ118( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateCJ118( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteCJ118( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteCJ118( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateCJ118( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesCJ118( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtWorkstat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWorkstat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWorkstat_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEscInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscInc_Enabled), 5, 0), true);
      edtEscKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscKgm_Enabled), 5, 0), true);
      edtEscVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscVol_Enabled), 5, 0), true);
      edtEscUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscUltLin_Enabled), 5, 0), true);
   }

   public void zmCJ119( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z252CliCod = T00CJ3_A252CliCod[0] ;
            Z831TipColCod = T00CJ3_A831TipColCod[0] ;
            Z494ForSer = T00CJ3_A494ForSer[0] ;
            Z482ForColNom = T00CJ3_A482ForColNom[0] ;
            Z483ForColNum = T00CJ3_A483ForColNum[0] ;
         }
         else
         {
            Z252CliCod = A252CliCod ;
            Z831TipColCod = A831TipColCod ;
            Z494ForSer = A494ForSer ;
            Z482ForColNom = A482ForColNom ;
            Z483ForColNum = A483ForColNum ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z910Workstat = A910Workstat ;
         Z880EscLin = A880EscLin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
      }
   }

   public void standaloneNotModalCJ119( )
   {
   }

   public void standaloneModalCJ119( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEscLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEscLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtEscLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEscLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void loadCJ119( )
   {
      /* Using cursor T00CJ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound119 = (short)(1) ;
         A252CliCod = T00CJ19_A252CliCod[0] ;
         n252CliCod = T00CJ19_n252CliCod[0] ;
         A831TipColCod = T00CJ19_A831TipColCod[0] ;
         n831TipColCod = T00CJ19_n831TipColCod[0] ;
         A494ForSer = T00CJ19_A494ForSer[0] ;
         n494ForSer = T00CJ19_n494ForSer[0] ;
         A482ForColNom = T00CJ19_A482ForColNom[0] ;
         n482ForColNom = T00CJ19_n482ForColNom[0] ;
         A483ForColNum = T00CJ19_A483ForColNum[0] ;
         n483ForColNum = T00CJ19_n483ForColNum[0] ;
         zmCJ119( -3) ;
      }
      pr_default.close(17);
      onLoadActionsCJ119( ) ;
   }

   public void onLoadActionsCJ119( )
   {
   }

   public void checkExtendedTableCJ119( )
   {
      nIsDirty_119 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalCJ119( ) ;
      /* Using cursor T00CJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPCOLCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsCJ119( )
   {
      pr_default.close(2);
   }

   public void enableDisableCJ119( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod ,
                         String A494ForSer ,
                         String A482ForColNom ,
                         int A483ForColNum ,
                         byte A831TipColCod )
   {
      /* Using cursor T00CJ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "TIPCOLCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKeyCJ119( )
   {
      /* Using cursor T00CJ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound119 = (short)(1) ;
      }
      else
      {
         RcdFound119 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKeyCJ119( )
   {
      /* Using cursor T00CJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmCJ119( 3) ;
         RcdFound119 = (short)(1) ;
         initializeNonKeyCJ119( ) ;
         A880EscLin = T00CJ3_A880EscLin[0] ;
         A252CliCod = T00CJ3_A252CliCod[0] ;
         n252CliCod = T00CJ3_n252CliCod[0] ;
         A831TipColCod = T00CJ3_A831TipColCod[0] ;
         n831TipColCod = T00CJ3_n831TipColCod[0] ;
         A494ForSer = T00CJ3_A494ForSer[0] ;
         n494ForSer = T00CJ3_n494ForSer[0] ;
         A482ForColNom = T00CJ3_A482ForColNom[0] ;
         n482ForColNom = T00CJ3_n482ForColNom[0] ;
         A483ForColNum = T00CJ3_A483ForColNum[0] ;
         n483ForColNum = T00CJ3_n483ForColNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z910Workstat = A910Workstat ;
         Z880EscLin = A880EscLin ;
         sMode119 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalCJ119( ) ;
         loadCJ119( ) ;
         Gx_mode = sMode119 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound119 = (short)(0) ;
         initializeNonKeyCJ119( ) ;
         sMode119 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalCJ119( ) ;
         Gx_mode = sMode119 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesCJ119( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyCJ119( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00CJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESCAN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z252CliCod != T00CJ2_A252CliCod[0] ) || ( Z831TipColCod != T00CJ2_A831TipColCod[0] ) || ( GXutil.strcmp(Z494ForSer, T00CJ2_A494ForSer[0]) != 0 ) || ( GXutil.strcmp(Z482ForColNom, T00CJ2_A482ForColNom[0]) != 0 ) || ( Z483ForColNum != T00CJ2_A483ForColNum[0] ) )
         {
            if ( Z252CliCod != T00CJ2_A252CliCod[0] )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00CJ2_A252CliCod[0]);
            }
            if ( Z831TipColCod != T00CJ2_A831TipColCod[0] )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"TipColCod");
               GXutil.writeLogRaw("Old: ",Z831TipColCod);
               GXutil.writeLogRaw("Current: ",T00CJ2_A831TipColCod[0]);
            }
            if ( GXutil.strcmp(Z494ForSer, T00CJ2_A494ForSer[0]) != 0 )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"ForSer");
               GXutil.writeLogRaw("Old: ",Z494ForSer);
               GXutil.writeLogRaw("Current: ",T00CJ2_A494ForSer[0]);
            }
            if ( GXutil.strcmp(Z482ForColNom, T00CJ2_A482ForColNom[0]) != 0 )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"ForColNom");
               GXutil.writeLogRaw("Old: ",Z482ForColNom);
               GXutil.writeLogRaw("Current: ",T00CJ2_A482ForColNom[0]);
            }
            if ( Z483ForColNum != T00CJ2_A483ForColNum[0] )
            {
               GXutil.writeLogln("tescfob:[seudo value changed for attri]"+"ForColNum");
               GXutil.writeLogRaw("Old: ",Z483ForColNum);
               GXutil.writeLogRaw("Current: ",T00CJ2_A483ForColNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLESCAN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertCJ119( )
   {
      beforeValidateCJ119( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableCJ119( ) ;
      }
      if ( AnyError == 0 )
      {
         zmCJ119( 0) ;
         checkOptimisticConcurrencyCJ119( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmCJ119( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertCJ119( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00CJ22 */
                  pr_default.execute(20, new Object[] {A910Workstat, Short.valueOf(A880EscLin), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCAN");
                  if ( (pr_default.getStatus(20) == 1) )
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
            loadCJ119( ) ;
         }
         endLevelCJ119( ) ;
      }
      closeExtendedTableCursorsCJ119( ) ;
   }

   public void updateCJ119( )
   {
      beforeValidateCJ119( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableCJ119( ) ;
      }
      if ( ( nIsMod_119 != 0 ) || ( nIsDirty_119 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyCJ119( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmCJ119( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateCJ119( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00CJ23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCAN");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESCAN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateCJ119( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyCJ119( ) ;
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
            endLevelCJ119( ) ;
         }
      }
      closeExtendedTableCursorsCJ119( ) ;
   }

   public void deferredUpdateCJ119( )
   {
   }

   public void deleteCJ119( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateCJ119( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyCJ119( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsCJ119( ) ;
         afterConfirmCJ119( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteCJ119( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00CJ24 */
               pr_default.execute(22, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(A880EscLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCAN");
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
      sMode119 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelCJ119( ) ;
      Gx_mode = sMode119 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsCJ119( )
   {
      standaloneModalCJ119( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelCJ119( )
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

   public void scanStartCJ119( )
   {
      /* Scan By routine */
      /* Using cursor T00CJ25 */
      pr_default.execute(23, new Object[] {A396EmprCod, A910Workstat});
      RcdFound119 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound119 = (short)(1) ;
         A880EscLin = T00CJ25_A880EscLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextCJ119( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound119 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound119 = (short)(1) ;
         A880EscLin = T00CJ25_A880EscLin[0] ;
      }
   }

   public void scanEndCJ119( )
   {
      pr_default.close(23);
   }

   public void afterConfirmCJ119( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertCJ119( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateCJ119( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteCJ119( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteCJ119( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateCJ119( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesCJ119( )
   {
      edtEscLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashesCJ119( )
   {
   }

   public void send_integrity_lvl_hashesCJ118( )
   {
   }

   public void subsflControlProps_55119( )
   {
      edtavnRcdDeleted_119_Internalname = "vNRCDDELETED_119_"+sGXsfl_55_idx ;
      edtEscLin_Internalname = "ESCLIN_"+sGXsfl_55_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_55_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_55_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_55_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55119( )
   {
      edtavnRcdDeleted_119_Internalname = "vNRCDDELETED_119_"+sGXsfl_55_fel_idx ;
      edtEscLin_Internalname = "ESCLIN_"+sGXsfl_55_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_55_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_55_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_55_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_55_fel_idx ;
   }

   public void addRowCJ119( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55119( ) ;
      sendRowCJ119( ) ;
   }

   public void sendRowCJ119( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_119_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_119_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_119), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_119), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_119_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_119_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscLin_Internalname,GXutil.ltrim( localUtil.ntoc( A880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A880EscLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEscLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_119_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipColCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesCJ119( ) ;
      GXCCtl = "Z880EscLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z880EscLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z252CliCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z831TipColCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z494ForSer_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z494ForSer));
      GXCCtl = "Z482ForColNom_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z482ForColNom));
      GXCCtl = "Z483ForColNum_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_119_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_119_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_119_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_119, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_119_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_119_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowCJ119( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55119( ) ;
      edtavnRcdDeleted_119_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_119_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipColCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOLCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_119_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_119_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_119");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_119_Internalname ;
         wbErr = true ;
         nRcdDeleted_119 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_119 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_119_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ESCLIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscLin_Internalname ;
         wbErr = true ;
         A880EscLin = (short)(0) ;
      }
      else
      {
         A880EscLin = (short)(localUtil.ctol( httpContext.cgiGet( edtEscLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         wbErr = true ;
         A252CliCod = 0 ;
         n252CliCod = false ;
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
      }
      A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
      n494ForSer = false ;
      A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
      n482ForColNom = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FORCOLNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForColNum_Internalname ;
         wbErr = true ;
         A483ForColNum = 0 ;
         n483ForColNum = false ;
      }
      else
      {
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n483ForColNum = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "TIPCOLCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         wbErr = true ;
         A831TipColCod = (byte)(0) ;
         n831TipColCod = false ;
      }
      else
      {
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n831TipColCod = false ;
      }
      GXCCtl = "Z880EscLin_" + sGXsfl_55_idx ;
      Z880EscLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_55_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z831TipColCod_" + sGXsfl_55_idx ;
      Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z494ForSer_" + sGXsfl_55_idx ;
      Z494ForSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z482ForColNom_" + sGXsfl_55_idx ;
      Z482ForColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z483ForColNum_" + sGXsfl_55_idx ;
      Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_119_" + sGXsfl_55_idx ;
      nRcdDeleted_119 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_119_" + sGXsfl_55_idx ;
      nRcdExists_119 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_119_" + sGXsfl_55_idx ;
      nIsMod_119 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEscLin_Enabled = edtEscLin_Enabled ;
   }

   public void confirmValuesCJ0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55119( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55119( ) ;
         httpContext.changePostValue( "Z880EscLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z880EscLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z880EscLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z831TipColCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z831TipColCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z831TipColCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z494ForSer_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z494ForSer_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z494ForSer_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z482ForColNom_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z482ForColNom_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z482ForColNom_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z483ForColNum_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z483ForColNum_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z483ForColNum_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tescfob", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z876EscInc", GXutil.ltrim( localUtil.ntoc( Z876EscInc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z877EscKgm", GXutil.ltrim( localUtil.ntoc( Z877EscKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z878EscVol", GXutil.ltrim( localUtil.ntoc( Z878EscVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z879EscUltLin", GXutil.ltrim( localUtil.ntoc( Z879EscUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tescfob", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TESCFOB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ESCANDALLO FORMULAS BROS", "") ;
   }

   public void initializeNonKeyCJ118( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A876EscInc = DecimalUtil.ZERO ;
      n876EscInc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrimstr( A876EscInc, 5, 2));
      A877EscKgm = DecimalUtil.ZERO ;
      n877EscKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrimstr( A877EscKgm, 10, 2));
      A878EscVol = 0 ;
      n878EscVol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A878EscVol), 5, 0));
      A879EscUltLin = (short)(0) ;
      n879EscUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A879EscUltLin), 3, 0));
      Z876EscInc = DecimalUtil.ZERO ;
      Z877EscKgm = DecimalUtil.ZERO ;
      Z878EscVol = 0 ;
      Z879EscUltLin = (short)(0) ;
   }

   public void initAllCJ118( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A910Workstat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      initializeNonKeyCJ118( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyCJ119( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      A494ForSer = "" ;
      n494ForSer = false ;
      A482ForColNom = "" ;
      n482ForColNom = false ;
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      Z252CliCod = 0 ;
      Z831TipColCod = (byte)(0) ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z483ForColNum = 0 ;
   }

   public void initAllCJ119( )
   {
      A880EscLin = (short)(0) ;
      initializeNonKeyCJ119( ) ;
   }

   public void standaloneModalInsertCJ119( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513878", true, true);
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
      httpContext.AddJavascriptSource("tescfob.js", "?20268241513878", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties119( )
   {
      edtEscLin_Enabled = defedtEscLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_119, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_119_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A880EscLin, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtWorkstat_Internalname = "WORKSTAT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEscInc_Internalname = "ESCINC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEscKgm_Internalname = "ESCKGM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEscVol_Internalname = "ESCVOL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEscUltLin_Internalname = "ESCULTLIN" ;
      edtavnRcdDeleted_119_Internalname = "vNRCDDELETED_119" ;
      edtEscLin_Internalname = "ESCLIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
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
      Form.setCaption( httpContext.getMessage( "ESCANDALLO FORMULAS BROS", "") );
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEscLin_Jsonclick = "" ;
      edtavnRcdDeleted_119_Jsonclick = "" ;
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
      edtTipColCod_Enabled = 1 ;
      edtForColNum_Enabled = 1 ;
      edtForColNom_Enabled = 1 ;
      edtForSer_Enabled = 1 ;
      edtCliCod_Enabled = 1 ;
      edtEscLin_Enabled = 1 ;
      edtavnRcdDeleted_119_Enabled = 1 ;
      edtEscUltLin_Jsonclick = "" ;
      edtEscUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtEscUltLin_Enabled = 1 ;
      edtEscVol_Jsonclick = "" ;
      edtEscVol_Backcolor = (int)(0xFFFFFF) ;
      edtEscVol_Enabled = 1 ;
      edtEscKgm_Jsonclick = "" ;
      edtEscKgm_Backcolor = (int)(0xFFFFFF) ;
      edtEscKgm_Enabled = 1 ;
      edtEscInc_Jsonclick = "" ;
      edtEscInc_Backcolor = (int)(0xFFFFFF) ;
      edtEscInc_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtWorkstat_Jsonclick = "" ;
      edtWorkstat_Backcolor = (int)(0xFFFFFF) ;
      edtWorkstat_Enabled = 1 ;
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
      subsflControlProps_55119( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalCJ119( ) ;
         standaloneModalCJ119( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowCJ119( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55119( ) ;
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
      /* Using cursor T00CJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00CJ16_A407EmprNom[0] ;
      n407EmprNom = T00CJ16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtEscInc_Internalname ;
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
      /* Using cursor T00CJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00CJ16_A407EmprNom[0] ;
      n407EmprNom = T00CJ16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Workstat( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A876EscInc", GXutil.ltrim( localUtil.ntoc( A876EscInc, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A877EscKgm", GXutil.ltrim( localUtil.ntoc( A877EscKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A878EscVol", GXutil.ltrim( localUtil.ntoc( A878EscVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A879EscUltLin", GXutil.ltrim( localUtil.ntoc( A879EscUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z876EscInc", GXutil.ltrim( localUtil.ntoc( Z876EscInc, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z877EscKgm", GXutil.ltrim( localUtil.ntoc( Z877EscKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z878EscVol", GXutil.ltrim( localUtil.ntoc( Z878EscVol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z879EscUltLin", GXutil.ltrim( localUtil.ntoc( Z879EscUltLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipcolcod( )
   {
      n252CliCod = false ;
      n494ForSer = false ;
      n482ForColNom = false ;
      n483ForColNum = false ;
      n831TipColCod = false ;
      /* Using cursor T00CJ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(24);
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
      setEventMetadata("VALID_WORKSTAT","{handler:'valid_Workstat',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A910Workstat',fld:'WORKSTAT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_WORKSTAT",",oparms:[{av:'A876EscInc',fld:'ESCINC',pic:'Z9.99'},{av:'A877EscKgm',fld:'ESCKGM',pic:'ZZZZZZ9.99'},{av:'A878EscVol',fld:'ESCVOL',pic:'ZZZZ9'},{av:'A879EscUltLin',fld:'ESCULTLIN',pic:'ZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z910Workstat'},{av:'Z876EscInc'},{av:'Z877EscKgm'},{av:'Z878EscVol'},{av:'Z879EscUltLin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESCLIN","{handler:'valid_Esclin',iparms:[]");
      setEventMetadata("VALID_ESCLIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
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
      pr_default.close(24);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z910Workstat = "" ;
      Z876EscInc = DecimalUtil.ZERO ;
      Z877EscKgm = DecimalUtil.ZERO ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      A910Workstat = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A876EscInc = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A877EscKgm = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode119 = "" ;
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
      sMode118 = "" ;
      GXCCtl = "" ;
      Z407EmprNom = "" ;
      T00CJ8_A910Workstat = new String[] {""} ;
      T00CJ8_A407EmprNom = new String[] {""} ;
      T00CJ8_n407EmprNom = new boolean[] {false} ;
      T00CJ8_A876EscInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ8_n876EscInc = new boolean[] {false} ;
      T00CJ8_A877EscKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ8_n877EscKgm = new boolean[] {false} ;
      T00CJ8_A878EscVol = new int[1] ;
      T00CJ8_n878EscVol = new boolean[] {false} ;
      T00CJ8_A879EscUltLin = new short[1] ;
      T00CJ8_n879EscUltLin = new boolean[] {false} ;
      T00CJ8_A396EmprCod = new String[] {""} ;
      T00CJ7_A407EmprNom = new String[] {""} ;
      T00CJ7_n407EmprNom = new boolean[] {false} ;
      T00CJ9_A407EmprNom = new String[] {""} ;
      T00CJ9_n407EmprNom = new boolean[] {false} ;
      T00CJ10_A396EmprCod = new String[] {""} ;
      T00CJ10_A910Workstat = new String[] {""} ;
      T00CJ6_A910Workstat = new String[] {""} ;
      T00CJ6_A876EscInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ6_n876EscInc = new boolean[] {false} ;
      T00CJ6_A877EscKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ6_n877EscKgm = new boolean[] {false} ;
      T00CJ6_A878EscVol = new int[1] ;
      T00CJ6_n878EscVol = new boolean[] {false} ;
      T00CJ6_A879EscUltLin = new short[1] ;
      T00CJ6_n879EscUltLin = new boolean[] {false} ;
      T00CJ6_A396EmprCod = new String[] {""} ;
      T00CJ11_A396EmprCod = new String[] {""} ;
      T00CJ11_A910Workstat = new String[] {""} ;
      T00CJ12_A396EmprCod = new String[] {""} ;
      T00CJ12_A910Workstat = new String[] {""} ;
      T00CJ5_A910Workstat = new String[] {""} ;
      T00CJ5_A876EscInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ5_n876EscInc = new boolean[] {false} ;
      T00CJ5_A877EscKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00CJ5_n877EscKgm = new boolean[] {false} ;
      T00CJ5_A878EscVol = new int[1] ;
      T00CJ5_n878EscVol = new boolean[] {false} ;
      T00CJ5_A879EscUltLin = new short[1] ;
      T00CJ5_n879EscUltLin = new boolean[] {false} ;
      T00CJ5_A396EmprCod = new String[] {""} ;
      T00CJ16_A407EmprNom = new String[] {""} ;
      T00CJ16_n407EmprNom = new boolean[] {false} ;
      T00CJ17_A396EmprCod = new String[] {""} ;
      T00CJ17_A910Workstat = new String[] {""} ;
      T00CJ17_A887EscMLin = new int[1] ;
      T00CJ18_A396EmprCod = new String[] {""} ;
      T00CJ18_A910Workstat = new String[] {""} ;
      T00CJ19_A910Workstat = new String[] {""} ;
      T00CJ19_A880EscLin = new short[1] ;
      T00CJ19_A396EmprCod = new String[] {""} ;
      T00CJ19_A252CliCod = new int[1] ;
      T00CJ19_n252CliCod = new boolean[] {false} ;
      T00CJ19_A831TipColCod = new byte[1] ;
      T00CJ19_n831TipColCod = new boolean[] {false} ;
      T00CJ19_A494ForSer = new String[] {""} ;
      T00CJ19_n494ForSer = new boolean[] {false} ;
      T00CJ19_A482ForColNom = new String[] {""} ;
      T00CJ19_n482ForColNom = new boolean[] {false} ;
      T00CJ19_A483ForColNum = new int[1] ;
      T00CJ19_n483ForColNum = new boolean[] {false} ;
      T00CJ4_A396EmprCod = new String[] {""} ;
      T00CJ20_A396EmprCod = new String[] {""} ;
      T00CJ21_A396EmprCod = new String[] {""} ;
      T00CJ21_A910Workstat = new String[] {""} ;
      T00CJ21_A880EscLin = new short[1] ;
      T00CJ3_A910Workstat = new String[] {""} ;
      T00CJ3_A880EscLin = new short[1] ;
      T00CJ3_A396EmprCod = new String[] {""} ;
      T00CJ3_A252CliCod = new int[1] ;
      T00CJ3_n252CliCod = new boolean[] {false} ;
      T00CJ3_A831TipColCod = new byte[1] ;
      T00CJ3_n831TipColCod = new boolean[] {false} ;
      T00CJ3_A494ForSer = new String[] {""} ;
      T00CJ3_n494ForSer = new boolean[] {false} ;
      T00CJ3_A482ForColNom = new String[] {""} ;
      T00CJ3_n482ForColNom = new boolean[] {false} ;
      T00CJ3_A483ForColNum = new int[1] ;
      T00CJ3_n483ForColNum = new boolean[] {false} ;
      T00CJ2_A910Workstat = new String[] {""} ;
      T00CJ2_A880EscLin = new short[1] ;
      T00CJ2_A396EmprCod = new String[] {""} ;
      T00CJ2_A252CliCod = new int[1] ;
      T00CJ2_n252CliCod = new boolean[] {false} ;
      T00CJ2_A831TipColCod = new byte[1] ;
      T00CJ2_n831TipColCod = new boolean[] {false} ;
      T00CJ2_A494ForSer = new String[] {""} ;
      T00CJ2_n494ForSer = new boolean[] {false} ;
      T00CJ2_A482ForColNom = new String[] {""} ;
      T00CJ2_n482ForColNom = new boolean[] {false} ;
      T00CJ2_A483ForColNum = new int[1] ;
      T00CJ2_n483ForColNum = new boolean[] {false} ;
      T00CJ25_A396EmprCod = new String[] {""} ;
      T00CJ25_A910Workstat = new String[] {""} ;
      T00CJ25_A880EscLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ910Workstat = "" ;
      ZZ876EscInc = DecimalUtil.ZERO ;
      ZZ877EscKgm = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      T00CJ26_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tescfob__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tescfob__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tescfob__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tescfob__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tescfob__default(),
         new Object[] {
             new Object[] {
            T00CJ2_A910Workstat, T00CJ2_A880EscLin, T00CJ2_A396EmprCod, T00CJ2_A252CliCod, T00CJ2_n252CliCod, T00CJ2_A831TipColCod, T00CJ2_n831TipColCod, T00CJ2_A494ForSer, T00CJ2_n494ForSer, T00CJ2_A482ForColNom,
            T00CJ2_n482ForColNom, T00CJ2_A483ForColNum, T00CJ2_n483ForColNum
            }
            , new Object[] {
            T00CJ3_A910Workstat, T00CJ3_A880EscLin, T00CJ3_A396EmprCod, T00CJ3_A252CliCod, T00CJ3_n252CliCod, T00CJ3_A831TipColCod, T00CJ3_n831TipColCod, T00CJ3_A494ForSer, T00CJ3_n494ForSer, T00CJ3_A482ForColNom,
            T00CJ3_n482ForColNom, T00CJ3_A483ForColNum, T00CJ3_n483ForColNum
            }
            , new Object[] {
            T00CJ4_A396EmprCod
            }
            , new Object[] {
            T00CJ5_A910Workstat, T00CJ5_A876EscInc, T00CJ5_n876EscInc, T00CJ5_A877EscKgm, T00CJ5_n877EscKgm, T00CJ5_A878EscVol, T00CJ5_n878EscVol, T00CJ5_A879EscUltLin, T00CJ5_n879EscUltLin, T00CJ5_A396EmprCod
            }
            , new Object[] {
            T00CJ6_A910Workstat, T00CJ6_A876EscInc, T00CJ6_n876EscInc, T00CJ6_A877EscKgm, T00CJ6_n877EscKgm, T00CJ6_A878EscVol, T00CJ6_n878EscVol, T00CJ6_A879EscUltLin, T00CJ6_n879EscUltLin, T00CJ6_A396EmprCod
            }
            , new Object[] {
            T00CJ7_A407EmprNom, T00CJ7_n407EmprNom
            }
            , new Object[] {
            T00CJ8_A910Workstat, T00CJ8_A407EmprNom, T00CJ8_n407EmprNom, T00CJ8_A876EscInc, T00CJ8_n876EscInc, T00CJ8_A877EscKgm, T00CJ8_n877EscKgm, T00CJ8_A878EscVol, T00CJ8_n878EscVol, T00CJ8_A879EscUltLin,
            T00CJ8_n879EscUltLin, T00CJ8_A396EmprCod
            }
            , new Object[] {
            T00CJ9_A407EmprNom, T00CJ9_n407EmprNom
            }
            , new Object[] {
            T00CJ10_A396EmprCod, T00CJ10_A910Workstat
            }
            , new Object[] {
            T00CJ11_A396EmprCod, T00CJ11_A910Workstat
            }
            , new Object[] {
            T00CJ12_A396EmprCod, T00CJ12_A910Workstat
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00CJ16_A407EmprNom, T00CJ16_n407EmprNom
            }
            , new Object[] {
            T00CJ17_A396EmprCod, T00CJ17_A910Workstat, T00CJ17_A887EscMLin
            }
            , new Object[] {
            T00CJ18_A396EmprCod, T00CJ18_A910Workstat
            }
            , new Object[] {
            T00CJ19_A910Workstat, T00CJ19_A880EscLin, T00CJ19_A396EmprCod, T00CJ19_A252CliCod, T00CJ19_n252CliCod, T00CJ19_A831TipColCod, T00CJ19_n831TipColCod, T00CJ19_A494ForSer, T00CJ19_n494ForSer, T00CJ19_A482ForColNom,
            T00CJ19_n482ForColNom, T00CJ19_A483ForColNum, T00CJ19_n483ForColNum
            }
            , new Object[] {
            T00CJ20_A396EmprCod
            }
            , new Object[] {
            T00CJ21_A396EmprCod, T00CJ21_A910Workstat, T00CJ21_A880EscLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00CJ25_A396EmprCod, T00CJ25_A910Workstat, T00CJ25_A880EscLin
            }
            , new Object[] {
            T00CJ26_A396EmprCod
            }
         }
      );
   }

   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z879EscUltLin ;
   private short Z880EscLin ;
   private short nRcdDeleted_119 ;
   private short nRcdExists_119 ;
   private short nIsMod_119 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A879EscUltLin ;
   private short nBlankRcdCount119 ;
   private short RcdFound119 ;
   private short nBlankRcdUsr119 ;
   private short A880EscLin ;
   private short RcdFound118 ;
   private short nIsDirty_118 ;
   private short nIsDirty_119 ;
   private short ZZ879EscUltLin ;
   private int Z878EscVol ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtWorkstat_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEscInc_Enabled ;
   private int edtEscKgm_Enabled ;
   private int A878EscVol ;
   private int edtEscVol_Enabled ;
   private int edtEscUltLin_Enabled ;
   private int edtavnRcdDeleted_119_Enabled ;
   private int edtEscLin_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
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
   private int defedtEscLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEscUltLin_Backcolor ;
   private int edtEscVol_Backcolor ;
   private int edtEscKgm_Backcolor ;
   private int edtEscInc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtWorkstat_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ878EscVol ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z876EscInc ;
   private java.math.BigDecimal Z877EscKgm ;
   private java.math.BigDecimal A876EscInc ;
   private java.math.BigDecimal A877EscKgm ;
   private java.math.BigDecimal ZZ876EscInc ;
   private java.math.BigDecimal ZZ877EscKgm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z910Workstat ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtWorkstat_Internalname ;
   private String A910Workstat ;
   private String edtWorkstat_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEscInc_Internalname ;
   private String edtEscInc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEscKgm_Internalname ;
   private String edtEscKgm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEscVol_Internalname ;
   private String edtEscVol_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEscUltLin_Internalname ;
   private String edtEscUltLin_Jsonclick ;
   private String sMode119 ;
   private String edtavnRcdDeleted_119_Internalname ;
   private String edtEscLin_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtForSer_Internalname ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
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
   private String sMode118 ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_119_Jsonclick ;
   private String edtEscLin_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ910Workstat ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n876EscInc ;
   private boolean n877EscKgm ;
   private boolean n878EscVol ;
   private boolean n879EscUltLin ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00CJ8_A910Workstat ;
   private String[] T00CJ8_A407EmprNom ;
   private boolean[] T00CJ8_n407EmprNom ;
   private java.math.BigDecimal[] T00CJ8_A876EscInc ;
   private boolean[] T00CJ8_n876EscInc ;
   private java.math.BigDecimal[] T00CJ8_A877EscKgm ;
   private boolean[] T00CJ8_n877EscKgm ;
   private int[] T00CJ8_A878EscVol ;
   private boolean[] T00CJ8_n878EscVol ;
   private short[] T00CJ8_A879EscUltLin ;
   private boolean[] T00CJ8_n879EscUltLin ;
   private String[] T00CJ8_A396EmprCod ;
   private String[] T00CJ7_A407EmprNom ;
   private boolean[] T00CJ7_n407EmprNom ;
   private String[] T00CJ9_A407EmprNom ;
   private boolean[] T00CJ9_n407EmprNom ;
   private String[] T00CJ10_A396EmprCod ;
   private String[] T00CJ10_A910Workstat ;
   private String[] T00CJ6_A910Workstat ;
   private java.math.BigDecimal[] T00CJ6_A876EscInc ;
   private boolean[] T00CJ6_n876EscInc ;
   private java.math.BigDecimal[] T00CJ6_A877EscKgm ;
   private boolean[] T00CJ6_n877EscKgm ;
   private int[] T00CJ6_A878EscVol ;
   private boolean[] T00CJ6_n878EscVol ;
   private short[] T00CJ6_A879EscUltLin ;
   private boolean[] T00CJ6_n879EscUltLin ;
   private String[] T00CJ6_A396EmprCod ;
   private String[] T00CJ11_A396EmprCod ;
   private String[] T00CJ11_A910Workstat ;
   private String[] T00CJ12_A396EmprCod ;
   private String[] T00CJ12_A910Workstat ;
   private String[] T00CJ5_A910Workstat ;
   private java.math.BigDecimal[] T00CJ5_A876EscInc ;
   private boolean[] T00CJ5_n876EscInc ;
   private java.math.BigDecimal[] T00CJ5_A877EscKgm ;
   private boolean[] T00CJ5_n877EscKgm ;
   private int[] T00CJ5_A878EscVol ;
   private boolean[] T00CJ5_n878EscVol ;
   private short[] T00CJ5_A879EscUltLin ;
   private boolean[] T00CJ5_n879EscUltLin ;
   private String[] T00CJ5_A396EmprCod ;
   private String[] T00CJ16_A407EmprNom ;
   private boolean[] T00CJ16_n407EmprNom ;
   private String[] T00CJ17_A396EmprCod ;
   private String[] T00CJ17_A910Workstat ;
   private int[] T00CJ17_A887EscMLin ;
   private String[] T00CJ18_A396EmprCod ;
   private String[] T00CJ18_A910Workstat ;
   private String[] T00CJ19_A910Workstat ;
   private short[] T00CJ19_A880EscLin ;
   private String[] T00CJ19_A396EmprCod ;
   private int[] T00CJ19_A252CliCod ;
   private boolean[] T00CJ19_n252CliCod ;
   private byte[] T00CJ19_A831TipColCod ;
   private boolean[] T00CJ19_n831TipColCod ;
   private String[] T00CJ19_A494ForSer ;
   private boolean[] T00CJ19_n494ForSer ;
   private String[] T00CJ19_A482ForColNom ;
   private boolean[] T00CJ19_n482ForColNom ;
   private int[] T00CJ19_A483ForColNum ;
   private boolean[] T00CJ19_n483ForColNum ;
   private String[] T00CJ4_A396EmprCod ;
   private String[] T00CJ20_A396EmprCod ;
   private String[] T00CJ21_A396EmprCod ;
   private String[] T00CJ21_A910Workstat ;
   private short[] T00CJ21_A880EscLin ;
   private String[] T00CJ3_A910Workstat ;
   private short[] T00CJ3_A880EscLin ;
   private String[] T00CJ3_A396EmprCod ;
   private int[] T00CJ3_A252CliCod ;
   private boolean[] T00CJ3_n252CliCod ;
   private byte[] T00CJ3_A831TipColCod ;
   private boolean[] T00CJ3_n831TipColCod ;
   private String[] T00CJ3_A494ForSer ;
   private boolean[] T00CJ3_n494ForSer ;
   private String[] T00CJ3_A482ForColNom ;
   private boolean[] T00CJ3_n482ForColNom ;
   private int[] T00CJ3_A483ForColNum ;
   private boolean[] T00CJ3_n483ForColNum ;
   private String[] T00CJ2_A910Workstat ;
   private short[] T00CJ2_A880EscLin ;
   private String[] T00CJ2_A396EmprCod ;
   private int[] T00CJ2_A252CliCod ;
   private boolean[] T00CJ2_n252CliCod ;
   private byte[] T00CJ2_A831TipColCod ;
   private boolean[] T00CJ2_n831TipColCod ;
   private String[] T00CJ2_A494ForSer ;
   private boolean[] T00CJ2_n494ForSer ;
   private String[] T00CJ2_A482ForColNom ;
   private boolean[] T00CJ2_n482ForColNom ;
   private int[] T00CJ2_A483ForColNum ;
   private boolean[] T00CJ2_n483ForColNum ;
   private String[] T00CJ25_A396EmprCod ;
   private String[] T00CJ25_A910Workstat ;
   private short[] T00CJ25_A880EscLin ;
   private String[] T00CJ26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tescfob__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescfob__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescfob__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescfob__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescfob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00CJ2", "SELECT Workstat, EscLin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPLESCAN WHERE EmprCod = ? AND Workstat = ? AND EscLin = ?  FOR UPDATE OF CliCod, TipColCod, ForSer, ForColNom, ForColNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ3", "SELECT Workstat, EscLin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPLESCAN WHERE EmprCod = ? AND Workstat = ? AND EscLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ4", "SELECT EmprCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ5", "SELECT Workstat, EscInc, EscKgm, EscVol, EscUltLin, EmprCod FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ?  FOR UPDATE OF EscInc, EscKgm, EscVol, EscUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ6", "SELECT Workstat, EscInc, EscKgm, EscVol, EscUltLin, EmprCod FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Workstat, T2.EmprNom, TM1.EscInc, TM1.EscKgm, TM1.EscVol, TM1.EscUltLin, TM1.EmprCod FROM (TXPCESCAN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Workstat = ? ORDER BY TM1.EmprCod, TM1.Workstat ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE ( EmprCod > ? or EmprCod = ? and Workstat > ?) ORDER BY EmprCod, Workstat) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00CJ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE ( EmprCod < ? or EmprCod = ? and Workstat < ?) ORDER BY EmprCod DESC, Workstat DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00CJ13", "INSERT INTO TXPCESCAN(Workstat, EscInc, EscKgm, EscVol, EscUltLin, EmprCod, EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCESCAN")
         ,new UpdateCursor("T00CJ14", "UPDATE TXPCESCAN SET EscInc=?, EscKgm=?, EscVol=?, EscUltLin=?  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK, "TXPCESCAN")
         ,new UpdateCursor("T00CJ15", "DELETE FROM TXPCESCAN  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK, "TXPCESCAN")
         ,new ForEachCursor("T00CJ16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ17", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00CJ18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Workstat FROM TXPCESCAN ORDER BY EmprCod, Workstat ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ19", "SELECT Workstat, EscLin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPLESCAN WHERE EmprCod = ? and Workstat = ? and EscLin = ? ORDER BY EmprCod, Workstat, EscLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ20", "SELECT EmprCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ21", "SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND Workstat = ? AND EscLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00CJ22", "INSERT INTO TXPLESCAN(Workstat, EscLin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLESCAN")
         ,new UpdateCursor("T00CJ23", "UPDATE TXPLESCAN SET CliCod=?, TipColCod=?, ForSer=?, ForColNom=?, ForColNum=?  WHERE EmprCod = ? AND Workstat = ? AND EscLin = ?", GX_NOMASK, "TXPLESCAN")
         ,new UpdateCursor("T00CJ24", "DELETE FROM TXPLESCAN  WHERE EmprCod = ? AND Workstat = ? AND EscLin = ?", GX_NOMASK, "TXPLESCAN")
         ,new ForEachCursor("T00CJ25", "SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00CJ26", "SELECT EmprCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               stmt.setString(6, (String)parms[9], 3);
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 10);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               return;
            case 21 :
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
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 10);
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
      }
   }

}

