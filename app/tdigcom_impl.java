package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdigcom_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV33Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
         AV34DisArtcod = httpContext.GetPar( "DisArtcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
         A13082DisDGDibCl = httpContext.GetPar( "DisDGDibCl") ;
         A13083DisDGDibIn = (int)(GXutil.lval( httpContext.GetPar( "DisDGDibIn"))) ;
         A13084DisDGComb = httpContext.GetPar( "DisDGComb") ;
         A13085DisDGFondo = httpContext.GetPar( "DisDGFondo") ;
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1MN1792( Gx_mode, A396EmprCod, AV33Clicod, AV34DisArtcod, A13082DisDGDibCl, A13083DisDGDibIn, A13084DisDGComb, A13085DisDGFondo, Gx_msg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A13082DisDGDibCl = httpContext.GetPar( "DisDGDibCl") ;
         A13083DisDGDibIn = (int)(GXutil.lval( httpContext.GetPar( "DisDGDibIn"))) ;
         A13084DisDGComb = httpContext.GetPar( "DisDGComb") ;
         A13085DisDGFondo = httpContext.GetPar( "DisDGFondo") ;
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_1MN1792( Gx_mode, A396EmprCod, A361DisCod, A13082DisDGDibCl, A13083DisDGDibIn, A13084DisDGComb, A13085DisDGFondo, Gx_msg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DISPIEMTR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadispiemtr1MN34( A396EmprCod, A361DisCod, A365DisDes) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIBUJOS y COMBINACIONES DIGITAL", ""), (short)(0)) ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A13080DisDGUltli = (byte)(GXutil.lval( httpContext.GetPar( "DisDGUltli"))) ;
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

   public tdigcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdigcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdigcom_impl.class ));
   }

   public tdigcom_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDIGCOM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDGUltli_Internalname, GXutil.ltrim( localUtil.ntoc( A13080DisDGUltli, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDGUltli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13080DisDGUltli), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13080DisDGUltli), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDGUltli_Jsonclick, 0, "", "", "", "", "", 1, edtDisDGUltli_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Piezas", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Metros", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDGSumMt_Internalname, GXutil.ltrim( localUtil.ntoc( A13089DisDGSumMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDGSumMt_Enabled!=0) ? localUtil.format( A13089DisDGSumMt, "ZZZZZ9.99") : localUtil.format( A13089DisDGSumMt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDGSumMt_Jsonclick, 0, "", "", "", "", "", 1, edtDisDGSumMt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Total Piezas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDGSumPz_Internalname, GXutil.ltrim( localUtil.ntoc( A13090DisDGSumPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDGSumPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13090DisDGSumPz), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13090DisDGSumPz), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDGSumPz_Jsonclick, 0, "", "", "", "", "", 1, edtDisDGSumPz_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIGCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1792 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1792 = (short)(1) ;
            scanStart1MN1792( ) ;
            while ( RcdFound1792 != 0 )
            {
               init_level_properties1792( ) ;
               getByPrimaryKey1MN1792( ) ;
               addRow1MN1792( ) ;
               scanNext1MN1792( ) ;
            }
            scanEnd1MN1792( ) ;
            nBlankRcdCount1792 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13080DisDGUltli = A13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         B13090DisDGSumPz = A13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         B13089DisDGSumMt = A13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         standaloneNotModal1MN1792( ) ;
         standaloneModal1MN1792( ) ;
         sMode1792 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1MN1792( ) ;
            edtavnRcdDeleted_1792_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1792_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1792_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1792_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGDibCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGDIBCL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibCl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGDibIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGDIBIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibIn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGCOMB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGComb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGFONDO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGFondo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGPZS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGPzs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGANC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGAnc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisDGObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisDGObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1792 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1MN1792( ) ;
            }
            sendRow1MN1792( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1792 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13080DisDGUltli = B13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         A13090DisDGSumPz = B13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         A13089DisDGSumMt = B13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1792 = (short)(5) ;
         nRcdExists_1792 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1MN1792( ) ;
            while ( RcdFound1792 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601792( ) ;
               init_level_properties1792( ) ;
               standaloneNotModal1MN1792( ) ;
               getByPrimaryKey1MN1792( ) ;
               standaloneModal1MN1792( ) ;
               addRow1MN1792( ) ;
               scanNext1MN1792( ) ;
            }
            scanEnd1MN1792( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1792 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601792( ) ;
      initAll1MN1792( ) ;
      init_level_properties1792( ) ;
      B13080DisDGUltli = A13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      B13090DisDGSumPz = A13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      B13089DisDGSumMt = A13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      nRcdExists_1792 = (short)(0) ;
      nIsMod_1792 = (short)(0) ;
      nRcdDeleted_1792 = (short)(0) ;
      nBlankRcdCount1792 = (short)(nBlankRcdUsr1792+nBlankRcdCount1792) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1792 > 0 )
      {
         standaloneNotModal1MN1792( ) ;
         standaloneModal1MN1792( ) ;
         addRow1MN1792( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisDGLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1792 = (short)(nBlankRcdCount1792-1) ;
      }
      Gx_mode = sMode1792 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13080DisDGUltli = B13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      A13090DisDGSumPz = B13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      A13089DisDGSumMt = B13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIGCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDIGCOM.htm");
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
      e111MN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13080DisDGUltli = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13080DisDGUltli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z374DisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
            A365DisDes = httpContext.cgiGet( "Z365DisDes") ;
            O13080DisDGUltli = (byte)(localUtil.ctol( httpContext.cgiGet( "O13080DisDGUltli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13090DisDGSumPz = (int)(localUtil.ctol( httpContext.cgiGet( "O13090DisDGSumPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13089DisDGSumMt = localUtil.ctond( httpContext.cgiGet( "O13089DisDGSumMt")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34DisArtcod = httpContext.cgiGet( "vDISARTCOD") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A13080DisDGUltli = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisDGUltli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
            A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
            A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            A13089DisDGSumMt = localUtil.ctond( httpContext.cgiGet( edtDisDGSumMt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
            A13090DisDGSumPz = (int)(localUtil.ctol( httpContext.cgiGet( edtDisDGSumPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDIGCOM");
            A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
            forbiddenHiddens.add("DisNumPie", localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdigcom:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                        e111MN2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121MN2 ();
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
         e121MN2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1MN34( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1792_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1792_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1MN34( ) ;
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

   public void confirm_1MN0( )
   {
      beforeValidate1MN34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1MN34( ) ;
         }
         else
         {
            checkExtendedTable1MN34( ) ;
            if ( AnyError == 0 )
            {
               zm1MN34( 18) ;
               zm1MN34( 19) ;
            }
            closeExtendedTableCursors1MN34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1MN1792( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1MN0( ) ;
      }
   }

   public void confirm_1MN1792( )
   {
      s13080DisDGUltli = O13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      s13090DisDGSumPz = O13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      s13089DisDGSumMt = O13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1MN1792( ) ;
         if ( ( nRcdExists_1792 != 0 ) || ( nIsMod_1792 != 0 ) )
         {
            getKey1MN1792( ) ;
            if ( ( nRcdExists_1792 == 0 ) && ( nRcdDeleted_1792 == 0 ) )
            {
               if ( RcdFound1792 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1MN1792( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1MN1792( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1MN1792( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13080DisDGUltli = A13080DisDGUltli ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
                     O13090DisDGSumPz = A13090DisDGSumPz ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
                     O13089DisDGSumMt = A13089DisDGSumMt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "DISDGLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisDGLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1792 != 0 )
               {
                  if ( nRcdDeleted_1792 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1MN1792( ) ;
                     load1MN1792( ) ;
                     beforeValidate1MN1792( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1MN1792( ) ;
                        O13080DisDGUltli = A13080DisDGUltli ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
                        O13090DisDGSumPz = A13090DisDGSumPz ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
                        O13089DisDGSumMt = A13089DisDGSumMt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1792 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1MN1792( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1MN1792( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1MN1792( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13080DisDGUltli = A13080DisDGUltli ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
                           O13090DisDGSumPz = A13090DisDGSumPz ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
                           O13089DisDGSumMt = A13089DisDGSumMt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1792 == 0 )
                  {
                     GXCCtl = "DISDGLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisDGLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1792_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGDibCl_Internalname, GXutil.rtrim( A13082DisDGDibCl)) ;
         httpContext.changePostValue( edtDisDGDibIn_Internalname, GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGComb_Internalname, GXutil.rtrim( A13084DisDGComb)) ;
         httpContext.changePostValue( edtDisDGFondo_Internalname, GXutil.rtrim( A13085DisDGFondo)) ;
         httpContext.changePostValue( edtDisDGMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGObs_Internalname, GXutil.rtrim( A13091DisDGObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13081DisDGLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13082DisDGDibCl_"+sGXsfl_60_idx, GXutil.rtrim( Z13082DisDGDibCl)) ;
         httpContext.changePostValue( "ZT_"+"Z13083DisDGDibIn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13084DisDGComb_"+sGXsfl_60_idx, GXutil.rtrim( Z13084DisDGComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13085DisDGFondo_"+sGXsfl_60_idx, GXutil.rtrim( Z13085DisDGFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13086DisDGMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13087DisDGPzs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13088DisDGAnc_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13091DisDGObs_"+sGXsfl_60_idx, GXutil.rtrim( Z13091DisDGObs)) ;
         httpContext.changePostValue( "T13087DisDGPzs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13086DisDGMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1792 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1792_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1792_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGDIBCL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGDIBIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGCOMB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGFONDO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGPZS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGANC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13080DisDGUltli = s13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      O13090DisDGSumPz = s13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      O13089DisDGSumMt = s13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1MN0( )
   {
   }

   public void e111MN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdigcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tdigcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdigcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdigcom_impl.this.A396EmprCod = GXv_char2[0] ;
      tdigcom_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdigcom_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121MN2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A361DisCod ;
      new app.pdigcom(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
      tdigcom_impl.this.A396EmprCod = GXv_char4[0] ;
      tdigcom_impl.this.A361DisCod = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm1MN34( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13080DisDGUltli = T01MN5_A13080DisDGUltli[0] ;
            Z374DisNumPie = T01MN5_A374DisNumPie[0] ;
            Z365DisDes = T01MN5_A365DisDes[0] ;
         }
         else
         {
            Z13080DisDGUltli = A13080DisDGUltli ;
            Z374DisNumPie = A374DisNumPie ;
            Z365DisDes = A365DisDes ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z361DisCod = A361DisCod ;
         Z13080DisDGUltli = A13080DisDGUltli ;
         Z374DisNumPie = A374DisNumPie ;
         Z396EmprCod = A396EmprCod ;
         Z365DisDes = A365DisDes ;
         Z407EmprNom = A407EmprNom ;
         Z13089DisDGSumMt = A13089DisDGSumMt ;
         Z13090DisDGSumPz = A13090DisDGSumPz ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisDGUltli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGUltli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGUltli_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      AV37Pgmname = "TDIGCOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisDGUltli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGUltli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGUltli_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      /* Using cursor T01MN6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MN6_A407EmprNom[0] ;
      n407EmprNom = T01MN6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01MN8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13089DisDGSumMt = T01MN8_A13089DisDGSumMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         A13090DisDGSumPz = T01MN8_A13090DisDGSumPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      else
      {
         A13089DisDGSumMt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         A13090DisDGSumPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      O13089DisDGSumMt = A13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      O13090DisDGSumPz = A13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitid", ""), 1, "");
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
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
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

   public void load1MN34( )
   {
      /* Using cursor T01MN10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01MN10_A407EmprNom[0] ;
         n407EmprNom = T01MN10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13080DisDGUltli = T01MN10_A13080DisDGUltli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         A374DisNumPie = T01MN10_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A13089DisDGSumMt = T01MN10_A13089DisDGSumMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         A13090DisDGSumPz = T01MN10_A13090DisDGSumPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         A365DisDes = T01MN10_A365DisDes[0] ;
         zm1MN34( -17) ;
      }
      pr_default.close(6);
      onLoadActions1MN34( ) ;
   }

   public void onLoadActions1MN34( )
   {
      O13090DisDGSumPz = A13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      O13089DisDGSumMt = A13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
   }

   public void checkExtendedTable1MN34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1MN34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1MN34( )
   {
      /* Using cursor T01MN11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01MN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01MN5_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01MN5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MN34( 17) ;
         RcdFound34 = (short)(1) ;
         A13080DisDGUltli = T01MN5_A13080DisDGUltli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         A374DisNumPie = T01MN5_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A365DisDes = T01MN5_A365DisDes[0] ;
         O13080DisDGUltli = A13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1MN34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1MN34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1MN34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1MN34( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T01MN12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MN12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MN12_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MN12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MN12_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01MN13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MN13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MN13_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MN13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MN13_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1MN34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13080DisDGUltli = O13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         A13090DisDGSumPz = O13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         A13089DisDGSumMt = O13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         insert1MN34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13080DisDGUltli = O13080DisDGUltli ;
               httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
               A13090DisDGSumPz = O13090DisDGSumPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
               A13089DisDGSumMt = O13089DisDGSumMt ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13080DisDGUltli = O13080DisDGUltli ;
               httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
               A13090DisDGSumPz = O13090DisDGSumPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
               A13089DisDGSumMt = O13089DisDGSumMt ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               update1MN34( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13080DisDGUltli = O13080DisDGUltli ;
               httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
               A13090DisDGSumPz = O13090DisDGSumPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
               A13089DisDGSumMt = O13089DisDGSumMt ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               insert1MN34( ) ;
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
                  A13080DisDGUltli = O13080DisDGUltli ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
                  A13090DisDGSumPz = O13090DisDGSumPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
                  A13089DisDGSumMt = O13089DisDGSumMt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
                  insert1MN34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13080DisDGUltli = O13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         A13090DisDGSumPz = O13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         A13089DisDGSumMt = O13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
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
      getKey1MN34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdigcom");
   }

   public void insert_check( )
   {
      confirm_1MN0( ) ;
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
      if ( RcdFound34 == 0 )
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
      scanStart1MN34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MN34( ) ;
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
      if ( RcdFound34 == 0 )
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
      if ( RcdFound34 == 0 )
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
      scanStart1MN34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1MN34( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MN34( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1MN34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z13080DisDGUltli != T01MN4_A13080DisDGUltli[0] ) || ( Z374DisNumPie != T01MN4_A374DisNumPie[0] ) || ( GXutil.strcmp(Z365DisDes, T01MN4_A365DisDes[0]) != 0 ) )
         {
            if ( Z13080DisDGUltli != T01MN4_A13080DisDGUltli[0] )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDGUltli");
               GXutil.writeLogRaw("Old: ",Z13080DisDGUltli);
               GXutil.writeLogRaw("Current: ",T01MN4_A13080DisDGUltli[0]);
            }
            if ( Z374DisNumPie != T01MN4_A374DisNumPie[0] )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisNumPie");
               GXutil.writeLogRaw("Old: ",Z374DisNumPie);
               GXutil.writeLogRaw("Current: ",T01MN4_A374DisNumPie[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T01MN4_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01MN4_A365DisDes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MN34( )
   {
      beforeValidate1MN34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MN34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MN34( 0) ;
         checkOptimisticConcurrency1MN34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MN34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MN34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MN14 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A13080DisDGUltli), Short.valueOf(A374DisNumPie), A396EmprCod, A365DisDes});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1MN34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1MN0( ) ;
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
            load1MN34( ) ;
         }
         endLevel1MN34( ) ;
      }
      closeExtendedTableCursors1MN34( ) ;
   }

   public void update1MN34( )
   {
      beforeValidate1MN34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MN34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MN34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MN34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1MN34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MN15 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A13080DisDGUltli), Short.valueOf(A374DisNumPie), A365DisDes, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1MN34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                     tdigcom_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdigcom_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MN34( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1MN0( ) ;
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
         endLevel1MN34( ) ;
      }
      closeExtendedTableCursors1MN34( ) ;
   }

   public void deferredUpdate1MN34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MN34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MN34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MN34( ) ;
         afterConfirm1MN34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MN34( ) ;
            if ( AnyError == 0 )
            {
               A13080DisDGUltli = O13080DisDGUltli ;
               httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
               A13090DisDGSumPz = O13090DisDGSumPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
               A13089DisDGSumMt = O13089DisDGSumMt ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               scanStart1MN1792( ) ;
               while ( RcdFound1792 != 0 )
               {
                  getByPrimaryKey1MN1792( ) ;
                  delete1MN1792( ) ;
                  scanNext1MN1792( ) ;
                  O13080DisDGUltli = A13080DisDGUltli ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
                  O13090DisDGSumPz = A13090DisDGSumPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
                  O13089DisDGSumMt = A13089DisDGSumMt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               }
               scanEnd1MN1792( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MN16 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound34 == 0 )
                        {
                           initAll1MN34( ) ;
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
                        resetCaption1MN0( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MN34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MN34( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01MN17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01MN18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01MN19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01MN20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01MN21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01MN22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01MN23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01MN24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01MN25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01MN26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01MN27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1MN1792( )
   {
      s13080DisDGUltli = O13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      s13090DisDGSumPz = O13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      s13089DisDGSumMt = O13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1MN1792( ) ;
         if ( ( nRcdExists_1792 != 0 ) || ( nIsMod_1792 != 0 ) )
         {
            standaloneNotModal1MN1792( ) ;
            getKey1MN1792( ) ;
            if ( ( nRcdExists_1792 == 0 ) && ( nRcdDeleted_1792 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1MN1792( ) ;
            }
            else
            {
               if ( RcdFound1792 != 0 )
               {
                  if ( ( nRcdDeleted_1792 != 0 ) && ( nRcdExists_1792 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1MN1792( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1792 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1MN1792( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1792 == 0 )
                  {
                     GXCCtl = "DISDGLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisDGLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13080DisDGUltli = A13080DisDGUltli ;
            httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
            O13090DisDGSumPz = A13090DisDGSumPz ;
            httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
            O13089DisDGSumMt = A13089DisDGSumMt ;
            httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1792_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGDibCl_Internalname, GXutil.rtrim( A13082DisDGDibCl)) ;
         httpContext.changePostValue( edtDisDGDibIn_Internalname, GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGComb_Internalname, GXutil.rtrim( A13084DisDGComb)) ;
         httpContext.changePostValue( edtDisDGFondo_Internalname, GXutil.rtrim( A13085DisDGFondo)) ;
         httpContext.changePostValue( edtDisDGMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisDGObs_Internalname, GXutil.rtrim( A13091DisDGObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13081DisDGLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13082DisDGDibCl_"+sGXsfl_60_idx, GXutil.rtrim( Z13082DisDGDibCl)) ;
         httpContext.changePostValue( "ZT_"+"Z13083DisDGDibIn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13084DisDGComb_"+sGXsfl_60_idx, GXutil.rtrim( Z13084DisDGComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13085DisDGFondo_"+sGXsfl_60_idx, GXutil.rtrim( Z13085DisDGFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13086DisDGMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13087DisDGPzs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13088DisDGAnc_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13091DisDGObs_"+sGXsfl_60_idx, GXutil.rtrim( Z13091DisDGObs)) ;
         httpContext.changePostValue( "T13087DisDGPzs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13086DisDGMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1792_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1792 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1792_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1792_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGDIBCL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGDIBIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGCOMB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGFONDO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGPZS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGANC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDGOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1MN1792( ) ;
      if ( AnyError != 0 )
      {
         O13080DisDGUltli = s13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         O13090DisDGSumPz = s13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         O13089DisDGSumMt = s13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      }
      nRcdExists_1792 = (short)(0) ;
      nIsMod_1792 = (short)(0) ;
      nRcdDeleted_1792 = (short)(0) ;
   }

   public void processLevel1MN34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1MN1792( ) ;
      if ( AnyError != 0 )
      {
         O13080DisDGUltli = s13080DisDGUltli ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
         O13090DisDGSumPz = s13090DisDGSumPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         O13089DisDGSumMt = s13089DisDGSumMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01MN28 */
      pr_default.execute(24, new Object[] {Byte.valueOf(A13080DisDGUltli), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
   }

   public void endLevel1MN34( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1MN34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdigcom");
         if ( AnyError == 0 )
         {
            confirmValues1MN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdigcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1MN34( )
   {
      /* Scan By routine */
      /* Using cursor T01MN29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MN34( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1MN34( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1MN34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MN34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MN34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MN34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MN34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MN34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MN34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisDGUltli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGUltli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGUltli_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisPieMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMtr_Enabled), 5, 0), true);
      edtDisDGSumMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGSumMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGSumMt_Enabled), 5, 0), true);
      edtDisDGSumPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGSumPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGSumPz_Enabled), 5, 0), true);
   }

   public void zm1MN1792( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13086DisDGMts = T01MN3_A13086DisDGMts[0] ;
            Z13087DisDGPzs = T01MN3_A13087DisDGPzs[0] ;
            Z13088DisDGAnc = T01MN3_A13088DisDGAnc[0] ;
            Z13091DisDGObs = T01MN3_A13091DisDGObs[0] ;
         }
         else
         {
            Z13086DisDGMts = A13086DisDGMts ;
            Z13087DisDGPzs = A13087DisDGPzs ;
            Z13088DisDGAnc = A13088DisDGAnc ;
            Z13091DisDGObs = A13091DisDGObs ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z361DisCod = A361DisCod ;
         Z13081DisDGLin = A13081DisDGLin ;
         Z13082DisDGDibCl = A13082DisDGDibCl ;
         Z13083DisDGDibIn = A13083DisDGDibIn ;
         Z13084DisDGComb = A13084DisDGComb ;
         Z13085DisDGFondo = A13085DisDGFondo ;
         Z13086DisDGMts = A13086DisDGMts ;
         Z13087DisDGPzs = A13087DisDGPzs ;
         Z13088DisDGAnc = A13088DisDGAnc ;
         Z13091DisDGObs = A13091DisDGObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1MN1792( )
   {
      edtDisDGUltli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGUltli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGUltli_Enabled), 5, 0), true);
      edtDisDGUltli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGUltli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGUltli_Enabled), 5, 0), true);
   }

   public void standaloneModal1MN1792( )
   {
      if ( isIns( )  )
      {
         A13080DisDGUltli = (byte)(O13080DisDGUltli+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13081DisDGLin = A13080DisDGUltli ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisDGLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisDGLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisDGDibCl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibCl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisDGDibCl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibCl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisDGDibIn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibIn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisDGDibIn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibIn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisDGComb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGComb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisDGComb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGComb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisDGFondo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGFondo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisDGFondo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisDGFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGFondo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1MN1792( )
   {
      /* Using cursor T01MN30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1792 = (short)(1) ;
         A13086DisDGMts = T01MN30_A13086DisDGMts[0] ;
         A13087DisDGPzs = T01MN30_A13087DisDGPzs[0] ;
         A13088DisDGAnc = T01MN30_A13088DisDGAnc[0] ;
         A13091DisDGObs = T01MN30_A13091DisDGObs[0] ;
         zm1MN1792( -20) ;
      }
      pr_default.close(26);
      onLoadActions1MN1792( ) ;
   }

   public void onLoadActions1MN1792( )
   {
      if ( isIns( )  )
      {
         A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts).subtract(O13086DisDGMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13089DisDGSumMt = O13089DisDGSumMt.subtract(O13086DisDGMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs-O13087DisDGPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13090DisDGSumPz = (int)(O13090DisDGSumPz-O13087DisDGPzs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
            }
         }
      }
   }

   public void checkExtendedTable1MN1792( )
   {
      nIsDirty_1792 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1MN1792( ) ;
      if ( (GXutil.strcmp("", A13082DisDGDibCl)==0) && (0==A13083DisDGDibIn) && true /* After */ )
      {
         GXCCtl = "DISDGDIBIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Faltan Datos: Dibujo Cliente/Dibujo Interno", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGDibIn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13084DisDGComb)==0) && true /* After */ )
      {
         GXCCtl = "DISDGCOMB_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Combinacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGComb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV33Clicod ;
         GXv_char3[0] = AV34DisArtcod ;
         GXv_char2[0] = A13082DisDGDibCl ;
         GXv_int6[0] = A13083DisDGDibIn ;
         GXv_char7[0] = A13084DisDGComb ;
         GXv_char8[0] = A13085DisDGFondo ;
         GXv_char9[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_char7, GXv_char8, GXv_char9) ;
         tdigcom_impl.this.A396EmprCod = GXv_char4[0] ;
         tdigcom_impl.this.AV33Clicod = GXv_int5[0] ;
         tdigcom_impl.this.AV34DisArtcod = GXv_char3[0] ;
         tdigcom_impl.this.A13082DisDGDibCl = GXv_char2[0] ;
         tdigcom_impl.this.A13083DisDGDibIn = GXv_int6[0] ;
         tdigcom_impl.this.A13084DisDGComb = GXv_char7[0] ;
         tdigcom_impl.this.A13085DisDGFondo = GXv_char8[0] ;
         tdigcom_impl.this.Gx_msg = GXv_char9[0] ;
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
         GXv_char9[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char8[0] = A13082DisDGDibCl ;
         GXv_int5[0] = A13083DisDGDibIn ;
         GXv_char7[0] = A13084DisDGComb ;
         GXv_char4[0] = A13085DisDGFondo ;
         GXv_char3[0] = Gx_msg ;
         new app.pprc186(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_int5, GXv_char7, GXv_char4, GXv_char3) ;
         tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
         tdigcom_impl.this.A361DisCod = GXv_int6[0] ;
         tdigcom_impl.this.A13082DisDGDibCl = GXv_char8[0] ;
         tdigcom_impl.this.A13083DisDGDibIn = GXv_int5[0] ;
         tdigcom_impl.this.A13084DisDGComb = GXv_char7[0] ;
         tdigcom_impl.this.A13085DisDGFondo = GXv_char4[0] ;
         tdigcom_impl.this.Gx_msg = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
      {
         GXCCtl = "DISDGFONDO_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(Gx_msg, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGFondo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13085DisDGFondo)==0) && true /* After */ )
      {
         GXCCtl = "DISDGFONDO_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fondo", ""), 0, GXCCtl);
      }
      if ( isIns( )  )
      {
         nIsDirty_1792 = (short)(1) ;
         A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1792 = (short)(1) ;
            A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts).subtract(O13086DisDGMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1792 = (short)(1) ;
               A13089DisDGSumMt = O13089DisDGSumMt.subtract(O13086DisDGMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1792 = (short)(1) ;
         A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1792 = (short)(1) ;
            A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs-O13087DisDGPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1792 = (short)(1) ;
               A13090DisDGSumPz = (int)(O13090DisDGSumPz-O13087DisDGPzs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1MN1792( )
   {
   }

   public void enableDisable1MN1792( )
   {
   }

   public void getKey1MN1792( )
   {
      /* Using cursor T01MN31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1792 = (short)(1) ;
      }
      else
      {
         RcdFound1792 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1MN1792( )
   {
      /* Using cursor T01MN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
      if ( (pr_default.getStatus(1) != 101) && ( T01MN3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01MN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MN1792( 20) ;
         RcdFound1792 = (short)(1) ;
         initializeNonKey1MN1792( ) ;
         A13081DisDGLin = T01MN3_A13081DisDGLin[0] ;
         A13082DisDGDibCl = T01MN3_A13082DisDGDibCl[0] ;
         A13083DisDGDibIn = T01MN3_A13083DisDGDibIn[0] ;
         A13084DisDGComb = T01MN3_A13084DisDGComb[0] ;
         A13085DisDGFondo = T01MN3_A13085DisDGFondo[0] ;
         A13086DisDGMts = T01MN3_A13086DisDGMts[0] ;
         A13087DisDGPzs = T01MN3_A13087DisDGPzs[0] ;
         A13088DisDGAnc = T01MN3_A13088DisDGAnc[0] ;
         A13091DisDGObs = T01MN3_A13091DisDGObs[0] ;
         O13087DisDGPzs = A13087DisDGPzs ;
         O13086DisDGMts = A13086DisDGMts ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z13081DisDGLin = A13081DisDGLin ;
         Z13082DisDGDibCl = A13082DisDGDibCl ;
         Z13083DisDGDibIn = A13083DisDGDibIn ;
         Z13084DisDGComb = A13084DisDGComb ;
         Z13085DisDGFondo = A13085DisDGFondo ;
         sMode1792 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MN1792( ) ;
         load1MN1792( ) ;
         Gx_mode = sMode1792 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1792 = (short)(0) ;
         initializeNonKey1MN1792( ) ;
         sMode1792 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MN1792( ) ;
         Gx_mode = sMode1792 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1MN1792( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1MN1792( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIGCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13086DisDGMts, T01MN2_A13086DisDGMts[0]) != 0 ) || ( Z13087DisDGPzs != T01MN2_A13087DisDGPzs[0] ) || ( Z13088DisDGAnc != T01MN2_A13088DisDGAnc[0] ) || ( GXutil.strcmp(Z13091DisDGObs, T01MN2_A13091DisDGObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13086DisDGMts, T01MN2_A13086DisDGMts[0]) != 0 )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDGMts");
               GXutil.writeLogRaw("Old: ",Z13086DisDGMts);
               GXutil.writeLogRaw("Current: ",T01MN2_A13086DisDGMts[0]);
            }
            if ( Z13087DisDGPzs != T01MN2_A13087DisDGPzs[0] )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDGPzs");
               GXutil.writeLogRaw("Old: ",Z13087DisDGPzs);
               GXutil.writeLogRaw("Current: ",T01MN2_A13087DisDGPzs[0]);
            }
            if ( Z13088DisDGAnc != T01MN2_A13088DisDGAnc[0] )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDGAnc");
               GXutil.writeLogRaw("Old: ",Z13088DisDGAnc);
               GXutil.writeLogRaw("Current: ",T01MN2_A13088DisDGAnc[0]);
            }
            if ( GXutil.strcmp(Z13091DisDGObs, T01MN2_A13091DisDGObs[0]) != 0 )
            {
               GXutil.writeLogln("tdigcom:[seudo value changed for attri]"+"DisDGObs");
               GXutil.writeLogRaw("Old: ",Z13091DisDGObs);
               GXutil.writeLogRaw("Current: ",T01MN2_A13091DisDGObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDIGCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MN1792( )
   {
      beforeValidate1MN1792( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MN1792( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MN1792( 0) ;
         checkOptimisticConcurrency1MN1792( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MN1792( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MN1792( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MN32 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo, A13086DisDGMts, Integer.valueOf(A13087DisDGPzs), Short.valueOf(A13088DisDGAnc), A13091DisDGObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGCOM");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load1MN1792( ) ;
         }
         endLevel1MN1792( ) ;
      }
      closeExtendedTableCursors1MN1792( ) ;
   }

   public void update1MN1792( )
   {
      beforeValidate1MN1792( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MN1792( ) ;
      }
      if ( ( nIsMod_1792 != 0 ) || ( nIsDirty_1792 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1MN1792( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1MN1792( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1MN1792( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01MN33 */
                     pr_default.execute(29, new Object[] {A13086DisDGMts, Integer.valueOf(A13087DisDGPzs), Short.valueOf(A13088DisDGAnc), A13091DisDGObs, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGCOM");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIGCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1MN1792( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char9[0] = A396EmprCod ;
                        GXv_int6[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char9, GXv_int6) ;
                        tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
                        tdigcom_impl.this.A361DisCod = GXv_int6[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1MN1792( ) ;
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
            endLevel1MN1792( ) ;
         }
      }
      closeExtendedTableCursors1MN1792( ) ;
   }

   public void deferredUpdate1MN1792( )
   {
   }

   public void delete1MN1792( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MN1792( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MN1792( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MN1792( ) ;
         afterConfirm1MN1792( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MN1792( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01MN34 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A13081DisDGLin), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGCOM");
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
      sMode1792 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MN1792( ) ;
      Gx_mode = sMode1792 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MN1792( )
   {
      standaloneModal1MN1792( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  || isUpd( )  )
         {
            GXv_char9[0] = A396EmprCod ;
            GXv_int6[0] = AV33Clicod ;
            GXv_char8[0] = AV34DisArtcod ;
            GXv_char7[0] = A13082DisDGDibCl ;
            GXv_int5[0] = A13083DisDGDibIn ;
            GXv_char4[0] = A13084DisDGComb ;
            GXv_char3[0] = A13085DisDGFondo ;
            GXv_char2[0] = Gx_msg ;
            new app.pprc179(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_char7, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
            tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
            tdigcom_impl.this.AV33Clicod = GXv_int6[0] ;
            tdigcom_impl.this.AV34DisArtcod = GXv_char8[0] ;
            tdigcom_impl.this.A13082DisDGDibCl = GXv_char7[0] ;
            tdigcom_impl.this.A13083DisDGDibIn = GXv_int5[0] ;
            tdigcom_impl.this.A13084DisDGComb = GXv_char4[0] ;
            tdigcom_impl.this.A13085DisDGFondo = GXv_char3[0] ;
            tdigcom_impl.this.Gx_msg = GXv_char2[0] ;
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
            GXv_char9[0] = A396EmprCod ;
            GXv_int6[0] = A361DisCod ;
            GXv_char8[0] = A13082DisDGDibCl ;
            GXv_int5[0] = A13083DisDGDibIn ;
            GXv_char7[0] = A13084DisDGComb ;
            GXv_char4[0] = A13085DisDGFondo ;
            GXv_char3[0] = Gx_msg ;
            new app.pprc186(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_int5, GXv_char7, GXv_char4, GXv_char3) ;
            tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
            tdigcom_impl.this.A361DisCod = GXv_int6[0] ;
            tdigcom_impl.this.A13082DisDGDibCl = GXv_char8[0] ;
            tdigcom_impl.this.A13083DisDGDibIn = GXv_int5[0] ;
            tdigcom_impl.this.A13084DisDGComb = GXv_char7[0] ;
            tdigcom_impl.this.A13085DisDGFondo = GXv_char4[0] ;
            tdigcom_impl.this.Gx_msg = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         }
         if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
         {
            GXCCtl = "DISDGFONDO_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(Gx_msg, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisDGFondo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  )
         {
            A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A13089DisDGSumMt = O13089DisDGSumMt.add(A13086DisDGMts).subtract(O13086DisDGMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A13089DisDGSumMt = O13089DisDGSumMt.subtract(O13086DisDGMts) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A13090DisDGSumPz = (int)(O13090DisDGSumPz+A13087DisDGPzs-O13087DisDGPzs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A13090DisDGSumPz = (int)(O13090DisDGSumPz-O13087DisDGPzs) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
               }
            }
         }
      }
   }

   public void endLevel1MN1792( )
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

   public void scanStart1MN1792( )
   {
      /* Scan By routine */
      /* Using cursor T01MN35 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound1792 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1792 = (short)(1) ;
         A13081DisDGLin = T01MN35_A13081DisDGLin[0] ;
         A13082DisDGDibCl = T01MN35_A13082DisDGDibCl[0] ;
         A13083DisDGDibIn = T01MN35_A13083DisDGDibIn[0] ;
         A13084DisDGComb = T01MN35_A13084DisDGComb[0] ;
         A13085DisDGFondo = T01MN35_A13085DisDGFondo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MN1792( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1792 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1792 = (short)(1) ;
         A13081DisDGLin = T01MN35_A13081DisDGLin[0] ;
         A13082DisDGDibCl = T01MN35_A13082DisDGDibCl[0] ;
         A13083DisDGDibIn = T01MN35_A13083DisDGDibIn[0] ;
         A13084DisDGComb = T01MN35_A13084DisDGComb[0] ;
         A13085DisDGFondo = T01MN35_A13085DisDGFondo[0] ;
      }
   }

   public void scanEnd1MN1792( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1MN1792( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MN1792( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MN1792( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MN1792( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MN1792( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MN1792( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MN1792( )
   {
      edtDisDGLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGDibCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibCl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGDibIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibIn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGComb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGComb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGFondo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGFondo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGPzs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGAnc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1MN1792( )
   {
   }

   public void send_integrity_lvl_hashes1MN34( )
   {
   }

   public void subsflControlProps_601792( )
   {
      edtavnRcdDeleted_1792_Internalname = "vNRCDDELETED_1792_"+sGXsfl_60_idx ;
      edtDisDGLin_Internalname = "DISDGLIN_"+sGXsfl_60_idx ;
      edtDisDGDibCl_Internalname = "DISDGDIBCL_"+sGXsfl_60_idx ;
      edtDisDGDibIn_Internalname = "DISDGDIBIN_"+sGXsfl_60_idx ;
      edtDisDGComb_Internalname = "DISDGCOMB_"+sGXsfl_60_idx ;
      edtDisDGFondo_Internalname = "DISDGFONDO_"+sGXsfl_60_idx ;
      edtDisDGMts_Internalname = "DISDGMTS_"+sGXsfl_60_idx ;
      edtDisDGPzs_Internalname = "DISDGPZS_"+sGXsfl_60_idx ;
      edtDisDGAnc_Internalname = "DISDGANC_"+sGXsfl_60_idx ;
      edtDisDGObs_Internalname = "DISDGOBS_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601792( )
   {
      edtavnRcdDeleted_1792_Internalname = "vNRCDDELETED_1792_"+sGXsfl_60_fel_idx ;
      edtDisDGLin_Internalname = "DISDGLIN_"+sGXsfl_60_fel_idx ;
      edtDisDGDibCl_Internalname = "DISDGDIBCL_"+sGXsfl_60_fel_idx ;
      edtDisDGDibIn_Internalname = "DISDGDIBIN_"+sGXsfl_60_fel_idx ;
      edtDisDGComb_Internalname = "DISDGCOMB_"+sGXsfl_60_fel_idx ;
      edtDisDGFondo_Internalname = "DISDGFONDO_"+sGXsfl_60_fel_idx ;
      edtDisDGMts_Internalname = "DISDGMTS_"+sGXsfl_60_fel_idx ;
      edtDisDGPzs_Internalname = "DISDGPZS_"+sGXsfl_60_fel_idx ;
      edtDisDGAnc_Internalname = "DISDGANC_"+sGXsfl_60_fel_idx ;
      edtDisDGObs_Internalname = "DISDGOBS_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1MN1792( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601792( ) ;
      sendRow1MN1792( ) ;
   }

   public void sendRow1MN1792( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1792_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1792_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1792), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1792), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1792_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1792_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGLin_Internalname,GXutil.ltrim( localUtil.ntoc( A13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13081DisDGLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGDibCl_Internalname,GXutil.rtrim( A13082DisDGDibCl),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGDibCl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGDibCl_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGDibIn_Internalname,GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13083DisDGDibIn), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGDibIn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGDibIn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGComb_Internalname,GXutil.rtrim( A13084DisDGComb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGComb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGComb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGFondo_Internalname,GXutil.rtrim( A13085DisDGFondo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGFondo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGFondo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisDGMts_Enabled!=0) ? localUtil.format( A13086DisDGMts, "ZZZZZ9.99") : localUtil.format( A13086DisDGMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisDGPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13087DisDGPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13087DisDGPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisDGAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13088DisDGAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13088DisDGAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1792_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDGObs_Internalname,GXutil.rtrim( A13091DisDGObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDGObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisDGObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1MN1792( ) ;
      GXCCtl = "Z13081DisDGLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13081DisDGLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13082DisDGDibCl_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13082DisDGDibCl));
      GXCCtl = "Z13083DisDGDibIn_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13083DisDGDibIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13084DisDGComb_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13084DisDGComb));
      GXCCtl = "Z13085DisDGFondo_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13085DisDGFondo));
      GXCCtl = "Z13086DisDGMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13087DisDGPzs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13088DisDGAnc_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13088DisDGAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13091DisDGObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13091DisDGObs));
      GXCCtl = "O13087DisDGPzs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O13087DisDGPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O13086DisDGMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O13086DisDGMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1792_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1792_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1792_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1792, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLICOD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDISARTCOD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34DisArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1792_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1792_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGDIBCL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGDIBIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibIn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGCOMB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGFONDO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGPZS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGANC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDGOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1MN1792( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601792( ) ;
      edtavnRcdDeleted_1792_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1792_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGDibCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGDIBCL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGDibIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGDIBIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGCOMB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGFONDO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGPZS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGANC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisDGObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISDGOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1792_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1792_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1792");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1792_Internalname ;
         wbErr = true ;
         nRcdDeleted_1792 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1792 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1792_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DISDGLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGLin_Internalname ;
         wbErr = true ;
         A13081DisDGLin = (byte)(0) ;
      }
      else
      {
         A13081DisDGLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisDGLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13082DisDGDibCl = httpContext.cgiGet( edtDisDGDibCl_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "DISDGDIBIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGDibIn_Internalname ;
         wbErr = true ;
         A13083DisDGDibIn = 0 ;
      }
      else
      {
         A13083DisDGDibIn = (int)(localUtil.ctol( httpContext.cgiGet( edtDisDGDibIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13084DisDGComb = httpContext.cgiGet( edtDisDGComb_Internalname) ;
      A13085DisDGFondo = httpContext.cgiGet( edtDisDGFondo_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisDGMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisDGMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISDGMTS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGMts_Internalname ;
         wbErr = true ;
         A13086DisDGMts = DecimalUtil.ZERO ;
      }
      else
      {
         A13086DisDGMts = localUtil.ctond( httpContext.cgiGet( edtDisDGMts_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DISDGPZS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGPzs_Internalname ;
         wbErr = true ;
         A13087DisDGPzs = 0 ;
      }
      else
      {
         A13087DisDGPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDisDGPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisDGAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISDGANC_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGAnc_Internalname ;
         wbErr = true ;
         A13088DisDGAnc = (short)(0) ;
      }
      else
      {
         A13088DisDGAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtDisDGAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13091DisDGObs = httpContext.cgiGet( edtDisDGObs_Internalname) ;
      GXCCtl = "Z13081DisDGLin_" + sGXsfl_60_idx ;
      Z13081DisDGLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13082DisDGDibCl_" + sGXsfl_60_idx ;
      Z13082DisDGDibCl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13083DisDGDibIn_" + sGXsfl_60_idx ;
      Z13083DisDGDibIn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13084DisDGComb_" + sGXsfl_60_idx ;
      Z13084DisDGComb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13085DisDGFondo_" + sGXsfl_60_idx ;
      Z13085DisDGFondo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13086DisDGMts_" + sGXsfl_60_idx ;
      Z13086DisDGMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13087DisDGPzs_" + sGXsfl_60_idx ;
      Z13087DisDGPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13088DisDGAnc_" + sGXsfl_60_idx ;
      Z13088DisDGAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13091DisDGObs_" + sGXsfl_60_idx ;
      Z13091DisDGObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O13087DisDGPzs_" + sGXsfl_60_idx ;
      O13087DisDGPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O13086DisDGMts_" + sGXsfl_60_idx ;
      O13086DisDGMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1792_" + sGXsfl_60_idx ;
      nRcdDeleted_1792 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1792_" + sGXsfl_60_idx ;
      nRcdExists_1792 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1792_" + sGXsfl_60_idx ;
      nIsMod_1792 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisDGFondo_Enabled = edtDisDGFondo_Enabled ;
      defedtDisDGComb_Enabled = edtDisDGComb_Enabled ;
      defedtDisDGDibIn_Enabled = edtDisDGDibIn_Enabled ;
      defedtDisDGDibCl_Enabled = edtDisDGDibCl_Enabled ;
      defedtDisDGLin_Enabled = edtDisDGLin_Enabled ;
   }

   public void confirmValues1MN0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601792( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601792( ) ;
         httpContext.changePostValue( "Z13081DisDGLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13081DisDGLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13081DisDGLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13082DisDGDibCl_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13082DisDGDibCl_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13082DisDGDibCl_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13083DisDGDibIn_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13083DisDGDibIn_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13083DisDGDibIn_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13084DisDGComb_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13084DisDGComb_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13084DisDGComb_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13085DisDGFondo_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13085DisDGFondo_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13085DisDGFondo_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13086DisDGMts_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13086DisDGMts_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13086DisDGMts_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13087DisDGPzs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13087DisDGPzs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13087DisDGPzs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13088DisDGAnc_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13088DisDGAnc_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13088DisDGAnc_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13091DisDGObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13091DisDGObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13091DisDGObs_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O13087DisDGPzs", httpContext.cgiGet( "T13087DisDGPzs")) ;
      httpContext.deletePostValue( "T13087DisDGPzs") ;
      httpContext.changePostValue( "O13086DisDGMts", httpContext.cgiGet( "T13086DisDGMts")) ;
      httpContext.deletePostValue( "T13086DisDGMts") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdigcom", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","DisCod","Clicod","DisArtcod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDIGCOM");
      forbiddenHiddens.add("DisNumPie", localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdigcom:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13080DisDGUltli", GXutil.ltrim( localUtil.ntoc( Z13080DisDGUltli, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "O13080DisDGUltli", GXutil.ltrim( localUtil.ntoc( O13080DisDGUltli, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13090DisDGSumPz", GXutil.ltrim( localUtil.ntoc( O13090DisDGSumPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13089DisDGSumMt", GXutil.ltrim( localUtil.ntoc( O13089DisDGSumMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdigcom", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","DisCod","Clicod","DisArtcod"})  ;
   }

   public String getPgmname( )
   {
      return "TDIGCOM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIBUJOS y COMBINACIONES DIGITAL", "") ;
   }

   public void initializeNonKey1MN34( )
   {
      A13080DisDGUltli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      A374DisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
      A385DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      O13080DisDGUltli = A13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
      O13090DisDGSumPz = A13090DisDGSumPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      O13089DisDGSumMt = A13089DisDGSumMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
      Z13080DisDGUltli = (byte)(0) ;
      Z374DisNumPie = (short)(0) ;
      Z365DisDes = "" ;
   }

   public void initAll1MN34( )
   {
      initializeNonKey1MN34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1MN1792( )
   {
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A13086DisDGMts = DecimalUtil.ZERO ;
      A13087DisDGPzs = 0 ;
      A13088DisDGAnc = (short)(0) ;
      A13091DisDGObs = "" ;
      O13087DisDGPzs = A13087DisDGPzs ;
      O13086DisDGMts = A13086DisDGMts ;
      Z13086DisDGMts = DecimalUtil.ZERO ;
      Z13087DisDGPzs = 0 ;
      Z13088DisDGAnc = (short)(0) ;
      Z13091DisDGObs = "" ;
   }

   public void initAll1MN1792( )
   {
      A13081DisDGLin = (byte)(0) ;
      A13082DisDGDibCl = "" ;
      A13083DisDGDibIn = 0 ;
      A13084DisDGComb = "" ;
      A13085DisDGFondo = "" ;
      initializeNonKey1MN1792( ) ;
   }

   public void standaloneModalInsert1MN1792( )
   {
      A13080DisDGUltli = i13080DisDGUltli ;
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13080DisDGUltli), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415101036", true, true);
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
      httpContext.AddJavascriptSource("tdigcom.js", "?202682415101036", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1792( )
   {
      edtDisDGFondo_Enabled = defedtDisDGFondo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGFondo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGComb_Enabled = defedtDisDGComb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGComb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGDibIn_Enabled = defedtDisDGDibIn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibIn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGDibCl_Enabled = defedtDisDGDibCl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGDibCl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisDGLin_Enabled = defedtDisDGLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDGLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDGLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1792, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1792_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13081DisDGLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13082DisDGDibCl));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGDibIn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13084DisDGComb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13085DisDGFondo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13086DisDGMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13087DisDGPzs, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13088DisDGAnc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13091DisDGObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisDGObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDisDGUltli_Internalname = "DISDGULTLI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDisDGSumMt_Internalname = "DISDGSUMMT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDisDGSumPz_Internalname = "DISDGSUMPZ" ;
      edtavnRcdDeleted_1792_Internalname = "vNRCDDELETED_1792" ;
      edtDisDGLin_Internalname = "DISDGLIN" ;
      edtDisDGDibCl_Internalname = "DISDGDIBCL" ;
      edtDisDGDibIn_Internalname = "DISDGDIBIN" ;
      edtDisDGComb_Internalname = "DISDGCOMB" ;
      edtDisDGFondo_Internalname = "DISDGFONDO" ;
      edtDisDGMts_Internalname = "DISDGMTS" ;
      edtDisDGPzs_Internalname = "DISDGPZS" ;
      edtDisDGAnc_Internalname = "DISDGANC" ;
      edtDisDGObs_Internalname = "DISDGOBS" ;
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
      Form.setCaption( httpContext.getMessage( "DIBUJOS y COMBINACIONES DIGITAL", "") );
      edtDisDGObs_Jsonclick = "" ;
      edtDisDGAnc_Jsonclick = "" ;
      edtDisDGPzs_Jsonclick = "" ;
      edtDisDGMts_Jsonclick = "" ;
      edtDisDGFondo_Jsonclick = "" ;
      edtDisDGComb_Jsonclick = "" ;
      edtDisDGDibIn_Jsonclick = "" ;
      edtDisDGDibCl_Jsonclick = "" ;
      edtDisDGLin_Jsonclick = "" ;
      edtavnRcdDeleted_1792_Jsonclick = "" ;
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
      edtDisDGObs_Enabled = 1 ;
      edtDisDGAnc_Enabled = 1 ;
      edtDisDGPzs_Enabled = 1 ;
      edtDisDGMts_Enabled = 1 ;
      edtDisDGFondo_Enabled = 1 ;
      edtDisDGComb_Enabled = 1 ;
      edtDisDGDibIn_Enabled = 1 ;
      edtDisDGDibCl_Enabled = 1 ;
      edtDisDGLin_Enabled = 1 ;
      edtavnRcdDeleted_1792_Enabled = 1 ;
      edtDisDGSumPz_Jsonclick = "" ;
      edtDisDGSumPz_Backcolor = (int)(0xFFFFFF) ;
      edtDisDGSumPz_Enabled = 0 ;
      edtDisDGSumMt_Jsonclick = "" ;
      edtDisDGSumMt_Backcolor = (int)(0xFFFFFF) ;
      edtDisDGSumMt_Enabled = 0 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumPie_Enabled = 0 ;
      edtDisDGUltli_Jsonclick = "" ;
      edtDisDGUltli_Backcolor = (int)(0xFFFFFF) ;
      edtDisDGUltli_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void gx3asadispiemtr1MN34( String A396EmprCod ,
                                     int A361DisCod ,
                                     String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_1MN1792( String Gx_mode ,
                              String A396EmprCod ,
                              int AV33Clicod ,
                              String AV34DisArtcod ,
                              String A13082DisDGDibCl ,
                              int A13083DisDGDibIn ,
                              String A13084DisDGComb ,
                              String A13085DisDGFondo ,
                              String Gx_msg )
   {
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int6[0] = AV33Clicod ;
         GXv_char8[0] = AV34DisArtcod ;
         GXv_char7[0] = A13082DisDGDibCl ;
         GXv_int5[0] = A13083DisDGDibIn ;
         GXv_char4[0] = A13084DisDGComb ;
         GXv_char3[0] = A13085DisDGFondo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_char7, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char9[0] ;
         AV33Clicod = GXv_int6[0] ;
         AV34DisArtcod = GXv_char8[0] ;
         A13082DisDGDibCl = GXv_char7[0] ;
         A13083DisDGDibIn = GXv_int5[0] ;
         A13084DisDGComb = GXv_char4[0] ;
         A13085DisDGFondo = GXv_char3[0] ;
         Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", AV34DisArtcod);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34DisArtcod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13082DisDGDibCl))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13084DisDGComb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13085DisDGFondo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_1MN1792( String Gx_mode ,
                              String A396EmprCod ,
                              int A361DisCod ,
                              String A13082DisDGDibCl ,
                              int A13083DisDGDibIn ,
                              String A13084DisDGComb ,
                              String A13085DisDGFondo ,
                              String Gx_msg )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char8[0] = A13082DisDGDibCl ;
         GXv_int5[0] = A13083DisDGDibIn ;
         GXv_char7[0] = A13084DisDGComb ;
         GXv_char4[0] = A13085DisDGFondo ;
         GXv_char3[0] = Gx_msg ;
         new app.pprc186(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_int5, GXv_char7, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char9[0] ;
         A361DisCod = GXv_int6[0] ;
         A13082DisDGDibCl = GXv_char8[0] ;
         A13083DisDGDibIn = GXv_int5[0] ;
         A13084DisDGComb = GXv_char7[0] ;
         A13085DisDGFondo = GXv_char4[0] ;
         Gx_msg = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13082DisDGDibCl))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13084DisDGComb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13085DisDGFondo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
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
      subsflControlProps_601792( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1MN1792( ) ;
         standaloneModal1MN1792( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1MN1792( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601792( ) ;
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
      /* Using cursor T01MN36 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MN36_A407EmprNom[0] ;
      n407EmprNom = T01MN36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T01MN38 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A13089DisDGSumMt = T01MN38_A13089DisDGSumMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         A13090DisDGSumPz = T01MN38_A13090DisDGSumPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      else
      {
         A13089DisDGSumMt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrimstr( A13089DisDGSumMt, 9, 2));
         A13090DisDGSumPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13090DisDGSumPz), 6, 0));
      }
      pr_default.close(33);
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

   public void valid_Discod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13080DisDGUltli", GXutil.ltrim( localUtil.ntoc( A13080DisDGUltli, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13089DisDGSumMt", GXutil.ltrim( localUtil.ntoc( A13089DisDGSumMt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13090DisDGSumPz", GXutil.ltrim( localUtil.ntoc( A13090DisDGSumPz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13080DisDGUltli", GXutil.ltrim( localUtil.ntoc( Z13080DisDGUltli, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z385DisPieMtr", GXutil.ltrim( localUtil.ntoc( Z385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13089DisDGSumMt", GXutil.ltrim( localUtil.ntoc( Z13089DisDGSumMt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13090DisDGSumPz", GXutil.ltrim( localUtil.ntoc( Z13090DisDGSumPz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13080DisDGUltli", GXutil.ltrim( localUtil.ntoc( O13080DisDGUltli, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13090DisDGSumPz", GXutil.ltrim( localUtil.ntoc( O13090DisDGSumPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13089DisDGSumMt", GXutil.ltrim( localUtil.ntoc( O13089DisDGSumMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Disdgfondo( )
   {
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int6[0] = AV33Clicod ;
         GXv_char8[0] = AV34DisArtcod ;
         GXv_char7[0] = A13082DisDGDibCl ;
         GXv_int5[0] = A13083DisDGDibIn ;
         GXv_char4[0] = A13084DisDGComb ;
         GXv_char3[0] = A13085DisDGFondo ;
         GXv_char2[0] = Gx_msg ;
         new app.pprc179(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_char7, GXv_int5, GXv_char4, GXv_char3, GXv_char2) ;
         tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdigcom_impl.this.AV33Clicod = GXv_int6[0] ;
         AV33Clicod = this.AV33Clicod ;
         tdigcom_impl.this.AV34DisArtcod = GXv_char8[0] ;
         AV34DisArtcod = this.AV34DisArtcod ;
         tdigcom_impl.this.A13082DisDGDibCl = GXv_char7[0] ;
         A13082DisDGDibCl = this.A13082DisDGDibCl ;
         tdigcom_impl.this.A13083DisDGDibIn = GXv_int5[0] ;
         A13083DisDGDibIn = this.A13083DisDGDibIn ;
         tdigcom_impl.this.A13084DisDGComb = GXv_char4[0] ;
         A13084DisDGComb = this.A13084DisDGComb ;
         tdigcom_impl.this.A13085DisDGFondo = GXv_char3[0] ;
         A13085DisDGFondo = this.A13085DisDGFondo ;
         tdigcom_impl.this.Gx_msg = GXv_char2[0] ;
         Gx_msg = this.Gx_msg ;
      }
      if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "DISDGFONDO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGFondo_Internalname ;
      }
      if ( true /* After */ && isIns( )  )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char8[0] = A13082DisDGDibCl ;
         GXv_int5[0] = A13083DisDGDibIn ;
         GXv_char7[0] = A13084DisDGComb ;
         GXv_char4[0] = A13085DisDGFondo ;
         GXv_char3[0] = Gx_msg ;
         new app.pprc186(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char8, GXv_int5, GXv_char7, GXv_char4, GXv_char3) ;
         tdigcom_impl.this.A396EmprCod = GXv_char9[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdigcom_impl.this.A361DisCod = GXv_int6[0] ;
         A361DisCod = this.A361DisCod ;
         tdigcom_impl.this.A13082DisDGDibCl = GXv_char8[0] ;
         A13082DisDGDibCl = this.A13082DisDGDibCl ;
         tdigcom_impl.this.A13083DisDGDibIn = GXv_int5[0] ;
         A13083DisDGDibIn = this.A13083DisDGDibIn ;
         tdigcom_impl.this.A13084DisDGComb = GXv_char7[0] ;
         A13084DisDGComb = this.A13084DisDGComb ;
         tdigcom_impl.this.A13085DisDGFondo = GXv_char4[0] ;
         A13085DisDGFondo = this.A13085DisDGFondo ;
         tdigcom_impl.this.Gx_msg = GXv_char3[0] ;
         Gx_msg = this.Gx_msg ;
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( isIns( )  ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "DISDGFONDO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisDGFondo_Internalname ;
      }
      if ( (GXutil.strcmp("", A13085DisDGFondo)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fondo", ""), 0, "DISDGFONDO");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34DisArtcod", GXutil.rtrim( AV34DisArtcod));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13082DisDGDibCl", GXutil.rtrim( A13082DisDGDibCl));
      httpContext.ajax_rsp_assign_attri("", false, "A13083DisDGDibIn", GXutil.ltrim( localUtil.ntoc( A13083DisDGDibIn, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13084DisDGComb", GXutil.rtrim( A13084DisDGComb));
      httpContext.ajax_rsp_assign_attri("", false, "A13085DisDGFondo", GXutil.rtrim( A13085DisDGFondo));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121MN2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13080DisDGUltli',fld:'DISDGULTLI',pic:'Z9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13080DisDGUltli',fld:'DISDGULTLI',pic:'Z9'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A13089DisDGSumMt',fld:'DISDGSUMMT',pic:'ZZZZZ9.99'},{av:'A13090DisDGSumPz',fld:'DISDGSUMPZ',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z13080DisDGUltli'},{av:'Z374DisNumPie'},{av:'Z385DisPieMtr'},{av:'Z13089DisDGSumMt'},{av:'Z13090DisDGSumPz'},{av:'O13080DisDGUltli'},{av:'O13090DisDGSumPz'},{av:'O13089DisDGSumMt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISDGULTLI","{handler:'valid_Disdgultli',iparms:[]");
      setEventMetadata("VALID_DISDGULTLI",",oparms:[]}");
      setEventMetadata("VALID_DISDGLIN","{handler:'valid_Disdglin',iparms:[]");
      setEventMetadata("VALID_DISDGLIN",",oparms:[]}");
      setEventMetadata("VALID_DISDGDIBCL","{handler:'valid_Disdgdibcl',iparms:[]");
      setEventMetadata("VALID_DISDGDIBCL",",oparms:[]}");
      setEventMetadata("VALID_DISDGDIBIN","{handler:'valid_Disdgdibin',iparms:[]");
      setEventMetadata("VALID_DISDGDIBIN",",oparms:[]}");
      setEventMetadata("VALID_DISDGCOMB","{handler:'valid_Disdgcomb',iparms:[]");
      setEventMetadata("VALID_DISDGCOMB",",oparms:[]}");
      setEventMetadata("VALID_DISDGFONDO","{handler:'valid_Disdgfondo',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'A13082DisDGDibCl',fld:'DISDGDIBCL',pic:''},{av:'A13083DisDGDibIn',fld:'DISDGDIBIN',pic:'ZZZZZZZ9'},{av:'A13084DisDGComb',fld:'DISDGCOMB',pic:''},{av:'A13085DisDGFondo',fld:'DISDGFONDO',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VALID_DISDGFONDO",",oparms:[{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13082DisDGDibCl',fld:'DISDGDIBCL',pic:''},{av:'A13083DisDGDibIn',fld:'DISDGDIBIN',pic:'ZZZZZZZ9'},{av:'A13084DisDGComb',fld:'DISDGCOMB',pic:''},{av:'A13085DisDGFondo',fld:'DISDGFONDO',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("VALID_DISDGMTS","{handler:'valid_Disdgmts',iparms:[]");
      setEventMetadata("VALID_DISDGMTS",",oparms:[]}");
      setEventMetadata("VALID_DISDGPZS","{handler:'valid_Disdgpzs',iparms:[]");
      setEventMetadata("VALID_DISDGPZS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disdgobs',iparms:[]");
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
      pr_default.close(32);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01MN39 */
      pr_default.execute(34, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         X631Metros = T01MN39_A631Metros[0] ;
      }
      pr_default.close(34);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01MN40 */
      pr_default.execute(35, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         X384DisPieMet = T01MN40_A384DisPieMet[0] ;
      }
      pr_default.close(35);
      return X384DisPieMet ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV34DisArtcod = "" ;
      Z396EmprCod = "" ;
      Z365DisDes = "" ;
      O13089DisDGSumMt = DecimalUtil.ZERO ;
      Z13082DisDGDibCl = "" ;
      Z13084DisDGComb = "" ;
      Z13085DisDGFondo = "" ;
      Z13086DisDGMts = DecimalUtil.ZERO ;
      Z13091DisDGObs = "" ;
      O13086DisDGMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV34DisArtcod = "" ;
      A13082DisDGDibCl = "" ;
      A13084DisDGComb = "" ;
      A13085DisDGFondo = "" ;
      Gx_msg = "" ;
      A365DisDes = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A13089DisDGSumMt = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B13089DisDGSumMt = DecimalUtil.ZERO ;
      sMode1792 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode34 = "" ;
      s13089DisDGSumMt = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A13086DisDGMts = DecimalUtil.ZERO ;
      A13091DisDGObs = "" ;
      T13086DisDGMts = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z13089DisDGSumMt = DecimalUtil.ZERO ;
      T01MN6_A407EmprNom = new String[] {""} ;
      T01MN6_n407EmprNom = new boolean[] {false} ;
      T01MN8_A13089DisDGSumMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN8_A13090DisDGSumPz = new int[1] ;
      T01MN10_A361DisCod = new int[1] ;
      T01MN10_A407EmprNom = new String[] {""} ;
      T01MN10_n407EmprNom = new boolean[] {false} ;
      T01MN10_A13080DisDGUltli = new byte[1] ;
      T01MN10_A374DisNumPie = new short[1] ;
      T01MN10_A396EmprCod = new String[] {""} ;
      T01MN10_A13089DisDGSumMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN10_A13090DisDGSumPz = new int[1] ;
      T01MN10_A365DisDes = new String[] {""} ;
      T01MN11_A396EmprCod = new String[] {""} ;
      T01MN11_A361DisCod = new int[1] ;
      T01MN5_A361DisCod = new int[1] ;
      T01MN5_A13080DisDGUltli = new byte[1] ;
      T01MN5_A374DisNumPie = new short[1] ;
      T01MN5_A396EmprCod = new String[] {""} ;
      T01MN5_A365DisDes = new String[] {""} ;
      T01MN12_A396EmprCod = new String[] {""} ;
      T01MN12_A361DisCod = new int[1] ;
      T01MN13_A396EmprCod = new String[] {""} ;
      T01MN13_A361DisCod = new int[1] ;
      T01MN4_A361DisCod = new int[1] ;
      T01MN4_A13080DisDGUltli = new byte[1] ;
      T01MN4_A374DisNumPie = new short[1] ;
      T01MN4_A396EmprCod = new String[] {""} ;
      T01MN4_A365DisDes = new String[] {""} ;
      T01MN17_A396EmprCod = new String[] {""} ;
      T01MN17_A361DisCod = new int[1] ;
      T01MN17_A13376DisTraID = new String[] {""} ;
      T01MN18_A396EmprCod = new String[] {""} ;
      T01MN18_A361DisCod = new int[1] ;
      T01MN18_A13213DisNormID = new String[] {""} ;
      T01MN19_A396EmprCod = new String[] {""} ;
      T01MN19_A361DisCod = new int[1] ;
      T01MN19_A7068DisNotLin = new byte[1] ;
      T01MN20_A396EmprCod = new String[] {""} ;
      T01MN20_A361DisCod = new int[1] ;
      T01MN20_A10197ProEspCod = new String[] {""} ;
      T01MN21_A396EmprCod = new String[] {""} ;
      T01MN21_A361DisCod = new int[1] ;
      T01MN21_A4594AccCod = new short[1] ;
      T01MN22_A396EmprCod = new String[] {""} ;
      T01MN22_A361DisCod = new int[1] ;
      T01MN22_A2524DisComLin = new byte[1] ;
      T01MN22_A1056DisComCod = new String[] {""} ;
      T01MN22_A1032FonCod = new String[] {""} ;
      T01MN23_A396EmprCod = new String[] {""} ;
      T01MN23_A361DisCod = new int[1] ;
      T01MN23_A3398DisRefBarC = new int[1] ;
      T01MN23_A3399DisRefBCRe = new byte[1] ;
      T01MN23_A3400DisRefBCPa = new String[] {""} ;
      T01MN23_A3607DisRefBPie = new String[] {""} ;
      T01MN24_A396EmprCod = new String[] {""} ;
      T01MN24_A361DisCod = new int[1] ;
      T01MN24_A376DisObsLin = new byte[1] ;
      T01MN25_A396EmprCod = new String[] {""} ;
      T01MN25_A361DisCod = new int[1] ;
      T01MN25_A758ProCod = new String[] {""} ;
      T01MN26_A396EmprCod = new String[] {""} ;
      T01MN26_A361DisCod = new int[1] ;
      T01MN26_A833TipDefCod = new short[1] ;
      T01MN27_A396EmprCod = new String[] {""} ;
      T01MN27_A361DisCod = new int[1] ;
      T01MN27_A44AlbRecCod = new int[1] ;
      T01MN29_A396EmprCod = new String[] {""} ;
      T01MN29_A361DisCod = new int[1] ;
      T01MN30_A361DisCod = new int[1] ;
      T01MN30_A13081DisDGLin = new byte[1] ;
      T01MN30_A13082DisDGDibCl = new String[] {""} ;
      T01MN30_A13083DisDGDibIn = new int[1] ;
      T01MN30_A13084DisDGComb = new String[] {""} ;
      T01MN30_A13085DisDGFondo = new String[] {""} ;
      T01MN30_A13086DisDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN30_A13087DisDGPzs = new int[1] ;
      T01MN30_A13088DisDGAnc = new short[1] ;
      T01MN30_A13091DisDGObs = new String[] {""} ;
      T01MN30_A396EmprCod = new String[] {""} ;
      T01MN31_A396EmprCod = new String[] {""} ;
      T01MN31_A361DisCod = new int[1] ;
      T01MN31_A13081DisDGLin = new byte[1] ;
      T01MN31_A13082DisDGDibCl = new String[] {""} ;
      T01MN31_A13083DisDGDibIn = new int[1] ;
      T01MN31_A13084DisDGComb = new String[] {""} ;
      T01MN31_A13085DisDGFondo = new String[] {""} ;
      T01MN3_A361DisCod = new int[1] ;
      T01MN3_A13081DisDGLin = new byte[1] ;
      T01MN3_A13082DisDGDibCl = new String[] {""} ;
      T01MN3_A13083DisDGDibIn = new int[1] ;
      T01MN3_A13084DisDGComb = new String[] {""} ;
      T01MN3_A13085DisDGFondo = new String[] {""} ;
      T01MN3_A13086DisDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN3_A13087DisDGPzs = new int[1] ;
      T01MN3_A13088DisDGAnc = new short[1] ;
      T01MN3_A13091DisDGObs = new String[] {""} ;
      T01MN3_A396EmprCod = new String[] {""} ;
      T01MN2_A361DisCod = new int[1] ;
      T01MN2_A13081DisDGLin = new byte[1] ;
      T01MN2_A13082DisDGDibCl = new String[] {""} ;
      T01MN2_A13083DisDGDibIn = new int[1] ;
      T01MN2_A13084DisDGComb = new String[] {""} ;
      T01MN2_A13085DisDGFondo = new String[] {""} ;
      T01MN2_A13086DisDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN2_A13087DisDGPzs = new int[1] ;
      T01MN2_A13088DisDGAnc = new short[1] ;
      T01MN2_A13091DisDGObs = new String[] {""} ;
      T01MN2_A396EmprCod = new String[] {""} ;
      T01MN35_A396EmprCod = new String[] {""} ;
      T01MN35_A361DisCod = new int[1] ;
      T01MN35_A13081DisDGLin = new byte[1] ;
      T01MN35_A13082DisDGDibCl = new String[] {""} ;
      T01MN35_A13083DisDGDibIn = new int[1] ;
      T01MN35_A13084DisDGComb = new String[] {""} ;
      T01MN35_A13085DisDGFondo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01MN36_A407EmprNom = new String[] {""} ;
      T01MN36_n407EmprNom = new boolean[] {false} ;
      T01MN38_A13089DisDGSumMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MN38_A13090DisDGSumPz = new int[1] ;
      Z385DisPieMtr = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ385DisPieMtr = DecimalUtil.ZERO ;
      ZZ13089DisDGSumMt = DecimalUtil.ZERO ;
      ZO13089DisDGSumMt = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      ZV34DisArtcod = "" ;
      X631Metros = DecimalUtil.ZERO ;
      T01MN39_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      T01MN40_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdigcom__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdigcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdigcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdigcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdigcom__default(),
         new Object[] {
             new Object[] {
            T01MN2_A361DisCod, T01MN2_A13081DisDGLin, T01MN2_A13082DisDGDibCl, T01MN2_A13083DisDGDibIn, T01MN2_A13084DisDGComb, T01MN2_A13085DisDGFondo, T01MN2_A13086DisDGMts, T01MN2_A13087DisDGPzs, T01MN2_A13088DisDGAnc, T01MN2_A13091DisDGObs,
            T01MN2_A396EmprCod
            }
            , new Object[] {
            T01MN3_A361DisCod, T01MN3_A13081DisDGLin, T01MN3_A13082DisDGDibCl, T01MN3_A13083DisDGDibIn, T01MN3_A13084DisDGComb, T01MN3_A13085DisDGFondo, T01MN3_A13086DisDGMts, T01MN3_A13087DisDGPzs, T01MN3_A13088DisDGAnc, T01MN3_A13091DisDGObs,
            T01MN3_A396EmprCod
            }
            , new Object[] {
            T01MN4_A361DisCod, T01MN4_A13080DisDGUltli, T01MN4_A374DisNumPie, T01MN4_A396EmprCod, T01MN4_A365DisDes
            }
            , new Object[] {
            T01MN5_A361DisCod, T01MN5_A13080DisDGUltli, T01MN5_A374DisNumPie, T01MN5_A396EmprCod, T01MN5_A365DisDes
            }
            , new Object[] {
            T01MN6_A407EmprNom, T01MN6_n407EmprNom
            }
            , new Object[] {
            T01MN8_A13089DisDGSumMt, T01MN8_A13090DisDGSumPz
            }
            , new Object[] {
            T01MN10_A361DisCod, T01MN10_A407EmprNom, T01MN10_n407EmprNom, T01MN10_A13080DisDGUltli, T01MN10_A374DisNumPie, T01MN10_A396EmprCod, T01MN10_A13089DisDGSumMt, T01MN10_A13090DisDGSumPz, T01MN10_A365DisDes
            }
            , new Object[] {
            T01MN11_A396EmprCod, T01MN11_A361DisCod
            }
            , new Object[] {
            T01MN12_A396EmprCod, T01MN12_A361DisCod
            }
            , new Object[] {
            T01MN13_A396EmprCod, T01MN13_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MN17_A396EmprCod, T01MN17_A361DisCod, T01MN17_A13376DisTraID
            }
            , new Object[] {
            T01MN18_A396EmprCod, T01MN18_A361DisCod, T01MN18_A13213DisNormID
            }
            , new Object[] {
            T01MN19_A396EmprCod, T01MN19_A361DisCod, T01MN19_A7068DisNotLin
            }
            , new Object[] {
            T01MN20_A396EmprCod, T01MN20_A361DisCod, T01MN20_A10197ProEspCod
            }
            , new Object[] {
            T01MN21_A396EmprCod, T01MN21_A361DisCod, T01MN21_A4594AccCod
            }
            , new Object[] {
            T01MN22_A396EmprCod, T01MN22_A361DisCod, T01MN22_A2524DisComLin, T01MN22_A1056DisComCod, T01MN22_A1032FonCod
            }
            , new Object[] {
            T01MN23_A396EmprCod, T01MN23_A361DisCod, T01MN23_A3398DisRefBarC, T01MN23_A3399DisRefBCRe, T01MN23_A3400DisRefBCPa, T01MN23_A3607DisRefBPie
            }
            , new Object[] {
            T01MN24_A396EmprCod, T01MN24_A361DisCod, T01MN24_A376DisObsLin
            }
            , new Object[] {
            T01MN25_A396EmprCod, T01MN25_A361DisCod, T01MN25_A758ProCod
            }
            , new Object[] {
            T01MN26_A396EmprCod, T01MN26_A361DisCod, T01MN26_A833TipDefCod
            }
            , new Object[] {
            T01MN27_A396EmprCod, T01MN27_A361DisCod, T01MN27_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01MN29_A396EmprCod, T01MN29_A361DisCod
            }
            , new Object[] {
            T01MN30_A361DisCod, T01MN30_A13081DisDGLin, T01MN30_A13082DisDGDibCl, T01MN30_A13083DisDGDibIn, T01MN30_A13084DisDGComb, T01MN30_A13085DisDGFondo, T01MN30_A13086DisDGMts, T01MN30_A13087DisDGPzs, T01MN30_A13088DisDGAnc, T01MN30_A13091DisDGObs,
            T01MN30_A396EmprCod
            }
            , new Object[] {
            T01MN31_A396EmprCod, T01MN31_A361DisCod, T01MN31_A13081DisDGLin, T01MN31_A13082DisDGDibCl, T01MN31_A13083DisDGDibIn, T01MN31_A13084DisDGComb, T01MN31_A13085DisDGFondo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MN35_A396EmprCod, T01MN35_A361DisCod, T01MN35_A13081DisDGLin, T01MN35_A13082DisDGDibCl, T01MN35_A13083DisDGDibIn, T01MN35_A13084DisDGComb, T01MN35_A13085DisDGFondo
            }
            , new Object[] {
            T01MN36_A407EmprNom, T01MN36_n407EmprNom
            }
            , new Object[] {
            T01MN38_A13089DisDGSumMt, T01MN38_A13090DisDGSumPz
            }
            , new Object[] {
            T01MN39_A631Metros
            }
            , new Object[] {
            T01MN40_A384DisPieMet
            }
         }
      );
      Z361DisCod = 0 ;
      E361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TDIGCOM" ;
   }

   private byte Z13080DisDGUltli ;
   private byte O13080DisDGUltli ;
   private byte Z13081DisDGLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13080DisDGUltli ;
   private byte Gx_BScreen ;
   private byte B13080DisDGUltli ;
   private byte s13080DisDGUltli ;
   private byte A13081DisDGLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13080DisDGUltli ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ13080DisDGUltli ;
   private byte ZO13080DisDGUltli ;
   private short Z374DisNumPie ;
   private short Z13088DisDGAnc ;
   private short nRcdDeleted_1792 ;
   private short nRcdExists_1792 ;
   private short nIsMod_1792 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A374DisNumPie ;
   private short nBlankRcdCount1792 ;
   private short RcdFound1792 ;
   private short nBlankRcdUsr1792 ;
   private short A13088DisDGAnc ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_1792 ;
   private short ZZ374DisNumPie ;
   private int wcpOA361DisCod ;
   private int wcpOAV33Clicod ;
   private int Z361DisCod ;
   private int O13090DisDGSumPz ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z13083DisDGDibIn ;
   private int Z13087DisDGPzs ;
   private int O13087DisDGPzs ;
   private int AV33Clicod ;
   private int A13083DisDGDibIn ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDisDGUltli_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisDGSumMt_Enabled ;
   private int A13090DisDGSumPz ;
   private int edtDisDGSumPz_Enabled ;
   private int B13090DisDGSumPz ;
   private int edtavnRcdDeleted_1792_Enabled ;
   private int edtDisDGLin_Enabled ;
   private int edtDisDGDibCl_Enabled ;
   private int edtDisDGDibIn_Enabled ;
   private int edtDisDGComb_Enabled ;
   private int edtDisDGFondo_Enabled ;
   private int edtDisDGMts_Enabled ;
   private int edtDisDGPzs_Enabled ;
   private int edtDisDGAnc_Enabled ;
   private int edtDisDGObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s13090DisDGSumPz ;
   private int A13087DisDGPzs ;
   private int T13087DisDGPzs ;
   private int GX_JID ;
   private int Z13090DisDGSumPz ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDisDGFondo_Enabled ;
   private int defedtDisDGComb_Enabled ;
   private int defedtDisDGDibIn_Enabled ;
   private int defedtDisDGDibCl_Enabled ;
   private int defedtDisDGLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDisDGSumPz_Backcolor ;
   private int edtDisDGSumMt_Backcolor ;
   private int edtDisPieMtr_Backcolor ;
   private int edtDisNumPie_Backcolor ;
   private int edtDisDGUltli_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int ZZ13090DisDGSumPz ;
   private int ZO13090DisDGSumPz ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int ZV33Clicod ;
   private int E361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O13089DisDGSumMt ;
   private java.math.BigDecimal Z13086DisDGMts ;
   private java.math.BigDecimal O13086DisDGMts ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A13089DisDGSumMt ;
   private java.math.BigDecimal B13089DisDGSumMt ;
   private java.math.BigDecimal s13089DisDGSumMt ;
   private java.math.BigDecimal A13086DisDGMts ;
   private java.math.BigDecimal T13086DisDGMts ;
   private java.math.BigDecimal Z13089DisDGSumMt ;
   private java.math.BigDecimal Z385DisPieMtr ;
   private java.math.BigDecimal ZZ385DisPieMtr ;
   private java.math.BigDecimal ZZ13089DisDGSumMt ;
   private java.math.BigDecimal ZO13089DisDGSumMt ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV34DisArtcod ;
   private String Z396EmprCod ;
   private String Z365DisDes ;
   private String Z13082DisDGDibCl ;
   private String Z13084DisDGComb ;
   private String Z13085DisDGFondo ;
   private String Z13091DisDGObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV34DisArtcod ;
   private String A13082DisDGDibCl ;
   private String A13084DisDGComb ;
   private String A13085DisDGFondo ;
   private String Gx_msg ;
   private String A365DisDes ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDisDGUltli_Internalname ;
   private String edtDisDGUltli_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDisDGSumMt_Internalname ;
   private String edtDisDGSumMt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDisDGSumPz_Internalname ;
   private String edtDisDGSumPz_Jsonclick ;
   private String sMode1792 ;
   private String edtavnRcdDeleted_1792_Internalname ;
   private String edtDisDGLin_Internalname ;
   private String edtDisDGDibCl_Internalname ;
   private String edtDisDGDibIn_Internalname ;
   private String edtDisDGComb_Internalname ;
   private String edtDisDGFondo_Internalname ;
   private String edtDisDGMts_Internalname ;
   private String edtDisDGPzs_Internalname ;
   private String edtDisDGAnc_Internalname ;
   private String edtDisDGObs_Internalname ;
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
   private String AV37Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode34 ;
   private String GXCCtl ;
   private String A13091DisDGObs ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1792_Jsonclick ;
   private String edtDisDGLin_Jsonclick ;
   private String edtDisDGDibCl_Jsonclick ;
   private String edtDisDGDibIn_Jsonclick ;
   private String edtDisDGComb_Jsonclick ;
   private String edtDisDGFondo_Jsonclick ;
   private String edtDisDGMts_Jsonclick ;
   private String edtDisDGPzs_Jsonclick ;
   private String edtDisDGAnc_Jsonclick ;
   private String edtDisDGObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV34DisArtcod ;
   private String E396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01MN6_A407EmprNom ;
   private boolean[] T01MN6_n407EmprNom ;
   private java.math.BigDecimal[] T01MN8_A13089DisDGSumMt ;
   private int[] T01MN8_A13090DisDGSumPz ;
   private int[] T01MN10_A361DisCod ;
   private String[] T01MN10_A407EmprNom ;
   private boolean[] T01MN10_n407EmprNom ;
   private byte[] T01MN10_A13080DisDGUltli ;
   private short[] T01MN10_A374DisNumPie ;
   private String[] T01MN10_A396EmprCod ;
   private java.math.BigDecimal[] T01MN10_A13089DisDGSumMt ;
   private int[] T01MN10_A13090DisDGSumPz ;
   private String[] T01MN10_A365DisDes ;
   private String[] T01MN11_A396EmprCod ;
   private int[] T01MN11_A361DisCod ;
   private int[] T01MN5_A361DisCod ;
   private byte[] T01MN5_A13080DisDGUltli ;
   private short[] T01MN5_A374DisNumPie ;
   private String[] T01MN5_A396EmprCod ;
   private String[] T01MN5_A365DisDes ;
   private String[] T01MN12_A396EmprCod ;
   private int[] T01MN12_A361DisCod ;
   private String[] T01MN13_A396EmprCod ;
   private int[] T01MN13_A361DisCod ;
   private int[] T01MN4_A361DisCod ;
   private byte[] T01MN4_A13080DisDGUltli ;
   private short[] T01MN4_A374DisNumPie ;
   private String[] T01MN4_A396EmprCod ;
   private String[] T01MN4_A365DisDes ;
   private String[] T01MN17_A396EmprCod ;
   private int[] T01MN17_A361DisCod ;
   private String[] T01MN17_A13376DisTraID ;
   private String[] T01MN18_A396EmprCod ;
   private int[] T01MN18_A361DisCod ;
   private String[] T01MN18_A13213DisNormID ;
   private String[] T01MN19_A396EmprCod ;
   private int[] T01MN19_A361DisCod ;
   private byte[] T01MN19_A7068DisNotLin ;
   private String[] T01MN20_A396EmprCod ;
   private int[] T01MN20_A361DisCod ;
   private String[] T01MN20_A10197ProEspCod ;
   private String[] T01MN21_A396EmprCod ;
   private int[] T01MN21_A361DisCod ;
   private short[] T01MN21_A4594AccCod ;
   private String[] T01MN22_A396EmprCod ;
   private int[] T01MN22_A361DisCod ;
   private byte[] T01MN22_A2524DisComLin ;
   private String[] T01MN22_A1056DisComCod ;
   private String[] T01MN22_A1032FonCod ;
   private String[] T01MN23_A396EmprCod ;
   private int[] T01MN23_A361DisCod ;
   private int[] T01MN23_A3398DisRefBarC ;
   private byte[] T01MN23_A3399DisRefBCRe ;
   private String[] T01MN23_A3400DisRefBCPa ;
   private String[] T01MN23_A3607DisRefBPie ;
   private String[] T01MN24_A396EmprCod ;
   private int[] T01MN24_A361DisCod ;
   private byte[] T01MN24_A376DisObsLin ;
   private String[] T01MN25_A396EmprCod ;
   private int[] T01MN25_A361DisCod ;
   private String[] T01MN25_A758ProCod ;
   private String[] T01MN26_A396EmprCod ;
   private int[] T01MN26_A361DisCod ;
   private short[] T01MN26_A833TipDefCod ;
   private String[] T01MN27_A396EmprCod ;
   private int[] T01MN27_A361DisCod ;
   private int[] T01MN27_A44AlbRecCod ;
   private String[] T01MN29_A396EmprCod ;
   private int[] T01MN29_A361DisCod ;
   private int[] T01MN30_A361DisCod ;
   private byte[] T01MN30_A13081DisDGLin ;
   private String[] T01MN30_A13082DisDGDibCl ;
   private int[] T01MN30_A13083DisDGDibIn ;
   private String[] T01MN30_A13084DisDGComb ;
   private String[] T01MN30_A13085DisDGFondo ;
   private java.math.BigDecimal[] T01MN30_A13086DisDGMts ;
   private int[] T01MN30_A13087DisDGPzs ;
   private short[] T01MN30_A13088DisDGAnc ;
   private String[] T01MN30_A13091DisDGObs ;
   private String[] T01MN30_A396EmprCod ;
   private String[] T01MN31_A396EmprCod ;
   private int[] T01MN31_A361DisCod ;
   private byte[] T01MN31_A13081DisDGLin ;
   private String[] T01MN31_A13082DisDGDibCl ;
   private int[] T01MN31_A13083DisDGDibIn ;
   private String[] T01MN31_A13084DisDGComb ;
   private String[] T01MN31_A13085DisDGFondo ;
   private int[] T01MN3_A361DisCod ;
   private byte[] T01MN3_A13081DisDGLin ;
   private String[] T01MN3_A13082DisDGDibCl ;
   private int[] T01MN3_A13083DisDGDibIn ;
   private String[] T01MN3_A13084DisDGComb ;
   private String[] T01MN3_A13085DisDGFondo ;
   private java.math.BigDecimal[] T01MN3_A13086DisDGMts ;
   private int[] T01MN3_A13087DisDGPzs ;
   private short[] T01MN3_A13088DisDGAnc ;
   private String[] T01MN3_A13091DisDGObs ;
   private String[] T01MN3_A396EmprCod ;
   private int[] T01MN2_A361DisCod ;
   private byte[] T01MN2_A13081DisDGLin ;
   private String[] T01MN2_A13082DisDGDibCl ;
   private int[] T01MN2_A13083DisDGDibIn ;
   private String[] T01MN2_A13084DisDGComb ;
   private String[] T01MN2_A13085DisDGFondo ;
   private java.math.BigDecimal[] T01MN2_A13086DisDGMts ;
   private int[] T01MN2_A13087DisDGPzs ;
   private short[] T01MN2_A13088DisDGAnc ;
   private String[] T01MN2_A13091DisDGObs ;
   private String[] T01MN2_A396EmprCod ;
   private String[] T01MN35_A396EmprCod ;
   private int[] T01MN35_A361DisCod ;
   private byte[] T01MN35_A13081DisDGLin ;
   private String[] T01MN35_A13082DisDGDibCl ;
   private int[] T01MN35_A13083DisDGDibIn ;
   private String[] T01MN35_A13084DisDGComb ;
   private String[] T01MN35_A13085DisDGFondo ;
   private String[] T01MN36_A407EmprNom ;
   private boolean[] T01MN36_n407EmprNom ;
   private java.math.BigDecimal[] T01MN38_A13089DisDGSumMt ;
   private int[] T01MN38_A13090DisDGSumPz ;
   private java.math.BigDecimal[] T01MN39_A631Metros ;
   private java.math.BigDecimal[] T01MN40_A384DisPieMet ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdigcom__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdigcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01MN2", "SELECT DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo, DisDGMts, DisDGPzs, DisDGAnc, DisDGObs, EmprCod FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ? AND DisDGLin = ? AND DisDGDibCl = ? AND DisDGDibIn = ? AND DisDGComb = ? AND DisDGFondo = ?  FOR UPDATE OF DisDGMts, DisDGPzs, DisDGAnc, DisDGObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN3", "SELECT DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo, DisDGMts, DisDGPzs, DisDGAnc, DisDGObs, EmprCod FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ? AND DisDGLin = ? AND DisDGDibCl = ? AND DisDGDibIn = ? AND DisDGComb = ? AND DisDGFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN4", "SELECT DisCod, DisDGUltli, DisNumPie, EmprCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisDGUltli, DisNumPie, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN5", "SELECT DisCod, DisDGUltli, DisNumPie, EmprCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN8", "SELECT COALESCE( T1.DisDGSumMt, 0) AS DisDGSumMt, COALESCE( T1.DisDGSumPz, 0) AS DisDGSumPz FROM (SELECT SUM(DisDGMts) AS DisDGSumMt, EmprCod, DisCod, SUM(DisDGPzs) AS DisDGSumPz FROM TXPDIGCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN10", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.DisDGUltli, TM1.DisNumPie, TM1.EmprCod, COALESCE( T3.DisDGSumMt, 0) AS DisDGSumMt, COALESCE( T3.DisDGSumPz, 0) AS DisDGSumPz, TM1.DisDes FROM ((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DisDGMts) AS DisDGSumMt, EmprCod, DisCod, SUM(DisDGPzs) AS DisDGSumPz FROM TXPDIGCOM GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MN14", "INSERT INTO TXPDISPOS(DisCod, DisDGUltli, DisNumPie, EmprCod, DisDes, DisArtCod, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01MN15", "UPDATE TXPDISPOS SET DisDGUltli=?, DisNumPie=?, DisDes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01MN16", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01MN17", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN18", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN19", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN20", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN21", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN22", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN23", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN24", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN25", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN26", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN27", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MN28", "UPDATE TXPDISPOS SET DisDGUltli=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01MN29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MN30", "SELECT DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo, DisDGMts, DisDGPzs, DisDGAnc, DisDGObs, EmprCod FROM TXPDIGCOM WHERE EmprCod = ? and DisCod = ? and DisDGLin = ? and DisDGDibCl = ? and DisDGDibIn = ? and DisDGComb = ? and DisDGFondo = ? ORDER BY EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN31", "SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ? AND DisDGLin = ? AND DisDGDibCl = ? AND DisDGDibIn = ? AND DisDGComb = ? AND DisDGFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01MN32", "INSERT INTO TXPDIGCOM(DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo, DisDGMts, DisDGPzs, DisDGAnc, DisDGObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDIGCOM")
         ,new UpdateCursor("T01MN33", "UPDATE TXPDIGCOM SET DisDGMts=?, DisDGPzs=?, DisDGAnc=?, DisDGObs=?  WHERE EmprCod = ? AND DisCod = ? AND DisDGLin = ? AND DisDGDibCl = ? AND DisDGDibIn = ? AND DisDGComb = ? AND DisDGFondo = ?", GX_NOMASK, "TXPDIGCOM")
         ,new UpdateCursor("T01MN34", "DELETE FROM TXPDIGCOM  WHERE EmprCod = ? AND DisCod = ? AND DisDGLin = ? AND DisDGDibCl = ? AND DisDGDibIn = ? AND DisDGComb = ? AND DisDGFondo = ?", GX_NOMASK, "TXPDIGCOM")
         ,new ForEachCursor("T01MN35", "SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN38", "SELECT COALESCE( T1.DisDGSumMt, 0) AS DisDGSumMt, COALESCE( T1.DisDGSumPz, 0) AS DisDGSumPz FROM (SELECT SUM(DisDGMts) AS DisDGSumMt, EmprCod, DisCod, SUM(DisDGPzs) AS DisDGSumPz FROM TXPDIGCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN39", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MN40", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 70);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 70);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 12);
               stmt.setString(11, (String)parms[10], 12);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

