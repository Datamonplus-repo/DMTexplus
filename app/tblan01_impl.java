package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tblan01_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9892Bl_ClasCod = (short)(GXutil.lval( httpContext.GetPar( "Bl_ClasCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         AV20Flag = (byte)(GXutil.lval( httpContext.GetPar( "Flag"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_3_15R1311( A396EmprCod, A9892Bl_ClasCod, AV20Flag) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9893Bl_TipArt = (short)(GXutil.lval( httpContext.GetPar( "Bl_TipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_15R1311( A396EmprCod, A9893Bl_TipArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9888Bl_codigo = httpContext.GetPar( "Bl_codigo") ;
         n9888Bl_codigo = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A9888Bl_codigo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO VELOCIDAD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBl_Numfi_Internalname ;
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
      A9895Bl_UltLin = (short)(GXutil.lval( httpContext.GetPar( "Bl_UltLin"))) ;
      n9895Bl_UltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tblan01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tblan01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tblan01_impl.class ));
   }

   public tblan01_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBLAN01.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Formula Inicial", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_Numfi_Internalname, GXutil.ltrim( localUtil.ntoc( A9890Bl_Numfi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBl_Numfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9890Bl_Numfi), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9890Bl_Numfi), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_Numfi_Jsonclick, 0, "", "", "", "", "", 1, edtBl_Numfi_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Formula Final", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_Numff_Internalname, GXutil.ltrim( localUtil.ntoc( A9891Bl_Numff, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBl_Numff_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9891Bl_Numff), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9891Bl_Numff), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_Numff_Jsonclick, 0, "", "", "", "", "", 1, edtBl_Numff_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_ClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9892Bl_ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBl_ClasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9892Bl_ClasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9892Bl_ClasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_ClasCod_Jsonclick, 0, "", "", "", "", "", 1, edtBl_ClasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Tipo de Composición", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_TipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A9893Bl_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBl_TipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9893Bl_TipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9893Bl_TipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_TipArt_Jsonclick, 0, "", "", "", "", "", 1, edtBl_TipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tubular", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_Tubular_Internalname, GXutil.rtrim( A9894Bl_Tubular), GXutil.rtrim( localUtil.format( A9894Bl_Tubular, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_Tubular_Jsonclick, 0, "", "", "", "", "", 1, edtBl_Tubular_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Bl UltLin", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBLAN01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBl_UltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A9895Bl_UltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBl_UltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9895Bl_UltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9895Bl_UltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBl_UltLin_Jsonclick, 0, "", "", "", "", "", 1, edtBl_UltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBLAN01.htm");
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
         nBlankRcdCount1313 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1313 = (short)(1) ;
            scanStart15R1313( ) ;
            while ( RcdFound1313 != 0 )
            {
               init_level_properties1313( ) ;
               getByPrimaryKey15R1313( ) ;
               addRow15R1313( ) ;
               scanNext15R1313( ) ;
            }
            scanEnd15R1313( ) ;
            nBlankRcdCount1313 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9895Bl_UltLin = A9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         standaloneNotModal15R1313( ) ;
         standaloneModal15R1313( ) ;
         sMode1313 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow15R1313( ) ;
            edtavnRcdDeleted_1313_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1313_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1313_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1313_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBl_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_LINEA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBl_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_linea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBl_Rdtoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_RDTOI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBl_Rdtoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Rdtoi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBl_Rdtof_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_RDTOF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBl_Rdtof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Rdtof_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBl_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_CODIGO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBl_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_codigo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBl_Velmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_VELMX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBl_Velmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Velmx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1313 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15R1313( ) ;
            }
            sendRow15R1313( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1313 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9895Bl_UltLin = B9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1313 = (short)(5) ;
         nRcdExists_1313 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15R1313( ) ;
            while ( RcdFound1313 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551313( ) ;
               init_level_properties1313( ) ;
               standaloneNotModal15R1313( ) ;
               getByPrimaryKey15R1313( ) ;
               standaloneModal15R1313( ) ;
               addRow15R1313( ) ;
               scanNext15R1313( ) ;
            }
            scanEnd15R1313( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1313 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551313( ) ;
      initAll15R1313( ) ;
      init_level_properties1313( ) ;
      B9895Bl_UltLin = A9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      nRcdExists_1313 = (short)(0) ;
      nIsMod_1313 = (short)(0) ;
      nRcdDeleted_1313 = (short)(0) ;
      nBlankRcdCount1313 = (short)(nBlankRcdUsr1313+nBlankRcdCount1313) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1313 > 0 )
      {
         standaloneNotModal15R1313( ) ;
         standaloneModal15R1313( ) ;
         addRow15R1313( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBl_Rdtoi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1313 = (short)(nBlankRcdCount1313-1) ;
      }
      Gx_mode = sMode1313 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9895Bl_UltLin = B9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBLAN01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBLAN01.htm");
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
      e1115R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9890Bl_Numfi = (int)(localUtil.ctol( httpContext.cgiGet( "Z9890Bl_Numfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9891Bl_Numff = (int)(localUtil.ctol( httpContext.cgiGet( "Z9891Bl_Numff"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9892Bl_ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z9892Bl_ClasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9893Bl_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z9893Bl_TipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9894Bl_Tubular = httpContext.cgiGet( "Z9894Bl_Tubular") ;
            Z9895Bl_UltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z9895Bl_UltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O9895Bl_UltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O9895Bl_UltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Flag2 = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBl_Numfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBl_Numfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BL_NUMFI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBl_Numfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9890Bl_Numfi = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
            }
            else
            {
               A9890Bl_Numfi = (int)(localUtil.ctol( httpContext.cgiGet( edtBl_Numfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBl_Numff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBl_Numff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BL_NUMFF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBl_Numff_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9891Bl_Numff = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
            }
            else
            {
               A9891Bl_Numff = (int)(localUtil.ctol( httpContext.cgiGet( edtBl_Numff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBl_ClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBl_ClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BL_CLASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBl_ClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9892Bl_ClasCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
            }
            else
            {
               A9892Bl_ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBl_ClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBl_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBl_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BL_TIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBl_TipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9893Bl_TipArt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
            }
            else
            {
               A9893Bl_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBl_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
            }
            A9894Bl_Tubular = httpContext.cgiGet( edtBl_Tubular_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
            A9895Bl_UltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBl_UltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9895Bl_UltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
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
               A9890Bl_Numfi = (int)(GXutil.lval( httpContext.GetPar( "Bl_Numfi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
               A9891Bl_Numff = (int)(GXutil.lval( httpContext.GetPar( "Bl_Numff"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
               A9892Bl_ClasCod = (short)(GXutil.lval( httpContext.GetPar( "Bl_ClasCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
               A9893Bl_TipArt = (short)(GXutil.lval( httpContext.GetPar( "Bl_TipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
               A9894Bl_Tubular = httpContext.GetPar( "Bl_Tubular") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
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
                        e1115R2 ();
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
            initAll15R1311( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1313_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1313_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes15R1311( ) ;
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

   public void confirm_15R0( )
   {
      beforeValidate15R1311( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15R1311( ) ;
         }
         else
         {
            checkExtendedTable15R1311( ) ;
            if ( AnyError == 0 )
            {
               zm15R1311( 13) ;
            }
            closeExtendedTableCursors15R1311( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1311 = Gx_mode ;
         confirm_15R1313( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1311 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1311 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15R0( ) ;
      }
   }

   public void confirm_15R1313( )
   {
      s9895Bl_UltLin = O9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow15R1313( ) ;
         if ( ( nRcdExists_1313 != 0 ) || ( nIsMod_1313 != 0 ) )
         {
            getKey15R1313( ) ;
            if ( ( nRcdExists_1313 == 0 ) && ( nRcdDeleted_1313 == 0 ) )
            {
               if ( RcdFound1313 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15R1313( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15R1313( ) ;
                     if ( AnyError == 0 )
                     {
                        zm15R1313( 15) ;
                     }
                     closeExtendedTableCursors15R1313( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9895Bl_UltLin = A9895Bl_UltLin ;
                     n9895Bl_UltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "BL_NUMFI");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBl_Numfi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1313 != 0 )
               {
                  if ( nRcdDeleted_1313 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15R1313( ) ;
                     load15R1313( ) ;
                     beforeValidate15R1313( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15R1313( ) ;
                        O9895Bl_UltLin = A9895Bl_UltLin ;
                        n9895Bl_UltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1313 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15R1313( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15R1313( ) ;
                           if ( AnyError == 0 )
                           {
                              zm15R1313( 15) ;
                           }
                           closeExtendedTableCursors15R1313( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9895Bl_UltLin = A9895Bl_UltLin ;
                           n9895Bl_UltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1313 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BL_NUMFI");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBl_Numfi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1313_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_Rdtoi_Internalname, GXutil.ltrim( localUtil.ntoc( A9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_Rdtof_Internalname, GXutil.ltrim( localUtil.ntoc( A9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_codigo_Internalname, GXutil.rtrim( A9888Bl_codigo)) ;
         httpContext.changePostValue( edtBl_Velmx_Internalname, GXutil.ltrim( localUtil.ntoc( A9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9896Bl_linea_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9897Bl_Rdtoi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9898Bl_Rdtof_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9899Bl_Velmx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9888Bl_codigo_"+sGXsfl_55_idx, GXutil.rtrim( Z9888Bl_codigo)) ;
         httpContext.changePostValue( "nRcdDeleted_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1313 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1313_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1313_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_LINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_RDTOI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_RDTOF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtof_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_CODIGO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_VELMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Velmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9895Bl_UltLin = s9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15R0( )
   {
   }

   public void e1115R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tblan01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tblan01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tblan01_impl.this.A396EmprCod = GXv_char2[0] ;
      tblan01_impl.this.AV11EmprNom = GXv_char3[0] ;
      tblan01_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV10EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV14eti1 = httpContext.getMessage( "Número Formula", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14eti1", AV14eti1);
      AV15eti2 = httpContext.getMessage( "Número Formula Final", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15eti2", AV15eti2);
      AV16eti3 = httpContext.getMessage( "Tipo de Artículo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16eti3", AV16eti3);
      AV17eti4 = httpContext.getMessage( "Tipo de Composición", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17eti4", AV17eti4);
      AV18eti5 = httpContext.getMessage( "Tubular", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18eti5", AV18eti5);
   }

   public void zm15R1311( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9895Bl_UltLin = T015R6_A9895Bl_UltLin[0] ;
         }
         else
         {
            Z9895Bl_UltLin = A9895Bl_UltLin ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z9890Bl_Numfi = A9890Bl_Numfi ;
         Z9891Bl_Numff = A9891Bl_Numff ;
         Z9892Bl_ClasCod = A9892Bl_ClasCod ;
         Z9893Bl_TipArt = A9893Bl_TipArt ;
         Z9894Bl_Tubular = A9894Bl_Tubular ;
         Z9895Bl_UltLin = A9895Bl_UltLin ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBl_UltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_UltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_UltLin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtBl_UltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_UltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_UltLin_Enabled), 5, 0), true);
      /* Using cursor T015R7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
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

   public void load15R1311( )
   {
      /* Using cursor T015R8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1311 = (short)(1) ;
         A9895Bl_UltLin = T015R8_A9895Bl_UltLin[0] ;
         n9895Bl_UltLin = T015R8_n9895Bl_UltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         zm15R1311( -12) ;
      }
      pr_default.close(6);
      onLoadActions15R1311( ) ;
   }

   public void onLoadActions15R1311( )
   {
   }

   public void checkExtendedTable15R1311( )
   {
      nIsDirty_1311 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( true /* After */ && ( A9891Bl_Numff < A9890Bl_Numfi ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formula inicial tiene que ser mayor o igual a la formula final", ""), 1, "BL_NUMFF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Numff_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9892Bl_ClasCod ;
         GXv_int6[0] = AV20Flag ;
         new app.pbusclas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tblan01_impl.this.A396EmprCod = GXv_char4[0] ;
         tblan01_impl.this.A9892Bl_ClasCod = GXv_int5[0] ;
         tblan01_impl.this.AV20Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      }
      if ( ( true /* After */ && ( AV20Flag == 0 ) ) && ( A9892Bl_ClasCod > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe tipo artículo", ""), 1, "BL_CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_ClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( true /* After */ ) && ( A9893Bl_TipArt > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9893Bl_TipArt ;
         GXv_int6[0] = AV21Flag2 ;
         new app.pbustar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tblan01_impl.this.A396EmprCod = GXv_char4[0] ;
         tblan01_impl.this.A9893Bl_TipArt = GXv_int5[0] ;
         tblan01_impl.this.AV21Flag2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Flag2", GXutil.str( AV21Flag2, 1, 0));
      }
      if ( true /* After */ && ( AV21Flag2 == 0 ) && ( A9893Bl_TipArt > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe tipo composición", ""), 1, "BL_TIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_TipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A9894Bl_Tubular, "*") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede ser S o N", ""), 1, "BL_TUBULAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Tubular_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15R1311( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15R1311( )
   {
      /* Using cursor T015R9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1311 = (short)(1) ;
      }
      else
      {
         RcdFound1311 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015R6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T015R6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15R1311( 12) ;
         RcdFound1311 = (short)(1) ;
         A9890Bl_Numfi = T015R6_A9890Bl_Numfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
         A9891Bl_Numff = T015R6_A9891Bl_Numff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
         A9892Bl_ClasCod = T015R6_A9892Bl_ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         A9893Bl_TipArt = T015R6_A9893Bl_TipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         A9894Bl_Tubular = T015R6_A9894Bl_Tubular[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
         A9895Bl_UltLin = T015R6_A9895Bl_UltLin[0] ;
         n9895Bl_UltLin = T015R6_n9895Bl_UltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         O9895Bl_UltLin = A9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z9890Bl_Numfi = A9890Bl_Numfi ;
         Z9891Bl_Numff = A9891Bl_Numff ;
         Z9892Bl_ClasCod = A9892Bl_ClasCod ;
         Z9893Bl_TipArt = A9893Bl_TipArt ;
         Z9894Bl_Tubular = A9894Bl_Tubular ;
         sMode1311 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15R1311( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1311 = (short)(0) ;
            initializeNonKey15R1311( ) ;
         }
         Gx_mode = sMode1311 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1311 = (short)(0) ;
         initializeNonKey15R1311( ) ;
         sMode1311 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1311 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey15R1311( ) ;
      if ( RcdFound1311 == 0 )
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
      RcdFound1311 = (short)(0) ;
      /* Using cursor T015R10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9892Bl_ClasCod), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), Short.valueOf(A9893Bl_TipArt), Short.valueOf(A9893Bl_TipArt), Short.valueOf(A9892Bl_ClasCod), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), A9894Bl_Tubular, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T015R10_A9890Bl_Numfi[0] < A9890Bl_Numfi ) || ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9891Bl_Numff[0] < A9891Bl_Numff ) || ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9892Bl_ClasCod[0] < A9892Bl_ClasCod ) || ( T015R10_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9893Bl_TipArt[0] < A9893Bl_TipArt ) || ( T015R10_A9893Bl_TipArt[0] == A9893Bl_TipArt ) && ( T015R10_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( GXutil.strcmp(T015R10_A9894Bl_Tubular[0], A9894Bl_Tubular) < 0 ) ) && ( GXutil.strcmp(T015R10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T015R10_A9890Bl_Numfi[0] > A9890Bl_Numfi ) || ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9891Bl_Numff[0] > A9891Bl_Numff ) || ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9892Bl_ClasCod[0] > A9892Bl_ClasCod ) || ( T015R10_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R10_A9893Bl_TipArt[0] > A9893Bl_TipArt ) || ( T015R10_A9893Bl_TipArt[0] == A9893Bl_TipArt ) && ( T015R10_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R10_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R10_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( GXutil.strcmp(T015R10_A9894Bl_Tubular[0], A9894Bl_Tubular) > 0 ) ) && ( GXutil.strcmp(T015R10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9890Bl_Numfi = T015R10_A9890Bl_Numfi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
            A9891Bl_Numff = T015R10_A9891Bl_Numff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
            A9892Bl_ClasCod = T015R10_A9892Bl_ClasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
            A9893Bl_TipArt = T015R10_A9893Bl_TipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
            A9894Bl_Tubular = T015R10_A9894Bl_Tubular[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
            RcdFound1311 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1311 = (short)(0) ;
      /* Using cursor T015R11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9892Bl_ClasCod), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), Short.valueOf(A9893Bl_TipArt), Short.valueOf(A9893Bl_TipArt), Short.valueOf(A9892Bl_ClasCod), Integer.valueOf(A9891Bl_Numff), Integer.valueOf(A9890Bl_Numfi), A9894Bl_Tubular, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T015R11_A9890Bl_Numfi[0] > A9890Bl_Numfi ) || ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9891Bl_Numff[0] > A9891Bl_Numff ) || ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9892Bl_ClasCod[0] > A9892Bl_ClasCod ) || ( T015R11_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9893Bl_TipArt[0] > A9893Bl_TipArt ) || ( T015R11_A9893Bl_TipArt[0] == A9893Bl_TipArt ) && ( T015R11_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( GXutil.strcmp(T015R11_A9894Bl_Tubular[0], A9894Bl_Tubular) > 0 ) ) && ( GXutil.strcmp(T015R11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T015R11_A9890Bl_Numfi[0] < A9890Bl_Numfi ) || ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9891Bl_Numff[0] < A9891Bl_Numff ) || ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9892Bl_ClasCod[0] < A9892Bl_ClasCod ) || ( T015R11_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( T015R11_A9893Bl_TipArt[0] < A9893Bl_TipArt ) || ( T015R11_A9893Bl_TipArt[0] == A9893Bl_TipArt ) && ( T015R11_A9892Bl_ClasCod[0] == A9892Bl_ClasCod ) && ( T015R11_A9891Bl_Numff[0] == A9891Bl_Numff ) && ( T015R11_A9890Bl_Numfi[0] == A9890Bl_Numfi ) && ( GXutil.strcmp(T015R11_A9894Bl_Tubular[0], A9894Bl_Tubular) < 0 ) ) && ( GXutil.strcmp(T015R11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9890Bl_Numfi = T015R11_A9890Bl_Numfi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
            A9891Bl_Numff = T015R11_A9891Bl_Numff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
            A9892Bl_ClasCod = T015R11_A9892Bl_ClasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
            A9893Bl_TipArt = T015R11_A9893Bl_TipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
            A9894Bl_Tubular = T015R11_A9894Bl_Tubular[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
            RcdFound1311 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15R1311( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9895Bl_UltLin = O9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         GX_FocusControl = edtBl_Numfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15R1311( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1311 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9890Bl_Numfi != Z9890Bl_Numfi ) || ( A9891Bl_Numff != Z9891Bl_Numff ) || ( A9892Bl_ClasCod != Z9892Bl_ClasCod ) || ( A9893Bl_TipArt != Z9893Bl_TipArt ) || ( GXutil.strcmp(A9894Bl_Tubular, Z9894Bl_Tubular) != 0 ) )
            {
               A9890Bl_Numfi = Z9890Bl_Numfi ;
               httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
               A9891Bl_Numff = Z9891Bl_Numff ;
               httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
               A9892Bl_ClasCod = Z9892Bl_ClasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
               A9893Bl_TipArt = Z9893Bl_TipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
               A9894Bl_Tubular = Z9894Bl_Tubular ;
               httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9895Bl_UltLin = O9895Bl_UltLin ;
               n9895Bl_UltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBl_Numfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9895Bl_UltLin = O9895Bl_UltLin ;
               n9895Bl_UltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
               update15R1311( ) ;
               GX_FocusControl = edtBl_Numfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9890Bl_Numfi != Z9890Bl_Numfi ) || ( A9891Bl_Numff != Z9891Bl_Numff ) || ( A9892Bl_ClasCod != Z9892Bl_ClasCod ) || ( A9893Bl_TipArt != Z9893Bl_TipArt ) || ( GXutil.strcmp(A9894Bl_Tubular, Z9894Bl_Tubular) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9895Bl_UltLin = O9895Bl_UltLin ;
               n9895Bl_UltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
               GX_FocusControl = edtBl_Numfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15R1311( ) ;
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
                  A9895Bl_UltLin = O9895Bl_UltLin ;
                  n9895Bl_UltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
                  GX_FocusControl = edtBl_Numfi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15R1311( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9890Bl_Numfi != Z9890Bl_Numfi ) || ( A9891Bl_Numff != Z9891Bl_Numff ) || ( A9892Bl_ClasCod != Z9892Bl_ClasCod ) || ( A9893Bl_TipArt != Z9893Bl_TipArt ) || ( GXutil.strcmp(A9894Bl_Tubular, Z9894Bl_Tubular) != 0 ) )
      {
         A9890Bl_Numfi = Z9890Bl_Numfi ;
         httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
         A9891Bl_Numff = Z9891Bl_Numff ;
         httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
         A9892Bl_ClasCod = Z9892Bl_ClasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         A9893Bl_TipArt = Z9893Bl_TipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         A9894Bl_Tubular = Z9894Bl_Tubular ;
         httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9895Bl_UltLin = O9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBl_Numfi_Internalname ;
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
      getKey15R1311( ) ;
      if ( RcdFound1311 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9890Bl_Numfi != Z9890Bl_Numfi ) || ( A9891Bl_Numff != Z9891Bl_Numff ) || ( A9892Bl_ClasCod != Z9892Bl_ClasCod ) || ( A9893Bl_TipArt != Z9893Bl_TipArt ) || ( GXutil.strcmp(A9894Bl_Tubular, Z9894Bl_Tubular) != 0 ) )
         {
            A9890Bl_Numfi = Z9890Bl_Numfi ;
            httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
            A9891Bl_Numff = Z9891Bl_Numff ;
            httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
            A9892Bl_ClasCod = Z9892Bl_ClasCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
            A9893Bl_TipArt = Z9893Bl_TipArt ;
            httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
            A9894Bl_Tubular = Z9894Bl_Tubular ;
            httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9890Bl_Numfi != Z9890Bl_Numfi ) || ( A9891Bl_Numff != Z9891Bl_Numff ) || ( A9892Bl_ClasCod != Z9892Bl_ClasCod ) || ( A9893Bl_TipArt != Z9893Bl_TipArt ) || ( GXutil.strcmp(A9894Bl_Tubular, Z9894Bl_Tubular) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tblan01");
   }

   public void insert_check( )
   {
      confirm_15R0( ) ;
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
      if ( RcdFound1311 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15R1311( ) ;
      if ( RcdFound1311 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15R1311( ) ;
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
      if ( RcdFound1311 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound1311 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15R1311( ) ;
      if ( RcdFound1311 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1311 != 0 )
         {
            scanNext15R1311( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15R1311( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15R1311( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015R5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBLAN01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z9895Bl_UltLin != T015R5_A9895Bl_UltLin[0] ) )
         {
            if ( Z9895Bl_UltLin != T015R5_A9895Bl_UltLin[0] )
            {
               GXutil.writeLogln("tblan01:[seudo value changed for attri]"+"Bl_UltLin");
               GXutil.writeLogRaw("Old: ",Z9895Bl_UltLin);
               GXutil.writeLogRaw("Current: ",T015R5_A9895Bl_UltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBLAN01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15R1311( )
   {
      beforeValidate15R1311( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15R1311( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15R1311( 0) ;
         checkOptimisticConcurrency15R1311( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15R1311( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15R1311( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015R12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Boolean.valueOf(n9895Bl_UltLin), Short.valueOf(A9895Bl_UltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN01");
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
                        processLevel15R1311( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15R0( ) ;
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
            load15R1311( ) ;
         }
         endLevel15R1311( ) ;
      }
      closeExtendedTableCursors15R1311( ) ;
   }

   public void update15R1311( )
   {
      beforeValidate15R1311( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15R1311( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15R1311( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15R1311( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15R1311( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015R13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n9895Bl_UltLin), Short.valueOf(A9895Bl_UltLin), A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN01");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBLAN01"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15R1311( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15R1311( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15R0( ) ;
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
         endLevel15R1311( ) ;
      }
      closeExtendedTableCursors15R1311( ) ;
   }

   public void deferredUpdate15R1311( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15R1311( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15R1311( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15R1311( ) ;
         afterConfirm15R1311( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15R1311( ) ;
            if ( AnyError == 0 )
            {
               A9895Bl_UltLin = O9895Bl_UltLin ;
               n9895Bl_UltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
               scanStart15R1313( ) ;
               while ( RcdFound1313 != 0 )
               {
                  getByPrimaryKey15R1313( ) ;
                  delete15R1313( ) ;
                  scanNext15R1313( ) ;
                  O9895Bl_UltLin = A9895Bl_UltLin ;
                  n9895Bl_UltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
               }
               scanEnd15R1313( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015R14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN01");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1311 == 0 )
                        {
                           initAll15R1311( ) ;
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
                        resetCaption15R0( ) ;
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
      sMode1311 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15R1311( ) ;
      Gx_mode = sMode1311 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15R1311( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15R1313( )
   {
      s9895Bl_UltLin = O9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow15R1313( ) ;
         if ( ( nRcdExists_1313 != 0 ) || ( nIsMod_1313 != 0 ) )
         {
            standaloneNotModal15R1313( ) ;
            getKey15R1313( ) ;
            if ( ( nRcdExists_1313 == 0 ) && ( nRcdDeleted_1313 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15R1313( ) ;
            }
            else
            {
               if ( RcdFound1313 != 0 )
               {
                  if ( ( nRcdDeleted_1313 != 0 ) && ( nRcdExists_1313 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15R1313( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1313 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15R1313( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1313 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BL_NUMFI");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBl_Numfi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9895Bl_UltLin = A9895Bl_UltLin ;
            n9895Bl_UltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1313_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_Rdtoi_Internalname, GXutil.ltrim( localUtil.ntoc( A9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_Rdtof_Internalname, GXutil.ltrim( localUtil.ntoc( A9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBl_codigo_Internalname, GXutil.rtrim( A9888Bl_codigo)) ;
         httpContext.changePostValue( edtBl_Velmx_Internalname, GXutil.ltrim( localUtil.ntoc( A9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9896Bl_linea_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9897Bl_Rdtoi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9898Bl_Rdtof_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9899Bl_Velmx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9888Bl_codigo_"+sGXsfl_55_idx, GXutil.rtrim( Z9888Bl_codigo)) ;
         httpContext.changePostValue( "nRcdDeleted_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1313_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1313 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1313_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1313_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_LINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_RDTOI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_RDTOF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtof_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_CODIGO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BL_VELMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Velmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15R1313( ) ;
      if ( AnyError != 0 )
      {
         O9895Bl_UltLin = s9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      }
      nRcdExists_1313 = (short)(0) ;
      nIsMod_1313 = (short)(0) ;
      nRcdDeleted_1313 = (short)(0) ;
   }

   public void processLevel15R1311( )
   {
      /* Save parent mode. */
      sMode1311 = Gx_mode ;
      processNestedLevel15R1313( ) ;
      if ( AnyError != 0 )
      {
         O9895Bl_UltLin = s9895Bl_UltLin ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1311 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T015R15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n9895Bl_UltLin), Short.valueOf(A9895Bl_UltLin), A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN01");
   }

   public void endLevel15R1311( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete15R1311( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tblan01");
         if ( AnyError == 0 )
         {
            confirmValues15R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tblan01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15R1311( )
   {
      /* Scan By routine */
      /* Using cursor T015R16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1311 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1311 = (short)(1) ;
         A9890Bl_Numfi = T015R16_A9890Bl_Numfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
         A9891Bl_Numff = T015R16_A9891Bl_Numff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
         A9892Bl_ClasCod = T015R16_A9892Bl_ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         A9893Bl_TipArt = T015R16_A9893Bl_TipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         A9894Bl_Tubular = T015R16_A9894Bl_Tubular[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15R1311( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1311 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1311 = (short)(1) ;
         A9890Bl_Numfi = T015R16_A9890Bl_Numfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
         A9891Bl_Numff = T015R16_A9891Bl_Numff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
         A9892Bl_ClasCod = T015R16_A9892Bl_ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         A9893Bl_TipArt = T015R16_A9893Bl_TipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         A9894Bl_Tubular = T015R16_A9894Bl_Tubular[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
      }
   }

   public void scanEnd15R1311( )
   {
      pr_default.close(14);
   }

   public void afterConfirm15R1311( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15R1311( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15R1311( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15R1311( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15R1311( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15R1311( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15R1311( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBl_Numfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Numfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Numfi_Enabled), 5, 0), true);
      edtBl_Numff_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Numff_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Numff_Enabled), 5, 0), true);
      edtBl_ClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_ClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_ClasCod_Enabled), 5, 0), true);
      edtBl_TipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_TipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_TipArt_Enabled), 5, 0), true);
      edtBl_Tubular_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Tubular_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Tubular_Enabled), 5, 0), true);
      edtBl_UltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_UltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_UltLin_Enabled), 5, 0), true);
   }

   public void zm15R1313( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9897Bl_Rdtoi = T015R3_A9897Bl_Rdtoi[0] ;
            Z9898Bl_Rdtof = T015R3_A9898Bl_Rdtof[0] ;
            Z9899Bl_Velmx = T015R3_A9899Bl_Velmx[0] ;
            Z9888Bl_codigo = T015R3_A9888Bl_codigo[0] ;
         }
         else
         {
            Z9897Bl_Rdtoi = A9897Bl_Rdtoi ;
            Z9898Bl_Rdtof = A9898Bl_Rdtof ;
            Z9899Bl_Velmx = A9899Bl_Velmx ;
            Z9888Bl_codigo = A9888Bl_codigo ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z9890Bl_Numfi = A9890Bl_Numfi ;
         Z9891Bl_Numff = A9891Bl_Numff ;
         Z9892Bl_ClasCod = A9892Bl_ClasCod ;
         Z9893Bl_TipArt = A9893Bl_TipArt ;
         Z9894Bl_Tubular = A9894Bl_Tubular ;
         Z9896Bl_linea = A9896Bl_linea ;
         Z9897Bl_Rdtoi = A9897Bl_Rdtoi ;
         Z9898Bl_Rdtof = A9898Bl_Rdtof ;
         Z9899Bl_Velmx = A9899Bl_Velmx ;
         Z396EmprCod = A396EmprCod ;
         Z9888Bl_codigo = A9888Bl_codigo ;
      }
   }

   public void standaloneNotModal15R1313( )
   {
      edtBl_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_linea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBl_UltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_UltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_UltLin_Enabled), 5, 0), true);
      edtBl_UltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_UltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_UltLin_Enabled), 5, 0), true);
   }

   public void standaloneModal15R1313( )
   {
      if ( isIns( )  )
      {
         A9895Bl_UltLin = (short)(O9895Bl_UltLin+1) ;
         n9895Bl_UltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A9896Bl_linea = A9895Bl_UltLin ;
      }
   }

   public void load15R1313( )
   {
      /* Using cursor T015R17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1313 = (short)(1) ;
         A9897Bl_Rdtoi = T015R17_A9897Bl_Rdtoi[0] ;
         n9897Bl_Rdtoi = T015R17_n9897Bl_Rdtoi[0] ;
         A9898Bl_Rdtof = T015R17_A9898Bl_Rdtof[0] ;
         n9898Bl_Rdtof = T015R17_n9898Bl_Rdtof[0] ;
         A9899Bl_Velmx = T015R17_A9899Bl_Velmx[0] ;
         n9899Bl_Velmx = T015R17_n9899Bl_Velmx[0] ;
         A9888Bl_codigo = T015R17_A9888Bl_codigo[0] ;
         n9888Bl_codigo = T015R17_n9888Bl_codigo[0] ;
         zm15R1313( -14) ;
      }
      pr_default.close(15);
      onLoadActions15R1313( ) ;
   }

   public void onLoadActions15R1313( )
   {
   }

   public void checkExtendedTable15R1313( )
   {
      nIsDirty_1313 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal15R1313( ) ;
      /* Using cursor T015R4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9888Bl_codigo), A9888Bl_codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BL_CODIGO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BLAN00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors15R1313( )
   {
      pr_default.close(2);
   }

   public void enableDisable15R1313( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A9888Bl_codigo )
   {
      /* Using cursor T015R18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n9888Bl_codigo), A9888Bl_codigo});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "BL_CODIGO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BLAN00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey15R1313( )
   {
      /* Using cursor T015R19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1313 = (short)(1) ;
      }
      else
      {
         RcdFound1313 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey15R1313( )
   {
      /* Using cursor T015R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015R3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15R1313( 14) ;
         RcdFound1313 = (short)(1) ;
         initializeNonKey15R1313( ) ;
         A9896Bl_linea = T015R3_A9896Bl_linea[0] ;
         A9897Bl_Rdtoi = T015R3_A9897Bl_Rdtoi[0] ;
         n9897Bl_Rdtoi = T015R3_n9897Bl_Rdtoi[0] ;
         A9898Bl_Rdtof = T015R3_A9898Bl_Rdtof[0] ;
         n9898Bl_Rdtof = T015R3_n9898Bl_Rdtof[0] ;
         A9899Bl_Velmx = T015R3_A9899Bl_Velmx[0] ;
         n9899Bl_Velmx = T015R3_n9899Bl_Velmx[0] ;
         A9888Bl_codigo = T015R3_A9888Bl_codigo[0] ;
         n9888Bl_codigo = T015R3_n9888Bl_codigo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9890Bl_Numfi = A9890Bl_Numfi ;
         Z9891Bl_Numff = A9891Bl_Numff ;
         Z9892Bl_ClasCod = A9892Bl_ClasCod ;
         Z9893Bl_TipArt = A9893Bl_TipArt ;
         Z9894Bl_Tubular = A9894Bl_Tubular ;
         Z9896Bl_linea = A9896Bl_linea ;
         sMode1313 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15R1313( ) ;
         load15R1313( ) ;
         Gx_mode = sMode1313 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1313 = (short)(0) ;
         initializeNonKey15R1313( ) ;
         sMode1313 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15R1313( ) ;
         Gx_mode = sMode1313 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15R1313( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15R1313( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBLAN02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9897Bl_Rdtoi, T015R2_A9897Bl_Rdtoi[0]) != 0 ) || ( DecimalUtil.compareTo(Z9898Bl_Rdtof, T015R2_A9898Bl_Rdtof[0]) != 0 ) || ( DecimalUtil.compareTo(Z9899Bl_Velmx, T015R2_A9899Bl_Velmx[0]) != 0 ) || ( GXutil.strcmp(Z9888Bl_codigo, T015R2_A9888Bl_codigo[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9897Bl_Rdtoi, T015R2_A9897Bl_Rdtoi[0]) != 0 )
            {
               GXutil.writeLogln("tblan01:[seudo value changed for attri]"+"Bl_Rdtoi");
               GXutil.writeLogRaw("Old: ",Z9897Bl_Rdtoi);
               GXutil.writeLogRaw("Current: ",T015R2_A9897Bl_Rdtoi[0]);
            }
            if ( DecimalUtil.compareTo(Z9898Bl_Rdtof, T015R2_A9898Bl_Rdtof[0]) != 0 )
            {
               GXutil.writeLogln("tblan01:[seudo value changed for attri]"+"Bl_Rdtof");
               GXutil.writeLogRaw("Old: ",Z9898Bl_Rdtof);
               GXutil.writeLogRaw("Current: ",T015R2_A9898Bl_Rdtof[0]);
            }
            if ( DecimalUtil.compareTo(Z9899Bl_Velmx, T015R2_A9899Bl_Velmx[0]) != 0 )
            {
               GXutil.writeLogln("tblan01:[seudo value changed for attri]"+"Bl_Velmx");
               GXutil.writeLogRaw("Old: ",Z9899Bl_Velmx);
               GXutil.writeLogRaw("Current: ",T015R2_A9899Bl_Velmx[0]);
            }
            if ( GXutil.strcmp(Z9888Bl_codigo, T015R2_A9888Bl_codigo[0]) != 0 )
            {
               GXutil.writeLogln("tblan01:[seudo value changed for attri]"+"Bl_codigo");
               GXutil.writeLogRaw("Old: ",Z9888Bl_codigo);
               GXutil.writeLogRaw("Current: ",T015R2_A9888Bl_codigo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBLAN02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15R1313( )
   {
      beforeValidate15R1313( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15R1313( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15R1313( 0) ;
         checkOptimisticConcurrency15R1313( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15R1313( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15R1313( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015R20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea), Boolean.valueOf(n9897Bl_Rdtoi), A9897Bl_Rdtoi, Boolean.valueOf(n9898Bl_Rdtof), A9898Bl_Rdtof, Boolean.valueOf(n9899Bl_Velmx), A9899Bl_Velmx, A396EmprCod, Boolean.valueOf(n9888Bl_codigo), A9888Bl_codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN02");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load15R1313( ) ;
         }
         endLevel15R1313( ) ;
      }
      closeExtendedTableCursors15R1313( ) ;
   }

   public void update15R1313( )
   {
      beforeValidate15R1313( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15R1313( ) ;
      }
      if ( ( nIsMod_1313 != 0 ) || ( nIsDirty_1313 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15R1313( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15R1313( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15R1313( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015R21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n9897Bl_Rdtoi), A9897Bl_Rdtoi, Boolean.valueOf(n9898Bl_Rdtof), A9898Bl_Rdtof, Boolean.valueOf(n9899Bl_Velmx), A9899Bl_Velmx, Boolean.valueOf(n9888Bl_codigo), A9888Bl_codigo, A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN02");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBLAN02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15R1313( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15R1313( ) ;
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
            endLevel15R1313( ) ;
         }
      }
      closeExtendedTableCursors15R1313( ) ;
   }

   public void deferredUpdate15R1313( )
   {
   }

   public void delete15R1313( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15R1313( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15R1313( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15R1313( ) ;
         afterConfirm15R1313( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15R1313( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015R22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular, Short.valueOf(A9896Bl_linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBLAN02");
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
      sMode1313 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15R1313( ) ;
      Gx_mode = sMode1313 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15R1313( )
   {
      standaloneModal15R1313( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel15R1313( )
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

   public void scanStart15R1313( )
   {
      /* Scan By routine */
      /* Using cursor T015R23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9890Bl_Numfi), Integer.valueOf(A9891Bl_Numff), Short.valueOf(A9892Bl_ClasCod), Short.valueOf(A9893Bl_TipArt), A9894Bl_Tubular});
      RcdFound1313 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1313 = (short)(1) ;
         A9896Bl_linea = T015R23_A9896Bl_linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15R1313( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1313 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1313 = (short)(1) ;
         A9896Bl_linea = T015R23_A9896Bl_linea[0] ;
      }
   }

   public void scanEnd15R1313( )
   {
      pr_default.close(21);
   }

   public void afterConfirm15R1313( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15R1313( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15R1313( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15R1313( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15R1313( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15R1313( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15R1313( )
   {
      edtBl_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_linea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBl_Rdtoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Rdtoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Rdtoi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBl_Rdtof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Rdtof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Rdtof_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBl_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_codigo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBl_Velmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_Velmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_Velmx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes15R1313( )
   {
   }

   public void send_integrity_lvl_hashes15R1311( )
   {
   }

   public void subsflControlProps_551313( )
   {
      edtavnRcdDeleted_1313_Internalname = "vNRCDDELETED_1313_"+sGXsfl_55_idx ;
      edtBl_linea_Internalname = "BL_LINEA_"+sGXsfl_55_idx ;
      edtBl_Rdtoi_Internalname = "BL_RDTOI_"+sGXsfl_55_idx ;
      edtBl_Rdtof_Internalname = "BL_RDTOF_"+sGXsfl_55_idx ;
      edtBl_codigo_Internalname = "BL_CODIGO_"+sGXsfl_55_idx ;
      edtBl_Velmx_Internalname = "BL_VELMX_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551313( )
   {
      edtavnRcdDeleted_1313_Internalname = "vNRCDDELETED_1313_"+sGXsfl_55_fel_idx ;
      edtBl_linea_Internalname = "BL_LINEA_"+sGXsfl_55_fel_idx ;
      edtBl_Rdtoi_Internalname = "BL_RDTOI_"+sGXsfl_55_fel_idx ;
      edtBl_Rdtof_Internalname = "BL_RDTOF_"+sGXsfl_55_fel_idx ;
      edtBl_codigo_Internalname = "BL_CODIGO_"+sGXsfl_55_fel_idx ;
      edtBl_Velmx_Internalname = "BL_VELMX_"+sGXsfl_55_fel_idx ;
   }

   public void addRow15R1313( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551313( ) ;
      sendRow15R1313( ) ;
   }

   public void sendRow15R1313( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1313_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1313_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1313_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1313), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1313), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1313_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1313_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBl_linea_Internalname,GXutil.ltrim( localUtil.ntoc( A9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBl_linea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9896Bl_linea), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9896Bl_linea), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBl_linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBl_linea_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1313_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBl_Rdtoi_Internalname,GXutil.ltrim( localUtil.ntoc( A9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBl_Rdtoi_Enabled!=0) ? localUtil.format( A9897Bl_Rdtoi, "ZZ9.9") : localUtil.format( A9897Bl_Rdtoi, "ZZ9.9"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBl_Rdtoi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBl_Rdtoi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1313_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBl_Rdtof_Internalname,GXutil.ltrim( localUtil.ntoc( A9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBl_Rdtof_Enabled!=0) ? localUtil.format( A9898Bl_Rdtof, "ZZ9.9") : localUtil.format( A9898Bl_Rdtof, "ZZ9.9"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBl_Rdtof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBl_Rdtof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1313_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBl_codigo_Internalname,GXutil.rtrim( A9888Bl_codigo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBl_codigo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBl_codigo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1313_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBl_Velmx_Internalname,GXutil.ltrim( localUtil.ntoc( A9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBl_Velmx_Enabled!=0) ? localUtil.format( A9899Bl_Velmx, "ZZ9.9") : localUtil.format( A9899Bl_Velmx, "ZZ9.9"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBl_Velmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBl_Velmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15R1313( ) ;
      GXCCtl = "Z9896Bl_linea_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9896Bl_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9897Bl_Rdtoi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9897Bl_Rdtoi, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9898Bl_Rdtof_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9898Bl_Rdtof, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9899Bl_Velmx_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9899Bl_Velmx, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9888Bl_codigo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9888Bl_codigo));
      GXCCtl = "nRcdDeleted_1313_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1313_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1313_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1313, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1313_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1313_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BL_LINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BL_RDTOI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BL_RDTOF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtof_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BL_CODIGO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BL_VELMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Velmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15R1313( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551313( ) ;
      edtavnRcdDeleted_1313_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1313_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBl_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_LINEA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBl_Rdtoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_RDTOI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBl_Rdtof_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_RDTOF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBl_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_CODIGO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBl_Velmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BL_VELMX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1313_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1313_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1313");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1313_Internalname ;
         wbErr = true ;
         nRcdDeleted_1313 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1313 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1313_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9896Bl_linea = (short)(localUtil.ctol( httpContext.cgiGet( edtBl_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBl_Rdtoi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBl_Rdtoi_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
      {
         GXCCtl = "BL_RDTOI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Rdtoi_Internalname ;
         wbErr = true ;
         A9897Bl_Rdtoi = DecimalUtil.ZERO ;
         n9897Bl_Rdtoi = false ;
      }
      else
      {
         A9897Bl_Rdtoi = localUtil.ctond( httpContext.cgiGet( edtBl_Rdtoi_Internalname)) ;
         n9897Bl_Rdtoi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBl_Rdtof_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBl_Rdtof_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
      {
         GXCCtl = "BL_RDTOF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Rdtof_Internalname ;
         wbErr = true ;
         A9898Bl_Rdtof = DecimalUtil.ZERO ;
         n9898Bl_Rdtof = false ;
      }
      else
      {
         A9898Bl_Rdtof = localUtil.ctond( httpContext.cgiGet( edtBl_Rdtof_Internalname)) ;
         n9898Bl_Rdtof = false ;
      }
      A9888Bl_codigo = httpContext.cgiGet( edtBl_codigo_Internalname) ;
      n9888Bl_codigo = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBl_Velmx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBl_Velmx_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
      {
         GXCCtl = "BL_VELMX_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Velmx_Internalname ;
         wbErr = true ;
         A9899Bl_Velmx = DecimalUtil.ZERO ;
         n9899Bl_Velmx = false ;
      }
      else
      {
         A9899Bl_Velmx = localUtil.ctond( httpContext.cgiGet( edtBl_Velmx_Internalname)) ;
         n9899Bl_Velmx = false ;
      }
      GXCCtl = "Z9896Bl_linea_" + sGXsfl_55_idx ;
      Z9896Bl_linea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9897Bl_Rdtoi_" + sGXsfl_55_idx ;
      Z9897Bl_Rdtoi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9898Bl_Rdtof_" + sGXsfl_55_idx ;
      Z9898Bl_Rdtof = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9899Bl_Velmx_" + sGXsfl_55_idx ;
      Z9899Bl_Velmx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9888Bl_codigo_" + sGXsfl_55_idx ;
      Z9888Bl_codigo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1313_" + sGXsfl_55_idx ;
      nRcdDeleted_1313 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1313_" + sGXsfl_55_idx ;
      nRcdExists_1313 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1313_" + sGXsfl_55_idx ;
      nIsMod_1313 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBl_linea_Enabled = edtBl_linea_Enabled ;
   }

   public void confirmValues15R0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551313( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551313( ) ;
         httpContext.changePostValue( "Z9896Bl_linea_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9896Bl_linea_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9896Bl_linea_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9897Bl_Rdtoi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9897Bl_Rdtoi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9897Bl_Rdtoi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9898Bl_Rdtof_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9898Bl_Rdtof_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9898Bl_Rdtof_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9899Bl_Velmx_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9899Bl_Velmx_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9899Bl_Velmx_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9888Bl_codigo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9888Bl_codigo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9888Bl_codigo_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tblan01", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9890Bl_Numfi", GXutil.ltrim( localUtil.ntoc( Z9890Bl_Numfi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9891Bl_Numff", GXutil.ltrim( localUtil.ntoc( Z9891Bl_Numff, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9892Bl_ClasCod", GXutil.ltrim( localUtil.ntoc( Z9892Bl_ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9893Bl_TipArt", GXutil.ltrim( localUtil.ntoc( Z9893Bl_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9894Bl_Tubular", GXutil.rtrim( Z9894Bl_Tubular));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9895Bl_UltLin", GXutil.ltrim( localUtil.ntoc( Z9895Bl_UltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9895Bl_UltLin", GXutil.ltrim( localUtil.ntoc( O9895Bl_UltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV21Flag2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tblan01", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBLAN01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO VELOCIDAD", "") ;
   }

   public void initializeNonKey15R1311( )
   {
      AV20Flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      AV21Flag2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Flag2", GXutil.str( AV21Flag2, 1, 0));
      A9895Bl_UltLin = (short)(0) ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      O9895Bl_UltLin = A9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
      Z9895Bl_UltLin = (short)(0) ;
   }

   public void initAll15R1311( )
   {
      A9890Bl_Numfi = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9890Bl_Numfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9890Bl_Numfi), 8, 0));
      A9891Bl_Numff = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9891Bl_Numff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9891Bl_Numff), 8, 0));
      A9892Bl_ClasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
      A9893Bl_TipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
      A9894Bl_Tubular = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9894Bl_Tubular", A9894Bl_Tubular);
      initializeNonKey15R1311( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15R1313( )
   {
      A9897Bl_Rdtoi = DecimalUtil.ZERO ;
      n9897Bl_Rdtoi = false ;
      A9898Bl_Rdtof = DecimalUtil.ZERO ;
      n9898Bl_Rdtof = false ;
      A9888Bl_codigo = "" ;
      n9888Bl_codigo = false ;
      A9899Bl_Velmx = DecimalUtil.ZERO ;
      n9899Bl_Velmx = false ;
      Z9897Bl_Rdtoi = DecimalUtil.ZERO ;
      Z9898Bl_Rdtof = DecimalUtil.ZERO ;
      Z9899Bl_Velmx = DecimalUtil.ZERO ;
      Z9888Bl_codigo = "" ;
   }

   public void initAll15R1313( )
   {
      A9896Bl_linea = (short)(0) ;
      initializeNonKey15R1313( ) ;
   }

   public void standaloneModalInsert15R1313( )
   {
      A9895Bl_UltLin = i9895Bl_UltLin ;
      n9895Bl_UltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9895Bl_UltLin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543527", true, true);
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
      httpContext.AddJavascriptSource("tblan01.js", "?20268241543527", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1313( )
   {
      edtBl_linea_Enabled = defedtBl_linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBl_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBl_linea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1313, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1313_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9896Bl_linea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9897Bl_Rdtoi, (byte)(5), (byte)(1), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9898Bl_Rdtof, (byte)(5), (byte)(1), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Rdtof_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9888Bl_codigo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9899Bl_Velmx, (byte)(5), (byte)(1), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBl_Velmx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBl_Numfi_Internalname = "BL_NUMFI" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBl_Numff_Internalname = "BL_NUMFF" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBl_ClasCod_Internalname = "BL_CLASCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBl_TipArt_Internalname = "BL_TIPART" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBl_Tubular_Internalname = "BL_TUBULAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBl_UltLin_Internalname = "BL_ULTLIN" ;
      edtavnRcdDeleted_1313_Internalname = "vNRCDDELETED_1313" ;
      edtBl_linea_Internalname = "BL_LINEA" ;
      edtBl_Rdtoi_Internalname = "BL_RDTOI" ;
      edtBl_Rdtof_Internalname = "BL_RDTOF" ;
      edtBl_codigo_Internalname = "BL_CODIGO" ;
      edtBl_Velmx_Internalname = "BL_VELMX" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO VELOCIDAD", "") );
      edtBl_Velmx_Jsonclick = "" ;
      edtBl_codigo_Jsonclick = "" ;
      edtBl_Rdtof_Jsonclick = "" ;
      edtBl_Rdtoi_Jsonclick = "" ;
      edtBl_linea_Jsonclick = "" ;
      edtavnRcdDeleted_1313_Jsonclick = "" ;
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
      edtBl_Velmx_Enabled = 1 ;
      edtBl_codigo_Enabled = 1 ;
      edtBl_Rdtof_Enabled = 1 ;
      edtBl_Rdtoi_Enabled = 1 ;
      edtBl_linea_Enabled = 0 ;
      edtavnRcdDeleted_1313_Enabled = 1 ;
      edtBl_UltLin_Jsonclick = "" ;
      edtBl_UltLin_Backcolor = (int)(0xFFFFFF) ;
      edtBl_UltLin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBl_Tubular_Jsonclick = "" ;
      edtBl_Tubular_Backcolor = (int)(0xFFFFFF) ;
      edtBl_Tubular_Enabled = 1 ;
      edtBl_TipArt_Jsonclick = "" ;
      edtBl_TipArt_Backcolor = (int)(0xFFFFFF) ;
      edtBl_TipArt_Enabled = 1 ;
      edtBl_ClasCod_Jsonclick = "" ;
      edtBl_ClasCod_Backcolor = (int)(0xFFFFFF) ;
      edtBl_ClasCod_Enabled = 1 ;
      edtBl_Numff_Jsonclick = "" ;
      edtBl_Numff_Backcolor = (int)(0xFFFFFF) ;
      edtBl_Numff_Enabled = 1 ;
      edtBl_Numfi_Jsonclick = "" ;
      edtBl_Numfi_Backcolor = (int)(0xFFFFFF) ;
      edtBl_Numfi_Enabled = 1 ;
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

   public void xc_3_15R1311( String A396EmprCod ,
                             short A9892Bl_ClasCod ,
                             byte AV20Flag )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9892Bl_ClasCod ;
         GXv_int6[0] = AV20Flag ;
         new app.pbusclas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A9892Bl_ClasCod = GXv_int5[0] ;
         AV20Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9892Bl_ClasCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9892Bl_ClasCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_5_15R1311( String A396EmprCod ,
                             short A9893Bl_TipArt )
   {
      if ( ( true /* After */ ) && ( A9893Bl_TipArt > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9893Bl_TipArt ;
         GXv_int6[0] = AV21Flag2 ;
         new app.pbustar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A9893Bl_TipArt = GXv_int5[0] ;
         AV21Flag2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9893Bl_TipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Flag2", GXutil.str( AV21Flag2, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9893Bl_TipArt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Flag2, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_551313( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15R1313( ) ;
         standaloneModal15R1313( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15R1313( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551313( ) ;
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
      /* Using cursor T015R24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(22);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Bl_clascod( )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9892Bl_ClasCod ;
         GXv_int6[0] = AV20Flag ;
         new app.pbusclas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tblan01_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tblan01_impl.this.A9892Bl_ClasCod = GXv_int5[0] ;
         A9892Bl_ClasCod = this.A9892Bl_ClasCod ;
         tblan01_impl.this.AV20Flag = GXv_int6[0] ;
         AV20Flag = this.AV20Flag ;
      }
      if ( ( true /* After */ && ( AV20Flag == 0 ) ) && ( A9892Bl_ClasCod > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe tipo artículo", ""), 1, "BL_CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_ClasCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9892Bl_ClasCod", GXutil.ltrim( localUtil.ntoc( A9892Bl_ClasCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Bl_tipart( )
   {
      if ( ( true /* After */ ) && ( A9893Bl_TipArt > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9893Bl_TipArt ;
         GXv_int6[0] = AV21Flag2 ;
         new app.pbustar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tblan01_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tblan01_impl.this.A9893Bl_TipArt = GXv_int5[0] ;
         A9893Bl_TipArt = this.A9893Bl_TipArt ;
         tblan01_impl.this.AV21Flag2 = GXv_int6[0] ;
         AV21Flag2 = this.AV21Flag2 ;
      }
      if ( true /* After */ && ( AV21Flag2 == 0 ) && ( A9893Bl_TipArt > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe tipo composición", ""), 1, "BL_TIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_TipArt_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9893Bl_TipArt", GXutil.ltrim( localUtil.ntoc( A9893Bl_TipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21Flag2", GXutil.ltrim( localUtil.ntoc( AV21Flag2, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Bl_tubular( )
   {
      n9895Bl_UltLin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( GXutil.strcmp(A9894Bl_Tubular, "*") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede ser S o N", ""), 1, "BL_TUBULAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_Tubular_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9895Bl_UltLin", GXutil.ltrim( localUtil.ntoc( A9895Bl_UltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21Flag2", GXutil.ltrim( localUtil.ntoc( AV21Flag2, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9890Bl_Numfi", GXutil.ltrim( localUtil.ntoc( Z9890Bl_Numfi, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9891Bl_Numff", GXutil.ltrim( localUtil.ntoc( Z9891Bl_Numff, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9892Bl_ClasCod", GXutil.ltrim( localUtil.ntoc( Z9892Bl_ClasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9893Bl_TipArt", GXutil.ltrim( localUtil.ntoc( Z9893Bl_TipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9894Bl_Tubular", GXutil.rtrim( Z9894Bl_Tubular));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9895Bl_UltLin", GXutil.ltrim( localUtil.ntoc( Z9895Bl_UltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV20Flag", GXutil.ltrim( localUtil.ntoc( ZV20Flag, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV21Flag2", GXutil.ltrim( localUtil.ntoc( ZV21Flag2, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9895Bl_UltLin", GXutil.ltrim( localUtil.ntoc( O9895Bl_UltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bl_codigo( )
   {
      n9888Bl_codigo = false ;
      /* Using cursor T015R25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n9888Bl_codigo), A9888Bl_codigo});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BLAN00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BL_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBl_codigo_Internalname ;
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BL_NUMFI","{handler:'valid_Bl_numfi',iparms:[]");
      setEventMetadata("VALID_BL_NUMFI",",oparms:[]}");
      setEventMetadata("VALID_BL_NUMFF","{handler:'valid_Bl_numff',iparms:[]");
      setEventMetadata("VALID_BL_NUMFF",",oparms:[]}");
      setEventMetadata("VALID_BL_CLASCOD","{handler:'valid_Bl_clascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9892Bl_ClasCod',fld:'BL_CLASCOD',pic:'ZZZ9'},{av:'AV20Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VALID_BL_CLASCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9892Bl_ClasCod',fld:'BL_CLASCOD',pic:'ZZZ9'},{av:'AV20Flag',fld:'vFLAG',pic:'9'}]}");
      setEventMetadata("VALID_BL_TIPART","{handler:'valid_Bl_tipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9893Bl_TipArt',fld:'BL_TIPART',pic:'ZZZ9'},{av:'AV21Flag2',fld:'vFLAG2',pic:'9'}]");
      setEventMetadata("VALID_BL_TIPART",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9893Bl_TipArt',fld:'BL_TIPART',pic:'ZZZ9'},{av:'AV21Flag2',fld:'vFLAG2',pic:'9'}]}");
      setEventMetadata("VALID_BL_TUBULAR","{handler:'valid_Bl_tubular',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9895Bl_UltLin',fld:'BL_ULTLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9890Bl_Numfi',fld:'BL_NUMFI',pic:'ZZZZZZZ9'},{av:'A9891Bl_Numff',fld:'BL_NUMFF',pic:'ZZZZZZZ9'},{av:'A9892Bl_ClasCod',fld:'BL_CLASCOD',pic:'ZZZ9'},{av:'A9893Bl_TipArt',fld:'BL_TIPART',pic:'ZZZ9'},{av:'A9894Bl_Tubular',fld:'BL_TUBULAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV21Flag2',fld:'vFLAG2',pic:'9'}]");
      setEventMetadata("VALID_BL_TUBULAR",",oparms:[{av:'A9895Bl_UltLin',fld:'BL_ULTLIN',pic:'ZZZ9'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV21Flag2',fld:'vFLAG2',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9890Bl_Numfi'},{av:'Z9891Bl_Numff'},{av:'Z9892Bl_ClasCod'},{av:'Z9893Bl_TipArt'},{av:'Z9894Bl_Tubular'},{av:'Z9895Bl_UltLin'},{av:'ZV20Flag'},{av:'ZV21Flag2'},{av:'O9895Bl_UltLin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BL_ULTLIN","{handler:'valid_Bl_ultlin',iparms:[]");
      setEventMetadata("VALID_BL_ULTLIN",",oparms:[]}");
      setEventMetadata("VALID_BL_LINEA","{handler:'valid_Bl_linea',iparms:[]");
      setEventMetadata("VALID_BL_LINEA",",oparms:[]}");
      setEventMetadata("VALID_BL_CODIGO","{handler:'valid_Bl_codigo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9888Bl_codigo',fld:'BL_CODIGO',pic:''}]");
      setEventMetadata("VALID_BL_CODIGO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bl_velmx',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9894Bl_Tubular = "" ;
      Z9897Bl_Rdtoi = DecimalUtil.ZERO ;
      Z9898Bl_Rdtof = DecimalUtil.ZERO ;
      Z9899Bl_Velmx = DecimalUtil.ZERO ;
      Z9888Bl_codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9888Bl_codigo = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9894Bl_Tubular = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1313 = "" ;
      Gx_mode = "" ;
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
      sMode1311 = "" ;
      A9897Bl_Rdtoi = DecimalUtil.ZERO ;
      A9898Bl_Rdtof = DecimalUtil.ZERO ;
      A9899Bl_Velmx = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      AV10EmprCod = "" ;
      AV14eti1 = "" ;
      AV15eti2 = "" ;
      AV16eti3 = "" ;
      AV17eti4 = "" ;
      AV18eti5 = "" ;
      T015R7_A396EmprCod = new String[] {""} ;
      T015R8_A9890Bl_Numfi = new int[1] ;
      T015R8_A9891Bl_Numff = new int[1] ;
      T015R8_A9892Bl_ClasCod = new short[1] ;
      T015R8_A9893Bl_TipArt = new short[1] ;
      T015R8_A9894Bl_Tubular = new String[] {""} ;
      T015R8_A9895Bl_UltLin = new short[1] ;
      T015R8_n9895Bl_UltLin = new boolean[] {false} ;
      T015R8_A396EmprCod = new String[] {""} ;
      T015R9_A396EmprCod = new String[] {""} ;
      T015R9_A9890Bl_Numfi = new int[1] ;
      T015R9_A9891Bl_Numff = new int[1] ;
      T015R9_A9892Bl_ClasCod = new short[1] ;
      T015R9_A9893Bl_TipArt = new short[1] ;
      T015R9_A9894Bl_Tubular = new String[] {""} ;
      T015R6_A9890Bl_Numfi = new int[1] ;
      T015R6_A9891Bl_Numff = new int[1] ;
      T015R6_A9892Bl_ClasCod = new short[1] ;
      T015R6_A9893Bl_TipArt = new short[1] ;
      T015R6_A9894Bl_Tubular = new String[] {""} ;
      T015R6_A9895Bl_UltLin = new short[1] ;
      T015R6_n9895Bl_UltLin = new boolean[] {false} ;
      T015R6_A396EmprCod = new String[] {""} ;
      T015R10_A396EmprCod = new String[] {""} ;
      T015R10_A9890Bl_Numfi = new int[1] ;
      T015R10_A9891Bl_Numff = new int[1] ;
      T015R10_A9892Bl_ClasCod = new short[1] ;
      T015R10_A9893Bl_TipArt = new short[1] ;
      T015R10_A9894Bl_Tubular = new String[] {""} ;
      T015R11_A396EmprCod = new String[] {""} ;
      T015R11_A9890Bl_Numfi = new int[1] ;
      T015R11_A9891Bl_Numff = new int[1] ;
      T015R11_A9892Bl_ClasCod = new short[1] ;
      T015R11_A9893Bl_TipArt = new short[1] ;
      T015R11_A9894Bl_Tubular = new String[] {""} ;
      T015R5_A9890Bl_Numfi = new int[1] ;
      T015R5_A9891Bl_Numff = new int[1] ;
      T015R5_A9892Bl_ClasCod = new short[1] ;
      T015R5_A9893Bl_TipArt = new short[1] ;
      T015R5_A9894Bl_Tubular = new String[] {""} ;
      T015R5_A9895Bl_UltLin = new short[1] ;
      T015R5_n9895Bl_UltLin = new boolean[] {false} ;
      T015R5_A396EmprCod = new String[] {""} ;
      T015R16_A396EmprCod = new String[] {""} ;
      T015R16_A9890Bl_Numfi = new int[1] ;
      T015R16_A9891Bl_Numff = new int[1] ;
      T015R16_A9892Bl_ClasCod = new short[1] ;
      T015R16_A9893Bl_TipArt = new short[1] ;
      T015R16_A9894Bl_Tubular = new String[] {""} ;
      T015R17_A9890Bl_Numfi = new int[1] ;
      T015R17_A9891Bl_Numff = new int[1] ;
      T015R17_A9892Bl_ClasCod = new short[1] ;
      T015R17_A9893Bl_TipArt = new short[1] ;
      T015R17_A9894Bl_Tubular = new String[] {""} ;
      T015R17_A9896Bl_linea = new short[1] ;
      T015R17_A9897Bl_Rdtoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R17_n9897Bl_Rdtoi = new boolean[] {false} ;
      T015R17_A9898Bl_Rdtof = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R17_n9898Bl_Rdtof = new boolean[] {false} ;
      T015R17_A9899Bl_Velmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R17_n9899Bl_Velmx = new boolean[] {false} ;
      T015R17_A396EmprCod = new String[] {""} ;
      T015R17_A9888Bl_codigo = new String[] {""} ;
      T015R17_n9888Bl_codigo = new boolean[] {false} ;
      T015R4_A396EmprCod = new String[] {""} ;
      GXCCtl = "" ;
      T015R18_A396EmprCod = new String[] {""} ;
      T015R19_A396EmprCod = new String[] {""} ;
      T015R19_A9890Bl_Numfi = new int[1] ;
      T015R19_A9891Bl_Numff = new int[1] ;
      T015R19_A9892Bl_ClasCod = new short[1] ;
      T015R19_A9893Bl_TipArt = new short[1] ;
      T015R19_A9894Bl_Tubular = new String[] {""} ;
      T015R19_A9896Bl_linea = new short[1] ;
      T015R3_A9890Bl_Numfi = new int[1] ;
      T015R3_A9891Bl_Numff = new int[1] ;
      T015R3_A9892Bl_ClasCod = new short[1] ;
      T015R3_A9893Bl_TipArt = new short[1] ;
      T015R3_A9894Bl_Tubular = new String[] {""} ;
      T015R3_A9896Bl_linea = new short[1] ;
      T015R3_A9897Bl_Rdtoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R3_n9897Bl_Rdtoi = new boolean[] {false} ;
      T015R3_A9898Bl_Rdtof = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R3_n9898Bl_Rdtof = new boolean[] {false} ;
      T015R3_A9899Bl_Velmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R3_n9899Bl_Velmx = new boolean[] {false} ;
      T015R3_A396EmprCod = new String[] {""} ;
      T015R3_A9888Bl_codigo = new String[] {""} ;
      T015R3_n9888Bl_codigo = new boolean[] {false} ;
      T015R2_A9890Bl_Numfi = new int[1] ;
      T015R2_A9891Bl_Numff = new int[1] ;
      T015R2_A9892Bl_ClasCod = new short[1] ;
      T015R2_A9893Bl_TipArt = new short[1] ;
      T015R2_A9894Bl_Tubular = new String[] {""} ;
      T015R2_A9896Bl_linea = new short[1] ;
      T015R2_A9897Bl_Rdtoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R2_n9897Bl_Rdtoi = new boolean[] {false} ;
      T015R2_A9898Bl_Rdtof = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R2_n9898Bl_Rdtof = new boolean[] {false} ;
      T015R2_A9899Bl_Velmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015R2_n9899Bl_Velmx = new boolean[] {false} ;
      T015R2_A396EmprCod = new String[] {""} ;
      T015R2_A9888Bl_codigo = new String[] {""} ;
      T015R2_n9888Bl_codigo = new boolean[] {false} ;
      T015R23_A396EmprCod = new String[] {""} ;
      T015R23_A9890Bl_Numfi = new int[1] ;
      T015R23_A9891Bl_Numff = new int[1] ;
      T015R23_A9892Bl_ClasCod = new short[1] ;
      T015R23_A9893Bl_TipArt = new short[1] ;
      T015R23_A9894Bl_Tubular = new String[] {""} ;
      T015R23_A9896Bl_linea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T015R24_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new byte[1] ;
      ZZ396EmprCod = "" ;
      ZZ9894Bl_Tubular = "" ;
      T015R25_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tblan01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tblan01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tblan01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tblan01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tblan01__default(),
         new Object[] {
             new Object[] {
            T015R2_A9890Bl_Numfi, T015R2_A9891Bl_Numff, T015R2_A9892Bl_ClasCod, T015R2_A9893Bl_TipArt, T015R2_A9894Bl_Tubular, T015R2_A9896Bl_linea, T015R2_A9897Bl_Rdtoi, T015R2_n9897Bl_Rdtoi, T015R2_A9898Bl_Rdtof, T015R2_n9898Bl_Rdtof,
            T015R2_A9899Bl_Velmx, T015R2_n9899Bl_Velmx, T015R2_A396EmprCod, T015R2_A9888Bl_codigo, T015R2_n9888Bl_codigo
            }
            , new Object[] {
            T015R3_A9890Bl_Numfi, T015R3_A9891Bl_Numff, T015R3_A9892Bl_ClasCod, T015R3_A9893Bl_TipArt, T015R3_A9894Bl_Tubular, T015R3_A9896Bl_linea, T015R3_A9897Bl_Rdtoi, T015R3_n9897Bl_Rdtoi, T015R3_A9898Bl_Rdtof, T015R3_n9898Bl_Rdtof,
            T015R3_A9899Bl_Velmx, T015R3_n9899Bl_Velmx, T015R3_A396EmprCod, T015R3_A9888Bl_codigo, T015R3_n9888Bl_codigo
            }
            , new Object[] {
            T015R4_A396EmprCod
            }
            , new Object[] {
            T015R5_A9890Bl_Numfi, T015R5_A9891Bl_Numff, T015R5_A9892Bl_ClasCod, T015R5_A9893Bl_TipArt, T015R5_A9894Bl_Tubular, T015R5_A9895Bl_UltLin, T015R5_n9895Bl_UltLin, T015R5_A396EmprCod
            }
            , new Object[] {
            T015R6_A9890Bl_Numfi, T015R6_A9891Bl_Numff, T015R6_A9892Bl_ClasCod, T015R6_A9893Bl_TipArt, T015R6_A9894Bl_Tubular, T015R6_A9895Bl_UltLin, T015R6_n9895Bl_UltLin, T015R6_A396EmprCod
            }
            , new Object[] {
            T015R7_A396EmprCod
            }
            , new Object[] {
            T015R8_A9890Bl_Numfi, T015R8_A9891Bl_Numff, T015R8_A9892Bl_ClasCod, T015R8_A9893Bl_TipArt, T015R8_A9894Bl_Tubular, T015R8_A9895Bl_UltLin, T015R8_n9895Bl_UltLin, T015R8_A396EmprCod
            }
            , new Object[] {
            T015R9_A396EmprCod, T015R9_A9890Bl_Numfi, T015R9_A9891Bl_Numff, T015R9_A9892Bl_ClasCod, T015R9_A9893Bl_TipArt, T015R9_A9894Bl_Tubular
            }
            , new Object[] {
            T015R10_A396EmprCod, T015R10_A9890Bl_Numfi, T015R10_A9891Bl_Numff, T015R10_A9892Bl_ClasCod, T015R10_A9893Bl_TipArt, T015R10_A9894Bl_Tubular
            }
            , new Object[] {
            T015R11_A396EmprCod, T015R11_A9890Bl_Numfi, T015R11_A9891Bl_Numff, T015R11_A9892Bl_ClasCod, T015R11_A9893Bl_TipArt, T015R11_A9894Bl_Tubular
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015R16_A396EmprCod, T015R16_A9890Bl_Numfi, T015R16_A9891Bl_Numff, T015R16_A9892Bl_ClasCod, T015R16_A9893Bl_TipArt, T015R16_A9894Bl_Tubular
            }
            , new Object[] {
            T015R17_A9890Bl_Numfi, T015R17_A9891Bl_Numff, T015R17_A9892Bl_ClasCod, T015R17_A9893Bl_TipArt, T015R17_A9894Bl_Tubular, T015R17_A9896Bl_linea, T015R17_A9897Bl_Rdtoi, T015R17_n9897Bl_Rdtoi, T015R17_A9898Bl_Rdtof, T015R17_n9898Bl_Rdtof,
            T015R17_A9899Bl_Velmx, T015R17_n9899Bl_Velmx, T015R17_A396EmprCod, T015R17_A9888Bl_codigo, T015R17_n9888Bl_codigo
            }
            , new Object[] {
            T015R18_A396EmprCod
            }
            , new Object[] {
            T015R19_A396EmprCod, T015R19_A9890Bl_Numfi, T015R19_A9891Bl_Numff, T015R19_A9892Bl_ClasCod, T015R19_A9893Bl_TipArt, T015R19_A9894Bl_Tubular, T015R19_A9896Bl_linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015R23_A396EmprCod, T015R23_A9890Bl_Numfi, T015R23_A9891Bl_Numff, T015R23_A9892Bl_ClasCod, T015R23_A9893Bl_TipArt, T015R23_A9894Bl_Tubular, T015R23_A9896Bl_linea
            }
            , new Object[] {
            T015R24_A396EmprCod
            }
            , new Object[] {
            T015R25_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte AV20Flag ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV21Flag2 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV20Flag ;
   private byte ZV21Flag2 ;
   private byte GXv_int6[] ;
   private byte ZZV20Flag ;
   private byte ZZV21Flag2 ;
   private short Z9892Bl_ClasCod ;
   private short Z9893Bl_TipArt ;
   private short Z9895Bl_UltLin ;
   private short O9895Bl_UltLin ;
   private short Z9896Bl_linea ;
   private short nRcdDeleted_1313 ;
   private short nRcdExists_1313 ;
   private short nIsMod_1313 ;
   private short A9892Bl_ClasCod ;
   private short A9893Bl_TipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9895Bl_UltLin ;
   private short nBlankRcdCount1313 ;
   private short RcdFound1313 ;
   private short B9895Bl_UltLin ;
   private short nBlankRcdUsr1313 ;
   private short s9895Bl_UltLin ;
   private short A9896Bl_linea ;
   private short RcdFound1311 ;
   private short nIsDirty_1311 ;
   private short nIsDirty_1313 ;
   private short i9895Bl_UltLin ;
   private short GXv_int5[] ;
   private short ZZ9892Bl_ClasCod ;
   private short ZZ9893Bl_TipArt ;
   private short ZZ9895Bl_UltLin ;
   private short ZO9895Bl_UltLin ;
   private int Z9890Bl_Numfi ;
   private int Z9891Bl_Numff ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A9890Bl_Numfi ;
   private int edtBl_Numfi_Enabled ;
   private int A9891Bl_Numff ;
   private int edtBl_Numff_Enabled ;
   private int edtBl_ClasCod_Enabled ;
   private int edtBl_TipArt_Enabled ;
   private int edtBl_Tubular_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBl_UltLin_Enabled ;
   private int edtavnRcdDeleted_1313_Enabled ;
   private int edtBl_linea_Enabled ;
   private int edtBl_Rdtoi_Enabled ;
   private int edtBl_Rdtof_Enabled ;
   private int edtBl_codigo_Enabled ;
   private int edtBl_Velmx_Enabled ;
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
   private int defedtBl_linea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBl_UltLin_Backcolor ;
   private int edtBl_Tubular_Backcolor ;
   private int edtBl_TipArt_Backcolor ;
   private int edtBl_ClasCod_Backcolor ;
   private int edtBl_Numff_Backcolor ;
   private int edtBl_Numfi_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9890Bl_Numfi ;
   private int ZZ9891Bl_Numff ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9897Bl_Rdtoi ;
   private java.math.BigDecimal Z9898Bl_Rdtof ;
   private java.math.BigDecimal Z9899Bl_Velmx ;
   private java.math.BigDecimal A9897Bl_Rdtoi ;
   private java.math.BigDecimal A9898Bl_Rdtof ;
   private java.math.BigDecimal A9899Bl_Velmx ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9894Bl_Tubular ;
   private String Z9888Bl_codigo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9888Bl_codigo ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBl_Numfi_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtBl_Numfi_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBl_Numff_Internalname ;
   private String edtBl_Numff_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBl_ClasCod_Internalname ;
   private String edtBl_ClasCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBl_TipArt_Internalname ;
   private String edtBl_TipArt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBl_Tubular_Internalname ;
   private String A9894Bl_Tubular ;
   private String edtBl_Tubular_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBl_UltLin_Internalname ;
   private String edtBl_UltLin_Jsonclick ;
   private String sMode1313 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1313_Internalname ;
   private String edtBl_linea_Internalname ;
   private String edtBl_Rdtoi_Internalname ;
   private String edtBl_Rdtof_Internalname ;
   private String edtBl_codigo_Internalname ;
   private String edtBl_Velmx_Internalname ;
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
   private String sMode1311 ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String AV10EmprCod ;
   private String AV14eti1 ;
   private String AV15eti2 ;
   private String AV16eti3 ;
   private String AV17eti4 ;
   private String AV18eti5 ;
   private String GXCCtl ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1313_Jsonclick ;
   private String edtBl_linea_Jsonclick ;
   private String edtBl_Rdtoi_Jsonclick ;
   private String edtBl_Rdtof_Jsonclick ;
   private String edtBl_codigo_Jsonclick ;
   private String edtBl_Velmx_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String ZZ396EmprCod ;
   private String ZZ9894Bl_Tubular ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9888Bl_codigo ;
   private boolean wbErr ;
   private boolean n9895Bl_UltLin ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n9897Bl_Rdtoi ;
   private boolean n9898Bl_Rdtof ;
   private boolean n9899Bl_Velmx ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015R7_A396EmprCod ;
   private int[] T015R8_A9890Bl_Numfi ;
   private int[] T015R8_A9891Bl_Numff ;
   private short[] T015R8_A9892Bl_ClasCod ;
   private short[] T015R8_A9893Bl_TipArt ;
   private String[] T015R8_A9894Bl_Tubular ;
   private short[] T015R8_A9895Bl_UltLin ;
   private boolean[] T015R8_n9895Bl_UltLin ;
   private String[] T015R8_A396EmprCod ;
   private String[] T015R9_A396EmprCod ;
   private int[] T015R9_A9890Bl_Numfi ;
   private int[] T015R9_A9891Bl_Numff ;
   private short[] T015R9_A9892Bl_ClasCod ;
   private short[] T015R9_A9893Bl_TipArt ;
   private String[] T015R9_A9894Bl_Tubular ;
   private int[] T015R6_A9890Bl_Numfi ;
   private int[] T015R6_A9891Bl_Numff ;
   private short[] T015R6_A9892Bl_ClasCod ;
   private short[] T015R6_A9893Bl_TipArt ;
   private String[] T015R6_A9894Bl_Tubular ;
   private short[] T015R6_A9895Bl_UltLin ;
   private boolean[] T015R6_n9895Bl_UltLin ;
   private String[] T015R6_A396EmprCod ;
   private String[] T015R10_A396EmprCod ;
   private int[] T015R10_A9890Bl_Numfi ;
   private int[] T015R10_A9891Bl_Numff ;
   private short[] T015R10_A9892Bl_ClasCod ;
   private short[] T015R10_A9893Bl_TipArt ;
   private String[] T015R10_A9894Bl_Tubular ;
   private String[] T015R11_A396EmprCod ;
   private int[] T015R11_A9890Bl_Numfi ;
   private int[] T015R11_A9891Bl_Numff ;
   private short[] T015R11_A9892Bl_ClasCod ;
   private short[] T015R11_A9893Bl_TipArt ;
   private String[] T015R11_A9894Bl_Tubular ;
   private int[] T015R5_A9890Bl_Numfi ;
   private int[] T015R5_A9891Bl_Numff ;
   private short[] T015R5_A9892Bl_ClasCod ;
   private short[] T015R5_A9893Bl_TipArt ;
   private String[] T015R5_A9894Bl_Tubular ;
   private short[] T015R5_A9895Bl_UltLin ;
   private boolean[] T015R5_n9895Bl_UltLin ;
   private String[] T015R5_A396EmprCod ;
   private String[] T015R16_A396EmprCod ;
   private int[] T015R16_A9890Bl_Numfi ;
   private int[] T015R16_A9891Bl_Numff ;
   private short[] T015R16_A9892Bl_ClasCod ;
   private short[] T015R16_A9893Bl_TipArt ;
   private String[] T015R16_A9894Bl_Tubular ;
   private int[] T015R17_A9890Bl_Numfi ;
   private int[] T015R17_A9891Bl_Numff ;
   private short[] T015R17_A9892Bl_ClasCod ;
   private short[] T015R17_A9893Bl_TipArt ;
   private String[] T015R17_A9894Bl_Tubular ;
   private short[] T015R17_A9896Bl_linea ;
   private java.math.BigDecimal[] T015R17_A9897Bl_Rdtoi ;
   private boolean[] T015R17_n9897Bl_Rdtoi ;
   private java.math.BigDecimal[] T015R17_A9898Bl_Rdtof ;
   private boolean[] T015R17_n9898Bl_Rdtof ;
   private java.math.BigDecimal[] T015R17_A9899Bl_Velmx ;
   private boolean[] T015R17_n9899Bl_Velmx ;
   private String[] T015R17_A396EmprCod ;
   private String[] T015R17_A9888Bl_codigo ;
   private boolean[] T015R17_n9888Bl_codigo ;
   private String[] T015R4_A396EmprCod ;
   private String[] T015R18_A396EmprCod ;
   private String[] T015R19_A396EmprCod ;
   private int[] T015R19_A9890Bl_Numfi ;
   private int[] T015R19_A9891Bl_Numff ;
   private short[] T015R19_A9892Bl_ClasCod ;
   private short[] T015R19_A9893Bl_TipArt ;
   private String[] T015R19_A9894Bl_Tubular ;
   private short[] T015R19_A9896Bl_linea ;
   private int[] T015R3_A9890Bl_Numfi ;
   private int[] T015R3_A9891Bl_Numff ;
   private short[] T015R3_A9892Bl_ClasCod ;
   private short[] T015R3_A9893Bl_TipArt ;
   private String[] T015R3_A9894Bl_Tubular ;
   private short[] T015R3_A9896Bl_linea ;
   private java.math.BigDecimal[] T015R3_A9897Bl_Rdtoi ;
   private boolean[] T015R3_n9897Bl_Rdtoi ;
   private java.math.BigDecimal[] T015R3_A9898Bl_Rdtof ;
   private boolean[] T015R3_n9898Bl_Rdtof ;
   private java.math.BigDecimal[] T015R3_A9899Bl_Velmx ;
   private boolean[] T015R3_n9899Bl_Velmx ;
   private String[] T015R3_A396EmprCod ;
   private String[] T015R3_A9888Bl_codigo ;
   private boolean[] T015R3_n9888Bl_codigo ;
   private int[] T015R2_A9890Bl_Numfi ;
   private int[] T015R2_A9891Bl_Numff ;
   private short[] T015R2_A9892Bl_ClasCod ;
   private short[] T015R2_A9893Bl_TipArt ;
   private String[] T015R2_A9894Bl_Tubular ;
   private short[] T015R2_A9896Bl_linea ;
   private java.math.BigDecimal[] T015R2_A9897Bl_Rdtoi ;
   private boolean[] T015R2_n9897Bl_Rdtoi ;
   private java.math.BigDecimal[] T015R2_A9898Bl_Rdtof ;
   private boolean[] T015R2_n9898Bl_Rdtof ;
   private java.math.BigDecimal[] T015R2_A9899Bl_Velmx ;
   private boolean[] T015R2_n9899Bl_Velmx ;
   private String[] T015R2_A396EmprCod ;
   private String[] T015R2_A9888Bl_codigo ;
   private boolean[] T015R2_n9888Bl_codigo ;
   private String[] T015R23_A396EmprCod ;
   private int[] T015R23_A9890Bl_Numfi ;
   private int[] T015R23_A9891Bl_Numff ;
   private short[] T015R23_A9892Bl_ClasCod ;
   private short[] T015R23_A9893Bl_TipArt ;
   private String[] T015R23_A9894Bl_Tubular ;
   private short[] T015R23_A9896Bl_linea ;
   private String[] T015R24_A396EmprCod ;
   private String[] T015R25_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tblan01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tblan01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tblan01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tblan01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tblan01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015R2", "SELECT Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea, Bl_Rdtoi, Bl_Rdtof, Bl_Velmx, EmprCod, Bl_codigo FROM TXPBLAN02 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? AND Bl_linea = ?  FOR UPDATE OF Bl_Rdtoi, Bl_Rdtof, Bl_Velmx, Bl_codigo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R3", "SELECT Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea, Bl_Rdtoi, Bl_Rdtof, Bl_Velmx, EmprCod, Bl_codigo FROM TXPBLAN02 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? AND Bl_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R4", "SELECT EmprCod FROM TXPBLAN00 WHERE EmprCod = ? AND Bl_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R5", "SELECT Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_UltLin, EmprCod FROM TXPBLAN01 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ?  FOR UPDATE OF Bl_UltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R6", "SELECT Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_UltLin, EmprCod FROM TXPBLAN01 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R7", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Bl_Numfi, TM1.Bl_Numff, TM1.Bl_ClasCod, TM1.Bl_TipArt, TM1.Bl_Tubular, TM1.Bl_UltLin, TM1.EmprCod FROM TXPBLAN01 TM1 WHERE TM1.EmprCod = ? and TM1.Bl_Numfi = ? and TM1.Bl_Numff = ? and TM1.Bl_ClasCod = ? and TM1.Bl_TipArt = ? and TM1.Bl_Tubular = ? ORDER BY TM1.EmprCod, TM1.Bl_Numfi, TM1.Bl_Numff, TM1.Bl_ClasCod, TM1.Bl_TipArt, TM1.Bl_Tubular ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular FROM TXPBLAN01 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular FROM TXPBLAN01 WHERE ( Bl_Numfi > ? or Bl_Numfi = ? and Bl_Numff > ? or Bl_Numff = ? and Bl_Numfi = ? and Bl_ClasCod > ? or Bl_ClasCod = ? and Bl_Numff = ? and Bl_Numfi = ? and Bl_TipArt > ? or Bl_TipArt = ? and Bl_ClasCod = ? and Bl_Numff = ? and Bl_Numfi = ? and Bl_Tubular > ?) and EmprCod = ? ORDER BY EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015R11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular FROM TXPBLAN01 WHERE ( Bl_Numfi < ? or Bl_Numfi = ? and Bl_Numff < ? or Bl_Numff = ? and Bl_Numfi = ? and Bl_ClasCod < ? or Bl_ClasCod = ? and Bl_Numff = ? and Bl_Numfi = ? and Bl_TipArt < ? or Bl_TipArt = ? and Bl_ClasCod = ? and Bl_Numff = ? and Bl_Numfi = ? and Bl_Tubular < ?) and EmprCod = ? ORDER BY EmprCod DESC, Bl_Numfi DESC, Bl_Numff DESC, Bl_ClasCod DESC, Bl_TipArt DESC, Bl_Tubular DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015R12", "INSERT INTO TXPBLAN01(Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_UltLin, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBLAN01")
         ,new UpdateCursor("T015R13", "UPDATE TXPBLAN01 SET Bl_UltLin=?  WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ?", GX_NOMASK, "TXPBLAN01")
         ,new UpdateCursor("T015R14", "DELETE FROM TXPBLAN01  WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ?", GX_NOMASK, "TXPBLAN01")
         ,new UpdateCursor("T015R15", "UPDATE TXPBLAN01 SET Bl_UltLin=?  WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ?", GX_NOMASK, "TXPBLAN01")
         ,new ForEachCursor("T015R16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular FROM TXPBLAN01 WHERE EmprCod = ? ORDER BY EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R17", "SELECT Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea, Bl_Rdtoi, Bl_Rdtof, Bl_Velmx, EmprCod, Bl_codigo FROM TXPBLAN02 WHERE EmprCod = ? and Bl_Numfi = ? and Bl_Numff = ? and Bl_ClasCod = ? and Bl_TipArt = ? and Bl_Tubular = ? and Bl_linea = ? ORDER BY EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R18", "SELECT EmprCod FROM TXPBLAN00 WHERE EmprCod = ? AND Bl_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R19", "SELECT EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea FROM TXPBLAN02 WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? AND Bl_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015R20", "INSERT INTO TXPBLAN02(Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea, Bl_Rdtoi, Bl_Rdtof, Bl_Velmx, EmprCod, Bl_codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBLAN02")
         ,new UpdateCursor("T015R21", "UPDATE TXPBLAN02 SET Bl_Rdtoi=?, Bl_Rdtof=?, Bl_Velmx=?, Bl_codigo=?  WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? AND Bl_linea = ?", GX_NOMASK, "TXPBLAN02")
         ,new UpdateCursor("T015R22", "DELETE FROM TXPBLAN02  WHERE EmprCod = ? AND Bl_Numfi = ? AND Bl_Numff = ? AND Bl_ClasCod = ? AND Bl_TipArt = ? AND Bl_Tubular = ? AND Bl_linea = ?", GX_NOMASK, "TXPBLAN02")
         ,new ForEachCursor("T015R23", "SELECT EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea FROM TXPBLAN02 WHERE EmprCod = ? and Bl_Numfi = ? and Bl_Numff = ? and Bl_ClasCod = ? and Bl_TipArt = ? and Bl_Tubular = ? ORDER BY EmprCod, Bl_Numfi, Bl_Numff, Bl_ClasCod, Bl_TipArt, Bl_Tubular, Bl_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R24", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015R25", "SELECT EmprCod FROM TXPBLAN00 WHERE EmprCod = ? AND Bl_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((String[]) buf[13])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((String[]) buf[13])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((String[]) buf[13])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               stmt.setString(7, (String)parms[7], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 1);
               }
               stmt.setString(10, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 4);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setShort(8, ((Number) parms[11]).shortValue());
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setString(10, (String)parms[13], 1);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
      }
   }

}

