package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmacart_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action2") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_2_1J41686( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action3") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_3_1J41686( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12134MacArtHd = (int)(GXutil.lval( httpContext.GetPar( "MacArtHd"))) ;
         n12134MacArtHd = false ;
         A12135MacArtR = (byte)(GXutil.lval( httpContext.GetPar( "MacArtR"))) ;
         n12135MacArtR = false ;
         A12136MacArtP = httpContext.GetPar( "MacArtP") ;
         n12136MacArtP = false ;
         A12133MacArtDis = (int)(GXutil.lval( httpContext.GetPar( "MacArtDis"))) ;
         n12133MacArtDis = false ;
         AV30Err_hdr = (byte)(GXutil.lval( httpContext.GetPar( "Err_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1J41687( A396EmprCod, A12134MacArtHd, A12135MacArtR, A12136MacArtP, A12133MacArtDis, AV30Err_hdr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12139MacCodId = (int)(GXutil.lval( httpContext.GetPar( "MacCodId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         A12134MacArtHd = (int)(GXutil.lval( httpContext.GetPar( "MacArtHd"))) ;
         n12134MacArtHd = false ;
         A12135MacArtR = (byte)(GXutil.lval( httpContext.GetPar( "MacArtR"))) ;
         n12135MacArtR = false ;
         A12136MacArtP = httpContext.GetPar( "MacArtP") ;
         n12136MacArtP = false ;
         AV33Err_l = (byte)(GXutil.lval( httpContext.GetPar( "Err_l"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         AV34Msgl = httpContext.GetPar( "Msgl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
         A12140MacLinId = (short)(GXutil.lval( httpContext.GetPar( "MacLinId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1J41687( Gx_mode, A396EmprCod, A12139MacCodId, A12134MacArtHd, A12135MacArtR, A12136MacArtP, AV33Err_l, AV34Msgl, A12140MacLinId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12139MacCodId = (int)(GXutil.lval( httpContext.GetPar( "MacCodId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         A12134MacArtHd = (int)(GXutil.lval( httpContext.GetPar( "MacArtHd"))) ;
         n12134MacArtHd = false ;
         A12135MacArtR = (byte)(GXutil.lval( httpContext.GetPar( "MacArtR"))) ;
         n12135MacArtR = false ;
         A12136MacArtP = httpContext.GetPar( "MacArtP") ;
         n12136MacArtP = false ;
         AV35Err_le = (byte)(GXutil.lval( httpContext.GetPar( "Err_le"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_1J41687( Gx_mode, A396EmprCod, A12139MacCodId, A12134MacArtHd, A12135MacArtR, A12136MacArtP, AV35Err_le) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MACROS PARA ARTICULOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMacCodId_Internalname ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
      A12132MacArtUlt = (short)(GXutil.lval( httpContext.GetPar( "MacArtUlt"))) ;
      n12132MacArtUlt = false ;
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

   public tmacart_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmacart_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmacart_impl.class ));
   }

   public tmacart_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMACART.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Id", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacCodId_Internalname, GXutil.ltrim( localUtil.ntoc( A12139MacCodId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacCodId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12139MacCodId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12139MacCodId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacCodId_Jsonclick, 0, "", "", "", "", "", 1, edtMacCodId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ultima Linea Macro Articulos", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacArtUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A12132MacArtUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacArtUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12132MacArtUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12132MacArtUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacArtUlt_Jsonclick, 0, "", "", "", "", "", 1, edtMacArtUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMACART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1687 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1687 = (short)(1) ;
            scanStart1J41687( ) ;
            while ( RcdFound1687 != 0 )
            {
               init_level_properties1687( ) ;
               getByPrimaryKey1J41687( ) ;
               addRow1J41687( ) ;
               scanNext1J41687( ) ;
            }
            scanEnd1J41687( ) ;
            nBlankRcdCount1687 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12132MacArtUlt = A12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         standaloneNotModal1J41687( ) ;
         standaloneModal1J41687( ) ;
         sMode1687 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1J41687( ) ;
            edtavnRcdDeleted_1687_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1687_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1687_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1687_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacLinId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACLINID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacLinId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLinId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTDIS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtDis_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTHD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtHd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTKG_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtKg_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMacArtMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTMT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacArtMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtMt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1687 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J41687( ) ;
            }
            sendRow1J41687( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1687 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12132MacArtUlt = B12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1687 = (short)(5) ;
         nRcdExists_1687 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J41687( ) ;
            while ( RcdFound1687 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401687( ) ;
               init_level_properties1687( ) ;
               standaloneNotModal1J41687( ) ;
               getByPrimaryKey1J41687( ) ;
               standaloneModal1J41687( ) ;
               addRow1J41687( ) ;
               scanNext1J41687( ) ;
            }
            scanEnd1J41687( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1687 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401687( ) ;
      initAll1J41687( ) ;
      init_level_properties1687( ) ;
      B12132MacArtUlt = A12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      nRcdExists_1687 = (short)(0) ;
      nIsMod_1687 = (short)(0) ;
      nRcdDeleted_1687 = (short)(0) ;
      nBlankRcdCount1687 = (short)(nBlankRcdUsr1687+nBlankRcdCount1687) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1687 > 0 )
      {
         standaloneNotModal1J41687( ) ;
         standaloneModal1J41687( ) ;
         addRow1J41687( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMacLinId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1687 = (short)(nBlankRcdCount1687-1) ;
      }
      Gx_mode = sMode1687 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12132MacArtUlt = B12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMACART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMACART.htm");
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
      e111J42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12139MacCodId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12139MacCodId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12132MacArtUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12132MacArtUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12132MacArtUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O12132MacArtUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38MsgErr = httpContext.cgiGet( "vMSGERR") ;
            AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Err_hdr = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_HDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Msgl = httpContext.cgiGet( "vMSGL") ;
            AV33Err_l = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_L"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Err_le = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_LE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacCodId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacCodId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACCODID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacCodId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12139MacCodId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            }
            else
            {
               A12139MacCodId = (int)(localUtil.ctol( httpContext.cgiGet( edtMacCodId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            }
            A12132MacArtUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtMacArtUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12132MacArtUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A12139MacCodId = (int)(GXutil.lval( httpContext.GetPar( "MacCodId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
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
                     if ( GXutil.strcmp(sEvt, "'PROMPT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Prompt' */
                        e121J42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111J42 ();
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
            initAll1J41686( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1687_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1687_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1J41686( ) ;
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

   public void confirm_1J40( )
   {
      beforeValidate1J41686( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1J41686( ) ;
         }
         else
         {
            checkExtendedTable1J41686( ) ;
            if ( AnyError == 0 )
            {
               zm1J41686( 15) ;
            }
            closeExtendedTableCursors1J41686( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1686 = Gx_mode ;
         confirm_1J41687( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1686 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1686 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1J40( ) ;
      }
   }

   public void confirm_1J41687( )
   {
      s12132MacArtUlt = O12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1J41687( ) ;
         if ( ( nRcdExists_1687 != 0 ) || ( nIsMod_1687 != 0 ) )
         {
            getKey1J41687( ) ;
            if ( ( nRcdExists_1687 == 0 ) && ( nRcdDeleted_1687 == 0 ) )
            {
               if ( RcdFound1687 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J41687( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J41687( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J41687( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12132MacArtUlt = A12132MacArtUlt ;
                     n12132MacArtUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MACLINID_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMacLinId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1687 != 0 )
               {
                  if ( nRcdDeleted_1687 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J41687( ) ;
                     load1J41687( ) ;
                     beforeValidate1J41687( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J41687( ) ;
                        O12132MacArtUlt = A12132MacArtUlt ;
                        n12132MacArtUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1687 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J41687( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J41687( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J41687( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12132MacArtUlt = A12132MacArtUlt ;
                           n12132MacArtUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1687 == 0 )
                  {
                     GXCCtl = "MACLINID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacLinId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1687_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacLinId_Internalname, GXutil.ltrim( localUtil.ntoc( A12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtDis_Internalname, GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtHd_Internalname, GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtR_Internalname, GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtP_Internalname, GXutil.rtrim( A12136MacArtP)) ;
         httpContext.changePostValue( edtMacArtKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12140MacLinId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12133MacArtDis_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12134MacArtHd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12135MacArtR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12136MacArtP_"+sGXsfl_40_idx, GXutil.rtrim( Z12136MacArtP)) ;
         httpContext.changePostValue( "ZT_"+"Z12137MacArtKg_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12138MacArtMt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1687 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1687_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1687_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACLINID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLinId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTDIS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTKG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTMT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12132MacArtUlt = s12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1J40( )
   {
   }

   public void e111J42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tmacart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit0", AV17Lit0);
      GXt_char1 = AV20LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmacart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char1 = AV26Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV41Pgmname, (byte)(99), GXv_char2) ;
      tmacart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit20", AV26Lit20);
      GXt_char1 = AV31Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG009_", ""), (byte)(99), GXv_char2) ;
      tmacart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Msg1", AV31Msg1);
      AV19Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmacart_impl.this.A396EmprCod = GXv_char2[0] ;
      tmacart_impl.this.AV18EmprNom = GXv_char3[0] ;
      tmacart_impl.this.AV16UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprNom", AV18EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXt_int5 = AV39MacArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MACART", ""), GXv_int6) ;
      tmacart_impl.this.GXt_int5 = GXv_int6[0] ;
      AV39MacArt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39MacArt", GXutil.str( AV39MacArt, 1, 0));
      if ( AV39MacArt == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "FALTA crear contador MACART", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e121J42( )
   {
      /* 'Prompt' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1J41686( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12132MacArtUlt = T01J45_A12132MacArtUlt[0] ;
         }
         else
         {
            Z12132MacArtUlt = A12132MacArtUlt ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z12139MacCodId = A12139MacCodId ;
         Z12132MacArtUlt = A12132MacArtUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMacArtUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtUlt_Enabled), 5, 0), true);
      AV41Pgmname = "TMACART" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMacArtUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtUlt_Enabled), 5, 0), true);
      /* Using cursor T01J46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J46_A407EmprNom[0] ;
      n407EmprNom = T01J46_n407EmprNom[0] ;
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

   public void load1J41686( )
   {
      /* Using cursor T01J47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1686 = (short)(1) ;
         A12132MacArtUlt = T01J47_A12132MacArtUlt[0] ;
         n12132MacArtUlt = T01J47_n12132MacArtUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         A407EmprNom = T01J47_A407EmprNom[0] ;
         n407EmprNom = T01J47_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1J41686( -14) ;
      }
      pr_default.close(5);
      onLoadActions1J41686( ) ;
   }

   public void onLoadActions1J41686( )
   {
   }

   public void checkExtendedTable1J41686( )
   {
      nIsDirty_1686 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1J41686( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J41686( )
   {
      /* Using cursor T01J48 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1686 = (short)(1) ;
      }
      else
      {
         RcdFound1686 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01J45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01J45_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J41686( 14) ;
         RcdFound1686 = (short)(1) ;
         A12139MacCodId = T01J45_A12139MacCodId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         A12132MacArtUlt = T01J45_A12132MacArtUlt[0] ;
         n12132MacArtUlt = T01J45_n12132MacArtUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         O12132MacArtUlt = A12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z12139MacCodId = A12139MacCodId ;
         sMode1686 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J41686( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1686 = (short)(0) ;
            initializeNonKey1J41686( ) ;
         }
         Gx_mode = sMode1686 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1686 = (short)(0) ;
         initializeNonKey1J41686( ) ;
         sMode1686 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1686 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1J41686( ) ;
      if ( RcdFound1686 == 0 )
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
      RcdFound1686 = (short)(0) ;
      /* Using cursor T01J49 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A12139MacCodId), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01J49_A12139MacCodId[0] < A12139MacCodId ) ) && ( GXutil.strcmp(T01J49_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01J49_A12139MacCodId[0] > A12139MacCodId ) ) && ( GXutil.strcmp(T01J49_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12139MacCodId = T01J49_A12139MacCodId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            RcdFound1686 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1686 = (short)(0) ;
      /* Using cursor T01J410 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A12139MacCodId), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01J410_A12139MacCodId[0] > A12139MacCodId ) ) && ( GXutil.strcmp(T01J410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01J410_A12139MacCodId[0] < A12139MacCodId ) ) && ( GXutil.strcmp(T01J410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12139MacCodId = T01J410_A12139MacCodId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            RcdFound1686 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J41686( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12132MacArtUlt = O12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         GX_FocusControl = edtMacCodId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J41686( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1686 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12139MacCodId != Z12139MacCodId ) )
            {
               A12139MacCodId = Z12139MacCodId ;
               httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12132MacArtUlt = O12132MacArtUlt ;
               n12132MacArtUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMacCodId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12132MacArtUlt = O12132MacArtUlt ;
               n12132MacArtUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
               update1J41686( ) ;
               GX_FocusControl = edtMacCodId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12139MacCodId != Z12139MacCodId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12132MacArtUlt = O12132MacArtUlt ;
               n12132MacArtUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
               GX_FocusControl = edtMacCodId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J41686( ) ;
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
                  A12132MacArtUlt = O12132MacArtUlt ;
                  n12132MacArtUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
                  GX_FocusControl = edtMacCodId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J41686( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12139MacCodId != Z12139MacCodId ) )
      {
         A12139MacCodId = Z12139MacCodId ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12132MacArtUlt = O12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMacCodId_Internalname ;
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
      getKey1J41686( ) ;
      if ( RcdFound1686 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12139MacCodId != Z12139MacCodId ) )
         {
            A12139MacCodId = Z12139MacCodId ;
            httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12139MacCodId != Z12139MacCodId ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmacart");
   }

   public void insert_check( )
   {
      confirm_1J40( ) ;
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
      if ( RcdFound1686 == 0 )
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
      scanStart1J41686( ) ;
      if ( RcdFound1686 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1J41686( ) ;
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
      if ( RcdFound1686 == 0 )
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
      if ( RcdFound1686 == 0 )
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
      scanStart1J41686( ) ;
      if ( RcdFound1686 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1686 != 0 )
         {
            scanNext1J41686( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1J41686( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J41686( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMACART"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z12132MacArtUlt != T01J44_A12132MacArtUlt[0] ) )
         {
            if ( Z12132MacArtUlt != T01J44_A12132MacArtUlt[0] )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtUlt");
               GXutil.writeLogRaw("Old: ",Z12132MacArtUlt);
               GXutil.writeLogRaw("Current: ",T01J44_A12132MacArtUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMACART"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J41686( )
   {
      beforeValidate1J41686( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J41686( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J41686( 0) ;
         checkOptimisticConcurrency1J41686( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J41686( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J41686( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J411 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A12139MacCodId), Boolean.valueOf(n12132MacArtUlt), Short.valueOf(A12132MacArtUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACART");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel1J41686( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1J40( ) ;
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
            load1J41686( ) ;
         }
         endLevel1J41686( ) ;
      }
      closeExtendedTableCursors1J41686( ) ;
   }

   public void update1J41686( )
   {
      beforeValidate1J41686( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J41686( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J41686( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J41686( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J41686( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J412 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n12132MacArtUlt), Short.valueOf(A12132MacArtUlt), A396EmprCod, Integer.valueOf(A12139MacCodId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACART");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMACART"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J41686( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1J41686( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1J40( ) ;
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
         endLevel1J41686( ) ;
      }
      closeExtendedTableCursors1J41686( ) ;
   }

   public void deferredUpdate1J41686( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J41686( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J41686( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J41686( ) ;
         afterConfirm1J41686( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J41686( ) ;
            if ( AnyError == 0 )
            {
               A12132MacArtUlt = O12132MacArtUlt ;
               n12132MacArtUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
               scanStart1J41687( ) ;
               while ( RcdFound1687 != 0 )
               {
                  getByPrimaryKey1J41687( ) ;
                  delete1J41687( ) ;
                  scanNext1J41687( ) ;
                  O12132MacArtUlt = A12132MacArtUlt ;
                  n12132MacArtUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
               }
               scanEnd1J41687( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J413 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACART");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1686 == 0 )
                        {
                           initAll1J41686( ) ;
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
                        resetCaption1J40( ) ;
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
      sMode1686 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J41686( ) ;
      Gx_mode = sMode1686 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J41686( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1J41687( )
   {
      s12132MacArtUlt = O12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1J41687( ) ;
         if ( ( nRcdExists_1687 != 0 ) || ( nIsMod_1687 != 0 ) )
         {
            standaloneNotModal1J41687( ) ;
            getKey1J41687( ) ;
            if ( ( nRcdExists_1687 == 0 ) && ( nRcdDeleted_1687 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J41687( ) ;
            }
            else
            {
               if ( RcdFound1687 != 0 )
               {
                  if ( ( nRcdDeleted_1687 != 0 ) && ( nRcdExists_1687 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J41687( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1687 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J41687( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1687 == 0 )
                  {
                     GXCCtl = "MACLINID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacLinId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12132MacArtUlt = A12132MacArtUlt ;
            n12132MacArtUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1687_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacLinId_Internalname, GXutil.ltrim( localUtil.ntoc( A12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtDis_Internalname, GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtHd_Internalname, GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtR_Internalname, GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtP_Internalname, GXutil.rtrim( A12136MacArtP)) ;
         httpContext.changePostValue( edtMacArtKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacArtMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12140MacLinId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12133MacArtDis_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12134MacArtHd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12135MacArtR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12136MacArtP_"+sGXsfl_40_idx, GXutil.rtrim( Z12136MacArtP)) ;
         httpContext.changePostValue( "ZT_"+"Z12137MacArtKg_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12138MacArtMt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1687_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1687 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1687_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1687_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACLINID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLinId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTDIS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTKG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACARTMT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J41687( ) ;
      if ( AnyError != 0 )
      {
         O12132MacArtUlt = s12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      }
      nRcdExists_1687 = (short)(0) ;
      nIsMod_1687 = (short)(0) ;
      nRcdDeleted_1687 = (short)(0) ;
   }

   public void processLevel1J41686( )
   {
      /* Save parent mode. */
      sMode1686 = Gx_mode ;
      processNestedLevel1J41687( ) ;
      if ( AnyError != 0 )
      {
         O12132MacArtUlt = s12132MacArtUlt ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1686 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01J414 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n12132MacArtUlt), Short.valueOf(A12132MacArtUlt), A396EmprCod, Integer.valueOf(A12139MacCodId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACART");
   }

   public void endLevel1J41686( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1J41686( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmacart");
         if ( AnyError == 0 )
         {
            confirmValues1J40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmacart");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J41686( )
   {
      /* Scan By routine */
      /* Using cursor T01J415 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1686 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1686 = (short)(1) ;
         A12139MacCodId = T01J415_A12139MacCodId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J41686( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1686 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1686 = (short)(1) ;
         A12139MacCodId = T01J415_A12139MacCodId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
      }
   }

   public void scanEnd1J41686( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1J41686( )
   {
      /* After Confirm Rules */
      if ( (0==A12139MacCodId) && true /* Level */ && true /* After */ )
      {
         GXv_int7[0] = A12139MacCodId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MACART", ""), GXv_int7) ;
         tmacart_impl.this.A12139MacCodId = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
      }
      if ( ( A12139MacCodId > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "MACART", "") ;
         GXv_int7[0] = A12139MacCodId ;
         GXv_char2[0] = AV38MsgErr ;
         new app.pmacart(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_char2) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         tmacart_impl.this.A12139MacCodId = GXv_int7[0] ;
         tmacart_impl.this.AV38MsgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38MsgErr", AV38MsgErr);
      }
      if ( ( A12139MacCodId > 0 ) && true /* After */ && ( GXutil.strcmp(AV38MsgErr, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV38MsgErr, 1, "MACCODID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacCodId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1J41686( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J41686( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J41686( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J41686( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J41686( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J41686( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMacCodId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacCodId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCodId_Enabled), 5, 0), true);
      edtMacArtUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtUlt_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1J41687( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12133MacArtDis = T01J43_A12133MacArtDis[0] ;
            Z12134MacArtHd = T01J43_A12134MacArtHd[0] ;
            Z12135MacArtR = T01J43_A12135MacArtR[0] ;
            Z12136MacArtP = T01J43_A12136MacArtP[0] ;
            Z12137MacArtKg = T01J43_A12137MacArtKg[0] ;
            Z12138MacArtMt = T01J43_A12138MacArtMt[0] ;
         }
         else
         {
            Z12133MacArtDis = A12133MacArtDis ;
            Z12134MacArtHd = A12134MacArtHd ;
            Z12135MacArtR = A12135MacArtR ;
            Z12136MacArtP = A12136MacArtP ;
            Z12137MacArtKg = A12137MacArtKg ;
            Z12138MacArtMt = A12138MacArtMt ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z396EmprCod = A396EmprCod ;
         Z12139MacCodId = A12139MacCodId ;
         Z12140MacLinId = A12140MacLinId ;
         Z12133MacArtDis = A12133MacArtDis ;
         Z12134MacArtHd = A12134MacArtHd ;
         Z12135MacArtR = A12135MacArtR ;
         Z12136MacArtP = A12136MacArtP ;
         Z12137MacArtKg = A12137MacArtKg ;
         Z12138MacArtMt = A12138MacArtMt ;
      }
   }

   public void standaloneNotModal1J41687( )
   {
      edtMacArtUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtUlt_Enabled), 5, 0), true);
      edtMacArtUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1J41687( )
   {
      if ( isIns( )  )
      {
         A12132MacArtUlt = (short)(O12132MacArtUlt+1) ;
         n12132MacArtUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12140MacLinId = A12132MacArtUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMacLinId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacLinId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLinId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMacLinId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacLinId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLinId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1J41687( )
   {
      /* Using cursor T01J416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1687 = (short)(1) ;
         A12133MacArtDis = T01J416_A12133MacArtDis[0] ;
         n12133MacArtDis = T01J416_n12133MacArtDis[0] ;
         A12134MacArtHd = T01J416_A12134MacArtHd[0] ;
         n12134MacArtHd = T01J416_n12134MacArtHd[0] ;
         A12135MacArtR = T01J416_A12135MacArtR[0] ;
         n12135MacArtR = T01J416_n12135MacArtR[0] ;
         A12136MacArtP = T01J416_A12136MacArtP[0] ;
         n12136MacArtP = T01J416_n12136MacArtP[0] ;
         A12137MacArtKg = T01J416_A12137MacArtKg[0] ;
         n12137MacArtKg = T01J416_n12137MacArtKg[0] ;
         A12138MacArtMt = T01J416_A12138MacArtMt[0] ;
         n12138MacArtMt = T01J416_n12138MacArtMt[0] ;
         zm1J41687( -16) ;
      }
      pr_default.close(14);
      onLoadActions1J41687( ) ;
   }

   public void onLoadActions1J41687( )
   {
   }

   public void checkExtendedTable1J41687( )
   {
      nIsDirty_1687 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1J41687( ) ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int6[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int8[0] = A12133MacArtDis ;
         GXv_int9[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8, GXv_int9) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
         tmacart_impl.this.A12135MacArtR = GXv_int6[0] ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         tmacart_impl.this.A12133MacArtDis = GXv_int8[0] ;
         tmacart_impl.this.AV30Err_hdr = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV30Err_hdr == 0 ) )
      {
         GXCCtl = "MACARTP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(AV31Msg1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV33Err_l ;
         GXv_char2[0] = AV34Msgl ;
         new app.pmacar2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6, GXv_char2) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
         tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
         tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         tmacart_impl.this.AV33Err_l = GXv_int6[0] ;
         tmacart_impl.this.AV34Msgl = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      }
      if ( true /* Level */ && true /* After */ && ( AV33Err_l == 1 ) )
      {
         GXCCtl = "MACARTP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(AV34Msgl, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV35Err_le ;
         new app.pmacar3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
         tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
         tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         tmacart_impl.this.AV35Err_le = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV35Err_le == 1 ) )
      {
         GXCCtl = "MACARTP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ya existe esa linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1J41687( )
   {
   }

   public void enableDisable1J41687( )
   {
   }

   public void getKey1J41687( )
   {
      /* Using cursor T01J417 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1687 = (short)(1) ;
      }
      else
      {
         RcdFound1687 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1J41687( )
   {
      /* Using cursor T01J43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01J43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J41687( 16) ;
         RcdFound1687 = (short)(1) ;
         initializeNonKey1J41687( ) ;
         A12140MacLinId = T01J43_A12140MacLinId[0] ;
         A12133MacArtDis = T01J43_A12133MacArtDis[0] ;
         n12133MacArtDis = T01J43_n12133MacArtDis[0] ;
         A12134MacArtHd = T01J43_A12134MacArtHd[0] ;
         n12134MacArtHd = T01J43_n12134MacArtHd[0] ;
         A12135MacArtR = T01J43_A12135MacArtR[0] ;
         n12135MacArtR = T01J43_n12135MacArtR[0] ;
         A12136MacArtP = T01J43_A12136MacArtP[0] ;
         n12136MacArtP = T01J43_n12136MacArtP[0] ;
         A12137MacArtKg = T01J43_A12137MacArtKg[0] ;
         n12137MacArtKg = T01J43_n12137MacArtKg[0] ;
         A12138MacArtMt = T01J43_A12138MacArtMt[0] ;
         n12138MacArtMt = T01J43_n12138MacArtMt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z12139MacCodId = A12139MacCodId ;
         Z12140MacLinId = A12140MacLinId ;
         sMode1687 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J41687( ) ;
         load1J41687( ) ;
         Gx_mode = sMode1687 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1687 = (short)(0) ;
         initializeNonKey1J41687( ) ;
         sMode1687 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J41687( ) ;
         Gx_mode = sMode1687 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J41687( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1J41687( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMACAR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12133MacArtDis != T01J42_A12133MacArtDis[0] ) || ( Z12134MacArtHd != T01J42_A12134MacArtHd[0] ) || ( Z12135MacArtR != T01J42_A12135MacArtR[0] ) || ( GXutil.strcmp(Z12136MacArtP, T01J42_A12136MacArtP[0]) != 0 ) || ( DecimalUtil.compareTo(Z12137MacArtKg, T01J42_A12137MacArtKg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12138MacArtMt, T01J42_A12138MacArtMt[0]) != 0 ) )
         {
            if ( Z12133MacArtDis != T01J42_A12133MacArtDis[0] )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtDis");
               GXutil.writeLogRaw("Old: ",Z12133MacArtDis);
               GXutil.writeLogRaw("Current: ",T01J42_A12133MacArtDis[0]);
            }
            if ( Z12134MacArtHd != T01J42_A12134MacArtHd[0] )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtHd");
               GXutil.writeLogRaw("Old: ",Z12134MacArtHd);
               GXutil.writeLogRaw("Current: ",T01J42_A12134MacArtHd[0]);
            }
            if ( Z12135MacArtR != T01J42_A12135MacArtR[0] )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtR");
               GXutil.writeLogRaw("Old: ",Z12135MacArtR);
               GXutil.writeLogRaw("Current: ",T01J42_A12135MacArtR[0]);
            }
            if ( GXutil.strcmp(Z12136MacArtP, T01J42_A12136MacArtP[0]) != 0 )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtP");
               GXutil.writeLogRaw("Old: ",Z12136MacArtP);
               GXutil.writeLogRaw("Current: ",T01J42_A12136MacArtP[0]);
            }
            if ( DecimalUtil.compareTo(Z12137MacArtKg, T01J42_A12137MacArtKg[0]) != 0 )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtKg");
               GXutil.writeLogRaw("Old: ",Z12137MacArtKg);
               GXutil.writeLogRaw("Current: ",T01J42_A12137MacArtKg[0]);
            }
            if ( DecimalUtil.compareTo(Z12138MacArtMt, T01J42_A12138MacArtMt[0]) != 0 )
            {
               GXutil.writeLogln("tmacart:[seudo value changed for attri]"+"MacArtMt");
               GXutil.writeLogRaw("Old: ",Z12138MacArtMt);
               GXutil.writeLogRaw("Current: ",T01J42_A12138MacArtMt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMACAR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J41687( )
   {
      beforeValidate1J41687( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J41687( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J41687( 0) ;
         checkOptimisticConcurrency1J41687( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J41687( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J41687( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J418 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId), Boolean.valueOf(n12133MacArtDis), Integer.valueOf(A12133MacArtDis), Boolean.valueOf(n12134MacArtHd), Integer.valueOf(A12134MacArtHd), Boolean.valueOf(n12135MacArtR), Byte.valueOf(A12135MacArtR), Boolean.valueOf(n12136MacArtP), A12136MacArtP, Boolean.valueOf(n12137MacArtKg), A12137MacArtKg, Boolean.valueOf(n12138MacArtMt), A12138MacArtMt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACAR1");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load1J41687( ) ;
         }
         endLevel1J41687( ) ;
      }
      closeExtendedTableCursors1J41687( ) ;
   }

   public void update1J41687( )
   {
      beforeValidate1J41687( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J41687( ) ;
      }
      if ( ( nIsMod_1687 != 0 ) || ( nIsDirty_1687 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J41687( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J41687( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J41687( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J419 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n12133MacArtDis), Integer.valueOf(A12133MacArtDis), Boolean.valueOf(n12134MacArtHd), Integer.valueOf(A12134MacArtHd), Boolean.valueOf(n12135MacArtR), Byte.valueOf(A12135MacArtR), Boolean.valueOf(n12136MacArtP), A12136MacArtP, Boolean.valueOf(n12137MacArtKg), A12137MacArtKg, Boolean.valueOf(n12138MacArtMt), A12138MacArtMt, A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACAR1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMACAR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J41687( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J41687( ) ;
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
            endLevel1J41687( ) ;
         }
      }
      closeExtendedTableCursors1J41687( ) ;
   }

   public void deferredUpdate1J41687( )
   {
   }

   public void delete1J41687( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J41687( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J41687( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J41687( ) ;
         afterConfirm1J41687( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J41687( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J420 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId), Short.valueOf(A12140MacLinId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMACAR1");
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
      sMode1687 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J41687( ) ;
      Gx_mode = sMode1687 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J41687( )
   {
      standaloneModal1J41687( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A12139MacCodId ;
            GXv_int7[0] = A12134MacArtHd ;
            GXv_int9[0] = A12135MacArtR ;
            GXv_char3[0] = A12136MacArtP ;
            GXv_int6[0] = AV33Err_l ;
            GXv_char2[0] = AV34Msgl ;
            new app.pmacar2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6, GXv_char2) ;
            tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
            tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
            tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
            tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
            tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
            tmacart_impl.this.AV33Err_l = GXv_int6[0] ;
            tmacart_impl.this.AV34Msgl = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
         }
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A12139MacCodId ;
            GXv_int7[0] = A12134MacArtHd ;
            GXv_int9[0] = A12135MacArtR ;
            GXv_char3[0] = A12136MacArtP ;
            GXv_int6[0] = AV35Err_le ;
            new app.pmacar3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6) ;
            tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
            tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
            tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
            tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
            tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
            tmacart_impl.this.AV35Err_le = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
         }
      }
   }

   public void endLevel1J41687( )
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

   public void scanStart1J41687( )
   {
      /* Scan By routine */
      /* Using cursor T01J421 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A12139MacCodId)});
      RcdFound1687 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1687 = (short)(1) ;
         A12140MacLinId = T01J421_A12140MacLinId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J41687( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1687 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1687 = (short)(1) ;
         A12140MacLinId = T01J421_A12140MacLinId[0] ;
      }
   }

   public void scanEnd1J41687( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1J41687( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J41687( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J41687( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J41687( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J41687( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J41687( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J41687( )
   {
      edtMacLinId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacLinId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLinId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtDis_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtHd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtKg_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMacArtMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacArtMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacArtMt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1J41687( )
   {
   }

   public void send_integrity_lvl_hashes1J41686( )
   {
   }

   public void subsflControlProps_401687( )
   {
      edtavnRcdDeleted_1687_Internalname = "vNRCDDELETED_1687_"+sGXsfl_40_idx ;
      edtMacLinId_Internalname = "MACLINID_"+sGXsfl_40_idx ;
      edtMacArtDis_Internalname = "MACARTDIS_"+sGXsfl_40_idx ;
      edtMacArtHd_Internalname = "MACARTHD_"+sGXsfl_40_idx ;
      edtMacArtR_Internalname = "MACARTR_"+sGXsfl_40_idx ;
      edtMacArtP_Internalname = "MACARTP_"+sGXsfl_40_idx ;
      edtMacArtKg_Internalname = "MACARTKG_"+sGXsfl_40_idx ;
      edtMacArtMt_Internalname = "MACARTMT_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401687( )
   {
      edtavnRcdDeleted_1687_Internalname = "vNRCDDELETED_1687_"+sGXsfl_40_fel_idx ;
      edtMacLinId_Internalname = "MACLINID_"+sGXsfl_40_fel_idx ;
      edtMacArtDis_Internalname = "MACARTDIS_"+sGXsfl_40_fel_idx ;
      edtMacArtHd_Internalname = "MACARTHD_"+sGXsfl_40_fel_idx ;
      edtMacArtR_Internalname = "MACARTR_"+sGXsfl_40_fel_idx ;
      edtMacArtP_Internalname = "MACARTP_"+sGXsfl_40_fel_idx ;
      edtMacArtKg_Internalname = "MACARTKG_"+sGXsfl_40_fel_idx ;
      edtMacArtMt_Internalname = "MACARTMT_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1J41687( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401687( ) ;
      sendRow1J41687( ) ;
   }

   public void sendRow1J41687( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1687_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1687_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1687), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1687), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1687_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1687_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacLinId_Internalname,GXutil.ltrim( localUtil.ntoc( A12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12140MacLinId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacLinId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacLinId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtDis_Internalname,GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacArtDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12133MacArtDis), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12133MacArtDis), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtHd_Internalname,GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacArtHd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12134MacArtHd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12134MacArtHd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtHd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtHd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtR_Internalname,GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacArtR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12135MacArtR), "9") : localUtil.format( DecimalUtil.doubleToDec(A12135MacArtR), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtP_Internalname,GXutil.rtrim( A12136MacArtP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtKg_Internalname,GXutil.ltrim( localUtil.ntoc( A12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacArtKg_Enabled!=0) ? localUtil.format( A12137MacArtKg, "ZZZZZ9.99") : localUtil.format( A12137MacArtKg, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1687_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacArtMt_Internalname,GXutil.ltrim( localUtil.ntoc( A12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacArtMt_Enabled!=0) ? localUtil.format( A12138MacArtMt, "ZZZZZ9.99") : localUtil.format( A12138MacArtMt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacArtMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMacArtMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1J41687( ) ;
      GXCCtl = "Z12140MacLinId_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12140MacLinId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12133MacArtDis_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12133MacArtDis, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12134MacArtHd_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12134MacArtHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12135MacArtR_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12135MacArtR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12136MacArtP_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12136MacArtP));
      GXCCtl = "Z12137MacArtKg_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12137MacArtKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12138MacArtMt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12138MacArtMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1687_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1687_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1687_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1687, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1687_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1687_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACLINID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLinId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTDIS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTKG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACARTMT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1J41687( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401687( ) ;
      edtavnRcdDeleted_1687_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1687_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacLinId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACLINID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTDIS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTHD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTKG_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacArtMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACARTMT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1687_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1687_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1687");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1687_Internalname ;
         wbErr = true ;
         nRcdDeleted_1687 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1687 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1687_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacLinId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacLinId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MACLINID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacLinId_Internalname ;
         wbErr = true ;
         A12140MacLinId = (short)(0) ;
      }
      else
      {
         A12140MacLinId = (short)(localUtil.ctol( httpContext.cgiGet( edtMacLinId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MACARTDIS_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtDis_Internalname ;
         wbErr = true ;
         A12133MacArtDis = 0 ;
         n12133MacArtDis = false ;
      }
      else
      {
         A12133MacArtDis = (int)(localUtil.ctol( httpContext.cgiGet( edtMacArtDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12133MacArtDis = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MACARTHD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtHd_Internalname ;
         wbErr = true ;
         A12134MacArtHd = 0 ;
         n12134MacArtHd = false ;
      }
      else
      {
         A12134MacArtHd = (int)(localUtil.ctol( httpContext.cgiGet( edtMacArtHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12134MacArtHd = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "MACARTR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtR_Internalname ;
         wbErr = true ;
         A12135MacArtR = (byte)(0) ;
         n12135MacArtR = false ;
      }
      else
      {
         A12135MacArtR = (byte)(localUtil.ctol( httpContext.cgiGet( edtMacArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12135MacArtR = false ;
      }
      A12136MacArtP = httpContext.cgiGet( edtMacArtP_Internalname) ;
      n12136MacArtP = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacArtKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacArtKg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MACARTKG_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtKg_Internalname ;
         wbErr = true ;
         A12137MacArtKg = DecimalUtil.ZERO ;
         n12137MacArtKg = false ;
      }
      else
      {
         A12137MacArtKg = localUtil.ctond( httpContext.cgiGet( edtMacArtKg_Internalname)) ;
         n12137MacArtKg = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacArtMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacArtMt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MACARTMT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtMt_Internalname ;
         wbErr = true ;
         A12138MacArtMt = DecimalUtil.ZERO ;
         n12138MacArtMt = false ;
      }
      else
      {
         A12138MacArtMt = localUtil.ctond( httpContext.cgiGet( edtMacArtMt_Internalname)) ;
         n12138MacArtMt = false ;
      }
      GXCCtl = "Z12140MacLinId_" + sGXsfl_40_idx ;
      Z12140MacLinId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12133MacArtDis_" + sGXsfl_40_idx ;
      Z12133MacArtDis = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12134MacArtHd_" + sGXsfl_40_idx ;
      Z12134MacArtHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12135MacArtR_" + sGXsfl_40_idx ;
      Z12135MacArtR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12136MacArtP_" + sGXsfl_40_idx ;
      Z12136MacArtP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12137MacArtKg_" + sGXsfl_40_idx ;
      Z12137MacArtKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12138MacArtMt_" + sGXsfl_40_idx ;
      Z12138MacArtMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1687_" + sGXsfl_40_idx ;
      nRcdDeleted_1687 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1687_" + sGXsfl_40_idx ;
      nRcdExists_1687 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1687_" + sGXsfl_40_idx ;
      nIsMod_1687 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMacLinId_Enabled = edtMacLinId_Enabled ;
   }

   public void confirmValues1J40( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401687( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401687( ) ;
         httpContext.changePostValue( "Z12140MacLinId_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12140MacLinId_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12140MacLinId_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12133MacArtDis_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12133MacArtDis_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12133MacArtDis_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12134MacArtHd_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12134MacArtHd_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12134MacArtHd_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12135MacArtR_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12135MacArtR_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12135MacArtR_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12136MacArtP_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12136MacArtP_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12136MacArtP_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12137MacArtKg_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12137MacArtKg_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12137MacArtKg_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12138MacArtMt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12138MacArtMt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12138MacArtMt_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmacart", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12139MacCodId", GXutil.ltrim( localUtil.ntoc( Z12139MacCodId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12132MacArtUlt", GXutil.ltrim( localUtil.ntoc( Z12132MacArtUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12132MacArtUlt", GXutil.ltrim( localUtil.ntoc( O12132MacArtUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", GXutil.rtrim( AV38MsgErr));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_HDR", GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGL", GXutil.rtrim( AV34Msgl));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_L", GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_LE", GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmacart", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMACART" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MACROS PARA ARTICULOS", "") ;
   }

   public void initializeNonKey1J41686( )
   {
      AV38MsgErr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38MsgErr", AV38MsgErr);
      A12132MacArtUlt = (short)(0) ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      O12132MacArtUlt = A12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
      Z12132MacArtUlt = (short)(0) ;
   }

   public void initAll1J41686( )
   {
      A12139MacCodId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
      initializeNonKey1J41686( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1J41687( )
   {
      AV30Err_hdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      AV34Msgl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      AV33Err_l = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
      AV35Err_le = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      A12133MacArtDis = 0 ;
      n12133MacArtDis = false ;
      A12134MacArtHd = 0 ;
      n12134MacArtHd = false ;
      A12135MacArtR = (byte)(0) ;
      n12135MacArtR = false ;
      A12136MacArtP = "" ;
      n12136MacArtP = false ;
      A12137MacArtKg = DecimalUtil.ZERO ;
      n12137MacArtKg = false ;
      A12138MacArtMt = DecimalUtil.ZERO ;
      n12138MacArtMt = false ;
      Z12133MacArtDis = 0 ;
      Z12134MacArtHd = 0 ;
      Z12135MacArtR = (byte)(0) ;
      Z12136MacArtP = "" ;
      Z12137MacArtKg = DecimalUtil.ZERO ;
      Z12138MacArtMt = DecimalUtil.ZERO ;
   }

   public void initAll1J41687( )
   {
      A12140MacLinId = (short)(0) ;
      initializeNonKey1J41687( ) ;
   }

   public void standaloneModalInsert1J41687( )
   {
      A12132MacArtUlt = i12132MacArtUlt ;
      n12132MacArtUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12132MacArtUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241582518", true, true);
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
      httpContext.AddJavascriptSource("tmacart.js", "?20268241582518", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1687( )
   {
      edtMacLinId_Enabled = defedtMacLinId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacLinId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLinId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1687, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1687_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12140MacLinId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLinId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12136MacArtP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12137MacArtKg, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12138MacArtMt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacArtMt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMacCodId_Internalname = "MACCODID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMacArtUlt_Internalname = "MACARTULT" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1687_Internalname = "vNRCDDELETED_1687" ;
      edtMacLinId_Internalname = "MACLINID" ;
      edtMacArtDis_Internalname = "MACARTDIS" ;
      edtMacArtHd_Internalname = "MACARTHD" ;
      edtMacArtR_Internalname = "MACARTR" ;
      edtMacArtP_Internalname = "MACARTP" ;
      edtMacArtKg_Internalname = "MACARTKG" ;
      edtMacArtMt_Internalname = "MACARTMT" ;
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
      Form.setCaption( httpContext.getMessage( "MACROS PARA ARTICULOS", "") );
      edtMacArtMt_Jsonclick = "" ;
      edtMacArtKg_Jsonclick = "" ;
      edtMacArtP_Jsonclick = "" ;
      edtMacArtR_Jsonclick = "" ;
      edtMacArtHd_Jsonclick = "" ;
      edtMacArtDis_Jsonclick = "" ;
      edtMacLinId_Jsonclick = "" ;
      edtavnRcdDeleted_1687_Jsonclick = "" ;
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
      edtMacArtMt_Enabled = 1 ;
      edtMacArtKg_Enabled = 1 ;
      edtMacArtP_Enabled = 1 ;
      edtMacArtR_Enabled = 1 ;
      edtMacArtHd_Enabled = 1 ;
      edtMacArtDis_Enabled = 1 ;
      edtMacLinId_Enabled = 1 ;
      edtavnRcdDeleted_1687_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtMacArtUlt_Jsonclick = "" ;
      edtMacArtUlt_Backcolor = (int)(0xFFFFFF) ;
      edtMacArtUlt_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMacCodId_Jsonclick = "" ;
      edtMacCodId_Backcolor = (int)(0xFFFFFF) ;
      edtMacCodId_Enabled = 1 ;
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

   public void xc_2_1J41686( )
   {
      if ( (0==A12139MacCodId) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A12139MacCodId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MACART", ""), GXv_int8) ;
         A12139MacCodId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_3_1J41686( )
   {
      if ( ( A12139MacCodId > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "MACART", "") ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_char2[0] = AV38MsgErr ;
         new app.pmacart(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A12139MacCodId = GXv_int8[0] ;
         AV38MsgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38MsgErr", AV38MsgErr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_8_1J41687( String A396EmprCod ,
                             int A12134MacArtHd ,
                             byte A12135MacArtR ,
                             String A12136MacArtP ,
                             int A12133MacArtDis ,
                             byte AV30Err_hdr )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int7[0] = A12133MacArtDis ;
         GXv_int6[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A12134MacArtHd = GXv_int8[0] ;
         A12135MacArtR = GXv_int9[0] ;
         A12136MacArtP = GXv_char3[0] ;
         A12133MacArtDis = GXv_int7[0] ;
         AV30Err_hdr = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12136MacArtP))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_1J41687( String Gx_mode ,
                              String A396EmprCod ,
                              int A12139MacCodId ,
                              int A12134MacArtHd ,
                              byte A12135MacArtR ,
                              String A12136MacArtP ,
                              byte AV33Err_l ,
                              String AV34Msgl ,
                              short A12140MacLinId )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV33Err_l ;
         GXv_char2[0] = AV34Msgl ;
         new app.pmacar2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A12139MacCodId = GXv_int8[0] ;
         A12134MacArtHd = GXv_int7[0] ;
         A12135MacArtR = GXv_int9[0] ;
         A12136MacArtP = GXv_char3[0] ;
         AV33Err_l = GXv_int6[0] ;
         AV34Msgl = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12139MacCodId, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12136MacArtP))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Msgl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_1J41687( String Gx_mode ,
                              String A396EmprCod ,
                              int A12139MacCodId ,
                              int A12134MacArtHd ,
                              byte A12135MacArtR ,
                              String A12136MacArtP ,
                              byte AV35Err_le )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV35Err_le ;
         new app.pmacar3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A12139MacCodId = GXv_int8[0] ;
         A12134MacArtHd = GXv_int7[0] ;
         A12135MacArtR = GXv_int9[0] ;
         A12136MacArtP = GXv_char3[0] ;
         AV35Err_le = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12139MacCodId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12139MacCodId, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12136MacArtP))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_401687( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J41687( ) ;
         standaloneModal1J41687( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J41687( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401687( ) ;
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
      /* Using cursor T01J422 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J422_A407EmprNom[0] ;
      n407EmprNom = T01J422_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
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

   public void valid_Maccodid( )
   {
      n12132MacArtUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12132MacArtUlt", GXutil.ltrim( localUtil.ntoc( A12132MacArtUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12139MacCodId", GXutil.ltrim( localUtil.ntoc( Z12139MacCodId, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12132MacArtUlt", GXutil.ltrim( localUtil.ntoc( Z12132MacArtUlt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "O12132MacArtUlt", GXutil.ltrim( localUtil.ntoc( O12132MacArtUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Macartp( )
   {
      n12133MacArtDis = false ;
      n12135MacArtR = false ;
      n12134MacArtHd = false ;
      n12136MacArtP = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int7[0] = A12133MacArtDis ;
         GXv_int6[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int7, GXv_int6) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacart_impl.this.A12134MacArtHd = GXv_int8[0] ;
         A12134MacArtHd = this.A12134MacArtHd ;
         tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
         A12135MacArtR = this.A12135MacArtR ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         A12136MacArtP = this.A12136MacArtP ;
         tmacart_impl.this.A12133MacArtDis = GXv_int7[0] ;
         A12133MacArtDis = this.A12133MacArtDis ;
         tmacart_impl.this.AV30Err_hdr = GXv_int6[0] ;
         AV30Err_hdr = this.AV30Err_hdr ;
      }
      if ( true /* Level */ && true /* After */ && ( AV30Err_hdr == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV31Msg1, 1, "MACARTP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV33Err_l ;
         GXv_char2[0] = AV34Msgl ;
         new app.pmacar2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6, GXv_char2) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
         A12139MacCodId = this.A12139MacCodId ;
         tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
         A12134MacArtHd = this.A12134MacArtHd ;
         tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
         A12135MacArtR = this.A12135MacArtR ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         A12136MacArtP = this.A12136MacArtP ;
         tmacart_impl.this.AV33Err_l = GXv_int6[0] ;
         AV33Err_l = this.AV33Err_l ;
         tmacart_impl.this.AV34Msgl = GXv_char2[0] ;
         AV34Msgl = this.AV34Msgl ;
      }
      if ( true /* Level */ && true /* After */ && ( AV33Err_l == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV34Msgl, 1, "MACARTP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A12139MacCodId ;
         GXv_int7[0] = A12134MacArtHd ;
         GXv_int9[0] = A12135MacArtR ;
         GXv_char3[0] = A12136MacArtP ;
         GXv_int6[0] = AV35Err_le ;
         new app.pmacar3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int9, GXv_char3, GXv_int6) ;
         tmacart_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacart_impl.this.A12139MacCodId = GXv_int8[0] ;
         A12139MacCodId = this.A12139MacCodId ;
         tmacart_impl.this.A12134MacArtHd = GXv_int7[0] ;
         A12134MacArtHd = this.A12134MacArtHd ;
         tmacart_impl.this.A12135MacArtR = GXv_int9[0] ;
         A12135MacArtR = this.A12135MacArtR ;
         tmacart_impl.this.A12136MacArtP = GXv_char3[0] ;
         A12136MacArtP = this.A12136MacArtP ;
         tmacart_impl.this.AV35Err_le = GXv_int6[0] ;
         AV35Err_le = this.AV35Err_le ;
      }
      if ( true /* Level */ && true /* After */ && ( AV35Err_le == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ya existe esa linea", ""), 1, "MACARTP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacArtP_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12133MacArtDis", GXutil.ltrim( localUtil.ntoc( A12133MacArtDis, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", GXutil.rtrim( AV34Msgl));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12139MacCodId", GXutil.ltrim( localUtil.ntoc( A12139MacCodId, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12134MacArtHd", GXutil.ltrim( localUtil.ntoc( A12134MacArtHd, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12135MacArtR", GXutil.ltrim( localUtil.ntoc( A12135MacArtR, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12136MacArtP", GXutil.rtrim( A12136MacArtP));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("'PROMPT'","{handler:'e121J42',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12134MacArtHd',fld:'MACARTHD',pic:'ZZZZZZZ9'},{av:'A12135MacArtR',fld:'MACARTR',pic:'9'},{av:'A12136MacArtP',fld:'MACARTP',pic:''},{av:'A12133MacArtDis',fld:'MACARTDIS',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'PROMPT'",",oparms:[{av:'A12133MacArtDis',fld:'MACARTDIS',pic:'ZZZZZZZ9'},{av:'A12136MacArtP',fld:'MACARTP',pic:''},{av:'A12135MacArtR',fld:'MACARTR',pic:'9'},{av:'A12134MacArtHd',fld:'MACARTHD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MACCODID","{handler:'valid_Maccodid',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12132MacArtUlt',fld:'MACARTULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12139MacCodId',fld:'MACCODID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MACCODID",",oparms:[{av:'A12132MacArtUlt',fld:'MACARTULT',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12139MacCodId'},{av:'Z12132MacArtUlt'},{av:'Z407EmprNom'},{av:'O12132MacArtUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MACARTULT","{handler:'valid_Macartult',iparms:[]");
      setEventMetadata("VALID_MACARTULT",",oparms:[]}");
      setEventMetadata("VALID_MACLINID","{handler:'valid_Maclinid',iparms:[]");
      setEventMetadata("VALID_MACLINID",",oparms:[]}");
      setEventMetadata("VALID_MACARTP","{handler:'valid_Macartp',iparms:[{av:'A12140MacLinId',fld:'MACLINID',pic:'ZZZ9'},{av:'A12139MacCodId',fld:'MACCODID',pic:'ZZZZZZZ9'},{av:'A12133MacArtDis',fld:'MACARTDIS',pic:'ZZZZZZZ9'},{av:'A12135MacArtR',fld:'MACARTR',pic:'9'},{av:'A12134MacArtHd',fld:'MACARTHD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A12136MacArtP',fld:'MACARTP',pic:''},{av:'AV30Err_hdr',fld:'vERR_HDR',pic:'9'},{av:'AV34Msgl',fld:'vMSGL',pic:''},{av:'AV33Err_l',fld:'vERR_L',pic:'9'},{av:'AV35Err_le',fld:'vERR_LE',pic:'9'}]");
      setEventMetadata("VALID_MACARTP",",oparms:[{av:'A12133MacArtDis',fld:'MACARTDIS',pic:'ZZZZZZZ9'},{av:'AV30Err_hdr',fld:'vERR_HDR',pic:'9'},{av:'AV33Err_l',fld:'vERR_L',pic:'9'},{av:'AV34Msgl',fld:'vMSGL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12139MacCodId',fld:'MACCODID',pic:'ZZZZZZZ9'},{av:'A12134MacArtHd',fld:'MACARTHD',pic:'ZZZZZZZ9'},{av:'A12135MacArtR',fld:'MACARTR',pic:'9'},{av:'A12136MacArtP',fld:'MACARTP',pic:''},{av:'AV35Err_le',fld:'vERR_LE',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Macartmt',iparms:[]");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12136MacArtP = "" ;
      Z12137MacArtKg = DecimalUtil.ZERO ;
      Z12138MacArtMt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A12136MacArtP = "" ;
      Gx_mode = "" ;
      AV34Msgl = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1687 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV38MsgErr = "" ;
      AV41Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1686 = "" ;
      GXCCtl = "" ;
      A12137MacArtKg = DecimalUtil.ZERO ;
      A12138MacArtMt = DecimalUtil.ZERO ;
      AV17Lit0 = "" ;
      AV20LitFe = "" ;
      AV26Lit20 = "" ;
      AV31Msg1 = "" ;
      GXt_char1 = "" ;
      AV19Station = "" ;
      AV18EmprNom = "" ;
      AV16UsurCod = "" ;
      Z407EmprNom = "" ;
      T01J46_A407EmprNom = new String[] {""} ;
      T01J46_n407EmprNom = new boolean[] {false} ;
      T01J47_A12139MacCodId = new int[1] ;
      T01J47_A12132MacArtUlt = new short[1] ;
      T01J47_n12132MacArtUlt = new boolean[] {false} ;
      T01J47_A407EmprNom = new String[] {""} ;
      T01J47_n407EmprNom = new boolean[] {false} ;
      T01J47_A396EmprCod = new String[] {""} ;
      T01J48_A396EmprCod = new String[] {""} ;
      T01J48_A12139MacCodId = new int[1] ;
      T01J45_A12139MacCodId = new int[1] ;
      T01J45_A12132MacArtUlt = new short[1] ;
      T01J45_n12132MacArtUlt = new boolean[] {false} ;
      T01J45_A396EmprCod = new String[] {""} ;
      T01J49_A396EmprCod = new String[] {""} ;
      T01J49_A12139MacCodId = new int[1] ;
      T01J410_A396EmprCod = new String[] {""} ;
      T01J410_A12139MacCodId = new int[1] ;
      T01J44_A12139MacCodId = new int[1] ;
      T01J44_A12132MacArtUlt = new short[1] ;
      T01J44_n12132MacArtUlt = new boolean[] {false} ;
      T01J44_A396EmprCod = new String[] {""} ;
      T01J415_A396EmprCod = new String[] {""} ;
      T01J415_A12139MacCodId = new int[1] ;
      T01J416_A396EmprCod = new String[] {""} ;
      T01J416_A12139MacCodId = new int[1] ;
      T01J416_A12140MacLinId = new short[1] ;
      T01J416_A12133MacArtDis = new int[1] ;
      T01J416_n12133MacArtDis = new boolean[] {false} ;
      T01J416_A12134MacArtHd = new int[1] ;
      T01J416_n12134MacArtHd = new boolean[] {false} ;
      T01J416_A12135MacArtR = new byte[1] ;
      T01J416_n12135MacArtR = new boolean[] {false} ;
      T01J416_A12136MacArtP = new String[] {""} ;
      T01J416_n12136MacArtP = new boolean[] {false} ;
      T01J416_A12137MacArtKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J416_n12137MacArtKg = new boolean[] {false} ;
      T01J416_A12138MacArtMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J416_n12138MacArtMt = new boolean[] {false} ;
      T01J417_A396EmprCod = new String[] {""} ;
      T01J417_A12139MacCodId = new int[1] ;
      T01J417_A12140MacLinId = new short[1] ;
      T01J43_A396EmprCod = new String[] {""} ;
      T01J43_A12139MacCodId = new int[1] ;
      T01J43_A12140MacLinId = new short[1] ;
      T01J43_A12133MacArtDis = new int[1] ;
      T01J43_n12133MacArtDis = new boolean[] {false} ;
      T01J43_A12134MacArtHd = new int[1] ;
      T01J43_n12134MacArtHd = new boolean[] {false} ;
      T01J43_A12135MacArtR = new byte[1] ;
      T01J43_n12135MacArtR = new boolean[] {false} ;
      T01J43_A12136MacArtP = new String[] {""} ;
      T01J43_n12136MacArtP = new boolean[] {false} ;
      T01J43_A12137MacArtKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J43_n12137MacArtKg = new boolean[] {false} ;
      T01J43_A12138MacArtMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J43_n12138MacArtMt = new boolean[] {false} ;
      T01J42_A396EmprCod = new String[] {""} ;
      T01J42_A12139MacCodId = new int[1] ;
      T01J42_A12140MacLinId = new short[1] ;
      T01J42_A12133MacArtDis = new int[1] ;
      T01J42_n12133MacArtDis = new boolean[] {false} ;
      T01J42_A12134MacArtHd = new int[1] ;
      T01J42_n12134MacArtHd = new boolean[] {false} ;
      T01J42_A12135MacArtR = new byte[1] ;
      T01J42_n12135MacArtR = new boolean[] {false} ;
      T01J42_A12136MacArtP = new String[] {""} ;
      T01J42_n12136MacArtP = new boolean[] {false} ;
      T01J42_A12137MacArtKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J42_n12137MacArtKg = new boolean[] {false} ;
      T01J42_A12138MacArtMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J42_n12138MacArtMt = new boolean[] {false} ;
      T01J421_A396EmprCod = new String[] {""} ;
      T01J421_A12139MacCodId = new int[1] ;
      T01J421_A12140MacLinId = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01J422_A407EmprNom = new String[] {""} ;
      T01J422_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      ZV34Msgl = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmacart__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmacart__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmacart__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmacart__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmacart__default(),
         new Object[] {
             new Object[] {
            T01J42_A396EmprCod, T01J42_A12139MacCodId, T01J42_A12140MacLinId, T01J42_A12133MacArtDis, T01J42_n12133MacArtDis, T01J42_A12134MacArtHd, T01J42_n12134MacArtHd, T01J42_A12135MacArtR, T01J42_n12135MacArtR, T01J42_A12136MacArtP,
            T01J42_n12136MacArtP, T01J42_A12137MacArtKg, T01J42_n12137MacArtKg, T01J42_A12138MacArtMt, T01J42_n12138MacArtMt
            }
            , new Object[] {
            T01J43_A396EmprCod, T01J43_A12139MacCodId, T01J43_A12140MacLinId, T01J43_A12133MacArtDis, T01J43_n12133MacArtDis, T01J43_A12134MacArtHd, T01J43_n12134MacArtHd, T01J43_A12135MacArtR, T01J43_n12135MacArtR, T01J43_A12136MacArtP,
            T01J43_n12136MacArtP, T01J43_A12137MacArtKg, T01J43_n12137MacArtKg, T01J43_A12138MacArtMt, T01J43_n12138MacArtMt
            }
            , new Object[] {
            T01J44_A12139MacCodId, T01J44_A12132MacArtUlt, T01J44_n12132MacArtUlt, T01J44_A396EmprCod
            }
            , new Object[] {
            T01J45_A12139MacCodId, T01J45_A12132MacArtUlt, T01J45_n12132MacArtUlt, T01J45_A396EmprCod
            }
            , new Object[] {
            T01J46_A407EmprNom, T01J46_n407EmprNom
            }
            , new Object[] {
            T01J47_A12139MacCodId, T01J47_A12132MacArtUlt, T01J47_n12132MacArtUlt, T01J47_A407EmprNom, T01J47_n407EmprNom, T01J47_A396EmprCod
            }
            , new Object[] {
            T01J48_A396EmprCod, T01J48_A12139MacCodId
            }
            , new Object[] {
            T01J49_A396EmprCod, T01J49_A12139MacCodId
            }
            , new Object[] {
            T01J410_A396EmprCod, T01J410_A12139MacCodId
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
            T01J415_A396EmprCod, T01J415_A12139MacCodId
            }
            , new Object[] {
            T01J416_A396EmprCod, T01J416_A12139MacCodId, T01J416_A12140MacLinId, T01J416_A12133MacArtDis, T01J416_n12133MacArtDis, T01J416_A12134MacArtHd, T01J416_n12134MacArtHd, T01J416_A12135MacArtR, T01J416_n12135MacArtR, T01J416_A12136MacArtP,
            T01J416_n12136MacArtP, T01J416_A12137MacArtKg, T01J416_n12137MacArtKg, T01J416_A12138MacArtMt, T01J416_n12138MacArtMt
            }
            , new Object[] {
            T01J417_A396EmprCod, T01J417_A12139MacCodId, T01J417_A12140MacLinId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J421_A396EmprCod, T01J421_A12139MacCodId, T01J421_A12140MacLinId
            }
            , new Object[] {
            T01J422_A407EmprNom, T01J422_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "TMACART" ;
   }

   private byte Z12135MacArtR ;
   private byte GxWebError ;
   private byte A12135MacArtR ;
   private byte AV30Err_hdr ;
   private byte AV33Err_l ;
   private byte AV35Err_le ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV39MacArt ;
   private byte GXt_int5 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int9[] ;
   private byte GXv_int6[] ;
   private byte ZV30Err_hdr ;
   private byte ZV33Err_l ;
   private byte ZV35Err_le ;
   private short Z12132MacArtUlt ;
   private short O12132MacArtUlt ;
   private short Z12140MacLinId ;
   private short nRcdDeleted_1687 ;
   private short nRcdExists_1687 ;
   private short nIsMod_1687 ;
   private short A12140MacLinId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12132MacArtUlt ;
   private short nBlankRcdCount1687 ;
   private short RcdFound1687 ;
   private short B12132MacArtUlt ;
   private short nBlankRcdUsr1687 ;
   private short s12132MacArtUlt ;
   private short RcdFound1686 ;
   private short nIsDirty_1686 ;
   private short nIsDirty_1687 ;
   private short i12132MacArtUlt ;
   private short ZZ12132MacArtUlt ;
   private short ZO12132MacArtUlt ;
   private int Z12139MacCodId ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z12133MacArtDis ;
   private int Z12134MacArtHd ;
   private int A12134MacArtHd ;
   private int A12133MacArtDis ;
   private int A12139MacCodId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMacCodId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMacArtUlt_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1687_Enabled ;
   private int edtMacLinId_Enabled ;
   private int edtMacArtDis_Enabled ;
   private int edtMacArtHd_Enabled ;
   private int edtMacArtR_Enabled ;
   private int edtMacArtP_Enabled ;
   private int edtMacArtKg_Enabled ;
   private int edtMacArtMt_Enabled ;
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
   private int defedtMacLinId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMacArtUlt_Backcolor ;
   private int edtMacCodId_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ12139MacCodId ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12137MacArtKg ;
   private java.math.BigDecimal Z12138MacArtMt ;
   private java.math.BigDecimal A12137MacArtKg ;
   private java.math.BigDecimal A12138MacArtMt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12136MacArtP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A12136MacArtP ;
   private String Gx_mode ;
   private String AV34Msgl ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMacCodId_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtMacCodId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMacArtUlt_Internalname ;
   private String edtMacArtUlt_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1687 ;
   private String edtavnRcdDeleted_1687_Internalname ;
   private String edtMacLinId_Internalname ;
   private String edtMacArtDis_Internalname ;
   private String edtMacArtHd_Internalname ;
   private String edtMacArtR_Internalname ;
   private String edtMacArtP_Internalname ;
   private String edtMacArtKg_Internalname ;
   private String edtMacArtMt_Internalname ;
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
   private String AV38MsgErr ;
   private String AV41Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1686 ;
   private String GXCCtl ;
   private String AV17Lit0 ;
   private String AV20LitFe ;
   private String AV26Lit20 ;
   private String AV31Msg1 ;
   private String GXt_char1 ;
   private String AV19Station ;
   private String AV18EmprNom ;
   private String AV16UsurCod ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1687_Jsonclick ;
   private String edtMacLinId_Jsonclick ;
   private String edtMacArtDis_Jsonclick ;
   private String edtMacArtHd_Jsonclick ;
   private String edtMacArtR_Jsonclick ;
   private String edtMacArtP_Jsonclick ;
   private String edtMacArtKg_Jsonclick ;
   private String edtMacArtMt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV34Msgl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n12134MacArtHd ;
   private boolean n12135MacArtR ;
   private boolean n12136MacArtP ;
   private boolean n12133MacArtDis ;
   private boolean wbErr ;
   private boolean n12132MacArtUlt ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n12137MacArtKg ;
   private boolean n12138MacArtMt ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01J46_A407EmprNom ;
   private boolean[] T01J46_n407EmprNom ;
   private int[] T01J47_A12139MacCodId ;
   private short[] T01J47_A12132MacArtUlt ;
   private boolean[] T01J47_n12132MacArtUlt ;
   private String[] T01J47_A407EmprNom ;
   private boolean[] T01J47_n407EmprNom ;
   private String[] T01J47_A396EmprCod ;
   private String[] T01J48_A396EmprCod ;
   private int[] T01J48_A12139MacCodId ;
   private int[] T01J45_A12139MacCodId ;
   private short[] T01J45_A12132MacArtUlt ;
   private boolean[] T01J45_n12132MacArtUlt ;
   private String[] T01J45_A396EmprCod ;
   private String[] T01J49_A396EmprCod ;
   private int[] T01J49_A12139MacCodId ;
   private String[] T01J410_A396EmprCod ;
   private int[] T01J410_A12139MacCodId ;
   private int[] T01J44_A12139MacCodId ;
   private short[] T01J44_A12132MacArtUlt ;
   private boolean[] T01J44_n12132MacArtUlt ;
   private String[] T01J44_A396EmprCod ;
   private String[] T01J415_A396EmprCod ;
   private int[] T01J415_A12139MacCodId ;
   private String[] T01J416_A396EmprCod ;
   private int[] T01J416_A12139MacCodId ;
   private short[] T01J416_A12140MacLinId ;
   private int[] T01J416_A12133MacArtDis ;
   private boolean[] T01J416_n12133MacArtDis ;
   private int[] T01J416_A12134MacArtHd ;
   private boolean[] T01J416_n12134MacArtHd ;
   private byte[] T01J416_A12135MacArtR ;
   private boolean[] T01J416_n12135MacArtR ;
   private String[] T01J416_A12136MacArtP ;
   private boolean[] T01J416_n12136MacArtP ;
   private java.math.BigDecimal[] T01J416_A12137MacArtKg ;
   private boolean[] T01J416_n12137MacArtKg ;
   private java.math.BigDecimal[] T01J416_A12138MacArtMt ;
   private boolean[] T01J416_n12138MacArtMt ;
   private String[] T01J417_A396EmprCod ;
   private int[] T01J417_A12139MacCodId ;
   private short[] T01J417_A12140MacLinId ;
   private String[] T01J43_A396EmprCod ;
   private int[] T01J43_A12139MacCodId ;
   private short[] T01J43_A12140MacLinId ;
   private int[] T01J43_A12133MacArtDis ;
   private boolean[] T01J43_n12133MacArtDis ;
   private int[] T01J43_A12134MacArtHd ;
   private boolean[] T01J43_n12134MacArtHd ;
   private byte[] T01J43_A12135MacArtR ;
   private boolean[] T01J43_n12135MacArtR ;
   private String[] T01J43_A12136MacArtP ;
   private boolean[] T01J43_n12136MacArtP ;
   private java.math.BigDecimal[] T01J43_A12137MacArtKg ;
   private boolean[] T01J43_n12137MacArtKg ;
   private java.math.BigDecimal[] T01J43_A12138MacArtMt ;
   private boolean[] T01J43_n12138MacArtMt ;
   private String[] T01J42_A396EmprCod ;
   private int[] T01J42_A12139MacCodId ;
   private short[] T01J42_A12140MacLinId ;
   private int[] T01J42_A12133MacArtDis ;
   private boolean[] T01J42_n12133MacArtDis ;
   private int[] T01J42_A12134MacArtHd ;
   private boolean[] T01J42_n12134MacArtHd ;
   private byte[] T01J42_A12135MacArtR ;
   private boolean[] T01J42_n12135MacArtR ;
   private String[] T01J42_A12136MacArtP ;
   private boolean[] T01J42_n12136MacArtP ;
   private java.math.BigDecimal[] T01J42_A12137MacArtKg ;
   private boolean[] T01J42_n12137MacArtKg ;
   private java.math.BigDecimal[] T01J42_A12138MacArtMt ;
   private boolean[] T01J42_n12138MacArtMt ;
   private String[] T01J421_A396EmprCod ;
   private int[] T01J421_A12139MacCodId ;
   private short[] T01J421_A12140MacLinId ;
   private String[] T01J422_A407EmprNom ;
   private boolean[] T01J422_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmacart__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacart__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacart__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacart__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01J42", "SELECT EmprCod, MacCodId, MacLinId, MacArtDis, MacArtHd, MacArtR, MacArtP, MacArtKg, MacArtMt FROM TXPMACAR1 WHERE EmprCod = ? AND MacCodId = ? AND MacLinId = ?  FOR UPDATE OF MacArtDis, MacArtHd, MacArtR, MacArtP, MacArtKg, MacArtMt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J43", "SELECT EmprCod, MacCodId, MacLinId, MacArtDis, MacArtHd, MacArtR, MacArtP, MacArtKg, MacArtMt FROM TXPMACAR1 WHERE EmprCod = ? AND MacCodId = ? AND MacLinId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J44", "SELECT MacCodId, MacArtUlt, EmprCod FROM TXPMACART WHERE EmprCod = ? AND MacCodId = ?  FOR UPDATE OF MacArtUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J45", "SELECT MacCodId, MacArtUlt, EmprCod FROM TXPMACART WHERE EmprCod = ? AND MacCodId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J47", "SELECT /*+ FIRST_ROWS(100) */ TM1.MacCodId, TM1.MacArtUlt, T2.EmprNom, TM1.EmprCod FROM (TXPMACART TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MacCodId = ? ORDER BY TM1.EmprCod, TM1.MacCodId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J48", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCodId FROM TXPMACART WHERE EmprCod = ? AND MacCodId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J49", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCodId FROM TXPMACART WHERE ( MacCodId > ?) and EmprCod = ? ORDER BY EmprCod, MacCodId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCodId FROM TXPMACART WHERE ( MacCodId < ?) and EmprCod = ? ORDER BY EmprCod DESC, MacCodId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01J411", "INSERT INTO TXPMACART(MacCodId, MacArtUlt, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMACART")
         ,new UpdateCursor("T01J412", "UPDATE TXPMACART SET MacArtUlt=?  WHERE EmprCod = ? AND MacCodId = ?", GX_NOMASK, "TXPMACART")
         ,new UpdateCursor("T01J413", "DELETE FROM TXPMACART  WHERE EmprCod = ? AND MacCodId = ?", GX_NOMASK, "TXPMACART")
         ,new UpdateCursor("T01J414", "UPDATE TXPMACART SET MacArtUlt=?  WHERE EmprCod = ? AND MacCodId = ?", GX_NOMASK, "TXPMACART")
         ,new ForEachCursor("T01J415", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MacCodId FROM TXPMACART WHERE EmprCod = ? ORDER BY EmprCod, MacCodId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J416", "SELECT EmprCod, MacCodId, MacLinId, MacArtDis, MacArtHd, MacArtR, MacArtP, MacArtKg, MacArtMt FROM TXPMACAR1 WHERE EmprCod = ? and MacCodId = ? and MacLinId = ? ORDER BY EmprCod, MacCodId, MacLinId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J417", "SELECT EmprCod, MacCodId, MacLinId FROM TXPMACAR1 WHERE EmprCod = ? AND MacCodId = ? AND MacLinId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J418", "INSERT INTO TXPMACAR1(EmprCod, MacCodId, MacLinId, MacArtDis, MacArtHd, MacArtR, MacArtP, MacArtKg, MacArtMt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMACAR1")
         ,new UpdateCursor("T01J419", "UPDATE TXPMACAR1 SET MacArtDis=?, MacArtHd=?, MacArtR=?, MacArtP=?, MacArtKg=?, MacArtMt=?  WHERE EmprCod = ? AND MacCodId = ? AND MacLinId = ?", GX_NOMASK, "TXPMACAR1")
         ,new UpdateCursor("T01J420", "DELETE FROM TXPMACAR1  WHERE EmprCod = ? AND MacCodId = ? AND MacLinId = ?", GX_NOMASK, "TXPMACAR1")
         ,new ForEachCursor("T01J421", "SELECT EmprCod, MacCodId, MacLinId FROM TXPMACAR1 WHERE EmprCod = ? and MacCodId = ? ORDER BY EmprCod, MacCodId, MacLinId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J422", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 10 :
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setInt(5, ((Number) parms[6]).intValue());
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               return;
            case 17 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

