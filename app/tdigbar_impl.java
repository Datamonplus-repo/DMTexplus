package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdigbar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV33Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
         AV34DisArtcod = httpContext.GetPar( "DisArtcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
         A13094BarDGDibCl = httpContext.GetPar( "BarDGDibCl") ;
         A13095BarDGDibIn = (int)(GXutil.lval( httpContext.GetPar( "BarDGDibIn"))) ;
         A13096BarDGComb = httpContext.GetPar( "BarDGComb") ;
         A13097BarDGFOndo = httpContext.GetPar( "BarDGFOndo") ;
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_1MO1793( Gx_mode, A396EmprCod, AV33Clicod, AV34DisArtcod, A13094BarDGDibCl, A13095BarDGDibIn, A13096BarDGComb, A13097BarDGFOndo, Gx_msg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A13094BarDGDibCl = httpContext.GetPar( "BarDGDibCl") ;
         A13095BarDGDibIn = (int)(GXutil.lval( httpContext.GetPar( "BarDGDibIn"))) ;
         A13096BarDGComb = httpContext.GetPar( "BarDGComb") ;
         A13097BarDGFOndo = httpContext.GetPar( "BarDGFOndo") ;
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1MO1793( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A13094BarDGDibCl, A13095BarDGDibIn, A13096BarDGComb, A13097BarDGFOndo, Gx_msg) ;
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
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV33Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
            AV34DisArtcod = httpContext.GetPar( "DisArtcod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIBUJOS y COMINACIONES DIGITAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A13092BarDGUltLi = (byte)(GXutil.lval( httpContext.GetPar( "BarDGUltLi"))) ;
      n13092BarDGUltLi = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tdigbar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdigbar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdigbar_impl.class ));
   }

   public tdigbar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDIGBAR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDGUltLi_Internalname, GXutil.ltrim( localUtil.ntoc( A13092BarDGUltLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarDGUltLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13092BarDGUltLi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13092BarDGUltLi), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDGUltLi_Jsonclick, 0, "", "", "", "", "", 1, edtBarDGUltLi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGBAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1793 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1793 = (short)(1) ;
            scanStart1MO1793( ) ;
            while ( RcdFound1793 != 0 )
            {
               init_level_properties1793( ) ;
               getByPrimaryKey1MO1793( ) ;
               addRow1MO1793( ) ;
               scanNext1MO1793( ) ;
            }
            scanEnd1MO1793( ) ;
            nBlankRcdCount1793 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13092BarDGUltLi = A13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         standaloneNotModal1MO1793( ) ;
         standaloneModal1MO1793( ) ;
         sMode1793 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1MO1793( ) ;
            edtavnRcdDeleted_1793_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1793_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1793_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1793_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGDibCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGDIBCL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibCl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGDibIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGDIBIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibIn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGCOMB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGComb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGFOndo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGFONDO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGFOndo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGFOndo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGObs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGPZS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGPzs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGMTS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGMts_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGAncho_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGANCHO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGAncho_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGAncho_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDGEstad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGESTAD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDGEstad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGEstad_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1793 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1MO1793( ) ;
            }
            sendRow1MO1793( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1793 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13092BarDGUltLi = B13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1793 = (short)(5) ;
         nRcdExists_1793 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1MO1793( ) ;
            while ( RcdFound1793 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501793( ) ;
               init_level_properties1793( ) ;
               standaloneNotModal1MO1793( ) ;
               getByPrimaryKey1MO1793( ) ;
               standaloneModal1MO1793( ) ;
               addRow1MO1793( ) ;
               scanNext1MO1793( ) ;
            }
            scanEnd1MO1793( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1793 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501793( ) ;
      initAll1MO1793( ) ;
      init_level_properties1793( ) ;
      B13092BarDGUltLi = A13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      nRcdExists_1793 = (short)(0) ;
      nIsMod_1793 = (short)(0) ;
      nRcdDeleted_1793 = (short)(0) ;
      nBlankRcdCount1793 = (short)(nBlankRcdUsr1793+nBlankRcdCount1793) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1793 > 0 )
      {
         standaloneNotModal1MO1793( ) ;
         standaloneModal1MO1793( ) ;
         addRow1MO1793( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarDGLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1793 = (short)(nBlankRcdCount1793-1) ;
      }
      Gx_mode = sMode1793 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13092BarDGUltLi = B13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGBAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDIGBAR.htm");
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
      e111MO2 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z13092BarDGUltLi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13092BarDGUltLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            O13092BarDGUltLi = (byte)(localUtil.ctol( httpContext.cgiGet( "O13092BarDGUltLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34DisArtcod = httpContext.cgiGet( "vDISARTCOD") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A13092BarDGUltLi = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarDGUltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13092BarDGUltLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDIGBAR");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdigbar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                        e111MO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121MO2 ();
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
         /* Execute user event: After Trn */
         e121MO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1MO12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1793_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1793_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1MO12( ) ;
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

   public void confirm_1MO0( )
   {
      beforeValidate1MO12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1MO12( ) ;
         }
         else
         {
            checkExtendedTable1MO12( ) ;
            if ( AnyError == 0 )
            {
               zm1MO12( 15) ;
               zm1MO12( 16) ;
            }
            closeExtendedTableCursors1MO12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1MO1793( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1MO0( ) ;
      }
   }

   public void confirm_1MO1793( )
   {
      s13092BarDGUltLi = O13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1MO1793( ) ;
         if ( ( nRcdExists_1793 != 0 ) || ( nIsMod_1793 != 0 ) )
         {
            getKey1MO1793( ) ;
            if ( ( nRcdExists_1793 == 0 ) && ( nRcdDeleted_1793 == 0 ) )
            {
               if ( RcdFound1793 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1MO1793( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1MO1793( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1MO1793( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13092BarDGUltLi = A13092BarDGUltLi ;
                     n13092BarDGUltLi = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "BARDGLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarDGLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1793 != 0 )
               {
                  if ( nRcdDeleted_1793 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1MO1793( ) ;
                     load1MO1793( ) ;
                     beforeValidate1MO1793( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1MO1793( ) ;
                        O13092BarDGUltLi = A13092BarDGUltLi ;
                        n13092BarDGUltLi = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1793 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1MO1793( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1MO1793( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1MO1793( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13092BarDGUltLi = A13092BarDGUltLi ;
                           n13092BarDGUltLi = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1793 == 0 )
                  {
                     GXCCtl = "BARDGLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarDGLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1793_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGDibCl_Internalname, GXutil.rtrim( A13094BarDGDibCl)) ;
         httpContext.changePostValue( edtBarDGDibIn_Internalname, GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGComb_Internalname, GXutil.rtrim( A13096BarDGComb)) ;
         httpContext.changePostValue( edtBarDGFOndo_Internalname, GXutil.rtrim( A13097BarDGFOndo)) ;
         httpContext.changePostValue( edtBarDGObs_Internalname, GXutil.rtrim( A13098BarDGObs)) ;
         httpContext.changePostValue( edtBarDGPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGAncho_Internalname, GXutil.ltrim( localUtil.ntoc( A13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGEstad_Internalname, GXutil.ltrim( localUtil.ntoc( A13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13093BarDGLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13094BarDGDibCl_"+sGXsfl_50_idx, GXutil.rtrim( Z13094BarDGDibCl)) ;
         httpContext.changePostValue( "ZT_"+"Z13095BarDGDibIn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13096BarDGComb_"+sGXsfl_50_idx, GXutil.rtrim( Z13096BarDGComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13097BarDGFOndo_"+sGXsfl_50_idx, GXutil.rtrim( Z13097BarDGFOndo)) ;
         httpContext.changePostValue( "ZT_"+"Z13132BarDGEstad_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13098BarDGObs_"+sGXsfl_50_idx, GXutil.rtrim( Z13098BarDGObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13099BarDGPzs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13100BarDGMts_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13101BarDGAncho_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1793 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1793_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1793_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGDIBCL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGDIBIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGCOMB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGFONDO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGFOndo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGPZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGMTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGANCHO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGAncho_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGESTAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGEstad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13092BarDGUltLi = s13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1MO0( )
   {
   }

   public void e111MO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdigbar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tdigbar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdigbar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdigbar_impl.this.A396EmprCod = GXv_char2[0] ;
      tdigbar_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdigbar_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121MO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      new app.pdigbar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
      tdigbar_impl.this.A396EmprCod = GXv_char4[0] ;
      tdigbar_impl.this.A129BarCod = GXv_int5[0] ;
      tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
      tdigbar_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      /*  Sending Event outputs  */
   }

   public void zm1MO12( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01MO5_A361DisCod[0] ;
            Z2759BarMaqGru = T01MO5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01MO5_A180BarMaqCod[0] ;
            Z13092BarDGUltLi = T01MO5_A13092BarDGUltLi[0] ;
            Z252CliCod = T01MO5_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z13092BarDGUltLi = A13092BarDGUltLi ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z13092BarDGUltLi = A13092BarDGUltLi ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarDGUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGUltLi_Enabled), 5, 0), true);
      AV37Pgmname = "TDIGBAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtBarDGUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGUltLi_Enabled), 5, 0), true);
      /* Using cursor T01MO6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MO6_A407EmprNom[0] ;
      n407EmprNom = T01MO6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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
      /* Using cursor T01MO7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01MO7_A252CliCod[0] ;
      n252CliCod = T01MO7_n252CliCod[0] ;
      A365DisDes = T01MO7_A365DisDes[0] ;
      pr_default.close(5);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1MO12( )
   {
      /* Using cursor T01MO8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01MO8_A361DisCod[0] ;
         A2759BarMaqGru = T01MO8_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01MO8_A180BarMaqCod[0] ;
         A407EmprNom = T01MO8_A407EmprNom[0] ;
         n407EmprNom = T01MO8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13092BarDGUltLi = T01MO8_A13092BarDGUltLi[0] ;
         n13092BarDGUltLi = T01MO8_n13092BarDGUltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         A252CliCod = T01MO8_A252CliCod[0] ;
         n252CliCod = T01MO8_n252CliCod[0] ;
         A252CliCod = T01MO8_A252CliCod[0] ;
         n252CliCod = T01MO8_n252CliCod[0] ;
         A365DisDes = T01MO8_A365DisDes[0] ;
         zm1MO12( -14) ;
      }
      pr_default.close(6);
      onLoadActions1MO12( ) ;
   }

   public void onLoadActions1MO12( )
   {
   }

   public void checkExtendedTable1MO12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1MO12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1MO12( )
   {
      /* Using cursor T01MO9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01MO5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( T01MO5_A129BarCod[0] == A129BarCod ) && ( T01MO5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MO12( 14) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01MO5_A361DisCod[0] ;
         A2759BarMaqGru = T01MO5_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01MO5_A180BarMaqCod[0] ;
         A13092BarDGUltLi = T01MO5_A13092BarDGUltLi[0] ;
         n13092BarDGUltLi = T01MO5_n13092BarDGUltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         A252CliCod = T01MO5_A252CliCod[0] ;
         n252CliCod = T01MO5_n252CliCod[0] ;
         O13092BarDGUltLi = A13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1MO12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1MO12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1MO12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1MO12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01MO10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MO10_A129BarCod[0] == A129BarCod ) && ( T01MO10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO10_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MO10_A129BarCod[0] == A129BarCod ) && ( T01MO10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO10_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01MO11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MO11_A129BarCod[0] == A129BarCod ) && ( T01MO11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MO11_A129BarCod[0] == A129BarCod ) && ( T01MO11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1MO12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13092BarDGUltLi = O13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         insert1MO12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13092BarDGUltLi = O13092BarDGUltLi ;
               n13092BarDGUltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13092BarDGUltLi = O13092BarDGUltLi ;
               n13092BarDGUltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
               update1MO12( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13092BarDGUltLi = O13092BarDGUltLi ;
               n13092BarDGUltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
               insert1MO12( ) ;
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
                  A13092BarDGUltLi = O13092BarDGUltLi ;
                  n13092BarDGUltLi = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
                  insert1MO12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13092BarDGUltLi = O13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey1MO12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdigbar");
   }

   public void insert_check( )
   {
      confirm_1MO0( ) ;
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
      if ( RcdFound12 == 0 )
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
      scanStart1MO12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MO12( ) ;
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
      if ( RcdFound12 == 0 )
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
      if ( RcdFound12 == 0 )
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
      scanStart1MO12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1MO12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MO12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1MO12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MO4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01MO4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01MO4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01MO4_A180BarMaqCod[0]) != 0 ) || ( Z13092BarDGUltLi != T01MO4_A13092BarDGUltLi[0] ) || ( Z252CliCod != T01MO4_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01MO4_A361DisCod[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01MO4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01MO4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01MO4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01MO4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01MO4_A180BarMaqCod[0]);
            }
            if ( Z13092BarDGUltLi != T01MO4_A13092BarDGUltLi[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGUltLi");
               GXutil.writeLogRaw("Old: ",Z13092BarDGUltLi);
               GXutil.writeLogRaw("Current: ",T01MO4_A13092BarDGUltLi[0]);
            }
            if ( Z252CliCod != T01MO4_A252CliCod[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01MO4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MO12( )
   {
      beforeValidate1MO12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MO12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MO12( 0) ;
         checkOptimisticConcurrency1MO12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MO12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MO12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MO12 */
                  pr_default.execute(10, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11MO12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MO12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1MO0( ) ;
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
            load1MO12( ) ;
         }
         endLevel1MO12( ) ;
      }
      closeExtendedTableCursors1MO12( ) ;
   }

   public void update1MO12( )
   {
      beforeValidate1MO12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MO12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MO12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MO12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1MO12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MO13 */
                  pr_default.execute(11, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1MO12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                     tdigbar_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdigbar_impl.this.A129BarCod = GXv_int5[0] ;
                     tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tdigbar_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN11MO12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MO12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1MO0( ) ;
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
         endLevel1MO12( ) ;
      }
      closeExtendedTableCursors1MO12( ) ;
   }

   public void deferredUpdate1MO12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MO12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MO12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MO12( ) ;
         afterConfirm1MO12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MO12( ) ;
            if ( AnyError == 0 )
            {
               A13092BarDGUltLi = O13092BarDGUltLi ;
               n13092BarDGUltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
               scanStart1MO1793( ) ;
               while ( RcdFound1793 != 0 )
               {
                  getByPrimaryKey1MO1793( ) ;
                  delete1MO1793( ) ;
                  scanNext1MO1793( ) ;
                  O13092BarDGUltLi = A13092BarDGUltLi ;
                  n13092BarDGUltLi = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
               }
               scanEnd1MO1793( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MO14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11MO12( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1MO12( ) ;
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
                        resetCaption1MO0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MO12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MO12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01MO15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01MO16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01MO17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01MO18 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01MO19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01MO20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01MO21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01MO22 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01MO23 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01MO24 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01MO25 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01MO26 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01MO27 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01MO28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01MO29 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01MO30 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01MO31 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01MO32 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01MO33 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01MO34 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01MO35 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01MO36 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01MO37 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01MO38 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01MO39 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01MO40 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01MO41 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01MO42 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01MO43 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01MO44 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01MO45 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01MO46 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01MO47 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01MO48 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01MO49 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01MO50 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01MO51 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01MO52 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01MO53 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01MO54 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01MO55 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01MO56 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01MO57 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01MO58 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01MO59 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01MO60 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01MO61 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01MO62 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01MO63 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01MO64 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01MO65 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01MO66 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01MO67 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01MO68 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01MO69 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01MO70 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01MO71 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01MO72 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01MO73 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01MO74 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01MO75 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01MO76 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
      }
   }

   public void processNestedLevel1MO1793( )
   {
      s13092BarDGUltLi = O13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1MO1793( ) ;
         if ( ( nRcdExists_1793 != 0 ) || ( nIsMod_1793 != 0 ) )
         {
            standaloneNotModal1MO1793( ) ;
            getKey1MO1793( ) ;
            if ( ( nRcdExists_1793 == 0 ) && ( nRcdDeleted_1793 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1MO1793( ) ;
            }
            else
            {
               if ( RcdFound1793 != 0 )
               {
                  if ( ( nRcdDeleted_1793 != 0 ) && ( nRcdExists_1793 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1MO1793( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1793 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1MO1793( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1793 == 0 )
                  {
                     GXCCtl = "BARDGLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarDGLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13092BarDGUltLi = A13092BarDGUltLi ;
            n13092BarDGUltLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1793_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGDibCl_Internalname, GXutil.rtrim( A13094BarDGDibCl)) ;
         httpContext.changePostValue( edtBarDGDibIn_Internalname, GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGComb_Internalname, GXutil.rtrim( A13096BarDGComb)) ;
         httpContext.changePostValue( edtBarDGFOndo_Internalname, GXutil.rtrim( A13097BarDGFOndo)) ;
         httpContext.changePostValue( edtBarDGObs_Internalname, GXutil.rtrim( A13098BarDGObs)) ;
         httpContext.changePostValue( edtBarDGPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGAncho_Internalname, GXutil.ltrim( localUtil.ntoc( A13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDGEstad_Internalname, GXutil.ltrim( localUtil.ntoc( A13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13093BarDGLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13094BarDGDibCl_"+sGXsfl_50_idx, GXutil.rtrim( Z13094BarDGDibCl)) ;
         httpContext.changePostValue( "ZT_"+"Z13095BarDGDibIn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13096BarDGComb_"+sGXsfl_50_idx, GXutil.rtrim( Z13096BarDGComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13097BarDGFOndo_"+sGXsfl_50_idx, GXutil.rtrim( Z13097BarDGFOndo)) ;
         httpContext.changePostValue( "ZT_"+"Z13132BarDGEstad_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13098BarDGObs_"+sGXsfl_50_idx, GXutil.rtrim( Z13098BarDGObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13099BarDGPzs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13100BarDGMts_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13101BarDGAncho_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1793_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1793 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1793_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1793_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGDIBCL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGDIBIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGCOMB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGFONDO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGFOndo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGPZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGMTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGANCHO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGAncho_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDGESTAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGEstad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1MO1793( ) ;
      if ( AnyError != 0 )
      {
         O13092BarDGUltLi = s13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      }
      nRcdExists_1793 = (short)(0) ;
      nIsMod_1793 = (short)(0) ;
      nRcdDeleted_1793 = (short)(0) ;
   }

   public void processLevel1MO12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1MO1793( ) ;
      if ( AnyError != 0 )
      {
         O13092BarDGUltLi = s13092BarDGUltLi ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01MO77 */
      pr_default.execute(75, new Object[] {Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
   }

   public void updateTablesN11MO12( )
   {
      /* Using cursor T01MO78 */
      pr_default.execute(76, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1MO12( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1MO12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdigbar");
         if ( AnyError == 0 )
         {
            confirmValues1MO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdigbar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1MO12( )
   {
      /* Scan By routine */
      /* Using cursor T01MO79 */
      pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MO12( )
   {
      /* Scan next routine */
      pr_default.readNext(77);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd1MO12( )
   {
      pr_default.close(77);
   }

   public void afterConfirm1MO12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MO12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MO12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MO12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MO12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MO12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MO12( )
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
      edtBarDGUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGUltLi_Enabled), 5, 0), true);
   }

   public void zm1MO1793( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13132BarDGEstad = T01MO3_A13132BarDGEstad[0] ;
            Z13098BarDGObs = T01MO3_A13098BarDGObs[0] ;
            Z13099BarDGPzs = T01MO3_A13099BarDGPzs[0] ;
            Z13100BarDGMts = T01MO3_A13100BarDGMts[0] ;
            Z13101BarDGAncho = T01MO3_A13101BarDGAncho[0] ;
         }
         else
         {
            Z13132BarDGEstad = A13132BarDGEstad ;
            Z13098BarDGObs = A13098BarDGObs ;
            Z13099BarDGPzs = A13099BarDGPzs ;
            Z13100BarDGMts = A13100BarDGMts ;
            Z13101BarDGAncho = A13101BarDGAncho ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z13093BarDGLin = A13093BarDGLin ;
         Z13094BarDGDibCl = A13094BarDGDibCl ;
         Z13095BarDGDibIn = A13095BarDGDibIn ;
         Z13096BarDGComb = A13096BarDGComb ;
         Z13097BarDGFOndo = A13097BarDGFOndo ;
         Z13132BarDGEstad = A13132BarDGEstad ;
         Z13098BarDGObs = A13098BarDGObs ;
         Z13099BarDGPzs = A13099BarDGPzs ;
         Z13100BarDGMts = A13100BarDGMts ;
         Z13101BarDGAncho = A13101BarDGAncho ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1MO1793( )
   {
      edtBarDGUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGUltLi_Enabled), 5, 0), true);
      edtBarDGUltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGUltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGUltLi_Enabled), 5, 0), true);
   }

   public void standaloneModal1MO1793( )
   {
      if ( isIns( )  )
      {
         A13092BarDGUltLi = (byte)(O13092BarDGUltLi+1) ;
         n13092BarDGUltLi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13093BarDGLin = A13092BarDGUltLi ;
      }
      if ( isIns( )  && (0==A13132BarDGEstad) && ( Gx_BScreen == 0 ) )
      {
         A13132BarDGEstad = (byte)(0) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarDGLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtBarDGLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarDGDibCl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibCl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtBarDGDibCl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibCl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarDGDibIn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibIn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtBarDGDibIn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibIn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarDGComb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGComb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtBarDGComb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGComb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarDGFOndo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGFOndo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGFOndo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtBarDGFOndo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarDGFOndo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGFOndo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1MO1793( )
   {
      /* Using cursor T01MO80 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound1793 = (short)(1) ;
         A13132BarDGEstad = T01MO80_A13132BarDGEstad[0] ;
         A13098BarDGObs = T01MO80_A13098BarDGObs[0] ;
         A13099BarDGPzs = T01MO80_A13099BarDGPzs[0] ;
         A13100BarDGMts = T01MO80_A13100BarDGMts[0] ;
         A13101BarDGAncho = T01MO80_A13101BarDGAncho[0] ;
         zm1MO1793( -17) ;
      }
      pr_default.close(78);
      onLoadActions1MO1793( ) ;
   }

   public void onLoadActions1MO1793( )
   {
   }

   public void checkExtendedTable1MO1793( )
   {
      nIsDirty_1793 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1MO1793( ) ;
      if ( (GXutil.strcmp("", A13094BarDGDibCl)==0) && (0==A13095BarDGDibIn) && true /* After */ )
      {
         GXCCtl = "BARDGDIBIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Faltan Datos: Dibujo Cliente/Dibujo Interno", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGDibIn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13096BarDGComb)==0) && true /* After */ )
      {
         GXCCtl = "BARDGCOMB_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Combinacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGComb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV33Clicod ;
         GXv_char3[0] = AV34DisArtcod ;
         GXv_char2[0] = A13094BarDGDibCl ;
         GXv_int7[0] = A13095BarDGDibIn ;
         GXv_char8[0] = A13096BarDGComb ;
         GXv_char9[0] = A13097BarDGFOndo ;
         GXv_char10[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int7, GXv_char8, GXv_char9, GXv_char10) ;
         tdigbar_impl.this.A396EmprCod = GXv_char4[0] ;
         tdigbar_impl.this.AV33Clicod = GXv_int5[0] ;
         tdigbar_impl.this.AV34DisArtcod = GXv_char3[0] ;
         tdigbar_impl.this.A13094BarDGDibCl = GXv_char2[0] ;
         tdigbar_impl.this.A13095BarDGDibIn = GXv_int7[0] ;
         tdigbar_impl.this.A13096BarDGComb = GXv_char8[0] ;
         tdigbar_impl.this.A13097BarDGFOndo = GXv_char9[0] ;
         tdigbar_impl.this.Gx_msg = GXv_char10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ && isIns( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char9[0] = A130BarCodPar ;
         GXv_char8[0] = A13094BarDGDibCl ;
         GXv_int5[0] = A13095BarDGDibIn ;
         GXv_char4[0] = A13096BarDGComb ;
         GXv_char3[0] = A13097BarDGFOndo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc187(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
         tdigbar_impl.this.A129BarCod = GXv_int7[0] ;
         tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
         tdigbar_impl.this.A130BarCodPar = GXv_char9[0] ;
         tdigbar_impl.this.A13094BarDGDibCl = GXv_char8[0] ;
         tdigbar_impl.this.A13095BarDGDibIn = GXv_int5[0] ;
         tdigbar_impl.this.A13096BarDGComb = GXv_char4[0] ;
         tdigbar_impl.this.A13097BarDGFOndo = GXv_char3[0] ;
         tdigbar_impl.this.Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
      {
         GXCCtl = "BARDGFONDO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(Gx_msg, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGFOndo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13097BarDGFOndo)==0) && true /* After */ )
      {
         GXCCtl = "BARDGFONDO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fondo", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1MO1793( )
   {
   }

   public void enableDisable1MO1793( )
   {
   }

   public void getKey1MO1793( )
   {
      /* Using cursor T01MO81 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1793 = (short)(1) ;
      }
      else
      {
         RcdFound1793 = (short)(0) ;
      }
      pr_default.close(79);
   }

   public void getByPrimaryKey1MO1793( )
   {
      /* Using cursor T01MO3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
      if ( (pr_default.getStatus(1) != 101) && ( T01MO3_A129BarCod[0] == A129BarCod ) && ( T01MO3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MO3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MO1793( 17) ;
         RcdFound1793 = (short)(1) ;
         initializeNonKey1MO1793( ) ;
         A13093BarDGLin = T01MO3_A13093BarDGLin[0] ;
         A13094BarDGDibCl = T01MO3_A13094BarDGDibCl[0] ;
         A13095BarDGDibIn = T01MO3_A13095BarDGDibIn[0] ;
         A13096BarDGComb = T01MO3_A13096BarDGComb[0] ;
         A13097BarDGFOndo = T01MO3_A13097BarDGFOndo[0] ;
         A13132BarDGEstad = T01MO3_A13132BarDGEstad[0] ;
         A13098BarDGObs = T01MO3_A13098BarDGObs[0] ;
         A13099BarDGPzs = T01MO3_A13099BarDGPzs[0] ;
         A13100BarDGMts = T01MO3_A13100BarDGMts[0] ;
         A13101BarDGAncho = T01MO3_A13101BarDGAncho[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z13093BarDGLin = A13093BarDGLin ;
         Z13094BarDGDibCl = A13094BarDGDibCl ;
         Z13095BarDGDibIn = A13095BarDGDibIn ;
         Z13096BarDGComb = A13096BarDGComb ;
         Z13097BarDGFOndo = A13097BarDGFOndo ;
         sMode1793 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MO1793( ) ;
         load1MO1793( ) ;
         Gx_mode = sMode1793 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1793 = (short)(0) ;
         initializeNonKey1MO1793( ) ;
         sMode1793 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MO1793( ) ;
         Gx_mode = sMode1793 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1MO1793( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1MO1793( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MO2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIGBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z13132BarDGEstad != T01MO2_A13132BarDGEstad[0] ) || ( GXutil.strcmp(Z13098BarDGObs, T01MO2_A13098BarDGObs[0]) != 0 ) || ( Z13099BarDGPzs != T01MO2_A13099BarDGPzs[0] ) || ( DecimalUtil.compareTo(Z13100BarDGMts, T01MO2_A13100BarDGMts[0]) != 0 ) || ( Z13101BarDGAncho != T01MO2_A13101BarDGAncho[0] ) )
         {
            if ( Z13132BarDGEstad != T01MO2_A13132BarDGEstad[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGEstad");
               GXutil.writeLogRaw("Old: ",Z13132BarDGEstad);
               GXutil.writeLogRaw("Current: ",T01MO2_A13132BarDGEstad[0]);
            }
            if ( GXutil.strcmp(Z13098BarDGObs, T01MO2_A13098BarDGObs[0]) != 0 )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGObs");
               GXutil.writeLogRaw("Old: ",Z13098BarDGObs);
               GXutil.writeLogRaw("Current: ",T01MO2_A13098BarDGObs[0]);
            }
            if ( Z13099BarDGPzs != T01MO2_A13099BarDGPzs[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGPzs");
               GXutil.writeLogRaw("Old: ",Z13099BarDGPzs);
               GXutil.writeLogRaw("Current: ",T01MO2_A13099BarDGPzs[0]);
            }
            if ( DecimalUtil.compareTo(Z13100BarDGMts, T01MO2_A13100BarDGMts[0]) != 0 )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGMts");
               GXutil.writeLogRaw("Old: ",Z13100BarDGMts);
               GXutil.writeLogRaw("Current: ",T01MO2_A13100BarDGMts[0]);
            }
            if ( Z13101BarDGAncho != T01MO2_A13101BarDGAncho[0] )
            {
               GXutil.writeLogln("tdigbar:[seudo value changed for attri]"+"BarDGAncho");
               GXutil.writeLogRaw("Old: ",Z13101BarDGAncho);
               GXutil.writeLogRaw("Current: ",T01MO2_A13101BarDGAncho[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDIGBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MO1793( )
   {
      beforeValidate1MO1793( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MO1793( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MO1793( 0) ;
         checkOptimisticConcurrency1MO1793( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MO1793( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MO1793( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MO82 */
                  pr_default.execute(80, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo, Byte.valueOf(A13132BarDGEstad), A13098BarDGObs, Short.valueOf(A13099BarDGPzs), A13100BarDGMts, Short.valueOf(A13101BarDGAncho), Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGBAR");
                  if ( (pr_default.getStatus(80) == 1) )
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
            load1MO1793( ) ;
         }
         endLevel1MO1793( ) ;
      }
      closeExtendedTableCursors1MO1793( ) ;
   }

   public void update1MO1793( )
   {
      beforeValidate1MO1793( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MO1793( ) ;
      }
      if ( ( nIsMod_1793 != 0 ) || ( nIsDirty_1793 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1MO1793( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1MO1793( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1MO1793( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01MO83 */
                     pr_default.execute(81, new Object[] {Byte.valueOf(A13132BarDGEstad), A13098BarDGObs, Short.valueOf(A13099BarDGPzs), A13100BarDGMts, Short.valueOf(A13101BarDGAncho), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGBAR");
                     if ( (pr_default.getStatus(81) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIGBAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1MO1793( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char10[0] = A396EmprCod ;
                        GXv_int7[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char9[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6, GXv_char9) ;
                        tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
                        tdigbar_impl.this.A129BarCod = GXv_int7[0] ;
                        tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tdigbar_impl.this.A130BarCodPar = GXv_char9[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1MO1793( ) ;
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
            endLevel1MO1793( ) ;
         }
      }
      closeExtendedTableCursors1MO1793( ) ;
   }

   public void deferredUpdate1MO1793( )
   {
   }

   public void delete1MO1793( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MO1793( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MO1793( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MO1793( ) ;
         afterConfirm1MO1793( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MO1793( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01MO84 */
               pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGBAR");
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
      sMode1793 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MO1793( ) ;
      Gx_mode = sMode1793 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MO1793( )
   {
      standaloneModal1MO1793( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  || isUpd( )  )
         {
            GXv_char10[0] = A396EmprCod ;
            GXv_int7[0] = AV33Clicod ;
            GXv_char9[0] = AV34DisArtcod ;
            GXv_char8[0] = A13094BarDGDibCl ;
            GXv_int5[0] = A13095BarDGDibIn ;
            GXv_char4[0] = A13096BarDGComb ;
            GXv_char3[0] = A13097BarDGFOndo ;
            GXv_char2[0] = Gx_msg ;
            new app.pprc179(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
            tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
            tdigbar_impl.this.AV33Clicod = GXv_int7[0] ;
            tdigbar_impl.this.AV34DisArtcod = GXv_char9[0] ;
            tdigbar_impl.this.A13094BarDGDibCl = GXv_char8[0] ;
            tdigbar_impl.this.A13095BarDGDibIn = GXv_int5[0] ;
            tdigbar_impl.this.A13096BarDGComb = GXv_char4[0] ;
            tdigbar_impl.this.A13097BarDGFOndo = GXv_char3[0] ;
            tdigbar_impl.this.Gx_msg = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         }
         if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(Gx_msg, 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* After */ && isIns( )  )
         {
            GXv_char10[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char9[0] = A130BarCodPar ;
            GXv_char8[0] = A13094BarDGDibCl ;
            GXv_int5[0] = A13095BarDGDibIn ;
            GXv_char4[0] = A13096BarDGComb ;
            GXv_char3[0] = A13097BarDGFOndo ;
            GXv_char2[0] = Gx_msg ;
            new app.pprc187(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
            tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
            tdigbar_impl.this.A129BarCod = GXv_int7[0] ;
            tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
            tdigbar_impl.this.A130BarCodPar = GXv_char9[0] ;
            tdigbar_impl.this.A13094BarDGDibCl = GXv_char8[0] ;
            tdigbar_impl.this.A13095BarDGDibIn = GXv_int5[0] ;
            tdigbar_impl.this.A13096BarDGComb = GXv_char4[0] ;
            tdigbar_impl.this.A13097BarDGFOndo = GXv_char3[0] ;
            tdigbar_impl.this.Gx_msg = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         }
         if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
         {
            GXCCtl = "BARDGFONDO_" + sGXsfl_50_idx ;
            httpContext.GX_msglist.addItem(Gx_msg, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarDGFOndo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void endLevel1MO1793( )
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

   public void scanStart1MO1793( )
   {
      /* Scan By routine */
      /* Using cursor T01MO85 */
      pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1793 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound1793 = (short)(1) ;
         A13093BarDGLin = T01MO85_A13093BarDGLin[0] ;
         A13094BarDGDibCl = T01MO85_A13094BarDGDibCl[0] ;
         A13095BarDGDibIn = T01MO85_A13095BarDGDibIn[0] ;
         A13096BarDGComb = T01MO85_A13096BarDGComb[0] ;
         A13097BarDGFOndo = T01MO85_A13097BarDGFOndo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MO1793( )
   {
      /* Scan next routine */
      pr_default.readNext(83);
      RcdFound1793 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound1793 = (short)(1) ;
         A13093BarDGLin = T01MO85_A13093BarDGLin[0] ;
         A13094BarDGDibCl = T01MO85_A13094BarDGDibCl[0] ;
         A13095BarDGDibIn = T01MO85_A13095BarDGDibIn[0] ;
         A13096BarDGComb = T01MO85_A13096BarDGComb[0] ;
         A13097BarDGFOndo = T01MO85_A13097BarDGFOndo[0] ;
      }
   }

   public void scanEnd1MO1793( )
   {
      pr_default.close(83);
   }

   public void afterConfirm1MO1793( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MO1793( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MO1793( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MO1793( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MO1793( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MO1793( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MO1793( )
   {
      edtBarDGLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGDibCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibCl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGDibIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibIn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGComb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGComb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGFOndo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGFOndo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGFOndo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGObs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGPzs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGMts_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGAncho_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGAncho_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGAncho_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGEstad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGEstad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGEstad_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1MO1793( )
   {
   }

   public void send_integrity_lvl_hashes1MO12( )
   {
   }

   public void subsflControlProps_501793( )
   {
      edtavnRcdDeleted_1793_Internalname = "vNRCDDELETED_1793_"+sGXsfl_50_idx ;
      edtBarDGLin_Internalname = "BARDGLIN_"+sGXsfl_50_idx ;
      edtBarDGDibCl_Internalname = "BARDGDIBCL_"+sGXsfl_50_idx ;
      edtBarDGDibIn_Internalname = "BARDGDIBIN_"+sGXsfl_50_idx ;
      edtBarDGComb_Internalname = "BARDGCOMB_"+sGXsfl_50_idx ;
      edtBarDGFOndo_Internalname = "BARDGFONDO_"+sGXsfl_50_idx ;
      edtBarDGObs_Internalname = "BARDGOBS_"+sGXsfl_50_idx ;
      edtBarDGPzs_Internalname = "BARDGPZS_"+sGXsfl_50_idx ;
      edtBarDGMts_Internalname = "BARDGMTS_"+sGXsfl_50_idx ;
      edtBarDGAncho_Internalname = "BARDGANCHO_"+sGXsfl_50_idx ;
      edtBarDGEstad_Internalname = "BARDGESTAD_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501793( )
   {
      edtavnRcdDeleted_1793_Internalname = "vNRCDDELETED_1793_"+sGXsfl_50_fel_idx ;
      edtBarDGLin_Internalname = "BARDGLIN_"+sGXsfl_50_fel_idx ;
      edtBarDGDibCl_Internalname = "BARDGDIBCL_"+sGXsfl_50_fel_idx ;
      edtBarDGDibIn_Internalname = "BARDGDIBIN_"+sGXsfl_50_fel_idx ;
      edtBarDGComb_Internalname = "BARDGCOMB_"+sGXsfl_50_fel_idx ;
      edtBarDGFOndo_Internalname = "BARDGFONDO_"+sGXsfl_50_fel_idx ;
      edtBarDGObs_Internalname = "BARDGOBS_"+sGXsfl_50_fel_idx ;
      edtBarDGPzs_Internalname = "BARDGPZS_"+sGXsfl_50_fel_idx ;
      edtBarDGMts_Internalname = "BARDGMTS_"+sGXsfl_50_fel_idx ;
      edtBarDGAncho_Internalname = "BARDGANCHO_"+sGXsfl_50_fel_idx ;
      edtBarDGEstad_Internalname = "BARDGESTAD_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1MO1793( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501793( ) ;
      sendRow1MO1793( ) ;
   }

   public void sendRow1MO1793( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1793_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1793_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1793), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1793), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1793_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1793_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGLin_Internalname,GXutil.ltrim( localUtil.ntoc( A13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13093BarDGLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGDibCl_Internalname,GXutil.rtrim( A13094BarDGDibCl),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGDibCl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGDibCl_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGDibIn_Internalname,GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13095BarDGDibIn), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGDibIn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGDibIn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGComb_Internalname,GXutil.rtrim( A13096BarDGComb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGComb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGComb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGFOndo_Internalname,GXutil.rtrim( A13097BarDGFOndo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGFOndo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGFOndo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGObs_Internalname,GXutil.rtrim( A13098BarDGObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarDGPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13099BarDGPzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13099BarDGPzs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarDGMts_Enabled!=0) ? localUtil.format( A13100BarDGMts, "ZZZZZ9.99") : localUtil.format( A13100BarDGMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGAncho_Internalname,GXutil.ltrim( localUtil.ntoc( A13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarDGAncho_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13101BarDGAncho), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13101BarDGAncho), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGAncho_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGAncho_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1793_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDGEstad_Internalname,GXutil.ltrim( localUtil.ntoc( A13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarDGEstad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13132BarDGEstad), "9") : localUtil.format( DecimalUtil.doubleToDec(A13132BarDGEstad), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDGEstad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDGEstad_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1MO1793( ) ;
      GXCCtl = "Z13093BarDGLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13093BarDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13094BarDGDibCl_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13094BarDGDibCl));
      GXCCtl = "Z13095BarDGDibIn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13095BarDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13096BarDGComb_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13096BarDGComb));
      GXCCtl = "Z13097BarDGFOndo_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13097BarDGFOndo));
      GXCCtl = "Z13132BarDGEstad_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13132BarDGEstad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13098BarDGObs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13098BarDGObs));
      GXCCtl = "Z13099BarDGPzs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13099BarDGPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13100BarDGMts_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13100BarDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13101BarDGAncho_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13101BarDGAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1793_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1793_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1793_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1793, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLICOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDISARTCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34DisArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1793_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1793_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGDIBCL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGDIBIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibIn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGCOMB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGFONDO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGFOndo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGPZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGMTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGANCHO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGAncho_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDGESTAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGEstad_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1MO1793( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501793( ) ;
      edtavnRcdDeleted_1793_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1793_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGDibCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGDIBCL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGDibIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGDIBIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGCOMB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGFOndo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGFONDO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGPZS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGMTS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGAncho_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGANCHO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDGEstad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDGESTAD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1793_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1793_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1793");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1793_Internalname ;
         wbErr = true ;
         nRcdDeleted_1793 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1793 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1793_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARDGLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGLin_Internalname ;
         wbErr = true ;
         A13093BarDGLin = (byte)(0) ;
      }
      else
      {
         A13093BarDGLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13094BarDGDibCl = httpContext.cgiGet( edtBarDGDibCl_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARDGDIBIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGDibIn_Internalname ;
         wbErr = true ;
         A13095BarDGDibIn = 0 ;
      }
      else
      {
         A13095BarDGDibIn = (int)(localUtil.ctol( httpContext.cgiGet( edtBarDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13096BarDGComb = httpContext.cgiGet( edtBarDGComb_Internalname) ;
      A13097BarDGFOndo = httpContext.cgiGet( edtBarDGFOndo_Internalname) ;
      A13098BarDGObs = httpContext.cgiGet( edtBarDGObs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARDGPZS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGPzs_Internalname ;
         wbErr = true ;
         A13099BarDGPzs = (short)(0) ;
      }
      else
      {
         A13099BarDGPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtBarDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarDGMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarDGMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARDGMTS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGMts_Internalname ;
         wbErr = true ;
         A13100BarDGMts = DecimalUtil.ZERO ;
      }
      else
      {
         A13100BarDGMts = localUtil.ctond( httpContext.cgiGet( edtBarDGMts_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARDGANCHO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGAncho_Internalname ;
         wbErr = true ;
         A13101BarDGAncho = (short)(0) ;
      }
      else
      {
         A13101BarDGAncho = (short)(localUtil.ctol( httpContext.cgiGet( edtBarDGAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDGEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARDGESTAD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGEstad_Internalname ;
         wbErr = true ;
         A13132BarDGEstad = (byte)(0) ;
      }
      else
      {
         A13132BarDGEstad = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarDGEstad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z13093BarDGLin_" + sGXsfl_50_idx ;
      Z13093BarDGLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13094BarDGDibCl_" + sGXsfl_50_idx ;
      Z13094BarDGDibCl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13095BarDGDibIn_" + sGXsfl_50_idx ;
      Z13095BarDGDibIn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13096BarDGComb_" + sGXsfl_50_idx ;
      Z13096BarDGComb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13097BarDGFOndo_" + sGXsfl_50_idx ;
      Z13097BarDGFOndo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13132BarDGEstad_" + sGXsfl_50_idx ;
      Z13132BarDGEstad = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13098BarDGObs_" + sGXsfl_50_idx ;
      Z13098BarDGObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13099BarDGPzs_" + sGXsfl_50_idx ;
      Z13099BarDGPzs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13100BarDGMts_" + sGXsfl_50_idx ;
      Z13100BarDGMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13101BarDGAncho_" + sGXsfl_50_idx ;
      Z13101BarDGAncho = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1793_" + sGXsfl_50_idx ;
      nRcdDeleted_1793 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1793_" + sGXsfl_50_idx ;
      nRcdExists_1793 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1793_" + sGXsfl_50_idx ;
      nIsMod_1793 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarDGFOndo_Enabled = edtBarDGFOndo_Enabled ;
      defedtBarDGComb_Enabled = edtBarDGComb_Enabled ;
      defedtBarDGDibIn_Enabled = edtBarDGDibIn_Enabled ;
      defedtBarDGDibCl_Enabled = edtBarDGDibCl_Enabled ;
      defedtBarDGLin_Enabled = edtBarDGLin_Enabled ;
   }

   public void confirmValues1MO0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501793( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501793( ) ;
         httpContext.changePostValue( "Z13093BarDGLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13093BarDGLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13093BarDGLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13094BarDGDibCl_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13094BarDGDibCl_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13094BarDGDibCl_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13095BarDGDibIn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13095BarDGDibIn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13095BarDGDibIn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13096BarDGComb_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13096BarDGComb_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13096BarDGComb_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13097BarDGFOndo_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13097BarDGFOndo_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13097BarDGFOndo_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13132BarDGEstad_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13132BarDGEstad_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13132BarDGEstad_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13098BarDGObs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13098BarDGObs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13098BarDGObs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13099BarDGPzs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13099BarDGPzs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13099BarDGPzs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13100BarDGMts_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13100BarDGMts_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13100BarDGMts_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13101BarDGAncho_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13101BarDGAncho_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13101BarDGAncho_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdigbar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Clicod","DisArtcod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDIGBAR");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdigbar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13092BarDGUltLi", GXutil.ltrim( localUtil.ntoc( Z13092BarDGUltLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13092BarDGUltLi", GXutil.ltrim( localUtil.ntoc( O13092BarDGUltLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCOD", GXutil.rtrim( AV34DisArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
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
      return formatLink("app.tdigbar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Clicod","DisArtcod"})  ;
   }

   public String getPgmname( )
   {
      return "TDIGBAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIBUJOS y COMINACIONES DIGITAL", "") ;
   }

   public void initializeNonKey1MO12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A13092BarDGUltLi = (byte)(0) ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O13092BarDGUltLi = A13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z13092BarDGUltLi = (byte)(0) ;
      Z252CliCod = 0 ;
   }

   public void initAll1MO12( )
   {
      initializeNonKey1MO12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1MO1793( )
   {
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A13098BarDGObs = "" ;
      A13099BarDGPzs = (short)(0) ;
      A13100BarDGMts = DecimalUtil.ZERO ;
      A13101BarDGAncho = (short)(0) ;
      A13132BarDGEstad = (byte)(0) ;
      Z13132BarDGEstad = (byte)(0) ;
      Z13098BarDGObs = "" ;
      Z13099BarDGPzs = (short)(0) ;
      Z13100BarDGMts = DecimalUtil.ZERO ;
      Z13101BarDGAncho = (short)(0) ;
   }

   public void initAll1MO1793( )
   {
      A13093BarDGLin = (byte)(0) ;
      A13094BarDGDibCl = "" ;
      A13095BarDGDibIn = 0 ;
      A13096BarDGComb = "" ;
      A13097BarDGFOndo = "" ;
      initializeNonKey1MO1793( ) ;
   }

   public void standaloneModalInsert1MO1793( )
   {
      A13092BarDGUltLi = i13092BarDGUltLi ;
      n13092BarDGUltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13092BarDGUltLi), 2, 0));
      A13132BarDGEstad = i13132BarDGEstad ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415103762", true, true);
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
      httpContext.AddJavascriptSource("tdigbar.js", "?202682415103763", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1793( )
   {
      edtBarDGFOndo_Enabled = defedtBarDGFOndo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGFOndo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGFOndo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGComb_Enabled = defedtBarDGComb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGComb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGDibIn_Enabled = defedtBarDGDibIn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibIn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGDibCl_Enabled = defedtBarDGDibCl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGDibCl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDGLin_Enabled = defedtBarDGLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDGLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1793, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1793_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13093BarDGLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13094BarDGDibCl));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGDibIn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13096BarDGComb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13097BarDGFOndo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGFOndo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13098BarDGObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13099BarDGPzs, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13100BarDGMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13101BarDGAncho, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGAncho_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13132BarDGEstad, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDGEstad_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarDGUltLi_Internalname = "BARDGULTLI" ;
      edtavnRcdDeleted_1793_Internalname = "vNRCDDELETED_1793" ;
      edtBarDGLin_Internalname = "BARDGLIN" ;
      edtBarDGDibCl_Internalname = "BARDGDIBCL" ;
      edtBarDGDibIn_Internalname = "BARDGDIBIN" ;
      edtBarDGComb_Internalname = "BARDGCOMB" ;
      edtBarDGFOndo_Internalname = "BARDGFONDO" ;
      edtBarDGObs_Internalname = "BARDGOBS" ;
      edtBarDGPzs_Internalname = "BARDGPZS" ;
      edtBarDGMts_Internalname = "BARDGMTS" ;
      edtBarDGAncho_Internalname = "BARDGANCHO" ;
      edtBarDGEstad_Internalname = "BARDGESTAD" ;
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
      Form.setCaption( httpContext.getMessage( "DIBUJOS y COMINACIONES DIGITAL", "") );
      edtBarDGEstad_Jsonclick = "" ;
      edtBarDGAncho_Jsonclick = "" ;
      edtBarDGMts_Jsonclick = "" ;
      edtBarDGPzs_Jsonclick = "" ;
      edtBarDGObs_Jsonclick = "" ;
      edtBarDGFOndo_Jsonclick = "" ;
      edtBarDGComb_Jsonclick = "" ;
      edtBarDGDibIn_Jsonclick = "" ;
      edtBarDGDibCl_Jsonclick = "" ;
      edtBarDGLin_Jsonclick = "" ;
      edtavnRcdDeleted_1793_Jsonclick = "" ;
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
      edtBarDGEstad_Enabled = 1 ;
      edtBarDGAncho_Enabled = 1 ;
      edtBarDGMts_Enabled = 1 ;
      edtBarDGPzs_Enabled = 1 ;
      edtBarDGObs_Enabled = 1 ;
      edtBarDGFOndo_Enabled = 1 ;
      edtBarDGComb_Enabled = 1 ;
      edtBarDGDibIn_Enabled = 1 ;
      edtBarDGDibCl_Enabled = 1 ;
      edtBarDGLin_Enabled = 1 ;
      edtavnRcdDeleted_1793_Enabled = 1 ;
      edtBarDGUltLi_Jsonclick = "" ;
      edtBarDGUltLi_Backcolor = (int)(0xFFFFFF) ;
      edtBarDGUltLi_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void xc_7_1MO1793( String Gx_mode ,
                             String A396EmprCod ,
                             int AV33Clicod ,
                             String AV34DisArtcod ,
                             String A13094BarDGDibCl ,
                             int A13095BarDGDibIn ,
                             String A13096BarDGComb ,
                             String A13097BarDGFOndo ,
                             String Gx_msg )
   {
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = AV33Clicod ;
         GXv_char9[0] = AV34DisArtcod ;
         GXv_char8[0] = A13094BarDGDibCl ;
         GXv_int5[0] = A13095BarDGDibIn ;
         GXv_char4[0] = A13096BarDGComb ;
         GXv_char3[0] = A13097BarDGFOndo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char10[0] ;
         AV33Clicod = GXv_int7[0] ;
         AV34DisArtcod = GXv_char9[0] ;
         A13094BarDGDibCl = GXv_char8[0] ;
         A13095BarDGDibIn = GXv_int5[0] ;
         A13096BarDGComb = GXv_char4[0] ;
         A13097BarDGFOndo = GXv_char3[0] ;
         Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34DisArtcod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13094BarDGDibCl))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13096BarDGComb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13097BarDGFOndo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_9_1MO1793( String Gx_mode ,
                             String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A13094BarDGDibCl ,
                             int A13095BarDGDibIn ,
                             String A13096BarDGComb ,
                             String A13097BarDGFOndo ,
                             String Gx_msg )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char9[0] = A130BarCodPar ;
         GXv_char8[0] = A13094BarDGDibCl ;
         GXv_int5[0] = A13095BarDGDibIn ;
         GXv_char4[0] = A13096BarDGComb ;
         GXv_char3[0] = A13097BarDGFOndo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc187(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char10[0] ;
         A129BarCod = GXv_int7[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char9[0] ;
         A13094BarDGDibCl = GXv_char8[0] ;
         A13095BarDGDibIn = GXv_int5[0] ;
         A13096BarDGComb = GXv_char4[0] ;
         A13097BarDGFOndo = GXv_char3[0] ;
         Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13094BarDGDibCl))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13096BarDGComb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13097BarDGFOndo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
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
      subsflControlProps_501793( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1MO1793( ) ;
         standaloneModal1MO1793( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1MO1793( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501793( ) ;
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
      /* Using cursor T01MO86 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(84) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MO86_A407EmprNom[0] ;
      n407EmprNom = T01MO86_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(84);
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

   public void valid_Barcodpar( )
   {
      n13092BarDGUltLi = false ;
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13092BarDGUltLi", GXutil.ltrim( localUtil.ntoc( A13092BarDGUltLi, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13092BarDGUltLi", GXutil.ltrim( localUtil.ntoc( Z13092BarDGUltLi, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "O13092BarDGUltLi", GXutil.ltrim( localUtil.ntoc( O13092BarDGUltLi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bardgfondo( )
   {
      n130BarCodPar = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n396EmprCod = false ;
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = AV33Clicod ;
         GXv_char9[0] = AV34DisArtcod ;
         GXv_char8[0] = A13094BarDGDibCl ;
         GXv_int5[0] = A13095BarDGDibIn ;
         GXv_char4[0] = A13096BarDGComb ;
         GXv_char3[0] = A13097BarDGFOndo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdigbar_impl.this.AV33Clicod = GXv_int7[0] ;
         AV33Clicod = this.AV33Clicod ;
         tdigbar_impl.this.AV34DisArtcod = GXv_char9[0] ;
         AV34DisArtcod = this.AV34DisArtcod ;
         tdigbar_impl.this.A13094BarDGDibCl = GXv_char8[0] ;
         A13094BarDGDibCl = this.A13094BarDGDibCl ;
         tdigbar_impl.this.A13095BarDGDibIn = GXv_int5[0] ;
         A13095BarDGDibIn = this.A13095BarDGDibIn ;
         tdigbar_impl.this.A13096BarDGComb = GXv_char4[0] ;
         A13096BarDGComb = this.A13096BarDGComb ;
         tdigbar_impl.this.A13097BarDGFOndo = GXv_char3[0] ;
         A13097BarDGFOndo = this.A13097BarDGFOndo ;
         tdigbar_impl.this.Gx_msg = GXv_char2[0] ;
         Gx_msg = this.Gx_msg ;
      }
      if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "BARDGFONDO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGFOndo_Internalname ;
      }
      if ( true /* After */ && isIns( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char9[0] = A130BarCodPar ;
         GXv_char8[0] = A13094BarDGDibCl ;
         GXv_int5[0] = A13095BarDGDibIn ;
         GXv_char4[0] = A13096BarDGComb ;
         GXv_char3[0] = A13097BarDGFOndo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc187(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6, GXv_char9, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         tdigbar_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdigbar_impl.this.A129BarCod = GXv_int7[0] ;
         A129BarCod = this.A129BarCod ;
         tdigbar_impl.this.A132BarCodReo = GXv_int6[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tdigbar_impl.this.A130BarCodPar = GXv_char9[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tdigbar_impl.this.A13094BarDGDibCl = GXv_char8[0] ;
         A13094BarDGDibCl = this.A13094BarDGDibCl ;
         tdigbar_impl.this.A13095BarDGDibIn = GXv_int5[0] ;
         A13095BarDGDibIn = this.A13095BarDGDibIn ;
         tdigbar_impl.this.A13096BarDGComb = GXv_char4[0] ;
         A13096BarDGComb = this.A13096BarDGComb ;
         tdigbar_impl.this.A13097BarDGFOndo = GXv_char3[0] ;
         A13097BarDGFOndo = this.A13097BarDGFOndo ;
         tdigbar_impl.this.Gx_msg = GXv_char2[0] ;
         Gx_msg = this.Gx_msg ;
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "BARDGFONDO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarDGFOndo_Internalname ;
      }
      if ( (GXutil.strcmp("", A13097BarDGFOndo)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fondo", ""), 0, "BARDGFONDO");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", GXutil.rtrim( AV34DisArtcod));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A13094BarDGDibCl", GXutil.rtrim( A13094BarDGDibCl));
      httpContext.ajax_rsp_assign_attri("", false, "A13095BarDGDibIn", GXutil.ltrim( localUtil.ntoc( A13095BarDGDibIn, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13096BarDGComb", GXutil.rtrim( A13096BarDGComb));
      httpContext.ajax_rsp_assign_attri("", false, "A13097BarDGFOndo", GXutil.rtrim( A13097BarDGFOndo));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121MO2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13092BarDGUltLi',fld:'BARDGULTLI',pic:'Z9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13092BarDGUltLi',fld:'BARDGULTLI',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z407EmprNom'},{av:'Z13092BarDGUltLi'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'O13092BarDGUltLi'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARDGULTLI","{handler:'valid_Bardgultli',iparms:[]");
      setEventMetadata("VALID_BARDGULTLI",",oparms:[]}");
      setEventMetadata("VALID_BARDGLIN","{handler:'valid_Bardglin',iparms:[]");
      setEventMetadata("VALID_BARDGLIN",",oparms:[]}");
      setEventMetadata("VALID_BARDGDIBCL","{handler:'valid_Bardgdibcl',iparms:[]");
      setEventMetadata("VALID_BARDGDIBCL",",oparms:[]}");
      setEventMetadata("VALID_BARDGDIBIN","{handler:'valid_Bardgdibin',iparms:[]");
      setEventMetadata("VALID_BARDGDIBIN",",oparms:[]}");
      setEventMetadata("VALID_BARDGCOMB","{handler:'valid_Bardgcomb',iparms:[]");
      setEventMetadata("VALID_BARDGCOMB",",oparms:[]}");
      setEventMetadata("VALID_BARDGFONDO","{handler:'valid_Bardgfondo',iparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'A13094BarDGDibCl',fld:'BARDGDIBCL',pic:''},{av:'A13095BarDGDibIn',fld:'BARDGDIBIN',pic:'ZZZZZZZ9'},{av:'A13096BarDGComb',fld:'BARDGCOMB',pic:''},{av:'A13097BarDGFOndo',fld:'BARDGFONDO',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VALID_BARDGFONDO",",oparms:[{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A13094BarDGDibCl',fld:'BARDGDIBCL',pic:''},{av:'A13095BarDGDibIn',fld:'BARDGDIBIN',pic:'ZZZZZZZ9'},{av:'A13096BarDGComb',fld:'BARDGCOMB',pic:''},{av:'A13097BarDGFOndo',fld:'BARDGFONDO',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Bardgestad',iparms:[]");
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
      pr_default.close(84);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV34DisArtcod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z13094BarDGDibCl = "" ;
      Z13096BarDGComb = "" ;
      Z13097BarDGFOndo = "" ;
      Z13098BarDGObs = "" ;
      Z13100BarDGMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV34DisArtcod = "" ;
      A13094BarDGDibCl = "" ;
      A13096BarDGComb = "" ;
      A13097BarDGFOndo = "" ;
      Gx_msg = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1793 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      A13098BarDGObs = "" ;
      A13100BarDGMts = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01MO6_A407EmprNom = new String[] {""} ;
      T01MO6_n407EmprNom = new boolean[] {false} ;
      T01MO7_A252CliCod = new int[1] ;
      T01MO7_n252CliCod = new boolean[] {false} ;
      T01MO7_A365DisDes = new String[] {""} ;
      T01MO8_A361DisCod = new int[1] ;
      T01MO8_A2759BarMaqGru = new String[] {""} ;
      T01MO8_A129BarCod = new int[1] ;
      T01MO8_n129BarCod = new boolean[] {false} ;
      T01MO8_A132BarCodReo = new byte[1] ;
      T01MO8_n132BarCodReo = new boolean[] {false} ;
      T01MO8_A130BarCodPar = new String[] {""} ;
      T01MO8_n130BarCodPar = new boolean[] {false} ;
      T01MO8_A180BarMaqCod = new String[] {""} ;
      T01MO8_A407EmprNom = new String[] {""} ;
      T01MO8_n407EmprNom = new boolean[] {false} ;
      T01MO8_A13092BarDGUltLi = new byte[1] ;
      T01MO8_n13092BarDGUltLi = new boolean[] {false} ;
      T01MO8_A252CliCod = new int[1] ;
      T01MO8_n252CliCod = new boolean[] {false} ;
      T01MO8_A365DisDes = new String[] {""} ;
      T01MO8_A396EmprCod = new String[] {""} ;
      T01MO8_n396EmprCod = new boolean[] {false} ;
      T01MO9_A396EmprCod = new String[] {""} ;
      T01MO9_n396EmprCod = new boolean[] {false} ;
      T01MO9_A129BarCod = new int[1] ;
      T01MO9_n129BarCod = new boolean[] {false} ;
      T01MO9_A132BarCodReo = new byte[1] ;
      T01MO9_n132BarCodReo = new boolean[] {false} ;
      T01MO9_A130BarCodPar = new String[] {""} ;
      T01MO9_n130BarCodPar = new boolean[] {false} ;
      T01MO5_A361DisCod = new int[1] ;
      T01MO5_A2759BarMaqGru = new String[] {""} ;
      T01MO5_A129BarCod = new int[1] ;
      T01MO5_n129BarCod = new boolean[] {false} ;
      T01MO5_A132BarCodReo = new byte[1] ;
      T01MO5_n132BarCodReo = new boolean[] {false} ;
      T01MO5_A130BarCodPar = new String[] {""} ;
      T01MO5_n130BarCodPar = new boolean[] {false} ;
      T01MO5_A180BarMaqCod = new String[] {""} ;
      T01MO5_A13092BarDGUltLi = new byte[1] ;
      T01MO5_n13092BarDGUltLi = new boolean[] {false} ;
      T01MO5_A396EmprCod = new String[] {""} ;
      T01MO5_n396EmprCod = new boolean[] {false} ;
      T01MO5_A252CliCod = new int[1] ;
      T01MO5_n252CliCod = new boolean[] {false} ;
      T01MO5_A365DisDes = new String[] {""} ;
      T01MO10_A396EmprCod = new String[] {""} ;
      T01MO10_n396EmprCod = new boolean[] {false} ;
      T01MO10_A129BarCod = new int[1] ;
      T01MO10_n129BarCod = new boolean[] {false} ;
      T01MO10_A132BarCodReo = new byte[1] ;
      T01MO10_n132BarCodReo = new boolean[] {false} ;
      T01MO10_A130BarCodPar = new String[] {""} ;
      T01MO10_n130BarCodPar = new boolean[] {false} ;
      T01MO11_A396EmprCod = new String[] {""} ;
      T01MO11_n396EmprCod = new boolean[] {false} ;
      T01MO11_A129BarCod = new int[1] ;
      T01MO11_n129BarCod = new boolean[] {false} ;
      T01MO11_A132BarCodReo = new byte[1] ;
      T01MO11_n132BarCodReo = new boolean[] {false} ;
      T01MO11_A130BarCodPar = new String[] {""} ;
      T01MO11_n130BarCodPar = new boolean[] {false} ;
      T01MO4_A361DisCod = new int[1] ;
      T01MO4_A2759BarMaqGru = new String[] {""} ;
      T01MO4_A129BarCod = new int[1] ;
      T01MO4_n129BarCod = new boolean[] {false} ;
      T01MO4_A132BarCodReo = new byte[1] ;
      T01MO4_n132BarCodReo = new boolean[] {false} ;
      T01MO4_A130BarCodPar = new String[] {""} ;
      T01MO4_n130BarCodPar = new boolean[] {false} ;
      T01MO4_A180BarMaqCod = new String[] {""} ;
      T01MO4_A13092BarDGUltLi = new byte[1] ;
      T01MO4_n13092BarDGUltLi = new boolean[] {false} ;
      T01MO4_A396EmprCod = new String[] {""} ;
      T01MO4_n396EmprCod = new boolean[] {false} ;
      T01MO4_A252CliCod = new int[1] ;
      T01MO4_n252CliCod = new boolean[] {false} ;
      T01MO4_A365DisDes = new String[] {""} ;
      T01MO15_A14681MRPrId = new long[1] ;
      T01MO16_A5921XCjaDis = new String[] {""} ;
      T01MO16_A5922XCjaCod = new long[1] ;
      T01MO17_A396EmprCod = new String[] {""} ;
      T01MO17_n396EmprCod = new boolean[] {false} ;
      T01MO17_A129BarCod = new int[1] ;
      T01MO17_n129BarCod = new boolean[] {false} ;
      T01MO17_A132BarCodReo = new byte[1] ;
      T01MO17_n132BarCodReo = new boolean[] {false} ;
      T01MO17_A130BarCodPar = new String[] {""} ;
      T01MO17_n130BarCodPar = new boolean[] {false} ;
      T01MO17_A14152MEnvOrd = new short[1] ;
      T01MO18_A396EmprCod = new String[] {""} ;
      T01MO18_n396EmprCod = new boolean[] {false} ;
      T01MO18_A129BarCod = new int[1] ;
      T01MO18_n129BarCod = new boolean[] {false} ;
      T01MO18_A132BarCodReo = new byte[1] ;
      T01MO18_n132BarCodReo = new boolean[] {false} ;
      T01MO18_A130BarCodPar = new String[] {""} ;
      T01MO18_n130BarCodPar = new boolean[] {false} ;
      T01MO18_A13905BarTraID = new String[] {""} ;
      T01MO19_A396EmprCod = new String[] {""} ;
      T01MO19_n396EmprCod = new boolean[] {false} ;
      T01MO19_A11917Ebd_numero = new int[1] ;
      T01MO20_A396EmprCod = new String[] {""} ;
      T01MO20_n396EmprCod = new boolean[] {false} ;
      T01MO20_A11898Prd_numero = new int[1] ;
      T01MO21_A396EmprCod = new String[] {""} ;
      T01MO21_n396EmprCod = new boolean[] {false} ;
      T01MO21_A11849Cte_numero = new int[1] ;
      T01MO22_A396EmprCod = new String[] {""} ;
      T01MO22_n396EmprCod = new boolean[] {false} ;
      T01MO22_A11791Ap_numero = new int[1] ;
      T01MO23_A396EmprCod = new String[] {""} ;
      T01MO23_n396EmprCod = new boolean[] {false} ;
      T01MO23_A3985CalBarCod = new int[1] ;
      T01MO23_A3986CalBarCodR = new byte[1] ;
      T01MO23_A3987CalBarCodP = new String[] {""} ;
      T01MO24_A396EmprCod = new String[] {""} ;
      T01MO24_n396EmprCod = new boolean[] {false} ;
      T01MO24_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01MO24_A652OpeCod = new int[1] ;
      T01MO25_A396EmprCod = new String[] {""} ;
      T01MO25_n396EmprCod = new boolean[] {false} ;
      T01MO25_A129BarCod = new int[1] ;
      T01MO25_n129BarCod = new boolean[] {false} ;
      T01MO25_A132BarCodReo = new byte[1] ;
      T01MO25_n132BarCodReo = new boolean[] {false} ;
      T01MO25_A130BarCodPar = new String[] {""} ;
      T01MO25_n130BarCodPar = new boolean[] {false} ;
      T01MO25_A4118tinagrcod = new int[1] ;
      T01MO25_A4119tinagrreo = new byte[1] ;
      T01MO25_A4120tinagrpar = new String[] {""} ;
      T01MO26_A396EmprCod = new String[] {""} ;
      T01MO26_n396EmprCod = new boolean[] {false} ;
      T01MO26_A129BarCod = new int[1] ;
      T01MO26_n129BarCod = new boolean[] {false} ;
      T01MO26_A132BarCodReo = new byte[1] ;
      T01MO26_n132BarCodReo = new boolean[] {false} ;
      T01MO26_A130BarCodPar = new String[] {""} ;
      T01MO26_n130BarCodPar = new boolean[] {false} ;
      T01MO26_A4080estagrcod = new int[1] ;
      T01MO26_A4081estagrreo = new byte[1] ;
      T01MO26_A4082estagrpar = new String[] {""} ;
      T01MO27_A396EmprCod = new String[] {""} ;
      T01MO27_n396EmprCod = new boolean[] {false} ;
      T01MO27_A129BarCod = new int[1] ;
      T01MO27_n129BarCod = new boolean[] {false} ;
      T01MO27_A132BarCodReo = new byte[1] ;
      T01MO27_n132BarCodReo = new boolean[] {false} ;
      T01MO27_A130BarCodPar = new String[] {""} ;
      T01MO27_n130BarCodPar = new boolean[] {false} ;
      T01MO27_A4075recestncol = new byte[1] ;
      T01MO27_A4076recestnpro = new byte[1] ;
      T01MO28_A396EmprCod = new String[] {""} ;
      T01MO28_n396EmprCod = new boolean[] {false} ;
      T01MO28_A602MaqCod = new String[] {""} ;
      T01MO28_A1142MaqFCod = new String[] {""} ;
      T01MO28_A3068PlaEtaOrd = new short[1] ;
      T01MO28_A3069PlaEtaOrdA = new byte[1] ;
      T01MO28_A129BarCod = new int[1] ;
      T01MO28_n129BarCod = new boolean[] {false} ;
      T01MO28_A132BarCodReo = new byte[1] ;
      T01MO28_n132BarCodReo = new boolean[] {false} ;
      T01MO28_A130BarCodPar = new String[] {""} ;
      T01MO28_n130BarCodPar = new boolean[] {false} ;
      T01MO29_A396EmprCod = new String[] {""} ;
      T01MO29_n396EmprCod = new boolean[] {false} ;
      T01MO29_A129BarCod = new int[1] ;
      T01MO29_n129BarCod = new boolean[] {false} ;
      T01MO29_A132BarCodReo = new byte[1] ;
      T01MO29_n132BarCodReo = new boolean[] {false} ;
      T01MO29_A130BarCodPar = new String[] {""} ;
      T01MO29_n130BarCodPar = new boolean[] {false} ;
      T01MO29_A4846BarAudLin = new short[1] ;
      T01MO30_A396EmprCod = new String[] {""} ;
      T01MO30_n396EmprCod = new boolean[] {false} ;
      T01MO30_A129BarCod = new int[1] ;
      T01MO30_n129BarCod = new boolean[] {false} ;
      T01MO30_A132BarCodReo = new byte[1] ;
      T01MO30_n132BarCodReo = new boolean[] {false} ;
      T01MO30_A130BarCodPar = new String[] {""} ;
      T01MO30_n130BarCodPar = new boolean[] {false} ;
      T01MO30_A3940BarEnsLin = new short[1] ;
      T01MO31_A396EmprCod = new String[] {""} ;
      T01MO31_n396EmprCod = new boolean[] {false} ;
      T01MO31_A129BarCod = new int[1] ;
      T01MO31_n129BarCod = new boolean[] {false} ;
      T01MO31_A132BarCodReo = new byte[1] ;
      T01MO31_n132BarCodReo = new boolean[] {false} ;
      T01MO31_A130BarCodPar = new String[] {""} ;
      T01MO31_n130BarCodPar = new boolean[] {false} ;
      T01MO31_A3384RefBarCod = new int[1] ;
      T01MO31_A3385RefBarReo = new byte[1] ;
      T01MO31_A3386RefBarPar = new String[] {""} ;
      T01MO32_A396EmprCod = new String[] {""} ;
      T01MO32_n396EmprCod = new boolean[] {false} ;
      T01MO32_A10914SolSalCod = new int[1] ;
      T01MO33_A396EmprCod = new String[] {""} ;
      T01MO33_n396EmprCod = new boolean[] {false} ;
      T01MO33_A10364Ph_numero = new int[1] ;
      T01MO34_A396EmprCod = new String[] {""} ;
      T01MO34_n396EmprCod = new boolean[] {false} ;
      T01MO34_A129BarCod = new int[1] ;
      T01MO34_n129BarCod = new boolean[] {false} ;
      T01MO34_A132BarCodReo = new byte[1] ;
      T01MO34_n132BarCodReo = new boolean[] {false} ;
      T01MO34_A130BarCodPar = new String[] {""} ;
      T01MO34_n130BarCodPar = new boolean[] {false} ;
      T01MO34_A10197ProEspCod = new String[] {""} ;
      T01MO35_A396EmprCod = new String[] {""} ;
      T01MO35_n396EmprCod = new boolean[] {false} ;
      T01MO35_A129BarCod = new int[1] ;
      T01MO35_n129BarCod = new boolean[] {false} ;
      T01MO35_A132BarCodReo = new byte[1] ;
      T01MO35_n132BarCodReo = new boolean[] {false} ;
      T01MO35_A130BarCodPar = new String[] {""} ;
      T01MO35_n130BarCodPar = new boolean[] {false} ;
      T01MO35_A5322Dp_Nrecep = new int[1] ;
      T01MO36_A396EmprCod = new String[] {""} ;
      T01MO36_n396EmprCod = new boolean[] {false} ;
      T01MO36_A129BarCod = new int[1] ;
      T01MO36_n129BarCod = new boolean[] {false} ;
      T01MO36_A132BarCodReo = new byte[1] ;
      T01MO36_n132BarCodReo = new boolean[] {false} ;
      T01MO36_A130BarCodPar = new String[] {""} ;
      T01MO36_n130BarCodPar = new boolean[] {false} ;
      T01MO36_A8569EntSecLn = new int[1] ;
      T01MO37_A396EmprCod = new String[] {""} ;
      T01MO37_n396EmprCod = new boolean[] {false} ;
      T01MO37_A7434PLLNro = new int[1] ;
      T01MO37_A7443LPLNro = new short[1] ;
      T01MO37_A7459CPLCom = new short[1] ;
      T01MO37_A129BarCod = new int[1] ;
      T01MO37_n129BarCod = new boolean[] {false} ;
      T01MO37_A132BarCodReo = new byte[1] ;
      T01MO37_n132BarCodReo = new boolean[] {false} ;
      T01MO37_A130BarCodPar = new String[] {""} ;
      T01MO37_n130BarCodPar = new boolean[] {false} ;
      T01MO38_A396EmprCod = new String[] {""} ;
      T01MO38_n396EmprCod = new boolean[] {false} ;
      T01MO38_A7145OSSCod = new int[1] ;
      T01MO39_A396EmprCod = new String[] {""} ;
      T01MO39_n396EmprCod = new boolean[] {false} ;
      T01MO39_A7049OGSCod = new int[1] ;
      T01MO40_A396EmprCod = new String[] {""} ;
      T01MO40_n396EmprCod = new boolean[] {false} ;
      T01MO40_A129BarCod = new int[1] ;
      T01MO40_n129BarCod = new boolean[] {false} ;
      T01MO40_A132BarCodReo = new byte[1] ;
      T01MO40_n132BarCodReo = new boolean[] {false} ;
      T01MO40_A130BarCodPar = new String[] {""} ;
      T01MO40_n130BarCodPar = new boolean[] {false} ;
      T01MO40_A6031Ac_Barcod = new int[1] ;
      T01MO40_A6032Ac_BarReo = new byte[1] ;
      T01MO40_A6033Ac_BarPar = new String[] {""} ;
      T01MO41_A396EmprCod = new String[] {""} ;
      T01MO41_n396EmprCod = new boolean[] {false} ;
      T01MO41_A129BarCod = new int[1] ;
      T01MO41_n129BarCod = new boolean[] {false} ;
      T01MO41_A132BarCodReo = new byte[1] ;
      T01MO41_n132BarCodReo = new boolean[] {false} ;
      T01MO41_A130BarCodPar = new String[] {""} ;
      T01MO41_n130BarCodPar = new boolean[] {false} ;
      T01MO41_A5908PartPal = new int[1] ;
      T01MO42_A396EmprCod = new String[] {""} ;
      T01MO42_n396EmprCod = new boolean[] {false} ;
      T01MO42_A129BarCod = new int[1] ;
      T01MO42_n129BarCod = new boolean[] {false} ;
      T01MO42_A132BarCodReo = new byte[1] ;
      T01MO42_n132BarCodReo = new boolean[] {false} ;
      T01MO42_A130BarCodPar = new String[] {""} ;
      T01MO42_n130BarCodPar = new boolean[] {false} ;
      T01MO42_A2524DisComLin = new byte[1] ;
      T01MO42_A1056DisComCod = new String[] {""} ;
      T01MO42_A1032FonCod = new String[] {""} ;
      T01MO43_A396EmprCod = new String[] {""} ;
      T01MO43_n396EmprCod = new boolean[] {false} ;
      T01MO43_A1736AlbExtCod = new long[1] ;
      T01MO43_A129BarCod = new int[1] ;
      T01MO43_n129BarCod = new boolean[] {false} ;
      T01MO43_A132BarCodReo = new byte[1] ;
      T01MO43_n132BarCodReo = new boolean[] {false} ;
      T01MO43_A130BarCodPar = new String[] {""} ;
      T01MO43_n130BarCodPar = new boolean[] {false} ;
      T01MO44_A396EmprCod = new String[] {""} ;
      T01MO44_n396EmprCod = new boolean[] {false} ;
      T01MO44_A129BarCod = new int[1] ;
      T01MO44_n129BarCod = new boolean[] {false} ;
      T01MO44_A132BarCodReo = new byte[1] ;
      T01MO44_n132BarCodReo = new boolean[] {false} ;
      T01MO44_A130BarCodPar = new String[] {""} ;
      T01MO44_n130BarCodPar = new boolean[] {false} ;
      T01MO44_A3753BarFoaCod = new int[1] ;
      T01MO44_A3754BarFoaReo = new byte[1] ;
      T01MO44_A3755BarFoaPar = new String[] {""} ;
      T01MO45_A396EmprCod = new String[] {""} ;
      T01MO45_n396EmprCod = new boolean[] {false} ;
      T01MO45_A129BarCod = new int[1] ;
      T01MO45_n129BarCod = new boolean[] {false} ;
      T01MO45_A132BarCodReo = new byte[1] ;
      T01MO45_n132BarCodReo = new boolean[] {false} ;
      T01MO45_A130BarCodPar = new String[] {""} ;
      T01MO45_n130BarCodPar = new boolean[] {false} ;
      T01MO45_A3747BarPegCod = new int[1] ;
      T01MO45_A3748BarPegReo = new byte[1] ;
      T01MO45_A3749BarPegPar = new String[] {""} ;
      T01MO46_A396EmprCod = new String[] {""} ;
      T01MO46_n396EmprCod = new boolean[] {false} ;
      T01MO46_A3253SolTraCod = new int[1] ;
      T01MO47_A396EmprCod = new String[] {""} ;
      T01MO47_n396EmprCod = new boolean[] {false} ;
      T01MO47_A3235SolSubCod = new int[1] ;
      T01MO48_A396EmprCod = new String[] {""} ;
      T01MO48_n396EmprCod = new boolean[] {false} ;
      T01MO48_A3218SolLuzCod = new int[1] ;
      T01MO49_A396EmprCod = new String[] {""} ;
      T01MO49_n396EmprCod = new boolean[] {false} ;
      T01MO49_A3196SolFriCod = new int[1] ;
      T01MO50_A396EmprCod = new String[] {""} ;
      T01MO50_n396EmprCod = new boolean[] {false} ;
      T01MO50_A3165SolPilCod = new int[1] ;
      T01MO51_A396EmprCod = new String[] {""} ;
      T01MO51_n396EmprCod = new boolean[] {false} ;
      T01MO51_A129BarCod = new int[1] ;
      T01MO51_n129BarCod = new boolean[] {false} ;
      T01MO51_A132BarCodReo = new byte[1] ;
      T01MO51_n132BarCodReo = new boolean[] {false} ;
      T01MO51_A130BarCodPar = new String[] {""} ;
      T01MO51_n130BarCodPar = new boolean[] {false} ;
      T01MO51_A2872HAnRLinMaq = new short[1] ;
      T01MO51_A2873HAnRLinPro = new byte[1] ;
      T01MO51_A2874HAnRLin = new short[1] ;
      T01MO51_A2875HAnNumAny = new byte[1] ;
      T01MO52_A396EmprCod = new String[] {""} ;
      T01MO52_n396EmprCod = new boolean[] {false} ;
      T01MO52_A2817PlaTer = new String[] {""} ;
      T01MO52_A2818PlaOrd = new short[1] ;
      T01MO53_A396EmprCod = new String[] {""} ;
      T01MO53_n396EmprCod = new boolean[] {false} ;
      T01MO53_A2809MetTerCod = new String[] {""} ;
      T01MO53_A129BarCod = new int[1] ;
      T01MO53_n129BarCod = new boolean[] {false} ;
      T01MO53_A132BarCodReo = new byte[1] ;
      T01MO53_n132BarCodReo = new boolean[] {false} ;
      T01MO53_A130BarCodPar = new String[] {""} ;
      T01MO53_n130BarCodPar = new boolean[] {false} ;
      T01MO54_A396EmprCod = new String[] {""} ;
      T01MO54_n396EmprCod = new boolean[] {false} ;
      T01MO54_A129BarCod = new int[1] ;
      T01MO54_n129BarCod = new boolean[] {false} ;
      T01MO54_A132BarCodReo = new byte[1] ;
      T01MO54_n132BarCodReo = new boolean[] {false} ;
      T01MO54_A130BarCodPar = new String[] {""} ;
      T01MO54_n130BarCodPar = new boolean[] {false} ;
      T01MO54_A2808RecLinMAL = new short[1] ;
      T01MO54_A1377RecNumAny = new byte[1] ;
      T01MO54_A719PrdNum = new String[] {""} ;
      T01MO55_A396EmprCod = new String[] {""} ;
      T01MO55_n396EmprCod = new boolean[] {false} ;
      T01MO55_A129BarCod = new int[1] ;
      T01MO55_n129BarCod = new boolean[] {false} ;
      T01MO55_A132BarCodReo = new byte[1] ;
      T01MO55_n132BarCodReo = new boolean[] {false} ;
      T01MO55_A130BarCodPar = new String[] {""} ;
      T01MO55_n130BarCodPar = new boolean[] {false} ;
      T01MO55_A2804RecLinMaq = new short[1] ;
      T01MO56_A396EmprCod = new String[] {""} ;
      T01MO56_n396EmprCod = new boolean[] {false} ;
      T01MO56_A2792TermiCod = new String[] {""} ;
      T01MO56_A129BarCod = new int[1] ;
      T01MO56_n129BarCod = new boolean[] {false} ;
      T01MO56_A132BarCodReo = new byte[1] ;
      T01MO56_n132BarCodReo = new boolean[] {false} ;
      T01MO56_A130BarCodPar = new String[] {""} ;
      T01MO56_n130BarCodPar = new boolean[] {false} ;
      T01MO57_A396EmprCod = new String[] {""} ;
      T01MO57_n396EmprCod = new boolean[] {false} ;
      T01MO57_A2248ManCod = new short[1] ;
      T01MO57_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01MO57_A2713RpExHdLi = new short[1] ;
      T01MO58_A396EmprCod = new String[] {""} ;
      T01MO58_n396EmprCod = new boolean[] {false} ;
      T01MO58_A2248ManCod = new short[1] ;
      T01MO58_A2689ExHdrFas = new String[] {""} ;
      T01MO58_A2692ExHdrLin = new int[1] ;
      T01MO59_A396EmprCod = new String[] {""} ;
      T01MO59_n396EmprCod = new boolean[] {false} ;
      T01MO59_A129BarCod = new int[1] ;
      T01MO59_n129BarCod = new boolean[] {false} ;
      T01MO59_A132BarCodReo = new byte[1] ;
      T01MO59_n132BarCodReo = new boolean[] {false} ;
      T01MO59_A130BarCodPar = new String[] {""} ;
      T01MO59_n130BarCodPar = new boolean[] {false} ;
      T01MO59_A2494BarDosPro = new String[] {""} ;
      T01MO59_A719PrdNum = new String[] {""} ;
      T01MO60_A396EmprCod = new String[] {""} ;
      T01MO60_n396EmprCod = new boolean[] {false} ;
      T01MO60_A602MaqCod = new String[] {""} ;
      T01MO60_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01MO60_A129BarCod = new int[1] ;
      T01MO60_n129BarCod = new boolean[] {false} ;
      T01MO60_A132BarCodReo = new byte[1] ;
      T01MO60_n132BarCodReo = new boolean[] {false} ;
      T01MO60_A130BarCodPar = new String[] {""} ;
      T01MO60_n130BarCodPar = new boolean[] {false} ;
      T01MO61_A396EmprCod = new String[] {""} ;
      T01MO61_n396EmprCod = new boolean[] {false} ;
      T01MO61_A129BarCod = new int[1] ;
      T01MO61_n129BarCod = new boolean[] {false} ;
      T01MO61_A132BarCodReo = new byte[1] ;
      T01MO61_n132BarCodReo = new boolean[] {false} ;
      T01MO61_A130BarCodPar = new String[] {""} ;
      T01MO61_n130BarCodPar = new boolean[] {false} ;
      T01MO61_A2457BarObLin = new short[1] ;
      T01MO62_A396EmprCod = new String[] {""} ;
      T01MO62_n396EmprCod = new boolean[] {false} ;
      T01MO62_A129BarCod = new int[1] ;
      T01MO62_n129BarCod = new boolean[] {false} ;
      T01MO62_A132BarCodReo = new byte[1] ;
      T01MO62_n132BarCodReo = new boolean[] {false} ;
      T01MO62_A130BarCodPar = new String[] {""} ;
      T01MO62_n130BarCodPar = new boolean[] {false} ;
      T01MO62_A2444BarEnLin = new short[1] ;
      T01MO63_A396EmprCod = new String[] {""} ;
      T01MO63_n396EmprCod = new boolean[] {false} ;
      T01MO63_A2406ExhAlbCod = new int[1] ;
      T01MO63_A129BarCod = new int[1] ;
      T01MO63_n129BarCod = new boolean[] {false} ;
      T01MO63_A132BarCodReo = new byte[1] ;
      T01MO63_n132BarCodReo = new boolean[] {false} ;
      T01MO63_A130BarCodPar = new String[] {""} ;
      T01MO63_n130BarCodPar = new boolean[] {false} ;
      T01MO64_A396EmprCod = new String[] {""} ;
      T01MO64_n396EmprCod = new boolean[] {false} ;
      T01MO64_A2253SalExtAlb = new int[1] ;
      T01MO64_A129BarCod = new int[1] ;
      T01MO64_n129BarCod = new boolean[] {false} ;
      T01MO64_A132BarCodReo = new byte[1] ;
      T01MO64_n132BarCodReo = new boolean[] {false} ;
      T01MO64_A130BarCodPar = new String[] {""} ;
      T01MO64_n130BarCodPar = new boolean[] {false} ;
      T01MO65_A396EmprCod = new String[] {""} ;
      T01MO65_n396EmprCod = new boolean[] {false} ;
      T01MO65_A30AlbProCod = new long[1] ;
      T01MO65_A129BarCod = new int[1] ;
      T01MO65_n129BarCod = new boolean[] {false} ;
      T01MO65_A132BarCodReo = new byte[1] ;
      T01MO65_n132BarCodReo = new boolean[] {false} ;
      T01MO65_A130BarCodPar = new String[] {""} ;
      T01MO65_n130BarCodPar = new boolean[] {false} ;
      T01MO66_A396EmprCod = new String[] {""} ;
      T01MO66_n396EmprCod = new boolean[] {false} ;
      T01MO66_A1348SolColCod = new int[1] ;
      T01MO67_A396EmprCod = new String[] {""} ;
      T01MO67_n396EmprCod = new boolean[] {false} ;
      T01MO67_A1333EstDimCod = new int[1] ;
      T01MO68_A396EmprCod = new String[] {""} ;
      T01MO68_n396EmprCod = new boolean[] {false} ;
      T01MO68_A1314EnsLabCod = new int[1] ;
      T01MO69_A396EmprCod = new String[] {""} ;
      T01MO69_n396EmprCod = new boolean[] {false} ;
      T01MO69_A129BarCod = new int[1] ;
      T01MO69_n129BarCod = new boolean[] {false} ;
      T01MO69_A132BarCodReo = new byte[1] ;
      T01MO69_n132BarCodReo = new boolean[] {false} ;
      T01MO69_A130BarCodPar = new String[] {""} ;
      T01MO69_n130BarCodPar = new boolean[] {false} ;
      T01MO69_A906ObsReoLin = new byte[1] ;
      T01MO70_A396EmprCod = new String[] {""} ;
      T01MO70_n396EmprCod = new boolean[] {false} ;
      T01MO70_A859CumCodCont = new int[1] ;
      T01MO71_A396EmprCod = new String[] {""} ;
      T01MO71_n396EmprCod = new boolean[] {false} ;
      T01MO71_A602MaqCod = new String[] {""} ;
      T01MO71_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01MO71_A561HisProLin = new int[1] ;
      T01MO72_A396EmprCod = new String[] {""} ;
      T01MO72_n396EmprCod = new boolean[] {false} ;
      T01MO72_A252CliCod = new int[1] ;
      T01MO72_n252CliCod = new boolean[] {false} ;
      T01MO72_A494ForSer = new String[] {""} ;
      T01MO72_A482ForColNom = new String[] {""} ;
      T01MO72_A483ForColNum = new int[1] ;
      T01MO72_A831TipColCod = new byte[1] ;
      T01MO73_A396EmprCod = new String[] {""} ;
      T01MO73_n396EmprCod = new boolean[] {false} ;
      T01MO73_A129BarCod = new int[1] ;
      T01MO73_n129BarCod = new boolean[] {false} ;
      T01MO73_A132BarCodReo = new byte[1] ;
      T01MO73_n132BarCodReo = new boolean[] {false} ;
      T01MO73_A130BarCodPar = new String[] {""} ;
      T01MO73_n130BarCodPar = new boolean[] {false} ;
      T01MO73_A200BarPieCod = new String[] {""} ;
      T01MO74_A396EmprCod = new String[] {""} ;
      T01MO74_n396EmprCod = new boolean[] {false} ;
      T01MO74_A129BarCod = new int[1] ;
      T01MO74_n129BarCod = new boolean[] {false} ;
      T01MO74_A132BarCodReo = new byte[1] ;
      T01MO74_n132BarCodReo = new boolean[] {false} ;
      T01MO74_A130BarCodPar = new String[] {""} ;
      T01MO74_n130BarCodPar = new boolean[] {false} ;
      T01MO74_A188BarNotLin = new byte[1] ;
      T01MO75_A396EmprCod = new String[] {""} ;
      T01MO75_n396EmprCod = new boolean[] {false} ;
      T01MO75_A129BarCod = new int[1] ;
      T01MO75_n129BarCod = new boolean[] {false} ;
      T01MO75_A132BarCodReo = new byte[1] ;
      T01MO75_n132BarCodReo = new boolean[] {false} ;
      T01MO75_A130BarCodPar = new String[] {""} ;
      T01MO75_n130BarCodPar = new boolean[] {false} ;
      T01MO75_A758ProCod = new String[] {""} ;
      T01MO76_A396EmprCod = new String[] {""} ;
      T01MO76_n396EmprCod = new boolean[] {false} ;
      T01MO76_A129BarCod = new int[1] ;
      T01MO76_n129BarCod = new boolean[] {false} ;
      T01MO76_A132BarCodReo = new byte[1] ;
      T01MO76_n132BarCodReo = new boolean[] {false} ;
      T01MO76_A130BarCodPar = new String[] {""} ;
      T01MO76_n130BarCodPar = new boolean[] {false} ;
      T01MO76_A119BarAgrCod = new int[1] ;
      T01MO76_A124BarAgrReo = new byte[1] ;
      T01MO76_A122BarAgrPar = new String[] {""} ;
      T01MO79_A396EmprCod = new String[] {""} ;
      T01MO79_n396EmprCod = new boolean[] {false} ;
      T01MO79_A129BarCod = new int[1] ;
      T01MO79_n129BarCod = new boolean[] {false} ;
      T01MO79_A132BarCodReo = new byte[1] ;
      T01MO79_n132BarCodReo = new boolean[] {false} ;
      T01MO79_A130BarCodPar = new String[] {""} ;
      T01MO79_n130BarCodPar = new boolean[] {false} ;
      T01MO80_A129BarCod = new int[1] ;
      T01MO80_n129BarCod = new boolean[] {false} ;
      T01MO80_A132BarCodReo = new byte[1] ;
      T01MO80_n132BarCodReo = new boolean[] {false} ;
      T01MO80_A130BarCodPar = new String[] {""} ;
      T01MO80_n130BarCodPar = new boolean[] {false} ;
      T01MO80_A13093BarDGLin = new byte[1] ;
      T01MO80_A13094BarDGDibCl = new String[] {""} ;
      T01MO80_A13095BarDGDibIn = new int[1] ;
      T01MO80_A13096BarDGComb = new String[] {""} ;
      T01MO80_A13097BarDGFOndo = new String[] {""} ;
      T01MO80_A13132BarDGEstad = new byte[1] ;
      T01MO80_A13098BarDGObs = new String[] {""} ;
      T01MO80_A13099BarDGPzs = new short[1] ;
      T01MO80_A13100BarDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MO80_A13101BarDGAncho = new short[1] ;
      T01MO80_A396EmprCod = new String[] {""} ;
      T01MO80_n396EmprCod = new boolean[] {false} ;
      T01MO81_A396EmprCod = new String[] {""} ;
      T01MO81_n396EmprCod = new boolean[] {false} ;
      T01MO81_A129BarCod = new int[1] ;
      T01MO81_n129BarCod = new boolean[] {false} ;
      T01MO81_A132BarCodReo = new byte[1] ;
      T01MO81_n132BarCodReo = new boolean[] {false} ;
      T01MO81_A130BarCodPar = new String[] {""} ;
      T01MO81_n130BarCodPar = new boolean[] {false} ;
      T01MO81_A13093BarDGLin = new byte[1] ;
      T01MO81_A13094BarDGDibCl = new String[] {""} ;
      T01MO81_A13095BarDGDibIn = new int[1] ;
      T01MO81_A13096BarDGComb = new String[] {""} ;
      T01MO81_A13097BarDGFOndo = new String[] {""} ;
      T01MO3_A129BarCod = new int[1] ;
      T01MO3_n129BarCod = new boolean[] {false} ;
      T01MO3_A132BarCodReo = new byte[1] ;
      T01MO3_n132BarCodReo = new boolean[] {false} ;
      T01MO3_A130BarCodPar = new String[] {""} ;
      T01MO3_n130BarCodPar = new boolean[] {false} ;
      T01MO3_A13093BarDGLin = new byte[1] ;
      T01MO3_A13094BarDGDibCl = new String[] {""} ;
      T01MO3_A13095BarDGDibIn = new int[1] ;
      T01MO3_A13096BarDGComb = new String[] {""} ;
      T01MO3_A13097BarDGFOndo = new String[] {""} ;
      T01MO3_A13132BarDGEstad = new byte[1] ;
      T01MO3_A13098BarDGObs = new String[] {""} ;
      T01MO3_A13099BarDGPzs = new short[1] ;
      T01MO3_A13100BarDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MO3_A13101BarDGAncho = new short[1] ;
      T01MO3_A396EmprCod = new String[] {""} ;
      T01MO3_n396EmprCod = new boolean[] {false} ;
      T01MO2_A129BarCod = new int[1] ;
      T01MO2_n129BarCod = new boolean[] {false} ;
      T01MO2_A132BarCodReo = new byte[1] ;
      T01MO2_n132BarCodReo = new boolean[] {false} ;
      T01MO2_A130BarCodPar = new String[] {""} ;
      T01MO2_n130BarCodPar = new boolean[] {false} ;
      T01MO2_A13093BarDGLin = new byte[1] ;
      T01MO2_A13094BarDGDibCl = new String[] {""} ;
      T01MO2_A13095BarDGDibIn = new int[1] ;
      T01MO2_A13096BarDGComb = new String[] {""} ;
      T01MO2_A13097BarDGFOndo = new String[] {""} ;
      T01MO2_A13132BarDGEstad = new byte[1] ;
      T01MO2_A13098BarDGObs = new String[] {""} ;
      T01MO2_A13099BarDGPzs = new short[1] ;
      T01MO2_A13100BarDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MO2_A13101BarDGAncho = new short[1] ;
      T01MO2_A396EmprCod = new String[] {""} ;
      T01MO2_n396EmprCod = new boolean[] {false} ;
      T01MO85_A396EmprCod = new String[] {""} ;
      T01MO85_n396EmprCod = new boolean[] {false} ;
      T01MO85_A129BarCod = new int[1] ;
      T01MO85_n129BarCod = new boolean[] {false} ;
      T01MO85_A132BarCodReo = new byte[1] ;
      T01MO85_n132BarCodReo = new boolean[] {false} ;
      T01MO85_A130BarCodPar = new String[] {""} ;
      T01MO85_n130BarCodPar = new boolean[] {false} ;
      T01MO85_A13093BarDGLin = new byte[1] ;
      T01MO85_A13094BarDGDibCl = new String[] {""} ;
      T01MO85_A13095BarDGDibIn = new int[1] ;
      T01MO85_A13096BarDGComb = new String[] {""} ;
      T01MO85_A13097BarDGFOndo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01MO86_A407EmprNom = new String[] {""} ;
      T01MO86_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV34DisArtcod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdigbar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdigbar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdigbar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdigbar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdigbar__default(),
         new Object[] {
             new Object[] {
            T01MO2_A129BarCod, T01MO2_A132BarCodReo, T01MO2_A130BarCodPar, T01MO2_A13093BarDGLin, T01MO2_A13094BarDGDibCl, T01MO2_A13095BarDGDibIn, T01MO2_A13096BarDGComb, T01MO2_A13097BarDGFOndo, T01MO2_A13132BarDGEstad, T01MO2_A13098BarDGObs,
            T01MO2_A13099BarDGPzs, T01MO2_A13100BarDGMts, T01MO2_A13101BarDGAncho, T01MO2_A396EmprCod
            }
            , new Object[] {
            T01MO3_A129BarCod, T01MO3_A132BarCodReo, T01MO3_A130BarCodPar, T01MO3_A13093BarDGLin, T01MO3_A13094BarDGDibCl, T01MO3_A13095BarDGDibIn, T01MO3_A13096BarDGComb, T01MO3_A13097BarDGFOndo, T01MO3_A13132BarDGEstad, T01MO3_A13098BarDGObs,
            T01MO3_A13099BarDGPzs, T01MO3_A13100BarDGMts, T01MO3_A13101BarDGAncho, T01MO3_A396EmprCod
            }
            , new Object[] {
            T01MO4_A361DisCod, T01MO4_A2759BarMaqGru, T01MO4_A129BarCod, T01MO4_A132BarCodReo, T01MO4_A130BarCodPar, T01MO4_A180BarMaqCod, T01MO4_A13092BarDGUltLi, T01MO4_n13092BarDGUltLi, T01MO4_A396EmprCod, T01MO4_A252CliCod,
            T01MO4_n252CliCod, T01MO4_A365DisDes
            }
            , new Object[] {
            T01MO5_A361DisCod, T01MO5_A2759BarMaqGru, T01MO5_A129BarCod, T01MO5_A132BarCodReo, T01MO5_A130BarCodPar, T01MO5_A180BarMaqCod, T01MO5_A13092BarDGUltLi, T01MO5_n13092BarDGUltLi, T01MO5_A396EmprCod, T01MO5_A252CliCod,
            T01MO5_n252CliCod, T01MO5_A365DisDes
            }
            , new Object[] {
            T01MO6_A407EmprNom, T01MO6_n407EmprNom
            }
            , new Object[] {
            T01MO7_A252CliCod, T01MO7_A365DisDes
            }
            , new Object[] {
            T01MO8_A361DisCod, T01MO8_A2759BarMaqGru, T01MO8_A129BarCod, T01MO8_A132BarCodReo, T01MO8_A130BarCodPar, T01MO8_A180BarMaqCod, T01MO8_A407EmprNom, T01MO8_n407EmprNom, T01MO8_A13092BarDGUltLi, T01MO8_n13092BarDGUltLi,
            T01MO8_A252CliCod, T01MO8_n252CliCod, T01MO8_A365DisDes, T01MO8_A396EmprCod
            }
            , new Object[] {
            T01MO9_A396EmprCod, T01MO9_A129BarCod, T01MO9_A132BarCodReo, T01MO9_A130BarCodPar
            }
            , new Object[] {
            T01MO10_A396EmprCod, T01MO10_A129BarCod, T01MO10_A132BarCodReo, T01MO10_A130BarCodPar
            }
            , new Object[] {
            T01MO11_A396EmprCod, T01MO11_A129BarCod, T01MO11_A132BarCodReo, T01MO11_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MO15_A14681MRPrId
            }
            , new Object[] {
            T01MO16_A5921XCjaDis, T01MO16_A5922XCjaCod
            }
            , new Object[] {
            T01MO17_A396EmprCod, T01MO17_A129BarCod, T01MO17_A132BarCodReo, T01MO17_A130BarCodPar, T01MO17_A14152MEnvOrd
            }
            , new Object[] {
            T01MO18_A396EmprCod, T01MO18_A129BarCod, T01MO18_A132BarCodReo, T01MO18_A130BarCodPar, T01MO18_A13905BarTraID
            }
            , new Object[] {
            T01MO19_A396EmprCod, T01MO19_A11917Ebd_numero
            }
            , new Object[] {
            T01MO20_A396EmprCod, T01MO20_A11898Prd_numero
            }
            , new Object[] {
            T01MO21_A396EmprCod, T01MO21_A11849Cte_numero
            }
            , new Object[] {
            T01MO22_A396EmprCod, T01MO22_A11791Ap_numero
            }
            , new Object[] {
            T01MO23_A396EmprCod, T01MO23_A3985CalBarCod, T01MO23_A3986CalBarCodR, T01MO23_A3987CalBarCodP
            }
            , new Object[] {
            T01MO24_A396EmprCod, T01MO24_A5294InPTime, T01MO24_A652OpeCod
            }
            , new Object[] {
            T01MO25_A396EmprCod, T01MO25_A129BarCod, T01MO25_A132BarCodReo, T01MO25_A130BarCodPar, T01MO25_A4118tinagrcod, T01MO25_A4119tinagrreo, T01MO25_A4120tinagrpar
            }
            , new Object[] {
            T01MO26_A396EmprCod, T01MO26_A129BarCod, T01MO26_A132BarCodReo, T01MO26_A130BarCodPar, T01MO26_A4080estagrcod, T01MO26_A4081estagrreo, T01MO26_A4082estagrpar
            }
            , new Object[] {
            T01MO27_A396EmprCod, T01MO27_A129BarCod, T01MO27_A132BarCodReo, T01MO27_A130BarCodPar, T01MO27_A4075recestncol, T01MO27_A4076recestnpro
            }
            , new Object[] {
            T01MO28_A396EmprCod, T01MO28_A602MaqCod, T01MO28_A1142MaqFCod, T01MO28_A3068PlaEtaOrd, T01MO28_A3069PlaEtaOrdA, T01MO28_A129BarCod, T01MO28_A132BarCodReo, T01MO28_A130BarCodPar
            }
            , new Object[] {
            T01MO29_A396EmprCod, T01MO29_A129BarCod, T01MO29_A132BarCodReo, T01MO29_A130BarCodPar, T01MO29_A4846BarAudLin
            }
            , new Object[] {
            T01MO30_A396EmprCod, T01MO30_A129BarCod, T01MO30_A132BarCodReo, T01MO30_A130BarCodPar, T01MO30_A3940BarEnsLin
            }
            , new Object[] {
            T01MO31_A396EmprCod, T01MO31_A129BarCod, T01MO31_A132BarCodReo, T01MO31_A130BarCodPar, T01MO31_A3384RefBarCod, T01MO31_A3385RefBarReo, T01MO31_A3386RefBarPar
            }
            , new Object[] {
            T01MO32_A396EmprCod, T01MO32_A10914SolSalCod
            }
            , new Object[] {
            T01MO33_A396EmprCod, T01MO33_A10364Ph_numero
            }
            , new Object[] {
            T01MO34_A396EmprCod, T01MO34_A129BarCod, T01MO34_A132BarCodReo, T01MO34_A130BarCodPar, T01MO34_A10197ProEspCod
            }
            , new Object[] {
            T01MO35_A396EmprCod, T01MO35_A129BarCod, T01MO35_A132BarCodReo, T01MO35_A130BarCodPar, T01MO35_A5322Dp_Nrecep
            }
            , new Object[] {
            T01MO36_A396EmprCod, T01MO36_A129BarCod, T01MO36_A132BarCodReo, T01MO36_A130BarCodPar, T01MO36_A8569EntSecLn
            }
            , new Object[] {
            T01MO37_A396EmprCod, T01MO37_A7434PLLNro, T01MO37_A7443LPLNro, T01MO37_A7459CPLCom, T01MO37_A129BarCod, T01MO37_A132BarCodReo, T01MO37_A130BarCodPar
            }
            , new Object[] {
            T01MO38_A396EmprCod, T01MO38_A7145OSSCod
            }
            , new Object[] {
            T01MO39_A396EmprCod, T01MO39_A7049OGSCod
            }
            , new Object[] {
            T01MO40_A396EmprCod, T01MO40_A129BarCod, T01MO40_A132BarCodReo, T01MO40_A130BarCodPar, T01MO40_A6031Ac_Barcod, T01MO40_A6032Ac_BarReo, T01MO40_A6033Ac_BarPar
            }
            , new Object[] {
            T01MO41_A396EmprCod, T01MO41_A129BarCod, T01MO41_A132BarCodReo, T01MO41_A130BarCodPar, T01MO41_A5908PartPal
            }
            , new Object[] {
            T01MO42_A396EmprCod, T01MO42_A129BarCod, T01MO42_A132BarCodReo, T01MO42_A130BarCodPar, T01MO42_A2524DisComLin, T01MO42_A1056DisComCod, T01MO42_A1032FonCod
            }
            , new Object[] {
            T01MO43_A396EmprCod, T01MO43_A1736AlbExtCod, T01MO43_A129BarCod, T01MO43_A132BarCodReo, T01MO43_A130BarCodPar
            }
            , new Object[] {
            T01MO44_A396EmprCod, T01MO44_A129BarCod, T01MO44_A132BarCodReo, T01MO44_A130BarCodPar, T01MO44_A3753BarFoaCod, T01MO44_A3754BarFoaReo, T01MO44_A3755BarFoaPar
            }
            , new Object[] {
            T01MO45_A396EmprCod, T01MO45_A129BarCod, T01MO45_A132BarCodReo, T01MO45_A130BarCodPar, T01MO45_A3747BarPegCod, T01MO45_A3748BarPegReo, T01MO45_A3749BarPegPar
            }
            , new Object[] {
            T01MO46_A396EmprCod, T01MO46_A3253SolTraCod
            }
            , new Object[] {
            T01MO47_A396EmprCod, T01MO47_A3235SolSubCod
            }
            , new Object[] {
            T01MO48_A396EmprCod, T01MO48_A3218SolLuzCod
            }
            , new Object[] {
            T01MO49_A396EmprCod, T01MO49_A3196SolFriCod
            }
            , new Object[] {
            T01MO50_A396EmprCod, T01MO50_A3165SolPilCod
            }
            , new Object[] {
            T01MO51_A396EmprCod, T01MO51_A129BarCod, T01MO51_A132BarCodReo, T01MO51_A130BarCodPar, T01MO51_A2872HAnRLinMaq, T01MO51_A2873HAnRLinPro, T01MO51_A2874HAnRLin, T01MO51_A2875HAnNumAny
            }
            , new Object[] {
            T01MO52_A396EmprCod, T01MO52_A2817PlaTer, T01MO52_A2818PlaOrd
            }
            , new Object[] {
            T01MO53_A396EmprCod, T01MO53_A2809MetTerCod, T01MO53_A129BarCod, T01MO53_A132BarCodReo, T01MO53_A130BarCodPar
            }
            , new Object[] {
            T01MO54_A396EmprCod, T01MO54_A129BarCod, T01MO54_A132BarCodReo, T01MO54_A130BarCodPar, T01MO54_A2808RecLinMAL, T01MO54_A1377RecNumAny, T01MO54_A719PrdNum
            }
            , new Object[] {
            T01MO55_A396EmprCod, T01MO55_A129BarCod, T01MO55_A132BarCodReo, T01MO55_A130BarCodPar, T01MO55_A2804RecLinMaq
            }
            , new Object[] {
            T01MO56_A396EmprCod, T01MO56_A2792TermiCod, T01MO56_A129BarCod, T01MO56_A132BarCodReo, T01MO56_A130BarCodPar
            }
            , new Object[] {
            T01MO57_A396EmprCod, T01MO57_A2248ManCod, T01MO57_A2711RpExHdFe, T01MO57_A2713RpExHdLi
            }
            , new Object[] {
            T01MO58_A396EmprCod, T01MO58_A2248ManCod, T01MO58_A2689ExHdrFas, T01MO58_A2692ExHdrLin
            }
            , new Object[] {
            T01MO59_A396EmprCod, T01MO59_A129BarCod, T01MO59_A132BarCodReo, T01MO59_A130BarCodPar, T01MO59_A2494BarDosPro, T01MO59_A719PrdNum
            }
            , new Object[] {
            T01MO60_A396EmprCod, T01MO60_A602MaqCod, T01MO60_A2461PlaFecTin, T01MO60_A129BarCod, T01MO60_A132BarCodReo, T01MO60_A130BarCodPar
            }
            , new Object[] {
            T01MO61_A396EmprCod, T01MO61_A129BarCod, T01MO61_A132BarCodReo, T01MO61_A130BarCodPar, T01MO61_A2457BarObLin
            }
            , new Object[] {
            T01MO62_A396EmprCod, T01MO62_A129BarCod, T01MO62_A132BarCodReo, T01MO62_A130BarCodPar, T01MO62_A2444BarEnLin
            }
            , new Object[] {
            T01MO63_A396EmprCod, T01MO63_A2406ExhAlbCod, T01MO63_A129BarCod, T01MO63_A132BarCodReo, T01MO63_A130BarCodPar
            }
            , new Object[] {
            T01MO64_A396EmprCod, T01MO64_A2253SalExtAlb, T01MO64_A129BarCod, T01MO64_A132BarCodReo, T01MO64_A130BarCodPar
            }
            , new Object[] {
            T01MO65_A396EmprCod, T01MO65_A30AlbProCod, T01MO65_A129BarCod, T01MO65_A132BarCodReo, T01MO65_A130BarCodPar
            }
            , new Object[] {
            T01MO66_A396EmprCod, T01MO66_A1348SolColCod
            }
            , new Object[] {
            T01MO67_A396EmprCod, T01MO67_A1333EstDimCod
            }
            , new Object[] {
            T01MO68_A396EmprCod, T01MO68_A1314EnsLabCod
            }
            , new Object[] {
            T01MO69_A396EmprCod, T01MO69_A129BarCod, T01MO69_A132BarCodReo, T01MO69_A130BarCodPar, T01MO69_A906ObsReoLin
            }
            , new Object[] {
            T01MO70_A396EmprCod, T01MO70_A859CumCodCont
            }
            , new Object[] {
            T01MO71_A396EmprCod, T01MO71_A602MaqCod, T01MO71_A558HisProFec, T01MO71_A561HisProLin
            }
            , new Object[] {
            T01MO72_A396EmprCod, T01MO72_A252CliCod, T01MO72_A494ForSer, T01MO72_A482ForColNom, T01MO72_A483ForColNum, T01MO72_A831TipColCod
            }
            , new Object[] {
            T01MO73_A396EmprCod, T01MO73_A129BarCod, T01MO73_A132BarCodReo, T01MO73_A130BarCodPar, T01MO73_A200BarPieCod
            }
            , new Object[] {
            T01MO74_A396EmprCod, T01MO74_A129BarCod, T01MO74_A132BarCodReo, T01MO74_A130BarCodPar, T01MO74_A188BarNotLin
            }
            , new Object[] {
            T01MO75_A396EmprCod, T01MO75_A129BarCod, T01MO75_A132BarCodReo, T01MO75_A130BarCodPar, T01MO75_A758ProCod
            }
            , new Object[] {
            T01MO76_A396EmprCod, T01MO76_A129BarCod, T01MO76_A132BarCodReo, T01MO76_A130BarCodPar, T01MO76_A119BarAgrCod, T01MO76_A124BarAgrReo, T01MO76_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MO79_A396EmprCod, T01MO79_A129BarCod, T01MO79_A132BarCodReo, T01MO79_A130BarCodPar
            }
            , new Object[] {
            T01MO80_A129BarCod, T01MO80_A132BarCodReo, T01MO80_A130BarCodPar, T01MO80_A13093BarDGLin, T01MO80_A13094BarDGDibCl, T01MO80_A13095BarDGDibIn, T01MO80_A13096BarDGComb, T01MO80_A13097BarDGFOndo, T01MO80_A13132BarDGEstad, T01MO80_A13098BarDGObs,
            T01MO80_A13099BarDGPzs, T01MO80_A13100BarDGMts, T01MO80_A13101BarDGAncho, T01MO80_A396EmprCod
            }
            , new Object[] {
            T01MO81_A396EmprCod, T01MO81_A129BarCod, T01MO81_A132BarCodReo, T01MO81_A130BarCodPar, T01MO81_A13093BarDGLin, T01MO81_A13094BarDGDibCl, T01MO81_A13095BarDGDibIn, T01MO81_A13096BarDGComb, T01MO81_A13097BarDGFOndo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MO85_A396EmprCod, T01MO85_A129BarCod, T01MO85_A132BarCodReo, T01MO85_A130BarCodPar, T01MO85_A13093BarDGLin, T01MO85_A13094BarDGDibCl, T01MO85_A13095BarDGDibIn, T01MO85_A13096BarDGComb, T01MO85_A13097BarDGFOndo
            }
            , new Object[] {
            T01MO86_A407EmprNom, T01MO86_n407EmprNom
            }
         }
      );
      Z130BarCodPar = "" ;
      n130BarCodPar = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      Z132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      Z129BarCod = 0 ;
      n129BarCod = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
      AV37Pgmname = "TDIGBAR" ;
      Z13132BarDGEstad = (byte)(0) ;
      A13132BarDGEstad = (byte)(0) ;
      i13132BarDGEstad = (byte)(0) ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z13092BarDGUltLi ;
   private byte O13092BarDGUltLi ;
   private byte Z13093BarDGLin ;
   private byte Z13132BarDGEstad ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A13092BarDGUltLi ;
   private byte Gx_BScreen ;
   private byte B13092BarDGUltLi ;
   private byte s13092BarDGUltLi ;
   private byte A13093BarDGLin ;
   private byte A13132BarDGEstad ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13092BarDGUltLi ;
   private byte i13132BarDGEstad ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ13092BarDGUltLi ;
   private byte ZO13092BarDGUltLi ;
   private byte GXv_int6[] ;
   private short Z13099BarDGPzs ;
   private short Z13101BarDGAncho ;
   private short nRcdDeleted_1793 ;
   private short nRcdExists_1793 ;
   private short nIsMod_1793 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1793 ;
   private short RcdFound1793 ;
   private short nBlankRcdUsr1793 ;
   private short A13099BarDGPzs ;
   private short A13101BarDGAncho ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1793 ;
   private int wcpOA129BarCod ;
   private int wcpOAV33Clicod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z13095BarDGDibIn ;
   private int AV33Clicod ;
   private int A13095BarDGDibIn ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarDGUltLi_Enabled ;
   private int edtavnRcdDeleted_1793_Enabled ;
   private int edtBarDGLin_Enabled ;
   private int edtBarDGDibCl_Enabled ;
   private int edtBarDGDibIn_Enabled ;
   private int edtBarDGComb_Enabled ;
   private int edtBarDGFOndo_Enabled ;
   private int edtBarDGObs_Enabled ;
   private int edtBarDGPzs_Enabled ;
   private int edtBarDGMts_Enabled ;
   private int edtBarDGAncho_Enabled ;
   private int edtBarDGEstad_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarDGFOndo_Enabled ;
   private int defedtBarDGComb_Enabled ;
   private int defedtBarDGDibIn_Enabled ;
   private int defedtBarDGDibCl_Enabled ;
   private int defedtBarDGLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarDGUltLi_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int ZV33Clicod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13100BarDGMts ;
   private java.math.BigDecimal A13100BarDGMts ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV34DisArtcod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z13094BarDGDibCl ;
   private String Z13096BarDGComb ;
   private String Z13097BarDGFOndo ;
   private String Z13098BarDGObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV34DisArtcod ;
   private String A13094BarDGDibCl ;
   private String A13096BarDGComb ;
   private String A13097BarDGFOndo ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_50_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarDGUltLi_Internalname ;
   private String edtBarDGUltLi_Jsonclick ;
   private String sMode1793 ;
   private String edtavnRcdDeleted_1793_Internalname ;
   private String edtBarDGLin_Internalname ;
   private String edtBarDGDibCl_Internalname ;
   private String edtBarDGDibIn_Internalname ;
   private String edtBarDGComb_Internalname ;
   private String edtBarDGFOndo_Internalname ;
   private String edtBarDGObs_Internalname ;
   private String edtBarDGPzs_Internalname ;
   private String edtBarDGMts_Internalname ;
   private String edtBarDGAncho_Internalname ;
   private String edtBarDGEstad_Internalname ;
   private String GX_FocusControl ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String AV37Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A13098BarDGObs ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1793_Jsonclick ;
   private String edtBarDGLin_Jsonclick ;
   private String edtBarDGDibCl_Jsonclick ;
   private String edtBarDGDibIn_Jsonclick ;
   private String edtBarDGComb_Jsonclick ;
   private String edtBarDGFOndo_Jsonclick ;
   private String edtBarDGObs_Jsonclick ;
   private String edtBarDGPzs_Jsonclick ;
   private String edtBarDGMts_Jsonclick ;
   private String edtBarDGAncho_Jsonclick ;
   private String edtBarDGEstad_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV34DisArtcod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean n13092BarDGUltLi ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01MO6_A407EmprNom ;
   private boolean[] T01MO6_n407EmprNom ;
   private int[] T01MO7_A252CliCod ;
   private boolean[] T01MO7_n252CliCod ;
   private String[] T01MO7_A365DisDes ;
   private int[] T01MO8_A361DisCod ;
   private String[] T01MO8_A2759BarMaqGru ;
   private int[] T01MO8_A129BarCod ;
   private boolean[] T01MO8_n129BarCod ;
   private byte[] T01MO8_A132BarCodReo ;
   private boolean[] T01MO8_n132BarCodReo ;
   private String[] T01MO8_A130BarCodPar ;
   private boolean[] T01MO8_n130BarCodPar ;
   private String[] T01MO8_A180BarMaqCod ;
   private String[] T01MO8_A407EmprNom ;
   private boolean[] T01MO8_n407EmprNom ;
   private byte[] T01MO8_A13092BarDGUltLi ;
   private boolean[] T01MO8_n13092BarDGUltLi ;
   private int[] T01MO8_A252CliCod ;
   private boolean[] T01MO8_n252CliCod ;
   private String[] T01MO8_A365DisDes ;
   private String[] T01MO8_A396EmprCod ;
   private boolean[] T01MO8_n396EmprCod ;
   private String[] T01MO9_A396EmprCod ;
   private boolean[] T01MO9_n396EmprCod ;
   private int[] T01MO9_A129BarCod ;
   private boolean[] T01MO9_n129BarCod ;
   private byte[] T01MO9_A132BarCodReo ;
   private boolean[] T01MO9_n132BarCodReo ;
   private String[] T01MO9_A130BarCodPar ;
   private boolean[] T01MO9_n130BarCodPar ;
   private int[] T01MO5_A361DisCod ;
   private String[] T01MO5_A2759BarMaqGru ;
   private int[] T01MO5_A129BarCod ;
   private boolean[] T01MO5_n129BarCod ;
   private byte[] T01MO5_A132BarCodReo ;
   private boolean[] T01MO5_n132BarCodReo ;
   private String[] T01MO5_A130BarCodPar ;
   private boolean[] T01MO5_n130BarCodPar ;
   private String[] T01MO5_A180BarMaqCod ;
   private byte[] T01MO5_A13092BarDGUltLi ;
   private boolean[] T01MO5_n13092BarDGUltLi ;
   private String[] T01MO5_A396EmprCod ;
   private boolean[] T01MO5_n396EmprCod ;
   private int[] T01MO5_A252CliCod ;
   private boolean[] T01MO5_n252CliCod ;
   private String[] T01MO5_A365DisDes ;
   private String[] T01MO10_A396EmprCod ;
   private boolean[] T01MO10_n396EmprCod ;
   private int[] T01MO10_A129BarCod ;
   private boolean[] T01MO10_n129BarCod ;
   private byte[] T01MO10_A132BarCodReo ;
   private boolean[] T01MO10_n132BarCodReo ;
   private String[] T01MO10_A130BarCodPar ;
   private boolean[] T01MO10_n130BarCodPar ;
   private String[] T01MO11_A396EmprCod ;
   private boolean[] T01MO11_n396EmprCod ;
   private int[] T01MO11_A129BarCod ;
   private boolean[] T01MO11_n129BarCod ;
   private byte[] T01MO11_A132BarCodReo ;
   private boolean[] T01MO11_n132BarCodReo ;
   private String[] T01MO11_A130BarCodPar ;
   private boolean[] T01MO11_n130BarCodPar ;
   private int[] T01MO4_A361DisCod ;
   private String[] T01MO4_A2759BarMaqGru ;
   private int[] T01MO4_A129BarCod ;
   private boolean[] T01MO4_n129BarCod ;
   private byte[] T01MO4_A132BarCodReo ;
   private boolean[] T01MO4_n132BarCodReo ;
   private String[] T01MO4_A130BarCodPar ;
   private boolean[] T01MO4_n130BarCodPar ;
   private String[] T01MO4_A180BarMaqCod ;
   private byte[] T01MO4_A13092BarDGUltLi ;
   private boolean[] T01MO4_n13092BarDGUltLi ;
   private String[] T01MO4_A396EmprCod ;
   private boolean[] T01MO4_n396EmprCod ;
   private int[] T01MO4_A252CliCod ;
   private boolean[] T01MO4_n252CliCod ;
   private String[] T01MO4_A365DisDes ;
   private long[] T01MO15_A14681MRPrId ;
   private String[] T01MO16_A5921XCjaDis ;
   private long[] T01MO16_A5922XCjaCod ;
   private String[] T01MO17_A396EmprCod ;
   private boolean[] T01MO17_n396EmprCod ;
   private int[] T01MO17_A129BarCod ;
   private boolean[] T01MO17_n129BarCod ;
   private byte[] T01MO17_A132BarCodReo ;
   private boolean[] T01MO17_n132BarCodReo ;
   private String[] T01MO17_A130BarCodPar ;
   private boolean[] T01MO17_n130BarCodPar ;
   private short[] T01MO17_A14152MEnvOrd ;
   private String[] T01MO18_A396EmprCod ;
   private boolean[] T01MO18_n396EmprCod ;
   private int[] T01MO18_A129BarCod ;
   private boolean[] T01MO18_n129BarCod ;
   private byte[] T01MO18_A132BarCodReo ;
   private boolean[] T01MO18_n132BarCodReo ;
   private String[] T01MO18_A130BarCodPar ;
   private boolean[] T01MO18_n130BarCodPar ;
   private String[] T01MO18_A13905BarTraID ;
   private String[] T01MO19_A396EmprCod ;
   private boolean[] T01MO19_n396EmprCod ;
   private int[] T01MO19_A11917Ebd_numero ;
   private String[] T01MO20_A396EmprCod ;
   private boolean[] T01MO20_n396EmprCod ;
   private int[] T01MO20_A11898Prd_numero ;
   private String[] T01MO21_A396EmprCod ;
   private boolean[] T01MO21_n396EmprCod ;
   private int[] T01MO21_A11849Cte_numero ;
   private String[] T01MO22_A396EmprCod ;
   private boolean[] T01MO22_n396EmprCod ;
   private int[] T01MO22_A11791Ap_numero ;
   private String[] T01MO23_A396EmprCod ;
   private boolean[] T01MO23_n396EmprCod ;
   private int[] T01MO23_A3985CalBarCod ;
   private byte[] T01MO23_A3986CalBarCodR ;
   private String[] T01MO23_A3987CalBarCodP ;
   private String[] T01MO24_A396EmprCod ;
   private boolean[] T01MO24_n396EmprCod ;
   private java.util.Date[] T01MO24_A5294InPTime ;
   private int[] T01MO24_A652OpeCod ;
   private String[] T01MO25_A396EmprCod ;
   private boolean[] T01MO25_n396EmprCod ;
   private int[] T01MO25_A129BarCod ;
   private boolean[] T01MO25_n129BarCod ;
   private byte[] T01MO25_A132BarCodReo ;
   private boolean[] T01MO25_n132BarCodReo ;
   private String[] T01MO25_A130BarCodPar ;
   private boolean[] T01MO25_n130BarCodPar ;
   private int[] T01MO25_A4118tinagrcod ;
   private byte[] T01MO25_A4119tinagrreo ;
   private String[] T01MO25_A4120tinagrpar ;
   private String[] T01MO26_A396EmprCod ;
   private boolean[] T01MO26_n396EmprCod ;
   private int[] T01MO26_A129BarCod ;
   private boolean[] T01MO26_n129BarCod ;
   private byte[] T01MO26_A132BarCodReo ;
   private boolean[] T01MO26_n132BarCodReo ;
   private String[] T01MO26_A130BarCodPar ;
   private boolean[] T01MO26_n130BarCodPar ;
   private int[] T01MO26_A4080estagrcod ;
   private byte[] T01MO26_A4081estagrreo ;
   private String[] T01MO26_A4082estagrpar ;
   private String[] T01MO27_A396EmprCod ;
   private boolean[] T01MO27_n396EmprCod ;
   private int[] T01MO27_A129BarCod ;
   private boolean[] T01MO27_n129BarCod ;
   private byte[] T01MO27_A132BarCodReo ;
   private boolean[] T01MO27_n132BarCodReo ;
   private String[] T01MO27_A130BarCodPar ;
   private boolean[] T01MO27_n130BarCodPar ;
   private byte[] T01MO27_A4075recestncol ;
   private byte[] T01MO27_A4076recestnpro ;
   private String[] T01MO28_A396EmprCod ;
   private boolean[] T01MO28_n396EmprCod ;
   private String[] T01MO28_A602MaqCod ;
   private String[] T01MO28_A1142MaqFCod ;
   private short[] T01MO28_A3068PlaEtaOrd ;
   private byte[] T01MO28_A3069PlaEtaOrdA ;
   private int[] T01MO28_A129BarCod ;
   private boolean[] T01MO28_n129BarCod ;
   private byte[] T01MO28_A132BarCodReo ;
   private boolean[] T01MO28_n132BarCodReo ;
   private String[] T01MO28_A130BarCodPar ;
   private boolean[] T01MO28_n130BarCodPar ;
   private String[] T01MO29_A396EmprCod ;
   private boolean[] T01MO29_n396EmprCod ;
   private int[] T01MO29_A129BarCod ;
   private boolean[] T01MO29_n129BarCod ;
   private byte[] T01MO29_A132BarCodReo ;
   private boolean[] T01MO29_n132BarCodReo ;
   private String[] T01MO29_A130BarCodPar ;
   private boolean[] T01MO29_n130BarCodPar ;
   private short[] T01MO29_A4846BarAudLin ;
   private String[] T01MO30_A396EmprCod ;
   private boolean[] T01MO30_n396EmprCod ;
   private int[] T01MO30_A129BarCod ;
   private boolean[] T01MO30_n129BarCod ;
   private byte[] T01MO30_A132BarCodReo ;
   private boolean[] T01MO30_n132BarCodReo ;
   private String[] T01MO30_A130BarCodPar ;
   private boolean[] T01MO30_n130BarCodPar ;
   private short[] T01MO30_A3940BarEnsLin ;
   private String[] T01MO31_A396EmprCod ;
   private boolean[] T01MO31_n396EmprCod ;
   private int[] T01MO31_A129BarCod ;
   private boolean[] T01MO31_n129BarCod ;
   private byte[] T01MO31_A132BarCodReo ;
   private boolean[] T01MO31_n132BarCodReo ;
   private String[] T01MO31_A130BarCodPar ;
   private boolean[] T01MO31_n130BarCodPar ;
   private int[] T01MO31_A3384RefBarCod ;
   private byte[] T01MO31_A3385RefBarReo ;
   private String[] T01MO31_A3386RefBarPar ;
   private String[] T01MO32_A396EmprCod ;
   private boolean[] T01MO32_n396EmprCod ;
   private int[] T01MO32_A10914SolSalCod ;
   private String[] T01MO33_A396EmprCod ;
   private boolean[] T01MO33_n396EmprCod ;
   private int[] T01MO33_A10364Ph_numero ;
   private String[] T01MO34_A396EmprCod ;
   private boolean[] T01MO34_n396EmprCod ;
   private int[] T01MO34_A129BarCod ;
   private boolean[] T01MO34_n129BarCod ;
   private byte[] T01MO34_A132BarCodReo ;
   private boolean[] T01MO34_n132BarCodReo ;
   private String[] T01MO34_A130BarCodPar ;
   private boolean[] T01MO34_n130BarCodPar ;
   private String[] T01MO34_A10197ProEspCod ;
   private String[] T01MO35_A396EmprCod ;
   private boolean[] T01MO35_n396EmprCod ;
   private int[] T01MO35_A129BarCod ;
   private boolean[] T01MO35_n129BarCod ;
   private byte[] T01MO35_A132BarCodReo ;
   private boolean[] T01MO35_n132BarCodReo ;
   private String[] T01MO35_A130BarCodPar ;
   private boolean[] T01MO35_n130BarCodPar ;
   private int[] T01MO35_A5322Dp_Nrecep ;
   private String[] T01MO36_A396EmprCod ;
   private boolean[] T01MO36_n396EmprCod ;
   private int[] T01MO36_A129BarCod ;
   private boolean[] T01MO36_n129BarCod ;
   private byte[] T01MO36_A132BarCodReo ;
   private boolean[] T01MO36_n132BarCodReo ;
   private String[] T01MO36_A130BarCodPar ;
   private boolean[] T01MO36_n130BarCodPar ;
   private int[] T01MO36_A8569EntSecLn ;
   private String[] T01MO37_A396EmprCod ;
   private boolean[] T01MO37_n396EmprCod ;
   private int[] T01MO37_A7434PLLNro ;
   private short[] T01MO37_A7443LPLNro ;
   private short[] T01MO37_A7459CPLCom ;
   private int[] T01MO37_A129BarCod ;
   private boolean[] T01MO37_n129BarCod ;
   private byte[] T01MO37_A132BarCodReo ;
   private boolean[] T01MO37_n132BarCodReo ;
   private String[] T01MO37_A130BarCodPar ;
   private boolean[] T01MO37_n130BarCodPar ;
   private String[] T01MO38_A396EmprCod ;
   private boolean[] T01MO38_n396EmprCod ;
   private int[] T01MO38_A7145OSSCod ;
   private String[] T01MO39_A396EmprCod ;
   private boolean[] T01MO39_n396EmprCod ;
   private int[] T01MO39_A7049OGSCod ;
   private String[] T01MO40_A396EmprCod ;
   private boolean[] T01MO40_n396EmprCod ;
   private int[] T01MO40_A129BarCod ;
   private boolean[] T01MO40_n129BarCod ;
   private byte[] T01MO40_A132BarCodReo ;
   private boolean[] T01MO40_n132BarCodReo ;
   private String[] T01MO40_A130BarCodPar ;
   private boolean[] T01MO40_n130BarCodPar ;
   private int[] T01MO40_A6031Ac_Barcod ;
   private byte[] T01MO40_A6032Ac_BarReo ;
   private String[] T01MO40_A6033Ac_BarPar ;
   private String[] T01MO41_A396EmprCod ;
   private boolean[] T01MO41_n396EmprCod ;
   private int[] T01MO41_A129BarCod ;
   private boolean[] T01MO41_n129BarCod ;
   private byte[] T01MO41_A132BarCodReo ;
   private boolean[] T01MO41_n132BarCodReo ;
   private String[] T01MO41_A130BarCodPar ;
   private boolean[] T01MO41_n130BarCodPar ;
   private int[] T01MO41_A5908PartPal ;
   private String[] T01MO42_A396EmprCod ;
   private boolean[] T01MO42_n396EmprCod ;
   private int[] T01MO42_A129BarCod ;
   private boolean[] T01MO42_n129BarCod ;
   private byte[] T01MO42_A132BarCodReo ;
   private boolean[] T01MO42_n132BarCodReo ;
   private String[] T01MO42_A130BarCodPar ;
   private boolean[] T01MO42_n130BarCodPar ;
   private byte[] T01MO42_A2524DisComLin ;
   private String[] T01MO42_A1056DisComCod ;
   private String[] T01MO42_A1032FonCod ;
   private String[] T01MO43_A396EmprCod ;
   private boolean[] T01MO43_n396EmprCod ;
   private long[] T01MO43_A1736AlbExtCod ;
   private int[] T01MO43_A129BarCod ;
   private boolean[] T01MO43_n129BarCod ;
   private byte[] T01MO43_A132BarCodReo ;
   private boolean[] T01MO43_n132BarCodReo ;
   private String[] T01MO43_A130BarCodPar ;
   private boolean[] T01MO43_n130BarCodPar ;
   private String[] T01MO44_A396EmprCod ;
   private boolean[] T01MO44_n396EmprCod ;
   private int[] T01MO44_A129BarCod ;
   private boolean[] T01MO44_n129BarCod ;
   private byte[] T01MO44_A132BarCodReo ;
   private boolean[] T01MO44_n132BarCodReo ;
   private String[] T01MO44_A130BarCodPar ;
   private boolean[] T01MO44_n130BarCodPar ;
   private int[] T01MO44_A3753BarFoaCod ;
   private byte[] T01MO44_A3754BarFoaReo ;
   private String[] T01MO44_A3755BarFoaPar ;
   private String[] T01MO45_A396EmprCod ;
   private boolean[] T01MO45_n396EmprCod ;
   private int[] T01MO45_A129BarCod ;
   private boolean[] T01MO45_n129BarCod ;
   private byte[] T01MO45_A132BarCodReo ;
   private boolean[] T01MO45_n132BarCodReo ;
   private String[] T01MO45_A130BarCodPar ;
   private boolean[] T01MO45_n130BarCodPar ;
   private int[] T01MO45_A3747BarPegCod ;
   private byte[] T01MO45_A3748BarPegReo ;
   private String[] T01MO45_A3749BarPegPar ;
   private String[] T01MO46_A396EmprCod ;
   private boolean[] T01MO46_n396EmprCod ;
   private int[] T01MO46_A3253SolTraCod ;
   private String[] T01MO47_A396EmprCod ;
   private boolean[] T01MO47_n396EmprCod ;
   private int[] T01MO47_A3235SolSubCod ;
   private String[] T01MO48_A396EmprCod ;
   private boolean[] T01MO48_n396EmprCod ;
   private int[] T01MO48_A3218SolLuzCod ;
   private String[] T01MO49_A396EmprCod ;
   private boolean[] T01MO49_n396EmprCod ;
   private int[] T01MO49_A3196SolFriCod ;
   private String[] T01MO50_A396EmprCod ;
   private boolean[] T01MO50_n396EmprCod ;
   private int[] T01MO50_A3165SolPilCod ;
   private String[] T01MO51_A396EmprCod ;
   private boolean[] T01MO51_n396EmprCod ;
   private int[] T01MO51_A129BarCod ;
   private boolean[] T01MO51_n129BarCod ;
   private byte[] T01MO51_A132BarCodReo ;
   private boolean[] T01MO51_n132BarCodReo ;
   private String[] T01MO51_A130BarCodPar ;
   private boolean[] T01MO51_n130BarCodPar ;
   private short[] T01MO51_A2872HAnRLinMaq ;
   private byte[] T01MO51_A2873HAnRLinPro ;
   private short[] T01MO51_A2874HAnRLin ;
   private byte[] T01MO51_A2875HAnNumAny ;
   private String[] T01MO52_A396EmprCod ;
   private boolean[] T01MO52_n396EmprCod ;
   private String[] T01MO52_A2817PlaTer ;
   private short[] T01MO52_A2818PlaOrd ;
   private String[] T01MO53_A396EmprCod ;
   private boolean[] T01MO53_n396EmprCod ;
   private String[] T01MO53_A2809MetTerCod ;
   private int[] T01MO53_A129BarCod ;
   private boolean[] T01MO53_n129BarCod ;
   private byte[] T01MO53_A132BarCodReo ;
   private boolean[] T01MO53_n132BarCodReo ;
   private String[] T01MO53_A130BarCodPar ;
   private boolean[] T01MO53_n130BarCodPar ;
   private String[] T01MO54_A396EmprCod ;
   private boolean[] T01MO54_n396EmprCod ;
   private int[] T01MO54_A129BarCod ;
   private boolean[] T01MO54_n129BarCod ;
   private byte[] T01MO54_A132BarCodReo ;
   private boolean[] T01MO54_n132BarCodReo ;
   private String[] T01MO54_A130BarCodPar ;
   private boolean[] T01MO54_n130BarCodPar ;
   private short[] T01MO54_A2808RecLinMAL ;
   private byte[] T01MO54_A1377RecNumAny ;
   private String[] T01MO54_A719PrdNum ;
   private String[] T01MO55_A396EmprCod ;
   private boolean[] T01MO55_n396EmprCod ;
   private int[] T01MO55_A129BarCod ;
   private boolean[] T01MO55_n129BarCod ;
   private byte[] T01MO55_A132BarCodReo ;
   private boolean[] T01MO55_n132BarCodReo ;
   private String[] T01MO55_A130BarCodPar ;
   private boolean[] T01MO55_n130BarCodPar ;
   private short[] T01MO55_A2804RecLinMaq ;
   private String[] T01MO56_A396EmprCod ;
   private boolean[] T01MO56_n396EmprCod ;
   private String[] T01MO56_A2792TermiCod ;
   private int[] T01MO56_A129BarCod ;
   private boolean[] T01MO56_n129BarCod ;
   private byte[] T01MO56_A132BarCodReo ;
   private boolean[] T01MO56_n132BarCodReo ;
   private String[] T01MO56_A130BarCodPar ;
   private boolean[] T01MO56_n130BarCodPar ;
   private String[] T01MO57_A396EmprCod ;
   private boolean[] T01MO57_n396EmprCod ;
   private short[] T01MO57_A2248ManCod ;
   private java.util.Date[] T01MO57_A2711RpExHdFe ;
   private short[] T01MO57_A2713RpExHdLi ;
   private String[] T01MO58_A396EmprCod ;
   private boolean[] T01MO58_n396EmprCod ;
   private short[] T01MO58_A2248ManCod ;
   private String[] T01MO58_A2689ExHdrFas ;
   private int[] T01MO58_A2692ExHdrLin ;
   private String[] T01MO59_A396EmprCod ;
   private boolean[] T01MO59_n396EmprCod ;
   private int[] T01MO59_A129BarCod ;
   private boolean[] T01MO59_n129BarCod ;
   private byte[] T01MO59_A132BarCodReo ;
   private boolean[] T01MO59_n132BarCodReo ;
   private String[] T01MO59_A130BarCodPar ;
   private boolean[] T01MO59_n130BarCodPar ;
   private String[] T01MO59_A2494BarDosPro ;
   private String[] T01MO59_A719PrdNum ;
   private String[] T01MO60_A396EmprCod ;
   private boolean[] T01MO60_n396EmprCod ;
   private String[] T01MO60_A602MaqCod ;
   private java.util.Date[] T01MO60_A2461PlaFecTin ;
   private int[] T01MO60_A129BarCod ;
   private boolean[] T01MO60_n129BarCod ;
   private byte[] T01MO60_A132BarCodReo ;
   private boolean[] T01MO60_n132BarCodReo ;
   private String[] T01MO60_A130BarCodPar ;
   private boolean[] T01MO60_n130BarCodPar ;
   private String[] T01MO61_A396EmprCod ;
   private boolean[] T01MO61_n396EmprCod ;
   private int[] T01MO61_A129BarCod ;
   private boolean[] T01MO61_n129BarCod ;
   private byte[] T01MO61_A132BarCodReo ;
   private boolean[] T01MO61_n132BarCodReo ;
   private String[] T01MO61_A130BarCodPar ;
   private boolean[] T01MO61_n130BarCodPar ;
   private short[] T01MO61_A2457BarObLin ;
   private String[] T01MO62_A396EmprCod ;
   private boolean[] T01MO62_n396EmprCod ;
   private int[] T01MO62_A129BarCod ;
   private boolean[] T01MO62_n129BarCod ;
   private byte[] T01MO62_A132BarCodReo ;
   private boolean[] T01MO62_n132BarCodReo ;
   private String[] T01MO62_A130BarCodPar ;
   private boolean[] T01MO62_n130BarCodPar ;
   private short[] T01MO62_A2444BarEnLin ;
   private String[] T01MO63_A396EmprCod ;
   private boolean[] T01MO63_n396EmprCod ;
   private int[] T01MO63_A2406ExhAlbCod ;
   private int[] T01MO63_A129BarCod ;
   private boolean[] T01MO63_n129BarCod ;
   private byte[] T01MO63_A132BarCodReo ;
   private boolean[] T01MO63_n132BarCodReo ;
   private String[] T01MO63_A130BarCodPar ;
   private boolean[] T01MO63_n130BarCodPar ;
   private String[] T01MO64_A396EmprCod ;
   private boolean[] T01MO64_n396EmprCod ;
   private int[] T01MO64_A2253SalExtAlb ;
   private int[] T01MO64_A129BarCod ;
   private boolean[] T01MO64_n129BarCod ;
   private byte[] T01MO64_A132BarCodReo ;
   private boolean[] T01MO64_n132BarCodReo ;
   private String[] T01MO64_A130BarCodPar ;
   private boolean[] T01MO64_n130BarCodPar ;
   private String[] T01MO65_A396EmprCod ;
   private boolean[] T01MO65_n396EmprCod ;
   private long[] T01MO65_A30AlbProCod ;
   private int[] T01MO65_A129BarCod ;
   private boolean[] T01MO65_n129BarCod ;
   private byte[] T01MO65_A132BarCodReo ;
   private boolean[] T01MO65_n132BarCodReo ;
   private String[] T01MO65_A130BarCodPar ;
   private boolean[] T01MO65_n130BarCodPar ;
   private String[] T01MO66_A396EmprCod ;
   private boolean[] T01MO66_n396EmprCod ;
   private int[] T01MO66_A1348SolColCod ;
   private String[] T01MO67_A396EmprCod ;
   private boolean[] T01MO67_n396EmprCod ;
   private int[] T01MO67_A1333EstDimCod ;
   private String[] T01MO68_A396EmprCod ;
   private boolean[] T01MO68_n396EmprCod ;
   private int[] T01MO68_A1314EnsLabCod ;
   private String[] T01MO69_A396EmprCod ;
   private boolean[] T01MO69_n396EmprCod ;
   private int[] T01MO69_A129BarCod ;
   private boolean[] T01MO69_n129BarCod ;
   private byte[] T01MO69_A132BarCodReo ;
   private boolean[] T01MO69_n132BarCodReo ;
   private String[] T01MO69_A130BarCodPar ;
   private boolean[] T01MO69_n130BarCodPar ;
   private byte[] T01MO69_A906ObsReoLin ;
   private String[] T01MO70_A396EmprCod ;
   private boolean[] T01MO70_n396EmprCod ;
   private int[] T01MO70_A859CumCodCont ;
   private String[] T01MO71_A396EmprCod ;
   private boolean[] T01MO71_n396EmprCod ;
   private String[] T01MO71_A602MaqCod ;
   private java.util.Date[] T01MO71_A558HisProFec ;
   private int[] T01MO71_A561HisProLin ;
   private String[] T01MO72_A396EmprCod ;
   private boolean[] T01MO72_n396EmprCod ;
   private int[] T01MO72_A252CliCod ;
   private boolean[] T01MO72_n252CliCod ;
   private String[] T01MO72_A494ForSer ;
   private String[] T01MO72_A482ForColNom ;
   private int[] T01MO72_A483ForColNum ;
   private byte[] T01MO72_A831TipColCod ;
   private String[] T01MO73_A396EmprCod ;
   private boolean[] T01MO73_n396EmprCod ;
   private int[] T01MO73_A129BarCod ;
   private boolean[] T01MO73_n129BarCod ;
   private byte[] T01MO73_A132BarCodReo ;
   private boolean[] T01MO73_n132BarCodReo ;
   private String[] T01MO73_A130BarCodPar ;
   private boolean[] T01MO73_n130BarCodPar ;
   private String[] T01MO73_A200BarPieCod ;
   private String[] T01MO74_A396EmprCod ;
   private boolean[] T01MO74_n396EmprCod ;
   private int[] T01MO74_A129BarCod ;
   private boolean[] T01MO74_n129BarCod ;
   private byte[] T01MO74_A132BarCodReo ;
   private boolean[] T01MO74_n132BarCodReo ;
   private String[] T01MO74_A130BarCodPar ;
   private boolean[] T01MO74_n130BarCodPar ;
   private byte[] T01MO74_A188BarNotLin ;
   private String[] T01MO75_A396EmprCod ;
   private boolean[] T01MO75_n396EmprCod ;
   private int[] T01MO75_A129BarCod ;
   private boolean[] T01MO75_n129BarCod ;
   private byte[] T01MO75_A132BarCodReo ;
   private boolean[] T01MO75_n132BarCodReo ;
   private String[] T01MO75_A130BarCodPar ;
   private boolean[] T01MO75_n130BarCodPar ;
   private String[] T01MO75_A758ProCod ;
   private String[] T01MO76_A396EmprCod ;
   private boolean[] T01MO76_n396EmprCod ;
   private int[] T01MO76_A129BarCod ;
   private boolean[] T01MO76_n129BarCod ;
   private byte[] T01MO76_A132BarCodReo ;
   private boolean[] T01MO76_n132BarCodReo ;
   private String[] T01MO76_A130BarCodPar ;
   private boolean[] T01MO76_n130BarCodPar ;
   private int[] T01MO76_A119BarAgrCod ;
   private byte[] T01MO76_A124BarAgrReo ;
   private String[] T01MO76_A122BarAgrPar ;
   private String[] T01MO79_A396EmprCod ;
   private boolean[] T01MO79_n396EmprCod ;
   private int[] T01MO79_A129BarCod ;
   private boolean[] T01MO79_n129BarCod ;
   private byte[] T01MO79_A132BarCodReo ;
   private boolean[] T01MO79_n132BarCodReo ;
   private String[] T01MO79_A130BarCodPar ;
   private boolean[] T01MO79_n130BarCodPar ;
   private int[] T01MO80_A129BarCod ;
   private boolean[] T01MO80_n129BarCod ;
   private byte[] T01MO80_A132BarCodReo ;
   private boolean[] T01MO80_n132BarCodReo ;
   private String[] T01MO80_A130BarCodPar ;
   private boolean[] T01MO80_n130BarCodPar ;
   private byte[] T01MO80_A13093BarDGLin ;
   private String[] T01MO80_A13094BarDGDibCl ;
   private int[] T01MO80_A13095BarDGDibIn ;
   private String[] T01MO80_A13096BarDGComb ;
   private String[] T01MO80_A13097BarDGFOndo ;
   private byte[] T01MO80_A13132BarDGEstad ;
   private String[] T01MO80_A13098BarDGObs ;
   private short[] T01MO80_A13099BarDGPzs ;
   private java.math.BigDecimal[] T01MO80_A13100BarDGMts ;
   private short[] T01MO80_A13101BarDGAncho ;
   private String[] T01MO80_A396EmprCod ;
   private boolean[] T01MO80_n396EmprCod ;
   private String[] T01MO81_A396EmprCod ;
   private boolean[] T01MO81_n396EmprCod ;
   private int[] T01MO81_A129BarCod ;
   private boolean[] T01MO81_n129BarCod ;
   private byte[] T01MO81_A132BarCodReo ;
   private boolean[] T01MO81_n132BarCodReo ;
   private String[] T01MO81_A130BarCodPar ;
   private boolean[] T01MO81_n130BarCodPar ;
   private byte[] T01MO81_A13093BarDGLin ;
   private String[] T01MO81_A13094BarDGDibCl ;
   private int[] T01MO81_A13095BarDGDibIn ;
   private String[] T01MO81_A13096BarDGComb ;
   private String[] T01MO81_A13097BarDGFOndo ;
   private int[] T01MO3_A129BarCod ;
   private boolean[] T01MO3_n129BarCod ;
   private byte[] T01MO3_A132BarCodReo ;
   private boolean[] T01MO3_n132BarCodReo ;
   private String[] T01MO3_A130BarCodPar ;
   private boolean[] T01MO3_n130BarCodPar ;
   private byte[] T01MO3_A13093BarDGLin ;
   private String[] T01MO3_A13094BarDGDibCl ;
   private int[] T01MO3_A13095BarDGDibIn ;
   private String[] T01MO3_A13096BarDGComb ;
   private String[] T01MO3_A13097BarDGFOndo ;
   private byte[] T01MO3_A13132BarDGEstad ;
   private String[] T01MO3_A13098BarDGObs ;
   private short[] T01MO3_A13099BarDGPzs ;
   private java.math.BigDecimal[] T01MO3_A13100BarDGMts ;
   private short[] T01MO3_A13101BarDGAncho ;
   private String[] T01MO3_A396EmprCod ;
   private boolean[] T01MO3_n396EmprCod ;
   private int[] T01MO2_A129BarCod ;
   private boolean[] T01MO2_n129BarCod ;
   private byte[] T01MO2_A132BarCodReo ;
   private boolean[] T01MO2_n132BarCodReo ;
   private String[] T01MO2_A130BarCodPar ;
   private boolean[] T01MO2_n130BarCodPar ;
   private byte[] T01MO2_A13093BarDGLin ;
   private String[] T01MO2_A13094BarDGDibCl ;
   private int[] T01MO2_A13095BarDGDibIn ;
   private String[] T01MO2_A13096BarDGComb ;
   private String[] T01MO2_A13097BarDGFOndo ;
   private byte[] T01MO2_A13132BarDGEstad ;
   private String[] T01MO2_A13098BarDGObs ;
   private short[] T01MO2_A13099BarDGPzs ;
   private java.math.BigDecimal[] T01MO2_A13100BarDGMts ;
   private short[] T01MO2_A13101BarDGAncho ;
   private String[] T01MO2_A396EmprCod ;
   private boolean[] T01MO2_n396EmprCod ;
   private String[] T01MO85_A396EmprCod ;
   private boolean[] T01MO85_n396EmprCod ;
   private int[] T01MO85_A129BarCod ;
   private boolean[] T01MO85_n129BarCod ;
   private byte[] T01MO85_A132BarCodReo ;
   private boolean[] T01MO85_n132BarCodReo ;
   private String[] T01MO85_A130BarCodPar ;
   private boolean[] T01MO85_n130BarCodPar ;
   private byte[] T01MO85_A13093BarDGLin ;
   private String[] T01MO85_A13094BarDGDibCl ;
   private int[] T01MO85_A13095BarDGDibIn ;
   private String[] T01MO85_A13096BarDGComb ;
   private String[] T01MO85_A13097BarDGFOndo ;
   private String[] T01MO86_A407EmprNom ;
   private boolean[] T01MO86_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdigbar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigbar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigbar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigbar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01MO2", "SELECT BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGEstad, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho, EmprCod FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDGLin = ? AND BarDGDibCl = ? AND BarDGDibIn = ? AND BarDGComb = ? AND BarDGFOndo = ?  FOR UPDATE OF BarDGEstad, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MO3", "SELECT BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGEstad, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho, EmprCod FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDGLin = ? AND BarDGDibCl = ? AND BarDGDibIn = ? AND BarDGComb = ? AND BarDGFOndo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MO4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDGUltLi, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarDGUltLi, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDGUltLi, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO7", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO8", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.BarDGUltLi, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MO12", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDGUltLi, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01MO13", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarDGUltLi=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01MO14", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01MO15", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO16", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO17", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO19", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO20", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO21", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO22", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO23", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO24", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO28", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO32", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO33", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO37", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO38", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO39", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO42", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO43", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO44", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO46", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO47", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO48", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO49", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO50", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO51", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO52", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO53", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO54", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO56", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO57", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO58", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO60", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO61", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO63", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO64", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO65", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO66", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO67", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO68", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO69", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO70", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO71", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO72", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MO77", "UPDATE TXPBARCAD SET BarDGUltLi=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01MO78", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01MO79", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MO80", "SELECT BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGEstad, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho, EmprCod FROM TXPDIGBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarDGLin = ? and BarDGDibCl = ? and BarDGDibIn = ? and BarDGComb = ? and BarDGFOndo = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MO81", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDGLin = ? AND BarDGDibCl = ? AND BarDGDibIn = ? AND BarDGComb = ? AND BarDGFOndo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01MO82", "INSERT INTO TXPDIGBAR(BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGEstad, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDIGBAR")
         ,new UpdateCursor("T01MO83", "UPDATE TXPDIGBAR SET BarDGEstad=?, BarDGObs=?, BarDGPzs=?, BarDGMts=?, BarDGAncho=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDGLin = ? AND BarDGDibCl = ? AND BarDGDibIn = ? AND BarDGComb = ? AND BarDGFOndo = ?", GX_NOMASK, "TXPDIGBAR")
         ,new UpdateCursor("T01MO84", "DELETE FROM TXPDIGBAR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDGLin = ? AND BarDGDibCl = ? AND BarDGDibIn = ? AND BarDGComb = ? AND BarDGFOndo = ?", GX_NOMASK, "TXPDIGBAR")
         ,new ForEachCursor("T01MO85", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MO86", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 78 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
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
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 1);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
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
                  stmt.setString(2, (String)parms[3], 3);
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
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 76 :
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
                  stmt.setString(2, (String)parms[3], 3);
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
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 80 :
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
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setString(7, (String)parms[9], 12);
               stmt.setString(8, (String)parms[10], 12);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 70);
               stmt.setShort(11, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               stmt.setShort(13, ((Number) parms[15]).shortValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 3);
               }
               return;
            case 81 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 70);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 16);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setString(13, (String)parms[16], 12);
               stmt.setString(14, (String)parms[17], 12);
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

