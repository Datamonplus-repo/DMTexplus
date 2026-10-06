package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcomdig_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DISPIEMTR") == 0 )
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
         gx2asadispiemtr1MJ34( A396EmprCod, A361DisCod, A365DisDes) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMBINACIONES DIGITAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisNumPie_Internalname ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A2525DisComULin = (byte)(GXutil.lval( httpContext.GetPar( "DisComULin"))) ;
      n2525DisComULin = false ;
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

   public tcomdig_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcomdig_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcomdig_impl.class ));
   }

   public tcomdig_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOMDIG.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima linea Combinacion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComULin_Internalname, GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComULin_Jsonclick, 0, "", "", "", "", "", 1, edtDisComULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Piezas", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Metros Combinaciones", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotNUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotNUni_Enabled!=0) ? localUtil.format( A1055TotNUni, "ZZZZZ9.99") : localUtil.format( A1055TotNUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotNUni_Jsonclick, 0, "", "", "", "", "", 1, edtTotNUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "TotNPie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOMDIG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotNPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotNPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1054TotNPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1054TotNPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotNPie_Jsonclick, 0, "", "", "", "", "", 1, edtTotNPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOMDIG.htm");
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
         nBlankRcdCount551 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_551 = (short)(1) ;
            scanStart1MJ551( ) ;
            while ( RcdFound551 != 0 )
            {
               init_level_properties551( ) ;
               getByPrimaryKey1MJ551( ) ;
               addRow1MJ551( ) ;
               scanNext1MJ551( ) ;
            }
            scanEnd1MJ551( ) ;
            nBlankRcdCount551 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         B1055TotNUni = A1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         B1054TotNPie = A1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         standaloneNotModal1MJ551( ) ;
         standaloneModal1MJ551( ) ;
         sMode551 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1MJ551( ) ;
            edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComDibC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMDIBC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComDibC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComDibC_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComDibI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMDIBI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComDibI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComDibI_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_551 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1MJ551( ) ;
            }
            sendRow1MJ551( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2525DisComULin = B2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1055TotNUni = B1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = B1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount551 = (short)(5) ;
         nRcdExists_551 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1MJ551( ) ;
            while ( RcdFound551 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60551( ) ;
               init_level_properties551( ) ;
               standaloneNotModal1MJ551( ) ;
               getByPrimaryKey1MJ551( ) ;
               standaloneModal1MJ551( ) ;
               addRow1MJ551( ) ;
               scanNext1MJ551( ) ;
            }
            scanEnd1MJ551( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode551 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60551( ) ;
      initAll1MJ551( ) ;
      init_level_properties551( ) ;
      B2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      B1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      B1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
      nBlankRcdCount551 = (short)(nBlankRcdUsr551+nBlankRcdCount551) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount551 > 0 )
      {
         standaloneNotModal1MJ551( ) ;
         standaloneModal1MJ551( ) ;
         addRow1MJ551( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisComLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount551 = (short)(nBlankRcdCount551-1) ;
      }
      Gx_mode = sMode551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A2525DisComULin = B2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A1055TotNUni = B1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      A1054TotNPie = B1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOMDIG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOMDIG.htm");
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z374DisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
         A365DisDes = httpContext.cgiGet( "Z365DisDes") ;
         O2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O1055TotNUni = localUtil.ctond( httpContext.cgiGet( "O1055TotNUni")) ;
         O1054TotNPie = (short)(localUtil.ctol( httpContext.cgiGet( "O1054TotNPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A374DisNumPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         }
         else
         {
            A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         }
         A1055TotNUni = localUtil.ctond( httpContext.cgiGet( edtTotNUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = (short)(localUtil.ctol( httpContext.cgiGet( edtTotNPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
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
            initAll1MJ34( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1MJ34( ) ;
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

   public void confirm_1MJ0( )
   {
      beforeValidate1MJ34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1MJ34( ) ;
         }
         else
         {
            checkExtendedTable1MJ34( ) ;
            if ( AnyError == 0 )
            {
               zm1MJ34( 9) ;
               zm1MJ34( 10) ;
            }
            closeExtendedTableCursors1MJ34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1MJ551( ) ;
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
         confirmValues1MJ0( ) ;
      }
   }

   public void confirm_1MJ551( )
   {
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      s1055TotNUni = O1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      s1054TotNPie = O1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1MJ551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            getKey1MJ551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               if ( RcdFound551 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1MJ551( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1MJ551( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1MJ551( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2525DisComULin = A2525DisComULin ;
                     n2525DisComULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                     O1055TotNUni = A1055TotNUni ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                     O1054TotNPie = A1054TotNPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DISCOMLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisComLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound551 != 0 )
               {
                  if ( nRcdDeleted_551 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1MJ551( ) ;
                     load1MJ551( ) ;
                     beforeValidate1MJ551( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1MJ551( ) ;
                        O2525DisComULin = A2525DisComULin ;
                        n2525DisComULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                        O1055TotNUni = A1055TotNUni ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                        O1054TotNPie = A1054TotNPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1MJ551( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1MJ551( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1MJ551( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2525DisComULin = A2525DisComULin ;
                           n2525DisComULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                           O1055TotNUni = A1055TotNUni ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                           O1054TotNPie = A1054TotNPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_551_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtDisComDibC_Internalname, GXutil.rtrim( A13072DisComDibC)) ;
         httpContext.changePostValue( edtDisComDibI_Internalname, GXutil.ltrim( localUtil.ntoc( A13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_60_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_60_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z13072DisComDibC_"+sGXsfl_60_idx, GXutil.rtrim( Z13072DisComDibC)) ;
         httpContext.changePostValue( "ZT_"+"Z13073DisComDibI_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_60_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1059DisComPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMDIBC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMDIBI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2525DisComULin = s2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      O1055TotNUni = s1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      O1054TotNPie = s1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1MJ0( )
   {
   }

   public void zm1MJ34( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2525DisComULin = T01MJ5_A2525DisComULin[0] ;
            Z374DisNumPie = T01MJ5_A374DisNumPie[0] ;
            Z365DisDes = T01MJ5_A365DisDes[0] ;
         }
         else
         {
            Z2525DisComULin = A2525DisComULin ;
            Z374DisNumPie = A374DisNumPie ;
            Z365DisDes = A365DisDes ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z361DisCod = A361DisCod ;
         Z2525DisComULin = A2525DisComULin ;
         Z374DisNumPie = A374DisNumPie ;
         Z396EmprCod = A396EmprCod ;
         Z365DisDes = A365DisDes ;
         Z407EmprNom = A407EmprNom ;
         Z1055TotNUni = A1055TotNUni ;
         Z1054TotNPie = A1054TotNPie ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      /* Using cursor T01MJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MJ6_A407EmprNom[0] ;
      n407EmprNom = T01MJ6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01MJ8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A1055TotNUni = T01MJ8_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = T01MJ8_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         A1055TotNUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
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

   public void load1MJ34( )
   {
      /* Using cursor T01MJ10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01MJ10_A407EmprNom[0] ;
         n407EmprNom = T01MJ10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2525DisComULin = T01MJ10_A2525DisComULin[0] ;
         n2525DisComULin = T01MJ10_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A374DisNumPie = T01MJ10_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A1055TotNUni = T01MJ10_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = T01MJ10_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A365DisDes = T01MJ10_A365DisDes[0] ;
         zm1MJ34( -8) ;
      }
      pr_default.close(6);
      onLoadActions1MJ34( ) ;
   }

   public void onLoadActions1MJ34( )
   {
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
   }

   public void checkExtendedTable1MJ34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1MJ34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1MJ34( )
   {
      /* Using cursor T01MJ11 */
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
      /* Using cursor T01MJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01MJ5_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01MJ5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MJ34( 8) ;
         RcdFound34 = (short)(1) ;
         A2525DisComULin = T01MJ5_A2525DisComULin[0] ;
         n2525DisComULin = T01MJ5_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A374DisNumPie = T01MJ5_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A365DisDes = T01MJ5_A365DisDes[0] ;
         O2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1MJ34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1MJ34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1MJ34( ) ;
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
      getKey1MJ34( ) ;
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
      /* Using cursor T01MJ12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MJ12_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01MJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MJ12_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01MJ13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MJ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MJ13_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MJ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MJ13_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1MJ34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1055TotNUni = O1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = O1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         GX_FocusControl = edtDisNumPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1MJ34( ) ;
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
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisNumPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               update1MJ34( ) ;
               GX_FocusControl = edtDisNumPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               GX_FocusControl = edtDisNumPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1MJ34( ) ;
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
                  A2525DisComULin = O2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  A1055TotNUni = O1055TotNUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                  A1054TotNPie = O1054TotNPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                  GX_FocusControl = edtDisNumPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1MJ34( ) ;
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
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1055TotNUni = O1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = O1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisNumPie_Internalname ;
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
      getKey1MJ34( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcomdig");
      GX_FocusControl = edtDisNumPie_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1MJ0( ) ;
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
      GX_FocusControl = edtDisNumPie_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1MJ34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisNumPie_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1MJ34( ) ;
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
      GX_FocusControl = edtDisNumPie_Internalname ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisNumPie_Internalname ;
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
      scanStart1MJ34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1MJ34( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisNumPie_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1MJ34( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1MJ34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z2525DisComULin != T01MJ4_A2525DisComULin[0] ) || ( Z374DisNumPie != T01MJ4_A374DisNumPie[0] ) || ( GXutil.strcmp(Z365DisDes, T01MJ4_A365DisDes[0]) != 0 ) )
         {
            if ( Z2525DisComULin != T01MJ4_A2525DisComULin[0] )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComULin");
               GXutil.writeLogRaw("Old: ",Z2525DisComULin);
               GXutil.writeLogRaw("Current: ",T01MJ4_A2525DisComULin[0]);
            }
            if ( Z374DisNumPie != T01MJ4_A374DisNumPie[0] )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisNumPie");
               GXutil.writeLogRaw("Old: ",Z374DisNumPie);
               GXutil.writeLogRaw("Current: ",T01MJ4_A374DisNumPie[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T01MJ4_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01MJ4_A365DisDes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MJ34( )
   {
      beforeValidate1MJ34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MJ34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MJ34( 0) ;
         checkOptimisticConcurrency1MJ34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MJ34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MJ34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MJ14 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Short.valueOf(A374DisNumPie), A396EmprCod, A365DisDes});
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
                        processLevel1MJ34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1MJ0( ) ;
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
            load1MJ34( ) ;
         }
         endLevel1MJ34( ) ;
      }
      closeExtendedTableCursors1MJ34( ) ;
   }

   public void update1MJ34( )
   {
      beforeValidate1MJ34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MJ34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MJ34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MJ34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1MJ34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MJ15 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Short.valueOf(A374DisNumPie), A365DisDes, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1MJ34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     tcomdig_impl.this.A396EmprCod = GXv_char1[0] ;
                     tcomdig_impl.this.A361DisCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MJ34( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1MJ0( ) ;
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
         endLevel1MJ34( ) ;
      }
      closeExtendedTableCursors1MJ34( ) ;
   }

   public void deferredUpdate1MJ34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MJ34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MJ34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MJ34( ) ;
         afterConfirm1MJ34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MJ34( ) ;
            if ( AnyError == 0 )
            {
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               scanStart1MJ551( ) ;
               while ( RcdFound551 != 0 )
               {
                  getByPrimaryKey1MJ551( ) ;
                  delete1MJ551( ) ;
                  scanNext1MJ551( ) ;
                  O2525DisComULin = A2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  O1055TotNUni = A1055TotNUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                  O1054TotNPie = A1054TotNPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               }
               scanEnd1MJ551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MJ16 */
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
                           initAll1MJ34( ) ;
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
                        resetCaption1MJ0( ) ;
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
      endLevel1MJ34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MJ34( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01MJ17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01MJ18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01MJ19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01MJ20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01MJ21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01MJ22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01MJ23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01MJ24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01MJ25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01MJ26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01MJ27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1MJ551( )
   {
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      s1055TotNUni = O1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      s1054TotNPie = O1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1MJ551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            standaloneNotModal1MJ551( ) ;
            getKey1MJ551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1MJ551( ) ;
            }
            else
            {
               if ( RcdFound551 != 0 )
               {
                  if ( ( nRcdDeleted_551 != 0 ) && ( nRcdExists_551 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1MJ551( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1MJ551( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2525DisComULin = A2525DisComULin ;
            n2525DisComULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
            O1055TotNUni = A1055TotNUni ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            O1054TotNPie = A1054TotNPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_551_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtDisComDibC_Internalname, GXutil.rtrim( A13072DisComDibC)) ;
         httpContext.changePostValue( edtDisComDibI_Internalname, GXutil.ltrim( localUtil.ntoc( A13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_60_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_60_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z13072DisComDibC_"+sGXsfl_60_idx, GXutil.rtrim( Z13072DisComDibC)) ;
         httpContext.changePostValue( "ZT_"+"Z13073DisComDibI_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_60_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1059DisComPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMDIBC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMDIBI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1MJ551( ) ;
      if ( AnyError != 0 )
      {
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         O1055TotNUni = s1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         O1054TotNPie = s1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
   }

   public void processLevel1MJ34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1MJ551( ) ;
      if ( AnyError != 0 )
      {
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         O1055TotNUni = s1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         O1054TotNPie = s1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01MJ28 */
      pr_default.execute(24, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
   }

   public void endLevel1MJ34( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1MJ34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcomdig");
         if ( AnyError == 0 )
         {
            confirmValues1MJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcomdig");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1MJ34( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A361DisCod = A361DisCod ;
      /* Scan By routine */
      /* Using cursor T01MJ29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MJ34( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1MJ34( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1MJ34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MJ34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MJ34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MJ34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MJ34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MJ34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MJ34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDisPieMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMtr_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtTotNUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotNUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotNUni_Enabled), 5, 0), true);
      edtTotNPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotNPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotNPie_Enabled), 5, 0), true);
   }

   public void zm1MJ551( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13072DisComDibC = T01MJ3_A13072DisComDibC[0] ;
            Z13073DisComDibI = T01MJ3_A13073DisComDibI[0] ;
            Z1059DisComPie = T01MJ3_A1059DisComPie[0] ;
            Z1058DisComMtr = T01MJ3_A1058DisComMtr[0] ;
            Z1057DisComAnh = T01MJ3_A1057DisComAnh[0] ;
            Z7735DisComObs = T01MJ3_A7735DisComObs[0] ;
         }
         else
         {
            Z13072DisComDibC = A13072DisComDibC ;
            Z13073DisComDibI = A13073DisComDibI ;
            Z1059DisComPie = A1059DisComPie ;
            Z1058DisComMtr = A1058DisComMtr ;
            Z1057DisComAnh = A1057DisComAnh ;
            Z7735DisComObs = A7735DisComObs ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z13072DisComDibC = A13072DisComDibC ;
         Z13073DisComDibI = A13073DisComDibI ;
         Z1059DisComPie = A1059DisComPie ;
         Z1058DisComMtr = A1058DisComMtr ;
         Z1057DisComAnh = A1057DisComAnh ;
         Z7735DisComObs = A7735DisComObs ;
         Z396EmprCod = A396EmprCod ;
         Z1032FonCod = A1032FonCod ;
      }
   }

   public void standaloneNotModal1MJ551( )
   {
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
   }

   public void standaloneModal1MJ551( )
   {
      if ( isIns( )  )
      {
         A2525DisComULin = (byte)(O2525DisComULin+1) ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2524DisComLin = A2525DisComULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFonCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtFonCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1MJ551( )
   {
      /* Using cursor T01MJ30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A13072DisComDibC = T01MJ30_A13072DisComDibC[0] ;
         n13072DisComDibC = T01MJ30_n13072DisComDibC[0] ;
         A13073DisComDibI = T01MJ30_A13073DisComDibI[0] ;
         n13073DisComDibI = T01MJ30_n13073DisComDibI[0] ;
         A1059DisComPie = T01MJ30_A1059DisComPie[0] ;
         n1059DisComPie = T01MJ30_n1059DisComPie[0] ;
         A1058DisComMtr = T01MJ30_A1058DisComMtr[0] ;
         n1058DisComMtr = T01MJ30_n1058DisComMtr[0] ;
         A1057DisComAnh = T01MJ30_A1057DisComAnh[0] ;
         n1057DisComAnh = T01MJ30_n1057DisComAnh[0] ;
         A7735DisComObs = T01MJ30_A7735DisComObs[0] ;
         n7735DisComObs = T01MJ30_n7735DisComObs[0] ;
         zm1MJ551( -11) ;
      }
      pr_default.close(26);
      onLoadActions1MJ551( ) ;
   }

   public void onLoadActions1MJ551( )
   {
      if ( isIns( )  )
      {
         A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1MJ551( )
   {
      nIsDirty_551 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1MJ551( ) ;
      if ( isIns( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_551 = (short)(1) ;
               A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_551 = (short)(1) ;
               A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1MJ551( )
   {
   }

   public void enableDisable1MJ551( )
   {
   }

   public void getKey1MJ551( )
   {
      /* Using cursor T01MJ31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound551 = (short)(1) ;
      }
      else
      {
         RcdFound551 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1MJ551( )
   {
      /* Using cursor T01MJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01MJ3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01MJ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MJ551( 11) ;
         RcdFound551 = (short)(1) ;
         initializeNonKey1MJ551( ) ;
         A2524DisComLin = T01MJ3_A2524DisComLin[0] ;
         A1056DisComCod = T01MJ3_A1056DisComCod[0] ;
         A13072DisComDibC = T01MJ3_A13072DisComDibC[0] ;
         n13072DisComDibC = T01MJ3_n13072DisComDibC[0] ;
         A13073DisComDibI = T01MJ3_A13073DisComDibI[0] ;
         n13073DisComDibI = T01MJ3_n13073DisComDibI[0] ;
         A1059DisComPie = T01MJ3_A1059DisComPie[0] ;
         n1059DisComPie = T01MJ3_n1059DisComPie[0] ;
         A1058DisComMtr = T01MJ3_A1058DisComMtr[0] ;
         n1058DisComMtr = T01MJ3_n1058DisComMtr[0] ;
         A1057DisComAnh = T01MJ3_A1057DisComAnh[0] ;
         n1057DisComAnh = T01MJ3_n1057DisComAnh[0] ;
         A7735DisComObs = T01MJ3_A7735DisComObs[0] ;
         n7735DisComObs = T01MJ3_n7735DisComObs[0] ;
         A1032FonCod = T01MJ3_A1032FonCod[0] ;
         O1058DisComMtr = A1058DisComMtr ;
         n1058DisComMtr = false ;
         O1059DisComPie = A1059DisComPie ;
         n1059DisComPie = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MJ551( ) ;
         load1MJ551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound551 = (short)(0) ;
         initializeNonKey1MJ551( ) ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MJ551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1MJ551( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1MJ551( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13072DisComDibC, T01MJ2_A13072DisComDibC[0]) != 0 ) || ( Z13073DisComDibI != T01MJ2_A13073DisComDibI[0] ) || ( Z1059DisComPie != T01MJ2_A1059DisComPie[0] ) || ( DecimalUtil.compareTo(Z1058DisComMtr, T01MJ2_A1058DisComMtr[0]) != 0 ) || ( Z1057DisComAnh != T01MJ2_A1057DisComAnh[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7735DisComObs, T01MJ2_A7735DisComObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13072DisComDibC, T01MJ2_A13072DisComDibC[0]) != 0 )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComDibC");
               GXutil.writeLogRaw("Old: ",Z13072DisComDibC);
               GXutil.writeLogRaw("Current: ",T01MJ2_A13072DisComDibC[0]);
            }
            if ( Z13073DisComDibI != T01MJ2_A13073DisComDibI[0] )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComDibI");
               GXutil.writeLogRaw("Old: ",Z13073DisComDibI);
               GXutil.writeLogRaw("Current: ",T01MJ2_A13073DisComDibI[0]);
            }
            if ( Z1059DisComPie != T01MJ2_A1059DisComPie[0] )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComPie");
               GXutil.writeLogRaw("Old: ",Z1059DisComPie);
               GXutil.writeLogRaw("Current: ",T01MJ2_A1059DisComPie[0]);
            }
            if ( DecimalUtil.compareTo(Z1058DisComMtr, T01MJ2_A1058DisComMtr[0]) != 0 )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComMtr");
               GXutil.writeLogRaw("Old: ",Z1058DisComMtr);
               GXutil.writeLogRaw("Current: ",T01MJ2_A1058DisComMtr[0]);
            }
            if ( Z1057DisComAnh != T01MJ2_A1057DisComAnh[0] )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComAnh");
               GXutil.writeLogRaw("Old: ",Z1057DisComAnh);
               GXutil.writeLogRaw("Current: ",T01MJ2_A1057DisComAnh[0]);
            }
            if ( GXutil.strcmp(Z7735DisComObs, T01MJ2_A7735DisComObs[0]) != 0 )
            {
               GXutil.writeLogln("tcomdig:[seudo value changed for attri]"+"DisComObs");
               GXutil.writeLogRaw("Old: ",Z7735DisComObs);
               GXutil.writeLogRaw("Current: ",T01MJ2_A7735DisComObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MJ551( )
   {
      beforeValidate1MJ551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MJ551( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MJ551( 0) ;
         checkOptimisticConcurrency1MJ551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MJ551( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MJ551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MJ32 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, Boolean.valueOf(n13072DisComDibC), A13072DisComDibC, Boolean.valueOf(n13073DisComDibI), Integer.valueOf(A13073DisComDibI), Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
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
            load1MJ551( ) ;
         }
         endLevel1MJ551( ) ;
      }
      closeExtendedTableCursors1MJ551( ) ;
   }

   public void update1MJ551( )
   {
      beforeValidate1MJ551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MJ551( ) ;
      }
      if ( ( nIsMod_551 != 0 ) || ( nIsDirty_551 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1MJ551( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1MJ551( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1MJ551( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01MJ33 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n13072DisComDibC), A13072DisComDibC, Boolean.valueOf(n13073DisComDibI), Integer.valueOf(A13073DisComDibI), Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1MJ551( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char1[0] = A396EmprCod ;
                        GXv_int2[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                        tcomdig_impl.this.A396EmprCod = GXv_char1[0] ;
                        tcomdig_impl.this.A361DisCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1MJ551( ) ;
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
            endLevel1MJ551( ) ;
         }
      }
      closeExtendedTableCursors1MJ551( ) ;
   }

   public void deferredUpdate1MJ551( )
   {
   }

   public void delete1MJ551( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MJ551( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MJ551( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MJ551( ) ;
         afterConfirm1MJ551( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MJ551( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01MJ34 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
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
      sMode551 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MJ551( ) ;
      Gx_mode = sMode551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MJ551( )
   {
      standaloneModal1MJ551( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               }
            }
         }
      }
   }

   public void endLevel1MJ551( )
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

   public void scanStart1MJ551( )
   {
      /* Scan By routine */
      /* Using cursor T01MJ35 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T01MJ35_A2524DisComLin[0] ;
         A1056DisComCod = T01MJ35_A1056DisComCod[0] ;
         A1032FonCod = T01MJ35_A1032FonCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MJ551( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T01MJ35_A2524DisComLin[0] ;
         A1056DisComCod = T01MJ35_A1056DisComCod[0] ;
         A1032FonCod = T01MJ35_A1032FonCod[0] ;
      }
   }

   public void scanEnd1MJ551( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1MJ551( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MJ551( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MJ551( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MJ551( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MJ551( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MJ551( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MJ551( )
   {
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComDibC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComDibC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComDibC_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComDibI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComDibI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComDibI_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1MJ551( )
   {
   }

   public void send_integrity_lvl_hashes1MJ34( )
   {
   }

   public void subsflControlProps_60551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_60_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_60_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_60_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_60_idx ;
      edtDisComDibC_Internalname = "DISCOMDIBC_"+sGXsfl_60_idx ;
      edtDisComDibI_Internalname = "DISCOMDIBI_"+sGXsfl_60_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_60_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_60_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_60_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_60_fel_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_60_fel_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_60_fel_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_60_fel_idx ;
      edtDisComDibC_Internalname = "DISCOMDIBC_"+sGXsfl_60_fel_idx ;
      edtDisComDibI_Internalname = "DISCOMDIBI_"+sGXsfl_60_fel_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_60_fel_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_60_fel_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_60_fel_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1MJ551( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60551( ) ;
      sendRow1MJ551( ) ;
   }

   public void sendRow1MJ551( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_551_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_551_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_551_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_551_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComCod_Internalname,GXutil.rtrim( A1056DisComCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFonCod_Internalname,GXutil.rtrim( A1032FonCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFonCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFonCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComDibC_Internalname,GXutil.rtrim( A13072DisComDibC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComDibC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComDibC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComDibI_Internalname,GXutil.ltrim( localUtil.ntoc( A13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComDibI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13073DisComDibI), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13073DisComDibI), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComDibI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComDibI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComMtr_Enabled!=0) ? localUtil.format( A1058DisComMtr, "ZZZZZ9.99") : localUtil.format( A1058DisComMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComObs_Internalname,GXutil.rtrim( A7735DisComObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1MJ551( ) ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1056DisComCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1056DisComCod));
      GXCCtl = "Z1032FonCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1032FonCod));
      GXCCtl = "Z13072DisComDibC_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13072DisComDibC));
      GXCCtl = "Z13073DisComDibI_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13073DisComDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1059DisComPie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7735DisComObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7735DisComObs));
      GXCCtl = "O1058DisComMtr_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1059DisComPie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_551_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_551_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLICOD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDISARTCOD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34DisArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_551_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMDIBC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMDIBI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMANH_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1MJ551( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60551( ) ;
      edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComDibC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMDIBC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComDibI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMDIBI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_551");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_551_Internalname ;
         wbErr = true ;
         nRcdDeleted_551 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_551 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DISCOMLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComLin_Internalname ;
         wbErr = true ;
         A2524DisComLin = (byte)(0) ;
      }
      else
      {
         A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
      A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
      A13072DisComDibC = httpContext.cgiGet( edtDisComDibC_Internalname) ;
      n13072DisComDibC = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "DISCOMDIBI_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComDibI_Internalname ;
         wbErr = true ;
         A13073DisComDibI = 0 ;
         n13073DisComDibI = false ;
      }
      else
      {
         A13073DisComDibI = (int)(localUtil.ctol( httpContext.cgiGet( edtDisComDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13073DisComDibI = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMPIE_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComPie_Internalname ;
         wbErr = true ;
         A1059DisComPie = (short)(0) ;
         n1059DisComPie = false ;
      }
      else
      {
         A1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1059DisComPie = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISCOMMTR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMtr_Internalname ;
         wbErr = true ;
         A1058DisComMtr = DecimalUtil.ZERO ;
         n1058DisComMtr = false ;
      }
      else
      {
         A1058DisComMtr = localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)) ;
         n1058DisComMtr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMANH_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComAnh_Internalname ;
         wbErr = true ;
         A1057DisComAnh = (short)(0) ;
         n1057DisComAnh = false ;
      }
      else
      {
         A1057DisComAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1057DisComAnh = false ;
      }
      A7735DisComObs = httpContext.cgiGet( edtDisComObs_Internalname) ;
      n7735DisComObs = false ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_60_idx ;
      Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1056DisComCod_" + sGXsfl_60_idx ;
      Z1056DisComCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1032FonCod_" + sGXsfl_60_idx ;
      Z1032FonCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13072DisComDibC_" + sGXsfl_60_idx ;
      Z13072DisComDibC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13073DisComDibI_" + sGXsfl_60_idx ;
      Z13073DisComDibI = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1059DisComPie_" + sGXsfl_60_idx ;
      Z1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_60_idx ;
      Z1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_60_idx ;
      Z1057DisComAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7735DisComObs_" + sGXsfl_60_idx ;
      Z7735DisComObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1058DisComMtr_" + sGXsfl_60_idx ;
      O1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1059DisComPie_" + sGXsfl_60_idx ;
      O1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_60_idx ;
      nRcdDeleted_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_551_" + sGXsfl_60_idx ;
      nRcdExists_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_551_" + sGXsfl_60_idx ;
      nIsMod_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFonCod_Enabled = edtFonCod_Enabled ;
      defedtDisComCod_Enabled = edtDisComCod_Enabled ;
      defedtDisComLin_Enabled = edtDisComLin_Enabled ;
   }

   public void confirmValues1MJ0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60551( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60551( ) ;
         httpContext.changePostValue( "Z2524DisComLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2524DisComLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1056DisComCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1056DisComCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1032FonCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1032FonCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13072DisComDibC_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13072DisComDibC_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13072DisComDibC_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13073DisComDibI_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13073DisComDibI_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13073DisComDibI_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1059DisComPie_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1059DisComPie_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1058DisComMtr_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1058DisComMtr_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1057DisComAnh_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1057DisComAnh_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7735DisComObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7735DisComObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O1058DisComMtr", httpContext.cgiGet( "T1058DisComMtr")) ;
      httpContext.deletePostValue( "T1058DisComMtr") ;
      httpContext.changePostValue( "O1059DisComPie", httpContext.cgiGet( "T1059DisComPie")) ;
      httpContext.deletePostValue( "T1059DisComPie") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcomdig", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","DisCod","Clicod","DisArtcod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1055TotNUni", GXutil.ltrim( localUtil.ntoc( O1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1054TotNPie", GXutil.ltrim( localUtil.ntoc( O1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCOD", GXutil.rtrim( AV34DisArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tcomdig", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34DisArtcod))}, new String[] {"EmprCod","DisCod","Clicod","DisArtcod"})  ;
   }

   public String getPgmname( )
   {
      return "TCOMDIG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMBINACIONES DIGITAL", "") ;
   }

   public void initializeNonKey1MJ34( )
   {
      A2525DisComULin = (byte)(0) ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A385DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      A374DisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
      O2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      Z2525DisComULin = (byte)(0) ;
      Z374DisNumPie = (short)(0) ;
      Z365DisDes = "" ;
   }

   public void initAll1MJ34( )
   {
      initializeNonKey1MJ34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1MJ551( )
   {
      A13072DisComDibC = "" ;
      n13072DisComDibC = false ;
      A13073DisComDibI = 0 ;
      n13073DisComDibI = false ;
      A1059DisComPie = (short)(0) ;
      n1059DisComPie = false ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      n1058DisComMtr = false ;
      A1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
      A7735DisComObs = "" ;
      n7735DisComObs = false ;
      O1058DisComMtr = A1058DisComMtr ;
      n1058DisComMtr = false ;
      O1059DisComPie = A1059DisComPie ;
      n1059DisComPie = false ;
      Z13072DisComDibC = "" ;
      Z13073DisComDibI = 0 ;
      Z1059DisComPie = (short)(0) ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z1057DisComAnh = (short)(0) ;
      Z7735DisComObs = "" ;
   }

   public void initAll1MJ551( )
   {
      A2524DisComLin = (byte)(0) ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      initializeNonKey1MJ551( ) ;
   }

   public void standaloneModalInsert1MJ551( )
   {
      A2525DisComULin = i2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415101034", true, true);
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
      httpContext.AddJavascriptSource("tcomdig.js", "?202682415101034", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties551( )
   {
      edtFonCod_Enabled = defedtFonCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComCod_Enabled = defedtDisComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisComLin_Enabled = defedtDisComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1056DisComCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1032FonCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13072DisComDibC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13073DisComDibI, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComDibI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7735DisComObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisComULin_Internalname = "DISCOMULIN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTotNUni_Internalname = "TOTNUNI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTotNPie_Internalname = "TOTNPIE" ;
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      edtFonCod_Internalname = "FONCOD" ;
      edtDisComDibC_Internalname = "DISCOMDIBC" ;
      edtDisComDibI_Internalname = "DISCOMDIBI" ;
      edtDisComPie_Internalname = "DISCOMPIE" ;
      edtDisComMtr_Internalname = "DISCOMMTR" ;
      edtDisComAnh_Internalname = "DISCOMANH" ;
      edtDisComObs_Internalname = "DISCOMOBS" ;
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
      Form.setCaption( httpContext.getMessage( "COMBINACIONES DIGITAL", "") );
      edtDisComObs_Jsonclick = "" ;
      edtDisComAnh_Jsonclick = "" ;
      edtDisComMtr_Jsonclick = "" ;
      edtDisComPie_Jsonclick = "" ;
      edtDisComDibI_Jsonclick = "" ;
      edtDisComDibC_Jsonclick = "" ;
      edtFonCod_Jsonclick = "" ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComLin_Jsonclick = "" ;
      edtavnRcdDeleted_551_Jsonclick = "" ;
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
      edtDisComObs_Enabled = 1 ;
      edtDisComAnh_Enabled = 1 ;
      edtDisComMtr_Enabled = 1 ;
      edtDisComPie_Enabled = 1 ;
      edtDisComDibI_Enabled = 1 ;
      edtDisComDibC_Enabled = 1 ;
      edtFonCod_Enabled = 1 ;
      edtDisComCod_Enabled = 1 ;
      edtDisComLin_Enabled = 1 ;
      edtavnRcdDeleted_551_Enabled = 1 ;
      edtTotNPie_Jsonclick = "" ;
      edtTotNPie_Backcolor = (int)(0xFFFFFF) ;
      edtTotNPie_Enabled = 0 ;
      edtTotNUni_Jsonclick = "" ;
      edtTotNUni_Backcolor = (int)(0xFFFFFF) ;
      edtTotNUni_Enabled = 0 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumPie_Enabled = 1 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisComULin_Jsonclick = "" ;
      edtDisComULin_Backcolor = (int)(0xFFFFFF) ;
      edtDisComULin_Enabled = 0 ;
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

   public void gx2asadispiemtr1MJ34( String A396EmprCod ,
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_60551( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1MJ551( ) ;
         standaloneModal1MJ551( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1MJ551( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60551( ) ;
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
      /* Using cursor T01MJ36 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MJ36_A407EmprNom[0] ;
      n407EmprNom = T01MJ36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T01MJ38 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A1055TotNUni = T01MJ38_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = T01MJ38_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         A1055TotNUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A1054TotNPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      pr_default.close(33);
      GX_FocusControl = edtDisNumPie_Internalname ;
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

   public void valid_Discod( )
   {
      n2525DisComULin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrim( localUtil.ntoc( A1055TotNUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrim( localUtil.ntoc( A1054TotNPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z385DisPieMtr", GXutil.ltrim( localUtil.ntoc( Z385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1055TotNUni", GXutil.ltrim( localUtil.ntoc( Z1055TotNUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1054TotNPie", GXutil.ltrim( localUtil.ntoc( Z1054TotNPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1055TotNUni", GXutil.ltrim( localUtil.ntoc( O1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1054TotNPie", GXutil.ltrim( localUtil.ntoc( O1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34DisArtcod',fld:'vDISARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A1055TotNUni',fld:'TOTNUNI',pic:'ZZZZZ9.99'},{av:'A1054TotNPie',fld:'TOTNPIE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z2525DisComULin'},{av:'Z385DisPieMtr'},{av:'Z374DisNumPie'},{av:'Z1055TotNUni'},{av:'Z1054TotNPie'},{av:'O2525DisComULin'},{av:'O1055TotNUni'},{av:'O1054TotNPie'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISCOMULIN","{handler:'valid_Discomulin',iparms:[]");
      setEventMetadata("VALID_DISCOMULIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[]");
      setEventMetadata("VALID_FONCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOMPIE","{handler:'valid_Discompie',iparms:[]");
      setEventMetadata("VALID_DISCOMPIE",",oparms:[]}");
      setEventMetadata("VALID_DISCOMMTR","{handler:'valid_Discommtr',iparms:[]");
      setEventMetadata("VALID_DISCOMMTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Discomobs',iparms:[]");
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
      /* Using cursor T01MJ39 */
      pr_default.execute(34, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         X631Metros = T01MJ39_A631Metros[0] ;
      }
      pr_default.close(34);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01MJ40 */
      pr_default.execute(35, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         X384DisPieMet = T01MJ40_A384DisPieMet[0] ;
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
      O1055TotNUni = DecimalUtil.ZERO ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z13072DisComDibC = "" ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z7735DisComObs = "" ;
      O1058DisComMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      AV34DisArtcod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1055TotNUni = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1055TotNUni = DecimalUtil.ZERO ;
      sMode551 = "" ;
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
      sMode34 = "" ;
      s1055TotNUni = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A13072DisComDibC = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      T1058DisComMtr = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z1055TotNUni = DecimalUtil.ZERO ;
      T01MJ6_A407EmprNom = new String[] {""} ;
      T01MJ6_n407EmprNom = new boolean[] {false} ;
      T01MJ8_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ8_A1054TotNPie = new short[1] ;
      T01MJ10_A361DisCod = new int[1] ;
      T01MJ10_A407EmprNom = new String[] {""} ;
      T01MJ10_n407EmprNom = new boolean[] {false} ;
      T01MJ10_A2525DisComULin = new byte[1] ;
      T01MJ10_n2525DisComULin = new boolean[] {false} ;
      T01MJ10_A374DisNumPie = new short[1] ;
      T01MJ10_A396EmprCod = new String[] {""} ;
      T01MJ10_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ10_A1054TotNPie = new short[1] ;
      T01MJ10_A365DisDes = new String[] {""} ;
      T01MJ11_A396EmprCod = new String[] {""} ;
      T01MJ11_A361DisCod = new int[1] ;
      T01MJ5_A361DisCod = new int[1] ;
      T01MJ5_A2525DisComULin = new byte[1] ;
      T01MJ5_n2525DisComULin = new boolean[] {false} ;
      T01MJ5_A374DisNumPie = new short[1] ;
      T01MJ5_A396EmprCod = new String[] {""} ;
      T01MJ5_A365DisDes = new String[] {""} ;
      T01MJ12_A396EmprCod = new String[] {""} ;
      T01MJ12_A361DisCod = new int[1] ;
      T01MJ13_A396EmprCod = new String[] {""} ;
      T01MJ13_A361DisCod = new int[1] ;
      T01MJ4_A361DisCod = new int[1] ;
      T01MJ4_A2525DisComULin = new byte[1] ;
      T01MJ4_n2525DisComULin = new boolean[] {false} ;
      T01MJ4_A374DisNumPie = new short[1] ;
      T01MJ4_A396EmprCod = new String[] {""} ;
      T01MJ4_A365DisDes = new String[] {""} ;
      T01MJ17_A396EmprCod = new String[] {""} ;
      T01MJ17_A361DisCod = new int[1] ;
      T01MJ17_A13376DisTraID = new String[] {""} ;
      T01MJ18_A396EmprCod = new String[] {""} ;
      T01MJ18_A361DisCod = new int[1] ;
      T01MJ18_A13213DisNormID = new String[] {""} ;
      T01MJ19_A396EmprCod = new String[] {""} ;
      T01MJ19_A361DisCod = new int[1] ;
      T01MJ19_A13081DisDGLin = new byte[1] ;
      T01MJ19_A13082DisDGDibCl = new String[] {""} ;
      T01MJ19_A13083DisDGDibIn = new int[1] ;
      T01MJ19_A13084DisDGComb = new String[] {""} ;
      T01MJ19_A13085DisDGFondo = new String[] {""} ;
      T01MJ20_A396EmprCod = new String[] {""} ;
      T01MJ20_A361DisCod = new int[1] ;
      T01MJ20_A7068DisNotLin = new byte[1] ;
      T01MJ21_A396EmprCod = new String[] {""} ;
      T01MJ21_A361DisCod = new int[1] ;
      T01MJ21_A10197ProEspCod = new String[] {""} ;
      T01MJ22_A396EmprCod = new String[] {""} ;
      T01MJ22_A361DisCod = new int[1] ;
      T01MJ22_A4594AccCod = new short[1] ;
      T01MJ23_A396EmprCod = new String[] {""} ;
      T01MJ23_A361DisCod = new int[1] ;
      T01MJ23_A3398DisRefBarC = new int[1] ;
      T01MJ23_A3399DisRefBCRe = new byte[1] ;
      T01MJ23_A3400DisRefBCPa = new String[] {""} ;
      T01MJ23_A3607DisRefBPie = new String[] {""} ;
      T01MJ24_A396EmprCod = new String[] {""} ;
      T01MJ24_A361DisCod = new int[1] ;
      T01MJ24_A376DisObsLin = new byte[1] ;
      T01MJ25_A396EmprCod = new String[] {""} ;
      T01MJ25_A361DisCod = new int[1] ;
      T01MJ25_A758ProCod = new String[] {""} ;
      T01MJ26_A396EmprCod = new String[] {""} ;
      T01MJ26_A361DisCod = new int[1] ;
      T01MJ26_A833TipDefCod = new short[1] ;
      T01MJ27_A396EmprCod = new String[] {""} ;
      T01MJ27_A361DisCod = new int[1] ;
      T01MJ27_A44AlbRecCod = new int[1] ;
      T01MJ29_A396EmprCod = new String[] {""} ;
      T01MJ29_A361DisCod = new int[1] ;
      T01MJ30_A361DisCod = new int[1] ;
      T01MJ30_A2524DisComLin = new byte[1] ;
      T01MJ30_A1056DisComCod = new String[] {""} ;
      T01MJ30_A13072DisComDibC = new String[] {""} ;
      T01MJ30_n13072DisComDibC = new boolean[] {false} ;
      T01MJ30_A13073DisComDibI = new int[1] ;
      T01MJ30_n13073DisComDibI = new boolean[] {false} ;
      T01MJ30_A1059DisComPie = new short[1] ;
      T01MJ30_n1059DisComPie = new boolean[] {false} ;
      T01MJ30_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ30_n1058DisComMtr = new boolean[] {false} ;
      T01MJ30_A1057DisComAnh = new short[1] ;
      T01MJ30_n1057DisComAnh = new boolean[] {false} ;
      T01MJ30_A7735DisComObs = new String[] {""} ;
      T01MJ30_n7735DisComObs = new boolean[] {false} ;
      T01MJ30_A396EmprCod = new String[] {""} ;
      T01MJ30_A1032FonCod = new String[] {""} ;
      T01MJ31_A396EmprCod = new String[] {""} ;
      T01MJ31_A361DisCod = new int[1] ;
      T01MJ31_A2524DisComLin = new byte[1] ;
      T01MJ31_A1056DisComCod = new String[] {""} ;
      T01MJ31_A1032FonCod = new String[] {""} ;
      T01MJ3_A361DisCod = new int[1] ;
      T01MJ3_A2524DisComLin = new byte[1] ;
      T01MJ3_A1056DisComCod = new String[] {""} ;
      T01MJ3_A13072DisComDibC = new String[] {""} ;
      T01MJ3_n13072DisComDibC = new boolean[] {false} ;
      T01MJ3_A13073DisComDibI = new int[1] ;
      T01MJ3_n13073DisComDibI = new boolean[] {false} ;
      T01MJ3_A1059DisComPie = new short[1] ;
      T01MJ3_n1059DisComPie = new boolean[] {false} ;
      T01MJ3_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ3_n1058DisComMtr = new boolean[] {false} ;
      T01MJ3_A1057DisComAnh = new short[1] ;
      T01MJ3_n1057DisComAnh = new boolean[] {false} ;
      T01MJ3_A7735DisComObs = new String[] {""} ;
      T01MJ3_n7735DisComObs = new boolean[] {false} ;
      T01MJ3_A396EmprCod = new String[] {""} ;
      T01MJ3_A1032FonCod = new String[] {""} ;
      T01MJ2_A361DisCod = new int[1] ;
      T01MJ2_A2524DisComLin = new byte[1] ;
      T01MJ2_A1056DisComCod = new String[] {""} ;
      T01MJ2_A13072DisComDibC = new String[] {""} ;
      T01MJ2_n13072DisComDibC = new boolean[] {false} ;
      T01MJ2_A13073DisComDibI = new int[1] ;
      T01MJ2_n13073DisComDibI = new boolean[] {false} ;
      T01MJ2_A1059DisComPie = new short[1] ;
      T01MJ2_n1059DisComPie = new boolean[] {false} ;
      T01MJ2_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ2_n1058DisComMtr = new boolean[] {false} ;
      T01MJ2_A1057DisComAnh = new short[1] ;
      T01MJ2_n1057DisComAnh = new boolean[] {false} ;
      T01MJ2_A7735DisComObs = new String[] {""} ;
      T01MJ2_n7735DisComObs = new boolean[] {false} ;
      T01MJ2_A396EmprCod = new String[] {""} ;
      T01MJ2_A1032FonCod = new String[] {""} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      T01MJ35_A396EmprCod = new String[] {""} ;
      T01MJ35_A361DisCod = new int[1] ;
      T01MJ35_A2524DisComLin = new byte[1] ;
      T01MJ35_A1056DisComCod = new String[] {""} ;
      T01MJ35_A1032FonCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01MJ36_A407EmprNom = new String[] {""} ;
      T01MJ36_n407EmprNom = new boolean[] {false} ;
      T01MJ38_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MJ38_A1054TotNPie = new short[1] ;
      Z385DisPieMtr = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ385DisPieMtr = DecimalUtil.ZERO ;
      ZZ1055TotNUni = DecimalUtil.ZERO ;
      ZO1055TotNUni = DecimalUtil.ZERO ;
      X631Metros = DecimalUtil.ZERO ;
      T01MJ39_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      T01MJ40_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcomdig__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcomdig__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcomdig__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcomdig__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcomdig__default(),
         new Object[] {
             new Object[] {
            T01MJ2_A361DisCod, T01MJ2_A2524DisComLin, T01MJ2_A1056DisComCod, T01MJ2_A13072DisComDibC, T01MJ2_n13072DisComDibC, T01MJ2_A13073DisComDibI, T01MJ2_n13073DisComDibI, T01MJ2_A1059DisComPie, T01MJ2_n1059DisComPie, T01MJ2_A1058DisComMtr,
            T01MJ2_n1058DisComMtr, T01MJ2_A1057DisComAnh, T01MJ2_n1057DisComAnh, T01MJ2_A7735DisComObs, T01MJ2_n7735DisComObs, T01MJ2_A396EmprCod, T01MJ2_A1032FonCod
            }
            , new Object[] {
            T01MJ3_A361DisCod, T01MJ3_A2524DisComLin, T01MJ3_A1056DisComCod, T01MJ3_A13072DisComDibC, T01MJ3_n13072DisComDibC, T01MJ3_A13073DisComDibI, T01MJ3_n13073DisComDibI, T01MJ3_A1059DisComPie, T01MJ3_n1059DisComPie, T01MJ3_A1058DisComMtr,
            T01MJ3_n1058DisComMtr, T01MJ3_A1057DisComAnh, T01MJ3_n1057DisComAnh, T01MJ3_A7735DisComObs, T01MJ3_n7735DisComObs, T01MJ3_A396EmprCod, T01MJ3_A1032FonCod
            }
            , new Object[] {
            T01MJ4_A361DisCod, T01MJ4_A2525DisComULin, T01MJ4_n2525DisComULin, T01MJ4_A374DisNumPie, T01MJ4_A396EmprCod, T01MJ4_A365DisDes
            }
            , new Object[] {
            T01MJ5_A361DisCod, T01MJ5_A2525DisComULin, T01MJ5_n2525DisComULin, T01MJ5_A374DisNumPie, T01MJ5_A396EmprCod, T01MJ5_A365DisDes
            }
            , new Object[] {
            T01MJ6_A407EmprNom, T01MJ6_n407EmprNom
            }
            , new Object[] {
            T01MJ8_A1055TotNUni, T01MJ8_A1054TotNPie
            }
            , new Object[] {
            T01MJ10_A361DisCod, T01MJ10_A407EmprNom, T01MJ10_n407EmprNom, T01MJ10_A2525DisComULin, T01MJ10_n2525DisComULin, T01MJ10_A374DisNumPie, T01MJ10_A396EmprCod, T01MJ10_A1055TotNUni, T01MJ10_A1054TotNPie, T01MJ10_A365DisDes
            }
            , new Object[] {
            T01MJ11_A396EmprCod, T01MJ11_A361DisCod
            }
            , new Object[] {
            T01MJ12_A396EmprCod, T01MJ12_A361DisCod
            }
            , new Object[] {
            T01MJ13_A396EmprCod, T01MJ13_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MJ17_A396EmprCod, T01MJ17_A361DisCod, T01MJ17_A13376DisTraID
            }
            , new Object[] {
            T01MJ18_A396EmprCod, T01MJ18_A361DisCod, T01MJ18_A13213DisNormID
            }
            , new Object[] {
            T01MJ19_A396EmprCod, T01MJ19_A361DisCod, T01MJ19_A13081DisDGLin, T01MJ19_A13082DisDGDibCl, T01MJ19_A13083DisDGDibIn, T01MJ19_A13084DisDGComb, T01MJ19_A13085DisDGFondo
            }
            , new Object[] {
            T01MJ20_A396EmprCod, T01MJ20_A361DisCod, T01MJ20_A7068DisNotLin
            }
            , new Object[] {
            T01MJ21_A396EmprCod, T01MJ21_A361DisCod, T01MJ21_A10197ProEspCod
            }
            , new Object[] {
            T01MJ22_A396EmprCod, T01MJ22_A361DisCod, T01MJ22_A4594AccCod
            }
            , new Object[] {
            T01MJ23_A396EmprCod, T01MJ23_A361DisCod, T01MJ23_A3398DisRefBarC, T01MJ23_A3399DisRefBCRe, T01MJ23_A3400DisRefBCPa, T01MJ23_A3607DisRefBPie
            }
            , new Object[] {
            T01MJ24_A396EmprCod, T01MJ24_A361DisCod, T01MJ24_A376DisObsLin
            }
            , new Object[] {
            T01MJ25_A396EmprCod, T01MJ25_A361DisCod, T01MJ25_A758ProCod
            }
            , new Object[] {
            T01MJ26_A396EmprCod, T01MJ26_A361DisCod, T01MJ26_A833TipDefCod
            }
            , new Object[] {
            T01MJ27_A396EmprCod, T01MJ27_A361DisCod, T01MJ27_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01MJ29_A396EmprCod, T01MJ29_A361DisCod
            }
            , new Object[] {
            T01MJ30_A361DisCod, T01MJ30_A2524DisComLin, T01MJ30_A1056DisComCod, T01MJ30_A13072DisComDibC, T01MJ30_n13072DisComDibC, T01MJ30_A13073DisComDibI, T01MJ30_n13073DisComDibI, T01MJ30_A1059DisComPie, T01MJ30_n1059DisComPie, T01MJ30_A1058DisComMtr,
            T01MJ30_n1058DisComMtr, T01MJ30_A1057DisComAnh, T01MJ30_n1057DisComAnh, T01MJ30_A7735DisComObs, T01MJ30_n7735DisComObs, T01MJ30_A396EmprCod, T01MJ30_A1032FonCod
            }
            , new Object[] {
            T01MJ31_A396EmprCod, T01MJ31_A361DisCod, T01MJ31_A2524DisComLin, T01MJ31_A1056DisComCod, T01MJ31_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MJ35_A396EmprCod, T01MJ35_A361DisCod, T01MJ35_A2524DisComLin, T01MJ35_A1056DisComCod, T01MJ35_A1032FonCod
            }
            , new Object[] {
            T01MJ36_A407EmprNom, T01MJ36_n407EmprNom
            }
            , new Object[] {
            T01MJ38_A1055TotNUni, T01MJ38_A1054TotNPie
            }
            , new Object[] {
            T01MJ39_A631Metros
            }
            , new Object[] {
            T01MJ40_A384DisPieMet
            }
         }
      );
      Z361DisCod = 0 ;
      E361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z2525DisComULin ;
   private byte O2525DisComULin ;
   private byte Z2524DisComLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A2525DisComULin ;
   private byte Gx_BScreen ;
   private byte B2525DisComULin ;
   private byte s2525DisComULin ;
   private byte A2524DisComLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2525DisComULin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ2525DisComULin ;
   private byte ZO2525DisComULin ;
   private short Z374DisNumPie ;
   private short O1054TotNPie ;
   private short Z1059DisComPie ;
   private short Z1057DisComAnh ;
   private short O1059DisComPie ;
   private short nRcdDeleted_551 ;
   private short nRcdExists_551 ;
   private short nIsMod_551 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A374DisNumPie ;
   private short A1054TotNPie ;
   private short nBlankRcdCount551 ;
   private short RcdFound551 ;
   private short B1054TotNPie ;
   private short nBlankRcdUsr551 ;
   private short s1054TotNPie ;
   private short A1059DisComPie ;
   private short A1057DisComAnh ;
   private short T1059DisComPie ;
   private short Z1054TotNPie ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_551 ;
   private short ZZ374DisNumPie ;
   private short ZZ1054TotNPie ;
   private short ZO1054TotNPie ;
   private int wcpOA361DisCod ;
   private int wcpOAV33Clicod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z13073DisComDibI ;
   private int A361DisCod ;
   private int AV33Clicod ;
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
   private int edtDisComULin_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtTotNUni_Enabled ;
   private int edtTotNPie_Enabled ;
   private int edtavnRcdDeleted_551_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int edtDisComDibC_Enabled ;
   private int edtDisComDibI_Enabled ;
   private int edtDisComPie_Enabled ;
   private int edtDisComMtr_Enabled ;
   private int edtDisComAnh_Enabled ;
   private int edtDisComObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A13073DisComDibI ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtFonCod_Enabled ;
   private int defedtDisComCod_Enabled ;
   private int defedtDisComLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTotNPie_Backcolor ;
   private int edtTotNUni_Backcolor ;
   private int edtDisNumPie_Backcolor ;
   private int edtDisPieMtr_Backcolor ;
   private int edtDisComULin_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int E361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O1055TotNUni ;
   private java.math.BigDecimal Z1058DisComMtr ;
   private java.math.BigDecimal O1058DisComMtr ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A1055TotNUni ;
   private java.math.BigDecimal B1055TotNUni ;
   private java.math.BigDecimal s1055TotNUni ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal T1058DisComMtr ;
   private java.math.BigDecimal Z1055TotNUni ;
   private java.math.BigDecimal Z385DisPieMtr ;
   private java.math.BigDecimal ZZ385DisPieMtr ;
   private java.math.BigDecimal ZZ1055TotNUni ;
   private java.math.BigDecimal ZO1055TotNUni ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV34DisArtcod ;
   private String Z396EmprCod ;
   private String Z365DisDes ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z13072DisComDibC ;
   private String Z7735DisComObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String AV34DisArtcod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisNumPie_Internalname ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtDisComULin_Internalname ;
   private String edtDisComULin_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisNumPie_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTotNUni_Internalname ;
   private String edtTotNUni_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTotNPie_Internalname ;
   private String edtTotNPie_Jsonclick ;
   private String sMode551 ;
   private String edtavnRcdDeleted_551_Internalname ;
   private String edtDisComLin_Internalname ;
   private String edtDisComCod_Internalname ;
   private String edtFonCod_Internalname ;
   private String edtDisComDibC_Internalname ;
   private String edtDisComDibI_Internalname ;
   private String edtDisComPie_Internalname ;
   private String edtDisComMtr_Internalname ;
   private String edtDisComAnh_Internalname ;
   private String edtDisComObs_Internalname ;
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
   private String sMode34 ;
   private String GXCCtl ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A13072DisComDibC ;
   private String A7735DisComObs ;
   private String Z407EmprNom ;
   private String GXv_char1[] ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_551_Jsonclick ;
   private String edtDisComLin_Jsonclick ;
   private String edtDisComCod_Jsonclick ;
   private String edtFonCod_Jsonclick ;
   private String edtDisComDibC_Jsonclick ;
   private String edtDisComDibI_Jsonclick ;
   private String edtDisComPie_Jsonclick ;
   private String edtDisComMtr_Jsonclick ;
   private String edtDisComAnh_Jsonclick ;
   private String edtDisComObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String E396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n2525DisComULin ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13072DisComDibC ;
   private boolean n13073DisComDibI ;
   private boolean n1059DisComPie ;
   private boolean n1058DisComMtr ;
   private boolean n1057DisComAnh ;
   private boolean n7735DisComObs ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01MJ6_A407EmprNom ;
   private boolean[] T01MJ6_n407EmprNom ;
   private java.math.BigDecimal[] T01MJ8_A1055TotNUni ;
   private short[] T01MJ8_A1054TotNPie ;
   private int[] T01MJ10_A361DisCod ;
   private String[] T01MJ10_A407EmprNom ;
   private boolean[] T01MJ10_n407EmprNom ;
   private byte[] T01MJ10_A2525DisComULin ;
   private boolean[] T01MJ10_n2525DisComULin ;
   private short[] T01MJ10_A374DisNumPie ;
   private String[] T01MJ10_A396EmprCod ;
   private java.math.BigDecimal[] T01MJ10_A1055TotNUni ;
   private short[] T01MJ10_A1054TotNPie ;
   private String[] T01MJ10_A365DisDes ;
   private String[] T01MJ11_A396EmprCod ;
   private int[] T01MJ11_A361DisCod ;
   private int[] T01MJ5_A361DisCod ;
   private byte[] T01MJ5_A2525DisComULin ;
   private boolean[] T01MJ5_n2525DisComULin ;
   private short[] T01MJ5_A374DisNumPie ;
   private String[] T01MJ5_A396EmprCod ;
   private String[] T01MJ5_A365DisDes ;
   private String[] T01MJ12_A396EmprCod ;
   private int[] T01MJ12_A361DisCod ;
   private String[] T01MJ13_A396EmprCod ;
   private int[] T01MJ13_A361DisCod ;
   private int[] T01MJ4_A361DisCod ;
   private byte[] T01MJ4_A2525DisComULin ;
   private boolean[] T01MJ4_n2525DisComULin ;
   private short[] T01MJ4_A374DisNumPie ;
   private String[] T01MJ4_A396EmprCod ;
   private String[] T01MJ4_A365DisDes ;
   private String[] T01MJ17_A396EmprCod ;
   private int[] T01MJ17_A361DisCod ;
   private String[] T01MJ17_A13376DisTraID ;
   private String[] T01MJ18_A396EmprCod ;
   private int[] T01MJ18_A361DisCod ;
   private String[] T01MJ18_A13213DisNormID ;
   private String[] T01MJ19_A396EmprCod ;
   private int[] T01MJ19_A361DisCod ;
   private byte[] T01MJ19_A13081DisDGLin ;
   private String[] T01MJ19_A13082DisDGDibCl ;
   private int[] T01MJ19_A13083DisDGDibIn ;
   private String[] T01MJ19_A13084DisDGComb ;
   private String[] T01MJ19_A13085DisDGFondo ;
   private String[] T01MJ20_A396EmprCod ;
   private int[] T01MJ20_A361DisCod ;
   private byte[] T01MJ20_A7068DisNotLin ;
   private String[] T01MJ21_A396EmprCod ;
   private int[] T01MJ21_A361DisCod ;
   private String[] T01MJ21_A10197ProEspCod ;
   private String[] T01MJ22_A396EmprCod ;
   private int[] T01MJ22_A361DisCod ;
   private short[] T01MJ22_A4594AccCod ;
   private String[] T01MJ23_A396EmprCod ;
   private int[] T01MJ23_A361DisCod ;
   private int[] T01MJ23_A3398DisRefBarC ;
   private byte[] T01MJ23_A3399DisRefBCRe ;
   private String[] T01MJ23_A3400DisRefBCPa ;
   private String[] T01MJ23_A3607DisRefBPie ;
   private String[] T01MJ24_A396EmprCod ;
   private int[] T01MJ24_A361DisCod ;
   private byte[] T01MJ24_A376DisObsLin ;
   private String[] T01MJ25_A396EmprCod ;
   private int[] T01MJ25_A361DisCod ;
   private String[] T01MJ25_A758ProCod ;
   private String[] T01MJ26_A396EmprCod ;
   private int[] T01MJ26_A361DisCod ;
   private short[] T01MJ26_A833TipDefCod ;
   private String[] T01MJ27_A396EmprCod ;
   private int[] T01MJ27_A361DisCod ;
   private int[] T01MJ27_A44AlbRecCod ;
   private String[] T01MJ29_A396EmprCod ;
   private int[] T01MJ29_A361DisCod ;
   private int[] T01MJ30_A361DisCod ;
   private byte[] T01MJ30_A2524DisComLin ;
   private String[] T01MJ30_A1056DisComCod ;
   private String[] T01MJ30_A13072DisComDibC ;
   private boolean[] T01MJ30_n13072DisComDibC ;
   private int[] T01MJ30_A13073DisComDibI ;
   private boolean[] T01MJ30_n13073DisComDibI ;
   private short[] T01MJ30_A1059DisComPie ;
   private boolean[] T01MJ30_n1059DisComPie ;
   private java.math.BigDecimal[] T01MJ30_A1058DisComMtr ;
   private boolean[] T01MJ30_n1058DisComMtr ;
   private short[] T01MJ30_A1057DisComAnh ;
   private boolean[] T01MJ30_n1057DisComAnh ;
   private String[] T01MJ30_A7735DisComObs ;
   private boolean[] T01MJ30_n7735DisComObs ;
   private String[] T01MJ30_A396EmprCod ;
   private String[] T01MJ30_A1032FonCod ;
   private String[] T01MJ31_A396EmprCod ;
   private int[] T01MJ31_A361DisCod ;
   private byte[] T01MJ31_A2524DisComLin ;
   private String[] T01MJ31_A1056DisComCod ;
   private String[] T01MJ31_A1032FonCod ;
   private int[] T01MJ3_A361DisCod ;
   private byte[] T01MJ3_A2524DisComLin ;
   private String[] T01MJ3_A1056DisComCod ;
   private String[] T01MJ3_A13072DisComDibC ;
   private boolean[] T01MJ3_n13072DisComDibC ;
   private int[] T01MJ3_A13073DisComDibI ;
   private boolean[] T01MJ3_n13073DisComDibI ;
   private short[] T01MJ3_A1059DisComPie ;
   private boolean[] T01MJ3_n1059DisComPie ;
   private java.math.BigDecimal[] T01MJ3_A1058DisComMtr ;
   private boolean[] T01MJ3_n1058DisComMtr ;
   private short[] T01MJ3_A1057DisComAnh ;
   private boolean[] T01MJ3_n1057DisComAnh ;
   private String[] T01MJ3_A7735DisComObs ;
   private boolean[] T01MJ3_n7735DisComObs ;
   private String[] T01MJ3_A396EmprCod ;
   private String[] T01MJ3_A1032FonCod ;
   private int[] T01MJ2_A361DisCod ;
   private byte[] T01MJ2_A2524DisComLin ;
   private String[] T01MJ2_A1056DisComCod ;
   private String[] T01MJ2_A13072DisComDibC ;
   private boolean[] T01MJ2_n13072DisComDibC ;
   private int[] T01MJ2_A13073DisComDibI ;
   private boolean[] T01MJ2_n13073DisComDibI ;
   private short[] T01MJ2_A1059DisComPie ;
   private boolean[] T01MJ2_n1059DisComPie ;
   private java.math.BigDecimal[] T01MJ2_A1058DisComMtr ;
   private boolean[] T01MJ2_n1058DisComMtr ;
   private short[] T01MJ2_A1057DisComAnh ;
   private boolean[] T01MJ2_n1057DisComAnh ;
   private String[] T01MJ2_A7735DisComObs ;
   private boolean[] T01MJ2_n7735DisComObs ;
   private String[] T01MJ2_A396EmprCod ;
   private String[] T01MJ2_A1032FonCod ;
   private String[] T01MJ35_A396EmprCod ;
   private int[] T01MJ35_A361DisCod ;
   private byte[] T01MJ35_A2524DisComLin ;
   private String[] T01MJ35_A1056DisComCod ;
   private String[] T01MJ35_A1032FonCod ;
   private String[] T01MJ36_A407EmprNom ;
   private boolean[] T01MJ36_n407EmprNom ;
   private java.math.BigDecimal[] T01MJ38_A1055TotNUni ;
   private short[] T01MJ38_A1054TotNPie ;
   private java.math.BigDecimal[] T01MJ39_A631Metros ;
   private java.math.BigDecimal[] T01MJ40_A384DisPieMet ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcomdig__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcomdig__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcomdig__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcomdig__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcomdig__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01MJ2", "SELECT DisCod, DisComLin, DisComCod, DisComDibC, DisComDibI, DisComPie, DisComMtr, DisComAnh, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF DisComDibC, DisComDibI, DisComPie, DisComMtr, DisComAnh, DisComObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ3", "SELECT DisCod, DisComLin, DisComCod, DisComDibC, DisComDibI, DisComPie, DisComMtr, DisComAnh, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ4", "SELECT DisCod, DisComULin, DisNumPie, EmprCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisComULin, DisNumPie, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ5", "SELECT DisCod, DisComULin, DisNumPie, EmprCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ8", "SELECT COALESCE( T1.TotNUni, 0) AS TotNUni, COALESCE( T1.TotNPie, 0) AS TotNPie FROM (SELECT SUM(DisComMtr) AS TotNUni, EmprCod, DisCod, SUM(DisComPie) AS TotNPie FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ10", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.DisComULin, TM1.DisNumPie, TM1.EmprCod, COALESCE( T3.TotNUni, 0) AS TotNUni, COALESCE( T3.TotNPie, 0) AS TotNPie, TM1.DisDes FROM ((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DisComMtr) AS TotNUni, EmprCod, DisCod, SUM(DisComPie) AS TotNPie FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MJ14", "INSERT INTO TXPDISPOS(DisCod, DisComULin, DisNumPie, EmprCod, DisDes, DisArtCod, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01MJ15", "UPDATE TXPDISPOS SET DisComULin=?, DisNumPie=?, DisDes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01MJ16", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01MJ17", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ18", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ19", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ20", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ21", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ22", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ23", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ24", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ25", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ26", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ27", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MJ28", "UPDATE TXPDISPOS SET DisComULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01MJ29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MJ30", "SELECT DisCod, DisComLin, DisComCod, DisComDibC, DisComDibI, DisComPie, DisComMtr, DisComAnh, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ31", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01MJ32", "INSERT INTO TXPDISCOM(DisCod, DisComLin, DisComCod, DisComDibC, DisComDibI, DisComPie, DisComMtr, DisComAnh, DisComObs, EmprCod, FonCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T01MJ33", "UPDATE TXPDISCOM SET DisComDibC=?, DisComDibI=?, DisComPie=?, DisComMtr=?, DisComAnh=?, DisComObs=?  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T01MJ34", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new ForEachCursor("T01MJ35", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ38", "SELECT COALESCE( T1.TotNUni, 0) AS TotNUni, COALESCE( T1.TotNPie, 0) AS TotNPie FROM (SELECT SUM(DisComMtr) AS TotNUni, EmprCod, DisCod, SUM(DisComPie) AS TotNPie FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ39", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MJ40", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 70);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((String[]) buf[16])[0] = rslt.getString(11, 12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 70);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((String[]) buf[16])[0] = rslt.getString(11, 12);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 70);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((String[]) buf[16])[0] = rslt.getString(11, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 1);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
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
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 70);
               }
               stmt.setString(10, (String)parms[15], 3);
               stmt.setString(11, (String)parms[16], 12);
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 70);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setByte(9, ((Number) parms[14]).byteValue());
               stmt.setString(10, (String)parms[15], 12);
               stmt.setString(11, (String)parms[16], 12);
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
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
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

