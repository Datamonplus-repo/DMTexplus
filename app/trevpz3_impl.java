package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trevpz3_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4994BarTroDefC = (short)(GXutil.lval( httpContext.GetPar( "BarTroDefC"))) ;
         n4994BarTroDefC = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A4994BarTroDefC) ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "REVISION PIEZAS-DEFECTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarTroMet_Internalname ;
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
      A4992BarTroUltD = (short)(GXutil.lval( httpContext.GetPar( "BarTroUltD"))) ;
      n4992BarTroUltD = false ;
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

   public trevpz3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trevpz3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trevpz3_impl.class ));
   }

   public trevpz3_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREVPZ3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Número de Trozo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroOpeN_Internalname, GXutil.rtrim( A4989BarTroOpeN), GXutil.rtrim( localUtil.format( A4989BarTroOpeN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroOpeN_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroOpeN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultimo Defecto", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroUltD_Internalname, GXutil.ltrim( localUtil.ntoc( A4992BarTroUltD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroUltD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4992BarTroUltD), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4992BarTroUltD), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroUltD_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroUltD_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Metros del trozo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREVPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroMet_Enabled!=0) ? localUtil.format( A3860BarTroMet, "ZZZZZ9.99") : localUtil.format( A3860BarTroMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroMet_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREVPZ3.htm");
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
         nBlankRcdCount731 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_731 = (short)(1) ;
            scanStartU6731( ) ;
            while ( RcdFound731 != 0 )
            {
               init_level_properties731( ) ;
               getByPrimaryKeyU6731( ) ;
               addRowU6731( ) ;
               scanNextU6731( ) ;
            }
            scanEndU6731( ) ;
            nBlankRcdCount731 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4992BarTroUltD = A4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         standaloneNotModalU6731( ) ;
         standaloneModalU6731( ) ;
         sMode731 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRowU6731( ) ;
            edtavnRcdDeleted_731_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_731_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_731_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_731_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtBarTroDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDef_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtBarTroDefC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtBarTroDefN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefN_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtBarTroDefM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtBarTroDeNM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODENM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroDeNM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDeNM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_731 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalU6731( ) ;
            }
            sendRowU6731( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode731 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4992BarTroUltD = B4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount731 = (short)(5) ;
         nRcdExists_731 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartU6731( ) ;
            while ( RcdFound731 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_70731( ) ;
               init_level_properties731( ) ;
               standaloneNotModalU6731( ) ;
               getByPrimaryKeyU6731( ) ;
               standaloneModalU6731( ) ;
               addRowU6731( ) ;
               scanNextU6731( ) ;
            }
            scanEndU6731( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode731 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_70731( ) ;
      initAllU6731( ) ;
      init_level_properties731( ) ;
      B4992BarTroUltD = A4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      nRcdExists_731 = (short)(0) ;
      nIsMod_731 = (short)(0) ;
      nRcdDeleted_731 = (short)(0) ;
      nBlankRcdCount731 = (short)(nBlankRcdUsr731+nBlankRcdCount731) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount731 > 0 )
      {
         standaloneNotModalU6731( ) ;
         standaloneModalU6731( ) ;
         addRowU6731( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarTroDefC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount731 = (short)(nBlankRcdCount731-1) ;
      }
      Gx_mode = sMode731 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4992BarTroUltD = B4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREVPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREVPZ3.htm");
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
      e11U62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3858BarTroCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4991BarTroOpeC = (int)(localUtil.ctol( httpContext.cgiGet( "Z4991BarTroOpeC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4992BarTroUltD = (short)(localUtil.ctol( httpContext.cgiGet( "Z4992BarTroUltD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3860BarTroMet = localUtil.ctond( httpContext.cgiGet( "Z3860BarTroMet")) ;
            A4991BarTroOpeC = (int)(localUtil.ctol( httpContext.cgiGet( "Z4991BarTroOpeC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4991BarTroOpeC = false ;
            O4992BarTroUltD = (short)(localUtil.ctol( httpContext.cgiGet( "O4992BarTroUltD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4991BarTroOpeC = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOPEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            A4989BarTroOpeN = httpContext.cgiGet( edtBarTroOpeN_Internalname) ;
            n4989BarTroOpeN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4989BarTroOpeN", A4989BarTroOpeN);
            A4992BarTroUltD = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroUltD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4992BarTroUltD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROMET");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3860BarTroMet = DecimalUtil.ZERO ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            else
            {
               A3860BarTroMet = localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)) ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TREVPZ3");
            forbiddenHiddens.add("BarTroOpeC", localUtil.format( DecimalUtil.doubleToDec(A4991BarTroOpeC), "ZZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trevpz3:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
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
                        e11U62 ();
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
            initAllU6531( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_731_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_731_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributesU6531( ) ;
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

   public void confirm_U60( )
   {
      beforeValidateU6531( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsU6531( ) ;
         }
         else
         {
            checkExtendedTableU6531( ) ;
            if ( AnyError == 0 )
            {
               zmU6531( 7) ;
               zmU6531( 8) ;
               zmU6531( 9) ;
            }
            closeExtendedTableCursorsU6531( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode531 = Gx_mode ;
         confirm_U6731( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode531 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesU60( ) ;
      }
   }

   public void confirm_U6731( )
   {
      s4992BarTroUltD = O4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowU6731( ) ;
         if ( ( nRcdExists_731 != 0 ) || ( nIsMod_731 != 0 ) )
         {
            getKeyU6731( ) ;
            if ( ( nRcdExists_731 == 0 ) && ( nRcdDeleted_731 == 0 ) )
            {
               if ( RcdFound731 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateU6731( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableU6731( ) ;
                     if ( AnyError == 0 )
                     {
                        zmU6731( 11) ;
                     }
                     closeExtendedTableCursorsU6731( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4992BarTroUltD = A4992BarTroUltD ;
                     n4992BarTroUltD = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound731 != 0 )
               {
                  if ( nRcdDeleted_731 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyU6731( ) ;
                     loadU6731( ) ;
                     beforeValidateU6731( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsU6731( ) ;
                        O4992BarTroUltD = A4992BarTroUltD ;
                        n4992BarTroUltD = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_731 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateU6731( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableU6731( ) ;
                           if ( AnyError == 0 )
                           {
                              zmU6731( 11) ;
                           }
                           closeExtendedTableCursorsU6731( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4992BarTroUltD = A4992BarTroUltD ;
                           n4992BarTroUltD = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_731 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_731_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDefC_Internalname, GXutil.ltrim( localUtil.ntoc( A4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDefN_Internalname, GXutil.rtrim( A4995BarTroDefN)) ;
         httpContext.changePostValue( edtBarTroDefM_Internalname, GXutil.ltrim( localUtil.ntoc( A4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDeNM_Internalname, GXutil.ltrim( localUtil.ntoc( A5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4993BarTroDef_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4996BarTroDefM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5008BarTroDeNM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4994BarTroDefC_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_731 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_731_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_731_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODENM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDeNM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4992BarTroUltD = s4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionU60( )
   {
   }

   public void e11U62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trevpz3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      trevpz3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trevpz3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV10Lit1 = httpContext.getMessage( "Taras por Trozo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trevpz3_impl.this.A396EmprCod = GXv_char2[0] ;
      trevpz3_impl.this.AV11EmprNom = GXv_char3[0] ;
      trevpz3_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GX_FocusControl = edtBarTroDefC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
   }

   public void zmU6531( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4991BarTroOpeC = T00U66_A4991BarTroOpeC[0] ;
            Z4992BarTroUltD = T00U66_A4992BarTroUltD[0] ;
            Z3860BarTroMet = T00U66_A3860BarTroMet[0] ;
         }
         else
         {
            Z4991BarTroOpeC = A4991BarTroOpeC ;
            Z4992BarTroUltD = A4992BarTroUltD ;
            Z3860BarTroMet = A3860BarTroMet ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z4991BarTroOpeC = A4991BarTroOpeC ;
         Z3858BarTroCod = A3858BarTroCod ;
         Z4992BarTroUltD = A4992BarTroUltD ;
         Z3860BarTroMet = A3860BarTroMet ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z407EmprNom = A407EmprNom ;
         Z4989BarTroOpeN = A4989BarTroOpeN ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarTroUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroUltD_Enabled), 5, 0), true);
      AV34Pgmname = "TREVPZ3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtBarTroUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroUltD_Enabled), 5, 0), true);
      /* Using cursor T00U67 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00U67_A407EmprNom[0] ;
      n407EmprNom = T00U67_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00U68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
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
      /* Using cursor T00U69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Ope BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTROOPEC");
         AnyError = (short)(1) ;
      }
      A4989BarTroOpeN = T00U69_A4989BarTroOpeN[0] ;
      n4989BarTroOpeN = T00U69_n4989BarTroOpeN[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4989BarTroOpeN", A4989BarTroOpeN);
      pr_default.close(7);
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

   public void loadU6531( )
   {
      /* Using cursor T00U610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A4991BarTroOpeC = T00U610_A4991BarTroOpeC[0] ;
         n4991BarTroOpeC = T00U610_n4991BarTroOpeC[0] ;
         A407EmprNom = T00U610_A407EmprNom[0] ;
         n407EmprNom = T00U610_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4989BarTroOpeN = T00U610_A4989BarTroOpeN[0] ;
         n4989BarTroOpeN = T00U610_n4989BarTroOpeN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4989BarTroOpeN", A4989BarTroOpeN);
         A4992BarTroUltD = T00U610_A4992BarTroUltD[0] ;
         n4992BarTroUltD = T00U610_n4992BarTroUltD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         A3860BarTroMet = T00U610_A3860BarTroMet[0] ;
         n3860BarTroMet = T00U610_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         zmU6531( -6) ;
      }
      pr_default.close(8);
      onLoadActionsU6531( ) ;
   }

   public void onLoadActionsU6531( )
   {
   }

   public void checkExtendedTableU6531( )
   {
      nIsDirty_531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsU6531( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyU6531( )
   {
      /* Using cursor T00U611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      else
      {
         RcdFound531 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00U66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T00U66_A3858BarTroCod[0] == A3858BarTroCod ) && ( GXutil.strcmp(T00U66_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U66_A129BarCod[0] == A129BarCod ) && ( T00U66_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U66_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U66_A200BarPieCod[0], A200BarPieCod) == 0 ) )
      {
         zmU6531( 6) ;
         RcdFound531 = (short)(1) ;
         A4991BarTroOpeC = T00U66_A4991BarTroOpeC[0] ;
         n4991BarTroOpeC = T00U66_n4991BarTroOpeC[0] ;
         A4992BarTroUltD = T00U66_A4992BarTroUltD[0] ;
         n4992BarTroUltD = T00U66_n4992BarTroUltD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         A3860BarTroMet = T00U66_A3860BarTroMet[0] ;
         n3860BarTroMet = T00U66_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         O4992BarTroUltD = A4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadU6531( ) ;
         if ( AnyError == 1 )
         {
            RcdFound531 = (short)(0) ;
            initializeNonKeyU6531( ) ;
         }
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound531 = (short)(0) ;
         initializeNonKeyU6531( ) ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyU6531( ) ;
      if ( RcdFound531 == 0 )
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
      RcdFound531 = (short)(0) ;
      /* Using cursor T00U612 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00U612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U612_A129BarCod[0] == A129BarCod ) && ( T00U612_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U612_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U612_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U612_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00U612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U612_A129BarCod[0] == A129BarCod ) && ( T00U612_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U612_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U612_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U612_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound531 = (short)(0) ;
      /* Using cursor T00U613 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00U613_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U613_A129BarCod[0] == A129BarCod ) && ( T00U613_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U613_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U613_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U613_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00U613_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U613_A129BarCod[0] == A129BarCod ) && ( T00U613_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U613_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U613_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U613_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyU6531( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4992BarTroUltD = O4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         GX_FocusControl = edtBarTroMet_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertU6531( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound531 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4992BarTroUltD = O4992BarTroUltD ;
               n4992BarTroUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4992BarTroUltD = O4992BarTroUltD ;
               n4992BarTroUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
               updateU6531( ) ;
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4992BarTroUltD = O4992BarTroUltD ;
               n4992BarTroUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertU6531( ) ;
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
                  A4992BarTroUltD = O4992BarTroUltD ;
                  n4992BarTroUltD = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
                  GX_FocusControl = edtBarTroMet_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertU6531( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4992BarTroUltD = O4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarTroMet_Internalname ;
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
      getKeyU6531( ) ;
      if ( RcdFound531 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trevpz3");
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_U60( ) ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartU6531( ) ;
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU6531( ) ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
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
      scanStartU6531( ) ;
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound531 != 0 )
         {
            scanNextU6531( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU6531( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyU6531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z4991BarTroOpeC != T00U65_A4991BarTroOpeC[0] ) || ( Z4992BarTroUltD != T00U65_A4992BarTroUltD[0] ) || ( DecimalUtil.compareTo(Z3860BarTroMet, T00U65_A3860BarTroMet[0]) != 0 ) )
         {
            if ( Z4991BarTroOpeC != T00U65_A4991BarTroOpeC[0] )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroOpeC");
               GXutil.writeLogRaw("Old: ",Z4991BarTroOpeC);
               GXutil.writeLogRaw("Current: ",T00U65_A4991BarTroOpeC[0]);
            }
            if ( Z4992BarTroUltD != T00U65_A4992BarTroUltD[0] )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroUltD");
               GXutil.writeLogRaw("Old: ",Z4992BarTroUltD);
               GXutil.writeLogRaw("Current: ",T00U65_A4992BarTroUltD[0]);
            }
            if ( DecimalUtil.compareTo(Z3860BarTroMet, T00U65_A3860BarTroMet[0]) != 0 )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroMet");
               GXutil.writeLogRaw("Old: ",Z3860BarTroMet);
               GXutil.writeLogRaw("Current: ",T00U65_A3860BarTroMet[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARTRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU6531( )
   {
      beforeValidateU6531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU6531( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU6531( 0) ;
         checkOptimisticConcurrencyU6531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU6531( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU6531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U614 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC), Short.valueOf(A3858BarTroCod), Boolean.valueOf(n4992BarTroUltD), Short.valueOf(A4992BarTroUltD), Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevelU6531( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionU60( ) ;
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
            loadU6531( ) ;
         }
         endLevelU6531( ) ;
      }
      closeExtendedTableCursorsU6531( ) ;
   }

   public void updateU6531( )
   {
      beforeValidateU6531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU6531( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU6531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU6531( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateU6531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U615 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC), Boolean.valueOf(n4992BarTroUltD), Short.valueOf(A4992BarTroUltD), Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateU6531( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelU6531( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionU60( ) ;
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
         endLevelU6531( ) ;
      }
      closeExtendedTableCursorsU6531( ) ;
   }

   public void deferredUpdateU6531( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU6531( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU6531( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU6531( ) ;
         afterConfirmU6531( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU6531( ) ;
            if ( AnyError == 0 )
            {
               A4992BarTroUltD = O4992BarTroUltD ;
               n4992BarTroUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
               scanStartU6731( ) ;
               while ( RcdFound731 != 0 )
               {
                  getByPrimaryKeyU6731( ) ;
                  deleteU6731( ) ;
                  scanNextU6731( ) ;
                  O4992BarTroUltD = A4992BarTroUltD ;
                  n4992BarTroUltD = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
               }
               scanEndU6731( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U616 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound531 == 0 )
                        {
                           initAllU6531( ) ;
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
                        resetCaptionU60( ) ;
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
      sMode531 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU6531( ) ;
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU6531( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00U617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevelU6731( )
   {
      s4992BarTroUltD = O4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowU6731( ) ;
         if ( ( nRcdExists_731 != 0 ) || ( nIsMod_731 != 0 ) )
         {
            standaloneNotModalU6731( ) ;
            getKeyU6731( ) ;
            if ( ( nRcdExists_731 == 0 ) && ( nRcdDeleted_731 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertU6731( ) ;
            }
            else
            {
               if ( RcdFound731 != 0 )
               {
                  if ( ( nRcdDeleted_731 != 0 ) && ( nRcdExists_731 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteU6731( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_731 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateU6731( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_731 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O4992BarTroUltD = A4992BarTroUltD ;
            n4992BarTroUltD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_731_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDefC_Internalname, GXutil.ltrim( localUtil.ntoc( A4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDefN_Internalname, GXutil.rtrim( A4995BarTroDefN)) ;
         httpContext.changePostValue( edtBarTroDefM_Internalname, GXutil.ltrim( localUtil.ntoc( A4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroDeNM_Internalname, GXutil.ltrim( localUtil.ntoc( A5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4993BarTroDef_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4996BarTroDefM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5008BarTroDeNM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4994BarTroDefC_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_731_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_731 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_731_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_731_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODEFM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRODENM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDeNM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllU6731( ) ;
      if ( AnyError != 0 )
      {
         O4992BarTroUltD = s4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      }
      nRcdExists_731 = (short)(0) ;
      nIsMod_731 = (short)(0) ;
      nRcdDeleted_731 = (short)(0) ;
   }

   public void processLevelU6531( )
   {
      /* Save parent mode. */
      sMode531 = Gx_mode ;
      processNestedLevelU6731( ) ;
      if ( AnyError != 0 )
      {
         O4992BarTroUltD = s4992BarTroUltD ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00U618 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n4992BarTroUltD), Short.valueOf(A4992BarTroUltD), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
   }

   public void endLevelU6531( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteU6531( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trevpz3");
         if ( AnyError == 0 )
         {
            confirmValuesU60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trevpz3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartU6531( )
   {
      /* Scan By routine */
      /* Using cursor T00U619 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU6531( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
   }

   public void scanEndU6531( )
   {
      pr_default.close(17);
   }

   public void afterConfirmU6531( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU6531( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU6531( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU6531( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU6531( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU6531( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU6531( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), true);
      edtBarTroOpeN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroOpeN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroOpeN_Enabled), 5, 0), true);
      edtBarTroUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroUltD_Enabled), 5, 0), true);
      edtBarTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroMet_Enabled), 5, 0), true);
   }

   public void zmU6731( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4996BarTroDefM = T00U63_A4996BarTroDefM[0] ;
            Z5008BarTroDeNM = T00U63_A5008BarTroDeNM[0] ;
            Z4994BarTroDefC = T00U63_A4994BarTroDefC[0] ;
         }
         else
         {
            Z4996BarTroDefM = A4996BarTroDefM ;
            Z5008BarTroDeNM = A5008BarTroDeNM ;
            Z4994BarTroDefC = A4994BarTroDefC ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         Z4993BarTroDef = A4993BarTroDef ;
         Z4996BarTroDefM = A4996BarTroDefM ;
         Z5008BarTroDeNM = A5008BarTroDeNM ;
         Z396EmprCod = A396EmprCod ;
         Z4994BarTroDefC = A4994BarTroDefC ;
         Z4995BarTroDefN = A4995BarTroDefN ;
      }
   }

   public void standaloneNotModalU6731( )
   {
      edtBarTroDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDef_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtBarTroUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroUltD_Enabled), 5, 0), true);
      edtBarTroUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroUltD_Enabled), 5, 0), true);
   }

   public void standaloneModalU6731( )
   {
      if ( isIns( )  )
      {
         A4992BarTroUltD = (short)(O4992BarTroUltD+1) ;
         n4992BarTroUltD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4993BarTroDef = A4992BarTroUltD ;
      }
   }

   public void loadU6731( )
   {
      /* Using cursor T00U620 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound731 = (short)(1) ;
         A4995BarTroDefN = T00U620_A4995BarTroDefN[0] ;
         n4995BarTroDefN = T00U620_n4995BarTroDefN[0] ;
         A4996BarTroDefM = T00U620_A4996BarTroDefM[0] ;
         n4996BarTroDefM = T00U620_n4996BarTroDefM[0] ;
         A5008BarTroDeNM = T00U620_A5008BarTroDeNM[0] ;
         n5008BarTroDeNM = T00U620_n5008BarTroDeNM[0] ;
         A4994BarTroDefC = T00U620_A4994BarTroDefC[0] ;
         n4994BarTroDefC = T00U620_n4994BarTroDefC[0] ;
         zmU6731( -10) ;
      }
      pr_default.close(18);
      onLoadActionsU6731( ) ;
   }

   public void onLoadActionsU6731( )
   {
   }

   public void checkExtendedTableU6731( )
   {
      nIsDirty_731 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalU6731( ) ;
      /* Using cursor T00U64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARTRODEFC_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Def BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDefC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4995BarTroDefN = T00U64_A4995BarTroDefN[0] ;
      n4995BarTroDefN = T00U64_n4995BarTroDefN[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsU6731( )
   {
      pr_default.close(2);
   }

   public void enableDisableU6731( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          short A4994BarTroDefC )
   {
      /* Using cursor T00U621 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "BARTRODEFC_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Def BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDefC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4995BarTroDefN = T00U621_A4995BarTroDefN[0] ;
      n4995BarTroDefN = T00U621_n4995BarTroDefN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4995BarTroDefN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKeyU6731( )
   {
      /* Using cursor T00U622 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound731 = (short)(1) ;
      }
      else
      {
         RcdFound731 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKeyU6731( )
   {
      /* Using cursor T00U63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
      if ( (pr_default.getStatus(1) != 101) && ( T00U63_A129BarCod[0] == A129BarCod ) && ( T00U63_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U63_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00U63_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U63_A3858BarTroCod[0] == A3858BarTroCod ) && ( GXutil.strcmp(T00U63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmU6731( 10) ;
         RcdFound731 = (short)(1) ;
         initializeNonKeyU6731( ) ;
         A4993BarTroDef = T00U63_A4993BarTroDef[0] ;
         A4996BarTroDefM = T00U63_A4996BarTroDefM[0] ;
         n4996BarTroDefM = T00U63_n4996BarTroDefM[0] ;
         A5008BarTroDeNM = T00U63_A5008BarTroDeNM[0] ;
         n5008BarTroDeNM = T00U63_n5008BarTroDeNM[0] ;
         A4994BarTroDefC = T00U63_A4994BarTroDefC[0] ;
         n4994BarTroDefC = T00U63_n4994BarTroDefC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         Z4993BarTroDef = A4993BarTroDef ;
         sMode731 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalU6731( ) ;
         loadU6731( ) ;
         Gx_mode = sMode731 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound731 = (short)(0) ;
         initializeNonKeyU6731( ) ;
         sMode731 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalU6731( ) ;
         Gx_mode = sMode731 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesU6731( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyU6731( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBarTrD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4996BarTroDefM, T00U62_A4996BarTroDefM[0]) != 0 ) || ( DecimalUtil.compareTo(Z5008BarTroDeNM, T00U62_A5008BarTroDeNM[0]) != 0 ) || ( Z4994BarTroDefC != T00U62_A4994BarTroDefC[0] ) )
         {
            if ( DecimalUtil.compareTo(Z4996BarTroDefM, T00U62_A4996BarTroDefM[0]) != 0 )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroDefM");
               GXutil.writeLogRaw("Old: ",Z4996BarTroDefM);
               GXutil.writeLogRaw("Current: ",T00U62_A4996BarTroDefM[0]);
            }
            if ( DecimalUtil.compareTo(Z5008BarTroDeNM, T00U62_A5008BarTroDeNM[0]) != 0 )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroDeNM");
               GXutil.writeLogRaw("Old: ",Z5008BarTroDeNM);
               GXutil.writeLogRaw("Current: ",T00U62_A5008BarTroDeNM[0]);
            }
            if ( Z4994BarTroDefC != T00U62_A4994BarTroDefC[0] )
            {
               GXutil.writeLogln("trevpz3:[seudo value changed for attri]"+"BarTroDefC");
               GXutil.writeLogRaw("Old: ",Z4994BarTroDefC);
               GXutil.writeLogRaw("Current: ",T00U62_A4994BarTroDefC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBarTrD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU6731( )
   {
      beforeValidateU6731( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU6731( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU6731( 0) ;
         checkOptimisticConcurrencyU6731( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU6731( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU6731( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U623 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef), Boolean.valueOf(n4996BarTroDefM), A4996BarTroDefM, Boolean.valueOf(n5008BarTroDeNM), A5008BarTroDeNM, A396EmprCod, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarTrD");
                  if ( (pr_default.getStatus(21) == 1) )
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
            loadU6731( ) ;
         }
         endLevelU6731( ) ;
      }
      closeExtendedTableCursorsU6731( ) ;
   }

   public void updateU6731( )
   {
      beforeValidateU6731( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU6731( ) ;
      }
      if ( ( nIsMod_731 != 0 ) || ( nIsDirty_731 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyU6731( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmU6731( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateU6731( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00U624 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n4996BarTroDefM), A4996BarTroDefM, Boolean.valueOf(n5008BarTroDeNM), A5008BarTroDeNM, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarTrD");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBarTrD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateU6731( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyU6731( ) ;
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
            endLevelU6731( ) ;
         }
      }
      closeExtendedTableCursorsU6731( ) ;
   }

   public void deferredUpdateU6731( )
   {
   }

   public void deleteU6731( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU6731( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU6731( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU6731( ) ;
         afterConfirmU6731( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU6731( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00U625 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Short.valueOf(A4993BarTroDef)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarTrD");
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
      sMode731 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU6731( ) ;
      Gx_mode = sMode731 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU6731( )
   {
      standaloneModalU6731( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00U626 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC)});
         A4995BarTroDefN = T00U626_A4995BarTroDefN[0] ;
         n4995BarTroDefN = T00U626_n4995BarTroDefN[0] ;
         pr_default.close(24);
      }
   }

   public void endLevelU6731( )
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

   public void scanStartU6731( )
   {
      /* Scan By routine */
      /* Using cursor T00U627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      RcdFound731 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound731 = (short)(1) ;
         A4993BarTroDef = T00U627_A4993BarTroDef[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU6731( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound731 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound731 = (short)(1) ;
         A4993BarTroDef = T00U627_A4993BarTroDef[0] ;
      }
   }

   public void scanEndU6731( )
   {
      pr_default.close(25);
   }

   public void afterConfirmU6731( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU6731( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU6731( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU6731( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU6731( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU6731( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU6731( )
   {
      edtBarTroDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDef_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtBarTroDefC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtBarTroDefN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefN_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtBarTroDefM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDefM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDefM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtBarTroDeNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDeNM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDeNM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashesU6731( )
   {
   }

   public void send_integrity_lvl_hashesU6531( )
   {
   }

   public void subsflControlProps_70731( )
   {
      edtavnRcdDeleted_731_Internalname = "vNRCDDELETED_731_"+sGXsfl_70_idx ;
      edtBarTroDef_Internalname = "BARTRODEF_"+sGXsfl_70_idx ;
      edtBarTroDefC_Internalname = "BARTRODEFC_"+sGXsfl_70_idx ;
      edtBarTroDefN_Internalname = "BARTRODEFN_"+sGXsfl_70_idx ;
      edtBarTroDefM_Internalname = "BARTRODEFM_"+sGXsfl_70_idx ;
      edtBarTroDeNM_Internalname = "BARTRODENM_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_70731( )
   {
      edtavnRcdDeleted_731_Internalname = "vNRCDDELETED_731_"+sGXsfl_70_fel_idx ;
      edtBarTroDef_Internalname = "BARTRODEF_"+sGXsfl_70_fel_idx ;
      edtBarTroDefC_Internalname = "BARTRODEFC_"+sGXsfl_70_fel_idx ;
      edtBarTroDefN_Internalname = "BARTRODEFN_"+sGXsfl_70_fel_idx ;
      edtBarTroDefM_Internalname = "BARTRODEFM_"+sGXsfl_70_fel_idx ;
      edtBarTroDeNM_Internalname = "BARTRODENM_"+sGXsfl_70_fel_idx ;
   }

   public void addRowU6731( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70731( ) ;
      sendRowU6731( ) ;
   }

   public void sendRowU6731( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_731_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_731_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_731_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_731), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_731), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_731_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_731_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4993BarTroDef), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4993BarTroDef), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_731_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroDefC_Internalname,GXutil.ltrim( localUtil.ntoc( A4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroDefC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4994BarTroDefC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4994BarTroDefC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroDefC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroDefC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroDefN_Internalname,GXutil.rtrim( A4995BarTroDefN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroDefN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroDefN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_731_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroDefM_Internalname,GXutil.ltrim( localUtil.ntoc( A4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroDefM_Enabled!=0) ? localUtil.format( A4996BarTroDefM, "ZZZZZ9.99") : localUtil.format( A4996BarTroDefM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroDefM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroDefM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_731_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroDeNM_Internalname,GXutil.ltrim( localUtil.ntoc( A5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroDeNM_Enabled!=0) ? localUtil.format( A5008BarTroDeNM, "ZZZZZ9.99") : localUtil.format( A5008BarTroDeNM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroDeNM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroDeNM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesU6731( ) ;
      GXCCtl = "Z4993BarTroDef_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4993BarTroDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4996BarTroDefM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4996BarTroDefM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5008BarTroDeNM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5008BarTroDeNM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4994BarTroDefC_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4994BarTroDefC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_731_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_731_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_731_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_731, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_731_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_731_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRODEF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRODEFC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRODEFN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRODEFM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRODENM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDeNM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowU6731( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70731( ) ;
      edtavnRcdDeleted_731_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_731_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroDefC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroDefN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroDefM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODEFM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroDeNM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRODENM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_731_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_731_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_731");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_731_Internalname ;
         wbErr = true ;
         nRcdDeleted_731 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_731 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_731_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4993BarTroDef = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroDefC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroDefC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARTRODEFC_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDefC_Internalname ;
         wbErr = true ;
         A4994BarTroDefC = (short)(0) ;
         n4994BarTroDefC = false ;
      }
      else
      {
         A4994BarTroDefC = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroDefC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4994BarTroDefC = false ;
      }
      A4995BarTroDefN = httpContext.cgiGet( edtBarTroDefN_Internalname) ;
      n4995BarTroDefN = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroDefM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroDefM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARTRODEFM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDefM_Internalname ;
         wbErr = true ;
         A4996BarTroDefM = DecimalUtil.ZERO ;
         n4996BarTroDefM = false ;
      }
      else
      {
         A4996BarTroDefM = localUtil.ctond( httpContext.cgiGet( edtBarTroDefM_Internalname)) ;
         n4996BarTroDefM = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroDeNM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroDeNM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARTRODENM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDeNM_Internalname ;
         wbErr = true ;
         A5008BarTroDeNM = DecimalUtil.ZERO ;
         n5008BarTroDeNM = false ;
      }
      else
      {
         A5008BarTroDeNM = localUtil.ctond( httpContext.cgiGet( edtBarTroDeNM_Internalname)) ;
         n5008BarTroDeNM = false ;
      }
      GXCCtl = "Z4993BarTroDef_" + sGXsfl_70_idx ;
      Z4993BarTroDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4996BarTroDefM_" + sGXsfl_70_idx ;
      Z4996BarTroDefM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5008BarTroDeNM_" + sGXsfl_70_idx ;
      Z5008BarTroDeNM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4994BarTroDefC_" + sGXsfl_70_idx ;
      Z4994BarTroDefC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_731_" + sGXsfl_70_idx ;
      nRcdDeleted_731 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_731_" + sGXsfl_70_idx ;
      nRcdExists_731 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_731_" + sGXsfl_70_idx ;
      nIsMod_731 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarTroDef_Enabled = edtBarTroDef_Enabled ;
   }

   public void confirmValuesU60( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70731( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70731( ) ;
         httpContext.changePostValue( "Z4993BarTroDef_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4993BarTroDef_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4993BarTroDef_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4996BarTroDefM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4996BarTroDefM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4996BarTroDefM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z5008BarTroDeNM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z5008BarTroDeNM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5008BarTroDeNM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4994BarTroDefC_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4994BarTroDefC_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4994BarTroDefC_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trevpz3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarTroCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TREVPZ3");
      forbiddenHiddens.add("BarTroOpeC", localUtil.format( DecimalUtil.doubleToDec(A4991BarTroOpeC), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trevpz3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3858BarTroCod", GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4991BarTroOpeC", GXutil.ltrim( localUtil.ntoc( Z4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4992BarTroUltD", GXutil.ltrim( localUtil.ntoc( Z4992BarTroUltD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3860BarTroMet", GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4992BarTroUltD", GXutil.ltrim( localUtil.ntoc( O4992BarTroUltD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROOPEC", GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.trevpz3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarTroCod"})  ;
   }

   public String getPgmname( )
   {
      return "TREVPZ3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "REVISION PIEZAS-DEFECTOS", "") ;
   }

   public void initializeNonKeyU6531( )
   {
      A4991BarTroOpeC = 0 ;
      n4991BarTroOpeC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4991BarTroOpeC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4991BarTroOpeC), 6, 0));
      A4989BarTroOpeN = "" ;
      n4989BarTroOpeN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4989BarTroOpeN", A4989BarTroOpeN);
      A4992BarTroUltD = (short)(0) ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      A3860BarTroMet = DecimalUtil.ZERO ;
      n3860BarTroMet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
      O4992BarTroUltD = A4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
      Z4991BarTroOpeC = 0 ;
      Z4992BarTroUltD = (short)(0) ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
   }

   public void initAllU6531( )
   {
      initializeNonKeyU6531( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyU6731( )
   {
      A4994BarTroDefC = (short)(0) ;
      n4994BarTroDefC = false ;
      A4995BarTroDefN = "" ;
      n4995BarTroDefN = false ;
      A4996BarTroDefM = DecimalUtil.ZERO ;
      n4996BarTroDefM = false ;
      A5008BarTroDeNM = DecimalUtil.ZERO ;
      n5008BarTroDeNM = false ;
      Z4996BarTroDefM = DecimalUtil.ZERO ;
      Z5008BarTroDeNM = DecimalUtil.ZERO ;
      Z4994BarTroDefC = (short)(0) ;
   }

   public void initAllU6731( )
   {
      A4993BarTroDef = (short)(0) ;
      initializeNonKeyU6731( ) ;
   }

   public void standaloneModalInsertU6731( )
   {
      A4992BarTroUltD = i4992BarTroUltD ;
      n4992BarTroUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4992BarTroUltD), 3, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531152", true, true);
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
      httpContext.AddJavascriptSource("trevpz3.js", "?20268241531152", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties731( )
   {
      edtBarTroDef_Enabled = defedtBarTroDef_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroDef_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_731, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_731_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4993BarTroDef, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4994BarTroDefC, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4995BarTroDefN));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4996BarTroDefM, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDefM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5008BarTroDeNM, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroDeNM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarTroCod_Internalname = "BARTROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarTroOpeN_Internalname = "BARTROOPEN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarTroUltD_Internalname = "BARTROULTD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarTroMet_Internalname = "BARTROMET" ;
      edtavnRcdDeleted_731_Internalname = "vNRCDDELETED_731" ;
      edtBarTroDef_Internalname = "BARTRODEF" ;
      edtBarTroDefC_Internalname = "BARTRODEFC" ;
      edtBarTroDefN_Internalname = "BARTRODEFN" ;
      edtBarTroDefM_Internalname = "BARTRODEFM" ;
      edtBarTroDeNM_Internalname = "BARTRODENM" ;
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
      Form.setCaption( httpContext.getMessage( "REVISION PIEZAS-DEFECTOS", "") );
      edtBarTroDeNM_Jsonclick = "" ;
      edtBarTroDefM_Jsonclick = "" ;
      edtBarTroDefN_Jsonclick = "" ;
      edtBarTroDefC_Jsonclick = "" ;
      edtBarTroDef_Jsonclick = "" ;
      edtavnRcdDeleted_731_Jsonclick = "" ;
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
      edtBarTroDeNM_Enabled = 1 ;
      edtBarTroDefM_Enabled = 1 ;
      edtBarTroDefN_Enabled = 0 ;
      edtBarTroDefC_Enabled = 1 ;
      edtBarTroDef_Enabled = 0 ;
      edtavnRcdDeleted_731_Enabled = 1 ;
      edtBarTroMet_Jsonclick = "" ;
      edtBarTroMet_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroMet_Enabled = 1 ;
      edtBarTroUltD_Jsonclick = "" ;
      edtBarTroUltD_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroUltD_Enabled = 0 ;
      edtBarTroOpeN_Jsonclick = "" ;
      edtBarTroOpeN_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroOpeN_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarTroCod_Jsonclick = "" ;
      edtBarTroCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroCod_Enabled = 0 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_70731( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalU6731( ) ;
         standaloneModalU6731( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowU6731( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70731( ) ;
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
      /* Using cursor T00U628 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00U628_A407EmprNom[0] ;
      n407EmprNom = T00U628_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T00U629 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(27);
      GX_FocusControl = edtBarTroMet_Internalname ;
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

   public void valid_Bartrocod( )
   {
      n4992BarTroUltD = false ;
      n4991BarTroOpeC = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4991BarTroOpeC", GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4989BarTroOpeN", GXutil.rtrim( A4989BarTroOpeN));
      httpContext.ajax_rsp_assign_attri("", false, "A4992BarTroUltD", GXutil.ltrim( localUtil.ntoc( A4992BarTroUltD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3858BarTroCod", GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4991BarTroOpeC", GXutil.ltrim( localUtil.ntoc( Z4991BarTroOpeC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4989BarTroOpeN", GXutil.rtrim( Z4989BarTroOpeN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4992BarTroUltD", GXutil.ltrim( localUtil.ntoc( Z4992BarTroUltD, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3860BarTroMet", GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4992BarTroUltD", GXutil.ltrim( localUtil.ntoc( O4992BarTroUltD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bartrodefc( )
   {
      n4994BarTroDefC = false ;
      n4995BarTroDefN = false ;
      /* Using cursor T00U626 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n4994BarTroDefC), Short.valueOf(A4994BarTroDefC)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Def BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTRODEFC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroDefC_Internalname ;
      }
      A4995BarTroDefN = T00U626_A4995BarTroDefN[0] ;
      n4995BarTroDefN = T00U626_n4995BarTroDefN[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4995BarTroDefN", GXutil.rtrim( A4995BarTroDefN));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A4991BarTroOpeC',fld:'BARTROOPEC',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_BARTROCOD","{handler:'valid_Bartrocod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4992BarTroUltD',fld:'BARTROULTD',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4991BarTroOpeC',fld:'BARTROOPEC',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARTROCOD",",oparms:[{av:'A4991BarTroOpeC',fld:'BARTROOPEC',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4989BarTroOpeN',fld:'BARTROOPEN',pic:''},{av:'A4992BarTroUltD',fld:'BARTROULTD',pic:'ZZ9'},{av:'A3860BarTroMet',fld:'BARTROMET',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z3858BarTroCod'},{av:'Z4991BarTroOpeC'},{av:'Z407EmprNom'},{av:'Z4989BarTroOpeN'},{av:'Z4992BarTroUltD'},{av:'Z3860BarTroMet'},{av:'O4992BarTroUltD'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARTROULTD","{handler:'valid_Bartroultd',iparms:[]");
      setEventMetadata("VALID_BARTROULTD",",oparms:[]}");
      setEventMetadata("VALID_BARTRODEF","{handler:'valid_Bartrodef',iparms:[]");
      setEventMetadata("VALID_BARTRODEF",",oparms:[]}");
      setEventMetadata("VALID_BARTRODEFC","{handler:'valid_Bartrodefc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4994BarTroDefC',fld:'BARTRODEFC',pic:'ZZZ9'},{av:'A4995BarTroDefN',fld:'BARTRODEFN',pic:''}]");
      setEventMetadata("VALID_BARTRODEFC",",oparms:[{av:'A4995BarTroDefN',fld:'BARTRODEFN',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Bartrodenm',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(27);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA200BarPieCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z4996BarTroDefM = DecimalUtil.ZERO ;
      Z5008BarTroDeNM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4989BarTroOpeN = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode731 = "" ;
      Gx_mode = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode531 = "" ;
      A4995BarTroDefN = "" ;
      A4996BarTroDefM = DecimalUtil.ZERO ;
      A5008BarTroDeNM = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z4989BarTroOpeN = "" ;
      T00U67_A407EmprNom = new String[] {""} ;
      T00U67_n407EmprNom = new boolean[] {false} ;
      T00U68_A396EmprCod = new String[] {""} ;
      T00U69_A4989BarTroOpeN = new String[] {""} ;
      T00U69_n4989BarTroOpeN = new boolean[] {false} ;
      T00U610_A4991BarTroOpeC = new int[1] ;
      T00U610_n4991BarTroOpeC = new boolean[] {false} ;
      T00U610_A3858BarTroCod = new short[1] ;
      T00U610_A407EmprNom = new String[] {""} ;
      T00U610_n407EmprNom = new boolean[] {false} ;
      T00U610_A4989BarTroOpeN = new String[] {""} ;
      T00U610_n4989BarTroOpeN = new boolean[] {false} ;
      T00U610_A4992BarTroUltD = new short[1] ;
      T00U610_n4992BarTroUltD = new boolean[] {false} ;
      T00U610_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U610_n3860BarTroMet = new boolean[] {false} ;
      T00U610_A396EmprCod = new String[] {""} ;
      T00U610_A129BarCod = new int[1] ;
      T00U610_A132BarCodReo = new byte[1] ;
      T00U610_A130BarCodPar = new String[] {""} ;
      T00U610_A200BarPieCod = new String[] {""} ;
      T00U611_A396EmprCod = new String[] {""} ;
      T00U611_A129BarCod = new int[1] ;
      T00U611_A132BarCodReo = new byte[1] ;
      T00U611_A130BarCodPar = new String[] {""} ;
      T00U611_A200BarPieCod = new String[] {""} ;
      T00U611_A3858BarTroCod = new short[1] ;
      T00U66_A4991BarTroOpeC = new int[1] ;
      T00U66_n4991BarTroOpeC = new boolean[] {false} ;
      T00U66_A3858BarTroCod = new short[1] ;
      T00U66_A4992BarTroUltD = new short[1] ;
      T00U66_n4992BarTroUltD = new boolean[] {false} ;
      T00U66_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U66_n3860BarTroMet = new boolean[] {false} ;
      T00U66_A396EmprCod = new String[] {""} ;
      T00U66_A129BarCod = new int[1] ;
      T00U66_A132BarCodReo = new byte[1] ;
      T00U66_A130BarCodPar = new String[] {""} ;
      T00U66_A200BarPieCod = new String[] {""} ;
      T00U612_A396EmprCod = new String[] {""} ;
      T00U612_A129BarCod = new int[1] ;
      T00U612_A132BarCodReo = new byte[1] ;
      T00U612_A130BarCodPar = new String[] {""} ;
      T00U612_A200BarPieCod = new String[] {""} ;
      T00U612_A3858BarTroCod = new short[1] ;
      T00U613_A396EmprCod = new String[] {""} ;
      T00U613_A129BarCod = new int[1] ;
      T00U613_A132BarCodReo = new byte[1] ;
      T00U613_A130BarCodPar = new String[] {""} ;
      T00U613_A200BarPieCod = new String[] {""} ;
      T00U613_A3858BarTroCod = new short[1] ;
      T00U65_A4991BarTroOpeC = new int[1] ;
      T00U65_n4991BarTroOpeC = new boolean[] {false} ;
      T00U65_A3858BarTroCod = new short[1] ;
      T00U65_A4992BarTroUltD = new short[1] ;
      T00U65_n4992BarTroUltD = new boolean[] {false} ;
      T00U65_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U65_n3860BarTroMet = new boolean[] {false} ;
      T00U65_A396EmprCod = new String[] {""} ;
      T00U65_A129BarCod = new int[1] ;
      T00U65_A132BarCodReo = new byte[1] ;
      T00U65_A130BarCodPar = new String[] {""} ;
      T00U65_A200BarPieCod = new String[] {""} ;
      T00U617_A396EmprCod = new String[] {""} ;
      T00U617_A129BarCod = new int[1] ;
      T00U617_A132BarCodReo = new byte[1] ;
      T00U617_A130BarCodPar = new String[] {""} ;
      T00U617_A200BarPieCod = new String[] {""} ;
      T00U617_A3858BarTroCod = new short[1] ;
      T00U617_A12649TRDefcod = new short[1] ;
      T00U617_A12650TRFasCod = new String[] {""} ;
      T00U619_A396EmprCod = new String[] {""} ;
      T00U619_A129BarCod = new int[1] ;
      T00U619_A132BarCodReo = new byte[1] ;
      T00U619_A130BarCodPar = new String[] {""} ;
      T00U619_A200BarPieCod = new String[] {""} ;
      T00U619_A3858BarTroCod = new short[1] ;
      Z4995BarTroDefN = "" ;
      T00U620_A129BarCod = new int[1] ;
      T00U620_A132BarCodReo = new byte[1] ;
      T00U620_A130BarCodPar = new String[] {""} ;
      T00U620_A200BarPieCod = new String[] {""} ;
      T00U620_A3858BarTroCod = new short[1] ;
      T00U620_A4993BarTroDef = new short[1] ;
      T00U620_A4995BarTroDefN = new String[] {""} ;
      T00U620_n4995BarTroDefN = new boolean[] {false} ;
      T00U620_A4996BarTroDefM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U620_n4996BarTroDefM = new boolean[] {false} ;
      T00U620_A5008BarTroDeNM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U620_n5008BarTroDeNM = new boolean[] {false} ;
      T00U620_A396EmprCod = new String[] {""} ;
      T00U620_A4994BarTroDefC = new short[1] ;
      T00U620_n4994BarTroDefC = new boolean[] {false} ;
      T00U64_A4995BarTroDefN = new String[] {""} ;
      T00U64_n4995BarTroDefN = new boolean[] {false} ;
      GXCCtl = "" ;
      T00U621_A4995BarTroDefN = new String[] {""} ;
      T00U621_n4995BarTroDefN = new boolean[] {false} ;
      T00U622_A396EmprCod = new String[] {""} ;
      T00U622_A129BarCod = new int[1] ;
      T00U622_A132BarCodReo = new byte[1] ;
      T00U622_A130BarCodPar = new String[] {""} ;
      T00U622_A200BarPieCod = new String[] {""} ;
      T00U622_A3858BarTroCod = new short[1] ;
      T00U622_A4993BarTroDef = new short[1] ;
      T00U63_A129BarCod = new int[1] ;
      T00U63_A132BarCodReo = new byte[1] ;
      T00U63_A130BarCodPar = new String[] {""} ;
      T00U63_A200BarPieCod = new String[] {""} ;
      T00U63_A3858BarTroCod = new short[1] ;
      T00U63_A4993BarTroDef = new short[1] ;
      T00U63_A4996BarTroDefM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U63_n4996BarTroDefM = new boolean[] {false} ;
      T00U63_A5008BarTroDeNM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U63_n5008BarTroDeNM = new boolean[] {false} ;
      T00U63_A396EmprCod = new String[] {""} ;
      T00U63_A4994BarTroDefC = new short[1] ;
      T00U63_n4994BarTroDefC = new boolean[] {false} ;
      T00U62_A129BarCod = new int[1] ;
      T00U62_A132BarCodReo = new byte[1] ;
      T00U62_A130BarCodPar = new String[] {""} ;
      T00U62_A200BarPieCod = new String[] {""} ;
      T00U62_A3858BarTroCod = new short[1] ;
      T00U62_A4993BarTroDef = new short[1] ;
      T00U62_A4996BarTroDefM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U62_n4996BarTroDefM = new boolean[] {false} ;
      T00U62_A5008BarTroDeNM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U62_n5008BarTroDeNM = new boolean[] {false} ;
      T00U62_A396EmprCod = new String[] {""} ;
      T00U62_A4994BarTroDefC = new short[1] ;
      T00U62_n4994BarTroDefC = new boolean[] {false} ;
      T00U626_A4995BarTroDefN = new String[] {""} ;
      T00U626_n4995BarTroDefN = new boolean[] {false} ;
      T00U627_A396EmprCod = new String[] {""} ;
      T00U627_A129BarCod = new int[1] ;
      T00U627_A132BarCodReo = new byte[1] ;
      T00U627_A130BarCodPar = new String[] {""} ;
      T00U627_A200BarPieCod = new String[] {""} ;
      T00U627_A3858BarTroCod = new short[1] ;
      T00U627_A4993BarTroDef = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00U628_A407EmprNom = new String[] {""} ;
      T00U628_n407EmprNom = new boolean[] {false} ;
      T00U629_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4989BarTroOpeN = "" ;
      ZZ3860BarTroMet = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trevpz3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trevpz3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trevpz3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trevpz3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trevpz3__default(),
         new Object[] {
             new Object[] {
            T00U62_A129BarCod, T00U62_A132BarCodReo, T00U62_A130BarCodPar, T00U62_A200BarPieCod, T00U62_A3858BarTroCod, T00U62_A4993BarTroDef, T00U62_A4996BarTroDefM, T00U62_n4996BarTroDefM, T00U62_A5008BarTroDeNM, T00U62_n5008BarTroDeNM,
            T00U62_A396EmprCod, T00U62_A4994BarTroDefC, T00U62_n4994BarTroDefC
            }
            , new Object[] {
            T00U63_A129BarCod, T00U63_A132BarCodReo, T00U63_A130BarCodPar, T00U63_A200BarPieCod, T00U63_A3858BarTroCod, T00U63_A4993BarTroDef, T00U63_A4996BarTroDefM, T00U63_n4996BarTroDefM, T00U63_A5008BarTroDeNM, T00U63_n5008BarTroDeNM,
            T00U63_A396EmprCod, T00U63_A4994BarTroDefC, T00U63_n4994BarTroDefC
            }
            , new Object[] {
            T00U64_A4995BarTroDefN, T00U64_n4995BarTroDefN
            }
            , new Object[] {
            T00U65_A4991BarTroOpeC, T00U65_n4991BarTroOpeC, T00U65_A3858BarTroCod, T00U65_A4992BarTroUltD, T00U65_n4992BarTroUltD, T00U65_A3860BarTroMet, T00U65_n3860BarTroMet, T00U65_A396EmprCod, T00U65_A129BarCod, T00U65_A132BarCodReo,
            T00U65_A130BarCodPar, T00U65_A200BarPieCod
            }
            , new Object[] {
            T00U66_A4991BarTroOpeC, T00U66_n4991BarTroOpeC, T00U66_A3858BarTroCod, T00U66_A4992BarTroUltD, T00U66_n4992BarTroUltD, T00U66_A3860BarTroMet, T00U66_n3860BarTroMet, T00U66_A396EmprCod, T00U66_A129BarCod, T00U66_A132BarCodReo,
            T00U66_A130BarCodPar, T00U66_A200BarPieCod
            }
            , new Object[] {
            T00U67_A407EmprNom, T00U67_n407EmprNom
            }
            , new Object[] {
            T00U68_A396EmprCod
            }
            , new Object[] {
            T00U69_A4989BarTroOpeN, T00U69_n4989BarTroOpeN
            }
            , new Object[] {
            T00U610_A4991BarTroOpeC, T00U610_n4991BarTroOpeC, T00U610_A3858BarTroCod, T00U610_A407EmprNom, T00U610_n407EmprNom, T00U610_A4989BarTroOpeN, T00U610_n4989BarTroOpeN, T00U610_A4992BarTroUltD, T00U610_n4992BarTroUltD, T00U610_A3860BarTroMet,
            T00U610_n3860BarTroMet, T00U610_A396EmprCod, T00U610_A129BarCod, T00U610_A132BarCodReo, T00U610_A130BarCodPar, T00U610_A200BarPieCod
            }
            , new Object[] {
            T00U611_A396EmprCod, T00U611_A129BarCod, T00U611_A132BarCodReo, T00U611_A130BarCodPar, T00U611_A200BarPieCod, T00U611_A3858BarTroCod
            }
            , new Object[] {
            T00U612_A396EmprCod, T00U612_A129BarCod, T00U612_A132BarCodReo, T00U612_A130BarCodPar, T00U612_A200BarPieCod, T00U612_A3858BarTroCod
            }
            , new Object[] {
            T00U613_A396EmprCod, T00U613_A129BarCod, T00U613_A132BarCodReo, T00U613_A130BarCodPar, T00U613_A200BarPieCod, T00U613_A3858BarTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U617_A396EmprCod, T00U617_A129BarCod, T00U617_A132BarCodReo, T00U617_A130BarCodPar, T00U617_A200BarPieCod, T00U617_A3858BarTroCod, T00U617_A12649TRDefcod, T00U617_A12650TRFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00U619_A396EmprCod, T00U619_A129BarCod, T00U619_A132BarCodReo, T00U619_A130BarCodPar, T00U619_A200BarPieCod, T00U619_A3858BarTroCod
            }
            , new Object[] {
            T00U620_A129BarCod, T00U620_A132BarCodReo, T00U620_A130BarCodPar, T00U620_A200BarPieCod, T00U620_A3858BarTroCod, T00U620_A4993BarTroDef, T00U620_A4995BarTroDefN, T00U620_n4995BarTroDefN, T00U620_A4996BarTroDefM, T00U620_n4996BarTroDefM,
            T00U620_A5008BarTroDeNM, T00U620_n5008BarTroDeNM, T00U620_A396EmprCod, T00U620_A4994BarTroDefC, T00U620_n4994BarTroDefC
            }
            , new Object[] {
            T00U621_A4995BarTroDefN, T00U621_n4995BarTroDefN
            }
            , new Object[] {
            T00U622_A396EmprCod, T00U622_A129BarCod, T00U622_A132BarCodReo, T00U622_A130BarCodPar, T00U622_A200BarPieCod, T00U622_A3858BarTroCod, T00U622_A4993BarTroDef
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U626_A4995BarTroDefN, T00U626_n4995BarTroDefN
            }
            , new Object[] {
            T00U627_A396EmprCod, T00U627_A129BarCod, T00U627_A132BarCodReo, T00U627_A130BarCodPar, T00U627_A200BarPieCod, T00U627_A3858BarTroCod, T00U627_A4993BarTroDef
            }
            , new Object[] {
            T00U628_A407EmprNom, T00U628_n407EmprNom
            }
            , new Object[] {
            T00U629_A396EmprCod
            }
         }
      );
      Z3858BarTroCod = (short)(0) ;
      A3858BarTroCod = (short)(0) ;
      Z200BarPieCod = "" ;
      A200BarPieCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TREVPZ3" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short wcpOA3858BarTroCod ;
   private short Z3858BarTroCod ;
   private short Z4992BarTroUltD ;
   private short O4992BarTroUltD ;
   private short Z4993BarTroDef ;
   private short Z4994BarTroDefC ;
   private short nRcdDeleted_731 ;
   private short nRcdExists_731 ;
   private short nIsMod_731 ;
   private short A4994BarTroDefC ;
   private short A3858BarTroCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4992BarTroUltD ;
   private short nBlankRcdCount731 ;
   private short RcdFound731 ;
   private short B4992BarTroUltD ;
   private short nBlankRcdUsr731 ;
   private short s4992BarTroUltD ;
   private short A4993BarTroDef ;
   private short RcdFound531 ;
   private short nIsDirty_531 ;
   private short nIsDirty_731 ;
   private short i4992BarTroUltD ;
   private short ZZ3858BarTroCod ;
   private short ZZ4992BarTroUltD ;
   private short ZO4992BarTroUltD ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z4991BarTroOpeC ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int edtBarTroCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarTroOpeN_Enabled ;
   private int edtBarTroUltD_Enabled ;
   private int edtBarTroMet_Enabled ;
   private int edtavnRcdDeleted_731_Enabled ;
   private int edtBarTroDef_Enabled ;
   private int edtBarTroDefC_Enabled ;
   private int edtBarTroDefN_Enabled ;
   private int edtBarTroDefM_Enabled ;
   private int edtBarTroDeNM_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A4991BarTroOpeC ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarTroDef_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarTroMet_Backcolor ;
   private int edtBarTroUltD_Backcolor ;
   private int edtBarTroOpeN_Backcolor ;
   private int edtBarTroCod_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4991BarTroOpeC ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3860BarTroMet ;
   private java.math.BigDecimal Z4996BarTroDefM ;
   private java.math.BigDecimal Z5008BarTroDeNM ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A4996BarTroDefM ;
   private java.math.BigDecimal A5008BarTroDeNM ;
   private java.math.BigDecimal ZZ3860BarTroMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA200BarPieCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarTroMet_Internalname ;
   private String sGXsfl_70_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarPieCod_Internalname ;
   private String edtBarPieCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarTroCod_Internalname ;
   private String edtBarTroCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarTroOpeN_Internalname ;
   private String A4989BarTroOpeN ;
   private String edtBarTroOpeN_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarTroUltD_Internalname ;
   private String edtBarTroUltD_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarTroMet_Jsonclick ;
   private String sMode731 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_731_Internalname ;
   private String edtBarTroDef_Internalname ;
   private String edtBarTroDefC_Internalname ;
   private String edtBarTroDefN_Internalname ;
   private String edtBarTroDefM_Internalname ;
   private String edtBarTroDeNM_Internalname ;
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
   private String AV34Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode531 ;
   private String A4995BarTroDefN ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z4989BarTroOpeN ;
   private String Z4995BarTroDefN ;
   private String GXCCtl ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_731_Jsonclick ;
   private String edtBarTroDef_Jsonclick ;
   private String edtBarTroDefC_Jsonclick ;
   private String edtBarTroDefN_Jsonclick ;
   private String edtBarTroDefM_Jsonclick ;
   private String edtBarTroDeNM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ407EmprNom ;
   private String ZZ4989BarTroOpeN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4994BarTroDefC ;
   private boolean wbErr ;
   private boolean n4992BarTroUltD ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n4991BarTroOpeC ;
   private boolean n407EmprNom ;
   private boolean n4989BarTroOpeN ;
   private boolean n3860BarTroMet ;
   private boolean returnInSub ;
   private boolean n4995BarTroDefN ;
   private boolean n4996BarTroDefM ;
   private boolean n5008BarTroDeNM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00U67_A407EmprNom ;
   private boolean[] T00U67_n407EmprNom ;
   private String[] T00U68_A396EmprCod ;
   private String[] T00U69_A4989BarTroOpeN ;
   private boolean[] T00U69_n4989BarTroOpeN ;
   private int[] T00U610_A4991BarTroOpeC ;
   private boolean[] T00U610_n4991BarTroOpeC ;
   private short[] T00U610_A3858BarTroCod ;
   private String[] T00U610_A407EmprNom ;
   private boolean[] T00U610_n407EmprNom ;
   private String[] T00U610_A4989BarTroOpeN ;
   private boolean[] T00U610_n4989BarTroOpeN ;
   private short[] T00U610_A4992BarTroUltD ;
   private boolean[] T00U610_n4992BarTroUltD ;
   private java.math.BigDecimal[] T00U610_A3860BarTroMet ;
   private boolean[] T00U610_n3860BarTroMet ;
   private String[] T00U610_A396EmprCod ;
   private int[] T00U610_A129BarCod ;
   private byte[] T00U610_A132BarCodReo ;
   private String[] T00U610_A130BarCodPar ;
   private String[] T00U610_A200BarPieCod ;
   private String[] T00U611_A396EmprCod ;
   private int[] T00U611_A129BarCod ;
   private byte[] T00U611_A132BarCodReo ;
   private String[] T00U611_A130BarCodPar ;
   private String[] T00U611_A200BarPieCod ;
   private short[] T00U611_A3858BarTroCod ;
   private int[] T00U66_A4991BarTroOpeC ;
   private boolean[] T00U66_n4991BarTroOpeC ;
   private short[] T00U66_A3858BarTroCod ;
   private short[] T00U66_A4992BarTroUltD ;
   private boolean[] T00U66_n4992BarTroUltD ;
   private java.math.BigDecimal[] T00U66_A3860BarTroMet ;
   private boolean[] T00U66_n3860BarTroMet ;
   private String[] T00U66_A396EmprCod ;
   private int[] T00U66_A129BarCod ;
   private byte[] T00U66_A132BarCodReo ;
   private String[] T00U66_A130BarCodPar ;
   private String[] T00U66_A200BarPieCod ;
   private String[] T00U612_A396EmprCod ;
   private int[] T00U612_A129BarCod ;
   private byte[] T00U612_A132BarCodReo ;
   private String[] T00U612_A130BarCodPar ;
   private String[] T00U612_A200BarPieCod ;
   private short[] T00U612_A3858BarTroCod ;
   private String[] T00U613_A396EmprCod ;
   private int[] T00U613_A129BarCod ;
   private byte[] T00U613_A132BarCodReo ;
   private String[] T00U613_A130BarCodPar ;
   private String[] T00U613_A200BarPieCod ;
   private short[] T00U613_A3858BarTroCod ;
   private int[] T00U65_A4991BarTroOpeC ;
   private boolean[] T00U65_n4991BarTroOpeC ;
   private short[] T00U65_A3858BarTroCod ;
   private short[] T00U65_A4992BarTroUltD ;
   private boolean[] T00U65_n4992BarTroUltD ;
   private java.math.BigDecimal[] T00U65_A3860BarTroMet ;
   private boolean[] T00U65_n3860BarTroMet ;
   private String[] T00U65_A396EmprCod ;
   private int[] T00U65_A129BarCod ;
   private byte[] T00U65_A132BarCodReo ;
   private String[] T00U65_A130BarCodPar ;
   private String[] T00U65_A200BarPieCod ;
   private String[] T00U617_A396EmprCod ;
   private int[] T00U617_A129BarCod ;
   private byte[] T00U617_A132BarCodReo ;
   private String[] T00U617_A130BarCodPar ;
   private String[] T00U617_A200BarPieCod ;
   private short[] T00U617_A3858BarTroCod ;
   private short[] T00U617_A12649TRDefcod ;
   private String[] T00U617_A12650TRFasCod ;
   private String[] T00U619_A396EmprCod ;
   private int[] T00U619_A129BarCod ;
   private byte[] T00U619_A132BarCodReo ;
   private String[] T00U619_A130BarCodPar ;
   private String[] T00U619_A200BarPieCod ;
   private short[] T00U619_A3858BarTroCod ;
   private int[] T00U620_A129BarCod ;
   private byte[] T00U620_A132BarCodReo ;
   private String[] T00U620_A130BarCodPar ;
   private String[] T00U620_A200BarPieCod ;
   private short[] T00U620_A3858BarTroCod ;
   private short[] T00U620_A4993BarTroDef ;
   private String[] T00U620_A4995BarTroDefN ;
   private boolean[] T00U620_n4995BarTroDefN ;
   private java.math.BigDecimal[] T00U620_A4996BarTroDefM ;
   private boolean[] T00U620_n4996BarTroDefM ;
   private java.math.BigDecimal[] T00U620_A5008BarTroDeNM ;
   private boolean[] T00U620_n5008BarTroDeNM ;
   private String[] T00U620_A396EmprCod ;
   private short[] T00U620_A4994BarTroDefC ;
   private boolean[] T00U620_n4994BarTroDefC ;
   private String[] T00U64_A4995BarTroDefN ;
   private boolean[] T00U64_n4995BarTroDefN ;
   private String[] T00U621_A4995BarTroDefN ;
   private boolean[] T00U621_n4995BarTroDefN ;
   private String[] T00U622_A396EmprCod ;
   private int[] T00U622_A129BarCod ;
   private byte[] T00U622_A132BarCodReo ;
   private String[] T00U622_A130BarCodPar ;
   private String[] T00U622_A200BarPieCod ;
   private short[] T00U622_A3858BarTroCod ;
   private short[] T00U622_A4993BarTroDef ;
   private int[] T00U63_A129BarCod ;
   private byte[] T00U63_A132BarCodReo ;
   private String[] T00U63_A130BarCodPar ;
   private String[] T00U63_A200BarPieCod ;
   private short[] T00U63_A3858BarTroCod ;
   private short[] T00U63_A4993BarTroDef ;
   private java.math.BigDecimal[] T00U63_A4996BarTroDefM ;
   private boolean[] T00U63_n4996BarTroDefM ;
   private java.math.BigDecimal[] T00U63_A5008BarTroDeNM ;
   private boolean[] T00U63_n5008BarTroDeNM ;
   private String[] T00U63_A396EmprCod ;
   private short[] T00U63_A4994BarTroDefC ;
   private boolean[] T00U63_n4994BarTroDefC ;
   private int[] T00U62_A129BarCod ;
   private byte[] T00U62_A132BarCodReo ;
   private String[] T00U62_A130BarCodPar ;
   private String[] T00U62_A200BarPieCod ;
   private short[] T00U62_A3858BarTroCod ;
   private short[] T00U62_A4993BarTroDef ;
   private java.math.BigDecimal[] T00U62_A4996BarTroDefM ;
   private boolean[] T00U62_n4996BarTroDefM ;
   private java.math.BigDecimal[] T00U62_A5008BarTroDeNM ;
   private boolean[] T00U62_n5008BarTroDeNM ;
   private String[] T00U62_A396EmprCod ;
   private short[] T00U62_A4994BarTroDefC ;
   private boolean[] T00U62_n4994BarTroDefC ;
   private String[] T00U626_A4995BarTroDefN ;
   private boolean[] T00U626_n4995BarTroDefN ;
   private String[] T00U627_A396EmprCod ;
   private int[] T00U627_A129BarCod ;
   private byte[] T00U627_A132BarCodReo ;
   private String[] T00U627_A130BarCodPar ;
   private String[] T00U627_A200BarPieCod ;
   private short[] T00U627_A3858BarTroCod ;
   private short[] T00U627_A4993BarTroDef ;
   private String[] T00U628_A407EmprNom ;
   private boolean[] T00U628_n407EmprNom ;
   private String[] T00U629_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trevpz3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trevpz3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trevpz3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trevpz3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trevpz3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00U62", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef, BarTroDefM, BarTroDeNM, EmprCod, BarTroDefC FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? AND BarTroDef = ?  FOR UPDATE OF BarTroDefM, BarTroDeNM, BarTroDefC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U63", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef, BarTroDefM, BarTroDeNM, EmprCod, BarTroDefC FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? AND BarTroDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U64", "SELECT TipDefDsc AS BarTroDefN FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U65", "SELECT BarTroOpeC, BarTroCod, BarTroUltD, BarTroMet, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?  FOR UPDATE OF BarTroOpeC, BarTroUltD, BarTroMet NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U66", "SELECT BarTroOpeC, BarTroCod, BarTroUltD, BarTroMet, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U67", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U68", "SELECT EmprCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U69", "SELECT OpeNom AS BarTroOpeN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U610", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarTroOpeC AS BarTroOpeC, TM1.BarTroCod, T2.EmprNom, T3.OpeNom AS BarTroOpeN, TM1.BarTroUltD, TM1.BarTroMet, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod FROM ((TXPBARTRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.BarTroOpeC) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? and TM1.BarTroCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod, TM1.BarTroCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U611", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U612", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U613", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC, BarTroCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U614", "INSERT INTO TXPBARTRO(BarTroOpeC, BarTroCod, BarTroUltD, BarTroMet, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroFec, BarTroAnc, BarTroIden, AlbTar, BarTroFinP, BarTroEst, BarTroCal, BarTroJau, BarTroObs, BarTroKil, BarTroCarr, BarTroOb, BarTroHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00U615", "UPDATE TXPBARTRO SET BarTroOpeC=?, BarTroUltD=?, BarTroMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00U616", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new ForEachCursor("T00U617", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, TRDefcod, TRFasCod FROM TXPPZTRD0 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U618", "UPDATE TXPBARTRO SET BarTroUltD=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new ForEachCursor("T00U619", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U620", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod, T1.BarTroDef, T2.TipDefDsc AS BarTroDefN, T1.BarTroDefM, T1.BarTroDeNM, T1.EmprCod, T1.BarTroDefC AS BarTroDefC FROM (TXPBarTrD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.BarTroDefC) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? and T1.BarTroCod = ? and T1.BarTroDef = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod, T1.BarTroDef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U621", "SELECT TipDefDsc AS BarTroDefN FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U622", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? AND BarTroDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00U623", "INSERT INTO TXPBarTrD(BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef, BarTroDefM, BarTroDeNM, EmprCod, BarTroDefC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBarTrD")
         ,new UpdateCursor("T00U624", "UPDATE TXPBarTrD SET BarTroDefM=?, BarTroDeNM=?, BarTroDefC=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? AND BarTroDef = ?", GX_NOMASK, "TXPBarTrD")
         ,new UpdateCursor("T00U625", "DELETE FROM TXPBarTrD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? AND BarTroDef = ?", GX_NOMASK, "TXPBarTrD")
         ,new ForEachCursor("T00U626", "SELECT TipDefDsc AS BarTroDefN FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U627", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U628", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U629", "SELECT EmprCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 9);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((String[]) buf[15])[0] = rslt.getString(11, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 9);
               return;
            case 13 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 9);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 9);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(9, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               return;
            case 22 :
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

